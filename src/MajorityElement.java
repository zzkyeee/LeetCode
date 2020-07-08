/**
 * Created on 2020/7/8 11:07 PM
 *
 * @author zzkyeee
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int majorNum = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorNum) {
                count++;
            } else if (--count == 0) {
                majorNum = nums[i];
                count = 1;
            }
        }

        return majorNum;
    }

}
