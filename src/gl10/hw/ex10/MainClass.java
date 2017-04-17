package gl10.hw.ex10;

public class MainClass {
   private String field;
   private String method(){
      return field;
   }
   Iface second(){
      return new Iface(){
         public String innerMeth(){
	     return "Inner write!";
	 } 
      };
   }

   public static void main(String[] args){
      MainClass m = new MainClass();
      System.out.println(m.second().innerMeth());
   }
}

interface Iface {
   String innerMeth();
}


