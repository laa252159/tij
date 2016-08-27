package gl5.hw;

import gl5.hw.pack.Inner;

public class Outer extends Inner{
      public static void testPublic(){
         System.out.println("child public");
      }

   public static void main(String[] args){
      Inner.testPublic();
      Outer outer = new Outer();
      outer.testPublic();
      outer.testProtected();
    //Inner.testProtected();
    //Inner.testPrivate();
    //Inner.testPackage();
      Test test = new Test();
      test.test();
   }
}

class Test{
   protected void test(){
      System.out.println("protected !!!");
   }
}
