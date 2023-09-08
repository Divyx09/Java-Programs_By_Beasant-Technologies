package Qeue;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class PriorityQueueIntro {
    public static void main(String[] args) {
        PriorityQueue<Integer> prime = new PriorityQueue<>();
        prime.add(2);
        prime.add(13);
        prime.add(5);
        prime.add(7);
        prime.add(11);

        // System.out.println(prime.peek());
        // // System.out.println(prime.poll());
        // System.out.println(prime.peek());
        System.out.println(prime);
    }
}
