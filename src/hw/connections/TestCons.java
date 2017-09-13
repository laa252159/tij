package hw.connections;

public class TestCons{
   public static void main(String[] args){
      for(int i = 0; i < 13; i++){
          System.out.println(ConnectionManager.getConnection());
      }   
   }
}
