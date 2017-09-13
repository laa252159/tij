package gl2.hw;

public class AutoPack{

 static Integer i = 1;

 static Boolean b = false;

 static Double d = 3.333;


 public static void main(String[] args){
 
    System.out.println("" + i + b + d);
    if(args.length != 0 && args.length > 2){
       System.out.println(args[0]);
       System.out.println(args[1]);
       System.out.println(args[2]);
    }
 
 
 }


}
