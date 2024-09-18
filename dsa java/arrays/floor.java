public class floor {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8};
        int target = 6;
        int ans = fl(arr, target);
        System.out.println(ans);
        
    }
    static int fl(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1])
        {
            return -1;
        }
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
        return end;
    }
}
