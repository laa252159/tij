package hw.reusing;

class Cleanser2{
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

   public static void main(String[] args){
      Cleanser x = new Cleanser();
      x.delute();
      x.apply();
      x.scrub();
      System.out.println(x);
   }
}
