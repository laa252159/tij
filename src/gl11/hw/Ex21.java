package gl11.hw;

import java.util.*;
import net.mindview.util.*;

public class Ex21 {
  public static void main(String[] args) {
    List<String> words = new TextFile("holding/SetOperations.java", "\\W+");
    Map<String, Integer> map = new HashMap<String, Integer>();
    for(String word : words){
       Integer freq = map.get(word);
       map.put(word, freq == null ? 1 : freq + 1);
    }
    List<String> wSet = new ArrayList(map.keySet());
    Collections.sort(wSet, String.CASE_INSENSITIVE_ORDER);
    for(String s : wSet)
       System.out.println(s + " - " + map.get(s));
  }
} /* Output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~
