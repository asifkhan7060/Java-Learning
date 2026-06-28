# ConcurrentHashMap Method Hierarchy

## Overview

`ConcurrentHashMap` is the most commonly used implementation of `ConcurrentMap` in the Java Collection Framework.

It provides thread-safe operations without locking the entire map, using fine-grained locking at the segment or bucket level.

It provides:

* Thread-Safe Operations
* High Concurrent Performance
* No Null Keys or Values
* Atomic Compound Operations
* Weakly Consistent Iterators
* Java 8+ Parallel Methods (search, reduce, forEach with threshold)

---

# Class Declaration

```java
public class ConcurrentHashMap<K, V>
        extends AbstractMap<K, V>
        implements ConcurrentMap<K, V>,
                   Serializable
```

---

# Inheritance Hierarchy

```text
Map
    ↑
AbstractMap
    ↑
ConcurrentHashMap
```

Also implements `ConcurrentMap`.

---

# Interface Relationship

```text
Map
     ↑
ConcurrentMap
     ↑
ConcurrentHashMap
```

---

# Complete ConcurrentHashMap Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
ConcurrentHashMap<K, V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ ConcurrentHashMap()
├── ✅ ConcurrentHashMap(int initialCapacity)
├── ✅ ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)
└── ✅ ConcurrentHashMap(Map<? extends K, ? extends V> m)
│
│
├──────────────────────────────────────────────
│ Methods Inherited from Map
├──────────────────────────────────────────────
│
├── ✅ put(K key, V value)
├── ✅ get(Object key)
├── ✅ remove(Object key)
│
├── ✅ containsKey(Object key)
├── ✅ containsValue(Object value)
│
├── ✅ size()
├── ✅ isEmpty()
├── ✅ clear()
│
├── ✅ keySet()
├── ✅ values()
├── ✅ entrySet()
│
├── ✅ putAll(Map<? extends K, ? extends V> m)
│
├── ✅ forEach(BiConsumer<? super K, ? super V> action)
├── ✅ replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
│
├── ✅ getOrDefault(Object key, V defaultValue)
├── 🆕 putIfAbsent(K key, V value)   [Also in ConcurrentMap]
│
├── 🆕 merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
│   [Also in ConcurrentMap]
│
├── 🆕 compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
│   [Also in ConcurrentMap]
│
├── 🆕 computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
│   [Also in ConcurrentMap]
│
├── 🆕 computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
│   [Also in ConcurrentMap]
│
└── 🆕 replace(K key, V value)   [Also in ConcurrentMap]
    🆕 replace(K key, V oldValue, V newValue)   [Also in ConcurrentMap]
│
│
├──────────────────────────────────────────────
│ Methods Inherited from ConcurrentMap
├──────────────────────────────────────────────
│
├── ✅ putIfAbsent(K key, V value)
├── ✅ remove(Object key, Object value)
├── ✅ replace(K key, V value)
├── ✅ replace(K key, V oldValue, V newValue)
├── ✅ compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
├── ✅ computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
├── ✅ computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
└── ✅ merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
│
│
├──────────────────────────────────────────────
│ ConcurrentHashMap Specific Methods (Java 8+)
├──────────────────────────────────────────────
│
├── ✅ forEach(int parallelismThreshold, BiConsumer<? super K, ? super V> action)
├── ✅ forEach(int parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> transformer,
│              Consumer<? super U> action)
├── ✅ forEachKey(int parallelismThreshold, Consumer<? super K> action)
├── ✅ forEachKey(int parallelismThreshold, Function<? super K, ? extends U> transformer,
│                Consumer<? super U> action)
├── ✅ forEachValue(int parallelismThreshold, Consumer<? super V> action)
├── ✅ forEachValue(int parallelismThreshold, Function<? super V, ? extends U> transformer,
│                  Consumer<? super U> action)
├── ✅ forEachEntry(int parallelismThreshold, Consumer<? super Map.Entry<K, V>> action)
├── ✅ forEachEntry(int parallelismThreshold, Function<Map.Entry<K, V>, ? extends U> transformer,
│                   Consumer<? super U> action)
│
├── ✅ search(int parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> searchFunction)
├── ✅ searchKeys(int parallelismThreshold, Function<? super K, ? extends U> searchFunction)
├── ✅ searchValues(int parallelismThreshold, Function<? super V, ? extends U> searchFunction)
├── ✅ searchEntries(int parallelismThreshold, Function<Map.Entry<K, V>, ? extends U> searchFunction)
│
├── ✅ reduce(int parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> transformer,
│             BiFunction<? super U, ? super U, ? extends U> reducer)
├── ✅ reduceToLong(int parallelismThreshold,
│                   ToLongBiFunction<? super K, ? super V> transformer,
│                   long basis, LongBinaryOperator reducer)
├── ✅ reduceToInt(int parallelismThreshold,
│                  ToIntBiFunction<? super K, ? super V> transformer,
│                  int basis, IntBinaryOperator reducer)
├── ✅ reduceToDouble(int parallelismThreshold,
│                     ToDoubleBiFunction<? super K, ? super V> transformer,
│                     double basis, DoubleBinaryOperator reducer)
│
├── ✅ reduceKeys(int parallelismThreshold, BiFunction<? super K, ? super K, ? extends K> reducer)
├── ✅ reduceKeys(int parallelismThreshold, U identity,
│                 Function<? super K, ? extends U> transformer,
│                 BiFunction<? super U, ? super U, ? extends U> reducer)
├── ✅ reduceValues(int parallelismThreshold, BiFunction<? super V, ? super V, ? extends V> reducer)
├── ✅ reduceValues(int parallelismThreshold, U identity,
│                   Function<? super V, ? extends U> transformer,
│                   BiFunction<? super U, ? super U, ? extends U> reducer)
│
├── ✅ newKeySet()    [Static Method]
├── ✅ newKeySet(int initialCapacity)    [Static Method]
│
└── 🆕 mappingCount()
    🆕 keySet(V mappedValue)
    🆕 elements()
    🆕 keys()
    🆕 values(long parallelismThreshold)   [Spliterator-based]
    🆕 entrySpliterator()
    🆕 readObject(ObjectInputStream s)    🔒 Internal
    🆕 writeObject(ObjectOutputStream s)   🔒 Internal
│
│
└──────────────────────────────────────────────
  Methods Inherited from Object
───────────────────────────────────────────────
│
├── 🆕 toString()
├── 🆕 getClass()
├── 🆕 wait()
├── 🆕 notify()
├── 🆕 notifyAll()
└── 🆕 finalize() (Deprecated)
```

---

# Understanding the Hierarchy

## 1. Constructors

These belong directly to the `ConcurrentHashMap` class.

They are used to create `ConcurrentHashMap` objects and are **not inherited**.

```java
ConcurrentHashMap()

ConcurrentHashMap(int initialCapacity)

ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)

ConcurrentHashMap(Map<? extends K, ? extends V> m)
```

---

## 2. Methods Inherited from Map

Since

```java
ConcurrentMap extends Map
```

every `ConcurrentHashMap` object inherits all `Map` methods.

These methods perform basic key-value operations such as:

* Adding Entries (`put`, `putAll`)
* Retrieving Values (`get`)
* Removing Entries (`remove`)
* Searching (`containsKey`, `containsValue`)
* Views (`keySet`, `values`, `entrySet`)
* Traversal (`forEach`, `replaceAll`)

---

## 3. Methods Inherited from ConcurrentMap

Since

```java
ConcurrentHashMap implements ConcurrentMap
```

`ConcurrentHashMap` inherits all 8 atomic compound operations from `ConcurrentMap`:

* `putIfAbsent()`
* `remove(key, value)`
* `replace(key, value)`
* `replace(key, oldValue, newValue)`
* `compute()`
* `computeIfAbsent()`
* `computeIfPresent()`
* `merge()`

These operations are **atomic** and **thread-safe** without external synchronization.

---

## 4. ConcurrentHashMap Specific Methods

The following methods belong to `ConcurrentHashMap` specifically and are **not available** through `Map` or `ConcurrentMap` references.

### Parallel Traversal Methods (Java 8+)

```java
forEach(int parallelismThreshold, BiConsumer action)

forEachKey(int parallelismThreshold, Consumer action)
forEachValue(int parallelismThreshold, Consumer action)
forEachEntry(int parallelismThreshold, Consumer action)
```

These methods perform parallel traversal if the map size exceeds the threshold.

### Search Methods (Java 8+)

```java
search(int parallelismThreshold, BiFunction searchFunction)
searchKeys(int parallelismThreshold, Function searchFunction)
searchValues(int parallelismThreshold, Function searchFunction)
searchEntries(int parallelismThreshold, Function searchFunction)
```

These methods perform parallel search and return the first non-null result.

### Reduction Methods (Java 8+)

```java
reduce(int parallelismThreshold, BiFunction transformer, BiFunction reducer)
reduceToLong(int parallelismThreshold, ToLongBiFunction transformer, long basis, LongBinaryOperator reducer)
reduceToInt(int parallelismThreshold, ToIntBiFunction transformer, int basis, IntBinaryOperator reducer)
reduceToDouble(int parallelismThreshold, ToDoubleBiFunction transformer, double basis, DoubleBinaryOperator reducer)
```

These methods perform parallel reduction across the map entries.

### Static Factory Methods

```java
newKeySet()                    // Creates a thread-safe Set backed by ConcurrentHashMap
newKeySet(int initialCapacity) // Creates a thread-safe Set with initial capacity
```

---

## 5. Optimized Overrides

Some inherited methods are reimplemented inside `ConcurrentHashMap` for thread-safe concurrent access.

Examples:

* `forEach()`
* `replaceAll()`
* `merge()`
* `compute()`
* `computeIfAbsent()`
* `computeIfPresent()`
* `putIfAbsent()`
* `remove(key, value)`
* `replace(key, value)`
* `replace(key, oldValue, newValue)`

These methods are optimized for the concurrent hash table implementation.

---

## 6. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, a `ConcurrentHashMap` object can also use methods like:

* `toString()`
* `getClass()`
* `wait()`
* `notify()`
* `notifyAll()`

These methods belong to `Object` and are **not specific to the Collection Framework**.

---

# Part 2 : ConcurrentHashMap Specific Methods

---

## 1. ConcurrentHashMap()

Creates an empty `ConcurrentHashMap`.

### Syntax

```java
ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>();
```

### Example

```java
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
```

### Purpose

* Creates an empty ConcurrentHashMap.
* Most commonly used constructor.
* Thread-safe by default.

### Note

Default Settings:

```text
Initial Capacity    : 16
Load Factor         : 0.75
Concurrency Level   : 16
```

Modern JDK lazily creates the internal table.

---

## 2. ConcurrentHashMap(int initialCapacity)

Creates an empty `ConcurrentHashMap` with the specified initial capacity.

### Syntax

```java
ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>(initialCapacity);
```

### Example

```java
ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>(100);
```

### Purpose

Useful when the approximate number of elements is already known.

Reduces the need for resizing during growth and improves performance.

### Note

Capacity represents the number of buckets, not the number of stored elements.

---

## 3. ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)

Creates an empty `ConcurrentHashMap` with the specified capacity, load factor, and concurrency level.

### Syntax

```java
ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>(capacity, loadFactor, concurrencyLevel);
```

### Example

```java
ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>(100, 0.75f, 16);
```

### Purpose

Allows developers to fine-tune the internal structure for performance-critical applications.

* `initialCapacity`: Estimated number of elements
* `loadFactor`: Controls when resizing occurs
* `concurrencyLevel`: Estimated number of concurrently updating threads

### Note

In Java 8+, `concurrencyLevel` is used as a sizing hint rather than a strict segment count.

---

## 4. ConcurrentHashMap(Map<? extends K, ? extends V> m)

Creates a `ConcurrentHashMap` containing all entries from another map.

### Syntax

```java
ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>(anotherMap);
```

### Example

```java
Map<String, Integer> source = new HashMap<>();
source.put("Alice", 25);
source.put("Bob", 30);

ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(source);
```

### Purpose

* Copies all entries from another map.
* Frequently used to convert `HashMap` to `ConcurrentHashMap`.
* Original map remains unchanged.

### Note

The source map can be any `Map` implementation, not just `HashMap`.

---

# ConcurrentHashMap Specific Methods (Java 8+)

The following methods are available only in `ConcurrentHashMap` (not in `Map` or `ConcurrentMap` interfaces).

---

## 1. forEach with Parallelism Threshold

Performs an action for each entry, potentially in parallel.

### Syntax

```java
void forEach(int parallelismThreshold, BiConsumer<? super K, ? super V> action)
```

### Example

```java
map.forEach(2, (k, v) -> System.out.println(k + " = " + v));
```

### Purpose

* Parallel traversal if the map size exceeds the threshold.
* Sequential execution if the map is smaller than the threshold.

### Note

The first argument is the estimated number of elements needed for parallel execution.

---

## 2. search()

Searches the map for a key-value pair that satisfies a given function.

### Syntax

```java
U search(int parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> searchFunction)
```

### Example

```java
String result = map.search(2, (k, v) -> v > 25 ? k : null);
```

### Purpose

* Parallel search across map entries.
* Returns the first non-null result from the search function.

### Note

If no matching entry is found, returns `null`.

---

## 3. reduce()

Reduces all entries to a single result using a transformer and reducer.

### Syntax

```java
U reduce(int parallelismThreshold,
         BiFunction<? super K, ? super V, ? extends U> transformer,
         BiFunction<? super U, ? super U, ? extends U> reducer)
```

### Example

```java
Integer sum = map.reduce(2, (k, v) -> v, Integer::sum);
```

### Purpose

* Parallel reduction across map entries.
* Transformer processes each entry first.
* Reducer combines the transformed results.

### Note

Also available as `reduceToLong()`, `reduceToInt()`, and `reduceToDouble()`.

---

## 4. newKeySet()

Creates a thread-safe `Set` backed by a `ConcurrentHashMap`.

### Syntax

```java
Set<E> set = ConcurrentHashMap.newKeySet();
```

### Example

```java
Set<String> set = ConcurrentHashMap.newKeySet();
set.add("Java");
set.add("Python");
```

### Purpose

* Creates a thread-safe `Set` without writing a wrapper class.
* Equivalent to `Collections.newSetFromMap(new ConcurrentHashMap<>())`.

### Note

This is a **static** method of `ConcurrentHashMap`.

---

# Internal Concepts

Understanding the following concepts is important because they determine the performance of a `ConcurrentHashMap`.

---

## 1. Capacity

Capacity is the total number of buckets available in the internal Hash Table.

Example

```text
Capacity = 16
```

This does **not** mean that 16 entries are stored.

It simply means there are 16 buckets.

---

## 2. Size

Size represents the actual number of entries stored inside the ConcurrentHashMap.

Example

```text
Capacity = 16
Size = 5
```

Only five entries are stored.

---

## 3. Load Factor

Load Factor determines how full the Hash Table is allowed to become before resizing.

Formula

```text
Load Factor = Size / Capacity
```

Default Value

```text
0.75
```

This provides a good balance between speed and memory usage.

---

## 4. Concurrency Level

Concurrency Level is the estimated number of threads that will concurrently modify the map.

Default Value

```text
16
```

* Java 7: Determines the number of segments (each segment has its own lock)
* Java 8+: Used as a sizing hint for the internal table structure

---

## 5. Resizing

When the number of stored entries exceeds the threshold, ConcurrentHashMap creates a larger Hash Table.

All existing entries are redistributed into the new buckets.

### Purpose

* Reduces collisions.
* Maintains fast searching.
* Improves performance.

---

## 6. Thread Safety Mechanism

### Java 7

* **Segment-level locking**: The map is divided into segments (default 16).
* Each segment has its own `ReentrantLock`.
* Multiple threads can access different segments simultaneously.
* Only threads accessing the same segment contend for a lock.

### Java 8+

* **Bucket-level locking**: Uses CAS (Compare-And-Swap) operations.
* `synchronized` blocks on individual buckets.
* Red-Black Tree conversion for heavily collided buckets (improves worst-case to O(log n)).
* Better concurrent performance than segment-level locking.

---

# Optimized Overrides

The following methods are inherited but `ConcurrentHashMap` provides optimized, thread-safe implementations.

```java
forEach()
replaceAll()
merge()
compute()
computeIfAbsent()
computeIfPresent()
putIfAbsent()
remove(key, value)
replace(key, value)
replace(key, oldValue, newValue)
```

These methods are atomic and eliminate race conditions in concurrent environments.

---

# Methods Not Covered Yet

The following methods exist in Java but are not covered in this project.

```java
// Java 8+
mappingCount()
keySet(V mappedValue)
elements()
keys()
values(long parallelismThreshold)
entrySpliterator()

// Java 8+ (Internal)
readObject(ObjectInputStream s)
writeObject(ObjectOutputStream s)
```

These methods will be covered in advanced Collection Framework topics.

---

# Important Notes

### Constructors

* Constructors are **not inherited**.
* Used only for object creation.

---

### Null Key and Null Values

* ConcurrentHashMap does **NOT** allow `null` keys or `null` values.
* Throws `NullPointerException` if `null` is inserted.

Reason: In multi-threaded environments, `get(key)` returning `null` is ambiguous:

```text
"Key is absent" OR "Key is present with null value"
```

This ambiguity breaks atomic operations like `putIfAbsent()` and `computeIfAbsent()`.

---

### Weakly Consistent Iterators

* Iterators do **not** throw `ConcurrentModificationException`.
* They may reflect concurrent modifications by other threads.
* They are guaranteed to traverse elements that existed at the time of iterator creation.

---

### Reference Type Matters

The methods available depend on the reference type:

```java
Map<String, Integer> mapRef = new ConcurrentHashMap<>();
// mapRef.putIfAbsent("key", value);   // ❌ Compile Error

ConcurrentMap<String, Integer> cmRef = new ConcurrentHashMap<>();
// cmRef.forEach(2, (k, v) -> ...);    // ❌ Compile Error

ConcurrentHashMap<String, Integer> chmRef = new ConcurrentHashMap<>();
// chmRef.forEach(2, (k, v) -> ...);   // ✔ Works
// chmRef.search(2, (k, v) -> ...);    // ✔ Works
// chmRef.reduce(2, ...);              // ✔ Works
```

---

### Thread Safety

* ConcurrentHashMap is thread-safe without locking the entire map.
* Compound operations (putIfAbsent, compute, merge, etc.) are atomic.
* Preferred over `Hashtable` in modern Java.

---

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
| ----------- | --------------- | ---------------- |
| ConcurrentHashMap() | O(1) | O(1) |
| ConcurrentHashMap(int initialCapacity) | O(1) | O(n) *(allocates buckets)* |
| ConcurrentHashMap(int, float, int) | O(1) | O(n) *(allocates buckets)* |
| ConcurrentHashMap(Map) | O(n) | O(n) |

---

## ConcurrentHashMap Specific Methods

| Method | Time Complexity | Space Complexity |
| ------ | --------------- | ---------------- |
| forEach(parallelismThreshold) | O(n) | O(1) |
| search(parallelismThreshold) | O(n) | O(1) |
| reduce(parallelismThreshold) | O(n) | O(1) |
| newKeySet() | O(1) | O(1) |

---

## Average Time Complexity of Common Operations

| Operation | Average | Worst Case |
| --------- | ------- | ---------- |
| put() | O(1) | O(log n) |
| get() | O(1) | O(log n) |
| remove() | O(1) | O(log n) |
| containsKey() | O(1) | O(log n) |
| putIfAbsent() | O(1) | O(log n) |
| compute() | O(1) | O(log n) |
| merge() | O(1) | O(log n) |
| replace() | O(1) | O(log n) |
| size() | O(1) | O(1) |
| isEmpty() | O(1) | O(1) |
| clear() | O(n) | O(1) |

> **Note**
>
> Since Java 8, buckets are converted into **Red-Black Trees** when many collisions occur.
>
> This improves worst-case lookup from **O(n)** to **O(log n)** for heavily-collided buckets.

---

# When Should You Use These Constructors?

## ConcurrentHashMap()

Use when:

* Number of elements is unknown.
* Most commonly used constructor.
* Default settings are sufficient.

Example

```java
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
```

---

## ConcurrentHashMap(int initialCapacity)

Use when:

* Approximate number of elements is already known.
* Avoid repeated resizing during growth.

Example

```java
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(5000);
```

---

## ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)

Use when:

* Fine control over memory and performance is required.
* Performance-critical concurrent applications.
* Large datasets with high concurrency.

Example

```java
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(100000, 0.75f, 32);
```

---

## ConcurrentHashMap(Map)

Use when:

* Converting another Map into a ConcurrentHashMap.
* Need thread-safe copy of an existing map.

Example

```java
Map<String, Integer> source = new HashMap<>();
source.put("Alice", 25);

ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(source);
```

---

# Capacity vs Size

This is one of the most frequently asked interview questions.

## Capacity

The total number of buckets available in the internal Hash Table.

Example

```text
Capacity = 16
```

---

## Size

The actual number of stored entries.

Example

```text
Capacity = 16
Size = 7
```

---

## Example

```java
ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>(32);

map.put(10, "Ten");
map.put(20, "Twenty");
```

Output

```text
Capacity = 32
Size = 2
```

---

# Load Factor vs Concurrency Level

## Load Factor

Represents how full the Hash Table can become before resizing.

```text
Default = 0.75
```

Formula

```text
Threshold = Capacity × Load Factor
```

Example

```text
Capacity = 16
Load Factor = 0.75
Threshold = 12
```

When the 13th entry is inserted, ConcurrentHashMap performs resizing.

---

## Concurrency Level

Represents the estimated number of concurrently updating threads.

```text
Default = 16
```

* Java 7: Determines the number of segments (each with its own lock)
* Java 8+: Used as a sizing hint for the internal table

---

# Frequently Asked Interview Questions

## Q1. Which interface does ConcurrentHashMap implement?

```java
ConcurrentMap
```

Indirectly,

```text
ConcurrentHashMap
↓
ConcurrentMap
↓
Map
```

---

## Q2. Which data structure does ConcurrentHashMap use internally?

```text
Hash Table
```

(Java 8+ may use Red-Black Trees for heavily-collided buckets.)

---

## Q3. Does ConcurrentHashMap maintain insertion order?

No.

ConcurrentHashMap does **not** guarantee any ordering of entries.

---

## Q4. Does ConcurrentHashMap allow null keys or null values?

No.

`NullPointerException` is thrown if `null` is inserted.

Reason: `get(key)` returning `null` is ambiguous in multi-threaded environments.

---

## Q5. Why is ConcurrentHashMap preferred over Hashtable?

| Feature | ConcurrentHashMap | Hashtable |
| ------- | ----------------- | --------- |
| Locking | Fine-grained (bucket level) | Full map lock |
| Performance | Better | Poor |
| Null Keys | No | No |
| Null Values | No | No |

---

## Q6. What is the default concurrency level?

```text
16
```

(Java 7: 16 segments. Java 8+: Used as a sizing hint.)

---

## Q7. What are the 8 atomic compound operations provided by ConcurrentMap?

1. `putIfAbsent()`
2. `remove(key, value)`
3. `replace(key, value)`
4. `replace(key, oldValue, newValue)`
5. `compute()`
6. `computeIfAbsent()`
7. `computeIfPresent()`
8. `merge()`

---

## Q8. What are weakly consistent iterators?

Iterators that:

* Do not throw `ConcurrentModificationException`
* May reflect concurrent modifications by other threads
* Are guaranteed to traverse elements that existed at iterator creation time

---

## Q9. What is the difference between compute() and computeIfAbsent()?

| Method | Key Absent | Key Present |
| ------ | ---------- | ----------- |
| `compute()` | Function called with `null` | Function called with current value |
| `computeIfAbsent()` | Function called | Function NOT called |

---

## Q10. When should you use merge() instead of compute()?

Use `merge()` when you want to:

* Combine a new value with an existing value (e.g., summing counters)
* Store a default value if the key is absent

Use `compute()` when you need full control over the computation based on both key and value.

---

## Q11. Can you use compute() to remove an entry?

Yes. If the remapping function returns `null`, the entry is removed.

```java
map.compute("Alice", (k, v) -> null);   // Removes Alice
```

---

## Q12. Why can't we call forEach(parallelismThreshold) using a Map reference?

```java
Map<String, Integer> map = new ConcurrentHashMap<>();
map.forEach(2, (k, v) -> System.out.println(k));   // ❌ Compile Error
```

Because `forEach(int, BiConsumer)` belongs to `ConcurrentHashMap`, not `Map` or `ConcurrentMap`.

---

## Q13. What is newKeySet()?

Creates a thread-safe `Set` backed by a `ConcurrentHashMap`.

```java
Set<String> set = ConcurrentHashMap.newKeySet();
```

Equivalent to:

```java
Collections.newSetFromMap(new ConcurrentHashMap<>());
```

---

## Q14. What is the difference between put() and replace()?

| Method | Key Absent | Key Present |
| ------ | ---------- | ----------- |
| `put()` | Inserts | Overwrites |
| `replace()` | Does nothing | Overwrites |

---

## Q15. What is the difference between remove(key) and remove(key, value)?

| Method | Behavior |
| ------ | -------- |
| `remove(key)` | Removes entry regardless of value |
| `remove(key, value)` | Removes only if current value matches |

---

# Summary

* `ConcurrentHashMap` is the most commonly used implementation of `ConcurrentMap`.
* Internally uses a **Hash Table** with fine-grained locking.
* Stores **unique keys** (no duplicates).
* Does **not** allow `null` keys or `null` values.
* Does **not** maintain insertion order.
* Inherits methods from `Map` and `ConcurrentMap`.
* Provides **8 atomic compound operations** from `ConcurrentMap`.
* Java 8+ adds parallel methods: `forEach(threshold)`, `search()`, `reduce()`, `newKeySet()`.
* Thread-safe without full map locking.
* Iterators are **weakly consistent**.
* Preferred over `Hashtable` in modern Java.
* Default capacity is **16**, default load factor is **0.75**, default concurrency level is **16**.
* Suitable for concurrent key-value storage in multi-threaded environments.

---

# End of ConcurrentHashMap Hierarchy
