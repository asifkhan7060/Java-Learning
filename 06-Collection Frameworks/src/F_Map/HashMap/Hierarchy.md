# HashMap Method Hierarchy

## Overview

`HashMap` is the most widely used implementation of the `Map` interface in the Java Collections Framework.

It stores data as **Key-Value pairs**, where each key is unique and maps to exactly one value.

Internally, `HashMap` uses a **Hash Table** that combines an array with linked lists (or Red-Black Trees in Java 8+) to provide fast insertion, retrieval, and deletion operations.

It provides:

* Key-Value Storage
* Fast Lookup Operations
* Fast Insert Operations
* Fast Delete Operations
* One Null Key Allowed
* Multiple Null Values Allowed
* Duplicate Keys Not Allowed
* Duplicate Values Allowed
* Unordered Storage
* Dynamic Resizing
* High Performance

Since `HashMap` implements the `Map` interface, it automatically inherits methods from:

* `Map`

Additionally, `HashMap` provides its own constructors, optimized implementations, and utility methods.

---

# Class Declaration

```java
public class HashMap<K,V>
        extends AbstractMap<K,V>
        implements Map<K,V>, Cloneable, Serializable
```

---

# Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
HashMap
```

---

# Interface Relationship

```text
Map
 ↑
HashMap
```

---

# Complete HashMap Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
HashMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ HashMap()
├── ✅ HashMap(int initialCapacity)
├── ✅ HashMap(int initialCapacity,
│              float loadFactor)
└── ✅ HashMap(Map<? extends K,
                ? extends V> m)

│
├──────────────────────────────────────────────
│ Methods Inherited from Map
├──────────────────────────────────────────────
│
├── ✅ put(K key,V value)
├── ✅ putAll(Map<? extends K,? extends V> m)
│
├── ✅ get(Object key)
├── ✅ getOrDefault()
│
├── ✅ remove(Object key)
├── ✅ remove(Object key,Object value)
├── ✅ clear()
│
├── ✅ containsKey()
├── ✅ containsValue()
│
├── ✅ size()
├── ✅ isEmpty()
│
├── ✅ keySet()
├── ✅ values()
├── ✅ entrySet()
│
├── ✅ equals(Object o)
├── ✅ hashCode()
│
├── ✅ forEach()
├── ✅ replace()
├── ✅ replaceAll()
├── ✅ putIfAbsent()
├── ✅ compute()
├── ✅ computeIfAbsent()
├── ✅ computeIfPresent()
└── ✅ merge()

│
├──────────────────────────────────────────────
│ HashMap Specific Public Methods
├──────────────────────────────────────────────
│
└── ✅ clone()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ put()
├── ✅ get()
├── ✅ remove()
├── ✅ containsKey()
├── ✅ containsValue()
├── ✅ clone()
├── ✅ keySet()
├── ✅ values()
├── ✅ entrySet()
├── ✅ forEach()
├── ✅ replaceAll()
├── ✅ compute()
├── ✅ computeIfAbsent()
├── ✅ computeIfPresent()
├── ✅ merge()
├── ✅ equals()
└── ✅ hashCode()

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

# Understanding the Hierarchy

The methods available in a `HashMap` object come from different levels of the Java Collections Framework.

## 1. Constructors

These belong directly to the `HashMap` class.

They are used to create `HashMap` objects and are **not inherited**.

```java
HashMap()

HashMap(int initialCapacity)

HashMap(int initialCapacity,
        float loadFactor)

HashMap(Map<? extends K, ? extends V> m)
```

These constructors allow developers to control the initial capacity, load factor, or create a new `HashMap` from an existing map.

---

## 2. Methods Inherited from Map

Since

```java
HashMap implements Map
```

every `HashMap` object automatically inherits all methods defined in the `Map` interface.

These methods are responsible for:

* Adding Key-Value Pairs
* Updating Existing Values
* Removing Entries
* Searching Keys
* Searching Values
* Traversing Entries
* Collection Views

Examples:

* put()
* putAll()
* get()
* getOrDefault()
* remove()
* containsKey()
* containsValue()
* keySet()
* values()
* entrySet()

---

## 3. HashMap Specific Methods

The following public method belongs specifically to the `HashMap` class.

```java
clone()
```

It creates a **Shallow Copy** of the current `HashMap`.

The constructors also belong directly to the `HashMap` class.

Unlike methods inherited from `Map`, these constructors are available only in the `HashMap` class.

---

## 4. Optimized Overrides

Several inherited methods are internally optimized by `HashMap`.

Examples:

* put()
* get()
* remove()
* containsKey()
* containsValue()
* clone()
* keySet()
* values()
* entrySet()
* equals()
* hashCode()

Internally, these methods use:

* Hash Table
* Buckets
* Hashing
* Linked List
* Red-Black Tree (Java 8+)

to provide efficient storage and retrieval.

---

## 5. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore,

a `HashMap` object can also use methods like:

* toString()
* getClass()
* wait()
* notify()
* notifyAll()

These methods belong to the `Object` class and are **not specific to the Collection Framework**.

---

# Part 2 : HashMap Specific Methods

---

## 1. HashMap()

Creates an empty `HashMap`.

### Syntax

```java
HashMap<K, V> map = new HashMap<>();
```

### Example

```java
HashMap<Integer, String> students =
        new HashMap<>();
```

### Purpose

* Creates an empty HashMap.
* Most commonly used constructor.
* Automatically resizes as entries are added.

### Note

Default Initial Capacity

```text
16
```

Default Load Factor

```text
0.75
```

---

## 2. HashMap(int initialCapacity)

Creates an empty `HashMap` with the specified initial capacity.

### Syntax

```java
HashMap<K, V> map =
        new HashMap<>(100);
```

### Example

```java
HashMap<Integer, String> employees =
        new HashMap<>(100);
```

### Purpose

Useful when the approximate number of entries is already known.

Reduces resizing operations.

### Note

Capacity and Size are different.

```text
Capacity → Number of Buckets

Size → Number of Stored Entries
```

---

## 3. HashMap(int initialCapacity, float loadFactor)

Creates an empty `HashMap` with the specified initial capacity and load factor.

### Syntax

```java
HashMap<K, V> map =
        new HashMap<>(64, 0.75f);
```

### Example

```java
HashMap<Integer, String> products =
        new HashMap<>(64, 0.75f);
```

### Purpose

Allows developers to control the resize threshold.

Useful in memory-sensitive applications.

### Note

Threshold Formula

```text
Threshold

=

Capacity × Load Factor
```

Example

```text
Capacity = 16

Load Factor = 0.75

Threshold = 12
```

---

## 4. HashMap(Map<? extends K, ? extends V> m)

Creates a `HashMap` containing all mappings from another map.

### Syntax

```java
HashMap<K, V> map =
        new HashMap<>(existingMap);
```

### Example

```java
HashMap<Integer, String> original =
        new HashMap<>();

original.put(1, "Java");
original.put(2, "Python");

HashMap<Integer, String> copy =
        new HashMap<>(original);
```

### Purpose

* Copies all mappings.
* Original map remains unchanged.
* Frequently used for creating a duplicate map.

---

## 5. clone()

Creates a **Shallow Copy** of the current `HashMap`.

### Syntax

```java
Object clone()
```

### Example

```java
HashMap<Integer, String> copy =
        (HashMap<Integer, String>) original.clone();
```

### Purpose

Creates another `HashMap` containing the same mappings.

### Note

`clone()` returns an `Object`.

Therefore,

type casting is required.

```java
(HashMap<Integer, String>) map.clone();
```

---

### Shallow Copy

`clone()` copies the `HashMap` object,

but the stored objects are **not cloned**.

Example

```text
Original HashMap

↓

1 → Java

↓

Clone HashMap

↓

1 → Java
```

Both maps reference the same objects.

Therefore,

modifying a mutable object inside one map may affect the other map.


# Internal HashMap Concepts

Understanding the following concepts is essential because they determine the performance, memory usage, and internal working of a `HashMap`.

---

## 1. Capacity

Capacity is the total number of buckets available inside the internal Hash Table.

Example

```text
Capacity = 16
```

This does **not** mean that 16 key-value pairs are stored.

It simply means that the internal table currently contains **16 buckets**.

### Note

The default capacity of a newly created `HashMap` is

```text
16
```

Capacity always remains a **power of two**.

Examples

```text
16

32

64

128

256
```

---

## 2. Size

Size represents the actual number of key-value mappings stored inside the map.

Example

```text
Capacity = 16

Size = 5
```

Only five mappings currently exist.

### Note

```text
Capacity

↓

Number of Buckets

Size

↓

Number of Stored Entries
```

---

## 3. Load Factor

Load Factor determines how full the Hash Table is allowed to become before resizing occurs.

Formula

```text
Load Factor

=

Size / Capacity
```

Default Value

```text
0.75
```

### Why 0.75?

It provides an excellent balance between

* Performance
* Memory Usage

Smaller values waste memory.

Larger values increase collisions.

---

## 4. Threshold

Threshold is the maximum number of mappings that can be inserted before resizing begins.

Formula

```text
Threshold

=

Capacity × Load Factor
```

Example

```text
Capacity = 16

Load Factor = 0.75

Threshold = 12
```

When the **13th element** is inserted,

HashMap automatically resizes.

---

## 5. Hashing

Hashing converts a key into a bucket index.

Flow

```text
Key

↓

hashCode()

↓

Hash Function

↓

Bucket Index

↓

Store Entry
```

This enables constant-time lookup in most situations.

---

## 6. hashCode()

Every Java object inherits

```java
hashCode()
```

from the `Object` class.

It generates an integer hash value.

Example

```java
String language = "Java";

System.out.println(language.hashCode());
```

Output

```text
2301506
```

### Purpose

HashMap uses the hash code to determine the appropriate bucket.

---

## 7. equals()

Sometimes different objects produce identical hash codes.

Therefore,

HashMap also calls

```java
equals()
```

to verify actual key equality.

Flow

```text
hashCode()

↓

Same Bucket

↓

equals()

↓

Correct Entry
```

Both `hashCode()` and `equals()` must work together.

---

## 8. Bucket

A bucket is a storage location inside the Hash Table.

Example

```text
Bucket 0

Bucket 1

Bucket 2

Bucket 3
```

Every mapping is stored inside one of these buckets.

---

## 9. Hash Collision

A collision occurs when two different keys produce the same bucket index.

Example

```text
Key A

↓

Bucket 5

Key B

↓

Bucket 5
```

Both entries occupy the same bucket.

Collisions are normal.

---

## 10. Separate Chaining

Before Java 8,

collisions were handled using a Linked List.

Example

```text
Bucket

↓

Java

↓

Python

↓

Spring
```

Every new entry was attached to the existing list.

---

## 11. Treeification (Java 8+)

If too many entries accumulate inside one bucket,

the Linked List is converted into a **Red-Black Tree**.

Condition

```text
Bucket Size ≥ 8

AND

Capacity ≥ 64
```

Example

Before

```text
Bucket

↓

Linked List
```

After

```text
Bucket

↓

Red-Black Tree
```

### Purpose

Improves lookup performance.

Worst-case complexity becomes

```text
O(log n)
```

instead of

```text
O(n)
```

---

## 12. Untreeification

When the number of entries inside a tree becomes small,

HashMap converts it back into a Linked List.

Condition

```text
Tree Size ≤ 6
```

This saves memory.

---

## 13. Resizing

When the threshold is exceeded,

HashMap doubles its capacity.

Example

Before

```text
16
```

After

```text
32
```

All entries are redistributed into the new buckets.

---

## 14. Rehashing

After resizing,

every existing entry is recalculated and placed into its new bucket.

Flow

```text
Old Bucket

↓

Resize

↓

New Bucket
```

This process is called **Rehashing**.

---

## 15. Why Capacity is Always a Power of Two?

Examples

```text
16

32

64

128
```

Using powers of two allows bucket calculation through efficient bitwise operations instead of slower modulo calculations.

Benefits

* Faster bucket computation
* Better key distribution
* Improved performance

---

## 16. Why Default Capacity is 16?

A capacity of

```text
16
```

provides a good balance between:

* Memory Usage
* Performance
* Number of Resizes

A smaller capacity causes frequent resizing.

A larger capacity wastes memory.

---

## 17. Why Treeify at 8?

Research showed that having **8 or more entries** in one bucket is rare under a good hash distribution.

Converting to a Red-Black Tree at this point improves worst-case lookup performance while avoiding unnecessary memory overhead for smaller buckets.

---

## 18. Why Untreeify at 6?

When entries decrease to **6 or fewer**, maintaining a Red-Black Tree becomes less efficient than a Linked List.

Converting back saves memory and reduces tree maintenance overhead.

---

## 19. Why Minimum Capacity 64 for Treeification?

HashMap treeifies a bucket **only if the overall table capacity is at least 64**.

If the capacity is smaller,

it prefers **resizing** rather than creating a tree.

Reason:

Increasing the table size usually redistributes entries and reduces collisions naturally.

---

## 20. modCount

`HashMap` internally maintains a field called

```java
modCount
```

It counts structural modifications.

Examples

* put()
* remove()
* clear()

Every structural modification increments `modCount`.

This is used by iterators to detect concurrent modifications.

---

## 21. Fail-Fast Iterator

The iterator returned by `HashMap` is **Fail-Fast**.

If the map is structurally modified after the iterator is created,

the iterator throws

```text
ConcurrentModificationException
```

Example

```text
Thread A

↓

Iterator Created

↓

Thread B

↓

put()

↓

ConcurrentModificationException
```

This behavior helps detect programming errors during iteration.


# Optimized Overrides

Although many methods are inherited from the `Map` interface,

`HashMap` provides highly optimized implementations for better performance.

The following methods are internally optimized:

```java
put()

get()

remove()

containsKey()

containsValue()

clone()

keySet()

values()

entrySet()

forEach()

replaceAll()

compute()

computeIfAbsent()

computeIfPresent()

merge()

equals()

hashCode()
```

Internally these methods use:

* Hash Table
* Hashing
* Buckets
* Linked List
* Red-Black Tree (Java 8+)
* Rehashing
* Dynamic Resizing

instead of performing linear searches.

---

# Methods Not Covered Yet

The following internal methods exist inside the JDK implementation,

but are not intended for normal application development.

```java
hash()

tableSizeFor()

resize()

treeifyBin()

untreeify()

putVal()

newNode()

replacementNode()

afterNodeAccess()

afterNodeInsertion()

afterNodeRemoval()

comparableClassFor()

compareComparables()

removeNode()
```

These methods are package-private or protected implementation details and are mainly useful when studying the JDK source code.

---

# Important Notes

* Constructors are **not inherited**.
* HashMap implements the `Map` interface.
* Stores data as Key-Value pairs.
* Keys must be unique.
* Duplicate values are allowed.
* One null key is allowed.
* Multiple null values are allowed.
* Does **not** maintain insertion order.
* Does **not** maintain sorting order.
* Not synchronized.
* Not thread-safe.
* Uses a Hash Table internally.
* Handles collisions using Linked Lists or Red-Black Trees.
* Automatically resizes when the threshold is exceeded.
* Iterators are **Fail-Fast**.
* `clone()` creates a **Shallow Copy**.

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| HashMap() | O(1) | O(1) |
| HashMap(int) | O(1) | O(n) |
| HashMap(int,float) | O(1) | O(n) |
| HashMap(Map) | O(n) | O(n) |
| clone() | O(n) | O(n) |

---

## Common Operations (Average Case)

| Operation | Time Complexity |
|-----------|----------------:|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |
| containsKey() | O(1) |
| containsValue() | O(n) |
| clear() | O(n) |
| iterator() | O(n) |

---

## Worst Case (Before Java 8)

| Operation | Complexity |
|-----------|-----------:|
| put() | O(n) |
| get() | O(n) |
| remove() | O(n) |

---

## Worst Case (Java 8+)

| Operation | Complexity |
|-----------|-----------:|
| put() | O(log n) |
| get() | O(log n) |
| remove() | O(log n) |

Reason

```text
Linked List

↓

Red-Black Tree
```

---

# Frequently Asked Interview Questions

## Q1. Which interface does HashMap implement?

```java
Map
```

---

## Q2. Which data structure does HashMap use internally?

```text
Hash Table
```

Internally it consists of

* Array
* Linked List
* Red-Black Tree (Java 8+)

---

## Q3. Why is the default capacity 16?

It provides a good balance between:

* Performance
* Memory Usage
* Number of Resizes

---

## Q4. Why is the default Load Factor 0.75?

Because it balances

* Collision Rate
* Memory Consumption

---

## Q5. Why must Capacity be a Power of Two?

To allow fast bucket calculation using bitwise operations.

---

## Q6. Difference between Capacity and Size?

```text
Capacity

↓

Buckets

Size

↓

Stored Entries
```

---

## Q7. Difference between Capacity and Threshold?

```text
Capacity

↓

Maximum Buckets

Threshold

↓

Resize Limit
```

---

## Q8. What is Hash Collision?

Two different keys producing the same bucket index.

---

## Q9. How are collisions handled?

Before Java 8

```text
Linked List
```

After Java 8

```text
Red-Black Tree
```

when the bucket size reaches **8** and the table capacity is at least **64**.

---

## Q10. Why Treeify at 8?

To improve lookup performance.

---

## Q11. Why Untreeify at 6?

To reduce memory overhead when few entries remain.

---

## Q12. Why Minimum Capacity 64?

Below 64,

resizing usually reduces collisions more effectively than treeification.

---

## Q13. Why is HashMap not Thread-Safe?

Because multiple threads can modify the internal Hash Table simultaneously,

leading to inconsistent data.

---

## Q14. Which Map should be used for Multi-threading?

```text
ConcurrentHashMap
```

---

## Q15. Can HashMap store Null Keys?

Yes.

Only **one** null key.

---

## Q16. Can HashMap store Null Values?

Yes.

Multiple null values are allowed.

---

## Q17. Does HashMap maintain insertion order?

No.

Use

```text
LinkedHashMap
```

if insertion order is required.

---

## Q18. Does HashMap maintain sorting?

No.

Use

```text
TreeMap
```

if sorted order is required.

---

## Q19. Why must equals() and hashCode() be overridden together?

Because HashMap first uses

```java
hashCode()
```

to locate the bucket,

and then

```java
equals()
```

to identify the exact key.

If only one of them is overridden,

HashMap may fail to retrieve stored objects correctly.

---

## Q20. What type of copy does clone() create?

```text
Shallow Copy
```

---

# Summary

* `HashMap` is the most commonly used implementation of the `Map` interface.
* Stores data as Key-Value pairs.
* Internally uses a **Hash Table** consisting of an array, linked lists, and Red-Black Trees.
* Provides average **O(1)** time complexity for most operations.
* Automatically handles collisions through chaining and treeification.
* Allows one null key and multiple null values.
* Does not maintain insertion order or sorting.
* Not thread-safe.
* Uses `hashCode()` and `equals()` together for key lookup.
* Provides automatic resizing for better performance.
* Forms the foundation for understanding other hash-based collections such as `HashSet`, `LinkedHashMap`, `Hashtable`, `WeakHashMap`, `IdentityHashMap`, and `ConcurrentHashMap`.