# LinkedTransferQueue Method Hierarchy

## Overview

`LinkedTransferQueue` is the most advanced implementation of the `TransferQueue` interface in the Java Collection Framework.

It extends the capabilities of a normal `BlockingQueue` by supporting **direct transfer of elements between producer and consumer threads**.

Unlike `SynchronousQueue`, `LinkedTransferQueue` can either:

- Transfer elements immediately to waiting consumers.
- Store elements if no consumer is currently waiting.

Internally, it stores elements using a **Lock-Free Linked Node Structure** based on CAS (Compare-And-Swap) operations.

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

- `Iterable`
- `Collection`
- `Queue`
- `BlockingQueue`
- `TransferQueue`

Additionally, `LinkedTransferQueue` provides its own constructors.

---

## Class Declaration

```java
public class LinkedTransferQueue<E>
        extends AbstractQueue<E>
        implements TransferQueue<E>, Serializable
```

---

## Inheritance Hierarchy

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

## Interface Relationship

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
LinkedTransferQueue
```

---

## Complete LinkedTransferQueue Method Hierarchy

```text
LinkedTransferQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── LinkedTransferQueue()
└── LinkedTransferQueue(Collection<? extends E> c)
│
├──────────────────────────────────────────────
│ Methods Inherited from Iterable
├──────────────────────────────────────────────
│
├── iterator()
├── spliterator()
└── forEach()
│
├──────────────────────────────────────────────
│ Methods Inherited from Collection
├──────────────────────────────────────────────
│
├── add(E e)
├── addAll(Collection<? extends E> c)
│
├── remove(Object o)
├── removeAll(Collection<?> c)
├── retainAll(Collection<?> c)
├── removeIf(Predicate<? super E> filter)
│
├── contains(Object o)
├── containsAll(Collection<?> c)
│
├── size()
├── isEmpty()
├── clear()
│
├── toArray()
├── toArray(T[] a)
├── toArray(IntFunction<T[]> generator)
│
├── stream()
├── parallelStream()
│
├── equals(Object o)
└── hashCode()
│
├──────────────────────────────────────────────
│ Methods Inherited from Queue
├──────────────────────────────────────────────
│
├── add(E e)
├── offer(E e)
│
├── remove()
├── poll()
│
├── element()
└── peek()
│
├──────────────────────────────────────────────
│ Methods Inherited from BlockingQueue
├──────────────────────────────────────────────
│
├── put(E e)
├── offer(E e, long timeout, TimeUnit unit)
├── take()
├── poll(long timeout, TimeUnit unit)
│
├── remainingCapacity()
├── drainTo(Collection<? super E> c)
└── drainTo(Collection<? super E> c, int maxElements)
│
├──────────────────────────────────────────────
│ Methods Inherited from TransferQueue
├──────────────────────────────────────────────
│
├── transfer(E e)
├── tryTransfer(E e)
├── tryTransfer(E e, long timeout, TimeUnit unit)
├── hasWaitingConsumer()
└── getWaitingConsumerCount()
│
├──────────────────────────────────────────────
│ LinkedTransferQueue Specific Public Methods
├──────────────────────────────────────────────
│
└── *(No Additional Public Methods)*
│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── transfer()
├── tryTransfer()
├── put()
├── take()
├── offer()
├── poll()
├── iterator()
└── spliterator()
```

---

## Understanding the Hierarchy

The methods available in a `LinkedTransferQueue` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `LinkedTransferQueue` class | `LinkedTransferQueue()`, `LinkedTransferQueue(Collection)` | Not inherited; unbounded |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `BlockingQueue extends Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard FIFO operations |
| **BlockingQueue** | `TransferQueue extends BlockingQueue` | `put()`, `take()`, `offer(timeout)`, `poll(timeout)`, `remainingCapacity()`, `drainTo()` | Thread-safe blocking operations |
| **TransferQueue** | `LinkedTransferQueue implements TransferQueue` | `transfer()`, `tryTransfer()`, `hasWaitingConsumer()`, `getWaitingConsumerCount()` | Direct producer-to-consumer transfer |
| **LinkedTransferQueue Specific** | `LinkedTransferQueue` class | No new public methods | Internal: Lock-Free Linked Nodes |
| **Optimized Overrides** | `LinkedTransferQueue` reimplementation | `transfer()`, `tryTransfer()`, `put()`, `take()`, `offer()`, `poll()`, `iterator()`, `spliterator()` | Optimized with CAS + lock-free algorithms |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, `TransferQueue`, or `LinkedTransferQueue`), even when the object is a `LinkedTransferQueue`.
> ```java
> BlockingQueue<String> queue = new LinkedTransferQueue<>();
> queue.transfer("data");   // ❌ Compile error — transfer() is in TransferQueue, not BlockingQueue
> ```

---

## LinkedTransferQueue Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `LinkedTransferQueue()` | `new LinkedTransferQueue<>()` | Empty lock-free transfer queue; unbounded | O(1) | O(1) |
| `LinkedTransferQueue(Collection<? extends E> c)` | `new LinkedTransferQueue<>(collection)` | Pre-fill with elements from another collection | O(n) | O(n) |

---

## TransferQueue Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `transfer(E e)` | `queue.transfer("data")` | Producer blocks until consumer receives the element | O(1)* | O(1) |
| `tryTransfer(E e)` | `queue.tryTransfer("data")` | Transfers immediately if consumer waiting; returns true/false | O(1)* | O(1) |
| `tryTransfer(E e, long timeout, TimeUnit unit)` | `queue.tryTransfer("data", 5, TimeUnit.SECONDS)` | Waits for consumer up to timeout; returns true/false | O(1)* | O(1) |
| `hasWaitingConsumer()` | `queue.hasWaitingConsumer()` | Checks if any consumer thread is waiting | O(1) | O(1) |
| `getWaitingConsumerCount()` | `queue.getWaitingConsumerCount()` | Estimate of waiting consumer threads | O(n) | O(1) |

> **Note:** `transfer()` and `tryTransfer()` are generally **O(1)** because they use lock-free CAS operations, although thread contention may increase execution time.

### transfer() vs put() vs offer()

| Method | Blocks? | Stores if no consumer? | Use Case |
|--------|:-------:|:----------------------:|----------|
| `transfer()` | Yes (until consumed) | No | Guaranteed direct handoff |
| `put()` | Yes (until space) | Yes | Standard blocking enqueue |
| `offer()` | No | Yes | Non-blocking enqueue |
| `tryTransfer()` | No | No | Immediate handoff if consumer waiting |

---

## BlockingQueue Methods (LinkedTransferQueue Behavior)

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `put(E e)` | `queue.put(element)` | Inserts element; never blocks (unbounded) | O(1) | O(1) |
| `take()` | `queue.take()` | Removes and returns head; blocks if empty | O(1) | O(1) |
| `offer(E e, long timeout, TimeUnit unit)` | `queue.offer(e, 5, TimeUnit.SECONDS)` | Same as `offer(E)` — never blocks (unbounded) | O(1) | O(1) |
| `poll(long timeout, TimeUnit unit)` | `queue.poll(5, TimeUnit.SECONDS)` | Removes head; blocks with timeout if empty | O(1) | O(1) |
| `remainingCapacity()` | `queue.remainingCapacity()` | Always returns `Integer.MAX_VALUE` (unbounded) | O(1) | O(1) |
| `drainTo(Collection<? super E> c)` | `queue.drainTo(list)` | Transfers all available elements | O(n) | O(1) |
| `drainTo(Collection<? super E> c, int maxElements)` | `queue.drainTo(list, 5)` | Transfers at most maxElements elements | O(min(n, max)) | O(1) |

---

## Internal Working

`LinkedTransferQueue` internally uses a **Lock-Free Linked Node Structure** where each node may represent either a **Data Node** (element waiting to be consumed) or a **Request Node** (consumer waiting for data). Producer and consumer threads are matched using **CAS (Compare-And-Swap)** operations.

```text
Head                                              Tail
 │                                                 │
 ▼                                                 ▼
Data(10) ───► Data(20) ───► Request(null) ───► Data(30) ───► NULL
              ↑                              ↑
         Consumer takes                    Producer adds
```

### Producer-Consumer Matching

```text
Scenario 1: Consumer arrives first
    Consumer take()
         │
         ▼
    No data available → Create Request Node
         │
         ▼
    Wait (parked)...
         │
    Producer transfer("A") ───► Matches with Request Node
         │
    Consumer receives "A" immediately, both continue

Scenario 2: Producer arrives first
    Producer transfer("B")
         │
         ▼
    No consumer waiting → Create Data Node
         │
         ▼
    Wait (parked)...
         │
    Consumer take() ───► Matches with Data Node
         │
    Consumer receives "B" immediately, both continue

Scenario 3: No waiting party
    Producer put("C") / offer("C")
         │
         ▼
    No consumer waiting → Enqueue Data Node
         │
         ▼
    Producer continues (not blocked)
         │
    Consumer take() later ───► Dequeues "C"
```

- **CAS operations** ensure thread-safe node insertion/removal without locks.
- Threads are **parked/unparked** using LockSupport for efficient waiting.
- The queue is **unbounded** — `put()` never blocks.

---

## Optimized Overrides

`LinkedTransferQueue` reimplements these inherited methods for lock-free linked node performance:

```java
transfer(E)                // Parks producer until matched with consumer; CAS node matching
tryTransfer(E)             // Attempts immediate CAS match; returns false if no consumer
tryTransfer(E,timeout)     // Parks producer with timeout until matched
put(E)                     // Enqueues data node; never blocks (unbounded)
take()                     // Matches with data node or parks as request node
offer(E) / offer(E,timeout) // Same as put (unbounded)
poll() / poll(timeout)      // Matches with data node or returns null
iterator()                 // Weakly consistent traversal of linked nodes
spliterator()              // Lock-free split for parallel streams
```

> **Note:** The iterator is **weakly consistent** — may reflect concurrent modifications but never throws `ConcurrentModificationException`.

---

## LinkedTransferQueue vs LinkedBlockingQueue

| Feature | LinkedTransferQueue | LinkedBlockingQueue |
|---------|--------------------:|--------------------:|
| Internal Structure | Lock-Free Linked Nodes | Linked List + Dual Locks |
| Direct Transfer | ✅ | ❌ |
| Blocking Queue | ✅ | ✅ |
| Lock-Free | ✅ (CAS) | ❌ (ReentrantLocks) |
| Dynamic Growth | ✅ | ✅ |
| Producer Wait | Optional (transfer) | Only when Full |
| Scalability | Higher | Lower |

---

## LinkedTransferQueue vs SynchronousQueue

| Feature | LinkedTransferQueue | SynchronousQueue |
|---------|--------------------:|-----------------:|
| Capacity | Unbounded | 0 |
| Stores Elements | ✅ | ❌ |
| Direct Transfer | ✅ | ✅ (only mode) |
| Producer Wait | Optional | Always |
| Thread Safe | ✅ | ✅ |
| Use Case | Hybrid queue + handoff | Pure handoff |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| High-performance concurrent messaging | `LinkedTransferQueue()` | `new LinkedTransferQueue<>()` |
| Pre-fill with existing elements | `LinkedTransferQueue(Collection)` | `new LinkedTransferQueue<>(list)` |
| Guaranteed direct handoff | `transfer()` | `queue.transfer(data)` |
| Immediate handoff if possible | `tryTransfer()` | `queue.tryTransfer(data)` |
| Timed handoff attempt | `tryTransfer(timeout)` | `queue.tryTransfer(data, 5, TimeUnit.SECONDS)` |
| Check for waiting consumers | `hasWaitingConsumer()` | `queue.hasWaitingConsumer()` |
| Monitor consumer count | `getWaitingConsumerCount()` | `queue.getWaitingConsumerCount()` |
| Standard blocking enqueue | `put()` | `queue.put(data)` |
| Standard blocking dequeue | `take()` | `queue.take()` |
| Batch transfer | `drainTo(Collection)` | `queue.drainTo(list)` |

---

## Interview Q&A

**Q1. Which interface does LinkedTransferQueue implement?**  
`TransferQueue` — indirectly `BlockingQueue`, `Queue`, `Collection`, and `Iterable`.

**Q2. Which data structure does LinkedTransferQueue use internally?**  
Lock-Free Linked Node Structure with CAS operations.

**Q3. Is LinkedTransferQueue thread-safe?**  
Yes. Uses lock-free CAS algorithms for high scalability.

**Q4. What is the purpose of transfer()?**  
Transfers an element directly to a waiting consumer. If no consumer is available, the producer blocks until one arrives.

**Q5. What is the difference between transfer() and put()?**  
- `put()` simply inserts the element into the queue (never blocks, unbounded).  
- `transfer()` waits until the element is actually received by a consumer.

**Q6. What does tryTransfer() do?**  
Attempts immediate transfer. Returns `true` if a consumer is waiting and receives the element; returns `false` without blocking otherwise.

**Q7. Does LinkedTransferQueue allow duplicate elements?**  
Yes.

**Q8. Does LinkedTransferQueue allow null elements?**  
No. Throws `NullPointerException`.

**Q9. Is LinkedTransferQueue bounded?**  
No. It is **unbounded**.

**Q10. Which synchronization mechanism does LinkedTransferQueue use?**  
Primarily **CAS (Compare-And-Swap)** with lock-free algorithms. Minimal use of traditional locking.

**Q11. When should LinkedTransferQueue be preferred over LinkedBlockingQueue?**  
When direct producer-to-consumer transfer is required, higher concurrency is desired, or lock-free performance is important.

**Q12. Where is LinkedTransferQueue commonly used?**  
High-performance messaging systems, producer-consumer architectures, task scheduling, concurrent pipelines, event processing systems.

---

## Summary

- `LinkedTransferQueue` is the concrete implementation of the `TransferQueue` interface.
- Internally uses a **Lock-Free Linked Node Structure**.
- Supports both normal queue operations and direct producer-to-consumer transfer.
- Inherits methods from `Iterable`, `Collection`, `Queue`, `BlockingQueue`, and `TransferQueue`.
- Supports `transfer()`, `tryTransfer()`, and waiting consumer detection.
- Uses **CAS (Compare-And-Swap)** and advanced lock-free algorithms for high scalability.
- Grows dynamically and is **unbounded**.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for high-performance concurrent messaging, task pipelines, event processing, and producer-consumer systems requiring efficient direct handoff.
