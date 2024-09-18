public class llimplementation  {
    public static class Node{
        int val;
        Node next;

    }
    public static class queuell{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x)
        {
            Node temp = new Node(x)
            if(size==0)
            {
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek()
        {
            if(size == 0)
            {
                System.out.println("queue is empty");
                return -1;
            }
            return head.val;
        }
        public int remove()
        {
            if(size == 0)
            {
                System.out.println("queue is empty");
                return -1;
            }
           int x = head.val;
           head = head.next;
           size--;
           return x;

        }

        public void display()
        {
            if(size == 0)
            {
                System.out.println("queue is empty");
                return -1;
            }
            Node temp = head;
            while(temp!=null)
            {
                System.out.println(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queuell q1 = new queuell();
        q1.add(1);
    }
    
}
