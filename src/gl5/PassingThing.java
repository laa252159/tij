package src.gl5;

class Person{
   public void eat(Apple apple){
      Apple peeled = apple.getPeeled();
      System.out.println("Yummy");
   }
}

class Peeler{
    static Apple peel(Apple apple){
       //apple was peeled
       return apple;
    }
}

class Apple{
   Apple getPeeled(){
      return Peeler.peel(this);
   }
}

public class PassingThing{
   public static void main(String[] args){
      new Person().eat(new Apple().getPeeled());      
   }
}
