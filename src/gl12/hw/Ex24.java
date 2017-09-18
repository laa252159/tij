package gl12.hw;

public class Ex24 {
    public static void main(String[] args) {
        try {
            FailingConstructorSecodC fc = new FailingConstructorSecodC();
            try {
                //...
            } finally {
                fc.dispose();
            }
        } catch (Exception e) {
            System.out.println("!Exception in constructor!");
        }
    }
}

class FailingConstructorSecodC {
    private DispClassSec dispClass;

    public FailingConstructorSecodC () throws Exception{
        dispClass = new DispClassSec();
//        throw new Exception();
    }
    public void dispose(){
        System.out.println("!!!CleanUpping");
        dispClass.dispose();
    }
}

class DispClassSec {
    public void dispose(){
        System.out.println("Disposed!!!");
    }
}
