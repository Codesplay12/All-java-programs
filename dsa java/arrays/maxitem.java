import java.util.*;
public class maxitem {
    public static void main(String[] args) {
            int[] arr ={1,2,33,4,5}; 
        System.out.println(max(arr));
    }
     static int max(int[] arr )
     {
        int Max = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(Max < arr[i])
            {
                Max = arr[i];
            }
        }
        return Max;

     }
}
