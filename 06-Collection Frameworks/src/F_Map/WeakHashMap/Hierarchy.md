# WeakHashMap Method Hierarchy

## Overview

`WeakHashMap` is a hash table-based implementation of the `Map` interface that stores its **keys using Weak References** instead of Strong References.

Unlike `HashMap`, entries in a `WeakHashMap` are **automatically removed** when their keys are no longer strongly reachable by the application.

Internally, `WeakHashMap` combines:

* Hash Table
* Weak References
* Reference Queue
* Garbage Collector

This allows it to automatically reclaim memory without requiring explicit removal of entries.

Unlike other `Map` implementations, the lifetime of an entry inside a `WeakHashMap` depends on the **Garbage Collector (GC)**.

It is commonly used for:

* Memory-Sensitive Caches
* Reflection Metadata
* ClassLoader Data
* Framework Internal Caches
* Image Caching

---

# Class Declaration

```java
public class WeakHashMap<K,V>
        extends AbstractMap<K,V>
        implements Map<K,V>
```

---

# Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
WeakHashMap
```

---

# Interface Relationship

```text
Map
 ↑
WeakHashMap
```

Unlike `TreeMap`,

there is no

```text
SortedMap

or

NavigableMap
```

between them.

---

# Relationship with HashMap

`WeakHashMap` and `HashMap` both implement the `Map` interface.

Both use

```text
Hash Table
```

internally.

However,

their reference types are completely different.

```text
HashMap

↓

Strong Reference

↓

Object survives
until explicitly removed

------------------------------------

WeakHashMap

↓

Weak Reference

↓

Garbage Collector

↓

Entry Removed
```

HashMap retains keys until

```java
remove()
```

or

```java
clear()
```

is called.

WeakHashMap may remove entries automatically.

---

# Relationship with WeakReference

Internally,

WeakHashMap stores keys as

```java
WeakReference<K>
```

instead of directly storing

```java
K
```

This means

```text
Application

↓

No Strong Reference

↓

GC Runs

↓

Weak Reference Cleared

↓

Entry Removed
```

---

# Relationship with Garbage Collector

WeakHashMap works closely with

```text
Garbage Collector
```

Whenever the JVM determines that a key object is

```text
Weakly Reachable
```

the corresponding entry becomes eligible for removal.

Unlike

```text
HashMap
```

developers do

not

control

when entries disappear.

The Garbage Collector decides.

---

# Relationship with ReferenceQueue

Internally,

WeakHashMap maintains a

```java
ReferenceQueue
```

When a key is garbage collected,

its WeakReference is placed into this queue.

WeakHashMap periodically processes the queue

and removes stale entries.

---

# Complete WeakHashMap Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = WeakHashMap Specific
>
> 🔒 = Internal Method

```text
WeakHashMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ WeakHashMap()
├── ✅ WeakHashMap(int initialCapacity)
├── ✅ WeakHashMap(int initialCapacity,
│                 float loadFactor)
└── ✅ WeakHashMap(Map<? extends K,
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
├── ✅ clear()
├── ✅ containsKey()
├── ✅ containsValue()
├── ✅ size()
├── ✅ isEmpty()
├── ✅ keySet()
├── ✅ values()
├── ✅ entrySet()
├── ✅ replace()
├── ✅ replaceAll()
├── ✅ compute()
├── ✅ computeIfAbsent()
├── ✅ computeIfPresent()
├── ✅ merge()
├── ✅ equals()
└── ✅ hashCode()

│
├──────────────────────────────────────────────
│ WeakHashMap Specific Features
├──────────────────────────────────────────────
│
├── 🆕 Automatic Entry Removal
├── 🆕 Weak References
├── 🆕 Reference Queue
├── 🆕 Garbage Collection Support
└── ✅ clone()

│
├──────────────────────────────────────────────
│ Internal Helper Methods
├──────────────────────────────────────────────
│
├── 🔒 expungeStaleEntries()
├── 🔒 hash()
├── 🔒 indexFor()
├── 🔒 resize()
├── 🔒 transfer()
└── 🔒 maskNull()

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

| Feature | HashMap | LinkedHashMap | TreeMap | WeakHashMap |
|----------|---------|---------------|----------|-------------|
| Internal Structure | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree | Hash Table |
| Reference Type | Strong | Strong | Strong | Weak |
| Ordering | No | Insertion / Access | Sorted | No |
| Automatic Removal | ❌ | ❌ | ❌ | ✅ |
| Garbage Collector | ❌ | ❌ | ❌ | ✅ |
| Memory-Sensitive Cache | ❌ | ❌ | ❌ | ✅ |
| Thread Safe | ❌ | ❌ | ❌ | ❌ |

---

# Key Takeaways

* `WeakHashMap` implements the `Map` interface.
* Uses a **Hash Table** internally.
* Stores **keys as Weak References**.
* Values are held normally; only keys are weakly referenced.
* Entries may disappear automatically after garbage collection.
* Ideal for caches and memory-sensitive applications.
* Developers should never rely on entries remaining in the map indefinitely.



# Understanding the Hierarchy

The methods available in a `WeakHashMap` object come from different levels of the Java Collections Framework.

Unlike `TreeMap`,

`WeakHashMap` directly implements the `Map` interface.

Its uniqueness comes from **how keys are stored**, not from additional interfaces.

```text
Map

↓

WeakHashMap
```

---

# 1. Constructors

These constructors belong directly to the `WeakHashMap` class.

They are **not inherited**.

```java
WeakHashMap()

WeakHashMap(int initialCapacity)

WeakHashMap(int initialCapacity,
            float loadFactor)

WeakHashMap(Map<? extends K,
            ? extends V> map)
```

Each constructor creates a `WeakHashMap` with different initialization options.

---

## Constructor Summary

| Constructor | Purpose |
|-------------|---------|
| WeakHashMap() | Default Capacity |
| WeakHashMap(int) | Custom Initial Capacity |
| WeakHashMap(int,float) | Custom Capacity & Load Factor |
| WeakHashMap(Map) | Copy Existing Map |

---

# 2. WeakHashMap()

Creates an empty `WeakHashMap`.

### Syntax

```java
WeakHashMap<K,V> map =
        new WeakHashMap<>();
```

### Example

```java
WeakHashMap<Integer,String> map =
        new WeakHashMap<>();
```

### Default Configuration

| Property | Value |
|----------|-------|
| Initial Capacity | 16 |
| Load Factor | 0.75 |
| Reference Type | Weak Reference |

---

# 3. WeakHashMap(int initialCapacity)

Creates a map with a specified initial capacity.

### Syntax

```java
WeakHashMap<K,V> map =
        new WeakHashMap<>(100);
```

### Purpose

Useful when the expected number of entries is known.

Reduces resizing operations.

---

# 4. WeakHashMap(int initialCapacity, float loadFactor)

Creates a map with custom capacity and load factor.

### Syntax

```java
WeakHashMap<K,V> map =
        new WeakHashMap<>(64,0.75f);
```

### Purpose

Allows developers to optimize memory usage and resizing behavior.

---

# 5. WeakHashMap(Map)

Creates a `WeakHashMap` by copying another map.

### Syntax

```java
WeakHashMap<K,V> map =
        new WeakHashMap<>(existingMap);
```

### Example

```java
HashMap<Integer,String> source =
        new HashMap<>();

WeakHashMap<Integer,String> map =
        new WeakHashMap<>(source);
```

The copied entries are stored using **Weak References**.

---

# 6. Methods Inherited from Map

Since

```java
WeakHashMap implements Map
```

it automatically inherits all standard Map operations.

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

These methods behave similarly to `HashMap`.

However,

entries may disappear automatically after garbage collection.

---

# 7. WeakHashMap Specific Features

Unlike every other `Map` implementation,

`WeakHashMap` introduces memory-management behavior.

---

## Weak References

Keys are stored as

```java
WeakReference<K>
```

instead of

```java
K
```

This allows the JVM to reclaim unused keys.

---

## Automatic Entry Removal

When the Garbage Collector removes a key,

its corresponding entry is automatically removed from the map.

Developers do not call

```java
remove()
```

explicitly.

---

## Reference Queue

Internally,

WeakHashMap maintains a

```java
ReferenceQueue
```

When a weak key is garbage collected,

its reference is placed into this queue.

The map periodically cleans these stale entries.

---

## Garbage Collection Support

Unlike `HashMap`,

entry lifetime is determined by

```text
Garbage Collector
```

rather than only by program logic.

---

# 8. clone()

Like `HashMap`,

`WeakHashMap` provides

```java
clone()
```

which creates a

```text
Shallow Copy
```

The map structure is copied,

but the key and value objects themselves are **not** duplicated.

---

# Strong Reference vs Weak Reference

```text
Strong Reference

↓

Object Always Alive

until explicitly removed.

----------------------------

Weak Reference

↓

Object may be removed

by Garbage Collector.
```

---

# HashMap vs WeakHashMap

```text
HashMap

↓

Strong Reference

↓

Object survives

----------------------------

WeakHashMap

↓

Weak Reference

↓

GC removes object

↓

Entry disappears
```

---

# Shallow Copy

```text
Original WeakHashMap

↓

Employee Object

↓

Clone WeakHashMap

↓

Same Employee Object
```

Only the map is copied.

Objects remain shared.



# Internal WeakHashMap Concepts

Unlike `HashMap`,

the most important concepts of `WeakHashMap` are:

* Strong Reference
* Weak Reference
* Garbage Collection
* Reference Queue
* Automatic Entry Removal

Unlike other `Map` implementations,

`WeakHashMap` is closely tied to the JVM Memory Management System.

---

# 1. Internal Structure

Internally,

WeakHashMap combines

```text
Hash Table

+

Weak References

+

Reference Queue
```

Diagram

```text
Application

↓

WeakHashMap

↓

Hash Table

↓

WeakReference<Key>

↓

Value
```

Unlike `HashMap`,

the key itself is not stored directly.

Instead,

a

```java
WeakReference<Key>
```

is stored.

---

# 2. Strong Reference

A normal object reference in Java is called a

```text
Strong Reference
```

Example

```java
Employee emp =
        new Employee("Rudra");
```

Diagram

```text
emp

↓

Employee Object
```

As long as this reference exists,

the Garbage Collector

cannot

remove the object.

---

# 3. Weak Reference

A Weak Reference does not prevent

Garbage Collection.

Example

```java
WeakReference<Employee> ref =
        new WeakReference<>(emp);
```

Diagram

```text
WeakReference

↓

Employee
```

If no Strong Reference exists,

the Garbage Collector

may remove the object.

---

# 4. HashMap vs WeakHashMap

HashMap

```text
HashMap

↓

Strong Reference

↓

Employee

↓

Object Survives
```

WeakHashMap

```text
WeakHashMap

↓

WeakReference

↓

Employee

↓

GC

↓

Removed
```

This is the biggest difference between the two.

---

# 5. Garbage Collection

Suppose

```java
Employee emp =
        new Employee("Rudra");
```

Insert into WeakHashMap

```java
map.put(emp, "Java");
```

Now

```java
emp = null;
```

Application

has

```text
No Strong Reference
```

Then

```java
System.gc();
```

Possible Result

```text
Garbage Collector

↓

Employee Removed

↓

Weak Reference Cleared

↓

Map Entry Removed
```

---

# 6. System.gc()

```java
System.gc();
```

Requests

the JVM

to perform Garbage Collection.

Important

```text
System.gc()

does NOT

guarantee

Garbage Collection.
```

It is

only

a request.

The JVM decides.

---

# 7. Weakly Reachable Object

An object becomes

```text
Weakly Reachable
```

when

all Strong References

have disappeared,

but

Weak References

still exist.

Diagram

```text
Application

×

No Strong Reference

↓

WeakReference

↓

Object

↓

GC Eligible
```

---

# 8. Reference Queue

Internally,

WeakHashMap maintains

```java
ReferenceQueue
```

Flow

```text
Weak Reference

↓

Garbage Collector

↓

ReferenceQueue

↓

WeakHashMap

↓

Entry Removed
```

Developers

normally

never interact

with this queue directly.

---

# 9. Automatic Entry Removal

Unlike HashMap,

developers

never call

```java
remove()
```

for stale entries.

Instead

```text
GC

↓

ReferenceQueue

↓

WeakHashMap

↓

Automatic Cleanup
```

---

# 10. Memory Leak Prevention

WeakHashMap

helps prevent

```text
Memory Leaks
```

Suppose

Cache

stores

```text
Millions

of Objects
```

Using HashMap

```text
Objects Never Removed

↓

Memory Leak
```

Using WeakHashMap

```text
Unused Objects

↓

Garbage Collected

↓

Memory Released
```

---

# 11. Reference Types

Java supports

four reference types.

```text
Strong Reference

↓

Weak Reference

↓

Soft Reference

↓

Phantom Reference
```

WeakHashMap

uses

```text
Weak Reference
```

only.

---

# 12. Soft Reference

Soft References

are mainly used for

```text
Memory Sensitive

Caches
```

GC removes them

only

when memory

is low.

Unlike

Weak References,

they survive

normal GC cycles.

---

# 13. Phantom Reference

Phantom References

are used

for

```text
Advanced JVM

Resource Cleanup
```

They are

not used

inside WeakHashMap.

---

# 14. Internal Working

Insertion

```text
Key

↓

WeakReference

↓

Hash Table
```

Searching

```text
Hash

↓

Bucket

↓

Compare

↓

Found
```

Garbage Collection

```text
GC

↓

ReferenceQueue

↓

Remove Entry
```

---

# 15. Memory Representation

```text
Hash Table

↓

Bucket

↓

WeakReference<Key>

↓

Value

↓

ReferenceQueue
```

Unlike HashMap,

keys are never stored

as Strong References.

---

# 16. Real World Use Cases

WeakHashMap is commonly used for

* Reflection Cache
* Annotation Cache
* Image Cache
* IDE Symbol Cache
* Class Metadata
* Framework Internal Cache
* Session Metadata
* Parser Cache

---

# 17. Why WeakHashMap Exists?

HashMap

keeps every object alive

until

```java
remove()
```

is called.

This can waste memory.

WeakHashMap solves this by allowing

unused keys

to be automatically reclaimed.

---

# Reality Check

## ❌ Common Misconception

Many developers think

```text
WeakHashMap

removes entries

immediately.
```

This is incorrect.

Removal depends on

```text
Garbage Collector.
```

It may happen

immediately,

later,

or not at all

during a particular execution.

---

# Important Notes

* Uses Hash Table.
* Keys are stored as Weak References.
* Values are stored normally.
* Automatic cleanup depends on GC.
* Uses ReferenceQueue internally.
* Prevents many memory leaks.
* Not Thread Safe.
* Null keys are allowed.
* Null values are allowed.
* Average operations remain O(1).
* Entry removal timing is non-deterministic.


# Optimized Overrides

Although `WeakHashMap` inherits most methods from the `Map` interface,

its internal implementation is optimized to work with

* Weak References
* Reference Queue
* Garbage Collector

The following methods are internally optimized.

```java
put()

get()

remove()

containsKey()

containsValue()

clear()

size()

isEmpty()

entrySet()

keySet()

values()

replace()

replaceAll()

compute()

computeIfAbsent()

computeIfPresent()

merge()

clone()

forEach()
```

Internally these methods work with

* Hash Table
* WeakReference
* ReferenceQueue
* Garbage Collector

instead of using only strong object references.

---

# Internal JDK Methods

The following methods exist inside the OpenJDK implementation.

These are internal helper methods and are not part of the public API.

```java
expungeStaleEntries()

getTable()

hash()

indexFor()

resize()

transfer()

maskNull()

unmaskNull()

eq()

matchesKey()

newTable()

removeMapping()
```

These methods manage

* Weak References
* Hash Buckets
* Entry Cleanup
* Reference Queue Processing

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| WeakHashMap() | O(1) | O(1) |
| WeakHashMap(int) | O(1) | O(1) |
| WeakHashMap(int,float) | O(1) | O(1) |
| WeakHashMap(Map) | O(n) | O(n) |
| clone() | O(n) | O(n) |

---

## Basic Operations

| Operation | Average | Worst |
|-----------|--------:|------:|
| put() | O(1) | O(n) |
| get() | O(1) | O(n) |
| remove() | O(1) | O(n) |
| containsKey() | O(1) | O(n) |
| containsValue() | O(n) | O(n) |
| clear() | O(n) | O(n) |
| size() | O(1)* | O(1)* |
| isEmpty() | O(1) | O(1) |

> **Note:** Methods like `size()` and `isEmpty()` may first process stale entries before returning results, so cleanup work can occasionally occur during these operations.

---

## Iteration Operations

| Operation | Time Complexity |
|-----------|----------------:|
| keySet() | O(n) |
| values() | O(n) |
| entrySet() | O(n) |
| forEach() | O(n) |
| replaceAll() | O(n) |

---

# Comparison with HashMap

| Feature | HashMap | WeakHashMap |
|---------|---------|-------------|
| Reference Type | Strong | Weak |
| Automatic Cleanup | ❌ | ✅ |
| Garbage Collector | No Effect | Removes Stale Entries |
| Memory Leak Prevention | ❌ | ✅ |
| Cache Support | Limited | Excellent |
| Entry Lifetime | Manual | GC Controlled |
| Null Key | ✅ | ✅ |
| Null Values | ✅ | ✅ |

---

# Comparison with ConcurrentHashMap

| Feature | WeakHashMap | ConcurrentHashMap |
|---------|-------------|------------------|
| Thread Safe | ❌ | ✅ |
| Weak References | ✅ | ❌ |
| Automatic Cleanup | ✅ | ❌ |
| High Concurrency | ❌ | ✅ |
| Best Use | Memory-sensitive Cache | Concurrent Applications |

---

# When Should You Use WeakHashMap?

Use `WeakHashMap` when:

* Cached objects should disappear automatically.
* Memory usage is more important than keeping entries forever.
* Metadata should not prevent garbage collection.
* Building reflection or annotation caches.
* Associating temporary information with objects.

Avoid `WeakHashMap` when:

* Entries must always remain available.
* Deterministic data storage is required.
* Keys must never disappear unexpectedly.
* Multi-threaded access is required (unless externally synchronized).

---

# Frequently Asked Interview Questions

## Q1. Which interface does WeakHashMap implement?

```java
Map
```

---

## Q2. Which data structure does WeakHashMap use?

```text
Hash Table
```

---

## Q3. What makes WeakHashMap different from HashMap?

Keys are stored using

```text
Weak References
```

instead of Strong References.

---

## Q4. Does WeakHashMap remove entries automatically?

Yes.

When the key becomes weakly reachable,

the Garbage Collector may remove the entry.

---

## Q5. Does System.gc() guarantee removal?

No.

```java
System.gc();
```

only requests garbage collection.

The JVM decides whether and when to perform it.

---

## Q6. Are keys stored as Weak References?

Yes.

Internally,

each key is wrapped inside a

```java
WeakReference<K>
```

---

## Q7. Are values also weakly referenced?

No.

Only the keys are weak.

Values remain normal object references.

---

## Q8. Can WeakHashMap prevent memory leaks?

Yes.

It is specifically designed to avoid retaining unused keys unnecessarily.

---

## Q9. Does WeakHashMap allow null keys?

Yes.

One null key is allowed.

---

## Q10. Does WeakHashMap allow null values?

Yes.

Multiple null values are allowed.

---

## Q11. Is WeakHashMap thread-safe?

No.

Use

```java
Collections.synchronizedMap()
```

or another concurrent solution if synchronization is required.

---

## Q12. What happens if a key is garbage collected?

Its corresponding map entry becomes eligible for automatic removal.

---

## Q13. What is a Weak Reference?

A reference that does **not** prevent the referenced object from being garbage collected.

---

## Q14. What is ReferenceQueue used for?

It tracks cleared weak references so that `WeakHashMap` can efficiently remove stale entries.

---

## Q15. Is entry removal deterministic?

No.

It depends entirely on the Garbage Collector.

---

## Q16. Which operation actually removes stale entries?

Internal cleanup methods such as

```java
expungeStaleEntries()
```

process the `ReferenceQueue`.

---

## Q17. Can WeakHashMap be used as a cache?

Yes.

It is one of its primary use cases.

---

## Q18. What happens if a strong reference still exists?

The object cannot be garbage collected,

so the entry remains in the map.

---

## Q19. What type of copy does clone() create?

```text
Shallow Copy
```

---

## Q20. Where is WeakHashMap commonly used?

Examples include:

* Reflection caches
* Annotation metadata
* IDE symbol caches
* Image caches
* Framework internals
* Temporary object metadata

---

# Summary

* `WeakHashMap` is a hash table implementation of `Map`.
* Keys are stored using **Weak References**.
* Entries may disappear automatically after garbage collection.
* Uses a `ReferenceQueue` internally to clean stale entries.
* Excellent for memory-sensitive caches and metadata.
* Entry lifetime is controlled by the JVM, not the application.
* Average lookup, insertion, and removal remain **O(1)**.

---

# Decision Guide

```text
Use HashMap
│
├── Fast general-purpose storage
├── Strong references
└── Manual removal

────────────────────────────

Use LinkedHashMap
│
├── Preserve insertion/access order
├── LRU Cache
└── Predictable iteration

────────────────────────────

Use TreeMap
│
├── Sorted keys
├── Range queries
└── Navigation APIs

────────────────────────────

Use WeakHashMap
│
├── Automatic cleanup
├── Memory-sensitive cache
├── Metadata association
└── JVM-managed entry lifetime

────────────────────────────

Use ConcurrentHashMap
│
├── Thread-safe
├── High concurrency
└── Multi-threaded applications
```