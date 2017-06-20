package gl11.hw;
// Holds a Ex9 of Objects.

import java.util.*;

public class Ex9 implements Iterable {
	private List<Object> items;

	private String strSeq;

	public Ex9(int size) {
		items = new ArrayList<Object>(size);
		strSeq = "SsssSsss";
	}

	public void add(Object x) {
		items.add(x);
	}

	@Override public Iterator iterator() {
		return new Ex9Selector();
	}

	private class Ex9Selector implements Iterator {
		private int i = 0;

		public boolean hasNext() {
			return i < items.size() - 1;
		}

		public Object next() {
			i += 1;
			return items.get(i);
		}

		@Override public void remove() {
			items.remove(i);
		}
	}

	public static void main(String[] args) {
		Ex9 Ex9 = new Ex9(10);
		for (int i = 0; i < 10; i++)
			Ex9.add(Integer.toString(i));
		Iterator iterator = Ex9.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " R");
		}
		System.out.println("--------");
	}
}


