import java.util.*;
public class asciivalue {
    static int ascii(char c)
    {
        return (int) c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value of " + ch + " is " + ascii(ch));
    }
}
