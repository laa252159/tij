package src.gl5.hw;

import java.util.Random;

public class ConstructArray{
   ConstructArray(String str){
      System.out.println(str);
   }
   public static void main(String[] args){
      Random rand = new Random();
      ConstructArray[] ca = new ConstructArray[7];
      for(ConstructArray c : ca){
          c = new ConstructArray(String.valueOf(rand.nextInt(100)));
      }
   }
}

