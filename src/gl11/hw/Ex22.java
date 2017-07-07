package gl11.hw;

import java.util.*;

import net.mindview.util.*;

public class Ex22 {

	private static void updateCounter(Iterator<Entity> wIter, Entity entity) {
		while (wIter.hasNext()) {
			Entity e = wIter.next();
			if (e.equals(entity))
				e.upodateFreq();
		}
	}

	public static void main(String[] args) {
		List<String> words = new TextFile("src/holding/SetOperations.java", "\\W+");
		Set<Entity> wSet = new TreeSet<Entity>();

		for (String w : words) {
			Entity e = new Entity(w);
			if (wSet.contains(e)) {
				updateCounter(wSet.iterator(), e);
			} else {
				wSet.add(e);
			}
		}

		List<Entity> lEnts = new ArrayList<Entity>(wSet);
//		Collections.sort(lEnts, Entity.COMPARATOR);
		for (Entity e : lEnts)
			System.out.println(e.word + " - " + e.counter);
	}
}

class Entity implements Comparable<Entity> {
	public int counter = 1;
	public String word;

	public Entity(String word) {
		this.word = word;
	}

	public static Comparator<Entity> COMPARATOR = new Comparator<Entity>() {
		@Override public int compare(Entity o1, Entity o2) {
			return o1.word.compareToIgnoreCase(o2.word);
		}
	};

	@Override public int hashCode() {
		return word.hashCode();
	}

	@Override public boolean equals(Object obj) {
		return obj instanceof Entity && word.equals(((Entity) obj).word);
	}

	public void upodateFreq() {
		counter = counter + 1;
	}

	@Override public int compareTo(Entity o) {
		return word.compareToIgnoreCase(o.word);
	}
}

