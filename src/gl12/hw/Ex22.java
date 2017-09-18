package gl12.hw;

public class Ex22 {
    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor();
            try {
                //...
            } finally {
                fc.cleanup();
            }
        } catch (Exception e) {
            System.out.println("Exception in constructor");
        }
    }
}

class FailingConstructor {
    public FailingConstructor () throws Exception{
        throw new Exception();
    }
    public void cleanup(){
        System.out.println("CleanUpping");
    }
}
