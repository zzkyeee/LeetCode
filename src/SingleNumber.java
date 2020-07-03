/**
 * Created on 2020/7/3 8:37 AM
 *
 * @author zzkyeee
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }

        return res;
    }

}
