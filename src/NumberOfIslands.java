/**
 * Created on 2020/7/9 11:40 PM
 *
 * @author zzkyeee
 */
public class NumberOfIslands {

    private int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        for (int k = 0; k < 4; k++) {
            int x = i + directions[k][0];
            int y = j + directions[k][1];
            if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {
                dfs(grid, x, y);
            }
        }
    }

}
