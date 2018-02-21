package gl14.hw.pack1;

public class OuterPackageClass {
    public static Iface getHiddenClass(){
        return new HiddenClass();
    }
}

class HiddenClass implements Iface {
    private void doPrivate(){
        System.out.println("private method is acting");
    }
    protected void doProtected(){
        System.out.println("protected method is acting");
    }
    void doPackage(){
        System.out.println("package method is acting");
    }
}

