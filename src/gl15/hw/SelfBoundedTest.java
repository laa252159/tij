package gl15.hw;

public class SelfBoundedTest {

    public static void main(String[] args) {
        Derived derived = new Derived();
        System.out.println(derived == derived.test());
    }
}

abstract class SelfBounded<T extends SelfBounded<T>> {

    abstract public T process(T t);

    public T test() {
        return process(null);
    }
}

class Derived extends SelfBounded<Derived> {

    @Override
    public Derived process(Derived derived) {
        if (derived == null) {
            return this;
        }
        return derived;
    }
}
