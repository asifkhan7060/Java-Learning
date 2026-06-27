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

# Class Declaration

```java
public class SynchronousQueue<E>
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
SynchronousQueue
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
            SynchronousQueue
```

---

# Complete SynchronousQueue Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
SynchronousQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ SynchronousQueue()
└── ✅ SynchronousQueue(boolean fair)

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
│ SynchronousQueue Specific Public Methods
├──────────────────────────────────────────────
│
└── *(No Additional Public Methods)*

│
├──────────────────────────────────────────────
│ Protected / Internal Methods
├──────────────────────────────────────────────
│
├── 🔒 transfer()
├── 🔒 TransferStack()
├── 🔒 TransferQueue()
├── 🔒 awaitFulfill()
└── 🔒 clean()

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

The methods available in a `SynchronousQueue` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `SynchronousQueue` class.

They are used to create `SynchronousQueue` objects and are **not inherited**.

```java
SynchronousQueue()

SynchronousQueue(boolean fair)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `SynchronousQueue` object can use the methods defined in the `Iterable` interface.

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

every `SynchronousQueue` also inherits all `Collection` methods.

Although inherited, many collection operations behave differently because the queue has **zero capacity**.

Examples:

- Adding Elements
- Removing Elements
- Searching
- Converting to Arrays

---

## 4. Methods Inherited from Queue

The `Queue` interface provides standard queue operations.

However,

`SynchronousQueue` never stores elements.

Each insertion must immediately pair with a removal.

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

These methods synchronize producers and consumers through direct handoff.

---

## 6. SynchronousQueue Specific Methods

Unlike many collection classes,

`SynchronousQueue` introduces **no additional public methods**.

Its unique behavior comes from its **zero-capacity direct handoff mechanism**.

---

## 7. Optimized Overrides

Several inherited methods are optimized internally using direct thread synchronization.

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

Therefore, a `SynchronousQueue` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.

# Part 2 : SynchronousQueue Specific Methods

---

## 1. SynchronousQueue()

Creates a non-fair `SynchronousQueue`.

### Syntax

```java
SynchronousQueue<E> queue =
        new SynchronousQueue<>();
```

### Example

```java
SynchronousQueue<String> queue =
        new SynchronousQueue<>();
```

### Purpose

- Creates a thread-safe queue.
- Uses the default **Non-Fair** policy.
- Provides direct handoff between producer and consumer threads.

### Note

Internally,

`SynchronousQueue` stores **no elements**.

Its capacity is always **zero**.

---

## 2. SynchronousQueue(boolean fair)

Creates a `SynchronousQueue` with the specified fairness policy.

### Syntax

```java
SynchronousQueue<E> queue =
        new SynchronousQueue<>(fair);
```

### Example

```java
SynchronousQueue<String> queue =
        new SynchronousQueue<>(true);
```

### Purpose

Allows choosing between:

- Fair Scheduling
- Non-Fair Scheduling

---

### Fair Queue

```java
true
```

Waiting threads receive access in FIFO order.

Example

```text
Producer A

↓

Producer B

↓

Producer C
```

Consumer receives

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

Waiting threads may obtain access in any order.

Provides better overall performance.

---

# SynchronousQueue Specific Methods

Unlike many Collection classes,

`SynchronousQueue` introduces **no additional public methods**.

All public functionality comes from:

- Collection
- Queue
- BlockingQueue

Its unique behavior comes from its **Zero-Capacity Direct Handoff** mechanism.

---

## 1. remainingCapacity()

Returns the remaining capacity.

### Syntax

```java
int remainingCapacity()
```

### Output

```text
0
```

### Purpose

Indicates available storage capacity.

### Note

Since `SynchronousQueue` stores **no elements**,

it always returns

```java
0
```

---

## 2. drainTo(Collection)

Removes all immediately available elements and transfers them into another Collection.

### Syntax

```java
int drainTo(
        Collection<? super E> c)
```

### Example

```java
List<String> list =
        new ArrayList<>();

queue.drainTo(list);
```

### Purpose

Transfers any waiting element to another Collection.

### Note

Usually,

this method transfers

```text
0

or

1
```

element because no internal storage exists.

---

## 3. drainTo(Collection, int)

Transfers at most the specified number of immediately available elements.

### Syntax

```java
int drainTo(
        Collection<? super E> c,
        int maxElements)
```

### Example

```java
queue.drainTo(list, 1);
```

### Purpose

Useful for transferring immediately available handoff elements.

---

# Internal Methods

The following methods exist inside the JDK implementation.

They are **not accessible** directly.

---

## 1. transfer()

Performs the direct handoff between producer and consumer threads.

---

## 2. TransferStack()

Internal data structure used when

```java
fair = false
```

Implements a LIFO matching strategy.

---

## 3. TransferQueue()

Internal data structure used when

```java
fair = true
```

Implements a FIFO matching strategy.

---

## 4. awaitFulfill()

Suspends a thread until another thread completes the handoff.

---

## 5. clean()

Removes cancelled or interrupted waiting threads from the internal structures.

---

# Optimized Overrides

The following inherited methods are optimized using

**TransferStack**, **TransferQueue**, **CAS Operations**, and **LockSupport**.

```java
put()

take()

offer()

poll()

iterator()

spliterator()
```

These implementations provide extremely efficient thread synchronization.

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
- SynchronousQueue has **zero capacity**.
- It never stores elements internally.
- Every insertion requires a matching removal.
- Every removal requires a matching insertion.
- Supports **Fair** and **Non-Fair** scheduling.
- `remainingCapacity()` always returns **0**.
- Null elements are **not allowed**.
- The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `BlockingQueue`, or `SynchronousQueue`), even when the object is a `SynchronousQueue`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| SynchronousQueue() | O(1) | O(1) |
| SynchronousQueue(boolean fair) | O(1) | O(1) |

---

## SynchronousQueue Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| remainingCapacity() | O(1) | O(1) |
| drainTo(Collection) | O(1) | O(1) |
| drainTo(Collection, int) | O(1) | O(1) |

---

# When Should You Use These Methods?

## SynchronousQueue()

Use when:

- Direct communication between producer and consumer is required.
- No intermediate storage is needed.
- Maximum throughput is desired.

Example

```java
SynchronousQueue<String> queue =
        new SynchronousQueue<>();
```

---

## SynchronousQueue(boolean fair)

Use when:

- Waiting threads should be served in FIFO order.
- Fair scheduling is required.

Example

```java
SynchronousQueue<String> queue =
        new SynchronousQueue<>(true);
```

---

## remainingCapacity()

Use when:

- Checking available capacity.

### Note

Since the queue stores **no elements**,

it always returns

```java
0
```

---

## drainTo()

Use when:

- Attempting to transfer any immediately available element.
- Inspecting pending handoff operations.

---

# Internal Working

Unlike every other Queue implementation,

`SynchronousQueue` stores **no elements**.

Instead,

it directly transfers an element

from the Producer Thread

to the Consumer Thread.

```text
Producer

   put()

      │

      ▼

Direct Handoff

      ▲

      │

   take()

Consumer
```

There is **no internal buffer**.

---

# Producer-Consumer Model

Producer

```text
put()

↓

Wait
```

Consumer

```text
take()

↓

Receives Element
```

If

- Producer arrives first

Producer waits.

If

- Consumer arrives first

Consumer waits.

The transfer occurs only when both threads are present.

---

# Fair vs Non-Fair Queue

## Fair Queue

```java
new SynchronousQueue<>(true)
```

Uses

```text
FIFO
```

ordering.

Waiting threads receive access in arrival order.

---

## Non-Fair Queue

```java
new SynchronousQueue<>(false)
```

(Default)

Uses

```text
LIFO
```

style matching internally.

Provides better performance and lower contention.

---

# SynchronousQueue vs ArrayBlockingQueue

| Feature | SynchronousQueue | ArrayBlockingQueue |
|----------|-----------------:|-------------------:|
| Capacity | 0 | Fixed |
| Internal Storage | None | Circular Array |
| Thread Safe | ✅ | ✅ |
| Blocking Operations | ✅ | ✅ |
| Producer waits | Always | Only when Full |
| Consumer waits | Until Producer arrives | Only when Empty |

---

# SynchronousQueue vs LinkedBlockingQueue

| Feature | SynchronousQueue | LinkedBlockingQueue |
|----------|-----------------:|--------------------:|
| Capacity | 0 | Optional |
| Internal Structure | None | Linked List |
| Blocking Operations | ✅ | ✅ |
| Stores Elements | ❌ | ✅ |
| Producer-Consumer | Direct Handoff | Buffered Queue |

---

# Important Notes

### Zero Capacity

SynchronousQueue has

```text
Capacity = 0
```

No element is ever stored.

---

### Direct Handoff

Every

```java
put()
```

must wait for

```java
take()
```

Similarly,

every

```java
take()
```

must wait for

```java
put()
```

---

### Blocking Operations

Both producer and consumer may block.

Unlike most queues,

both sides depend on each other.

---

### Fair Scheduling

Supports

```java
true
```

for FIFO scheduling.

---

### Non-Fair Scheduling

Uses

```java
false
```

by default for better performance.

---

### Null Values

Null elements are **not allowed**.

```java
queue.put(null);
```

Throws

```text
NullPointerException
```

---

### Synchronization

Internally uses

- TransferStack
- TransferQueue
- CAS Operations
- LockSupport

instead of traditional queue storage.

---

# Frequently Asked Interview Questions

## Q1. Which interface does SynchronousQueue implement?

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

## Q2. Does SynchronousQueue store elements?

No.

Its capacity is always

```text
0
```

---

## Q3. Is SynchronousQueue thread-safe?

Yes.

---

## Q4. What happens when put() is called?

The producer thread waits until another thread calls

```java
take()
```

---

## Q5. What happens when take() is called?

The consumer thread waits until another thread calls

```java
put()
```

---

## Q6. What does remainingCapacity() return?

```java
0
```

---

## Q7. Does SynchronousQueue allow duplicate elements?

Yes.

Each element is transferred individually.

---

## Q8. Does SynchronousQueue allow null elements?

No.

Throws

```text
NullPointerException
```

---

## Q9. What is the difference between Fair and Non-Fair mode?

Fair

```text
FIFO
```

Non-Fair

```text
LIFO-style matching
```

with better throughput.

---

## Q10. Which internal mechanism is used?

```text
TransferStack

or

TransferQueue
```

depending on the fairness policy.

---

## Q11. Where is SynchronousQueue commonly used?

Examples:

- ThreadPoolExecutor
- Direct Thread Communication
- Producer-Consumer Systems
- Task Handoff
- High-Performance Concurrent Applications

---

## Q12. Why is SynchronousQueue different from every other Queue?

Because it **never stores elements**.

Every insertion must be matched immediately with a corresponding removal.

---

# Summary

- `SynchronousQueue` is a specialized thread-safe implementation of the `BlockingQueue` interface.
- It has **zero capacity** and **never stores elements**.
- Provides **direct handoff** between producer and consumer threads.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `BlockingQueue`.
- Supports blocking and timed operations.
- Offers **Fair (FIFO)** and **Non-Fair (LIFO-style)** scheduling policies.
- Internally uses **TransferStack**, **TransferQueue**, **CAS operations**, and **LockSupport** for efficient synchronization.
- Does **not allow null elements** and transfers each element immediately.
- Best suited for thread pools, direct task handoff, producer-consumer synchronization, and high-performance concurrent systems.