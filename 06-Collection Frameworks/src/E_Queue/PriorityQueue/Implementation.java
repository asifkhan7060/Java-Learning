package E_Queue.PriorityQueue;

import java.util.*;

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

        /** Learn min Heap and max Heap Concept first by Heap.md **/

        /*
         * ==========================================================
         *          Basic PriorityQueue Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        PriorityQueue<Object> rawQueue =
                new PriorityQueue<>();

        rawQueue.add(80);
        rawQueue.add(30);
        rawQueue.add(40);
        // Not Possible (Throws error) - think how tree maintain different datatypes values
        // rawQueue.add("Java");
        // rawQueue.add(true);

        System.out.println("Raw PriorityQueue");

        System.out.println(rawQueue); // Heap structured printed not sorted !

        System.out.println("Sorted Order: ");

        while (!rawQueue.isEmpty()) {
            System.out.println(rawQueue.poll());
        }

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
         * Duplicate values are allowed.
         * Elements are arranged according to priority as Heap.
         */

        System.out.println();

        /*
         * ==========================================================
         *                Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // PriorityQueue() // Normal
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
        // PriorityQueue(int initialCapacity) - Unbounded
        // ---------------------------------------------------------

        PriorityQueue<Integer> pq2 =
                new PriorityQueue<>(20);

        pq2.add(5);
        pq2.add(1);
        pq2.add(9);

        System.out.println("PriorityQueue(initialCapacity)");

        System.out.println(pq2);

        System.out.println();

        /*
         * When the array becomes full, PriorityQueue automatically creates a larger array, copies existing elements, and continues inserting.
         * Therefore, PriorityQueue is unbounded.
         */


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
         * Queue Methods (Already Covered)
         * ==========================================================
         *
         * Refer Queue Implementation.java
         *
         * ✓ add()
         * ✓ offer()
         * ✓ peek()
         * ✓ element()
         * ✓ poll()
         * ✓ remove()
         *
         * Note:
         * In PriorityQueue, these methods work on
         * the heap (priority order) instead of FIFO.
         */

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

    }
}   