public class sumofdigits {
    // public static void main(String[] args) {
    //     int ans = sod(12345);
    //     System.out.println(ans);
    // }

    // static int sod(int n)
    // {
    //     int digit;
    //     int sum = 0;
    //     while(n>0)
    //     {
    //         digit = n%10;
    //         sum = sum + digit;
    //         n = n/10;
    //     }
    //     return sum;


    // }
    public static void main(String[] args) {
        int ans = sod(1342);
        System.out.println(ans);
    }
    static int sod(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        return n%10 + sod(n/10);
    }
}
