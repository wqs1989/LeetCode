class NumArray {

private:

    vector<int>  sum ; 

    void Sumstart(int i, vector<int> &nums){
        
        if( i == 0){
            sum[0] = nums[0];
            return;
        }
        
        Sumstart( i - 1, nums);
        
        sum[i] = nums[i] +sum[i - 1];
        
    }
    
public:

    NumArray(vector<int> &nums) {
        
        sum = vector<int>(nums.size(), 0);
        
        if(nums.size() == 0){
            return;
        }
        
        Sumstart(nums.size()-1, nums);   
        
        int i = 0;
        
        for(i ; i < sum.size(); ++ i){
            cout << sum[i] << " ";
        }
        
    }

    int sumRange(int i, int j) {
        
        if (sum.size()== 0){
            return NULL; 
        }
        
        if (i == 0){
            return sum[j];
        }
        else{
            return sum[j] - sum[i - 1];
        }
    }
};