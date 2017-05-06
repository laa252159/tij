package gl10.hw;

public interface Gl10ex18 {
   void print();

   class InnerGl10ex18 implements Gl10ex18{
      public void print(){
   	System.out.println("Hello Gl10ex18");
      }

      public static void main(String[] args){
         InnerGl10ex18 inner = new InnerGl10ex18();
	 inner.print();
      }
   }
}
