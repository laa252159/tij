package gl10.hw.ex11;

public class Close {
   int a = 3;
   private class Inner {
     public int i = 1 + a;
   }
   int changed(){
      return new Inner(){
         public int getInt(){
	    return 1;
	 }
      }.i - 10;
   }

   public static void main(String[] args){
      Close s = new Close();
      System.out.println(s.changed());
   }
}
