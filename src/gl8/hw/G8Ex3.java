package gl8.hw;

public class G8Ex3{
   public static void main(String[] args){
      Base t = new Test();
      t.print();
      Base1 t1 = new Test1();
      t1.print();
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
      System.out.println("Var = " + i);
   }
}
class Base1{
   Base1(){
      print();
   }
   void print(){
      System.out.println("base1");
   };
}

class Test1 extends Base1{
   int i = 5;
   void print(){
      System.out.println("Var = " + i);
   }
}
