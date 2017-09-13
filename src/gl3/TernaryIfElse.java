package gl3;

public class TernaryIfElse{
   public static void main(String[] args){
      System.out.println(ternFunc(9));
      System.out.println(ternFunc(10));
      System.out.println(ifFunc(9));
      System.out.println(ifFunc(10));
   }
   
   static int ternFunc(int i){
       return i < 100 ? i * 100 : i * 10;
   }

   static int ifFunc(int i){
       if(i < 100){
          return i * 100;       
       } else {
          return i * 10;
       }
   }
   


}
