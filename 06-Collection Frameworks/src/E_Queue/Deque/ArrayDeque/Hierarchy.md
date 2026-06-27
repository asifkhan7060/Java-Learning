# ArrayDeque Method Hierarchy

## Overview

`ArrayDeque` is the most commonly used implementation of the `Deque` interface in the Java Collection Framework.

Unlike `LinkedList`, `ArrayDeque` internally stores elements using a **Resizable Circular Array**, making it faster for insertion and deletion operations at both ends.

It can be used as both:

- Queue (FIFO)
- Stack (LIFO)

It provides:

- Fast Insertion at Front
- Fast Insertion at Rear
- Fast Deletion at Front
- Fast Deletion at Rear
- Dynamic Resizing
- No Null Elements
- Better Performance than Stack and LinkedList (for Deque operations)

Since `ArrayDeque` implements the `Deque` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`
- `Deque`

Additionally, `ArrayDeque` provides its own constructors.

---

# Class Declaration

```java
public class ArrayDeque<E>
        extends AbstractCollection<E>
        implements Deque<E>,
                   Cloneable,
                   Serializable
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
AbstractCollection
    ↑
ArrayDeque
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
Deque
     ↑
ArrayDeque
```

---

# Complete ArrayDeque Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
ArrayDeque<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ ArrayDeque()
├── ✅ ArrayDeque(int numElements)
└── ✅ ArrayDeque(Collection<? extends E> c)

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
│ ArrayDeque Specific Public Methods
├──────────────────────────────────────────────
│
├── ✅ clone()
└── 🆕 capacity() *(Not Supported)*

│
├──────────────────────────────────────────────
│ Protected / Internal Methods
├──────────────────────────────────────────────
│
├── 🔒 grow()
├── 🔒 copyElements()
├── 🔒 delete()
└── 🔒 circularIndex()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ addFirst()
├── ✅ addLast()
├── ✅ pollFirst()
├── ✅ pollLast()
├── ✅ iterator()
├── ✅ descendingIterator()
├── ✅ spliterator()
└── ✅ clone()

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

The methods available in an `ArrayDeque` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `ArrayDeque` class.

They are used to create `ArrayDeque` objects and are **not inherited**.

```java
ArrayDeque()

ArrayDeque(int numElements)

ArrayDeque(Collection<? extends E> c)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `ArrayDeque` object can use the methods defined in the `Iterable` interface.

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

every `ArrayDeque` also inherits all `Collection` methods.

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

The `Deque` interface extends Queue and supports insertion and removal from **both ends**.

Examples include:

- addFirst()
- addLast()
- pollFirst()
- pollLast()
- push()
- pop()
- descendingIterator()

These methods allow `ArrayDeque` to behave as both a Queue and a Stack.

---

## 6. ArrayDeque Specific Methods

These methods belong only to the `ArrayDeque` class.

Examples:

- clone()

It creates a **shallow copy** of the current ArrayDeque.

Unlike `PriorityQueue`, `ArrayDeque` supports cloning.

---

## 7. Optimized Overrides

Some methods are inherited from parent interfaces but are reimplemented inside `ArrayDeque` for better performance using a **Resizable Circular Array**.

Examples:

- addFirst()
- addLast()
- pollFirst()
- pollLast()
- iterator()
- descendingIterator()
- spliterator()
- clone()

---

## 8. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, an `ArrayDeque` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.


# Part 2 : ArrayDeque Specific Methods

---

## 1. ArrayDeque()

Creates an empty `ArrayDeque`.

### Syntax

```java
ArrayDeque<E> deque = new ArrayDeque<>();
```

### Example

```java
ArrayDeque<Integer> deque =
        new ArrayDeque<>();
```

### Purpose

- Creates an empty ArrayDeque.
- Most commonly used constructor.
- Automatically grows when required.

### Note

Internally,

ArrayDeque uses a **Resizable Circular Array**.

---

## 2. ArrayDeque(int numElements)

Creates an empty `ArrayDeque` with enough initial capacity to hold the specified number of elements.

### Syntax

```java
ArrayDeque<E> deque =
        new ArrayDeque<>(numElements);
```

### Example

```java
ArrayDeque<Integer> deque =
        new ArrayDeque<>(100);
```

### Purpose

Useful when the approximate number of elements is already known.

Reduces internal resizing and improves performance.

### Example

```text
Initial Capacity

↓

100 Elements
```

### Note

The value specifies the **initial capacity**, not the current size.

---

## 3. ArrayDeque(Collection<? extends E> c)

Creates an `ArrayDeque` containing all elements from another Collection.

### Syntax

```java
ArrayDeque<E> deque =
        new ArrayDeque<>(collection);
```

### Example

```java
List<Integer> list =
        List.of(10,20,30);

ArrayDeque<Integer> deque =
        new ArrayDeque<>(list);
```

### Purpose

Copies all elements from another Collection.

Useful for converting existing collections into an ArrayDeque.

### Note

The insertion order of the Collection is preserved.

---

# ArrayDeque Specific Methods

Unlike Collection, Queue and Deque methods,

the following methods belong only to the `ArrayDeque` class.

---

## 1. clone()

Creates a **shallow copy** of the current ArrayDeque.

### Syntax

```java
Object clone()
```

### Example

```java
ArrayDeque<String> deque =
        new ArrayDeque<>();

deque.add("Java");
deque.add("Python");

ArrayDeque<String> copy =
        (ArrayDeque<String>) deque.clone();
```

### Purpose

Creates another ArrayDeque containing the same elements.

### Note

`clone()` returns an **Object**.

Therefore,

type casting is required.

```java
(ArrayDeque<String>) deque.clone();
```

---

### Shallow Copy

`clone()` performs a **Shallow Copy**.

The ArrayDeque object is copied,

but the objects stored inside it are **not cloned**.

Example

```text
Original Deque

↓

Java

Python

↓

Clone Deque

↓

Java

Python
```

Both collections reference the same objects.

---

# Internal Methods

The following methods exist inside the JDK implementation.

They are **not accessible** directly.

---

## 1. grow()

Increases the size of the internal circular array when it becomes full.

---

## 2. copyElements()

Copies elements into a new array during resizing.

---

## 3. delete()

Removes an element while maintaining the circular array structure.

---

## 4. circularIndex()

Calculates the next valid index in the circular array.

Used internally for efficient insertion and deletion.

---

# Optimized Overrides

The following methods are inherited,

but `ArrayDeque` provides optimized implementations using a **Resizable Circular Array**.

```java
addFirst()

addLast()

pollFirst()

pollLast()

iterator()

descendingIterator()

spliterator()

clone()
```

These methods provide constant-time performance for insertion and deletion at both ends.

---

# Methods Not Covered Yet

The following methods exist in Java,

but are not covered in this project.

```java
removeIf(Predicate<? super E> filter)

toArray(IntFunction<T[]> generator)

reversed()      // Java 21+
```

These methods will be covered in advanced Collection Framework topics.

---

# Important Notes

- Constructors are **not inherited**.
- ArrayDeque internally uses a **Resizable Circular Array**.
- It can be used as both a **Queue (FIFO)** and a **Stack (LIFO)**.
- `clone()` creates a **Shallow Copy**, not a Deep Copy.
- Null elements are **not allowed**.
- ArrayDeque generally performs better than `LinkedList` for Deque operations.
- The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `Deque`, or `ArrayDeque`), even when the object is an `ArrayDeque`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| ArrayDeque() | O(1) | O(1) |
| ArrayDeque(int numElements) | O(1) | O(n) *(allocates capacity)* |
| ArrayDeque(Collection<? extends E>) | O(n) | O(n) |

---

## ArrayDeque Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| clone() | O(n) | O(n) |

---

# When Should You Use These Methods?

## ArrayDeque()

Use when:

- Number of elements is unknown.
- Most commonly used constructor.

Example

```java
ArrayDeque<Integer> deque =
        new ArrayDeque<>();
```

---

## ArrayDeque(int numElements)

Use when:

- Approximate number of elements is already known.
- Want to reduce internal resizing.

Example

```java
ArrayDeque<String> history =
        new ArrayDeque<>(5000);
```

---

## ArrayDeque(Collection)

Use when:

- Converting another Collection into an ArrayDeque.
- Copying all elements into a new ArrayDeque.

Example

```java
List<Integer> list =
        List.of(10,20,30);

ArrayDeque<Integer> deque =
        new ArrayDeque<>(list);
```

---

## clone()

Use when:

- Need another ArrayDeque containing the same elements.
- A shallow copy is sufficient.

---

# Circular Array

Unlike `LinkedList`, `ArrayDeque` uses a **Resizable Circular Array** internally.

Example

```text
        Front
          │
          ▼

+----+----+----+----+----+----+
| 40 | 50 |    |    | 10 | 20 |
+----+----+----+----+----+----+
                        ▲
                        │
                      Rear
```

When either end reaches the array boundary,

it wraps around to the opposite side.

This is why it is called a **Circular Array**.

---

# Queue vs Stack

One of the biggest advantages of `ArrayDeque` is that it supports both Queue and Stack operations.

## Queue (FIFO)

```java
deque.offerLast(10);
deque.offerLast(20);

deque.pollFirst();
```

```text
10

↓

20
```

---

## Stack (LIFO)

```java
deque.push(10);
deque.push(20);

deque.pop();
```

```text
20

↓

10
```

---

# ArrayDeque vs Stack

| Feature | ArrayDeque | Stack |
|----------|-----------:|------:|
| Performance | Faster | Slower |
| Synchronization | No | Yes |
| Recommended | ✅ | ❌ |
| LIFO Support | ✅ | ✅ |

---

# ArrayDeque vs LinkedList

| Feature | ArrayDeque | LinkedList |
|----------|-----------:|-----------:|
| Internal Structure | Circular Array | Doubly Linked List |
| Memory Usage | Lower | Higher |
| Cache Locality | Better | Poor |
| Front/Rear Operations | O(1) | O(1) |
| Null Elements | ❌ | ✅ |
| Recommended for Deque | ✅ | ⚪ |

---

# Important Notes

### Queue

ArrayDeque can behave like a Queue.

```java
offer()

poll()

peek()
```

---

### Stack

ArrayDeque can also behave like a Stack.

```java
push()

pop()

peek()
```

---

### Null Values

ArrayDeque does **not** allow null elements.

```java
deque.add(null);
```

Throws

```text
NullPointerException
```

---

### Random Access

ArrayDeque does **not** support index-based access.

Unlike `ArrayList`,

there are no methods like

```java
get(index)

set(index)
```

---

### Thread Safety

ArrayDeque is **not thread-safe**.

For concurrent applications,

use

```java
LinkedBlockingDeque
```

---

# Frequently Asked Interview Questions

## Q1. Which interface does ArrayDeque implement?

```java
Deque
```

Indirectly,

```text
ArrayDeque

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

## Q2. Which data structure does ArrayDeque use internally?

```text
Resizable Circular Array
```

---

## Q3. Can ArrayDeque be used as both Queue and Stack?

Yes.

Queue

```text
FIFO
```

Stack

```text
LIFO
```

---

## Q4. Does ArrayDeque allow duplicate elements?

Yes.

---

## Q5. Does ArrayDeque allow null elements?

No.

It throws

```text
NullPointerException
```

---

## Q6. Which is faster for Stack operations?

```text
ArrayDeque
```

It is recommended instead of the legacy `Stack` class.

---

## Q7. Which is faster for Deque operations?

```text
ArrayDeque
```

Generally performs better than `LinkedList`.

---

## Q8. Is ArrayDeque synchronized?

No.

For thread-safe deque operations,

use

```java
LinkedBlockingDeque
```

---

## Q9. Does ArrayDeque support random access?

No.

It does not provide index-based operations.

---

## Q10. Which method creates a shallow copy?

```java
clone()
```

---

## Q11. Why is ArrayDeque preferred over Stack?

Because:

- Better performance
- No synchronization overhead
- Recommended by the Java documentation

---

## Q12. What is the time complexity of insertion and deletion at both ends?

```text
O(1)
```

(Amortized)

---

# Summary

- `ArrayDeque` is the most commonly used implementation of the `Deque` interface.
- Internally uses a **Resizable Circular Array**.
- Can be used as both a **Queue (FIFO)** and a **Stack (LIFO)**.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `Deque`.
- Provides three constructors for different initialization requirements.
- Introduces the `clone()` method for creating a **Shallow Copy**.
- Allows duplicate elements but **does not allow null elements**.
- Generally performs better than `LinkedList` and the legacy `Stack` class for Deque operations.
- Best suited for Queue, Stack, Sliding Window, BFS, DFS, and other double-ended data structure applications.

