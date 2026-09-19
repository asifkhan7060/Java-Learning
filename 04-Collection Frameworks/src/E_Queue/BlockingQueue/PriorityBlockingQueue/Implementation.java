package E_Queue.BlockingQueue.PriorityBlockingQueue;

import java.util.*;
import java.util.concurrent.*;

// In Which areas PriorityBlockingQueue class is used ?
// Hold Ctrl and move cursor to PriorityBlockingQueue keyword -> Go to that file.
// Hold Ctrl again on PriorityBlockingQueue -> Click -> Change search to
// "All Places" to explore where PriorityBlockingQueue is used.

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
         * PriorityBlockingQueue introduces NO NEW PUBLIC METHODS.
         *
         * It is the concrete implementation of
         * BlockingQueue.
         *
         * Internally it uses:
         *
         * Binary Min Heap
         *
         * Features:
         *
         * ✔ Thread Safe
         * ✔ Unbounded Queue
         * ✔ Priority Based Ordering
         * ✔ Natural Ordering
         * ✔ Custom Comparator
         * ✔ Duplicate Elements Allowed
         * ✔ Null Values NOT Allowed
         */


        /*
         * ==========================================================
         *      Basic PriorityBlockingQueue Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        PriorityBlockingQueue rawQueue =
                new PriorityBlockingQueue();

        rawQueue.add(30);
        rawQueue.add("Java");
        rawQueue.add(true);

        System.out.println("Raw PriorityBlockingQueue");

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

        PriorityBlockingQueue<Integer> numbers =
                new PriorityBlockingQueue<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println("PriorityBlockingQueue with Generics");

        System.out.println(numbers);

        /*
         * Note
         *
         * Duplicate values are allowed.
         *
         * Elements are arranged
         * according to priority.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Queue Reference
        // ---------------------------------------------------------

        Queue<Integer> queue =
                new PriorityBlockingQueue<>();

        queue.offer(100);
        queue.offer(20);
        queue.offer(50);
        queue.offer(10);

        System.out.println("Queue Reference");

        System.out.println(queue);

        System.out.println();


        // ---------------------------------------------------------
        // BlockingQueue Reference
        // ---------------------------------------------------------

        BlockingQueue<Integer> blockingQueue =
                new PriorityBlockingQueue<>();

        blockingQueue.put(90);
        blockingQueue.put(40);
        blockingQueue.put(70);

        System.out.println("BlockingQueue Reference");

        System.out.println(blockingQueue);

        System.out.println();


        /*
         * ==========================================================
         *                 Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // PriorityBlockingQueue()
        // ---------------------------------------------------------

        PriorityBlockingQueue<Integer> pq1 =
                new PriorityBlockingQueue<>();

        pq1.add(90);
        pq1.add(40);
        pq1.add(70);

        System.out.println("PriorityBlockingQueue()");

        System.out.println(pq1);

        System.out.println();


        // ---------------------------------------------------------
        // PriorityBlockingQueue(int initialCapacity)
        // ---------------------------------------------------------

        PriorityBlockingQueue<Integer> pq2 =
                new PriorityBlockingQueue<>(20);

        pq2.add(5);
        pq2.add(1);
        pq2.add(9);

        System.out.println("PriorityBlockingQueue(initialCapacity)");

        System.out.println(pq2);

        System.out.println();


        // ---------------------------------------------------------
        // PriorityBlockingQueue
        // (int initialCapacity, Comparator)
        // ---------------------------------------------------------

        PriorityBlockingQueue<Integer> pq3 =
                new PriorityBlockingQueue<>(
                        20,
                        Comparator.reverseOrder());

        pq3.add(10);
        pq3.add(40);
        pq3.add(20);

        System.out.println(
                "PriorityBlockingQueue(initialCapacity, Comparator)");

        System.out.println(pq3);

        System.out.println();


        // ---------------------------------------------------------
        // PriorityBlockingQueue(Collection)
        // ---------------------------------------------------------

        List<Integer> list =
                Arrays.asList(8, 2, 6, 1, 5);

        PriorityBlockingQueue<Integer> pq4 =
                new PriorityBlockingQueue<>(list);

        System.out.println("PriorityBlockingQueue(Collection)");

        System.out.println(pq4);

        System.out.println();


        /*
         * ==========================================================
         *         Natural Ordering Demonstration
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> natural =
                new PriorityBlockingQueue<>();

        natural.add(50);
        natural.add(10);
        natural.add(40);
        natural.add(20);
        natural.add(30);

        System.out.println("Natural Ordering");

        while (!natural.isEmpty()) {

            System.out.print(
                    natural.poll() + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *        Duplicate & Null Demonstration
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> duplicate =
                new PriorityBlockingQueue<>();

        duplicate.add(20);
        duplicate.add(10);
        duplicate.add(20);
        duplicate.add(30);
        duplicate.add(10);

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

        PriorityBlockingQueue<Integer> queue1 =
                new PriorityBlockingQueue<>();

        queue1.put(50);
        queue1.put(20);
        queue1.put(40);

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
         *             offer(timeout)
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> queue2 =
                new PriorityBlockingQueue<>();

        boolean inserted =
                queue2.offer(
                        30,
                        2,
                        TimeUnit.SECONDS);

        queue2.offer(
                10,
                2,
                TimeUnit.SECONDS);

        queue2.offer(
                20,
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
         *             poll(timeout)
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

        PriorityBlockingQueue<Integer> queue3 =
                new PriorityBlockingQueue<>();

        queue3.add(10);
        queue3.add(20);

        System.out.println("remainingCapacity()");

        System.out.println(
                queue3.remainingCapacity());

        /*
         * PriorityBlockingQueue is unbounded.
         *
         * Therefore,
         *
         * remainingCapacity()
         *
         * always returns
         *
         * Integer.MAX_VALUE
         */

        System.out.println();


        /*
         * ==========================================================
         *                 drainTo()
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> queue4 =
                new PriorityBlockingQueue<>();

        queue4.add(30);
        queue4.add(10);
        queue4.add(20);
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
        queue4.add(50);
        queue4.add(70);
        queue4.add(30);

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
         *            Custom Comparator (Max Heap)
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> maxHeap =
                new PriorityBlockingQueue<>(
                        10,
                        Comparator.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(40);
        maxHeap.add(30);

        System.out.println("Custom Comparator");

        while (!maxHeap.isEmpty()) {

            System.out.print(
                    maxHeap.poll() + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *             Enhanced For Loop
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> traversal =
                new PriorityBlockingQueue<>();

        traversal.addAll(
                Arrays.asList(
                        30, 10, 50, 20, 40));

        System.out.println("Enhanced For Loop");

        for (Integer value : traversal) {

            System.out.print(value + " ");

        }

        System.out.println();

        /*
         * Traversal does NOT guarantee
         * priority order.
         */

        System.out.println();


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
         *          Producer Consumer Demonstration
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> sharedQueue =
                new PriorityBlockingQueue<>();

        Thread producer = new Thread(() -> {

            sharedQueue.put(40);
            System.out.println("Produced : 40");

            sharedQueue.put(10);
            System.out.println("Produced : 10");

            sharedQueue.put(30);
            System.out.println("Produced : 30");

            sharedQueue.put(20);
            System.out.println("Produced : 20");

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
         *          Priority Scheduling Example
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> scheduler =
                new PriorityBlockingQueue<>();

        scheduler.offer(5);
        scheduler.offer(1);
        scheduler.offer(3);
        scheduler.offer(2);
        scheduler.offer(4);

        System.out.println("Priority Scheduling");

        while (!scheduler.isEmpty()) {

            System.out.println(
                    "Executing Priority : "
                            + scheduler.take());

        }

        System.out.println();


        /*
         * ==========================================================
         *          Min Heap vs Max Heap
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> minHeap =
                new PriorityBlockingQueue<>();

        minHeap.addAll(
                Arrays.asList(40, 10, 60, 20, 30));

        System.out.println("Min Heap");

        while (!minHeap.isEmpty()) {

            System.out.print(
                    minHeap.poll() + " ");

        }

        System.out.println("\n");

        PriorityBlockingQueue<Integer> maxHeap2 =
                new PriorityBlockingQueue<>(
                        10,
                        Comparator.reverseOrder());

        maxHeap2.addAll(
                Arrays.asList(40, 10, 60, 20, 30));

        System.out.println("Max Heap");

        while (!maxHeap2.isEmpty()) {

            System.out.print(
                    maxHeap2.poll() + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *        Unbounded Queue Demonstration
         * ==========================================================
         */

        PriorityBlockingQueue<Integer> unbounded =
                new PriorityBlockingQueue<>();

        for (int i = 1; i <= 10; i++) {

            unbounded.offer(i);

        }

        System.out.println("Unbounded Queue");

        System.out.println(unbounded);

        System.out.println(
                "Remaining Capacity : "
                        + unbounded.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *        Custom Object Priority Example
         * ==========================================================
         */

        class Student {

            int rollNo;
            String name;

            Student(int rollNo, String name) {

                this.rollNo = rollNo;
                this.name = name;

            }

            @Override
            public String toString() {

                return rollNo + " - " + name;

            }

        }

        PriorityBlockingQueue<Student> students =
                new PriorityBlockingQueue<>(
                        10,
                        Comparator.comparingInt(
                                s -> s.rollNo));

        students.offer(new Student(103, "Rahul"));
        students.offer(new Student(101, "Aman"));
        students.offer(new Student(102, "Neha"));

        System.out.println("Custom Object Priority");

        while (!students.isEmpty()) {

            System.out.println(
                    students.poll());

        }

        System.out.println();


        /*
         * ==========================================================
         *              Performance Notes
         * ==========================================================
         */

        System.out.println("Performance");

        System.out.println(
                "Internal Structure : Binary Min Heap");

        System.out.println(
                "Insertion : O(log n)");

        System.out.println(
                "Deletion : O(log n)");

        System.out.println(
                "Peek : O(1)");

        System.out.println(
                "Thread Safe");

        System.out.println(
                "Priority Ordering");

        System.out.println(
                "Unbounded Queue");

        System.out.println();


        /*
         * ==========================================================
         *               Best Practices
         * ==========================================================
         */

        System.out.println("Best Practices");

        System.out.println(
                "✔ Use when tasks have different priorities.");

        System.out.println(
                "✔ Use Comparator for custom priority.");

        System.out.println(
                "✔ Do not rely on iteration order.");

        System.out.println(
                "✔ Use poll()/take() to retrieve elements in priority order.");

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
                        + pq1.getClass().getSimpleName());

        System.out.println(
                "Internal Structure : Binary Min Heap");

        System.out.println(
                "Thread Safe : Yes");

        System.out.println(
                "Priority Ordering : Yes");

        System.out.println(
                "Natural Ordering : Yes");

        System.out.println(
                "Custom Comparator : Supported");

        System.out.println(
                "Unbounded Queue : Yes");

        System.out.println(
                "Duplicate Elements : Allowed");

        System.out.println(
                "Null Elements : Not Allowed");

        System.out.println(
                "PriorityBlockingQueue demonstration completed successfully.");
    }
}