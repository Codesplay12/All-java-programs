public class leftrotate {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
       rotateby1(arr);
       System.out.println(arr);
    }

    static void rotateby1(int[] arr)
    {
        int s = arr[0];
        

        for(int i = 1;i<arr.length;i++)
        {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = s;

        
        

    }
}
