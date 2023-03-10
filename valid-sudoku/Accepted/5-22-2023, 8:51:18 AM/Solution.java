// https://leetcode.com/problems/valid-sudoku

class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> seen = new HashSet(0);

        for(int i=0; i<9;i++){
            for(int j=0;j<9;j++){
                char current_value = board[i][j];

                if(current_value != '.'){
                    if( !seen.add(current_value + " is in row " + i) ||
                        !seen.add(current_value + " is in coloumn " + j) ||
                        !seen.add(current_value + "is in box" + i/3 + "-" + j/3 )
                        )
                        return false;
                }
            }
        }

        return true;
    }
}