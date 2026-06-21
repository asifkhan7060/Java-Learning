# Choosing the Right Map Implementation

## 1. Why Multiple Map Implementations?

No single map structure optimizes everything. Different apps need:
- Fast key-based lookup
- Preserved insertion order
- Automatically sorted keys
- Thread safety
- Memory-efficient caching (auto-expiring)
- Enum-specific optimization
- Reference equality semantics

The `Map` interface defines **what** operations are possible; each implementation decides **how**.

```java
Map<String, Integer> m1 = new HashMap<>();              // Hash Table — fastest general
Map<String, Integer> m2 = new LinkedHashMap<>();        // Hash Table + Linked List — ordered
Map<String, Integer> m3 = new TreeMap<>();             // Red-Black Tree — sorted
Map<String, Integer> m4 = new ConcurrentHashMap<>();   // Thread-safe concurrent
```

All store key-value pairs. The difference lies in **ordering guarantees, concurrency support, key comparison, and memory behavior**.

---

## 2. The Problem with Arrays/Lists for Key-Value Data

Using parallel arrays or lists for key-value lookup:

```
Names:  [Alice, Bob, Charlie, Alice]
Marks:  [  85,  90,     78,    92]
```

Finding Bob's marks requires linear search — **O(n)**. For large datasets, this is inefficient.

What key-value storage actually needs:
- Direct key-based access (no index traversal)
- Unique keys (duplicates replace, not accumulate)
- Fast lookup, insertion, deletion

A Map naturally models this with **O(1)** or **O(log n)** operations.

---

## 3. Implementation Deep Dive

### HashMap — Hash Table

```
Bucket 0 → null
Bucket 1 → Entry("Alice", 85)
Bucket 2 → Entry("Bob", 90)
Bucket 3 → Entry("Charlie", 78) → Entry("Dave", 70) [collision]
Bucket 4 → null
```

| Aspect | Detail |
|--------|--------|
| **Strengths** | Fastest average performance O(1), low memory, one null key, multiple null values |
| **Weaknesses** | No ordering guarantee, not thread-safe |
| **Best For** | General-purpose key-value storage, caching, configuration, indexing |
| **Time** | `get()` O(1)* · `put()` O(1)* · `remove()` O(1)* |
| **Null** | One null key ✅, multiple null values ✅ |

**Example:**
```java
Map<String, Integer> marks = new HashMap<>();
marks.put("Alice", 85);
marks.put("Bob", 90);
marks.put("Charlie", 78);
System.out.println(marks.get("Bob"));  // 90 — O(1)
// Iteration order: unpredictable
```

> Since Java 8, buckets convert to Red-Black Trees when collisions exceed a threshold, improving worst-case from O(n) to O(log n).

---

### LinkedHashMap — Hash Table + Doubly Linked List

```
Hash Table:    "Alice"=85    "Bob"=90    "Charlie"=78
Linked List:   "Alice"=85 ⇄ "Bob"=90 ⇄ "Charlie"=78
```

| Aspect | Detail |
|--------|--------|
| **Strengths** | O(1)* operations + preserves insertion (or access) order |
| **Weaknesses** | Higher memory than HashMap (extra linked list pointers) |
| **Best For** | Ordered iteration, LRU caches |
| **Time** | Same as HashMap; iteration order matches insertion |
| **Null** | One null key ✅, multiple null values ✅ |

**Example:**
```java
Map<String, Integer> marks = new LinkedHashMap<>();
marks.put("Alice", 85);
marks.put("Bob", 90);
marks.put("Charlie", 78);
// Iteration: Alice=85, Bob=90, Charlie=78 (insertion order preserved)
```

**LRU Cache:**
```java
// accessOrder=true: orders by last access, not insertion
Map<String, String> lru = new LinkedHashMap<>(16, 0.75f, true) {
    @Override
    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        return size() > 100;  // Evict oldest when size > 100
    }
};
```

---

### TreeMap — Red-Black Tree

```
        "Bob"=90
       /           "Alice"=85   "Charlie"=78
                /              ...  ...
```

| Aspect | Detail |
|--------|--------|
| **Strengths** | Auto-sorted keys, navigation methods (`higherKey`, `floorEntry`), range queries |
| **Weaknesses** | O(log n) slower than HashMap, no null keys, higher memory |
| **Best For** | Sorted data, dictionaries, leaderboards, range searches |
| **Time** | `get()` O(log n) · `put()` O(log n) · `remove()` O(log n) |
| **Null** | ❌ No null keys (can't compare null) |

**Example:**
```java
Map<String, Integer> marks = new TreeMap<>();
marks.put("Charlie", 78);
marks.put("Alice", 85);
marks.put("Bob", 90);
// Output: {Alice=85, Bob=90, Charlie=78} — always sorted by key

// Navigation
TreeMap<String, Integer> tm = (TreeMap<String, Integer>) marks;
System.out.println(tm.higherKey("Bob"));      // "Charlie"
System.out.println(tm.floorEntry("B"));       // "Bob"=90
System.out.println(tm.subMap("A", "C"));      // {Alice=85, Bob=90}
```

---

### Hashtable — Synchronized Hash Table (Legacy)

| Aspect | Detail |
|--------|--------|
| **Strengths** | Thread-safe (synchronized methods) |
| **Weaknesses** | Locks entire table, slower than ConcurrentHashMap, no null keys/values, legacy |
| **Best For** | Legacy code only |
| **Time** | O(1)* but with synchronization overhead |
| **Null** | ❌ No null keys, no null values |

> ⚠️ **Avoid in new code.** Use `ConcurrentHashMap` instead.

---

### ConcurrentHashMap — Concurrent Hash Table

```
Segment 0    Segment 1    Segment 2
|          |          |
Bucket     Bucket     Bucket
  (lock)    (lock)     (lock)
```

| Aspect | Detail |
|--------|--------|
| **Strengths** | Thread-safe without full-table locking, high concurrency, atomic compute/merge methods |
| **Weaknesses** | No null keys/values, slightly higher memory |
| **Best For** | Multi-threaded applications, shared caches, concurrent config |
| **Time** | O(1)* with fine-grained locking (Java 8+: CAS + synchronized nodes) |
| **Null** | ❌ No null keys, no null values |

**Example:**
```java
ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
map.put("count", 0);
map.compute("count", (k, v) -> v + 1);  // Atomic increment
```

---

### WeakHashMap — Weak References

| Aspect | Detail |
|--------|--------|
| **Strengths** | Entries auto-removed when key is GC'd, useful for memory-sensitive caches |
| **Weaknesses** | Unpredictable entry lifetime, not thread-safe |
| **Best For** | Caches, metadata association, listener registries |
| **Time** | O(1)* |
| **Null** | One null key ✅ |

**How it works:**
```
Strong Ref → Key → Value
                ↓
           Weak Ref (in WeakHashMap)

When no Strong Refs exist → Key GC'd → Entry auto-removed
```

---

### IdentityHashMap — Reference Equality

| Aspect | Detail |
|--------|--------|
| **Strengths** | Uses `==` not `equals()`, tracks object identity |
| **Weaknesses** | Rarely needed, breaks Map contract expectations |
| **Best For** | Serialization frameworks, object graph traversal, identity-based metadata |
| **Time** | O(1)* |
| **Null** | Multiple null keys allowed (since == distinguishes null references) |

---

### EnumMap — Enum Keys

| Aspect | Detail |
|--------|--------|
| **Strengths** | Fastest Map implementation O(1), most memory-efficient, type-safe |
| **Weaknesses** | Keys restricted to single enum type |
| **Best For** | Enum-based lookups, state machines, day-based scheduling |
| **Time** | O(1) — array indexed by enum ordinal |
| **Null** | ❌ No null keys |

**Example:**
```java
enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

Map<Day, String> schedule = new EnumMap<>(Day.class);
schedule.put(Day.MONDAY, "Working Day");
schedule.put(Day.SUNDAY, "Holiday");
// Internally: array[1] = "Working Day", array[0] = "Holiday"
```

---

## 4. Side-by-Side Comparison

| Feature | **HashMap** | **LinkedHashMap** | **TreeMap** | **Hashtable** | **ConcurrentHashMap** | **WeakHashMap** | **EnumMap** | **IdentityHashMap** |
|---------|:-----------:|:-----------------:|:-----------:|:-------------:|:---------------------:|:---------------:|:-----------:|:-------------------:|
| Internal | Hash Table | Hash Table + Linked List | Red-Black Tree | Hash Table | Hash Table (segmented) | Hash Table | Array | Hash Table |
| Ordering | Unpredictable | Insertion/Access | Sorted by key | Unpredictable | Unpredictable | Unpredictable | Enum order | Unpredictable |
| `get()` | **O(1)*** | **O(1)*** | O(log n) | **O(1)*** | **O(1)*** | **O(1)*** | **O(1)** | **O(1)*** |
| `put()` | **O(1)*** | **O(1)*** | O(log n) | **O(1)*** | **O(1)*** | **O(1)*** | **O(1)** | **O(1)*** |
| Null Key | One | One | ❌ | ❌ | ❌ | One | ❌ | Multiple |
| Null Values | ✅ | ✅ | ✅ | ❌ | ❌ | ✅ | ✅ | ✅ |
| Thread-Safe | ❌ | ❌ | ❌ | ✅ | ✅ | ❌ | ❌ | ❌ |
| Memory | Low | Medium | Medium | Medium | Higher | Low | Lowest | Low |
| Modern? | ✅ | ✅ | ✅ | ❌ Legacy | ✅ | ✅ | ✅ | ✅ |

> *Average case

---

## 5. Decision Guide

```
Need key-value storage?
        │
        ▼
Need maximum performance (fast lookup)?
        │
       Yes ───► HashMap
        │
        No
        ▼
Need insertion/access order preserved?
        │
       Yes ───► LinkedHashMap
        │
        No
        ▼
Need sorted keys or range queries?
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
Need enum keys only?
        │
       Yes ───► EnumMap
        │
        No
        ▼
Need auto-expiring cache (GC-sensitive)?
        │
       Yes ───► WeakHashMap
        │
        No
        ▼
Need reference equality (== not equals)?
        │
       Yes ───► IdentityHashMap
        │
        No
        ▼
   Default: HashMap
```

---

## 6. Real-World Use Cases

| Scenario | Choice | Why |
|----------|--------|-----|
| User ID → Profile mapping | **HashMap** | Fastest general lookup |
| Configuration settings | **HashMap** | Key-value config, no ordering needed |
| In-memory cache | **HashMap** / **ConcurrentHashMap** | Fast access, concurrent if needed |
| Recently accessed items (LRU) | **LinkedHashMap** | Access-order iteration for eviction |
| Session management | **LinkedHashMap** | Ordered session tracking |
| Dictionary (word → meaning) | **TreeMap** | Alphabetically sorted keys |
| Leaderboard (sorted scores) | **TreeMap** | Auto-sorted + range queries |
| Phone contacts (number → name) | **HashMap** | Fast lookup by phone number |
| Word frequency counter | **HashMap** | Fast counting by word |
| Shared cache in multi-threaded server | **ConcurrentHashMap** | Thread-safe, high concurrency |
| Real-time data processing config | **ConcurrentHashMap** | Atomic compute/merge operations |
| Memory-sensitive metadata cache | **WeakHashMap** | Auto-cleanup when objects GC'd |
| Listener/observer registries | **WeakHashMap** | Auto-remove dead listeners |
| Day-of-week scheduling | **EnumMap** | Enum keys, maximum speed |
| Status-based routing | **EnumMap** | Type-safe state machine |
| Object identity tracking | **IdentityHashMap** | Reference equality for specific instances |
| Serialization framework internals | **IdentityHashMap** | Track visited object references |

---

## 7. Common Misconceptions

| Myth | Reality |
|------|---------|
| HashMap stores entries randomly | ❌ Stored by key's hash value, not randomly — but order is unpredictable |
| LinkedHashMap is completely different from HashMap | ❌ It **extends** HashMap and adds a linked list for order |
| TreeMap sorts only once | ❌ TreeMap is **always** sorted — rebalances after every insertion/deletion |
| HashMap is always the best choice | ❌ If you need ordering, sorting, or thread safety, HashMap is wrong |
| Map extends Collection | ❌ `Map` is a **separate** interface; it does NOT extend `Collection` |
| Hashtable is fine for new code | ❌ Legacy class; `ConcurrentHashMap` is the modern replacement |
| All Maps allow null keys | ❌ Only HashMap, LinkedHashMap, WeakHashMap, IdentityHashMap allow null keys |

---

## 8. Common Mistakes

| Mistake | Problem | Solution |
|---------|---------|----------|
| Using `HashMap` when order matters | Unpredictable iteration order | Use `LinkedHashMap` |
| Using `TreeMap` just for fast lookup | O(log n) overhead unnecessary | Use `HashMap` for simple lookup |
| Using `LinkedHashMap` expecting sorted data | Only insertion order, not sorted | Use `TreeMap` for sorting |
| Storing non-`Comparable` keys in `TreeMap` without `Comparator` | `ClassCastException` | Implement `Comparable` or provide `Comparator` |
| Using `Hashtable` in modern code | Synchronization overhead, legacy | Use `ConcurrentHashMap` |
| Using mutable objects as keys in `HashMap` | Changing key fields breaks `hashCode()`/`equals()` | Use immutable keys |
| Not overriding `equals()` and `hashCode()` for custom keys | Keys with same data treated as different | Always override both |
| Expecting duplicate keys to coexist | Old value is silently replaced | Check `put()` return value |

---

## 9. Interview Quick Reference

| Question | Answer |
|----------|--------|
| Why multiple Map implementations? | Different needs: speed, order, sorting, concurrency, key type. |
| Why is `HashMap` faster than `TreeMap`? | HashMap uses hashing (O(1) avg); TreeMap uses Red-Black Tree (O(log n)). |
| Why does `LinkedHashMap` use more memory? | Extra doubly linked list to maintain insertion/access order. |
| Why doesn't `TreeMap` allow null keys? | Cannot compare null with other keys during tree operations. |
| Why is `ConcurrentHashMap` preferred over `Hashtable`? | `Hashtable` locks entire table; `ConcurrentHashMap` uses fine-grained locking/CAS. |
| What happens when duplicate keys are added? | Old value is replaced; `put()` returns the previous value. |
| Which Map for navigation methods (`higherKey`, `floorEntry`)? | `TreeMap` via `NavigableMap`. |
| Which Map is most memory-efficient? | `EnumMap` — compact array, no hashing overhead. |
| Which Map auto-expires entries? | `WeakHashMap` — entries removed when key is GC'd. |
| Difference `HashMap` vs `IdentityHashMap`? | `HashMap` uses `equals()`; `IdentityHashMap` uses `==`. |
| Why no null in `ConcurrentHashMap`? | `null` is ambiguous in concurrent context (can't distinguish "not found" from "null value"). |
| How does Java 8 improve `HashMap` worst case? | Buckets convert to Red-Black Trees when collisions exceed threshold (O(log n) vs O(n)). |

---

## 10. One-Line Summary

| Need | Use |
|------|-----|
| Fast general key-value lookup | **HashMap** |
| Preserve insertion/access order | **LinkedHashMap** |
| Auto-sorted keys + range queries | **TreeMap** |
| Thread-safe concurrent access | **ConcurrentHashMap** |
| Legacy synchronized code | **Hashtable** (avoid) |
| Auto-expiring cache | **WeakHashMap** |
| Enum keys (maximum performance) | **EnumMap** |
| Reference equality (`==`) | **IdentityHashMap** |

> **Key Principle:** Choose based on **ordering** (none vs insertion vs sorted), **concurrency needs**, **key type**, and **memory constraints** — not familiarity.
