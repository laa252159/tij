package gl14.hw;//: typeinfo/Shapes.java

import java.util.Arrays;
import java.util.List;

abstract class Shape {

    private boolean selected;

    void draw() {
        System.out.println(this + ".draw() isSelected = " + isSelected());
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
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
        Shape[] shapes = {new Circle(), new Square(), new Triangle(), new Rhomboid()};
        shapes[0].setSelected(true);
        shapes[1].setSelected(false);
        shapes[2].setSelected(true);
        shapes[3].setSelected(false);
        List<Shape> shapeList = Arrays.asList(
                shapes
        );
        for (Shape shape : shapeList) {
            shape.draw();
            rotate(shape);
        }
    }

    private static void rotate(Shape shape) {
        if(shape instanceof Circle){
            Circle circle = (Circle) shape; //Exception in thread "main" java.lang.ClassCastException: gl14.hw.Rhomboid cannot be cast to gl14.hw.Circle
        }
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
