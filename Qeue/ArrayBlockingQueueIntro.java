package Qeue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueIntro {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> prime = new ArrayBlockingQueue<Integer>(10);
        prime.add(13);
        prime.add(11);
        prime.add(31);
        prime.add(7);
        prime.add(17);
        System.out.println(prime);
    }
}
