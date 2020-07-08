import java.util.Stack;

/**
 * Created on 2020/7/8 8:08 AM
 *
 * @author zzkyeee
 */
public class MinStack {

    Stack<Integer> s1;
    Stack<Integer> s2;

    /** initialize your data structure here. */
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
        if (!s2.isEmpty()) {
            int currMin = s2.peek();
            if (x <= currMin) {
                s2.push(x);
            }
        } else {
            s2.push(x);
        }
    }

    public void pop() {
        int curr = s1.pop();
        if (s2.peek() == curr) {
            s2.pop();
        }
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }

}
