package gl12.hw;

public class Ex4 {
    public static void main(String[] args) {
        try {
            throw new MyException("new string");
        } catch (MyException e){
            System.out.println(e.getStr());
        }
    }
}

class MyException extends Exception {

    private String str;

    public MyException(String str){
        this.str = str;
    }

    public String getStr(){
       return str;
    }

}
