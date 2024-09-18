import java.util.Scanner;
import java.util.Stack;
public class insertatanyindex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2); 

        st.push(3);

        st.push(4);
System.out.println(st);
int x = 7;
Stack<Integer> rt = new Stack<>();
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the index");
int idx = sc.nextInt();
while(st.size()>idx)
 {
    rt.push(st.pop());
}
System.out.println(rt);
 st.push(x);
 System.out.println(st);
 while(rt.size()>0)
 {
    st.push(rt.pop());
 }
 System.out.println(st);


        


    }
}
