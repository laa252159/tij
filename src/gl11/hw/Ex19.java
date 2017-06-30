package gl11.hw;

import java.util.*;

public class Ex19 {
   public static void main(String[] args){
       Set<String> set = new HashSet<String>();
       set.add("one");
       set.add("two");
       set.add("three");
       set.add("four");
       System.out.println("HashSet 1 2 3 4 :" + set);
       Set<String> hset = new LinkedHashSet<String>();
       hset.add("one");
       hset.add("two");
       hset.add("three");
       hset.add("four");
       System.out.println("LinkedHashSet 1 2 3 4 : " + hset);
   }
}
