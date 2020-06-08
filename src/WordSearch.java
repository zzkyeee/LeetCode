import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/6/8 10:55 PM
 *
 * @author zzkyeee
 */
public class WordSearch {

    private int[][] directionArray = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    private boolean[][] marked;

    private String word;

    private int m;

    private int n;

    private char[][] board;

    public boolean exist(char[][] board, String word) {
        this.m = board.length;
        this.n = board[0].length;
        marked = new boolean[m][n];
        this.word = word;
        this.board = board;
        boolean res = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int x, int y, int index) {
        if (board[x][y] != word.charAt(index)) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }
        for (int[] direction : directionArray) {
            int newX = x + direction[0];
            int newY = y + direction[1];
            if (inArea(newX, newY) && !marked[newX][newY]) {
                marked[newX][newY] = true;
                if (dfs(newX, newY, index + 1)) {
                    return true;
                }
                marked[newX][newY] = false;
            }
        }
        return false;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        System.out.println(wordSearch.exist(new char[][]{{'a', 'a'}}, "aaa"));
    }

}
