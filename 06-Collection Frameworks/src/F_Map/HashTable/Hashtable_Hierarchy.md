# Hashtable Method Hierarchy

## Overview

`Hashtable` is one of the oldest implementations of the `Map` interface in the Java Collections Framework.

It stores data as **Key-Value pairs**, where each key is unique and maps to exactly one value.

Unlike `HashMap`, every public method in `Hashtable` is **synchronized**, making it **Thread-Safe**.

Internally, `Hashtable` uses a **Hash Table** for storing entries and handles collisions using **Linked Lists**.

Since `Hashtable` was introduced before the Collections Framework (JDK 1.0), it is considered a **Legacy Class**.

It provides:

- Key-Value Storage
- Thread-Safe Operations
- Synchronized Methods
- Fast Lookup
- Fast Insertion
- Fast Deletion
- No Null Keys
- No Null Values
- Duplicate Keys Not Allowed
- Duplicate Values Allowed

Since `Hashtable` implements the `Map` interface, it automatically inherits methods from:

- `Map`

Additionally, `Hashtable` provides its own constructors, optimized implementations, and legacy utility methods.

---

## Class Declaration

```java
public class Hashtable<K,V>
        extends Dictionary<K,V>
        implements Map<K,V>,
                   Cloneable,
                   Serializable
```

---

## Inheritance Hierarchy

```text
Object
    ↑
Dictionary
    ↑
Hashtable
```

---

## Interface Relationship

```text
Map
 ↑
Hashtable
```

Unlike `HashMap`, `Hashtable` extends the legacy `Dictionary` class.

---

## Complete Hashtable Method Hierarchy

```text
Hashtable<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── Hashtable()
├── Hashtable(int initialCapacity)
├── Hashtable(int initialCapacity,
│             float loadFactor)
└── Hashtable(Map<? extends K,
               ? extends V> m)

│
├──────────────────────────────────────────────
│ Methods Inherited from Map
├──────────────────────────────────────────────
│
├── put(K key,V value)
├── putAll(Map<? extends K,? extends V> m)
│
├── get(Object key)
├── getOrDefault()
│
├── remove(Object key)
├── remove(Object key,Object value)
├── clear()
│
├── containsKey()
├── containsValue()
│
├── size()
├── isEmpty()
│
├── keySet()
├── values()
├── entrySet()
│
├── equals(Object o)
├── hashCode()
│
├── forEach()
├── replace()
├── replaceAll()
├── putIfAbsent()
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
└── merge()

│
├──────────────────────────────────────────────
│ Hashtable Specific Public Methods
├──────────────────────────────────────────────
│
├── clone()
├── keys()
└── elements()

│
├──────────────────────────────────────────────
│ Legacy Methods
├──────────────────────────────────────────────
│
└── contains(Object value)

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── put()
├── get()
├── remove()
├── containsKey()
├── containsValue()
├── clone()
├── keySet()
├── values()
├── entrySet()
├── equals()
├── hashCode()
├── forEach()
├── replaceAll()
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
└── merge()
```

---

## Understanding the Hierarchy

The methods available in a `Hashtable` object come from different levels of the Java Collections Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `Hashtable` class | `Hashtable()`, `Hashtable(int)`, `Hashtable(int,float)`, `Hashtable(Map)` | Not inherited; default capacity = 11 (not 16 like HashMap) |
| **Map** | `Hashtable implements Map` | `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `entrySet()` | All methods are synchronized |
| **Hashtable Specific** | `Hashtable` class | `clone()`, `keys()`, `elements()` | `keys()` and `elements()` return Enumeration |
| **Legacy Methods** | `Dictionary` inheritance | `contains(Object value)` | Deprecated; use `containsValue()` |
| **Optimized Overrides** | `Hashtable` reimplementation | `put()`, `get()`, `remove()`, `forEach()`, `compute()`, `merge()` | Every method acquires monitor lock |

> **Important:** The methods available in your code depend on the **reference type** (`Map`, `Dictionary`, or `Hashtable`), even when the object is a `Hashtable`.
> ```java
> Map<Integer, String> map = new Hashtable<>();
> map.keys();        // ❌ Compile error — keys() is not in Map interface
> map.elements();    // ❌ Compile error — elements() is not in Map interface
> ```

---

## Comparison with HashMap

| Feature | HashMap | Hashtable |
|----------|---------|------------|
| Thread Safe | No | Yes |
| Synchronization | No | Every public method |
| Null Key | One Allowed | Not Allowed |
| Null Value | Allowed | Not Allowed |
| Legacy Class | No | Yes |
| Introduced | Java 1.2 | JDK 1.0 |
| Parent Class | AbstractMap | Dictionary |
| Enumeration Support | No | Yes |
| Iterator | Yes | Yes |
| Performance | Faster | Slightly Slower |

---

## Hashtable Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `Hashtable()` | `new Hashtable<>()` | Empty table; default capacity 11, load factor 0.75 | O(1) | O(1) |
| `Hashtable(int initialCapacity)` | `new Hashtable<>(100)` | Pre-allocate buckets; reduces rehashing | O(1) | O(n) |
| `Hashtable(int initialCapacity, float loadFactor)` | `new Hashtable<>(64, 0.75f)` | Control rehash threshold | O(1) | O(n) |
| `Hashtable(Map<? extends K, ? extends V> m)` | `new Hashtable<>(existingMap)` | Copy all mappings from another map | O(n) | O(n) |

### Key Differences from HashMap

| Concept | HashMap | Hashtable |
|---------|---------|-----------|
| Default Capacity | 16 | 11 |
| Growth Strategy | × 1.5 (approx) | × 2 + 1 |
| Null Keys | Allowed (one) | Not Allowed |
| Null Values | Allowed | Not Allowed |
| Thread Safety | No | Yes (synchronized) |
| Treeification | Yes (Java 8+) | No |

```java
Hashtable<Integer, String> table = new Hashtable<>(11, 0.75f);
// Capacity = 11, Load Factor = 0.75, Threshold = 8
table.put(1, "Java");
table.put(2, "Python");
// Size = 2
```

---

## Hashtable Specific Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `clone()` | `(Hashtable<K,V>) table.clone()` | Creates a **shallow copy** — new Hashtable, same key/value references | O(n) | O(n) |
| `keys()` | `Enumeration<K> keys = table.keys()` | Returns Enumeration of all keys | O(n) | O(n) |
| `elements()` | `Enumeration<V> vals = table.elements()` | Returns Enumeration of all values | O(n) | O(n) |

### Shallow Copy

`clone()` performs a **shallow copy** — the Hashtable object is copied, but the stored key and value objects are **not cloned**.

```
Original Hashtable        Clone Hashtable
    101 → [Java]    →       101 → [Java]    ← Same object referenced
    102 → [Python]  →       102 → [Python]  ← Same object referenced
```

Both tables reference the same stored objects.

### Legacy Enumeration

```java
Enumeration<Integer> keys = table.keys();
while (keys.hasMoreElements()) {
    System.out.println(keys.nextElement());
}
```

Modern code prefers:
```java
for (Integer key : table.keySet()) { ... }
```

---

## Legacy Methods

| Method | Modern Equivalent | Status |
|--------|-------------------|--------|
| `contains(Object value)` | `containsValue(Object value)` | Legacy; still works but deprecated in practice |

---

## Internal Hashtable Concepts

| Concept | Description | Key Detail |
|---------|-------------|------------|
| **Synchronization** | Every public method is `synchronized` | `public synchronized V put(K key, V value)` |
| **Monitor Lock** | Object's monitor lock acquired before each operation | Only one thread executes at a time |
| **Thread Safety** | Multiple threads can safely access same Hashtable | Comes at performance cost |
| **Null Keys** | Not allowed | Throws `NullPointerException` |
| **Null Values** | Not allowed | Throws `NullPointerException` |
| **Capacity** | Default = 11 (not 16 like HashMap) | Always grows as `Old × 2 + 1` |
| **Size** | Actual key-value mappings stored | `size()` returns this count |
| **Load Factor** | Default = 0.75 | Determines when rehashing occurs |
| **Threshold** | Resize limit = Capacity × Load Factor | Example: 11 × 0.75 = 8 |
| **Rehashing** | Creates larger table, redistributes entries | New Capacity = Old × 2 + 1 (11 → 23 → 47 → 95) |
| **Hashing** | Converts key → bucket index via `hashCode()` | Similar to HashMap |
| **Collision Handling** | Linked List only | No Red-Black Tree conversion |
| **Enumeration** | Legacy traversal interface | `keys()`, `elements()` — not fail-fast |
| **Iterator** | Modern traversal | `entrySet().iterator()` — fail-fast |
| **Fail-Fast** | Iterator throws `ConcurrentModificationException` | Enumeration does NOT detect concurrent modifications |
| **Performance** | Slower than HashMap | Synchronization overhead on every operation |

### Synchronization Flow

```text
Thread A          Thread B
   ↓                 ↓
Request put()    Request get()
   ↓                 ↓
Acquire Lock     Wait for Lock
   ↓                 ↓
Execute put()    (Blocked)
   ↓                 ↓
Release Lock     Acquire Lock
                      ↓
                   Execute get()
```

### Growth Pattern

```text
11 → 23 → 47 → 95 → 191 ...
     (×2+1 at each step)
```

### Iterator vs Enumeration

| Feature | Iterator | Enumeration |
|---------|----------|-------------|
| Introduced | Collections Framework | Legacy (JDK 1.0) |
| Supports `remove()` | Yes | No |
| Fail-Fast | Yes | No |
| Preferred | Modern code | Legacy compatibility |

---

## Optimized Overrides

`Hashtable` reimplements these inherited methods with **synchronized** implementations:

```java
put()           get()           remove()
containsKey()   containsValue() clone()
keySet()        values()        entrySet()
forEach()       replaceAll()    compute()
computeIfAbsent()  computeIfPresent()  merge()
equals()        hashCode()
```

Every public method acquires the monitor lock before execution, making all operations thread-safe but slower than `HashMap`.

---

## Important Notes

- `Hashtable` is a legacy collection.
- Extends `Dictionary` (unlike `HashMap` which extends `AbstractMap`).
- Implements `Map`.
- Thread-Safe — every public method is synchronized.
- Null Keys are **not allowed**.
- Null Values are **not allowed**.
- Duplicate Keys are **not allowed**.
- Duplicate Values are allowed.
- Supports both `Iterator` and `Enumeration`.
- Uses hashing internally with Linked Lists for collisions.
- Does **not** convert buckets to Red-Black Trees.
- Performs automatic rehashing when threshold is exceeded.
- Slower than `HashMap` because of synchronization.
- `clone()` creates a **Shallow Copy**.
- Default capacity is **11** (not 16).
- Grows as `Old Capacity × 2 + 1`.
- Modern applications prefer `HashMap` or `ConcurrentHashMap`.

---

## Time Complexity

### Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| `Hashtable()` | O(1) | O(1) |
| `Hashtable(int)` | O(1) | O(n) |
| `Hashtable(int,float)` | O(1) | O(n) |
| `Hashtable(Map)` | O(n) | O(n) |
| `clone()` | O(n) | O(n) |

### Common Operations (Average Case)

| Operation | Time Complexity |
|-----------|----------------:|
| `put()` | O(1) |
| `get()` | O(1) |
| `remove()` | O(1) |
| `containsKey()` | O(1) |
| `containsValue()` | O(n) |
| `clear()` | O(n) |
| `iterator()` | O(n) |
| `keys()` | O(n) |
| `elements()` | O(n) |

### Worst Case

| Operation | Time Complexity |
|-----------|----------------:|
| `put()` | O(n) |
| `get()` | O(n) |
| `remove()` | O(n) |

Reason: Hashtable stores collided entries using Linked List only — no Red-Black Tree conversion.

---

## Frequently Asked Interview Questions

**Q1. Which interface does Hashtable implement?**  
`Map`

**Q2. Which class does Hashtable extend?**  
`Dictionary` — unlike `HashMap` which extends `AbstractMap`.

**Q3. Is Hashtable Thread-Safe?**  
Yes. Every public method is synchronized.

**Q4. Why is Hashtable slower than HashMap?**  
Every public method acquires a monitor lock before execution. Synchronization introduces additional overhead.

**Q5. Does Hashtable allow Null Keys?**  
No. Attempting to insert a null key throws `NullPointerException`.

**Q6. Does Hashtable allow Null Values?**  
No. Attempting to insert a null value also throws `NullPointerException`.

**Q7. Can Hashtable store Duplicate Keys?**  
No. Duplicate keys replace the previous value.

**Q8. Can Hashtable store Duplicate Values?**  
Yes. Multiple keys may reference the same value.

**Q9. Which traversal mechanisms are supported?**  
Both `Iterator` and `Enumeration`.

**Q10. Difference between Iterator and Enumeration?**

| Iterator | Enumeration |
|----------|-------------|
| Collections Framework | Legacy |
| Supports `remove()` | Does not support `remove()` |
| Fail-Fast | Not Fail-Fast |
| Preferred | Legacy Compatibility |

**Q11. What is Enumeration?**  
Legacy traversal interface introduced before the Collections Framework. Methods: `hasMoreElements()`, `nextElement()`.

**Q12. What is Rehashing?**  
When the threshold is exceeded, Hashtable creates a larger internal table and redistributes all existing entries.

**Q13. Does Hashtable use Red-Black Trees?**  
No. Hashtable always uses Linked List for collision handling.

**Q14. Which collection is recommended today?**  
Single-threaded: `HashMap`. Multi-threaded: `ConcurrentHashMap`. Modern applications rarely use `Hashtable`.

**Q15. What type of copy does clone() create?**  
Shallow Copy.

**Q16. Is Hashtable Fail-Fast?**  
Its `Iterator` is **Fail-Fast**. Its `Enumeration` is **not Fail-Fast**.

**Q17. Default Initial Capacity?**  
11.

**Q18. Default Load Factor?**  
0.75.

**Q19. How does Hashtable grow?**  
`New Capacity = Old Capacity × 2 + 1`. Example: 11 → 23 → 47 → 95.

**Q20. When should Hashtable be used?**  
Generally, new applications should avoid `Hashtable`. Use `HashMap` or `ConcurrentHashMap` instead. Hashtable is mainly encountered in legacy code, older libraries, and interview questions.

---

## Summary

- `Hashtable` is a legacy implementation of the `Map` interface.
- Extends the `Dictionary` class.
- Stores data as Key-Value pairs.
- Every public method is synchronized, making it thread-safe.
- Does **not** allow null keys or null values.
- Uses a Hash Table with Linked Lists for collision handling.
- Supports both modern `Iterator` and legacy `Enumeration`.
- Performs automatic rehashing when the threshold is exceeded.
- Provides average **O(1)** performance but is slower than `HashMap` due to synchronization.
- Default capacity is **11** (grows as `×2+1`).
- Modern Java applications generally prefer `HashMap` or `ConcurrentHashMap`.
