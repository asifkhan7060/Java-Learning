# Table of Contents

## Part 1 : ConcurrentMap Interface

1. What is ConcurrentMap?

2. ConcurrentMap Hierarchy

3. Features of ConcurrentMap

4. ConcurrentMap Implementation

   * ConcurrentHashMap

5. Difference Between Map and ConcurrentMap

6. Methods Available in ConcurrentMap Hierarchy

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

   **ConcurrentMap Methods**

   * putIfAbsent()
   * remove(key, value)
   * replace(key, value)
   * replace(key, oldValue, newValue)
   * compute()
   * computeIfAbsent()
   * computeIfPresent()
   * merge()
   * forEach()
   * replaceAll()
   * getOrDefault()

   **ConcurrentHashMap Specific Methods**

   * mappingCount()
   * newKeySet()
   * newKeySet(int initialCapacity)
   * keySet(V mappedValue)
   * search()
   * reduce()

   *Overall ConcurrentMap Method Hierarchy*

   *Important Notes*

7. Detailed ConcurrentMap Methods

   1. putIfAbsent()
   2. remove(key, value)
   3. replace(key, value)
   4. replace(key, oldValue, newValue)
   5. compute()
   6. computeIfAbsent()
   7. computeIfPresent()
   8. merge()
   9. forEach()
   10. replaceAll()
   11. getOrDefault()

8. Ways to Traverse a ConcurrentMap

   * entrySet()
   * keySet()
   * values()
   * Iterator
   * Enhanced For Loop
   * forEach()
   * Stream API

9. Interview Questions

---

# Java ConcurrentMap Interface

## What is ConcurrentMap?

`ConcurrentMap` is a child interface of the `Map` interface.

It is designed to provide **thread-safe access** to key-value pairs in concurrent (multi-threaded) applications.

Unlike a regular `Map`, `ConcurrentMap` introduces **atomic operations** that prevent race conditions when multiple threads simultaneously access or modify the same data.

It extends the `Map` interface by adding methods specifically designed for concurrent programming.

```java
public interface ConcurrentMap<K, V>
        extends Map<K, V>
```

---

# ConcurrentMap Hierarchy

```text
Map
 │
 ▼
ConcurrentMap
 │
 ▼
ConcurrentHashMap
```

---

# Features of ConcurrentMap

* Extends the `Map` interface.
* Designed for concurrent programming.
* Thread-safe by design.
* Supports concurrent read and write operations.
* Provides atomic update operations.
* High-performance alternative to `Hashtable`.
* Does not allow `null` keys.
* Does not allow `null` values.
* Supports Generics.
* Scales efficiently with multiple threads.

---

# ConcurrentMap Implementation

## 1. ConcurrentHashMap

### Description

* Primary implementation of `ConcurrentMap`.
* Uses bucket-level synchronization and CAS (Compare-And-Swap).
* Allows multiple threads to read and update different buckets simultaneously.
* Provides excellent scalability.
* Does not allow `null` keys or `null` values.

### Additional Methods

Although `ConcurrentHashMap` implements all methods of `ConcurrentMap`, it also provides several class-specific methods.

Some commonly used methods are:

* `mappingCount()`
* `newKeySet()`
* `newKeySet(int initialCapacity)`
* `keySet(V mappedValue)`
* `search()`
* `reduce()`

> These methods belong to the **ConcurrentHashMap class**, not to the **ConcurrentMap interface**, and are discussed in the `ConcurrentHashMap` section of this project.

### Example

```java
ConcurrentMap<Integer, String> map =
        new ConcurrentHashMap<>();
```

---

# Difference Between Map and ConcurrentMap

| Feature           | Map                       | ConcurrentMap |
| ----------------- | ------------------------- | ------------- |
| Thread Safe       | Depends on Implementation | ✅             |
| Atomic Operations | ❌                         | ✅             |
| Concurrent Read   | Depends                   | ✅             |
| Concurrent Write  | Depends                   | ✅             |
| Null Keys         | Depends                   | ❌             |
| Null Values       | Depends                   | ❌             |
| Best Use Case     | Single Thread             | Multi Thread  |


# Methods Available in ConcurrentMap Hierarchy

`ConcurrentMap` extends the `Map` interface.

It inherits all methods from `Map` and introduces additional **atomic operations** specifically designed for concurrent programming.

`ConcurrentHashMap`, being the primary implementation of `ConcurrentMap`, also provides a few **class-specific methods**.

---

## Map Methods (Inherited)

Implemented by:

* ConcurrentHashMap

### Methods

```java
put(K key, V value)

putAll(Map<? extends K, ? extends V> m)

get(Object key)

remove(Object key)

replace(K key, V value)

containsKey(Object key)

containsValue(Object value)

keySet()

values()

entrySet()

size()

isEmpty()

clear()
```

### Purpose

* Insert mappings
* Update mappings
* Remove mappings
* Retrieve values
* Search keys and values
* Traverse the map

---

## ConcurrentMap Methods

Implemented by:

* ConcurrentHashMap

### Methods

```java
putIfAbsent(K key,
            V value)

remove(Object key,
       Object value)

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

* Perform atomic insertion
* Perform atomic replacement
* Perform atomic removal
* Compute values atomically
* Merge values safely
* Support lock-free concurrent updates

---

## ConcurrentHashMap Specific Methods

Available only in:

* ConcurrentHashMap

### Common Methods

```java
mappingCount()

newKeySet()

newKeySet(int initialCapacity)

keySet(V mappedValue)

search()

reduce()
```

### Purpose

* Count mappings using `long`
* Create concurrent key sets
* Perform parallel search operations
* Perform parallel reduction operations

> These methods belong to the **ConcurrentHashMap** class and are explained in its own `Hierarchy.md` and `Implementation.java`.

---

# Overall ConcurrentMap Method Hierarchy

```text
Map
│
├── put()
├── putAll()
├── get()
├── remove()
├── replace()
├── containsKey()
├── containsValue()
├── keySet()
├── values()
├── entrySet()
├── size()
├── isEmpty()
└── clear()

        │
        ▼

ConcurrentMap
│
├── putIfAbsent()
├── remove(key, value)
├── replace(key, oldValue, newValue)
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
├── merge()
├── forEach()
├── replaceAll()
└── getOrDefault()

        │
        ▼

ConcurrentHashMap
│
├── mappingCount()
├── newKeySet()
├── newKeySet(int)
├── keySet(mappedValue)
├── search()
└── reduce()
```

---

# Important Notes

* `ConcurrentMap` extends the `Map` interface.
* It inherits all methods defined in `Map`.
* It introduces **atomic methods** for concurrent programming.
* `ConcurrentHashMap` is the primary implementation of `ConcurrentMap`.
* `ConcurrentHashMap` also provides additional class-specific methods.
* `ConcurrentMap` does not allow `null` keys or `null` values.
* It offers significantly better scalability than `Hashtable`.
* Modern multithreaded Java applications generally prefer `ConcurrentHashMap` over `Hashtable`.

---

# Detailed ConcurrentMap Methods

The following sections explain every method introduced by the **ConcurrentMap** interface.

Each method includes:

* Description
* Syntax
* Example
* Output (where applicable)

---

# ConcurrentMap Methods

# ConcurrentMap Methods

The following methods are introduced by the **ConcurrentMap** interface.

These methods provide **atomic operations**, allowing multiple threads to safely access and modify the map without explicit synchronization.

---

## 1. putIfAbsent()

Associates the specified value with the specified key only if the key is not already present.

### Syntax

```java
V putIfAbsent(K key,
              V value)
```

### Example

```java
ConcurrentMap<Integer, String> map =
        new ConcurrentHashMap<>();

map.put(1, "Java");

map.putIfAbsent(1, "Python");

System.out.println(map);
```

### Output

```text
{1=Java}
```

---

## 2. remove(key, value)

Removes the entry only if both the key and value match.

### Syntax

```java
boolean remove(Object key,
               Object value)
```

### Example

```java
map.remove(
        1,
        "Java");

System.out.println(map);
```

### Output

```text
{}
```

---

## 3. replace(key, oldValue, newValue)

Replaces the value only if the current value matches the specified old value.

### Syntax

```java
boolean replace(K key,
                V oldValue,
                V newValue)
```

### Example

```java
map.put(1, "Java");

map.replace(
        1,
        "Java",
        "Spring");

System.out.println(map);
```

### Output

```text
{1=Spring}
```

---

## 4. compute()

Computes a new value for the specified key atomically.

### Syntax

```java
V compute(K key,
          BiFunction)
```

### Example

```java
map.compute(
        1,
        (k, v) -> v + " Boot");

System.out.println(map);
```

### Output

```text
{1=Spring Boot}
```

---

## 5. computeIfAbsent()

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
{1=Spring Boot, 2=Python}
```

---

## 6. computeIfPresent()

Computes a new value only if the key already exists.

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
{1=Spring Boot, 2=Python 3}
```

---

## 7. merge()

Merges an existing value with a new value atomically.

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
{1=Spring Boot, 2=Python 3 Tutorial}
```

---

## 8. forEach()

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
                        k + " = " + v));
```

### Output

```text
1 = Spring Boot
2 = Python 3 Tutorial
```

---

## 9. replaceAll()

Replaces all values using the specified function atomically.

### Syntax

```java
void replaceAll(BiFunction)
```

### Example

```java
map.replaceAll(
        (k, v) ->
                v.toUpperCase());

System.out.println(map);
```

### Output

```text
{1=SPRING BOOT, 2=PYTHON 3 TUTORIAL}
```

---

## 10. getOrDefault()

Returns the value associated with the specified key, or the supplied default value if the key does not exist.

### Syntax

```java
V getOrDefault(Object key,
               V defaultValue)
```

### Example

```java
System.out.println(
        map.getOrDefault(
                10,
                "Not Found"));
```

### Output

```text
Not Found
```

---

# Ways to Traverse a ConcurrentMap

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

### Q1. Why was `ConcurrentMap` introduced?

To provide thread-safe and atomic operations for concurrent applications.

---

### Q2. Which class is the primary implementation of `ConcurrentMap`?

`ConcurrentHashMap`.

---

### Q3. Why doesn't `ConcurrentMap` allow `null` keys or values?

To avoid ambiguity during concurrent operations.

---

### Q4. Which method performs an atomic "insert if absent" operation?

`putIfAbsent()`.

---

### Q5. What is the advantage of `computeIfAbsent()`?

It computes and inserts a value atomically only when the key is missing.

---

### Q6. Which method combines an existing value with a new value?

`merge()`.

---

### Q7. Is `ConcurrentMap` suitable for multi-threaded applications?

Yes. It is specifically designed for concurrent programming.

---

### Q8. Which implementation should be preferred over `Hashtable`?

`ConcurrentHashMap`.

# Understanding ConcurrentMap Internals

Unlike a normal `Map`, which is primarily designed for single-threaded environments, `ConcurrentMap` is specifically built for **safe and efficient concurrent access**.

Its primary goal is to allow **multiple threads** to read and modify data simultaneously without corrupting the internal data structure.

The standard implementation of `ConcurrentMap` is **ConcurrentHashMap**.

---

# Why Do We Need ConcurrentMap?

Suppose multiple threads are updating a shared `HashMap`.

```text
Thread A

↓

put(101, "Java")


Thread B

↓

remove(101)
```

Since `HashMap` is **not thread-safe**, both operations may execute simultaneously.

Possible results:

* Race Condition
* Lost Updates
* Data Corruption
* Inconsistent Reads

`ConcurrentMap` prevents these problems by providing atomic operations.

---

# Problems with HashMap in Multithreading

Consider two threads.

```text
Thread A

↓

put(10, "Java")


Thread B

↓

put(20, "Python")
```

Both modify the internal hash table simultaneously.

Possible issues:

* Race Condition
* Corrupted Buckets
* Lost Mappings
* Unpredictable Results

Therefore,

```text
HashMap

↓

Not Thread Safe
```

---

# Problems with Hashtable

Before Java 5,

developers commonly used

```text
Hashtable
```

It achieved thread safety by synchronizing **every method**.

Example

```text
Thread A

↓

put()


Thread B

↓

get()

↓

Blocked
```

Advantages

* Thread Safe

Disadvantages

* Entire table is locked
* Low Throughput
* Poor Scalability
* High Lock Contention

---

# Why ConcurrentHashMap?

`ConcurrentHashMap` was introduced to overcome the limitations of both `HashMap` and `Hashtable`.

It provides:

* Thread Safety
* High Performance
* Better Scalability
* Atomic Operations

Instead of locking the entire map, it allows multiple threads to work on different buckets simultaneously.

Result

```text
Fast

+

Thread Safe

+

Highly Scalable
```

---

# Internal Working Overview

```text
Application Threads

        │

        ▼

ConcurrentHashMap

        │

        ▼

Hash Table

        │

        ▼

Multiple Buckets

        │

        ▼

Independent Concurrent Access
```

Different threads can safely access different buckets simultaneously.

---

# Bucket-Level Locking

Unlike `Hashtable`,

`ConcurrentHashMap` does **not** lock the complete map.

Instead,

it locks only the bucket being modified.

```text
Bucket 1

Thread A


Bucket 5

Thread B


Bucket 8

Thread C
```

All three threads can proceed concurrently without blocking each other.

---

# CAS (Compare-And-Swap)

Modern `ConcurrentHashMap` uses

```text
CAS
(Compare-And-Swap)
```

for many update operations.

Working

```text
Read Current Value

↓

Compare Expected Value

↓

Still Same?

↓

Yes

↓

Replace

↓

Done
```

This avoids unnecessary locking and improves performance.

---

# Thread Safety

`ConcurrentMap` guarantees

```text
Safe Read

+

Safe Write

+

Atomic Update
```

Multiple threads can safely access the same map simultaneously without corrupting the data.

---

# Read and Write Operations

Read operations generally occur without locking.

```text
Thread A

↓

get()


Thread B

↓

get()


Thread C

↓

put()
```

This allows excellent read performance even while writes are occurring.

---

# Resize Mechanism

When the internal table becomes sufficiently full,

`ConcurrentHashMap` automatically resizes itself.

Unlike older synchronized implementations,

resizing is performed with minimal blocking, allowing other threads to continue accessing the map.

---

# Internal Data Structure

Modern `ConcurrentHashMap` internally uses a **Hash Table**.

Representation

```text
Bucket

0 → Node

1 → Node

2 → Node

3 → TreeNode (Heavy Collision)

4 → Node
```

When many collisions occur,

a bucket may be converted into a balanced tree to improve lookup performance.

---

# Performance Comparison

| Operation   | HashMap | Hashtable | ConcurrentHashMap |
| ----------- | ------- | --------- | ----------------- |
| get()       | O(1)*   | O(1)*     | O(1)*             |
| put()       | O(1)*   | O(1)*     | O(1)*             |
| remove()    | O(1)*   | O(1)*     | O(1)*             |
| Thread Safe | ❌       | ✅         | ✅                 |
| Scalability | Poor    | Poor      | Excellent         |

*Average Case

---

# Memory Comparison

| Implementation    | Memory Usage    |
| ----------------- | --------------- |
| HashMap           | Lowest          |
| Hashtable         | Medium          |
| ConcurrentHashMap | Slightly Higher |

Extra memory is used to support concurrent operations.

---

# Decision Flow

```text
Single Thread?

        │
       Yes
        │
        ▼
     HashMap


Multiple Threads?

        │
       Yes
        │
        ▼
ConcurrentHashMap


Need Legacy Synchronization?

        │
       Yes
        │
        ▼
    Hashtable
```

---

# When Should You Choose ConcurrentMap?

### Use ConcurrentHashMap

* Multi-threaded applications
* Web servers
* Banking systems
* Session management
* Shared caches
* API rate limiters
* Concurrent counters

Avoid when

* Only one thread accesses the map.

---

# Summary

* `ConcurrentMap` extends the `Map` interface.
* `ConcurrentHashMap` is its primary implementation.
* It provides thread-safe and atomic operations.
* It uses bucket-level synchronization and CAS.
* It scales much better than `Hashtable`.
* Read operations are highly concurrent.
* It is the preferred choice for modern concurrent Java applications.

# Practical Understanding of ConcurrentMap

Understanding the internal working of `ConcurrentMap` is important, but knowing **where** and **when** to use it is equally important.

This section focuses on practical applications, common mistakes, best practices, and interview-oriented concepts.

---

# Real World Examples

## 1. Banking System

Multiple users may access the same bank account simultaneously.

Thread-safe updates are required.

Recommended

```text
ConcurrentHashMap
```

---

## 2. Online Shopping Cart

Thousands of users add and remove products concurrently.

The shared inventory must remain consistent.

Recommended

```text
ConcurrentHashMap
```

---

## 3. Session Management

Web servers store active user sessions.

Many request-processing threads update session data simultaneously.

Recommended

```text
ConcurrentHashMap
```

---

## 4. Cache

Applications cache frequently accessed objects.

Multiple threads read and update the cache concurrently.

Recommended

```text
ConcurrentHashMap
```

---

## 5. API Rate Limiter

Maintain request counts for different users.

Counters are updated by multiple threads.

Recommended

```text
ConcurrentHashMap
```

---

## 6. Web Server Requests

Multiple request-processing threads share common application data.

Thread safety is essential.

Recommended

```text
ConcurrentHashMap
```

---

# DSA Selection Guide

## Thread-Safe Lookup

Need safe key-based searching from multiple threads.

Recommended

```text
ConcurrentHashMap
```

---

## Concurrent Updates

Multiple threads continuously insert, update, or remove entries.

Recommended

```text
ConcurrentHashMap
```

---

## High Read Performance

Applications perform many read operations with comparatively fewer writes.

Recommended

```text
ConcurrentHashMap
```

---

## Atomic Operations

Need operations like

```java
putIfAbsent()

compute()

computeIfAbsent()

merge()
```

Recommended

```text
ConcurrentHashMap
```

---

# Common Mistakes

## Mistake 1

Using

```text
HashMap
```

inside multiple threads.

Result

```text
Race Condition

Data Corruption

Lost Updates
```

---

## Mistake 2

Using

```text
Hashtable
```

for modern concurrent applications.

Although thread-safe,

it synchronizes every method, reducing scalability and performance.

---

## Mistake 3

Trying to store

```java
null
```

keys or values.

Wrong

```java
ConcurrentMap<Integer, String> map =
        new ConcurrentHashMap<>();

map.put(null, "Java");
```

Result

```text
NullPointerException
```

---

## Mistake 4

Using external synchronization around

```text
ConcurrentHashMap
```

This often removes its performance advantages.

---

## Mistake 5

Assuming a compound operation is automatically atomic.

Wrong

```java
if (!map.containsKey(key))
{
    map.put(key, value);
}
```

Correct

```java
map.putIfAbsent(key, value);
```

or

```java
map.computeIfAbsent(key,
        k -> value);
```

---

# Best Practices

* Prefer **ConcurrentHashMap** over `Hashtable`.
* Use `putIfAbsent()` instead of checking and then inserting.
* Use `compute()`, `computeIfAbsent()`, and `merge()` for atomic updates.
* Never store `null` keys or values.
* Prefer built-in concurrent methods over manual synchronization.
* Use immutable objects as keys whenever possible.

---

# Quick Revision Table

| Feature                | ConcurrentMap     |
| ---------------------- | ----------------- |
| Thread Safe            | ✅                 |
| Atomic Operations      | ✅                 |
| Null Keys              | ❌                 |
| Null Values            | ❌                 |
| High Read Performance  | ✅                 |
| High Write Performance | ✅                 |
| Primary Implementation | ConcurrentHashMap |

---

# When Should You Use ConcurrentMap?

```text
Need thread safety?

        │
       Yes
        │
        ▼
ConcurrentHashMap


Need maximum single-thread performance?

        │
       Yes
        │
        ▼
HashMap


Need legacy synchronized implementation?

        │
       Yes
        │
        ▼
Hashtable
```

---

# Advanced Interview Questions

### Q1. Why is `ConcurrentHashMap` preferred over `Hashtable`?

Because it provides much better concurrency and scalability by locking only the required portions of the map instead of the entire map.

---

### Q2. Why doesn't `ConcurrentHashMap` allow `null` keys or values?

Because it would become impossible to distinguish between:

* A missing key
* A key explicitly mapped to `null`

during concurrent operations.

---

### Q3. What is the main advantage of `putIfAbsent()`?

It performs the check-and-insert operation atomically.

---

### Q4. Is `ConcurrentHashMap` completely lock-free?

No.

It uses **CAS (Compare-And-Swap)** for many operations and bucket-level synchronization when required.

---

### Q5. Can multiple threads read from a `ConcurrentHashMap` simultaneously?

Yes.

Read operations are highly concurrent and generally do not block one another.

---

### Q6. Which implementation should be used for multithreaded applications?

```java
ConcurrentHashMap
```

---

### Q7. Does `ConcurrentMap` maintain insertion order?

No.

If ordering is required, another implementation should be chosen.

---

### Q8. What happens when many collisions occur?

Buckets may be converted into balanced trees to improve lookup performance.

---

# One-Line Revision

* **ConcurrentMap** → Thread-safe Map with atomic operations.
* **ConcurrentHashMap** → High-performance implementation of ConcurrentMap.

---

# Key Takeaways

* `ConcurrentMap` extends the `Map` interface.
* `ConcurrentHashMap` is its primary implementation.
* It provides atomic methods for concurrent programming.
* It scales much better than `Hashtable`.
* It does not allow `null` keys or `null` values.
* It is the preferred choice for modern multithreaded Java applications.

---

# Final Summary

`ConcurrentMap` extends the `Map` interface to support **safe and efficient concurrent access** to key-value pairs.

Its primary implementation, **ConcurrentHashMap**, combines **thread safety**, **high performance**, and **atomic operations**, making it the preferred choice for modern Java applications that involve multiple threads.
