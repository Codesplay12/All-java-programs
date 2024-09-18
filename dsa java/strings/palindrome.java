import java.util.Scanner;

public class palindrome {
    
    static boolean ispalindrome(String s)
    {
        int l = 0;
        int r = s.length()-1;
        while(l<=r)
        {
            if(s.charAt(l) != s.charAt(r) )
            {
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String gs = sc.nextLine();
        if(ispalindrome(gs))
        {
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
      
        
    }
}
