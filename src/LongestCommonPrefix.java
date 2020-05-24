import java.util.Arrays;

/**
 * Created on 2020/5/24 11:16 AM
 *
 * @author zzkyeee
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        // 先遍历数组还是先遍历字符
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);

            if ("".equals(ans)) {
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"acc", "aaa", "aaba"}));
    }

}
