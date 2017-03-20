package gl9.hw;

import java.util.Random;

interface Dropable {
   void drop();
}

interface DropFabric {
   Dropable getFortune();
}

class CoinDropableFabric implements DropFabric {
   public Dropable getFortune(){
       return new Coin();
   }
}

class CubeDropableFabric implements DropFabric {
   public Dropable getFortune(){
       return new Cube();
   }
}

class Coin implements Dropable {
   Random r = new Random();
   int i = r.nextInt(2);
   String ans = i == 0 ? "orel" : "reshka"; 
   public void drop(){
       System.out.println("Coin was dropped : " +  ans);
   }
}


class Cube implements Dropable {
   Random r = new Random();
   int i = r.nextInt(6);
   public void drop(){
       System.out.println("Cube was dropped : " + ++i);
   }
}

public class DropFortune {
    static void getFortune(DropFabric fabric){
       fabric.getFortune().drop();
    }

    public static void main(String[] args){
        for(int i =0 ; i < 50 ; i++){
	   getFortune(new CoinDropableFabric());
           getFortune(new CubeDropableFabric());
	}
    }
}
