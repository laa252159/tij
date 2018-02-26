package gl15.hw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import generics.Fibonacci;
import generics.Generators;
import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

public class ExtendedGenerators extends Generators {

    public static <T> Collection<T> fill(Collection<T> coll, CountingGenerator.Character gen, int n) {
        System.out.println("used collection");
        return coll;
    }

    public static <T> Collection<T> fill(List<T> coll, Generator<T> gen, int n) {
        System.out.println("used list");
        return coll;
    }

    public static <T> Collection<T> fill(Queue<T> coll, Generator<T> gen, int n) {
        System.out.println("used queue");
        return coll;
    }

    public static <T> Collection<T> fill(LinkedList<T> coll, Generator<T> gen, int n) {
        System.out.println("used linkedList");
        return coll;
    }

    public static <T> Collection<T> fill(Set<T> coll, Generator<T> gen, int n) {
        System.out.println("used set");
        return coll;
    }


    public static void main(String[] args) {
        Collection<Coffee> coffeeList = fill((List<Coffee>) new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffeeList) {
            System.out.println(c);
        }
        Collection<Integer> iQueue = fill((Queue<Integer>) new LinkedList<Integer>(), new Fibonacci(), 12);
        for (int i : iQueue) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collection<Character> cLList = fill(new LinkedList<Character>(), (Generator<Character>) new CountingGenerator.Character(), 12);
        for (char ch : cLList) {
            System.out.print(ch);
        }
        System.out.println();
        Collection<Boolean> bSet = fill(new HashSet<Boolean>(), new CountingGenerator.Boolean(), 10);
        for (Boolean b : bSet) {
            System.out.println(b);
        }
    }

}
//
//    You need explicit casting from LinkedList to Queue because LinkedList
//implements both List and Queue interfaces; without an explicit cast, the
//        compiler will complain of an ambiguous method call. You can even overload to
//        distinguish between List and LinkedList.
