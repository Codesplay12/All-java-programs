import java.util.*;
public class basichash {

    
    public static void main(String[] args) {

        Map<String,Integer> mp = new HashMap<>();
        mp.put("akash",21);
        mp.put("harsh",89);
        mp.put("tiwari",93);
        System.out.println(mp.get("harsh")); // 89
        System.out.println(mp.get("rahul")); // null
        mp.remove("akash"); // remove akash from hash
        System.out.println(mp.get("akash")); // null
        System.out.println(mp.containsKey("harsh")); // true
        System.out.println(mp.containsKey("kumar")); // false
         mp.putIfAbsent("yashika", 30); // will enter
         mp.putIfAbsent("akash", 32); // will not enter

         System.out.println(mp.keySet()); // only print key
         System.out.println(mp.values()); // only print values
         System.out.println(mp.entrySet()); // print both key and values

         for(String key : mp.keySet())
         {
            System.out.printf(key,mp.get(key));// traverse all keys
         }
System.out.println();
         for(Map.Entry<String, Integer> e : mp.entrySet())
         {
            System.out.printf(e.getKey(),e.getValue());
         }
         System.out.println();
         for(var e : mp.entrySet())
         {
            System.out.printf(e.getKey(),e.getValue());
         }

        
    }
}
