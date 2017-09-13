package hw;

class TestSimpleClass{
   private SimpleClass sc;
   
   public SimpleClass getSc(){
      if(sc == null){
         sc = new SimpleClass();
      }
      return sc;
   }

   public static void main(String[] args){
      System.out.println(new TestSimpleClass().getSc());      
   }

   public String toString(){
      return "test";
   }
}
