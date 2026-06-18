# ArrayBlockingQueue Method Hierarchy

## Overview

`ArrayBlockingQueue` is the most commonly used bounded implementation of the `BlockingQueue` interface in the Java Collection Framework.

Unlike `LinkedBlockingQueue`, `ArrayBlockingQueue` internally stores elements using a **Fixed-Size Circular Array**, meaning its capacity is determined at the time of creation and **cannot be changed** later.

It is designed specifically for **Producer-Consumer** applications where the maximum queue size must remain fixed.

It provides:

- FIFO (First In First Out) Ordering
- Blocking Insert Operations
- Blocking Remove Operations
- Timed Insert & Remove Operations
- Thread Safety
- Fixed Capacity
- Optional Fairness Policy
- Duplicate Elements Allowed
- Null Elements Not Allowed

Since `ArrayBlockingQueue` implements the `BlockingQueue` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`
- `BlockingQueue`

Additionally, `ArrayBlockingQueue` provides its own constructors.

---

## Class Declaration

```java
public class ArrayBlockingQueue<E>
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
ArrayBlockingQueue
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
ArrayBlockingQueue
```

---

## Complete ArrayBlockingQueue Method Hierarchy

```text
ArrayBlockingQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ArrayBlockingQueue(int capacity)
├── ArrayBlockingQueue(int capacity,
│                      boolean fair)
└── ArrayBlockingQueue(int capacity,
                       boolean fair,
                       Collection<? extends E> c)
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
│ ArrayBlockingQueue Specific Public Methods
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

The methods available in an `ArrayBlockingQueue` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `ArrayBlockingQueue` class | `ArrayBlockingQueue(int)`, `ArrayBlockingQueue(int, boolean)`, `ArrayBlockingQueue(int, boolean, Collection)` | Not inherited; capacity is fixed |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `BlockingQueue extends Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard FIFO operations |
| **BlockingQueue** | `ArrayBlockingQueue implements BlockingQueue` | `put()`, `take()`, `offer(timeout)`, `poll(timeout)`, `remainingCapacity()`, `drainTo()` | Thread-safe blocking operations |
| **ArrayBlockingQueue Specific** | `ArrayBlockingQueue` class | No new public methods | Internal: Fixed-Size Circular Array |
| **Optimized Overrides** | `ArrayBlockingQueue` reimplementation | `put()`, `take()`, `offer()`, `poll()`, `iterator()`, `spliterator()` | Optimized with ReentrantLock + Condition Variables |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `ArrayBlockingQueue`), even when the object is an `ArrayBlockingQueue`.
> ```java
> Queue<Integer> queue = new ArrayBlockingQueue<>(10);
> queue.remainingCapacity();   // ❌ Compile error
> ```

---

## ArrayBlockingQueue Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `ArrayBlockingQueue(int capacity)` | `new ArrayBlockingQueue<>(10)` | Fixed-capacity queue; non-fair by default | O(1) | O(n) |
| `ArrayBlockingQueue(int capacity, boolean fair)` | `new ArrayBlockingQueue<>(10, true)` | Fixed-capacity with fairness policy | O(1) | O(n) |
| `ArrayBlockingQueue(int capacity, boolean fair, Collection<? extends E> c)` | `new ArrayBlockingQueue<>(10, true, list)` | Fixed-capacity with fairness, pre-filled with elements | O(n) | O(n) |

### Fair vs Non-Fair Queue

| Fairness | Behavior | Performance |
|----------|----------|-------------|
| `fair = true` | Waiting threads served in FIFO order | Lower throughput |
| `fair = false` (default) | Threads may acquire lock in any order | Higher throughput |

```java
// Fair — threads served in order they arrived
ArrayBlockingQueue<String> fairQueue = new ArrayBlockingQueue<>(10, true);

// Non-Fair — better performance, no ordering guarantee
ArrayBlockingQueue<String> fastQueue = new ArrayBlockingQueue<>(10, false);
```

---

## BlockingQueue Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `put(E e)` | `queue.put(element)` | Inserts element; blocks if queue is full | O(1) | O(1) |
| `take()` | `queue.take()` | Removes and returns head; blocks if queue is empty | O(1) | O(1) |
| `offer(E e, long timeout, TimeUnit unit)` | `queue.offer(e, 5, TimeUnit.SECONDS)` | Inserts with timeout; returns false if timed out | O(1) | O(1) |
| `poll(long timeout, TimeUnit unit)` | `queue.poll(5, TimeUnit.SECONDS)` | Removes with timeout; returns null if timed out | O(1) | O(1) |
| `remainingCapacity()` | `queue.remainingCapacity()` | Returns available space before queue becomes full | O(1) | O(1) |
| `drainTo(Collection<? super E> c)` | `queue.drainTo(list)` | Transfers all available elements to another collection | O(n) | O(1) |
| `drainTo(Collection<? super E> c, int maxElements)` | `queue.drainTo(list, 5)` | Transfers at most maxElements elements | O(min(n, max)) | O(1) |

---

## Internal Working

`ArrayBlockingQueue` stores elements using a **Fixed-Size Circular Array** managed by a single **ReentrantLock** with two **Condition Variables** (notEmpty, notFull).

```text
             Front
               │
               ▼
        +----+----+----+----+----+
        | 20 | 30 |    |    | 10 |
        +----+----+----+----+----+
                            ▲
                            │
                           Rear
```

When either end reaches the last index, it wraps around to the beginning. This avoids shifting elements.

### Producer-Consumer Model

```text
Producer Thread          ArrayBlockingQueue          Consumer Thread
     put() ────────────────► ◄─────────────────────── take()
                              │
                    ┌─────────┴─────────┐
                    │  Fixed Circular     │
                    │  Array + Reentrant  │
                    │  Lock + Conditions  │
                    └─────────────────────┘
```

- If queue is **full**, Producer blocks (waits on `notFull` condition).
- If queue is **empty**, Consumer blocks (waits on `notEmpty` condition).
- Blocking is handled automatically.

---

## Optimized Overrides

`ArrayBlockingQueue` reimplements these inherited methods for thread-safe circular array performance:

```java
put(E)                     // Blocks with ReentrantLock + notFull condition
take()                     // Blocks with ReentrantLock + notEmpty condition
offer(E) / offer(E,timeout) // Non-blocking / timed insertion
poll() / poll(timeout)      // Non-blocking / timed removal
iterator()                 // Weakly consistent; reflects queue state at creation
spliterator()              // Array-based split for parallel streams
```

> **Note:** The iterator is **weakly consistent** — it may reflect concurrent modifications but will never throw `ConcurrentModificationException`.

---

## ArrayBlockingQueue vs LinkedBlockingQueue

| Feature | ArrayBlockingQueue | LinkedBlockingQueue |
|---------|-------------------:|--------------------:|
| Internal Structure | Fixed-Size Circular Array | Linked List |
| Capacity | Fixed (must specify) | Optional (default Integer.MAX_VALUE) |
| Memory Usage | Lower (pre-allocated array) | Higher (node per element) |
| Dynamic Growth | ❌ No | ✅ Yes (if unbounded) |
| Fairness Option | ✅ Yes | ❌ No |
| Locking | Single ReentrantLock | Two separate locks (insert/remove) |
| Cache Locality | Better | Lower |
| Producer-Consumer | Excellent | Excellent |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Known max queue size, producer-consumer | `ArrayBlockingQueue(int)` | `new ArrayBlockingQueue<>(100)` |
| Fair thread scheduling required | `ArrayBlockingQueue(int, true)` | `new ArrayBlockingQueue<>(50, true)` |
| Pre-fill queue with existing elements | `ArrayBlockingQueue(int, boolean, Collection)` | `new ArrayBlockingQueue<>(20, true, list)` |
| Block until space available | `put()` | `queue.put(element)` |
| Block until element available | `take()` | `queue.take()` |
| Insert with timeout | `offer(E, timeout, TimeUnit)` | `queue.offer(e, 5, TimeUnit.SECONDS)` |
| Remove with timeout | `poll(timeout, TimeUnit)` | `queue.poll(5, TimeUnit.SECONDS)` |
| Check available space | `remainingCapacity()` | `queue.remainingCapacity()` |
| Batch transfer all elements | `drainTo(Collection)` | `queue.drainTo(list)` |
| Batch transfer limited elements | `drainTo(Collection, int)` | `queue.drainTo(list, 5)` |

---

## Interview Q&A

**Q1. Which interface does ArrayBlockingQueue implement?**  
`BlockingQueue` — indirectly `Queue`, `Collection`, and `Iterable`.

**Q2. Which data structure does ArrayBlockingQueue use internally?**  
Fixed-Size Circular Array.

**Q3. Is ArrayBlockingQueue thread-safe?**  
Yes. Uses ReentrantLock and Condition Variables for synchronization.

**Q4. Does ArrayBlockingQueue support blocking operations?**  
Yes. `put()` blocks when full; `take()` blocks when empty.

**Q5. Does ArrayBlockingQueue support timeout operations?**  
Yes. `offer(element, timeout, TimeUnit)` and `poll(timeout, TimeUnit)`.

**Q6. What is the purpose of the fairness parameter?**  
Determines whether waiting threads obtain access in FIFO order (`true`) or any order (`false`, default, better throughput).

**Q7. Does ArrayBlockingQueue allow duplicate elements?**  
Yes.

**Q8. Does ArrayBlockingQueue allow null elements?**  
No. Throws `NullPointerException`.

**Q9. Can the capacity be increased after creation?**  
No. The capacity is fixed at construction time.

**Q10. Which synchronization mechanism does it use internally?**  
ReentrantLock + Condition Variables (notEmpty, notFull).

**Q11. When should ArrayBlockingQueue be preferred over LinkedBlockingQueue?**  
When fixed capacity is required, lower memory usage is preferred, better cache locality is desired, or fair scheduling is needed.

**Q12. What is the time complexity of insertion and removal?**  
O(1) for both operations.

---

## Summary

- `ArrayBlockingQueue` is a bounded implementation of the `BlockingQueue` interface.
- Internally uses a **Fixed-Size Circular Array**.
- Supports FIFO ordering with blocking and timed operations.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `BlockingQueue`.
- Supports optional **Fair** and **Non-Fair** thread scheduling.
- Uses **ReentrantLock** and **Condition Variables** for synchronization.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for producer-consumer systems, thread pools, task scheduling, and other concurrent applications where a fixed-capacity queue is required.
