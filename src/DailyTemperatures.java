import java.util.Stack;

/**
 * Created on 2020/8/22 12:21 AM
 *
 * @author zzkyeee
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) {
            return new int[]{};
        }
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
                int num = stack.pop();
                res[num] = i - num;
            }
            stack.push(i);
        }

        return res;
    }

}
