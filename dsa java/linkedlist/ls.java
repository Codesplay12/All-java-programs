

public class ls {

    public static void main(String[] args) {
        int[] arr = {12,45,22,76,55};
        int ans = linearsearch(arr, 1);
        System.out.println("Element found at index : "+ans);
        
    }
    static int linearsearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
         
        for(int index = 0; index < arr.length;index++)
        {
            if(arr[index] == target)
            {
                return index;
            }
            
        }
        return -1;
        
    }
    
}
