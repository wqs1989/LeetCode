public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0)
            return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int rows = 0;
        int cols = 0;
        while(m>0 && n>0){
            if(m == 1){
                for(int i = 0; i < n; i++)
                    result.add(matrix[rows][cols++]);
                break;
            }else if(n == 1){
                for(int i = 0; i < m; i++ )
                    result.add(matrix[rows++][cols]);
                break;
            }
            
            for(int i = 0; i < n-1; i++)
                result.add(matrix[rows][cols++]);
            
            for(int i = 0; i < m-1; i++)
                result.add(matrix[rows++][cols]);
                
            for(int i = 0; i < n-1; i++)
                result.add(matrix[rows][cols--]);
                
            for(int i = 0; i < m-1; i++)
                result.add(matrix[rows--][cols]);
            rows++;
            cols++;
            n = n-2;
            m = m-2;
        }
        return result;
    }
}