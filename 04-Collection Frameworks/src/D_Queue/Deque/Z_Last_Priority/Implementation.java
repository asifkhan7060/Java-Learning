package D_Queue.Deque.Z_Last_Priority;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Implementation {

    public static void main(String[] args) {

        /*
         * ==========================================================
         *              Basic Deque Operations
         * ==========================================================
         */

        ConcurrentLinkedDeque<Integer> deque =
                new ConcurrentLinkedDeque<>();

        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);

        System.out.println("Deque : " + deque);


        /*
         * ==========================================================
         *              Access from Both Ends
         * ==========================================================
         */

        System.out.println("\npeekFirst() : " + deque.peekFirst());
        System.out.println("peekLast()  : " + deque.peekLast());


        /*
         * ==========================================================
         *              Remove from Both Ends
         * ==========================================================
         */

        System.out.println("\npollFirst() : " + deque.pollFirst());
        System.out.println("Deque       : " + deque);

        System.out.println("pollLast()  : " + deque.pollLast());
        System.out.println("Deque       : " + deque);


        /*
         * ==========================================================
         *                  Queue Behavior
         * ==========================================================
         */

        deque.addLast(40);
        deque.addLast(50);

        System.out.println("\nQueue Behavior:");
        System.out.println(deque);

        System.out.println("pollFirst() : " + deque.pollFirst());
        System.out.println(deque);


        /*
         * ==========================================================
         *                  Stack Behavior
         * ==========================================================
         */

        deque.clear();

        deque.push(10);
        deque.push(20);
        deque.push(30);

        System.out.println("\nStack Behavior:");
        System.out.println(deque);

        System.out.println("pop() : " + deque.pop());
        System.out.println(deque);


        /*
         * ==========================================================
         *                 Occurrence Methods
         * ==========================================================
         */

        deque.addLast(20);
        deque.addLast(40);
        deque.addLast(20);

        System.out.println("\nBefore occurrence removal : " + deque);

        deque.removeFirstOccurrence(20);
        System.out.println("After first occurrence     : " + deque);

        deque.removeLastOccurrence(20);
        System.out.println("After last occurrence      : " + deque);


        /*
         * ==========================================================
         *                    contains()
         * ==========================================================
         */

        System.out.println("\ncontains(40) : " + deque.contains(40));
        System.out.println("contains(90) : " + deque.contains(90));


        /*
         * ==========================================================
         *                  Concurrent Usage
         * ==========================================================
         */

        ConcurrentLinkedDeque<Integer> concurrentDeque =
                new ConcurrentLinkedDeque<>();

        Thread frontThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                concurrentDeque.addFirst(i);
            }
        });

        Thread rearThread = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                concurrentDeque.addLast(i);
            }
        });

        frontThread.start();
        rearThread.start();

        try {
            frontThread.join();
            rearThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nAfter multiple threads : " + concurrentDeque);


        /*
         * ==========================================================
         *                     Traversal
         * ==========================================================
         */

        System.out.println("\nTraversal:");

        for (Integer value : concurrentDeque) {
            System.out.println(value);
        }


        /*
         * ==========================================================
         *                  Important Notes
         * ==========================================================
         */

        /*
         * Thread-safe
         * Non-blocking
         * Unbounded
         * Supports both ends
         * FIFO + LIFO behavior
         * Does not allow null
         */

        System.out.println("\nConcurrentLinkedDeque Implementation Completed.");
    }
}