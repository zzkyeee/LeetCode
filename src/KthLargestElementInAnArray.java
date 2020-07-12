import java.util.Arrays;

/**
 * Created on 2020/7/11 7:11 PM
 *
 * @author zzkyeee
 */
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
