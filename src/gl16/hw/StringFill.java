package gl16.hw;
import net.mindview.util.*;

public class StringFill {
    public static void main(String[] args) {
        String s = new CountingGenerator.String(15).next();
        System.out.println(s);
    }
}
