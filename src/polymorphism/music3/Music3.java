//: polymorphism/music3/Music3.java
// An extensible program.
package polymorphism.music3;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;
import java.util.*;

class Instrument {
  void play(Note n) { print("Instrument.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
  void play(Note n) { print("Wind.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void adjust() { print("Adjusting Wind"); }
}	

class Percussion extends Instrument {
  void play(Note n) { print("Percussion.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
  void play(Note n) { print("Stringed.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
  void play(Note n) { print("Brass.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
  void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
  void play(Note n) { print("Woodwind.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
}

class Sax extends Wind {
  void play(Note n) { print("Sax.play() " + n); }
  public String toString() { return this.getClass().getSimpleName(); }
}	

public class Music3 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
    System.out.println(i);
  }
  public static void tuneAll(List<Instrument> e) {
    for(Instrument i : e)
      tune(i);
  }	
  public static void main(String[] args) {
   Random random = new Random();
   // Upcasting during addition to the array:
   List<Instrument> orchestra = new LinkedList<Instrument>();
   for(int i = 0 ; i < 10; i++){
      int num = random.nextInt(6);
      switch(num){
         default:
	 case 0: orchestra.add(new Wind()); break; 
	 case 1: orchestra.add(new Percussion()); break; 
	 case 2: orchestra.add(new Stringed()); break;
	 case 3: orchestra.add(new Brass()); break;
	 case 4: orchestra.add(new Woodwind()); break;
	 case 5: orchestra.add(new Sax()); break;
      }
   }
    
    /*Instrument[] orchestra = {
      new Wind(),
      new Percussion(),
      new Stringed(),
      new Brass(),
      new Woodwind(),
      new Sax()
    };*/
    tuneAll(orchestra);
  }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
