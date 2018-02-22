package gl15.hw;

import java.util.Random;

public class GenericMethodsThree {
    public <A, B> void f(A a, B b, Integer c) {
        System.out.print(a.getClass().getName() + "\t");
        System.out.print(b.getClass().getName() + "\t");
        System.out.print(c.getClass().getName() + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        GenericMethodsThree gm = new GenericMethodsThree();
        gm.f("", 1, 3);
        gm.f(1, "", 2);
        gm.f(1.0, new Random(2), 7);
        gm.f(1.0F, "", 0);
        gm.f('c', "", 1);
        gm.f(gm, 2, 1);
    }
}