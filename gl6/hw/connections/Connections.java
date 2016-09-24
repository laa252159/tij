package gl6.hw.connections;

import java.math.*;

public class Connections{
  private boolean available = Math.random() > 0.5;
 
  public boolean isAvailable(){
     return available;
  }

  public String toString(){
     return String.valueOf(available);
  }
}

