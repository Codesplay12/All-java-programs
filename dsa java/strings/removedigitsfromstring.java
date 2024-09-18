public class removedigitsfromstring {
    public static void main(String[] args) {
        String str = "jainharsh2223";
        int digits = 0;
        char ch;
        String result = "";

        for(int i = 0;i<str.length();i++)
        {
            

            if(!Character.isDigit(str.charAt(i)))
            {
                
               result = result + str.charAt(i);

            } 

            else if( Character.isDigit(str.charAt(i)))

           {
               digits++;
           }
            
        }
        System.out.println(result);
        System.out.println(digits);
    }
}
