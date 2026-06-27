package E_Queue.Deque.BlockingDeque.LinkedBlockingDeque;

import java.util.*;
import java.util.concurrent.*;

// In Which areas LinkedBlockingDeque class is used ?
// Hold Ctrl and move cursor to LinkedBlockingDeque keyword -> Go to that file.
// Hold Ctrl again on LinkedBlockingDeque -> Click -> Change search to
// "All Places" to explore where LinkedBlockingDeque is used.

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
         * ==========================================================
         *          Methods Inherited from Deque
         * ==========================================================
         */

        // Already implemented in Deque topic

        // addFirst()
        // addLast()
        //
        // offerFirst()
        // offerLast()
        //
        // removeFirst()
        // removeLast()
        //
        // pollFirst()
        // pollLast()
        //
        // getFirst()
        // getLast()
        //
        // peekFirst()
        // peekLast()
        //
        // push()
        // pop()
        //
        // removeFirstOccurrence()
        // removeLastOccurrence()
        //
        // descendingIterator()


        /*
         * ==========================================================
         *      Methods Introduced by BlockingDeque
         * ==========================================================
         */

        // Already implemented in BlockingDeque topic

        // putFirst()
        // putLast()
        //
        // takeFirst()
        // takeLast()
        //
        // offerFirst(E, long, TimeUnit)
        // offerLast(E, long, TimeUnit)
        //
        // pollFirst(long, TimeUnit)
        // pollLast(long, TimeUnit)


        /*
         * LinkedBlockingDeque introduces NO NEW PUBLIC METHODS.
         *
         * It is the concrete implementation of
         * BlockingDeque.
         *
         * Internally it uses:
         *
         * Doubly Linked List
         *
         * Features:
         *
         * ✔ Thread Safe
         * ✔ Blocking Operations
         * ✔ Double Ended Queue
         * ✔ Optional Bounded Capacity
         * ✔ Queue + Stack Behaviour
         */


        /*
         * ==========================================================
         *      Basic LinkedBlockingDeque Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        LinkedBlockingDeque rawDeque =
                new LinkedBlockingDeque();

        rawDeque.add("Java");
        rawDeque.add(100);
        rawDeque.add(true);

        System.out.println("Raw LinkedBlockingDeque");

        System.out.println(rawDeque);

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

        LinkedBlockingDeque<String> languages =
                new LinkedBlockingDeque<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Spring");
        languages.add("Java");

        System.out.println("LinkedBlockingDeque with Generics");

        System.out.println(languages);

        /*
         * Note
         *
         * Duplicate values are allowed.
         *
         * Null values are NOT allowed.
         *
         * Thread Safe.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Queue Reference
        // ---------------------------------------------------------

        Queue<Integer> queue =
                new LinkedBlockingDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue Reference");

        System.out.println(queue);

        System.out.println();


        // ---------------------------------------------------------
        // Deque Reference
        // ---------------------------------------------------------

        Deque<Integer> deque =
                new LinkedBlockingDeque<>();

        deque.addFirst(20);
        deque.addFirst(10);
        deque.addLast(30);
        deque.addLast(40);

        System.out.println("Deque Reference");

        System.out.println(deque);

        System.out.println();


        // ---------------------------------------------------------
        // BlockingDeque Reference
        // ---------------------------------------------------------

        BlockingDeque<Integer> blockingDeque =
                new LinkedBlockingDeque<>();

        blockingDeque.putFirst(20);

        blockingDeque.putFirst(10);

        blockingDeque.putLast(30);

        blockingDeque.putLast(40);

        System.out.println("BlockingDeque Reference");

        System.out.println(blockingDeque);

        System.out.println();


        /*
         * ==========================================================
         *                Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // LinkedBlockingDeque()
        // ---------------------------------------------------------

        LinkedBlockingDeque<Integer> numbers =
                new LinkedBlockingDeque<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("LinkedBlockingDeque()");

        System.out.println(numbers);

        System.out.println();


        // ---------------------------------------------------------
        // LinkedBlockingDeque(int capacity)
        // ---------------------------------------------------------

        LinkedBlockingDeque<Integer> bounded1 =
                new LinkedBlockingDeque<>(5);

        bounded1.add(10);
        bounded1.add(20);
        bounded1.add(30);

        System.out.println("LinkedBlockingDeque(capacity)");

        System.out.println(bounded1);

        System.out.println(
                "Remaining Capacity : "
                        + bounded1.remainingCapacity());

        System.out.println();


        // ---------------------------------------------------------
        // LinkedBlockingDeque(Collection)
        // ---------------------------------------------------------

        List<Integer> list =
                Arrays.asList(1, 2, 3, 4, 5);

        LinkedBlockingDeque<Integer> copy =
                new LinkedBlockingDeque<>(list);

        System.out.println("LinkedBlockingDeque(Collection)");

        System.out.println(copy);

        System.out.println();


        /*
         * ==========================================================
         *        Duplicate & Null Demonstration
         * ==========================================================
         */

        LinkedBlockingDeque<Integer> demo =
                new LinkedBlockingDeque<>();

        demo.add(10);
        demo.add(20);
        demo.add(10);
        demo.add(30);

        System.out.println("Duplicate Demonstration");

        System.out.println(demo);

        System.out.println();

//      demo.add(null);
//
//      Throws:
//
//      java.lang.NullPointerException

        System.out.println("Null values are NOT allowed.");

        System.out.println();


        /*
         * ==========================================================
         *           Basic FIFO Demonstration
         * ==========================================================
         */

        LinkedBlockingDeque<Integer> fifo =
                new LinkedBlockingDeque<>();

        fifo.offerLast(10);
        fifo.offerLast(20);
        fifo.offerLast(30);
        fifo.offerLast(40);

        System.out.println("FIFO Demonstration");

        System.out.println(fifo);

        System.out.println(
                "Removed : "
                        + fifo.pollFirst());

        System.out.println(
                "After Removal : "
                        + fifo);

        System.out.println();

        /*
         * ==========================================================
         *          putFirst() & putLast()
         * ==========================================================
         */

        LinkedBlockingDeque<Integer> deque1 =
                new LinkedBlockingDeque<>(5);

        deque1.putFirst(20);
        deque1.putFirst(10);

        deque1.putLast(30);
        deque1.putLast(40);

        System.out.println("putFirst() & putLast()");

        System.out.println(deque1);

        System.out.println();


        /*
         * ==========================================================
         *          takeFirst() & takeLast()
         * ==========================================================
         */

        System.out.println("takeFirst()");

        System.out.println(deque1.takeFirst());

        System.out.println(deque1);

        System.out.println();

        System.out.println("takeLast()");

        System.out.println(deque1.takeLast());

        System.out.println(deque1);

        System.out.println();


        /*
         * ==========================================================
         *      offerFirst(timeout) & offerLast(timeout)
         * ==========================================================
         */

        LinkedBlockingDeque<Integer> deque2 =
                new LinkedBlockingDeque<>(3);

        deque2.offer(10);
        deque2.offer(20);

        boolean first =
                deque2.offerFirst(
                        5,
                        2,
                        TimeUnit.SECONDS);

        boolean last =
                deque2.offerLast(
                        30,
                        2,
                        TimeUnit.SECONDS);

        System.out.println("offerFirst(timeout)");

        System.out.println(first);

        System.out.println(deque2);

        System.out.println();

        System.out.println("offerLast(timeout)");

        System.out.println(last);

        System.out.println(deque2);

        System.out.println();


        /*
         * ==========================================================
         *      pollFirst(timeout) & pollLast(timeout)
         * ==========================================================
         */

        System.out.println("pollFirst(timeout)");

        System.out.println(
                deque2.pollFirst(
                        2,
                        TimeUnit.SECONDS));

        System.out.println(deque2);

        System.out.println();

        System.out.println("pollLast(timeout)");

        System.out.println(
                deque2.pollLast(
                        2,
                        TimeUnit.SECONDS));

        System.out.println(deque2);

        System.out.println();


        /*
         * ==========================================================
         *           Remaining Capacity
         * ==========================================================
         */

        LinkedBlockingDeque<Integer> capacity =
                new LinkedBlockingDeque<>(10);

        capacity.add(10);
        capacity.add(20);
        capacity.add(30);

        System.out.println("Remaining Capacity");

        System.out.println(
                capacity.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *       Remove First / Last Occurrence
         * ==========================================================
         */

        LinkedBlockingDeque<Integer> occurrence =
                new LinkedBlockingDeque<>();

        occurrence.add(10);
        occurrence.add(20);
        occurrence.add(30);
        occurrence.add(20);
        occurrence.add(40);
        occurrence.add(20);

        System.out.println("Original");

        System.out.println(occurrence);

        occurrence.removeFirstOccurrence(20);

        System.out.println();

        System.out.println("After removeFirstOccurrence()");

        System.out.println(occurrence);

        occurrence.removeLastOccurrence(20);

        System.out.println();

        System.out.println("After removeLastOccurrence()");

        System.out.println(occurrence);

        System.out.println();


        /*
         * ==========================================================
         *            Enhanced For Loop
         * ==========================================================
         */

        System.out.println("Enhanced For Loop");

        for (Integer value : occurrence) {

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
                occurrence.iterator();

        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *            Descending Iterator
         * ==========================================================
         */

        System.out.println("Descending Iterator");

        Iterator<Integer> descending =
                occurrence.descendingIterator();

        while (descending.hasNext()) {

            System.out.print(descending.next() + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *                Spliterator
         * ==========================================================
         */

        System.out.println("Spliterator");

        Spliterator<Integer> spliterator =
                occurrence.spliterator();

        spliterator.forEachRemaining(
                value -> System.out.print(value + " ")
        );

        System.out.println("\n");


        /*
         * ==========================================================
         *                 Stream API
         * ==========================================================
         */

        System.out.println("Stream");

        occurrence.stream()
                .forEach(value ->
                        System.out.print(value + " "));

        System.out.println("\n");


        /*
         * ==========================================================
         *          Queue vs Stack Behaviour
         * ==========================================================
         */

        LinkedBlockingDeque<Integer> behaviour =
                new LinkedBlockingDeque<>();

        behaviour.offerLast(10);
        behaviour.offerLast(20);
        behaviour.offerLast(30);

        System.out.println("Queue Behaviour");

        System.out.println(behaviour);

        System.out.println(
                "pollFirst() : "
                        + behaviour.pollFirst());

        System.out.println(behaviour);

        System.out.println();

        behaviour.clear();

        behaviour.push(10);
        behaviour.push(20);
        behaviour.push(30);

        System.out.println("Stack Behaviour");

        System.out.println(behaviour);

        System.out.println(
                "pop() : "
                        + behaviour.pop());

        System.out.println(behaviour);

        System.out.println();

        /*
         * ==========================================================
         *          Producer Consumer Demonstration
         * ==========================================================
         */

        LinkedBlockingDeque<String> sharedDeque =
                new LinkedBlockingDeque<>(3);

        Thread producer = new Thread(() -> {

            try {

                sharedDeque.putLast("Java");
                System.out.println("Produced : Java");

                sharedDeque.putLast("Spring");
                System.out.println("Produced : Spring");

                sharedDeque.putLast("Hibernate");
                System.out.println("Produced : Hibernate");

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        Thread consumer = new Thread(() -> {

            try {

                Thread.sleep(1000);

                while (!sharedDeque.isEmpty()) {

                    System.out.println(
                            "Consumed : "
                                    + sharedDeque.takeFirst());

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

        LinkedBlockingDeque<Integer> blocking =
                new LinkedBlockingDeque<>(2);

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
         *            Capacity Demonstration
         * ==========================================================
         */

        LinkedBlockingDeque<Integer> bounded =
                new LinkedBlockingDeque<>(5);

        bounded.add(10);
        bounded.add(20);
        bounded.add(30);

        System.out.println("Capacity Demonstration");

        System.out.println("Deque : " + bounded);

        System.out.println(
                "Size : "
                        + bounded.size());

        System.out.println(
                "Remaining Capacity : "
                        + bounded.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *           Queue and Stack Together
         * ==========================================================
         */

        LinkedBlockingDeque<String> operations =
                new LinkedBlockingDeque<>();

        operations.offerLast("A");
        operations.offerLast("B");
        operations.offerLast("C");

        System.out.println("Queue");

        System.out.println(operations);

        System.out.println(
                "pollFirst() : "
                        + operations.pollFirst());

        System.out.println(operations);

        System.out.println();

        operations.clear();

        operations.push("A");
        operations.push("B");
        operations.push("C");

        System.out.println("Stack");

        System.out.println(operations);

        System.out.println(
                "pop() : "
                        + operations.pop());

        System.out.println(operations);

        System.out.println();


        /*
         * ==========================================================
         *             Real World Example
         * ==========================================================
         */

        LinkedBlockingDeque<String> browserHistory =
                new LinkedBlockingDeque<>();

        browserHistory.push("Google");

        browserHistory.push("GitHub");

        browserHistory.push("ChatGPT");

        browserHistory.push("OpenAI");

        System.out.println("Browser Back History");

        while (!browserHistory.isEmpty()) {

            System.out.println(
                    "Back : "
                            + browserHistory.pop());

        }

        System.out.println();


        /*
         * ==========================================================
         *              Performance Notes
         * ==========================================================
         */

        System.out.println("Performance");

        System.out.println(
                "Fast insertion at both ends.");

        System.out.println(
                "Fast deletion at both ends.");

        System.out.println(
                "Thread Safe.");

        System.out.println(
                "Supports Blocking Operations.");

        System.out.println(
                "Uses Doubly Linked List.");

        System.out.println(
                "Optional Fixed Capacity.");

        System.out.println();


        /*
         * ==========================================================
         *               Best Practices
         * ==========================================================
         */

        System.out.println("Best Practices");

        System.out.println(
                "✔ Use LinkedBlockingDeque for thread-safe deque operations.");

        System.out.println(
                "✔ Use put()/take() when blocking behaviour is required.");

        System.out.println(
                "✔ Use offer(timeout) when limited waiting is required.");

        System.out.println(
                "✔ Use as both Queue and Stack.");

        System.out.println(
                "✔ Avoid inserting null values.");

        System.out.println();


        /*
         * ==========================================================
         *                    Summary
         * ==========================================================
         */

        System.out.println("===== Summary =====");

        System.out.println(
                "Implementation : "
                        + bounded.getClass().getSimpleName());

        System.out.println(
                "Internal Structure : Doubly Linked List");

        System.out.println(
                "Thread Safe : Yes");

        System.out.println(
                "Blocking Operations : Supported");

        System.out.println(
                "Queue Behaviour : Yes");

        System.out.println(
                "Stack Behaviour : Yes");

        System.out.println(
                "Duplicate Elements : Allowed");

        System.out.println(
                "Null Elements : Not Allowed");

        System.out.println(
                "Optional Capacity : Yes");

        System.out.println(
                "LinkedBlockingDeque demonstration completed successfully.");
    }
}