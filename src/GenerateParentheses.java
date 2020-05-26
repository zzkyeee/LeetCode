import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created on 2020/5/25 10:35 PM
 *
 * @author zzkyeee
 */
public class GenerateParentheses {

    List<String> res = new LinkedList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return res;
        }
        backTrack("", n, n);
        return res;
    }

    /**
     * 回溯
     * @param str 当前字符串
     * @param left 左括号剩余能使用的个数
     * @param right 右括号剩余能使用的个数
     */
    private void backTrack(String str, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(str);
        }
        // 如果左边能用的大于右边，不存在的，需要
        if (left > right) {
            return;
        }
        if (left > 0) {
            backTrack(str + "(", left - 1, right);
        }
        if (right > 0) {
            backTrack(str + ")", left, right - 1);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        System.out.println(generateParentheses.generateParenthesis(3));
    }

}
