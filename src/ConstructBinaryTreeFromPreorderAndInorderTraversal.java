import model.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/6/14 8:49 PM
 *
 * @author zzkyeee
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    int[] preOrder;

    int[] inOrder;

    Map<Integer, Integer> inOrderMap = new HashMap<>();

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        if (null == preOrder || preOrder.length == 0) {
            return null;
        }
        this.preOrder = preOrder;
        this.inOrder = inOrder;
        for (int i = 0; i < inOrder.length; i++) {
            inOrderMap.put(inOrder[i], i);
        }
        return buildTree(0, this.preOrder.length - 1, 0, this.inOrder.length - 1);

    }

    private TreeNode buildTree(int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }
        if (preEnd - preStart == 0) {
            return new TreeNode(preOrder[preStart]);
        }
        int rootValue = this.preOrder[preStart];
        TreeNode root = new TreeNode(rootValue);
        int index = this.inOrderMap.get(rootValue);
        root.left = buildTree(preStart + 1, index - inStart + preStart, inStart, index - 1);
        root.right = buildTree(index - inStart + preStart + 1, preEnd, index + 1, inEnd);
        return root;
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        solution.buildTree(new int[]{1, 2, 3}, new int[]{3, 2, 1});
    }

}
