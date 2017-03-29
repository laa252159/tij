package gl10.hw.ex6.child;

import gl10.hw.ex6.parent.Book;

public class ChildBook extends Book {
   
   public static void main(String[] args){
      ChildBook c = new ChildBook();
      System.out.println(c.readBook().read());
   }
}
