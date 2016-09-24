package gl6.hw.connections;

class ConnectionManager{
   
   private static int counter;
   private final static Connections[] cons = new Connections[10];
   static {
     for(int i = 0; i < 10; i++){
        cons[i] = new Connections();
     }
   }   
   public static Connections getConnection(){
      counter++;
      if(counter > 9){
         return null;
      } else {
         return cons[counter - 1];
      }
   } 
}
