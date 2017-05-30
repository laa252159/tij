package innerclasses;
import innerclasses.controller.*;

public class GreenhouseControlsExtension extends GreenhouseControls {
  private boolean moist = false;	
  public class MoistOn extends Event {
    public MoistOn(long delayTime) {
      super(delayTime);
    }
    public void action() {
      // Put hardware control code here.
      moist = true;
    }
    public String toString() {
      return "Moistrure enabling";
    }
  }	
  public class MoistOff extends Event {
    public MoistOff(long delayTime) {
      super(delayTime);
    }
    public void action() {
      // Put hardware control code here.
      moist = false;
    }
    public String toString() {
      return "Moisture disabling";
    }
  }
} ///:~
