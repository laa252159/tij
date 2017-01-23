package gl7.hw;

public class OverridePrivate extends BaseClass{
//   @Override
     private void dot(){
        System.out.println("from OverridePrivate");
     }
    public static void main(String[] args){
       BaseClass o = new OverridePrivate();
    }
}

class BaseClass{
   private void dot(){
      System.out.println("from base class");
   }

}
