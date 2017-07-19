//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package gl11.hw;

import polymorphism.shape.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Ex31 {
    public static void main(String[] args) {
        Generator generator = new Generator(5);
        generator.iterator();
        for(Shape sh : generator){
            sh.draw();
        }
    }
}

class Generator implements Iterable<Shape> {
    List<Shape> shapes = new ArrayList<>();
    private int num;
    public Generator(int num){
        this.num = num;
        for(int i = 0; i < num; i++ ){
            next();
        }
    }

    private Random rand = new Random();
    private void next() {
        switch(rand.nextInt(4)) {
            case 0: shapes.add(new Circle()); break;
            case 1: shapes.add(new Square()); break;
            case 2: shapes.add(new Triangle());break;
            case 3: shapes.add(new Rectangle());break;
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int pos;
            @Override
            public boolean hasNext() {
                return shapes.size() - 1 > pos;
            }

            @Override
            public Shape next() {
                return shapes.get(pos++);
            }
        };
    }


}///:~
