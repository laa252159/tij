package gl4;

public class ListCharacters{

   static int counter = 0;

   public static void main(String[] args){
      for(char c = 0; c < 128; c++)
         if(Character.isLowerCase(c)){
            System.out.println("value: " + (int)c + "char: " + c);
	    counter++;
	 }
      System.out.println("Size of alphabet: " + counter);
   } 
   
}
