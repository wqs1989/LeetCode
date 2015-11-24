// have more to think for this question....
// it has O1 solution in discuss

class NumMatrix {

private:

     vector<vector<int>> selfmatrix;
     vector<vector<int>> summatrix;

public:

    NumMatrix(vector<vector<int>> &matrix) {
        
        int row, col;
        row = matrix.size();
        if(row != 0) col = matrix[0].size();
        else col = 0;
        
        cout << "width :" << col << " height : " << row << endl;
        
        if (row == 0 || col == 0)
        return;
        
        selfmatrix = vector<vector<int>>(row+1, vector<int>(col+1, 0));
        summatrix = vector<vector<int>>(row+1, vector<int>(col+1, 0));
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                selfmatrix[i][j] = matrix[i][j];
                summatrix[i][j] = getSum(i,j,matrix);
            }
        }
        
        cout << "HELLO";

    }
    
    
    int getSum(int row1, int col1, vector<vector<int>> &matrix){
        int i,j;
        int sum = 0;
        for ( i = 0; i <= row1; ++i ){
            for ( j = 0; j <= col1; ++j  ){
                sum = sum + matrix[i][j];
            }
        }
        
        return sum;
    }

    int sumRegion(int row1, int col1, int row2, int col2) {
        double sum = 0;
        
        if ( row1 == 0 && col1 == 0){
            return selfmatrix[0][0];
        }
        
        else if(row1 == 0){
            
            sum = summatrix[row2][col2] - summatrix[row2][col1-1];
            
        }
        else if(col1 == 0){
             sum = summatrix[row2][col2]  -summatrix[row1-1][col2];
        }
        else {
            
            sum = summatrix[row2][col2] + summatrix[row1-1][col1-1] -summatrix[row1-1][col2] - summatrix[row2][col1-1];
        }
        

    	return sum; 
    }
};
