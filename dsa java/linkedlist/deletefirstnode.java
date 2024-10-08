public class deletefirstnode {
    public static void removenthnode(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1;i<=n;i++)
        {
          fast = fast.next;
        }
        while(fast!=null)
        {
          slow = slow.next;
          fast = fast.next;

        }
        slow.next = slow.next.next;

  }
  public static class Node{
      int data;
      Node next;
      Node(int data)
      {
        this.data = data;
      }
      

  }
  public static void display(Node head)
  {
    Node temp = head;
    while(temp!=null)
    {
        System.out.println(temp.data+" ");
            temp = temp.next;
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
      removenthnode(a, 0);
      display(a);
      
  }
}
