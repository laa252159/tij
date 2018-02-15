package typeinfo;//: typeinfo/SimpleProxyDemo.java
import static net.mindview.util.Print.*;

interface Interface {
  void doSomething();
  void somethingElse(String arg);
}

class RealObject implements Interface {
  public void doSomething() { print("doSomething"); }
  public void somethingElse(String arg) {
    print("somethingElse " + arg);
  }
}	

class SimpleProxy implements Interface {
  private Interface proxied;
  public SimpleProxy(Interface proxied) {
    this.proxied = proxied;
  }
  public void doSomething() {
    print("SimpleProxy doSomething");
    long start = System.nanoTime();
    proxied.doSomething();
    long duration = System.nanoTime() - start;
    System.out.println("METHOD-CALL TIME: " + duration);
  }
  public void somethingElse(String arg) {
    print("SimpleProxy somethingElse " + arg);
    long start = System.nanoTime();
    proxied.somethingElse(arg);
    long duration = System.nanoTime() - start;
    System.out.println("METHOD-CALL TIME: " + duration);
  }
}	

class SimpleProxyDemo {
  public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
  }
  public static void main(String[] args) {
    consumer(new RealObject());
    consumer(new SimpleProxy(new RealObject()));
  }
} /* Output:
doSomething
somethingElse bonobo
SimpleProxy doSomething
doSomething
SimpleProxy somethingElse bonobo
somethingElse bonobo
*///:~
