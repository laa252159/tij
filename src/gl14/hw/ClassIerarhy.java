package gl14.hw;

import java.lang.reflect.Field;
import java.util.Arrays;

import org.mockito.cglib.core.CollectionUtils;
import org.mockito.internal.util.collections.ArrayUtils;

interface FirstIface {
}

interface SecondIface {
}


class FirstClass implements FirstIface {
    int a;
    int b;
}

class SecondClass extends FirstClass {
    String c;
    String d;

}

class FirdClass extends SecondClass {
}

class FirthClass extends FirdClass implements SecondIface {
}


public class ClassIerarhy {
    public static void main(String[] args) {
        FirthClass firthClass = new FirthClass();
        try {
            System.out.println(returnAllAncestors(firthClass.getClass(), null));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static String returnAllAncestors(Class cl, StringBuilder sbIn) throws IllegalAccessException, InstantiationException {
        StringBuilder sb;
        if (sbIn == null) {
            sb = new StringBuilder();
        } else {
            sb = sbIn;
        }
        if (sb.length() != 0) {

            sb.append(" : ");
        }

        Class clSuperclass = cl.getSuperclass();
        sb.append(" " + cl + "\n");

        if (cl.getDeclaredFields() != null && cl.getDeclaredFields().length > 0) {
            sb.append("fields: \n");
            for (Field field : cl.getDeclaredFields()) {
                sb.append(field.getName() + "   \n");
            }
        }

//        sb.append("\n");

        for (Class ifaceClass : cl.getInterfaces()) {
            sb.append(" " + ifaceClass + " *** ");
        }


        if (clSuperclass != null) {
            returnAllAncestors(clSuperclass, sb);
        }
        return sb.toString();
    }

}
