package src.gl4.hw;

import java.util.*;

public class Vampire{
   public static void main(String[] args){
   boolean isNotFound = true;
   int cval = 0;
   int cn1 = 0;
   int cn2 = 0;
   nn: 
   while(isNotFound){
   for(int val = 1111; val < 9999; val++){
      if(val % 10 != 0){
      String valStr = String.valueOf(val);
      int[] arr = new int[4];
      arr[0] = Integer.parseInt(valStr.substring(0,1));
      arr[1] = Integer.parseInt(valStr.substring(1,2));
      arr[2] = Integer.parseInt(valStr.substring(2,3));
      arr[3] = Integer.parseInt(valStr.substring(3,4));
      
      Random rand = new Random();
      String n1str = "" + arr[rand.nextInt(3)] + rand.nextInt(9);
      String n2str = "" + arr[rand.nextInt(3)] + rand.nextInt(9);
      
      int n1 = Integer.parseInt(n1str);
      int n2 = Integer.parseInt(n2str);
//      System.out.println(val + " " + n1 + " " + n2);      
      if(n1 * n2 == val){
         System.out.println("val = " + val + " n1 = " + n1 + " n2 = " + n2);
	 isNotFound = false;
	 break nn;
      }
     } 
   //   if(val == 9999) val = 1111;
   }
   }



   }


}
