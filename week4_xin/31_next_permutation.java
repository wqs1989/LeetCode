public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        for(; i>=0; i--){
            if(nums[i] < nums[i+1])
                break;
        }
        int temp;
        if(i >= 0){
            int k = i+1;
            int swap = i+1;
            while(k < nums.length){
                if(nums[k] > nums[i] && nums[k] <= nums[swap])
                    swap = k;
                k++;
            }
            temp = nums[i];
            nums[i] = nums[swap];
            nums[swap] = temp;
        }
        i++;
       // System.out.println(i);
        //System.out.println(Arrays.toString(nums));
        int j = 0;
        while(j <= (nums.length-i-1)/2){
            temp = nums[i+j];
            nums[i+j] = nums[nums.length-1 -j];
            nums[nums.length -1-j] = temp;
            j++;
        }
    }
}