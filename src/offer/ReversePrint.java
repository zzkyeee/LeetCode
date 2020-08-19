package offer;

import model.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/8/19 11:07 PM
 *
 * @author zzkyeee
 */
public class ReversePrint {

    List<Integer> res = new LinkedList<>();

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[] {};
        }
        dfs(head);
        int []resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    private void dfs(ListNode head) {
        if (head == null) {
            return;
        }
        dfs(head.next);
        res.add(head.val);
    }

}
