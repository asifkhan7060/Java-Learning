# Hashtable Method Hierarchy

## Overview

`Hashtable` is one of the oldest implementations of the `Map` interface in the Java Collections Framework.

It stores data as **Key-Value pairs**, where each key is unique and maps to exactly one value.

Unlike `HashMap`, every public method in `Hashtable` is **synchronized**, making it **Thread-Safe**.

Internally, `Hashtable` uses a **Hash Table** for storing entries and handles collisions using **Linked Lists**.

Since `Hashtable` was introduced before the Collections Framework (JDK 1.0), it is considered a **Legacy Class**.

It provides:

* Key-Value Storage
* Thread-Safe Operations
* Synchronized Methods
* Fast Lookup
* Fast Insertion
* Fast Deletion
* No Null Keys
* No Null Values
* Duplicate Keys Not Allowed
* Duplicate Values Allowed

Since `Hashtable` implements the `Map` interface, it automatically inherits methods from:

* `Map`

Additionally, `Hashtable` provides its own constructors, optimized implementations, and legacy utility methods.

---

# Class Declaration

```java
public class Hashtable<K,V>
        extends Dictionary<K,V>
        implements Map<K,V>,
                   Cloneable,
                   Serializable
```

---

# Inheritance Hierarchy

```text
Object
    ↑
Dictionary
    ↑
Hashtable
```

---

# Interface Relationship

```text
Map
 ↑
Hashtable
```

Unlike `HashMap`,

`Hashtable` extends the legacy `Dictionary` class.

---

# Complete Hashtable Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
Hashtable<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ Hashtable()
├── ✅ Hashtable(int initialCapacity)
├── ✅ Hashtable(int initialCapacity,
│                float loadFactor)
└── ✅ Hashtable(Map<? extends K,
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
│ Hashtable Specific Public Methods
├──────────────────────────────────────────────
│
├── ✅ clone()
├── ✅ keys()
└── ✅ elements()

│
├──────────────────────────────────────────────
│ Legacy Methods
├──────────────────────────────────────────────
│
├── ✅ contains(Object value)
└── 🔒 rehash()

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
├── ✅ equals()
├── ✅ hashCode()
├── ✅ forEach()
├── ✅ replaceAll()
├── ✅ compute()
├── ✅ computeIfAbsent()
├── ✅ computeIfPresent()
└── ✅ merge()

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

# Comparison with HashMap

| Feature | HashMap | Hashtable |
|----------|---------|------------|
| Thread Safe | ❌ No | ✅ Yes |
| Synchronization | ❌ No | ✅ Every public method |
| Null Key | ✅ One Allowed | ❌ Not Allowed |
| Null Value | ✅ Allowed | ❌ Not Allowed |
| Legacy Class | ❌ No | ✅ Yes |
| Introduced | Java 1.2 | JDK 1.0 |
| Parent Class | AbstractMap | Dictionary |
| Enumeration Support | ❌ No | ✅ Yes |
| Iterator | ✅ Yes | ✅ Yes |
| Performance | Faster | Slightly Slower |

---

# Key Takeaways

* `Hashtable` is a legacy implementation of the `Map` interface.
* It extends `Dictionary`, unlike `HashMap` which extends `AbstractMap`.
* Every public method is synchronized, making it thread-safe.
* `Hashtable` does **not** allow null keys or null values.
* Supports both **Iterator** and the legacy **Enumeration** interface.
* For modern concurrent applications, `ConcurrentHashMap` is generally preferred over `Hashtable`.


# Understanding the Hierarchy

The methods available in a `Hashtable` object come from different levels of the Java Collections Framework.

## 1. Constructors

These belong directly to the `Hashtable` class.

They are used to create `Hashtable` objects and are **not inherited**.

```java
Hashtable()

Hashtable(int initialCapacity)

Hashtable(int initialCapacity,
          float loadFactor)

Hashtable(Map<? extends K, ? extends V> m)
```

These constructors allow developers to create an empty table, specify the initial capacity, customize the load factor, or create a new `Hashtable` from an existing `Map`.

---

## 2. Methods Inherited from Map

Since

```java
Hashtable implements Map
```

every `Hashtable` object automatically inherits all methods defined in the `Map` interface.

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

Unlike `HashMap`,

every public method in `Hashtable` is **synchronized**.

---

## 3. Hashtable Specific Methods

The following methods belong specifically to the `Hashtable` class.

```java
clone()

keys()

elements()

contains(Object value)
```

These methods either provide legacy functionality or support thread-safe operations.

---

## 4. Legacy Methods

Before the Collections Framework,

`Hashtable` inherited behavior from the `Dictionary` class.

Some methods still exist today for backward compatibility.

Examples

```java
keys()

elements()

contains(Object value)
```

Although these methods still work,

modern applications generally prefer

```java
keySet()

values()

entrySet()

containsValue()
```

---

## 5. Optimized Overrides

Several inherited methods are internally optimized by `Hashtable`.

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

Unlike `HashMap`,

every public method acquires the object's monitor lock before executing.

This makes all operations thread-safe.

---

## 6. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore,

a `Hashtable` object can also use methods like:

* toString()
* getClass()
* wait()
* notify()
* notifyAll()

These methods belong to the `Object` class and are **not specific to the Collection Framework**.

---

# Part 2 : Hashtable Specific Methods

---

## 1. Hashtable()

Creates an empty `Hashtable`.

### Syntax

```java
Hashtable<K, V> table =
        new Hashtable<>();
```

### Example

```java
Hashtable<Integer, String> students =
        new Hashtable<>();
```

### Purpose

* Creates an empty Hashtable.
* Uses the default initial capacity.
* Uses the default load factor.

### Note

Default Initial Capacity

```text
11
```

Default Load Factor

```text
0.75
```

Unlike `HashMap`,

the default capacity is **11**, not **16**.

---

## 2. Hashtable(int initialCapacity)

Creates an empty `Hashtable` with the specified initial capacity.

### Syntax

```java
Hashtable<K, V> table =
        new Hashtable<>(100);
```

### Example

```java
Hashtable<Integer, String> products =
        new Hashtable<>(100);
```

### Purpose

Useful when the approximate number of entries is already known.

Reduces unnecessary rehashing.

---

## 3. Hashtable(int initialCapacity, float loadFactor)

Creates an empty `Hashtable` with the specified initial capacity and load factor.

### Syntax

```java
Hashtable<K, V> table =
        new Hashtable<>(64, 0.75f);
```

### Example

```java
Hashtable<Integer, String> employees =
        new Hashtable<>(64, 0.75f);
```

### Purpose

Allows developers to control when rehashing occurs.

### Note

Threshold Formula

```text
Threshold

=

Capacity × Load Factor
```

---

## 4. Hashtable(Map<? extends K, ? extends V> m)

Creates a `Hashtable` containing all mappings from another `Map`.

### Syntax

```java
Hashtable<K, V> table =
        new Hashtable<>(existingMap);
```

### Example

```java
HashMap<Integer, String> map =
        new HashMap<>();

map.put(1, "Java");
map.put(2, "Python");

Hashtable<Integer, String> table =
        new Hashtable<>(map);
```

### Purpose

Copies all mappings from another map.

The original map remains unchanged.

### Note

If the supplied map contains

```text
Null Key

or

Null Value
```

the constructor throws

```text
NullPointerException
```

because `Hashtable` does **not** permit null keys or null values.

---

## 5. clone()

Creates a **Shallow Copy** of the current `Hashtable`.

### Syntax

```java
Object clone()
```

### Example

```java
Hashtable<Integer, String> copy =
        (Hashtable<Integer, String>) table.clone();
```

### Purpose

Creates another `Hashtable` containing the same mappings.

### Note

`clone()` returns an `Object`.

Therefore,

type casting is required.

```java
(Hashtable<Integer, String>) table.clone();
```

---

## 6. keys()

Returns an `Enumeration` containing all keys.

### Syntax

```java
Enumeration<K> keys()
```

### Example

```java
Enumeration<Integer> keys =
        table.keys();
```

### Purpose

Allows traversal of all keys.

### Note

This is a **legacy method**.

Modern code usually prefers

```java
keySet()
```

---

## 7. elements()

Returns an `Enumeration` containing all values.

### Syntax

```java
Enumeration<V> elements()
```

### Example

```java
Enumeration<String> values =
        table.elements();
```

### Purpose

Allows traversal of all values.

### Note

This method also belongs to the legacy API.

Modern code generally uses

```java
values()
```

---

## 8. contains(Object value)

Checks whether a specified value exists inside the `Hashtable`.

### Syntax

```java
boolean contains(Object value)
```

### Example

```java
table.contains("Java");
```

### Purpose

Searches for a value.

### Note

This method is **deprecated in practice**.

Modern applications should use

```java
containsValue()
```

instead.

---

### Shallow Copy

`clone()` performs a **Shallow Copy**.

The `Hashtable` object is copied,

but the stored objects are **not cloned**.

Example

```text
Original Hashtable

↓

101 → Java

↓

Clone Hashtable

↓

101 → Java
```

Both tables reference the same stored objects.


# Internal Hashtable Concepts

Unlike `HashMap`,

the most important concepts of `Hashtable` are **Synchronization** and **Thread Safety**.

The hashing mechanism is almost identical to `HashMap`, but the way operations are executed is different.

---

## 1. Synchronization

Every public method of `Hashtable` is synchronized.

Example

```java
public synchronized V put(K key, V value)
```

```java
public synchronized V get(Object key)
```

```java
public synchronized V remove(Object key)
```

### Purpose

Allows only one thread to execute a modifying operation at a time.

This prevents data corruption in multi-threaded applications.

---

## 2. Monitor Lock

Synchronization is achieved using the object's **Monitor Lock**.

Example

```text
Thread A

↓

Hashtable

↓

Monitor Lock

↓

Operation Completed

↓

Lock Released

↓

Thread B
```

Only one thread can hold the monitor lock at any time.

---

## 3. Thread Safety

Because every public method is synchronized,

multiple threads can safely access the same `Hashtable`.

Example

```text
Thread A

↓

put()

↓

Safe

-------------------

Thread B

↓

get()

↓

Waits until lock
becomes available
```

### Note

Thread Safety comes at the cost of reduced performance.

---

## 4. Null Keys

`Hashtable` does **not** allow null keys.

Example

```java
table.put(null, "Java");
```

Output

```text
NullPointerException
```

---

## 5. Null Values

`Hashtable` also does **not** allow null values.

Example

```java
table.put(101, null);
```

Output

```text
NullPointerException
```

---

## 6. Capacity

Capacity represents the number of buckets available inside the hash table.

Default Capacity

```text
11
```

Unlike `HashMap`,

the historical default capacity is **11**.

---

## 7. Size

Size represents the number of stored key-value mappings.

Example

```text
Capacity = 11

Size = 4
```

Capacity and Size are different.

---

## 8. Load Factor

Load Factor determines when the table should grow.

Formula

```text
Size / Capacity
```

Default Value

```text
0.75
```

---

## 9. Threshold

Threshold determines when rehashing occurs.

Formula

```text
Capacity × Load Factor
```

Example

```text
Capacity = 11

Load Factor = 0.75

Threshold = 8
```

When the threshold is exceeded,

Hashtable performs **Rehashing**.

---

## 10. Rehashing

When the threshold is exceeded,

a larger hash table is created.

Existing entries are redistributed into the new table.

Flow

```text
Old Table

↓

Rehash

↓

New Table
```

Unlike `HashMap`,

the implementation grows approximately using

```text
New Capacity

=

Old Capacity × 2 + 1
```

Example

```text
11

↓

23

↓

47

↓

95
```

---

## 11. Hashing

Hashtable also uses hashing to determine the storage location.

Flow

```text
Key

↓

hashCode()

↓

Hash Function

↓

Bucket

↓

Store Entry
```

The hashing mechanism is conceptually similar to `HashMap`.

---

## 12. Collision Handling

When multiple keys map to the same bucket,

a collision occurs.

Hashtable handles collisions using

```text
Linked List
```

Unlike modern `HashMap`,

`Hashtable` does **not** convert buckets into Red-Black Trees.

---

## 13. Enumeration

One of the biggest differences from `HashMap`.

Hashtable supports

```java
Enumeration
```

Methods

```java
keys()

elements()
```

Example

```text
Hashtable

↓

keys()

↓

Enumeration
```

Enumeration existed before the Collections Framework.

---

## 14. Iterator

Hashtable also supports modern iterators.

Example

```java
entrySet().iterator()
```

Unlike Enumeration,

Iterator supports

```java
remove()
```

during iteration.

---

## 15. Fail-Fast Iterator

The iterators returned by

```java
entrySet()

keySet()

values()
```

are **Fail-Fast**.

If the table is structurally modified after the iterator is created,

it throws

```text
ConcurrentModificationException
```

---

## 16. Enumeration is NOT Fail-Fast

Unlike Iterator,

Enumeration does **not** detect concurrent modifications.

Example

```text
Enumeration

↓

Continues Traversal

↓

May reflect changes
```

This is one reason modern Java prefers Iterators.

---

## 17. Legacy Class

Hashtable belongs to the original Java collections introduced in

```text
JDK 1.0
```

It extends

```java
Dictionary
```

which is now considered obsolete.

Modern applications usually prefer

* HashMap
* ConcurrentHashMap

instead of Hashtable.

---

## 18. Performance

Because every public method is synchronized,

Hashtable is generally slower than HashMap.

Comparison

```text
HashMap

↓

No Synchronization

↓

Faster

--------------------

Hashtable

↓

Synchronization

↓

Slower
```

---

# Optimized Overrides

The following methods are inherited,

but `Hashtable` provides synchronized implementations.

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

Every public method acquires the monitor lock before execution.

---

# Methods Not Covered Yet

The following internal methods exist inside the JDK implementation.

```java
rehash()

addEntry()

remove()

contains()

writeObject()

readObject()
```

These methods are part of the internal implementation and are rarely used directly in application development.

---

# Important Notes

* `Hashtable` is a legacy collection.
* Extends `Dictionary`.
* Implements `Map`.
* Thread-Safe.
* Every public method is synchronized.
* Null Keys are **not allowed**.
* Null Values are **not allowed**.
* Duplicate Keys are **not allowed**.
* Duplicate Values are allowed.
* Supports both `Iterator` and `Enumeration`.
* Uses hashing internally.
* Handles collisions using Linked Lists.
* Performs automatic rehashing.
* Slower than `HashMap` because of synchronization.
* `clone()` creates a **Shallow Copy**.


# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| Hashtable() | O(1) | O(1) |
| Hashtable(int) | O(1) | O(n) |
| Hashtable(int,float) | O(1) | O(n) |
| Hashtable(Map) | O(n) | O(n) |
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
| keys() | O(n) |
| elements() | O(n) |

---

## Worst Case

| Operation | Time Complexity |
|-----------|----------------:|
| put() | O(n) |
| get() | O(n) |
| remove() | O(n) |

### Reason

Hashtable stores collided entries using

```text
Linked List
```

Unlike `HashMap`,

it does **not** convert buckets into a Red-Black Tree.

Therefore,

the worst-case complexity remains

```text
O(n)
```

---

# Frequently Asked Interview Questions

## Q1. Which interface does Hashtable implement?

```java
Map
```

---

## Q2. Which class does Hashtable extend?

```java
Dictionary
```

Unlike `HashMap`,

which extends

```java
AbstractMap
```

---

## Q3. Is Hashtable Thread-Safe?

Yes.

Every public method is synchronized.

---

## Q4. Why is Hashtable slower than HashMap?

Because every public method acquires a monitor lock before execution.

Synchronization introduces additional overhead.

---

## Q5. Does Hashtable allow Null Keys?

No.

Attempting to insert a null key throws

```text
NullPointerException
```

---

## Q6. Does Hashtable allow Null Values?

No.

Attempting to insert a null value also throws

```text
NullPointerException
```

---

## Q7. Can Hashtable store Duplicate Keys?

No.

Duplicate keys replace the previous value.

---

## Q8. Can Hashtable store Duplicate Values?

Yes.

Multiple keys may reference the same value.

---

## Q9. Which traversal mechanisms are supported?

Hashtable supports both

```java
Iterator
```

and

```java
Enumeration
```

---

## Q10. Difference between Iterator and Enumeration?

| Iterator | Enumeration |
|-----------|-------------|
| Introduced in Collections Framework | Legacy |
| Supports remove() | Does not support remove() |
| Fail-Fast | Not Fail-Fast |
| Preferred | Legacy Compatibility |

---

## Q11. What is Enumeration?

Enumeration is the legacy traversal interface introduced before the Collections Framework.

Methods

```java
hasMoreElements()

nextElement()
```

---

## Q12. What is Rehashing?

When the threshold is exceeded,

Hashtable creates a larger internal table and redistributes all existing entries.

---

## Q13. Does Hashtable use Red-Black Trees?

No.

Hashtable always uses

```text
Linked List
```

for collision handling.

---

## Q14. Which collection is recommended today?

For single-threaded applications

```text
HashMap
```

For multi-threaded applications

```text
ConcurrentHashMap
```

Modern applications rarely use

```text
Hashtable
```

---

## Q15. What type of copy does clone() create?

```text
Shallow Copy
```

---

## Q16. Is Hashtable Fail-Fast?

Its

```java
Iterator
```

is **Fail-Fast**.

Its

```java
Enumeration
```

is **not Fail-Fast**.

---

## Q17. Default Initial Capacity?

```text
11
```

---

## Q18. Default Load Factor?

```text
0.75
```

---

## Q19. How does Hashtable grow?

Unlike `HashMap`,

Hashtable grows approximately using

```text
(Old Capacity × 2) + 1
```

Example

```text
11

↓

23

↓

47

↓

95
```

---

## Q20. When should Hashtable be used?

Generally,

new applications should avoid `Hashtable`.

Use

```text
HashMap
```

or

```text
ConcurrentHashMap
```

depending on whether thread safety is required.

Hashtable is mainly encountered in

* Legacy Code
* Older Libraries
* Interview Questions

---

# Summary

* `Hashtable` is a legacy implementation of the `Map` interface.
* Extends the `Dictionary` class.
* Stores data as Key-Value pairs.
* Every public method is synchronized, making it thread-safe.
* Does **not** allow null keys or null values.
* Uses a Hash Table with Linked Lists for collision handling.
* Supports both modern `Iterator` and legacy `Enumeration`.
* Performs automatic rehashing when the threshold is exceeded.
* Provides average **O(1)** performance but is slower than `HashMap` due to synchronization.
* Modern Java applications generally prefer `HashMap` or `ConcurrentHashMap`.

