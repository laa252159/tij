package gl14.hw;

interface FirstIface {
}

interface SecondIface {
}


class FirstClass implements FirstIface {
}

class SecondClass extends FirstClass {
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

        for (Class ifaceClass : cl.getInterfaces()) {
            sb.append(" " + ifaceClass + " *** ");
        }

        Class clSuperclass = cl.getSuperclass();
        sb.append(" " + cl + "\n");
        if (clSuperclass != null) {
            returnAllAncestors(clSuperclass, sb);
        }
        return sb.toString();
    }

}
