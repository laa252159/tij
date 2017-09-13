package gl2.hw;

public class AllTheColorsOfTheRainbow{

   int anIntegerRepresentingColor;

   void changeTheHueOfTheColor(int newHue){
       this.anIntegerRepresentingColor = newHue;
   }
   
  public static void main(String[] args){
     AllTheColorsOfTheRainbow colors = new AllTheColorsOfTheRainbow();
     colors.changeTheHueOfTheColor(777);
     System.out.println(colors.anIntegerRepresentingColor);
  }
  



}
    

    
