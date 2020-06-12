import model.TreeNode;

/**
 * Created on 2020/6/12 11:06 PM
 *
 * @author zzkyeee
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkSame(root.left, root.right);
    }

    private boolean checkSame(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        return left != null && right != null && left.val == right.val
                &&  checkSame(left.left, right.right) && checkSame(left.right, right.left);
    }

}
