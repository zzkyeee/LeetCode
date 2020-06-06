/**
 * Created on 2020/6/6 5:20 PM
 *
 * @author zzkyeee
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        if (n < 2) {
            return 1;
        }
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(3));
    }

}
