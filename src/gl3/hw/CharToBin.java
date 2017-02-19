package src.gl3.hw;

public class CharToBin{
   public static void main(String[] args){
     char ch1 = 'T';
     pr(ch1);
     char ch2 = 'x';
     pr(ch2);
   }
   
   static void pr(char ch){
     System.out.println(" Char : " + ch + " binary format : " + Integer.toBinaryString(ch));
   }

   

}
