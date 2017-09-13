package hw.reusing;

class Component1{
   Component1(int i){
      System.out.println("Component1 " + i);
   }
}

class Component2{
   Component2(int i){
      System.out.println("Component2 " + i);
   }
}

class Component3{
   Component3(int i){
      System.out.println("Component3 " + i);
   }
}


class Root{
   Component1 c1 = new Component1(1);
   Component2 c2 = new Component2(1);
   Component3 c3 = new Component3(1);

   Root(int i){
      System.out.println("Root " + i);
   }
   public String toString(){
      return "Root";
   }
}

class Stem extends Root{
   Component1 c1 = new Component1(11);
   Component2 c2 = new Component2(11);
   Component3 c3 = new Component3(11);

   Stem(int i){
      super(i-10);
      System.out.println("Stem " + i);
   }

   public static void main(String[] args){
      Stem s = new Stem(11);
   }
}
