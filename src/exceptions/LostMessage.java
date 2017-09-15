package exceptions;//: exceptions/LostMessage.java
// How an exception can be lost.

class VeryImportantException extends Exception {
  public String toString() {
    return "A very important exception!";
  }
}

class HoHumException extends Exception {
  public String toString() {
    return "A HoHum exception";
  }
}

class ThirdException extends Exception {
  @Override
  public String toString() {
    return "Third exception";
  }
}

public class LostMessage {
  void important() throws VeryImportantException {
    throw new VeryImportantException();
  }
  void dtrivial() throws HoHumException {
    throw new HoHumException();
  }
  void fird() throws ThirdException {
    throw new ThirdException();
  }
  public static void main(String[] args) {
    try {
      LostMessage lm = new LostMessage();
      try {
        lm.important();
      } finally {
        try {
          lm.dtrivial();
        } finally {
          throw new ThirdException();
        }
      }
    } catch(Exception e) {
      System.out.println(e);
    }
  }
} /* Output:
A trivial exception
*///:~
