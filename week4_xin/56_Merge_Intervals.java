/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if(intervals == null || intervals.size() < 1)
            return result;
        Comparator<Interval> comp = new Comparator<Interval>(){
            @Override
            public int compare(Interval l1, Interval l2){
                return l1.start - l2.start;
            }
        };
        Collections.sort(intervals, comp);
        Interval l1 = intervals.get(0);
        for(int i = 1; i < intervals.size(); i++){
            Interval l2 = intervals.get(i);
            if (l1.end < l2.start){
                result.add(l1);
                l1 = l2;
            }
            else 
                l1.end = Math.max(l1.end, l2.end);
        }
        result.add(l1);
        return result;
    }
}