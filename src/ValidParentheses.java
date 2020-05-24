import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created on 2020/5/24 7:44 PM
 *
 * @author zzkyeee
 */
public class ValidParentheses {

    private Map<Character, Character> map = new HashMap<>();

    {
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // 如果是左括号
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("]"));
    }

}
