package src.hw;

class Table{
   final int num;

   public Table(int num){
      this.num = num;
   }

}

public class Final{
   final int i;
   final Table table;


   public Final(int i){
      this.i = i;
      this.table = new Table(i);
   }

   public String toString(){
      return "i = " + i + " table.num = " + table.num; 
   }

   public static void main(String[] args){
      Final f = new Final(10);
      System.out.println(f);
   }
}
