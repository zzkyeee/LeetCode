package po;

import java.util.List;

/**
 * Created on 2020/5/18 11:08 PM
 *
 * @author zzkyeee
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode build(List<Integer> values) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        for (Integer value : values) {
            p.next = new ListNode(value);
            p = p.next;
        }
        return dummyHead.next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
