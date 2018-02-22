package gl15.hw;//: generics/IterableFibonacci.java
// Adapt the Fibonacci class to make it Iterable.

import java.util.Iterator;

import generics.Fibonacci;

public class IterableFibonacciComposition
 implements Iterable<Integer> {
  Fibonacci fibonacci = new Fibonacci();
  private int n;
  public IterableFibonacciComposition(int count) { n = count; }
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      public boolean hasNext() { return n > 0; }
      public Integer next() {
        n--;
        return fibonacci.next();
      }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }	
  public static void main(String[] args) {
    for(int i : new IterableFibonacciComposition(18))
      System.out.print(i + " ");
  }
} /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~
