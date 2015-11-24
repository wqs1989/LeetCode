class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        vector<int> LIS;
        int i;
        for (i = 0 ; i < nums.size(); ++ i){
            if(LIS.size() == 0 || LIS[LIS.size() - 1] < nums[i]){
                LIS.push_back(nums[i]);   
            }
            else{
                binaryReplace(LIS, nums[i]);
            }
        }
        for(i = 0 ; i < LIS.size(); ++ i){
            cout << LIS[i] << " ";
        }
        return LIS.size();
    }
    
private:

    void binaryReplace(vector<int> & LIS, int value){
        int i = 0;
        int j = LIS.size() - 1;
        
        while( i < j){
            
            if(LIS[(i + j)/2] < value){
                i = (i + j)/2 + 1;
            }
            else{
                j = (i + j)/2;
            }
        }
        
        LIS[i] = value;
    }
    
};