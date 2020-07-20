/**
 * Created on 2020/7/20 8:55 AM
 *
 * @author zzkyeee
 */
public class Test {

    public String longestPalindrome (String s) {
        int start = 0, end = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int l1 = palindrome(s, i, i);
            int l2 = palindrome(s, i, i + 1);
            int curr = Math.max(l1, l2);
            if (curr > maxLength) {
                // i = 1 l = 3
                // abba i = 1 l =4
                start = i - (curr - 1) / 2;
                end = i + curr / 2;
                maxLength = curr;
            }
        }

        return s.substring(start, end);
    }

    private int palindrome(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.longestPalindrome("a");
    }
}
