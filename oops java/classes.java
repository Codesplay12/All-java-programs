

public class classes {
    public static class student{
       String name;
       int no;
       double perc;

    }
    public static void main(String[] args) {
        
        student x = new student();  // declaration
        x.name = "harsh";
        x.no = 56;
        x.perc = 88.4;
        System.out.println(x.name);
        System.out.println(x.no);
    }
}
