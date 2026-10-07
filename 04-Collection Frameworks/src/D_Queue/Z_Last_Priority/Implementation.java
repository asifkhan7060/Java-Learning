package D_Queue.Z_Last_Priority;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Implementation {

    public static void main(String[] args) {

        /*
         * ==========================================================
         *              Basic Queue Operations
         * ==========================================================
         */

        ConcurrentLinkedQueue<Integer> queue =
                new ConcurrentLinkedQueue<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue : " + queue);


        /*
         * ==========================================================
         *                   peek() / element()
         * ==========================================================
         */

        System.out.println("\npeek()    : " + queue.peek());
        System.out.println("element() : " + queue.element());


        /*
         * ==========================================================
         *                    poll() / remove()
         * ==========================================================
         */

        System.out.println("\npoll()   : " + queue.poll());
        System.out.println("Queue    : " + queue);

        System.out.println("remove() : " + queue.remove());
        System.out.println("Queue    : " + queue);


        /*
         * ==========================================================
         *                    contains()
         * ==========================================================
         */

        System.out.println("\ncontains(30) : " + queue.contains(30));
        System.out.println("contains(50) : " + queue.contains(50));


        /*
         * ==========================================================
         *                    remove(Object)
         * ==========================================================
         */

        queue.add(40);
        queue.add(50);

        System.out.println("\nBefore remove(Object) : " + queue);

        queue.remove(40);

        System.out.println("After remove(40)      : " + queue);


        /*
         * ==========================================================
         *                    Thread-Safe Usage
         * ==========================================================
         */

        ConcurrentLinkedQueue<Integer> concurrentQueue =
                new ConcurrentLinkedQueue<>();

        Thread producer1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                concurrentQueue.offer(i);
            }
        });

        Thread producer2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                concurrentQueue.offer(i);
            }
        });

        producer1.start();
        producer2.start();

        try {
            producer1.join();
            producer2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nAfter multiple threads : " + concurrentQueue);


        /*
         * ==========================================================
         *                    Traversal
         * ==========================================================
         */

        System.out.println("\nTraversal:");

        for (Integer value : concurrentQueue) {
            System.out.println(value);
        }


        /*
         * ==========================================================
         *                    Important Notes
         * ==========================================================
         */

        /*
         * - Thread-safe
         * - Non-blocking
         * - FIFO Queue
         * - Unbounded
         * - Does not allow null
         * - size() may require traversal
         */

        System.out.println("\nConcurrentLinkedQueue Implementation Completed.");
    }
}