package innerclasses;

public class G10ex19 {

   public static void main(String[] args){
     Iface i = new Iface.IClass();
     i.print(i);
   }

}

interface Iface {
   void print(Iface iface);
   
   class IClass implements Iface {
      public void print(Iface iface){
         System.out.println("Iface has been got");
      }
   } 
}


