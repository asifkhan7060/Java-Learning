package E_Queue.Deque.ArrayDeque;

import java.util.*;

// In Which areas ArrayDeque class is used ?
// Hold Ctrl and move cursor to ArrayDeque keyword -> Go to that file.
// Hold Ctrl again on ArrayDeque -> Click -> Change search to
// "All Places" to explore where ArrayDeque is used.

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
         * ArrayDeque introduces NO NEW PUBLIC METHODS.
         *
         * It is a concrete implementation of the Deque interface.
         *
         * The main difference lies in its
         * internal implementation.
         *
         * Internally it uses:
         *
         * Circular Resizable Array
         *
         * It can work as both:
         *
         * ✔ Queue (FIFO)
         * ✔ Stack (LIFO)
         */


        /*
         * ==========================================================
         *          Basic ArrayDeque Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        ArrayDeque rawQueue = new ArrayDeque();

        rawQueue.add("Java");
        rawQueue.add(101);
        rawQueue.add(true);

        System.out.println("Raw ArrayDeque");

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

        ArrayDeque<String> languages =
                new ArrayDeque<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");

        System.out.println("ArrayDeque with Generics");

        System.out.println(languages);

        /*
         * Note
         *
         * Duplicate values are allowed.
         *
         * Insertion order is maintained.
         *
         * Null values are NOT allowed.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Queue Reference
        // ---------------------------------------------------------

        Queue<Integer> queue =
                new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue Reference");

        System.out.println(queue);

        System.out.println();


        // ---------------------------------------------------------
        // Deque Reference
        // ---------------------------------------------------------

        Deque<Integer> deque =
                new ArrayDeque<>();

        deque.addFirst(20);
        deque.addLast(40);
        deque.addFirst(10);
        deque.addLast(50);

        System.out.println("Deque Reference");

        System.out.println(deque);

        System.out.println();


        /*
         * ==========================================================
         *                 Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // ArrayDeque()
        // ---------------------------------------------------------

        ArrayDeque<Integer> numbers =
                new ArrayDeque<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("ArrayDeque()");

        System.out.println(numbers);

        System.out.println();


        // ---------------------------------------------------------
        // ArrayDeque(Collection)
        // ---------------------------------------------------------

        List<Integer> list =
                Arrays.asList(1, 2, 3, 4, 5);

        ArrayDeque<Integer> numbers2 =
                new ArrayDeque<>(list);

        System.out.println("ArrayDeque(Collection)");

        System.out.println(numbers2);

        System.out.println();


        /*
         * ==========================================================
         *          Duplicate Element Demonstration
         * ==========================================================
         */

        ArrayDeque<Integer> duplicateDemo =
                new ArrayDeque<>();

        duplicateDemo.add(10);
        duplicateDemo.add(20);
        duplicateDemo.add(10);
        duplicateDemo.add(30);
        duplicateDemo.add(20);

        System.out.println("Duplicate Demonstration");

        System.out.println(duplicateDemo);

        /*
         * Output
         *
         * 10
         * 20
         * 10
         * 30
         * 20
         *
         * Duplicate values are allowed.
         */

        System.out.println();


        /*
         * ==========================================================
         *            Null Element Demonstration
         * ==========================================================
         */

        ArrayDeque<String> nullDemo =
                new ArrayDeque<>();

//      nullDemo.add(null);

//      Exception:
//
//      java.lang.NullPointerException

        System.out.println("Null values are NOT allowed.");

        System.out.println();


        /*
         * ==========================================================
         *          FIFO (Queue) Demonstration
         * ==========================================================
         */

        ArrayDeque<Integer> fifo =
                new ArrayDeque<>();

        fifo.offer(10);
        fifo.offer(20);
        fifo.offer(30);
        fifo.offer(40);

        System.out.println("FIFO Demonstration");

        System.out.println("Queue : " + fifo);

        System.out.println("Removed : " + fifo.poll());

        System.out.println("After Removal : " + fifo);

        System.out.println();

        /*
         * ==========================================================
         *          LIFO (Stack) Demonstration
         * ==========================================================
         */

        ArrayDeque<Integer> stack =
                new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("LIFO Demonstration");

        System.out.println("Stack : " + stack);

        System.out.println("Pop : " + stack.pop());

        System.out.println("After Pop : " + stack);

        System.out.println();


        /*
         * ==========================================================
         *         Front and Rear Operations
         * ==========================================================
         */

        ArrayDeque<String> names =
                new ArrayDeque<>();

        names.addFirst("Rudra");
        names.addLast("Haya");
        names.offerFirst("Arman");
        names.offerLast("Khan");

        System.out.println("Front & Rear Operations");

        System.out.println(names);

        System.out.println("First : " + names.getFirst());

        System.out.println("Last : " + names.getLast());

        System.out.println("Peek First : " + names.peekFirst());

        System.out.println("Peek Last : " + names.peekLast());

        System.out.println();


        /*
         * ==========================================================
         *        Remove Operations
         * ==========================================================
         */

        System.out.println("removeFirst()");

        System.out.println(names.removeFirst());

        System.out.println(names);

        System.out.println();

        System.out.println("removeLast()");

        System.out.println(names.removeLast());

        System.out.println(names);

        System.out.println();


        /*
         * ==========================================================
         *         Poll Operations
         * ==========================================================
         */

        names.addFirst("A");
        names.addLast("B");
        names.addLast("C");

        System.out.println("pollFirst()");

        System.out.println(names.pollFirst());

        System.out.println(names);

        System.out.println();

        System.out.println("pollLast()");

        System.out.println(names.pollLast());

        System.out.println(names);

        System.out.println();


        /*
         * ==========================================================
         *      Remove First / Last Occurrence
         * ==========================================================
         */

        ArrayDeque<Integer> occurrence =
                new ArrayDeque<>();

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

        for (Integer value : duplicateDemo) {

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
                duplicateDemo.iterator();

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
                duplicateDemo.descendingIterator();

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
                duplicateDemo.spliterator();

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

        duplicateDemo.stream()
                .forEach(value ->
                        System.out.print(value + " "));

        System.out.println("\n");


        /*
         * ==========================================================
         *      Queue Behaviour vs Stack Behaviour
         * ==========================================================
         */

        ArrayDeque<Integer> demo =
                new ArrayDeque<>();

        demo.offer(10);
        demo.offer(20);
        demo.offer(30);

        System.out.println("Queue Behaviour");

        System.out.println(demo);

        System.out.println("poll() : " + demo.poll());

        System.out.println(demo);

        System.out.println();


        demo.clear();

        demo.push(10);
        demo.push(20);
        demo.push(30);

        System.out.println("Stack Behaviour");

        System.out.println(demo);

        System.out.println("pop() : " + demo.pop());

        System.out.println(demo);

        System.out.println();

        /*
         * ==========================================================
         *          Circular Array Behaviour
         * ==========================================================
         */

        ArrayDeque<Integer> circular =
                new ArrayDeque<>();

        circular.offer(10);
        circular.offer(20);
        circular.offer(30);
        circular.offer(40);

        System.out.println("Initial Queue");

        System.out.println(circular);

        circular.poll();
        circular.poll();

        circular.offer(50);
        circular.offer(60);

        System.out.println();

        System.out.println("After Removing Front Elements");

        System.out.println(circular);

        /*
         * Internally,
         * ArrayDeque reuses empty locations
         * using a Circular Array.
         */

        System.out.println();


        /*
         * ==========================================================
         *              Dynamic Resizing
         * ==========================================================
         */

        ArrayDeque<Integer> resize =
                new ArrayDeque<>();

        for (int i = 1; i <= 20; i++) {

            resize.offer(i);

        }

        System.out.println("Dynamic Resizing");

        System.out.println(resize);

        /*
         * Capacity automatically increases
         * whenever required.
         */

        System.out.println();


        /*
         * ==========================================================
         *              Queue Example
         * ==========================================================
         */

        ArrayDeque<String> ticketQueue =
                new ArrayDeque<>();

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
         *              Stack Example
         * ==========================================================
         */

        ArrayDeque<String> browserHistory =
                new ArrayDeque<>();

        browserHistory.push("Google");

        browserHistory.push("GitHub");

        browserHistory.push("ChatGPT");

        System.out.println("Browser History");

        while (!browserHistory.isEmpty()) {

            System.out.println(
                    "Back : "
                            + browserHistory.pop());

        }

        System.out.println();


        /*
         * ==========================================================
         *             Palindrome Demonstration
         * ==========================================================
         */

        String word = "LEVEL";

        ArrayDeque<Character> dequeWord =
                new ArrayDeque<>();

        for (char ch : word.toCharArray()) {

            dequeWord.addLast(ch);

        }

        boolean palindrome = true;

        while (dequeWord.size() > 1) {

            if (!dequeWord.removeFirst()
                    .equals(dequeWord.removeLast())) {

                palindrome = false;

                break;

            }

        }

        System.out.println("Palindrome Check");

        System.out.println(word + " : " + palindrome);

        System.out.println();


        /*
         * ==========================================================
         *              Performance Notes
         * ==========================================================
         */

        System.out.println("Performance");

        System.out.println(
                "Fast addFirst()");

        System.out.println(
                "Fast addLast()");

        System.out.println(
                "Fast removeFirst()");

        System.out.println(
                "Fast removeLast()");

        System.out.println(
                "No Index Based Access");

        System.out.println(
                "Uses Circular Resizable Array");

        System.out.println();


        /*
         * ==========================================================
         *                 Best Practices
         * ==========================================================
         */

        System.out.println("Best Practices");

        System.out.println(
                "✔ Use as Queue using offer()/poll().");

        System.out.println(
                "✔ Use as Stack using push()/pop().");

        System.out.println(
                "✔ Prefer ArrayDeque over Stack.");

        System.out.println(
                "✔ Prefer ArrayDeque over LinkedList for Deque operations.");

        System.out.println(
                "✔ Never insert null values.");

        System.out.println();


        /*
         * ==========================================================
         *                 Summary
         * ==========================================================
         */

        System.out.println("===== Summary =====");

        System.out.println(
                "Implementation : "
                        + duplicateDemo.getClass().getSimpleName());

        System.out.println(
                "Internal Structure : Circular Resizable Array");

        System.out.println(
                "Duplicate Allowed : Yes");

        System.out.println(
                "Null Allowed : No");

        System.out.println(
                "Insertion Order : Maintained");

        System.out.println(
                "Queue Support : Yes");

        System.out.println(
                "Stack Support : Yes");

        System.out.println(
                "Thread Safe : No");

        System.out.println(
                "Index Based Access : No");

        System.out.println(
                "ArrayDeque demonstration completed successfully.");
    }
}