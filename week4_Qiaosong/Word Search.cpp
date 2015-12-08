class Solution {
public:
    bool match(vector<vector<char>>& board, string word, int index, 
               int row, int col ) {
        if ( index == word.length() ) {
            return true;
        }
        int m = board.size(), n = board[0].size();
        if ( index == 0 ) {
            for ( int i = 0; i < m; i++ ) 
                for ( int j = 0; j < n; j++ ) {
                   if ( board[i][j] == word[index] ) {
                      board[i][j] = ' '; 
                      if ( match(board, word, index+1, i, j) ) return true;
                      board[i][j] = word[index];
                   }
                }
            return false;
        }else {
            if ( col > 0 && board[row][col-1] == word[index] ) { 
                 board[row][col-1] = ' ';
                 if (match(board, word, index+1, row, col-1)) return true; 
                 board[row][col-1] = word[index];         
            }else if( col < n-1 && board[row][col+1] == word[index] ) { 
                 board[row][col+1] = ' ';
                 if ( match(board, word, index+1, row, col+1)) return true; 
                 board[row][col+1] = word[index];              
            }else if( row > 0 && board[row-1][col] == word[index] ) { 
                 board[row-1][col] = ' ';
                 if ( match(board, word, index+1, row-1, col)) return true; 
                 board[row-1][col] = word[index];              
            }else if ( row < m-1 && board[row+1][col] == word[index] ) {
                 board[row+1][col] = ' ';
                 if ( match(board, word, index+1, row+1, col)) return true; 
                 board[row+1][col] = word[index];
            }
            return false;
        } 
    }
    
    bool exist(vector<vector<char>>& board, string word) {
        if ( board.size() == 0 ) {
            return false;
        }   
        return match(board, word, 0, -1, -1);
    }
};