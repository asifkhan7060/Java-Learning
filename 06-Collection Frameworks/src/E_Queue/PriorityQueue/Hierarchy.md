# PriorityQueue Method Hierarchy

## Overview

`PriorityQueue` is the most commonly used implementation of the `Queue` interface in the Java Collection Framework.

Unlike a normal Queue, a `PriorityQueue` processes elements according to their **priority** instead of their insertion order.

Internally, it stores elements using a **Binary Heap (Min Heap by default)**, which provides:

- Priority-Based Ordering
- Fast Insertion
- Fast Removal of Highest Priority Element
- Natural Ordering (Default)
- Custom Ordering using Comparator
- Duplicate Elements Allowed
- Null Elements Not Allowed

Since `PriorityQueue` implements the `Queue` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`

Additionally, `PriorityQueue` provides its own constructors and several class-specific methods.

---

# Class Declaration

```java
public class PriorityQueue<E>
        extends AbstractQueue<E>
        implements Serializable
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
AbstractCollection
    ↑
AbstractQueue
    ↑
PriorityQueue
```

---

# Interface Relationship

```text
Iterable
     ↑
Collection
     ↑
Queue
     ↑
PriorityQueue
```

---

# Complete PriorityQueue Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
PriorityQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ PriorityQueue()
├── ✅ PriorityQueue(int initialCapacity)
├── ✅ PriorityQueue(Comparator<? super E> comparator)
├── ✅ PriorityQueue(int initialCapacity,
│                   Comparator<? super E> comparator)
├── ✅ PriorityQueue(Collection<? extends E> c)
├── ✅ PriorityQueue(PriorityQueue<? extends E> c)
└── ✅ PriorityQueue(SortedSet<? extends E> c)

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
│ PriorityQueue Specific Public Methods
├──────────────────────────────────────────────
│
├── ✅ comparator()
└── 🆕 clone() *(Not Supported)*

│
├──────────────────────────────────────────────
│ Protected / Internal Methods
├──────────────────────────────────────────────
│
├── 🔒 siftUp()
├── 🔒 siftDown()
├── 🔒 heapify()
└── 🔒 grow()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ offer()
├── ✅ poll()
├── ✅ remove(Object o)
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

The methods available in a `PriorityQueue` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `PriorityQueue` class.

They are used to create `PriorityQueue` objects and are **not inherited**.

```java
PriorityQueue()

PriorityQueue(int initialCapacity)

PriorityQueue(Comparator<? super E> comparator)

PriorityQueue(int initialCapacity,
              Comparator<? super E> comparator)

PriorityQueue(Collection<? extends E> c)

PriorityQueue(PriorityQueue<? extends E> c)

PriorityQueue(SortedSet<? extends E> c)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `PriorityQueue` object can use the methods defined in the `Iterable` interface.

These methods are mainly used for traversing elements.

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

every `PriorityQueue` also inherits all `Collection` methods.

These methods perform common collection operations such as:

- Adding Elements
- Removing Elements
- Searching
- Converting to Arrays
- Stream Processing

---

## 4. Methods Inherited from Queue

The `Queue` interface adds support for **FIFO-based operations**.

However, `PriorityQueue` overrides this behavior by processing elements according to **priority**.

Examples include:

- add()
- offer()
- remove()
- poll()
- element()
- peek()

---

## 5. PriorityQueue Specific Methods

These methods belong only to the `PriorityQueue` class.

Examples:

- comparator()

This method returns the comparator used to order elements.

If natural ordering is used, it returns **null**.

---

## 6. Optimized Overrides

Some methods are inherited from parent interfaces but are reimplemented inside `PriorityQueue` to maintain the Binary Heap.

Examples:

- offer()
- poll()
- remove(Object)
- iterator()
- spliterator()

---

## 7. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, a `PriorityQueue` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.

# Part 2 : PriorityQueue Specific Methods

---

## 1. PriorityQueue()

Creates an empty `PriorityQueue`.

### Syntax

```java
PriorityQueue<E> queue = new PriorityQueue<>();
```

### Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>();
```

### Purpose

- Creates an empty PriorityQueue.
- Uses **Natural Ordering** by default.
- The smallest element always has the highest priority.

### Example

```text
Inserted

30
10
20

↓

PriorityQueue

10
20
30
```

### Note

Internally,

PriorityQueue uses a **Binary Min Heap**.

---

## 2. PriorityQueue(int initialCapacity)

Creates an empty `PriorityQueue` with the specified initial capacity.

### Syntax

```java
PriorityQueue<E> queue =
        new PriorityQueue<>(initialCapacity);
```

### Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>(50);
```

### Purpose

Useful when the approximate number of elements is already known.

Reduces internal resizing and improves performance.

### Example

```text
Capacity = 50

Current Size = 0
```

### Note

Capacity and Size are different.

```text
Capacity → Maximum elements before resizing

Size → Current stored elements
```

---

## 3. PriorityQueue(Comparator<? super E> comparator)

Creates a `PriorityQueue` using a custom Comparator.

### Syntax

```java
PriorityQueue<E> queue =
        new PriorityQueue<>(comparator);
```

### Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>(Collections.reverseOrder());
```

### Purpose

Allows custom priority ordering.

### Example

```text
Inserted

10
20
30

↓

PriorityQueue

30
20
10
```

### Note

Frequently used to create a **Max Heap**.

---

## 4. PriorityQueue(int initialCapacity,
Comparator<? super E> comparator)

Creates a PriorityQueue with both an initial capacity and a custom Comparator.

### Syntax

```java
PriorityQueue<E> queue =
        new PriorityQueue<>(50,
                Collections.reverseOrder());
```

### Purpose

- Pre-allocates capacity.
- Uses custom ordering.

Useful for high-performance applications.

---

## 5. PriorityQueue(Collection<? extends E> c)

Creates a PriorityQueue containing all elements of another Collection.

### Syntax

```java
PriorityQueue<E> queue =
        new PriorityQueue<>(collection);
```

### Example

```java
List<Integer> list =
        List.of(40,20,10,30);

PriorityQueue<Integer> queue =
        new PriorityQueue<>(list);
```

### Purpose

Copies all elements from another Collection.

### Note

Elements are automatically arranged according to priority.

---

## 6. PriorityQueue(PriorityQueue<? extends E> c)

Creates a new PriorityQueue from another PriorityQueue.

### Syntax

```java
PriorityQueue<E> queue =
        new PriorityQueue<>(anotherQueue);
```

### Purpose

Copies another PriorityQueue while preserving its ordering rules.

---

## 7. PriorityQueue(SortedSet<? extends E> c)

Creates a PriorityQueue containing all elements from a SortedSet.

### Syntax

```java
PriorityQueue<E> queue =
        new PriorityQueue<>(sortedSet);
```

### Example

```java
SortedSet<Integer> set =
        new TreeSet<>();

PriorityQueue<Integer> queue =
        new PriorityQueue<>(set);
```

### Purpose

Useful for converting a SortedSet into a PriorityQueue.

---

# PriorityQueue Specific Methods

Unlike Collection and Queue methods,

the following methods belong only to the `PriorityQueue` class.

---

## 1. comparator()

Returns the Comparator used to order the elements.

### Syntax

```java
Comparator<? super E> comparator()
```

### Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>();

System.out.println(queue.comparator());
```

Output

```text
null
```

### Purpose

Determines whether the PriorityQueue uses

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

# Internal Methods

These methods exist inside the JDK implementation.

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

Used internally by constructors.

---

## 4. grow()

Expands the internal array when capacity becomes full.

---

# Optimized Overrides

The following methods are inherited,

but `PriorityQueue` provides optimized implementations using a **Binary Heap**.

```java
offer()

poll()

remove(Object)

iterator()

spliterator()
```

These methods maintain heap order while providing efficient insertion and removal.

---

# Methods Not Covered Yet

The following methods exist in Java,

but are not covered in this project.

```java
clone()

removeIf(Predicate<? super E> filter)

toArray(IntFunction<T[]> generator)
```

---

# Important Notes

- Constructors are **not inherited**.
- `PriorityQueue` internally uses a **Binary Min Heap**.
- Elements are ordered according to **priority**, not insertion order.
- Duplicate elements are allowed.
- Null elements are **not allowed**.
- `comparator()` returns the Comparator used for ordering.
- If natural ordering is used, `comparator()` returns **null**.
- The methods available in your code depend on the **reference type** (`Collection`, `Queue`, or `PriorityQueue`), even when the object is a `PriorityQueue`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| PriorityQueue() | O(1) | O(1) |
| PriorityQueue(int initialCapacity) | O(1) | O(n) *(allocates capacity)* |
| PriorityQueue(Comparator<? super E>) | O(1) | O(1) |
| PriorityQueue(int initialCapacity, Comparator<? super E>) | O(1) | O(n) *(allocates capacity)* |
| PriorityQueue(Collection<? extends E>) | O(n) | O(n) |
| PriorityQueue(PriorityQueue<? extends E>) | O(n) | O(n) |
| PriorityQueue(SortedSet<? extends E>) | O(n) | O(n) |

---

## PriorityQueue Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| comparator() | O(1) | O(1) |

---

# When Should You Use These Methods?

## PriorityQueue()

Use when:

- Natural ordering is sufficient.
- Most commonly used constructor.

Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>();
```

---

## PriorityQueue(int initialCapacity)

Use when:

- Approximate number of elements is already known.
- Avoid repeated internal resizing.

Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>(1000);
```

---

## PriorityQueue(Comparator)

Use when:

- Custom ordering is required.
- Creating a Max Heap.
- Sorting user-defined objects.

Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>(Collections.reverseOrder());
```

---

## PriorityQueue(int initialCapacity, Comparator)

Use when:

- Capacity is known.
- Custom ordering is required.

Useful for large applications where performance matters.

---

## PriorityQueue(Collection)

Use when:

- Converting another Collection into a PriorityQueue.
- Heapifying existing data.

Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>(list);
```

---

## PriorityQueue(PriorityQueue)

Use when:

- Copying another PriorityQueue.
- Preserving ordering rules.

---

## PriorityQueue(SortedSet)

Use when:

- Converting a SortedSet into a PriorityQueue.

---

## comparator()

Use when:

- Need to know whether a custom Comparator is being used.
- Need access to the Comparator.

---

# Natural Ordering vs Custom Ordering

## Natural Ordering

Elements are arranged according to their natural ordering.

Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>();
```

```text
Inserted

30
10
20

↓

Head = 10
```

---

## Custom Ordering

Elements are arranged according to a custom Comparator.

Example

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>(Collections.reverseOrder());
```

```text
Inserted

30
10
20

↓

Head = 30
```

---

# Binary Heap

PriorityQueue internally uses a **Binary Heap**.

Example

```text
         10
       /    \
     20      30
    /  \
  40    50
```

Properties

- Complete Binary Tree
- Heap Property Maintained
- Root always contains the highest-priority element.

---

# Important Notes

### Priority Ordering

PriorityQueue does **not** maintain insertion order.

Elements are always arranged according to priority.

---

### Duplicate Elements

Allowed.

Example

```text
10
20
20
30
```

---

### Null Elements

Not allowed.

```java
queue.add(null);
```

Throws

```text
NullPointerException
```

---

### Iterator

Iteration order is **not sorted**.

Only

```java
peek()

poll()
```

guarantee priority order.

---

### Binary Heap

Internally,

PriorityQueue uses a **Binary Min Heap** by default.

---

# Frequently Asked Interview Questions

## Q1. Which interface does PriorityQueue implement?

```java
Queue
```

Indirectly,

```text
PriorityQueue

↓

Queue

↓

Collection

↓

Iterable
```

---

## Q2. Which data structure does PriorityQueue use internally?

```text
Binary Heap
```

(Default: Min Heap)

---

## Q3. Does PriorityQueue maintain insertion order?

No.

It maintains **priority order**.

---

## Q4. Which element is returned by peek()?

The element having the **highest priority**.

(Default: Smallest element)

---

## Q5. How can you create a Max Heap?

```java
PriorityQueue<Integer> queue =
        new PriorityQueue<>(Collections.reverseOrder());
```

---

## Q6. Are duplicate elements allowed?

Yes.

---

## Q7. Are null elements allowed?

No.

PriorityQueue throws

```text
NullPointerException
```

---

## Q8. Is PriorityQueue thread-safe?

No.

For thread-safe priority queues,

use

```java
PriorityBlockingQueue
```

---

## Q9. What is the time complexity of insertion?

```text
O(log n)
```

---

## Q10. What is the time complexity of removing the head element?

```text
O(log n)
```

---

## Q11. What is the time complexity of peek()?

```text
O(1)
```

---

## Q12. Why is iterator() not sorted?

Because it traverses the internal Binary Heap structure,

not the priority order.

---

# Summary

- `PriorityQueue` is the most commonly used implementation of the `Queue` interface.
- Internally uses a **Binary Min Heap**.
- Elements are ordered according to **priority**, not insertion order.
- Inherits methods from `Iterable`, `Collection`, and `Queue`.
- Provides multiple constructors for different initialization requirements.
- Introduces the `comparator()` method to access the ordering Comparator.
- Allows duplicate elements but **does not allow null elements**.
- Best suited for priority scheduling, task management, shortest path algorithms, event simulation, and job scheduling.