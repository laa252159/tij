package gl11.hw;

import net.mindview.util.Stack;
import java.util.*;

public class Ex15 {
   public static final String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
   public static void main(String[] args){
     char[] chars = str.toCharArray();
     Stack<Character> stack = new Stack<Character>();
     Iterator<Character> iter = new LinkedList(Arrays.asList(chars)).iterator();
     while(iter.hasNext()){
        process(iter, stack);
     }
     StringBuilder sb = new StringBuilder();
     while(!stack.empty()){
        sb.append(stack.pop());
     }
     System.out.println(sb);
   }

   public static void process(Iterator<Character> iter, Stack<Character> stack){
       char c = iter.next();
       switch(c){
          case '+' : stack.push(iter.next()); break; 
	      case '-' : stack.pop(); break;
       }
   }
}
