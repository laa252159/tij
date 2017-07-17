package gl11.hw;

import java.util.PriorityQueue;

public class Ex29 {
    public static void main(String[] args) {
        PriorityQueue<MyObject> queue = new PriorityQueue<MyObject>();
        for (int i = 0; i < 5; i++){
            queue.offer(new MyObject());
        }
    }

}

class MyObject {

}
