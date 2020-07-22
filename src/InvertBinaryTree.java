import model.TreeNode;

/**
 * Created on 2020/7/22 11:16 PM
 *
 * @author zzkyeee
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.right = left;
        root.left = right;
        return root;
    }

}
