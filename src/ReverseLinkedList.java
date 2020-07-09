import model.ListNode;

/**
 * Created on 2020/7/9 11:41 PM
 *
 * @author zzkyeee
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = reverseList(head.next);
        head.next = null;
        ListNode p = next;
        while (p.next != null) {
            p = p.next;
        }
        p.next = head;
        return next;
    }

}
