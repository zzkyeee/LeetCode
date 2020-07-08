/**
 * Created on 2020/7/8 11:07 PM
 *
 * @author zzkyeee
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

}
