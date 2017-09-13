package gl3.hw;

import java.util.*;

public class Coin{
   public static void main(String[] args) throws InterruptedException {
     Random rand = new Random();
      for(int i = 0; i < 100; i++){
         Thread.sleep(100);
	 int val = rand.nextInt(100);
         System.out.println(val > 50 ? "eagle" : "num");
      }
   }
}
