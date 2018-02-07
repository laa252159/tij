package gl14.hw;

import java.util.Arrays;

public class ClassIsObject {

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd'};
        int[] ints = {1, 2, 3, 4};
        System.out.println(chars.getClass());
        System.out.println(Arrays.toString(ints.getClass().getDeclaredFields()));
        System.out.println(chars instanceof Object);
    }

}
