package gl4;

public class IfElse{

   static int result = 0;

   public static void main(String[] args){
      test(10, 5);
      test(5, 10);
      test(5, 5);
   }

   static void test(int testval, int target){
      if(testval > target)
        result = +1;
      else if(testval < target)
        result = -1;
      else
        result = 0;

      System.out.println(result);
   }

}
