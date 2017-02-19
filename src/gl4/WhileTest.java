package src.gl4;

public class WhileTest{
   static int counter = 0;
   
   public static void main(String[] args){
      while(condition()){
         System.out.println("Inside 'while'");
         counter++;
      }
      System.out.println("Exited while");
      System.out.println("counter: " + counter);
   
   }

   static boolean condition(){
      boolean result = Math.random() < 0.99;
      System.out.println(result + ", ");
      return result;
   }
}
