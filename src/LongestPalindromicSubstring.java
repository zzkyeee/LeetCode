/**
 * Created on 2020/5/20 11:36 PM
 *
 * @author zzkyeee
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        int maxLength = 0;
        if (null == s || s.length() == 0) {
            return "";
        }
        int start = 0, end = 1;
        for (int i = 0; i < s.length(); i++) {
            int temp1 = currentPalindromeSize(s, i, i);
            int temp2 = currentPalindromeSize(s, i, i + 1);

            // cbbd i = 1 length = 2
            //
            int length = Math.max(temp1, temp2);
            if (length > maxLength) {
                start = i - (length - 1) / 2;
                end = i + 1 + length / 2;
                maxLength = length;
            }

        }
        return s.substring(start, end);
    }

    private int currentPalindromeSize(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

}
