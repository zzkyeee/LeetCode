import model.TreeNode;

/**
 * Created on 2020/7/22 11:18 PM
 *
 * @author zzkyeee
 */
public class LowestCommonAncestorOfaBinaryTree {

    TreeNode res = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        getCommonNumber(root, p, q);
        return res;
    }

    private int getCommonNumber(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root) {
            return 0;
        }
        int ans = 0;
        if (root == p || q == root) {
            ans += 1;
        }
        int left = getCommonNumber(root.left, p, q);
        int right = getCommonNumber(root.right, p, q);
        if (ans + left + right == 2 && res == null) {
            res = root;
        }
        return ans + left + right;
    }

}
