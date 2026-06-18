# LinkedBlockingQueue Method Hierarchy

## Overview

`LinkedBlockingQueue` is the most commonly used linked implementation of the `BlockingQueue` interface in the Java Collection Framework.

Unlike `ArrayBlockingQueue`, `LinkedBlockingQueue` internally stores elements using a **Linked List**, allowing it to grow dynamically until the specified capacity is reached.

It is designed primarily for **Producer-Consumer** applications where thread-safe communication between multiple threads is required.

It provides:

- FIFO (First In First Out) Ordering
- Blocking Insert Operations
- Blocking Remove Operations
- Timed Insert & Remove Operations
- Thread Safety
- Optional Capacity Restriction
- Dynamic Growth
- Duplicate Elements Allowed
- Null Elements Not Allowed

Since `LinkedBlockingQueue` implements the `BlockingQueue` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`
- `BlockingQueue`

Additionally, `LinkedBlockingQueue` provides its own constructors.

---

## Class Declaration

```java
public class LinkedBlockingQueue<E>
        extends AbstractQueue<E>
        implements BlockingQueue<E>, Serializable
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
AbstractQueue
    ↑
LinkedBlockingQueue
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
LinkedBlockingQueue
```

---

## Complete LinkedBlockingQueue Method Hierarchy

```text
LinkedBlockingQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── LinkedBlockingQueue()
├── LinkedBlockingQueue(int capacity)
└── LinkedBlockingQueue(Collection<? extends E> c)
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
│ LinkedBlockingQueue Specific Public Methods
├──────────────────────────────────────────────
│
└── *(No Additional Public Methods)*
│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── put()
├── take()
├── offer()
├── poll()
├── iterator()
└── spliterator()
```

---

## Understanding the Hierarchy

The methods available in a `LinkedBlockingQueue` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `LinkedBlockingQueue` class | `LinkedBlockingQueue()`, `LinkedBlockingQueue(int)`, `LinkedBlockingQueue(Collection)` | Not inherited; default capacity = Integer.MAX_VALUE |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `BlockingQueue extends Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard FIFO operations |
| **BlockingQueue** | `LinkedBlockingQueue implements BlockingQueue` | `put()`, `take()`, `offer(timeout)`, `poll(timeout)`, `remainingCapacity()`, `drainTo()` | Thread-safe blocking operations |
| **LinkedBlockingQueue Specific** | `LinkedBlockingQueue` class | No new public methods | Internal: Linked List |
| **Optimized Overrides** | `LinkedBlockingQueue` reimplementation | `put()`, `take()`, `offer()`, `poll()`, `iterator()`, `spliterator()` | Optimized with Dual ReentrantLocks |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `LinkedBlockingQueue`), even when the object is a `LinkedBlockingQueue`.
> ```java
> Queue<Integer> queue = new LinkedBlockingQueue<>(10);
> queue.remainingCapacity();   // ❌ Compile error
> ```

---

## LinkedBlockingQueue Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `LinkedBlockingQueue()` | `new LinkedBlockingQueue<>()` | Unbounded queue (capacity = Integer.MAX_VALUE) | O(1) | O(1) |
| `LinkedBlockingQueue(int capacity)` | `new LinkedBlockingQueue<>(100)` | Bounded queue with fixed capacity | O(1) | O(1) |
| `LinkedBlockingQueue(Collection<? extends E> c)` | `new LinkedBlockingQueue<>(collection)` | Pre-fill with elements from another collection | O(n) | O(n) |

> **Note:** Default constructor creates an unbounded queue. Use `LinkedBlockingQueue(int)` for bounded behavior.

---

## BlockingQueue Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `put(E e)` | `queue.put(element)` | Inserts element; blocks if queue is full (bounded) | O(1) | O(1) |
| `take()` | `queue.take()` | Removes and returns head; blocks if queue is empty | O(1) | O(1) |
| `offer(E e, long timeout, TimeUnit unit)` | `queue.offer(e, 5, TimeUnit.SECONDS)` | Inserts with timeout; returns false if timed out | O(1) | O(1) |
| `poll(long timeout, TimeUnit unit)` | `queue.poll(5, TimeUnit.SECONDS)` | Removes with timeout; returns null if timed out | O(1) | O(1) |
| `remainingCapacity()` | `queue.remainingCapacity()` | Returns available space (Integer.MAX_VALUE if unbounded) | O(1) | O(1) |
| `drainTo(Collection<? super E> c)` | `queue.drainTo(list)` | Transfers all available elements to another collection | O(n) | O(1) |
| `drainTo(Collection<? super E> c, int maxElements)` | `queue.drainTo(list, 5)` | Transfers at most maxElements elements | O(min(n, max)) | O(1) |

---

## Internal Working

`LinkedBlockingQueue` stores elements using a **Singly Linked List** managed by **two separate ReentrantLocks** (putLock and takeLock) with **Condition Variables**.

```text
Head                    Tail
 │                       │
 ▼                       ▼
10 ──► 20 ──► 30 ──► 40 ──► NULL
```

Each node stores: Data + Next Node Reference. The queue maintains both Head and Tail pointers for efficient insertion and removal.

### Producer-Consumer Model

```text
Producer Thread          LinkedBlockingQueue          Consumer Thread
     put() ────────────────► ◄─────────────────────── take()
                              │
                    ┌─────────┴─────────┐
                    │  Singly Linked      │
                    │  List + Dual Locks  │
                    │  (putLock/takeLock) │
                    └─────────────────────┘
```

- If queue is **full** (bounded), Producer blocks on `notFull` condition.
- If queue is **empty**, Consumer blocks on `notEmpty` condition.
- **Dual locks** allow producers and consumers to operate simultaneously → better concurrency than ArrayBlockingQueue.

---

## Optimized Overrides

`LinkedBlockingQueue` reimplements these inherited methods for thread-safe linked list performance:

```java
put(E)                     // Blocks with putLock + notFull condition
take()                     // Blocks with takeLock + notEmpty condition
offer(E) / offer(E,timeout) // Non-blocking / timed insertion
poll() / poll(timeout)      // Non-blocking / timed removal
iterator()                 // Weakly consistent; reflects queue state at creation
spliterator()              // Linked-list aware split for parallel streams
```

> **Note:** The iterator is **weakly consistent** — may reflect concurrent modifications but never throws `ConcurrentModificationException`.

---

## LinkedBlockingQueue vs ArrayBlockingQueue

| Feature | LinkedBlockingQueue | ArrayBlockingQueue |
|---------|--------------------:|-------------------:|
| Internal Structure | Singly Linked List | Fixed-Size Circular Array |
| Capacity | Optional (default unbounded) | Fixed (must specify) |
| Dynamic Growth | ✅ Yes (if unbounded) | ❌ No |
| Memory Usage | Higher (node per element) | Lower (pre-allocated array) |
| Locks | Two separate locks (put/take) | Single ReentrantLock |
| Concurrency | Better (producers & consumers parallel) | Lower |
| Cache Locality | Lower | Better |
| Fairness Option | ❌ No | ✅ Yes |
| Producer-Consumer | Excellent | Excellent |

---

## LinkedBlockingQueue vs ConcurrentLinkedQueue

| Feature | LinkedBlockingQueue | ConcurrentLinkedQueue |
|---------|--------------------:|----------------------:|
| Thread Safe | ✅ | ✅ |
| Blocking Operations | ✅ | ❌ |
| Timed Operations | ✅ | ❌ |
| Capacity Restriction | Optional | ❌ (always unbounded) |
| Producer-Consumer | Excellent | Not Suitable |
| Use Case | Blocking queues | Non-blocking concurrent access |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Unbounded thread-safe queue | `LinkedBlockingQueue()` | `new LinkedBlockingQueue<>()` |
| Bounded producer-consumer queue | `LinkedBlockingQueue(int)` | `new LinkedBlockingQueue<>(100)` |
| Pre-fill with existing elements | `LinkedBlockingQueue(Collection)` | `new LinkedBlockingQueue<>(list)` |
| Block until space available | `put()` | `queue.put(element)` |
| Block until element available | `take()` | `queue.take()` |
| Insert with timeout | `offer(E, timeout, TimeUnit)` | `queue.offer(e, 5, TimeUnit.SECONDS)` |
| Remove with timeout | `poll(timeout, TimeUnit)` | `queue.poll(5, TimeUnit.SECONDS)` |
| Check available space | `remainingCapacity()` | `queue.remainingCapacity()` |
| Batch transfer all elements | `drainTo(Collection)` | `queue.drainTo(list)` |
| Batch transfer limited elements | `drainTo(Collection, int)` | `queue.drainTo(list, 5)` |

---

## Interview Q&A

**Q1. Which interface does LinkedBlockingQueue implement?**  
`BlockingQueue` — indirectly `Queue`, `Collection`, and `Iterable`.

**Q2. Which data structure does LinkedBlockingQueue use internally?**  
Singly Linked List.

**Q3. Is LinkedBlockingQueue thread-safe?**  
Yes. Uses two ReentrantLocks and Condition Variables for synchronization.

**Q4. Does LinkedBlockingQueue support blocking operations?**  
Yes. `put()` blocks when full; `take()` blocks when empty.

**Q5. Does LinkedBlockingQueue support timeout operations?**  
Yes. `offer(element, timeout, TimeUnit)` and `poll(timeout, TimeUnit)`.

**Q6. Does LinkedBlockingQueue allow duplicate elements?**  
Yes.

**Q7. Does LinkedBlockingQueue allow null elements?**  
No. Throws `NullPointerException`.

**Q8. What is the default capacity of LinkedBlockingQueue?**  
`Integer.MAX_VALUE` — unbounded by default.

**Q9. Which synchronization mechanism does it use internally?**  
Two ReentrantLocks (putLock and takeLock) + Condition Variables.

**Q10. When should LinkedBlockingQueue be preferred over ArrayBlockingQueue?**  
When dynamic capacity is preferred, higher concurrency is required, or separate producer/consumer locks improve throughput.

**Q11. What is the time complexity of insertion and removal?**  
O(1) for both operations.

**Q12. Why does LinkedBlockingQueue generally have better concurrency than ArrayBlockingQueue?**  
Because it uses **two separate locks** (putLock and takeLock), allowing producers and consumers to operate simultaneously.

---

## Summary

- `LinkedBlockingQueue` is a thread-safe implementation of the `BlockingQueue` interface.
- Internally uses a **Singly Linked List**.
- Supports FIFO ordering with blocking and timed operations.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `BlockingQueue`.
- Uses **two ReentrantLocks** and **Condition Variables** for better concurrency.
- Supports both bounded and optionally unbounded capacities.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for producer-consumer systems, thread pools, task scheduling, and other concurrent applications requiring dynamic queue capacity.
