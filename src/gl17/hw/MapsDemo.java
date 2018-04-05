package gl17.hw;

import java.util.*;

import static net.mindview.util.Print.*;

public class MapsDemo {
    private static void test(Map<String, String> map) {
        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm");
        try {
            map.put("extra", "object");
        } catch (ArrayIndexOutOfBoundsException e) {
// Never happen!
            print("Too many objects!");
        }
        print(map);
        print(map.get("ocean"));
    }

    public static void main(String[] args) {
        System.out.println("*** HashMap ***");
        test(new HashMap<String, String>());
        System.out.println("*** TreeMap ***");
        test(new TreeMap<String, String>());
        System.out.println("*** LinkedHashMap ***");
        test(new LinkedHashMap<String, String>());
    }
}
