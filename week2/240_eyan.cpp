class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        int i = matrix.size() - 1;
        int j = 0;
        
        while( j<= matrix[0].size()-1 && i >=0)
            if(matrix[i][j] == target){
                return true;
            } 
            else if(matrix[i][j] > target){
                i --;
            }
            else{
                j ++;
            }
            
        return false;
    }
};