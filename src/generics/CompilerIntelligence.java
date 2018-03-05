package generics;//: generics/CompilerIntelligence.java

import java.util.*;

public class CompilerIntelligence {
    public static void main(String[] args) {
        Apple apple = new Apple();
        List<? extends Fruit> flist = Arrays.asList(new Fruit(), new Orange(), apple);
        Apple a = (Apple) flist.get(2); // No warning
        System.out.println("flist.contains(new Apple()) " + flist.contains(apple)); // Argument is 'Object'
        System.out.println("flist.indexOf(new Apple()) " + flist.indexOf(apple)); // Argument is 'Object'
    }
} ///:~
