package gl14.hw;//: typeinfo/Shapes.java

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList) {
            shape.draw();
            if(shape instanceof Rhomboid){
                // Circle circle = (Circle) shape; //Exception in thread "main" java.lang.ClassCastException: gl14.hw.Rhomboid cannot be cast to gl14.hw.Circle
            }
        }
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
