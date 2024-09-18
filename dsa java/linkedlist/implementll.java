public class implementll {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;

        // insert at end in linkedlist;
        void insertatend(int val){ // empty list
            Node temp = new Node(val);
           if(head == null)
           {
            head = temp;
            tail = temp; 
           }
           else{ 
            tail.next = temp;
            
           }
           tail = temp;
        }

        // insert at beggining in linkedlist;
        void insertatbegin(int val) // empty list
        {
            Node temp = new Node(val);
            if(head == null)
            {
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }

        void Insertatanyindex(int idx,int val )
        {
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()){
                insertatend(val);
                return ;
            }
            else if(idx == 0)
            {
                insertatbegin(val);
                return;
            }
            for(int i = 1;i<=idx-1;i++)
            {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getAt(int idx)
        {
            Node temp = head;
            for(int i = 0;i<=idx;i++)
            {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx)
        {
            if(idx == 0)
            {
                head = head.next;
                return

            }
            Node temp = head;
            for(int i = 0;i<=idx-1;i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            
        }

        // to display the linkedlist;
        void display()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
             
        }
        int size()
        {
            Node temp = head;
            int count = 0;
            while(temp!=null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertatend(1);
        // ll.display();
        ll.insertatend(3);
        // ll.display();
        ll.insertatend(12);
        // ll.display();
        ll.insertatend(15);
        // ll.display();
        ll.insertatbegin(44); // 44 -> 1 -> 3 -> 12 -> 15
        // ll.display();
        ll.Insertatanyindex(2, 10);
        ll.Insertatanyindex(5, 55);
        ll.Insertatanyindex(0, 8);
        ll.display();
        System.out.println(ll.getAt(3));

    }
}
