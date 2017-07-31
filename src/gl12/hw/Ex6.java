package gl12.hw;

public class Ex6 {
    public static void main(String[] args) {
        try {
            throw new FirstException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            throw new SecondException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class FirstException extends Exception {
    @Override
    public String getMessage(){
        return "First ex";
    }
}
class SecondException extends Exception {
    @Override
    public String getMessage(){
        return "Second ex";
    }
}
