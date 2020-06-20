import model.TreeNode;

/**
 * Created on 2020/6/20 6:39 PM
 *
 * @author zzkyeee
 */
public class BinaryTreeMaximumPathSum {

    private int maxSum = Integer.MIN_VALUE;

    /**
     * 二叉树中的最大路径和
     * @param root 根节点
     * @return
     */
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);

        maxSum = Math.max(maxSum, root.val + left + right);

        return root.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

        TreeNode root = new TreeNode(10);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);

        root.left = new TreeNode(9);;
        root.right = right;

        solution.maxPathSum(root);
    }

}
