/**
 * Created on 2020/5/23 9:12 PM
 *
 * @author zzkyeee
 */
public class ReverseInteger {

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int left = x % 10;
            x = x / 10;
            // 正数越界的情况
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && left > 7)) {
                return 0;
            }
            // 负数越界的情况
            if (res < Integer.MIN_VALUE / 10 || (res ==  Integer.MIN_VALUE / 10 && left < - 8)) {
                return 0;
            }
            res = res * 10 + left;
        }

        return res;
    }

}
