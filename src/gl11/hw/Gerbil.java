package gl11.hw;

public class Gerbil {
   public Gerbil(int num){
      this.gerbilNumber = num;
   }
   private int gerbilNumber;

   public void hop(){
      System.out.println("Hop id is " + gerbilNumber);
   }

   public static void main(String[] args){
      List<Gerbil> gerbils = new ArrayList<>();
      gerbils.add(new Gerbil(1));
      gerbils.add(new Gerbil(2));
      gerbils.add(new Gerbil(3));
      gerbils.add(new Gerbil(4));
      gerbils.add(new Gerbil(5));
      
      for(int i = 0 ; i < 5; i++){
         gerbils.get(i).hop();
      }
   }

}
