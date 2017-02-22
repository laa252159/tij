package gl8.hw;

public class G8Ex3{
   public static void main(String[] args){
      Base t = new Test();
      t.print();
   }
}

abstract class Base{
   Base(){
      print();
   }
   abstract void print();
}

class Test extends Base{
   int i = 5;
   void print(){
      System.out.println("Var = " + 5);
   }
}
