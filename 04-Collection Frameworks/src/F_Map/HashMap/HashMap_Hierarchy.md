# HashMap Method Hierarchy

## Overview

`HashMap` is the most widely used implementation of the `Map` interface in the Java Collections Framework.

It stores data as **Key-Value pairs**, where each key is unique and maps to exactly one value.

Internally, `HashMap` uses a **Hash Table** that combines an array with linked lists (or Red-Black Trees in Java 8+) to provide fast insertion, retrieval, and deletion operations.

It provides:

- Key-Value Storage
- Fast Lookup Operations
- Fast Insert Operations
- Fast Delete Operations
- One Null Key Allowed
- Multiple Null Values Allowed
- Duplicate Keys Not Allowed
- Duplicate Values Allowed
- Unordered Storage
- Dynamic Resizing
- High Performance

Since `HashMap` implements the `Map` interface, it automatically inherits methods from:

- `Map`

Additionally, `HashMap` provides its own constructors, optimized implementations, and utility methods.

---

## Class Declaration

```java
public class HashMap<K,V>
        extends AbstractMap<K,V>
        implements Map<K,V>, Cloneable, Serializable
```

---

## Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
HashMap
```

---

## Interface Relationship

```text
Map
 ↑
HashMap
```

---

## Complete HashMap Method Hierarchy

```text
HashMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── HashMap()
├── HashMap(int initialCapacity)
├── HashMap(int initialCapacity,
│           float loadFactor)
└── HashMap(Map<? extends K,
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
│ HashMap Specific Public Methods
├──────────────────────────────────────────────
│
└── clone()

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
├── forEach()
├── replaceAll()
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
├── merge()
├── equals()
└── hashCode()
```

---

## Understanding the Hierarchy

The methods available in a `HashMap` object come from different levels of the Java Collections Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `HashMap` class | `HashMap()`, `HashMap(int)`, `HashMap(int,float)`, `HashMap(Map)` | Not inherited; control capacity, load factor, or copy from existing map |
| **Map** | `HashMap implements Map` | `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `entrySet()` | Core key-value operations |
| **HashMap Specific** | `HashMap` class | `clone()` | Shallow copy of the map |
| **Optimized Overrides** | `HashMap` reimplementation | `put()`, `get()`, `remove()`, `containsKey()`, `forEach()`, `compute()`, `merge()` | Uses Hash Table, Buckets, Linked List, Red-Black Tree |

> **Important:** The methods available in your code depend on the **reference type** (`Map` or `HashMap`), even when the object is a `HashMap`.
> ```java
> Map<Integer, String> map = new HashMap<>();
> map.clone();   // ❌ Compile error — clone() is not in Map interface
> ```

---

## HashMap Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `HashMap()` | `new HashMap<>()` | Empty map; default capacity 16, load factor 0.75 | O(1) | O(1) |
| `HashMap(int initialCapacity)` | `new HashMap<>(100)` | Pre-allocate buckets; reduces resizing | O(1) | O(n) |
| `HashMap(int initialCapacity, float loadFactor)` | `new HashMap<>(64, 0.75f)` | Control resize threshold; useful in memory-sensitive apps | O(1) | O(n) |
| `HashMap(Map<? extends K, ? extends V> m)` | `new HashMap<>(existingMap)` | Copy all mappings from another map | O(n) | O(n) |

### Capacity vs Size vs Threshold

| Concept | Meaning | Example |
|---------|---------|---------|
| **Capacity** | Number of buckets in the internal Hash Table | `new HashMap<>()` → Capacity = 16 |
| **Size** | Actual number of key-value mappings stored | After `put(1,"A")`, `put(2,"B")` → Size = 2 |
| **Threshold** | Resize limit = Capacity × Load Factor | Capacity 16 × 0.75 = 12 → resize at 13th entry |

```java
HashMap<Integer, String> map = new HashMap<>(64, 0.75f);
// Capacity = 64, Load Factor = 0.75, Threshold = 48
map.put(1, "Java");
map.put(2, "Python");
// Size = 2
```

---

## HashMap Specific Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `clone()` | `(HashMap<K,V>) map.clone()` | Creates a **shallow copy** — new HashMap, same key/value references | O(n) | O(n) |

### Shallow Copy

`clone()` performs a **shallow copy** — the HashMap object is copied, but the stored key and value objects are **not cloned**.

```
Original HashMap          Clone HashMap
    1 → [Java]      →         1 → [Java]      ← Same object referenced
    2 → [Python]    →         2 → [Python]    ← Same object referenced
```

Both maps reference the same objects. Modifying a mutable object inside one map may affect the other.

```java
HashMap<Integer, String> original = new HashMap<>();
original.put(1, "Java");

HashMap<Integer, String> copy = (HashMap<Integer, String>) original.clone();
// Both reference the same "Java" string object
```

---

## Internal HashMap Concepts

| Concept | Description | Key Detail |
|---------|-------------|------------|
| **Capacity** | Total buckets in the Hash Table | Default = 16; always a power of two (16, 32, 64, 128...) |
| **Size** | Actual key-value mappings stored | `size()` returns this count |
| **Load Factor** | Resize threshold ratio = Size / Capacity | Default = 0.75; balances performance vs memory |
| **Threshold** | Max entries before resize = Capacity × Load Factor | Example: 16 × 0.75 = 12 |
| **Hashing** | Converts key → bucket index via `hashCode()` | Enables O(1) average lookup |
| **Bucket** | Storage location inside the Hash Table | Each index holds a linked list or tree |
| **Hash Collision** | Two keys produce same bucket index | Handled via chaining |
| **Separate Chaining** | Pre-Java 8: collisions stored as Linked List | Entries appended to existing list |
| **Treeification (Java 8+)** | Linked List → Red-Black Tree when bucket size ≥ 8 AND capacity ≥ 64 | Improves worst-case to O(log n) |
| **Untreeification** | Tree → Linked List when tree size ≤ 6 | Saves memory for small buckets |
| **Resizing** | Doubles capacity when threshold exceeded | 16 → 32 → 64 → 128... |
| **Rehashing** | Recalculates bucket index for all entries after resize | Redistributes entries into new buckets |
| **modCount** | Counts structural modifications | Used by fail-fast iterators |
| **Fail-Fast Iterator** | Throws `ConcurrentModificationException` if modified during iteration | Detects concurrent modifications |

### Why Capacity is Always a Power of Two

Using powers of two allows bucket calculation through efficient **bitwise operations** instead of slower modulo calculations.

- Faster bucket computation
- Better key distribution
- Improved performance

### Why Default Capacity is 16

A capacity of **16** provides a good balance between:

- Memory Usage
- Performance
- Number of Resizes

A smaller capacity causes frequent resizing. A larger capacity wastes memory.

### Why Treeify at 8

Research showed that having **8 or more entries** in one bucket is rare under a good hash distribution. Converting to a Red-Black Tree at this point improves worst-case lookup performance while avoiding unnecessary memory overhead for smaller buckets.

### Why Untreeify at 6

When entries decrease to **6 or fewer**, maintaining a Red-Black Tree becomes less efficient than a Linked List. Converting back saves memory and reduces tree maintenance overhead.

### Why Minimum Capacity 64 for Treeification

HashMap treeifies a bucket **only if the overall table capacity is at least 64**. If the capacity is smaller, it prefers **resizing** rather than creating a tree. Reason: increasing the table size usually redistributes entries and reduces collisions naturally.

### Why Default Load Factor is 0.75

It provides an excellent balance between **Performance** and **Memory Usage**:

- Smaller values waste memory (too many empty buckets)
- Larger values increase collisions (buckets become too full)

### Hashing Flow

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

### Collision Resolution Flow

```text
hashCode()
 ↓
Same Bucket
 ↓
equals()
 ↓
Correct Entry
```

Both `hashCode()` and `equals()` must work together. If only one is overridden, HashMap may fail to retrieve stored objects correctly.

---

## Optimized Overrides

`HashMap` reimplements these inherited methods for better performance using Hash Table, Hashing, Buckets, Linked List, Red-Black Tree (Java 8+), Rehashing, and Dynamic Resizing:

```java
put()           get()           remove()
containsKey()   containsValue() clone()
keySet()        values()        entrySet()
forEach()       replaceAll()    compute()
computeIfAbsent()  computeIfPresent()  merge()
equals()        hashCode()
```

These avoid linear searches by leveraging the hash-based structure.

---

## Important Notes

- Constructors are **not inherited**.
- HashMap implements the `Map` interface.
- Stores data as Key-Value pairs.
- Keys must be unique; duplicate values are allowed.
- One null key is allowed; multiple null values are allowed.
- Does **not** maintain insertion order or sorting.
- Not synchronized; not thread-safe.
- Uses a Hash Table internally with Linked Lists or Red-Black Trees.
- Automatically resizes when the threshold is exceeded.
- Iterators are **Fail-Fast**.
- `clone()` creates a **Shallow Copy**.
- Both `hashCode()` and `equals()` must be overridden together for custom keys.

---

## Time Complexity

### Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| `HashMap()` | O(1) | O(1) |
| `HashMap(int)` | O(1) | O(n) |
| `HashMap(int,float)` | O(1) | O(n) |
| `HashMap(Map)` | O(n) | O(n) |
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

## Why are these HashMap methods `O(n)`?

For a **HashMap**, these methods are **O(n)** because they must examine many or all entries rather than using the hash table's key lookup mechanism.

| Method | Time Complexity | Why? |
|--------|-----------------|------|
| `containsValue(value)` | **O(n)** | Values are **not hashed**. HashMap hashes only **keys**, so it must scan every entry until it finds the value. |
| `clear()` | **O(n)** | Every bucket/entry must be removed (or dereferenced) so the map becomes empty. This requires processing all stored entries. |
| `iterator()` *(full traversal)* | **O(n)** | Creating the iterator is **O(1)**, but iterating through all elements takes **O(n)** because each entry is visited once. |

> **Note:** The `iterator()` method itself is **O(1)** to create. It becomes **O(n)** only when you traverse the entire HashMap using that iterator.

### Worst Case (Before Java 8)

| Operation | Complexity |
|-----------|-----------:|
| `put()` | O(n) |
| `get()` | O(n) |
| `remove()` | O(n) |

### Worst Case (Java 8+)

| Operation | Complexity |
|-----------|-----------:|
| `put()` | O(log n) |
| `get()` | O(log n) |
| `remove()` | O(log n) |

Reason: Linked List → Red-Black Tree conversion when bucket size ≥ 8.

---

## Frequently Asked Interview Questions

**Q1. Which interface does HashMap implement?**  
`Map`

**Q2. Which data structure does HashMap use internally?**  
Hash Table — internally consists of Array, Linked List, and Red-Black Tree (Java 8+).

**Q3. Why is the default capacity 16?**  
Good balance between Performance, Memory Usage, and Number of Resizes.

**Q4. Why is the default Load Factor 0.75?**  
Balances Collision Rate and Memory Consumption.

**Q5. Why must Capacity be a Power of Two?**  
Allows fast bucket calculation using bitwise operations.

**Q6. Difference between Capacity and Size?**  
Capacity = Number of Buckets. Size = Number of Stored Entries.

**Q7. Difference between Capacity and Threshold?**  
Capacity = Maximum Buckets. Threshold = Resize Limit (Capacity × Load Factor).

**Q8. What is Hash Collision?**  
Two different keys producing the same bucket index.

**Q9. How are collisions handled?**  
Before Java 8: Linked List. After Java 8: Red-Black Tree when bucket size reaches 8 and table capacity is at least 64.

**Q10. Why Treeify at 8?**  
To improve lookup performance in high-collision scenarios.

**Q11. Why Untreeify at 6?**  
To reduce memory overhead when few entries remain.

**Q12. Why Minimum Capacity 64?**  
Below 64, resizing usually reduces collisions more effectively than treeification.

**Q13. Why is HashMap not Thread-Safe?**  
Multiple threads can modify the internal Hash Table simultaneously, leading to inconsistent data.

**Q14. Which Map should be used for Multi-threading?**  
`ConcurrentHashMap`

**Q15. Can HashMap store Null Keys?**  
Yes — only **one** null key.

**Q16. Can HashMap store Null Values?**  
Yes — multiple null values are allowed.

**Q17. Does HashMap maintain insertion order?**  
No. Use `LinkedHashMap` if insertion order is required.

**Q18. Does HashMap maintain sorting?**  
No. Use `TreeMap` if sorted order is required.

**Q19. Why must equals() and hashCode() be overridden together?**  
HashMap first uses `hashCode()` to locate the bucket, then `equals()` to identify the exact key. If only one is overridden, retrieval may fail.

**Q20. What type of copy does clone() create?**  
Shallow Copy.

---

## Summary

- `HashMap` is the most commonly used implementation of the `Map` interface.
- Stores data as Key-Value pairs.
- Internally uses a **Hash Table** consisting of an array, linked lists, and Red-Black Trees.
- Provides average **O(1)** time complexity for most operations.
- Automatically handles collisions through chaining and treeification.
- Allows one null key and multiple null values.
- Does not maintain insertion order or sorting.
- Not thread-safe.
- Uses `hashCode()` and `equals()` together for key lookup.
- Provides automatic resizing for better performance.
- Forms the foundation for understanding other hash-based collections such as `HashSet`, `LinkedHashMap`, `Hashtable`, `WeakHashMap`, `IdentityHashMap`, and `ConcurrentHashMap`.
