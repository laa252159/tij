package gl5;

public class OptionalTrailingArguments{
   static void f(int required, String... trailing){
      System.out.print("Mandatory: " + required);
      for(String str: trailing){
         System.out.print(str + " ");
      }
      System.out.println();
      System.out.println(trailing);
      System.out.println(trailing.length);

   }

   public static void main(String[] args){
      f(1, "one");
      f(2, "one", "two");
      f(3);
      System.out.println(args.length);

   }
}
