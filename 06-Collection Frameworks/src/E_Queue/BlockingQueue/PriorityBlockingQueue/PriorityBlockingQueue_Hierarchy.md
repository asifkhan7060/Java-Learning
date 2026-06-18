# PriorityBlockingQueue Method Hierarchy

## Overview

`PriorityBlockingQueue` is a thread-safe implementation of the `BlockingQueue` interface that processes elements according to their **priority** instead of insertion order.

Unlike `PriorityQueue`, `PriorityBlockingQueue` supports concurrent access by multiple threads and provides **blocking retrieval operations**.

Internally, it stores elements using a **Binary Heap (Min Heap by default)**.

It provides:

- Priority-Based Ordering
- Blocking Remove Operations
- Timed Remove Operations
- Thread Safety
- Dynamic Growth
- Natural Ordering (Default)
- Custom Ordering using Comparator
- Duplicate Elements Allowed
- Null Elements Not Allowed

Since `PriorityBlockingQueue` implements the `BlockingQueue` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`
- `BlockingQueue`

Additionally, `PriorityBlockingQueue` provides its own constructors.

---

## Class Declaration

```java
public class PriorityBlockingQueue<E>
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
PriorityBlockingQueue
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
PriorityBlockingQueue
```

---

## Complete PriorityBlockingQueue Method Hierarchy

```text
PriorityBlockingQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── PriorityBlockingQueue()
├── PriorityBlockingQueue(int initialCapacity)
├── PriorityBlockingQueue(int initialCapacity,
│                         Comparator<? super E> comparator)
├── PriorityBlockingQueue(Collection<? extends E> c)
├── PriorityBlockingQueue(PriorityQueue<? extends E> c)
└── PriorityBlockingQueue(SortedSet<? extends E> c)
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
│ PriorityBlockingQueue Specific Public Methods
├──────────────────────────────────────────────
│
└── comparator()
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

The methods available in a `PriorityBlockingQueue` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `PriorityBlockingQueue` class | `PriorityBlockingQueue()`, `PriorityBlockingQueue(int)`, `PriorityBlockingQueue(int, Comparator)`, `PriorityBlockingQueue(Collection)`, `PriorityBlockingQueue(PriorityQueue)`, `PriorityBlockingQueue(SortedSet)` | Not inherited; unbounded |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `BlockingQueue extends Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard queue operations |
| **BlockingQueue** | `PriorityBlockingQueue implements BlockingQueue` | `put()`, `take()`, `offer(timeout)`, `poll(timeout)`, `remainingCapacity()`, `drainTo()` | Thread-safe blocking operations |
| **PriorityBlockingQueue Specific** | `PriorityBlockingQueue` class | `comparator()` | Returns null for natural ordering |
| **Optimized Overrides** | `PriorityBlockingQueue` reimplementation | `put()`, `take()`, `offer()`, `poll()`, `iterator()`, `spliterator()` | Optimized with ReentrantLock + Binary Heap |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `PriorityBlockingQueue`), even when the object is a `PriorityBlockingQueue`.
> ```java
> Queue<Integer> queue = new PriorityBlockingQueue<>();
> queue.comparator();   // ❌ Compile error
> ```

---

## PriorityBlockingQueue Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `PriorityBlockingQueue()` | `new PriorityBlockingQueue<>()` | Empty queue; natural ordering; unbounded | O(1) | O(1) |
| `PriorityBlockingQueue(int initialCapacity)` | `new PriorityBlockingQueue<>(50)` | Pre-allocate capacity; natural ordering | O(1) | O(n) |
| `PriorityBlockingQueue(int initialCapacity, Comparator<? super E> comparator)` | `new PriorityBlockingQueue<>(20, Collections.reverseOrder())` | Custom priority ordering (e.g., Max Heap) | O(1) | O(n) |
| `PriorityBlockingQueue(Collection<? extends E> c)` | `new PriorityBlockingQueue<>(collection)` | Copy elements from any collection | O(n) | O(n) |
| `PriorityBlockingQueue(PriorityQueue<? extends E> c)` | `new PriorityBlockingQueue<>(priorityQueue)` | Copy from existing PriorityQueue | O(n) | O(n) |
| `PriorityBlockingQueue(SortedSet<? extends E> c)` | `new PriorityBlockingQueue<>(sortedSet)` | Copy from SortedSet; preserves ordering | O(n) | O(n) |

---

## BlockingQueue Methods (PriorityBlockingQueue Behavior)

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `put(E e)` | `queue.put(element)` | Inserts element; never blocks (unbounded) | O(log n) | O(1) |
| `take()` | `queue.take()` | Removes and returns highest-priority element; blocks if empty | O(log n) | O(1) |
| `offer(E e, long timeout, TimeUnit unit)` | `queue.offer(e, 5, TimeUnit.SECONDS)` | Inserts element; returns true immediately (unbounded) | O(log n) | O(1) |
| `poll(long timeout, TimeUnit unit)` | `queue.poll(5, TimeUnit.SECONDS)` | Removes highest-priority element; blocks with timeout if empty | O(log n) | O(1) |
| `remainingCapacity()` | `queue.remainingCapacity()` | Always returns `Integer.MAX_VALUE` (unbounded) | O(1) | O(1) |
| `drainTo(Collection<? super E> c)` | `queue.drainTo(list)` | Transfers all elements in priority order | O(n) | O(1) |
| `drainTo(Collection<? super E> c, int maxElements)` | `queue.drainTo(list, 5)` | Transfers at most maxElements elements in priority order | O(min(n, max)) | O(1) |
| `comparator()` | `queue.comparator()` | Returns Comparator used; null for natural ordering | O(1) | O(1) |

---

## Internal Working

`PriorityBlockingQueue` internally stores elements using a **Binary Min Heap** managed by a **ReentrantLock** with **Condition Variables**.

```text
         10
       /         20      30
    /    40    50
```

The root always stores the element with the **highest priority** (smallest element by default).

### Heap Operations

| Operation | Description | Time |
|-----------|-------------|:----:|
| **siftUp** | Moves newly inserted element upward until heap property is restored | O(log n) |
| **siftDown** | Moves root element downward after removal | O(log n) |
| **tryGrow** | Expands internal array when full | O(n) amortized |
| **dequeue** | Removes highest-priority element (root) | O(log n) |

### Producer-Consumer Model

```text
Producer Thread          PriorityBlockingQueue          Consumer Thread
     put() ────────────────► ◄─────────────────────── take()
                              │
                    ┌─────────┴─────────┐
                    │  Binary Min Heap    │
                    │  + ReentrantLock    │
                    │  + Condition Var    │
                    └─────────────────────┘
```

- Producer never blocks because the queue is **unbounded**.
- Consumer blocks only when the queue is empty (`notEmpty` condition).
- `take()` waits until an element becomes available, then returns the highest-priority one.

---

## Optimized Overrides

`PriorityBlockingQueue` reimplements these inherited methods for thread-safe binary heap performance:

```java
put(E)                     // Inserts into binary heap; O(log n); never blocks
take()                     // Blocks on notEmpty; removes root; siftDown; O(log n)
offer(E) / offer(E,timeout) // Same as put (unbounded)
poll() / poll(timeout)      // Returns null if empty; blocks with timeout
iterator()                 // Weakly consistent snapshot of heap array
spliterator()              // Heap-aware split for parallel streams
```

> **Note:** The iterator is **weakly consistent** — may reflect concurrent modifications but never throws `ConcurrentModificationException`. Iteration order is not guaranteed to follow priority order.

---

## PriorityBlockingQueue vs PriorityQueue

| Feature | PriorityBlockingQueue | PriorityQueue |
|---------|----------------------:|--------------:|
| Thread Safe | ✅ | ❌ |
| Blocking Operations | ✅ | ❌ |
| Timed Operations | ✅ | ❌ |
| Dynamic Growth | ✅ | ✅ |
| Internal Structure | Binary Heap | Binary Heap |
| Unbounded | ✅ | ✅ |

---

## PriorityBlockingQueue vs LinkedBlockingQueue

| Feature | PriorityBlockingQueue | LinkedBlockingQueue |
|---------|----------------------:|--------------------:|
| Ordering | Priority (Binary Heap) | FIFO (Linked List) |
| Thread Safe | ✅ | ✅ |
| Blocking Operations | ✅ | ✅ |
| Priority Support | ✅ | ❌ |
| Insertion Time | O(log n) | O(1) |
| Removal Time | O(log n) | O(1) |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Priority-based task scheduling | `PriorityBlockingQueue()` | `new PriorityBlockingQueue<>()` |
| Known element count, reduce resizing | `PriorityBlockingQueue(int)` | `new PriorityBlockingQueue<>(100)` |
| Max Heap (descending priority) | `PriorityBlockingQueue(int, Comparator)` | `new PriorityBlockingQueue<>(20, Collections.reverseOrder())` |
| Convert collection to priority queue | `PriorityBlockingQueue(Collection)` | `new PriorityBlockingQueue<>(list)` |
| Copy from existing PriorityQueue | `PriorityBlockingQueue(PriorityQueue)` | `new PriorityBlockingQueue<>(pq)` |
| Copy from SortedSet | `PriorityBlockingQueue(SortedSet)` | `new PriorityBlockingQueue<>(sortedSet)` |
| Block until highest-priority element available | `take()` | `queue.take()` |
| Non-blocking peek at highest priority | `peek()` | `queue.peek()` |
| Check ordering comparator | `comparator()` | `queue.comparator()` |
| Batch transfer in priority order | `drainTo(Collection)` | `queue.drainTo(list)` |

---

## Interview Q&A

**Q1. Which interface does PriorityBlockingQueue implement?**  
`BlockingQueue` — indirectly `Queue`, `Collection`, and `Iterable`.

**Q2. Which data structure does PriorityBlockingQueue use internally?**  
Binary Heap (default: Min Heap).

**Q3. Is PriorityBlockingQueue thread-safe?**  
Yes. Uses ReentrantLock and Condition Variables for synchronization.

**Q4. Does PriorityBlockingQueue support blocking operations?**  
Yes. `take()` blocks when empty; `poll(timeout)` blocks with timeout.

**Q5. Does put() ever block?**  
No. The queue is **unbounded** — insertion never blocks.

**Q6. Does PriorityBlockingQueue maintain FIFO order?**  
No. It maintains **priority order** — highest priority (smallest by default) first.

**Q7. Does PriorityBlockingQueue allow duplicate elements?**  
Yes.

**Q8. Does PriorityBlockingQueue allow null elements?**  
No. Throws `NullPointerException`.

**Q9. What does remainingCapacity() return?**  
`Integer.MAX_VALUE` because the queue is unbounded.

**Q10. How can you create a Max Heap?**  
```java
PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>(20, Collections.reverseOrder());
```

**Q11. What is the time complexity of insertion and removal?**  
O(log n) for both — heap operations require tree traversal.

**Q12. When should PriorityBlockingQueue be preferred over PriorityQueue?**  
When multiple threads access the queue, blocking retrieval operations are required, or priority-based scheduling is needed in concurrent applications.

---

## Summary

- `PriorityBlockingQueue` is a thread-safe implementation of the `BlockingQueue` interface.
- Internally uses a **Binary Min Heap**.
- Processes elements according to **priority**, not insertion order.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `BlockingQueue`.
- Supports blocking and timed retrieval operations.
- Uses **ReentrantLock** and **Condition Variables** for synchronization.
- Grows dynamically and is **unbounded**.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for task schedulers, priority-based job execution, event processing, and concurrent applications where task priority determines execution order.
