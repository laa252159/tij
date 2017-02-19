package polymorphism;
//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.
import static net.mindview.util.Print.*;

class Glyph {
  void draw() { print("Glyph.draw()" + " DRAW Glyph"); }
  Glyph() {
    print("Glyph() before draw()");
    draw();
    print("Glyph() after draw()");
  }
}	

class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    print("RoundGlyph.draw(), radius = " + radius + " DRAW RoundGlyph");
  }
}	

class RectangularGlyph extends RoundGlyph {
  private int radius = 4;
  RectangularGlyph(int r) {
    super(1);
    radius = r;
    print("RectangularGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    print("RectangularGlyph.draw(), radius = " + radius + " DRAW RectangularGlyph");
  }
}	

public class PolyConstructors {
  public static void main(String[] args) {
    new RectangularGlyph(5);
  }
} /* Output:
Glyph() before draw()
RoundGlyph.draw(), radius = 0
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
*///:~
