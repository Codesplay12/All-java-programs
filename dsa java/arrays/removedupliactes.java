public class removedupliactes {
    
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,4,5,5,6};
        int ans = duplicate(arr);
        System.out.println(ans);
    }

    static int duplicate(int[] arr)
    {   int i = 0;
        
        
            for(int j = 1;j<arr.length;j++)
            {
                if(arr[i] != arr[j])
                {
                    arr[i+1] = arr[j];
                    i++;
                }
            }
        
        return (i+1);
     }
 }

