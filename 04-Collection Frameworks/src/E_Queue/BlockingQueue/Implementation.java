package E_Queue.BlockingQueue;

import java.util.*;
import java.util.concurrent.*;

public class Implementation {

    public static void main(String[] args) throws InterruptedException {

        // =====================================================
        // Collection Methods Available in BlockingQueue
        // =====================================================

        /*
            Since BlockingQueue extends Queue,
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
        // Queue Methods Available in BlockingQueue
        // =====================================================

        /*
            Since BlockingQueue extends Queue,
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
        // BlockingQueue Methods Demonstration
        // =====================================================

        BlockingQueue<Integer> queue =
                new ArrayBlockingQueue<>(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue : " + queue);

        // =====================================================
        // put()
        // =====================================================

        // Inserts an element.
        // Waits if the queue is full.

        System.out.println("\nput()");

        System.out.println("Before : " + queue);

        queue.put(40);

        System.out.println("After : " + queue);

        // =====================================================
        // offer(E, long, TimeUnit)
        // =====================================================

        // Inserts an element.
        // Waits for the specified time
        // if the queue is full.

        System.out.println("\noffer(E, long, TimeUnit)");

        System.out.println("Before : " + queue);

        boolean inserted =
                queue.offer(50, 2, TimeUnit.SECONDS);

        System.out.println("Inserted : " + inserted);

        System.out.println("After : " + queue);

        // Trying to insert into a full queue.

        System.out.println("\nQueue Full Example");

        boolean result =
                queue.offer(60, 2, TimeUnit.SECONDS);

        System.out.println("Inserted : " + result);

        System.out.println("Queue : " + queue);

        // =====================================================
        // take()
        // =====================================================

        // Removes and returns the head element.
        // Waits if the queue is empty.

        System.out.println("\ntake()");

        System.out.println("Before : " + queue);

        System.out.println("Removed : "
                + queue.take());

        System.out.println("After : " + queue);

        // =====================================================
        // poll(long, TimeUnit)
        // =====================================================

        // Removes and returns the head element.
        // Waits for the specified time if the queue is empty.

        System.out.println("\npoll(long, TimeUnit)");

        System.out.println("Before : " + queue);

        Integer value1 =
                queue.poll(2, TimeUnit.SECONDS);

        System.out.println("Removed : " + value1);

        System.out.println("After : " + queue);

        // =====================================================
        // remainingCapacity()
        // =====================================================

        // Returns the number of additional elements
        // that the queue can accept.

        System.out.println("\nremainingCapacity()");

        System.out.println("Queue : " + queue);

        System.out.println("Remaining Capacity : "
                + queue.remainingCapacity());

        // =====================================================
        // drainTo(Collection)
        // =====================================================

        // Removes all available elements
        // and transfers them to another Collection.

        BlockingQueue<Integer> queue1 =
                new ArrayBlockingQueue<>(10);

        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        queue1.add(50);

        List<Integer> list = new ArrayList<>();

        System.out.println("\ndrainTo(Collection)");

        System.out.println("Before Queue : " + queue1);
        System.out.println("Before List  : " + list);

        queue1.drainTo(list);

        System.out.println("After Queue  : " + queue1);
        System.out.println("After List   : " + list);

        // =====================================================
        // drainTo(Collection, int)
        // =====================================================

        // Removes at most the specified number
        // of elements and transfers them to another Collection.

        BlockingQueue<Integer> queue2 =
                new ArrayBlockingQueue<>(10);

        queue2.add(100);
        queue2.add(200);
        queue2.add(300);
        queue2.add(400);
        queue2.add(500);

        List<Integer> anotherList =
                new ArrayList<>();

        System.out.println("\ndrainTo(Collection, int)");

        System.out.println("Before Queue : " + queue2);
        System.out.println("Before List  : " + anotherList);

        queue2.drainTo(anotherList, 3);

        System.out.println("After Queue  : " + queue2);
        System.out.println("After List   : " + anotherList);

        // =====================================================
        // Different BlockingQueue Implementations
        // =====================================================

        // ArrayBlockingQueue
        // Fixed-capacity BlockingQueue.

        BlockingQueue<Integer> arrayQueue =
                new ArrayBlockingQueue<>(5);

        arrayQueue.add(10);
        arrayQueue.add(20);
        arrayQueue.add(30);

        System.out.println("\nArrayBlockingQueue");

        System.out.println(arrayQueue);

        // LinkedBlockingQueue
        // Linked-node based BlockingQueue.

        BlockingQueue<Integer> linkedQueue =
                new LinkedBlockingQueue<>();

        linkedQueue.add(100);
        linkedQueue.add(200);
        linkedQueue.add(300);

        System.out.println("\nLinkedBlockingQueue");

        System.out.println(linkedQueue);

        // PriorityBlockingQueue
        // Elements are arranged according to priority.

        BlockingQueue<Integer> priorityQueue =
                new PriorityBlockingQueue<>();

        priorityQueue.add(40);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);

        System.out.println("\nPriorityBlockingQueue");

        System.out.println(priorityQueue);

        /*
            Note

            ArrayBlockingQueue
                → Fixed Capacity

            LinkedBlockingQueue
                → Dynamic Capacity

            PriorityBlockingQueue
                → Priority Ordering
         */

        // =====================================================
        // DelayQueue
        // =====================================================

        // Stores delayed elements.
        // Elements become available only
        // after their delay expires.

        System.out.println("\nDelayQueue");

        System.out.println(
                "Stores delayed elements.");

        System.out.println(
                "Requires elements to implement Delayed interface.");

        // =====================================================
        // SynchronousQueue
        // =====================================================

        // Has no internal storage.
        // Every insertion waits for
        // a corresponding removal.

        BlockingQueue<String> synchronousQueue =
                new SynchronousQueue<>();

        System.out.println("\nSynchronousQueue");

        System.out.println(
                "Internal Size : "
                        + synchronousQueue.size());

        System.out.println(
                "Stores no elements internally.");

        // =====================================================
        // LinkedTransferQueue
        // =====================================================

        // TransferQueue implementation.
        // Supports direct producer-consumer transfer.

        TransferQueue<Integer> transferQueue =
                new LinkedTransferQueue<>();

        transferQueue.add(10);
        transferQueue.add(20);
        transferQueue.add(30);

        System.out.println("\nLinkedTransferQueue");

        System.out.println(transferQueue);

        /*
            Note

            DelayQueue
                → Delayed processing

            SynchronousQueue
                → Direct thread handoff

            LinkedTransferQueue
                → High-performance transfer
         */

        // =====================================================
        // Ways to Traverse a BlockingQueue
        // =====================================================

        BlockingQueue<Integer> traverseQueue =
                new LinkedBlockingQueue<>();

        traverseQueue.add(10);
        traverseQueue.add(20);
        traverseQueue.add(30);
        traverseQueue.add(40);
        traverseQueue.add(50);

        System.out.println("\nTraversal Queue : "
                + traverseQueue);

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

        Iterator<Integer> iterator =
                traverseQueue.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        // =====================================================
        // Using Spliterator
        // =====================================================

        System.out.println("\nUsing Spliterator");

        Spliterator<Integer> spliterator =
                traverseQueue.spliterator();

        spliterator.forEachRemaining(System.out::println);

        // =====================================================
        // Using Stream
        // =====================================================

        System.out.println("\nUsing Stream");

        traverseQueue.stream()
                .forEach(System.out::println);

        // =====================================================
        // Additional BlockingQueue Methods
        // =====================================================

        /*
            TransferQueue extends BlockingQueue
            and introduces additional methods.

            transfer(E)

            tryTransfer(E)

            tryTransfer(E, long, TimeUnit)

            hasWaitingConsumer()

            getWaitingConsumerCount()

            These methods are demonstrated
            in the TransferQueue topic.
         */

        // =====================================================
        // Important Notes
        // =====================================================

        /*
            1. BlockingQueue is thread-safe.

            2. Null elements are not allowed.

            3. BlockingQueue supports
               Producer-Consumer architecture.

            4. put() waits if the queue is full.

            5. take() waits if the queue is empty.

            6. TransferQueue extends
               BlockingQueue.
         */

        // =====================================================
        // BlockingQueue Summary
        // =====================================================

        /*
            Queue Methods

            add()
            offer()

            remove()
            poll()

            element()
            peek()

            -------------------------

            BlockingQueue Methods

            put()

            take()

            offer(E, long, TimeUnit)

            poll(long, TimeUnit)

            remainingCapacity()

            drainTo(Collection)

            drainTo(Collection, int)
         */

        // =====================================================
        // Best Practices
        // =====================================================

        /*
            ✔ Use put()
              instead of add()
              in concurrent applications.

            ✔ Use take()
              instead of remove()
              when consumers should wait.

            ✔ Use offer(timeout)
              when indefinite waiting
              is undesirable.

            ✔ Use LinkedBlockingQueue
              for general Producer-Consumer
              applications.

            ✔ Use ArrayBlockingQueue
              when capacity should be fixed.

            ✔ Use PriorityBlockingQueue
              for priority scheduling.

            ✔ Use DelayQueue
              for delayed task execution.

            ✔ Use SynchronousQueue
              for direct thread handoff.

            ✔ Use LinkedTransferQueue
              for high-throughput messaging.
         */

    }

}