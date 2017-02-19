package src.gl5.hw;

public class StaticCheck{
   
   static int i = 5;
   static String str;

   static {
      str = "static string";
      System.out.println("Class was made" + " i = " + i + " str = " + str);
   }

   public static void main(String[] args){
      StaticCheck.i = 2;
      System.out.println(StaticCheck.i);
   }
}
