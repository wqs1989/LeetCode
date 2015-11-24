public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return result;
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(nums);
        dfs(nums,0,result,temp);
        return result;
    }
    public void dfs(int[] nums, int index, List<List<Integer>> result, List<Integer> temp ){
        result.add(new ArrayList<Integer>(temp));
        for(int i = index; i < nums.length; i++){
            temp.add(nums[i]);
            dfs(nums, i+1,result,temp);
            temp.remove(temp.size()-1);
            while(i<nums.length-1 && nums[i]==nums[i+1])
                i++;
        }
    }
}