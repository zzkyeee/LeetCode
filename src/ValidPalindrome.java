/**
 * Created on 2020/6/25 3:21 PM
 *
 * @author zzkyeee
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (null == s || s.length() == 0) {
            return true;
        }
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex <= rightIndex) {
            char left = s.charAt(leftIndex);
            char right = s.charAt(rightIndex);
            int leftAscii = (int) left;
            int rightAscii = (int) right;
            boolean isContinue = false;
            if (!Character.isLetterOrDigit(leftAscii)) {
                leftIndex++;
                isContinue = true;
            }
            if (!Character.isLetterOrDigit(rightAscii)) {
                rightIndex--;
                isContinue = true;
            }

            if (isContinue) {
                continue;
            }
            leftIndex++;
            rightIndex--;
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("race a car"));
    }

}
