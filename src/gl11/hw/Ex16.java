package gl11.hw;

import java.util.*;
import net.mindview.util.*;

public class Ex16 {
   private static Set<Character> possibleVowels = new TreeSet<String>(Arrays.asList(new String[]{"a","e","i","o","y","u"}));
   public static void main(String[] args){
       Set<String> allWords = new TreeSet<String>(new TextFile("holding/UniqueWords.java", "\\W+"));
       System.out.println(allWords);
       List<Integer> vowelsInWord = new LinkedList<Integer>();
       int allVowels = 0;

       for(String str : allWords){
          int wordCounter = 0;
          for(String s : str.toArray()){
	     if(isVoWel(s)){
	        wordCounter++;  
		allVowels++;
	     }
	  }
	  vowelsInWord.add(wordCounter);
       }

       System.out.println("Vowels in words :" + vowelsInWord);
       System.out.println("Amount of all vowels : "  + allVowels);
   }

   private static boolean isVoWel(String l){
      return possibleVowels.contains(l);
   }
}
