public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return result;
        List<Integer> temp = new ArrayList<Integer>();
        //result.add(temp);
        Arrays.sort(nums);
        dfs(nums, 0, temp, result);
        return result;
    }
    
    public void dfs(int[] nums, int index, List<Integer> temp, List<List<Integer>> result){
        result.add(new ArrayList<Integer>(temp));
        //System.out.println("addtoresult:"+temp+" index:"+index);
        for(int i = index; i< nums.length; i++){
            temp.add(nums[i]);
            //System.out.println("nums["+i+"]"+" = "+ nums[i]+" add to temp"+" index:"+index+" i:"+i);
            dfs(nums, i+1, temp,result);
            temp.remove(temp.size()-1);
            //System.out.println("Afterremove:"+temp +" index:"+index+" i:"+i);
        }
    }
}