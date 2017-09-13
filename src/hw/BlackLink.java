package hw;

public class BlackLink{
   final String str;

   public BlackLink(){
      str = null;
   }

   public BlackLink(String str){
      this.str = str;
   }

   public static void main(String[] args){
      BlackLink bl = new BlackLink();
      BlackLink bl2 = new BlackLink("S");
      System.out.println("That's all");
   }

}
