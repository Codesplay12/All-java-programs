public class ll1 {


    // public static void display(Node head)
    // {
    //     Node temp = head;
    //     while(temp!=null)
    //     {
    //         System.out.println(temp.data+"");
    //         temp = temp.next;
    //     }

    // }
    public static class Node{

        int data;
        Node next;
        Node(int data){

            this.data= data;
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
        
        //  Node temp = a;
    //  System.out.println(a.next.data);
      while(a!=null)
 {
     System.out.println(a.data + " ");
   a = a.next;
 }    
 
// display(a);
 }

//  public static int length(Node head)
 {
    int count = 0;
    while(head!=null)
         {
            //  System.out.println(temp.data+"");
            count++;
             head = head.next;
        }
        return count;
 }

    //    System.out.println(length(a));
}
