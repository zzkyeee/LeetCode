/**
 * Created on 2020/5/24 10:46 AM
 *
 * @author zzkyeee
 */
public class ContainerWithMostWater {

    /**
     * 输入：[1,8,6,2,5,4,8,3,7]
     * 输出：49
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxArea = 0;
        while (l != r) {
            int h = Math.min(height[l], height[r]);
            maxArea = Math.max(h * (r - l), maxArea);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        System.out.println(containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

}
