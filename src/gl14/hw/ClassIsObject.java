package gl14.hw;

import java.util.Arrays;

public class ClassIsObject {

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd'};
        int[] ints = {1, 2, 3, 4};

        int i = 0;

        System.out.println(" *** " + char[].class);
        System.out.println(" *** " + long[].class);
        System.out.println(" *** " + String[].class);
        System.out.println(" *** " + float[].class);
        System.out.println(" *** " + double[].class);
        System.out.println(" *** " + boolean[].class);
        System.out.println(" *** " + boolean[].class);

        System.out.println(" *** " + int.class);

        System.out.println(chars.getClass());
        System.out.println(Arrays.toString(ints.getClass().getDeclaredFields()));
        System.out.println(chars instanceof Object);
    }

}
