class Solution {
public:
    void gameOfLife(vector<vector<int>>& board) {
        
        if( board.size() == 0){
            cout << "The array is empty" << endl;
        }
        
        int i, j, p,q, liveNode;
        
        for( i = 0 ; i < board.size() - 1; i ++){
            
            for (j = 0 ; j < board[0].size() - 1; j ++ ){
            
                for( p = (i >= 1 ? i - 1 : 0);p <= (i <= board.size() - 2 ? i + 1 : board.size() - 1) ; p++) {
                    for( q = (j  >= 1? j - 1 :0); q <= (j <= board[0].size() - 2 ? j + 1 : board[0].size() - 1); q++) {
                        
                        cout << p << " " << i;
                        liveNode += board[p][q] & 1;
                    }
                }
                
                liveNode -= board[i][j] & 1;
                
                if((board[i][j] & 1) == 1 && (liveNode >= 2 && liveNode <= 3)) {
                    board[i][j] = 3; 
                }
                if((board[i][j] & 1) == 0 && liveNode == 3) {
                    board[i][j] = 2; 
                }
            }
        } 
        
    }
};

