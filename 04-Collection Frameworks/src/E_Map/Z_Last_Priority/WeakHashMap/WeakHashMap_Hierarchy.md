# WeakHashMap Method Hierarchy

## Overview

`WeakHashMap` is a hash table-based implementation of the `Map` interface that stores its **keys using Weak References** instead of Strong References.

Unlike `HashMap`, entries in a `WeakHashMap` are **automatically removed** when their keys are no longer strongly reachable by the application.

Internally, `WeakHashMap` combines:

- Hash Table
- Weak References
- Reference Queue
- Garbage Collector

This allows it to automatically reclaim memory without requiring explicit removal of entries.

Unlike other `Map` implementations, the lifetime of an entry inside a `WeakHashMap` depends on the **Garbage Collector (GC)**.

It is commonly used for:

- Memory-Sensitive Caches
- Reflection Metadata
- ClassLoader Data
- Framework Internal Caches
- Image Caching

---

## Class Declaration

```java
public class WeakHashMap<K,V>
        extends AbstractMap<K,V>
        implements Map<K,V>
```

---

## Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
WeakHashMap
```

---

## Interface Relationship

```text
Map
 ↑
WeakHashMap
```

Unlike `TreeMap`, there is no `SortedMap` or `NavigableMap` between them.

---

## Relationship with Other Map Implementations

```text
HashMap                    WeakHashMap
   ↓                          ↓
Strong Reference        Weak Reference
   ↓                          ↓
Object survives         GC may remove object
until explicit          ↓
removal                 Entry disappears
```

HashMap retains keys until `remove()` or `clear()` is called. WeakHashMap may remove entries automatically when keys become weakly reachable.

---

## Complete WeakHashMap Method Hierarchy

```text
WeakHashMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── WeakHashMap()
├── WeakHashMap(int initialCapacity)
├── WeakHashMap(int initialCapacity,
│               float loadFactor)
└── WeakHashMap(Map<? extends K,
                  ? extends V>)

│
├──────────────────────────────────────────────
│ Methods Inherited from Map
├──────────────────────────────────────────────
│
├── put()
├── putAll()
├── get()
├── remove()
├── clear()
├── containsKey()
├── containsValue()
├── size()
├── isEmpty()
├── keySet()
├── values()
├── entrySet()
├── replace()
├── replaceAll()
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
├── merge()
├── equals()
└── hashCode()

│
├──────────────────────────────────────────────
│ WeakHashMap Specific Features
├──────────────────────────────────────────────
│
├── Automatic Entry Removal
├── Weak References
├── Reference Queue
├── Garbage Collection Support
└── clone()
```

---

## Understanding the Hierarchy

The methods available in a `WeakHashMap` object come from different levels of the Java Collections Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `WeakHashMap` class | `WeakHashMap()`, `WeakHashMap(int)`, `WeakHashMap(int,float)`, `WeakHashMap(Map)` | Not inherited; control capacity, load factor, or copy from existing map |
| **Map** | `WeakHashMap implements Map` | `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `entrySet()` | Core key-value operations |
| **WeakHashMap Specific** | `WeakHashMap` class | `clone()` | Shallow copy; automatic entry removal via GC |

> **Important:** The methods available in your code depend on the **reference type** (`Map` or `WeakHashMap`), even when the object is a `WeakHashMap`.
> ```java
> Map<String, String> map = new WeakHashMap<>();
> map.clone();   // ❌ Compile error — clone() is not in Map interface
> ```

---

## Comparison with Other Map Implementations

| Feature | HashMap | LinkedHashMap | TreeMap | WeakHashMap |
|----------|---------|---------------|---------|-------------|
| Internal Structure | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree | Hash Table |
| Reference Type | Strong | Strong | Strong | Weak |
| Ordering | No | Insertion / Access | Sorted | No |
| Automatic Removal | No | No | No | Yes |
| Garbage Collector | No Effect | No Effect | No Effect | Removes Stale Entries |
| Memory-Sensitive Cache | No | No | No | Yes |
| Thread Safe | No | No | No | No |

---

## WeakHashMap Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `WeakHashMap()` | `new WeakHashMap<>()` | Empty map; default capacity 16, load factor 0.75 | O(1) | O(1) |
| `WeakHashMap(int initialCapacity)` | `new WeakHashMap<>(100)` | Pre-allocate buckets; reduces resizing | O(1) | O(n) |
| `WeakHashMap(int initialCapacity, float loadFactor)` | `new WeakHashMap<>(64, 0.75f)` | Control resize threshold | O(1) | O(n) |
| `WeakHashMap(Map<? extends K, ? extends V>)` | `new WeakHashMap<>(existingMap)` | Copy all mappings; keys become weak references | O(n) | O(n) |

### Default Configuration

| Property | Value |
|----------|-------|
| Initial Capacity | 16 |
| Load Factor | 0.75 |
| Reference Type | Weak Reference |

```java
WeakHashMap<Integer, String> map = new WeakHashMap<>();
map.put(1, "Java");
map.put(2, "Python");
// Entries may disappear automatically when keys become unreachable
```

---

## WeakHashMap Specific Features

| Feature | Description |
|---------|-------------|
| **Weak References** | Keys stored as `WeakReference<K>` instead of `K` directly |
| **Automatic Entry Removal** | Entries removed when key becomes weakly reachable; no explicit `remove()` needed |
| **Reference Queue** | Internally tracks cleared weak references for cleanup |
| **Garbage Collection Support** | Entry lifetime determined by GC, not application logic |
| **clone()** | Creates a **shallow copy** — new WeakHashMap, same key/value references |

### Shallow Copy

`clone()` performs a **shallow copy** — the WeakHashMap structure is copied, but stored objects are **not cloned**.

```
Original WeakHashMap      Clone WeakHashMap
    [Key1] → [Val1]  →      [Key1] → [Val1]   ← Same objects referenced
    [Key2] → [Val2]  →      [Key2] → [Val2]   ← Same objects referenced
```

---

## Strong Reference vs Weak Reference

| Reference Type | Behavior | Example |
|----------------|----------|---------|
| **Strong Reference** | Object always alive until explicitly removed | `Employee emp = new Employee("Rudra")` |
| **Weak Reference** | Object may be removed by Garbage Collector | `WeakReference<Employee> ref = new WeakReference<>(emp)` |

### HashMap vs WeakHashMap Flow

```text
HashMap:                    WeakHashMap:
   ↓                           ↓
Strong Reference          WeakReference<Key>
   ↓                           ↓
Object survives           GC may remove object
until explicit                ↓
removal                 Entry disappears
```

### Garbage Collection Example

```java
Employee emp = new Employee("Rudra");
WeakHashMap<Employee, String> map = new WeakHashMap<>();
map.put(emp, "Java");

emp = null;  // No strong reference remains
System.gc(); // Request GC (not guaranteed)
// Entry may be automatically removed
```

---

## Internal WeakHashMap Concepts

| Concept | Description | Key Detail |
|---------|-------------|------------|
| **Internal Structure** | Hash Table + Weak References + Reference Queue | Keys not stored directly; `WeakReference<Key>` is stored |
| **Strong Reference** | Normal object reference | GC cannot remove the object while strong reference exists |
| **Weak Reference** | Does not prevent GC | Object may be removed if no strong reference exists |
| **Garbage Collection** | Entry lifetime determined by GC | `System.gc()` requests but does not guarantee collection |
| **Weakly Reachable Object** | All strong references gone, weak references remain | Object becomes eligible for GC |
| **Reference Queue** | Tracks cleared weak references | WeakHashMap periodically processes queue to remove stale entries |
| **Automatic Entry Removal** | No explicit `remove()` needed | GC → ReferenceQueue → WeakHashMap cleanup |
| **Memory Leak Prevention** | Unused objects automatically reclaimed | Unlike HashMap where objects never removed unless manually cleared |
| **Reference Types** | Java supports 4: Strong, Weak, Soft, Phantom | WeakHashMap uses Weak Reference only |
| **Soft Reference** | GC removes only when memory is low | Not used by WeakHashMap |
| **Phantom Reference** | Advanced JVM resource cleanup | Not used by WeakHashMap |
| **Internal Working** | Insert: Key → WeakReference → Hash Table; Search: Hash → Bucket → Compare; GC: GC → ReferenceQueue → Remove Entry | Consistent with HashMap but keys are weak |
| **Null Keys** | Allowed (one) | Valid |
| **Null Values** | Allowed (multiple) | Valid |
| **Performance (Average)** | `put()`, `get()`, `remove()` → O(1) | Same as HashMap |
| **Performance (Worst)** | `put()`, `get()`, `remove()` → O(n) | Due to collisions |
| **Use Cases** | Reflection cache, annotation metadata, image cache, IDE symbol cache, framework internals, temporary object metadata | Memory-sensitive applications |

### Internal Memory Representation

```text
Hash Table
   ↓
Bucket
   ↓
WeakReference<Key> → Value
   ↓
ReferenceQueue (tracks cleared references)
```

### Reference Queue Flow

```text
Weak Reference
   ↓
Garbage Collector runs
   ↓
ReferenceQueue (cleared reference added)
   ↓
WeakHashMap processes queue
   ↓
Stale entry removed automatically
```

### Reality Check

WeakHashMap does **NOT** remove entries immediately. Removal depends on the Garbage Collector — it may happen immediately, later, or not at all during a particular execution.

---

## Optimized Overrides

`WeakHashMap` reimplements these inherited methods to work with Weak References, Reference Queue, and Garbage Collector:

```java
put()           get()           remove()
containsKey()   containsValue() clear()
size()          isEmpty()       entrySet()
keySet()        values()        replace()
replaceAll()    compute()       computeIfAbsent()
computeIfPresent()  merge()     clone()
forEach()
```

Internally these methods work with:
- Hash Table
- WeakReference
- ReferenceQueue
- Garbage Collector

Instead of using only strong object references.

---

## Important Notes

- Uses Hash Table internally.
- Keys are stored as **Weak References**.
- Values are stored normally (only keys are weak).
- Automatic cleanup depends on GC.
- Uses `ReferenceQueue` internally to track cleared references.
- Helps prevent many memory leaks.
- **Not Thread Safe**.
- Null keys are allowed.
- Null values are allowed.
- Average operations remain **O(1)**.
- Entry removal timing is **non-deterministic**.
- `clone()` creates a **Shallow Copy**.

---

## Time Complexity

### Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| `WeakHashMap()` | O(1) | O(1) |
| `WeakHashMap(int)` | O(1) | O(n) |
| `WeakHashMap(int,float)` | O(1) | O(n) |
| `WeakHashMap(Map)` | O(n) | O(n) |
| `clone()` | O(n) | O(n) |

### Basic Operations

| Operation | Average | Worst |
|-----------|--------:|------:|
| `put()` | O(1) | O(n) |
| `get()` | O(1) | O(n) |
| `remove()` | O(1) | O(n) |
| `containsKey()` | O(1) | O(n) |
| `containsValue()` | O(n) | O(n) |
| `clear()` | O(n) | O(n) |
| `size()` | O(1)* | O(1)* |
| `isEmpty()` | O(1) | O(1) |

> `size()` and `isEmpty()` may first process stale entries before returning results, so cleanup work can occasionally occur during these operations.

### Iteration Operations

| Operation | Time Complexity |
|-----------|----------------:|
| `keySet()` | O(n) |
| `values()` | O(n) |
| `entrySet()` | O(n) |
| `forEach()` | O(n) |
| `replaceAll()` | O(n) |

---

## Comparison Tables

### WeakHashMap vs HashMap

| Feature | HashMap | WeakHashMap |
|---------|---------|-------------|
| Reference Type | Strong | Weak |
| Automatic Cleanup | No | Yes |
| Garbage Collector | No Effect | Removes Stale Entries |
| Memory Leak Prevention | No | Yes |
| Cache Support | Limited | Excellent |
| Entry Lifetime | Manual | GC Controlled |
| Null Key | Yes | Yes |
| Null Values | Yes | Yes |

### WeakHashMap vs ConcurrentHashMap

| Feature | WeakHashMap | ConcurrentHashMap |
|---------|-------------|------------------|
| Thread Safe | No | Yes |
| Weak References | Yes | No |
| Automatic Cleanup | Yes | No |
| High Concurrency | No | Yes |
| Best Use | Memory-sensitive Cache | Concurrent Applications |

---

## When to Use WeakHashMap

**Use WeakHashMap when:**
- Cached objects should disappear automatically.
- Memory usage is more important than keeping entries forever.
- Metadata should not prevent garbage collection.
- Building reflection or annotation caches.
- Associating temporary information with objects.

**Avoid WeakHashMap when:**
- Entries must always remain available.
- Deterministic data storage is required.
- Keys must never disappear unexpectedly.
- Multi-threaded access is required (unless externally synchronized).

---

## Map Implementation Decision Guide

```text
Use HashMap
│
├── Fast general-purpose storage
├── Strong references
└── Manual removal

Use LinkedHashMap
│
├── Preserve insertion/access order
├── LRU Cache
└── Predictable iteration

Use TreeMap
│
├── Sorted keys
├── Range queries
└── Navigation APIs

Use WeakHashMap
│
├── Automatic cleanup
├── Memory-sensitive cache
├── Metadata association
└── JVM-managed entry lifetime

Use ConcurrentHashMap
│
├── Thread-safe
├── High concurrency
└── Multi-threaded applications
```

---

## Frequently Asked Interview Questions

**Q1. Which interface does WeakHashMap implement?**  
`Map`

**Q2. Which data structure does WeakHashMap use?**  
Hash Table

**Q3. What makes WeakHashMap different from HashMap?**  
Keys are stored using **Weak References** instead of Strong References.

**Q4. Does WeakHashMap remove entries automatically?**  
Yes. When the key becomes weakly reachable, the Garbage Collector may remove the entry.

**Q5. Does System.gc() guarantee removal?**  
No. `System.gc()` only requests garbage collection. The JVM decides whether and when to perform it.

**Q6. Are keys stored as Weak References?**  
Yes. Internally, each key is wrapped inside a `WeakReference<K>`.

**Q7. Are values also weakly referenced?**  
No. Only the keys are weak. Values remain normal object references.

**Q8. Can WeakHashMap prevent memory leaks?**  
Yes. It is specifically designed to avoid retaining unused keys unnecessarily.

**Q9. Does WeakHashMap allow null keys?**  
Yes. One null key is allowed.

**Q10. Does WeakHashMap allow null values?**  
Yes. Multiple null values are allowed.

**Q11. Is WeakHashMap thread-safe?**  
No. Use `Collections.synchronizedMap()` or another concurrent solution if synchronization is required.

**Q12. What happens if a key is garbage collected?**  
Its corresponding map entry becomes eligible for automatic removal.

**Q13. What is a Weak Reference?**  
A reference that does **not** prevent the referenced object from being garbage collected.

**Q14. What is ReferenceQueue used for?**  
It tracks cleared weak references so that `WeakHashMap` can efficiently remove stale entries.

**Q15. Is entry removal deterministic?**  
No. It depends entirely on the Garbage Collector.

**Q16. Which operation actually removes stale entries?**  
Internal cleanup methods such as `expungeStaleEntries()` process the `ReferenceQueue`.

**Q17. Can WeakHashMap be used as a cache?**  
Yes. It is one of its primary use cases.

**Q18. What happens if a strong reference still exists?**  
The object cannot be garbage collected, so the entry remains in the map.

**Q19. What type of copy does clone() create?**  
Shallow Copy.

**Q20. Where is WeakHashMap commonly used?**  
Reflection caches, annotation metadata, IDE symbol caches, image caches, framework internals, temporary object metadata.

---

## Summary

- `WeakHashMap` is a hash table implementation of `Map`.
- Keys are stored using **Weak References**.
- Entries may disappear automatically after garbage collection.
- Uses a `ReferenceQueue` internally to clean stale entries.
- Excellent for memory-sensitive caches and metadata.
- Entry lifetime is controlled by the JVM, not the application.
- Average lookup, insertion, and removal remain **O(1)**.
