# Java Map Interface — Complete Guide

> **Scope of This Document:** This document combines the important material for the **Map interface**, **HashMap**, **LinkedHashMap**, **TreeMap**, **ConcurrentMap**, and **ConcurrentHashMap**. It also covers **Hashtable, WeakHashMap, IdentityHashMap, and EnumMap** at the overview level.
>
> Generic collection traversal concepts already covered in the Collection/Iterable documentation are not repeated here unless the traversal is specifically important to Map behavior, such as `entrySet()` or concurrent traversal.

## What is Map?

`Map<K, V>` is a core interface of the Java Collections Framework that stores data as **key-value pairs**.

Unlike `Collection`, which stores individual elements, a Map stores mappings from a **key** to a **value**.

```java
public interface Map<K, V>
```

> **Important:** `Map` is part of the Java Collections Framework but **does not extend `Collection`**. It has its own hierarchy and key-value based behavior.

### Key-Value Concept

```text
Key → Value

101 → "Aman"
102 → "Rahul"
103 → "Riya"
```

A key identifies one mapping. If the same key is inserted again, the existing value is replaced rather than creating another mapping.

## Why Do We Need Map?

Suppose key-value information is stored using parallel arrays or Lists:

```text
Names:  [Alice, Bob, Charlie, Alice]
Marks:  [  85,  90,     78,    92]
```

Finding Bob's marks requires searching through the data.

A Map is designed specifically for key-based storage and provides:

- Direct key-based access
- Unique keys
- Fast lookup, insertion, and deletion depending on implementation
- Replacement of an existing value when the same key is used

The `Map` interface defines **what** operations are possible; each implementation decides **how** those operations are performed.

```java
Map<String, Integer> m1 = new HashMap<>();
Map<String, Integer> m2 = new LinkedHashMap<>();
Map<String, Integer> m3 = new TreeMap<>();
Map<String, Integer> m4 = new ConcurrentHashMap<>();
```

All store key-value pairs, but differ in **ordering, concurrency, key comparison, internal structure, memory behavior, and performance**.

## Map Hierarchy

```text
Map
│
├── HashMap
│   └── LinkedHashMap
│
├── SortedMap
│   └── NavigableMap
│       └── TreeMap
│
├── ConcurrentMap
│   └── ConcurrentHashMap
│
├── Hashtable
├── WeakHashMap
├── IdentityHashMap
└── EnumMap
```

## Map Implementations — Overview

| Feature | **HashMap** | **LinkedHashMap** | **TreeMap** | **Hashtable** | **WeakHashMap** | **IdentityHashMap** | **EnumMap** | **ConcurrentHashMap** |
|---------|-------------|-------------------|-------------|---------------|-----------------|---------------------|-------------|----------------------|
| Internal Structure | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree | Hash Table | Hash Table | Hash Table | Array | Concurrent Hash Table |
| Ordering | No guarantee | Insertion / Access | Sorted by keys | No guarantee | No guarantee | No guarantee | Enum order | No guarantee |
| Null Key | One | One | No | No | One | One | No | No |
| Null Values | Yes | Yes | Yes | No | Yes | Yes | Yes | No |
| Thread-Safe | No | No | No | Yes | No | No | No | Yes |
| Typical Search | O(1)* | O(1)* | O(log n) | O(1)* | O(1)* | O(1)* | O(1) | O(1)* |
| Main Use | General purpose | Ordered data / LRU | Sorted data | Legacy code | Weak-key behavior | Reference equality | Enum keys | Concurrent applications |

> `*` Average case for hash-based implementations.

## Choosing the Right Map

```text
Need general key-value storage?
        │
        ▼
Need fast key-based lookup?
        │
       Yes ───► HashMap
        │
       No
        ▼
Need insertion/access order?
        │
       Yes ───► LinkedHashMap
        │
       No
        ▼
Need sorted keys, navigation, or range queries?
        │
       Yes ───► TreeMap
        │
       No
        ▼
Need thread-safe concurrent access?
        │
       Yes ───► ConcurrentHashMap
        │
       No
        ▼
Need enum keys only?
        │
       Yes ───► EnumMap
        │
       No
        ▼
Need weak-key behavior?
        │
       Yes ───► WeakHashMap
        │
       No
        ▼
Need reference equality (`==`)?
        │
       Yes ───► IdentityHashMap
        │
       No
        ▼
Default ───► HashMap
```

### Simple Memory Rule

```text
HashMap            → General / Fast lookup
LinkedHashMap      → Order
TreeMap            → Sorting + Navigation
ConcurrentHashMap  → Concurrent access
WeakHashMap        → Weak-reference behavior
IdentityHashMap    → Reference identity
EnumMap            → Enum keys
Hashtable          → Legacy synchronized Map
```

# Core Map Methods

## Map Interface Methods

| Method | Description | Example |
|--------|-------------|---------|
| `put(K key, V value)` | Insert or replace mapping | `map.put(1, "Java")` |
| `putAll(Map m)` | Copy all mappings | `map1.putAll(map2)` |
| `putIfAbsent(K, V)` | Insert only if key is absent | `map.putIfAbsent(1, "Spring")` |
| `get(Object key)` | Retrieve value by key | `map.get(1)` |
| `getOrDefault(key, default)` | Retrieve value or default | `map.getOrDefault(5, "Unknown")` |
| `remove(Object key)` | Remove by key | `map.remove(1)` |
| `remove(key, value)` | Remove only if key/value match | `map.remove(1, "Java")` |
| `replace(K key, V value)` | Replace value for key | `map.replace(1, "Spring")` |
| `replace(K, oldV, newV)` | Replace only if current value matches | `map.replace(1, "Java", "Spring")` |
| `replaceAll(BiFunction)` | Transform all values | `map.replaceAll((k,v) -> v.toUpperCase())` |
| `containsKey(Object key)` | Check key existence | `map.containsKey(1)` |
| `containsValue(Object value)` | Check value existence | `map.containsValue("Java")` |
| `keySet()` | View of all keys | `map.keySet()` |
| `values()` | View of all values | `map.values()` |
| `entrySet()` | View of all key-value entries | `map.entrySet()` |
| `forEach(BiConsumer)` | Action for each mapping | `map.forEach((k,v) -> ...)` |
| `compute(K, BiFunction)` | Compute a new value | `map.compute(1, (k,v) -> v + "!")` |
| `computeIfAbsent(K, Function)` | Compute when key is absent | `map.computeIfAbsent(2, k -> "Python")` |
| `computeIfPresent(K, BiFunction)` | Compute when key is present | `map.computeIfPresent(1, (k,v) -> v + "!")` |
| `merge(K, V, BiFunction)` | Merge existing and new value | `map.merge(1, "X", (old,neu) -> old + neu)` |
| `size()` | Number of mappings | `map.size()` |
| `isEmpty()` | Check if empty | `map.isEmpty()` |
| `clear()` | Remove all mappings | `map.clear()` |

```text
Put → Get → Remove → Replace → Contains → View → Compute → Size → forEach → Merge
```

## SortedMap

`SortedMap` adds key-sorted behavior. `TreeMap` is the main implementation.

| Method | Description |
|--------|-------------|
| `firstKey()` | Smallest key |
| `lastKey()` | Largest key |
| `headMap(K toKey)` | Keys < `toKey` |
| `tailMap(K fromKey)` | Keys >= `fromKey` |
| `subMap(K from, K to)` | Keys in `[from, to)` |
| `comparator()` | Comparator used; `null` for natural ordering |

## NavigableMap

`NavigableMap` adds navigation, reverse views, and boundary-aware range operations.

| Method | Description |
|--------|-------------|
| `lowerKey()` | Greatest key strictly less than the given key |
| `floorKey()` | Greatest key less than or equal to the given key |
| `ceilingKey()` | Smallest key greater than or equal to the given key |
| `higherKey()` | Smallest key strictly greater than the given key |
| `lowerEntry()` / `floorEntry()` / `ceilingEntry()` / `higherEntry()` | Same navigation using `Map.Entry` |
| `firstEntry()` / `lastEntry()` | First/last entry without removing |
| `pollFirstEntry()` / `pollLastEntry()` | Remove and return first/last entry |
| `descendingMap()` | Reverse-order view |
| `navigableKeySet()` | Navigable key-set view |
| `descendingKeySet()` | Reverse key-set view |
| `subMap(...)` | Range view with inclusive/exclusive controls |
| `headMap(...)` / `tailMap(...)` | Head/tail views with inclusive controls |

# Traversing a Map

Map-specific traversal should be based on the mapping representation.

```java
// Both key and value
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}

// Keys
for (Integer key : map.keySet()) {
    System.out.println(key + " = " + map.get(key));
}

// Values
for (String value : map.values()) {
    System.out.println(value);
}

// forEach()
map.forEach((k, v) ->
        System.out.println(k + " = " + v));
```

> **Best practice:** Use `entrySet()` when both key and value are needed. Using `keySet()` plus `get()` adds another lookup.

Generic Iterator/Spliterator/Stream traversal is covered in the Collection/Iterable documentation. For `ConcurrentHashMap`, its iterators are **weakly consistent**, so they do not throw `ConcurrentModificationException` because of concurrent modification and may reflect changes while traversal is in progress.

# Duplicate Keys

A Map cannot maintain multiple mappings for the same key at the same time.

```java
Map<Integer, String> map = new HashMap<>();

System.out.println(map.put(1, "Java"));    // null
System.out.println(map.put(1, "Spring"));  // Java
```

After the second `put()`:

```text
1 → Spring
```

> `put()` returns the previous value associated with the key, or `null` when there was no previous mapping.

# Custom Objects as Map Keys

For hash-based Maps, key equality depends on:

```text
hashCode()
   +
equals()
```

For custom key classes:

- Override both `equals()` and `hashCode()` consistently.
- Prefer immutable objects as keys.
- Do not modify fields that affect equality or hash code after insertion.

Otherwise, lookup and removal may fail because the object no longer behaves like the key representation used when it was inserted.

For `TreeMap`, keys need compatible ordering through either `Comparable` or a supplied `Comparator`. Incompatible keys can cause `ClassCastException` during comparison.

# HashMap

## Overview

`HashMap` is a widely used implementation of `Map` for general key-value storage.

It stores unique keys and allows duplicate values. Internally it uses a **Hash Table** combining an array with linked structures and, in Java 8+, Red-Black Trees for heavily collided buckets.

```java
public class HashMap<K,V>
        extends AbstractMap<K,V>
        implements Map<K,V>, Cloneable, Serializable
```

### Characteristics

- Fast average `get()`, `put()`, and `remove()`
- One `null` key
- Multiple `null` values
- No insertion-order guarantee
- No sorted-order guarantee
- Dynamic resizing
- Not thread-safe

## Hierarchy and Reference Type

```text
Object
   ↑
AbstractMap
   ↑
HashMap
```

```text
Map
 ↑
HashMap
```

The methods available depend on the reference type:

```java
Map<Integer, String> map = new HashMap<>();
map.clone();   // ❌ clone() is not declared in Map
```

## Constructors

| Constructor | Purpose |
|-------------|---------|
| `HashMap()` | Empty map; default capacity/load-factor behavior |
| `HashMap(int initialCapacity)` | Pre-size to reduce resizing |
| `HashMap(int initialCapacity, float loadFactor)` | Control resize threshold |
| `HashMap(Map<? extends K, ? extends V>)` | Copy mappings |

Source defaults:

```text
Capacity = 16
Load Factor = 0.75
```

## Capacity vs Size vs Threshold

| Concept | Meaning |
|---------|---------|
| Capacity | Number of buckets |
| Size | Actual number of mappings |
| Load Factor | Controls when resizing occurs |
| Threshold | `Capacity × Load Factor` |

Example:

```text
Capacity = 16
Load Factor = 0.75
Threshold = 12
```

## Internal Working

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

Collision?
 ↓
equals()
 ↓
Correct Entry
```

```text
Bucket 0 → null
Bucket 1 → Entry(20, "B")
Bucket 2 → null
Bucket 3 → Entry(10, "A") → Entry(50, "E")
Bucket 4 → Entry(30, "C")
```

### Important Internal Concepts

| Concept | Detail |
|---------|--------|
| Capacity | Default 16 in the supplied material; powers of two are used |
| Hashing | Key is processed to determine a bucket index |
| Collision | Different keys can map to the same bucket |
| Separate chaining | Collisions are linked within a bucket |
| Treeification | Java 8+ can convert a heavily collided bucket to a Red-Black Tree |
| Resizing | Table grows when threshold is exceeded |
| Rehashing | Entries are redistributed after resize |
| `modCount` | Tracks structural modifications for fail-fast iteration |
| Fail-fast iterator | Can throw `ConcurrentModificationException` on structural modification during traversal |

### Why Capacity Uses Powers of Two

The source explains that powers of two allow efficient bucket-index computation using bitwise operations and support better distribution with the internal hashing strategy.

### Why Default Capacity is 16

The supplied material describes 16 as a balance between memory, performance, and resizing frequency.

### Treeification Details

The supplied HashMap source states:

- Treeification at bucket size **8** when table capacity is at least **64**.
- Untreeification when the tree size becomes **6 or fewer**.
- Below capacity 64, resizing is preferred before treeification.

### Why Load Factor is 0.75

The supplied material describes `0.75` as a balance between unused memory and collision frequency.

## HashMap Specific Method — clone()

```java
(HashMap<K,V>) map.clone()
```

Creates a **shallow copy**: the map structure is copied, but key/value objects are not cloned.

```text
Original HashMap          Clone HashMap
    1 → [Java]      →         1 → [Java]   ← same object reference
    2 → [Python]    →         2 → [Python] ← same object reference
```

## Optimized Overrides / Implementations

The supplied hierarchy identifies Map operations implemented specifically for HashMap's internal structure, including:

```text
put()
get()
remove()
containsKey()
containsValue()
keySet()
values()
entrySet()
forEach()
replaceAll()
compute()
computeIfAbsent()
computeIfPresent()
merge()
clone()
equals()
hashCode()
```

## Complexity

### Average Case

| Operation | Complexity |
|-----------|------------|
| `put()` | O(1) |
| `get()` | O(1) |
| `remove()` | O(1) |
| `containsKey()` | O(1) |

### Scanning Operations

| Operation | Complexity | Reason |
|-----------|------------|--------|
| `containsValue()` | O(n) | Values are not hashed, so entries may need to be scanned |
| `clear()` | O(n) | Entries/buckets must be processed |
| Full traversal | O(n) | Each entry is visited |

### Worst-Case Notes

The source distinguishes pre-Java 8 linked-bucket worst cases (O(n)) from Java 8+ treeified buckets that can provide O(log n) behavior under the treeified collision condition.

# LinkedHashMap

## Overview

`LinkedHashMap` extends `HashMap` and maintains a **doubly linked list through its entries**, preserving either **insertion order** or **access order**.

```java
public class LinkedHashMap<K,V>
        extends HashMap<K,V>
        implements Map<K,V>
```

## Hierarchy and Relationships

```text
Object
   ↑
AbstractMap
   ↑
HashMap
   ↑
LinkedHashMap
```

```text
Map
 ↑
HashMap
 ↑
LinkedHashMap
```

`LinkedHashMap` directly extends `HashMap`; it is not a `SortedMap` or `NavigableMap` implementation.

### Relationship with HashMap

```text
HashMap                    LinkedHashMap
   ↓                          ↓
Hash Table              Hash Table
   ↓                          ↓
No ordering            Doubly Linked List
                              ↓
                       Insertion / Access Order
```

### Relationship with LinkedHashSet

The supplied material notes that `LinkedHashSet` shares the same ordering principle and is based on a `LinkedHashMap`-style key storage approach.

## Constructors

| Constructor | Purpose |
|-------------|---------|
| `LinkedHashMap()` | Default insertion-order map |
| `LinkedHashMap(int initialCapacity)` | Pre-size buckets |
| `LinkedHashMap(int initialCapacity, float loadFactor)` | Control resize threshold |
| `LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)` | Select insertion/access order |
| `LinkedHashMap(Map<? extends K, ? extends V>)` | Copy mappings |

## Insertion Order vs Access Order

| Mode | Parameter | Behavior | Use Case |
|------|-----------|----------|----------|
| Insertion order | `false` (default) | Entries stay in insertion order | Predictable iteration |
| Access order | `true` | Accessed entries move to the end | LRU behavior |

### Insertion Order Example

```java
LinkedHashMap<Integer, String> map =
        new LinkedHashMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map);
map.get(1);
System.out.println(map);
```

```text
{3=C, 1=A, 2=B}
{3=C, 1=A, 2=B}
```

### Access Order Example

```java
LinkedHashMap<Integer, String> map =
        new LinkedHashMap<>(16, 0.75f, true);

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

System.out.println(map);
map.get(1);
System.out.println(map);
```

```text
{3=C, 1=A, 2=B}
{3=C, 2=B, 1=A}
```

## Internal Working

```text
Hash Table (Buckets)
       ↓
Entry(1,"A") ── Entry(3,"C") ── Entry(2,"B")
        ↑              before / after pointers
```

| Component | Purpose |
|-----------|---------|
| Hash Table | Fast lookup/insertion/deletion |
| Doubly Linked List | Preserves entry order |
| Entry pointers | `before` and `after` links |
| Head | Eldest entry in current ordering |
| Tail | Youngest / most recently positioned entry |

Average lookup/insertion/removal remains O(1), with additional memory and bookkeeping for the linked order.

## Specific Methods

### `removeEldestEntry()`

```java
protected boolean removeEldestEntry(Map.Entry<K,V> eldest)
```

Called after insertion; returning `true` removes the eldest entry.

### LRU Cache

```java
LinkedHashMap<Integer, String> lruCache =
        new LinkedHashMap<>(16, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(
                    Map.Entry<Integer, String> eldest) {
                return size() > 3;
            }
        };
```

With access order enabled, the least-recently used entry is at the front. `removeEldestEntry()` can remove it automatically when the capacity rule is reached.

### `clone()`

Creates a shallow copy: the collection structure is copied, but stored objects are not cloned.

## Optimized Overrides

The source identifies linked-order-aware implementations for operations including:

```text
put()
get()
remove()
containsKey()
containsValue()
keySet()
values()
entrySet()
forEach()
replaceAll()
compute()
computeIfAbsent()
computeIfPresent()
merge()
equals()
hashCode()
clone()
```

## When to Use LinkedHashMap

Use it when:

- Predictable iteration order is required.
- Insertion order must be preserved.
- Access order is needed for LRU behavior.
- Map copying must preserve ordering.

Avoid it when:

- Sorted order is required → `TreeMap`.
- Only fast lookup matters → `HashMap`.
- Concurrent access is required without external synchronization → suitable concurrent implementation.

# TreeMap

## Overview

`TreeMap` implements `NavigableMap` and stores mappings in **ascending key order by default**.

```java
public class TreeMap<K,V>
        extends AbstractMap<K,V>
        implements NavigableMap<K,V>,
                   Cloneable,
                   Serializable
```

## Hierarchy

```text
Object
   ↑
AbstractMap
   ↑
TreeMap
```

```text
Map
 ↑
SortedMap
 ↑
NavigableMap
 ↑
TreeMap
```

## Why TreeMap Exists

| Collection | Provides | Missing |
|------------|----------|---------|
| HashMap | Fast average lookup | No ordering |
| LinkedHashMap | Insertion/access order | No sorted-key navigation |
| TreeMap | Sorted keys, navigation, range queries | O(log n) operations |

## Constructors

| Constructor | Purpose |
|-------------|---------|
| `TreeMap()` | Natural ordering |
| `TreeMap(Comparator<? super K>)` | Custom ordering |
| `TreeMap(Map<? extends K, ? extends V>)` | Copy into natural ordering |
| `TreeMap(SortedMap<K, ? extends V>)` | Copy while preserving sorted ordering |

### Natural Ordering vs Comparator

| Aspect | Natural Ordering | Comparator |
|--------|------------------|------------|
| Source | `Comparable` | External `Comparator` |
| Method | `compareTo()` | `compare()` |
| Flexibility | One natural ordering | Multiple custom orderings |

```java
TreeMap<Integer, String> map = new TreeMap<>();
TreeMap<Integer, String> reverse =
        new TreeMap<>(Collections.reverseOrder());
```

## Internal Working

`TreeMap` uses a **Red-Black Tree**, a self-balancing Binary Search Tree.

```text
       20
      /  \
    10    30
         /  \
        25   40
```

### Why a Normal BST Is Not Enough

A regular BST can become skewed and approach O(n) height. The Red-Black Tree maintains balance so basic operations stay O(log n).

### Red-Black Rules from the Source

1. A node is Red or Black.
2. The root is Black.
3. Null leaves are Black.
4. A Red node cannot have a Red child.
5. Paths maintain the required equal black-node count.

Tree rotations restore balance after structural changes.

### Internal Comparison Flow

```text
Key
 ↓
Compare
 ↓
Go Left / Go Right
 ↓
Insert / Find / Remove
 ↓
Rebalance
```

There is no hashing, no bucket table, and no hash-based treeification.

## SortedMap Methods

| Method | Purpose |
|--------|---------|
| `comparator()` | Returns comparator; `null` for natural ordering |
| `firstKey()` | Smallest key |
| `lastKey()` | Largest key |
| `headMap(toKey)` | View of keys `< toKey` |
| `tailMap(fromKey)` | View of keys `>= fromKey` |
| `subMap(fromKey, toKey)` | View in `[fromKey, toKey)` |

These range methods are views backed by the original TreeMap in the supplied material.

## NavigableMap Methods

| Method | Purpose |
|--------|---------|
| `firstEntry()` / `lastEntry()` | First/last entry without removal |
| `pollFirstEntry()` / `pollLastEntry()` | Remove and return extreme entries |
| `higherKey()` / `higherEntry()` | Strictly greater |
| `lowerKey()` / `lowerEntry()` | Strictly smaller |
| `ceilingKey()` / `ceilingEntry()` | Greater than or equal |
| `floorKey()` / `floorEntry()` | Less than or equal |
| `descendingMap()` | Reverse-order view |
| `navigableKeySet()` | Ascending navigable key view |
| `descendingKeySet()` | Reverse key view |
| `subMap(..., boolean)` | Inclusive/exclusive range view |
| `headMap(..., boolean)` | Inclusive/exclusive head view |
| `tailMap(..., boolean)` | Inclusive/exclusive tail view |

### Navigation Example

```text
Keys: 10, 20, 40, 50

Query: 25

lowerKey(25)    → 20
floorKey(25)    → 20
ceilingKey(25)  → 40
higherKey(25)   → 40
```

## Null Keys and Values

With normal natural ordering, a `null` key is not allowed because keys must be comparable. Values may be `null`.

## Specific Method — clone()

`clone()` creates a shallow copy of the TreeMap structure. Key and value objects are not cloned.

## Complexity

| Operation | Complexity |
|-----------|------------|
| `put()` | O(log n) |
| `get()` | O(log n) |
| `remove()` | O(log n) |
| Navigation | O(log n) |
| Range-view creation | O(1) view in the supplied material |

## Optimized Overrides

The TreeMap source identifies tree-aware implementations for operations such as:

```text
put()
get()
remove()
containsKey()
containsValue()
firstKey()
lastKey()
higherKey()
lowerKey()
iterator()
descendingIterator()
spliterator()
forEach()
removeIf()
clone()
```

# Other Map Implementations

## Hashtable

Legacy synchronized Map implementation.

- Synchronized methods
- Thread-safe
- No `null` keys or values
- Legacy API
- Synchronization overhead can reduce scalability

For new concurrent applications, the supplied material recommends `ConcurrentHashMap`.

## WeakHashMap

Uses weak references for keys.

```text
Key
 ↓
Weak Reference
 ↓
Key becomes unreachable
 ↓
Garbage Collection
 ↓
Entry can disappear
```

- Entries can be removed when keys are garbage-collected.
- Useful for certain caches, metadata associations, and listener registries.
- Lifetime depends on GC and other strong references.
- Removal is not deterministic.

## IdentityHashMap

Uses **reference equality (`==`)** rather than logical `equals()` key comparison.

```text
HashMap          → equals()
IdentityHashMap  → ==
```

Use it only when object identity is the actual requirement.

## EnumMap

Specialized for enum keys.

- Keys must belong to one enum type.
- Uses an array-oriented representation indexed by enum ordinal.
- O(1) operations in the supplied material.
- Maintains natural enum declaration order.
- Memory-efficient for enum-keyed maps.

```java
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

Map<Day, String> schedule = new EnumMap<>(Day.class);
```

# ConcurrentMap

## What is ConcurrentMap?

`ConcurrentMap<K,V>` is a child interface of `Map` designed for **thread-safe access to key-value pairs in concurrent applications**.

```java
public interface ConcurrentMap<K, V>
        extends Map<K, V>
```

It introduces atomic operations for common compound updates.

## ConcurrentMap Hierarchy

```text
Map
 │
 ▼
ConcurrentMap
 │
 ▼
ConcurrentHashMap
```

## Features

- Thread-safe design
- Concurrent reads/writes through concurrent implementations
- Atomic compound operations
- No `null` keys or values in `ConcurrentHashMap`
- High scalability compared with the legacy synchronized approach described for `Hashtable`

## Why Do We Need ConcurrentMap?

Using `HashMap` from multiple threads can lead to race conditions, lost updates, and inconsistent shared state.

A classic unsafe sequence is:

```java
if (!map.containsKey(key)) {
    map.put(key, value);
}
```

The check and insertion are separate operations. Another thread can change the map between them.

Use an atomic operation instead:

```java
map.putIfAbsent(key, value);
```

# ConcurrentMap Atomic Methods

| Method | Purpose |
|--------|---------|
| `putIfAbsent(K,V)` | Insert only when absent |
| `remove(key,value)` | Remove only when key and value match |
| `replace(key,value)` | Replace only when key exists |
| `replace(key,oldValue,newValue)` | Replace only when current value matches |
| `compute(key,function)` | Compute value atomically |
| `computeIfAbsent(key,function)` | Compute only when absent |
| `computeIfPresent(key,function)` | Compute only when present |
| `merge(key,value,function)` | Insert or combine atomically |
| `forEach(...)` | Process mappings |
| `replaceAll(...)` | Update mappings |
| `getOrDefault(...)` | Read with fallback |

## Detailed Atomic Operations

### putIfAbsent()

```java
ConcurrentMap<Integer, String> map =
        new ConcurrentHashMap<>();

map.put(1, "Java");
map.putIfAbsent(1, "Python");

System.out.println(map);
```

```text
{1=Java}
```

### remove(key, value)

```java
map.remove(1, "Java");
```

Removes the mapping only if the current key-value pair matches.

### replace(key, oldValue, newValue)

```java
map.replace(1, "Java", "Spring");
```

Replaces the current value only when it matches the expected old value.

### compute()

```java
map.compute(1, (k, v) -> v + " Boot");
```

The function receives the key and current value. If the function returns `null`, the mapping is removed under the supplied Map semantics.

### computeIfAbsent()

```java
map.computeIfAbsent(2, k -> "Python");
```

Used for lazy initialization and caching.

### computeIfPresent()

```java
map.computeIfPresent(2, (k, v) -> "Python 3");
```

Runs only when the key already exists.

### merge()

```java
map.merge(2,
          " Tutorial",
          (oldValue, newValue) -> oldValue + newValue);
```

Useful for counters and aggregations.

### forEach()

```java
map.forEach((k, v) ->
        System.out.println(k + " = " + v));
```

### replaceAll()

```java
map.replaceAll((k, v) -> v.toUpperCase());
```

### getOrDefault()

```java
map.getOrDefault(10, "Not Found");
```

## Method Choice: compute vs computeIfAbsent vs merge

| Method | Absent Key | Present Key | Typical Use |
|--------|------------|-------------|-------------|
| `compute()` | Function runs | Function runs with current value | Full control |
| `computeIfAbsent()` | Function runs | Function does not run | Lazy initialization |
| `computeIfPresent()` | Nothing | Function runs | Update existing value |
| `merge()` | Inserts supplied value | Combines values | Counters / aggregation |

# ConcurrentHashMap

## Overview

`ConcurrentHashMap` is the primary implementation of `ConcurrentMap` in the supplied material.

```java
public class ConcurrentHashMap<K, V>
        extends AbstractMap<K, V>
        implements ConcurrentMap<K, V>, Serializable
```

It provides thread-safe operations using fine-grained coordination rather than one global map-wide lock for every operation.

## Hierarchy

```text
Map
    ↑
AbstractMap
    ↑
ConcurrentHashMap
```

```text
Map
 ↑
ConcurrentMap
 ↑
ConcurrentHashMap
```

## Constructors

| Constructor | Purpose |
|-------------|---------|
| `ConcurrentHashMap()` | Empty concurrent map |
| `ConcurrentHashMap(int initialCapacity)` | Pre-size the table |
| `ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)` | Fine-tune sizing information |
| `ConcurrentHashMap(Map<? extends K, ? extends V>)` | Copy entries |

The supplied material uses these defaults/sizing concepts:

```text
Capacity = 16
Load Factor = 0.75
Concurrency Level = 16 (sizing information)
```

In Java 8+, `concurrencyLevel` is a sizing hint rather than a strict number of segments.

## Capacity vs Size vs Load Factor

| Concept | Meaning |
|---------|---------|
| Capacity | Number of buckets / table sizing |
| Size | Actual number of mappings |
| Load Factor | Resize-related ratio |
| Concurrency Level | Estimated level of concurrent updates used as a sizing hint |

# ConcurrentHashMap Internal Working

## Internal Data Structure

```text
Bucket

0 → Node
1 → Node
2 → Node
3 → TreeNode (heavy collision)
4 → Node
```

Heavily collided buckets may be converted to balanced trees.

## Java 7 vs Java 8+

| Feature | Java 7 | Java 8+ |
|---------|---------|---------|
| Locking | Segment-level locking | Bucket-level coordination using CAS + synchronization |
| Concurrency | Good | Better in the supplied comparison |
| Collision handling | Linked structures | Red-Black Tree for heavy collisions |
| Memory overhead | Higher segment overhead | Lower segment overhead |

### Java 7: Segment-Level Locking

The supplied source describes the map as divided into segments, each with its own lock. Different segments can be accessed concurrently.

### Java 8+: Bucket-Level Coordination

The supplied source describes:

- CAS (Compare-And-Swap) for many updates
- `synchronized` blocks on individual buckets when needed
- Red-Black Tree conversion for heavily collided buckets

### Thread Safety Example

```text
Thread A → Bucket 5 → CAS / synchronization
Thread B → Bucket 5 → concurrent read
Thread C → Bucket 12 → CAS / synchronization
```

The goal is to avoid unnecessary contention between operations that affect different parts of the table.

## Why Null Is Not Allowed

```java
map.put(null, "value"); // ❌ NullPointerException
map.put("key", null);   // ❌ NullPointerException
```

The supplied explanation: `get(key)` returning `null` must remain unambiguous. If `null` could be stored as a value, an absent key and a present key mapped to `null` would be indistinguishable during concurrent operations.

## Weakly Consistent Iterators

- Do not throw `ConcurrentModificationException` because of concurrent modification.
- May reflect modifications made during iteration.
- Are intended for concurrent traversal rather than fail-fast behavior.

# ConcurrentHashMap Specific Methods

## Parallel `forEach()`

```java
map.forEach(
        parallelismThreshold,
        (k, v) -> process(k, v));
```

The supplied material describes `parallelismThreshold` as the estimated size above which parallel execution may be triggered.

## Parallel `search()`

```java
map.search(
        parallelismThreshold,
        (k, v) -> v > 25 ? k : null);
```

Used for parallel searching and returns a matching non-null result according to the operation semantics.

## Parallel `reduce()`

```java
map.reduce(
        parallelismThreshold,
        (k, v) -> v,
        Integer::sum);
```

Used for parallel reduction/aggregation.

## Other Java 8+ Parallel Methods

```text
reduceToLong()
reduceToInt()
reduceToDouble()
reduceKeys()
reduceValues()
```

The hierarchy also identifies threshold-based `forEachKey()`, `forEachValue()`, and `forEachEntry()` forms.

## newKeySet()

```java
Set<String> set = ConcurrentHashMap.newKeySet();
```

Creates a thread-safe Set backed by `ConcurrentHashMap`.

An overload accepts an initial capacity.

## mappingCount()

The supplied ConcurrentMap material identifies `mappingCount()` as a ConcurrentHashMap-specific way to count mappings using `long`.

## keySet(mappedValue)

The supplied material also identifies a ConcurrentHashMap key-set form that associates newly added keys with a mapped value.

# ConcurrentHashMap vs Hashtable

| Feature | ConcurrentHashMap | Hashtable |
|---------|-------------------|-----------|
| Thread Safe | Yes | Yes |
| Locking | Fine-grained | Synchronized legacy model |
| Null Keys | No | No |
| Null Values | No | No |
| Atomic compound operations | Yes | Not provided in the same way |
| Modern role | Preferred for concurrent applications | Legacy |

# ConcurrentHashMap Performance

| Operation | HashMap | Hashtable | ConcurrentHashMap |
|-----------|---------|----------|-------------------|
| `get()` | O(1)* | O(1)* | O(1)* |
| `put()` | O(1)* | O(1)* | O(1)* |
| `remove()` | O(1)* | O(1)* | O(1)* |
| Thread Safe | No | Yes | Yes |
| Scalability | General | Lower in supplied comparison | High |

> `*` Average case.

### Memory Comparison

| Implementation | Memory Usage |
|----------------|--------------|
| HashMap | Lowest |
| Hashtable | Medium |
| ConcurrentHashMap | Slightly higher |

# Other Map Use Cases

| Scenario | Choice | Why |
|----------|--------|-----|
| User ID → Profile | `HashMap` | Fast general lookup |
| Configuration | `HashMap` | General key-value storage |
| Word frequency counter | `HashMap` | Fast counting |
| Phone contacts | `HashMap` | Fast lookup by key |
| Recently accessed items / LRU | `LinkedHashMap` | Access-order iteration |
| Ordered session tracking | `LinkedHashMap` | Predictable order |
| Dictionary / alphabetical keys | `TreeMap` | Sorted keys |
| Leaderboard / range search | `TreeMap` | Sorted keys + range operations |
| Shared concurrent cache | `ConcurrentHashMap` | Thread-safe operations |
| Banking system | `ConcurrentHashMap` | Concurrent updates |
| Online shopping/inventory | `ConcurrentHashMap` | Multiple concurrent accesses |
| Session management | `ConcurrentHashMap` | Shared multithreaded access |
| API rate limiter | `ConcurrentHashMap` | Concurrent counters |
| Weak-key metadata cache | `WeakHashMap` | Weak-key lifecycle |
| Listener registry | `WeakHashMap` | Keys can disappear after GC |
| Day-of-week scheduling | `EnumMap` | Enum-specific storage |
| Status/state routing | `EnumMap` | Type-safe enum keys |
| Object identity tracking | `IdentityHashMap` | Reference equality |
| Serialization/object-graph internals | `IdentityHashMap` | Track object instances |

# Common Misconceptions and Mistakes

| Mistake / Myth | Reality / Solution |
|----------------|--------------------|
| Map extends Collection | `Map` has a separate hierarchy. |
| HashMap stores entries in insertion order | No ordering guarantee. |
| LinkedHashMap provides sorting | It provides insertion/access order, not sorted key order. |
| TreeMap is just a sorted HashMap | TreeMap uses a Red-Black Tree, not hashing. |
| Hashtable is the modern concurrent Map | It is a legacy synchronized implementation. |
| All Maps allow null keys | Null support depends on implementation. |
| IdentityHashMap uses `equals()` | It uses reference equality `==`. |
| WeakHashMap removes entries immediately | Removal depends on GC and reachability. |
| Duplicate keys coexist | A later `put()` replaces the previous value. |
| `keySet()` + `get()` is best when both parts are needed | Prefer `entrySet()`. |
| Check then `put()` is atomic on a concurrent map | Use `putIfAbsent()` or `computeIfAbsent()`. |
| ConcurrentHashMap is fully lock-free | It uses CAS and synchronization where required. |
| Mutable hash keys are safe | Mutating equality/hash state can make lookup fail. |

# Best Practices

- Use **HashMap** for general-purpose key-value storage.
- Use **LinkedHashMap** when insertion/access order matters.
- Use **TreeMap** when sorted keys, navigation, or range queries matter.
- Use **ConcurrentHashMap** for shared concurrent access.
- Use **EnumMap** for enum keys.
- Use **WeakHashMap** only when weak-key behavior is actually required.
- Use **IdentityHashMap** only when reference identity is required.
- Treat **Hashtable** as a legacy implementation.
- Override both `equals()` and `hashCode()` for custom hash-based Map keys.
- Prefer immutable objects as Map keys.
- Use `entrySet()` when both key and value are required.
- Prefer atomic ConcurrentMap operations over manual check-then-act synchronization.
- `Map.of()` / `Map.ofEntries()` can be used for small immutable maps (Java 9+).

# Quick Reference

| Need | Use |
|------|-----|
| Fast general key-value lookup | **HashMap** |
| Preserve insertion/access order | **LinkedHashMap** |
| Sorted keys + range/navigation | **TreeMap** |
| Thread-safe concurrent access | **ConcurrentHashMap** |
| Legacy synchronized Map | **Hashtable** |
| Weak-key / GC-sensitive behavior | **WeakHashMap** |
| Enum keys | **EnumMap** |
| Reference equality (`==`) | **IdentityHashMap** |

# Interview Quick Reference

**Q: Is Map a child of Collection?**  
A: No. `Map` is part of the Collections Framework but has a separate hierarchy.

**Q: What happens when an existing key is inserted again?**  
A: The previous value is replaced, and `put()` returns the old value.

**Q: Which Map preserves insertion order?**  
A: `LinkedHashMap`.

**Q: Which Map maintains sorted keys?**  
A: `TreeMap`.

**Q: Which Map is designed for concurrent access?**  
A: `ConcurrentHashMap` through the `ConcurrentMap` interface.

**Q: Why does HashMap use both `hashCode()` and `equals()`?**  
A: `hashCode()` helps locate the bucket and `equals()` confirms key equality.

**Q: What is the difference between HashMap and IdentityHashMap?**  
A: HashMap uses logical equality; IdentityHashMap uses `==`.

**Q: Why is WeakHashMap different?**  
A: Its keys are weakly referenced, so entries can disappear after keys become unreachable and are garbage-collected.

**Q: Why use LinkedHashMap over HashMap?**  
A: When predictable insertion/access order is needed.

**Q: Why use TreeMap over HashMap?**  
A: When sorted keys, navigation, or range operations are required.

**Q: What is the main advantage of `putIfAbsent()`?**  
A: It performs the check-and-insert operation atomically.

**Q: What is the difference between `compute()` and `computeIfAbsent()`?**  
A: `compute()` is invoked with the current mapping state; `computeIfAbsent()` only computes when the key is absent.

**Q: Why doesn't ConcurrentHashMap allow null keys or values?**  
A: The supplied material explains that `null` would make `get()` ambiguous between a missing key and a key mapped to `null`.

# One-Line Summary

> **HashMap** → General / fast average key-value storage  
> **LinkedHashMap** → Key-value storage + insertion/access order  
> **TreeMap** → Sorted keys + navigation + range operations  
> **Hashtable** → Legacy synchronized Map  
> **WeakHashMap** → Weak-key / GC-sensitive behavior  
> **IdentityHashMap** → Reference equality (`==`)  
> **EnumMap** → Specialized enum-key Map  
> **ConcurrentMap** → Atomic concurrent Map operations  
> **ConcurrentHashMap** → Thread-safe high-concurrency Map

> **Key Principle:** Choose the Map implementation based on **ordering**, **sorting/navigation**, **key semantics**, **memory/lifecycle behavior**, and **concurrency requirements**.
