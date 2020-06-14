import model.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created on 2020/6/12 12:02 AM
 *
 * @author zzkyeee
 */
public class BinaryTreeInorderTraversal {

    private List<Integer> res = new LinkedList<>();

    /**
     * 非递归实现
     * @param root 根节点
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }

    /**
     * 递归实现
     *
     * @param root 根节点
     * @return
     */
    public List<Integer> recursionInorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.right = new TreeNode(3);
        root.left = left;
        root.right = new TreeNode(4);

        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        binaryTreeInorderTraversal.inorderTraversal(root);
    }

}
