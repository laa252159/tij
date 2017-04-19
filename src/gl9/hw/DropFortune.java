package gl9.hw;

import java.util.Random;

interface Dropable {
   void drop();
}

interface DropFabric {
   Dropable getFortune();
}

class Coin implements Dropable {
   Random r = new Random();
   int i = r.nextInt(2);
   String ans = i == 0 ? "orel" : "reshka"; 
   public void drop(){
       System.out.println("Coin was dropped : " +  ans);
   }

  static DropFabric f = new DropFabric() {
    public Dropable getFortune(){
        return new Coin();
    }
  };
}


class Cube implements Dropable {
   Random r = new Random();
   int i = r.nextInt(6);
   public void drop(){
       System.out.println("Cube was dropped : " + ++i);
   }
  
 static DropFabric f = new DropFabric() {
   public Dropable getFortune(){
       return new Cube();
   }
 };

}

public class DropFortune {
    static void getFortune(DropFabric fabric){
       fabric.getFortune().drop();
    }

    public static void main(String[] args){
        for(int i =0 ; i < 50 ; i++){
	   getFortune(Coin.f);
           getFortune(Cube.f);
	}
    }
}
