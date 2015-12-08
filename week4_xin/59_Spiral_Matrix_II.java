public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int row = 0;
        int col = 0;
        int num = 1;
        while(n>0){
            if(n == 1){
                result[row][col] = num;
                break;
            }  
            for(int i = 0; i < n-1; i++)
                result[row][col++] = num++;
            for(int i = 0; i < n-1; i++)
                result[row++][col] = num++;
            for(int i = 0; i < n-1; i++)
                result[row][col--] = num++;
            for(int i = 0; i < n-1; i++)
                result[row--][col] = num++;
            row++;
            col++;
            n -=2;
        }
        return result;
    }
}