import java.util.Arrays;

/**
 * Created on 2020/7/8 11:10 PM
 *
 * @author zzkyeee
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStrs, (a, b) -> (a + b).compareTo(b + a));

        if (numStrs[numStrs.length - 1].equals("0")) {
            return "0";
        }

        StringBuilder res = new StringBuilder();
        for (int i = numStrs.length - 1; i >= 0; i--) {
            res.append(numStrs[i]);
        }

        return res.toString();
    }

}
