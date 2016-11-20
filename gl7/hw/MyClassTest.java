package gl7.hw;

import gl7.hw.pack.MyClass;

class MyClassTest extends MyClass{

      private void rePrint(){
         print();
      }

   public static void main(String[] args){
      MyClassTest mct = new MyClassTest();
      mct.rePrint();
   }
}
