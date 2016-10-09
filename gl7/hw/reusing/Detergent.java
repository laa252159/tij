package gl7.hw.reusing;

public class Detergent{
   
   Cleanser c = new Cleanser();

   public void scrub(){
      c.scrub();
   }
   
   public void delute(){
      c.delute();
   }


   public static void main(String[] args){
      Cleanser x = new Cleanser();
      x.delute();
      x.scrub();
      System.out.println(x);
   }
}

class Cleanser{
   private String s = "Cleanser";
   
   public void append(String a){
      s += a;
   }

   public void delute(){
      append(" dilute()");
   }

   public void apply(){
      append(" apply()");
   }

   public void scrub(){
      append(" scrub()");
   }

   public String toString(){
      return s;
   }
}
