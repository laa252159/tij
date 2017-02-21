package hw;

public class Cycle{
   public void ride(){
      System.out.println("Ride Cycle");
   }
   public int getWheels(){
      return 0;
   }
   public static void main(String[] args){
      Cycle[] cycles = new Cycle[3];
      cycles[0] = new Unicycle();
      cycles[1] = new Bicycle();
      cycles[2] = new Tricycle();
      for(int i = 0; i < 3; i++){
         cycles[i].ride();
	 System.out.println("Wheels = " + cycles[i].getWheels());
      }
      ((Unicycle)cycles[0]).balance();
      ((Bicycle)cycles[1]).balance();
      ((Bicycle)cycles[2]).balance();
   }
}


class Unicycle extends Cycle{
   public int getWheels(){
      return 1;
   }
   public void ride(){
      System.out.println("Ride Unicle");
   }
   void balance(){
      System.out.println("Unicycle balance");
   }
}


class Bicycle extends Cycle{
   public int getWheels(){
      return 2;
   }
   public void ride(){
      System.out.println("Ride Bicycle");
   }
   void balance(){
      System.out.println("Bicycle balance");
   }
}


class Tricycle extends Cycle{
   public int getWheels(){
      return 3;
   }
   public void ride(){
      System.out.println("Ride Tricycle");
   }
}
