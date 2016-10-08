package gl7.hw.reusing;

class Base{
   Base(String s){
      System.out.println("Base default = " + s);
   }
}

class Task8 extends Base{
   Task8(){
      super("default");
      System.out.println("Default Task8");
   }
   Task8(String s){
      super("with argument");
      System.out.println("Task8 = " + s);
   }
   public static void main(String[] args){
      Task8 t1 = new Task8();
      Task8 t2 = new Task8(":)");
   }
}
