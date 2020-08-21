/**
 * Created on 2020/8/22 12:22 AM
 *
 * @author zzkyeee
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                continue;
            }
            int j = i + 1;
            while (j < nums.length && nums[j] == 0) {
                j++;
            }
            if (j < nums.length) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

}
