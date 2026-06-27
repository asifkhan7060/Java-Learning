# Table of Contents

## Part 1 : SortedMap Interface

1. What is SortedMap?

2. SortedMap Hierarchy

3. Features of SortedMap

4. SortedMap Implementation

    * TreeMap

5. Difference Between Map and SortedMap

6. Methods Available in SortedMap Hierarchy

   **Map Methods (Inherited)**

    * put()
    * putAll()
    * get()
    * remove()
    * replace()
    * containsKey()
    * containsValue()
    * keySet()
    * values()
    * entrySet()
    * size()
    * isEmpty()
    * clear()

   **SortedMap Methods**

    * firstKey()
    * lastKey()
    * headMap()
    * tailMap()
    * subMap()
    * comparator()

   **NavigableMap Methods (Inherited)**

    * lowerKey()
    * floorKey()
    * ceilingKey()
    * higherKey()
    * lowerEntry()
    * floorEntry()
    * ceilingEntry()
    * higherEntry()
    * firstEntry()
    * lastEntry()
    * pollFirstEntry()
    * pollLastEntry()
    * descendingMap()
    * navigableKeySet()
    * descendingKeySet()
    * subMap(..., boolean, ..., boolean)
    * headMap(..., boolean)
    * tailMap(..., boolean)

   **TreeMap Specific Methods**

    * None

   *Overall SortedMap Method Hierarchy*

   *Important Notes*

7. Detailed SortedMap Methods

    1. firstKey()
    2. lastKey()
    3. headMap()
    4. tailMap()
    5. subMap()
    6. comparator()

8. Ways to Traverse a SortedMap

    * entrySet()
    * keySet()
    * values()
    * Iterator
    * Enhanced For Loop
    * forEach()
    * Stream API

9. Interview Questions

---

# Java SortedMap Interface

## What is SortedMap?

`SortedMap` is a child interface of the `Map` interface.

It stores data as **Key-Value pairs** while automatically maintaining all keys in **sorted order**.

Keys are sorted using either their **natural ordering** (`Comparable`) or a **custom Comparator** supplied when the map is created.

Unlike a regular `Map`, a `SortedMap` provides operations for efficiently accessing the **smallest key**, **largest key**, and **specific ranges of keys**.

```java
public interface SortedMap<K, V>
        extends Map<K, V>
```

---

# SortedMap Hierarchy

```text
Map
 │
 ▼
SortedMap
 │
 ▼
NavigableMap
 │
 ▼
TreeMap
```

---

# Features of SortedMap

* Extends the `Map` interface.
* Stores data as Key-Value pairs.
* Automatically keeps keys sorted.
* Supports natural ordering using `Comparable`.
* Supports custom ordering using `Comparator`.
* Duplicate keys are not allowed.
* Duplicate values are allowed.
* Supports efficient range operations.
* Provides direct access to the smallest and largest keys.
* Commonly implemented using `TreeMap`.

---

# SortedMap Implementation

## 1. TreeMap

### Description

* Primary implementation of `SortedMap`.
* Internally implemented using a **Red-Black Tree**.
* Automatically maintains keys in sorted order.
* Supports both natural ordering and custom comparators.
* Does not allow `null` keys.
* Allows multiple `null` values.

### Inherited Methods

Since `TreeMap` implements **NavigableMap**, it also inherits all methods from:

* Map
* SortedMap
* NavigableMap

Some commonly used inherited methods are:

* lowerKey()
* floorKey()
* ceilingKey()
* higherKey()
* firstEntry()
* lastEntry()
* pollFirstEntry()
* pollLastEntry()
* descendingMap()
* navigableKeySet()

### TreeMap Specific Methods

`TreeMap` **does not introduce any new public methods**.

It relies entirely on the methods inherited from the `Map`, `SortedMap`, and `NavigableMap` interfaces.

### Example

```java
SortedMap<Integer, String> map =
        new TreeMap<>();
```

---

# Difference Between Map and SortedMap

| Feature                      | Map                       | SortedMap   |
| ---------------------------- | ------------------------- | ----------- |
| Stores Key-Value Pairs       | ✅                         | ✅           |
| Maintains Sorted Keys        | Depends on Implementation | ✅           |
| Supports Range Operations    | ❌                         | ✅           |
| firstKey() / lastKey()       | ❌                         | ✅           |
| Uses Comparable / Comparator | ❌                         | ✅           |
| Primary Implementation       | HashMap                   | TreeMap     |
| Best Use Case                | General Purpose           | Sorted Data |


# Methods Available in SortedMap Hierarchy

`SortedMap` extends the `Map` interface.

It inherits all methods from `Map` and introduces additional methods for maintaining data in **sorted key order**.

Since `NavigableMap` extends `SortedMap`, every implementation such as `TreeMap` also inherits all **NavigableMap** methods.

---

## Map Methods (Inherited)

Implemented by:

* TreeMap

### Methods

```java
put(K key, V value)

putAll(Map<? extends K, ? extends V> m)

putIfAbsent(K key, V value)

get(Object key)

getOrDefault(Object key,
             V defaultValue)

remove(Object key)

remove(Object key,
       Object value)

replace(K key,
        V value)

replace(K key,
        V oldValue,
        V newValue)

replaceAll(BiFunction)

containsKey(Object key)

containsValue(Object value)

keySet()

values()

entrySet()

forEach(BiConsumer)

compute(K key,
        BiFunction)

computeIfAbsent(K key,
                Function)

computeIfPresent(K key,
                 BiFunction)

merge(K key,
      V value,
      BiFunction)

size()

isEmpty()

clear()
```

### Purpose

* Store key-value mappings
* Update mappings
* Remove mappings
* Retrieve values
* Search keys and values
* Traverse the map

---

## SortedMap Methods

Implemented by:

* TreeMap

### Methods

```java
firstKey()

lastKey()

headMap(K toKey)

tailMap(K fromKey)

subMap(K fromKey,
       K toKey)

comparator()
```

### Purpose

* Retrieve the smallest key
* Retrieve the largest key
* Obtain a portion of the map
* Access the sorting comparator

---

## NavigableMap Methods (Inherited)

Implemented by:

* TreeMap

### Methods

```java
lowerKey(K key)

floorKey(K key)

ceilingKey(K key)

higherKey(K key)

lowerEntry(K key)

floorEntry(K key)

ceilingEntry(K key)

higherEntry(K key)

firstEntry()

lastEntry()

pollFirstEntry()

pollLastEntry()

descendingMap()

navigableKeySet()

descendingKeySet()

subMap(K fromKey,
       boolean fromInclusive,
       K toKey,
       boolean toInclusive)

headMap(K toKey,
        boolean inclusive)

tailMap(K fromKey,
        boolean inclusive)
```

### Purpose

* Find nearest smaller or greater keys
* Retrieve neighbouring entries
* Traverse the map in reverse order
* Perform inclusive and exclusive range operations

> These methods belong to the **NavigableMap** interface and are explained in detail in the **NavigableMap/About.md** section.

---

## TreeMap Specific Methods

`TreeMap` does **not** introduce any new public methods.

It inherits all methods from:

* Map
* SortedMap
* NavigableMap

---

# Overall SortedMap Method Hierarchy

```text
Map
│
├── put()
├── putAll()
├── putIfAbsent()
├── get()
├── getOrDefault()
├── remove()
├── replace()
├── replaceAll()
├── containsKey()
├── containsValue()
├── keySet()
├── values()
├── entrySet()
├── forEach()
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
├── merge()
├── size()
├── isEmpty()
└── clear()

        │
        ▼

SortedMap
│
├── firstKey()
├── lastKey()
├── headMap()
├── tailMap()
├── subMap()
└── comparator()

        │
        ▼

NavigableMap
│
├── lowerKey()
├── floorKey()
├── ceilingKey()
├── higherKey()
├── lowerEntry()
├── floorEntry()
├── ceilingEntry()
├── higherEntry()
├── firstEntry()
├── lastEntry()
├── pollFirstEntry()
├── pollLastEntry()
├── descendingMap()
├── navigableKeySet()
├── descendingKeySet()
├── subMap(..., boolean)
├── headMap(..., boolean)
└── tailMap(..., boolean)

        │
        ▼

TreeMap
│
└── No New Public Methods
```

---

# Important Notes

* `SortedMap` extends the `Map` interface.
* It inherits all methods defined in `Map`.
* It introduces **6 new methods** for working with sorted keys.
* `NavigableMap` extends `SortedMap` by adding **18 navigation methods**.
* `TreeMap` is the primary implementation of both `SortedMap` and `NavigableMap`.
* `TreeMap` does not introduce any new public methods of its own.
* Keys are sorted using either **Comparable** or a **Comparator**.
* `TreeMap` does not allow `null` keys but allows multiple `null` values.

---

# Detailed SortedMap Methods

The following sections explain every method introduced by the **SortedMap** interface.

Each method includes:

* Description
* Syntax
* Example
* Output (where applicable)

---

# SortedMap Methods

The following methods are introduced by the **SortedMap** interface.

These methods provide operations for accessing and managing **sorted keys**.

---

## 1. firstKey()

Returns the first (smallest) key currently present in the map.

### Syntax

```java
K firstKey()
```

### Example

```java
SortedMap<Integer, String> map =
        new TreeMap<>();

map.put(30, "C");
map.put(10, "A");
map.put(20, "B");

System.out.println(
        map.firstKey());
```

### Output

```text
10
```

---

## 2. lastKey()

Returns the last (largest) key currently present in the map.

### Syntax

```java
K lastKey()
```

### Example

```java
System.out.println(
        map.lastKey());
```

### Output

```text
30
```

---

## 3. headMap()

Returns a view of the portion of the map whose keys are **strictly less than** the specified key.

### Syntax

```java
SortedMap<K, V> headMap(K toKey)
```

### Example

```java
System.out.println(
        map.headMap(20));
```

### Output

```text
{10=A}
```

---

## 4. tailMap()

Returns a view of the portion of the map whose keys are **greater than or equal to** the specified key.

### Syntax

```java
SortedMap<K, V> tailMap(K fromKey)
```

### Example

```java
System.out.println(
        map.tailMap(20));
```

### Output

```text
{20=B, 30=C}
```

---

## 5. subMap()

Returns a view of the portion of the map whose keys range from the specified **fromKey (inclusive)** to **toKey (exclusive)**.

### Syntax

```java
SortedMap<K, V> subMap(
        K fromKey,
        K toKey)
```

### Example

```java
SortedMap<Integer, String> numbers =
        new TreeMap<>();

numbers.put(10, "A");
numbers.put(20, "B");
numbers.put(30, "C");
numbers.put(40, "D");

System.out.println(
        numbers.subMap(
                20,
                40));
```

### Output

```text
{20=B, 30=C}
```

---

## 6. comparator()

Returns the `Comparator` used to sort the keys.

If natural ordering is used, this method returns `null`.

### Syntax

```java
Comparator<? super K> comparator()
```

### Example

```java
System.out.println(
        map.comparator());
```

### Output

```text
null
```

---

# Ways to Traverse a SortedMap

## 1. Using entrySet()

```java
for (Map.Entry<Integer, String> entry :
        map.entrySet())
{
    System.out.println(
            entry.getKey()
            + " = "
            + entry.getValue());
}
```

---

## 2. Using keySet()

```java
for (Integer key : map.keySet())
{
    System.out.println(
            key + " = "
            + map.get(key));
}
```

---

## 3. Using values()

```java
for (String value : map.values())
{
    System.out.println(value);
}
```

---

## 4. Using Iterator

```java
Iterator<Map.Entry<Integer, String>> itr =
        map.entrySet().iterator();

while (itr.hasNext())
{
    System.out.println(
            itr.next());
}
```

---

## 5. Using Enhanced For Loop

```java
for (Map.Entry<Integer, String> entry :
        map.entrySet())
{
    System.out.println(entry);
}
```

---

## 6. Using forEach()

```java
map.forEach(
        (k, v) ->
                System.out.println(
                        k + " = " + v));
```

---

## 7. Using Stream API

```java
map.entrySet()
   .stream()
   .forEach(System.out::println);
```

---

# Interview Questions

### Q1. What is the primary implementation of `SortedMap`?

`TreeMap`.

---

### Q2. How are keys sorted in `SortedMap`?

Using either the natural ordering (`Comparable`) of the keys or a custom `Comparator`.

---

### Q3. Does `SortedMap` allow duplicate keys?

No.

Keys must always be unique.

---

### Q4. Does `SortedMap` allow duplicate values?

Yes.

Duplicate values are allowed.

---

### Q5. Does `TreeMap` allow null keys?

No.

Attempting to insert a null key results in a `NullPointerException`.

---

### Q6. Which method returns the smallest key?

`firstKey()`.

---

### Q7. Which method returns the largest key?

`lastKey()`.

---

### Q8. Which method returns a portion of the map between two keys?

`subMap()`.

---

### Q9. Which interface extends `SortedMap`?

`NavigableMap`.

---

### Q10. Which data structure is used internally by `TreeMap`?

A **Red-Black Tree**.

# Understanding SortedMap Internals

`SortedMap` extends the `Map` interface and automatically maintains all keys in **sorted order**.

Unlike `HashMap`, which stores keys without any ordering guarantee, `SortedMap` ensures that every key remains sorted either by its **natural ordering** or by a **custom Comparator**.

The primary implementation of `SortedMap` is **TreeMap**.

---

# Why Do We Need SortedMap?

Suppose we are storing student marks.

```text
90 → Rahul

75 → Aman

82 → Neha
```

If we use a `HashMap`, the order of keys is unpredictable.

However, many real-world applications require:

* Sorted reports
* Rankings
* Dictionaries
* Range queries
* Scheduling systems

For such scenarios, `SortedMap` is the ideal choice.

---

# Why TreeMap?

`TreeMap` is the primary implementation of `SortedMap`.

It automatically maintains keys in sorted order and provides:

* Automatic sorting
* Efficient searching
* Efficient insertion
* Efficient deletion
* Range-based operations

No additional sorting algorithm is required after insertion.

---

# Natural Ordering

By default, `SortedMap` sorts keys using their **natural ordering**.

Examples

```text
Integer

10

20

30

40
```

```text
String

Apple

Banana

Cat

Dog
```

Natural ordering is provided through the

```java
Comparable
```

interface.

---

# Custom Comparator

Sometimes the default ordering is not suitable.

A custom ordering can be supplied using a

```java
Comparator
```

Example

```text
Descending Order

40

30

20

10
```

This allows complete control over how keys are sorted.

---

# Internal Working Overview

```text
Key + Value

        │

        ▼

Comparable
      or
Comparator

        │

        ▼

Red-Black Tree

        │

        ▼

Automatically Sorted
```

Every new key is inserted into its proper sorted position.

---

# Red-Black Tree

Internally, `TreeMap` uses a

```text
Red-Black Tree
```

which is a self-balancing Binary Search Tree.

Advantages

* Balanced Height
* Fast Search
* Fast Insertion
* Fast Deletion

Time Complexity

```text
Search  → O(log n)

Insert  → O(log n)

Delete  → O(log n)
```

---

# Sorting Mechanism

Whenever a new key is inserted,

it is compared with existing keys.

Example

```text
Insert

20

↓

10

↓

30

↓

25
```

Final Tree Order

```text
10

20

25

30
```

No explicit sorting operation is required.

---

# Key Comparison

During insertion and searching,

keys are compared using

```text
Comparable

or

Comparator
```

Working

```text
New Key

↓

Compare

↓

Go Left

or

Go Right

↓

Correct Position Found
```

---

# Read and Write Operations

Searching

```text
Root

↓

Compare

↓

Move Left / Right

↓

Required Node
```

Insertion

```text
Locate Position

↓

Insert Node

↓

Rebalance Tree
```

Deletion

```text
Locate Node

↓

Delete Node

↓

Rebalance Tree
```

---

# Internal Data Structure

```text
             20
            /  \
          10    30
               /  \
             25    40
```

Each node stores

* Key
* Value
* Left Child
* Right Child
* Parent
* Node Color (Red / Black)

---

# Performance Comparison

| Implementation | Search | Insert | Delete |
|---------------|--------|--------|--------|
| HashMap | O(1)* | O(1)* | O(1)* |
| LinkedHashMap | O(1)* | O(1)* | O(1)* |
| TreeMap | O(log n) | O(log n) | O(log n) |

\*Average Case

---

# Memory Comparison

| Implementation | Memory Usage |
|---------------|--------------|
| HashMap | Low |
| LinkedHashMap | Medium |
| TreeMap | Higher |

TreeMap requires additional memory to maintain the Red-Black Tree structure.

---

# Decision Flow

```text
Need Fast Lookup?

        │
       Yes
        │
        ▼
     HashMap

Need Insertion Order?

        │
       Yes
        │
        ▼
 LinkedHashMap

Need Sorted Keys?

        │
       Yes
        │
        ▼
     TreeMap
```

---

# When Should You Choose SortedMap?

Use `TreeMap` when you need:

* Automatically sorted keys
* Student rankings
* Leaderboards
* Dictionaries
* Product catalogs
* Event scheduling
* Price lists
* Range queries

Avoid using `TreeMap` when:

* Sorting is not required.
* Maximum lookup performance is the priority.

---

# Summary

* `SortedMap` extends the `Map` interface.
* `TreeMap` is the primary implementation of `SortedMap`.
* Keys are always maintained in sorted order.
* Sorting is performed using `Comparable` or `Comparator`.
* Internally, `TreeMap` uses a Red-Black Tree.
* Search, insertion, and deletion operations take **O(log n)** time.
* `SortedMap` is the preferred choice whenever ordered keys or range-based operations are required.

# Practical Understanding of SortedMap

Understanding the internal working of `SortedMap` is important, but knowing **when** and **where** to use it is equally important.

This section focuses on practical applications, common mistakes, best practices, and interview-oriented concepts.

---

# Real World Examples

## 1. Student Ranking System

Students should always appear in ascending order of marks.

```text
75  → Aman

82  → Neha

90  → Rahul
```

Recommended

```text
TreeMap
```

---

## 2. Dictionary

Words should remain in alphabetical order.

```text
Apple

Banana

Cat

Dog
```

Recommended

```text
TreeMap
```

---

## 3. Leaderboard

Players should remain sorted according to their scores.

```text
1500 → Alex

1800 → John

2100 → Emma
```

Recommended

```text
TreeMap
```

---

## 4. Product Catalog

Products displayed according to Product ID.

Recommended

```text
TreeMap
```

---

## 5. Employee Records

Employees sorted according to Employee ID.

Recommended

```text
TreeMap
```

---

## 6. Event Scheduler

Events maintained according to date and time.

Recommended

```text
TreeMap
```

---

# DSA Selection Guide

## Sorted Keys

Need data to remain automatically sorted.

Recommended

```text
TreeMap
```

---

## Range Queries

Need all entries between two keys.

Recommended

```text
TreeMap
```

---

## First / Last Key

Need quick access to the minimum or maximum key.

Recommended

```text
TreeMap
```

---

## Navigation Operations

Need nearest smaller or greater keys.

Recommended

```text
NavigableMap
(TreeMap)
```

---

# Common Mistakes

## Mistake 1

Expecting insertion order.

Wrong

```text
TreeMap
```

TreeMap maintains **sorted order**, not insertion order.

---

## Mistake 2

Using non-comparable keys.

Wrong

```java
class Student
{
}
```

Without implementing

```java
Comparable
```

or providing a

```java
Comparator
```

Result

```text
ClassCastException
```

---

## Mistake 3

Trying to insert a null key.

Wrong

```java
map.put(null, "Java");
```

Result

```text
NullPointerException
```

---

## Mistake 4

Using TreeMap when sorting is unnecessary.

For fast lookup,

```text
HashMap
```

is usually a better choice.

---

## Mistake 5

Assuming TreeMap operations are O(1).

Actual complexity

```text
Search  → O(log n)

Insert  → O(log n)

Delete  → O(log n)
```

---

# Best Practices

* Use `TreeMap` only when sorted keys are required.
* Prefer immutable objects as keys.
* Properly implement `Comparable` for custom keys.
* Use a custom `Comparator` whenever natural ordering is insufficient.
* Prefer `HashMap` if ordering is not required.
* Use `NavigableMap` for advanced navigation operations.

---

# Quick Revision Table

| Requirement | Recommended |
|-------------|-------------|
| Sorted Keys | TreeMap |
| Range Queries | TreeMap |
| First / Last Key | TreeMap |
| Custom Sorting | TreeMap + Comparator |
| Fast Lookup | HashMap |
| Advanced Navigation | NavigableMap (TreeMap) |

---

# When Should You Use SortedMap?

```text
Need Sorted Keys?

        │
       Yes
        │
        ▼
     TreeMap

Need Advanced Navigation?

        │
       Yes
        │
        ▼
 NavigableMap
   (TreeMap)

Need Fast Lookup?

        │
       Yes
        │
        ▼
     HashMap

Need Insertion Order?

        │
       Yes
        │
        ▼
 LinkedHashMap
```

---

# Advanced Interview Questions

### Q1. Which class implements `SortedMap`?

`TreeMap`.

---

### Q2. Which interface extends `SortedMap`?

`NavigableMap`.

---

### Q3. How are keys sorted in `SortedMap`?

Using the natural ordering (`Comparable`) or a custom `Comparator`.

---

### Q4. Does `SortedMap` allow duplicate keys?

No. Keys are always unique.

---

### Q5. Does `TreeMap` allow null keys?

No. It throws a `NullPointerException`.

---

### Q6. Which data structure is used internally by `TreeMap`?

A **Red-Black Tree**.

---

### Q7. What is the time complexity of search, insertion, and deletion in `TreeMap`?

```text
O(log n)
```

---

### Q8. When should `SortedMap` be preferred over `HashMap`?

When automatically sorted keys or range-based operations are required.

---

### Q9. Does `SortedMap` maintain insertion order?

No. It maintains **sorted order**.

---

### Q10. Which implementation provides both `SortedMap` and `NavigableMap` features?

`TreeMap`.

---

# One-Line Revision

* **SortedMap** → Maintains keys in sorted order.
* **TreeMap** → Red-Black Tree implementation of `SortedMap`.
* **NavigableMap** → Extends `SortedMap` with advanced navigation methods.

---

# Key Takeaways

* `SortedMap` extends the `Map` interface.
* `TreeMap` is the primary implementation of `SortedMap`.
* `NavigableMap` extends `SortedMap` by adding navigation operations.
* Keys remain automatically sorted.
* Sorting is based on `Comparable` or `Comparator`.
* `TreeMap` uses a Red-Black Tree internally.
* All basic operations execute in **O(log n)** time.
* Choose `SortedMap` whenever ordered keys or range operations are required.

---

# Final Summary

`SortedMap` extends the `Map` interface by maintaining all keys in **sorted order**. Its primary implementation, **TreeMap**, internally uses a **Red-Black Tree** to provide efficient searching, insertion, deletion, and range-based operations.

When applications require ordered data, minimum/maximum key retrieval, or range queries, `SortedMap` is the ideal choice. For even more powerful navigation capabilities, `NavigableMap` extends `SortedMap` with methods such as `lowerKey()`, `higherKey()`, `floorKey()`, and `ceilingKey()`, all of which are implemented by `TreeMap`.