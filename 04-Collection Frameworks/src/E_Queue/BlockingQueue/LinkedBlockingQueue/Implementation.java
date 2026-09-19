package E_Queue.BlockingQueue.LinkedBlockingQueue;

import java.util.*;
import java.util.concurrent.*;

// In Which areas LinkedBlockingQueue class is used ?
// Hold Ctrl and move cursor to LinkedBlockingQueue keyword -> Go to that file.
// Hold Ctrl again on LinkedBlockingQueue -> Click -> Change search to
// "All Places" to explore where LinkedBlockingQueue is used.

public class Implementation {

    public static void main(String[] args) throws InterruptedException {

        /*
         * ==========================================================
         *        Methods Inherited from Collection
         * ==========================================================
         */

        // Already implemented in Collection topic

        // add(E e)
        // addAll(Collection<? extends E> c)
        //
        // remove(Object o)
        // removeAll(Collection<?> c)
        // retainAll(Collection<?> c)
        //
        // contains(Object o)
        // containsAll(Collection<?> c)
        //
        // size()
        // isEmpty()
        // clear()
        //
        // toArray()
        // toArray(T[] a)
        //
        // stream()
        // parallelStream()
        //
        // equals(Object o)
        // hashCode()


        /*
         * ==========================================================
         *          Methods Inherited from Queue
         * ==========================================================
         */

        // Already implemented in Queue topic

        // add(E e)
        // offer(E e)
        //
        // remove()
        // poll()
        //
        // element()
        // peek()


        /*
         * ==========================================================
         *      Methods Inherited from BlockingQueue
         * ==========================================================
         */

        // Already implemented in BlockingQueue topic

        // put(E e)
        // take()
        //
        // offer(E e, long timeout, TimeUnit unit)
        // poll(long timeout, TimeUnit unit)
        //
        // remainingCapacity()
        //
        // drainTo(Collection)
        // drainTo(Collection, int)


        /*
         * LinkedBlockingQueue introduces NO NEW PUBLIC METHODS.
         *
         * It is the concrete implementation of
         * BlockingQueue.
         *
         * Internally it uses:
         *
         * Linked Nodes (Linked List)
         *
         * Features:
         *
         * ✔ Thread Safe
         * ✔ FIFO Ordering
         * ✔ Blocking Operations
         * ✔ Optional Bounded Capacity
         * ✔ Unbounded Constructor Available
         * ✔ Duplicate Elements Allowed
         * ✔ Null Values NOT Allowed
         */


        /*
         * ==========================================================
         *      Basic LinkedBlockingQueue Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        LinkedBlockingQueue rawQueue =
                new LinkedBlockingQueue();

        rawQueue.add("Java");
        rawQueue.add(100);
        rawQueue.add(true);

        System.out.println("Raw LinkedBlockingQueue");

        System.out.println(rawQueue);

        /*
         * Raw Type
         *
         * Stores everything as Object.
         *
         * Type Safety is NOT available.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        LinkedBlockingQueue<String> languages =
                new LinkedBlockingQueue<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Spring");
        languages.add("Java");

        System.out.println("LinkedBlockingQueue with Generics");

        System.out.println(languages);

        /*
         * Note
         *
         * Duplicate values are allowed.
         *
         * FIFO order is maintained.
         *
         * Null values are NOT allowed.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Queue Reference
        // ---------------------------------------------------------

        Queue<Integer> queue =
                new LinkedBlockingQueue<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue Reference");

        System.out.println(queue);

        System.out.println();


        // ---------------------------------------------------------
        // BlockingQueue Reference
        // ---------------------------------------------------------

        BlockingQueue<Integer> blockingQueue =
                new LinkedBlockingQueue<>();

        blockingQueue.put(100);

        blockingQueue.put(200);

        blockingQueue.put(300);

        System.out.println("BlockingQueue Reference");

        System.out.println(blockingQueue);

        System.out.println();


        /*
         * ==========================================================
         *                 Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // LinkedBlockingQueue()
        // ---------------------------------------------------------

        LinkedBlockingQueue<Integer> numbers =
                new LinkedBlockingQueue<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("LinkedBlockingQueue()");

        System.out.println(numbers);

        System.out.println();


        // ---------------------------------------------------------
        // LinkedBlockingQueue(int capacity)
        // ---------------------------------------------------------

        LinkedBlockingQueue<Integer> bounded =
                new LinkedBlockingQueue<>(5);

        bounded.add(100);
        bounded.add(200);
        bounded.add(300);

        System.out.println("LinkedBlockingQueue(capacity)");

        System.out.println(bounded);

        System.out.println(
                "Remaining Capacity : "
                        + bounded.remainingCapacity());

        System.out.println();


        // ---------------------------------------------------------
        // LinkedBlockingQueue(Collection)
        // ---------------------------------------------------------

        List<Integer> list =
                Arrays.asList(1, 2, 3, 4, 5);

        LinkedBlockingQueue<Integer> copy =
                new LinkedBlockingQueue<>(list);

        System.out.println("LinkedBlockingQueue(Collection)");

        System.out.println(copy);

        System.out.println();


        /*
         * ==========================================================
         *      Bounded vs Unbounded Demonstration
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> unbounded =
                new LinkedBlockingQueue<>();

        LinkedBlockingQueue<Integer> boundedQueue =
                new LinkedBlockingQueue<>(3);

        unbounded.add(10);
        unbounded.add(20);
        unbounded.add(30);
        unbounded.add(40);

        boundedQueue.add(10);
        boundedQueue.add(20);
        boundedQueue.add(30);

        System.out.println("Unbounded Queue");

        System.out.println(unbounded);

        System.out.println();

        System.out.println("Bounded Queue");

        System.out.println(boundedQueue);

        System.out.println(
                "Remaining Capacity : "
                        + boundedQueue.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *        Duplicate & Null Demonstration
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> duplicate =
                new LinkedBlockingQueue<>();

        duplicate.add(10);
        duplicate.add(20);
        duplicate.add(10);
        duplicate.add(30);

        System.out.println("Duplicate Demonstration");

        System.out.println(duplicate);

        System.out.println();

//      duplicate.add(null);
//
//      Throws:
//
//      java.lang.NullPointerException

        System.out.println("Null values are NOT allowed.");

        System.out.println();

        /*
         * ==========================================================
         *                  put()
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> queue1 =
                new LinkedBlockingQueue<>();

        queue1.put(10);
        queue1.put(20);
        queue1.put(30);

        System.out.println("put()");

        System.out.println(queue1);

        System.out.println();


        /*
         * ==========================================================
         *                  take()
         * ==========================================================
         */

        System.out.println("take()");

        System.out.println(queue1.take());

        System.out.println(queue1);

        System.out.println();


        /*
         * ==========================================================
         *              offer(timeout)
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> queue2 =
                new LinkedBlockingQueue<>(3);

        queue2.offer(10);
        queue2.offer(20);

        boolean inserted =
                queue2.offer(
                        30,
                        2,
                        TimeUnit.SECONDS);

        System.out.println("offer(timeout)");

        System.out.println(
                "Inserted : "
                        + inserted);

        System.out.println(queue2);

        System.out.println();


        /*
         * ==========================================================
         *              poll(timeout)
         * ==========================================================
         */

        System.out.println("poll(timeout)");

        System.out.println(
                queue2.poll(
                        2,
                        TimeUnit.SECONDS));

        System.out.println(queue2);

        System.out.println();


        /*
         * ==========================================================
         *          remainingCapacity()
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> queue3 =
                new LinkedBlockingQueue<>(5);

        queue3.add(10);
        queue3.add(20);

        System.out.println("remainingCapacity()");

        System.out.println(
                queue3.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *                 drainTo()
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> queue4 =
                new LinkedBlockingQueue<>();

        queue4.add(10);
        queue4.add(20);
        queue4.add(30);
        queue4.add(40);

        List<Integer> list1 =
                new ArrayList<>();

        queue4.drainTo(list1);

        System.out.println("drainTo()");

        System.out.println(
                "Queue : " + queue4);

        System.out.println(
                "List : " + list1);

        System.out.println();


        /*
         * ==========================================================
         *        drainTo(Collection, maxElements)
         * ==========================================================
         */

        queue4.add(100);
        queue4.add(200);
        queue4.add(300);
        queue4.add(400);

        List<Integer> list2 =
                new ArrayList<>();

        queue4.drainTo(list2, 2);

        System.out.println("drainTo(maxElements)");

        System.out.println(
                "Queue : " + queue4);

        System.out.println(
                "List : " + list2);

        System.out.println();


        /*
         * ==========================================================
         *             Enhanced For Loop
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> traversal =
                new LinkedBlockingQueue<>();

        traversal.add(10);
        traversal.add(20);
        traversal.add(30);
        traversal.add(40);

        System.out.println("Enhanced For Loop");

        for (Integer value : traversal) {

            System.out.print(value + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *                  Iterator
         * ==========================================================
         */

        System.out.println("Iterator");

        Iterator<Integer> iterator =
                traversal.iterator();

        while (iterator.hasNext()) {

            System.out.print(
                    iterator.next() + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *                 Spliterator
         * ==========================================================
         */

        System.out.println("Spliterator");

        Spliterator<Integer> spliterator =
                traversal.spliterator();

        spliterator.forEachRemaining(
                value ->
                        System.out.print(value + " ")
        );

        System.out.println("\n");


        /*
         * ==========================================================
         *                  Stream API
         * ==========================================================
         */

        System.out.println("Stream");

        traversal.stream()
                .forEach(value ->
                        System.out.print(value + " "));

        System.out.println("\n");


        /*
         * ==========================================================
         *              FIFO Demonstration
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> fifo =
                new LinkedBlockingQueue<>();

        fifo.offer(10);
        fifo.offer(20);
        fifo.offer(30);
        fifo.offer(40);

        System.out.println("FIFO Demonstration");

        while (!fifo.isEmpty()) {

            System.out.print(
                    fifo.poll() + " ");

        }

        System.out.println("\n");

        /*
         * ==========================================================
         *          Producer Consumer Demonstration
         * ==========================================================
         */

        LinkedBlockingQueue<String> sharedQueue =
                new LinkedBlockingQueue<>(3);

        Thread producer = new Thread(() -> {

            try {

                sharedQueue.put("Java");
                System.out.println("Produced : Java");

                sharedQueue.put("Spring");
                System.out.println("Produced : Spring");

                sharedQueue.put("Hibernate");
                System.out.println("Produced : Hibernate");

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        Thread consumer = new Thread(() -> {

            try {

                Thread.sleep(1000);

                while (!sharedQueue.isEmpty()) {

                    System.out.println(
                            "Consumed : "
                                    + sharedQueue.take());

                }

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        producer.start();

        consumer.start();

        producer.join();

        consumer.join();

        System.out.println();


        /*
         * ==========================================================
         *          Blocking Demonstration
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> blocking =
                new LinkedBlockingQueue<>(2);

        blocking.put(10);
        blocking.put(20);

        Thread remover = new Thread(() -> {

            try {

                Thread.sleep(2000);

                System.out.println(
                        "Removed : "
                                + blocking.take());

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        remover.start();

        System.out.println("Waiting to insert...");

        blocking.put(30);

        System.out.println("Successfully Inserted");

        remover.join();

        System.out.println(blocking);

        System.out.println();


        /*
         * ==========================================================
         *        Unbounded Queue Demonstration
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> unboundedDemo =
                new LinkedBlockingQueue<>();

        for (int i = 1; i <= 10; i++) {

            unboundedDemo.offer(i);

        }

        System.out.println("Unbounded Queue");

        System.out.println(unboundedDemo);

        System.out.println(
                "Remaining Capacity : "
                        + unboundedDemo.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *          Bounded Queue Demonstration
         * ==========================================================
         */

        LinkedBlockingQueue<Integer> boundedDemo =
                new LinkedBlockingQueue<>(5);

        boundedDemo.offer(10);
        boundedDemo.offer(20);
        boundedDemo.offer(30);

        System.out.println("Bounded Queue");

        System.out.println(boundedDemo);

        System.out.println(
                "Remaining Capacity : "
                        + boundedDemo.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *            Ticket Counter Example
         * ==========================================================
         */

        LinkedBlockingQueue<String> ticketQueue =
                new LinkedBlockingQueue<>();

        ticketQueue.offer("Customer-1");
        ticketQueue.offer("Customer-2");
        ticketQueue.offer("Customer-3");

        System.out.println("Ticket Counter");

        while (!ticketQueue.isEmpty()) {

            System.out.println(
                    "Serving : "
                            + ticketQueue.poll());

        }

        System.out.println();


        /*
         * ==========================================================
         *              Performance Notes
         * ==========================================================
         */

        System.out.println("Performance");

        System.out.println(
                "Internal Structure : Linked Nodes");

        System.out.println(
                "Insertion : O(1)");

        System.out.println(
                "Deletion : O(1)");

        System.out.println(
                "Peek : O(1)");

        System.out.println(
                "FIFO Ordering");

        System.out.println(
                "Blocking Operations Supported");

        System.out.println(
                "Optional Capacity");

        System.out.println();


        /*
         * ==========================================================
         *               Best Practices
         * ==========================================================
         */

        System.out.println("Best Practices");

        System.out.println(
                "✔ Use for Producer-Consumer systems.");

        System.out.println(
                "✔ Use put()/take() for blocking behaviour.");

        System.out.println(
                "✔ Use unbounded queue only when memory is sufficient.");

        System.out.println(
                "✔ Use bounded constructor to control memory usage.");

        System.out.println(
                "✔ Never insert null values.");

        System.out.println();


        /*
         * ==========================================================
         *                    Summary
         * ==========================================================
         */

        System.out.println("===== Summary =====");

        System.out.println(
                "Implementation : "
                        + numbers.getClass().getSimpleName());

        System.out.println(
                "Internal Structure : Linked Nodes");

        System.out.println(
                "Thread Safe : Yes");

        System.out.println(
                "FIFO Ordering : Yes");

        System.out.println(
                "Blocking Operations : Supported");

        System.out.println(
                "Bounded Queue : Optional");

        System.out.println(
                "Unbounded Queue : Supported");

        System.out.println(
                "Duplicate Elements : Allowed");

        System.out.println(
                "Null Elements : Not Allowed");

        System.out.println(
                "LinkedBlockingQueue demonstration completed successfully.");
    }
}