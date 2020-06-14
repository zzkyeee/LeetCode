import model.TreeNode;

/**
 * Created on 2020/6/14 11:51 AM
 *
 * @author zzkyeee
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }


}
