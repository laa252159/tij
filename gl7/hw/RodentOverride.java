package gl7.hw;
import java.util.*;

class Grizun {
  public void play(String n) { System.out.println("Rodent.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  public void feed() { play("eeee"); }
}

class Mouse extends Grizun {
  @Override
  public void play(String n) { System.out.println("Mouse.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
}	

public class RodentOverride {
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
  // List<Grizun> animals = new LinkedList<>();
    Grizun mouse = new Mouse();
    mouse.feed();
    
    Grizun g = new Grizun();
    g.feed();
//peeAll(animals);
  }
} 
