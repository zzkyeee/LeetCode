/**
 * Created on 2020/7/1 9:50 PM
 *
 * @author zzkyeee
 */
public class SurroundedRegions {

    private int[][] direction = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public void solve(char[][] board) {
        if (null == board || board.length == 0) {
            return;
        }
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0 || i == m - 1 || j == n - 1) && board[i][j] == 'O') {
                    dfs(board, i, j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'K') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }

    }

    private void dfs(char[][] board, int x, int y) {
        board[x][y] = 'K';

        for (int i = 0; i < 4; i++) {
            int tempX = x + direction[i][0];
            int tempY = y + direction[i][1];
            if (tempX >= 0 && tempX <= board.length - 1 && tempY >= 0 && tempY <= board[0].length - 1 && board[tempX][tempY] == 'O') {
                dfs(board, tempX, tempY);
            }
        }

    }

}
