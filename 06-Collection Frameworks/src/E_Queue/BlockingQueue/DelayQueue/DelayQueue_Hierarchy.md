# DelayQueue Method Hierarchy

## Overview

`DelayQueue` is a specialized implementation of the `BlockingQueue` interface in the Java Collection Framework.

Unlike other queue implementations, a `DelayQueue` stores elements that become available **only after their delay has expired**.

Every element inserted into a `DelayQueue` must implement the `Delayed` interface.

Internally, `DelayQueue` uses a **Priority Queue (Binary Heap)** ordered by each element's remaining delay.

It provides:

- Delay-Based Ordering
- Blocking Remove Operations
- Timed Remove Operations
- Thread Safety
- Dynamic Growth
- Unbounded Capacity
- Automatic Ordering by Delay
- Duplicate Elements Allowed
- Null Elements Not Allowed

Since `DelayQueue` implements the `BlockingQueue` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`
- `BlockingQueue`

Additionally, `DelayQueue` provides its own constructors.

---

## Class Declaration

```java
public class DelayQueue<E extends Delayed>
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
DelayQueue
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
DelayQueue
```

---

## Complete DelayQueue Method Hierarchy

```text
DelayQueue<E extends Delayed>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── DelayQueue()
└── DelayQueue(Collection<? extends E> c)
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
│ DelayQueue Specific Public Methods
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

The methods available in a `DelayQueue` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `DelayQueue` class | `DelayQueue()`, `DelayQueue(Collection)` | Not inherited; unbounded |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `BlockingQueue extends Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard queue operations |
| **BlockingQueue** | `DelayQueue implements BlockingQueue` | `put()`, `take()`, `offer(timeout)`, `poll(timeout)`, `remainingCapacity()`, `drainTo()` | Thread-safe blocking operations |
| **DelayQueue Specific** | `DelayQueue` class | No new public methods | Internal: Priority Queue (Binary Heap) |
| **Optimized Overrides** | `DelayQueue` reimplementation | `put()`, `take()`, `offer()`, `poll()`, `iterator()`, `spliterator()` | Optimized with ReentrantLock + Leader-Follower strategy |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `DelayQueue`), even when the object is a `DelayQueue`.
> ```java
> Queue<Task> queue = new DelayQueue<>();
> queue.remainingCapacity();   // ❌ Compile error
> ```

---

## DelayQueue Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `DelayQueue()` | `new DelayQueue<>()` | Empty delay queue; unbounded | O(1) | O(1) |
| `DelayQueue(Collection<? extends E> c)` | `new DelayQueue<>(collection)` | Pre-fill with delayed elements from another collection | O(n) | O(n) |

> **Note:** Every element must implement the `Delayed` interface.

---

## BlockingQueue Methods (DelayQueue Behavior)

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `put(E e)` | `queue.put(element)` | Inserts element; never blocks (unbounded) | O(log n) | O(1) |
| `take()` | `queue.take()` | Removes and returns head; blocks until head's delay expires | O(log n) | O(1) |
| `offer(E e, long timeout, TimeUnit unit)` | `queue.offer(e, 5, TimeUnit.SECONDS)` | Inserts element; returns true immediately (unbounded) | O(log n) | O(1) |
| `poll(long timeout, TimeUnit unit)` | `queue.poll(5, TimeUnit.SECONDS)` | Removes head; blocks until delay expires or timeout | O(log n) | O(1) |
| `remainingCapacity()` | `queue.remainingCapacity()` | Always returns `Integer.MAX_VALUE` (unbounded) | O(1) | O(1) |
| `drainTo(Collection<? super E> c)` | `queue.drainTo(list)` | Transfers all **expired** elements | O(n) | O(1) |
| `drainTo(Collection<? super E> c, int maxElements)` | `queue.drainTo(list, 5)` | Transfers at most maxElements **expired** elements | O(min(n, max)) | O(1) |

---

## Internal Working

`DelayQueue` internally stores elements using a **Priority Queue (Binary Heap)** ordered by remaining delay, managed by a **ReentrantLock** with **Leader-Follower** waiting strategy.

```text
          2 sec
         /          5 sec    8 sec
      /
  10 sec
```

The element with the **smallest remaining delay** always stays at the root.

### Delay Mechanism

```text
Task A → 10 sec    Task B → 5 sec    Task C → 2 sec

          C(2s)
         /           A(10s)   B(5s)

Consumer Thread:
    take()
      ↓
    Wait until Task C's delay (2s) expires
      ↓
    Return Task C
      ↓
    Next: wait for Task B's delay (5s) to expire
```

- `take()` blocks until the head element's delay expires.
- Unexpired elements remain in the queue.
- The **Leader-Follower** pattern ensures only one thread waits for the next expiration, while others wait indefinitely.

---

## Optimized Overrides

`DelayQueue` reimplements these inherited methods for delay-aware priority queue performance:

```java
put(E)                     // Inserts into binary heap; O(log n)
take()                     // Leader waits for head delay; followers wait indefinitely
offer(E) / offer(E,timeout) // Same as put (unbounded)
poll() / poll(timeout)      // Returns null if head not expired; blocks with timeout
iterator()                 // Weakly consistent snapshot of elements
spliterator()              // Heap-aware split for parallel streams
```

> **Note:** The iterator is **weakly consistent** — may reflect concurrent modifications but never throws `ConcurrentModificationException`.

---

## DelayQueue vs PriorityBlockingQueue

| Feature | DelayQueue | PriorityBlockingQueue |
|---------|-----------:|----------------------:|
| Ordering | By remaining delay | By priority (Comparator) |
| Thread Safe | ✅ | ✅ |
| Blocking Operations | ✅ | ✅ |
| Delayed Execution | ✅ | ❌ |
| Requires Delayed Interface | ✅ | ❌ |
| Internal Structure | Binary Heap | Binary Heap |
| Unbounded | ✅ | ✅ |

---

## DelayQueue vs ScheduledThreadPoolExecutor

| Feature | DelayQueue | ScheduledThreadPoolExecutor |
|---------|-----------:|----------------------------:|
| Stores Delayed Tasks | ✅ | ✅ |
| Executes Tasks Automatically | ❌ (manual take()) | ✅ |
| Thread Pool | ❌ | ✅ |
| Use Case | Custom scheduling logic | Built-in task execution |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Delayed task scheduling | `DelayQueue()` | `new DelayQueue<>()` |
| Pre-fill with delayed tasks | `DelayQueue(Collection)` | `new DelayQueue<>(taskList)` |
| Block until task delay expires | `take()` | `queue.take()` |
| Non-blocking check for expired tasks | `poll()` | `queue.poll()` |
| Block with timeout for expired task | `poll(timeout, TimeUnit)` | `queue.poll(5, TimeUnit.SECONDS)` |
| Batch process all expired tasks | `drainTo(Collection)` | `queue.drainTo(expiredList)` |
| Batch process limited expired tasks | `drainTo(Collection, int)` | `queue.drainTo(expiredList, 10)` |

---

## Interview Q&A

**Q1. Which interface does DelayQueue implement?**  
`BlockingQueue` — indirectly `Queue`, `Collection`, and `Iterable`.

**Q2. Which data structure does DelayQueue use internally?**  
Priority Queue (Binary Heap).

**Q3. Is DelayQueue thread-safe?**  
Yes. Uses ReentrantLock and Leader-Follower waiting strategy.

**Q4. Which interface must every stored element implement?**  
`Delayed`.

**Q5. Does take() return the head element immediately?**  
No. It blocks until the head element's delay expires.

**Q6. Does DelayQueue maintain FIFO order?**  
No. It maintains **delay order** — smallest remaining delay first.

**Q7. Does DelayQueue allow duplicate elements?**  
Yes.

**Q8. Does DelayQueue allow null elements?**  
No. Throws `NullPointerException`.

**Q9. What does remainingCapacity() return?**  
`Integer.MAX_VALUE` because the queue is unbounded.

**Q10. What is the time complexity of insertion and removal?**  
O(log n) because operations maintain the Binary Heap.

**Q11. Where is DelayQueue commonly used?**  
Cache expiration, session timeout, task scheduling, retry mechanisms, delayed message processing.

**Q12. Why is DelayQueue preferred over a normal PriorityQueue?**  
Because it supports thread safety, blocking operations, and automatic delay-based retrieval — making it suitable for concurrent delayed task scheduling.

---

## Summary

- `DelayQueue` is a specialized thread-safe implementation of the `BlockingQueue` interface.
- Internally uses a **Priority Queue (Binary Heap)**.
- Stores only objects implementing the **Delayed** interface.
- Elements become available **only after their delay expires**.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `BlockingQueue`.
- Supports blocking retrieval and timed operations.
- Uses **ReentrantLock**, **Condition Variables**, and the **Leader-Follower** waiting strategy for efficient synchronization.
- Grows dynamically and is **unbounded**.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for delayed task scheduling, cache expiration, timeout handling, retry queues, and other time-based concurrent applications.
