package hw;
import java.util.*;

class Leg{
   private static long counter;
   private final long id = counter++;
   private long links;
   String str = "leg";
   public void addRef(){
      links++;
   }
   public void dispose(){
      if(--links == 0){
         System.out.println("ID:" + id + " disposed");
      }
   }
   Leg(String t){
      System.out.println(str + " of " + t + " constructor");
   }
   public String toString(){
      return "ID - " + id + " links - " + links;
   }
}

abstract class Grizun {
  Leg l;
  Grizun(Leg leg){
      this.l = leg;
      System.out.println("Grizun constructor");
  }
  abstract void play(String n);
  public String toString() { return this.getClass().getSimpleName(); }
  abstract void feed();
}

class Mouse extends Grizun {
  Leg l;
  Mouse(Leg leg){
      super(leg);
      this.l = leg;
      System.out.println("Mouse constructor");
  }
  void play(String n) { System.out.println("Mouse.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void feed() { System.out.println("Feed Mouse"); }
}	

class Hamster extends Grizun {
  Leg l;
  Hamster(Leg leg){
      super(leg);
      this.l = leg;
      System.out.println(" constructor");
  }
  void play(String n) { System.out.println("Hamster.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void feed() { System.out.println("Adjusting Percussion"); }
}

abstract class Test{

}

public class Rodent {
  public static void pee(Grizun i) {
    i.play("sound");
    System.out.println(i);
  }
  public static void peeAll(List<Grizun> e) {
    for(Grizun i : e)
      pee(i);
  }	
  public static void main(String[] args) {
   Random random = new Random();
   // Upcasting during addition to the array:
   List<Grizun> animals = new LinkedList<>();
   for(int i = 0 ; i < 3; i++){
      int num = random.nextInt(2);
      System.out.println(num);
      switch(num){
         default:
	 case 0: animals.add(new Mouse(new Leg("right"))); break; 
	 case 1: animals.add(new Hamster(new Leg("left"))); break; 
      }
   }
    peeAll(animals);
  }
  // Test t = new Test();
} 
