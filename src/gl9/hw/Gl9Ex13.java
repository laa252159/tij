package gl9.hw;

public class Gl9Ex13 implements C{
  @Override
  public void act1(){
     System.out.println("act1");
  }
  @Override
  public void act2(){
     System.out.println("act2");
  }
  @Override
  public void act3(){
     System.out.println("act3");
  }
  public static void main(String[] args){
    C x = new Gl9Ex13();
    x.act1();
    x.act2();
    x.act3();
  }
}

interface AA {
  void act1();
  void act2();
  void act3();
}

interface B1 extends AA {
  void act1();
  void act3();
}

interface B2 extends AA {
  void act2();
  void act3();
}


interface CC extends B1,B2{
  void act2();
}

