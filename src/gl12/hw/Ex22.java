package gl12.hw;


class Except1 extends Exception {

}

class FirstClass {
    public FirstClass () throws Except1{
//        throw new Except1();
    }
}

class SecondClass extends FirstClass {
    public SecondClass () throws Except1{
//        try {
//            super();
//        } catch (Exception except1){
//
//        }
    }
}


public class Ex22 {
    public static void main(String[] args) {

    }

}
