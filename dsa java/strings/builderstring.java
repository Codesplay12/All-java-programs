public class builderstring {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("harsh");
    str.append("jain");
   
    // System.out.println(str);  // harshjain

    // str.setCharAt(0,'m');
    // System.out.println(str); // marshjain\
    str.insert(2,'a');
    // System.out.println(str); //haarshjain

    str.deleteCharAt(3);
    // System.out.println(str);  // haashjain
    str.reverse();
    // System.out.println(str);  // niajhsaah
  }   
}
