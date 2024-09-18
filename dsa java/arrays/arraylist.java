import java.util.*;
public class arraylist {
 public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(12);
    list.add(23);
    list.add(33);
    list.add(45);
    System.out.println(    list.size()  );

    // System.out.println(list.get(1));
    list.set(0, 108);
    System.out.println(list);
 }   
}
