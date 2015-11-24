public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0)
            return result;
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<Integer>();
        dfs(candidates, 0, temp, result, target);
        return result;
    }
    public void dfs(int[] candidates, int index, List<Integer> temp, List<List<Integer>> result, int target) {
        //int newtarget = target - candidates[index];
        //temp.add(candidates[index]);
        if(target < 0)
            return;
        else if( target == 0){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(i > 0 && candidates[i] == candidates[i-1])
                continue;
            temp.add(candidates[i]);
            int newtarget = target - candidates[i];
            dfs(candidates, i, temp, result, newtarget);
            temp.remove(temp.size()-1);   
        }
        
    }
}