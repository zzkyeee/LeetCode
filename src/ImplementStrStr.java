/**
 * Created on 2020/5/28 11:45 PM
 *
 * @author zzkyeee
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        int l = needle.length();
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i + l).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr solution = new ImplementStrStr();
        System.out.println(solution.strStr("hello", "ll"));
    }

}
