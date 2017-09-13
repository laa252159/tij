package hw.reusing;

class A{
   A(int i){
      System.out.println("Builder of A - " + i);
   }
}

class B{
   B(int i){
      System.out.println("Builder of B - " + i);
   }
}

class C extends A{
   C(){
      super(2);
      b = new B(4);
      System.out.println("Builder of C - " + 5);
   }
   B b = new B(3);
   public static void main(String[] args){
      C c = new C();
   }
}
