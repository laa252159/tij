package gl15.hw;//: generics/GenericMethods.java

import java.math.BigDecimal;
import java.util.Random;

import concurrency.NotifyVsNotifyAll;
import gl4.hw.NotDivNums;

public class GenericMethodsThree {
    public <A, B, C> void f(A a, B b, C c) {
        System.out.print(a.getClass().getName() + "\t");
        System.out.print(b.getClass().getName() + "\t");
        System.out.print(c.getClass().getName() + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        GenericMethodsThree gm = new GenericMethodsThree();
        gm.f("", 1, 3);
        gm.f(1, "", new Double(2));
        gm.f(1.0, new Random(2), new BigDecimal(2));
        gm.f(1.0F, "", new NotifyVsNotifyAll());
        gm.f('c', "", new StringBuilder("f"));
        gm.f(gm, 2, 001f);
    }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
