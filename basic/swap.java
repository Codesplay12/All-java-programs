import java.util.Arrays;
public class swap
{
public static void main(String[] args)
{
  int[] arr = {1,45,23,22,34};
  mao(arr,0,1);
  System.out.println(Arrays.toString(arr));

  // System.out.println("hellon world");
  
}
static void mao(int[] arr,int index1,int index2)
 {
  int temp = arr[index1];
  arr[index1] = arr[index2];
  arr[index2] = temp;
 }
}