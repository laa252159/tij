package gl7.hw;

public class Cycle{
   public void ride(){
      System.out.println("Ride Cycle");
   }

   public static void main(String[] args){
      Cycle[] cycles = new Cycle[3];
      cycles[0] = new Unicycle();
      cycles[1] = new Bicycle();
      cycles[2] = new Tricycle();
      for(int i = 0; i < 3; i++){
         cycles[i].ride();
      }
   }
}


class Unicycle extends Cycle{
   public void ride(){
      System.out.println("Ride Unicle");
   }
}


class Bicycle extends Cycle{
   public void ride(){
      System.out.println("Ride Bicycle");
   }
}


class Tricycle extends Cycle{
   public void ride(){
      System.out.println("Ride Tricycle");
   }
}
