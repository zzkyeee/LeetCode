/**
 * Created on 2020/6/5 9:40 PM
 *
 * @author zzkyeee
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        int maxRight = 0;
        for (int i = 0; i < nums.length && i <= maxRight; i++) {
            maxRight = Math.max(maxRight, i + nums[i]);
            if (maxRight >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
