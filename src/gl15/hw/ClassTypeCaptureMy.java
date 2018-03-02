package gl15.hw;
import java.util.HashMap;
import java.util.Map;

class Building {
}

class House extends Building {
}

class Product extends House {
}

public class ClassTypeCaptureMy {
    Map<String, Class<?>> types = new HashMap<>();

    public Object createNew(String typename) {
        Class<?> cl = types.get(typename);
        try {
            return cl.newInstance();
        } catch (NullPointerException e) {
            System.out.println("Not a registered typename: " + typename);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public void addType(String typename, Class<?> kind) {
        types.put(typename, kind);
    }

    public static void main(String[] args) {
        ClassTypeCaptureMy ctt = new ClassTypeCaptureMy();
        ctt.addType("Building", Building.class);
        ctt.addType("House", House.class);
        ctt.addType("Product", Product.class);
        System.out.println(ctt.createNew("Building").getClass());
        System.out.println(ctt.createNew("House").getClass());
        System.out.println(ctt.createNew("Product").getClass());
        ctt.createNew("Car");
    }
}
