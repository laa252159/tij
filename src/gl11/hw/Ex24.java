package gl11.hw;

import java.util.Random;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex24 {
	public static void main(String[] args) {
		Random random = new Random();
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		Map<Integer, String> tm = new TreeMap<Integer, String>();

		for(int i = 0; i < 10; i++){
			int k = random.nextInt(9);
			lhm.put(k, getNum(k));
			tm.put(k, getNum(k));
		}
		System.out.println(lhm);
		System.out.println(tm);
	}

	private static String getNum(int val) {
		switch (val) {
		case 0:
			return "ZERO";
		case 1:
			return "ONE";
		case 2:
			return "TWO";
		case 3:
			return "THREE";
		case 4:
			return "FOUR";
		case 5:
			return "FIVE";
		case 6:
			return "SIX";
		case 7:
			return "SEVEN";
		case 8:
			return "EIGHT";
		case 9:
			return "NINE";
		}
		return null;
	}
}
