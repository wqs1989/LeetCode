public class Solution {
    public int firstMissingPositive(int[] nums) {
        //if(nums.length == 0)
         //   return 1;
        int i = 0;
        while( i < nums.length){
            if(nums[i]!= i+1 && nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]){
               // System.out.println(i);
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
            else
                i++;
        }
        for( i = 0; i < nums.length; i++){
            if(nums[i] != i+1)
                return i+1;
        }
        
        return nums.length+1;
        
    }
}