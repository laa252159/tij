package gl16.hw;

import java.util.Arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

public class GeneratedDArray {
    public static void main(String[] args) {
        double[] d = ConvertTo.primitive(Generated.array(
                Double.class, new CountingGenerator.Double(), 15));
        System.out.println(Arrays.toString(d));
    }
}
