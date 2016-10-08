package gl7.hw.reusing;

class A{
   A(){
      System.out.println("Builder of A");
   }
}

class B{
   B(){
      System.out.println("Builder of B");
   }
}

class C extends A{
   C(){
      b = new B();
      System.out.println("Builder of C");
   }
   B b = new B();
   public static void main(String[] args){
      C c = new C();
   }
}
