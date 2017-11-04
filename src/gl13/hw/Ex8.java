package gl13.hw;

import strings.Splitting;

import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println(Splitting.knights);
        System.out.println(Arrays.toString(Splitting.knights.split("\\W+")));
        System.out.println(Arrays.toString(Splitting.knights.split("the|you")));
    }
}
