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

# Class Declaration

```java
public class PriorityBlockingQueue<E>
        extends AbstractQueue<E>
        implements BlockingQueue<E>, Serializable
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
AbstractQueue
    ↑
PriorityBlockingQueue
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
        PriorityBlockingQueue
```

---

# Complete PriorityBlockingQueue Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
PriorityBlockingQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ PriorityBlockingQueue()
├── ✅ PriorityBlockingQueue(int initialCapacity)
├── ✅ PriorityBlockingQueue(
│       int initialCapacity,
│       Comparator<? super E> comparator)
├── ✅ PriorityBlockingQueue(
│       Collection<? extends E> c)
├── ✅ PriorityBlockingQueue(
│       PriorityQueue<? extends E> c)
└── ✅ PriorityBlockingQueue(
        SortedSet<? extends E> c)

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
│ PriorityBlockingQueue Specific Public Methods
├──────────────────────────────────────────────
│
├── ✅ comparator()
└── *(No Additional Public Methods)*

│
├──────────────────────────────────────────────
│ Protected / Internal Methods
├──────────────────────────────────────────────
│
├── 🔒 siftUp()
├── 🔒 siftDown()
├── 🔒 heapify()
├── 🔒 tryGrow()
└── 🔒 dequeue()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
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

The methods available in a `PriorityBlockingQueue` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `PriorityBlockingQueue` class.

They are used to create `PriorityBlockingQueue` objects and are **not inherited**.

```java
PriorityBlockingQueue()

PriorityBlockingQueue(int initialCapacity)

PriorityBlockingQueue(
        int initialCapacity,
        Comparator<? super E> comparator)

PriorityBlockingQueue(
        Collection<? extends E> c)

PriorityBlockingQueue(
        PriorityQueue<? extends E> c)

PriorityBlockingQueue(
        SortedSet<? extends E> c)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `PriorityBlockingQueue` object can use the methods defined in the `Iterable` interface.

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

every `PriorityBlockingQueue` also inherits all `Collection` methods.

These methods perform common collection operations such as:

- Adding Elements
- Removing Elements
- Searching
- Converting to Arrays
- Stream Processing

---

## 4. Methods Inherited from Queue

The `Queue` interface provides standard queue operations.

However,

`PriorityBlockingQueue` processes elements according to **priority** rather than insertion order.

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

## 6. PriorityBlockingQueue Specific Methods

`PriorityBlockingQueue` introduces one important public method:

- comparator()

This method returns the Comparator used for ordering elements.

If natural ordering is used,

it returns **null**.

---

## 7. Optimized Overrides

Several inherited methods are optimized internally using a **Binary Heap**, **ReentrantLock**, and **Condition Variables**.

Examples:

- put()
- take()
- offer()
- poll()
- iterator()
- spliterator()

---

## 8. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, a `PriorityBlockingQueue` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.

# Part 2 : PriorityBlockingQueue Specific Methods

---

## 1. PriorityBlockingQueue()

Creates an empty `PriorityBlockingQueue`.

### Syntax

```java
PriorityBlockingQueue<E> queue =
        new PriorityBlockingQueue<>();
```

### Example

```java
PriorityBlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>();
```

### Purpose

- Creates an empty thread-safe priority queue.
- Uses natural ordering.
- Dynamically grows as elements are added.

### Note

Internally,

PriorityBlockingQueue uses a **Binary Min Heap**.

---

## 2. PriorityBlockingQueue(int initialCapacity)

Creates an empty `PriorityBlockingQueue` with the specified initial capacity.

### Syntax

```java
PriorityBlockingQueue<E> queue =
        new PriorityBlockingQueue<>(capacity);
```

### Example

```java
PriorityBlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>(50);
```

### Purpose

Useful when the approximate number of elements is already known.

Reduces internal resizing.

---

## 3. PriorityBlockingQueue(
int initialCapacity,
Comparator<? super E> comparator)

Creates a `PriorityBlockingQueue` using a custom Comparator.

### Syntax

```java
PriorityBlockingQueue<E> queue =
        new PriorityBlockingQueue<>(
                capacity,
                comparator);
```

### Example

```java
PriorityBlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>(
                20,
                Collections.reverseOrder());
```

### Purpose

Allows custom priority ordering.

Frequently used to create a **Max Heap**.

---

## 4. PriorityBlockingQueue(
Collection<? extends E> c)

Creates a `PriorityBlockingQueue` containing all elements from another Collection.

### Syntax

```java
PriorityBlockingQueue<E> queue =
        new PriorityBlockingQueue<>(collection);
```

### Example

```java
List<Integer> list =
        List.of(30,10,20);

PriorityBlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>(list);
```

### Purpose

Copies all elements from another Collection and automatically arranges them according to priority.

---

## 5. PriorityBlockingQueue(
PriorityQueue<? extends E> c)

Creates a `PriorityBlockingQueue` from an existing `PriorityQueue`.

### Purpose

Copies all elements while preserving the ordering rules.

---

## 6. PriorityBlockingQueue(
SortedSet<? extends E> c)

Creates a `PriorityBlockingQueue` from a `SortedSet`.

### Purpose

Useful for converting a sorted collection into a thread-safe priority queue.

---

# PriorityBlockingQueue Specific Methods

---

## 1. comparator()

Returns the Comparator used to order the elements.

### Syntax

```java
Comparator<? super E> comparator()
```

### Example

```java
PriorityBlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>();

System.out.println(queue.comparator());
```

Output

```text
null
```

### Purpose

Determines whether the queue uses:

- Natural Ordering

or

- Custom Comparator

### Note

Returns

```text
null
```

when natural ordering is used.

---

## 2. remainingCapacity()

Returns the number of additional elements that can theoretically be inserted.

### Syntax

```java
int remainingCapacity()
```

### Output

```text
2147483647
```

### Note

Since `PriorityBlockingQueue` is **unbounded**,

this method always returns

```java
Integer.MAX_VALUE
```

---

## 3. drainTo(Collection)

Removes all available elements and transfers them into another Collection.

### Syntax

```java
int drainTo(
        Collection<? super E> c)
```

### Purpose

Efficiently transfers all elements.

---

## 4. drainTo(Collection, int)

Transfers at most the specified number of elements.

### Syntax

```java
int drainTo(
        Collection<? super E> c,
        int maxElements)
```

### Purpose

Useful for batch processing.

---

# Internal Methods

The following methods exist inside the JDK implementation.

They are **not accessible** directly.

---

## 1. siftUp()

Moves a newly inserted element upward until the heap property is restored.

---

## 2. siftDown()

Moves the root element downward after removal.

---

## 3. heapify()

Converts an unordered collection into a valid Binary Heap.

---

## 4. tryGrow()

Expands the internal array when additional space is required.

---

## 5. dequeue()

Removes the highest-priority element from the heap.

---

# Optimized Overrides

The following inherited methods are optimized using a

**Binary Heap**, **ReentrantLock**, and **Condition Variables**.

```java
put()

take()

offer()

poll()

iterator()

spliterator()
```

These implementations provide efficient thread-safe priority queue operations.

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
- PriorityBlockingQueue internally uses a **Binary Min Heap**.
- It is **thread-safe**.
- Elements are ordered according to **priority**, not insertion order.
- The queue is **unbounded** and grows dynamically.
- `remainingCapacity()` always returns `Integer.MAX_VALUE`.
- Duplicate elements are allowed.
- Null elements are **not allowed**.
- The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `PriorityBlockingQueue`), even when the object is a `PriorityBlockingQueue`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| PriorityBlockingQueue() | O(1) | O(1) |
| PriorityBlockingQueue(int initialCapacity) | O(1) | O(n) *(allocates capacity)* |
| PriorityBlockingQueue(int initialCapacity, Comparator<? super E>) | O(1) | O(n) *(allocates capacity)* |
| PriorityBlockingQueue(Collection<? extends E>) | O(n) | O(n) |
| PriorityBlockingQueue(PriorityQueue<? extends E>) | O(n) | O(n) |
| PriorityBlockingQueue(SortedSet<? extends E>) | O(n) | O(n) |

---

## PriorityBlockingQueue Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| comparator() | O(1) | O(1) |
| remainingCapacity() | O(1) | O(1) |
| drainTo(Collection) | O(n) | O(1) |
| drainTo(Collection, int) | O(min(n, maxElements)) | O(1) |

---

# When Should You Use These Methods?

## PriorityBlockingQueue()

Use when:

- Multiple threads process tasks based on priority.
- Natural ordering is sufficient.

Example

```java
PriorityBlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>();
```

---

## PriorityBlockingQueue(int initialCapacity)

Use when:

- Approximate number of elements is known.
- Internal resizing should be reduced.

Example

```java
PriorityBlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>(100);
```

---

## PriorityBlockingQueue(int initialCapacity,
Comparator)

Use when:

- Custom priority ordering is required.
- Building a Max Heap.
- Processing user-defined objects.

Example

```java
PriorityBlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>(
                20,
                Collections.reverseOrder());
```

---

## PriorityBlockingQueue(Collection)

Use when:

- Converting another Collection into a thread-safe priority queue.

---

## remainingCapacity()

Use when:

- Checking available capacity.

### Note

Since the queue is **unbounded**,

it always returns

```java
Integer.MAX_VALUE
```

---

## drainTo()

Use when:

- Bulk transfer of elements is required.
- Batch processing is preferred.

---

# Internal Working

Unlike `LinkedBlockingQueue`,

`PriorityBlockingQueue` stores elements using a **Binary Heap**.

```text
         10
       /    \
     20      30
    /  \
  40    50
```

The root always stores the element having the **highest priority**.

(Default: Smallest element)

---

# Producer-Consumer Model

Producer Thread

```text
offer()

↓

Priority Queue

↓

take()

Consumer Thread
```

Producer never blocks because the queue is **unbounded**.

Consumer waits only when the queue becomes empty.

---

# PriorityBlockingQueue vs PriorityQueue

| Feature | PriorityBlockingQueue | PriorityQueue |
|----------|----------------------:|--------------:|
| Thread Safe | ✅ | ❌ |
| Blocking Operations | ✅ | ❌ |
| Timed Operations | ✅ | ❌ |
| Dynamic Growth | ✅ | ✅ |
| Internal Structure | Binary Heap | Binary Heap |

---

# PriorityBlockingQueue vs LinkedBlockingQueue

| Feature | PriorityBlockingQueue | LinkedBlockingQueue |
|----------|----------------------:|--------------------:|
| Ordering | Priority | FIFO |
| Internal Structure | Binary Heap | Linked List |
| Thread Safe | ✅ | ✅ |
| Blocking Operations | ✅ | ✅ |
| Priority Support | ✅ | ❌ |

---

# Important Notes

### Thread Safety

PriorityBlockingQueue is completely thread-safe.

Multiple threads can safely access it simultaneously.

---

### Priority Ordering

Elements are processed according to **priority**, not insertion order.

---

### Blocking Behavior

Only removal operations block.

```java
take()
```

waits if the queue is empty.

Insertion operations never block because the queue is unbounded.

---

### Capacity

The queue grows dynamically.

It has **no fixed capacity**.

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

- ReentrantLock
- Condition Variables

to ensure thread safety.

---

# Frequently Asked Interview Questions

## Q1. Which interface does PriorityBlockingQueue implement?

```java
BlockingQueue
```

Indirectly,

```text
BlockingQueue

↓

Queue

↓

Collection

↓

Iterable
```

---

## Q2. Which data structure does PriorityBlockingQueue use internally?

```text
Binary Heap
```

(Default: Min Heap)

---

## Q3. Is PriorityBlockingQueue thread-safe?

Yes.

---

## Q4. Does PriorityBlockingQueue support blocking operations?

Yes.

Example

```java
take()
```

---

## Q5. Does put() ever block?

No.

The queue is **unbounded**.

---

## Q6. Does PriorityBlockingQueue maintain FIFO order?

No.

It maintains **priority order**.

---

## Q7. Does PriorityBlockingQueue allow duplicate elements?

Yes.

---

## Q8. Does PriorityBlockingQueue allow null elements?

No.

Throws

```text
NullPointerException
```

---

## Q9. What does remainingCapacity() return?

```java
Integer.MAX_VALUE
```

because the queue is unbounded.

---

## Q10. How can you create a Max Heap?

```java
PriorityBlockingQueue<Integer> queue =
        new PriorityBlockingQueue<>(
                20,
                Collections.reverseOrder());
```

---

## Q11. What is the time complexity of insertion and removal?

```text
O(log n)
```

---

## Q12. When should PriorityBlockingQueue be preferred over PriorityQueue?

When:

- Multiple threads access the queue.
- Blocking retrieval operations are required.
- Priority-based scheduling is needed in concurrent applications.

---

# Summary

- `PriorityBlockingQueue` is a thread-safe implementation of the `BlockingQueue` interface.
- Internally uses a **Binary Min Heap**.
- Processes elements according to **priority**, not insertion order.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `BlockingQueue`.
- Supports blocking and timed retrieval operations.
- Uses **ReentrantLock** and **Condition Variables** for synchronization.
- Grows dynamically and is **unbounded**.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for task schedulers, priority-based job execution, event processing, and concurrent applications where task priority determines execution order.