package gl11.hw;

import java.util.*;

public class E18 {
   public static void main(String[] args){
       Map<String, String> map = new HashMap<String, String>();
       map.put("one", "a");
       map.put("two", "b");
       map.put("three", "d");
       map.put("four", "c");
       System.out.println("HashMap 1 2 3 4 :" + map);
       Map<String, String> lmap = new LinkedHashMap<String, String>();
       lmap.put("one", map.get("one"));
       lmap.put("two", map.get("two"));
       lmap.put("three", map.get("three"));
       lmap.put("four", map.get("four"));
       System.out.println("LinkedHashMap 1 2 3 4 : " + lmap);
   }
}
