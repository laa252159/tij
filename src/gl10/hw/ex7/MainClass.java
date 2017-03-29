package gl10.hw.ex7;

public class MainClass {
   private String field;
   private String method(){
      return field;
   }
   class Inner {
      String innerMeth(){
    	 MainClass.this.field = "test";     
	 return method();
      }
   }
   String second(){
      return new Inner().innerMeth();
   }

   public static void main(String[] args){
      MainClass m = new MainClass();
      System.out.println(m.second());
   }
}
