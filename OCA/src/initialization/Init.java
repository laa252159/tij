package initialization;

public class Init {
    static int param = 0;

    public Init() {
    }

    void do1(){
//        System.out.println(param++);
        do2();
    }
    static {
        param = 0;
        System.out.println("static block");
    }
    void do2(){
        System.out.println(param++);
        do1();

    }

    public static void main(String[] args) {
        Init init = new Init();
        init.do1();
        param = 2;
    }
}
