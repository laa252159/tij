package gl7.hw;
import java.util.*;

class Leg{
   String str = "leg";
   Leg(String t){
      System.out.println(str + " of " + t + " constructor");
   }
}

class Grizun {
  Leg l = new Leg("grizun");
  Grizun(){
      System.out.println("Grizun constructor");
  }
  void play(String n) { System.out.println("Rodent.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void feed() { System.out.println("Feed Rodent"); }
}

class Mouse extends Grizun {
  Leg l = new Leg("mouse");
  Mouse(){
      System.out.println("Mouse constructor");
  }
  void play(String n) { System.out.println("Mouse.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void feed() { System.out.println("Feed Mouse"); }
}	

class Hamster extends Grizun {
  Leg l = new Leg("hamster");
  Hamster(){
      System.out.println(" constructor");
  }
  void play(String n) { System.out.println("Hamster.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void feed() { System.out.println("Adjusting Percussion"); }
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
      switch(num){
         default:
	 case 0: animals.add(new Grizun()); break; 
	 case 1: animals.add(new Mouse()); break; 
	 case 2: animals.add(new Hamster()); break; 
      }
   }
    peeAll(animals);
  }
} 
