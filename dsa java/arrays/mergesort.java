import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        
    

    int[] a = {1,2,3};
    int[] b = {4,5,6};
        int al = a.length;
        int bl = b.length;

     int[] c  = new int[al+bl];

      System.arraycopy(a, 0, c, 0, al);
      System.arraycopy(b, 0, c, al, bl);
      Arrays.sort(c);
      System.out.println(c);
    
}
}
