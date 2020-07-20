import java.util.Stack;

/**
 * Created on 2020/7/20 10:11 PM
 *
 * @author zzkyeee
 */
public class BasicCalculatorTwo {

    public int calculate(String s) {
        char lastOp = '+';
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }

            if (Character.isDigit(c)) {
                int number = c - '0';
                while (++i < s.length() && Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (s.charAt(i) - '0');
                }
                i--;
                if (lastOp == '+') {
                    stack.push(number);
                } else if (lastOp == '-') {
                    stack.push(-1 * number);
                } else if (lastOp == '*') {
                    int curr = stack.pop();
                    stack.push(curr * number);
                } else if (lastOp == '/') {
                    int curr = stack.pop();
                    stack.push(curr / number);
                }
            } else {
                lastOp = c;
            }
        }

        int res = 0;
        for (int num : stack) {
            res += num;
        }

        return res;
    }

    public static void main(String[] args) {
        BasicCalculatorTwo basicCalculatorTwo = new BasicCalculatorTwo();
        System.out.println(basicCalculatorTwo.calculate("3+2*2"));
    }

}
