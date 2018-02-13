//: typeinfo/toys/ToyTest.java
// Testing class Class.
package typeinfo.toys;

import static net.mindview.util.Print.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import net.mindview.util.RandomGenerator;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    Toy() {
    }

    Toy(int i) {
    }
}

class SuperToy extends FancyToy {
    int IQ;

    public SuperToy(int intelligence) {
        IQ = intelligence;
    }

    public String toString() {
        return "I'm a SuperToy. I'm smarter than you.";
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
//        Class c = null;
//        try {
//            c = Class.forName("typeinfo.toys.SuperToy");
//        } catch (ClassNotFoundException e) {
//            print("Can't find FancyToy");
//            System.exit(1);
//        }
//        printInfo(c);
//        for (Class face : c.getInterfaces()) {
//            printInfo(face);
//        }
//        Class up = c.getSuperclass();
//        Object obj = null;
//        try {
//            // Requires default constructor:
//            obj = up.newInstance();
//        } catch (InstantiationException e) {
//            print("Cannot instantiate");
//            System.exit(1);
//        } catch (IllegalAccessException e) {
//            print("Cannot access");
//            System.exit(1);
//        }
//        printInfo(obj.getClass());
        System.out.println(makeToy("typeinfo.toys.SuperToy", 150));
    }

    public static Toy makeToy(String classFullName, int IQ) {

        try {
            Class<?> tClass = Class.forName(classFullName);
            for (Constructor cons : tClass.getConstructors()) {
                Class<?>[] params = cons.getParameterTypes();
                if (params.length == 1) {
                    if (params[0] == int.class) {
                        return (Toy) cons.newInstance(new Object[]{Integer.valueOf(IQ)});
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}







/* Output:
Class name: typeinfo.toys.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : typeinfo.toys.FancyToy
Class name: typeinfo.toys.HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name : typeinfo.toys.HasBatteries
Class name: typeinfo.toys.Waterproof is interface? [true]
Simple name: Waterproof
Canonical name : typeinfo.toys.Waterproof
Class name: typeinfo.toys.Shoots is interface? [true]
Simple name: Shoots
Canonical name : typeinfo.toys.Shoots
Class name: typeinfo.toys.Toy is interface? [false]
Simple name: Toy
Canonical name : typeinfo.toys.Toy
*///:~
