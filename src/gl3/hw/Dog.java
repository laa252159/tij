package src.gl3.hw;

public class Dog{
   
   public Dog(String name, String says){
      this.name = name;
      this.says = says;
   }
   
   String name;
   String says;

   public static void main(String[] args){
      Dog dog1 = new Dog("Spot", "Gav_Scru");
      Dog dog2 = new Dog("Scruffy", "Gav_Spot");

      System.out.println(dog1);
      System.out.println(dog2);

      Dog dog3 = dog1;

      System.out.println("dog1.equals(dog3)" + dog1.equals(dog3));
      System.out.println("dog1 == dog3" + (dog1 == dog3));

   }

   public String toString(){
      return "Dog name : " + this.name + "Dog says : " + this.says;
   }
 

}

