//: generics/coffee/CoffeeGenerator.java
// Generate different types of Coffee:
package net.mindview.util;

import java.util.Iterator;
import java.util.Random;

import generics.coffee.Coffee;
import typeinfo.pets.Cat;
import typeinfo.pets.Cymric;
import typeinfo.pets.Dog;
import typeinfo.pets.EgyptianMau;
import typeinfo.pets.Gerbil;
import typeinfo.pets.Hamster;
import typeinfo.pets.Manx;
import typeinfo.pets.Mouse;
import typeinfo.pets.Mutt;
import typeinfo.pets.Pet;
import typeinfo.pets.Pug;
import typeinfo.pets.Rat;
import typeinfo.pets.Rodent;

public class PetGenerator
implements Generator<Pet>, Iterable<Pet> {
  private Class[] types = {
          Pet.class, Dog.class, Cat.class,  Rodent.class,
          Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
          Cymric.class, Rat.class, Mouse.class,Hamster.class,Gerbil.class };
  private static Random rand = new Random(47);
  public PetGenerator() {}
  // For iteration:
  private int size = 0;
  public PetGenerator(int sz) { size = sz; }
  public Pet next() {
    try {
      return (Pet)
        types[rand.nextInt(types.length)].newInstance();
      // Report programmer errors at run time:
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
  class PetIterator implements Iterator<Pet> {
    int count = size;
    public boolean hasNext() { return count > 0; }
    public Pet next() {
      count--;
      return PetGenerator.this.next();
    }
    public void remove() { // Not implemented
      throw new UnsupportedOperationException();
    }
  };	
  public Iterator<Pet> iterator() {
    return new PetIterator();
  }
  public static void main(String[] args) {
    PetGenerator gen = new PetGenerator();
    for(int i = 0; i < 5; i++)
      System.out.println(gen.next());
    for(Pet c : new PetGenerator(5))
      System.out.println(c);
  }
} /* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
Mocha 4
Breve 5
Americano 6
Latte 7
Cappuccino 8
Cappuccino 9
*///:~
