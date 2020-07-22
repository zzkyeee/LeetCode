/**
 * Created on 2020/7/22 11:15 PM
 *
 * @author zzkyeee
 */
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        if (null == matrix || matrix.length == 0) {
            return 0;
        }
        int length = matrix.length;
        int width = matrix[0].length;

        int[][] dp = new int[length + 1][width + 1];

        int maxLength = 0;
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < width; column++) {
                if (matrix[row][column] == '1') {
                    dp[row + 1][column + 1] = Math.min(dp[row][column], Math.min(dp[row][column + 1], dp[row + 1][column])) + 1;
                    maxLength = Math.max(maxLength, dp[row + 1][column + 1]);
                }
            }
        }

        return maxLength * maxLength;
    }

}
