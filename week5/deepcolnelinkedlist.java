
import java.util.HashMap;

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

public class deepcolnelinkedlist {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: Create a copy of each node and insert it next to the original node.
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }

        // Step 2: Copy the random pointers.
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        // Step 3: Separate the original and cloned lists.
        Node oldList = head;
        Node newList = head.next;
        Node newHead = head.next;
        while (oldList != null) {
            oldList.next = oldList.next.next;
            if (newList.next != null) {
                newList.next = newList.next.next;
            }
            oldList = oldList.next;
            newList = newList.next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        // Example Usage
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        deepcolnelinkedlist solution = new deepcolnelinkedlist();
        Node clonedList = solution.copyRandomList(node1);

        // Print the cloned list to verify
        Node current = clonedList;
        while (current != null) {
            System.out.print("Node(" + current.val + ")");
            if (current.random != null) {
                System.out.print(", Random(" + current.random.val + ")");
            } else {
                System.out.print(", Random(null)");
            }
            System.out.println();
            current = current.next;
        }
    }
}
