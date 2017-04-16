package gl10.hw.ex7_1;
//test
class MainClassSecond{
   public Moveable act(){
      class Mover implements Moveable {
         public void move(){
	    System.out.println("Moveing towards");
	 }
      }
      return new Mover();
   }

   public Moveable innerAct(){
      return new InnerMover();
   }
   
   private class InnerMover implements Moveable{
      public void move(){
         System.out.println("Inner movement");
      }
   }

 /*  public static void main(String[] args){
      Moveable m = new MainClass().act();
      m.move();
   }*/
}

public class MainClass{
   public static void main(String[] args){
      new MainClassSecond().innerAct().move();
   }
} 


interface Moveable {
   void move();
}
