package gl9.hw;

abstract class Base{
   abstract void act();
}

class Gl9Ex4 extends Base{
   void act(){
      System.out.println("ACTION");
   }

   static void transform(Base base){
      base.act();
   }

   public static void main(String[] args){
       transform(new Gl9Ex4());  
   }
}
