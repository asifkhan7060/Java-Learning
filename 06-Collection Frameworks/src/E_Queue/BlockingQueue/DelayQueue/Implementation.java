package E_Queue.BlockingQueue.DelayQueue;

import java.util.*;
import java.util.concurrent.*;

// In Which areas DelayQueue class is used ?
// Hold Ctrl and move cursor to DelayQueue keyword -> Go to that file.
// Hold Ctrl again on DelayQueue -> Click -> Change search to
// "All Places" to explore where DelayQueue is used.

public class Implementation {

    /*
     * ==========================================================
     *              Custom Delayed Object
     * ==========================================================
     */

    static class Task implements Delayed {

        private final String name;
        private final long endTime;

        public Task(String name, long delay) {

            this.name = name;

            this.endTime =
                    System.currentTimeMillis() + delay;

        }

        @Override
        public long getDelay(TimeUnit unit) {

            long remaining =
                    endTime - System.currentTimeMillis();

            return unit.convert(
                    remaining,
                    TimeUnit.MILLISECONDS);

        }

        @Override
        public int compareTo(Delayed other) {

            return Long.compare(
                    this.getDelay(TimeUnit.MILLISECONDS),
                    other.getDelay(TimeUnit.MILLISECONDS));

        }

        @Override
        public String toString() {

            return name;

        }

    }

    public static void main(String[] args)
            throws InterruptedException {

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
         * DelayQueue introduces NO NEW PUBLIC METHODS.
         *
         * It is the concrete implementation of
         * BlockingQueue.
         *
         * Internally it uses:
         *
         * Priority Queue (Binary Min Heap)
         *
         * Features:
         *
         * ✔ Thread Safe
         * ✔ Unbounded Queue
         * ✔ Delay Based Ordering
         * ✔ Blocking Retrieval
         * ✔ Delayed Elements Only
         * ✔ Duplicate Elements Allowed
         * ✔ Null Values NOT Allowed
         */


        /*
         * ==========================================================
         *          Basic DelayQueue Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type
        // ---------------------------------------------------------

        DelayQueue rawQueue =
                new DelayQueue();

        rawQueue.offer(
                new Task("Java", 1000));

        rawQueue.offer(
                new Task("Spring", 2000));

        System.out.println("Raw DelayQueue");

        System.out.println(rawQueue);

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        DelayQueue<Task> tasks =
                new DelayQueue<>();

        tasks.offer(
                new Task("Task-1", 3000));

        tasks.offer(
                new Task("Task-2", 1000));

        tasks.offer(
                new Task("Task-3", 2000));

        System.out.println("DelayQueue with Generics");

        System.out.println(tasks);

        /*
         * Note
         *
         * Elements are ordered
         * according to delay expiration.
         */

        System.out.println();


        // ---------------------------------------------------------
        // BlockingQueue Reference
        // ---------------------------------------------------------

        BlockingQueue<Task> queue =
                new DelayQueue<>();

        queue.offer(
                new Task("Download", 1500));

        queue.offer(
                new Task("Upload", 500));

        System.out.println("BlockingQueue Reference");

        System.out.println(queue);

        System.out.println();


        /*
         * ==========================================================
         *                 Constructor
         * ==========================================================
         */

        DelayQueue<Task> queue1 =
                new DelayQueue<>();

        queue1.offer(
                new Task("Email", 1000));

        queue1.offer(
                new Task("SMS", 2000));

        System.out.println("DelayQueue()");

        System.out.println(queue1);

        System.out.println();


        /*
         * ==========================================================
         *         Delayed Object Demonstration
         * ==========================================================
         */

        DelayQueue<Task> delayed =
                new DelayQueue<>();

        delayed.offer(
                new Task("Short Delay", 1000));

        delayed.offer(
                new Task("Medium Delay", 3000));

        delayed.offer(
                new Task("Long Delay", 5000));

        System.out.println("Delayed Objects");

        System.out.println(delayed);

        System.out.println();


        /*
         * ==========================================================
         *        Duplicate & Null Demonstration
         * ==========================================================
         */

        DelayQueue<Task> duplicate =
                new DelayQueue<>();

        duplicate.offer(
                new Task("Java", 1000));

        duplicate.offer(
                new Task("Java", 1000));

        System.out.println("Duplicate Demonstration");

        System.out.println(duplicate);

        System.out.println();

//      duplicate.offer(null);
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

        DelayQueue<Task> queue2 =
                new DelayQueue<>();

        queue2.put(new Task("Java", 2000));

        queue2.put(new Task("Spring", 1000));

        queue2.put(new Task("Hibernate", 3000));

        System.out.println("put()");

        System.out.println(queue2);

        System.out.println();


        /*
         * ==========================================================
         *                 offer()
         * ==========================================================
         */

        DelayQueue<Task> queue3 =
                new DelayQueue<>();

        queue3.offer(new Task("Task-A", 4000));

        queue3.offer(new Task("Task-B", 1000));

        queue3.offer(new Task("Task-C", 2000));

        System.out.println("offer()");

        System.out.println(queue3);

        System.out.println();


        /*
         * ==========================================================
         *                  take()
         * ==========================================================
         */

        DelayQueue<Task> queue4 =
                new DelayQueue<>();

        queue4.offer(new Task("One", 1000));

        queue4.offer(new Task("Two", 3000));

        queue4.offer(new Task("Three", 2000));

        System.out.println("take()");

        while (!queue4.isEmpty()) {

            System.out.println(
                    queue4.take());

        }

        System.out.println();


        /*
         * ==========================================================
         *                  poll()
         * ==========================================================
         */

        DelayQueue<Task> queue5 =
                new DelayQueue<>();

        queue5.offer(new Task("Immediate", 500));

        Thread.sleep(700);

        System.out.println("poll()");

        System.out.println(
                queue5.poll());

        System.out.println(queue5);

        System.out.println();


        /*
         * ==========================================================
         *             poll(timeout)
         * ==========================================================
         */

        DelayQueue<Task> queue6 =
                new DelayQueue<>();

        queue6.offer(new Task("Database", 1500));

        System.out.println("poll(timeout)");

        System.out.println(
                queue6.poll(
                        2,
                        TimeUnit.SECONDS));

        System.out.println(queue6);

        System.out.println();


        /*
         * ==========================================================
         *                  peek()
         * ==========================================================
         */

        DelayQueue<Task> queue7 =
                new DelayQueue<>();

        queue7.offer(new Task("Task-X", 3000));

        queue7.offer(new Task("Task-Y", 1000));

        System.out.println("peek()");

        System.out.println(
                queue7.peek());

        System.out.println();


        /*
         * ==========================================================
         *           remainingCapacity()
         * ==========================================================
         */

        System.out.println("remainingCapacity()");

        System.out.println(
                queue7.remainingCapacity());

        /*
         * DelayQueue is unbounded.
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

        DelayQueue<Task> queue8 =
                new DelayQueue<>();

        queue8.offer(new Task("A", 100));

        queue8.offer(new Task("B", 100));

        Thread.sleep(300);

        List<Task> completed =
                new ArrayList<>();

        queue8.drainTo(completed);

        System.out.println("drainTo()");

        System.out.println(
                "Queue : " + queue8);

        System.out.println(
                "List : " + completed);

        System.out.println();


        /*
         * ==========================================================
         *        drainTo(Collection, maxElements)
         * ==========================================================
         */

        DelayQueue<Task> queue9 =
                new DelayQueue<>();

        queue9.offer(new Task("T1", 100));

        queue9.offer(new Task("T2", 100));

        queue9.offer(new Task("T3", 100));

        Thread.sleep(300);

        List<Task> list =
                new ArrayList<>();

        queue9.drainTo(list, 2);

        System.out.println("drainTo(maxElements)");

        System.out.println(
                "Queue : " + queue9);

        System.out.println(
                "List : " + list);

        System.out.println();


        /*
         * ==========================================================
         *             Enhanced For Loop
         * ==========================================================
         */

        DelayQueue<Task> traversal =
                new DelayQueue<>();

        traversal.offer(new Task("A", 5000));

        traversal.offer(new Task("B", 2000));

        traversal.offer(new Task("C", 3000));

        System.out.println("Enhanced For Loop");

        for (Task task : traversal) {

            System.out.print(task + " ");

        }

        System.out.println("\n");


        /*
         * ==========================================================
         *                  Iterator
         * ==========================================================
         */

        System.out.println("Iterator");

        Iterator<Task> iterator =
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

        Spliterator<Task> spliterator =
                traversal.spliterator();

        spliterator.forEachRemaining(
                task -> System.out.print(task + " ")
        );

        System.out.println("\n");


        /*
         * ==========================================================
         *                  Stream API
         * ==========================================================
         */

        System.out.println("Stream");

        traversal.stream()
                .forEach(task ->
                        System.out.print(task + " "));

        System.out.println("\n");

        /*
         * ==========================================================
         *          Delay Expiration Demonstration
         * ==========================================================
         */

        DelayQueue<Task> delayDemo =
                new DelayQueue<>();

        delayDemo.offer(new Task("Task-1", 1000));

        delayDemo.offer(new Task("Task-2", 3000));

        delayDemo.offer(new Task("Task-3", 2000));

        System.out.println("Delay Expiration");

        while (!delayDemo.isEmpty()) {

            System.out.println(
                    "Executed : "
                            + delayDemo.take());

        }

        System.out.println();


        /*
         * ==========================================================
         *          Producer Consumer Demonstration
         * ==========================================================
         */

        DelayQueue<Task> sharedQueue =
                new DelayQueue<>();

        Thread producer = new Thread(() -> {

            sharedQueue.offer(
                    new Task("Email", 1000));

            sharedQueue.offer(
                    new Task("SMS", 2000));

            sharedQueue.offer(
                    new Task("Notification", 3000));

            System.out.println("Producer Finished");

        });

        Thread consumer = new Thread(() -> {

            try {

                while (true) {

                    Task task = sharedQueue.take();

                    System.out.println(
                            "Processed : "
                                    + task);

                    if (sharedQueue.isEmpty())
                        break;

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
         *          Task Scheduler Example
         * ==========================================================
         */

        DelayQueue<Task> scheduler =
                new DelayQueue<>();

        scheduler.offer(
                new Task("Database Backup", 3000));

        scheduler.offer(
                new Task("Generate Report", 1000));

        scheduler.offer(
                new Task("Send Email", 2000));

        System.out.println("Task Scheduler");

        while (!scheduler.isEmpty()) {

            System.out.println(
                    "Executing : "
                            + scheduler.take());

        }

        System.out.println();


        /*
         * ==========================================================
         *           Download Manager Example
         * ==========================================================
         */

        DelayQueue<Task> downloads =
                new DelayQueue<>();

        downloads.offer(
                new Task("Image.zip", 1000));

        downloads.offer(
                new Task("Video.mp4", 2500));

        downloads.offer(
                new Task("Document.pdf", 1500));

        System.out.println("Download Queue");

        while (!downloads.isEmpty()) {

            System.out.println(
                    "Downloaded : "
                            + downloads.take());

        }

        System.out.println();


        /*
         * ==========================================================
         *            Delayed Message Example
         * ==========================================================
         */

        DelayQueue<Task> messages =
                new DelayQueue<>();

        messages.offer(
                new Task("OTP", 1000));

        messages.offer(
                new Task("Welcome Mail", 3000));

        messages.offer(
                new Task("Reminder", 2000));

        System.out.println("Delayed Messages");

        while (!messages.isEmpty()) {

            System.out.println(
                    "Sent : "
                            + messages.take());

        }

        System.out.println();


        /*
         * ==========================================================
         *             Performance Notes
         * ==========================================================
         */

        System.out.println("Performance");

        System.out.println(
                "Internal Structure : Priority Queue");

        System.out.println(
                "Ordering : Delay Expiration");

        System.out.println(
                "Insertion : O(log n)");

        System.out.println(
                "Removal : O(log n)");

        System.out.println(
                "Peek : O(1)");

        System.out.println(
                "Blocking Retrieval");

        System.out.println(
                "Thread Safe");

        System.out.println();


        /*
         * ==========================================================
         *               Best Practices
         * ==========================================================
         */

        System.out.println("Best Practices");

        System.out.println(
                "✔ Use for delayed task execution.");

        System.out.println(
                "✔ Implement Delayed correctly.");

        System.out.println(
                "✔ Use take() for automatic waiting.");

        System.out.println(
                "✔ Use DelayQueue for schedulers.");

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
                        + queue1.getClass().getSimpleName());

        System.out.println(
                "Internal Structure : Priority Queue");

        System.out.println(
                "Thread Safe : Yes");

        System.out.println(
                "Blocking Retrieval : Yes");

        System.out.println(
                "Delay Based Ordering : Yes");

        System.out.println(
                "Bounded : No");

        System.out.println(
                "Duplicate Elements : Allowed");

        System.out.println(
                "Null Elements : Not Allowed");

        System.out.println(
                "Delayed Objects Only : Yes");

        System.out.println(
                "DelayQueue demonstration completed successfully.");
    }
}

