package gl11.hw;

import java.util.Queue;
import java.util.LinkedList;


public class Ex27 {
    static Queue<Command> queue = new LinkedList<Command>();

    public static void main(String[] args) {
        queue.offer(new Command("A"));
        queue.offer(new Command("B"));
        queue.offer(new Command("C"));
        queue.offer(new Command("D"));
        queue.offer(new Command("E"));
        queue.offer(new Command("F"));

        while (queue.peek() != null){
            queue.peek().operation();
            queue.remove();
        }
    }
}

class Command {
    public Command(String str){
        this.str = str;
    }
    public String str;

    public void operation(){
        System.out.println(str);
    }

}
