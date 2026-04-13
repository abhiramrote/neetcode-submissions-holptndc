class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character>[]rows=new HashSet[9];
        HashSet<Character>[]cols=new HashSet[9];
        HashSet<Character>[]boxes=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                char c=board[i][j];
                int b_idx=(i/3)*3+(j/3);
                if(rows[i].contains(c)||
                cols[j].contains(c)||
                boxes[b_idx].contains(c)
                )return false;

                rows[i].add(c);
                cols[j].add(c);
                boxes[b_idx].add(c);
            }
        }
        return true;
        
    }
}
