package src.gl2.hw;

public class Incrementable{

   static int i = 0;
   

   static void increment(){
     i++;
   }

   public static void main(String[] args){
   
   increment();
   increment();
   increment();
   System.out.println(i);
   
   Incrementable i1 = new Incrementable();
   Incrementable i2 = new Incrementable();

   i1.i = 5;
   increment();

   System.out.println(i2.i);


   }


}

