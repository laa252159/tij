package gl5.hw;

public class Dog{
   
   static void bark(int i){
      System.out.println("bark int");
   }
   static void bark(long l){
      System.out.println("bark long");
   }
   static void bark(double d){
      System.out.println("bark double");
   }
   static void bark(double d, float f){
      System.out.println("bark double -> float");
   }
   static void bark(float f, double d){
      System.out.println("bark float -> double");
   }
   void bark(){
      System.out.println("A");
   }
   
   public static void main(String[] args){
      bark(1);
      bark(1l);
      bark(1.0);
      bark(6);
      bark(6.9, 6f);
      bark(6f, 5d);

      Dog dog = new Dog();
      dog.bark();
   }
}
