# TreeMap Method Hierarchy

## Overview

`TreeMap` is a sorted implementation of the `NavigableMap` interface that stores key-value pairs in **ascending order of keys** by default.

Unlike `HashMap`, which uses a Hash Table, `TreeMap` stores entries inside a **Red-Black Tree**, a self-balancing Binary Search Tree.

It automatically keeps keys sorted using either:

- Natural Ordering (`Comparable`)
- Custom Ordering (`Comparator`)

Internally, `TreeMap` uses:

- Red-Black Tree
- Binary Search Tree Operations
- Tree Rotation
- Comparator (Optional)
- Comparable (Default)

It does **not** use:

- Hash Table
- Buckets
- Linked List
- Treeification (already a tree)

It provides:

- Sorted Keys
- Fast Lookup
- Fast Insertion
- Fast Deletion
- Range Operations
- First Entry
- Last Entry
- Floor Entry
- Ceiling Entry
- Higher Entry
- Lower Entry
- Descending View

Since `TreeMap` implements the `NavigableMap` interface, it automatically inherits all methods from `Map`, `SortedMap`, and `NavigableMap`.

---

## Class Declaration

```java
public class TreeMap<K,V>
        extends AbstractMap<K,V>
        implements NavigableMap<K,V>,
                   Cloneable,
                   Serializable
```

---

## Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
TreeMap
```

---

## Interface Relationship

```text
Map (I)
 ↑
SortedMap (I)
 ↑
NavigableMap (I)
 ↑
TreeMap (Class)
```

---

## Complete TreeMap Method Hierarchy

```text
TreeMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── TreeMap()
├── TreeMap(Comparator<? super K>)
├── TreeMap(Map<? extends K,
│            ? extends V>)
└── TreeMap(SortedMap<K,
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
├── containsKey()
├── containsValue()
├── size()
├── isEmpty()
├── clear()
├── keySet()
├── values()
├── entrySet()
├── replace()
├── replaceAll()
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
└── merge()

│
├──────────────────────────────────────────────
│ Methods Inherited from SortedMap
├──────────────────────────────────────────────
│
├── comparator()
├── firstKey()
├── lastKey()
├── headMap()
├── tailMap()
└── subMap()

│
├──────────────────────────────────────────────
│ Methods Inherited from NavigableMap
├──────────────────────────────────────────────
│
├── firstEntry()
├── lastEntry()
├── higherKey()
├── higherEntry()
├── lowerKey()
├── lowerEntry()
├── ceilingKey()
├── ceilingEntry()
├── floorKey()
├── floorEntry()
├── pollFirstEntry()
├── pollLastEntry()
├── descendingMap()
├── descendingKeySet()
├── navigableKeySet()
└── subMap(..., boolean)

│
├──────────────────────────────────────────────
│ TreeMap Specific Features
├──────────────────────────────────────────────
│
└── clone()
```

---

## Understanding the Hierarchy

The methods available in a `TreeMap` object come from multiple interfaces in the Java Collections Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `TreeMap` class | `TreeMap()`, `TreeMap(Comparator)`, `TreeMap(Map)`, `TreeMap(SortedMap)` | Not inherited; control ordering behavior |
| **Map** | `TreeMap implements NavigableMap → SortedMap → Map` | `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `entrySet()` | Standard key-value operations |
| **SortedMap** | `NavigableMap extends SortedMap` | `comparator()`, `firstKey()`, `lastKey()`, `headMap()`, `tailMap()`, `subMap()` | Sorting and range methods |
| **NavigableMap** | `TreeMap implements NavigableMap` | `higherKey()`, `lowerKey()`, `ceilingKey()`, `floorKey()`, `pollFirstEntry()`, `descendingMap()` | Navigation and bidirectional traversal |
| **TreeMap Specific** | `TreeMap` class | `clone()` | Shallow copy; Red-Black Tree implementation |

> **Important:** The methods available in your code depend on the **reference type** (`Map`, `SortedMap`, `NavigableMap`, or `TreeMap`), even when the object is a `TreeMap`.
> ```java
> Map<Integer, String> map = new TreeMap<>();
> map.firstKey();        // ❌ Compile error — not in Map interface
> map.descendingMap();   // ❌ Compile error — not in Map interface
> ```

---

## Comparison with Other Map Implementations

| Feature | HashMap | LinkedHashMap | TreeMap |
|----------|---------|---------------|---------|
| Internal Structure | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree |
| Ordering | No Guarantee | Insertion / Access | Sorted |
| Null Key | Yes (one) | Yes (one) | No (Natural Ordering) |
| Null Values | Yes | Yes | Yes |
| Lookup | O(1) | O(1) | O(log n) |
| Insertion | O(1) | O(1) | O(log n) |
| Range Queries | No | No | Yes |
| Comparator | No | No | Yes |

---

## TreeMap Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `TreeMap()` | `new TreeMap<>()` | Empty map; natural ordering | O(1) | O(1) |
| `TreeMap(Comparator<? super K>)` | `new TreeMap<>(Collections.reverseOrder())` | Custom ordering via Comparator | O(1) | O(1) |
| `TreeMap(Map<? extends K, ? extends V>)` | `new TreeMap<>(existingMap)` | Copy from another map; natural ordering | O(n log n) | O(n) |
| `TreeMap(SortedMap<K, ? extends V>)` | `new TreeMap<>(sortedMap)` | Copy from sorted map; same ordering | O(n) | O(n) |

### Ordering Summary

| Constructor | Ordering |
|------------|----------|
| `TreeMap()` | Natural Ordering (`Comparable`) |
| `TreeMap(Comparator)` | Custom Ordering |
| `TreeMap(Map)` | Natural Ordering after copying |
| `TreeMap(SortedMap)` | Same Ordering as Source Map |

```java
TreeMap<Integer, String> map = new TreeMap<>();
map.put(40, "D");
map.put(20, "B");
map.put(60, "F");
map.put(10, "A");
// Iteration order: 10 → 20 → 40 → 60 (sorted)
```

---

## TreeMap Specific Method

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `clone()` | `(TreeMap<K,V>) map.clone()` | Creates a **shallow copy** — new TreeMap, same key/value references | O(n) | O(n) |

### Shallow Copy

`clone()` performs a **shallow copy** — the TreeMap structure is copied, but stored objects are **not cloned**.

```
Original TreeMap          Clone TreeMap
    10 → [A]      →         10 → [A]      ← Same object referenced
    20 → [B]      →         20 → [B]      ← Same object referenced
    40 → [D]      →         40 → [D]      ← Same object referenced
```

---

## Methods Inherited from SortedMap

| Method | Syntax | Purpose | Example |
|--------|--------|---------|---------|
| `comparator()` | `Comparator<? super K> c = map.comparator()` | Returns Comparator used; `null` if natural ordering | `null` for natural ordering |
| `firstKey()` | `K key = map.firstKey()` | Smallest key | `10` in `{10,20,30,40}` |
| `lastKey()` | `K key = map.lastKey()` | Largest key | `40` in `{10,20,30,40}` |
| `headMap(toKey)` | `SortedMap<K,V> head = map.headMap(40)` | Keys strictly less than `toKey` | `{10,20,30}` |
| `tailMap(fromKey)` | `SortedMap<K,V> tail = map.tailMap(30)` | Keys greater than or equal to `fromKey` | `{30,40,50}` |
| `subMap(fromKey, toKey)` | `SortedMap<K,V> sub = map.subMap(20, 50)` | Keys from `fromKey` (inclusive) to `toKey` (exclusive) | `{20,30,40}` |

---

## Methods Inherited from NavigableMap

| Method | Syntax | Purpose | Example (keys: 10,20,40,50) |
|--------|--------|---------|------------------------------|
| `firstEntry()` | `Map.Entry<K,V> e = map.firstEntry()` | First entry (smallest key) | `10 → A` |
| `lastEntry()` | `Map.Entry<K,V> e = map.lastEntry()` | Last entry (largest key) | `50 → E` |
| `pollFirstEntry()` | `Map.Entry<K,V> e = map.pollFirstEntry()` | Remove and return first entry | Removes `10 → A` |
| `pollLastEntry()` | `Map.Entry<K,V> e = map.pollLastEntry()` | Remove and return last entry | Removes `50 → E` |
| `higherKey(key)` | `K k = map.higherKey(20)` | Strictly greater key | `40` |
| `higherEntry(key)` | `Map.Entry<K,V> e = map.higherEntry(20)` | Strictly greater entry | `40 → D` |
| `lowerKey(key)` | `K k = map.lowerKey(40)` | Strictly smaller key | `20` |
| `lowerEntry(key)` | `Map.Entry<K,V> e = map.lowerEntry(40)` | Strictly smaller entry | `20 → B` |
| `ceilingKey(key)` | `K k = map.ceilingKey(25)` | Equal or greater key | `40` |
| `ceilingEntry(key)` | `Map.Entry<K,V> e = map.ceilingEntry(25)` | Equal or greater entry | `40 → D` |
| `floorKey(key)` | `K k = map.floorKey(25)` | Equal or smaller key | `20` |
| `floorEntry(key)` | `Map.Entry<K,V> e = map.floorEntry(25)` | Equal or smaller entry | `20 → B` |
| `descendingMap()` | `NavigableMap<K,V> desc = map.descendingMap()` | Reverse ordered view | `50 → 40 → 20 → 10` |
| `descendingKeySet()` | `NavigableSet<K> keys = map.descendingKeySet()` | Keys in reverse order | `50, 40, 20, 10` |
| `navigableKeySet()` | `NavigableSet<K> keys = map.navigableKeySet()` | Keys in ascending order | `10, 20, 40, 50` |

### Navigation Method Comparison

```text
Keys: 10, 20, 40, 50

Query: 25
   ↓
lowerKey(25)    → 20    (strictly smaller)
floorKey(25)    → 20    (equal or smaller)
ceilingKey(25)  → 40    (equal or greater)
higherKey(25)   → 40    (strictly greater)
```

---

## Internal TreeMap Concepts

| Concept | Description | Key Detail |
|---------|-------------|------------|
| **Internal Structure** | Red-Black Tree | No buckets, no hashing, no linked lists |
| **Binary Search Tree (BST)** | Left Child < Parent < Right Child | Searching follows BST property |
| **Why Normal BST is Not Enough** | Can become skewed → O(n) height | Example: inserting 10,20,30,40,50 creates a chain |
| **Red-Black Tree** | Self-balancing BST | Guarantees O(log n) operations |
| **Red-Black Rules** | 5 rules maintain balance | (1) Node is Red or Black; (2) Root is Black; (3) NULL leaves are Black; (4) Red node cannot have Red child; (5) Equal black nodes on all paths |
| **Tree Rotation** | Rebalances tree without rebuilding | Left Rotation and Right Rotation |
| **Natural Ordering** | Default sorting via `Comparable.compareTo()` | `TreeMap<Integer,String>` → ascending order |
| **Custom Ordering** | Sorting via `Comparator.compare()` | `Collections.reverseOrder()` → descending |
| **compareTo()** | Used when no Comparator supplied | Custom objects must implement `Comparable` |
| **Comparator** | Overrides natural ordering if supplied | `compare()` used instead of `compareTo()` |
| **Duplicate Keys** | Not allowed | Existing value is replaced |
| **Duplicate Values** | Allowed | Multiple keys can map to same value |
| **Null Keys** | Not allowed with natural ordering | `compareTo()` cannot compare `null` → `NullPointerException` |
| **Null Values** | Allowed | Valid |
| **Internal Comparison** | Compare → Go Left/Right → Insert → Balance | No hashing involved |
| **Performance** | `put()`, `get()`, `remove()` → O(log n) | Balanced tree guarantees this |
| **Memory** | Each node stores Key, Value, Color, Parent, Left, Right | More overhead per entry than HashMap |
| **Use Cases** | Leaderboards, scheduling, calendars, stock prices, banking, auto-complete, time-series, range queries | When sorted data or range operations are needed |

### Why TreeMap Exists

| Collection | Provides | Missing |
|------------|----------|---------|
| HashMap | Fast lookup O(1) | No ordering |
| LinkedHashMap | Insertion order | No sorting |
| TreeMap | Automatic sorted order | Slightly slower O(log n) |

---

## Optimized Overrides

`TreeMap` reimplements these inherited methods using a **Red-Black Tree**:

```java
put()              get()               remove()
containsKey()      containsValue()     firstKey()
lastKey()          higherKey()         lowerKey()
ceilingKey()       floorKey()          pollFirstEntry()
pollLastEntry()    subMap()            headMap()
tailMap()          descendingMap()     descendingKeySet()
navigableKeySet()  clone()             forEach()
replaceAll()       compute()           computeIfAbsent()
computeIfPresent() merge()
```

Internally these methods use:
- Red-Black Tree
- Tree Traversal
- Tree Rotation
- Comparator
- Comparable

Instead of:
- Hash Table
- Buckets
- Linked List

---

## Important Notes

- Extends `AbstractMap`.
- Implements `NavigableMap` (inherits `SortedMap` and `Map`).
- Uses a **Red-Black Tree** — self-balancing Binary Search Tree.
- Automatically sorts keys.
- Supports **Natural Ordering** (`Comparable`) and **Custom Ordering** (`Comparator`).
- No hashing, no buckets, no linked lists.
- Null keys are **not allowed** with natural ordering.
- Null values are allowed.
- Duplicate keys are **not allowed** (value replaced).
- Duplicate values are allowed.
- Average lookup, insertion, and removal are **O(log n)**.
- Ideal for sorted data and range-based queries.

---

## Time Complexity

### Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| `TreeMap()` | O(1) | O(1) |
| `TreeMap(Comparator)` | O(1) | O(1) |
| `TreeMap(Map)` | O(n log n) | O(n) |
| `TreeMap(SortedMap)` | O(n) *(optimized build)* | O(n) |
| `clone()` | O(n) | O(n) |

### Basic Operations

| Operation | Time Complexity |
|-----------|----------------:|
| `put()` | O(log n) |
| `get()` | O(log n) |
| `remove()` | O(log n) |
| `containsKey()` | O(log n) |
| `containsValue()` | O(n) |
| `firstKey()` | O(log n) |
| `lastKey()` | O(log n) |
| `higherKey()` | O(log n) |
| `lowerKey()` | O(log n) |
| `ceilingKey()` | O(log n) |
| `floorKey()` | O(log n) |

### Range Operations

| Operation | Time Complexity |
|-----------|----------------:|
| `headMap()` | O(log n) |
| `tailMap()` | O(log n) |
| `subMap()` | O(log n) |
| `descendingMap()` | O(1) *(view creation)* |
| `navigableKeySet()` | O(1) *(view creation)* |

> Creating the view is O(1), but iterating over its elements takes O(n).

---

## Frequently Asked Interview Questions

**Q1. Which interface does TreeMap implement?**  
`NavigableMap`

**Q2. Which interfaces are inherited indirectly?**  
`SortedMap` → `Map`

**Q3. Which data structure does TreeMap use?**  
Red-Black Tree

**Q4. Is TreeMap a Binary Search Tree?**  
Not exactly. TreeMap uses a **Self-Balancing Red-Black Tree**, which is a specialized Binary Search Tree.

**Q5. Why not use a normal Binary Search Tree?**  
A normal BST can become skewed, leading to O(n) search time.

**Q6. Why is TreeMap always balanced?**  
The Red-Black Tree performs recoloring, left rotation, and right rotation after insertions and deletions.

**Q7. Does TreeMap use hashing?**  
No. TreeMap performs comparisons, not hashing.

**Q8. How are keys compared?**  
Using either `compareTo()` (natural ordering) or `Comparator.compare()` (custom ordering).

**Q9. Does TreeMap allow duplicate keys?**  
No. Existing values are replaced.

**Q10. Does TreeMap allow duplicate values?**  
Yes.

**Q11. Does TreeMap allow null keys?**  
No with natural ordering — `NullPointerException` is thrown because `compareTo()` cannot compare `null`.

**Q12. Does TreeMap allow null values?**  
Yes.

**Q13. What is Natural Ordering?**  
Sorting performed using `Comparable` and its `compareTo()` method.

**Q14. What is Custom Ordering?**  
Sorting performed using `Comparator` and its `compare()` method.

**Q15. Which is faster — HashMap or TreeMap?**  
HashMap: O(1) lookup. TreeMap: O(log n) lookup. HashMap is generally faster for lookups.

**Q16. When should TreeMap be preferred?**  
Use TreeMap when: sorted data is required, range queries are frequent, navigation methods are needed, or ordering matters more than raw lookup speed.

**Q17. What is the difference between firstKey() and firstEntry()?**  
`firstKey()` returns only the key. `firstEntry()` returns the complete `Map.Entry`.

**Q18. What is the difference between ceilingKey() and higherKey()?**  
`ceilingKey()` returns **equal or greater**. `higherKey()` returns **strictly greater**.

**Q19. What type of copy does clone() create?**  
Shallow Copy.

**Q20. Which applications commonly use TreeMap?**  
Leaderboards, scheduling systems, calendar applications, stock price tracking, banking systems, auto-complete, time-series data, range-based searching.

---

## Summary

- `TreeMap` is the primary implementation of `NavigableMap`.
- Uses a **Red-Black Tree** internally.
- Automatically keeps keys sorted.
- Supports both **Natural Ordering** (`Comparable`) and **Custom Comparator**.
- Provides powerful navigation and range operations.
- Guarantees **O(log n)** lookup, insertion, and deletion.
- Ideal for applications that require ordered data and efficient range queries.
