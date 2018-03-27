package gl17.hw;

import java.util.*;

import net.mindview.util.*;

public class RandTreeSet {

    public static void main(String args[]) {
        Set<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        ts.addAll(CollectionData.list(
                new RandomGenerator.String(), 10));
        System.out.println("ts = " + ts);
    }
}
