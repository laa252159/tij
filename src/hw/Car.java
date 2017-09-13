package hw;

class Engine{
   public void start(){}
   public void rev(){}
   public void stop(){}
   public void engine(){
      System.out.println("Engine");
   }
}

class Wheel{
   public void inflate(int psi){}
}

class Window{
   public void rollup(){}
   public void rolldown(){}
}

class Door{
   public Window window = new Window();
   public void open(){}
   public void close(){}
}

public class Car{
   public Engine engine = new Engine();
   public Wheel[] wheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Wheel()};
   public Door
      left = new Door(),
      right = new Door();

/*   public Car(){
      for(int i = 0; i < 4; i++){
         wheels[i] = new Wheel();
      }
   }
*/

      public static void main(String[] args){
         Car car = new Car();
         car.left.window.rollup();
	 System.out.println(car.wheels.length + " wheels");
         car.wheels[0].inflate(72);
	 car.engine.engine();
      }
}

