package gl4.hw;

import java.util.*;

public class BreakAndContinue{
   public static void main(String[] args){
      int counter = 0;
      for(int i : range(100)){
         counter++;
         if(i == 99) break; //return;
	 System.out.print(i + " ");
      }
      System.out.println();
      System.out.println("counter" + counter);
   }

   static int[] range(int rang){
      Random rand = new Random();
      int[] arr = new int[rang];
      for(int i = 0; i < rang; i++){
         arr[i] = rand.nextInt(rang);
      }
   return arr;
   }
}
