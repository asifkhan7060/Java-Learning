# Table of Contents

## Part 1 : Set Interface

1. What is Set?

2. Set Hierarchy

3. Features of Set

4. Types of Set Implementations

    * HashSet
    * LinkedHashSet
    * TreeSet

5. Difference Between Set Implementations

6. Methods Available in Set Hierarchy

    * Collection Methods
    * Set Interface (No New Methods)
    * Additional Methods Provided by SortedSet
    * Additional Methods Provided by NavigableSet
    * Additional Methods Provided by SequencedSet (Java 21+)
    * Overall Set Method Hierarchy
    * Important Notes

7. Detailed Set Hierarchy Methods

   **SortedSet Methods**

    1. first()
    2. last()
    3. headSet()
    4. tailSet()
    5. subSet()
    6. comparator()

   **NavigableSet Methods**
    7. lower()
    8. floor()
    9. ceiling()
    10. higher()
    11. pollFirst()
    12. pollLast()
    13. descendingSet()
    14. descendingIterator()
    15. subSet(..., boolean, ..., boolean)
    16. headSet(..., boolean)
    17. tailSet(..., boolean)

   **SequencedSet Methods (Java 21+)**
    18. addFirst()
    19. addLast()
    20. getFirst()
    21. getLast()
    22. removeFirst()
    23. removeLast()
    24. reversed()

8. Ways to Traverse a Set

    * Enhanced For Loop
    * Iterator
    * Spliterator
    * Stream

9. Interview Questions

---

## Part 2 : Understanding Set Internals

1. Understanding Set Internals

2. Why Do We Need Set?

3. Why Multiple Set Implementations?

4. Internal Working Overview

5. Hashing Basics

6. hashCode()

7. Bucket Concept

8. equals()

9. Collision

10. Ordering in Set

* HashSet
* LinkedHashSet
* TreeSet

11. Internal Data Structures

* HashSet
* LinkedHashSet
* TreeSet

12. Performance Comparison

13. Memory Comparison

14. Decision Flow

15. When Should You Choose Which Set?

* HashSet
* LinkedHashSet
* TreeSet

16. Summary

---

## Part 3 : Practical Understanding of Set

1. Practical Understanding of Set

2. Real World Examples

    * Student Roll Numbers
    * Registered Email IDs
    * Browser History
    * Dictionary
    * Leaderboard
    * Unique Tags

3. DSA Selection Guide

    * Duplicate Removal
    * Membership Checking
    * Sorted Data
    * Range Queries
    * Maintain Insertion Order

4. Common Mistakes

5. Best Practices

6. Quick Revision Table

7. Which Set Should I Choose?

8. Advanced Interview Questions

9. One-Line Revision

10. Key Takeaways

11. Final Summary


# Java Set Interface

## What is Set?

`Set` is a child interface of the `Collection` interface.

It represents a collection of **unique elements**, meaning duplicate values are **not allowed**.

Unlike `List`, a `Set` does **not provide index-based access**.

The ordering of elements depends on the implementation used.

```java
public interface Set<E> extends Collection<E>
```

---

# Set Hierarchy

```text
Iterable
    ↑
Collection
    ↑
    Set
 ┌────┼─────────────┐
 ↓    ↓             ↓
HashSet LinkedHashSet TreeSet
```

---

# Features of Set

* Stores Unique Elements
* Duplicate Elements are Not Allowed
* No Index-Based Access
* Dynamic Size
* Supports Generics
* Fast Search Operations
* Traversal using Iterator, Spliterator and For-Each Loop
* Ordering depends on the implementation
* Null handling depends on the implementation

---

# Types of Set Implementations

## 1. HashSet

### Description

* Internally uses a Hash Table
* Does NOT maintain insertion order
* Allows one null element
* Fastest general-purpose Set implementation

### Example

```java
Set<Integer> set = new HashSet<>();
```

---

## 2. LinkedHashSet

### Description

* Internally uses Hash Table + Linked List
* Maintains insertion order
* Allows one null element
* Slightly slower than HashSet

### Example

```java
Set<Integer> set = new LinkedHashSet<>();
```

---

## 3. TreeSet

### Description

* Internally uses a Red-Black Tree
* Maintains sorted order
* Does NOT allow null elements
* Implements SortedSet and NavigableSet

### Example

```java
Set<Integer> set = new TreeSet<>();
```

---

# Difference Between Set Implementations

| Feature            | HashSet    | LinkedHashSet            | TreeSet        |
| ------------------ | ---------- | ------------------------ | -------------- |
| Internal Structure | Hash Table | Hash Table + Linked List | Red-Black Tree |
| Duplicate Elements | ❌          | ❌                        | ❌              |
| Insertion Order    | ❌          | ✅                        | ❌              |
| Sorted Order       | ❌          | ❌                        | ✅              |
| Null Allowed       | One        | One                      | ❌              |
| Thread Safe        | ❌          | ❌                        | ❌              |
| Performance        | Fastest    | Fast                     | Moderate       |

---

# Methods Available in Set Hierarchy

Unlike `List`, the `Set` interface itself does **not** introduce any new methods.

It inherits all methods from the `Collection` interface.

Additional methods are introduced by **SortedSet**, **NavigableSet**, and **SequencedSet (Java 21+)**.

---

## Collection Methods

Inherited by all Set implementations.

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

## Set Interface

```text
No New Methods

Set only guarantees
Unique Elements.
```

---

## Additional Methods Provided by SortedSet

Implemented by:

* TreeSet

### Methods

```java
first()

last()

headSet(E toElement)

tailSet(E fromElement)

subSet(E fromElement, E toElement)

comparator()
```

### Purpose

* Access smallest element
* Access largest element
* Retrieve portions of a sorted set
* Retrieve the Comparator used for sorting

---

## Additional Methods Provided by NavigableSet

Implemented by:

* TreeSet

### Methods

```java
lower(E e)

floor(E e)

ceiling(E e)

higher(E e)

pollFirst()

pollLast()

descendingSet()

descendingIterator()

subSet(E fromElement,
       boolean fromInclusive,
       E toElement,
       boolean toInclusive)

headSet(E toElement,
        boolean inclusive)

tailSet(E fromElement,
        boolean inclusive)
```

### Purpose

* Find nearest smaller element
* Find nearest greater element
* Remove first/last element
* Traverse in reverse order
* Perform inclusive/exclusive range operations

---

## Additional Methods Provided by SequencedSet (Java 21+)

Implemented by:

* LinkedHashSet

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

* Insert at the beginning
* Insert at the end
* Access first element
* Access last element
* Remove first element
* Remove last element
* Obtain a reversed-order view

---

# Overall Set Method Hierarchy

```text
Collection Methods
        │
        ▼
Set
(No New Methods)
        │
        ▼
SortedSet
├── first()
├── last()
├── headSet()
├── tailSet()
├── subSet()
└── comparator()

        │
        ▼
NavigableSet
├── lower()
├── floor()
├── ceiling()
├── higher()
├── pollFirst()
├── pollLast()
├── descendingSet()
├── descendingIterator()
├── subSet(..., boolean, ..., boolean)
├── headSet(..., boolean)
└── tailSet(..., boolean)

        │
        ▼
Java 21+ SequencedSet
├── addFirst()
├── addLast()
├── getFirst()
├── getLast()
├── removeFirst()
├── removeLast()
└── reversed()
```

# Detailed Set Hierarchy Methods

Unlike `List`, the `Set` interface itself does **not** introduce any new methods.

The additional methods are provided by:

- SortedSet
- NavigableSet
- SequencedSet (Java 21+)

---

# SortedSet Methods

## 1. first()

Returns the smallest (first) element in the sorted set.

### Syntax

```java
E first()
```

### Example

```java
TreeSet<Integer> set = new TreeSet<>();

set.add(30);
set.add(10);
set.add(20);

System.out.println(set.first());
```

Output

```text
10
```

---

## 2. last()

Returns the largest (last) element.

### Syntax

```java
E last()
```

### Example

```java
System.out.println(set.last());
```

Output

```text
30
```

---

## 3. headSet()

Returns all elements that are **less than** the specified element.

### Syntax

```java
SortedSet<E> headSet(E toElement)
```

### Example

```java
System.out.println(set.headSet(20));
```

Output

```text
[10]
```

---

## 4. tailSet()

Returns all elements greater than or equal to the specified element.

### Syntax

```java
SortedSet<E> tailSet(E fromElement)
```

### Example

```java
System.out.println(set.tailSet(20));
```

Output

```text
[20, 30]
```

---

## 5. subSet()

Returns elements between two specified values.

### Syntax

```java
SortedSet<E> subSet(E fromElement,
                    E toElement)
```

### Example

```java
TreeSet<Integer> numbers =
        new TreeSet<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);

System.out.println(
        numbers.subSet(20, 40));
```

Output

```text
[20, 30]
```

---

## 6. comparator()

Returns the Comparator used for sorting.

Returns `null` when natural ordering is used.

### Syntax

```java
Comparator<? super E> comparator()
```

### Example

```java
System.out.println(
        set.comparator());
```

Output

```text
null
```

---

# NavigableSet Methods

## 7. lower()

Returns the greatest element strictly less than the given element.

### Syntax

```java
E lower(E e)
```

### Example

```java
System.out.println(
        set.lower(20));
```

Output

```text
10
```

---

## 8. floor()

Returns the greatest element less than or equal to the given element.

### Syntax

```java
E floor(E e)
```

### Example

```java
System.out.println(
        set.floor(20));
```

Output

```text
20
```

---

## 9. ceiling()

Returns the smallest element greater than or equal to the given element.

### Syntax

```java
E ceiling(E e)
```

### Example

```java
System.out.println(
        set.ceiling(25));
```

Output

```text
30
```

---

## 10. higher()

Returns the smallest element strictly greater than the given element.

### Syntax

```java
E higher(E e)
```

### Example

```java
System.out.println(
        set.higher(20));
```

Output

```text
30
```

---

## 11. pollFirst()

Removes and returns the first element.

### Syntax

```java
E pollFirst()
```

### Example

```java
System.out.println(
        set.pollFirst());
```

Output

```text
10
```

---

## 12. pollLast()

Removes and returns the last element.

### Syntax

```java
E pollLast()
```

### Example

```java
System.out.println(
        set.pollLast());
```

Output

```text
30
```

---

## 13. descendingSet()

Returns the elements in reverse order.

### Syntax

```java
NavigableSet<E> descendingSet()
```

### Example

```java
System.out.println(
        set.descendingSet());
```

Output

```text
[30, 20, 10]
```

---

## 14. descendingIterator()

Returns an iterator that traverses the set in reverse order.

### Syntax

```java
Iterator<E> descendingIterator()
```

### Example

```java
Iterator<Integer> iterator =
        set.descendingIterator();

while(iterator.hasNext())
{
    System.out.println(iterator.next());
}
```

---

## 15. subSet(..., boolean)

Returns a portion of the set with inclusive or exclusive boundaries.

### Syntax

```java
NavigableSet<E> subSet(
        E fromElement,
        boolean fromInclusive,
        E toElement,
        boolean toInclusive)
```

### Example

```java
System.out.println(
        set.subSet(10,
                   true,
                   30,
                   false));
```

Output

```text
[10, 20]
```

---

## 16. headSet(..., boolean)

Returns all elements before the specified element.

### Syntax

```java
NavigableSet<E> headSet(
        E toElement,
        boolean inclusive)
```

### Example

```java
System.out.println(
        set.headSet(20, true));
```

Output

```text
[10, 20]
```

---

## 17. tailSet(..., boolean)

Returns all elements after the specified element.

### Syntax

```java
NavigableSet<E> tailSet(
        E fromElement,
        boolean inclusive)
```

### Example

```java
System.out.println(
        set.tailSet(20, false));
```

Output

```text
[30]
```

---

# SequencedSet Methods (Java 21+)

Implemented by:

- LinkedHashSet

---

## 18. addFirst()

Inserts an element at the beginning.

### Syntax

```java
void addFirst(E e)
```

---

## 19. addLast()

Inserts an element at the end.

### Syntax

```java
void addLast(E e)
```

---

## 20. getFirst()

Returns the first element.

### Syntax

```java
E getFirst()
```

---

## 21. getLast()

Returns the last element.

### Syntax

```java
E getLast()
```

---

## 22. removeFirst()

Removes and returns the first element.

### Syntax

```java
E removeFirst()
```

---

## 23. removeLast()

Removes and returns the last element.

### Syntax

```java
E removeLast()
```

---

## 24. reversed()

Returns a reverse-order view of the Set.

### Syntax

```java
SequencedSet<E> reversed()
```

---

---

# Ways to Traverse a Set

## 1. Enhanced For Loop

```java
for (Integer value : set)
{
    System.out.println(value);
}
```

---

## 2. Iterator

```java
Iterator<Integer> iterator = set.iterator();

while (iterator.hasNext())
{
    System.out.println(iterator.next());
}
```

---

## 3. Spliterator

```java
Spliterator<Integer> spliterator = set.spliterator();

spliterator.forEachRemaining(System.out::println);
```

---

## 4. Stream

```java
set.stream().forEach(System.out::println);
```


# Interview Questions

### Q1. What is Set?

A collection that stores **unique elements**.

---

### Q2. Which interface does Set extend?

```java
Collection
```

---

### Q3. Does Set allow duplicate elements?

No.

---

### Q4. Does Set support index-based access?

No.

---

### Q5. Which Set implementation maintains insertion order?

```java
LinkedHashSet
```

---

### Q6. Which Set implementation stores elements in sorted order?

```java
TreeSet
```

---

### Q7. Which Set implementation provides the best average performance?

```java
HashSet
```

---

### Q8. Which Set implementations allow one null element?

```text
HashSet
LinkedHashSet
```

`TreeSet` does not allow `null`.

---

### Q9. Which Set implementation is based on a Red-Black Tree?

```java
TreeSet
```

---

### Q10. Why use Set instead of List?

Because `Set` automatically prevents duplicate elements while providing efficient search and storage operations.


---

# Understanding Set Internals

Unlike `List`, which focuses on maintaining order and index-based access, `Set` is designed to **store only unique elements**.

The primary goal of a `Set` is to **prevent duplicate values** while providing efficient searching, insertion, and deletion.

Different `Set` implementations achieve this using different internal data structures.

---

# Why Do We Need Set?

Suppose we store student IDs.

Using a `List`

```text
101
102
103
101
104
102
```

Duplicate IDs are stored.

Using a `Set`

```text
101
102
103
104
```

Duplicate values are automatically ignored.

---

# Why Multiple Set Implementations?

One implementation cannot satisfy every requirement.

Sometimes we need:

* Fast searching
* Insertion order
* Sorted data

Therefore Java provides different implementations.

| Requirement              | Best Choice   |
| ------------------------ | ------------- |
| Fastest Performance      | HashSet       |
| Maintain Insertion Order | LinkedHashSet |
| Maintain Sorted Order    | TreeSet       |

---

# Internal Working Overview

Different implementations use different data structures.

```text
HashSet
    │
    ▼
Hash Table


LinkedHashSet
    │
    ▼
Hash Table
      +
Doubly Linked List


TreeSet
    │
    ▼
Red-Black Tree
```

---

# Hashing Basics

`HashSet` and `LinkedHashSet` are based on **Hashing**.

When an element is inserted,

Java performs:

```text
Element

↓

hashCode()

↓

Bucket Selection

↓

equals()

↓

Store or Ignore
```

---

# hashCode()

Every object has a hash value.

Example

```java
String name = "Java";

name.hashCode();
```

Output

```text
2301506
```

The hash value helps Java determine the bucket where the element should be stored.

---

# Bucket Concept

Suppose a Hash Table contains 8 buckets.

```text
Bucket

0

1

2

3

4

5

6

7
```

Insert

```text
Apple
```

Suppose

```text
hashCode = 23
```

Java calculates

```text
23 % 8

↓

7
```

So the element is stored in

```text
Bucket 7
```

---

# equals()

Even if two objects have the same bucket,

Java checks

```java
equals()
```

to determine whether they are actually equal.

If

```java
equals() == true
```

the duplicate element is **not stored**.

If

```java
equals() == false
```

the new element is stored.

---

# Collision

Sometimes two different objects generate the same bucket.

Example

```text
Apple

↓

Bucket 3


Orange

↓

Bucket 3
```

This is called a **Collision**.

Java handles collisions internally.

You do not need to manage them manually.

---

# Ordering in Set

Different Set implementations maintain different ordering.

## HashSet

```text
No Order
```

Output can appear in any order.

---

## LinkedHashSet

```text
Insertion Order
```

Example

```text
Insert

10
20
30
```

Output

```text
10
20
30
```

---

## TreeSet

```text
Sorted Order
```

Insert

```text
30
10
20
```

Output

```text
10
20
30
```

---

# Internal Data Structures

## HashSet

Uses

```text
Hash Table
```

Representation

```text
Bucket

0 → 20

1 → -

2 → 15

3 → 40

4 → 10
```

Fast searching.

---

## LinkedHashSet

Uses

```text
Hash Table

+

Doubly Linked List
```

Representation

```text
Hash Table

↓

20

↓

15

↓

40

↓

10



Linked List

20 ⇄ 15 ⇄ 40 ⇄ 10
```

Maintains insertion order.

---

## TreeSet

Uses

```text
Red-Black Tree
```

Representation

```text
       20
      /  \
    10    30
          / \
        25  40
```

Automatically maintains sorted order.

---

# Performance Comparison

| Operation  | HashSet | LinkedHashSet | TreeSet  |
| ---------- | ------- | ------------- | -------- |
| add()      | O(1)*   | O(1)*         | O(log n) |
| remove()   | O(1)*   | O(1)*         | O(log n) |
| contains() | O(1)*   | O(1)*         | O(log n) |

* Average Case

---

# Memory Comparison

| Implementation | Memory Usage |
| -------------- | ------------ |
| HashSet        | Lowest       |
| LinkedHashSet  | Medium       |
| TreeSet        | Highest      |

---

# Decision Flow

```text
Need Fastest Performance?

        │
       Yes
        │
        ▼
     HashSet


Need Insertion Order?

        │
       Yes
        │
        ▼
  LinkedHashSet


Need Sorted Data?

        │
       Yes
        │
        ▼
     TreeSet
```

---

# When Should You Choose Which Set?

### Use HashSet

* Fast searching
* Fast insertion
* Duplicate removal
* Ordering is not important

---

### Use LinkedHashSet

* Maintain insertion order
* Remove duplicates
* Predictable iteration order

---

### Use TreeSet

* Automatically sorted data
* Range operations
* Navigation methods
* Ordered traversal

---

# Summary

* `Set` stores only unique elements.
* `HashSet` provides the best average performance.
* `LinkedHashSet` maintains insertion order.
* `TreeSet` maintains sorted order.
* `HashSet` and `LinkedHashSet` use hashing.
* `TreeSet` uses a Red-Black Tree.
* The choice of implementation depends on whether you need **speed**, **order**, or **sorting**.

# Practical Understanding of Set

Understanding the internal working of `Set` is important, but choosing the correct implementation for a real-world problem is equally important.

This section focuses on practical usage, common mistakes, best practices, and interview-oriented concepts.

---

# Real World Examples

## 1. Student Roll Numbers

Every student has a unique roll number.

Duplicate roll numbers should not exist.

Recommended

```text
HashSet
```

---

## 2. Registered Email IDs

Each email address should be stored only once.

Duplicate registrations should be ignored automatically.

Recommended

```text
HashSet
```

---

## 3. Browser History

The same webpage should not appear multiple times.

The order in which pages were visited should be preserved.

Recommended

```text
LinkedHashSet
```

---

## 4. Dictionary

Words should always appear in alphabetical order.

Recommended

```text
TreeSet
```

---

## 5. Leaderboard

Scores should remain sorted.

Highest or lowest score should be quickly accessible.

Recommended

```text
TreeSet
```

---

## 6. Unique Tags

Applications like YouTube or Instagram should not store duplicate tags.

Recommended

```text
HashSet
```

---

# DSA Selection Guide

## Duplicate Removal

```text
Input

10 20 30 10 40 20

↓

HashSet

↓

10 20 30 40
```

---

## Membership Checking

Need to answer questions like

```text
Does this value exist?
```

Recommended

```text
HashSet
```

Average Time

```text
O(1)
```

---

## Sorted Data

Need output like

```text
10
20
30
40
```

Recommended

```text
TreeSet
```

---

## Range Queries

Need values between

```text
100

and

200
```

Recommended

```text
TreeSet
```

Using

```java
subSet()

headSet()

tailSet()
```

---

## Maintain Insertion Order

Need output exactly as inserted.

Recommended

```text
LinkedHashSet
```

---

# Common Mistakes

## Mistake 1

Expecting `HashSet` to maintain insertion order.

Wrong

```text
Insert

10
20
30

Output

30
10
20
```

Possible because `HashSet` does not guarantee ordering.

---

## Mistake 2

Using `TreeSet` to store `null`.

Wrong

```java
TreeSet<Integer> set = new TreeSet<>();

set.add(null);
```

Result

```text
NullPointerException
```

---

## Mistake 3

Expecting duplicate values to be stored.

```java
set.add(10);

set.add(10);
```

Result

```text
10
```

Only one value is stored.

---

## Mistake 4

Using mutable objects inside a `HashSet`.

Changing fields that affect `hashCode()` or `equals()` after insertion can make the object difficult to find or remove.

---

## Mistake 5

Using `TreeSet` without proper ordering.

Custom objects must either:

* Implement `Comparable`

or

* Use a `Comparator`

Otherwise

```text
ClassCastException
```

may occur.

---

# Best Practices

* Use **HashSet** for maximum performance.
* Use **LinkedHashSet** when insertion order matters.
* Use **TreeSet** when sorted data is required.
* Override both `equals()` and `hashCode()` for custom classes used in `HashSet` or `LinkedHashSet`.
* Prefer immutable objects as Set elements whenever possible.
* Avoid modifying objects after inserting them into a hash-based Set.

---

# Quick Revision Table

| Feature            | HashSet    | LinkedHashSet            | TreeSet        |
| ------------------ | ---------- | ------------------------ | -------------- |
| Duplicate Elements | ❌          | ❌                        | ❌              |
| Insertion Order    | ❌          | ✅                        | ❌              |
| Sorted Order       | ❌          | ❌                        | ✅              |
| Null Allowed       | One        | One                      | ❌              |
| Search Performance | ⭐⭐⭐        | ⭐⭐⭐                      | ⭐⭐             |
| Memory Usage       | Low        | Medium                   | High           |
| Internal Structure | Hash Table | Hash Table + Linked List | Red-Black Tree |

---

# Which Set Should I Choose?

```text
Need fastest performance?

        │
       Yes
        ▼
     HashSet


Need insertion order?

        │
       Yes
        ▼
  LinkedHashSet


Need sorted data?

        │
       Yes
        ▼
     TreeSet
```

---

---

# Advanced Interview Questions

### Q1. Why does `HashSet` use both `hashCode()` and `equals()`?

* `hashCode()` identifies the bucket.
* `equals()` confirms whether two objects are actually equal.

---

### Q2. Why is `HashSet` faster than `TreeSet`?

Because `HashSet` uses hashing with an average time complexity of **O(1)**, while `TreeSet` uses a Red-Black Tree with **O(log n)** operations.

---

### Q3. Why is `LinkedHashSet` slower than `HashSet`?

Because it maintains a doubly linked list in addition to the hash table to preserve insertion order.

---

### Q4. Why doesn't `TreeSet` allow `null`?

`TreeSet` sorts elements by comparing them. Comparing `null` with other elements is not supported, so inserting `null` results in a `NullPointerException`.

---

### Q5. What happens if duplicate elements are added to a Set?

The duplicate element is ignored, and the original element remains unchanged.

---

### Q6. Which Set implementation is best for DSA problems?

* **HashSet** → Duplicate removal and fast lookup.
* **LinkedHashSet** → Maintain insertion order.
* **TreeSet** → Sorted data and range queries.

---

### Q7. Can a Set contain mutable objects?

Yes, but modifying fields that affect `equals()` or `hashCode()` after insertion is strongly discouraged because it can break lookups in hash-based Sets.

---

### Q8. Which implementation supports navigation methods like `higher()` and `ceiling()`?

```java
TreeSet
```

through the `NavigableSet` interface.

---

# One-Line Revision

* **HashSet** → Fastest, unordered.
* **LinkedHashSet** → Fast + insertion order.
* **TreeSet** → Sorted + navigation.

---

# Key Takeaways

* `Set` stores only **unique elements**.
* `HashSet` is the best choice for general-purpose usage.
* `LinkedHashSet` preserves insertion order.
* `TreeSet` automatically maintains sorted order.
* Understanding **hashing**, **ordering**, and **tree structures** helps you choose the right implementation.

---

# Final Summary

A `Set` is designed to eliminate duplicate elements efficiently.

Choose the implementation based on your requirement:

* **HashSet** → Maximum performance.
* **LinkedHashSet** → Predictable iteration order.
* **TreeSet** → Automatically sorted data and advanced navigation operations.

Knowing **when** to use each implementation is just as important as knowing **how** they work internally.

