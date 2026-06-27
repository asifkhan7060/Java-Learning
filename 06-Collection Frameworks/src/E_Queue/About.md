# Table of Contents

## Part 1 : Queue Interface

1. What is Queue?

2. Queue Hierarchy

3. Features of Queue

4. Types of Queue Implementations

    * PriorityQueue
    * Deque

        * ArrayDeque
        * LinkedList
    * BlockingQueue

        * ArrayBlockingQueue
        * LinkedBlockingQueue
        * PriorityBlockingQueue
        * DelayQueue
        * SynchronousQueue
        * TransferQueue

            * LinkedTransferQueue
    * BlockingDeque

        * LinkedBlockingDeque

5. Difference Between Queue Implementations

6. Methods Available in Queue Hierarchy

    * Collection Methods
    * Queue Interface (New Methods)
    * Additional Methods Provided by Deque
    * Additional Methods Provided by BlockingQueue
    * Additional Methods Provided by TransferQueue
    * Additional Methods Provided by BlockingDeque
    * Overall Queue Method Hierarchy
    * Important Notes

7. Detailed Queue Hierarchy Methods

### Queue Methods

1. add()
2. offer()
3. remove()
4. poll()
5. element()
6. peek()

### Deque Methods

7. addFirst()
8. addLast()
9. offerFirst()
10. offerLast()
11. removeFirst()
12. removeLast()
13. pollFirst()
14. pollLast()
15. getFirst()
16. getLast()
17. peekFirst()
18. peekLast()
19. push()
20. pop()
21. removeFirstOccurrence()
22. removeLastOccurrence()
23. descendingIterator()
24. reversed() *(Java 21+)*

### BlockingQueue Methods

25. put()
26. take()
27. offer(E, long, TimeUnit)
28. poll(long, TimeUnit)
29. remainingCapacity()
30. drainTo()

### TransferQueue Methods

31. transfer()
32. tryTransfer(E)
33. tryTransfer(E, long, TimeUnit)
34. hasWaitingConsumer()
35. getWaitingConsumerCount()

### BlockingDeque Methods

36. putFirst()

37. putLast()

38. takeFirst()

39. takeLast()

40. offerFirst(E, long, TimeUnit)

41. offerLast(E, long, TimeUnit)

42. pollFirst(long, TimeUnit)

43. pollLast(long, TimeUnit)

44. Ways to Traverse a Queue

* Enhanced For Loop
* Iterator
* Spliterator
* Stream API

9. Interview Questions

---

# Java Queue Interface

## What is Queue?

`Queue` is a child interface of the **Collection** interface.

It represents a collection designed for **processing elements sequentially**.

Most Queue implementations follow the **FIFO (First In, First Out)** principle, where the first element inserted is generally the first element removed.

Unlike `List`, a Queue **does not provide index-based access**. Instead, elements are inserted at the **rear (tail)** and removed from the **front (head)**.

Some implementations, such as **PriorityQueue**, do not follow FIFO and instead process elements according to their priority.

```java
public interface Queue<E> extends Collection<E>
```

> **Note**
>
> Queue defines the basic contract for queue operations.
>
> Different implementations provide different ordering mechanisms, concurrency support, and internal data structures.

---

# Queue Hierarchy

```text
Java Collection Framework

Iterable
    │
    ▼
Collection
    │
    ▼
Queue
│
├── PriorityQueue
│
├── Deque
│   ├── ArrayDeque
│   └── LinkedList
│
├── BlockingQueue
│   ├── ArrayBlockingQueue
│   ├── LinkedBlockingQueue
│   ├── PriorityBlockingQueue
│   ├── DelayQueue
│   ├── SynchronousQueue
│   └── TransferQueue
│       └── LinkedTransferQueue
│
└── BlockingDeque
    └── LinkedBlockingDeque
```

---

# Features of Queue

* Follows **FIFO (First In, First Out)** ordering in most implementations.
* Designed for sequential processing of elements.
* Allows duplicate elements.
* Dynamic in size.
* Supports Generics.
* Does **not** support index-based access.
* Efficient insertion and removal operations.
* Ordering depends on the implementation.
* Null handling depends on the implementation.
* Specialized implementations support multithreading and concurrent programming.

---

# Types of Queue Implementations

## 1. PriorityQueue

### Description

* Internally uses a **Binary Heap**.
* Maintains **priority order** instead of insertion order.
* Does **not** allow `null` elements.
* Best suited for scheduling and priority-based processing.

### Example

```java
Queue<Integer> queue = new PriorityQueue<>();
```

---

## 2. Deque

### Description

* Represents a **Double Ended Queue**.
* Allows insertion and deletion from both the front and rear.
* Can be used as both a **Queue** and a **Stack**.

### Common Implementations

* ArrayDeque
* LinkedList

### Example

```java
Deque<Integer> deque = new ArrayDeque<>();
```

---

## 3. BlockingQueue

### Description

* Thread-safe Queue.
* Supports **blocking insertion** and **blocking removal**.
* Mainly used in **Producer–Consumer** applications.

### Common Implementations

* ArrayBlockingQueue
* LinkedBlockingQueue
* PriorityBlockingQueue
* DelayQueue
* SynchronousQueue
* LinkedTransferQueue

### Example

```java
BlockingQueue<Integer> queue =
        new LinkedBlockingQueue<>();
```

---

## 4. BlockingDeque

### Description

* Thread-safe implementation of **Deque**.
* Supports blocking operations at both ends.
* Extends both **BlockingQueue** and **Deque**.

### Common Implementation

* LinkedBlockingDeque

### Example

```java
BlockingDeque<Integer> deque =
        new LinkedBlockingDeque<>();
```

---

# Difference Between Queue Implementations

| Feature             | PriorityQueue  | ArrayDeque    | LinkedList   | BlockingQueue     | LinkedBlockingDeque |
| ------------------- | -------------- | ------------- | ------------ | ----------------- | ------------------- |
| Ordering            | Priority Order | FIFO / LIFO   | FIFO / LIFO  | FIFO              | FIFO / LIFO         |
| Null Allowed        | ❌              | ❌             | ✅            | ❌                 | ❌                   |
| Thread Safe         | ❌              | ❌             | ❌            | ✅                 | ✅                   |
| Blocking Operations | ❌              | ❌             | ❌            | ✅                 | ✅                   |
| Stack Operations    | ❌              | ✅             | ✅            | ❌                 | ✅                   |
| Primary Use         | Scheduling     | General Queue | Queue + List | Producer–Consumer | Concurrent Deque    |

---

# Methods Available in Queue Hierarchy

Unlike the `Set` interface, the **Queue** interface introduces **six new methods** specifically designed for queue operations.

Additional methods are introduced by:

* Deque
* BlockingQueue
* TransferQueue
* BlockingDeque

(Detailed explanation of each method is covered later in this document.)

---

# Overall Queue Method Hierarchy

```text
Collection Methods
        │
        ▼
Queue
        │
        ├── add()
        ├── offer()
        ├── remove()
        ├── poll()
        ├── element()
        └── peek()

        │
        ▼
Deque
        │
        ├── addFirst()
        ├── addLast()
        ├── offerFirst()
        ├── offerLast()
        ├── removeFirst()
        ├── removeLast()
        ├── pollFirst()
        ├── pollLast()
        ├── getFirst()
        ├── getLast()
        ├── peekFirst()
        ├── peekLast()
        ├── push()
        ├── pop()
        ├── removeFirstOccurrence()
        ├── removeLastOccurrence()
        ├── descendingIterator()
        └── reversed() (Java 21+)

        │
        ▼
BlockingQueue
        │
        ├── put()
        ├── take()
        ├── offer(timeout)
        ├── poll(timeout)
        ├── remainingCapacity()
        └── drainTo()

        │
        ▼
TransferQueue
        │
        ├── transfer()
        ├── tryTransfer()
        ├── hasWaitingConsumer()
        └── getWaitingConsumerCount()

        │
        ▼
BlockingDeque
        │
        ├── putFirst()
        ├── putLast()
        ├── takeFirst()
        ├── takeLast()
        ├── offerFirst(timeout)
        ├── offerLast(timeout)
        ├── pollFirst(timeout)
        └── pollLast(timeout)
```

---

# Detailed Queue Hierarchy Methods

The Queue hierarchy introduces several groups of methods.

These methods are explained in detail under the following sections:

* Queue Methods
* Deque Methods
* BlockingQueue Methods
* TransferQueue Methods
* BlockingDeque Methods

Each method includes:

* Purpose
* Syntax
* Example
* Output
* Important Notes

---

# Ways to Traverse a Queue

A Queue can be traversed using multiple approaches.

* Enhanced For Loop
* Iterator
* Spliterator
* Stream API

Each approach is explained with examples later in this document.

---

# Interview Questions

* What is the Queue interface?
* Which interface does Queue extend?
* Which principle does Queue generally follow?
* What is the difference between `add()` and `offer()`?
* What is the difference between `remove()` and `poll()`?
* What is the difference between `element()` and `peek()`?
* Which Queue implementation maintains priority ordering?
* Which Queue implementation supports blocking operations?
* Which Queue implementation can be used as both Queue and Stack?
* When should you use `PriorityQueue` instead of `ArrayDeque`?

# Understanding Queue Internals

A **Queue** is designed to process elements in a specific order rather than providing random access.

Unlike a **List**, which focuses on index-based operations, or a **Set**, which focuses on uniqueness, the primary objective of a Queue is **ordered processing**.

Most Queue implementations follow the **FIFO (First In, First Out)** principle, although some implementations use different ordering mechanisms such as **priority** or **delay**.

---

# Why Do We Need Queue?

Consider a ticket booking counter.

Customers arrive in the following order:

```text
A → B → C → D
```

The customer who arrives first should be served first.

Processing Order

```text
A → B → C → D
```

This is exactly how a Queue works.

Another common example is a **printer queue**.

```text
Print Request

Document 1
Document 2
Document 3
Document 4
```

The printer processes the documents one by one in the same order.

Without a Queue, managing ordered requests would become difficult and inefficient.

---

# Why Multiple Queue Implementations?

Not every application has the same requirement.

Some applications need:

* Simple FIFO processing
* Priority-based processing
* Double-ended operations
* Thread-safe communication
* Delayed execution
* High-performance concurrent processing

Therefore, Java provides multiple Queue implementations.

| Requirement                    | Recommended Implementation |
| ------------------------------ | -------------------------- |
| General Queue                  | ArrayDeque                 |
| Priority Scheduling            | PriorityQueue              |
| Queue + List Operations        | LinkedList                 |
| Fixed Capacity Queue           | ArrayBlockingQueue         |
| Dynamic Blocking Queue         | LinkedBlockingQueue        |
| Delayed Task Scheduling        | DelayQueue                 |
| Direct Thread Communication    | SynchronousQueue           |
| Producer–Consumer Transfer     | LinkedTransferQueue        |
| Thread-safe Double Ended Queue | LinkedBlockingDeque        |

---

# Internal Working Overview

Different Queue implementations use different internal data structures.

```text
Queue
│
├── PriorityQueue
│      │
│      └── Binary Heap
│
├── ArrayDeque
│      │
│      └── Circular Array
│
├── LinkedList
│      │
│      └── Doubly Linked List
│
├── ArrayBlockingQueue
│      │
│      └── Circular Array + Locks
│
├── LinkedBlockingQueue
│      │
│      └── Linked Nodes + Locks
│
├── PriorityBlockingQueue
│      │
│      └── Binary Heap + Locks
│
├── DelayQueue
│      │
│      └── Priority Queue + Delayed Elements
│
├── SynchronousQueue
│      │
│      └── No Internal Storage
│
├── LinkedTransferQueue
│      │
│      └── Lock-Free Linked Nodes
│
└── LinkedBlockingDeque
       │
       └── Doubly Linked List + Locks
```

Each implementation is optimized for a different purpose.

---

# Core Queue Concepts

## 1. FIFO (First In, First Out)

Most Queue implementations follow FIFO.

Example

```text
Insert

10
20
30
40
```

Removal Order

```text
10
20
30
40
```

The first inserted element is removed first.

---

## 2. Priority-Based Processing

`PriorityQueue` does **not** follow FIFO.

Instead, elements are processed according to their priority.

Example

```text
Inserted

30
10
40
20
```

Removal Order

```text
10
20
30
40
```

Internally, it uses a **Binary Heap**.

---

## 3. Head and Tail

Every Queue has two important positions.

```text
Front (Head)

↓

10 → 20 → 30 → 40

                  ↑

              Rear (Tail)
```

* Insertion normally occurs at the **Rear**.
* Removal normally occurs from the **Front**.

---

## 4. Blocking Operations

A normal Queue immediately returns if an operation cannot be completed.

A BlockingQueue waits until the operation becomes possible.

Example

```text
Consumer

↓

take()

↓

Queue Empty

↓

Wait...
```

Producer

```text
put(100)

↓

Consumer Receives 100
```

This mechanism is widely used in **Producer–Consumer** problems.

---

# Internal Data Structures

| Implementation        | Internal Data Structure |
| --------------------- | ----------------------- |
| PriorityQueue         | Binary Heap             |
| ArrayDeque            | Circular Array          |
| LinkedList            | Doubly Linked List      |
| ArrayBlockingQueue    | Circular Array          |
| LinkedBlockingQueue   | Linked Nodes            |
| PriorityBlockingQueue | Binary Heap             |
| DelayQueue            | Priority Queue          |
| SynchronousQueue      | No Internal Storage     |
| LinkedTransferQueue   | Lock-Free Linked Nodes  |
| LinkedBlockingDeque   | Doubly Linked List      |

---

# Performance Comparison

| Implementation        |  Insert  |  Remove  | Peek |
| --------------------- | :------: | :------: | :--: |
| ArrayDeque            |   O(1)   |   O(1)   | O(1) |
| LinkedList            |   O(1)   |   O(1)   | O(1) |
| PriorityQueue         | O(log n) | O(log n) | O(1) |
| ArrayBlockingQueue    |   O(1)   |   O(1)   | O(1) |
| LinkedBlockingQueue   |   O(1)   |   O(1)   | O(1) |
| PriorityBlockingQueue | O(log n) | O(log n) | O(1) |
| DelayQueue            | O(log n) | O(log n) | O(1) |
| SynchronousQueue      |   O(1)*  |   O(1)*  |  N/A |
| LinkedTransferQueue   |   O(1)   |   O(1)   | O(1) |
| LinkedBlockingDeque   |   O(1)   |   O(1)   | O(1) |

> **Note**
>
> `SynchronousQueue` does not actually store elements.
> Every insertion waits for a corresponding removal.

---

# Memory Comparison

| Implementation        | Memory Usage          |
| --------------------- | --------------------- |
| ArrayDeque            | ⭐ Lowest              |
| PriorityQueue         | ⭐ Low                 |
| ArrayBlockingQueue    | ⭐ Low                 |
| LinkedList            | ⭐⭐ Medium             |
| LinkedBlockingQueue   | ⭐⭐ Medium             |
| PriorityBlockingQueue | ⭐⭐ Medium             |
| DelayQueue            | ⭐⭐ Medium             |
| LinkedTransferQueue   | ⭐⭐⭐ High              |
| LinkedBlockingDeque   | ⭐⭐⭐ High              |
| SynchronousQueue      | Very Low (No Storage) |

---

# Decision Flow

```text
Need Priority Ordering?

        │
      Yes
        ▼
 PriorityQueue

        │
       No
        ▼
Need Fast FIFO Queue?

        │
      Yes
        ▼
 ArrayDeque

        │
       No
        ▼
Need Thread Safety?

        │
      Yes
        ▼
 BlockingQueue

        │
       No
        ▼
Need Double Ended Operations?

        │
      Yes
        ▼
 Deque
```

---

# When Should You Choose Which Queue?

### Use **PriorityQueue**

* Task Scheduling
* Event Scheduling
* Job Scheduling

---

### Use **ArrayDeque**

* General Queue
* Stack
* BFS
* DFS

---

### Use **LinkedList**

* Queue + List functionality
* Frequent insertion and deletion

---

### Use **BlockingQueue**

* Producer–Consumer
* Thread Pools
* Background Task Processing

---

### Use **DelayQueue**

* Scheduled Tasks
* Delayed Execution
* Timers

---

### Use **SynchronousQueue**

* Direct Thread-to-Thread Communication

---

### Use **LinkedTransferQueue**

* High-performance concurrent messaging

---

### Use **LinkedBlockingDeque**

* Blocking operations at both ends
* Work-stealing algorithms

---

# Summary

* Queue is designed for **ordered processing**.
* Most implementations follow **FIFO**.
* `PriorityQueue` processes elements based on **priority**.
* `Deque` supports insertion and deletion from **both ends**.
* `BlockingQueue` enables **thread-safe communication**.
* Different Queue implementations use different internal data structures.
* Selecting the correct implementation improves both **performance** and **code quality**.

# Practical Understanding of Queue

Learning the Queue interface is not just about understanding its methods. It is equally important to know **where each Queue implementation should be used**, **which implementation is best for a particular problem**, and **what mistakes to avoid**.

This section focuses on the practical side of the Queue interface.

---

# Real-World Examples

## 1. Printer Queue

When multiple documents are sent to a printer, they are printed in the order they are received.

**Recommended Implementation**

```text
ArrayDeque
```

---

## 2. Ticket Booking System

Customers waiting for tickets are served in the order they arrive.

**Recommended Implementation**

```text
ArrayDeque
```

---

## 3. CPU Process Scheduling

Processes with higher priority should execute before lower-priority processes.

**Recommended Implementation**

```text
PriorityQueue
```

---

## 4. Breadth First Search (BFS)

Graphs and Trees use Queue to visit nodes level by level.

**Recommended Implementation**

```text
ArrayDeque
```

---

## 5. Producer-Consumer Problem

One thread produces data while another thread consumes it safely.

**Recommended Implementation**

```text
LinkedBlockingQueue
```

---

## 6. Delayed Task Execution

Tasks should execute only after a specified delay.

**Recommended Implementation**

```text
DelayQueue
```

---

## 7. Thread Pool

One thread hands over work directly to another thread.

**Recommended Implementation**

```text
SynchronousQueue
```

---

## 8. High Performance Messaging System

Messages should be transferred directly to waiting consumer threads whenever possible.

**Recommended Implementation**

```text
LinkedTransferQueue
```

---

## 9. Work-Stealing Algorithm

Tasks can be added or removed from both ends by multiple threads.

**Recommended Implementation**

```text
LinkedBlockingDeque
```

---

# DSA Selection Guide

| Problem                          | Recommended Queue   |
| -------------------------------- | ------------------- |
| Simple FIFO Queue                | ArrayDeque          |
| Priority Scheduling              | PriorityQueue       |
| Queue + Stack Operations         | ArrayDeque          |
| Queue + List Operations          | LinkedList          |
| Producer-Consumer                | LinkedBlockingQueue |
| Fixed Capacity Queue             | ArrayBlockingQueue  |
| Delayed Processing               | DelayQueue          |
| Direct Thread Handoff            | SynchronousQueue    |
| High Performance Transfer        | LinkedTransferQueue |
| Blocking Operations at Both Ends | LinkedBlockingDeque |

---

# Common Mistakes

## ❌ Mistake 1

Using **PriorityQueue** expecting insertion order.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(30);
pq.add(10);
pq.add(20);
```

Output

```text
10
20
30
```

**Reason**

PriorityQueue maintains **priority order**, not insertion order.

---

## ❌ Mistake 2

Using `remove()` on an empty Queue.

```java
queue.remove();
```

Result

```text
NoSuchElementException
```

Use

```java
queue.poll();
```

when the Queue may be empty.

---

## ❌ Mistake 3

Using `element()` on an empty Queue.

```java
queue.element();
```

Result

```text
NoSuchElementException
```

Prefer

```java
queue.peek();
```

---

## ❌ Mistake 4

Using `ArrayDeque` in a multithreaded application.

```text
Wrong Choice
```

Use

```text
LinkedBlockingQueue
```

or

```text
ArrayBlockingQueue
```

instead.

---

## ❌ Mistake 5

Adding `null` into Queue implementations that do not support it.

```java
Queue<Integer> queue = new PriorityQueue<>();

queue.add(null);
```

Result

```text
NullPointerException
```

---

# Best Practices

* ✅ Use **ArrayDeque** for normal Queue operations.
* ✅ Use **PriorityQueue** only when ordering by priority is required.
* ✅ Prefer `offer()` instead of `add()` when insertion may fail.
* ✅ Prefer `poll()` instead of `remove()` when the Queue may be empty.
* ✅ Prefer `peek()` instead of `element()` when the Queue may be empty.
* ✅ Use BlockingQueue implementations for multithreaded applications.
* ✅ Avoid storing `null` values.
* ✅ Choose the implementation based on the application's requirements instead of habit.

---

# Quick Revision Table

| Requirement                        | Best Choice         |
| ---------------------------------- | ------------------- |
| General Queue                      | ArrayDeque          |
| Priority Scheduling                | PriorityQueue       |
| Queue + Stack                      | ArrayDeque          |
| Queue + List                       | LinkedList          |
| Fixed Capacity Queue               | ArrayBlockingQueue  |
| Dynamic Blocking Queue             | LinkedBlockingQueue |
| Delayed Tasks                      | DelayQueue          |
| Direct Thread Communication        | SynchronousQueue    |
| High Performance Producer-Consumer | LinkedTransferQueue |
| Double Ended Blocking Queue        | LinkedBlockingDeque |

---

# Which Queue Should I Choose?

```text
Need Priority Processing?
        │
      Yes
        ▼
 PriorityQueue
        │
       No
        ▼
Need General FIFO Queue?
        │
      Yes
        ▼
 ArrayDeque
        │
       No
        ▼
Need Queue + List Features?
        │
      Yes
        ▼
 LinkedList
        │
       No
        ▼
Need Thread Safety?
        │
      Yes
        ▼
 BlockingQueue
        │
       No
        ▼
Need Blocking Operations at Both Ends?
        │
      Yes
        ▼
 LinkedBlockingDeque
```

---

# Advanced Interview Questions

### Q1. Why is `ArrayDeque` generally preferred over `LinkedList` for Queue operations?

Because it is usually faster, uses less memory, and provides better cache locality.

---

### Q2. Why doesn't `PriorityQueue` maintain insertion order?

Because it internally uses a **Binary Heap**, which organizes elements according to priority.

---

### Q3. What is the difference between `add()` and `offer()`?

| add()              | offer()            |
| ------------------ | ------------------ |
| Throws Exception   | Returns `false`    |
| Used in Collection | Preferred in Queue |

---

### Q4. What is the difference between `remove()` and `poll()`?

| remove()                    | poll()               |
| --------------------------- | -------------------- |
| Throws Exception            | Returns `null`       |
| Queue must contain elements | Safe for empty Queue |

---

### Q5. What is the difference between `element()` and `peek()`?

| element()                    | peek()         |
| ---------------------------- | -------------- |
| Throws Exception             | Returns `null` |
| Used when Queue is not empty | Safe retrieval |

---

### Q6. Which Queue implementation is best for Producer–Consumer problems?

* ArrayBlockingQueue
* LinkedBlockingQueue

---

### Q7. Which Queue implementation stores no elements internally?

```text
SynchronousQueue
```

---

### Q8. Which Queue implementation supports direct producer-to-consumer transfer?

```text
LinkedTransferQueue
```

---

# One-Line Revision

* **PriorityQueue** → Priority-based Queue.
* **ArrayDeque** → Fast FIFO/LIFO Queue.
* **LinkedList** → Queue + List implementation.
* **BlockingQueue** → Thread-safe Queue.
* **DelayQueue** → Delayed task scheduling.
* **SynchronousQueue** → Direct thread handoff.
* **LinkedTransferQueue** → High-performance message transfer.
* **LinkedBlockingDeque** → Thread-safe double-ended Queue.

---

# Key Takeaways

* Queue is designed for **ordered processing** of elements.
* Most Queue implementations follow the **FIFO** principle.
* `PriorityQueue` processes elements based on priority.
* `Deque` supports insertion and deletion from both ends.
* `BlockingQueue` enables safe communication between threads.
* Different Queue implementations are optimized for different use cases.
* Selecting the right implementation improves performance, scalability, and code readability.

---

# Final Summary

The **Queue** interface is one of the most important interfaces in the Java Collection Framework for sequential data processing.

Different implementations are designed to solve different problems:

* **PriorityQueue** → Priority-based processing
* **ArrayDeque** → Fast general-purpose Queue
* **LinkedList** → Queue with List functionality
* **BlockingQueue** → Thread-safe producer-consumer communication
* **DelayQueue** → Delayed execution
* **SynchronousQueue** → Direct thread handoff
* **LinkedTransferQueue** → High-performance concurrent transfer
* **LinkedBlockingDeque** → Thread-safe double-ended operations

Choosing the appropriate Queue implementation based on the application's requirements leads to cleaner, more efficient, and maintainable code.
