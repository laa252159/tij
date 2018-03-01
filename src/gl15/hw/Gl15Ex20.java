package gl15.hw;

public class Gl15Ex20 implements Ex20Face {
    @Override
    public void method1() {
        System.out.println("method 1");
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }

    public void method3(){

    }

    public static void main(String[] args) {
        Gl15Ex20 obj = new Gl15Ex20();
        Gl15Ex20_2 consumer = new Gl15Ex20_2();
        consumer.someMethod(obj);
    }
}

interface Ex20Face {
    void method1();
    void method2();
}

class Gl15Ex20_2{
    public <T extends Ex20Face> void someMethod(T obj){
        obj.method1();
        obj.method2();
    }
}
