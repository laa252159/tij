package src.hw;

class Homer{
   void does(){
      System.out.println("do void");
   }
   
   String does(String in){
      System.out.println("String = " + in);
      return in;
   }

   int does(int i){
      System.out.println("integer = " + i);
      return i;
   }
}

class Bart extends Homer{
   //@Override
   long does(long l){
      System.out.println("long = " + l);
      return l;
   }
}

public class Simpsons{
   public static void main(String[] args){
      Bart bart = new Bart();
      bart.does();
      bart.does("str");
      bart.does(5);
      bart.does(5l);
   }
}

