# SynchronousQueue Method Hierarchy

## Overview

`SynchronousQueue` is a specialized implementation of the `BlockingQueue` interface in the Java Collection Framework.

Unlike all other queue implementations, a `SynchronousQueue` **does not store elements**.

Instead, every insertion operation must wait for a corresponding removal operation, and every removal operation must wait for a corresponding insertion.

It acts as a **direct handoff mechanism** between producer and consumer threads.

It provides:

- Direct Thread-to-Thread Handoff
- Zero Capacity
- Blocking Insert Operations
- Blocking Remove Operations
- Timed Insert & Remove Operations
- Thread Safety
- Optional Fairness Policy
- No Internal Storage
- Null Elements Not Allowed

Since `SynchronousQueue` implements the `BlockingQueue` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`
- `BlockingQueue`

Additionally, `SynchronousQueue` provides its own constructors.

---

## Class Declaration

```java
public class SynchronousQueue<E>
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
SynchronousQueue
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
SynchronousQueue
```

---

## Complete SynchronousQueue Method Hierarchy

```text
SynchronousQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── SynchronousQueue()
└── SynchronousQueue(boolean fair)
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
│ SynchronousQueue Specific Public Methods
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

The methods available in a `SynchronousQueue` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `SynchronousQueue` class | `SynchronousQueue()`, `SynchronousQueue(boolean)` | Not inherited; zero capacity |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `BlockingQueue extends Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard queue operations |
| **BlockingQueue** | `SynchronousQueue implements BlockingQueue` | `put()`, `take()`, `offer(timeout)`, `poll(timeout)`, `remainingCapacity()`, `drainTo()` | Thread-safe blocking operations |
| **SynchronousQueue Specific** | `SynchronousQueue` class | No new public methods | Internal: Zero-Capacity Direct Handoff |
| **Optimized Overrides** | `SynchronousQueue` reimplementation | `put()`, `take()`, `offer()`, `poll()`, `iterator()`, `spliterator()` | Optimized with TransferStack/TransferQueue + CAS |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `SynchronousQueue`), even when the object is a `SynchronousQueue`.
> ```java
> Queue<String> queue = new SynchronousQueue<>();
> queue.remainingCapacity();   // ❌ Compile error
> ```

---

## SynchronousQueue Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `SynchronousQueue()` | `new SynchronousQueue<>()` | Non-fair queue; LIFO-style matching; maximum throughput | O(1) | O(1) |
| `SynchronousQueue(boolean fair)` | `new SynchronousQueue<>(true)` | Fair queue; FIFO matching for waiting threads | O(1) | O(1) |

### Fair vs Non-Fair Queue

| Fairness | Internal Structure | Matching Strategy | Performance |
|----------|-------------------|-------------------|-------------|
| `fair = false` (default) | TransferStack | LIFO-style | Higher throughput, lower contention |
| `fair = true` | TransferQueue | FIFO-style | Lower throughput, predictable ordering |

---

## BlockingQueue Methods (SynchronousQueue Behavior)

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `put(E e)` | `queue.put(element)` | Producer waits until consumer takes the element | O(1) | O(1) |
| `take()` | `queue.take()` | Consumer waits until producer puts an element | O(1) | O(1) |
| `offer(E e, long timeout, TimeUnit unit)` | `queue.offer(e, 5, TimeUnit.SECONDS)` | Producer waits with timeout; returns false if no consumer | O(1) | O(1) |
| `poll(long timeout, TimeUnit unit)` | `queue.poll(5, TimeUnit.SECONDS)` | Consumer waits with timeout; returns null if no producer | O(1) | O(1) |
| `remainingCapacity()` | `queue.remainingCapacity()` | Always returns **0** (zero capacity) | O(1) | O(1) |
| `drainTo(Collection<? super E> c)` | `queue.drainTo(list)` | Usually transfers 0 or 1 element | O(1) | O(1) |
| `drainTo(Collection<? super E> c, int maxElements)` | `queue.drainTo(list, 1)` | Same as above, limited by maxElements | O(1) | O(1) |

> **Note:** `size()` always returns 0. `isEmpty()` always returns true. `contains()` always returns false (no elements stored).

---

## Internal Working

`SynchronousQueue` stores **no elements**. Instead, it directly transfers an element from the Producer Thread to the Consumer Thread using **TransferStack** (non-fair) or **TransferQueue** (fair) with **CAS operations** and **LockSupport**.

```text
Producer Thread              SynchronousQueue              Consumer Thread
     put("Data") ───────────────► ◄─────────────────────── take()
                                    │
                          ┌─────────┴─────────┐
                          │  Zero Capacity      │
                          │  Direct Handoff     │
                          │  TransferStack/     │
                          │  TransferQueue + CAS│
                          └─────────────────────┘
```

### Direct Handoff Mechanism

```text
Scenario 1: Producer arrives first
    Producer put("A")
         │
         ▼
    Wait for Consumer...
         │
    Consumer take() ─────► Receives "A" immediately
         │
    Both threads continue

Scenario 2: Consumer arrives first
    Consumer take()
         │
         ▼
    Wait for Producer...
         │
    Producer put("B") ────► Consumer receives "B" immediately
         │
    Both threads continue
```

- If **Producer arrives first**, it waits until a Consumer calls `take()`.
- If **Consumer arrives first**, it waits until a Producer calls `put()`.
- The transfer occurs only when both threads are present — no internal buffer ever holds the element.

---

## Optimized Overrides

`SynchronousQueue` reimplements these inherited methods for zero-capacity direct handoff:

```java
put(E)                     // Producer thread parks until matched with take()
take()                     // Consumer thread parks until matched with put()
offer(E) / offer(E,timeout) // Timed version of put(); returns false if timeout
poll() / poll(timeout)      // Timed version of take(); returns null if timeout
iterator()                 // Empty iterator (always returns false for hasNext())
spliterator()              // Empty spliterator
```

> **Note:** `iterator()` is always empty because no elements are ever stored. `contains()` always returns false.

---

## SynchronousQueue vs ArrayBlockingQueue

| Feature | SynchronousQueue | ArrayBlockingQueue |
|---------|-----------------:|-------------------:|
| Capacity | 0 | Fixed |
| Internal Storage | None | Circular Array |
| Thread Safe | ✅ | ✅ |
| Blocking Operations | ✅ | ✅ |
| Producer waits | Always (until consumer) | Only when Full |
| Consumer waits | Until Producer arrives | Only when Empty |
| Use Case | Direct handoff | Buffered queue |

---

## SynchronousQueue vs LinkedBlockingQueue

| Feature | SynchronousQueue | LinkedBlockingQueue |
|---------|-----------------:|--------------------:|
| Capacity | 0 | Optional |
| Internal Structure | None | Linked List |
| Blocking Operations | ✅ | ✅ |
| Stores Elements | ❌ | ✅ |
| Producer-Consumer | Direct Handoff | Buffered Queue |
| Use Case | Thread communication | Task queuing |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Maximum throughput, direct handoff | `SynchronousQueue()` | `new SynchronousQueue<>()` |
| Fair thread scheduling for handoff | `SynchronousQueue(true)` | `new SynchronousQueue<>(true)` |
| Direct producer-consumer communication | `put()` + `take()` | `queue.put(data)` / `queue.take()` |
| Timed handoff attempt | `offer(timeout)` / `poll(timeout)` | `queue.offer(e, 5, TimeUnit.SECONDS)` |
| ThreadPoolExecutor with no queue buffering | `SynchronousQueue()` | `new ThreadPoolExecutor(..., new SynchronousQueue<>())` |

---

## Interview Q&A

**Q1. Which interface does SynchronousQueue implement?**  
`BlockingQueue` — indirectly `Queue`, `Collection`, and `Iterable`.

**Q2. Does SynchronousQueue store elements?**  
No. Its capacity is always **0**.

**Q3. Is SynchronousQueue thread-safe?**  
Yes. Uses CAS operations and LockSupport for efficient synchronization.

**Q4. What happens when put() is called?**  
The producer thread waits until another thread calls `take()`.

**Q5. What happens when take() is called?**  
The consumer thread waits until another thread calls `put()`.

**Q6. What does remainingCapacity() return?**  
**0** — always.

**Q7. Does SynchronousQueue allow duplicate elements?**  
Yes. Each element is transferred individually.

**Q8. Does SynchronousQueue allow null elements?**  
No. Throws `NullPointerException`.

**Q9. What is the difference between Fair and Non-Fair mode?**  
- Fair (`true`): FIFO matching using TransferQueue.  
- Non-Fair (`false`, default): LIFO-style matching using TransferStack, better throughput.

**Q10. Which internal mechanism is used?**  
TransferStack (non-fair) or TransferQueue (fair), with CAS operations and LockSupport.

**Q11. Where is SynchronousQueue commonly used?**  
ThreadPoolExecutor, direct thread communication, producer-consumer systems, task handoff, high-performance concurrent applications.

**Q12. Why is SynchronousQueue different from every other Queue?**  
Because it **never stores elements**. Every insertion must be matched immediately with a corresponding removal.

---

## Summary

- `SynchronousQueue` is a specialized thread-safe implementation of the `BlockingQueue` interface.
- It has **zero capacity** and **never stores elements**.
- Provides **direct handoff** between producer and consumer threads.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `BlockingQueue`.
- Supports blocking and timed operations.
- Offers **Fair (FIFO)** and **Non-Fair (LIFO-style)** scheduling policies.
- Internally uses **TransferStack**, **TransferQueue**, **CAS operations**, and **LockSupport** for efficient synchronization.
- Does **not allow null elements** and transfers each element immediately.
- Best suited for thread pools, direct task handoff, producer-consumer synchronization, and high-performance concurrent systems.
