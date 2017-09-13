package gl5;

import java.util.Arrays;

public class ArrayInit{
   public static void main(String[] args){
      Integer[] a = {
         new Integer(1),
	 new Integer(2),
	 3, //Autoboxing
      };
      Integer[] b = new Integer[]{
         new Integer(1),
	 new Integer(2),
	 3, //Autoboxing
      };
      Number[] c;
      c = new Integer[]{
         new Integer(1),
	 new Integer(2),
	 3, //Autoboxing
      };

      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
      System.out.println(Arrays.toString(c));
   }
}
