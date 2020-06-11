import po.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/6/12 12:02 AM
 *
 * @author zzkyeee
 */
public class BinaryTreeInorderTraversal {

    private List<Integer> res = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }

}
