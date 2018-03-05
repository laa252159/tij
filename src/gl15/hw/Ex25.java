package gl15.hw;

public class Ex25 {

    static <T extends A> void a(T obj){
        obj.a();
    }


    static <T extends B> void b(T obj){
        obj.b();
    }
    public static void main(String[] args) {
        RealizerAB realizerAB = new RealizerAB();
        a(realizerAB);
        b(realizerAB);
    }
}

interface A {
    <T extends  A> void a();
}

interface B {
    <T extends  B> void b();
}

class RealizerAB implements A, B {
    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }
}
