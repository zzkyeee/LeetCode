import model.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created on 2020/6/16 10:58 PM
 *
 * @author zzkyeee
 */
public class PopulatingNextRightPointersInEachNode {

    /**
     * dfs
     *
     * @param root
     * @return
     */
    public Node connect(Node root) {
        Node leftMost = root;

        while (leftMost != null) {
            Node head = leftMost;
            while (head != null) {
                if (head.left != null) {
                    head.left.next = head.right;
                    if (head.next != null) {
                        head.right.next = head.next.left;
                    }
                }
                head = head.next;
            }
            leftMost = leftMost.left;
        }

        return root;
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNode solution = new PopulatingNextRightPointersInEachNode();

        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.left = left;
        root.right = right;
        left.left = new Node(4);
        left.right = new Node(5);
        right.left = new Node(6);
        right.right = new Node(7);

        solution.connect(root);
    }

}
