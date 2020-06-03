import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/6/1 11:44 PM
 *
 * @author zzkyeee
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (null == matrix || matrix.length == 0) {
            return res;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        // 圈数
        int circle = 0;
        int count = 0;
        int x = 0, y = -1;
        while (count < m * n) {
            for (int i = 0; i < n - 2 * circle && count < m * n; i++) {
                y++;
                res.add(matrix[x][y]);
                count++;
            }
            for (int i = 0; i < m - 1 - 2 * circle && count < m * n; i++) {
                x++;
                count++;
                res.add(matrix[x][y]);
            }
            for (int i = 0; i < n - 1 - 2 * circle && count < m * n; i++) {
                y--;
                count++;
                res.add(matrix[x][y]);
            }
            for (int i = 0; i < m - 2 - 2 * circle && count < m * n; i++) {
                x--;
                count++;
                res.add(matrix[x][y]);
            }
            circle++;
        }

        return res;
    }

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        spiralMatrix.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

}
