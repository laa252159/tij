package gl12.hw;//: exceptions/MainException.java

import java.io.FileInputStream;

public class Ex26 {
  // Pass all exceptions to the console:
  public static void main(String[] args) throws Exception {
    // Open the file:
    FileInputStream file =
      new FileInputStream("src/exceptions/MainException.java_err");
    // Use the file ...
    // Close the file:
    file.close();
  }
} ///:~
