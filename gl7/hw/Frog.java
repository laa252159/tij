package gl7.hw;

class Amphibian{
   public void swim(){
      System.out.println("Swim swim");
   }
   public void jump(){
      System.out.println("Jump Jump");
   }
}

public class Frog extends Amphibian{
    public static void main(String[] args){
       Frog frog = new Frog();
       frog.jump();
       frog.swim();
    }
}
