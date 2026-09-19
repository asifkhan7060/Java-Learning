package E_Queue;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        // =====================================================
        // Collection Methods Available in Queue
        // =====================================================

        /*
            Since Queue extends Collection,
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
        // Queue Methods Demonstration
        // =====================================================

        Queue<Integer> queue = new LinkedList<>();

        // add()
        // Inserts an element into the Queue.
        // Throws exception if insertion fails.

        System.out.println("\nadd()");

        System.out.println("Before : " + queue);

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("After : " + queue);

        // offer()
        // Inserts an element into the Queue.
        // Returns false if insertion fails.

        System.out.println("\noffer()");

        System.out.println("Before : " + queue);

        queue.offer(40);
        queue.offer(50);

        System.out.println("After : " + queue);

        // add() vs offer()

        /*
            add()
                → Throws IllegalStateException
                  if insertion fails.

            offer()
                → Returns false
                  if insertion fails.

            For LinkedList Queue, both behave the same because LinkedList has no capacity restriction.
            Difference is visible only in capacity-restricted queues (e.g., ArrayBlockingQueue etc (given list below)).

            Difference Visible

            ✓ ArrayBlockingQueue
            ✓ LinkedBlockingQueue (bounded)
            ✓ LinkedBlockingDeque (bounded)
            ✓ SynchronousQueue

            ex: Queue<Integer> queue = new ArrayBlockingQueue<>(3);
                queue.add(1);
                queue.add(2);
                queue.add(3);

                queue.add(4);      // ❌ IllegalStateException

                queue.offer(4);    // ❌ false
         */

        // remove()
        // Removes and returns the head element.

        System.out.println("\nremove()");

        System.out.println("Before : " + queue);

        System.out.println("Removed : " + queue.remove());

        System.out.println("After : " + queue);

        // remove() on Empty Queue

        Queue<Integer> emptyQueue = new LinkedList<>();

        System.out.println("\nremove() on Empty Queue");

        try {

            emptyQueue.remove();

        } catch (NoSuchElementException e) {

            System.out.println(e);

        }

        // poll()
        // Removes and returns the head element.
        // Returns null if the Queue is empty.

        System.out.println("\npoll()");

        System.out.println("Before : " + queue);

        System.out.println("Removed : " + queue.poll());

        System.out.println("After : " + queue);

        // poll() on Empty Queue

        System.out.println("\npoll() on Empty Queue");

        System.out.println(emptyQueue.poll());

        // remove() vs poll()

        /*
            remove()
                → Throws NoSuchElementException
                  if Queue is empty.

            poll()
                → Returns null
                  if Queue is empty.
         */


        // element()
        // Returns the head element.
        // Does not remove the element.
        // Throws exception if Queue is empty.

        System.out.println("\nelement()");

        System.out.println("Queue : " + queue);

        System.out.println("Head Element : "
                + queue.element());

        System.out.println("After element() : "
                + queue);

        // element() on Empty Queue

        System.out.println("\nelement() on Empty Queue");

        try {

            System.out.println(emptyQueue.element());

        } catch (NoSuchElementException e) {

            System.out.println(e);

        }

        // peek()
        // Returns the head element.
        // Does not remove the element.
        // Returns null if Queue is empty.

        System.out.println("\npeek()");

        System.out.println("Queue : " + queue);

        System.out.println("Head Element : "
                + queue.peek());

        System.out.println("After peek() : "
                + queue);

        // peek() on Empty Queue

        System.out.println("\npeek() on Empty Queue");

        System.out.println(emptyQueue.peek());

        // element() vs peek()

        /*
            element()
                → Throws NoSuchElementException
                  if Queue is empty.

            peek()
                → Returns null
                  if Queue is empty.
         */

        // =====================================================
        // Queue using Different Implementations
        // =====================================================

        // LinkedList

        Queue<Integer> linkedListQueue =
                new LinkedList<>();

        linkedListQueue.offer(10);
        linkedListQueue.offer(20);
        linkedListQueue.offer(30);

        System.out.println("\nLinkedList Queue");

        System.out.println(linkedListQueue);

        // PriorityQueue

        Queue<Integer> priorityQueue =
                new PriorityQueue<>();

        priorityQueue.offer(40);
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(20);

        System.out.println("\nPriorityQueue");

        System.out.println(priorityQueue);

        /*
            Note

            LinkedList
                → Maintains insertion order.

            PriorityQueue
                → Maintains priority order (Natural Ordering by default).
         */

        // =====================================================
        // Ways to Traverse a Queue
        // =====================================================

        Queue<Integer> traverseQueue = new LinkedList<>();

        traverseQueue.offer(10);
        traverseQueue.offer(20);
        traverseQueue.offer(30);
        traverseQueue.offer(40);
        traverseQueue.offer(50);

        System.out.println("\nTraversal Queue : " + traverseQueue);

        // =====================================================
        // Enhanced For Loop
        // =====================================================

        System.out.println("\nUsing Enhanced For Loop");

        for (Integer value : traverseQueue) {

            System.out.println(value);

        }

        // =====================================================
        // Using Iterator
        // =====================================================

        System.out.println("\nUsing Iterator");

        Iterator<Integer> iterator = traverseQueue.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        // =====================================================
        // Using Spliterator
        // =====================================================

        System.out.println("\nUsing Spliterator");

        Spliterator<Integer> spliterator = traverseQueue.spliterator();

        spliterator.forEachRemaining(System.out::println);

        // =====================================================
        // Using Stream
        // =====================================================

        System.out.println("\nUsing Stream");

        traverseQueue.stream().forEach(System.out::println);

        // =====================================================
        // Important Notes
        // =====================================================

        /*
            1. Queue follows FIFO
               (First In First Out).

            2. Null elements are not allowed
               in most Queue implementations.

            3. Queue is an interface.

            4. Common implementations are

               LinkedList
               PriorityQueue
               ArrayDeque

            5. BlockingQueue provides
               thread-safe Queue operations.

            6. Deque extends Queue and
               supports insertion and
               deletion from both ends.
         */

    }

}
