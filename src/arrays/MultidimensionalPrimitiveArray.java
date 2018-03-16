package arrays;//: arrays/MultidimensionalPrimitiveArray.java
// Creating multidimensional arrays.

import java.util.*;

public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][][][] a = {
                {{{1}, {1}}, {{2}}, {{3}}, {{2, 2}}},
                {{{4}}, {{5}, {6}}, {{2, 2}}}
        };
        System.out.println(Arrays.deepToString(a));
    }
} /* Output:
[[1, 2, 3], [4, 5, 6]]
*///:~
