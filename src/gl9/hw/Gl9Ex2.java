package gl9.hw;
//sss
public class Gl9Ex2{
   public static void main(String[] args){
      System.out.println(Numbers.ONE);
      // Numbers.THREE = 4; Final!!! Doesn't compile 
   }  
}

interface Numbers{
   int ONE = 1, TWO = 2, THREE = 3;
}
