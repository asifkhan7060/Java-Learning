# TreeMap Method Hierarchy

## Overview

`TreeMap` is a sorted implementation of the `NavigableMap` interface that stores key-value pairs in **ascending order of keys** by default.

Unlike `HashMap`, which uses a Hash Table, `TreeMap` stores entries inside a **Red-Black Tree**, a self-balancing Binary Search Tree.

It automatically keeps keys sorted using either:

* Natural Ordering (`Comparable`)
* Custom Ordering (`Comparator`)

Internally, `TreeMap` uses:

* Red-Black Tree
* Binary Search Tree Operations
* Tree Rotation
* Comparator (Optional)
* Comparable (Default)

It does **not** use:

* Hash Table
* Buckets
* Linked List
* Treeification (already a tree)

It provides:

* Sorted Keys
* Fast Lookup
* Fast Insertion
* Fast Deletion
* Range Operations
* First Entry
* Last Entry
* Floor Entry
* Ceiling Entry
* Higher Entry
* Lower Entry
* Descending View

Since `TreeMap` implements the `NavigableMap` interface,

it automatically inherits all methods from

* Map
* SortedMap
* NavigableMap

---

# Class Declaration

```java
public class TreeMap<K,V>
        extends AbstractMap<K,V>
        implements NavigableMap<K,V>,
                   Cloneable,
                   Serializable
```

---

# Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
TreeMap
```

---

# Interface Relationship

```text
Map
 ↑
SortedMap
 ↑
NavigableMap
 ↑
TreeMap
```

---

# Relationship with Map

`Map` defines the basic contract for storing key-value pairs.

TreeMap inherits all standard Map operations such as

* put()
* get()
* remove()
* containsKey()
* containsValue()
* size()
* clear()

However,

TreeMap changes the internal storage mechanism.

```text
Map

↓

Key-Value Storage

----------------------------

TreeMap

↓

Sorted Key-Value Storage
```

---

# Relationship with SortedMap

`SortedMap` introduces the concept of automatically sorted keys.

TreeMap is the primary implementation of `SortedMap`.

Additional methods inherited include

```java
firstKey()

lastKey()

headMap()

tailMap()

subMap()

comparator()
```

---

# Relationship with NavigableMap

`NavigableMap` extends `SortedMap`

by adding navigation methods.

TreeMap inherits methods such as

```java
higherKey()

lowerKey()

ceilingKey()

floorKey()

pollFirstEntry()

pollLastEntry()

descendingMap()

descendingKeySet()
```

These methods allow efficient navigation through sorted data.

---

# Relationship with HashMap

Both classes implement the `Map` interface,

but their internal implementations are completely different.

```text
HashMap

↓

Hash Table

↓

hashCode()

↓

equals()

----------------------------

TreeMap

↓

Red-Black Tree

↓

Comparable

or

Comparator
```

HashMap focuses on fast hashing.

TreeMap focuses on maintaining sorted order.

---

# Relationship with LinkedHashMap

```text
LinkedHashMap

↓

Insertion Order

----------------------------

TreeMap

↓

Sorted Order
```

LinkedHashMap remembers

when entries were inserted.

TreeMap ignores insertion order completely.

Instead,

it always sorts keys.

---

# Complete TreeMap Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Introduced by TreeMap hierarchy
>
> 🔒 = Internal/Protected

```text
TreeMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ TreeMap()
├── ✅ TreeMap(Comparator<? super K>)
├── ✅ TreeMap(Map<? extends K,
│              ? extends V>)
└── ✅ TreeMap(SortedMap<K,
                       ? extends V>)

│
├──────────────────────────────────────────────
│ Methods inherited from Map
├──────────────────────────────────────────────
│
├── ✅ put()
├── ✅ putAll()
├── ✅ get()
├── ✅ remove()
├── ✅ containsKey()
├── ✅ containsValue()
├── ✅ size()
├── ✅ isEmpty()
├── ✅ clear()
├── ✅ keySet()
├── ✅ values()
├── ✅ entrySet()
├── ✅ replace()
├── ✅ replaceAll()
├── ✅ compute()
├── ✅ computeIfAbsent()
├── ✅ computeIfPresent()
├── ✅ merge()

│
├──────────────────────────────────────────────
│ Methods inherited from SortedMap
├──────────────────────────────────────────────
│
├── 🆕 comparator()
├── 🆕 firstKey()
├── 🆕 lastKey()
├── 🆕 headMap()
├── 🆕 tailMap()
└── 🆕 subMap()

│
├──────────────────────────────────────────────
│ Methods inherited from NavigableMap
├──────────────────────────────────────────────
│
├── 🆕 firstEntry()
├── 🆕 lastEntry()
├── 🆕 higherKey()
├── 🆕 higherEntry()
├── 🆕 lowerKey()
├── 🆕 lowerEntry()
├── 🆕 ceilingKey()
├── 🆕 ceilingEntry()
├── 🆕 floorKey()
├── 🆕 floorEntry()
├── 🆕 pollFirstEntry()
├── 🆕 pollLastEntry()
├── 🆕 descendingMap()
├── 🆕 descendingKeySet()
├── 🆕 navigableKeySet()
├── 🆕 descendingMap()
└── 🆕 subMap(..., boolean)

│
├──────────────────────────────────────────────
│ TreeMap Specific Features
├──────────────────────────────────────────────
│
├── ✅ clone()
└── ✅ Red-Black Tree Implementation

│
└──────────────────────────────────────────────
  Methods inherited from Object
───────────────────────────────────────────────

├── 🆕 toString()
├── 🆕 getClass()
├── 🆕 wait()
├── 🆕 notify()
├── 🆕 notifyAll()
└── 🆕 finalize() (Deprecated)
```

---

# Comparison with Other Map Implementations

| Feature | HashMap | LinkedHashMap | TreeMap |
|----------|---------|---------------|---------|
| Internal Structure | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree |
| Ordering | No Guarantee | Insertion / Access | Sorted |
| Null Key | ✅ One | ✅ One | ❌ (Natural Ordering) |
| Null Values | ✅ | ✅ | ✅ |
| Lookup | O(1) | O(1) | O(log n) |
| Insertion | O(1) | O(1) | O(log n) |
| Range Queries | ❌ | ❌ | ✅ |
| Comparator | ❌ | ❌ | ✅ |

---

# Key Takeaways

* `TreeMap` implements `NavigableMap`.
* Stores entries inside a **Red-Black Tree**.
* Automatically sorts keys.
* Supports both **Natural Ordering** and **Custom Comparator**.
* Provides efficient range and navigation operations.
* Maintains sorted order rather than insertion order.
* Preferred when ordered traversal or range-based operations are required.


# Understanding the Hierarchy

The methods available in a `TreeMap` object come from multiple interfaces in the Java Collections Framework.

Unlike `HashMap` and `LinkedHashMap`,

`TreeMap` inherits functionality from three interface levels:

```text
Map

↓

SortedMap

↓

NavigableMap

↓

TreeMap
```

Each layer adds new capabilities.

---

# 1. Constructors

These belong directly to the `TreeMap` class.

They are **not inherited**.

```java
TreeMap()

TreeMap(Comparator<? super K> comparator)

TreeMap(Map<? extends K,
            ? extends V> map)

TreeMap(SortedMap<K,
            ? extends V> map)
```

Each constructor creates a TreeMap with different ordering behavior.

---

## Constructor Summary

| Constructor | Ordering |
|------------|----------|
| TreeMap() | Natural Ordering |
| TreeMap(Comparator) | Custom Ordering |
| TreeMap(Map) | Natural Ordering after copying |
| TreeMap(SortedMap) | Same Ordering as Source Map |

---

# 2. Methods Inherited from Map

Since

```java
TreeMap implements NavigableMap
```

and

```text
NavigableMap

↓

SortedMap

↓

Map
```

every TreeMap automatically supports all Map operations.

Examples

```java
put()

putAll()

get()

remove()

clear()

containsKey()

containsValue()

size()

isEmpty()

keySet()

values()

entrySet()

replace()

replaceAll()

compute()

computeIfAbsent()

computeIfPresent()

merge()
```

These methods provide standard key-value operations.

---

# 3. Methods Introduced by SortedMap

`SortedMap` adds methods related to sorting.

These methods do **not** exist in `HashMap`.

### comparator()

Returns the Comparator used for sorting.

```java
Comparator<? super K> comparator()
```

If natural ordering is used,

this method returns

```java
null
```

---

### firstKey()

Returns the smallest key.

```java
K firstKey()
```

Example

```text
10

20

30

40

↓

10
```

---

### lastKey()

Returns the largest key.

```java
K lastKey()
```

Example

```text
10

20

30

40

↓

40
```

---

### headMap()

Returns keys smaller than a specified key.

```java
headMap(toKey)
```

Example

```text
Tree

↓

10

20

30

40

50

headMap(40)

↓

10

20

30
```

---

### tailMap()

Returns keys greater than or equal to a specified key.

```java
tailMap(fromKey)
```

Example

```text
Tree

↓

10

20

30

40

50

tailMap(30)

↓

30

40

50
```

---

### subMap()

Returns keys between two specified keys.

```java
subMap(fromKey, toKey)
```

Example

```text
10

20

30

40

50

subMap(20, 50)

↓

20

30

40
```

---

# 4. Methods Introduced by NavigableMap

NavigableMap extends SortedMap by introducing navigation methods.

---

### higherKey()

Returns the next greater key.

```text
10

20

30

40

higherKey(20)

↓

30
```

---

### lowerKey()

Returns the next smaller key.

```text
10

20

30

40

lowerKey(30)

↓

20
```

---

### ceilingKey()

Returns

```text
Equal

OR

Greater
```

Example

```text
Keys

10

20

40

50

ceilingKey(25)

↓

40
```

---

### floorKey()

Returns

```text
Equal

OR

Smaller
```

Example

```text
Keys

10

20

40

50

floorKey(25)

↓

20
```

---

### firstEntry()

Returns the first Map Entry.

```java
Map.Entry<K,V>
```

---

### lastEntry()

Returns the last Map Entry.

---

### pollFirstEntry()

Removes and returns

the first entry.

---

### pollLastEntry()

Removes and returns

the last entry.

---

### descendingMap()

Returns

Reverse Ordered View.

```text
Ascending

↓

10

20

30

40

Descending

↓

40

30

20

10
```

---

### descendingKeySet()

Returns

Keys in Reverse Order.

---

### navigableKeySet()

Returns

Keys in Ascending Order.

---

# 5. TreeMap Specific Feature

Unlike HashMap,

TreeMap stores entries inside a

```text
Red-Black Tree
```

Every insertion,

deletion,

and search

maintains the balance of the tree.

This guarantees

```text
O(log n)
```

time complexity.

---

# clone()

TreeMap provides

```java
clone()
```

which creates a

```text
Shallow Copy
```

Only the TreeMap structure is copied.

Stored objects remain shared.

---

# Comparison of Interface Layers

```text
Map

↓

Basic Key-Value Operations

----------------------------

SortedMap

↓

Sorted Keys

----------------------------

NavigableMap

↓

Navigation

+

Range Operations

----------------------------

TreeMap

↓

Red-Black Tree

+

Sorted Storage
```

# Internal TreeMap Concepts

Unlike `HashMap`,

the most important concepts of `TreeMap` are:

* Red-Black Tree
* Binary Search Tree
* Self Balancing
* Natural Ordering
* Comparator
* Tree Rotation

The hashing concepts are **not used** in `TreeMap`.

---

# 1. Internal Structure

Internally,

TreeMap stores all entries inside a

```text
Red-Black Tree
```

instead of

```text
Hash Table
```

Diagram

```text
              40
             /  \
           20    60
          / \    / \
        10  30 50  70
```

Every node stores

* Key
* Value
* Color
* Parent
* Left Child
* Right Child

Unlike HashMap,

there are

* No Buckets
* No Hashing
* No Linked List

---

# 2. Binary Search Tree (BST)

TreeMap is based on the concept of a

```text
Binary Search Tree
```

Rule

```text
Left Child

<

Parent

<

Right Child
```

Example

```text
Insert

40

20

60

10

30

50

70
```

Tree

```text
              40
             /  \
           20    60
          / \    / \
        10 30  50 70
```

Searching follows the BST property.

---

# 3. Why Normal BST is Not Enough?

Suppose we insert

```text
10

20

30

40

50
```

Normal BST becomes

```text
10
 \
 20
   \
    30
      \
      40
        \
        50
```

Height becomes

```text
O(n)
```

Searching also becomes

```text
O(n)
```

Very slow.

---

# 4. Red-Black Tree

TreeMap solves the BST problem using

```text
Red-Black Tree
```

A Red-Black Tree is a

```text
Self-Balancing
Binary Search Tree.
```

It automatically keeps the height approximately balanced.

Result

```text
Search

↓

O(log n)

Insert

↓

O(log n)

Delete

↓

O(log n)
```

---

# 5. Red-Black Tree Rules

Every Red-Black Tree follows these rules.

### Rule 1

Every node is either

```text
Red

or

Black
```

---

### Rule 2

Root node is always

```text
Black
```

---

### Rule 3

Every NULL leaf is considered

```text
Black
```

---

### Rule 4

A Red node cannot have a

```text
Red Child
```

This prevents long chains.

---

### Rule 5

Every path from root to leaf

contains the same number of

```text
Black Nodes
```

This maintains balance.

---

# 6. Tree Rotation

When the tree becomes unbalanced,

TreeMap performs

```text
Rotation
```

instead of rebuilding the tree.

Two types

```text
Left Rotation

Right Rotation
```

---

### Left Rotation

Before

```text
20
 \
 30
   \
   40
```

After

```text
     30
    /  \
  20    40
```

---

### Right Rotation

Before

```text
      40
     /
    30
   /
 20
```

After

```text
      30
     /  \
   20    40
```

Rotations maintain

```text
O(log n)
```

height.

---

# 7. Natural Ordering

By default,

TreeMap sorts keys using

```java
Comparable
```

Example

```java
TreeMap<Integer,String>
```

Order

```text
10

20

30

40
```

Strings

```text
Apple

Banana

Cat

Dog
```

Natural ordering comes from

```java
compareTo()
```

---

# 8. Custom Ordering

TreeMap can also use

```java
Comparator
```

Example

```java
Collections.reverseOrder()
```

Result

```text
40

30

20

10
```

Comparator overrides

Natural Ordering.

---

# 9. compareTo()

If Comparator is absent,

TreeMap calls

```java
compareTo()
```

Example

```java
Integer

↓

compareTo()

↓

Ascending
```

Custom objects must implement

```java
Comparable
```

unless Comparator is supplied.

---

# 10. Comparator

If Comparator is supplied,

TreeMap ignores

```java
compareTo()
```

Instead,

it uses

```java
compare()
```

for every comparison.

---

# 11. Duplicate Keys

Duplicate Keys are

```text
NOT Allowed
```

Example

```java
put(10,"Java");

put(10,"Spring");
```

Result

```text
Value Updated
```

---

# 12. Duplicate Values

Duplicate Values are

```text
Allowed
```

Example

```java
10 → Java

20 → Java
```

Valid.

---

# 13. Null Keys

TreeMap

using Natural Ordering

does

```text
NOT

allow

Null Keys
```

Reason

```text
compareTo()

cannot compare

null
```

Attempting

```java
put(null,"Java");
```

throws

```text
NullPointerException
```

---

# 14. Null Values

Null Values

are

```text
Allowed
```

Example

```java
10 → null

20 → Java
```

Valid.

---

# 15. Internal Comparison Process

Whenever a key is inserted,

TreeMap performs

```text
Compare

↓

Go Left

or

Go Right

↓

Insert

↓

Balance Tree

↓

Done
```

Unlike HashMap,

there is

```text
NO Hashing
```

---

# 16. Memory Representation

```text
              40(B)
             /     \
         20(R)     60(R)
        /   \      /   \
    10(B)30(B)50(B)70(B)
```

Each node stores

```text
Key

Value

Color

Parent

Left

Right
```

---

# 17. Performance

Average

```text
put()

↓

O(log n)

get()

↓

O(log n)

remove()

↓

O(log n)
```

Reason

Balanced Tree.

---

# 18. Real World Use Cases

TreeMap is commonly used for

* Leaderboards
* Ranking Systems
* Scheduling
* Calendar Applications
* Banking Transactions
* Time-Series Data
* Price Sorting
* Dictionary Applications
* Range Queries
* Auto Complete Systems

---

# 19. Why TreeMap Exists?

HashMap provides

```text
Fast Lookup
```

but

No Ordering.

LinkedHashMap provides

```text
Insertion Order
```

but

No Sorting.

TreeMap provides

```text
Automatic

Sorted Order
```

using a

```text
Red-Black Tree.
```

---

# Reality Check

## ❌ Common Misconception

Many developers think

```text
TreeMap

=

Binary Search Tree
```

This is **not completely correct**.

TreeMap uses

```text
Red-Black Tree

↓

Self-Balancing

Binary Search Tree
```

which guarantees

```text
O(log n)
```

operations.

---

# Important Notes

* Uses Red-Black Tree.
* Self-Balancing Binary Search Tree.
* Automatically sorts keys.
* Supports Comparable.
* Supports Comparator.
* No Hashing.
* No Buckets.
* No Linked Lists.
* Null Keys are not allowed (Natural Ordering).
* Duplicate Keys are not allowed.
* Duplicate Values are allowed.
* Average complexity is O(log n).
* Ideal for sorted data and range-based queries.



# Optimized Overrides

Although `TreeMap` inherits many methods from `Map`, `SortedMap`, and `NavigableMap`,

it provides optimized implementations using a **Red-Black Tree**.

The following methods are internally optimized.

```java
put()

get()

remove()

containsKey()

containsValue()

firstKey()

lastKey()

higherKey()

lowerKey()

ceilingKey()

floorKey()

pollFirstEntry()

pollLastEntry()

subMap()

headMap()

tailMap()

descendingMap()

descendingKeySet()

navigableKeySet()

clone()

forEach()

replaceAll()

compute()

computeIfAbsent()

computeIfPresent()

merge()
```

Internally these methods use

* Red-Black Tree
* Tree Traversal
* Tree Rotation
* Comparator
* Comparable

instead of

* Hash Table
* Buckets
* Linked List

---

# Methods Not Covered Yet

The following methods exist inside the JDK implementation but are considered internal implementation details.

```java
compare()

getEntry()

getFirstEntry()

getLastEntry()

successor()

predecessor()

rotateLeft()

rotateRight()

fixAfterInsertion()

fixAfterDeletion()

buildFromSorted()

exportEntrySet()
```

These methods are package-private or internal helper methods.

They are mainly useful when studying the OpenJDK source code.

---

# Important Notes

* Extends `AbstractMap`.
* Implements `NavigableMap`.
* Automatically inherits `SortedMap` and `Map`.
* Uses a **Red-Black Tree**.
* Automatically sorts keys.
* Supports **Natural Ordering** (`Comparable`).
* Supports **Custom Ordering** (`Comparator`).
* Duplicate keys are **not allowed**.
* Duplicate values are allowed.
* Null keys are not allowed when using natural ordering.
* Null values are allowed.
* Provides efficient range queries.
* Average lookup, insertion, and removal are **O(log n)**.

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| TreeMap() | O(1) | O(1) |
| TreeMap(Comparator) | O(1) | O(1) |
| TreeMap(Map) | O(n log n) | O(n) |
| TreeMap(SortedMap) | O(n) *(optimized build)* | O(n) |
| clone() | O(n) | O(n) |

---

## Basic Operations

| Operation | Time Complexity |
|-----------|----------------:|
| put() | O(log n) |
| get() | O(log n) |
| remove() | O(log n) |
| containsKey() | O(log n) |
| containsValue() | O(n) |
| firstKey() | O(log n) |
| lastKey() | O(log n) |
| higherKey() | O(log n) |
| lowerKey() | O(log n) |
| ceilingKey() | O(log n) |
| floorKey() | O(log n) |

---

## Range Operations

| Operation | Time Complexity |
|-----------|----------------:|
| headMap() | O(log n) |
| tailMap() | O(log n) |
| subMap() | O(log n) |
| descendingMap() | O(1) *(view creation)* |
| navigableKeySet() | O(1) *(view creation)* |

> **Note:** Creating the view is O(1), but iterating over its elements takes O(n).

---

# Frequently Asked Interview Questions

## Q1. Which interface does TreeMap implement?

```java
NavigableMap
```

---

## Q2. Which interfaces are inherited indirectly?

```text
SortedMap

↓

Map
```

---

## Q3. Which data structure does TreeMap use?

```text
Red-Black Tree
```

---

## Q4. Is TreeMap a Binary Search Tree?

Not exactly.

TreeMap uses a

```text
Self-Balancing

Red-Black Tree
```

which is a specialized Binary Search Tree.

---

## Q5. Why not use a normal Binary Search Tree?

Because a normal BST can become skewed,

leading to

```text
O(n)
```

search time.

---

## Q6. Why is TreeMap always balanced?

Because the Red-Black Tree performs

* Recoloring
* Left Rotation
* Right Rotation

after insertions and deletions.

---

## Q7. Does TreeMap use hashing?

No.

TreeMap performs comparisons,

not hashing.

---

## Q8. How are keys compared?

Using either

```java
compareTo()
```

or

```java
Comparator.compare()
```

---

## Q9. Does TreeMap allow duplicate keys?

No.

Existing values are replaced.

---

## Q10. Does TreeMap allow duplicate values?

Yes.

---

## Q11. Does TreeMap allow null keys?

Using natural ordering,

No.

A `NullPointerException` is thrown.

---

## Q12. Does TreeMap allow null values?

Yes.

---

## Q13. What is Natural Ordering?

Sorting performed using

```java
Comparable
```

and its

```java
compareTo()
```

method.

---

## Q14. What is Custom Ordering?

Sorting performed using

```java
Comparator
```

and its

```java
compare()
```

method.

---

## Q15. Which is faster?

```text
HashMap

↓

O(1)

TreeMap

↓

O(log n)
```

HashMap is generally faster for lookups.

---

## Q16. When should TreeMap be preferred?

Use TreeMap when:

* Sorted data is required.
* Range queries are frequent.
* Navigation methods are needed.
* Ordering matters more than raw lookup speed.

---

## Q17. What is the difference between firstKey() and firstEntry()?

* `firstKey()` returns only the key.
* `firstEntry()` returns the complete `Map.Entry`.

---

## Q18. What is the difference between ceilingKey() and higherKey()?

* `ceilingKey()` returns **equal or greater**.
* `higherKey()` returns **strictly greater**.

---

## Q19. What type of copy does clone() create?

```text
Shallow Copy
```

---

## Q20. Which applications commonly use TreeMap?

Examples include:

* Leaderboards
* Scheduling Systems
* Calendar Applications
* Stock Price Tracking
* Banking Systems
* Auto-complete
* Time-series Data
* Range-based Searching

---

# Summary

* `TreeMap` is the primary implementation of `NavigableMap`.
* Uses a **Red-Black Tree** internally.
* Automatically keeps keys sorted.
* Supports both **Natural Ordering** and **Custom Comparator**.
* Provides powerful navigation and range operations.
* Guarantees **O(log n)** lookup, insertion, and deletion.
* Ideal for applications that require ordered data and efficient range queries.