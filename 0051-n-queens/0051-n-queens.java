

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('.');
        }
        String s = sb.toString();

        for (int i = 0; i < n; i++) {
            board.add(s);
        }

        solve(0, ans, board, n);
        return ans;
    }

    private void solve(int col, List<List<String>> ans, List<String> board, int n) {
        if (col == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                char[] rowChars = board.get(row).toCharArray();
                rowChars[col] = 'Q';
                board.set(row, new String(rowChars));

                solve(col + 1, ans, board, n);

                rowChars[col] = '.';
                board.set(row, new String(rowChars));
            }
        }
    }
    private boolean isSafe(List<String> board, int row, int col, int n) {
        
        int i = 0;
        while (i < col) {
            if (board.get(row).charAt(i) == 'Q') return false;
            i++;
        }
        int r = row, c = col;
        while (r >= 0 && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r < n && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            r++;
            c--;
        }

        return true;
    }
}
