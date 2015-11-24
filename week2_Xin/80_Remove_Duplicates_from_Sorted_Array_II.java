public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int n = 0, j = 1, dupValue = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == dupValue){
                n++;
                if(n < 2){
                    nums[j] = nums[i];
                    j++;
                }
            }else{
                dupValue = nums[i];
                nums[j] = nums[i];
                j++;
                n = 0;
            }
        }
        return j;
        
    }
}