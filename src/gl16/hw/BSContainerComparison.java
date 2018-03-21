package gl16.hw;

import java.util.*;

import net.mindview.util.*;

import static net.mindview.util.Print.*;

public class BSContainerComparison {
    public static void main(String[] args) {
        BSGenerator gen = new BSGenerator();
        BerylliumSphere[] spheres = Generated.array(
                BerylliumSphere.class, gen, 5);
        print(Arrays.toString(spheres));
        print(spheres[4]);
        List<BerylliumSphere> sphereList = Arrays.asList(
                Generated.array(BerylliumSphere.class, gen, 5));
        print(sphereList);
        print(sphereList.get(4));
        int[] integers = {0, 1, 2, 3, 4, 5};
        print(Arrays.toString(integers));
        print(integers[4]);
        List<Integer> intList = new ArrayList<Integer>(
                Arrays.asList(0, 1, 2, 3, 4, 5));
        intList.add(97);
        print(intList);
        print(intList.get(4));
    }
}

class BSGenerator implements Generator<BerylliumSphere> {
    public BerylliumSphere next() {
        return new BerylliumSphere();
    }
}