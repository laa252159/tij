package gl11.hw;

import java.util.*;

public class CH11EX4 {
   static Collection<String> fill(Collection<String> c){
      c.add("Halk");
      c.add("Capitan USA");
      c.add("Iron Man");
      c.add("Spider Man");
      return c;
   }

   static void print(Collection<String> c){
      System.out.println(c.toString());
   }

   public  static void main(String[] args){
      Collection<String> al = new ArrayList<String>();
      Collection<String> ll = new LinkedList<String>();
      Collection<String> hs = new HashSet<String>();
      Collection<String> lhs = new LinkedHashSet<String>();
      Collection<String> ts = new TreeSet<String>();

      print(fill(al));
      print(fill(ll));
      print(fill(hs));
      print(fill(lhs));
      print(fill(ts));
   }
}
