package src.gl3;

import static java.lang.System.*;

public class Assignment{
  public static void main(String[] args){
 
    Tank t1 = new Tank();
    Tank t2 = new Tank();

    t1.level = 9;
    t2.level = 47;

    out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    t1 = t2;

    out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    t1.level = 27;

    out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
  }
}

class Tank{

   int level;

}
