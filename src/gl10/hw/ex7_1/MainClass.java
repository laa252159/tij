package gl10.hw.ex7_1;

public class MainClass{
   public Moveable act(){
      class Mover implements Moveable {
         public void move(){
	    System.out.println("Moveing towards");
	 }
      }
      return new Mover();
   }

   public static void main(String[] args){
      Moveable m = new MainClass().act();
      m.move();
   }
}


interface Moveable {
   void move();
}
