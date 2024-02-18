class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i <9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j] != '.') {
                   if(!checkSudoko(board, i, j)) return false;
                }
            }
        }
        return true;
    }

    public boolean checkSudoko(char[][] board, int i, int j) {
        for(int k = 0; k < 9; k++) {
            if(k!= j && board[i][k] == board[i][j] ) return false;
            if(k!=i && board[k][j] == board[i][j]) return false;
        }
        int a = i - i%3;
        
        int l1 = a+3;
        
        while(a<l1){
           int b = j- j%3;
           int l2 = b+3;
            while(b<l2) {
                if(a!=i && b != j && board[a][b] == board[i][j]) return false;
                b++;
            }
            a++;
        }
                
            
        return true;
    }
}


