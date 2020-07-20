import model.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/7/20 9:45 PM
 *
 * @author zzkyeee
 */
public class KthSmallestElementInABST {

    private List<Integer> orderedValue = new LinkedList<>();

    public int kthSmallest(TreeNode root, int k) {
        recursion(root);
        return orderedValue.get(k - 1);
    }

    private void recursion(TreeNode root) {
        if (null == root) {
            return;
        }
        recursion(root.left);
        orderedValue.add(root.val);
        recursion(root.right);
    }

}
