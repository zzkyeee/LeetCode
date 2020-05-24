import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/5/24 11:04 AM
 *
 * @author zzkyeee
 */
public class RomanToInteger {

    private static Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    /**
     * 输入: "MCMXCIV"
     * 输出: 1994
     * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        Integer lastValue = 0;
        Integer res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            // 碰到小的减 碰到大的加
            Integer curr = romanMap.get(s.charAt(i));
            if (lastValue.compareTo(curr) > 0) {
                res -= curr;
            } else {
                res += curr;
            }
            lastValue = curr;
        }

        return res;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }

}
