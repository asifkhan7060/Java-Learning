package E_Queue.PriorityQueue;

import java.util.*;

// In Which areas PriorityQueue class is used ?
// Hold Ctrl and move cursor to PriorityQueue keyword -> Go to that file.
// Hold Ctrl again on PriorityQueue -> Click -> Change search to
// "All Places" to explore where PriorityQueue is used.

public class Implementation {

    public static void main(String[] args) {

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
         * PriorityQueue introduces NO NEW PUBLIC METHODS.
         *
         * It is the concrete implementation of
         * the Queue interface.
         *
         * The main difference lies in its
         * internal implementation.
         *
         * Internally it uses:
         *
         * Binary Min Heap
         *
         * Features:
         *
         * ✔ Natural Ordering
         * ✔ Custom Comparator
         * ✔ Duplicate Elements Allowed
         * ✔ Null Values NOT Allowed
         * ✔ Does NOT Maintain Insertion Order
         */


        /*
         * ==========================================================
         *          Basic PriorityQueue Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        PriorityQueue rawQueue =
                new PriorityQueue();

        rawQueue.add(30);
        rawQueue.add("Java");
        rawQueue.add(true);

        System.out.println("Raw PriorityQueue");

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

        PriorityQueue<Integer> numbers =
                new PriorityQueue<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println("PriorityQueue with Generics");

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
                new PriorityQueue<>();

        queue.offer(100);
        queue.offer(20);
        queue.offer(50);
        queue.offer(10);

        System.out.println("Queue Reference");

        System.out.println(queue);

        System.out.println();


        /*
         * ==========================================================
         *                Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // PriorityQueue()
        // ---------------------------------------------------------

        PriorityQueue<Integer> pq1 =
                new PriorityQueue<>();

        pq1.add(90);
        pq1.add(40);
        pq1.add(70);

        System.out.println("PriorityQueue()");

        System.out.println(pq1);

        System.out.println();


        // ---------------------------------------------------------
        // PriorityQueue(int initialCapacity)
        // ---------------------------------------------------------

        PriorityQueue<Integer> pq2 =
                new PriorityQueue<>(20);

        pq2.add(5);
        pq2.add(1);
        pq2.add(9);

        System.out.println("PriorityQueue(initialCapacity)");

        System.out.println(pq2);

        System.out.println();


        // ---------------------------------------------------------
        // PriorityQueue(Collection)
        // ---------------------------------------------------------

        List<Integer> list =
                Arrays.asList(8, 2, 6, 1, 5);

        PriorityQueue<Integer> pq3 =
                new PriorityQueue<>(list);

        System.out.println("PriorityQueue(Collection)");

        System.out.println(pq3);

        System.out.println();


        // ---------------------------------------------------------
        // PriorityQueue(Comparator)
        // ---------------------------------------------------------

        PriorityQueue<Integer> pq4 =
                new PriorityQueue<>(Comparator.reverseOrder());

        pq4.add(10);
        pq4.add(40);
        pq4.add(20);

        System.out.println("PriorityQueue(Comparator)");

        System.out.println(pq4);

        System.out.println();


        // ---------------------------------------------------------
        // PriorityQueue(PriorityQueue)
        // ---------------------------------------------------------

        PriorityQueue<Integer> pq5 =
                new PriorityQueue<>(pq1);

        System.out.println("PriorityQueue(PriorityQueue)");

        System.out.println(pq5);

        System.out.println();


        /*
         * ==========================================================
         *          Natural Ordering Demonstration
         * ==========================================================
         */

        PriorityQueue<Integer> natural =
                new PriorityQueue<>();

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

        PriorityQueue<Integer> duplicate =
                new PriorityQueue<>();

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
         *              add() vs offer()
         * ==========================================================
         */

        PriorityQueue<Integer> queue1 =
                new PriorityQueue<>();

        queue1.add(50);
        queue1.add(20);
        queue1.add(40);

        queue1.offer(10);
        queue1.offer(30);

        System.out.println("add() & offer()");

        System.out.println(queue1);

        System.out.println();


        /*
         * ==========================================================
         *               peek() & element()
         * ==========================================================
         */

        System.out.println("peek()");

        System.out.println(queue1.peek());

        System.out.println();

        System.out.println("element()");

        System.out.println(queue1.element());

        System.out.println();


        /*
         * ==========================================================
         *               poll() & remove()
         * ==========================================================
         */

        System.out.println("poll()");

        System.out.println(queue1.poll());

        System.out.println(queue1);

        System.out.println();

        System.out.println("remove()");

        System.out.println(queue1.remove());

        System.out.println(queue1);

        System.out.println();


        /*
         * ==========================================================
         *            Min Heap Demonstration
         * ==========================================================
         */

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        minHeap.add(40);
        minHeap.add(10);
        minHeap.add(60);
        minHeap.add(20);
        minHeap.add(30);

        System.out.println("Min Heap");

        while (!minHeap.isEmpty()) {

            System.out.print(
                    minHeap.poll() + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *            Max Heap Demonstration
         * ==========================================================
         */

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(
                        Comparator.reverseOrder());

        maxHeap.add(40);
        maxHeap.add(10);
        maxHeap.add(60);
        maxHeap.add(20);
        maxHeap.add(30);

        System.out.println("Max Heap");

        while (!maxHeap.isEmpty()) {

            System.out.print(
                    maxHeap.poll() + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *            Custom Comparator
         * ==========================================================
         */

        PriorityQueue<String> words =
                new PriorityQueue<>(
                        Comparator.comparingInt(
                                String::length));

        words.offer("Java");
        words.offer("Programming");
        words.offer("AI");
        words.offer("Developer");
        words.offer("SQL");

        System.out.println("Custom Comparator");

        while (!words.isEmpty()) {

            System.out.print(
                    words.poll() + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *             Enhanced For Loop
         * ==========================================================
         */

        PriorityQueue<Integer> traversal =
                new PriorityQueue<>();

        traversal.addAll(
                Arrays.asList(
                        30, 10, 50, 20, 40));

        System.out.println("Enhanced For Loop");

        for (Integer value : traversal) {

            System.out.print(value + " ");

        }

        System.out.println();

        /*
         * Note
         *
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
                        System.out.print(
                                value + " "));

        System.out.println("\n");


        /*
         * ==========================================================
         *                  Stream API
         * ==========================================================
         */

        System.out.println("Stream");

        traversal.stream()
                .forEach(value ->
                        System.out.print(
                                value + " "));

        System.out.println("\n");


        /*
         * ==========================================================
         *          Internal Ordering Demonstration
         * ==========================================================
         */

        PriorityQueue<Integer> internal =
                new PriorityQueue<>();

        internal.offer(100);
        internal.offer(40);
        internal.offer(80);
        internal.offer(20);
        internal.offer(60);

        System.out.println("Internal Heap");

        System.out.println(internal);

        System.out.println();

        System.out.println(
                "Priority Removal");

        while (!internal.isEmpty()) {

            System.out.print(
                    internal.poll() + " ");

        }

        System.out.println("\n");

        /*
         * ==========================================================
         *             Custom Object Priority
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

        PriorityQueue<Student> students =
                new PriorityQueue<>(
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
         *          Task Scheduling Example
         * ==========================================================
         */

        PriorityQueue<Integer> tasks =
                new PriorityQueue<>();

        tasks.offer(3);
        tasks.offer(1);
        tasks.offer(5);
        tasks.offer(2);
        tasks.offer(4);

        System.out.println("Task Scheduling");

        while (!tasks.isEmpty()) {

            System.out.println(
                    "Executing Priority : "
                            + tasks.poll());

        }

        System.out.println();


        /*
         * ==========================================================
         *         Hospital Emergency Example
         * ==========================================================
         */

        PriorityQueue<String> patients =
                new PriorityQueue<>();

        patients.offer("Critical");
        patients.offer("Normal");
        patients.offer("Emergency");
        patients.offer("Serious");

        System.out.println("Hospital Queue");

        while (!patients.isEmpty()) {

            System.out.println(
                    patients.poll());

        }

        System.out.println();

        /*
         * Note
         *
         * Actual hospitals usually use
         * a custom Comparator instead of
         * String ordering.
         */


        /*
         * ==========================================================
         *           CPU Process Scheduling
         * ==========================================================
         */

        PriorityQueue<Integer> cpu =
                new PriorityQueue<>();

        cpu.offer(15);
        cpu.offer(5);
        cpu.offer(30);
        cpu.offer(10);

        System.out.println("CPU Scheduling");

        while (!cpu.isEmpty()) {

            System.out.println(
                    "Executing : "
                            + cpu.poll());

        }

        System.out.println();


        /*
         * ==========================================================
         *           Priority Queue Properties
         * ==========================================================
         */

        PriorityQueue<Integer> properties =
                new PriorityQueue<>();

        properties.offer(50);
        properties.offer(10);
        properties.offer(40);
        properties.offer(20);

        System.out.println("Properties");

        System.out.println(
                "Size : "
                        + properties.size());

        System.out.println(
                "Contains 20 : "
                        + properties.contains(20));

        System.out.println(
                "Is Empty : "
                        + properties.isEmpty());

        properties.clear();

        System.out.println(
                "After clear() : "
                        + properties);

        System.out.println();


        /*
         * ==========================================================
         *             Performance Notes
         * ==========================================================
         */

        System.out.println("Performance");

        System.out.println(
                "Insertion : O(log n)");

        System.out.println(
                "Deletion : O(log n)");

        System.out.println(
                "Peek : O(1)");

        System.out.println(
                "Internal Structure : Binary Min Heap");

        System.out.println(
                "Random Access : Not Supported");

        System.out.println(
                "Insertion Order : Not Maintained");

        System.out.println();


        /*
         * ==========================================================
         *              Best Practices
         * ==========================================================
         */

        System.out.println("Best Practices");

        System.out.println(
                "✔ Use PriorityQueue when priority matters.");

        System.out.println(
                "✔ Use Comparator for custom priority.");

        System.out.println(
                "✔ Do not expect sorted iteration.");

        System.out.println(
                "✔ Use poll() to retrieve elements in priority order.");

        System.out.println(
                "✔ Never insert null values.");

        System.out.println();


        /*
         * ==========================================================
         *                   Summary
         * ==========================================================
         */

        System.out.println("===== Summary =====");

        System.out.println(
                "Implementation : "
                        + pq1.getClass().getSimpleName());

        System.out.println(
                "Internal Structure : Binary Min Heap");

        System.out.println(
                "Natural Ordering : Yes");

        System.out.println(
                "Custom Comparator : Supported");

        System.out.println(
                "Duplicate Elements : Allowed");

        System.out.println(
                "Null Elements : Not Allowed");

        System.out.println(
                "Insertion Order : Not Maintained");

        System.out.println(
                "Thread Safe : No");

        System.out.println(
                "PriorityQueue demonstration completed successfully.");
    }
}   