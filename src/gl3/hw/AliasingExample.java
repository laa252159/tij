package src.gl3.hw;

import static java.lang.System.*;

public class AliasingExample{
  public static void main(String[] args){
 
    Tank t1 = new Tank();
    Tank t2 = new Tank();

    t1.level = 9.9f;
    t2.level = 47.3f;

    out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    t1 = t2;

    out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    t1.level = 27.2f;

    out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
  }
}

class Tank{

   float level;

}
