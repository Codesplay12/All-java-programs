public class binaryR {
    
    public static void main(String[] args) {
        int[] arr = {1,2,34,44,55,98};
        int target = 98;
        int ans = search(arr, target,0, arr.length-1);
        System.out.println(ans);
    }

    static int search(int[] arr,int target, int s, int e )
    {

        if(s>e)
        {
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target)
        {
            return m;
        }
        if(target < arr[m])
        {
           return search(arr, target, 0, m-1);
        }
       return search(arr, target, m+1, e);

    }
}
