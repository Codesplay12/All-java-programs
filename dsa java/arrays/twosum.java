public class twosum {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6};
        int target = 9;
        sum(nums,target);
        
    }
    static void sum(int[] arr, int target)
    {
        for(int i =0;i<arr.length;i++)
        {
            if((arr[i] + arr[i+1]) == target)
            {
                System.out.println(i + " " + i+1);
            }
        }
    }
    
}
