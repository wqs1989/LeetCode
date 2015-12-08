public class Solution {
    public boolean canJump(int[] nums) {
        int jumpLength = 0;
        for(int i = 0; i<nums.length && i <= jumpLength; i++){
             jumpLength = Math.max(jumpLength,nums[i]+i);
            //System.out.println("i = "+i+" jumpLength = " + jumpLength);
             if(jumpLength >= nums.length-1)
                return true;
        }
        return false;
    }
}