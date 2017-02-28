package gl9.hw;

import java.util.*;
import java.nio.*;

public class Gl9Ex16 implements Readable {
   private final static char[] chars = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
   private static Random rand = new Random();
   public char next(){
      return chars[rand.nextInt(chars.length)]; 
   }
   private int count;
   public Gl9Ex16(int count){
      this.count = count;
   }
   public int read(CharBuffer cb){
      if(count-- ==0){
         return -1;
      }
      int stop = rand.nextInt(10);
      for(int i = 0; i < stop; i++){
         cb.append(next());
      }
      return stop;
   }
   public static void main(String[] args){
      for(int i = 0; i < 5000; i++){
         Scanner s = new Scanner(new Gl9Ex16(10));
         while(s.hasNext()){
            System.out.println(s.next());
         }
      }
   }
}
