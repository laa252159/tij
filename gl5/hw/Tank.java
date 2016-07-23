package gl5.hw;

public class Tank{

   Tank(boolean f){
      isFull = f;
   }

   boolean isFull = false;

   public void finalize(){
      if(isFull){
         isFull = false;
	 System.out.println(" cleared ");
      } else {
	 System.out.println(" was EMPTY ");
      }
   }

   public static void main(String[] args){
      new Tank(false);
      new Tank(true);
      new Tank(true);
      new Tank(true);
      new Tank(true);
      System.gc();
      while(true){
      }
   }

}
