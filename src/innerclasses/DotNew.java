package innerclasses;//: innerclasses/DotNew.java
// Creating an inner class directly using the .new syntax.

public class DotNew {
  public class Inner {}
  public static void main(String[] args) {
    DotNew dn = new DotNew();
    DotNew.Inner dnin = dn.new Inner();
    DotNew.Inner dni = dn.new Inner();
    dn.new Inner();
  }
} ///:~
