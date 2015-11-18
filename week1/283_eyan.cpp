class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i, index, key;
        key = 0;
        for (i = 0 ; i < nums.size() ; i ++){
            
            if( nums[i] == 0 ){
                key ++; 
            }
            else {
                nums[i - key] = nums[i];
                
                if(key > 0){
                    nums[i] = 0 ;
                }
            }
        }
    }
};