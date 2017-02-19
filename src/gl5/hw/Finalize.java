package src.gl5.hw;

public class Finalize{
   
   public void finalize(){
      System.out.println("finalize event");
   }
   
   public static void main(String[] args){
      new Finalize();
      System.gc();
      while(true){
      }
   }

}
