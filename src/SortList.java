import model.ListNode;

/**
 * Created on 2020/7/7 10:58 PM
 *
 * @author zzkyeee
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        if (null == head) {
            return null;
        }
        int maxLength = 0;
        for (ListNode p = head; p != null; p = p.next) {
            maxLength++;
        }
        return sort(head, 0, maxLength - 1);
    }

    private ListNode sort(ListNode head, int start, int end) {
        int diff = end - start;
        if (diff == 0) {
            ListNode p = head;
            for (int i = 0; i < start; i++) {
                p = p.next;
            }
            return new ListNode(p.val);
        }

        int mid = start + (end - start) / 2;
        ListNode left = sort(head, start, mid);
        ListNode right = sort(head, mid + 1, end);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                p.next = new ListNode(left.val);
                left = left.next;
                p = p.next;
            } else {
                p.next = new ListNode(right.val);
                right = right.next;
                p = p.next;
            }
        }

        p.next = left == null ? right : left;

        return dummyHead.next;
    }

}
