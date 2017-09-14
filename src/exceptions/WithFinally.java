package exceptions;//: exceptions/WithFinally.java
// Finally Guarantees cleanup.

public class WithFinally {
  static Switch sw = new Switch();
  public static void main(String[] args) {
    while (true) {
      try {
        sw.on();
        // Code that can throw exceptions...
        OnOffSwitch.f();
      } catch (OnOffException1 e) {
        System.out.println("OnOffException1");
        continue;
      } catch (OnOffException2 e) {
        System.out.println("OnOffException2");
      } finally {
        sw.off();
      }
    }
  }
} /* Output:
on
off
*///:~
