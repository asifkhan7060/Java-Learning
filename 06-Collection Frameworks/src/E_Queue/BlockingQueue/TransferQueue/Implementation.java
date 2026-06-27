package E_Queue.BlockingQueue.TransferQueue;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class Implementation {

    public static void main(String[] args) throws InterruptedException {

        // =====================================================
        // TransferQueue Interface Demonstration
        // =====================================================

        TransferQueue<Integer> queue = new LinkedTransferQueue<>();

        // =====================================================
        // 1. Basic Information
        // =====================================================

        System.out.println("===== Basic Information =====");

        System.out.println("Queue : " + queue);
        System.out.println("Class : " + queue.getClass().getSimpleName());
        System.out.println("Size : " + queue.size());
        System.out.println("Is Empty : " + queue.isEmpty());



        // =====================================================
        // 2. Queue Methods
        // =====================================================

        System.out.println("\n===== Queue Methods =====");

        queue.add(10);
        queue.add(20);

        queue.offer(30);

        System.out.println("After add & offer : " + queue);

        System.out.println("Peek : " + queue.peek());

        System.out.println("Element : " + queue.element());

        System.out.println("Poll : " + queue.poll());

        System.out.println("After poll : " + queue);

        System.out.println("Remove : " + queue.remove());

        System.out.println("After remove : " + queue);



        // =====================================================
        // 3. BlockingQueue Methods
        // =====================================================

        System.out.println("\n===== BlockingQueue Methods =====");

        queue.put(100);

        queue.put(200);

        queue.put(300);

        System.out.println("After put : " + queue);

        System.out.println(
                "Remaining Capacity : "
                        + queue.remainingCapacity());

        System.out.println(
                "Poll with Timeout : "
                        + queue.poll(2, TimeUnit.SECONDS));

        System.out.println("After poll : " + queue);

        queue.offer(400, 2, TimeUnit.SECONDS);

        System.out.println("After offer(timeout) : " + queue);

        System.out.println("Take : " + queue.take());

        System.out.println("After take : " + queue);



        // =====================================================
        // 4. Collection Methods
        // =====================================================

        System.out.println("\n===== Collection Methods =====");

        queue.add(500);
        queue.add(600);
        queue.add(700);

        System.out.println("Queue : " + queue);

        System.out.println(
                "Contains 600 : "
                        + queue.contains(600));

        System.out.println(
                "Contains 900 : "
                        + queue.contains(900));

        System.out.println(
                "Size : "
                        + queue.size());

        System.out.println(
                "Is Empty : "
                        + queue.isEmpty());

        queue.remove(Integer.valueOf(600));

        System.out.println(
                "After remove(Object) : "
                        + queue);

        Object[] array = queue.toArray();

        System.out.print("toArray() : ");

        for (Object obj : array) {
            System.out.print(obj + " ");
        }

        System.out.println();



        // =====================================================
        // 5. Iterator Traversal
        // =====================================================

        System.out.println("\n===== Iterator =====");

        Iterator<Integer> iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();



        // =====================================================
        // 6. Enhanced For Loop
        // =====================================================

        System.out.println("\n===== Enhanced For Loop =====");

        for (Integer value : queue) {
            System.out.print(value + " ");
        }

        System.out.println();



        // =====================================================
        // 7. Spliterator
        // =====================================================

        System.out.println("\n===== Spliterator =====");

        Spliterator<Integer> spliterator =
                queue.spliterator();

        spliterator.forEachRemaining(
                value -> System.out.print(value + " "));

        System.out.println();



        // =====================================================
        // 8. Stream API
        // =====================================================

        System.out.println("\n===== Stream API =====");

        queue.stream()
                .forEach(value ->
                        System.out.print(value + " "));

        System.out.println();

        // =====================================================
        // 9. TransferQueue Specific Methods
        // =====================================================

        System.out.println("\n===== TransferQueue Methods =====");

        TransferQueue<String> transferQueue =
                new LinkedTransferQueue<>();

        System.out.println(
                "Has Waiting Consumer : "
                        + transferQueue.hasWaitingConsumer());

        System.out.println(
                "Waiting Consumer Count : "
                        + transferQueue.getWaitingConsumerCount());



        // =====================================================
        // 10. tryTransfer()
        // =====================================================

        System.out.println("\n===== tryTransfer() =====");

        boolean transferred =
                transferQueue.tryTransfer("Java");

        System.out.println(
                "Transfer Successful : "
                        + transferred);

        System.out.println(
                "Queue : "
                        + transferQueue);



        // =====================================================
        // 11. transfer()
        // =====================================================

        System.out.println("\n===== transfer() =====");

        TransferQueue<String> queue1 =
                new LinkedTransferQueue<>();

        Thread consumer1 = new Thread(() -> {

            try {

                Thread.sleep(2000);

                System.out.println(
                        "Consumer Received : "
                                + queue1.take());

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        consumer1.start();

        System.out.println(
                "Producer Waiting...");

        queue1.transfer("Spring Boot");

        System.out.println(
                "Transfer Completed");

        consumer1.join();



        // =====================================================
        // 12. tryTransfer(timeout)
        // =====================================================

        System.out.println("\n===== tryTransfer(timeout) =====");

        TransferQueue<String> queue2 =
                new LinkedTransferQueue<>();

        Thread consumer2 = new Thread(() -> {

            try {

                Thread.sleep(1000);

                System.out.println(
                        "Consumer Received : "
                                + queue2.take());

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        consumer2.start();

        boolean success =
                queue2.tryTransfer(
                        "Microservices",
                        5,
                        TimeUnit.SECONDS);

        System.out.println(
                "Transfer Success : "
                        + success);

        consumer2.join();



        // =====================================================
        // 13. hasWaitingConsumer()
        // =====================================================

        System.out.println("\n===== hasWaitingConsumer() =====");

        TransferQueue<Integer> queue3 =
                new LinkedTransferQueue<>();

        Thread consumer3 = new Thread(() -> {

            try {

                System.out.println(
                        "Consumer Waiting...");

                queue3.take();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        consumer3.start();

        Thread.sleep(500);

        System.out.println(
                "Waiting Consumer : "
                        + queue3.hasWaitingConsumer());

        queue3.put(100);

        consumer3.join();



        // =====================================================
        // 14. getWaitingConsumerCount()
        // =====================================================

        System.out.println("\n===== getWaitingConsumerCount() =====");

        TransferQueue<Integer> queue4 =
                new LinkedTransferQueue<>();

        Thread consumer4 = new Thread(() -> {

            try {

                queue4.take();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        consumer4.start();

        Thread.sleep(500);

        System.out.println(
                "Waiting Consumers : "
                        + queue4.getWaitingConsumerCount());

        queue4.put(200);

        consumer4.join();



        // =====================================================
        // 15. drainTo()
        // =====================================================

        System.out.println("\n===== drainTo() =====");

        TransferQueue<Integer> queue5 =
                new LinkedTransferQueue<>();

        queue5.add(10);
        queue5.add(20);
        queue5.add(30);
        queue5.add(40);

        System.out.println(
                "Before drain : "
                        + queue5);

        java.util.List<Integer> list =
                new java.util.ArrayList<>();

        queue5.drainTo(list);

        System.out.println(
                "Queue : "
                        + queue5);

        System.out.println(
                "List : "
                        + list);



        // =====================================================
        // 16. drainTo(Collection, maxElements)
        // =====================================================

        System.out.println("\n===== drainTo(maxElements) =====");

        queue5.add(100);
        queue5.add(200);
        queue5.add(300);
        queue5.add(400);

        list.clear();

        queue5.drainTo(list, 2);

        System.out.println(
                "Queue : "
                        + queue5);

        System.out.println(
                "List : "
                        + list);

        // =====================================================
        // 17. Producer-Consumer Example
        // =====================================================

        System.out.println("\n===== Producer Consumer Example =====");

        TransferQueue<String> queue6 =
                new LinkedTransferQueue<>();

        Thread producer = new Thread(() -> {

            try {

                System.out.println("Producer : Java");

                queue6.transfer("Java");

                System.out.println("Producer : Spring");

                queue6.transfer("Spring");

                System.out.println("Producer : Hibernate");

                queue6.transfer("Hibernate");

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        });

        Thread consumer = new Thread(() -> {

            try {

                Thread.sleep(1000);

                while (true) {

                    String value = queue6.take();

                    System.out.println(
                            "Consumer : "
                                    + value);

                    if (value.equals("Hibernate"))
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



        // =====================================================
        // 18. tryTransfer() Without Consumer
        // =====================================================

        System.out.println("\n===== tryTransfer Without Consumer =====");

        TransferQueue<String> queue7 =
                new LinkedTransferQueue<>();

        boolean result =
                queue7.tryTransfer("ChatGPT");

        System.out.println(
                "Transfer Successful : "
                        + result);

        System.out.println(
                "Queue : "
                        + queue7);



        // =====================================================
        // 19. Waiting Consumer Example
        // =====================================================

        System.out.println("\n===== Waiting Consumer =====");

        TransferQueue<Integer> queue8 =
                new LinkedTransferQueue<>();

        Thread waitingConsumer =
                new Thread(() -> {

                    try {

                        System.out.println(
                                "Consumer Waiting...");

                        System.out.println(
                                "Received : "
                                        + queue8.take());

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                });

        waitingConsumer.start();

        Thread.sleep(1000);

        System.out.println(
                "Waiting Consumer : "
                        + queue8.hasWaitingConsumer());

        System.out.println(
                "Waiting Count : "
                        + queue8.getWaitingConsumerCount());

        queue8.transfer(999);

        waitingConsumer.join();



        // =====================================================
        // 20. Clear
        // =====================================================

        System.out.println("\n===== clear() =====");

        queue.add(1000);
        queue.add(2000);
        queue.add(3000);

        System.out.println(
                "Before clear : "
                        + queue);

        queue.clear();

        System.out.println(
                "After clear : "
                        + queue);



        // =====================================================
        // 21. Summary
        // =====================================================

        System.out.println("\n===== Summary =====");

        System.out.println(
                "Implementation : "
                        + queue.getClass().getSimpleName());

        System.out.println(
                "Is Empty : "
                        + queue.isEmpty());

        System.out.println(
                "Remaining Capacity : "
                        + queue.remainingCapacity());

        System.out.println(
                "TransferQueue demonstration completed successfully.");

    }
}