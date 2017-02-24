package gl9.hw.second;

import gl9.hw.first.Gl9Ex5Iface;

public class Gl9Ex5Impl implements Gl9Ex5Iface{
   public void start(String time){
      System.out.println("Time start: " + time);
   }
   public void stop(String time){
      System.out.println("Time stop: " + time);
   }
   public int exit(){
      return 0;
   }
   public static void main(String[] args){
      Gl9Ex5Iface i = new Gl9Ex5Impl();
      i.start("13:00");
      i.stop("13:12");
      System.out.println("Exit code : " + i.exit());
   }
}
