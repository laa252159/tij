package gl5.hw;

public class InitStrs{
   InitStrs(String str2){
      this.str2 = str2;
   }

   String str1 = "str1";
   String str2;
   

   public static void main(String[] args){
      InitStrs i = new InitStrs("str2");
      System.out.println(i.str1 + " " + i.str2); 
   }
}
