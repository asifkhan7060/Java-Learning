# TreeSet Method Hierarchy

## Overview

`TreeSet` is an implementation of the `NavigableSet` interface in the Java Collection Framework.

It internally stores elements using a **Red-Black Tree**, which provides:

- Automatically Sorted Elements
- Fast Search Operations
- Fast Insertion
- Fast Deletion
- Unique Elements
- Navigation Operations
- Range-Based Operations
- No Index-Based Access
- Does **Not** Allow Null Elements

Since `TreeSet` implements the `NavigableSet` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Set`
- `SortedSet`
- `NavigableSet`

Additionally, `TreeSet` provides its own constructors but does **not** introduce any new public methods.

---

## Class Declaration

```java
public class TreeSet<E>
        extends AbstractSet<E>
        implements NavigableSet<E>,
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
SortedSet
    ↑
NavigableSet
    ↑
AbstractCollection
    ↑
AbstractSet
    ↑
TreeSet
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
SortedSet
     ↑
NavigableSet
     ↑
TreeSet
```

---

## Complete TreeSet Method Hierarchy

```text
TreeSet<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── TreeSet()
├── TreeSet(Collection<? extends E> c)
├── TreeSet(Comparator<? super E> comparator)
└── TreeSet(SortedSet<E> s)
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
│ Methods Inherited from SortedSet
├──────────────────────────────────────────────
│
├── first()
├── last()
├── headSet(E toElement)
├── tailSet(E fromElement)
├── subSet(E fromElement, E toElement)
└── comparator()
│
├──────────────────────────────────────────────
│ Methods Inherited from NavigableSet
├──────────────────────────────────────────────
│
├── lower(E e)
├── floor(E e)
├── ceiling(E e)
├── higher(E e)
│
├── pollFirst()
├── pollLast()
│
├── descendingSet()
├── descendingIterator()
│
├── subSet(E fromElement, boolean fromInclusive,
│          E toElement,   boolean toInclusive)
├── headSet(E toElement, boolean inclusive)
└── tailSet(E fromElement, boolean inclusive)
│
├──────────────────────────────────────────────
│ TreeSet Specific Public Methods
├──────────────────────────────────────────────
│
└── No New Public Methods
│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── iterator()
├── descendingIterator()
├── spliterator()
├── forEach()
└── removeIf()
```

---

## Understanding the Hierarchy

The methods available in a `TreeSet` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `TreeSet` class | `TreeSet()`, `TreeSet(Collection)`, `TreeSet(Comparator)`, `TreeSet(SortedSet)` | Not inherited; used for object creation |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Set extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Set** | `TreeSet implements Set` | No new methods | Only guarantees unique elements |
| **SortedSet** | `TreeSet implements SortedSet` | `first()`, `last()`, `headSet()`, `tailSet()`, `subSet()`, `comparator()` | Sorted order operations |
| **NavigableSet** | `TreeSet implements NavigableSet` | `lower()`, `floor()`, `ceiling()`, `higher()`, `pollFirst()`, `pollLast()`, `descendingSet()`, `descendingIterator()` | Navigation & range operations |
| **TreeSet Specific** | `TreeSet` class | No new public methods | Internal: Red-Black Tree |
| **Optimized Overrides** | `TreeSet` reimplementation | `iterator()`, `descendingIterator()`, `spliterator()`, `forEach()`, `removeIf()` | Optimized for Red-Black Tree |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Set`, `SortedSet`, `NavigableSet`, or `TreeSet`), even when the object is a `TreeSet`.
> ```java
> Set<Integer> set = new TreeSet<>();
> set.first();     // ❌ Compile error — first() is in SortedSet, not Set
> ```

---

## TreeSet Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `TreeSet()` | `new TreeSet<>()` | Empty set; uses natural ordering | O(1) | O(1) |
| `TreeSet(Collection<? extends E> c)` | `new TreeSet<>(collection)` | Copy all elements; removes duplicates; auto-sorts | O(n log n) | O(n) |
| `TreeSet(Comparator<? super E> comparator)` | `new TreeSet<>(comparator)` | Custom sorting order (e.g., descending) | O(1) | O(1) |
| `TreeSet(SortedSet<E> s)` | `new TreeSet<>(sortedSet)` | Copy another sorted set; preserves comparator | O(n) | O(n) |

### Natural Ordering vs Comparator

| Aspect | Natural Ordering | Comparator |
|--------|------------------|------------|
| Source | `Comparable` inside the class | External `Comparator` object |
| Method | `compareTo()` | `compare()` |
| Flexibility | One ordering only | Multiple custom orderings |

```java
// Natural ordering
TreeSet<Integer> set = new TreeSet<>();  // 10, 20, 30, 40

// Custom ordering (descending)
TreeSet<Integer> rev = new TreeSet<>(Collections.reverseOrder());  // 40, 30, 20, 10
```

---

## SortedSet Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `first()` | `set.first()` | Returns the smallest element | O(log n) | O(1) |
| `last()` | `set.last()` | Returns the largest element | O(log n) | O(1) |
| `headSet(E toElement)` | `set.headSet(20)` | View of elements < toElement | O(1) view | O(1) |
| `tailSet(E fromElement)` | `set.tailSet(20)` | View of elements >= fromElement | O(1) view | O(1) |
| `subSet(E from, E to)` | `set.subSet(10, 30)` | View of elements [from, to) | O(1) view | O(1) |
| `comparator()` | `set.comparator()` | Returns the comparator used; null for natural ordering | O(1) | O(1) |

> **Note:** `headSet()`, `tailSet()`, and `subSet()` return **views** backed by the original TreeSet. Changes to the view reflect in the original.

---

## NavigableSet Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `lower(E e)` | `set.lower(20)` | Greatest element strictly < e | O(log n) | O(1) |
| `floor(E e)` | `set.floor(20)` | Greatest element <= e | O(log n) | O(1) |
| `ceiling(E e)` | `set.ceiling(25)` | Smallest element >= e | O(log n) | O(1) |
| `higher(E e)` | `set.higher(20)` | Smallest element strictly > e | O(log n) | O(1) |
| `pollFirst()` | `set.pollFirst()` | Removes and returns first element | O(log n) | O(1) |
| `pollLast()` | `set.pollLast()` | Removes and returns last element | O(log n) | O(1) |
| `descendingSet()` | `set.descendingSet()` | Reverse-order view of the set | O(1) view | O(1) |
| `descendingIterator()` | `set.descendingIterator()` | Iterator traversing in reverse order | O(1) | O(1) |
| `subSet(from, fromInc, to, toInc)` | `set.subSet(10,true,30,false)` | View with inclusive/exclusive boundaries | O(1) view | O(1) |
| `headSet(to, inclusive)` | `set.headSet(20,true)` | View with inclusive/exclusive boundary | O(1) view | O(1) |
| `tailSet(from, inclusive)` | `set.tailSet(20,false)` | View with inclusive/exclusive boundary | O(1) view | O(1) |

---

## Internal Working

Unlike `HashSet` and `LinkedHashSet`, `TreeSet` internally uses a **Red-Black Tree** — a self-balancing binary search tree.

```text
Insert: 30, 10, 40, 20

        30
       /       10    40
              20
```

| Feature | Description |
|---------|-------------|
| **Self-Balancing** | Tree automatically rebalances after every insertion/deletion |
| **Sorted Order** | In-order traversal yields sorted elements |
| **No Hash Table** | Uses comparison, not hashing |
| **Height** | Always O(log n), ensuring consistent performance |

### Why Null is Not Allowed

TreeSet continuously compares elements to maintain sorted order. `null` cannot be compared with other elements.

```java
set.add(null);  // ❌ NullPointerException
```

---

## Optimized Overrides

`TreeSet` reimplements these inherited methods for better Red-Black Tree performance:

```java
iterator()                 // In-order traversal of the tree
descendingIterator()       // Reverse in-order traversal
spliterator()              // Tree-aware split for parallel streams
forEach(Consumer)          // Optimized in-order iteration
removeIf(Predicate)        // Bulk conditional removal with tree rebalancing
```

---

## Why TreeSet is Slower than HashSet

| Aspect | HashSet | TreeSet |
|--------|---------|---------|
| Internal Structure | Hash Table | Red-Black Tree |
| add/remove/contains | O(1) average | O(log n) |
| Sorting | Not sorted | Automatically sorted |
| Null Allowed | Yes (one) | No |
| Navigation | Not supported | Full navigation support |

Every insertion, deletion, and search in TreeSet requires traversing the tree (O(log n)), whereas HashSet uses direct bucket access (O(1) average).

---

## When to Use These Methods

| Scenario | Method | Example |
|----------|--------|---------|
| Natural sorting required | `TreeSet()` | `new TreeSet<>()` |
| Convert & sort another collection | `TreeSet(Collection)` | `new TreeSet<>(list)` |
| Custom sorting (descending, etc.) | `TreeSet(Comparator)` | `new TreeSet<>(Collections.reverseOrder())` |
| Copy another sorted set | `TreeSet(SortedSet)` | `new TreeSet<>(sortedSet)` |
| Find smallest/largest element | `first()` / `last()` | `set.first()` |
| Find nearest element | `lower()` / `floor()` / `ceiling()` / `higher()` | `set.floor(20)` |
| Remove & return extremes | `pollFirst()` / `pollLast()` | `set.pollFirst()` |
| Range queries | `subSet()` / `headSet()` / `tailSet()` | `set.subSet(10, 30)` |
| Reverse iteration | `descendingSet()` / `descendingIterator()` | `set.descendingSet()` |

---

## Interview Q&A

**Q1. Which interface does TreeSet implement?**  
`NavigableSet` — indirectly `SortedSet`, `Set`, `Collection`, and `Iterable`.

**Q2. Which data structure does TreeSet use internally?**  
Red-Black Tree (self-balancing binary search tree).

**Q3. Does TreeSet maintain insertion order?**  
No. It maintains **sorted order**, not insertion order.

**Q4. Does TreeSet allow duplicate elements?**  
No. Duplicate elements are ignored automatically.

**Q5. Does TreeSet allow null?**  
No. `NullPointerException` is thrown because null cannot be compared.

**Q6. Why is TreeSet slower than HashSet?**  
TreeSet uses a **Red-Black Tree** (O(log n)), while HashSet uses a **Hash Table** (O(1) average).

**Q7. Which methods are introduced by SortedSet?**  
`first()`, `last()`, `headSet()`, `tailSet()`, `subSet()`, `comparator()`.

**Q8. Which methods are introduced by NavigableSet?**  
`lower()`, `floor()`, `ceiling()`, `higher()`, `pollFirst()`, `pollLast()`, `descendingSet()`, `descendingIterator()`.

**Q9. When should Comparator be used?**  
When custom sorting logic is required (e.g., descending order, domain-specific ordering).

**Q10. What is the difference between Comparable and Comparator?**  
- `Comparable` defines natural ordering inside the class (`compareTo()`).  
- `Comparator` provides external custom ordering (`compare()`).

**Q11. Why does TreeSet require Comparable or Comparator?**  
Every insertion requires comparing elements to determine their correct position in the Red-Black Tree.

**Q12. Why are headSet(), tailSet(), and subSet() fast?**  
They return **views** backed by the original TreeSet instead of creating new collections.

**Q13. Why doesn't TreeSet provide index-based access?**  
Because it is implemented using a tree structure, not an array.

**Q14. When should TreeSet be preferred over HashSet?**  
When elements must remain sorted, navigation operations are required, or range queries are frequently performed.

**Q15. When should TreeSet be preferred over LinkedHashSet?**  
When automatic sorting is more important than preserving insertion order.

---

## Summary

- `TreeSet` implements the `NavigableSet` interface.
- Internally uses a **Red-Black Tree**.
- Stores only **unique elements**.
- Automatically maintains **sorted order**.
- Does **not** maintain insertion order.
- Does **not** allow null elements.
- Inherits methods from `Iterable`, `Collection`, `Set`, `SortedSet`, and `NavigableSet`.
- Introduces **no new public methods** but gains powerful functionality from `SortedSet` and `NavigableSet`.
- Supports both **Natural Ordering** and **Comparator-based Ordering**.
- Ideal for applications requiring sorting, navigation, and range-based operations.
