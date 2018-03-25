package gl17.hw;

import java.util.*;

import static net.mindview.util.Countries.*;

public class VerifySet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        for (int i = 0; i < 5; i++)
            set.addAll(names(10));
        System.out.println(set);

        Set<String> hset = new HashSet<String>();
        for (int i = 0; i < 5; i++)
            hset.addAll(names(10));
        System.out.println(hset);

        Set<String> tset = new TreeSet<String>();
        for (int i = 0; i < 5; i++)
            tset.addAll(names(10));
        System.out.println(tset);
    }
}
