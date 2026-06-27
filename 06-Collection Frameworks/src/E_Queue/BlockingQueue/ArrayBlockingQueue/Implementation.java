package E_Queue.BlockingQueue.ArrayBlockingQueue;

import java.util.*;
import java.util.concurrent.*;

// In Which areas ArrayBlockingQueue class is used ?
// Hold Ctrl and move cursor to ArrayBlockingQueue keyword -> Go to that file.
// Hold Ctrl again on ArrayBlockingQueue -> Click -> Change search to
// "All Places" to explore where ArrayBlockingQueue is used.

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
         * ArrayBlockingQueue introduces NO NEW PUBLIC METHODS.
         *
         * It is the concrete implementation of
         * BlockingQueue.
         *
         * Internally it uses:
         *
         * Circular Fixed Size Array
         *
         * Features:
         *
         * ✔ Thread Safe
         * ✔ FIFO Ordering
         * ✔ Fixed Capacity
         * ✔ Blocking Operations
         * ✔ Optional Fairness Policy
         * ✔ Duplicate Elements Allowed
         * ✔ Null Values NOT Allowed
         */


        /*
         * ==========================================================
         *      Basic ArrayBlockingQueue Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        ArrayBlockingQueue rawQueue =
                new ArrayBlockingQueue(5);

        rawQueue.add("Java");
        rawQueue.add(100);
        rawQueue.add(true);

        System.out.println("Raw ArrayBlockingQueue");

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

        ArrayBlockingQueue<String> languages =
                new ArrayBlockingQueue<>(10);

        languages.add("Java");
        languages.add("Python");
        languages.add("Spring");
        languages.add("Java");

        System.out.println("ArrayBlockingQueue with Generics");

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
                new ArrayBlockingQueue<>(10);

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
                new ArrayBlockingQueue<>(10);

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
        // ArrayBlockingQueue(int capacity)
        // ---------------------------------------------------------

        ArrayBlockingQueue<Integer> numbers =
                new ArrayBlockingQueue<>(5);

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayBlockingQueue(capacity)");

        System.out.println(numbers);

        System.out.println();


        // ---------------------------------------------------------
        // ArrayBlockingQueue(int capacity, boolean fair)
        // ---------------------------------------------------------

        ArrayBlockingQueue<Integer> fairQueue1 =
                new ArrayBlockingQueue<>(5, true);

        fairQueue1.add(100);
        fairQueue1.add(200);

        System.out.println("ArrayBlockingQueue(capacity, fair)");

        System.out.println(fairQueue1);

        System.out.println();


        // ---------------------------------------------------------
        // ArrayBlockingQueue
        // (int capacity, boolean fair, Collection)
        // ---------------------------------------------------------

        List<Integer> list =
                Arrays.asList(1, 2, 3, 4);

        ArrayBlockingQueue<Integer> copy =
                new ArrayBlockingQueue<>(
                        10,
                        false,
                        list);

        System.out.println(
                "ArrayBlockingQueue(capacity, fair, Collection)");

        System.out.println(copy);

        System.out.println();


        /*
         * ==========================================================
         *          Fixed Capacity Demonstration
         * ==========================================================
         */

        ArrayBlockingQueue<Integer> capacityDemo =
                new ArrayBlockingQueue<>(3);

        capacityDemo.add(10);
        capacityDemo.add(20);
        capacityDemo.add(30);

        System.out.println("Fixed Capacity");

        System.out.println(capacityDemo);

        System.out.println(
                "Remaining Capacity : "
                        + capacityDemo.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *        Duplicate & Null Demonstration
         * ==========================================================
         */

        ArrayBlockingQueue<Integer> duplicate =
                new ArrayBlockingQueue<>(10);

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
         *                 put()
         * ==========================================================
         */

        ArrayBlockingQueue<Integer> queue1 =
                new ArrayBlockingQueue<>(5);

        queue1.put(10);
        queue1.put(20);
        queue1.put(30);

        System.out.println("put()");

        System.out.println(queue1);

        System.out.println();


        /*
         * ==========================================================
         *                 take()
         * ==========================================================
         */

        System.out.println("take()");

        System.out.println(queue1.take());

        System.out.println(queue1);

        System.out.println();


        /*
         * ==========================================================
         *          offer(timeout)
         * ==========================================================
         */

        ArrayBlockingQueue<Integer> queue2 =
                new ArrayBlockingQueue<>(3);

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
         *            poll(timeout)
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

        ArrayBlockingQueue<Integer> queue3 =
                new ArrayBlockingQueue<>(5);

        queue3.add(10);
        queue3.add(20);

        System.out.println("remainingCapacity()");

        System.out.println(
                queue3.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *              drainTo()
         * ==========================================================
         */

        ArrayBlockingQueue<Integer> queue4 =
                new ArrayBlockingQueue<>(10);

        queue4.add(10);
        queue4.add(20);
        queue4.add(30);
        queue4.add(40);

        List<Integer> list1 =
                new ArrayList<>();

        queue4.drainTo(list1);

        System.out.println("drainTo()");

        System.out.println("Queue : " + queue4);

        System.out.println("List : " + list1);

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

        System.out.println("Queue : " + queue4);

        System.out.println("List : " + list2);

        System.out.println();


        /*
         * ==========================================================
         *           Enhanced For Loop
         * ==========================================================
         */

        ArrayBlockingQueue<Integer> traversal =
                new ArrayBlockingQueue<>(10);

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
         *                 Iterator
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
         *                Spliterator
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
         *                 Stream API
         * ==========================================================
         */

        System.out.println("Stream");

        traversal.stream()
                .forEach(value ->
                        System.out.print(value + " "));

        System.out.println("\n");


        /*
         * ==========================================================
         *             FIFO Demonstration
         * ==========================================================
         */

        ArrayBlockingQueue<Integer> fifo =
                new ArrayBlockingQueue<>(10);

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

        ArrayBlockingQueue<String> sharedQueue =
                new ArrayBlockingQueue<>(3);

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

        ArrayBlockingQueue<Integer> blocking =
                new ArrayBlockingQueue<>(2);

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
         *          Fixed Capacity Demonstration
         * ==========================================================
         */

        ArrayBlockingQueue<Integer> fixed =
                new ArrayBlockingQueue<>(3);

        fixed.offer(10);
        fixed.offer(20);
        fixed.offer(30);

        System.out.println("Fixed Capacity");

        System.out.println(fixed);

        System.out.println(
                "Remaining Capacity : "
                        + fixed.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *          Fairness Demonstration
         * ==========================================================
         */

        ArrayBlockingQueue<Integer> fairQueue =
                new ArrayBlockingQueue<>(5, true);

        fairQueue.offer(100);
        fairQueue.offer(200);
        fairQueue.offer(300);

        System.out.println("Fair Queue");

        System.out.println(fairQueue);

        /*
         * Fair = true
         *
         * Waiting threads get access
         * in FIFO order.
         */

        System.out.println();


        /*
         * ==========================================================
         *             Ticket Counter Example
         * ==========================================================
         */

        ArrayBlockingQueue<String> tickets =
                new ArrayBlockingQueue<>(5);

        tickets.offer("Customer-1");
        tickets.offer("Customer-2");
        tickets.offer("Customer-3");

        System.out.println("Ticket Counter");

        while (!tickets.isEmpty()) {

            System.out.println(
                    "Serving : "
                            + tickets.poll());

        }

        System.out.println();


        /*
         * ==========================================================
         *              Performance Notes
         * ==========================================================
         */

        System.out.println("Performance");

        System.out.println(
                "Internal Structure : Circular Fixed Array");

        System.out.println(
                "Insertion : O(1)");

        System.out.println(
                "Deletion : O(1)");

        System.out.println(
                "Peek : O(1)");

        System.out.println(
                "Thread Safe");

        System.out.println(
                "Blocking Operations Supported");

        System.out.println(
                "Fixed Capacity");

        System.out.println();


        /*
         * ==========================================================
         *               Best Practices
         * ==========================================================
         */

        System.out.println("Best Practices");

        System.out.println(
                "✔ Use for bounded Producer-Consumer systems.");

        System.out.println(
                "✔ Use put()/take() for blocking behaviour.");

        System.out.println(
                "✔ Use offer(timeout) when limited waiting is required.");

        System.out.println(
                "✔ Choose capacity carefully.");

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
                        + fixed.getClass().getSimpleName());

        System.out.println(
                "Internal Structure : Circular Fixed Array");

        System.out.println(
                "Thread Safe : Yes");

        System.out.println(
                "FIFO Ordering : Yes");

        System.out.println(
                "Blocking Operations : Supported");

        System.out.println(
                "Fixed Capacity : Yes");

        System.out.println(
                "Duplicate Elements : Allowed");

        System.out.println(
                "Null Elements : Not Allowed");

        System.out.println(
                "Fairness Policy : Optional");

        System.out.println(
                "ArrayBlockingQueue demonstration completed successfully.");
    }
}