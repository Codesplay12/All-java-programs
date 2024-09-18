public class missinginarray {
    public static void main(String[] args) {
        int[] a = {1,2,3,5};
         int n = 5;
        int sum = 0;
        for(int i = 0;i<n-1;i++)
        {
            sum = sum + a[i];
        }

        int sum1 = (n(n+1))/2;

        int sum2 = sum1 - sum;
        System.out.println(sum2);
    }
}
