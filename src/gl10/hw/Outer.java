package gl10.hw;

public class Outer {
   public class Inner {
      public String toString(){
         return "!!Inner!!";
      }
   }

   public Inner generate(){
      return new Inner();
   }

   public static void main(String[] args){
      Outer ou = new Outer();
      Outer.Inner i = ou.generate();
      System.out.println(i);
   }
}
