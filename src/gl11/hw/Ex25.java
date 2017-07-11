package gl11.hw;

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex25 {

	static Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

	public static void main(String[] args) {
		List<String> words = new TextFile("src/holding/SetOperations.java", "\\W+");
		int counter = 0;
		for (String word : words) {
			List<Integer> freq = map.get(word);
			if (freq == null) {
				map.put(word, new ArrayList<Integer>(counter));
			} else {
				List<Integer> list = map.get(word);
				list.add(counter);
			}
			counter++;
		}
		List<String> wSet = new ArrayList(map.keySet());
		Collections.sort(wSet, String.CASE_INSENSITIVE_ORDER);
		for (String s : wSet)
			System.out.println(s + " - " + map.get(s));
	}
} 
