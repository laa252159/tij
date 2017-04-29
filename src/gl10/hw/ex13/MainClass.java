package gl10.hw.ex13;

class Inner {
   private String name;
   private String lastName;
   public Inner(String name, String lastName){
       this.name = name;
       this.lastName = lastName;
   }
   public void print(){
      System.out.println("Name = " + name + " Last Name = " + lastName);
   }

}

public class MainClass {
     Inner getInner(String n, String l){
        return new Inner(n, l){
	};
     }
     public static void main(String[] args){
         MainClass m = new MainClass();
	 m.getInner("San", "L").print();
     }
}
