package gl16.hw;

import java.util.*;

import net.mindview.util.*;

import static net.mindview.util.Print.*;

public class ArraySort2 {
    public static void main(String[] args) {
        Generator<Integer> gen =
                new RandomGenerator.Integer(1000);
        Integer[] a = Generated.array(new Integer[25], gen);

        print("Unsorted array: " + Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());

        print("Sorted array: " + Arrays.toString(a));
    }
}
