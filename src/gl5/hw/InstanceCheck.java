package src.gl5.hw;

public class InstanceCheck{
   String str = "first";

   {
      str = "second";
      System.out.println(" String is initialized : " + str);
   }
   public static void main(String[] args){
      InstanceCheck i = new InstanceCheck();
   }
}
