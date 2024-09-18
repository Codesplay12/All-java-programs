import java.util.*;
public class secondlargest {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};
        int ans = ssecondlargest(arr);
        System.out.println(ans);
    }

    static int ssecondlargest(int[] arr)
    {
        int largest = arr[0];
        int sl = -1;
        
        for(int i = 1;i<arr.length;i++ )
        {
            if(largest < arr[i])
            {
                sl = largest;
                largest = arr[i];
            }

            else if(arr[i] < largest && arr[i] > sl)
            {
                sl = arr[i];
            }
        }
        return sl;
    }
}
