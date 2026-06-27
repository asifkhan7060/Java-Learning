# LinkedTransferQueue Method Hierarchy

## Overview

`LinkedTransferQueue` is the most advanced implementation of the `TransferQueue` interface in the Java Collection Framework.

It extends the capabilities of a normal `BlockingQueue` by supporting **direct transfer of elements between producer and consumer threads**.

Unlike `SynchronousQueue`, `LinkedTransferQueue` can either:

- Transfer elements immediately to waiting consumers.
- Store elements if no consumer is currently waiting.

Internally, it stores elements using a **Linked Node Structure (Lock-Free Linked Queue)** based on CAS (Compare-And-Swap) operations.

It provides:

- FIFO (First In First Out) Ordering
- Direct Producer-to-Consumer Transfer
- Blocking Transfer Operations
- Non-Blocking Transfer Operations
- Thread Safety
- Dynamic Growth
- Unbounded Capacity
- Lock-Free Implementation
- Duplicate Elements Allowed
- Null Elements Not Allowed

Since `LinkedTransferQueue` implements the `TransferQueue` interface, it automatically inherits methods from:

- Iterable
- Collection
- Queue
- BlockingQueue
- TransferQueue

Additionally, `LinkedTransferQueue` provides its own constructors.

---

# Class Declaration

```java
public class LinkedTransferQueue<E>
        extends AbstractQueue<E>
        implements TransferQueue<E>, Serializable
```

---

# Inheritance Hierarchy

```text
Iterable
    ↑
Collection
    ↑
Queue
    ↑
BlockingQueue
    ↑
TransferQueue
    ↑
AbstractQueue
    ↑
LinkedTransferQueue
```

---

# Interface Relationship

```text
               Iterable
                   ▲
                   │
              Collection
                   ▲
                   │
                 Queue
                   ▲
                   │
             BlockingQueue
                   ▲
                   │
             TransferQueue
                   ▲
                   │
         LinkedTransferQueue
```

---

# Complete LinkedTransferQueue Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
LinkedTransferQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ LinkedTransferQueue()
└── ✅ LinkedTransferQueue(Collection<? extends E> c)

│
├──────────────────────────────────────────────
│ Methods Inherited from Iterable
├──────────────────────────────────────────────
│
├── ✅ iterator()
├── ✅ spliterator()
└── ✅ forEach()

│
├──────────────────────────────────────────────
│ Methods Inherited from Collection
├──────────────────────────────────────────────
│
├── ✅ add(E e)
├── ✅ addAll(Collection<? extends E> c)
│
├── ✅ remove(Object o)
├── ✅ removeAll(Collection<?> c)
├── ✅ retainAll(Collection<?> c)
├── 🆕 removeIf(Predicate<? super E> filter)
│
├── ✅ contains(Object o)
├── ✅ containsAll(Collection<?> c)
│
├── ✅ size()
├── ✅ isEmpty()
├── ✅ clear()
│
├── ✅ toArray()
├── ✅ toArray(T[] a)
├── 🆕 toArray(IntFunction<T[]> generator)
│
├── ✅ stream()
├── ✅ parallelStream()
│
├── ✅ equals(Object o)
└── ✅ hashCode()

│
├──────────────────────────────────────────────
│ Methods Inherited from Queue
├──────────────────────────────────────────────
│
├── ✅ add(E e)
├── ✅ offer(E e)
│
├── ✅ remove()
├── ✅ poll()
│
├── ✅ element()
└── ✅ peek()

│
├──────────────────────────────────────────────
│ Methods Inherited from BlockingQueue
├──────────────────────────────────────────────
│
├── ✅ put(E e)
├── ✅ offer(E e, long, TimeUnit)
├── ✅ take()
├── ✅ poll(long, TimeUnit)
│
├── ✅ remainingCapacity()
├── ✅ drainTo(Collection<? super E>)
└── ✅ drainTo(Collection<? super E>, int)

│
├──────────────────────────────────────────────
│ Methods Inherited from TransferQueue
├──────────────────────────────────────────────
│
├── ✅ transfer(E e)
├── ✅ tryTransfer(E e)
├── ✅ tryTransfer(E e, long, TimeUnit)
├── ✅ hasWaitingConsumer()
└── ✅ getWaitingConsumerCount()

│
├──────────────────────────────────────────────
│ LinkedTransferQueue Specific Public Methods
├──────────────────────────────────────────────
│
└── *(No Additional Public Methods)*

│
├──────────────────────────────────────────────
│ Protected / Internal Methods
├──────────────────────────────────────────────
│
├── 🔒 xfer()
├── 🔒 append()
├── 🔒 awaitMatch()
├── 🔒 unsplice()
├── 🔒 sweep()
└── 🔒 firstDataNode()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ transfer()
├── ✅ tryTransfer()
├── ✅ put()
├── ✅ take()
├── ✅ offer()
├── ✅ poll()
├── ✅ iterator()
└── ✅ spliterator()

│
└──────────────────────────────────────────────
  Methods Inherited from Object
───────────────────────────────────────────────

├── 🆕 toString()
├── 🆕 getClass()
├── 🆕 wait()
├── 🆕 notify()
├── 🆕 notifyAll()
└── 🆕 finalize() (Deprecated)
```

---

# Understanding the Hierarchy

The methods available in a `LinkedTransferQueue` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `LinkedTransferQueue` class.

They are used to create `LinkedTransferQueue` objects and are **not inherited**.

```java
LinkedTransferQueue()

LinkedTransferQueue(Collection<? extends E> c)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `LinkedTransferQueue` object can use the methods defined in the `Iterable` interface.

Examples:

- iterator()
- spliterator()
- forEach()

---

## 3. Methods Inherited from Collection

Since

```java
Queue extends Collection
```

every `LinkedTransferQueue` also inherits all `Collection` methods.

These methods perform common collection operations such as:

- Adding Elements
- Removing Elements
- Searching
- Converting to Arrays
- Stream Processing

---

## 4. Methods Inherited from Queue

The `Queue` interface provides standard FIFO operations.

Examples include:

- add()
- offer()
- remove()
- poll()
- element()
- peek()

---

## 5. Methods Inherited from BlockingQueue

`BlockingQueue` introduces thread-safe blocking operations.

Examples:

- put()
- take()
- offer(timeout)
- poll(timeout)
- remainingCapacity()
- drainTo()

These methods automatically wait when necessary.

---

## 6. Methods Inherited from TransferQueue

`TransferQueue` extends `BlockingQueue` by introducing **direct producer-to-consumer transfer operations**.

Examples:

- transfer()
- tryTransfer()
- tryTransfer(timeout)
- hasWaitingConsumer()
- getWaitingConsumerCount()

These methods allow producers to transfer data directly to waiting consumers without necessarily storing it in the queue.

---

## 7. LinkedTransferQueue Specific Methods

Unlike many Collection classes,

`LinkedTransferQueue` introduces **no additional public methods**.

Its functionality comes entirely from the interfaces it implements.

---

## 8. Optimized Overrides

Several inherited methods are optimized internally using a **Lock-Free Linked Queue**, **CAS (Compare-And-Swap)** operations, and advanced concurrent algorithms.

Examples:

- transfer()
- tryTransfer()
- put()
- take()
- offer()
- poll()
- iterator()
- spliterator()

---

## 9. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, a `LinkedTransferQueue` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.

# Part 2 : LinkedTransferQueue Specific Methods

---

## 1. LinkedTransferQueue()

Creates an empty `LinkedTransferQueue`.

### Syntax

```java
LinkedTransferQueue<E> queue =
        new LinkedTransferQueue<>();
```

### Example

```java
LinkedTransferQueue<String> queue =
        new LinkedTransferQueue<>();
```

### Purpose

- Creates an empty thread-safe transfer queue.
- Uses FIFO ordering.
- Supports direct producer-to-consumer transfer.
- Grows dynamically.

### Note

Internally,

`LinkedTransferQueue` uses a **Lock-Free Linked Node Structure**.

---

## 2. LinkedTransferQueue(Collection<? extends E> c)

Creates a `LinkedTransferQueue` containing all elements from another Collection.

### Syntax

```java
LinkedTransferQueue<E> queue =
        new LinkedTransferQueue<>(collection);
```

### Example

```java
List<Integer> list =
        List.of(10,20,30);

LinkedTransferQueue<Integer> queue =
        new LinkedTransferQueue<>(list);
```

### Purpose

Copies all elements from another Collection into a thread-safe transfer queue.

---

# TransferQueue Specific Methods

---

## 1. transfer(E e)

Transfers the specified element directly to a waiting consumer.

If no consumer is waiting,

the producer thread blocks until one becomes available.

### Syntax

```java
void transfer(E e)
        throws InterruptedException
```

### Example

```java
queue.transfer("Java");
```

### Purpose

Provides guaranteed producer-to-consumer delivery.

---

## 2. tryTransfer(E e)

Attempts to transfer the element immediately.

### Syntax

```java
boolean tryTransfer(E e)
```

### Example

```java
boolean success =
        queue.tryTransfer("Java");
```

### Output

```text
true
```

or

```text
false
```

### Purpose

Transfers only if a consumer is already waiting.

Producer never blocks.

---

## 3. tryTransfer(E e,
long timeout,
TimeUnit unit)

Attempts to transfer the element within the specified waiting time.

### Syntax

```java
boolean tryTransfer(
        E e,
        long timeout,
        TimeUnit unit)
```

### Example

```java
queue.tryTransfer(
        "Java",
        5,
        TimeUnit.SECONDS);
```

### Purpose

Producer waits only for the specified timeout.

---

## 4. hasWaitingConsumer()

Checks whether at least one consumer thread is waiting.

### Syntax

```java
boolean hasWaitingConsumer()
```

### Example

```java
System.out.println(
        queue.hasWaitingConsumer());
```

### Output

```text
true
```

or

```text
false
```

### Purpose

Useful before performing transfer operations.

---

## 5. getWaitingConsumerCount()

Returns an estimate of the number of waiting consumer threads.

### Syntax

```java
int getWaitingConsumerCount()
```

### Example

```java
System.out.println(
        queue.getWaitingConsumerCount());
```

### Output

```text
0

or

1

or

2
```

### Purpose

Useful for monitoring waiting consumers.

---

# LinkedTransferQueue Specific Methods

Unlike many Collection classes,

`LinkedTransferQueue` introduces **no additional public methods**.

All public functionality comes from:

- Collection
- Queue
- BlockingQueue
- TransferQueue

---

## 1. remainingCapacity()

Returns the remaining capacity.

### Syntax

```java
int remainingCapacity()
```

### Output

```text
2147483647
```

### Purpose

Indicates available capacity.

### Note

Since `LinkedTransferQueue` is **unbounded**,

it always returns

```java
Integer.MAX_VALUE
```

---

## 2. drainTo(Collection)

Removes all available elements and transfers them into another Collection.

### Syntax

```java
int drainTo(
        Collection<? super E> c)
```

### Example

```java
List<String> list =
        new ArrayList<>();

queue.drainTo(list);
```

### Purpose

Efficiently transfers all available elements.

---

## 3. drainTo(Collection, int)

Transfers at most the specified number of elements.

### Syntax

```java
int drainTo(
        Collection<? super E> c,
        int maxElements)
```

### Example

```java
queue.drainTo(list, 5);
```

### Purpose

Useful for processing elements in batches.

---

# Internal Methods

The following methods exist inside the JDK implementation.

They are **not accessible** directly.

---

## 1. xfer()

Core method responsible for transferring or enqueuing elements.

---

## 2. append()

Appends a new node to the linked structure.

---

## 3. awaitMatch()

Blocks a producer or consumer until a matching thread is found.

---

## 4. unsplice()

Removes cancelled or matched nodes from the linked list.

---

## 5. sweep()

Periodically cleans unused nodes.

---

## 6. firstDataNode()

Returns the first node containing actual data.

---

# Optimized Overrides

The following inherited methods are optimized using

**CAS (Compare-And-Swap)**,

**Lock-Free Linked Nodes**,

and advanced concurrent algorithms.

```java
transfer()

tryTransfer()

put()

take()

offer()

poll()

iterator()

spliterator()
```

These implementations provide high-performance thread-safe data transfer.

---

# Methods Not Covered Yet

The following methods exist in Java,

but are not covered in this project.

```java
removeIf(Predicate<? super E> filter)

toArray(IntFunction<T[]> generator)
```

---

# Important Notes

- Constructors are **not inherited**.
- LinkedTransferQueue internally uses a **Lock-Free Linked Node Structure**.
- It is **unbounded**.
- Supports direct producer-to-consumer transfer.
- Uses **CAS operations** instead of traditional locking for most operations.
- Duplicate elements are allowed.
- Null elements are **not allowed**.
- `remainingCapacity()` always returns **Integer.MAX_VALUE**.
- The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, `TransferQueue`, or `LinkedTransferQueue`), even when the object is a `LinkedTransferQueue`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| LinkedTransferQueue() | O(1) | O(1) |
| LinkedTransferQueue(Collection<? extends E>) | O(n) | O(n) |

---

## TransferQueue Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| transfer(E e) | O(1)* | O(1) |
| tryTransfer(E e) | O(1)* | O(1) |
| tryTransfer(E e, timeout, unit) | O(1)* | O(1) |
| hasWaitingConsumer() | O(1) | O(1) |
| getWaitingConsumerCount() | O(n) | O(1) |
| remainingCapacity() | O(1) | O(1) |
| drainTo(Collection) | O(n) | O(1) |
| drainTo(Collection, int) | O(min(n, maxElements)) | O(1) |

> **Note:**  
> `transfer()` and `tryTransfer()` are generally **O(1)** because they use lock-free CAS operations, although contention between threads may increase execution time.

---

# When Should You Use These Methods?

## LinkedTransferQueue()

Use when:

- High-performance concurrent communication is required.
- Producer and consumer may run at different speeds.
- Dynamic queue growth is preferred.

Example

```java
LinkedTransferQueue<String> queue =
        new LinkedTransferQueue<>();
```

---

## LinkedTransferQueue(Collection)

Use when:

- Converting an existing Collection into a thread-safe TransferQueue.

Example

```java
LinkedTransferQueue<Integer> queue =
        new LinkedTransferQueue<>(list);
```

---

## transfer()

Use when:

- Producer must guarantee that the consumer receives the element.
- Producer should wait until the element is consumed.

---

## tryTransfer()

Use when:

- Producer should never block.
- Element should be transferred only if a consumer is already waiting.

---

## tryTransfer(timeout)

Use when:

- Producer should wait only for a limited amount of time.

---

## hasWaitingConsumer()

Use when:

- Checking whether a consumer is currently waiting.

---

## getWaitingConsumerCount()

Use when:

- Monitoring waiting consumer threads.

---

# Internal Working

Unlike `LinkedBlockingQueue`,

`LinkedTransferQueue` internally uses a

**Lock-Free Linked Node Structure**.

```text
Head

 │

 ▼

10 ───► 20 ───► 30 ───► NULL
```

Each node may represent either

- Data Node

or

- Request Node

Producer and Consumer threads are matched using

**CAS (Compare-And-Swap)** operations.

---

# Producer-Consumer Model

Producer

```text
transfer()

↓

Waiting Consumer ?

      │

 ┌────┴────┐
 │         │
Yes       No
 │         │
 ▼         ▼
Direct   Wait
Transfer
```

Consumer

```text
take()

↓

Receives Element
```

If a waiting consumer exists,

the element is transferred immediately.

Otherwise,

the producer waits until a consumer arrives.

---

# LinkedTransferQueue vs LinkedBlockingQueue

| Feature | LinkedTransferQueue | LinkedBlockingQueue |
|----------|--------------------:|--------------------:|
| Internal Structure | Lock-Free Linked Nodes | Linked List |
| Direct Transfer | ✅ | ❌ |
| Blocking Queue | ✅ | ✅ |
| Lock-Free | ✅ | ❌ |
| Dynamic Growth | ✅ | ✅ |
| Producer Wait | Optional | Only when Full |

---

# LinkedTransferQueue vs SynchronousQueue

| Feature | LinkedTransferQueue | SynchronousQueue |
|----------|--------------------:|-----------------:|
| Capacity | Unbounded | 0 |
| Stores Elements | ✅ | ❌ |
| Direct Transfer | ✅ | ✅ |
| Producer Wait | Optional | Always |
| Thread Safe | ✅ | ✅ |

---

# Important Notes

### Thread Safety

LinkedTransferQueue is completely thread-safe.

Multiple threads can safely access it simultaneously.

---

### Direct Transfer

Supports

```java
transfer()
```

which allows a producer to hand an element directly to a waiting consumer.

---

### Lock-Free Implementation

Unlike many concurrent queues,

LinkedTransferQueue primarily uses

```text
CAS (Compare-And-Swap)
```

instead of traditional locking.

This improves scalability.

---

### Capacity

The queue is **unbounded**.

It grows dynamically.

---

### Null Values

Null elements are **not allowed**.

```java
queue.add(null);
```

Throws

```text
NullPointerException
```

---

### Duplicate Elements

Duplicate elements are allowed.

---

### Synchronization

Internally uses

- CAS Operations
- Lock-Free Linked Nodes
- Minimal Locking

instead of a single global lock.

---

# Frequently Asked Interview Questions

## Q1. Which interface does LinkedTransferQueue implement?

```java
TransferQueue
```

Indirectly,

```text
TransferQueue

↓

BlockingQueue

↓

Queue

↓

Collection

↓

Iterable
```

---

## Q2. Which data structure does LinkedTransferQueue use internally?

```text
Lock-Free Linked Node Structure
```

---

## Q3. Is LinkedTransferQueue thread-safe?

Yes.

---

## Q4. What is the purpose of transfer()?

It transfers an element directly to a waiting consumer.

If no consumer is available,

the producer waits.

---

## Q5. What is the difference between transfer() and put()?

```text
put()
```

Simply inserts the element.

```text
transfer()
```

Waits until the element is actually received by a consumer.

---

## Q6. What does tryTransfer() do?

Attempts immediate transfer.

Returns

```java
true
```

if successful,

otherwise

```java
false
```

without blocking.

---

## Q7. Does LinkedTransferQueue allow duplicate elements?

Yes.

---

## Q8. Does LinkedTransferQueue allow null elements?

No.

Throws

```text
NullPointerException
```

---

## Q9. Is LinkedTransferQueue bounded?

No.

It is **unbounded**.

---

## Q10. Which synchronization mechanism does LinkedTransferQueue use?

Primarily

```text
CAS (Compare-And-Swap)
```

with lock-free algorithms.

---

## Q11. When should LinkedTransferQueue be preferred over LinkedBlockingQueue?

When:

- Direct producer-to-consumer transfer is required.
- Higher concurrency is desired.
- Lock-free performance is important.

---

## Q12. Where is LinkedTransferQueue commonly used?

Examples:

- High-Performance Messaging Systems
- Producer-Consumer Architectures
- Task Scheduling
- Concurrent Pipelines
- Event Processing Systems

---

# Summary

- `LinkedTransferQueue` is the concrete implementation of the `TransferQueue` interface.
- Internally uses a **Lock-Free Linked Node Structure**.
- Supports both normal queue operations and direct producer-to-consumer transfer.
- Inherits methods from `Iterable`, `Collection`, `Queue`, `BlockingQueue`, and `TransferQueue`.
- Supports `transfer()`, `tryTransfer()`, and waiting consumer detection.
- Uses **CAS (Compare-And-Swap)** and advanced lock-free algorithms for high scalability.
- Grows dynamically and is **unbounded**.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for high-performance concurrent messaging, task pipelines, event processing, and producer-consumer systems requiring efficient direct handoff.