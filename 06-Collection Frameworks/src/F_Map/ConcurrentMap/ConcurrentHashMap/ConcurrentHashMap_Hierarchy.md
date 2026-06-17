# ConcurrentHashMap Method Hierarchy

## Overview

`ConcurrentHashMap` is the most commonly used implementation of `ConcurrentMap` in the Java Collection Framework.

It provides thread-safe operations without locking the entire map, using fine-grained locking at the segment or bucket level.

It provides:

- Thread-Safe Operations
- High Concurrent Performance
- No Null Keys or Values
- Atomic Compound Operations
- Weakly Consistent Iterators
- Java 8+ Parallel Methods (search, reduce, forEach with threshold)

Since `ConcurrentHashMap` implements the `ConcurrentMap` interface, it automatically inherits methods from:

- `Map`
- `ConcurrentMap`

Additionally, `ConcurrentHashMap` provides its own constructors and Java 8+ parallel methods.

---

## Class Declaration

```java
public class ConcurrentHashMap<K, V>
        extends AbstractMap<K, V>
        implements ConcurrentMap<K, V>, Serializable
```

---

## Inheritance Hierarchy

```text
Map
    ↑
AbstractMap
    ↑
ConcurrentHashMap
```

---

## Interface Relationship

```text
Map
     ↑
ConcurrentMap
     ↑
ConcurrentHashMap
```

---

## Complete ConcurrentHashMap Method Hierarchy

```text
ConcurrentHashMap<K, V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ConcurrentHashMap()
├── ConcurrentHashMap(int initialCapacity)
├── ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)
└── ConcurrentHashMap(Map<? extends K, ? extends V> m)
│
├──────────────────────────────────────────────
│ Methods Inherited from Map
├──────────────────────────────────────────────
│
├── put(K key, V value)
├── get(Object key)
├── remove(Object key)
│
├── containsKey(Object key)
├── containsValue(Object value)
│
├── size()
├── isEmpty()
├── clear()
│
├── keySet()
├── values()
├── entrySet()
│
├── putAll(Map<? extends K, ? extends V> m)
│
├── forEach(BiConsumer<? super K, ? super V> action)
├── replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
│
├── getOrDefault(Object key, V defaultValue)
├── putIfAbsent(K key, V value)
├── merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
├── compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
├── computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
├── computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
├── replace(K key, V value)
└── replace(K key, V oldValue, V newValue)
│
├──────────────────────────────────────────────
│ Methods Inherited from ConcurrentMap
├──────────────────────────────────────────────
│
├── putIfAbsent(K key, V value)
├── remove(Object key, Object value)
├── replace(K key, V value)
├── replace(K key, V oldValue, V newValue)
├── compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
├── computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
├── computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
└── merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
│
├──────────────────────────────────────────────
│ ConcurrentHashMap Specific Methods (Java 8+)
├──────────────────────────────────────────────
│
├── forEach(int parallelismThreshold, BiConsumer<? super K, ? super V> action)
├── forEach(int parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> transformer, Consumer<? super U> action)
├── forEachKey(int parallelismThreshold, Consumer<? super K> action)
├── forEachKey(int parallelismThreshold, Function<? super K, ? extends U> transformer, Consumer<? super U> action)
├── forEachValue(int parallelismThreshold, Consumer<? super V> action)
├── forEachValue(int parallelismThreshold, Function<? super V, ? extends U> transformer, Consumer<? super U> action)
├── forEachEntry(int parallelismThreshold, Consumer<? super Map.Entry<K, V>> action)
├── forEachEntry(int parallelismThreshold, Function<Map.Entry<K, V>, ? extends U> transformer, Consumer<? super U> action)
│
├── search(int parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> searchFunction)
├── searchKeys(int parallelismThreshold, Function<? super K, ? extends U> searchFunction)
├── searchValues(int parallelismThreshold, Function<? super V, ? extends U> searchFunction)
├── searchEntries(int parallelismThreshold, Function<Map.Entry<K, V>, ? extends U> searchFunction)
│
├── reduce(int parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer)
├── reduceToLong(int parallelismThreshold, ToLongBiFunction<? super K, ? super V> transformer, long basis, LongBinaryOperator reducer)
├── reduceToInt(int parallelismThreshold, ToIntBiFunction<? super K, ? super V> transformer, int basis, IntBinaryOperator reducer)
├── reduceToDouble(int parallelismThreshold, ToDoubleBiFunction<? super K, ? super V> transformer, double basis, DoubleBinaryOperator reducer)
│
├── reduceKeys(int parallelismThreshold, BiFunction<? super K, ? super K, ? extends K> reducer)
├── reduceKeys(int parallelismThreshold, U identity, Function<? super K, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer)
├── reduceValues(int parallelismThreshold, BiFunction<? super V, ? super V, ? extends V> reducer)
├── reduceValues(int parallelismThreshold, U identity, Function<? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer)
│
├── newKeySet()
└── newKeySet(int initialCapacity)
```

---

## Understanding the Hierarchy

The methods available in a `ConcurrentHashMap` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `ConcurrentHashMap` class | `ConcurrentHashMap()`, `ConcurrentHashMap(int)`, `ConcurrentHashMap(int, float, int)`, `ConcurrentHashMap(Map)` | Not inherited |
| **Map** | `ConcurrentMap extends Map` | `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `forEach()`, `replaceAll()`, `getOrDefault()` | Basic key-value operations |
| **ConcurrentMap** | `ConcurrentHashMap implements ConcurrentMap` | `putIfAbsent()`, `remove(key, value)`, `replace()`, `compute()`, `computeIfAbsent()`, `computeIfPresent()`, `merge()` | Atomic compound operations |
| **ConcurrentHashMap Specific** | `ConcurrentHashMap` class | `forEach(threshold)`, `search()`, `reduce()`, `reduceToLong/Int/Double()`, `reduceKeys()`, `reduceValues()`, `newKeySet()` | Java 8+ parallel methods |
| **Optimized Overrides** | `ConcurrentHashMap` reimplementation | `forEach()`, `replaceAll()`, `merge()`, `compute()`, `computeIfAbsent()`, `computeIfPresent()`, `putIfAbsent()`, `remove(key, value)`, `replace()` | Thread-safe optimized |

> **Important:** The methods available in your code depend on the **reference type** (`Map`, `ConcurrentMap`, or `ConcurrentHashMap`), even when the object is a `ConcurrentHashMap`.
> ```java
> Map<String, Integer> map = new ConcurrentHashMap<>();
> map.forEach(2, (k, v) -> System.out.println(k));   // ❌ Compile error
> ```

---

## ConcurrentHashMap Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `ConcurrentHashMap()` | `new ConcurrentHashMap<>()` | Empty map; default capacity 16, load factor 0.75, concurrency level 16 | O(1) | O(1) |
| `ConcurrentHashMap(int initialCapacity)` | `new ConcurrentHashMap<>(100)` | Pre-allocate capacity; reduces resizing | O(1) | O(n) |
| `ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)` | `new ConcurrentHashMap<>(100, 0.75f, 16)` | Fine-tune capacity, load factor, and concurrency level | O(1) | O(n) |
| `ConcurrentHashMap(Map<? extends K, ? extends V> m)` | `new ConcurrentHashMap<>(anotherMap)` | Copy all entries from another map | O(n) | O(n) |

### Capacity vs Size

| Concept | Meaning | Example |
|---------|---------|---------|
| **Capacity** | Number of buckets in internal Hash Table | `new ConcurrentHashMap<>(32)` → Capacity = 32 |
| **Size** | Actual number of stored entries | After `put(10, "A")`, `put(20, "B")` → Size = 2 |

### Load Factor & Concurrency Level

| Concept | Meaning | Default |
|---------|---------|---------|
| **Load Factor** | How full the table can become before resizing | 0.75 |
| **Concurrency Level** | Estimated number of concurrently updating threads | 16 |

> **Note:** In Java 8+, `concurrencyLevel` is used as a sizing hint rather than a strict segment count. Java 7 used segment-level locking; Java 8+ uses bucket-level CAS + synchronized blocks.

---

## ConcurrentMap Methods (Atomic Compound Operations)

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `putIfAbsent(K key, V value)` | `map.putIfAbsent("key", value)` | Insert only if key not present; returns existing value or null | O(1) | O(1) |
| `remove(Object key, Object value)` | `map.remove("key", oldValue)` | Remove only if key maps to specified value | O(1) | O(1) |
| `replace(K key, V value)` | `map.replace("key", newValue)` | Replace value if key exists; returns old value or null | O(1) | O(1) |
| `replace(K key, V oldValue, V newValue)` | `map.replace("key", oldValue, newValue)` | Replace only if current value matches | O(1) | O(1) |
| `compute(K key, BiFunction remappingFunction)` | `map.compute("key", (k, v) -> v + 1)` | Compute new value from key and current value; remove if null | O(1) | O(1) |
| `computeIfAbsent(K key, Function mappingFunction)` | `map.computeIfAbsent("key", k -> loadValue())` | Compute value only if key absent; insert if non-null | O(1) | O(1) |
| `computeIfPresent(K key, BiFunction remappingFunction)` | `map.computeIfPresent("key", (k, v) -> v + 1)` | Compute new value only if key present; remove if null | O(1) | O(1) |
| `merge(K key, V value, BiFunction remappingFunction)` | `map.merge("key", 1, Integer::sum)` | Insert if absent; otherwise merge existing and new value | O(1) | O(1) |

### compute() vs computeIfAbsent() vs merge()

| Method | Key Absent | Key Present | Use Case |
|--------|:----------:|:-----------:|----------|
| `compute()` | Function called with null | Function called with current value | Full control over computation |
| `computeIfAbsent()` | Function called | Function NOT called | Lazy initialization (caching) |
| `computeIfPresent()` | Nothing happens | Function called with current value | Update only existing entries |
| `merge()` | Inserts default value | Merges existing + new value | Counters, aggregations |

---

## ConcurrentHashMap Specific Methods (Java 8+)

| Method | Syntax | Purpose | Time |
|--------|--------|---------|:----:|
| `forEach(int parallelismThreshold, BiConsumer action)` | `map.forEach(2, (k, v) -> ...)` | Parallel traversal if map size > threshold | O(n) |
| `search(int parallelismThreshold, BiFunction searchFunction)` | `map.search(2, (k, v) -> v > 25 ? k : null)` | Parallel search; returns first non-null result | O(n) |
| `reduce(int parallelismThreshold, BiFunction transformer, BiFunction reducer)` | `map.reduce(2, (k, v) -> v, Integer::sum)` | Parallel reduction across entries | O(n) |
| `reduceToLong/Int/Double(...)` | `map.reduceToLong(2, (k, v) -> v, 0, Long::sum)` | Parallel reduction to primitive type | O(n) |
| `reduceKeys(...)` / `reduceValues(...)` | `map.reduceValues(2, Integer::sum)` | Parallel reduction on keys/values only | O(n) |
| `newKeySet()` | `Set<String> set = ConcurrentHashMap.newKeySet()` | Creates thread-safe Set backed by ConcurrentHashMap | O(1) |
| `newKeySet(int initialCapacity)` | `ConcurrentHashMap.newKeySet(100)` | Thread-safe Set with initial capacity | O(1) |

> **Note:** `parallelismThreshold` is the estimated number of elements needed to trigger parallel execution. If map size < threshold, execution is sequential.

---

## Internal Working

`ConcurrentHashMap` internally uses a **Hash Table** with fine-grained concurrency control.

### Java 7: Segment-Level Locking

```text
Map divided into 16 segments (default)
Each segment has its own ReentrantLock
Multiple threads can access different segments simultaneously
```

### Java 8+: Bucket-Level Locking

```text
CAS (Compare-And-Swap) operations for most updates
synchronized blocks on individual buckets when CAS fails
Red-Black Tree conversion for heavily collided buckets (worst-case O(log n))
```

| Feature | Java 7 | Java 8+ |
|---------|--------|---------|
| Locking | Segment-level (16 segments) | Bucket-level (CAS + synchronized) |
| Concurrency | Good | Better |
| Worst-case lookup | O(n) | O(log n) with Red-Black Trees |
| Memory overhead | Higher (segment objects) | Lower |

### Thread Safety Mechanism

```text
Thread A (put "A")          Thread B (get "A")          Thread C (put "B")
      │                            │                            │
      ▼                            ▼                            ▼
   Bucket 5                     Bucket 5                     Bucket 12
      │                            │                            │
   CAS / Sync                   Read (volatile)              CAS / Sync
      │                            │                            │
   No contention               No contention               No contention
   with Thread B               with Thread C               with Thread A
```

---

## Why Null is Not Allowed

`ConcurrentHashMap` does **NOT** allow `null` keys or `null` values.

```java
map.put(null, "value");      // ❌ NullPointerException
map.put("key", null);        // ❌ NullPointerException
```

**Reason:** In multi-threaded environments, `get(key)` returning `null` is ambiguous:
- "Key is absent" OR "Key is present with null value"

This ambiguity breaks atomic operations like `putIfAbsent()` and `computeIfAbsent()`.

---

## Weakly Consistent Iterators

- Iterators do **not** throw `ConcurrentModificationException`.
- They may reflect concurrent modifications by other threads.
- They are guaranteed to traverse elements that existed at the time of iterator creation.

---

## ConcurrentHashMap vs Hashtable

| Feature | ConcurrentHashMap | Hashtable |
|---------|------------------:|----------:|
| Locking | Fine-grained (bucket level) | Full map lock |
| Performance | Better | Poor |
| Null Keys | ❌ No | ❌ No |
| Null Values | ❌ No | ❌ No |
| Compound Operations | ✅ Atomic | ❌ Manual sync required |
| Java Version | Modern (Java 5+) | Legacy (Java 1.0) |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Thread-safe key-value storage | `ConcurrentHashMap()` | `new ConcurrentHashMap<>()` |
| Known element count | `ConcurrentHashMap(int)` | `new ConcurrentHashMap<>(5000)` |
| Fine-tune performance | `ConcurrentHashMap(int, float, int)` | `new ConcurrentHashMap<>(100000, 0.75f, 32)` |
| Copy from another map | `ConcurrentHashMap(Map)` | `new ConcurrentHashMap<>(hashMap)` |
| Lazy initialization / caching | `computeIfAbsent()` | `map.computeIfAbsent("key", k -> loadValue())` |
| Atomic counter update | `merge()` | `map.merge("count", 1, Integer::sum)` |
| Conditional removal | `remove(key, value)` | `map.remove("key", oldValue)` |
| Parallel traversal | `forEach(threshold)` | `map.forEach(2, (k, v) -> process(v))` |
| Parallel search | `search(threshold)` | `map.search(2, (k, v) -> v > 100 ? k : null)` |
| Parallel aggregation | `reduce(threshold)` | `map.reduce(2, (k, v) -> v, Integer::sum)` |
| Thread-safe Set | `newKeySet()` | `Set<String> set = ConcurrentHashMap.newKeySet()` |

---

## Interview Q&A

**Q1. Which interface does ConcurrentHashMap implement?**  
`ConcurrentMap` — indirectly `Map`.

**Q2. Which data structure does ConcurrentHashMap use internally?**  
Hash Table. (Java 8+ may use Red-Black Trees for heavily-collided buckets.)

**Q3. Does ConcurrentHashMap maintain insertion order?**  
No. No ordering guarantee.

**Q4. Does ConcurrentHashMap allow null keys or null values?**  
No. `NullPointerException` is thrown. Reason: `get(key)` returning `null` is ambiguous in multi-threaded environments.

**Q5. Why is ConcurrentHashMap preferred over Hashtable?**  
Fine-grained locking (bucket level vs full map lock) → better concurrent performance. Also provides atomic compound operations.

**Q6. What is the default concurrency level?**  
16. (Java 7: 16 segments. Java 8+: used as a sizing hint.)

**Q7. What are the 8 atomic compound operations from ConcurrentMap?**  
`putIfAbsent()`, `remove(key, value)`, `replace(key, value)`, `replace(key, oldValue, newValue)`, `compute()`, `computeIfAbsent()`, `computeIfPresent()`, `merge()`.

**Q8. What are weakly consistent iterators?**  
Iterators that don't throw `ConcurrentModificationException`, may reflect concurrent modifications, and guarantee traversal of elements existing at iterator creation time.

**Q9. What is the difference between compute() and computeIfAbsent()?**  
- `compute()`: Function called regardless of key presence.  
- `computeIfAbsent()`: Function called only if key is absent.

**Q10. When should you use merge() instead of compute()?**  
Use `merge()` when combining a new value with an existing value (e.g., summing counters). Use `compute()` when you need full control based on both key and value.

**Q11. Can you use compute() to remove an entry?**  
Yes. If the remapping function returns `null`, the entry is removed: `map.compute("key", (k, v) -> null)`.

**Q12. Why can't we call forEach(parallelismThreshold) using a Map reference?**  
Because `forEach(int, BiConsumer)` belongs to `ConcurrentHashMap`, not `Map` or `ConcurrentMap`.

**Q13. What is newKeySet()?**  
Static factory method that creates a thread-safe `Set` backed by a `ConcurrentHashMap`. Equivalent to `Collections.newSetFromMap(new ConcurrentHashMap<>())`.

**Q14. What is the difference between put() and replace()?**  
- `put()`: Inserts if absent, overwrites if present.  
- `replace()`: Overwrites only if key exists; does nothing if absent.

**Q15. What is the difference between remove(key) and remove(key, value)?**  
- `remove(key)`: Removes entry regardless of value.  
- `remove(key, value)`: Removes only if current value matches.

---

## Summary

- `ConcurrentHashMap` is the most commonly used implementation of `ConcurrentMap`.
- Internally uses a **Hash Table** with fine-grained locking.
- Stores **unique keys** (no duplicates).
- Does **not** allow `null` keys or `null` values.
- Does **not** maintain insertion order.
- Inherits methods from `Map` and `ConcurrentMap`.
- Provides **8 atomic compound operations** from `ConcurrentMap`.
- Java 8+ adds parallel methods: `forEach(threshold)`, `search()`, `reduce()`, `newKeySet()`.
- Thread-safe without full map locking.
- Iterators are **weakly consistent**.
- Preferred over `Hashtable` in modern Java.
- Default capacity is **16**, default load factor is **0.75**, default concurrency level is **16**.
- Suitable for concurrent key-value storage in multi-threaded environments.
