package src.gl3;

public class AutoInc{
   public static void main(String[] args){
      int i = 1;
      System.out.println(" i " + i);
      System.out.println(" ++i " + ++i);
      System.out.println(" i++ " + i++);
      System.out.println(" i " + i);
      System.out.println(" --i " + --i);
      System.out.println(" i-- " + i--);
      System.out.println(" i " + i);
  
      System.out.println("Test");
      
      int t1 = 1;
      int z1 = 1;
      t1 = t1++;
      z1 = z1--;
      int t2 = 1;
      int z2 = 1;
      t2 = ++t2;
      z2 = --z2;

      System.out.println("int t1 = t1++ : t1 = " + t1);
      System.out.println("int z1 = z1-- : z1 = " + z1);
      System.out.println("int t2 = ++t2 : t2 = " + t2);
      System.out.println("int z2 = --z2 : z2 = " + z2);

   }
}

