import model.ListNode;

import java.util.Arrays;

/**
 * Created on 2020/5/26 11:35 PM
 *
 * @author zzkyeee
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (null == lists || lists.length == 0) {
            return null;
        }
        ListNode listNode = lists[0];
        for (int i = 1; i < lists.length; i++) {
            listNode = mergeTwoLists(listNode, lists[i]);
        }
        return listNode;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1 || null == l2) {
            return null == l1 ? l2 : l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
//
//    public ListNode mergeKLists(ListNode[] lists) {
//        ListNode dummyHead = new ListNode(0);
//        ListNode p = dummyHead;
//        int minIndex = 0;
//        while (true) {
//            int minValue = Integer.MAX_VALUE;
//            for (int i = 0; i < lists.length; i++) {
//                if (lists[i] != null && lists[i].val < minValue) {
//                    minIndex = i;
//                    minValue = lists[i].val;
//                }
//            }
//            if (minValue == Integer.MAX_VALUE) {
//                break;
//            }
//            p.next = lists[minIndex];
//            p = p.next;
//            lists[minIndex] = lists[minIndex].next;
//        }
//
//        return dummyHead.next;
//    }

    public static void main(String[] args) {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        ListNode[] lists = new ListNode[3];
        lists[0] = ListNode.build(Arrays.asList(1, 4, 5));
        lists[1] = ListNode.build(Arrays.asList(1, 3, 4));
        lists[2] = ListNode.build(Arrays.asList(2, 6));
        mergeKSortedLists.mergeKLists(lists);
    }

}
