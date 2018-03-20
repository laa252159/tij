package gl16.hw;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics2 {
    public static void main(String[] args) {
        List<List<String>> ls = new ArrayList<List<String>>();
        ls.add(new ArrayList<String>());
        ls.add(new ArrayList<String>());
// Compile-time checking produces an error:
//! ls.add(new ArrayList<Integer>());
        ls.get(0).add("Array of Generics1");
        ls.get(1).add("Array of Generics2");
        System.out.println(ls.toString());
    }
}
