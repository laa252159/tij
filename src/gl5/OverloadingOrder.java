package src.gl5;

public class OverloadingOrder{
   static void f(String s, int i){
      System.out.println("String :" + s + ", int: " + i);
   }
   static void f(int i, String s){
      System.out.println("Int: " + i + ", Sring:" + s);
   }


   public static void main(String[] args){
      f("First String", 11);
      f(99, "First number");
   }
}
