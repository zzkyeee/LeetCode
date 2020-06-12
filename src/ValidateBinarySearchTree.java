import model.TreeNode;

/**
 * Created on 2020/6/12 10:53 PM
 *
 * @author zzkyeee
 */
public class ValidateBinarySearchTree {

    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (null == root) {
            return true;
        }

        if (!isValidBST(root.left)) {
            return false;
        }

        if (root.val <= pre) {
            return false;
        }
        pre = root.val;

        return isValidBST(root.right);
    }

}
