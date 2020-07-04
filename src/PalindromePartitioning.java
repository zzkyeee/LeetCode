import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created on 2020/7/3 8:38 AM
 *
 * @author zzkyeee
 */
public class PalindromePartitioning {

    List<List<String>> res = new LinkedList<>();

    public List<List<String>> partition(String s) {
        Stack<String> stack = new Stack<>();
        backTrack(s, 0, s.length() - 1, stack);
        return res;
    }

    private void backTrack(String s, int start, int end, Stack<String> stack) {
        if (start > end) {
            res.add(new LinkedList<>(stack));
        }


        for (int i = start; i <= end; i++) {
            int index = i + 1;
            String curr = s.substring(start, index);
            if (!isPalindrome(curr)) {
                continue;
            }
            stack.push(curr);
            backTrack(s, index, end, stack);
            stack.pop();
        }
    }

    private boolean isPalindrome(String s) {
        for (int start = 0, end = s.length() - 1; start < end; start++, end--) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
        }

        return true;
    }

}
