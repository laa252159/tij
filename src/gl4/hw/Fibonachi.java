package src.gl4.hw;

public class Fibonachi{
   public static void main(String[] args){
       int fiboLength = 11;

       int first = 1;
       int second = 1;
       int current = 1;

       for(int i = 0; i < fiboLength; i++){
	  if(i > 2){
	      first = second;
	      second = current;
	      current = second + first;
	   }
	   System.out.print(current + " ");
       } 
   }
}

