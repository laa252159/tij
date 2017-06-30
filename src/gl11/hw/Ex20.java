package gl11.hw;

import java.util.*;
import net.mindview.util.*;

public class Ex20 {
   private static Set<Character> possibleVowels = new TreeSet<Character>(Arrays.asList(new Character[]{'a','e','i','o','y','u'}));
   public static void main(String[] args){
       Set<String> allWords = new TreeSet<String>(new TextFile("holding/UniqueWords.java", "\\W+"));
       System.out.println(allWords);
       List<Integer> vowelsInWord = new LinkedList<Integer>();
       Map<Character, Integer> allVowels = new TreeMap<Character, Integer>();

       for(String str : allWords){
          int wordCounter = 0;
          for(Character ch : str.toCharArray()){
	     if(isVoWel(ch)){
	        wordCounter++;  
		addInAll(allVowels, ch);
	     }
	  }
	  vowelsInWord.add(wordCounter);
       }

       System.out.println("Vowels in words :" + vowelsInWord);
       System.out.println("Amount of all vowels : "  + allVowels);
   }

   private static void addInAll(Map<Character, Integer> map, Character ch){
       Integer i = map.get(ch);
       map.put(ch, i == null ? 1 : ++i);
   }

   private static boolean isVoWel(Character ch){
      return possibleVowels.contains(ch);
   }
}
