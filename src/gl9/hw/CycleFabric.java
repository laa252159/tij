package gl9.hw;

interface Cycle {
   void move();
}

interface CycleFactory {
   Cycle getCycle();
}

class Unicycle implements Cycle {
   public void move(){
       System.out.println("moving unicycle");
   }
}

class Bicycle implements Cycle {
   public void move(){
       System.out.println("moving bicycle");
   }
}


class Tricycle implements Cycle {
   public void move(){
       System.out.println("moving tricycle");
   }
}


class UnicycleFactory implements CycleFactory {
   public Unicycle getCycle(){
       return new Unicycle();
   }
}


class BicycleFactory implements CycleFactory {
   public Bicycle getCycle(){
       return new Bicycle();
   }
}

class TricycleFactory implements CycleFactory {
   public Tricycle getCycle(){
       return new Tricycle();
   }
}

public class CycleFabric{
   public static void driveCycle(CycleFactory factory){
       Cycle cycle = factory.getCycle();
       cycle.move();
   }
   public static void main(String[] args){
       driveCycle(new UnicycleFactory());       
       driveCycle(new BicycleFactory());       
       driveCycle(new TricycleFactory());       
   }
}
