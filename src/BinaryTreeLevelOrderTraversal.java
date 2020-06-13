import model.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created on 2020/6/12 11:19 PM
 *
 * @author zzkyeee
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (null == root) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currLevel = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll();
                if (null == currNode) {
                    continue;
                }
                queue.offer(currNode.left);
                queue.offer(currNode.right);
                Integer val = currNode.val;
                currLevel.add(val);
            }
            if (currLevel.size() > 0) {
                res.add(currLevel);
            }
        }

        return res;
    }



}
