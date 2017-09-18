package gl12.hw;

public class Ex23 {
    public static void main(String[] args) {
        try {
            FailingConstructorSecod fc = new FailingConstructorSecod();
            try {
                //...
            } finally {
                fc.cleanup();
            }
        } catch (Exception e) {
            System.out.println("!Exception in constructor!");
        }
    }
}

class FailingConstructorSecod {
    private DispClass dispClass;

    public FailingConstructorSecod () throws Exception{
        dispClass = new DispClass();
        throw new Exception();
//        new DispClass().dispose();
    }
    public void cleanup(){
        System.out.println("!!!CleanUpping");
        dispClass.dispose();
    }
}

class DispClass {
    public void dispose(){
        System.out.println("Disposed!!!");
    }
}
