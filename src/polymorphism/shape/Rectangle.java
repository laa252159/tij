//: polymorphism/shape/Rectangle.java
package polymorphism.shape;
import static net.mindview.util.Print.*;

public class Rectangle extends Shape {
  @Override
  public void draw() { print("Rectangle.draw()"); }
  @Override
  public void erase() { print("Rectangle.erase()"); }
  @Override
  public void delete() { print("Rectangle.delete()"); }
} ///:~
