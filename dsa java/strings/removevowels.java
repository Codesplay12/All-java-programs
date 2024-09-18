import java.util.*;
public class removevowels {
    static String vowels(String s)
    {
        StringBuilder result = new StringBuilder();
        String vowel = "aeiouAEIOU";
        for(char c:s.toCharArray())
        {
            if(vowel.indexOf(c) == -1)
            {
                result.append(c);
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter a string");
        String f = sc.nextLine();
        System.out.println(vowels(f));
    }
}
