package src.gl3.hw;

public class BinShiftLR{
   public static void main(String[] args){
      int num = 123456;
      toBS(num);
      num <<= 1;
      toBS(num);
      for(int i = 0 ; i < 17; i++){
         num >>>= 1;
         toBS(num);
      } 
   }

   static void toBS(int num){
      System.out.println("num :\t" + num + " bit count: \t " + Integer.bitCount(num) +" binary : \t" + Integer.toBinaryString(num));
   }
}
