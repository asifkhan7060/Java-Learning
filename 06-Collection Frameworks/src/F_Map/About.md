# Java Map Interface — Complete Guide

## 1. What is Map?

`Map<K, V>` is a core interface of the Java Collections Framework that stores data as **Key-Value pairs**. Unlike `Collection`, which stores individual elements, a Map uses a **unique key** as an identifier for each value, enabling fast retrieval, insertion, updating, and deletion.

> **Important:** `Map` is part of the Java Collections Framework but **does NOT extend the `Collection` interface** — its structure and behavior are fundamentally different.

```java
public interface Map<K, V>
```

**Hierarchy:**
```
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

## 2. Map Implementations

| Feature | **HashMap** | **LinkedHashMap** | **TreeMap** | **Hashtable** | **WeakHashMap** | **IdentityHashMap** | **EnumMap** | **ConcurrentHashMap** |
|---------|-------------|-------------------|-------------|---------------|-----------------|---------------------|-------------|----------------------|
| Internal Structure | Hash Table | Hash Table + Linked List | Red-Black Tree | Hash Table | Hash Table | Hash Table | Array | Concurrent Hash Table |
| Ordering | ❌ | Insertion | Sorted (keys) | ❌ | ❌ | ❌ | Enum Order | ❌ |
| Null Key | One | One | ❌ | ❌ | One | One | ❌ | ❌ |
| Null Values | ✅ | ✅ | ✅ | ❌ | ✅ | ✅ | ✅ | ❌ |
| Thread-Safe | ❌ | ❌ | ❌ | ✅ | ❌ | ❌ | ❌ | ✅ |
| Search | **O(1)*** | **O(1)*** | O(log n) | **O(1)*** | **O(1)*** | **O(1)*** | **O(1)** | **O(1)*** |
| Best Use | General purpose | Ordered data | Sorted data | Legacy code | Cache | Reference equality | Enum keys | Concurrent apps |

> *Average case

### When to Choose What

```
Need fast key-based lookup?
        │
       Yes ───► HashMap
        │
        No
        ▼
Need insertion order preserved?
        │
       Yes ───► LinkedHashMap
        │
        No
        ▼
Need sorted keys?
        │
       Yes ───► TreeMap
        │
        No
        ▼
Need thread safety?
        │
       Yes ───► ConcurrentHashMap
        │
        No
        ▼
Need Enum keys only?
        │
       Yes ───► EnumMap
        │
        No
        ▼
Need weak references (cache)?
        │
       Yes ───► WeakHashMap
        │
        No
        ▼
Need reference equality (==)?
        │
       Yes ───► IdentityHashMap
```

---

## 3. Core Map Methods

### Map Interface Methods

| Method | Description | Example |
|--------|-------------|---------|
| `put(K key, V value)` | Insert or replace mapping | `map.put(1, "Java")` |
| `putAll(Map m)` | Copy all mappings | `map1.putAll(map2)` |
| `putIfAbsent(K, V)` | Insert only if key absent | `map.putIfAbsent(1, "Spring")` |
| `get(Object key)` | Retrieve value by key | `map.get(1)` → `"Java"` |
| `getOrDefault(key, default)` | Retrieve or return default | `map.getOrDefault(5, "Unknown")` |
| `remove(Object key)` | Remove by key | `map.remove(1)` |
| `remove(key, value)` | Remove only if key+value match | `map.remove(1, "Java")` |
| `replace(K key, V value)` | Replace value for key | `map.replace(1, "Spring")` |
| `replace(K, oldV, newV)` | Replace only if current matches | `map.replace(1, "Java", "Spring")` |
| `replaceAll(BiFunction)` | Transform all values | `map.replaceAll((k,v) -> v.toUpperCase())` |
| `containsKey(Object key)` | Check key exists | `map.containsKey(1)` |
| `containsValue(Object value)` | Check value exists | `map.containsValue("Java")` |
| `keySet()` | Set of all keys | `map.keySet()` |
| `values()` | Collection of all values | `map.values()` |
| `entrySet()` | Set of key-value entries | `map.entrySet()` |
| `forEach(BiConsumer)` | Action for each entry | `map.forEach((k,v) -> ...)` |
| `compute(K, BiFunction)` | Compute new value for key | `map.compute(1, (k,v) -> v + "!")` |
| `computeIfAbsent(K, Function)` | Compute if key absent | `map.computeIfAbsent(2, k -> "Python")` |
| `computeIfPresent(K, BiFunction)` | Compute if key present | `map.computeIfPresent(1, (k,v) -> v + "!")` |
| `merge(K, V, BiFunction)` | Merge existing with new | `map.merge(1, "X", (old,neu) -> old + neu)` |
| `size()` | Number of mappings | `map.size()` |
| `isEmpty()` | Check if empty | `map.isEmpty()` |
| `clear()` | Remove all mappings | `map.clear()` |

```text
Put → Get → Remove → Replace → Contains → View → Compute → Size → forEach → Merge
```

### SortedMap Methods (TreeMap)

| Method | Description |
|--------|-------------|
| `firstKey()` | Smallest key |
| `lastKey()` | Largest key |
| `headMap(K toKey)` | Entries with keys < `toKey` |
| `tailMap(K fromKey)` | Entries with keys ≥ `fromKey` |
| `subMap(K from, K to)` | Entries in range `[from, to)` |
| `comparator()` | Comparator used (null = natural ordering) |

### NavigableMap Methods (TreeMap)

| Method | Description |
|--------|-------------|
| `lowerKey(K key)` | Greatest key strictly less than `key` |
| `floorKey(K key)` | Greatest key ≤ `key` |
| `ceilingKey(K key)` | Smallest key ≥ `key` |
| `higherKey(K key)` | Smallest key strictly greater than `key` |
| `lowerEntry(K)` / `floorEntry(K)` / `ceilingEntry(K)` / `higherEntry(K)` | Same as above but return `Map.Entry` |
| `firstEntry()` / `lastEntry()` | First/last entry without removing |
| `pollFirstEntry()` / `pollLastEntry()` | Remove and return first/last entry |
| `descendingMap()` | Reverse-order view of the map |
| `navigableKeySet()` / `descendingKeySet()` | Navigable/reverse key sets |
| `subMap(from, boolean, to, boolean)` | Range with inclusive/exclusive control |
| `headMap(to, boolean)` / `tailMap(from, boolean)` | Head/tail with inclusive flag |

### ConcurrentMap Methods (ConcurrentHashMap)

Already covered in **Map**.

The following methods perform **atomic (thread-safe)** operations:

```text
✓ putIfAbsent()
✓ remove(key, value)
✓ replace()
✓ compute()
✓ computeIfAbsent()
✓ computeIfPresent()
✓ merge()
✓ forEach()
✓ replaceAll()
✓ getOrDefault()
```

## 4. Traversal Methods

```java
// 1. Using entrySet() — Most efficient
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}

// 2. Using keySet()
for (Integer key : map.keySet()) {
    System.out.println(key + " = " + map.get(key));
}

// 3. Using values()
for (String value : map.values()) {
    System.out.println(value);
}

// 4. Using Iterator
Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
while (itr.hasNext()) {
    System.out.println(itr.next());
}

// 5. Using Stream API
map.entrySet().stream().forEach(System.out::println);

// 6. Using forEach() — Most concise
map.forEach((k, v) -> System.out.println(k + " = " + v));
```

> ✅ **Best practice:** Use `entrySet()` for full traversal (avoids `get()` lookup). Use `forEach()` for single-line operations.

---

## 5. Internal Working

### Key-Value Pair Concept

Every Map entry consists of:
```
Key → Value
101 → "Aman"
102 → "Rahul"
103 → "Riya"
```

The key uniquely identifies its value. Duplicate keys replace existing values.

### Hashing Basics (HashMap, LinkedHashMap, Hashtable)

```
Key → hashCode() → Bucket Index → Store Entry
                    ↓
              Collision? → equals() → Correct Entry
```

- **`hashCode()`** determines the bucket index
- **`equals()`** resolves collisions (same bucket, different keys)
- **Collision:** Two keys generating same bucket. Handled via linked lists or balanced trees (Java 8+).

### HashMap — Hash Table

```
Bucket 0 → null
Bucket 1 → Entry(20, "B")
Bucket 2 → null
Bucket 3 → Entry(10, "A") → Entry(50, "E") [collision]
Bucket 4 → Entry(30, "C")
```

- O(1) average for get/put/remove
- No ordering guarantee
- One null key, multiple null values

### LinkedHashMap — Hash Table + Doubly Linked List

```
Hash Table:    10    20    30    40
Linked List:   10 ⇄ 20 ⇄ 30 ⇄ 40
```

- Maintains insertion order (or access order with `accessOrder=true`)
- Slightly more memory than HashMap
- Useful for LRU caches

### TreeMap — Red-Black Tree

```
       20
      /      10    30
          /         25  40
```

- Self-balancing BST guarantees O(log n)
- Keys sorted by natural ordering or custom Comparator
- No null keys (can't compare null)
- Navigation methods for nearest-key operations

### Hashtable — Synchronized Hash Table

- Thread-safe (synchronized methods)
- No null keys or values
- Legacy class — slower due to lock overhead
- Modern alternative: `ConcurrentHashMap`

### WeakHashMap — Weak References

- Keys stored as `WeakReference`
- Entries automatically removed when key is garbage collected
- Useful for caches where entries should expire when no longer referenced elsewhere

### IdentityHashMap — Reference Equality

- Compares keys using `==` (reference equality), NOT `equals()`
- Useful when object identity matters more than logical equality
- Example: maintaining metadata about specific object instances

### EnumMap — Enum Keys

- Backed by a compact array indexed by enum ordinal
- Extremely fast (O(1)) and memory-efficient
- Keys must be enums from the same enum type
- Maintains natural enum declaration order

### ConcurrentHashMap — Concurrent Hash Table

- Thread-safe without locking the entire table
- Uses segment-level locking (Java 7) or CAS + synchronized nodes (Java 8+)
- Higher concurrency than Hashtable
- No null keys or values

---

## 6. Real-World Use Cases

| Scenario | Choice | Why |
|----------|--------|-----|
| Student database (roll → name) | **HashMap** | Fast lookup by unique ID |
| Employee records (empID → details) | **HashMap** | General purpose, fast access |
| Dictionary (word → meaning) | **TreeMap** | Alphabetically sorted keys |
| LRU Cache | **LinkedHashMap** | Access-order iteration for eviction |
| Phone contacts (number → name) | **HashMap** | Fast lookup by phone number |
| Product catalog (sorted by ID) | **TreeMap** | Sorted product listing |
| Word frequency counter | **HashMap** | Fast counting by word |
| Thread-safe configuration map | **ConcurrentHashMap** | Concurrent reads/writes |
| Session cache (auto-expire) | **WeakHashMap** | Entries GC'd when session ends |
| Day-of-week settings | **EnumMap** | Enum keys, maximum performance |
| Object metadata tracking | **IdentityHashMap** | Track by object identity |

---

## 7. Common Mistakes

| Mistake | Problem | Solution |
|---------|---------|----------|
| Expecting `HashMap` to preserve insertion order | Iteration order is unpredictable | Use `LinkedHashMap` |
| Using `TreeMap` without `Comparable`/`Comparator` | `ClassCastException` | Implement `Comparable` or provide `Comparator` |
| Using mutable objects as keys | Changing key fields breaks `hashCode()`/`equals()` | Use immutable keys |
| Using `Hashtable` in modern code | Synchronization overhead, legacy | Use `ConcurrentHashMap` |
| Expecting duplicate keys to be stored | Old value is silently replaced | Check `put()` return value |
| Not overriding `equals()` and `hashCode()` for custom keys | Keys with same data treated as different | Always override both |
| Using `keySet()` + `get()` loop instead of `entrySet()` | O(n) extra lookups | Use `entrySet()` for full traversal |

---

## 8. Best Practices

- ✅ Use **HashMap** as default for general key-value storage
- ✅ Use **LinkedHashMap** when insertion/access order matters (LRU cache)
- ✅ Use **TreeMap** when sorted keys or range queries are needed
- ✅ Use **ConcurrentHashMap** for all multithreaded Map operations
- ✅ Use **EnumMap** when keys are enums — it's the fastest Map implementation
- ✅ Use **WeakHashMap** for caches that should auto-expire
- ✅ **Always override both `equals()` and `hashCode()`** for custom key classes
- ✅ Prefer **immutable objects** as Map keys
- ✅ Never modify a key object after inserting into a hash-based Map
- ✅ Use `entrySet()` for traversing both keys and values together
- ✅ Use `Map.of()` / `Map.ofEntries()` for creating small immutable maps (Java 9+)

---

## 9. Quick Reference

| Operation | HashMap | LinkedHashMap | TreeMap | Hashtable | ConcurrentHashMap |
|-----------|:-------:|:-------------:|:-------:|:---------:|:-----------------:|
| `get()` | **O(1)*** | **O(1)*** | O(log n) | **O(1)*** | **O(1)*** |
| `put()` | **O(1)*** | **O(1)*** | O(log n) | **O(1)*** | **O(1)*** |
| `remove()` | **O(1)*** | **O(1)*** | O(log n) | **O(1)*** | **O(1)*** |
| `containsKey()` | **O(1)*** | **O(1)*** | O(log n) | **O(1)*** | **O(1)*** |
| `firstKey()`/ `lastKey()` | N/A | N/A | O(log n) | N/A | N/A |
| Iteration order | Unpredictable | Insertion/Access | Sorted | Unpredictable | Unpredictable |
| Null key | One | One | ❌ | ❌ | ❌ |
| Null values | ✅ | ✅ | ✅ | ❌ | ❌ |
| Thread-safe | ❌ | ❌ | ❌ | ✅ | ✅ |
| Memory | Low | Medium | Medium | Medium | Higher |

> *Average case; worst case O(n) with excessive collisions

---

## 10. Interview Q&A

**Q: Is `Map` a child of `Collection`?**  
A: No. `Map` is part of the Collections Framework but has its own hierarchy. It stores key-value pairs, not individual elements.

**Q: Why are duplicate keys not allowed?**  
A: Each key uniquely identifies one value. Inserting the same key replaces the previous value.

**Q: Which Map is fastest for general use?**  
A: `HashMap` — O(1) average for all core operations.

**Q: Which Map maintains insertion order?**  
A: `LinkedHashMap`. Can also maintain access order with `accessOrder=true` (useful for LRU caches).

**Q: Which Map maintains sorted order?**  
A: `TreeMap` — keys sorted by natural ordering or custom `Comparator`.

**Q: Which Map is thread-safe?**  
A: `ConcurrentHashMap` (preferred) or `Hashtable` (legacy). Also `Collections.synchronizedMap()`.

**Q: Why is `ConcurrentHashMap` preferred over `Hashtable`?**  
A: `Hashtable` locks the entire table; `ConcurrentHashMap` uses fine-grained locking/CAS for higher concurrency and better performance.

**Q: Which Maps allow null keys?**  
A: `HashMap`, `LinkedHashMap`, `WeakHashMap`, `IdentityHashMap` — one null key each. `TreeMap`, `Hashtable`, `ConcurrentHashMap`, `EnumMap` do not.

**Q: What is the difference between `HashMap` and `IdentityHashMap`?**  
A: `HashMap` uses `equals()` for key comparison; `IdentityHashMap` uses `==` (reference equality).

**Q: When to use `WeakHashMap`?**  
A: For caches where entries should be automatically removed when the key is no longer referenced elsewhere (eligible for GC).

**Q: Why is `EnumMap` so fast?**  
A: It's backed by a simple array indexed by enum ordinal — no hashing, no tree balancing, no collisions.

**Q: What happens when `put()` is called with an existing key?**  
A: The old value is replaced. `put()` returns the previous value (or `null` if none).

---

## One-Line Summary

> **HashMap** → Fastest general-purpose key-value store (default choice)  
> **LinkedHashMap** → Fast + preserves insertion order (LRU cache)  
> **TreeMap** → Sorted keys + navigation methods (no null keys)  
> **Hashtable** → Legacy synchronized map (avoid in new code)  
> **WeakHashMap** → Auto-expiring cache (weak key references)  
> **IdentityHashMap** → Reference equality comparison (== not equals)  
> **EnumMap** → Enum keys only, fastest and most memory-efficient  
> **ConcurrentHashMap** → High-performance thread-safe map

> **Key Principle:** Choose based on **ordering needs** (none vs insertion vs sorted), **concurrency requirements**, and **key type** (general vs enum vs identity).
