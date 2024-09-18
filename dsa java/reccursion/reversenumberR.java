public class reversenumberR {
    public static void main(String[] args) {
        
        int ans = reverse(1234);
        System.out.println(ans);
    }

    static int reverse(int n)
    {
        
        // while(n>0){
        //     int digit;
        //     digit = n%10;
            
        

        // }
        

        // return digit;

        if(n == 0)
        {
            return;
        }
        
        return ((n%10)*10) + reverse(n/10);

    }
}
