# HashSet Method Hierarchy

## Overview

`HashSet` is the most commonly used implementation of the `Set` interface in the Java Collection Framework.

It internally stores elements using a **Hash Table**, which provides:

- Fast Search Operations
- Fast Insertion
- Fast Deletion
- Unique Elements
- One Null Element
- No Insertion Order
- No Index-Based Access

Since `HashSet` implements the `Set` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Set`

Additionally, `HashSet` provides its own constructors and one class-specific public method.

---

## Class Declaration

```java
public class HashSet<E>
        extends AbstractSet<E>
        implements Set<E>,
                   Cloneable,
                   Serializable
```

---

## Inheritance Hierarchy

```text
Iterable
    ↑
Collection
    ↑
Set
    ↑
AbstractCollection
    ↑
AbstractSet
    ↑
HashSet
```

---

## Interface Relationship

```text
Iterable
     ↑
Collection
     ↑
Set
     ↑
HashSet
```

---

## Complete HashSet Method Hierarchy

```text
HashSet<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── HashSet()
├── HashSet(Collection<? extends E> c)
├── HashSet(int initialCapacity)
└── HashSet(int initialCapacity,
            float loadFactor)
│
├──────────────────────────────────────────────
│ Methods Inherited from Iterable
├──────────────────────────────────────────────
│
├── iterator()
├── spliterator()
└── forEach()
│
├──────────────────────────────────────────────
│ Methods Inherited from Collection
├──────────────────────────────────────────────
│
├── add(E e)
├── addAll(Collection<? extends E> c)
│
├── remove(Object o)
├── removeAll(Collection<?> c)
├── retainAll(Collection<?> c)
├── removeIf(Predicate<? super E> filter)
│
├── contains(Object o)
├── containsAll(Collection<?> c)
│
├── size()
├── isEmpty()
├── clear()
│
├── toArray()
├── toArray(T[] a)
├── toArray(IntFunction<T[]> generator)
│
├── stream()
├── parallelStream()
│
├── equals(Object o)
└── hashCode()
│
├──────────────────────────────────────────────
│ Methods Inherited from Set
├──────────────────────────────────────────────
│
└── No New Methods
    (Set only guarantees Unique Elements)
│
├──────────────────────────────────────────────
│ HashSet Specific Public Methods
├──────────────────────────────────────────────
│
└── clone()
│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── spliterator()
├── removeIf()
├── forEach()
└── clone()
```

---

## Understanding the Hierarchy

The methods available in a `HashSet` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `HashSet` class | `HashSet()`, `HashSet(int)`, `HashSet(int, float)`, `HashSet(Collection)` | Not inherited; used for object creation |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Set extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Set** | `HashSet implements Set` | No new methods | Only guarantees unique elements |
| **HashSet Specific** | `HashSet` class | `clone()` | Shallow copy |
| **Optimized Overrides** | `HashSet` reimplementation | `spliterator()`, `forEach()`, `removeIf()`, `clone()` | Optimized for hash table |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Set`, or `HashSet`), even when the object is a `HashSet`.
> ```java
> Set<Integer> set = new HashSet<>();
> set.clone();   // ❌ Compile error
> ```

---

## HashSet Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `HashSet()` | `new HashSet<>()` | Empty set; capacity becomes 16 on first add | O(1) | O(1) |
| `HashSet(int initialCapacity)` | `new HashSet<>(100)` | Pre-allocate capacity; avoids repeated rehashing | O(1) | O(n) |
| `HashSet(int initialCapacity, float loadFactor)` | `new HashSet<>(100, 0.75f)` | Control rehashing threshold; fine-tune performance | O(1) | O(n) |
| `HashSet(Collection<? extends E> c)` | `new HashSet<>(collection)` | Copy all elements from another collection; removes duplicates | O(n) | O(n) |

### Capacity vs Size

| Concept | Meaning | Example |
|---------|---------|---------|
| **Capacity** | Number of buckets in internal Hash Table | `new HashSet<>(32)` → Capacity = 32 |
| **Size** | Actual number of stored elements | After `add(10)`, `add(20)` → Size = 2 |

```java
HashSet<Integer> set = new HashSet<>(32);  // Capacity = 32
set.add(10);
set.add(20);                                // Size = 2
```

### Load Factor & Threshold

| Concept | Meaning | Default |
|---------|---------|---------|
| **Load Factor** | How full the table can become before resizing | 0.75 |
| **Threshold** | `Capacity × Load Factor` — max elements before rehashing | 12 (for capacity 16) |

```text
Capacity = 16
Load Factor = 0.75
Threshold = 12
```
When the 13th element is inserted, HashSet performs **rehashing** (capacity doubles to 32).

---

## HashSet Specific Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `clone()` | `(HashSet<String>) set.clone()` | Creates a **shallow copy** — new HashSet, same element references | O(n) | O(n) |

### Shallow Copy

`clone()` performs a **shallow copy** — the HashSet object is copied, but the stored objects are **not cloned**.

```
Original HashSet       Clone HashSet
    [Java]      →          [Java]      ← Same object referenced
    [Python]    →          [Python]    ← Same object referenced
```

Both sets reference the same objects. For deep copy, every object must be cloned individually.

---

## Internal HashSet Concepts

| Concept | Description |
|---------|-------------|
| **Capacity** | Total number of buckets in the internal Hash Table |
| **Size** | Actual number of elements stored |
| **Load Factor** | `Size / Capacity` — controls when resizing occurs (default 0.75) |
| **Threshold** | `Capacity × Load Factor` — max elements before rehashing |
| **Rehashing** | Creates a larger Hash Table and redistributes all elements when threshold exceeded |

> **Note:** Since Java 8, buckets are converted into **Red-Black Trees** when many collisions occur, improving worst-case lookup from O(n) to O(log n) for heavily-collided buckets.

---

## Optimized Overrides

`HashSet` reimplements these inherited methods for better hash table performance:

```java
forEach(Consumer)          // Optimized iteration over hash buckets
spliterator()              // Hash-based split for parallel streams
removeIf(Predicate)        // Bulk conditional removal
clone()                    // Hash table aware shallow copy
```

These behave the same as parent interface definitions but are internally optimized.

---

## When to Use These Methods

| Scenario | Method | Example |
|----------|--------|---------|
| Unknown element count | `HashSet()` | `new HashSet<>()` |
| Known large count (e.g., 5000 items) | `HashSet(int)` | `new HashSet<>(5000)` |
| Fine-tune memory/performance | `HashSet(int, float)` | `new HashSet<>(100000, 0.75f)` |
| Convert List to Set (remove duplicates) | `HashSet(Collection)` | `new HashSet<>(list)` |
| Need independent set with same elements | `clone()` | `(HashSet<String>) set.clone()` |

---

## Interview Q&A

**Q1. Which interface does HashSet implement?**  
`Set` — indirectly `Collection` and `Iterable`.

**Q2. Which data structure does HashSet use internally?**  
Hash Table. (Java 8+ may use Red-Black Trees for heavily-collided buckets.)

**Q3. Does HashSet maintain insertion order?**  
No. HashSet does not guarantee any ordering of elements.

**Q4. Does HashSet allow duplicate elements?**  
No. Duplicate elements are ignored automatically.

**Q5. Does HashSet allow null?**  
Yes. Only **one null element** can be stored.

**Q6. Why is HashSet faster than TreeSet?**  
HashSet uses **Hashing** (O(1) average), while TreeSet uses a **Red-Black Tree** (O(log n)).

**Q7. What is the default capacity of HashSet?**  
16 (created lazily after the first insertion in modern JDKs).

**Q8. What is the default load factor?**  
0.75.

**Q9. What is rehashing?**  
When stored elements exceed the threshold, HashSet creates a larger Hash Table and redistributes all elements.

**Q10. Which method is introduced by HashSet?**  
`clone()`.

**Q11. Are Collection methods copied into HashSet?**  
No. They are **inherited** through the interface hierarchy.

**Q12. Why can't we call clone() using a Set reference?**  
```java
Set<Integer> set = new HashSet<>();
set.clone();      // ❌ Compile error
```
Because `clone()` belongs to the **HashSet class**, not the **Set interface**.

**Q13. Why is equals() important in HashSet?**  
After locating the bucket using `hashCode()`, HashSet uses `equals()` to determine whether an element already exists.

**Q14. What happens if hashCode() and equals() are not properly overridden?**  
Duplicate logical objects may be stored, and searching/removal may produce incorrect results.

---

## Summary

- `HashSet` is the most commonly used implementation of the `Set` interface.
- Internally uses a **Hash Table**.
- Stores only **unique elements**.
- Allows **one null element**.
- Does **not maintain insertion order**.
- Inherits methods from `Iterable`, `Collection`, and `Set`.
- Provides four constructors and one primary public method: `clone()`.
- Uses **Capacity**, **Load Factor**, **Threshold**, and **Rehashing** to maintain performance.
- Suitable when fast searching, insertion, and deletion are more important than maintaining order.
