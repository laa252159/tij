package gl11.hw;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Ex23 {
  public static void main(String[] args) {
    Random rand = new Random(47);
    Map<Integer,Container> m =
      new HashMap<Integer,Container>();
    for(int i = 0; i < 10000000; i++) {
      // Produce a number between 0 and 20:
      int r = rand.nextInt(20);
		Integer freq = null;
		if(m.get(r) != null){
			freq = m.get(r).value;
		}
      m.put(r, freq == null ? new Container(i, 1) : new Container(i, freq + 1));
    }
	  List<Container> values = new ArrayList<Container>(m.values());
	  Collections.sort(values);
	  for(Container c : values){
		  System.out.println(c);
	  }
  }
} 

class Container implements Comparable<Container> {

	public Container(Integer key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public Integer key;
	public Integer value;

	@Override 
	public int compareTo(Container o) {
		return o.value < value ? -1 : ( o.value == value ? 0 : 1);
	}

	@Override
	public String toString() {
		return "Value = " + key + " , Occurrences = " + value + "\n";
	}
}

