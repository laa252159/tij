package src.gl5;

public class OverloadingVarargs2{
   
   static void f(float i, Character... args){
      System.out.println("first");
   }
   static void f(char c, Character... args){
      System.out.println("second");
   }

   public static void main(String[] args){
      f('t', 'a');
      f(2, 'b');
   }


}
