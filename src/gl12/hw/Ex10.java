package gl12.hw;


public class Ex10 {
    public static void main(String[] args) throws Exception {
        MyExClassOne my = new MyExClassOne();
        my.f();
    }
}

class MyExClassOne {
    public void g() throws MyEx{
        throw new MyEx();
    }
    public void f() {
        try {
            try {
                g();
            } catch (Exception e) {
                throw new MyExSecond(e);
            }
        }catch (MyExSecond ms){
            throw new RuntimeException(ms);
        }

    }
}
class MyEx extends Exception {

}
class MyExSecond extends Exception {
    public MyExSecond(){

    }
    public MyExSecond(Exception e){
        super(e);
    }
}
