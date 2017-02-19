package src.gl3.hw;

public class BitOp{

   public static void main(String[] args){
      int bin1 = 0x5;
      int bin2 = 0xA;
      System.out.println("bin1 " + Integer.toBinaryString(bin1));
      System.out.println("bin2 " + Integer.toBinaryString(bin2));
      System.out.println("AND " + Integer.toBinaryString(bin1 & bin2));   
      System.out.println("OR " + Integer.toBinaryString(bin1 | bin2));   
      System.out.println("XOR " + Integer.toBinaryString(bin1 ^ bin2));   
      System.out.println("~ bin1 " + Integer.toBinaryString(~bin1));   
      System.out.println("~ bin2 " + Integer.toBinaryString(~bin2));   
   }
}
