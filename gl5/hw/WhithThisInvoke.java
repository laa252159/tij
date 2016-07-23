package gl5.hw;

public class WhithThisInvoke{

   void actionOne(){
      System.out.println("Invoked actionOne");
   }   
   void actionTwo(){
      actionOne();
      this.actionOne();
   }

   public static void main(String[] args){
      new WhithThisInvoke().actionTwo();
   }
}

