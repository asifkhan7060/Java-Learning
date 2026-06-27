package E_Queue.BlockingQueue.SynchronousQueue;

import java.util.*;
import java.util.concurrent.*;

// In Which areas SynchronousQueue class is used ?
// Hold Ctrl and move cursor to SynchronousQueue keyword -> Go to that file.
// Hold Ctrl again on SynchronousQueue -> Click -> Change search to
// "All Places" to explore where SynchronousQueue is used.

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
         * SynchronousQueue introduces NO NEW PUBLIC METHODS.
         *
         * It is the concrete implementation of
         * BlockingQueue.
         *
         * Internally it uses:
         *
         * Direct Thread-to-Thread Handoff
         *
         * Features:
         *
         * ✔ Thread Safe
         * ✔ Zero Capacity
         * ✔ Direct Producer → Consumer Transfer
         * ✔ Blocking Operations
         * ✔ Fair / Non-Fair Mode
         * ✔ No Internal Storage
         * ✔ Null Values NOT Allowed
         */


        /*
         * ==========================================================
         *      Basic SynchronousQueue Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        SynchronousQueue rawQueue =
                new SynchronousQueue();

        System.out.println("Raw SynchronousQueue");

        System.out.println(rawQueue);

        /*
         * Note
         *
         * Elements cannot remain
         * inside SynchronousQueue.
         *
         * Every insertion requires
         * a waiting consumer.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        SynchronousQueue<String> queue =
                new SynchronousQueue<>();

        System.out.println("SynchronousQueue with Generics");

        System.out.println(queue);

        System.out.println();


        // ---------------------------------------------------------
        // BlockingQueue Reference
        // ---------------------------------------------------------

        BlockingQueue<Integer> blockingQueue =
                new SynchronousQueue<>();

        System.out.println("BlockingQueue Reference");

        System.out.println(blockingQueue);

        System.out.println();


        /*
         * ==========================================================
         *                 Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // SynchronousQueue()
        // ---------------------------------------------------------

        SynchronousQueue<Integer> queue1 =
                new SynchronousQueue<>();

        System.out.println("SynchronousQueue()");

        System.out.println(queue1);

        System.out.println();


        // ---------------------------------------------------------
        // SynchronousQueue(boolean fair)
        // ---------------------------------------------------------

        SynchronousQueue<Integer> fairQueue =
                new SynchronousQueue<>(true);

        SynchronousQueue<Integer> nonFairQueue =
                new SynchronousQueue<>(false);

        System.out.println("Fair Queue");

        System.out.println(fairQueue);

        System.out.println();

        System.out.println("Non-Fair Queue");

        System.out.println(nonFairQueue);

        System.out.println();


        /*
         * ==========================================================
         *      Direct Handoff Demonstration
         * ==========================================================
         */

        SynchronousQueue<String> handoff1 =
                new SynchronousQueue<>();

        Thread consumer1 = new Thread(() -> {

            try {

                System.out.println(
                        "Consumer Waiting...");

                System.out.println(
                        "Received : "
                                + handoff1.take());

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        consumer1.start();

        Thread.sleep(1000);

        handoff1.put("Java");

        consumer1.join();

        System.out.println();


        /*
         * ==========================================================
         *       Fair vs Non-Fair Demonstration
         * ==========================================================
         */

        System.out.println("Fair Queue");

        System.out.println(
                "Processes waiting threads in FIFO order.");

        System.out.println();

        System.out.println("Non-Fair Queue");

        System.out.println(
                "Thread scheduling is optimized for performance.");

        System.out.println();


        /*
         * ==========================================================
         *             Null Demonstration
         * ==========================================================
         */

//      queue.offer(null);
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

        SynchronousQueue<String> queue2 =
                new SynchronousQueue<>();

        Thread consumer9 = new Thread(() -> {

            try {

                Thread.sleep(1000);

                System.out.println(
                        "Received : "
                                + queue2.take());

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        consumer1.start();

        System.out.println("put()");

        queue2.put("Java");

        consumer1.join();

        System.out.println("Transfer Completed");

        System.out.println();


        /*
         * ==========================================================
         *                  take()
         * ==========================================================
         */

        SynchronousQueue<String> queue3 =
                new SynchronousQueue<>();

        Thread producer1 = new Thread(() -> {

            try {

                Thread.sleep(1000);

                queue3.put("Spring");

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        producer1.start();

        System.out.println("take()");

        System.out.println(
                queue3.take());

        producer1.join();

        System.out.println();


        /*
         * ==========================================================
         *                  offer()
         * ==========================================================
         */

        SynchronousQueue<Integer> queue4 =
                new SynchronousQueue<>();

        System.out.println("offer()");

        System.out.println(
                queue4.offer(100));

        /*
         * No waiting consumer.
         *
         * Returns false.
         */

        System.out.println();


        /*
         * ==========================================================
         *             offer(timeout)
         * ==========================================================
         */

        SynchronousQueue<String> queue5 =
                new SynchronousQueue<>();

        Thread consumer2 = new Thread(() -> {

            try {

                Thread.sleep(1000);

                System.out.println(
                        "Received : "
                                + queue5.take());

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        consumer2.start();

        System.out.println("offer(timeout)");

        System.out.println(
                queue5.offer(
                        "Hibernate",
                        3,
                        TimeUnit.SECONDS));

        consumer2.join();

        System.out.println();


        /*
         * ==========================================================
         *                  poll()
         * ==========================================================
         */

        SynchronousQueue<Integer> queue6 =
                new SynchronousQueue<>();

        System.out.println("poll()");

        System.out.println(
                queue6.poll());

        /*
         * No producer available.
         *
         * Returns null.
         */

        System.out.println();


        /*
         * ==========================================================
         *              poll(timeout)
         * ==========================================================
         */

        SynchronousQueue<String> queue7 =
                new SynchronousQueue<>();

        Thread producer2 = new Thread(() -> {

            try {

                Thread.sleep(1000);

                queue7.put("Database");

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        producer2.start();

        System.out.println("poll(timeout)");

        System.out.println(
                queue7.poll(
                        3,
                        TimeUnit.SECONDS));

        producer2.join();

        System.out.println();


        /*
         * ==========================================================
         *                  peek()
         * ==========================================================
         */

        System.out.println("peek()");

        System.out.println(
                queue7.peek());

        /*
         * Always returns null.
         *
         * SynchronousQueue never stores elements.
         */

        System.out.println();


        /*
         * ==========================================================
         *          remainingCapacity()
         * ==========================================================
         */

        System.out.println("remainingCapacity()");

        System.out.println(
                queue7.remainingCapacity());

        /*
         * Always returns 0.
         */

        System.out.println();


        /*
         * ==========================================================
         *                 drainTo()
         * ==========================================================
         */

        List<String> list1 =
                new ArrayList<>();

        System.out.println("drainTo()");

        System.out.println(
                queue7.drainTo(list1));

        System.out.println(
                "List : " + list1);

        System.out.println();


        /*
         * ==========================================================
         *        Enhanced For Loop
         * ==========================================================
         */

        System.out.println("Enhanced For Loop");

        for (String value : queue7) {

            System.out.print(value + " ");

        }

        /*
         * Queue is always empty.
         */

        System.out.println("\n");


        /*
         * ==========================================================
         *                  Iterator
         * ==========================================================
         */

        System.out.println("Iterator");

        Iterator<String> iterator =
                queue7.iterator();

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

        Spliterator<String> spliterator =
                queue7.spliterator();

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

        queue7.stream()
                .forEach(value ->
                        System.out.print(value + " "));

        System.out.println("\n");

        /*
         * ==========================================================
         *          Producer Consumer Demonstration
         * ==========================================================
         */

        SynchronousQueue<String> sharedQueue =
                new SynchronousQueue<>();

        Thread producer = new Thread(() -> {

            try {

                System.out.println("Producer : Java");

                sharedQueue.put("Java");

                System.out.println("Producer : Spring");

                sharedQueue.put("Spring");

                System.out.println("Producer : Hibernate");

                sharedQueue.put("Hibernate");

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        Thread consumer = new Thread(() -> {

            try {

                Thread.sleep(1000);

                for (int i = 1; i <= 3; i++) {

                    System.out.println(
                            "Consumer : "
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
         *      Direct Thread Handoff Demonstration
         * ==========================================================
         */

        SynchronousQueue<Integer> handoff =
                new SynchronousQueue<>();

        Thread sender = new Thread(() -> {

            try {

                System.out.println("Sending 100");

                handoff.put(100);

                System.out.println("Transfer Complete");

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        Thread receiver = new Thread(() -> {

            try {

                Thread.sleep(1500);

                System.out.println(
                        "Received : "
                                + handoff.take());

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        sender.start();

        receiver.start();

        sender.join();

        receiver.join();

        System.out.println();


        /*
         * ==========================================================
         *          Fair Queue Demonstration
         * ==========================================================
         */

        SynchronousQueue<String> fair =
                new SynchronousQueue<>(true);

        System.out.println("Fair Queue");

        System.out.println(
                "Waiting threads are served in FIFO order.");

        System.out.println();

        SynchronousQueue<String> nonFair =
                new SynchronousQueue<>(false);

        System.out.println("Non-Fair Queue");

        System.out.println(
                "Higher throughput but order is not guaranteed.");

        System.out.println();


        /*
         * ==========================================================
         *          Thread Pool Demonstration
         * ==========================================================
         */

        SynchronousQueue<String> tasks =
                new SynchronousQueue<>();

        Thread worker = new Thread(() -> {

            try {

                while (true) {

                    String task = tasks.take();

                    System.out.println(
                            "Executing : "
                                    + task);

                    if (task.equals("Exit"))
                        break;

                }

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        worker.start();

        tasks.put("Task-1");

        tasks.put("Task-2");

        tasks.put("Task-3");

        tasks.put("Exit");

        worker.join();

        System.out.println();


        /*
         * ==========================================================
         *            Queue Properties
         * ==========================================================
         */

        SynchronousQueue<Integer> properties =
                new SynchronousQueue<>();

        System.out.println("Properties");

        System.out.println(
                "Size : "
                        + properties.size());

        System.out.println(
                "Is Empty : "
                        + properties.isEmpty());

        System.out.println(
                "Peek : "
                        + properties.peek());

        System.out.println(
                "Remaining Capacity : "
                        + properties.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *              Performance Notes
         * ==========================================================
         */

        System.out.println("Performance");

        System.out.println(
                "Internal Structure : Direct Thread Handoff");

        System.out.println(
                "Capacity : 0");

        System.out.println(
                "Storage : None");

        System.out.println(
                "Thread Safe");

        System.out.println(
                "Blocking Operations Supported");

        System.out.println(
                "Fair / Non-Fair Mode");

        System.out.println();


        /*
         * ==========================================================
         *               Best Practices
         * ==========================================================
         */

        System.out.println("Best Practices");

        System.out.println(
                "✔ Use when direct producer-consumer communication is required.");

        System.out.println(
                "✔ Use put()/take() for synchronous handoff.");

        System.out.println(
                "✔ Use fair mode only when FIFO scheduling is required.");

        System.out.println(
                "✔ Prefer SynchronousQueue for thread pool task handoff.");

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
                "Internal Structure : Direct Thread Handoff");

        System.out.println(
                "Thread Safe : Yes");

        System.out.println(
                "Capacity : Zero");

        System.out.println(
                "Internal Storage : None");

        System.out.println(
                "Blocking Operations : Supported");

        System.out.println(
                "Fair Mode : Optional");

        System.out.println(
                "Null Elements : Not Allowed");

        System.out.println(
                "SynchronousQueue demonstration completed successfully.");
    }
}