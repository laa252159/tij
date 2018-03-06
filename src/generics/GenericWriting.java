package generics;//: generics/GenericWriting.java

import java.util.*;

public class GenericWriting {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruits = new ArrayList<Fruit>();

    static void f1() {
        writeExact(apples, new Apple());
        // writeExact(fruits, new Apple()); // Error:
        // Incompatible types: found Fruit, required Apple
    }

    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static <T> void writeExactFruit(List<? super T> fruits, T fruit){
        fruits.add(fruit);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruits, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
        writeExactFruit(fruits, new Apple());
    }
} ///:~
