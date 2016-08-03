package gl5;

import java.util.Arrays;
import java.util.Random;


public class ArrayClassObj{
   public static void main(String[] args){
         Random rand = new Random();
	 Integer[] a = new Integer[rand.nextInt(20)];
	 System.out.println("length a = " + a.length);
	 for(int i = 0; i < a.length; i++){
	    a[i] = rand.nextInt(500);
	 }
	 System.out.println(Arrays.toString(a));
   }
}
