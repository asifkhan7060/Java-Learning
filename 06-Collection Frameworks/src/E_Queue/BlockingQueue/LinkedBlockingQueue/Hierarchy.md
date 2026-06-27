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

# Class Declaration

```java
public class LinkedBlockingQueue<E>
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
LinkedBlockingQueue
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
         LinkedBlockingQueue
```

---

# Complete LinkedBlockingQueue Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
LinkedBlockingQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ LinkedBlockingQueue()
├── ✅ LinkedBlockingQueue(int capacity)
└── ✅ LinkedBlockingQueue(Collection<? extends E> c)

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
│ LinkedBlockingQueue Specific Public Methods
├──────────────────────────────────────────────
│
└── *(No Additional Public Methods)*

│
├──────────────────────────────────────────────
│ Protected / Internal Methods
├──────────────────────────────────────────────
│
├── 🔒 enqueue()
├── 🔒 dequeue()
├── 🔒 signalNotEmpty()
├── 🔒 signalNotFull()
└── 🔒 fullyLock()

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

The methods available in a `LinkedBlockingQueue` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `LinkedBlockingQueue` class.

They are used to create `LinkedBlockingQueue` objects and are **not inherited**.

```java
LinkedBlockingQueue()

LinkedBlockingQueue(int capacity)

LinkedBlockingQueue(Collection<? extends E> c)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `LinkedBlockingQueue` object can use the methods defined in the `Iterable` interface.

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

every `LinkedBlockingQueue` also inherits all `Collection` methods.

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

## 6. LinkedBlockingQueue Specific Methods

Unlike many collection classes,

`LinkedBlockingQueue` introduces **no additional public methods**.

Its functionality comes entirely from the interfaces it implements.

---

## 7. Optimized Overrides

Several inherited methods are optimized internally using a **Linked List**, **Dual ReentrantLocks**, and **Condition Variables**.

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

Therefore, a `LinkedBlockingQueue` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.


# Part 2 : LinkedBlockingQueue Specific Methods

---

## 1. LinkedBlockingQueue()

Creates an optionally unbounded `LinkedBlockingQueue`.

### Syntax

```java
LinkedBlockingQueue<E> queue =
        new LinkedBlockingQueue<>();
```

### Example

```java
LinkedBlockingQueue<Integer> queue =
        new LinkedBlockingQueue<>();
```

### Purpose

- Creates an empty LinkedBlockingQueue.
- Uses the default maximum capacity.
- Thread-safe.
- Supports blocking operations.

### Note

Internally,

LinkedBlockingQueue uses a **Linked List**.

---

## 2. LinkedBlockingQueue(int capacity)

Creates a `LinkedBlockingQueue` with the specified capacity.

### Syntax

```java
LinkedBlockingQueue<E> queue =
        new LinkedBlockingQueue<>(capacity);
```

### Example

```java
LinkedBlockingQueue<Integer> queue =
        new LinkedBlockingQueue<>(100);
```

### Purpose

Useful when the maximum number of elements should be limited.

Commonly used in Producer-Consumer systems.

### Example

```text
Capacity = 100

Current Size = 0
```

### Note

Once the queue reaches its capacity,

blocking insertion methods wait until space becomes available.

---

## 3. LinkedBlockingQueue(Collection<? extends E> c)

Creates a `LinkedBlockingQueue` containing all elements from another Collection.

### Syntax

```java
LinkedBlockingQueue<E> queue =
        new LinkedBlockingQueue<>(collection);
```

### Example

```java
List<Integer> list =
        List.of(10,20,30);

LinkedBlockingQueue<Integer> queue =
        new LinkedBlockingQueue<>(list);
```

### Purpose

Copies all elements from another Collection.

Useful when converting an existing Collection into a thread-safe queue.

---

# LinkedBlockingQueue Specific Methods

Unlike many Collection classes,

`LinkedBlockingQueue` introduces **no additional public methods**.

All public functionality comes from:

- Collection
- Queue
- BlockingQueue

---

## 1. remainingCapacity()

Returns the number of additional elements that can be inserted.

### Syntax

```java
int remainingCapacity()
```

### Example

```java
LinkedBlockingQueue<Integer> queue =
        new LinkedBlockingQueue<>(5);

queue.add(10);
queue.add(20);

System.out.println(
        queue.remainingCapacity());
```

Output

```text
3
```

### Purpose

Useful for checking available capacity before insertion.

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
List<Integer> list =
        new ArrayList<>();

queue.drainTo(list);
```

### Purpose

Efficiently transfers all elements to another Collection.

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

Useful when elements need to be processed in batches.

---

# Internal Methods

The following methods exist inside the JDK implementation.

They are **not accessible** directly.

---

## 1. enqueue()

Creates and inserts a new node at the rear of the queue.

---

## 2. dequeue()

Removes the head node from the queue.

---

## 3. signalNotEmpty()

Signals waiting consumer threads that an element is available.

---

## 4. signalNotFull()

Signals waiting producer threads that free space is available.

---

## 5. fullyLock()

Locks both producer and consumer locks simultaneously.

Used internally during operations like:

- iterator()
- remove(Object)
- clear()

---

# Optimized Overrides

The following inherited methods are optimized using a

**Linked List**, **Dual ReentrantLocks**, and **Condition Variables**.

```java
put()

take()

offer()

poll()

iterator()

spliterator()
```

These implementations provide efficient thread-safe queue operations.

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
- LinkedBlockingQueue internally uses a **Linked List**.
- Capacity is optional. By default, it uses `Integer.MAX_VALUE`.
- It is **thread-safe**.
- Uses separate locks for insertion and removal, allowing higher concurrency than `ArrayBlockingQueue`.
- Duplicate elements are allowed.
- Null elements are **not allowed**.
- Blocking operations automatically wait when the queue becomes full or empty.
- The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `LinkedBlockingQueue`), even when the object is a `LinkedBlockingQueue`.


# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| LinkedBlockingQueue() | O(1) | O(1) |
| LinkedBlockingQueue(int capacity) | O(1) | O(1) |
| LinkedBlockingQueue(Collection<? extends E>) | O(n) | O(n) |

---

## LinkedBlockingQueue Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| remainingCapacity() | O(1) | O(1) |
| drainTo(Collection) | O(n) | O(1) |
| drainTo(Collection, int) | O(min(n, maxElements)) | O(1) |

---

# When Should You Use These Methods?

## LinkedBlockingQueue()

Use when:

- Maximum capacity is not important.
- Multiple producer and consumer threads are involved.
- Thread-safe queue operations are required.

Example

```java
LinkedBlockingQueue<Integer> queue =
        new LinkedBlockingQueue<>();
```

---

## LinkedBlockingQueue(int capacity)

Use when:

- Queue size should be limited.
- Memory usage should be controlled.
- Producer-Consumer architecture is used.

Example

```java
LinkedBlockingQueue<String> queue =
        new LinkedBlockingQueue<>(100);
```

---

## LinkedBlockingQueue(Collection)

Use when:

- Converting an existing Collection into a thread-safe queue.

Example

```java
LinkedBlockingQueue<Integer> queue =
        new LinkedBlockingQueue<>(list);
```

---

## remainingCapacity()

Use when:

- Need to know available space before insertion.
- Prevent unnecessary blocking.

---

## drainTo()

Use when:

- Bulk transfer of elements is required.
- Consumer wants to process multiple elements together.

---

# Internal Working

Unlike `ArrayBlockingQueue`,

`LinkedBlockingQueue` stores elements using a **Singly Linked List**.

```text
Head
 │
 ▼

10 ──► 20 ──► 30 ──► 40 ──► NULL
```

Each node stores:

- Data
- Next Node Reference

The queue maintains both:

- Head Pointer
- Tail Pointer

to achieve efficient insertion and removal.

---

# Producer-Consumer Model

Producer Thread

```text
put()

↓

Queue

↓

take()

Consumer Thread
```

When the queue becomes full,

Producer waits.

When the queue becomes empty,

Consumer waits.

This waiting is handled automatically using

- ReentrantLock
- Condition Variables

---

# LinkedBlockingQueue vs ArrayBlockingQueue

| Feature | LinkedBlockingQueue | ArrayBlockingQueue |
|----------|--------------------:|-------------------:|
| Internal Structure | Linked List | Circular Array |
| Capacity | Optional | Fixed |
| Dynamic Growth | ✅ | ❌ |
| Memory Usage | Higher | Lower |
| Locks | Two Locks | One Lock |
| Producer-Consumer | Excellent | Excellent |

---

# LinkedBlockingQueue vs ConcurrentLinkedQueue

| Feature | LinkedBlockingQueue | ConcurrentLinkedQueue |
|----------|--------------------:|----------------------:|
| Thread Safe | ✅ | ✅ |
| Blocking Operations | ✅ | ❌ |
| Timed Operations | ✅ | ❌ |
| Capacity Restriction | Optional | ❌ |
| Producer-Consumer | Excellent | Not Suitable |

---

# Important Notes

### Thread Safety

LinkedBlockingQueue is completely thread-safe.

Multiple threads can safely access it simultaneously.

---

### Blocking Operations

Methods such as

```java
put()

take()
```

automatically wait when necessary.

---

### Timed Operations

Supports timeout-based methods.

Example

```java
offer(element, 5, TimeUnit.SECONDS)

poll(5, TimeUnit.SECONDS)
```

---

### Capacity

Can be

- Bounded
- Unbounded (default constructor)

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

### Synchronization

Internally uses

- Two ReentrantLocks
- Condition Variables

Separate locks for insertion and removal improve concurrency.

---

# Frequently Asked Interview Questions

## Q1. Which interface does LinkedBlockingQueue implement?

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

## Q2. Which data structure does LinkedBlockingQueue use internally?

```text
Linked List
```

---

## Q3. Is LinkedBlockingQueue thread-safe?

Yes.

---

## Q4. Does LinkedBlockingQueue support blocking operations?

Yes.

Examples

```java
put()

take()
```

---

## Q5. Does LinkedBlockingQueue support timeout operations?

Yes.

Examples

```java
offer(element, timeout, TimeUnit)

poll(timeout, TimeUnit)
```

---

## Q6. Does LinkedBlockingQueue allow duplicate elements?

Yes.

---

## Q7. Does LinkedBlockingQueue allow null elements?

No.

Throws

```text
NullPointerException
```

---

## Q8. What is the default capacity of LinkedBlockingQueue?

```java
Integer.MAX_VALUE
```

making it **optionally unbounded**.

---

## Q9. Which synchronization mechanism does it use internally?

```text
Two ReentrantLocks

+

Condition Variables
```

One lock is used for producers,

another for consumers.

---

## Q10. When should LinkedBlockingQueue be preferred over ArrayBlockingQueue?

When:

- Dynamic capacity is preferred.
- Higher concurrency is required.
- Separate producer and consumer locks improve throughput.

---

## Q11. What is the time complexity of insertion and removal?

```text
O(1)
```

for both operations.

---

## Q12. Why does LinkedBlockingQueue generally have better concurrency than ArrayBlockingQueue?

Because it uses **two separate locks**:

- Put Lock
- Take Lock

allowing producers and consumers to operate simultaneously.

---

# Summary

- `LinkedBlockingQueue` is a thread-safe implementation of the `BlockingQueue` interface.
- Internally uses a **Linked List**.
- Supports FIFO ordering with blocking and timed operations.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `BlockingQueue`.
- Uses **two ReentrantLocks** and **Condition Variables** for better concurrency.
- Supports both bounded and optionally unbounded capacities.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for producer-consumer systems, thread pools, task scheduling, and other concurrent applications requiring dynamic queue capacity.