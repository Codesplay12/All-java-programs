public class binarysearch {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,66,78,89};
        int target = 899;
        int ans = bs(arr, target);
        System.out.println(ans);
        
    }
    static int bs(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        
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
