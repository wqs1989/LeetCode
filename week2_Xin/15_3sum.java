public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if(nums.length == 0 || nums[0]>0)
            return result;
        
        for(int i = 0; i< nums.length-2; i++){
           // List<Integer> temp = new ArrayList<Integer>();
            int j = i+1, k = nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1])
                        j++;
                    while(k>j && nums[k] == nums[k+1])
                        k--;
                }else if (nums[i]+nums[j]+nums[k] < 0)
                    j++;
                else
                    k--;
            }
            while(nums[i] == nums[i+1] && i<nums.length-2)
                i++;
            
        }
        return result;
    }
    
}