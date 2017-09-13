package gl4.hw;

public class BinaryOut{
   
   public static void main(String[] args){
      int val = Integer.parseInt(args[0]);
      System.out.println("My code \t" + toBinStr(val));
      System.out.println("Library \t" + Integer.toBinaryString(val));
   }
   static String toBinStr(int val){
      if(val == 1) return "1";
      String fAns = "";
      boolean notEnd = true;
      int tVal = val;
      String ans = "";
      while(notEnd){
           ans += tVal % 2 == 0 ? "0" : "1";
	   tVal /= 2;
	   if(tVal == 0) 
	      notEnd = false;
           }
       
       for (int f = ans.length() - 1 ; f >= 0; f--){
          fAns += ans.charAt(f);
       }
   return fAns;
    
  }
}
