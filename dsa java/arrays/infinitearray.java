public class infinitearray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,9,12,80,346};
        int target = 12;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target)
    {
        int start = 0;
       int end = 1;
       while(target> arr[end])
       {
        int temp = end+1;
        end = end + (end-start+1);
        start = temp;
       } 
       return bs(arr, target, start, end);
    }
    static int bs(int[] arr, int target,int start, int end)
    {
        
        
        while(start <= end)
        {
            int mid  = start + (end - start)/2;
            if(arr[mid] < target)
            {
                start = mid+1; 
            }
            else if(arr[mid] > target)
            { 
                end = mid - 1;      
            }
          else
          {
            return mid;
          }
        }
        return -1;
    }
    
}
