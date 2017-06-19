//: holding/ListFeatures.java
package gl11.hw; 

import java.util.*;

public class Ex6 {
  
  public static void print(String str){
     System.out.println(str);
  }

  public static void main(String[] args) {
    Random rand = new Random(47);
    List<String> strs = new LinkedList<String>(Arrays.asList(new String[]{"a","b","c","d","e","f","g"}));
    print("1: " + strs);
    String h = new String("c");
    strs.add(h); // Automatically resizes
    print("2: " + strs);
    print("3: " + strs.contains(h));
    strs.remove(h); // Remove by object
    String p = strs.get(2);
    print("4: " +  p + " " + strs.indexOf(p));
    String cymric = new String("d");
    print("5: " + strs.indexOf(cymric));
    print("6: " + strs.remove(cymric));
    // Must be the exact object:
    print("7: " + strs.remove(p));
    print("8: " + strs);
    strs.add(3, new String("e")); // Insert at an index
    print("9: " + strs);
    List<String> sub = strs.subList(1, 4);
    print("subList: " + sub);
    print("10: " + strs.containsAll(sub));
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + strs.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + strs.containsAll(sub));
    List<String> copy = new ArrayList<String>(strs);
    sub = Arrays.asList(strs.get(1), strs.get(4));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    copy = new ArrayList<String>(strs); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, new String("e")); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + strs.isEmpty());
    strs.clear(); // Remove all elements
    print("19: " + strs);
    print("20: " + strs.isEmpty());
    strs.addAll(Arrays.asList(new String[]{"a","b","c","d","e","f","g"}));
    print("21: " + strs);
    Object[] o = strs.toArray();
    print("22: " + o[3]);
    String[] pa = strs.toArray(new String[0]);
    print("23: " + pa[3]);
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, String]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, String, Pug, Cymric, Pug]
subList: [Manx, Mutt, String]
10: true
sorted subList: [Manx, String, Mutt]
11: true
shuffled subList: [String, Manx, Mutt]
12: true
sub: [String, Pug]
13: [String, Pug]
14: [Rat, String, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, String, Cymric, Pug]
17: [Rat, String, String, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
