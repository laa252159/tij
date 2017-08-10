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
    public void f() throws MyExSecond{
        try {
            g();
        } catch (Exception e){
            throw new MyExSecond(e);
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
