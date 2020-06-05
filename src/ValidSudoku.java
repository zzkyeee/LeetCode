import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/6/5 11:12 PM
 *
 * @author zzkyeee
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        // 某行某个数字是否出现过
        boolean[][] rowArray = new boolean[9][10];
        // 某列某个数字是否出现过
        boolean[][] columnArray = new boolean[9][10];
        // 3*3的九宫格内是否出现过
        boolean[][] blockArray = new boolean[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0';
                int block = i / 3 * 3 + j / 3;
                if (rowArray[i][num] || columnArray[j][num] || blockArray[block][num]) {
                    return false;
                }
                rowArray[i][num] = true;
                columnArray[j][num] = true;
                blockArray[block][num] = true;
            }
        }

        return true;
    }

}
