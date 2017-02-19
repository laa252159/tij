package src.gl4;

import java.util.*;

public class BreakAndContinue{
   public static void main(String[] args){
      for(int i = 0; i < 100; i++){
         if(i == 74) break;
	 if(i % 9 != 0) continue;
	 System.out.print(i + " ");
      }
      System.out.println();
      for(int i : range(100)){
         if(i == 74) break;
	 if(i % 9 != 0) continue;
	 System.out.print(i + " ");
      }
      System.out.println();
      int i = 0;
      while(true){
         i++;
	 int j = i * 27;
	 if(j == 1269) break;
	 if(i % 10 != 0) continue;
	 System.out.print(i + " ");
      }
      System.out.println();
   }

   static int[] range(int rang){
      Random rand = new Random(47);
      int[] arr = new int[rang];
      for(int i = 0; i < rang; i++){
         arr[i] = rand.nextInt(rang);
      }
   return arr;
   }
}
