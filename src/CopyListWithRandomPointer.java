import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created on 2020/7/5 12:23 PM
 *
 * @author zzkyeee
 */
public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {

        // key:old value:new
        Map<Node, Node> map = new HashMap<>();

        Node p = head;
        while (p != null) {
            Node newNode = new Node(p.val);
            map.put(p, newNode);
            p = p.next;
        }

        p = head;
        while (p != null) {
            Node newNode = map.get(p);
            if (p.next != null) {
                newNode.next = map.get(p.next);
            }

            if (p.random != null) {
                newNode.random = map.get(p.random);
            }

            p = p.next;
        }

        return map.get(head);

    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
