class Solution {
public:
    int nthUglyNumber(int n) {
        
        vector<int> result(1,1);
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(result.size()< n){
            
            int value = min(result[i] * 2, min(result[j] * 3, result[k] * 5));
            
            result.push_back(value);
            
            if ( value == result[i] * 2){
                i++;
            }
            
            if ( value == result[j] * 3){
                j++;
            }
            
            if ( value == result[k] * 5){
                k++;
            }
        }
        
        return result[n-1];
    }
    
};