package hw;

public class ClassLoading{
   static{
      System.out.println("Load ClassLoading");
   }
   static void g(){
      System.out.println("invoke g");
   }

   static void e(){
      System.out.println("invoke e");
   }

   public static void main(String[] args){
       ClassLoading.g();
       ClassLoading.e();
   }
}
