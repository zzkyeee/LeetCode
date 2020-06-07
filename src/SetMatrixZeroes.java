import java.util.Arrays;

/**
 * Created on 2020/6/7 4:44 PM
 *
 * @author zzkyeee
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean[] rowArray = new boolean[row];
        boolean[] columnArray = new boolean[column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    rowArray[i] = true;
                    columnArray[j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            if (rowArray[i]) {
                Arrays.fill(matrix[i], 0);
            }
        }
        for (int i = 0; i < column; i ++) {
            if (columnArray[i]) {
                for (int j = 0; j < row; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

    }

}
