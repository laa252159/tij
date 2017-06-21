package gl11.hw;

import java.util.*;

public class Ex14 {
   static LinkedList<Integer> list = new LinkedList<Integer>();
   
   static void addValue(Integer i){
      if(list.isEmpty() || list.size() < 2){
         list.listIterator().add(i);
      } else 
         list.listIterator(list.size()/2).add(i);
   }


   public static void main(String[] args){
      for(int i=0; i < 30; i++){
         addValue(i);   
      }
      System.out.println(list);
   }
}
