// Node class representing a single node in the LinkedList
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class static LinkedListCycle {
    // Function to detect cycle in the LinkedList
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a LinkedList with a cycle
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // create a cycle

        System.out.println("Has cycle: " + hasCycle(head)); // prints: true

        // Create a LinkedList without a cycle
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("Has cycle: " + hasCycle(head)); // prints: false
    }
}