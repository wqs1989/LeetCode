class Solution {
 
public:
    int numSquares(int n) {
        if(n == 1){
            return 1;
        }
        
        int lowest = n;
        int j;
        int result[n + 1];
        
        for ( j = 0 ; j < n + 1; j ++){
            
            result[j] = j;
        }
        
        int i = 1;
        for(i = 1 ; i < n+ 1; ++ i){
            for(j = 1; j * j <= i; ++ j){
            
                if(1 + result[i - j * j] < result[i])
                    result[i] = 1 + result[i - j * j]; 
            }
        }
        
        return result[n];
    }
};