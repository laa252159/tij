package src.gl3.hw;

public class PassObject{
 
 static void f(Letter y){
    y.c = 1f;
 }
 
 public static void main(String[] args){
   Letter x = new Letter();
   x.c = 2f;
   System.out.println("1: x.c " + x.c);
   f(x);
   System.out.println("2: x.c " + x.c);
 }


}

class Letter{
   float c;
}
