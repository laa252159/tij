package gl11.hw;

import java.util.*;

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7 });
		List<Integer> list2 = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7 });

		System.out.println("-----Before----");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);

		ListIterator<Integer> li1 = list1.listIterator();
		ListIterator<Integer> li2 = list2.listIterator(list2.size());

		while (li1.hasNext() && li2.hasPrevious()) {
			li2.previous();
			li2.set(li1.next());
		}

		System.out.println("-----After----");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);

	}
}
