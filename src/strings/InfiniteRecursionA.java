package strings;//: strings/InfiniteRecursionA.java
// Accidental recursion.
// {RunByHand}
import java.util.*;

public class InfiniteRecursionA {
  public String toString() {
    return " InfiniteRecursion address: " + this + "\n";
  }
  public static void main(String[] args) {
    List<InfiniteRecursionA> v =
      new ArrayList<InfiniteRecursionA>();
    for(int i = 0; i < 10; i++)
      v.add(new InfiniteRecursionA());
    System.out.println(v);
  }
} ///:~
