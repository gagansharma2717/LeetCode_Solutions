// 51. LeetCode https://leetcode.com/problems/n-queens/

// Combinations - Box on Level/ Box Chooses
class Solution {
static List<List<String>> res;

    public static boolean isQueenSafe(int r, int c, boolean[][] vis){
        // row (left)
        for(int j=0; j<c; j++){
            if(vis[r][j] == true)
                return false;
        }
        // col (up)
        for(int i=0; i<r; i++){
            if(vis[i][c] == true)
                return false;
        }

        // left diagnol (up)
        int i = r, j = c;
        while(i >= 0 && j >= 0){
            if(vis[i][j] == true){
                return false;
            }
            i--; j--;
        }

        // right diagnol (down)
        i = r; j = c;
        while(j < vis.length && i >= 0){
            if(vis[i][j] == true){
                return false;
            }
            i--; j++;
        }

        return true;
    }

    public static void nqueen(int r, int c, int qpsf, boolean[][] vis) {
        if (qpsf == vis.length) {
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < vis.length; i++) {
                String curr = "";
                for (int j = 0; j < vis.length; j++) {
                    if (vis[i][j] == true) {
                        curr = curr + "Q";
                    } else {
                        curr = curr + ".";
                    }
                }
                ans.add(curr);
            }
            res.add(ans);
            return;
        }
        if(r == vis.length){
            return;
        }

        if (isQueenSafe(r, c, vis)) {
            vis[r][c] = true;

            if (c == vis.length - 1) {
                nqueen(r + 1, 0, qpsf + 1, vis);
            } else {
                nqueen(r, c + 1, qpsf + 1, vis);
            }

            vis[r][c] = false;
        }

        if (c == vis.length - 1) {
            nqueen(r + 1, 0, qpsf, vis);
        } else {
            nqueen(r, c + 1, qpsf, vis);
        }
    }

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];

        nqueen(0, 0, 0, vis);
        return res;
        
    }
}

// Backtracking - Row on Level - Queen Chooses
class Solution {
    static List<List<String>> res;
    public static boolean isQueenSafe(int r, int c, boolean[][] vis){
        // col (up)
        for(int i=0; i<r; i++){
            if(vis[i][c] == true)
                return false;
        }

        // left diagnol (up)
        int i = r, j = c;
        while(i >= 0 && j >= 0){
            if(vis[i][j] == true){
                return false;
            }
            i--; j--;
        }

        // right diagnol (down)
        i = r; j = c;
        while(j < vis.length && i >= 0){
            if(vis[i][j] == true){
                return false;
            }
            i--; j++;
        }

        return true;
    }

    public static void nqueen(int r, boolean[][] vis) {
        if (r == vis.length) {
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < vis.length; i++) {
                String curr = "";
                for (int j = 0; j < vis.length; j++) {
                    if (vis[i][j] == true) {
                        curr = curr + "Q";
                    } else {
                        curr = curr + ".";
                    }
                }
                ans.add(curr);
            }
            res.add(ans);
            return;
        }

        
        for(int c=0; c<vis.length; c++){
            if(isQueenSafe(r, c, vis)){
                vis[r][c] = true;
                nqueen(r + 1, vis);
                vis[r][c] = false;
            }
        }    
    }

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];

        nqueen(0, vis);
        return res;
        
    }
}

// Branch & Bound using boolean arrays
class Solution {
    static List<List<String>> res;
    
    public void nQueens(boolean[][] board, int row, boolean[] cols, boolean[] ndiag, boolean[] rdiag){
        int n = board.length;
        if(row == n){
            List<String> ans = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                String curr = "";
                for(int j = 0 ; j < n ; j++){
                    if(board[i][j] == true){
                        curr += "Q";
                    }else{
                        curr += ".";
                    }
                }
                ans.add(curr);
            }
            res.add(ans);
            return;
        }
        for(int col = 0 ; col < board[0].length; col++){
            if(cols[col] == false && ndiag[row + col] == false && rdiag[row - col + board.length-1] == false){
                
                board[row][col] = true;
                cols[col] = true ;
                ndiag[row + col] = true;
                rdiag[row - col + board.length-1] = true;
                
                nQueens(board, row + 1, cols, ndiag, rdiag);
                
                board[row][col] = false;
                cols[col] = false ;
                ndiag[row + col] = false;
                rdiag[row - col + board.length-1] = false;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        
        boolean[][] board = new boolean[n][n];
        boolean[] cols = new boolean[n];
        boolean[] ndiag = new boolean[2*n - 1 ];
        boolean[] rdiag = new boolean[2*n - 1 ];
        
        nQueens(board, 0, cols, ndiag, rdiag);
        
        return res;
    }
}

// Branch & Bound using boolean arrays using BitSet
class Solution {
    static List<List<String>> res;
    
    public void nQueens(boolean[][] board, int row, BitSet cols, BitSet ndiag, BitSet rdiag){
        int n = board.length;
        if(row == n){
            List<String> ans = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                String curr = "";
                for(int j = 0 ; j < n ; j++){
                    if(board[i][j] == true){
                        curr += "Q";
                    }else{
                        curr += ".";
                    }
                }
                ans.add(curr);
            }
            res.add(ans);
            return;
        }
        
        for(int col = 0 ; col < n; col++){
            if(cols.get(col) == false && ndiag.get(row + col) == false && rdiag.get(row - col + n-1) == false){
                
                board[row][col] = true;
                cols.set(col, true);
                ndiag.set(row + col, true);
                rdiag.set(row - col + n-1, true);
                
                nQueens(board, row + 1, cols, ndiag, rdiag);
                
                board[row][col] = false;
                cols.set(col, false);
                ndiag.set(row + col, false);
                rdiag.set(row - col + n-1, false);
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        
        boolean[][] board = new boolean[n][n];
        BitSet cols = new BitSet(n);
        BitSet ndiag = new BitSet(2*n - 1 );
        BitSet rdiag = new BitSet(2*n - 1 );
        
        nQueens(board, 0, cols, ndiag, rdiag);
        
        return res;
    }
}