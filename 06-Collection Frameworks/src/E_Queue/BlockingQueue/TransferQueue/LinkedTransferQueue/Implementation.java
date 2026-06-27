package E_Queue.BlockingQueue.TransferQueue.LinkedTransferQueue;

import java.util.*;
import java.util.concurrent.*;

// In Which areas LinkedTransferQueue class is used ?
// Hold Ctrl and move cursor to LinkedTransferQueue keyword -> Go to that file.
// Hold Ctrl again on LinkedTransferQueue -> Click -> Change search to
// "All Places" to explore where LinkedTransferQueue is used.

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
         *      Methods Inherited from TransferQueue
         * ==========================================================
         */

        // Already implemented in TransferQueue topic

        // transfer(E e)
        // tryTransfer(E e)
        // tryTransfer(E e, long timeout, TimeUnit unit)
        //
        // hasWaitingConsumer()
        // getWaitingConsumerCount()


        /*
         * LinkedTransferQueue introduces NO NEW PUBLIC METHODS.
         *
         * It is the concrete implementation of
         * TransferQueue.
         *
         * Internally it uses:
         *
         * Linked Nodes (Lock-Free Algorithm)
         *
         * Features:
         *
         * ✔ Thread Safe
         * ✔ Unbounded Queue
         * ✔ Direct Producer → Consumer Transfer
         * ✔ Lock-Free Implementation
         * ✔ High Throughput
         * ✔ Duplicate Elements Allowed
         * ✔ Null Values NOT Allowed
         */


        /*
         * ==========================================================
         *      Basic LinkedTransferQueue Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        LinkedTransferQueue rawQueue =
                new LinkedTransferQueue();

        rawQueue.add("Java");
        rawQueue.add(100);
        rawQueue.add(true);

        System.out.println("Raw LinkedTransferQueue");

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

        LinkedTransferQueue<String> languages =
                new LinkedTransferQueue<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Spring");
        languages.add("Java");

        System.out.println("LinkedTransferQueue with Generics");

        System.out.println(languages);

        /*
         * Note
         *
         * Duplicate values are allowed.
         *
         * FIFO order is maintained.
         *
         * Null values are NOT allowed.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Queue Reference
        // ---------------------------------------------------------

        Queue<Integer> queue =
                new LinkedTransferQueue<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue Reference");

        System.out.println(queue);

        System.out.println();


        // ---------------------------------------------------------
        // BlockingQueue Reference
        // ---------------------------------------------------------

        BlockingQueue<Integer> blockingQueue =
                new LinkedTransferQueue<>();

        blockingQueue.put(100);
        blockingQueue.put(200);
        blockingQueue.put(300);

        System.out.println("BlockingQueue Reference");

        System.out.println(blockingQueue);

        System.out.println();


        // ---------------------------------------------------------
        // TransferQueue Reference
        // ---------------------------------------------------------

        TransferQueue<Integer> transferQueue1 =
                new LinkedTransferQueue<>();

        transferQueue1.offer(1000);
        transferQueue1.offer(2000);
        transferQueue1.offer(3000);

        System.out.println("TransferQueue Reference");

        System.out.println(transferQueue1);

        System.out.println();


        /*
         * ==========================================================
         *                 Constructor
         * ==========================================================
         */

        LinkedTransferQueue<Integer> numbers =
                new LinkedTransferQueue<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("LinkedTransferQueue()");

        System.out.println(numbers);

        System.out.println();


        /*
         * ==========================================================
         *       Unbounded Queue Demonstration
         * ==========================================================
         */

        LinkedTransferQueue<Integer> unbounded =
                new LinkedTransferQueue<>();

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
         *        Duplicate & Null Demonstration
         * ==========================================================
         */

        LinkedTransferQueue<Integer> duplicate =
                new LinkedTransferQueue<>();

        duplicate.add(10);
        duplicate.add(20);
        duplicate.add(10);
        duplicate.add(30);

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

        LinkedTransferQueue<Integer> queue1 =
                new LinkedTransferQueue<>();

        queue1.put(10);
        queue1.put(20);
        queue1.put(30);

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
         *              offer(timeout)
         * ==========================================================
         */

        LinkedTransferQueue<Integer> queue2 =
                new LinkedTransferQueue<>();

        boolean inserted =
                queue2.offer(
                        40,
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
         *              poll(timeout)
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

        LinkedTransferQueue<Integer> queue3 =
                new LinkedTransferQueue<>();

        queue3.add(10);
        queue3.add(20);

        System.out.println("remainingCapacity()");

        System.out.println(
                queue3.remainingCapacity());

        /*
         * LinkedTransferQueue is unbounded.
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
         *               transfer()
         * ==========================================================
         */

        TransferQueue<String> transferQueue =
                new LinkedTransferQueue<>();

        Thread consumer1 = new Thread(() -> {

            try {

                Thread.sleep(1000);

                System.out.println(
                        "Received : "
                                + transferQueue.take());

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        consumer1.start();

        System.out.println("transfer()");

        transferQueue.transfer("Java");

        consumer1.join();

        System.out.println("Transfer Completed");

        System.out.println();


        /*
         * ==========================================================
         *               tryTransfer()
         * ==========================================================
         */

        TransferQueue<String> queue4 =
                new LinkedTransferQueue<>();

        System.out.println("tryTransfer()");

        System.out.println(
                queue4.tryTransfer("Spring"));

        /*
         * No waiting consumer.
         *
         * Returns false.
         */

        System.out.println();


        /*
         * ==========================================================
         *          tryTransfer(timeout)
         * ==========================================================
         */

        TransferQueue<String> queue5 =
                new LinkedTransferQueue<>();

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

        System.out.println("tryTransfer(timeout)");

        System.out.println(
                queue5.tryTransfer(
                        "Hibernate",
                        3,
                        TimeUnit.SECONDS));

        consumer2.join();

        System.out.println();


        /*
         * ==========================================================
         *         hasWaitingConsumer()
         * ==========================================================
         */

        TransferQueue<Integer> queue6 =
                new LinkedTransferQueue<>();

        Thread waitingConsumer = new Thread(() -> {

            try {

                queue6.take();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        waitingConsumer.start();

        Thread.sleep(500);

        System.out.println("hasWaitingConsumer()");

        System.out.println(
                queue6.hasWaitingConsumer());

        queue6.put(100);

        waitingConsumer.join();

        System.out.println();


        /*
         * ==========================================================
         *      getWaitingConsumerCount()
         * ==========================================================
         */

        TransferQueue<Integer> queue7 =
                new LinkedTransferQueue<>();

        Thread consumer3 = new Thread(() -> {

            try {

                queue7.take();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        consumer3.start();

        Thread.sleep(500);

        System.out.println("Waiting Consumers");

        System.out.println(
                queue7.getWaitingConsumerCount());

        queue7.put(200);

        consumer3.join();

        System.out.println();


        /*
         * ==========================================================
         *                 drainTo()
         * ==========================================================
         */

        LinkedTransferQueue<Integer> queue8 =
                new LinkedTransferQueue<>();

        queue8.add(10);
        queue8.add(20);
        queue8.add(30);
        queue8.add(40);

        List<Integer> list1 =
                new ArrayList<>();

        queue8.drainTo(list1);

        System.out.println("drainTo()");

        System.out.println(
                "Queue : " + queue8);

        System.out.println(
                "List : " + list1);

        System.out.println();


        /*
         * ==========================================================
         *        drainTo(Collection, maxElements)
         * ==========================================================
         */

        queue8.add(100);
        queue8.add(200);
        queue8.add(300);
        queue8.add(400);

        List<Integer> list2 =
                new ArrayList<>();

        queue8.drainTo(list2, 2);

        System.out.println("drainTo(maxElements)");

        System.out.println(
                "Queue : " + queue8);

        System.out.println(
                "List : " + list2);

        System.out.println();


        /*
         * ==========================================================
         *             Enhanced For Loop
         * ==========================================================
         */

        System.out.println("Enhanced For Loop");

        for (Integer value : duplicate) {

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
                duplicate.iterator();

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
                duplicate.spliterator();

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

        duplicate.stream()
                .forEach(value ->
                        System.out.print(value + " "));

        System.out.println("\n");

        /*
         * ==========================================================
         *          Producer Consumer Demonstration
         * ==========================================================
         */

        LinkedTransferQueue<String> sharedQueue =
                new LinkedTransferQueue<>();

        Thread producer = new Thread(() -> {

            try {

                System.out.println("Producing : Java");
                sharedQueue.transfer("Java");

                System.out.println("Producing : Spring");
                sharedQueue.transfer("Spring");

                System.out.println("Producing : Hibernate");
                sharedQueue.transfer("Hibernate");

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        Thread consumer = new Thread(() -> {

            try {

                Thread.sleep(1000);

                for (int i = 1; i <= 3; i++) {

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
         *          Direct Transfer Demonstration
         * ==========================================================
         */

        LinkedTransferQueue<Integer> handoff =
                new LinkedTransferQueue<>();

        Thread receiver = new Thread(() -> {

            try {

                System.out.println(
                        "Waiting for data...");

                System.out.println(
                        "Received : "
                                + handoff.take());

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        receiver.start();

        Thread.sleep(1000);

        handoff.transfer(100);

        receiver.join();

        System.out.println();


        /*
         * ==========================================================
         *        Waiting Consumer Demonstration
         * ==========================================================
         */

        LinkedTransferQueue<String> waitingQueue =
                new LinkedTransferQueue<>();

        Thread waiting = new Thread(() -> {

            try {

                waitingQueue.take();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        waiting.start();

        Thread.sleep(500);

        System.out.println("Waiting Consumer");

        System.out.println(
                "Has Waiting Consumer : "
                        + waitingQueue.hasWaitingConsumer());

        System.out.println(
                "Waiting Consumer Count : "
                        + waitingQueue.getWaitingConsumerCount());

        waitingQueue.put("Wake Up");

        waiting.join();

        System.out.println();


        /*
         * ==========================================================
         *        Unbounded Queue Demonstration
         * ==========================================================
         */

        LinkedTransferQueue<Integer> unboundedDemo =
                new LinkedTransferQueue<>();

        for (int i = 1; i <= 10; i++) {

            unboundedDemo.offer(i);

        }

        System.out.println("Unbounded Queue");

        System.out.println(unboundedDemo);

        System.out.println(
                "Remaining Capacity : "
                        + unboundedDemo.remainingCapacity());

        System.out.println();


        /*
         * ==========================================================
         *          Task Processing Example
         * ==========================================================
         */

        LinkedTransferQueue<String> tasks =
                new LinkedTransferQueue<>();

        tasks.offer("Download");

        tasks.offer("Upload");

        tasks.offer("Backup");

        System.out.println("Task Processing");

        while (!tasks.isEmpty()) {

            System.out.println(
                    "Processing : "
                            + tasks.poll());

        }

        System.out.println();


        /*
         * ==========================================================
         *              Performance Notes
         * ==========================================================
         */

        System.out.println("Performance");

        System.out.println(
                "Internal Structure : Linked Nodes");

        System.out.println(
                "Implementation : Lock-Free");

        System.out.println(
                "Insertion : O(1)");

        System.out.println(
                "Deletion : O(1)");

        System.out.println(
                "Transfer : O(1)");

        System.out.println(
                "Thread Safe");

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
                "✔ Use transfer() when producer must wait for consumer.");

        System.out.println(
                "✔ Use tryTransfer() for non-blocking transfer.");

        System.out.println(
                "✔ Check hasWaitingConsumer() before transfer when needed.");

        System.out.println(
                "✔ Prefer LinkedTransferQueue for high-throughput concurrent applications.");

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
                        + numbers.getClass().getSimpleName());

        System.out.println(
                "Internal Structure : Linked Nodes");

        System.out.println(
                "Algorithm : Lock-Free");

        System.out.println(
                "Thread Safe : Yes");

        System.out.println(
                "Unbounded Queue : Yes");

        System.out.println(
                "Direct Transfer : Supported");

        System.out.println(
                "Waiting Consumer Detection : Supported");

        System.out.println(
                "Duplicate Elements : Allowed");

        System.out.println(
                "Null Elements : Not Allowed");

        System.out.println(
                "LinkedTransferQueue demonstration completed successfully.");
    }
}