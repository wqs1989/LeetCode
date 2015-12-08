public class Solution {
    public int jump(int[] nums) {
        //if(nums.length <= 1)
        //    return 0;
        int step=0;
        int jumpLength = 0;
        int i = 0;
        while(jumpLength < nums.length-1){
            step++;
            int premax = jumpLength;
            for(; i <= premax && i < nums.length; i++){
                jumpLength = Math.max(jumpLength, nums[i]+i);
            }
            //System.out.println("step = " + step + " jumpLength = "+ jumpLength);
        }
        return step;
        
    }
}