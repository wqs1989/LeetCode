public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(k, n, 1, result, temp);
        return result;
    }
    public void dfs(int k, int n, int start, List<List<Integer>> result, List<Integer> temp){
        if(temp.size() == k && n == 0){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = start; i<10; i++){
            temp.add(i);
            dfs(k,n-i,i+1,result,temp);
            temp.remove(temp.size()-1);
        }
            
    }
}
