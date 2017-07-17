package gl11.hw;

import java.util.PriorityQueue;
import java.util.Random;

public class Ex28 {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        Random random = new Random();
        for(int i = 0; i < 20; i++){
            queue.offer(random.nextDouble());
        }
        while(queue.peek() != null)
            System.out.println(queue.remove());
    }
}
