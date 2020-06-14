import model.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created on 2020/6/14 11:28 AM
 *
 * @author zzkyeee
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isOrder = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelValues = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (null == curr) {
                    continue;
                }
                if (isOrder) {
                    levelValues.add(curr.val);
                } else {
                    levelValues.add(0, curr.val);
                }
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
            if (!levelValues.isEmpty()) {
                res.add(levelValues);
            }
            isOrder = !isOrder;
        }

        return res;
    }

}
