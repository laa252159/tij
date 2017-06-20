package gl11.hw;

import java.util.*;

public class Ex11 {

   public static void main(String[] args){
       String[] sts = new String[]{"A","B","C","D","E"};
       List arrList = Arrays.asList(sts);
       List linList = new LinkedList(arrList);
       Set set = new HashSet(arrList);
       System.out.println("_______ ARRAY LIST _________");
       execute(arrList);
       System.out.println("_______ Linked List ________");
       execute(linList);
       System.out.println("_______ SET ________");
       execute(set);
  }


   private static void execute(Collection c){
       Iterator it = c.iterator();
       while(it.hasNext()){
          System.out.println(it.next());
       }
   }
}



