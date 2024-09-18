import java.util.*;
public class factR {
    // public static void main(String[] args) {

    //     int ans = fact(3);
    //     System.out.println(ans);
        
    // }

    // static int fact(int n)
    // {
    //     int fact = 1;
    //     for(int i = n;i>=1;i--)
    //     {
    //         fact = fact*i;
    //     }
    //     return fact;
    // }

    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n)
    {
        if(n<=1)
        {
            return 1;

        }

        return n * fact(n-1);
    }
}
