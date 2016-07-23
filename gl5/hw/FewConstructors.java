package gl5.hw;

public class FewConstructors{
   int a = 0;
   String s = "empty";
   FewConstructors(String str){
      this.a = 1;
      this.s = str;
   }
   
   FewConstructors(){
      this("New string");
   }

   public static void main(String[] args){
      FewConstructors fc = new FewConstructors();
      System.out.println(" a = " + fc.a + " s = " + fc.s);
   }

}
