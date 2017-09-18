package gl12.hw;

public class Ex25 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A c = new C();
        try {
//            a.execute();
//            b.execute();
            c.execute();
        } catch (Exception3 e){
            System.out.println("Exception C");
        } catch (Exception2 e){
            System.out.println("Exception B");
        }
        catch (Exception1 e){
            System.out.println("Exception A");
        }
    }
}

class A {
    public void execute() throws Exception1{
        throw new Exception1();
    }
}

class B extends A {
    public void execute() throws Exception2{
        throw new Exception2();
    }
}

class C extends B {
    public void execute() throws Exception3{
        throw new Exception3();
    }
}


class Exception1 extends Exception {}
class Exception2 extends Exception1 {}
class Exception3 extends Exception2 {}

