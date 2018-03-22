package gl16.hw;

import java.util.*;

import net.mindview.util.*;

import static net.mindview.util.Print.*;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        Generator<Integer> gen =
                new RandomGenerator.Integer(1000);

        int[] a = ConvertTo.primitive(
                Generated.array(new Integer[25], gen));

        print("Unsorted array: " + Arrays.toString(a));

        int location = Arrays.binarySearch(a, a[10]);

        printnb("Location of " + a[10] + " is " + location);

        if (location >= 0) {
            print(", a[" + location + "] = " + a[location]);
        } else {
            print();
        }

        location = Arrays.binarySearch(a, a[5]);
        printnb("Location of " + a[5] + " is " + location);
        if (location >= 0) {
            print(", a[" + location + "] = " + a[location]);
        }
    }
}
