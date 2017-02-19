package src.gl5;

public class EnumOrder{
   public static void main(String[] args){
      for(Spisiness s : Spisiness.values()){
         System.out.println(s + ", ordinal " + s.ordinal());
      }
   }
}
