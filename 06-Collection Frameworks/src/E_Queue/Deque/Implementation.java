package E_Queue.Deque;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Implementation {

    public static void main(String[] args) {

        // =====================================================
        // Collection Methods Available in Deque
        // =====================================================

        /*
            Since Deque extends Queue,
            all Collection methods are available.

            Already implemented in
            "Collection and Iterator" topic.

            add()
            addAll()

            remove()
            removeAll()
            removeIf()

            retainAll()

            contains()
            containsAll()

            size()
            isEmpty()

            clear()

            toArray()
            toArray(T[])
            toArray(IntFunction<T[]>)

            iterator()
            spliterator()

            stream()
            parallelStream()

            equals()
            hashCode()
         */

        // =====================================================
        // Queue Methods Available in Deque
        // =====================================================

        /*
            Since Deque extends Queue,
            all Queue methods are available.

            Already implemented in
            "Queue" topic.

            add()
            offer()

            remove()
            poll()

            element()
            peek()
         */

        // =====================================================
        // Deque Methods Demonstration
        // =====================================================

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(20);
        deque.add(30);
        deque.add(40);

        System.out.println("Original Deque : " + deque);

        // =====================================================
        // addFirst()
        // =====================================================

        // Inserts an element at the front.
        // Throws exception if insertion fails.

        System.out.println("\naddFirst()");

        System.out.println("Before : " + deque);

        deque.addFirst(10);

        System.out.println("After : " + deque);

        // =====================================================
        // addLast()
        // =====================================================

        // Inserts an element at the rear.
        // Throws exception if insertion fails.

        System.out.println("\naddLast()");

        System.out.println("Before : " + deque);

        deque.addLast(50);

        System.out.println("After : " + deque);

        // =====================================================
        // offerFirst()
        // =====================================================

        // Inserts an element at the front.
        // Returns false if insertion fails.

        System.out.println("\nofferFirst()");

        System.out.println("Before : " + deque);

        System.out.println(deque.offerFirst(5));

        System.out.println("After : " + deque);

        // =====================================================
        // offerLast()
        // =====================================================

        // Inserts an element at the rear.
        // Returns false if insertion fails.

        System.out.println("\nofferLast()");

        System.out.println("Before : " + deque);

        System.out.println(deque.offerLast(60));

        System.out.println("After : " + deque);

        // =====================================================
        // addFirst() vs offerFirst()
        // =====================================================

        /*
            addFirst()
                → Throws exception
                  if insertion fails.

            offerFirst()
                → Returns false
                  if insertion fails.
         */

        // =====================================================
        // addLast() vs offerLast()
        // =====================================================

        /*
            addLast()
                → Throws exception
                  if insertion fails.

            offerLast()
                → Returns false
                  if insertion fails.
         */

        // =====================================================
        // removeFirst()
        // =====================================================

        // Removes and returns
        // the first element.

        System.out.println("\nremoveFirst()");

        System.out.println("Before : " + deque);

        System.out.println("Removed : "
                + deque.removeFirst());

        System.out.println("After : " + deque);

        // =====================================================
        // removeLast()
        // =====================================================

        // Removes and returns
        // the last element.

        System.out.println("\nremoveLast()");

        System.out.println("Before : " + deque);

        System.out.println("Removed : "
                + deque.removeLast());

        System.out.println("After : " + deque);

        // =====================================================
        // removeFirst() on Empty Deque
        // =====================================================

        Deque<Integer> emptyDeque =
                new ArrayDeque<>();

        System.out.println("\nremoveFirst() on Empty Deque");

        try {

            emptyDeque.removeFirst();

        } catch (NoSuchElementException e) {

            System.out.println(e);

        }

        // =====================================================
        // removeLast() on Empty Deque
        // =====================================================

        System.out.println("\nremoveLast() on Empty Deque");

        try {

            emptyDeque.removeLast();

        } catch (NoSuchElementException e) {

            System.out.println(e);

        }

        // =====================================================
        // removeFirst() vs removeLast()
        // =====================================================

        /*
            removeFirst()
                → Removes the first element.

            removeLast()
                → Removes the last element.
         */

        // =====================================================
        // pollFirst()
        // =====================================================

        // Removes and returns
        // the first element.
        // Returns null if the Deque is empty.

        System.out.println("\npollFirst()");

        System.out.println("Before : " + deque);

        System.out.println("Removed : "
                + deque.pollFirst());

        System.out.println("After : " + deque);

        // =====================================================
        // pollLast()
        // =====================================================

        // Removes and returns
        // the last element.
        // Returns null if the Deque is empty.

        System.out.println("\npollLast()");

        System.out.println("Before : " + deque);

        System.out.println("Removed : "
                + deque.pollLast());

        System.out.println("After : " + deque);

        // =====================================================
        // pollFirst() on Empty Deque
        // =====================================================

        System.out.println("\npollFirst() on Empty Deque");

        System.out.println(emptyDeque.pollFirst());

        // =====================================================
        // pollLast() on Empty Deque
        // =====================================================

        System.out.println("\npollLast() on Empty Deque");

        System.out.println(emptyDeque.pollLast());

        // =====================================================
        // removeFirst() vs pollFirst()
        // =====================================================

        /*
            removeFirst()
                → Throws NoSuchElementException
                  if Deque is empty.

            pollFirst()
                → Returns null
                  if Deque is empty.
         */

        // =====================================================
        // removeLast() vs pollLast()
        // =====================================================

        /*
            removeLast()
                → Throws NoSuchElementException
                  if Deque is empty.

            pollLast()
                → Returns null
                  if Deque is empty.
         */

        // =====================================================
        // getFirst()
        // =====================================================

        // Returns the first element.
        // Does not remove the element.

        System.out.println("\ngetFirst()");

        System.out.println("Deque : " + deque);

        System.out.println("First Element : "
                + deque.getFirst());

        System.out.println("After getFirst() : "
                + deque);

        // =====================================================
        // getLast()
        // =====================================================

        // Returns the last element.
        // Does not remove the element.

        System.out.println("\ngetLast()");

        System.out.println("Deque : " + deque);

        System.out.println("Last Element : "
                + deque.getLast());

        System.out.println("After getLast() : "
                + deque);

        // =====================================================
        // getFirst() on Empty Deque
        // =====================================================

        System.out.println("\ngetFirst() on Empty Deque");

        try {

            System.out.println(emptyDeque.getFirst());

        } catch (NoSuchElementException e) {

            System.out.println(e);

        }

        // =====================================================
        // getLast() on Empty Deque
        // =====================================================

        System.out.println("\ngetLast() on Empty Deque");

        try {

            System.out.println(emptyDeque.getLast());

        } catch (NoSuchElementException e) {

            System.out.println(e);

        }

        // =====================================================
        // peekFirst()
        // =====================================================

        // Returns the first element.
        // Does not remove the element.
        // Returns null if the Deque is empty.

        System.out.println("\npeekFirst()");

        System.out.println("Deque : " + deque);

        System.out.println("First Element : "
                + deque.peekFirst());

        System.out.println("After peekFirst() : "
                + deque);

        // =====================================================
        // peekLast()
        // =====================================================

        // Returns the last element.
        // Does not remove the element.
        // Returns null if the Deque is empty.

        System.out.println("\npeekLast()");

        System.out.println("Deque : " + deque);

        System.out.println("Last Element : "
                + deque.peekLast());

        System.out.println("After peekLast() : "
                + deque);

        // =====================================================
        // peekFirst() on Empty Deque
        // =====================================================

        System.out.println("\npeekFirst() on Empty Deque");

        System.out.println(emptyDeque.peekFirst());

        // =====================================================
        // peekLast() on Empty Deque
        // =====================================================

        System.out.println("\npeekLast() on Empty Deque");

        System.out.println(emptyDeque.peekLast());

        // =====================================================
        // getFirst() vs peekFirst()
        // =====================================================

        /*
            getFirst()
                → Throws NoSuchElementException
                  if Deque is empty.

            peekFirst()
                → Returns null
                  if Deque is empty.
         */

        // =====================================================
        // getLast() vs peekLast()
        // =====================================================

        /*
            getLast()
                → Throws NoSuchElementException
                  if Deque is empty.

            peekLast()
                → Returns null
                  if Deque is empty.
         */

        // =====================================================
        // push()
        // =====================================================

        // Pushes an element onto the front.
        // Works like Stack.push().

        System.out.println("\npush()");

        System.out.println("Before : " + deque);

        deque.push(100);

        System.out.println("After : " + deque);

        // =====================================================
        // pop()
        // =====================================================

        // Removes and returns the first element.
        // Works like Stack.pop().

        System.out.println("\npop()");

        System.out.println("Before : " + deque);

        System.out.println("Removed : "
                + deque.pop());

        System.out.println("After : " + deque);

        // =====================================================
        // push() & pop()
        // =====================================================

        /*
            push()
                → Inserts element
                  at the front.

            pop()
                → Removes element
                  from the front.

            Used to implement
            Stack (LIFO) behavior.
         */

        // =====================================================
        // removeFirstOccurrence()
        // =====================================================

        // Removes the first occurrence
        // of the specified element.

        deque.clear();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(20);
        deque.add(40);

        System.out.println("\nremoveFirstOccurrence()");

        System.out.println("Before : " + deque);

        System.out.println("Removed : "
                + deque.removeFirstOccurrence(20));

        System.out.println("After : " + deque);

        // =====================================================
        // removeLastOccurrence()
        // =====================================================

        // Removes the last occurrence
        // of the specified element.

        deque.clear();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(20);
        deque.add(40);

        System.out.println("\nremoveLastOccurrence()");

        System.out.println("Before : " + deque);

        System.out.println("Removed : "
                + deque.removeLastOccurrence(20));

        System.out.println("After : " + deque);

        // =====================================================
        // descendingIterator()
        // =====================================================

        // Traverses the Deque
        // from rear to front.

        deque.clear();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        System.out.println("\ndescendingIterator()");

        Iterator<Integer> descendingIterator =
                deque.descendingIterator();

        while (descendingIterator.hasNext()) {

            System.out.println(
                    descendingIterator.next());

        }

        // =====================================================
        // reversed() (Java 21+)
        // =====================================================

        /*
            Returns a reversed view
            of the Deque.

            Available from Java 21.

            Example

            Deque<Integer> reverse =
                    deque.reversed();
         */

        // =====================================================
        // Ways to Traverse a Deque
        // =====================================================

        deque.clear();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        // =====================================================
        // Enhanced For Loop
        // =====================================================

        System.out.println("\nUsing Enhanced For Loop");

        for (Integer value : deque) {

            System.out.println(value);

        }

        // =====================================================
        // Using Iterator
        // =====================================================

        System.out.println("\nUsing Iterator");

        Iterator<Integer> iterator =
                deque.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        // =====================================================
        // Using Descending Iterator
        // =====================================================

        System.out.println("\nUsing Descending Iterator");

        Iterator<Integer> reverseIterator =
                deque.descendingIterator();

        while (reverseIterator.hasNext()) {

            System.out.println(reverseIterator.next());

        }

        // =====================================================
        // Using Spliterator
        // =====================================================

        System.out.println("\nUsing Spliterator");

        Spliterator<Integer> spliterator =
                deque.spliterator();

        spliterator.forEachRemaining(System.out::println);

        // =====================================================
        // Using Stream
        // =====================================================

        System.out.println("\nUsing Stream");

        deque.stream()
                .forEach(System.out::println);


    }

}