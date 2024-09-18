import java.util.Stack;

import org.w3c.dom.Node;
public class linkedliststack {

    public static class Node{ // user define datatype
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    public static class llStack{
       Node head = null;
       int size = 0;
       void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;

       }

       int pop()
       {
        if(head == null)
        {
            System.out.println("stack is empty");
            return -1;
        }
        int x = head.data;
        head = head.next;
        return x;
       }

       int peek()
       {
        if(head == null)
        {
             System.out.println("stack is empty");
        }
        return head.data;
       }

       void displayrec(Node h)
       {if(h==null) return;
          displayrec(h.next);
          System.out.println(h.data+" ");
       }
       void display()
       {
         displayrec(head);
        
       }
       void displayrev()
       {
         Node temp = head;
         while(temp!=head)
         {
            System.out.println(temp.data+" ");
            temp = temp.next;
         }
         System.out.println();
       }
       int size()
       {
        return size;
       }
    }

    
    public static void main(String[] args) {
        llStack st = new llStack();
        st.push(34);
        st.display();
        st.push(22);
        st.display();

        st.push(21);
        st.display();

        st.push(11);
        st.display();

    }
}
