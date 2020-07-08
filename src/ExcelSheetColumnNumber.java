/**
 * Created on 2020/7/8 11:09 PM
 *
 * @author zzkyeee
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int sum = 0;
        int j = 0;
        for (int i = s.length() - 1; i>= 0; i--) {
            int value = (int)s.charAt(i) - 64;
            sum += Math.pow(26, j++) * value;
        }
        return sum;
    }

}
