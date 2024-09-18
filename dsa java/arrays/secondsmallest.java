import java.util.*;
public class secondsmallest {
    
    public static void main(String[] args) {
        
        int[] arr = {0,1,2,3,4,5};
        int ans = ssecondsmallest(arr);
        System.out.println(ans);
    }

    static int ssecondsmallest(int[] arr)
    {
        int smallest = arr[0];
        int ss = Integer.MAX_VALUE;

        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                ss = smallest;
                smallest = arr[i];
            }
            else if(arr[i] != smallest && arr[i] < ss)
            {
                    ss = arr[i];
            }
                
            
        }
        return ss;
    }
}
