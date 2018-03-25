package gl17.hw;

import java.util.*;

import static net.mindview.util.Countries.*;

public class ACountries {
    public static void main(String[] args) {
        TreeMap<String, String> map =
                new TreeMap<String, String>(capitals());
        TreeSet<String> set = new TreeSet<String>(names());
        String b = null;
        for (String s : map.keySet()) {
            if (s.startsWith("B")) {
                b = s;
                break;
            }
        }
        Map<String, String> aMap = map.headMap(b);
        Set<String> aSet = set.headSet(b);
        System.out.println("aMap = " + aMap);
        System.out.println("aSet = " + aSet);
    }
}
