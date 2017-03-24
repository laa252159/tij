//: innerclasses/DotThis.java
// Qualifying access to the outer-class object.
package innerclasses;

public class DotThis {
  String str;
  void f() { System.out.println("DotThis.f()"); }
  public class Inner {
    public DotThis outer() {
      DotThis.this.str = "done";
      return DotThis.this;
      // A plain "this" would be Inner's "this"
    }
  }
  public Inner inner() { return new Inner(); }
  public static void main(String[] args) {
    DotThis dt = new DotThis();
    System.out.println(dt.str);
    DotThis.Inner dti = dt.inner();
    dti.outer().f();
    System.out.println(dt.str);
  }
} /* Output:
DotThis.f()
*///:~
