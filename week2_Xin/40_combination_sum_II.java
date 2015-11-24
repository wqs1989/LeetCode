public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0)
            return result;
        List<Integer> path = new ArrayList<Integer>();
        Arrays.sort(candidates);
        dfs(candidates, 0, target, path, result);
        return result;
    }
    public void dfs(int[] candidates, int index, int target, List<Integer> path, List<List<Integer>> result) {
    
        if(target == 0){
            result.add(new ArrayList(path));
            return;
        }else if(target < 0)
            return;
        for(int i = index; i < candidates.length; i++){
            if(i > index && candidates[i] == candidates[i-1])
                continue;
            path.add(candidates[i]);
            
            int newtarget = target - candidates[i];
            dfs(candidates, i+1, newtarget, path,result);
            path.remove(path.size()-1);
        }
            
    }
}