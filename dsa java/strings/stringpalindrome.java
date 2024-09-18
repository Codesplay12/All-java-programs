public class stringpalindrome {
    
    public static void main(String[] args) {
        
        String str = "harsh";
        String rstr = "";
        char ch;
        for(int i = 0;i<str.length();i++)
        {
            ch = str.charAt(i);
            rstr = ch + rstr;
        }

        if(rstr.equals(str))
        {
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }
    }
}
