import model.ListNode;

import java.util.Arrays;

/**
 * Created on 2020/5/24 7:10 PM
 *
 * @author zzkyeee
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head) {
            return null;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode fast = dummyHead, slow = dummyHead;

        while (fast.next != null && n > 0) {
            fast = fast.next;
            n--;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummyHead.next;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode nodes = ListNode.build(Arrays.asList(1, 2, 3, 4 ,5));
        removeNthNodeFromEndOfList.removeNthFromEnd(nodes, 2);
    }

}
