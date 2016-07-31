package gl5;

import java.util.*;

public class ArrayNew{
   public static void main(String[] args){
      int[] a;
      int[] b; 
      b = new int[]{1, 22, 44, 44, 55};
      Random rand = new Random(47);
      a = new int[rand.nextInt(20)];
      System.out.println("Length a = " + a.length);
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
   }
}
