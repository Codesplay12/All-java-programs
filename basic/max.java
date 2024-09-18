public class max {

    public static void main(String[] args) {
        int[] arr = { 1,67,23,22,56};
       
        System.out.println(Max(arr));
     
    }
    static int Max(int[] arr)
    {
        int out = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > out)  {
                out = arr[i];
                
            }
            
        }
        return out;
    }
    
}
