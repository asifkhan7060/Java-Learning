# Table of Contents

## Part 1 : Deque Interface

1. What is Deque?

2. Deque Hierarchy

3. Features of Deque

4. Types of Deque Implementations

    * ArrayDeque
    * LinkedList
    * LinkedBlockingDeque

5. Difference Between Deque Implementations

6. Methods Available in Deque Hierarchy

    * Collection Methods
    * Queue Methods
    * Deque Interface (Additional Methods)
    * BlockingDeque (Additional Methods)
    * Overall Deque Method Hierarchy
    * Important Notes

7. Detailed Deque Hierarchy Methods

### Queue Methods

1. add()
2. offer()
3. remove()
4. poll()
5. element()
6. peek()

### Deque Methods

7. addFirst()
8. addLast()
9. offerFirst()
10. offerLast()
11. removeFirst()
12. removeLast()
13. pollFirst()
14. pollLast()
15. getFirst()
16. getLast()
17. peekFirst()
18. peekLast()
19. push()
20. pop()
21. removeFirstOccurrence()
22. removeLastOccurrence()
23. descendingIterator()
24. reversed() *(Java 21+)*

### BlockingDeque Methods

25. putFirst()

26. putLast()

27. takeFirst()

28. takeLast()

29. offerFirst(E, long, TimeUnit)

30. offerLast(E, long, TimeUnit)

31. pollFirst(long, TimeUnit)

32. pollLast(long, TimeUnit)

33. Ways to Traverse a Deque

* Enhanced For Loop
* Iterator
* Descending Iterator
* Spliterator
* Stream API

9. Interview Questions

---

# Java Deque Interface

## What is Deque?

**Deque (Double Ended Queue)** is a child interface of the **Queue** interface.

It allows insertion, deletion, and retrieval of elements from **both the front and the rear** of the collection.

Unlike a normal Queue, which primarily follows **FIFO (First In, First Out)**, a Deque can behave as both:

* **Queue (FIFO)**
* **Stack (LIFO)**

This makes it one of the most flexible data structures in the Java Collection Framework.

```java
public interface Deque<E> extends Queue<E>
```

> **Note**
>
> The word **Deque** is pronounced as **"Deck"**, not "D-Queue".

---

# Deque Hierarchy

```text
Java Collection Framework

Iterable
    │
    ▼
Collection
    │
    ▼
Queue
    │
    ▼
Deque
│
├── ArrayDeque
│
├── LinkedList
│
└── BlockingDeque
    │
    └── LinkedBlockingDeque
```

---

# Features of Deque

* Supports insertion from both ends.
* Supports deletion from both ends.
* Can work as both a **Queue** and a **Stack**.
* Allows duplicate elements.
* Dynamic in size.
* Supports Generics.
* Does not support index-based access.
* Provides better performance than `Stack` for stack operations.
* Most implementations do not allow `null` elements.
* Suitable for both FIFO and LIFO processing.

---

# Types of Deque Implementations

## 1. ArrayDeque

### Description

* Uses a **Resizable Circular Array** internally.
* Very fast insertion and deletion.
* Better replacement for the legacy `Stack` class.
* Does not allow `null` elements.

### Example

```java
Deque<Integer> deque = new ArrayDeque<>();
```

---

## 2. LinkedList

### Description

* Uses a **Doubly Linked List** internally.
* Implements both **List** and **Deque** interfaces.
* Supports insertion and deletion from both ends.
* Allows `null` elements.

### Example

```java
Deque<Integer> deque = new LinkedList<>();
```

---

## 3. LinkedBlockingDeque

### Description

* Thread-safe implementation of Deque.
* Supports blocking operations.
* Allows insertion and removal from both ends.
* Mainly used in concurrent programming.

### Example

```java
BlockingDeque<Integer> deque =
        new LinkedBlockingDeque<>();
```

---

# Difference Between Deque Implementations

| Feature             | ArrayDeque     | LinkedList         | LinkedBlockingDeque |
| ------------------- | -------------- | ------------------ | ------------------- |
| Internal Structure  | Circular Array | Doubly Linked List | Doubly Linked List  |
| Thread Safe         | ❌              | ❌                  | ✅                   |
| Null Allowed        | ❌              | ✅                  | ❌                   |
| Blocking Operations | ❌              | ❌                  | ✅                   |
| Queue Operations    | ✅              | ✅                  | ✅                   |
| Stack Operations    | ✅              | ✅                  | ✅                   |
| Performance         | Excellent      | Good               | Good                |

---

# Methods Available in Deque Hierarchy

The **Deque** interface inherits all methods from **Collection** and **Queue**, then introduces **18 additional methods** for double-ended operations.

`BlockingDeque` further extends Deque by introducing blocking operations.

---

## Collection Methods

Inherited by all Deque implementations.

```java
addAll()

remove(Object)

removeAll()

removeIf()

retainAll()

contains()

containsAll()

size()

isEmpty()

clear()

iterator()

spliterator()

stream()

parallelStream()

toArray()

toArray(T[])

equals()

hashCode()
```

---

## Queue Methods

Inherited from Queue.

```java
add(E)

offer(E)

remove()

poll()

element()

peek()
```

---

## Additional Methods Introduced by Deque

```java
addFirst(E)
addLast(E)

offerFirst(E)
offerLast(E)

removeFirst()
removeLast()

pollFirst()
pollLast()

getFirst()
getLast()

peekFirst()
peekLast()

push(E)
pop()

removeFirstOccurrence(Object)
removeLastOccurrence(Object)

descendingIterator()

reversed()     // Java 21+
```

---

## Additional Methods Introduced by BlockingDeque

```java
putFirst(E)
putLast(E)

takeFirst()
takeLast()

offerFirst(E,long,TimeUnit)
offerLast(E,long,TimeUnit)

pollFirst(long,TimeUnit)
pollLast(long,TimeUnit)
```

---

# Overall Deque Method Hierarchy

```text
Collection Methods
        │
        ▼
Queue
├── add()
├── offer()
├── remove()
├── poll()
├── element()
└── peek()

        │
        ▼
Deque
├── addFirst()
├── addLast()
├── offerFirst()
├── offerLast()
├── removeFirst()
├── removeLast()
├── pollFirst()
├── pollLast()
├── getFirst()
├── getLast()
├── peekFirst()
├── peekLast()
├── push()
├── pop()
├── removeFirstOccurrence()
├── removeLastOccurrence()
├── descendingIterator()
└── reversed() (Java 21+)

        │
        ▼
BlockingDeque
├── putFirst()
├── putLast()
├── takeFirst()
├── takeLast()
├── offerFirst(timeout)
├── offerLast(timeout)
├── pollFirst(timeout)
└── pollLast(timeout)
```

---

# Important Notes

* A **Deque** can work as both a **Queue** and a **Stack**.
* `ArrayDeque` is generally preferred over the legacy `Stack` class.
* `LinkedList` implements both **List** and **Deque**.
* `LinkedBlockingDeque` is designed for concurrent applications.
* Most Deque implementations do **not** allow `null` values.
* `Deque` provides **18 additional methods**, making it much more powerful than a normal Queue.

---

# Detailed Deque Hierarchy Methods

The Deque hierarchy consists of three groups of methods:

* Queue Methods
* Deque Methods
* BlockingDeque Methods

Each method will be explained with:

* Purpose
* Syntax
* Parameters
* Return Value
* Example
* Output
* Important Notes

in the upcoming sections.

---

# Ways to Traverse a Deque

A Deque can be traversed using multiple techniques.

* Enhanced For Loop
* Iterator
* Descending Iterator
* Spliterator
* Stream API

Each traversal technique has its own advantages depending on the application.

---

# Interview Questions

* What is Deque?
* Which interface does Deque extend?
* Why is Deque called a Double Ended Queue?
* Can Deque work as both Queue and Stack?
* What is the difference between Queue and Deque?
* Which implementation is recommended instead of the Stack class?
* What is the difference between `addFirst()` and `offerFirst()`?
* What is the difference between `removeFirst()` and `pollFirst()`?
* Which Deque implementation is thread-safe?
* Which Deque implementation allows `null` values?

# Understanding Deque Internals

A **Deque (Double Ended Queue)** is an extension of the **Queue** interface that allows elements to be inserted, removed, and accessed from **both the front and the rear**.

Unlike a normal Queue, which mainly follows the **FIFO (First In, First Out)** principle, a Deque supports both:

* **FIFO (Queue Behavior)**
* **LIFO (Stack Behavior)**

This flexibility makes Deque one of the most versatile data structures in the Java Collection Framework.

---

# Why Do We Need Deque?

Consider a web browser.

Whenever you visit a webpage:

```text
Google
   ↓
YouTube
   ↓
GitHub
   ↓
ChatGPT
```

Now you press:

* **Back**
* **Back**
* **Forward**

A normal Queue cannot efficiently perform these operations because it supports only one direction of processing.

A Deque allows movement from **both ends**, making such operations efficient.

---

Another example is the **Undo / Redo** functionality in editors.

```text
Typing

A
B
C
D
```

Undo

```text
D
C
B
```

Redo

```text
B
C
D
```

Deque efficiently supports these operations by allowing insertion and deletion from both ends.

---

# Why Multiple Deque Implementations?

Different applications require different characteristics.

Some applications need:

* Fast in-memory operations
* Queue + List functionality
* Thread-safe operations
* Blocking operations

Therefore, Java provides multiple Deque implementations.

| Requirement                | Recommended Implementation |
| -------------------------- | -------------------------- |
| General Purpose Deque      | ArrayDeque                 |
| Queue + List Features      | LinkedList                 |
| Thread-safe Blocking Deque | LinkedBlockingDeque        |

---

# Internal Working Overview

Different implementations use different internal data structures.

```text
Deque
│
├── ArrayDeque
│      │
│      └── Resizable Circular Array
│
├── LinkedList
│      │
│      └── Doubly Linked List
│
└── LinkedBlockingDeque
       │
       └── Doubly Linked List
           + Locks
```

Each implementation is optimized for a specific use case.

---

# Core Deque Concepts

## 1. Double Ended Operations

Unlike Queue, Deque allows insertion and deletion from both ends.

```text
          Front
            │
            ▼

+-----+-----+-----+-----+
| 10  | 20  | 30  | 40  |
+-----+-----+-----+-----+

            ▲
            │
           Rear
```

Supported Operations

* Insert at Front
* Insert at Rear
* Remove from Front
* Remove from Rear

---

## 2. Queue Behavior (FIFO)

A Deque can behave exactly like a normal Queue.

Insertion

```text
10
20
30
40
```

Removal

```text
10
20
30
40
```

Methods Used

```java
offerLast()
pollFirst()
```

---

## 3. Stack Behavior (LIFO)

A Deque can also behave like a Stack.

Insertion

```text
10
20
30
40
```

Removal

```text
40
30
20
10
```

Methods Used

```java
push()
pop()
```

This is why **ArrayDeque** is recommended over the legacy `Stack` class.

---

## 4. Front and Rear Access

Unlike Queue, Deque allows viewing elements from both ends.

```text
Front

↓

10 → 20 → 30 → 40

                 ↑

               Rear
```

Methods

```java
peekFirst()
peekLast()
```

---

# Internal Data Structures

| Implementation      | Internal Data Structure    |
| ------------------- | -------------------------- |
| ArrayDeque          | Resizable Circular Array   |
| LinkedList          | Doubly Linked List         |
| LinkedBlockingDeque | Doubly Linked List + Locks |

---

# Performance Comparison

| Implementation      | Insert | Remove | Peek |
| ------------------- | :----: | :----: | :--: |
| ArrayDeque          |  O(1)  |  O(1)  | O(1) |
| LinkedList          |  O(1)  |  O(1)  | O(1) |
| LinkedBlockingDeque |  O(1)  |  O(1)  | O(1) |

> **Note**
>
> ArrayDeque usually performs better than LinkedList because it has lower memory overhead and better cache locality.

---

# Memory Comparison

| Implementation      | Memory Usage |
| ------------------- | ------------ |
| ArrayDeque          | ⭐ Lowest     |
| LinkedList          | ⭐⭐ Medium    |
| LinkedBlockingDeque | ⭐⭐⭐ High     |

---

# Decision Flow

```text
Need Thread Safety?

        │
      Yes
        ▼
LinkedBlockingDeque

        │
       No
        ▼
Need Queue + Stack Operations?

        │
      Yes
        ▼
ArrayDeque

        │
       No
        ▼
Need List Features Also?

        │
      Yes
        ▼
LinkedList
```

---

# When Should You Choose Which Deque?

### Use **ArrayDeque**

* General-purpose Deque
* Queue operations
* Stack operations
* BFS
* DFS
* Sliding Window Algorithms

---

### Use **LinkedList**

* Need both **List** and **Deque** functionality.
* Frequent insertions and deletions.
* Applications already using List features.

---

### Use **LinkedBlockingDeque**

* Producer–Consumer applications
* Thread-safe double-ended processing
* Concurrent task scheduling
* Work-stealing algorithms

---

# Summary

* **Deque** extends the Queue interface.
* Supports insertion and deletion from **both ends**.
* Can behave as both a **Queue** and a **Stack**.
* **ArrayDeque** is the preferred implementation for most Queue and Stack operations.
* **LinkedList** provides both List and Deque capabilities.
* **LinkedBlockingDeque** is designed for multithreaded applications.
* Selecting the right implementation depends on **performance**, **memory usage**, and **thread-safety requirements**.


# Practical Understanding of Deque

Understanding the methods of a **Deque** is only the first step. The real challenge is knowing **when to use a Deque**, **which implementation is suitable**, and **how it differs from a normal Queue or Stack**.

This section focuses on the practical usage of the Deque interface.

---

# Real-World Examples

## 1. Browser Back & Forward Navigation

A web browser maintains the browsing history.

```text
Google
 ↓
YouTube
 ↓
GitHub
 ↓
ChatGPT
```

Pressing **Back** removes pages from one end, while **Forward** restores pages from the other.

**Recommended Implementation**

```text
ArrayDeque
```

---

## 2. Undo / Redo Operations

Applications like VS Code, Photoshop and MS Word maintain Undo and Redo history.

Undo

```text
A
B
C
D
```

↓

```text
D
C
B
```

Redo

```text
B
C
D
```

**Recommended Implementation**

```text
ArrayDeque
```

---

## 3. Palindrome Checking

Characters are compared from both ends simultaneously.

Example

```text
MADAM
```

Compare

```text
M == M

A == A

D
```

**Recommended Implementation**

```text
ArrayDeque
```

---

## 4. Sliding Window Algorithms

Many DSA problems require removing elements from both ends.

Examples

* Sliding Window Maximum
* Sliding Window Minimum

**Recommended Implementation**

```text
ArrayDeque
```

---

## 5. BFS & DFS

A Deque can efficiently perform both:

* Queue Operations
* Stack Operations

**Recommended Implementation**

```text
ArrayDeque
```

---

## 6. Producer–Consumer System

Both front and rear operations are required in concurrent systems.

**Recommended Implementation**

```text
LinkedBlockingDeque
```

---

## 7. Task Scheduling

High-priority tasks can be inserted at the front while normal tasks are inserted at the rear.

**Recommended Implementation**

```text
LinkedBlockingDeque
```

---

# DSA Selection Guide

| Problem                     | Recommended Deque   |
| --------------------------- | ------------------- |
| Queue Operations            | ArrayDeque          |
| Stack Operations            | ArrayDeque          |
| Browser History             | ArrayDeque          |
| Undo / Redo                 | ArrayDeque          |
| Sliding Window              | ArrayDeque          |
| Palindrome Checking         | ArrayDeque          |
| Queue + List Features       | LinkedList          |
| Blocking Double Ended Queue | LinkedBlockingDeque |

---

# Common Mistakes

## ❌ Mistake 1

Using **LinkedList** when only Queue or Stack operations are required.

Wrong

```java
Deque<Integer> deque = new LinkedList<>();
```

Better

```java
Deque<Integer> deque = new ArrayDeque<>();
```

**Reason**

`ArrayDeque` is usually faster and consumes less memory.

---

## ❌ Mistake 2

Using the legacy `Stack` class.

Wrong

```java
Stack<Integer> stack = new Stack<>();
```

Better

```java
Deque<Integer> stack = new ArrayDeque<>();
```

---

## ❌ Mistake 3

Confusing Queue methods with Deque methods.

Queue

```java
offer()

poll()
```

Deque

```java
offerFirst()

offerLast()

pollFirst()

pollLast()
```

---

## ❌ Mistake 4

Adding `null` into `ArrayDeque`.

```java
Deque<Integer> deque =
        new ArrayDeque<>();

deque.add(null);
```

Result

```text
NullPointerException
```

---

## ❌ Mistake 5

Using `ArrayDeque` in multithreaded applications.

Wrong Choice

```text
ArrayDeque
```

Correct Choice

```text
LinkedBlockingDeque
```

---

# Best Practices

* ✅ Prefer **ArrayDeque** over the legacy **Stack** class.
* ✅ Prefer **ArrayDeque** over **LinkedList** when List functionality is not required.
* ✅ Use `offerFirst()` and `offerLast()` instead of `addFirst()` and `addLast()` when insertion may fail.
* ✅ Use `pollFirst()` and `pollLast()` instead of `removeFirst()` and `removeLast()` when the Deque may be empty.
* ✅ Use `peekFirst()` and `peekLast()` for safe retrieval.
* ✅ Use `LinkedBlockingDeque` only when thread safety is required.
* ✅ Avoid storing `null` values.

---

# Quick Revision Table

| Requirement       | Best Choice         |
| ----------------- | ------------------- |
| Queue             | ArrayDeque          |
| Stack             | ArrayDeque          |
| Browser History   | ArrayDeque          |
| Undo / Redo       | ArrayDeque          |
| Sliding Window    | ArrayDeque          |
| Queue + List      | LinkedList          |
| Thread-safe Deque | LinkedBlockingDeque |

---

# Which Deque Should I Choose?

```text
Need Thread Safety?

        │
      Yes
        ▼
LinkedBlockingDeque

        │
       No
        ▼
Need Queue + Stack?

        │
      Yes
        ▼
ArrayDeque

        │
       No
        ▼
Need List Features?

        │
      Yes
        ▼
LinkedList
```

---

# Advanced Interview Questions

### Q1. Why is `ArrayDeque` preferred over `Stack`?

Because `ArrayDeque` is faster, has lower memory overhead, and `Stack` is a legacy synchronized class.

---

### Q2. Why is `ArrayDeque` usually faster than `LinkedList`?

Because it uses a **Resizable Circular Array**, which provides better cache locality and lower memory overhead.

---

### Q3. Can Deque work as both Queue and Stack?

**Yes.**

Queue Operations

```java
offerLast()

pollFirst()
```

Stack Operations

```java
push()

pop()
```

---

### Q4. Which Deque implementation is thread-safe?

```text
LinkedBlockingDeque
```

---

### Q5. Does `ArrayDeque` allow `null`?

**No.**

Adding `null` results in a `NullPointerException`.

---

### Q6. Which implementation should be used for Sliding Window problems?

```text
ArrayDeque
```

---

### Q7. Which implementation also implements List?

```text
LinkedList
```

---

### Q8. Which implementation supports blocking operations?

```text
LinkedBlockingDeque
```

---

# One-Line Revision

* **Deque** → Double Ended Queue.
* **ArrayDeque** → Fast Queue + Stack implementation.
* **LinkedList** → List + Deque implementation.
* **LinkedBlockingDeque** → Thread-safe double-ended Queue.

---

# Key Takeaways

* Deque extends the **Queue** interface.
* Supports insertion and removal from **both ends**.
* Can behave as both a **Queue** and a **Stack**.
* `ArrayDeque` is the preferred implementation for most Queue and Stack operations.
* `LinkedList` is useful when both List and Deque functionality are required.
* `LinkedBlockingDeque` is designed for concurrent applications.
* Choosing the correct implementation improves performance and simplifies code.

---

# Final Summary

The **Deque** interface is one of the most flexible interfaces in the Java Collection Framework.

It combines the capabilities of both **Queue** and **Stack**, allowing efficient insertion and removal from both ends.

Choose the implementation according to your requirements:

* **ArrayDeque** → Fast general-purpose Queue and Stack.
* **LinkedList** → Combined List and Deque operations.
* **LinkedBlockingDeque** → Thread-safe double-ended operations.

Understanding the internal working, appropriate use cases, and implementation differences will help you write efficient and maintainable Java applications.
