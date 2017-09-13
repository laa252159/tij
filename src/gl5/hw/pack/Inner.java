package gl5.hw.pack;

public class Inner{
   protected static void testProtected(){
      System.out.println("protected test");
   }
   private static void testPrivate(){
      System.out.println("private test");
   }
   public static void testPublic(){
      System.out.println("public test");
   }
   static void testPackage(){
      System.out.println("package test");
   }
}
