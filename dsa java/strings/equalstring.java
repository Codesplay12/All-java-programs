public class equalstring {
    public static void main(String[] args) {
         
        String s1 = "harsh";
        String s2 = "harsh";
        String s3 = new String("harsh");

        System.out.println(s1==s2);
        // System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
