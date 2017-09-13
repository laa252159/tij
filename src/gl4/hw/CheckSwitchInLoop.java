package gl4.hw;

public class CheckSwitchInLoop{

   public static void main(String[] args){
      for(int i = 2; i < 4; i++){
          switch(i){
	     case 0: System.out.println(i); System.out.println("test0");
	        break;
	     case 1: System.out.println(i); System.out.println("test1");
	        //break;
	     case 2: System.out.println(i); System.out.println("test2");
	        //break;
	     default: System.out.println("default"); break;
	  }
 
      
      }


   }

}
