package gl9.hw;

abstract class GAbstr implements D{

   public void act1(){
      System.out.println("act1Abstr");
   }
}


public class Gl9Ex14 extends GAbstr{
   public void act1(){
      System.out.println("act1");
   }
   public void act2(){
      System.out.println("act2");
   }
   public void act3(){
      System.out.println("act3");
   }
   
   static void a(A a){
      a.act1();
   }

   static void b(B b){
      b.act2();
   }

   static void d(D d){
      d.act3();
   }

   public static void main(String[] args){
      GAbstr x = new Gl9Ex14();
      a(x);
      b(x);
      d(x);
   }
}

interface A {
   void act1();
   void act2();
}

interface B {
   void act1();
   void act2();
}

interface C {
   void act1();
   void act2();
}

interface D extends A,B,C {
   void act3();
}


