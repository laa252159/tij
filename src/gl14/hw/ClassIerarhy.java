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
            System.out.println(returnAllAncestors(firthClass, null));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static String returnAllAncestors(Object obj, StringBuilder sbIn) throws IllegalAccessException, InstantiationException {
        StringBuilder sb;
        if (sbIn == null) {
            sb = new StringBuilder();
        } else {
            sb = sbIn;
        }
        if (sb.length() != 0) {

            sb.append(" : ");
        }

        for (Class ifaceClass : obj.getClass().getInterfaces()) {
            sb.append(" " + ifaceClass + " *** ");
        }

        Class cl = obj.getClass().getSuperclass();
        sb.append(" " + cl + "\n");
        if (cl != null) {
            Object ob = cl.newInstance();
            returnAllAncestors(ob, sb);
        }
        return sb.toString();
    }

}
