import java.util.Stack;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);
       System.out.println(st);
       Stack<Integer> rt = new Stack<>();
       while (st.size()>0) {
        // int x = st.peek();
        // rt.push(x);
        // st.pop();
        //or
        rt.push(st.pop());
        
       }
       System.out.println(rt);
       


    }
}
