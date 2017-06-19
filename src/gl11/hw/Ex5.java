//: holding/ListFeatures.java
package gl11.hw; 

import java.util.*;

public class Ex5 {
  
  public static void print(String str){
     System.out.println(str);
  }

  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Integer> ints = new LinkedList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8}));
    print("1: " + ints);
    Integer h = new Integer(3);
    ints.add(h); // Automatically resizes
    print("2: " + ints);
    print("3: " + ints.contains(h));
    ints.remove(h); // Remove by object
    Integer p = ints.get(2);
    print("4: " +  p + " " + ints.indexOf(p));
    Integer cymric = new Integer(4);
    print("5: " + ints.indexOf(cymric));
    print("6: " + ints.remove(cymric));
    // Must be the exact object:
    print("7: " + ints.remove(p));
    print("8: " + ints);
    ints.add(3, new Integer(5)); // Insert at an index
    print("9: " + ints);
    List<Integer> sub = ints.subList(1, 4);
    print("subList: " + sub);
    print("10: " + ints.containsAll(sub));
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + ints.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + ints.containsAll(sub));
    List<Integer> copy = new ArrayList<Integer>(ints);
    sub = Arrays.asList(ints.get(1), ints.get(4));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    copy = new ArrayList<Integer>(ints); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, new Integer(5)); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + ints.isEmpty());
    ints.clear(); // Remove all elements
    print("19: " + ints);
    print("20: " + ints.isEmpty());
    ints.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8}));
    print("21: " + ints);
    Object[] o = ints.toArray();
    print("22: " + o[3]);
    Integer[] pa = ints.toArray(new Integer[0]);
    print("23: " + pa[3]);
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Integer]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Integer, Pug, Cymric, Pug]
subList: [Manx, Mutt, Integer]
10: true
sorted subList: [Manx, Integer, Mutt]
11: true
shuffled subList: [Integer, Manx, Mutt]
12: true
sub: [Integer, Pug]
13: [Integer, Pug]
14: [Rat, Integer, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Integer, Cymric, Pug]
17: [Rat, Integer, Integer, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
