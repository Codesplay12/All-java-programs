public class removespace {
    static String space(String s)
    {
        String result = "";
        for(char c:s)
        {if(c != ' ')
        {
            result = result + c;

        }
        
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(space(s));
        s.is

    }
}
