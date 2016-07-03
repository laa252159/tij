package gl3;

import java.util.*;

public class BitManipulation{
   
  public static void main(String[] argd){
     Random rand = new Random();
     int i = rand.nextInt();
     int j = rand.nextInt();
     
     printBinaryInt("-1", -1);
     printBinaryInt("+1", +1);

     int maxpos = 2147483647;
     printBinaryInt("max pos", maxpos);
  
     int maxneg = -2147483648;
     printBinaryInt("max neg", maxneg);

     printBinaryInt("i", i);
     printBinaryInt("~i", ~i);
     printBinaryInt("-i", -i);
     printBinaryInt("j", j);
     printBinaryInt("i & j", i & j);
     printBinaryInt("i | j", i | j);
     printBinaryInt("i ^ j", i ^ j);
     printBinaryInt("i << 5", i << 5);



          
          
     
     
     
  
  }  

  static void printBinaryInt(String s, int i){
     System.out.println(s + ", int: " + i + ", binary: \n " + 
     	Integer.toBinaryString(i));
  }

  static void printBinaryLong(String s, long l){
     System.out.println(s + ", long: " + l + ", binary: \n " + 
     	Integer.toBinaryString(l));
  }
}
