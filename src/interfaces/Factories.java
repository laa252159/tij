package interfaces;//: interfaces/Factories.java
import static net.mindview.util.Print.*;

interface Service {
  void method1();
  void method2();
}

interface ServiceFactory {
  Service getService();
}

class Implementation1 implements Service {
  Implementation1() {} // Package access
  public void method1() {print("Implementation1 method1");}
  public void method2() {print("Implementation1 method2");}	
  
  static ServiceFactory f1 = new ServiceFactory()  {
    public Service getService() {
      return new Implementation1();
    }
  };
}

class Implementation2 implements Service {
  Implementation2() {} // Package access
  public void method1() {print("Implementation2 method1");}
  public void method2() {print("Implementation2 method2");}
  static ServiceFactory f2 = new ServiceFactory(){
     public Service getService(){
       return new Implementation2(); 
     }	  
   };
 }
public class Factories {
  public static void serviceConsumer(ServiceFactory fact) {
    Service s = fact.getService();
    s.method1();
    s.method2();
  }
  public static void main(String[] args) {
    serviceConsumer(Implementation1.f1);
    // Implementations are completely interchangeable:
    serviceConsumer(Implementation2.f2);
  }
} /* Output:
Implementation1 method1
Implementation1 method2
Implementation2 method1
Implementation2 method2
*///:~
