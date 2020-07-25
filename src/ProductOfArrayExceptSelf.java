/**
 * Created on 2020/7/25 9:42 AM
 *
 * @author zzkyeee
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int last = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = last;
            last *= nums[i];
        }
        last = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= last;
            last *= nums[i];
        }
        return res;
    }

}
