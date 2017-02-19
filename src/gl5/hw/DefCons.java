package src.gl5.hw;

class Smth{
   Smth(){
      System.out.println("!!!");
   }
   Smth(String str){
      System.out.println("!!!" + str);
   }
}

public class DefCons{
   public static void main(String[] args){
      Smth smth = new Smth(args[0]);
   }

}
