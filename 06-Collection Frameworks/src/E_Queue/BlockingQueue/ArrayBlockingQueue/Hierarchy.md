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

# Class Declaration

```java
public class ArrayBlockingQueue<E>
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
ArrayBlockingQueue
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
          ArrayBlockingQueue
```

---

# Complete ArrayBlockingQueue Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
ArrayBlockingQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ ArrayBlockingQueue(int capacity)
├── ✅ ArrayBlockingQueue(int capacity,
│                        boolean fair)
└── ✅ ArrayBlockingQueue(int capacity,
                         boolean fair,
                         Collection<? extends E> c)

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
│ ArrayBlockingQueue Specific Public Methods
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
├── 🔒 insert()
├── 🔒 extract()
├── 🔒 signalNotEmpty()
└── 🔒 signalNotFull()

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

The methods available in an `ArrayBlockingQueue` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `ArrayBlockingQueue` class.

They are used to create `ArrayBlockingQueue` objects and are **not inherited**.

```java
ArrayBlockingQueue(int capacity)

ArrayBlockingQueue(
        int capacity,
        boolean fair)

ArrayBlockingQueue(
        int capacity,
        boolean fair,
        Collection<? extends E> c)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `ArrayBlockingQueue` object can use the methods defined in the `Iterable` interface.

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

every `ArrayBlockingQueue` also inherits all `Collection` methods.

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

## 6. ArrayBlockingQueue Specific Methods

Unlike many collection classes,

`ArrayBlockingQueue` introduces **no additional public methods**.

Its functionality comes entirely from the interfaces it implements.

---

## 7. Optimized Overrides

Several inherited methods are optimized internally using a **Fixed-Size Circular Array**, **ReentrantLock**, and **Condition Variables**.

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

Therefore, an `ArrayBlockingQueue` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.

# Part 2 : ArrayBlockingQueue Specific Methods

---

## 1. ArrayBlockingQueue(int capacity)

Creates an empty `ArrayBlockingQueue` with the specified fixed capacity.

### Syntax

```java
ArrayBlockingQueue<E> queue =
        new ArrayBlockingQueue<>(capacity);
```

### Example

```java
ArrayBlockingQueue<Integer> queue =
        new ArrayBlockingQueue<>(10);
```

### Purpose

Creates a bounded blocking queue with a fixed capacity.

Useful when the maximum number of elements is known.

### Example

```text
Capacity = 10

Current Size = 0
```

### Note

Once created,

the capacity **cannot be changed**.

---

## 2. ArrayBlockingQueue(int capacity, boolean fair)

Creates an `ArrayBlockingQueue` with a fixed capacity and fairness policy.

### Syntax

```java
ArrayBlockingQueue<E> queue =
        new ArrayBlockingQueue<>(
                capacity,
                fair);
```

### Example

```java
ArrayBlockingQueue<Integer> queue =
        new ArrayBlockingQueue<>(
                10,
                true);
```

### Purpose

Determines the order in which waiting threads obtain access.

---

### Fair Queue

```java
true
```

Waiting threads receive access in FIFO order.

Example

```text
Thread A

↓

Thread B

↓

Thread C
```

Access Order

```text
A

↓

B

↓

C
```

---

### Non-Fair Queue (Default)

```java
false
```

Threads may obtain access in any order.

Provides better overall performance.

---

## 3. ArrayBlockingQueue(int capacity,
boolean fair,
Collection<? extends E> c)

Creates an `ArrayBlockingQueue` containing all elements of another Collection.

### Syntax

```java
ArrayBlockingQueue<E> queue =
        new ArrayBlockingQueue<>(
                capacity,
                fair,
                collection);
```

### Example

```java
List<Integer> list =
        List.of(10,20,30);

ArrayBlockingQueue<Integer> queue =
        new ArrayBlockingQueue<>(
                10,
                true,
                list);
```

### Purpose

Creates a queue and initializes it with an existing Collection.

Useful when a bounded queue must start with predefined elements.

---

# ArrayBlockingQueue Specific Methods

Unlike many Collection classes,

`ArrayBlockingQueue` introduces **no additional public methods**.

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
ArrayBlockingQueue<Integer> queue =
        new ArrayBlockingQueue<>(5);

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

Useful for checking available capacity before inserting elements.

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

Inserts an element into the circular array.

Updates the rear index.

---

## 2. dequeue()

Removes the front element.

Updates the front index.

---

## 3. insert()

Performs the internal insertion operation while maintaining synchronization.

---

## 4. extract()

Performs the internal removal operation.

---

## 5. signalNotEmpty()

Signals waiting consumer threads that an element has become available.

---

## 6. signalNotFull()

Signals waiting producer threads that free space is available.

---

# Optimized Overrides

The following inherited methods are optimized using a

**Fixed-Size Circular Array**, **ReentrantLock**, and **Condition Variables**.

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
- ArrayBlockingQueue internally uses a **Fixed-Size Circular Array**.
- The capacity is fixed after creation.
- It is **thread-safe**.
- Supports optional **Fair** and **Non-Fair** locking policies.
- Duplicate elements are allowed.
- Null elements are **not allowed**.
- Blocking operations automatically wait when the queue becomes full or empty.
- The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `ArrayBlockingQueue`), even when the object is an `ArrayBlockingQueue`.
```

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| ArrayBlockingQueue(int capacity) | O(1) | O(n) |
| ArrayBlockingQueue(int capacity, boolean fair) | O(1) | O(n) |
| ArrayBlockingQueue(int capacity, boolean fair, Collection<? extends E> c) | O(n) | O(n) |

---

## ArrayBlockingQueue Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| remainingCapacity() | O(1) | O(1) |
| drainTo(Collection) | O(n) | O(1) |
| drainTo(Collection, int) | O(min(n, maxElements)) | O(1) |

---

# When Should You Use These Methods?

## ArrayBlockingQueue(int capacity)

Use when:

- Maximum queue size is known.
- Memory usage should remain fixed.
- Producer-Consumer architecture is required.

Example

```java
ArrayBlockingQueue<Integer> queue =
        new ArrayBlockingQueue<>(100);
```

---

## ArrayBlockingQueue(int capacity, boolean fair)

Use when:

- Fair thread scheduling is required.
- Waiting threads should be served in FIFO order.

Example

```java
ArrayBlockingQueue<String> queue =
        new ArrayBlockingQueue<>(50, true);
```

---

## ArrayBlockingQueue(int capacity,
boolean fair,
Collection)

Use when:

- Queue should start with existing elements.
- Fixed capacity and fairness are required.

Example

```java
ArrayBlockingQueue<Integer> queue =
        new ArrayBlockingQueue<>(
                20,
                true,
                list);
```

---

## remainingCapacity()

Use when:

- Need to know available space before insertion.
- Prevent unnecessary blocking.

---

## drainTo()

Use when:

- Multiple elements should be transferred at once.
- Batch processing is required.

---

# Internal Working

Unlike `LinkedBlockingQueue`,

`ArrayBlockingQueue` stores elements using a **Fixed-Size Circular Array**.

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

When either end reaches the last index,

it wraps around to the beginning of the array.

This avoids shifting elements.

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

If the queue becomes full,

Producer waits.

If the queue becomes empty,

Consumer waits.

Waiting is handled automatically using

- ReentrantLock
- Condition Variables

---

# Fair vs Non-Fair Queue

## Fair Queue

```java
new ArrayBlockingQueue<>(10, true)
```

Waiting threads receive access in FIFO order.

Example

```text
Thread A

↓

Thread B

↓

Thread C
```

Execution

```text
A

↓

B

↓

C
```

---

## Non-Fair Queue

```java
new ArrayBlockingQueue<>(10, false)
```

Threads may obtain access in any order.

Provides better throughput.

---

# ArrayBlockingQueue vs LinkedBlockingQueue

| Feature | ArrayBlockingQueue | LinkedBlockingQueue |
|----------|-------------------:|--------------------:|
| Internal Structure | Circular Array | Linked List |
| Capacity | Fixed | Optional |
| Memory Usage | Lower | Higher |
| Dynamic Growth | ❌ | ✅ |
| Fairness Option | ✅ | ❌ |
| Producer-Consumer | Excellent | Excellent |

---

# Important Notes

### Thread Safety

ArrayBlockingQueue is completely thread-safe.

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

### Fixed Capacity

The capacity is determined during object creation.

It **cannot be changed** later.

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

- ReentrantLock
- Condition Variables

instead of synchronized methods.

---

# Frequently Asked Interview Questions

## Q1. Which interface does ArrayBlockingQueue implement?

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

## Q2. Which data structure does ArrayBlockingQueue use internally?

```text
Fixed-Size Circular Array
```

---

## Q3. Is ArrayBlockingQueue thread-safe?

Yes.

---

## Q4. Does ArrayBlockingQueue support blocking operations?

Yes.

Examples

```java
put()

take()
```

---

## Q5. Does ArrayBlockingQueue support timeout operations?

Yes.

Examples

```java
offer(element, timeout, TimeUnit)

poll(timeout, TimeUnit)
```

---

## Q6. What is the purpose of the fairness parameter?

It determines whether waiting threads obtain access in FIFO order.

```java
true
```

→ Fair Scheduling

```java
false
```

→ Better Performance

---

## Q7. Does ArrayBlockingQueue allow duplicate elements?

Yes.

---

## Q8. Does ArrayBlockingQueue allow null elements?

No.

Throws

```text
NullPointerException
```

---

## Q9. Can the capacity be increased after creation?

No.

The capacity is fixed.

---

## Q10. Which synchronization mechanism does it use internally?

```text
ReentrantLock

+

Condition Variables
```

---

## Q11. When should ArrayBlockingQueue be preferred over LinkedBlockingQueue?

When:

- Fixed capacity is required.
- Lower memory usage is preferred.
- Better cache locality is desired.
- Fair scheduling is needed.

---

## Q12. What is the time complexity of insertion and removal?

```text
O(1)
```

for both operations.

---

# Summary

- `ArrayBlockingQueue` is a bounded implementation of the `BlockingQueue` interface.
- Internally uses a **Fixed-Size Circular Array**.
- Supports FIFO ordering with blocking and timed operations.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `BlockingQueue`.
- Supports optional **Fair** and **Non-Fair** thread scheduling.
- Uses **ReentrantLock** and **Condition Variables** for synchronization.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for producer-consumer systems, thread pools, task scheduling, and other concurrent applications where a fixed-capacity queue is required.