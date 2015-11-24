class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        int i = 0;
        int j = 0;
        

        vector<string> result;
        
        if(nums.empty()){
            return result;
        }
        
        if(nums.size() == 1){
            result.push_back(to_string(nums[0]));
            return result;
        }
        
        
        for (i = 0 , j = 1; j <= nums.size(); ++ j ){
            if(j == nums.size() || nums[j] > nums[j - 1] + 1 ){
                
             
                if(j - 1 > i){
                
                    result.push_back(to_string(nums[i]) + "->" + to_string(nums[j-1]));
                }
                else{
                    result.push_back(to_string(nums[i]));
                }
                
                i = j;
            }
        }
        
        return result;
    }
};