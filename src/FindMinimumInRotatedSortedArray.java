/**
 * Created on 2020/7/22 11:48 PM
 *
 * @author zzkyeee
 */
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // mid可能为最小值
                right = mid;
            }
        }

        return nums[left];
    }

}
