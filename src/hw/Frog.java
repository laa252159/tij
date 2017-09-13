package hw;

class Amphibian{
   public void swim(){
      System.out.println("Swim swim");
   }
   private void jump(){
      System.out.println("Jump Jump");
   }
   public void act(Amphibian a){
      a.swim();
      a.jump();
   }
}

public class Frog extends Amphibian{
    
    @Override
    public void swim(){
       System.out.println("New swim");
    }

    //@Override
    public void jump(){
       System.out.println("New jump");
    }
    
    public static void main(String[] args){
       Frog frog = new Frog();
      new Amphibian().act(frog);
       
    }
}
