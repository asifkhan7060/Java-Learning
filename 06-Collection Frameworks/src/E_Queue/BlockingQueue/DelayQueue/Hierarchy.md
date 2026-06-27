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

# Class Declaration

```java
public class DelayQueue<E extends Delayed>
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
DelayQueue
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
               DelayQueue
```

---

# Complete DelayQueue Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
DelayQueue<E extends Delayed>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ DelayQueue()
└── ✅ DelayQueue(Collection<? extends E> c)

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
│ DelayQueue Specific Public Methods
├──────────────────────────────────────────────
│
└── *(No Additional Public Methods)*

│
├──────────────────────────────────────────────
│ Protected / Internal Methods
├──────────────────────────────────────────────
│
├── 🔒 leaderThread()
├── 🔒 availableCondition()
├── 🔒 dequeueExpired()
├── 🔒 signalLeader()
└── 🔒 priorityHeap()

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

The methods available in a `DelayQueue` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `DelayQueue` class.

They are used to create `DelayQueue` objects and are **not inherited**.

```java
DelayQueue()

DelayQueue(Collection<? extends E> c)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `DelayQueue` object can use the methods defined in the `Iterable` interface.

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

every `DelayQueue` also inherits all `Collection` methods.

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

`DelayQueue` returns an element **only after its delay has expired**.

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

For `DelayQueue`, these methods consider the **remaining delay** before making an element available.

---

## 6. DelayQueue Specific Methods

Unlike many collection classes,

`DelayQueue` introduces **no additional public methods**.

Its unique behavior comes from storing objects that implement the **Delayed** interface.

---

## 7. Optimized Overrides

Several inherited methods are optimized internally using a **Priority Queue (Binary Heap)**, **ReentrantLock**, and **Condition Variables**.

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

Therefore, a `DelayQueue` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.

# Part 2 : DelayQueue Specific Methods

---

## 1. DelayQueue()

Creates an empty `DelayQueue`.

### Syntax

```java
DelayQueue<E> queue =
        new DelayQueue<>();
```

### Example

```java
DelayQueue<Task> queue =
        new DelayQueue<>();
```

### Purpose

- Creates an empty thread-safe delay queue.
- Stores elements according to their delay.
- Grows dynamically as elements are added.

### Note

Every element **must implement** the `Delayed` interface.

Internally,

`DelayQueue` uses a **Priority Queue (Binary Heap)**.

---

## 2. DelayQueue(Collection<? extends E> c)

Creates a `DelayQueue` containing all elements from another Collection.

### Syntax

```java
DelayQueue<E> queue =
        new DelayQueue<>(collection);
```

### Example

```java
List<Task> list =
        List.of(task1, task2, task3);

DelayQueue<Task> queue =
        new DelayQueue<>(list);
```

### Purpose

Copies all delayed elements from another Collection.

The queue automatically arranges them according to their remaining delay.

---

# DelayQueue Specific Methods

Unlike many Collection classes,

`DelayQueue` introduces **no additional public methods**.

All public functionality comes from:

- Collection
- Queue
- BlockingQueue

The special behavior comes from the **Delayed** interface implemented by stored elements.

---

## 1. remainingCapacity()

Returns the number of additional elements that can theoretically be inserted.

### Syntax

```java
int remainingCapacity()
```

### Output

```text
2147483647
```

### Purpose

Indicates the remaining capacity.

### Note

Since `DelayQueue` is **unbounded**,

this method always returns

```java
Integer.MAX_VALUE
```

---

## 2. drainTo(Collection)

Removes all **expired** elements and transfers them into another Collection.

### Syntax

```java
int drainTo(
        Collection<? super E> c)
```

### Example

```java
List<Task> list =
        new ArrayList<>();

queue.drainTo(list);
```

### Purpose

Efficiently transfers all expired elements.

Unexpired elements remain inside the queue.

---

## 3. drainTo(Collection, int)

Transfers at most the specified number of **expired** elements.

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

Useful for processing delayed tasks in batches.

---

# Internal Methods

The following methods exist inside the JDK implementation.

They are **not accessible** directly.

---

## 1. leaderThread()

Maintains the leader thread responsible for waiting until the next element expires.

---

## 2. availableCondition()

Condition object used to wake waiting consumer threads.

---

## 3. dequeueExpired()

Removes the expired element from the priority heap.

---

## 4. signalLeader()

Signals another waiting thread when the head element changes.

---

## 5. priorityHeap()

Maintains the internal Binary Heap according to element delay.

---

# Optimized Overrides

The following inherited methods are optimized using a

**Priority Queue (Binary Heap)**, **ReentrantLock**, and **Condition Variables**.

```java
put()

take()

offer()

poll()

iterator()

spliterator()
```

These implementations provide efficient thread-safe delay-based queue operations.

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
- DelayQueue internally uses a **Priority Queue (Binary Heap)**.
- Every element must implement the **Delayed** interface.
- Elements become available **only after their delay expires**.
- The queue is **unbounded**.
- `remainingCapacity()` always returns `Integer.MAX_VALUE`.
- Duplicate elements are allowed.
- Null elements are **not allowed**.
- `take()` blocks until the head element's delay has expired.
- The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `DelayQueue`), even when the object is a `DelayQueue`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| DelayQueue() | O(1) | O(1) |
| DelayQueue(Collection<? extends E>) | O(n) | O(n) |

---

## DelayQueue Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| remainingCapacity() | O(1) | O(1) |
| drainTo(Collection) | O(n) | O(1) |
| drainTo(Collection, int) | O(min(n, maxElements)) | O(1) |

---

# When Should You Use These Methods?

## DelayQueue()

Use when:

- Tasks should execute only after a specified delay.
- Delayed scheduling is required.
- Thread-safe delayed processing is needed.

Example

```java
DelayQueue<Task> queue =
        new DelayQueue<>();
```

---

## DelayQueue(Collection)

Use when:

- Converting an existing Collection of delayed objects into a DelayQueue.

Example

```java
DelayQueue<Task> queue =
        new DelayQueue<>(list);
```

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

- Multiple expired elements should be processed together.
- Batch processing of delayed tasks is required.

---

# Internal Working

Unlike `LinkedBlockingQueue`,

`DelayQueue` internally stores elements using a **Priority Queue (Binary Heap)**.

```text
          2 sec
         /     \
     5 sec    8 sec
      /
  10 sec
```

The element having the **smallest remaining delay**

always stays at the root.

---

# Delay Mechanism

Suppose three tasks are inserted.

```text
Task A → 10 sec

Task B → 5 sec

Task C → 2 sec
```

Internally

```text
          C
         / \
        A   B
```

Consumer Thread

```text
take()

↓

Wait until

↓

Task C expires

↓

Return Task C
```

The remaining tasks continue waiting until their delay expires.

---

# DelayQueue vs PriorityBlockingQueue

| Feature | DelayQueue | PriorityBlockingQueue |
|----------|-----------:|----------------------:|
| Ordering | Delay | Priority |
| Thread Safe | ✅ | ✅ |
| Blocking Operations | ✅ | ✅ |
| Delayed Execution | ✅ | ❌ |
| Requires Delayed Interface | ✅ | ❌ |
| Internal Structure | Binary Heap | Binary Heap |

---

# DelayQueue vs ScheduledThreadPoolExecutor

| Feature | DelayQueue | ScheduledThreadPoolExecutor |
|----------|-----------:|----------------------------:|
| Stores Delayed Tasks | ✅ | ✅ |
| Executes Tasks Automatically | ❌ | ✅ |
| Manual take() Required | ✅ | ❌ |
| Thread Pool | ❌ | ✅ |

---

# Important Notes

### Thread Safety

DelayQueue is completely thread-safe.

Multiple threads can safely access it simultaneously.

---

### Delayed Elements

Every element must implement

```java
Delayed
```

Otherwise,

it cannot be inserted.

---

### Blocking Behavior

```java
take()
```

waits until

the **head element's delay expires**.

---

### Ordering

Elements are ordered by

their **remaining delay**,

not insertion order.

---

### Capacity

DelayQueue is **unbounded**.

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

along with the **Leader-Follower** waiting strategy for efficient delayed task processing.

---

# Frequently Asked Interview Questions

## Q1. Which interface does DelayQueue implement?

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

## Q2. Which data structure does DelayQueue use internally?

```text
Priority Queue

(Binary Heap)
```

---

## Q3. Is DelayQueue thread-safe?

Yes.

---

## Q4. Which interface must every stored element implement?

```java
Delayed
```

---

## Q5. Does take() return the head element immediately?

No.

It waits until

the head element's delay expires.

---

## Q6. Does DelayQueue maintain FIFO order?

No.

It maintains **delay order**.

---

## Q7. Does DelayQueue allow duplicate elements?

Yes.

---

## Q8. Does DelayQueue allow null elements?

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

## Q10. What is the time complexity of insertion and removal?

```text
O(log n)
```

because operations maintain the Binary Heap.

---

## Q11. Where is DelayQueue commonly used?

Examples:

- Cache Expiration
- Session Timeout
- Task Scheduling
- Retry Mechanisms
- Delayed Message Processing

---

## Q12. Why is DelayQueue preferred over a normal PriorityQueue?

Because it supports:

- Thread Safety
- Blocking Operations
- Automatic delay-based retrieval

making it suitable for concurrent delayed task scheduling.

---

# Summary

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
