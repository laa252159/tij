package gl5.hw;

public class VarargsStrs{
   static void f(String... args){
      for(String str : args){
         System.out.print(str + " ");
      }
      System.out.println();
   }
   public static void main(String[] args){
      f("ss", "ww", "ee");
      f(new String[]{"111", "222", "333"});
   }
}
