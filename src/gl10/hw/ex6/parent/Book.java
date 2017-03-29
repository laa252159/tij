package gl10.hw.ex6.parent;

import gl10.hw.ex6.iface.Readable;

public class Book {
   private class Page implements Readable {
      @Override
      public String read(){
         return "It has been read!";
      }
   }

   protected Readable readBook(){
      return new Page();
   }
}
