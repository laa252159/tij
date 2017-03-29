package gl10.hw.ex8;

public class Close {
   int a = 3;
   private class Inner {
     private int i = 1 + a;
   }
   int changed(){
      return new Inner().i - 10;
   }

   public static void main(String[] args){
      Close s = new Close();
      System.out.println(s.changed());
   }
}
