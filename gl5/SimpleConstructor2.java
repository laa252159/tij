package gl5;

class Rock{
   Rock(int i){
      System.out.print("Rock " + i + " ");
   }
}

public class SimpleConstructor2{
   public static void main(String[] args){
       for(int i = 0; i < 10; i++){
           new Rock(i);
       }
   }
}