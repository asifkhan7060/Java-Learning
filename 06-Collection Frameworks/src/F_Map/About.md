# Table of Contents

## Part 1 : Map Interface

1. What is Map?

2. Map Hierarchy

3. Features of Map

4. Types of Map Implementations

    * HashMap
    * LinkedHashMap
    * TreeMap
    * Hashtable
    * WeakHashMap
    * IdentityHashMap
    * EnumMap
    * ConcurrentHashMap

5. Difference Between Map Implementations

6. Methods Available in Map Hierarchy

    * Map Interface Methods
    * Additional Methods Provided by SortedMap
    * Additional Methods Provided by NavigableMap
    * Additional Methods Provided by ConcurrentMap
    * Overall Map Method Hierarchy
    * Important Notes

7. Ways to Traverse a Map

    * entrySet()
    * keySet()
    * values()
    * Iterator
    * Enhanced For Loop
    * Stream API
    * forEach()

8. Interview Questions

---

# Java Map Interface

## What is Map?

`Map` is one of the core interfaces of the **Java Collections Framework** used to store data in the form of **Key-Value pairs**.

Unlike `Collection`, which stores individual elements, a `Map` stores a **unique key** associated with a corresponding **value**.

Each key acts as a unique identifier that allows fast retrieval, insertion, updating, and deletion of values.

> **Important:** Although `Map` is a part of the Java Collections Framework, it **does not extend the `Collection` interface** because its structure and behavior are fundamentally different.

```java
public interface Map<K, V>
```

---

# Map Hierarchy

```text
                         Map
                          │
      ┌──────────────┬────┴──────────────┬──────────────┐
      │              │                   │              │
      ▼              ▼                   ▼              ▼
  HashMap      Hashtable          SortedMap     ConcurrentMap
      │                                 │              │
      ▼                                 ▼              ▼
LinkedHashMap                    NavigableMap   ConcurrentHashMap
                                          │
                                          ▼
                                       TreeMap
```

---

# Features of Map

* Stores data as **Key-Value pairs**
* Duplicate Keys are **Not Allowed**
* Duplicate Values are **Allowed**
* Each key maps to only one value
* Dynamic Size
* Supports Generics
* Fast Key-Based Lookup
* Does Not Support Index-Based Access
* Traversal using `entrySet()`, `keySet()`, `values()`, `Iterator`, `forEach()`, and Streams
* Ordering depends on the implementation
* Thread safety depends on the implementation
* Null key/value support depends on the implementation

---

# Types of Map Implementations

## 1. HashMap

### Description

* Internally uses a Hash Table
* Does NOT maintain insertion order
* Allows one null key and multiple null values
* Fastest general-purpose Map implementation

### Example

```java
Map<Integer, String> map =
        new HashMap<>();
```

---

## 2. LinkedHashMap

### Description

* Internally uses Hash Table + Doubly Linked List
* Maintains insertion order
* Allows one null key and multiple null values
* Slightly slower than HashMap

### Example

```java
Map<Integer, String> map =
        new LinkedHashMap<>();
```

---

## 3. TreeMap

### Description

* Internally uses a Red-Black Tree
* Maintains sorted order of keys
* Implements SortedMap and NavigableMap
* Does NOT allow null keys

### Example

```java
Map<Integer, String> map =
        new TreeMap<>();
```

---

## 4. Hashtable

### Description

* Legacy synchronized Map implementation
* Thread-safe
* Does NOT allow null keys or null values
* Slower because every method is synchronized

### Example

```java
Map<Integer, String> map =
        new Hashtable<>();
```

---

## 5. WeakHashMap

### Description

* Stores keys as Weak References
* Entries are automatically removed after Garbage Collection
* Mainly used for caches

### Example

```java
Map<Object, String> map =
        new WeakHashMap<>();
```

---

## 6. IdentityHashMap

### Description

* Compares keys using `==`
* Ignores `equals()`
* Specialized implementation based on reference equality

### Example

```java
Map<String, Integer> map =
        new IdentityHashMap<>();
```

---

## 7. EnumMap

### Description

* Designed specifically for Enum keys
* Very fast and memory efficient
* Maintains the natural order of Enum constants

### Example

```java
Map<Day, String> map =
        new EnumMap<>(Day.class);
```

---

## 8. ConcurrentHashMap

### Description

* Thread-safe Map implementation
* Supports concurrent access by multiple threads
* High-performance alternative to Hashtable
* Does NOT allow null keys or null values

### Example

```java
ConcurrentMap<Integer, String> map =
        new ConcurrentHashMap<>();
```

---

# Difference Between Map Implementations

| Feature | HashMap | LinkedHashMap | TreeMap | Hashtable | WeakHashMap | IdentityHashMap | EnumMap | ConcurrentHashMap |
|---------|---------|---------------|---------|-----------|-------------|-----------------|---------|-------------------|
| Internal Structure | Hash Table | Hash Table + Linked List | Red-Black Tree | Hash Table | Hash Table | Hash Table | Array | Hash Table |
| Ordering | ❌ | Insertion | Sorted | ❌ | ❌ | ❌ | Enum Order | ❌ |
| Null Key | One | One | ❌ | ❌ | One | One | ❌ | ❌ |
| Null Values | Yes | Yes | Yes | ❌ | Yes | Yes | Yes | ❌ |
| Thread Safe | ❌ | ❌ | ❌ | ✅ | ❌ | ❌ | ❌ | ✅ |
| Average Search | O(1) | O(1) | O(log n) | O(1) | O(1) | O(1) | O(1) | O(1) |
| Best Use Case | General Purpose | Ordered Data | Sorted Data | Legacy Code | Cache | Reference Equality | Enum Keys | Concurrent Applications |


# Methods Available in Map Hierarchy

Unlike the `Collection` interface, the `Map` interface defines its own methods because it stores data as **Key-Value pairs** instead of individual elements.

Additional methods are introduced by **SortedMap**, **NavigableMap**, and **ConcurrentMap**.

---

## Map Interface Methods

Implemented by:

* HashMap
* LinkedHashMap
* TreeMap
* Hashtable
* WeakHashMap
* IdentityHashMap
* EnumMap
* ConcurrentHashMap

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

* Insert new mappings
* Update existing mappings
* Remove mappings
* Retrieve values using keys
* Search keys and values
* Traverse key-value pairs
* Perform atomic computations
* Merge values

---

## Additional Methods Provided by SortedMap

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
* Access a portion of the map
* Retrieve the Comparator used for sorting

---

## Additional Methods Provided by NavigableMap

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
* Retrieve nearest entries
* Remove first or last entries
* Traverse in reverse order
* Perform inclusive or exclusive range operations

---

## Additional Methods Provided by ConcurrentMap

Implemented by:

* ConcurrentHashMap

### Methods

```java
putIfAbsent(K key,
            V value)

remove(Object key,
       Object value)

replace(K key,
        V value)

replace(K key,
        V oldValue,
        V newValue)

compute(K key,
        BiFunction)

computeIfAbsent(K key,
                Function)

computeIfPresent(K key,
                 BiFunction)

merge(K key,
      V value,
      BiFunction)

forEach(BiConsumer)

replaceAll(BiFunction)

getOrDefault(Object key,
             V defaultValue)
```

### Purpose

* Perform atomic insertions
* Perform atomic replacements
* Perform atomic removals
* Compute values safely
* Merge values safely
* Support concurrent programming

---

# Overall Map Method Hierarchy

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
├── firstKey()
├── lastKey()
├── headMap()
├── tailMap()
├── subMap()
└── comparator()

        │
        ▼

NavigableMap
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
├── subMap(..., boolean, ..., boolean)
├── headMap(..., boolean)
└── tailMap(..., boolean)

        │
        ▼

ConcurrentMap
├── putIfAbsent()
├── remove(key, value)
├── replace(key, value)
├── replace(key, oldValue, newValue)
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
├── merge()
├── forEach()
├── replaceAll()
└── getOrDefault()
```

---

# Important Notes

* `Map` is **not** a child of the `Collection` interface.
* Every Map implementation inherits these methods.
* `SortedMap` introduces methods for maintaining **sorted keys**.
* `NavigableMap` extends `SortedMap` by adding **navigation methods**.
* `ConcurrentMap` extends `Map` by adding **atomic thread-safe methods**.
* `TreeMap` implements both `SortedMap` and `NavigableMap`.
* `ConcurrentHashMap` is the primary implementation of `ConcurrentMap`.

---

# Detailed Map Methods

The following methods are defined in the **Map** interface.

Each method includes its purpose, syntax, example, and output (where applicable).

---

## 1. put()

Associates the specified value with the specified key.

If the key already exists, the old value is replaced.

### Syntax

```java
V put(K key, V value)
```

### Example

```java
Map<Integer, String> map = new HashMap<>();

map.put(1, "Java");
map.put(2, "Python");

System.out.println(map);
```

### Output

```text
{1=Java, 2=Python}
```

---

## 2. putAll()

Copies all mappings from another Map.

### Syntax

```java
void putAll(Map<? extends K, ? extends V> m)
```

### Example

```java
Map<Integer, String> map1 = new HashMap<>();
map1.put(1, "Java");

Map<Integer, String> map2 = new HashMap<>();
map2.put(2, "Python");

map1.putAll(map2);

System.out.println(map1);
```

### Output

```text
{1=Java, 2=Python}
```

---

## 3. putIfAbsent()

Associates the specified value only if the key is not already present.

### Syntax

```java
V putIfAbsent(K key, V value)
```

### Example

```java
map.putIfAbsent(1, "Spring");

System.out.println(map);
```

### Output

```text
{1=Java, 2=Python}
```

---

## 4. get()

Returns the value associated with the specified key.

### Syntax

```java
V get(Object key)
```

### Example

```java
System.out.println(map.get(1));
```

### Output

```text
Java
```

---

## 5. getOrDefault()

Returns the mapped value or the specified default value if the key is absent.

### Syntax

```java
V getOrDefault(Object key, V defaultValue)
```

### Example

```java
System.out.println(
        map.getOrDefault(5, "Unknown"));
```

### Output

```text
Unknown
```

---

## 6. remove()

Removes the mapping associated with the specified key.

### Syntax

```java
V remove(Object key)
```

### Example

```java
map.remove(1);

System.out.println(map);
```

### Output

```text
{2=Python}
```

---

## 7. remove(key, value)

Removes the mapping only if both the key and value match.

### Syntax

```java
boolean remove(Object key,
               Object value)
```

### Example

```java
map.remove(2, "Python");

System.out.println(map);
```

### Output

```text
{}
```

---

## 8. replace()

Replaces the value associated with the specified key.

### Syntax

```java
V replace(K key, V value)
```

### Example

```java
map.put(1, "Java");

map.replace(1, "Spring");

System.out.println(map);
```

### Output

```text
{1=Spring}
```

---

## 9. replace(key, oldValue, newValue)

Replaces the value only if the current value matches.

### Syntax

```java
boolean replace(K key,
                V oldValue,
                V newValue)
```

### Example

```java
map.replace(
        1,
        "Spring",
        "Hibernate");

System.out.println(map);
```

### Output

```text
{1=Hibernate}
```

---

## 10. replaceAll()

Replaces every value using the specified function.

### Syntax

```java
void replaceAll(BiFunction)
```

### Example

```java
map.replaceAll(
        (k, v) -> v.toUpperCase());

System.out.println(map);
```

### Output

```text
{1=HIBERNATE}
```

---

## 11. containsKey()

Checks whether the specified key exists.

### Syntax

```java
boolean containsKey(Object key)
```

### Example

```java
System.out.println(
        map.containsKey(1));
```

### Output

```text
true
```

---

## 12. containsValue()

Checks whether the specified value exists.

### Syntax

```java
boolean containsValue(Object value)
```

### Example

```java
System.out.println(
        map.containsValue("HIBERNATE"));
```

### Output

```text
true
```

---

## 13. keySet()

Returns a `Set` containing all keys.

### Syntax

```java
Set<K> keySet()
```

### Example

```java
System.out.println(
        map.keySet());
```

### Output

```text
[1]
```

---

## 14. values()

Returns a `Collection` containing all values.

### Syntax

```java
Collection<V> values()
```

### Example

```java
System.out.println(
        map.values());
```

### Output

```text
[HIBERNATE]
```

---

## 15. entrySet()

Returns a `Set` containing all key-value mappings.

### Syntax

```java
Set<Map.Entry<K, V>> entrySet()
```

### Example

```java
System.out.println(
        map.entrySet());
```

### Output

```text
[1=HIBERNATE]
```

---

## 16. forEach()

Performs the given action for each key-value mapping.

### Syntax

```java
void forEach(BiConsumer)
```

### Example

```java
map.forEach(
        (k, v) ->
                System.out.println(
                        k + " : " + v));
```

### Output

```text
1 : HIBERNATE
```

---

## 17. compute()

Computes a new value for the specified key.

### Syntax

```java
V compute(K key,
          BiFunction)
```

### Example

```java
map.compute(
        1,
        (k, v) -> v + " Framework");

System.out.println(map);
```

### Output

```text
{1=HIBERNATE Framework}
```

---

## 18. computeIfAbsent()

Computes a value only if the key is absent.

### Syntax

```java
V computeIfAbsent(K key,
                  Function)
```

### Example

```java
map.computeIfAbsent(
        2,
        k -> "Python");

System.out.println(map);
```

### Output

```text
{1=HIBERNATE Framework, 2=Python}
```

---

## 19. computeIfPresent()

Computes a value only if the key is already present.

### Syntax

```java
V computeIfPresent(K key,
                   BiFunction)
```

### Example

```java
map.computeIfPresent(
        2,
        (k, v) -> "Python 3");

System.out.println(map);
```

### Output

```text
{1=HIBERNATE Framework, 2=Python 3}
```

---

## 20. merge()

Merges an existing value with a new value.

### Syntax

```java
V merge(K key,
        V value,
        BiFunction)
```

### Example

```java
map.merge(
        2,
        " Tutorial",
        (oldVal, newVal) ->
                oldVal + newVal);

System.out.println(map);
```

### Output

```text
{1=HIBERNATE Framework, 2=Python 3 Tutorial}
```

---

## 21. clear()

Removes all mappings from the Map.

### Syntax

```java
void clear()
```

### Example

```java
map.clear();

System.out.println(map);
```

### Output

```text
{}
```

---

## 22. size()

Returns the number of key-value mappings.

### Syntax

```java
int size()
```

### Example

```java
System.out.println(
        map.size());
```

### Output

```text
0
```

---

## 23. isEmpty()

Checks whether the Map contains any mappings.

### Syntax

```java
boolean isEmpty()
```

### Example

```java
System.out.println(
        map.isEmpty());
```

### Output

```text
true
```


Unlike `Collection`, the `Map` interface itself introduces many methods because it stores **Key-Value pairs**.

Additional methods are provided by:

- SortedMap
- NavigableMap
- ConcurrentMap

The following sections explain every method available in the **Map hierarchy** with its:

- Description
- Syntax
- Example
- Output (where applicable)

---

# Ways to Traverse a Map

## 1. Using entrySet()

```java
for (Map.Entry<Integer, String> entry : map.entrySet())
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

## 6. Using Stream API

```java
map.entrySet()
   .stream()
   .forEach(System.out::println);
```

---

## 7. Using forEach()

```java
map.forEach(
        (k, v) ->
                System.out.println(
                        k + " = " + v));
```

---

# Interview Questions

### Q1. Is Map a child of Collection?

No. `Map` is part of the Java Collections Framework but does **not** extend the `Collection` interface.

---

### Q2. Why are duplicate keys not allowed?

Each key uniquely identifies one value. A duplicate key replaces the previous value.

---

### Q3. Which Map implementation is the fastest?

`HashMap` provides the best average-case performance for general-purpose use.

---

### Q4. Which Map maintains insertion order?

`LinkedHashMap`.

---

### Q5. Which Map maintains sorted order?

`TreeMap`.

---

### Q6. Which Map is thread-safe?

`ConcurrentHashMap` is the preferred thread-safe implementation. `Hashtable` is also thread-safe but considered a legacy class.

---

### Q7. Which Map allows null keys?

`HashMap`, `LinkedHashMap`, `WeakHashMap`, and `IdentityHashMap` allow one null key.

---

### Q8. Which Map is best for Enum keys?

`EnumMap`.

---

### Q9. What is the difference between HashMap and IdentityHashMap?

`HashMap` compares keys using `equals()`, whereas `IdentityHashMap` compares keys using the `==` operator.

---

### Q10. What is the primary implementation of ConcurrentMap?

`ConcurrentHashMap`.

# Understanding Map Internals

Unlike the `Collection` interface, a `Map` stores data as **Key-Value pairs** instead of individual elements.

Each key acts as a unique identifier, allowing values to be retrieved efficiently.

Different implementations use different internal data structures, making each suitable for specific use cases.

---

# Why Do We Need Map?

Suppose we store student marks using a `List`.

```text
Student 1 → 85

Student 2 → 90

Student 3 → 78
```

Finding the marks of a particular student requires searching the entire list.

Instead, using a `Map`:

```text
Aman  → 85

Rahul → 90

Riya  → 78
```

Now,

```java
marks.get("Rahul");
```

returns the value immediately.

Maps provide **fast key-based lookup**.

---

# Why Multiple Map Implementations?

Different applications have different requirements.

Some require

* Fast lookup

Others require

* Insertion order

Others require

* Sorted order

Others require

* Thread safety

Hence Java provides multiple implementations.

| Requirement | Recommended Map |
|-------------|-----------------|
| Fast Lookup | HashMap |
| Insertion Order | LinkedHashMap |
| Sorted Keys | TreeMap |
| Thread Safety | ConcurrentHashMap |
| Enum Keys | EnumMap |
| Weak References | WeakHashMap |

---

# Internal Working Overview

```text
Key + Value

      │

      ▼

hashCode()

      │

      ▼

Bucket Selection

      │

      ▼

Store Entry

      │

      ▼

Retrieve using Key
```

Every Map implementation follows this concept, although the internal data structure differs.

---

# Key-Value Pair Concept

Every entry inside a Map consists of

```text
Key

↓

Value
```

Example

```java
101  →  Aman

102  →  Rahul

103  →  Riya
```

The key uniquely identifies its value.

---

# Hashing Basics

Most Map implementations rely on **hashing**.

The process is

```text
Key

↓

hashCode()

↓

Bucket Index

↓

Store Entry
```

Hashing enables constant-time lookup in most cases.

---

# hashCode()

Every object in Java provides a

```java
hashCode()
```

method.

Example

```java
String name = "Java";

System.out.println(
        name.hashCode());
```

The generated hash code determines the bucket in which the entry is stored.

---

# Bucket Concept

A bucket is simply a location inside the hash table.

Example

```text
Bucket 0

Bucket 1

Bucket 2

Bucket 3

Bucket 4
```

Keys having similar hash values may fall into the same bucket.

---

# equals()

When multiple keys fall into the same bucket,

Java uses

```java
equals()
```

to identify the correct key.

Working

```text
hashCode()

↓

Same Bucket

↓

equals()

↓

Correct Entry Found
```

---

# Collision

Collision occurs when two different keys generate the same bucket.

Example

```text
Key A

↓

Bucket 3


Key B

↓

Bucket 3
```

Java stores both entries inside the same bucket.

Modern implementations use linked structures and balanced trees to manage collisions efficiently.

---

# Ordering in Map

## HashMap

```text
Random Order
```

---

## LinkedHashMap

```text
Insertion Order
```

---

## TreeMap

```text
Sorted Order
```

---

# Internal Data Structures

| Implementation | Internal Structure |
|----------------|--------------------|
| HashMap | Hash Table |
| LinkedHashMap | Hash Table + Doubly Linked List |
| TreeMap | Red-Black Tree |
| Hashtable | Hash Table |
| ConcurrentHashMap | Concurrent Hash Table |

---

# Performance Comparison

| Implementation | Search | Insert | Delete |
|---------------|--------|--------|--------|
| HashMap | O(1)* | O(1)* | O(1)* |
| LinkedHashMap | O(1)* | O(1)* | O(1)* |
| TreeMap | O(log n) | O(log n) | O(log n) |
| Hashtable | O(1)* | O(1)* | O(1)* |
| ConcurrentHashMap | O(1)* | O(1)* | O(1)* |

\*Average Case

---

# Memory Comparison

| Implementation | Memory Usage |
|----------------|--------------|
| HashMap | Low |
| LinkedHashMap | Medium |
| TreeMap | Medium |
| Hashtable | Medium |
| ConcurrentHashMap | Higher |

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

Need Thread Safety?

        │
       Yes
        │
        ▼
ConcurrentHashMap

Need Enum Keys?

        │
       Yes
        │
        ▼
    EnumMap

Need Weak References?

        │
       Yes
        │
        ▼
 WeakHashMap
```

---

# When Should You Choose Which Map?

### Use HashMap

* General-purpose applications
* Fast lookup
* Best overall performance

---

### Use LinkedHashMap

* Need insertion order
* LRU Cache
* Predictable iteration

---

### Use TreeMap

* Sorted keys
* Range queries
* Navigation operations

---

### Use Hashtable

* Legacy synchronized code

---

### Use WeakHashMap

* Cache implementations
* Temporary mappings

---

### Use IdentityHashMap

* Reference equality required

---

### Use EnumMap

* Enum keys only
* Maximum performance

---

### Use ConcurrentHashMap

* Multi-threaded applications
* High concurrency
* Atomic operations

---

# Summary

* `Map` stores data as **Key-Value pairs**.
* Keys are always unique.
* Different implementations provide different behaviors.
* `HashMap` is the most commonly used implementation.
* `LinkedHashMap` maintains insertion order.
* `TreeMap` maintains sorted order.
* `ConcurrentHashMap` provides thread safety with high performance.
* Choose the implementation based on ordering, concurrency, and performance requirements.

# Practical Understanding of Map

Understanding the internal working of `Map` is important, but knowing **when** and **where** to use each implementation is equally important.

This section focuses on practical applications, common mistakes, best practices, and interview-oriented concepts.

---

# Real World Examples

## 1. Student Database

Each student has a unique Roll Number.

```text
101 → Aman

102 → Rahul

103 → Riya
```

Recommended

```text
HashMap
```

---

## 2. Employee Records

Each employee has a unique Employee ID.

```text
EMP101 → Mohan

EMP102 → Anil

EMP103 → Neha
```

Recommended

```text
HashMap
```

---

## 3. Dictionary

Every word is associated with its meaning.

```text
Apple

↓

A Fruit
```

Recommended

```text
TreeMap
```

because words remain sorted alphabetically.

---

## 4. Cache

Applications store frequently accessed data.

```text
UserID

↓

Profile
```

Recommended

```text
LinkedHashMap

or

WeakHashMap
```

---

## 5. Phone Contacts

Each phone number belongs to one person.

```text
9876543210

↓

Rahul
```

Recommended

```text
HashMap
```

---

## 6. Product Catalog

Products remain sorted by Product ID.

Recommended

```text
TreeMap
```

---

## 7. Word Frequency Counter

Example

```text
Java

↓

15

Python

↓

9
```

Recommended

```text
HashMap
```

---

# DSA Selection Guide

## Fast Lookup

Need constant-time searching.

Recommended

```text
HashMap
```

---

## Ordered Data

Need insertion order.

Recommended

```text
LinkedHashMap
```

---

## Sorted Data

Need sorted keys.

Recommended

```text
TreeMap
```

---

## Thread-Safe Access

Multiple threads access the Map.

Recommended

```text
ConcurrentHashMap
```

---

## Enum Keys

Keys belong to an Enum.

Recommended

```text
EnumMap
```

---

## Garbage Collection Sensitive Data

Need automatic removal of unused keys.

Recommended

```text
WeakHashMap
```

---

# Common Mistakes

## Mistake 1

Expecting HashMap to preserve insertion order.

Wrong

```text
HashMap
```

Correct

```text
LinkedHashMap
```

---

## Mistake 2

Using TreeMap without Comparable or Comparator.

Result

```text
ClassCastException
```

---

## Mistake 3

Using mutable objects as keys.

Changing the key after insertion may make retrieval impossible.

---

## Mistake 4

Using Hashtable for modern applications.

Instead use

```text
ConcurrentHashMap
```

---

## Mistake 5

Assuming duplicate keys are stored.

Example

```java
map.put(1, "Java");

map.put(1, "Python");
```

Result

```text
{1=Python}
```

Old value gets replaced.

---

# Best Practices

* Prefer `HashMap` for general-purpose applications.
* Use immutable objects as keys.
* Override both `equals()` and `hashCode()` correctly for custom key classes.
* Use `LinkedHashMap` when insertion order matters.
* Use `TreeMap` when sorted data is required.
* Use `ConcurrentHashMap` for multithreaded applications.
* Avoid using `Hashtable` in new projects.

---

# Quick Revision Table

| Requirement | Recommended Map |
|-------------|-----------------|
| Fast Lookup | HashMap |
| Maintain Insertion Order | LinkedHashMap |
| Sorted Keys | TreeMap |
| Thread Safety | ConcurrentHashMap |
| Enum Keys | EnumMap |
| Weak References | WeakHashMap |
| Reference Equality | IdentityHashMap |

---

# Which Map Should I Choose?

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

Need Thread Safety?

        │
       Yes
        │
        ▼
ConcurrentHashMap

Need Enum Keys?

        │
       Yes
        │
        ▼
    EnumMap

Need Weak References?

        │
       Yes
        │
        ▼
 WeakHashMap

Need Reference Equality?

        │
       Yes
        │
        ▼
IdentityHashMap
```

---

# Advanced Interview Questions

### Q1. Is `Map` a child of `Collection`?

No. It is part of the Java Collections Framework but does **not** extend the `Collection` interface.

---

### Q2. Why are duplicate keys not allowed?

A key uniquely identifies one value. Inserting the same key again replaces the previous value.

---

### Q3. Which Map implementation is the fastest?

`HashMap` provides the best average-case performance for general-purpose use.

---

### Q4. Which Map maintains insertion order?

`LinkedHashMap`.

---

### Q5. Which Map maintains sorted order?

`TreeMap`.

---

### Q6. Which Map is thread-safe?

`ConcurrentHashMap` is the preferred thread-safe implementation.

---

### Q7. Which Map allows one null key?

`HashMap`, `LinkedHashMap`, `WeakHashMap`, and `IdentityHashMap`.

---

### Q8. Which Map is best for Enum keys?

`EnumMap`.

---

### Q9. What is the difference between HashMap and IdentityHashMap?

`HashMap` compares keys using `equals()`, whereas `IdentityHashMap` compares keys using `==`.

---

### Q10. Why is ConcurrentHashMap preferred over Hashtable?

Because it provides better concurrency and higher performance.

---

# One-Line Revision

* **Map** → Stores data as **Key-Value pairs**.
* **HashMap** → Fastest general-purpose implementation.
* **LinkedHashMap** → Maintains insertion order.
* **TreeMap** → Maintains sorted order.
* **ConcurrentHashMap** → High-performance thread-safe implementation.

---

# Key Takeaways

* `Map` stores unique keys and associated values.
* Duplicate keys replace existing values.
* Different implementations provide different ordering and concurrency guarantees.
* `HashMap` is the default choice for most applications.
* `LinkedHashMap` maintains insertion order.
* `TreeMap` keeps keys sorted.
* `ConcurrentHashMap` is recommended for concurrent applications.
* Select the implementation based on ordering, performance, and thread-safety requirements.

---

# Final Summary

The `Map` interface is one of the most powerful components of the Java Collections Framework. It enables efficient storage and retrieval of data using **Key-Value pairs**, making it ideal for dictionaries, caches, databases, configuration settings, session management, and countless other real-world applications.

By understanding the strengths of each implementation—`HashMap`, `LinkedHashMap`, `TreeMap`, `ConcurrentHashMap`, `WeakHashMap`, `IdentityHashMap`, and `EnumMap`—you can choose the most appropriate Map implementation for any scenario, leading to better performance, cleaner code, and more maintainable applications.


