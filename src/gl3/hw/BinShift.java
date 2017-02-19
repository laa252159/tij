package src.gl3.hw;

public class BinShift{
   public static void main(String[] args){
      int num = 123456;
      toBS(num);
      for(int i = 0 ; i < 16; i++){
         num >>= 1;
         toBS(num);
      } 
   }

   static void toBS(int num){
      System.out.println("num :\t" + num + " binary : \t" + Integer.toBinaryString(num));
   }
}
