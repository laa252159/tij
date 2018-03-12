package generics;//: generics/OrdinaryArguments.java

class OrdinarySetter<T extends Base> {
    void set(T base) {
        System.out.println("OrdinarySetter.set(Base)");
    }
}

class DerivedSetter<T extends Derived> extends OrdinarySetter {
    void set(T derived) {
        System.out.println("DerivedSetter.set(Derived)");
    }
}

public class OrdinaryArguments {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedSetter ds = new DerivedSetter();
        ds.set(derived);
        ds.set(base); // Compiles: overloaded, not overridden!
    }
} /* Output:
DerivedSetter.set(Derived)
OrdinarySetter.set(Base)
*///:~
