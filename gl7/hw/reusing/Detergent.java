package gl7.hw.reusing;

public class Detergent extends Cleanser{
   
   public void scrub(){
      append(" Detergent.scrub()");
      super.scrub();
   }
   
   public void foam(){
      append(" foam()");
   }
}
