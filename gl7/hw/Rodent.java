package gl7.hw;
import java.util.*;

class Leg{
   private static long counter;
   private final long id = counter++;
   private long links;
   String str = "leg";
   public void addRef(){
      links++;
   }
   public dispose(){
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

class Grizun {
  Leg l;
  Grizun(Leg leg){
      this.l = leg;
      System.out.println("Grizun constructor");
  }
  void play(String n) { System.out.println("Rodent.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void feed() { System.out.println("Feed Rodent"); }
}

class Mouse extends Grizun {
  Leg l;
  Mouse(Leg leg){
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
      this.l = leg;
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
