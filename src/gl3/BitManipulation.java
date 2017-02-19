package src.gl3;

import java.util.*;

public class BitManipulation{
   
  public static void main(String[] argd){
     Random rand = new Random(47);
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
     System.out.println();
     printBinaryInt("-i", -i);
     printBinaryInt("-i << 5", -i << 5);
     printBinaryInt("-i >> 5", -i >> 5);
     printBinaryInt("-i >> -5", (-i >> -5) >> 2);
     printBinaryInt("(~i) >> 5", (~i) >> 5);
     printBinaryInt("i >>> 5", i >>> 5);
     printBinaryInt("(~i) >>> 5", (~i) >>> 5);

     long l = rand.nextLong();
     long m = rand.nextLong();
     printBinaryLong("-1L", -1L);
     printBinaryLong("+1L", +1L);
     long ll = 9223372036854775807L;
     printBinaryLong("max pos", ll);
     long lln = -9223372036854775808L;
     printBinaryLong("mac neg", lln);
     printBinaryLong("l", l);
     printBinaryLong("~l", ~l);
     printBinaryLong("m", m);
     printBinaryLong("l & m", l & m);
     printBinaryLong("l | m", l | m);
     printBinaryLong("l ^ m", l ^ m);
     System.out.println();
     printBinaryLong("l", l);
     printBinaryLong("l << 5", l << 5);


     printBinaryLong("l >> 5", l >> 5);
     printBinaryLong("(~l) >> 5", (~l) >> 5);
     printBinaryLong("l >>> 5", l >>> 5);
     printBinaryLong("(~l) >>> 5", (~l) >>> 5);
  }  

  static void printBinaryInt(String s, int i){
     System.out.println(s + ", int: " + i + ", binary: \n " + 
     	Integer.toBinaryString(i));
  }

  static void printBinaryLong(String s, long l){
     System.out.println(s + ", long: " + l + ", binary: \n " + 
     	Long.toBinaryString(l));
  }
}
