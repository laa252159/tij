package gl12.hw;//: exceptions/StormyInning.java
// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.

class BaseballException extends RuntimeException {}

class Foul extends BaseballException {}

class Strike extends BaseballException {}

class UmpireException extends RuntimeException {}

class UmpireExceptionTwo extends UmpireException {}

abstract class Inning {
  public Inning() throws BaseballException {}
  public void event() throws BaseballException {
    // Doesn't actually have to throw anything
  }
  public abstract void atBat() throws Strike, Foul;
  public void walk() throws UmpireException {}
}

class StormException extends RuntimeException {}

class RainedOut extends StormException {}

class PopFoul extends Foul {}

interface Storm {
  public void event() throws RainedOut, UmpireException;
  public void rainHard() throws RainedOut;
}

public class Ex29 extends Inning implements Storm {
  // OK to add new exceptions for constructors, but you
  // must deal with the base constructor exceptions:
  public Ex29()
    throws RainedOut, BaseballException {}
  public Ex29(String s)
    throws Foul, BaseballException {}
  // Regular methods must conform to base class:
 public void walk() throws UmpireExceptionTwo {
      throw new UmpireExceptionTwo();
 } //Compile error
  // Interface CANNOT add exceptions to existing
  // methods from the base class:
 //!public void event() throws RainedOut {}
  // If the method doesn't already exist in the
  // base class, the exception is OK:
  public void rainHard() throws RainedOut {}
  // You can choose to not throw any exceptions,
  // even if the base version does:
  public void event() {}
  // Overridden methods can throw inherited exceptions:
  public void atBat() throws PopFoul {
  }
  public static void main(String[] args) {
//    try {
        Ex29 si = new Ex29();
      si.atBat();
//    } catch(PopFoul e) {
//      System.out.println("Pop foul");
//    } catch(RainedOut e) {
//      System.out.println("Rained out");
//    } catch(BaseballException e) {
//      System.out.println("Generic baseball exception");
//    }
    // Strike not thrown in derived version.
//    try {
      // What happens if you upcast?
      Inning i = new Ex29();
      i.atBat();
      i.walk();
      // You must catch the exceptions from the
      // base-class version of the method:
//    } catch(Strike e) {
//      System.out.println("Strike");
//    } catch(Foul e) {
//      System.out.println("Foul");
//    } catch(RainedOut e) {
//      System.out.println("Rained out");
//    } catch(BaseballException e) {
//      System.out.println("Generic baseball exception");
//    } catch (UmpireException e){
//        System.out.println(e);
//    }
  }
} ///:~
