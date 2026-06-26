# Table of Contents

## Part 1 : List Interface

1. What is List?

2. List Hierarchy

3. Features of List

4. Types of List Implementations

    * ArrayList
    * LinkedList
    * Vector
    * Stack

5. Difference Between List Implementations

6. Methods Available in List Hierarchy

    * Collection Methods
    * Additional Methods Provided by List
    * Additional Methods Provided by SequencedCollection (Java 21+)
    * Overall List Method Hierarchy
    * Important Notes

7. Detailed List Methods

    1. get()
    2. set()
    3. add(index, element)
    4. addAll(index, collection)
    5. remove(index)
    6. indexOf()
    7. lastIndexOf()
    8. listIterator()
    9. listIterator(index)
    10. subList()
    11. replaceAll()
    12. sort()

8. Ways to Traverse a List

    * Enhanced For Loop
    * Iterator
    * ListIterator
    * Spliterator
    * Stream

9. Interview Questions

---

## Part 2 : Understanding List Internals

1. Understanding List Internals

2. Why Do We Need List?

3. Why Multiple List Implementations?

4. Internal Working Overview

5. Dynamic Array

6. Doubly Linked List

7. Random Access

8. Sequential Access

9. Memory Layout

    * ArrayList
    * LinkedList

10. Performance Comparison

11. Memory Comparison

12. Decision Flow

13. When Should You Choose Which List?

* ArrayList
* LinkedList
* Vector
* Stack

14. Summary

---

## Part 3 : Practical Understanding of List

1. Practical Understanding of List

2. Real World Examples

    * Student Marks
    * Music Playlist
    * Browser History
    * Undo / Redo Operations
    * Thread-Safe Shared List
    * Shopping Cart

3. DSA Selection Guide

    * Random Access
    * Frequent Insertions and Deletions
    * LIFO Operations
    * Thread-Safe List
    * General Purpose List

4. Common Mistakes

5. Best Practices

6. Quick Revision Table

7. Which List Should I Choose?

8. Advanced Interview Questions

9. One-Line Revision

10. Key Takeaways

11. Final Summary

# Java List Interface

## What is List?

`List` is a child interface of the `Collection` interface.

It represents an **ordered collection** of elements where duplicate values are allowed and each element has an index.

```java
public interface List<E> extends Collection<E>
```

---

# List Hierarchy

```text
Iterable
    ↑
Collection
    ↑
   List
 ┌──┼─────┐
 ↓  ↓     ↓
ArrayList LinkedList Vector
                       ↑
                     Stack
```

---

# Features of List

- Ordered Collection
- Maintains Insertion Order
- Allows Duplicate Elements
- Allows Multiple Null Values
- Index Based Access
- Dynamic Size
- Supports Generics
- Can Traverse using Iterator, ListIterator and For-Each Loop

---

# Types of List Implementations

## 1. ArrayList

### Description

- Internally uses Dynamic Array
- Fast Random Access
- Slow Insertion/Deletion in Middle
- Most commonly used List implementation

### Example

```java
List<Integer> list = new ArrayList<>();
```

---

## 2. LinkedList

### Description

- Internally uses Doubly Linked List
- Fast Insertion and Deletion
- Slower Random Access
- Also implements Deque

### Example

```java
List<Integer> list = new LinkedList<>();
```

---

## 3. Vector

### Description

- Dynamic Array
- Thread Safe (Synchronized)
- Slower than ArrayList
- Legacy Class

### Example

```java
List<Integer> list = new Vector<>();
```

---

## 4. Stack

### Description

- Child class of Vector
- Follows LIFO (Last In First Out)
- Legacy Class

### Example

```java
Stack<Integer> stack = new Stack<>();
```

---

# Difference Between List Implementations

| Feature | ArrayList | LinkedList | Vector | Stack |
|----------|-----------|------------|--------|--------|
| Internal Structure | Dynamic Array | Doubly Linked List | Dynamic Array | Dynamic Array (Vector) |
| Duplicate Elements | ✅ | ✅ | ✅ | ✅ |
| Null Values | Multiple | Multiple | Multiple | Multiple |
| Insertion Order | ✅ | ✅ | ✅ | ✅ |
| Random Access | Fast | Slow | Fast | Fast |
| Thread Safe | ❌ | ❌ | ✅ | ✅ |
| Primary Use | General List | Frequent Insert/Delete | Thread-Safe List | LIFO Stack |
| Performance | Fast | Moderate | Slow | Slow |

---

# Methods Available in List Hierarchy

`List` extends the `Collection` interface.

Therefore, every `List` implementation first inherits all **Collection** methods and then provides additional **List-specific** methods.

Java 21 further extends ordered collections through the **SequencedCollection** interface.

---

## Collection Methods

Inherited by all List implementations.

```java
add()
addAll()

remove()
removeAll()
removeIf()

retainAll()

contains()
containsAll()

size()
isEmpty()

clear()

toArray()
toArray(T[])

stream()
parallelStream()

equals()
hashCode()
```

---

## Additional Methods Provided by List

These methods are available in every implementation of the `List` interface.

```java
get()

set()

add(index, element)

addAll(index, collection)

remove(index)

indexOf()

lastIndexOf()

listIterator()

listIterator(index)

subList()

replaceAll()

sort()
```

---

## Additional Methods Provided by SequencedCollection (Java 21+)

Implemented by:

- ArrayList
- LinkedList
- Vector
- Stack

### Methods

```java
addFirst(E e)

addLast(E e)

getFirst()

getLast()

removeFirst()

removeLast()

reversed()
```

### Purpose

- Insert element at the beginning.
- Insert element at the end.
- Access the first element.
- Access the last element.
- Remove the first element.
- Remove the last element.
- Obtain a reversed-order view of the List.

---

# Overall List Method Hierarchy

```text
Collection Methods
        │
        ▼
List
├── get()
├── set()
├── add(index)
├── addAll(index)
├── remove(index)
├── indexOf()
├── lastIndexOf()
├── listIterator()
├── listIterator(index)
├── subList()
├── replaceAll()
└── sort()

        │
        ▼
Java 21+ SequencedCollection
├── addFirst()
├── addLast()
├── getFirst()
├── getLast()
├── removeFirst()
├── removeLast()
└── reversed()
```

---

## Important Notes

- `Collection` provides common collection operations.
- `List` adds **index-based operations**.
- `SequencedCollection` (Java 21+) adds operations for accessing and modifying the **first** and **last** elements.
- `ArrayList`, `LinkedList`, `Vector`, and `Stack` support the complete List hierarchy according to their Java version.

# Detailed List Methods

The following methods are introduced by the **List** interface.

Unlike `Collection`, these methods provide **index-based access** and **position-specific operations**.

---

## 1. get()

Returns the element at a specific index.

### Syntax

```java
E get(int index)
```

### Example

```java
list.get(0);
```

---

## 2. set()

Replaces the element at the specified index.

### Syntax

```java
E set(int index, E element)
```

### Example

```java
list.set(1, 50);
```

---

## 3. add(index, element)

Inserts an element at the specified index.

### Syntax

```java
void add(int index, E element)
```

### Example

```java
list.add(1, 100);
```

---

## 4. addAll(index, collection)

Inserts all elements from another collection at the specified index.

### Syntax

```java
boolean addAll(int index, Collection<? extends E> c)
```

### Example

```java
list.addAll(2, anotherList);
```

---

## 5. remove(index)

Removes the element at the specified index.

### Syntax

```java
E remove(int index)
```

### Example

```java
list.remove(2);
```

---

## 6. indexOf()

Returns the index of the first occurrence of an element.

### Syntax

```java
int indexOf(Object o)
```

### Example

```java
list.indexOf(20);
```

---

## 7. lastIndexOf()

Returns the index of the last occurrence of an element.

### Syntax

```java
int lastIndexOf(Object o)
```

### Example

```java
list.lastIndexOf(20);
```

---

## 8. listIterator()

Returns a `ListIterator`.

### Syntax

```java
ListIterator<E> listIterator()
```

### Example

```java
ListIterator<Integer> iterator = list.listIterator();
```

---

## 9. listIterator(index)

Returns a `ListIterator` starting from the specified index.

### Syntax

```java
ListIterator<E> listIterator(int index)
```

### Example

```java
ListIterator<Integer> iterator =
        list.listIterator(2);
```

---

## 10. subList()

Returns a portion of the List.

### Syntax

```java
List<E> subList(int fromIndex,
                int toIndex)
```

### Example

```java
List<Integer> sub =
        list.subList(1, 4);
```

---

## 11. replaceAll()

Replaces every element using the specified function.

### Syntax

```java
void replaceAll(UnaryOperator<E> operator)
```

### Example

```java
list.replaceAll(n -> n * 2);
```

---

## 12. sort()

Sorts the List using the specified Comparator.

### Syntax

```java
void sort(Comparator<? super E> c)
```

### Example

```java
list.sort(Integer::compareTo);
```

---

# Ways to Traverse a List

## 1. Enhanced For Loop

```java
for(Integer value : list)
{
    System.out.println(value);
}
```

---

## 2. Iterator

```java
Iterator<Integer> iterator =
        list.iterator();

while(iterator.hasNext())
{
    System.out.println(iterator.next());
}
```

---

## 3. ListIterator

```java
ListIterator<Integer> iterator =
        list.listIterator();

while(iterator.hasNext())
{
    System.out.println(iterator.next());
}
```

---

## 4. Spliterator

```java
Spliterator<Integer> spliterator =
        list.spliterator();

spliterator.forEachRemaining(
        System.out::println);
```

---

## 5. Stream

```java
list.stream()
    .forEach(System.out::println);
```

---

# Interview Questions

### Q1. What is List?

An ordered collection that allows duplicate elements and supports index-based access.

---

### Q2. Which interface does List extend?

```java
Collection
```

---

### Q3. Does List allow duplicate elements?

Yes.

---

### Q4. Does List maintain insertion order?

Yes.

---

### Q5. Can List store null values?

Yes.

Most implementations such as `ArrayList`, `LinkedList`, `Vector`, and `Stack` allow multiple `null` values.

---

### Q6. Which List implementation is most commonly used?

```java
ArrayList
```

---

### Q7. Which List implementation is thread-safe?

```java
Vector
```

(Stack is also thread-safe because it extends `Vector`.)

---

### Q8. Which List implementation is best for frequent insertions and deletions?

```java
LinkedList
```

---

### Q9. Which methods are exclusive to List?

```java
get()

set()

add(index, element)

addAll(index, collection)

remove(index)

indexOf()

lastIndexOf()

listIterator()

listIterator(index)

subList()

replaceAll()

sort()
```

---

### Q10. Why use List instead of Collection?

Because `List` provides:

- Ordered elements
- Index-based access
- Position-specific insertion
- Position-specific deletion
- Searching by index
- Bidirectional traversal using `ListIterator`

# Understanding List Internals

Unlike `Set`, which focuses on storing **unique elements**, a `List` is designed to store elements in a **specific order** while allowing **duplicates** and **index-based access**.

Different `List` implementations use different internal data structures to achieve this.

---

# Why Do We Need List?

Suppose we are storing marks obtained by students.

Using a normal array

```text
90
85
78
92
88
```

Problems

- Fixed Size
- Difficult to insert elements
- Difficult to remove elements

Using a List

```text
90
85
78
92
88
```

Advantages

- Dynamic Size
- Easy insertion
- Easy deletion
- Supports duplicate values
- Index-based access

---

# Why Multiple List Implementations?

Every application has different requirements.

Sometimes we need

- Fast Random Access
- Fast Insertion
- Thread Safety
- LIFO Operations

Therefore Java provides different implementations.

| Requirement | Best Choice |
|-------------|-------------|
| Fast Random Access | ArrayList |
| Frequent Insert/Delete | LinkedList |
| Thread Safe List | Vector |
| Stack Operations | Stack |

---

# Internal Working Overview

Different implementations use different data structures.

```text
ArrayList
     │
     ▼
Dynamic Array


LinkedList
     │
     ▼
Doubly Linked List


Vector
     │
     ▼
Dynamic Array
(Synchronized)


Stack
     │
     ▼
Dynamic Array
(Vector)
```

---

# Dynamic Array

Used by

- ArrayList
- Vector
- Stack

Initially

```text
Capacity = 10
```

```text
+----+----+----+----+----+----+----+----+----+----+
| 10 | 20 | 30 |    |    |    |    |    |    |    |
+----+----+----+----+----+----+----+----+----+----+
```

When capacity becomes full,

Java creates a larger array.

```text
Old Array

↓

New Larger Array

↓

Copy Elements

↓

Old Array Removed
```

This resizing is automatic.

---

# Doubly Linked List

Used by

- LinkedList

Representation

```text
NULL
 ↑
 │
10 ⇄ 20 ⇄ 30 ⇄ 40
                 │
                NULL
```

Each node stores

- Previous Address
- Data
- Next Address

Advantages

- Fast insertion
- Fast deletion

Disadvantage

- Slow random access

---

# Random Access

Random Access means directly accessing an element using its index.

Example

```java
list.get(5);
```

Performance

| Implementation | Complexity |
|----------------|------------|
| ArrayList | O(1) |
| LinkedList | O(n) |
| Vector | O(1) |
| Stack | O(1) |

---

# Sequential Access

Sequential Access means traversing elements one by one.

Example

```text
10

↓

20

↓

30

↓

40
```

Best Implementation

```text
LinkedList
```

---

# Memory Layout

## ArrayList

```text
+----+----+----+----+
| 10 | 20 | 30 | 40 |
+----+----+----+----+
```

Continuous Memory

---

## LinkedList

```text
+----+      +----+      +----+
| 10 | ---> | 20 | ---> | 30 |
+----+      +----+      +----+
```

Scattered Memory

---

# Performance Comparison

| Operation | ArrayList | LinkedList | Vector | Stack |
|------------|-----------|------------|--------|--------|
| add() | O(1)* | O(1) | O(1)* | O(1)* |
| get() | O(1) | O(n) | O(1) | O(1) |
| remove() | O(n) | O(1)* | O(n) | O(1)* (Top) |
| search() | O(n) | O(n) | O(n) | O(n) |

\* Average Case / Amortized

---

# Memory Comparison

| Implementation | Memory Usage |
|----------------|--------------|
| ArrayList | Low |
| LinkedList | High |
| Vector | Low |
| Stack | Low |

---

# Decision Flow

```text
Need Fast Random Access?

        │
       Yes
        │
        ▼
    ArrayList


Need Frequent Insert/Delete?

        │
       Yes
        │
        ▼
   LinkedList


Need Thread Safety?

        │
       Yes
        │
        ▼
      Vector


Need LIFO Operations?

        │
       Yes
        │
        ▼
      Stack
```

---

# When Should You Choose Which List?

### Use ArrayList

- Fast random access
- General-purpose applications
- Most commonly used List

---

### Use LinkedList

- Frequent insertions
- Frequent deletions
- Queue and Deque operations

---

### Use Vector

- Thread-safe applications
- Legacy systems

---

### Use Stack

- Undo/Redo
- Browser Back Button
- Function Call Stack
- Expression Evaluation
- LIFO operations

---

# Summary

- `ArrayList` uses a Dynamic Array.
- `LinkedList` uses a Doubly Linked List.
- `Vector` is a synchronized Dynamic Array.
- `Stack` extends `Vector` and follows the **LIFO** principle.
- Choose the implementation based on your application's requirements.

# Practical Understanding of List

Understanding the internal working of a `List` is important, but choosing the correct implementation for a real-world problem is equally important.

This section focuses on practical usage, common mistakes, best practices, and interview-oriented concepts.

---

# Real World Examples

## 1. Student Marks

Marks should be stored in the order they were entered.

Duplicate marks are allowed.

Recommended

```text
ArrayList
```

---

## 2. Music Playlist

Songs should play in the same order they were added.

Duplicate songs may exist.

Recommended

```text
ArrayList
```

---

## 3. Browser History

Need to move backward and forward efficiently.

Recommended

```text
LinkedList
```

---

## 4. Undo / Redo Operations

The last performed operation should be removed first.

Recommended

```text
Stack
```

---

## 5. Thread-Safe Shared List

Multiple threads need to access the same list safely.

Recommended

```text
Vector
```

---

## 6. Shopping Cart

Products should remain in insertion order.

Duplicate products should be allowed.

Recommended

```text
ArrayList
```

---

# DSA Selection Guide

## Random Access

Need to retrieve

```java
list.get(index);
```

Recommended

```text
ArrayList
```

Time Complexity

```text
O(1)
```

---

## Frequent Insertions and Deletions

Need to insert or delete elements frequently.

Recommended

```text
LinkedList
```

---

## LIFO Operations

Need operations like

```text
Push

Pop

Peek
```

Recommended

```text
Stack
```

---

## Thread-Safe List

Need synchronization.

Recommended

```text
Vector
```

---

## General Purpose List

Most Java applications use

```text
ArrayList
```

because it provides excellent overall performance.

---

# Common Mistakes

## Mistake 1

Using `LinkedList` when random access is required.

Wrong

```java
linkedList.get(5000);
```

Performance

```text
O(n)
```

Better Choice

```text
ArrayList
```

---

## Mistake 2

Using `ArrayList` for frequent middle insertions.

Every insertion shifts remaining elements.

Performance becomes poor.

Better Choice

```text
LinkedList
```

---

## Mistake 3

Using `Vector` unnecessarily.

`Vector` is synchronized.

Synchronization adds extra overhead.

Better Choice

```text
ArrayList
```

unless thread safety is required.

---

## Mistake 4

Using `Stack` like a normal List.

Wrong

```java
stack.add(10);

stack.add(20);
```

Preferred

```java
stack.push(10);

stack.push(20);
```

Use stack operations for stack behavior.

---

## Mistake 5

Accessing LinkedList using indexes repeatedly.

Wrong

```java
for(int i = 0; i < list.size(); i++)
{
    list.get(i);
}
```

Better

```java
for(Integer value : list)
{
    System.out.println(value);
}
```

or

```java
Iterator<Integer> iterator =
        list.iterator();
```

---

# Best Practices

- Use **ArrayList** for general-purpose programming.
- Use **LinkedList** when insertion and deletion are frequent.
- Use **Vector** only when synchronization is required.
- Use **Stack** only for LIFO operations.
- Prefer **Iterator** or **Enhanced For Loop** when traversing a `LinkedList`.
- Avoid unnecessary index-based operations on a `LinkedList`.

---

# Quick Revision Table

| Feature | ArrayList | LinkedList | Vector | Stack |
|----------|-----------|------------|--------|--------|
| Internal Structure | Dynamic Array | Doubly Linked List | Dynamic Array | Dynamic Array (Vector) |
| Duplicate Elements | ✅ | ✅ | ✅ | ✅ |
| Null Values | Multiple | Multiple | Multiple | Multiple |
| Insertion Order | ✅ | ✅ | ✅ | ✅ |
| Random Access | ⭐⭐⭐ | ⭐ | ⭐⭐⭐ | ⭐⭐⭐ |
| Insert/Delete | ⭐ | ⭐⭐⭐ | ⭐ | ⭐⭐ |
| Thread Safe | ❌ | ❌ | ✅ | ✅ |
| LIFO Support | ❌ | ❌ | ❌ | ✅ |
| Performance | Fast | Moderate | Slow | Moderate |

---

# Which List Should I Choose?

```text
Need Fast Random Access?

        │
       Yes
        ▼
   ArrayList


Need Frequent Insert/Delete?

        │
       Yes
        ▼
   LinkedList


Need Thread Safety?

        │
       Yes
        ▼
      Vector


Need LIFO Operations?

        │
       Yes
        ▼
      Stack
```

---

# Advanced Interview Questions

### Q1. Why is ArrayList faster than LinkedList for random access?

Because `ArrayList` stores elements in a contiguous dynamic array, allowing direct index access.

---

### Q2. Why is LinkedList faster for insertion and deletion?

Because it only updates node references instead of shifting elements.

---

### Q3. Why is Vector slower than ArrayList?

Because every public method in `Vector` is synchronized.

---

### Q4. Why is Stack considered a legacy class?

Because modern Java recommends using `Deque` (`ArrayDeque`) for stack operations.

---

### Q5. Which List implementation is used most frequently?

```java
ArrayList
```

---

### Q6. Which List implementation should be used for Queue or Deque operations?

```java
LinkedList
```

because it also implements the `Deque` interface.

---

### Q7. Which List implementation is best for multithreading?

```java
Vector
```

because it is synchronized.

---

### Q8. Why does Stack extend Vector?

To reuse Vector's dynamic array implementation and synchronization while adding LIFO operations (`push()`, `pop()`, `peek()`, etc.).

---

### Q9. Which implementation provides the best overall performance?

```java
ArrayList
```

for most applications.

---

### Q10. Can all List implementations store duplicate elements?

Yes.

Every implementation of the `List` interface allows duplicate elements.

---

# One-Line Revision

- **ArrayList** → Fast random access using a Dynamic Array.
- **LinkedList** → Fast insertion and deletion using a Doubly Linked List.
- **Vector** → Thread-safe Dynamic Array.
- **Stack** → LIFO implementation built on Vector.

---

# Key Takeaways

- `List` maintains insertion order.
- Duplicate elements are allowed.
- `ArrayList` is the preferred general-purpose implementation.
- `LinkedList` is ideal for frequent insertions and deletions.
- `Vector` is synchronized and thread-safe.
- `Stack` extends `Vector` and supports LIFO operations.

---

# Final Summary

A `List` is designed to store ordered collections while allowing duplicate elements and index-based access.

Choose the implementation based on your requirements:

- **ArrayList** → Best overall performance.
- **LinkedList** → Frequent insertions and deletions.
- **Vector** → Thread-safe applications.
- **Stack** → LIFO operations.

Understanding the strengths and limitations of each implementation helps you select the most appropriate `List` for your application.