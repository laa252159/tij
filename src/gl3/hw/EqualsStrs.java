package src.gl3.hw;

public class EqualsStrs{
   public static void main(String[] args){
      String s1 = args[0];    
      String s2 = args[1];    
      eq(s1, s2);
   }

   static void eq(String str1, String str2){
      System.out.println("str1.equals(str2): " + str1.equals(str2));
      System.out.println("str1 == str2 : " + (str1 == str2));
      System.out.println("str1.length() == str2.length() : " + (str1.length() == str2.length())); 
   }

}
