/**
 * Created on 2020/7/18 6:07 PM
 *
 * @author zzkyeee
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        int index = 0;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        while (index < s.length()) {
            for (int i = 0; i < numRows && index < s.length(); i++) {
                sb[i].append(s.charAt(index++));
            }
            for (int i = numRows - 2; i > 0 && index < s.length(); i--) {
                sb[i].append(s.charAt(index++));
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(sb[i].toString());
        }

        return res.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        System.out.println(zigZagConversion.convert("LEETCODEISHIRING", 4));
    }

}
