package gl11.hw;

import java.util.*;

public class Ex8 {
   public Ex8(int num){
      this.gerbilNumber = num;
   }
   private int gerbilNumber;

   public void hop(){
      System.out.println("Hop id is " + gerbilNumber);
   }

   public static void main(String[] args){
      List<Ex8> gerbils = new ArrayList<Ex8>();
      gerbils.add(new Ex8(1));
      gerbils.add(new Ex8(2));
      gerbils.add(new Ex8(3));
      gerbils.add(new Ex8(4));
      gerbils.add(new Ex8(5));
      
      Iterator<Ex8> iter = gerbils.iterator();

      while(iter.hasNext()) {
         iter.next().hop();
      }
   }

}
