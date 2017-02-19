package src.gl3;

import static java.lang.System.*;

public class HelloWorld{

   public static void main(String[] args){
      print(args);
      out.println("Test static import");   
      int i = 0;
      out.println(i = 3);
   }

   private static void print(String[] args){
     System.out.println("Hello World");
   }





}
