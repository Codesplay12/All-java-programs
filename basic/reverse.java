import java.util.Arrays;
public class reverse {
    
  
    public static void main(String[] args) {
    
    int[] arr = {23,12,11,45,66};
      
    // mao(arr,0,1);
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  
    // System.out.println("hellon world");
    
  }
  static void mao(int[] arr,int index1,int index2)
   {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}
   static void reverse(int[] arr)
   {
    int s = 0;
    int end = arr.length-1;
    while (s< end) {
        mao(arr, s, end);
        s++;
        end--;
   }

}
}
  