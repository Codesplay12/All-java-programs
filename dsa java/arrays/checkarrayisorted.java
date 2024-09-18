public class checkarrayisorted {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,6,5};
        boolean ans = sort(arr);
        System.out.println(ans);
    }

    static boolean sort(int[] arr)
    {
        
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]>= arr[i-1])
            {

            }
            else{
                return false;
            }
        }

        return true;
    
    
    }
}
