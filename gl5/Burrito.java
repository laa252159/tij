package gl5;

public class Burrito{
   Spisiness degree;

   public Burrito(Spisiness degree){
      this.degree = degree;
   }

   public void describe(){
      System.out.println("The " + degree + " burrito is");
      switch(degree){
         case NOT: System.out.println("not spicy at all");
	           break;
         case MILD:
	 case MEDIUM: System.out.println("a little hot");
	      break;
         case HOT:
	 case FLAMING:
	 default: System.out.println("may be too hot");
      }
   }

   public static void main(String[] args){
      Burrito 
      	plain = new Burrito(Spisiness.NOT),
      	greenChile = new Burrito(Spisiness.MEDIUM),
      	jalapeno = new Burrito(Spisiness.HOT);
	plain.describe();
	greenChile.describe();
	jalapeno.describe();

   }
}
