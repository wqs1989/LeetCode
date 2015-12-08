public class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++){ 
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> col = new HashSet<Character>();
            HashSet<Character> block = new HashSet<Character>();
        
            for(int j = 0; j < 9; j++){
                if(board[i][j]!= '.'  && !row.add(board[i][j]))
                    return false;
                if(board[j][i]!= '.' && !col.add(board[j][i]))
                    return false;
                if(board[i/3*3+j/3][i%3*3+j%3]!= '.' && !block.add(board[i/3*3+j/3][i%3*3+j%3]))
                    return false;
            }
        }
        return true;
        
    }
}