package gl11.hw;

import java.util.*;



public class Ex17 {
   public static void main(String[] args){
       Map<String, Gerbil> map = new HashMap<String, Gerbil>();
       map.put("mini", new Gerbil(1));
       map.put("medium", new Gerbil(2));
       map.put("maxy", new Gerbil(3));
       Iterator<String> it = map.keySet().iterator();
       while(it.hasNext()){
           String name = it.next();
           System.out.print("Gerbil : " + name + " hop : ");
           map.get(name).hop();
       }
   }
}
