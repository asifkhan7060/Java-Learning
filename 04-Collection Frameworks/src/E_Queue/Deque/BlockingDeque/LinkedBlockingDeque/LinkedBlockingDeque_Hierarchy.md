# LinkedBlockingDeque Method Hierarchy

## Overview

`LinkedBlockingDeque` is the thread-safe implementation of the `BlockingDeque` interface in the Java Collection Framework.

It extends the capabilities of a normal `Deque` by providing **blocking operations**, making it ideal for concurrent programming.

Unlike `ArrayDeque`, `LinkedBlockingDeque` internally stores elements using a **Doubly Linked List**.

It provides:

- Double-Ended Queue Operations
- Blocking Insert Operations
- Blocking Remove Operations
- Timed Insert & Remove Operations
- Thread Safety
- Optional Capacity Restriction
- FIFO Queue Behavior
- LIFO Stack Behavior
- Duplicate Elements Allowed
- Null Elements Not Allowed

Since `LinkedBlockingDeque` implements the `BlockingDeque` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`
- `Deque`
- `BlockingQueue`
- `BlockingDeque`

Additionally, `LinkedBlockingDeque` provides its own constructors.

---

## Class Declaration

```java
public class LinkedBlockingDeque<E>
        extends AbstractQueue<E>
        implements BlockingDeque<E>, Serializable
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
Deque
    ↑
BlockingQueue
    ↑
BlockingDeque
    ↑
AbstractQueue
    ↑
LinkedBlockingDeque
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
Deque
     ↑
BlockingQueue
     ↑
BlockingDeque
     ↑
LinkedBlockingDeque
```

---

## Complete LinkedBlockingDeque Method Hierarchy

```text
LinkedBlockingDeque<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── LinkedBlockingDeque()
├── LinkedBlockingDeque(int capacity)
└── LinkedBlockingDeque(Collection<? extends E> c)
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
│ Methods Inherited from Deque
├──────────────────────────────────────────────
│
├── addFirst(E e)
├── addLast(E e)
│
├── offerFirst(E e)
├── offerLast(E e)
│
├── removeFirst()
├── removeLast()
│
├── pollFirst()
├── pollLast()
│
├── getFirst()
├── getLast()
│
├── peekFirst()
├── peekLast()
│
├── push(E e)
├── pop()
│
├── removeFirstOccurrence(Object o)
├── removeLastOccurrence(Object o)
│
├── descendingIterator()
└── reversed() // Java 21+
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
│ Methods Inherited from BlockingDeque
├──────────────────────────────────────────────
│
├── putFirst(E e)
├── putLast(E e)
│
├── offerFirst(E e, long timeout, TimeUnit unit)
├── offerLast(E e, long timeout, TimeUnit unit)
│
├── takeFirst()
├── takeLast()
│
├── pollFirst(long timeout, TimeUnit unit)
└── pollLast(long timeout, TimeUnit unit)
│
├──────────────────────────────────────────────
│ LinkedBlockingDeque Specific Public Methods
├──────────────────────────────────────────────
│
└── *(No Additional Public Methods)*
│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── putFirst()
├── putLast()
├── takeFirst()
├── takeLast()
├── iterator()
├── descendingIterator()
└── spliterator()
```

---

## Understanding the Hierarchy

The methods available in a `LinkedBlockingDeque` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `LinkedBlockingDeque` class | `LinkedBlockingDeque()`, `LinkedBlockingDeque(int)`, `LinkedBlockingDeque(Collection)` | Not inherited; optional capacity |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `Deque extends Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard FIFO operations |
| **Deque** | `BlockingDeque extends Deque` | `addFirst()`, `addLast()`, `pollFirst()`, `pollLast()`, `push()`, `pop()`, `descendingIterator()` | Double-ended operations |
| **BlockingQueue** | `BlockingDeque extends BlockingQueue` | `put()`, `take()`, `offer(timeout)`, `poll(timeout)`, `remainingCapacity()`, `drainTo()` | Thread-safe blocking operations |
| **BlockingDeque** | `LinkedBlockingDeque implements BlockingDeque` | `putFirst()`, `putLast()`, `takeFirst()`, `takeLast()`, `offerFirst(timeout)`, `offerLast(timeout)`, `pollFirst(timeout)`, `pollLast(timeout)` | Blocking at both ends |
| **LinkedBlockingDeque Specific** | `LinkedBlockingDeque` class | No new public methods | Internal: Doubly Linked List |
| **Optimized Overrides** | `LinkedBlockingDeque` reimplementation | `putFirst()`, `putLast()`, `takeFirst()`, `takeLast()`, `iterator()`, `descendingIterator()`, `spliterator()` | Optimized with ReentrantLock + Conditions |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `Deque`, `BlockingQueue`, `BlockingDeque`, or `LinkedBlockingDeque`), even when the object is a `LinkedBlockingDeque`.
> ```java
> BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();
> queue.putFirst(10);   // ❌ Compile error
> ```

---

## LinkedBlockingDeque Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `LinkedBlockingDeque()` | `new LinkedBlockingDeque<>()` | Unbounded deque; capacity = Integer.MAX_VALUE | O(1) | O(1) |
| `LinkedBlockingDeque(int capacity)` | `new LinkedBlockingDeque<>(100)` | Bounded deque with fixed capacity | O(1) | O(1) |
| `LinkedBlockingDeque(Collection<? extends E> c)` | `new LinkedBlockingDeque<>(collection)` | Pre-fill with elements from another collection | O(n) | O(n) |

---

## BlockingDeque Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `putFirst(E e)` | `deque.putFirst(10)` | Insert at front; blocks if full (bounded) | O(1) | O(1) |
| `putLast(E e)` | `deque.putLast(10)` | Insert at rear; blocks if full (bounded) | O(1) | O(1) |
| `takeFirst()` | `deque.takeFirst()` | Remove and return front; blocks if empty | O(1) | O(1) |
| `takeLast()` | `deque.takeLast()` | Remove and return rear; blocks if empty | O(1) | O(1) |
| `offerFirst(E e, long timeout, TimeUnit unit)` | `deque.offerFirst(10, 5, TimeUnit.SECONDS)` | Insert at front with timeout; returns false if timed out | O(1) | O(1) |
| `offerLast(E e, long timeout, TimeUnit unit)` | `deque.offerLast(10, 5, TimeUnit.SECONDS)` | Insert at rear with timeout; returns false if timed out | O(1) | O(1) |
| `pollFirst(long timeout, TimeUnit unit)` | `deque.pollFirst(5, TimeUnit.SECONDS)` | Remove front with timeout; returns null if timed out | O(1) | O(1) |
| `pollLast(long timeout, TimeUnit unit)` | `deque.pollLast(5, TimeUnit.SECONDS)` | Remove rear with timeout; returns null if timed out | O(1) | O(1) |

### Queue vs Stack Operations

```java
// Queue (FIFO)
deque.putLast(10);     // enqueue
deque.putLast(20);
deque.takeFirst();       // dequeue → 10

// Stack (LIFO)
deque.putFirst(10);    // push
deque.putFirst(20);
deque.takeFirst();       // pop → 20
```

---

## BlockingQueue Methods (LinkedBlockingDeque Behavior)

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `put(E e)` | `deque.put(element)` | Equivalent to `putLast()`; blocks if full (bounded) | O(1) | O(1) |
| `take()` | `deque.take()` | Equivalent to `takeFirst()`; blocks if empty | O(1) | O(1) |
| `offer(E e, long timeout, TimeUnit unit)` | `deque.offer(e, 5, TimeUnit.SECONDS)` | Equivalent to `offerLast()`; timed insert | O(1) | O(1) |
| `poll(long timeout, TimeUnit unit)` | `deque.poll(5, TimeUnit.SECONDS)` | Equivalent to `pollFirst()`; timed remove | O(1) | O(1) |
| `remainingCapacity()` | `deque.remainingCapacity()` | Returns available space (Integer.MAX_VALUE if unbounded) | O(1) | O(1) |
| `drainTo(Collection<? super E> c)` | `deque.drainTo(list)` | Transfers all available elements | O(n) | O(1) |
| `drainTo(Collection<? super E> c, int maxElements)` | `deque.drainTo(list, 5)` | Transfers at most maxElements elements | O(min(n, max)) | O(1) |

---

## Internal Working

`LinkedBlockingDeque` stores elements using a **Doubly Linked List** managed by a **single ReentrantLock** with two **Condition Variables** (notEmpty, notFull).

```text
NULL
 ↑
 │
10 ⇄ 20 ⇄ 30 ⇄ 40
 ↑              ↑
Head          Tail
```

Each node stores: Previous Node Reference, Data, Next Node Reference.

### Producer-Consumer Model

```text
Producer Thread          LinkedBlockingDeque          Consumer Thread
  putFirst() ────────────► ◄──────────────────────── takeFirst()
  putLast()  ────────────► ◄──────────────────────── takeLast()
                              │
                    ┌─────────┴─────────┐
                    │  Doubly Linked      │
                    │  List + Reentrant   │
                    │  Lock + Conditions  │
                    └─────────────────────┘
```

- If deque is **full** (bounded), Producer blocks on `notFull` condition.
- If deque is **empty**, Consumer blocks on `notEmpty` condition.
- Supports insertion/removal from **both ends**.

---

## Optimized Overrides

`LinkedBlockingDeque` reimplements these inherited methods for thread-safe doubly linked list performance:

```java
putFirst(E) / putLast(E)     // Blocks with ReentrantLock + notFull condition
takeFirst() / takeLast()       // Blocks with ReentrantLock + notEmpty condition
offerFirst(timeout) / offerLast(timeout) // Timed insert at either end
pollFirst(timeout) / pollLast(timeout)   // Timed remove from either end
iterator()                     // Weakly consistent forward traversal
descendingIterator()           // Weakly consistent reverse traversal
spliterator()                  // Linked-list aware split for parallel streams
```

> **Note:** The iterator is **weakly consistent** — may reflect concurrent modifications but never throws `ConcurrentModificationException`.

---

## LinkedBlockingDeque vs ArrayDeque

| Feature | LinkedBlockingDeque | ArrayDeque |
|---------|--------------------:|-----------:|
| Thread Safe | ✅ | ❌ |
| Internal Structure | Doubly Linked List | Circular Array |
| Blocking Operations | ✅ | ❌ |
| Timed Operations | ✅ | ❌ |
| Capacity Restriction | Optional | No |
| Memory Usage | Higher | Lower |
| Producer-Consumer | Excellent | Not Suitable |

---

## LinkedBlockingDeque vs LinkedBlockingQueue

| Feature | LinkedBlockingDeque | LinkedBlockingQueue |
|---------|--------------------:|--------------------:|
| Front Insertion | ✅ | ❌ |
| Rear Insertion | ✅ | ✅ |
| Front Removal | ✅ | ✅ |
| Rear Removal | ✅ | ❌ |
| Queue (FIFO) | ✅ | ✅ |
| Stack (LIFO) | ✅ | ❌ |
| Internal Structure | Doubly Linked List | Singly Linked List |
| Locks | Single Lock | Dual Locks |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Unbounded thread-safe deque | `LinkedBlockingDeque()` | `new LinkedBlockingDeque<>()` |
| Bounded thread-safe deque | `LinkedBlockingDeque(int)` | `new LinkedBlockingDeque<>(100)` |
| Pre-fill with existing elements | `LinkedBlockingDeque(Collection)` | `new LinkedBlockingDeque<>(list)` |
| Block until space at front | `putFirst()` | `deque.putFirst(element)` |
| Block until space at rear | `putLast()` | `deque.putLast(element)` |
| Block until element at front | `takeFirst()` | `deque.takeFirst()` |
| Block until element at rear | `takeLast()` | `deque.takeLast()` |
| Timed insert at either end | `offerFirst(timeout)` / `offerLast(timeout)` | `deque.offerFirst(e, 5, TimeUnit.SECONDS)` |
| Timed remove from either end | `pollFirst(timeout)` / `pollLast(timeout)` | `deque.pollFirst(5, TimeUnit.SECONDS)` |
| Queue operations (FIFO) | `putLast()` / `takeFirst()` | `deque.putLast(10); deque.takeFirst()` |
| Stack operations (LIFO) | `putFirst()` / `takeFirst()` | `deque.putFirst(10); deque.takeFirst()` |
| Batch transfer | `drainTo(Collection)` | `deque.drainTo(list)` |

---

## Interview Q&A

**Q1. Which interface does LinkedBlockingDeque implement?**  
`BlockingDeque` — indirectly `BlockingQueue`, `Deque`, `Queue`, `Collection`, and `Iterable`.

**Q2. Which data structure does LinkedBlockingDeque use internally?**  
Doubly Linked List.

**Q3. Is LinkedBlockingDeque thread-safe?**  
Yes. Uses ReentrantLock and Condition Variables for synchronization.

**Q4. Does LinkedBlockingDeque support blocking operations?**  
Yes. `putFirst()`, `putLast()`, `takeFirst()`, `takeLast()` block when necessary.

**Q5. Does it support timeout operations?**  
Yes. `offerFirst(timeout)`, `offerLast(timeout)`, `pollFirst(timeout)`, `pollLast(timeout)`.

**Q6. Can it behave as both Queue and Stack?**  
Yes. Queue (FIFO) via `putLast()`/`takeFirst()` and Stack (LIFO) via `putFirst()`/`takeFirst()`.

**Q7. Does LinkedBlockingDeque allow duplicate elements?**  
Yes.

**Q8. Does LinkedBlockingDeque allow null elements?**  
No. Throws `NullPointerException`.

**Q9. Which synchronization mechanism does it use internally?**  
ReentrantLock + Condition Variables (notEmpty, notFull).

**Q10. What is the advantage over LinkedBlockingQueue?**  
Supports insertion and removal from **both ends** — can function as both Queue and Stack.

**Q11. When should LinkedBlockingDeque be preferred over ArrayDeque?**  
When thread safety is required, blocking operations are needed, or multiple producers and consumers access the deque.

**Q12. What is the time complexity of insertion and deletion?**  
O(1) at both ends.

---

## Summary

- `LinkedBlockingDeque` is the thread-safe implementation of the `BlockingDeque` interface.
- Internally uses a **Doubly Linked List**.
- Supports insertion and removal from **both front and rear**.
- Inherits methods from `Iterable`, `Collection`, `Queue`, `Deque`, `BlockingQueue`, and `BlockingDeque`.
- Supports blocking and timed operations for concurrent programming.
- Uses **ReentrantLock** and **Condition Variables** for synchronization.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for producer-consumer systems, task scheduling, work-stealing algorithms, and other concurrent applications requiring double-ended access.
