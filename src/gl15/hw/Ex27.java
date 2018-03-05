package gl15.hw;

import java.util.ArrayList;
import java.util.List;

public class Ex27 {
    public static void main(String[] args) {
        //List<Number> list1 = new ArrayList<Integer>();
        List<? extends Number> list2 = new ArrayList<Integer>();
//        list2.add(1);
        System.out.println(list2.get(0));
    }
}
