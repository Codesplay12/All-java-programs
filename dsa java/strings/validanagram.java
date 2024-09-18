public class validanagram {

   static boolean isAnagram(String s1, String s2)
    {
        int count = 0;
        for(int i = 0;i<s1.length();i++)
        {
            for(int j = 0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    count++;
                }
            }

        }
        if(count==s1.length())
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1, s2));

    }
}
