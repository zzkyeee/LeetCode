package offer;

/**
 * Created on 2020/8/17 8:21 AM
 *
 * @author zzkyeee
 */
public class FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            int val = matrix[row][column];


            if (target < val) {
                column--;
            } else if (target == val) {
                return true;
            } else {
                row++;
            }
        }

        return false;
    }

}
