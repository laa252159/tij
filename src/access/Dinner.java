package access;//: access/Dinner.java
// Uses the library.
import access.dessert.*;

public class Dinner {
  public static void main(String[] args) {
    Cookie x = new Cookie();
    //! x.bite(); // Can't access
    String id = "61549en_US";
    System.out.println(id.substring(id.length() - 5, id.length()));
  }
} /* Output:
Cookie constructor
*///:~
