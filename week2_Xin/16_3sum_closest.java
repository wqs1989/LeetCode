public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length <3)
            return 0;
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[nums.length-1];
        int result = sum;
        int dif = Math.abs(sum-target);
        for(int i = 0; i < nums.length-2; i++){
            int lo = i+1, hi = nums.length-1;
            while(lo<hi){
                int abs;
                sum = nums[i]+nums[lo]+nums[hi];
                if(sum == target)
                    return sum;
                else if(sum < target){
                    abs = target - sum;
                    lo++;
                }else{
                    abs = sum - target;
                    hi--;
                }
                if(abs < dif){
                    result = sum;
                    dif = abs;
                }
            }
        }
        return result;
    }
}