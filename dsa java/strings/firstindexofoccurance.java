public class firstindexofoccurance {

   
    
    public static void main(String[] args) {

       int n = StrStr("sadbutsad","sad");
       System.out.println(n);
       
    }
     public int StrtStr(String haystack, String needle)
    {
        for(int  i = 0; i < haystack.length() - needle.length() +1;i++)
            if(haystack.charAt(i) == needle.charAt(0))
            {
                if(haystack.substring(i,needle.length()+i).equals(needle))
                {
                    return i;
                }
            }
            return -1;
    }
}
