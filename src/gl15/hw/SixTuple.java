package gl15.hw;

import net.mindview.util.FiveTuple;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {

    public final F f;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        this.f = f;
    }

    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length()-1) + ", " + f + ")";
    }

    public static void main(String[] args) {
        SixTuple<String, String, String, String, String, String> strs = new SixTuple<>("a","b", "c", "d", "e","f");
        System.out.println(strs);
    }
}
