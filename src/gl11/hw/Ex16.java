package gl11.hw;

import java.util.*;
import net.mindview.util.*;

public class Ex16 {
   private static Set<Character> possibleVowels = new TreeSet<Character>(Arrays.asList(new Character[]{'a','e','i','o','y','u'}));
   public static void main(String[] args){
       Set<String> allWords = new TreeSet<String>(new TextFile("holding/UniqueWords.java", "\\W+"));
       System.out.println(allWords);
       List<Integer> vowelsInWord = new LinkedList<Integer>();
       int allVowels = 0;

       for(String str : allWords){
          int wordCounter = 0;
          for(Character ch : str.toCharArray()){
	     if(isVoWel(ch)){
	        wordCounter++;  
		allVowels++;
	     }
	  }
	  vowelsInWord.add(wordCounter);
       }

       System.out.println("Vowels in words :" + vowelsInWord);
       System.out.println("Amount of all vowels : "  + allVowels);
   }

   private static boolean isVoWel(Character ch){
      return possibleVowels.contains(ch);
   }
}
