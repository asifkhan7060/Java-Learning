# LinkedHashSet Method Hierarchy

## Overview

`LinkedHashSet` is an implementation of the `Set` interface that combines the fast performance of a **Hash Table** with the predictable iteration order of a **Doubly Linked List**.

It internally stores elements using a **Hash Table + Doubly Linked List**, which provides:

- Fast Search Operations
- Fast Insertion
- Fast Deletion
- Unique Elements
- One Null Element
- Maintains Insertion Order
- No Index-Based Access

Since `LinkedHashSet` implements the `Set` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Set`

Additionally, `LinkedHashSet` provides its own constructors but does **not** introduce any new public methods.

---

## Class Declaration

```java
public class LinkedHashSet<E>
        extends HashSet<E>
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
    ↑
LinkedHashSet
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
LinkedHashSet
```

---

## Complete LinkedHashSet Method Hierarchy

```text
LinkedHashSet<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── LinkedHashSet()
├── LinkedHashSet(Collection<? extends E> c)
├── LinkedHashSet(int initialCapacity)
└── LinkedHashSet(int initialCapacity,
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
│ Methods Inherited from HashSet
├──────────────────────────────────────────────
│
└── clone()
│
├──────────────────────────────────────────────
│ LinkedHashSet Specific Public Methods
├──────────────────────────────────────────────
│
└── No New Public Methods
│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── spliterator()
├── removeIf()
├── forEach()
├── iterator()
└── clone()
```

---

## Understanding the Hierarchy

The methods available in a `LinkedHashSet` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `LinkedHashSet` class | `LinkedHashSet()`, `LinkedHashSet(int)`, `LinkedHashSet(int, float)`, `LinkedHashSet(Collection)` | Not inherited; used for object creation |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Set extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Set** | `LinkedHashSet implements Set` | No new methods | Only guarantees unique elements |
| **HashSet** | `LinkedHashSet extends HashSet` | `clone()` | Inherited from HashSet |
| **LinkedHashSet Specific** | `LinkedHashSet` class | No new public methods | Internal: Hash Table + Doubly Linked List |
| **Optimized Overrides** | `LinkedHashSet` reimplementation | `iterator()`, `spliterator()`, `forEach()`, `removeIf()`, `clone()` | Optimized for Hash Table + Doubly Linked List |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Set`, `HashSet`, or `LinkedHashSet`), even when the object is a `LinkedHashSet`.
> ```java
> Set<Integer> set = new LinkedHashSet<>();
> set.clone();   // ❌ Compile error
> ```

---

## LinkedHashSet Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `LinkedHashSet()` | `new LinkedHashSet<>()` | Empty set; capacity becomes 16 on first add; preserves insertion order | O(1) | O(1) |
| `LinkedHashSet(int initialCapacity)` | `new LinkedHashSet<>(100)` | Pre-allocate capacity; avoids repeated rehashing | O(1) | O(n) |
| `LinkedHashSet(int initialCapacity, float loadFactor)` | `new LinkedHashSet<>(100, 0.75f)` | Control rehashing threshold; fine-tune performance | O(1) | O(n) |
| `LinkedHashSet(Collection<? extends E> c)` | `new LinkedHashSet<>(collection)` | Copy all elements; removes duplicates; preserves insertion order of first occurrences | O(n) | O(n) |

### Capacity vs Size

| Concept | Meaning | Example |
|---------|---------|---------|
| **Capacity** | Number of buckets in internal Hash Table | `new LinkedHashSet<>(32)` → Capacity = 32 |
| **Size** | Actual number of stored elements | After `add(10)`, `add(20)` → Size = 2 |

```java
LinkedHashSet<Integer> set = new LinkedHashSet<>(32);  // Capacity = 32
set.add(10);
set.add(20);                                             // Size = 2
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
When the 13th element is inserted, LinkedHashSet performs **rehashing** (capacity doubles to 32). The linked list is also updated so insertion order remains unchanged.

---

## LinkedHashSet Specific Methods

Unlike `ArrayList` or `HashSet`, `LinkedHashSet` does **not introduce any new public methods**. Its primary contribution is its **internal implementation**, which combines a Hash Table with a Doubly Linked List.

| Method | Source | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `clone()` | Inherited from `HashSet` | Creates a **shallow copy** — new LinkedHashSet, same element references, preserves insertion order | O(n) | O(n) |

### Shallow Copy

`clone()` performs a **shallow copy** — the LinkedHashSet object is copied, but the stored objects are **not cloned**.

```
Original LinkedHashSet    Clone LinkedHashSet
    [Java]       →            [Java]      ← Same object referenced
    [Python]     →            [Python]    ← Same object referenced
    [C++]        →            [C++]       ← Same object referenced
```

Both collections reference the same objects. For deep copy, every object must be cloned individually.

---

## Internal Working

The biggest difference between `HashSet` and `LinkedHashSet` is **how elements are stored internally**.

```text
HashSet:              LinkedHashSet:
Hash Table            Hash Table + Doubly Linked List
  Bucket                Bucket        Java ⇄ Python ⇄ C++
  ↓
  Java                  Searching → Hash Table
  ↓                     Iteration → Linked List
  Python
  ↓
  C++
```

| Component | Purpose |
|-----------|---------|
| **Hash Table** | Fast searching, insertion, deletion (O(1) average) |
| **Doubly Linked List** | Preserves insertion order; makes iteration predictable |

### Insertion Order

```java
set.add(50);
set.add(20);
set.add(80);
set.add(10);
```
Output iteration: `50, 20, 80, 10` — exactly in insertion order. Unlike HashSet, the output is always predictable.

### Duplicate Elements

```java
set.add("Java");
set.add("Python");
set.add("Java");   // ignored
```
Output: `Java, Python` — duplicate ignored, original insertion order preserved.

---

## Optimized Overrides

`LinkedHashSet` reimplements these inherited methods for better **Hash Table + Doubly Linked List** performance:

```java
iterator()                 // Follows linked list order instead of hash bucket order
forEach(Consumer)          // Optimized iteration over linked list
spliterator()              // Linked-list aware split for parallel streams
removeIf(Predicate)        // Bulk conditional removal with linked list update
clone()                    // Preserves insertion order in copy
```

These behave the same as parent interface definitions but are internally optimized.

---

## Why is LinkedHashSet Slower than HashSet?

Both collections use a **Hash Table**. However, `LinkedHashSet` additionally maintains a **Doubly Linked List**.

| Aspect | HashSet | LinkedHashSet |
|--------|---------|---------------|
| Internal Structure | Hash Table only | Hash Table + Doubly Linked List |
| Insertion | O(1) average | O(1) average (slightly slower due to linked list update) |
| Deletion | O(1) average | O(1) average (slightly slower due to linked list update) |
| Iteration Order | Unpredictable | Insertion order preserved |
| Memory Usage | Lower | Higher (extra pointers for linked list) |

---

## When to Use These Methods

| Scenario | Method | Example |
|----------|--------|---------|
| Unknown element count, need insertion order | `LinkedHashSet()` | `new LinkedHashSet<>()` |
| Known large count, need insertion order | `LinkedHashSet(int)` | `new LinkedHashSet<>(5000)` |
| Fine-tune performance with insertion order | `LinkedHashSet(int, float)` | `new LinkedHashSet<>(100000, 0.75f)` |
| Convert List to Set, remove duplicates, preserve order | `LinkedHashSet(Collection)` | `new LinkedHashSet<>(list)` |
| Need independent set with same elements and order | `clone()` | `(LinkedHashSet<String>) set.clone()` |

---

## Interview Q&A

**Q1. Which class does LinkedHashSet extend?**  
`HashSet`.

**Q2. Which interface does LinkedHashSet implement?**  
`Set` — indirectly `Collection` and `Iterable`.

**Q3. Which data structure does LinkedHashSet use internally?**  
Hash Table + Doubly Linked List.

**Q4. Does LinkedHashSet maintain insertion order?**  
Yes. Elements are always iterated in the order they were inserted.

**Q5. Does LinkedHashSet allow duplicate elements?**  
No. Duplicate elements are ignored automatically.

**Q6. Does LinkedHashSet allow null?**  
Yes. Only **one null element** can be stored.

**Q7. Why is LinkedHashSet slower than HashSet?**  
Because it maintains a **Doubly Linked List** in addition to the Hash Table.

**Q8. What is the default capacity of LinkedHashSet?**  
16 (created lazily after the first insertion in modern JDKs).

**Q9. What is the default load factor?**  
0.75.

**Q10. Which public methods are introduced by LinkedHashSet?**  
None. It does **not** introduce any new public methods. It inherits `clone()` from `HashSet`.

**Q11. Are Collection methods copied into LinkedHashSet?**  
No. They are **inherited** through the interface hierarchy.

**Q12. Why can't we call clone() using a Set reference?**  
```java
Set<Integer> set = new LinkedHashSet<>();
set.clone();      // ❌ Compile error
```
Because `clone()` belongs to the **HashSet class**, not the **Set interface**.

**Q13. Why should we choose LinkedHashSet over HashSet?**  
When both unique elements and insertion order are required.

**Q14. When should LinkedHashSet be preferred over TreeSet?**  
When insertion order is important, but automatic sorting is **not** required.

---

## Summary

- `LinkedHashSet` extends `HashSet`.
- Internally uses a **Hash Table + Doubly Linked List**.
- Stores only **unique elements**.
- Maintains **Insertion Order**.
- Allows **one null element**.
- Inherits methods from `Iterable`, `Collection`, `Set`, and `HashSet`.
- Introduces **no new public methods**.
- Inherits `clone()` from `HashSet`.
- Uses **Capacity**, **Load Factor**, **Threshold**, and **Rehashing** just like `HashSet`.
- Suitable when duplicate removal and predictable iteration order are both required.
