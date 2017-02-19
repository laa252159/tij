package src.gl4.hw;

public class NotDivNums{

   public static void main(String[] args){
      int num = 0;
      for(int i = 1; i < 5000 ; i++){
         int counter = 2; 
         for(int j = 1; j <=i; j++){
           if(i % j == 0){
	      counter--;
	   } 	 
	 }
	 if(counter == 0){
	    System.out.println(i);
	    num++;
	 }
      }
      System.out.println(num);
   }
}

