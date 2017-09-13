package hw;

import java.util.*;

public class StaticFinal{
   public StaticFinal(int id){
      this.id = id;
   }
   private int id;
   public final int first = new Random().nextInt(100);
   public static final int second = new Random().nextInt(100);

   public String toString(){
      return "ID = " + id + " first = " + first + " second static =  " + second; 
   }

   public static void main(String[] args){
      StaticFinal sf0 = new StaticFinal(0);
      StaticFinal sf1 = new StaticFinal(1);
      StaticFinal sf2 = new StaticFinal(2);
      StaticFinal sf3 = new StaticFinal(3);
      StaticFinal sf4 = new StaticFinal(4);
      
      System.out.println(sf0);
      System.out.println(sf1);
      System.out.println(sf2);
      System.out.println(sf3);
      System.out.println(sf4);


   }
}
