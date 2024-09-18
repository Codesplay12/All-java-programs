import java.util.Scanner;

public class function1 {
    
    public static void main(String[] args) {
        
       int ans =  sum1();
       System.out.println(ans);
    }

    static int  sum1()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
       int  a = in.nextInt();
       int  b = in.nextInt();
        int sum = a+b;
       return sum;
    }
}
