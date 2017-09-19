package gl12.hw;

public class Ex28 {
    public static void main(String[] args) {
//        try {
            throw new MyExceptionRuntime("new string");
//        } catch (MyExceptionRuntime e){
//            System.out.println(e.getStr());
//        }
    }
}

class MyExceptionRuntime extends RuntimeException {

    private String str;

    public MyExceptionRuntime(String str){
        this.str = str;
    }

    public String getStr(){
       return str;
    }

}
