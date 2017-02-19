package src.gl5;

import java.util.*;

public class ArrayNew{
   public static void main(String[] args){
      int[] a;
      int[] b; 
      char[] c; 
      char[] d; 
      b = new int[]{1, 22, 44, 44, 55};
      d = new char[]{0, 1, 2, 3, 4};
      Random rand = new Random(47);
      c = new char[rand.nextInt(20)];
      a = new int[rand.nextInt(20)];
      System.out.println("Length a = " + a.length);
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
      System.out.println(Arrays.toString(c));
      System.out.println(Arrays.toString(d));
   }
}
