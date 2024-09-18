import java.util.*;
public class Main{
    
    public static void main(String[] args)
    {
    //    int[] a = {1,2,3,4,5};
    //    System.out.println(a[2]);
    //    for(int i = 0;i<=a.length-1;i++)
    //    {
    //     System.out.println(a[i]);
    //    }

    // for(int nums : a)
    //    {
    //     System.out.println(nums + " ");
    //    }
    // }

    // System.out.println(Arrays.toString(a));
    String[] str = new String[4];
     Scanner sc = new Scanner(System.in);
     for(int i = 0;i<str.length;i++)
     {
        str[i] = sc.next();
     }
     System.out.println(Arrays.toString(str));

}
}
