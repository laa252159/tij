package gl16.hw;

import java.util.Arrays;

public class ReturningArray {
    static void hide(BerylliumSphere[] s) {
        System.out.println("Hiding " + s.length + " sphere(s)");
    }

    public static void main(String[] args) {
// Dynamic aggregate initialization:
        hide(new BerylliumSphere[]{new BerylliumSphere(),
                new BerylliumSphere()});
// The following line produces a compilation error.
//! hide({ new BerylliumSphere() });
// Aggregate initialization:
        BerylliumSphere[] d = {new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere()};
        hide(d);
// Dynamic aggregate initialization is redundant
// in the next case:
        BerylliumSphere[] a = new BerylliumSphere[]{
                new BerylliumSphere(), new BerylliumSphere()};
        hide(a);
    }
}

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}
