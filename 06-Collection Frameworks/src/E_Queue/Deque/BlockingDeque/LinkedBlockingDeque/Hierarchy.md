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

# Class Declaration

```java
public class LinkedBlockingDeque<E>
        extends AbstractQueue<E>
        implements BlockingDeque<E>, Serializable
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
                     Deque
                       ▲
                       │
                BlockingQueue
                       ▲
                       │
                BlockingDeque
                       ▲
                       │
             LinkedBlockingDeque
```

---

# Complete LinkedBlockingDeque Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
LinkedBlockingDeque<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ LinkedBlockingDeque()
├── ✅ LinkedBlockingDeque(int capacity)
└── ✅ LinkedBlockingDeque(Collection<? extends E> c)

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
│ Methods Inherited from Deque
├──────────────────────────────────────────────
│
├── ✅ addFirst(E e)
├── ✅ addLast(E e)
│
├── ✅ offerFirst(E e)
├── ✅ offerLast(E e)
│
├── ✅ removeFirst()
├── ✅ removeLast()
│
├── ✅ pollFirst()
├── ✅ pollLast()
│
├── ✅ getFirst()
├── ✅ getLast()
│
├── ✅ peekFirst()
├── ✅ peekLast()
│
├── ✅ push(E e)
├── ✅ pop()
│
├── ✅ removeFirstOccurrence(Object o)
├── ✅ removeLastOccurrence(Object o)
│
├── ✅ descendingIterator()
└── 🆕 reversed() *(Java 21+)*
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
│ Methods Inherited from BlockingDeque
├──────────────────────────────────────────────
│
├── ✅ putFirst(E e)
├── ✅ putLast(E e)
│
├── ✅ offerFirst(E e, long, TimeUnit)
├── ✅ offerLast(E e, long, TimeUnit)
│
├── ✅ takeFirst()
├── ✅ takeLast()
│
├── ✅ pollFirst(long, TimeUnit)
└── ✅ pollLast(long, TimeUnit)

│
├──────────────────────────────────────────────
│ LinkedBlockingDeque Specific Public Methods
├──────────────────────────────────────────────
│
└── *(No Additional Public Methods)*

│
├──────────────────────────────────────────────
│ Protected / Internal Methods
├──────────────────────────────────────────────
│
├── 🔒 linkFirst()
├── 🔒 linkLast()
├── 🔒 unlink()
├── 🔒 signalNotEmpty()
└── 🔒 signalNotFull()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ putFirst()
├── ✅ putLast()
├── ✅ takeFirst()
├── ✅ takeLast()
├── ✅ iterator()
├── ✅ descendingIterator()
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

The methods available in a `LinkedBlockingDeque` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `LinkedBlockingDeque` class.

They are used to create `LinkedBlockingDeque` objects and are **not inherited**.

```java
LinkedBlockingDeque()

LinkedBlockingDeque(int capacity)

LinkedBlockingDeque(Collection<? extends E> c)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `LinkedBlockingDeque` object can use the methods defined in the `Iterable` interface.

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

every `LinkedBlockingDeque` also inherits all `Collection` methods.

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

## 5. Methods Inherited from Deque

The `Deque` interface supports insertion and removal from **both ends**.

Examples include:

- addFirst()
- addLast()
- pollFirst()
- pollLast()
- push()
- pop()

This allows `LinkedBlockingDeque` to behave as both a Queue and a Stack.

---

## 6. Methods Inherited from BlockingQueue

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

## 7. Methods Inherited from BlockingDeque

`BlockingDeque` extends `BlockingQueue` by adding blocking operations at **both ends** of the deque.

Examples:

- putFirst()
- putLast()
- takeFirst()
- takeLast()
- offerFirst(timeout)
- offerLast(timeout)
- pollFirst(timeout)
- pollLast(timeout)

These methods are designed specifically for concurrent producer-consumer applications.

---

## 8. LinkedBlockingDeque Specific Methods

Unlike many collection classes,

`LinkedBlockingDeque` introduces **no additional public methods**.

Its functionality comes entirely from the interfaces it implements.

---

## 9. Optimized Overrides

Several inherited methods are optimized internally using a **Doubly Linked List** and synchronization mechanisms.

Examples:

- putFirst()
- putLast()
- takeFirst()
- takeLast()
- iterator()
- descendingIterator()

---

## 10. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, a `LinkedBlockingDeque` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.


# Part 2 : LinkedBlockingDeque Specific Methods

---

## 1. LinkedBlockingDeque()

Creates an unbounded `LinkedBlockingDeque`.

### Syntax

```java
LinkedBlockingDeque<E> deque =
        new LinkedBlockingDeque<>();
```

### Example

```java
LinkedBlockingDeque<Integer> deque =
        new LinkedBlockingDeque<>();
```

### Purpose

- Creates an empty LinkedBlockingDeque.
- Uses the default maximum capacity.
- Thread-safe.
- Supports blocking operations.

### Note

Internally,

LinkedBlockingDeque uses a **Doubly Linked List**.

---

## 2. LinkedBlockingDeque(int capacity)

Creates a `LinkedBlockingDeque` with the specified capacity.

### Syntax

```java
LinkedBlockingDeque<E> deque =
        new LinkedBlockingDeque<>(capacity);
```

### Example

```java
LinkedBlockingDeque<Integer> deque =
        new LinkedBlockingDeque<>(100);
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

When the deque becomes full,

blocking methods wait until space becomes available.

---

## 3. LinkedBlockingDeque(Collection<? extends E> c)

Creates a LinkedBlockingDeque containing all elements of another Collection.

### Syntax

```java
LinkedBlockingDeque<E> deque =
        new LinkedBlockingDeque<>(collection);
```

### Example

```java
List<Integer> list =
        List.of(10,20,30);

LinkedBlockingDeque<Integer> deque =
        new LinkedBlockingDeque<>(list);
```

### Purpose

Copies all elements from another Collection.

Useful when converting an existing Collection into a thread-safe deque.

---

# LinkedBlockingDeque Specific Methods

Unlike ArrayDeque,

`LinkedBlockingDeque` introduces **no additional public methods**.

All public functionality comes from:

- Collection
- Queue
- Deque
- BlockingQueue
- BlockingDeque

---

## 1. remainingCapacity()

Returns the number of additional elements that can be inserted.

### Syntax

```java
int remainingCapacity()
```

### Example

```java
LinkedBlockingDeque<Integer> deque =
        new LinkedBlockingDeque<>(5);

deque.add(10);
deque.add(20);

System.out.println(
        deque.remainingCapacity());
```

Output

```text
3
```

### Purpose

Useful for monitoring available space before insertion.

---

## 2. drainTo(Collection)

Removes all available elements and transfers them into another Collection.

### Syntax

```java
int drainTo(Collection<? super E> c)
```

### Example

```java
List<Integer> list =
        new ArrayList<>();

deque.drainTo(list);
```

### Purpose

Efficiently moves all elements from the deque.

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
deque.drainTo(list, 3);
```

### Purpose

Useful when processing elements in batches.

---

# Internal Methods

The following methods exist inside the JDK implementation.

They are **not accessible** directly.

---

## 1. linkFirst()

Creates and inserts a node at the front of the deque.

---

## 2. linkLast()

Creates and inserts a node at the rear of the deque.

---

## 3. unlink()

Removes a node while maintaining the doubly linked list.

---

## 4. signalNotEmpty()

Signals waiting consumer threads that an element is available.

---

## 5. signalNotFull()

Signals waiting producer threads that space is available.

---

# Optimized Overrides

The following inherited methods are optimized using a
**Doubly Linked List**, **ReentrantLock**, and **Condition Variables**.

```java
putFirst()

putLast()

takeFirst()

takeLast()

iterator()

descendingIterator()

spliterator()
```

These implementations provide efficient and thread-safe operations.

---

# Methods Not Covered Yet

The following methods exist in Java,

but are not covered in this project.

```java
removeIf(Predicate<? super E> filter)

toArray(IntFunction<T[]> generator)

reversed()      // Java 21+
```

---

# Important Notes

- Constructors are **not inherited**.
- LinkedBlockingDeque internally uses a **Doubly Linked List**.
- It is **thread-safe**.
- Supports blocking operations at **both front and rear**.
- Supports optional capacity restriction.
- Duplicate elements are allowed.
- Null elements are **not allowed**.
- All insertion and removal operations are synchronized internally.
- The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `Deque`, `BlockingQueue`, `BlockingDeque`, or `LinkedBlockingDeque`), even when the object is a `LinkedBlockingDeque`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| LinkedBlockingDeque() | O(1) | O(1) |
| LinkedBlockingDeque(int capacity) | O(1) | O(1) |
| LinkedBlockingDeque(Collection<? extends E>) | O(n) | O(n) |

---

## LinkedBlockingDeque Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| remainingCapacity() | O(1) | O(1) |
| drainTo(Collection) | O(n) | O(1) |
| drainTo(Collection, int) | O(min(n, maxElements)) | O(1) |

---

# When Should You Use These Methods?

## LinkedBlockingDeque()

Use when:

- Maximum capacity is not important.
- Multiple producer and consumer threads are involved.
- Thread-safe deque operations are required.

Example

```java
LinkedBlockingDeque<Integer> deque =
        new LinkedBlockingDeque<>();
```

---

## LinkedBlockingDeque(int capacity)

Use when:

- Memory usage should be controlled.
- Queue size should be limited.
- Producer-Consumer architecture is used.

Example

```java
LinkedBlockingDeque<String> deque =
        new LinkedBlockingDeque<>(100);
```

---

## LinkedBlockingDeque(Collection)

Use when:

- Converting an existing Collection into a thread-safe deque.

Example

```java
LinkedBlockingDeque<Integer> deque =
        new LinkedBlockingDeque<>(list);
```

---

## remainingCapacity()

Use when:

- Need to know how much free space is available.
- Prevent unnecessary blocking.

---

## drainTo()

Use when:

- Bulk transfer of elements is required.
- Consumer wants to process multiple elements together.

---

# Internal Working

Unlike `ArrayDeque`,

`LinkedBlockingDeque` stores elements using a **Doubly Linked List**.

```text
NULL
 ↑
 │
10 ⇄ 20 ⇄ 30 ⇄ 40
 ↑              ↑
Head          Tail
```

Each node stores:

- Previous Node Reference
- Data
- Next Node Reference

---

# Producer-Consumer Model

Producer Thread

```text
putLast()

↓

Deque

↓

takeFirst()

Consumer Thread
```

When the deque becomes full,

Producer waits.

When the deque becomes empty,

Consumer waits.

This waiting is handled automatically using **Locks** and **Condition Variables**.

---

# LinkedBlockingDeque vs ArrayDeque

| Feature | LinkedBlockingDeque | ArrayDeque |
|----------|--------------------:|-----------:|
| Thread Safe | ✅ | ❌ |
| Internal Structure | Doubly Linked List | Circular Array |
| Blocking Operations | ✅ | ❌ |
| Timed Operations | ✅ | ❌ |
| Capacity Restriction | Optional | No |
| Producer-Consumer | Excellent | Not Suitable |

---

# LinkedBlockingDeque vs LinkedBlockingQueue

| Feature | LinkedBlockingDeque | LinkedBlockingQueue |
|----------|--------------------:|--------------------:|
| Front Insertion | ✅ | ❌ |
| Rear Insertion | ✅ | ✅ |
| Front Removal | ✅ | ✅ |
| Rear Removal | ✅ | ❌ |
| Queue | ✅ | ✅ |
| Stack | ✅ | ❌ |

---

# Important Notes

### Thread Safety

LinkedBlockingDeque is completely thread-safe.

Multiple threads can safely access it simultaneously.

---

### Blocking Operations

Methods such as

```java
putFirst()

putLast()

takeFirst()

takeLast()
```

automatically wait when necessary.

---

### Timed Operations

Supports timeout-based methods.

Example

```java
offerFirst(element, 5, TimeUnit.SECONDS)

pollLast(5, TimeUnit.SECONDS)
```

---

### Null Values

Null elements are **not allowed**.

```java
deque.add(null);
```

Throws

```text
NullPointerException
```

---

### Capacity

Can be

- Bounded
- Unbounded (default constructor)

---

### Internal Synchronization

Uses

- ReentrantLock
- Condition Variables

instead of synchronized methods.

This provides better concurrency performance.

---

# Frequently Asked Interview Questions

## Q1. Which interface does LinkedBlockingDeque implement?

```java
BlockingDeque
```

Indirectly,

```text
BlockingDeque

↓

Deque

↓

Queue

↓

Collection

↓

Iterable
```

---

## Q2. Which data structure does LinkedBlockingDeque use internally?

```text
Doubly Linked List
```

---

## Q3. Is LinkedBlockingDeque thread-safe?

Yes.

---

## Q4. Does LinkedBlockingDeque support blocking operations?

Yes.

Examples

```java
putFirst()

putLast()

takeFirst()

takeLast()
```

---

## Q5. Does it support timeout operations?

Yes.

Examples

```java
offerFirst(timeout)

offerLast(timeout)

pollFirst(timeout)

pollLast(timeout)
```

---

## Q6. Can it behave as both Queue and Stack?

Yes.

Because it implements `Deque`.

---

## Q7. Does LinkedBlockingDeque allow duplicate elements?

Yes.

---

## Q8. Does LinkedBlockingDeque allow null elements?

No.

Throws

```text
NullPointerException
```

---

## Q9. Which synchronization mechanism does it use internally?

```text
ReentrantLock

+

Condition Variables
```

---

## Q10. What is the advantage over LinkedBlockingQueue?

Supports insertion and removal from **both ends**.

---

## Q11. When should LinkedBlockingDeque be preferred over ArrayDeque?

When:

- Thread safety is required.
- Blocking operations are needed.
- Multiple producers and consumers access the deque.

---

## Q12. What is the time complexity of insertion and deletion?

```text
O(1)
```

at both ends.

---

# Summary

- `LinkedBlockingDeque` is the thread-safe implementation of the `BlockingDeque` interface.
- Internally uses a **Doubly Linked List**.
- Supports insertion and removal from **both front and rear**.
- Inherits methods from `Iterable`, `Collection`, `Queue`, `Deque`, `BlockingQueue`, and `BlockingDeque`.
- Supports blocking and timed operations for concurrent programming.
- Uses **ReentrantLock** and **Condition Variables** for synchronization.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for producer-consumer systems, task scheduling, work-stealing algorithms, and other concurrent applications requiring double-ended access.