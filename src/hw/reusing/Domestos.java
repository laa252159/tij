package hw.reusing;

public class Domestos extends Detergent{
   public void scrub(){
      append(" Domestos.scrub()");
   }

   private void append(String s) {
   }

   public void sterilize(){
      append(" sterilise()");
   } 

   public static void main(String[] args){
      Domestos d = new Domestos();
      d.scrub();
      d.sterilize();
      System.out.println(d);
   }

}
