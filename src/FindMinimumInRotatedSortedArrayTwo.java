/**
 * Created on 2020/7/23 12:05 AM
 *
 * @author zzkyeee
 */
public class FindMinimumInRotatedSortedArrayTwo {

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums[left] < nums[right]) {
            return nums[0];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right -= 1;
            }
        }

        return nums[left];
    }

}
