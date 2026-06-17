# LinkedHashMap Method Hierarchy

## Overview

`LinkedHashMap` is a hash table-based implementation of the `Map` interface that maintains a **doubly linked list running through all its entries**, preserving either **insertion order** or **access order**.

Unlike `HashMap`, which provides no ordering guarantees, `LinkedHashMap` remembers the order in which entries were inserted (or accessed, if configured). This makes it ideal for scenarios where predictable iteration order is required.

Internally, `LinkedHashMap` combines:

- Hash Table (from `HashMap`)
- Doubly Linked List (for ordering)
- Linked Hash Entries (each entry has before/after pointers)

It provides:

- Key-Value Storage
- Predictable Iteration Order
- Insertion Order (default)
- Access Order (optional)
- Fast Lookup Operations
- Fast Insert Operations
- Fast Delete Operations
- One Null Key Allowed
- Multiple Null Values Allowed
- LRU Cache Support
- Duplicate Keys Not Allowed
- Duplicate Values Allowed

Since `LinkedHashMap` extends `HashMap`, it automatically inherits methods from:

- `Map`
- `HashMap`

Additionally, `LinkedHashMap` provides its own constructors, access-order mode, and utility methods.

---

## Class Declaration

```java
public class LinkedHashMap<K,V>
        extends HashMap<K,V>
        implements Map<K,V>
```

---

## Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
HashMap
    ↑
LinkedHashMap
```

---

## Interface Relationship

```text
Map
 ↑
HashMap
 ↑
LinkedHashMap
```

Unlike `TreeMap`, there is no `SortedMap` or `NavigableMap` between them. `LinkedHashMap` directly extends `HashMap`.

---

## Relationship with HashMap

`LinkedHashMap` and `HashMap` both implement the `Map` interface. Both use a Hash Table internally. However, `LinkedHashMap` adds a doubly linked list to maintain entry order.

```text
HashMap                    LinkedHashMap
   ↓                          ↓
Hash Table              Hash Table
   ↓                          ↓
No ordering             Doubly Linked List
                           ↓
                        Insertion Order
                        or Access Order
```

HashMap provides no iteration order guarantee. LinkedHashMap guarantees predictable iteration order.

---

## Relationship with LinkedHashSet

`LinkedHashMap` and `LinkedHashSet` share the same ordering principle. `LinkedHashSet` internally uses a `LinkedHashMap` with dummy values.

```text
LinkedHashMap              LinkedHashSet
   ↓                          ↓
Key-Value pairs         Keys only (dummy values)
   ↓                          ↓
Insertion/Access Order    Insertion Order
```

---

## Complete LinkedHashMap Method Hierarchy

```text
LinkedHashMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── LinkedHashMap()
├── LinkedHashMap(int initialCapacity)
├── LinkedHashMap(int initialCapacity,
│                 float loadFactor)
├── LinkedHashMap(int initialCapacity,
│                 float loadFactor,
│                 boolean accessOrder)
└── LinkedHashMap(Map<? extends K,
                   ? extends V> m)

│
├──────────────────────────────────────────────
│ Methods Inherited from Map (via HashMap)
├──────────────────────────────────────────────
│
├── put()
├── putAll()
├── get()
├── getOrDefault()
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
├── putIfAbsent()
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
├── merge()
├── equals()
└── hashCode()

│
├──────────────────────────────────────────────
│ LinkedHashMap Specific Public Methods
├──────────────────────────────────────────────
│
├── removeEldestEntry()
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

The methods available in a `LinkedHashMap` object come from different levels of the Java Collections Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `LinkedHashMap` class | `LinkedHashMap()`, `LinkedHashMap(int)`, `LinkedHashMap(int,float)`, `LinkedHashMap(int,float,boolean)`, `LinkedHashMap(Map)` | Not inherited; control capacity, load factor, access order, or copy from existing map |
| **Map (via HashMap)** | `LinkedHashMap extends HashMap implements Map` | `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `entrySet()` | Core key-value operations |
| **LinkedHashMap Specific** | `LinkedHashMap` class | `removeEldestEntry()`, `clone()` | `removeEldestEntry()` enables LRU cache behavior |
| **Optimized Overrides** | `LinkedHashMap` reimplementation | `put()`, `get()`, `remove()`, `forEach()`, `compute()`, `merge()` | Maintains doubly linked list alongside hash table |

> **Important:** The methods available in your code depend on the **reference type** (`Map`, `HashMap`, or `LinkedHashMap`), even when the object is a `LinkedHashMap`.
> ```java
> Map<Integer, String> map = new LinkedHashMap<>();
> map.removeEldestEntry();   // ❌ Compile error — not in Map interface
> ```

---

## Comparison with Other Map Implementations

| Feature | HashMap | LinkedHashMap | TreeMap | WeakHashMap |
|----------|---------|---------------|---------|-------------|
| Internal Structure | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree | Hash Table |
| Ordering | No Guarantee | Insertion / Access | Sorted | No |
| Iteration Order | Unpredictable | Predictable | Sorted by Key | Unpredictable |
| Null Key | Yes (one) | Yes (one) | No (Natural Ordering) | Yes (one) |
| Null Values | Yes | Yes | Yes | Yes |
| Lookup | O(1) | O(1) | O(log n) | O(1) |
| Insertion | O(1) | O(1) | O(log n) | O(1) |
| LRU Cache Support | No | Yes | No | No |
| Memory Overhead | Low | Medium (linked list) | High (tree nodes) | Low |

---

## LinkedHashMap Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `LinkedHashMap()` | `new LinkedHashMap<>()` | Empty map; default capacity 16, load factor 0.75, insertion order | O(1) | O(1) |
| `LinkedHashMap(int initialCapacity)` | `new LinkedHashMap<>(100)` | Pre-allocate buckets; insertion order | O(1) | O(n) |
| `LinkedHashMap(int initialCapacity, float loadFactor)` | `new LinkedHashMap<>(64, 0.75f)` | Control resize threshold; insertion order | O(1) | O(n) |
| `LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)` | `new LinkedHashMap<>(16, 0.75f, true)` | `true` = access order (LRU); `false` = insertion order | O(1) | O(n) |
| `LinkedHashMap(Map<? extends K, ? extends V>)` | `new LinkedHashMap<>(existingMap)` | Copy all mappings; insertion order | O(n) | O(n) |

### Ordering Modes

| Mode | Constructor Parameter | Behavior | Use Case |
|------|----------------------|----------|----------|
| **Insertion Order** | `accessOrder = false` (default) | Entries iterated in insertion order | General predictable iteration |
| **Access Order** | `accessOrder = true` | Entries reordered on get/put; least-recently accessed first | LRU Cache implementation |

```java
// Insertion Order (default)
LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
map1.put(3, "C"); map1.put(1, "A"); map1.put(2, "B");
// Iteration: 3 → 1 → 2

// Access Order (LRU)
LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>(16, 0.75f, true);
map2.put(3, "C"); map2.put(1, "A"); map2.put(2, "B");
map2.get(1); // Access key 1
// Iteration: 3 → 2 → 1 (1 moved to end)
```

---

## LinkedHashMap Specific Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `removeEldestEntry(Map.Entry<K,V> eldest)` | `protected boolean removeEldestEntry(Map.Entry<K,V> eldest)` | Called after every put; return `true` to remove eldest entry | O(1) | O(1) |
| `clone()` | `(LinkedHashMap<K,V>) map.clone()` | Creates a **shallow copy** — new LinkedHashMap, same key/value references | O(n) | O(n) |

### `removeEldestEntry()` — LRU Cache Implementation

This protected method is the key to building an LRU (Least Recently Used) cache. Override it to automatically remove the oldest entry when a condition is met.

```java
// LRU Cache with capacity 3
LinkedHashMap<Integer, String> lruCache = new LinkedHashMap<>(16, 0.75f, true) {
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size() > 3; // Remove eldest when size exceeds 3
    }
};

lruCache.put(1, "A");
lruCache.put(2, "B");
lruCache.put(3, "C");
lruCache.put(4, "D"); // Entry 1 removed automatically
// Map now contains: 2 → 3 → 4
```

### Shallow Copy

`clone()` performs a **shallow copy** — the LinkedHashMap structure is copied, but stored objects are **not cloned**.

```
Original LinkedHashMap    Clone LinkedHashMap
    1 → [A]      →          1 → [A]      ← Same object referenced
    2 → [B]      →          2 → [B]      ← Same object referenced
    3 → [C]      →          3 → [C]      ← Same object referenced
```

Both maps reference the same objects. Modifying a mutable object inside one map may affect the other.

---

## Internal LinkedHashMap Concepts

| Concept | Description | Key Detail |
|---------|-------------|------------|
| **Internal Structure** | Hash Table + Doubly Linked List | Extends HashMap; adds before/after pointers to each entry |
| **Hash Table** | Same as HashMap for O(1) lookup | Array of buckets with linked lists / trees |
| **Doubly Linked List** | Maintains entry order | Each entry has `before` and `after` references |
| **Linked Hash Entry** | Entry extends HashMap.Node with linked list pointers | `Entry<K,V> extends HashMap.Node<K,V>` |
| **Insertion Order** | Default mode; entries iterated in insertion sequence | `accessOrder = false` |
| **Access Order** | Entries reordered on `get()` and `put()` | Most-recently accessed moved to end; `accessOrder = true` |
| **Head (Eldest)** | First entry in the linked list | Oldest entry in insertion or access order |
| **Tail (Youngest)** | Last entry in the linked list | Most recent entry |
| **LRU Cache** | Built using `accessOrder = true` + `removeEldestEntry()` | Automatically removes least-recently used entries |
| **Null Key** | Allowed (one) | Same as HashMap |
| **Null Values** | Allowed (multiple) | Same as HashMap |
| **Performance (Average)** | `put()`, `get()`, `remove()` → O(1) | Same as HashMap |
| **Performance (Worst)** | `put()`, `get()`, `remove()` → O(n) | Same as HashMap (before Java 8) or O(log n) (Java 8+ with trees) |
| **Memory Overhead** | Higher than HashMap | Extra pointers per entry (before + after) |
| **Thread Safety** | Not synchronized | Same as HashMap |
| **Fail-Fast Iterator** | Throws `ConcurrentModificationException` | Same as HashMap |

### Internal Structure Diagram

```text
Hash Table (Buckets)
   ↓
[0] → null
[1] → Entry(1,"A") ──┐
[2] → null            │ (doubly linked list)
[3] → Entry(3,"C") ←─┘→ Entry(2,"B")
                        ↑
                   before/after pointers
                   maintain order
```

### Insertion Order vs Access Order

**Insertion Order (`accessOrder = false`):**
```text
put(3,"C"), put(1,"A"), put(2,"B")
   ↓
Linked List:  3 → 1 → 2
              ↑       ↑
            Head    Tail

get(1) called:
   ↓
Linked List:  3 → 1 → 2  (no change)
```

**Access Order (`accessOrder = true`):**
```text
put(3,"C"), put(1,"A"), put(2,"B")
   ↓
Linked List:  3 → 1 → 2

get(1) called:
   ↓
Linked List:  3 → 2 → 1  (1 moved to tail)
```

### LRU Cache Flow

```text
put(1,"A"), put(2,"B"), put(3,"C")
   ↓
Cache: 1 → 2 → 3

get(2) called:
   ↓
Cache: 1 → 3 → 2  (2 moved to end)

put(4,"D"):
   ↓
removeEldestEntry() called
   ↓
size() > capacity? 4 > 3 → true
   ↓
Remove eldest (1)
   ↓
Cache: 3 → 2 → 4
```

---

## Optimized Overrides

`LinkedHashMap` reimplements these inherited methods to maintain the doubly linked list alongside the hash table:

```java
put()           get()           remove()
containsKey()   containsValue() clone()
keySet()        values()        entrySet()
forEach()       replaceAll()    compute()
computeIfAbsent()  computeIfPresent()  merge()
equals()        hashCode()
```

Internally these methods use:
- Hash Table (from HashMap)
- Doubly Linked List (for ordering)
- Linked Hash Entries (before/after pointers)

---

## Important Notes

- Extends `HashMap` and implements `Map`.
- Maintains a **doubly linked list** through all entries.
- Default mode: **Insertion Order** (`accessOrder = false`).
- **Access Order** mode (`accessOrder = true`) enables LRU cache behavior.
- `removeEldestEntry()` enables automatic removal of oldest entries.
- One null key is allowed.
- Multiple null values are allowed.
- Duplicate keys are **not allowed** (value replaced).
- Duplicate values are allowed.
- Not synchronized; not thread-safe.
- Iterators are **Fail-Fast**.
- `clone()` creates a **Shallow Copy**.
- Higher memory overhead than `HashMap` due to linked list pointers.
- Provides **O(1)** average time for lookup, insertion, and deletion.

---

## Time Complexity

### Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| `LinkedHashMap()` | O(1) | O(1) |
| `LinkedHashMap(int)` | O(1) | O(n) |
| `LinkedHashMap(int,float)` | O(1) | O(n) |
| `LinkedHashMap(int,float,boolean)` | O(1) | O(n) |
| `LinkedHashMap(Map)` | O(n) | O(n) |
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

Reason: Linked List → Red-Black Tree conversion in HashMap buckets when size ≥ 8 and capacity ≥ 64.

---

## Comparison Tables

### LinkedHashMap vs HashMap

| Feature | HashMap | LinkedHashMap |
|---------|---------|---------------|
| Ordering | Unpredictable | Predictable (insertion/access) |
| Iteration Order | None guaranteed | Insertion or access order |
| Memory Overhead | Low | Medium (extra pointers) |
| LRU Cache | No | Yes |
| Performance | O(1) average | O(1) average |
| Null Key | Yes | Yes |
| Null Values | Yes | Yes |

### LinkedHashMap vs TreeMap

| Feature | LinkedHashMap | TreeMap |
|---------|---------------|---------|
| Ordering | Insertion / Access | Sorted by Key |
| Internal Structure | Hash Table + Linked List | Red-Black Tree |
| Lookup | O(1) | O(log n) |
| Range Queries | No | Yes |
| Comparator | No | Yes |
| Null Key | Yes | No (natural ordering) |

---

## When to Use LinkedHashMap

**Use LinkedHashMap when:**
- Predictable iteration order is required.
- Insertion order must be preserved.
- Building an LRU cache.
- Copying a map while maintaining order.
- Order of operations matters more than sorting.

**Avoid LinkedHashMap when:**
- Memory overhead is a critical concern.
- Sorted order (by key) is required (use `TreeMap`).
- Thread safety is required without external synchronization.
- Only fast lookup without ordering is needed (use `HashMap`).

---

## Map Implementation Decision Guide

```text
Use HashMap
│
├── Fast general-purpose storage
├── No ordering requirement
└── Lowest memory overhead

Use LinkedHashMap
│
├── Preserve insertion or access order
├── LRU Cache implementation
├── Predictable iteration order
└── Slightly higher memory

Use TreeMap
│
├── Sorted keys
├── Range queries
├── Navigation APIs
└── O(log n) operations

Use WeakHashMap
│
├── Automatic cleanup
├── Memory-sensitive cache
├── JVM-managed entry lifetime
└── Non-deterministic removal

Use ConcurrentHashMap
│
├── Thread-safe
├── High concurrency
└── Multi-threaded applications
```

---

## Frequently Asked Interview Questions

**Q1. Which class does LinkedHashMap extend?**  
`HashMap`

**Q2. Which interface does LinkedHashMap implement?**  
`Map` (inherited from HashMap)

**Q3. What is the main difference between HashMap and LinkedHashMap?**  
LinkedHashMap maintains a doubly linked list to preserve insertion or access order. HashMap provides no ordering guarantee.

**Q4. What are the two ordering modes in LinkedHashMap?**  
- **Insertion Order** (`accessOrder = false`, default): Entries iterated in insertion sequence.
- **Access Order** (`accessOrder = true`): Entries reordered on `get()`/`put()`; least-recently accessed first.

**Q5. How does LinkedHashMap maintain order internally?**  
Each entry has `before` and `after` pointers forming a doubly linked list that runs through all entries.

**Q6. What is `removeEldestEntry()` used for?**  
It enables LRU cache behavior. Override it to return `true` when the eldest entry should be automatically removed (e.g., when size exceeds capacity).

**Q7. How to implement an LRU Cache using LinkedHashMap?**  
```java
new LinkedHashMap<>(16, 0.75f, true) {
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }
};
```

**Q8. Does LinkedHashMap allow null keys?**  
Yes. One null key is allowed.

**Q9. Does LinkedHashMap allow null values?**  
Yes. Multiple null values are allowed.

**Q10. Is LinkedHashMap thread-safe?**  
No. Same as HashMap — not synchronized.

**Q11. What is the memory overhead compared to HashMap?**  
Higher. Each entry stores two additional pointers (`before` and `after`) for the linked list.

**Q12. Does LinkedHashMap use Red-Black Trees?**  
Yes, indirectly. It inherits HashMap's treeification behavior (Java 8+) for buckets with many collisions.

**Q13. What is the default load factor and initial capacity?**  
Same as HashMap: load factor = 0.75, initial capacity = 16.

**Q14. What happens to order when a key is re-inserted?**  
In insertion order mode, the original position is preserved. In access order mode, the entry moves to the end (most recent).

**Q15. Can LinkedHashMap be used as a sorted map?**  
No. It preserves insertion/access order, not sorted order. Use `TreeMap` for sorted keys.

**Q16. What type of copy does `clone()` create?**  
Shallow Copy.

**Q17. Is the iterator fail-fast?**  
Yes. Throws `ConcurrentModificationException` if structurally modified after iterator creation.

**Q18. What is the time complexity of iteration?**  
O(n) — proportional to the number of entries, not the capacity.

**Q19. When should I use LinkedHashMap over TreeMap?**  
Use LinkedHashMap when you need insertion/access order. Use TreeMap when you need keys sorted by natural or custom ordering.

**Q20. What are common real-world use cases?**  
- LRU caches
- Maintaining insertion order in configuration maps
- Ordered caches in frameworks
- Predictable iteration in UI components
- Session management with time-based eviction

---

## Summary

- `LinkedHashMap` extends `HashMap` and implements `Map`.
- Maintains a **doubly linked list** through all entries for predictable iteration order.
- Supports **Insertion Order** (default) and **Access Order** (LRU mode).
- `removeEldestEntry()` enables automatic removal for LRU cache implementation.
- One null key and multiple null values are allowed.
- Not thread-safe; iterators are fail-fast.
- Average **O(1)** time complexity for lookup, insertion, and deletion.
- Higher memory overhead than `HashMap` due to linked list pointers.
- Ideal for ordered maps, LRU caches, and predictable iteration scenarios.
