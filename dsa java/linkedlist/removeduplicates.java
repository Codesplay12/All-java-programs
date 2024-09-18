import java.util.LinkedList;

import org.w3c.dom.Node;

public class removeduplicates {

    public static class Node
    {
        int data;
       Node next;

Node(int data)
{
    this.data = data;
    this.next = null;
}

    }


 public static class LinkedList {  
    Node head;  

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


    public void append(int data) {  
        Node newNode = new Node(data);  
        if (head == null) {  
            head = newNode;  
            return;  
        }  
        Node current = head;  
        while (current.next != null) {  
            current = current.next;  
        }  
        current.next = newNode;  
    }  

    public void removeDuplicates() {  
        Node current = head;  

        while (current != null) {  
            Node runner = current;  
            // Check for duplicates and remove them  
            while (runner.next != null) {  
                if (runner.next.data == current.data) {  
                    // Remove runner.next by linking it to runner.next.next  
                    runner.next = runner.next.next;  
                } else {  
                    // Move runner to the next node  
                    runner = runner.next;  
                }  
            }  
            // Move current to the next distinct element  
            current = current.next;  
        }  
    }  

    public void printList() {  
        Node current = head;  
        while (current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
}  


    public static void main(String[] args) {  
        LinkedList list = new LinkedList();  
        list.append(1);  
        list.append(2);  
        list.append(3);  
        list.append(2);  
        list.append(4);  
        list.append(1);  
        
        System.out.println("Original List:");  
        list.printList();  
        
        list.removeDuplicates();  
        
        System.out.println("List after removing duplicates:");  
        list.printList();  

        list.hasCycle();
    }  
}  

   

