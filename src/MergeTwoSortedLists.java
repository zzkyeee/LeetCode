import po.ListNode;

import java.util.Arrays;

/**
 * Created on 2020/5/25 10:05 PM
 *
 * @author zzkyeee
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                p.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                p.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            p = p.next;
        }

        p.next = l1 == null ? l2 : l1;

        return dummyHead.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode l1 = ListNode.build(Arrays.asList(1, 2, 4));
        ListNode l2 = ListNode.build(Arrays.asList(1, 3, 4));
        System.out.println(mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }

}
