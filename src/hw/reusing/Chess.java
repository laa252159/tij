package hw.reusing;

class Game{
   Game(int i){
      System.out.println("Game = " + i);
   }
}

class BoardGame extends Game{
   BoardGame(int i){
      super(i-1);
      System.out.println("BoardGame =" + i);
   }
}

class Chess extends BoardGame{
   Chess(){
      super(100-1);
      System.out.println("Chess = " + 100);
   }
   public static void main(String[] args){
      Chess c = new Chess();
   }
}
