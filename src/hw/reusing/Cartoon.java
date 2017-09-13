package hw.reusing;

class Art{
   Art(){
      System.out.println("Builder of Art");
   }
}

class Drawing extends Art{
   /*Drawing(){
      System.out.println("Builder of Drawing");
   }*/
}

class Cartoon extends Drawing{
   /*Cartoon(){
      System.out.println("Builder of Cartoon");
   }*/
   public static void main(String[] args){
      Cartoon c = new Cartoon();
   }
}
