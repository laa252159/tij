package hw;

public class OverridePrivate extends BaseClass{
//   @Override
     private void dot(){
        System.out.println("from OverridePrivate");
     }
    public static void main(String[] args){
       BaseClass o1 = new BaseClass();
       BaseClass o2 = new OverridePrivate();
       o1.f();
       ((OverridePrivate)o2).f();
    }
    final void f(){
       System.out.println("Override");
    }

}

class BaseClass{
   private void dot(){
      System.out.println("from base class");
   }
   void f(){
      System.out.println("Base");
   }
}
