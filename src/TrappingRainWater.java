/**
 * Created on 2020/5/31 9:09 PM
 *
 * @author zzkyeee
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        int maxLeft = 0;
        int maxRight = 0;
        int l = 0, r = height.length - 1;
        int res = 0;
        while (l <= r) {
            if (maxLeft < maxRight) {
                if (height[l] < maxLeft) {
                    res += maxLeft - height[l];
                } else {
                    maxLeft = height[l];
                }
                l++;
            } else {
                if (height[r] < maxRight) {
                    res += maxRight - height[r];
                } else {
                    maxRight = height[r];
                }
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();
        System.out.println(solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

}
