package src.gl5;

public class Leaf{
   int i = 0;
   Leaf increment(){
      i++;
      return this;
   }
   void print(){
      System.out.println(" i = " + i);
   }

   public static void main(String[] args){
      Leaf leaf = new Leaf();
      leaf.increment().increment().increment().increment().increment().print();
   }

}
