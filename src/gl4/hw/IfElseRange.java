package src.gl4.hw;

public class IfElseRange{
   static String test(int testval, int target, int begin, int end){
      boolean isInRange = testval <= end && testval >= begin;
      if(testval > target)
         return +1 + " " + isInRange;
      else if(testval < target)
         return -1 + " " + isInRange; 
      else 
         return  0 + " " + isInRange;
   }

   public static void main(String[] args){
      System.out.println(test(10, 5, 4, 6));
      System.out.println(test(5, 10, 4, 6));
      System.out.println(test(5, 5, -100, 100));
   }



}
