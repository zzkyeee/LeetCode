import model.ListNode;

/**
 * Created on 2020/7/7 9:12 AM
 *
 * @author zzkyeee
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (null == head) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (true) {
            if (slow == null || fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
    }

}
