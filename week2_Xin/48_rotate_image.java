public class Solution {
    public void rotate(int[][] matrix) {
        int i,j;
        int n = matrix.length;
        for(i = 0; i < matrix.length; i++){
            for(j = i+1; j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(i = 0; i < n;i++){
            for(j = 0; j < n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}