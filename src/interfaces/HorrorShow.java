package interfaces;
// Extending an interface with inheritance.

interface Monster {
  void menace();
  void destroy();
}
/*
interface DangerousMonster extends Monster {
  void destroy();
}*/

interface Lethal {
  void kill();
}
/*
class DragonZilla implements DangerousMonster {
  public void menace() {}
  public void destroy() {}
}	
*/
interface Vampire extends Lethal {
  void drinkBlood();
  void destroy();
  void kill();
  void menace();
}

/*class VeryBadVampire implements Vampire {
  public void menace() {}
  public void destroy() {}
  public void kill() {}
  public void drinkBlood() {}
}*/	

public class HorrorShow {
  static void u(Monster b) { b.menace(); }
  static void v(Vampire d) {
    d.menace();
    d.destroy();
  }
  static void w(Lethal l) { l.kill(); }
  public static void main(String[] args) {
    Monster barney = new Monster(){
 	public void menace(){}
  	public void destroy(){}
    };
    u(barney);
  //  v(barney);
    Vampire vlad = new Vampire(){
	public void menace() {}
  	public void destroy() {}
  	public void kill() {}
  	public void drinkBlood() {}
    };
//    u(vlad);
    v(vlad);
    w(vlad);
  }
} ///:~
