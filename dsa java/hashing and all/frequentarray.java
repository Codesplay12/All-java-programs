import java.util.HashMap;
import java.util.*;

public class frequentarray {
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] arr = {1,3,2,1,4,1,5,6,7,7,7,7,7};
        for(int el : arr)
        {
            if(!mp.containsKey(el))
            {
                mp.put(el,1);
            }
            else{
                mp.put(el,mp.get(el) + 1);
            }
        }
        System.out.println("frequencies are");
        System.out.println(mp.entrySet());

         int maxfreq = 0;
        int anskey = -1;
        for(var i : mp.entrySet() )
        {
            if(i.getValue()> maxfreq)
            {
                maxfreq = i.getValue();
                anskey = i.getKey();
            }
        }
        

        if(freq)
        System.out.println(anskey);

    }
}
