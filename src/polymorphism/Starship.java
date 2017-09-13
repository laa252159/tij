package polymorphism;
// Dynamically changing the behavior of an object
// via composition (the "State" design pattern).
import static net.mindview.util.Print.*;

class AlertStatus {
  public void status() {}
}

class Fire extends AlertStatus {
  public void status() { print("Fire"); }
}

class Meteor extends AlertStatus {
  public void status() { print("Meteor"); }
}

class Stage1 {
  private AlertStatus status = new Fire();
  public void change() { status = new Meteor(); }
  public void act() { status.status(); }
}

public class Starship {
  public static void main(String[] args) {
    Stage1 stage = new Stage1();
    stage.act();
    stage.change();
    stage.act();
  }
} /* Output:
HappyActor
SadActor
*///:~
