import java.util.Stack;

public class firststack{
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(34);
        st.push(22);
        st.push(21);
        st.push(11);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println("size is "+st.size());
        while(st.size()>2)
        {
              st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty());
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number of elements");
         n = sc.nextInt();
        System.out.println("enter the elemnts");
        for(int i = 1;i<=n;i++)
        {
           int x = sc.nextInt();
           st.push(x); 
        }
        System.out.println(st);
        

    }
}