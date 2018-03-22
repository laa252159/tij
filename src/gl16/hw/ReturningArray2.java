package gl16.hw;

import java.util.Arrays;

public class ReturningArray2 {
    static BerylliumSphere[] createArray(int size) {
        BerylliumSphere[] a = new BerylliumSphere[size];
        for (int i = 0; i < size; i++) {
            a[i] = new BerylliumSphere();
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(10)));
    }
}