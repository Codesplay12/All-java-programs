public class nthnodefromend {

    public static Node nthNode(Node head,int idx)
    {
        // int size = 0;
        // Node temp = head;
        // whiel(temp!=null)
        // {
        //     size++;
        //     temp=temp.next;
        // }
        // int m = size-n+1;
        Node slow = head;
        Node fast = head;
        for(int i = 1;i<=idx;i++)
        {
            fast = fast.next;

        }
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
    public static class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
    public static void main(String[] args) {
        
        Node a= new Node(5);
        Node b= new Node(3);
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node q = nthNode(a,2);
        System.out.println(q.data);
    }
}
