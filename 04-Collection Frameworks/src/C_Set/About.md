# Java Set Interface — Complete Guide

> **Scope:** This document covers the **Set interface**, **HashSet**, **LinkedHashSet**, and **TreeSet** in detail, including their hierarchy, constructors, important methods, internal working, performance, ordering, and practical usage.

## What is Set?

`Set<E>` is a child interface of `Collection<E>` that stores **unique elements only**. Duplicate elements are rejected.

Unlike `List`, `Set` does not provide index-based access. The ordering behavior depends on the implementation.

```java
public interface Set<E> extends Collection<E>
```

### Set Hierarchy

```text
Iterable → Collection → Set
                           ├── HashSet
                           ├── LinkedHashSet
                           └── TreeSet
```

### Why Do We Need Set?

Lists are useful when we need ordering and allow duplicates:

```text
Apple, Banana, Apple, Orange, Banana
```

But sometimes we need:

- Duplicate values to be rejected automatically.
- Efficient existence checks.
- Unique data without index-based access.
- Insertion order to be preserved.
- Sorted order and navigation.

The `Set` interface defines **what** operations are available; each implementation decides **how** those operations are performed.

```java
Set<Integer> set1 = new HashSet<>();         // Hash Table
Set<Integer> set2 = new LinkedHashSet<>();   // Hash Table + Doubly Linked List
Set<Integer> set3 = new TreeSet<>();         // Red-Black Tree
```

All three store unique elements, but they differ in internal structure, ordering, performance, and additional capabilities.

## Set Implementations — Quick Comparison

| Feature | **HashSet** | **LinkedHashSet** | **TreeSet** |
|---------|-------------|-------------------|-------------|
| Internal Structure | Hash Table | Hash Table + Doubly Linked List | Red-Black Tree |
| Duplicates | ❌ | ❌ | ❌ |
| Ordering | No guarantee | Insertion order | Sorted order |
| Navigation | ❌ | ❌ | ✅ |
| Range Queries | ❌ | ❌ | ✅ |
| `add()` | O(1)* | O(1)* | O(log n) |
| `remove()` | O(1)* | O(1)* | O(log n) |
| `contains()` | O(1)* | O(1)* | O(log n) |
| Null | One `null` | One `null` | ❌ |
| Memory | Low | Medium | High |
| Thread-Safe | ❌ | ❌ | ❌ |

> *Hash-based operations are O(1) on average.*

> For Sets, add(), remove(), and contains() do not depend on first/middle/end position; they use hashing, not position.

### Simple Memory Rule

```text
HashSet        → Speed
LinkedHashSet  → Speed + Insertion Order
TreeSet        → Sorting + Navigation
```

## Core Set Methods

### Inherited from Collection

```text
add()
addAll()
remove()
removeAll()
removeIf()
retainAll()

contains()
containsAll()

size()
isEmpty()
clear()

toArray()
stream()

equals()
hashCode()
```

> The Set interface does not have its own specific methods;

## HashSet

### Overview

`HashSet` is the common hash-based implementation of `Set`.

It internally uses a **Hash Table**

### Characteristics

- Fast search operations
- Fast insertion
- Fast deletion
- Unique elements
- One `null` element
- No insertion-order guarantee
- No index-based access

### HashSet Constructors

| Constructor | Syntax | Purpose                                             |
|-------------|--------|-----------------------------------------------------|
| `HashSet()` | `new HashSet<>()` | Empty Constructor |
| `HashSet(int initialCapacity)` | `new HashSet<>(100)` | Pre-allocate capacity                               |
| `HashSet(int initialCapacity, float loadFactor)` | `new HashSet<>(100, 0.75f)` | Control rehashing threshold                         |
| `HashSet(Collection<? extends E> c)` | `new HashSet<>(collection)` | Copy elements and remove duplicates                 |

### Load Factor and Threshold

| Concept | Meaning | Default |
|---------|---------|---------|
| **Load Factor** | How full the table can become before resizing | `0.75` |
| **Threshold** | `Capacity × Load Factor` | `12` for capacity `16` |

```text
Capacity    = 16 (bydefault)
Load Factor = 0.75 (bydefault)
Threshold   = 16 × 0.75 = 12
```

When the threshold is exceeded, the hash table is resized and elements are redistributed.

### HashSet Specific Method — clone()

```java
HashSet<String> copy =
        (HashSet<String>) set.clone();
```

`clone()` creates a **shallow copy**:

```text
Original HashSet       Clone HashSet
    [Java]      ───→       [Java]
    [Python]    ───→       [Python]
```

The two sets are separate collection objects, but the stored object references are shared.

### HashSet Performance

| Operation | Typical Complexity |
|-----------|--------------------|
| `add()` | O(1) average |
| `remove()` | O(1) average |
| `contains()` | O(1) average |

Excessive collisions can affect performance.

### Internal Concept of Hashset / HashTable Concept 

Explained well in Hash-Table.md

## LinkedHashSet

### Overview

`LinkedHashSet` combines the fast lookup characteristics of a hash table with predictable iteration order through a **Doubly Linked List**.

### Characteristics

- Fast search operations
- Fast insertion
- Fast deletion
- Unique elements
- One `null` element
- Insertion-order iteration
- No index-based access

### LinkedHashSet Constructors

| Constructor | Syntax | Purpose |
|-------------|--------|---------|
| `LinkedHashSet()` | `new LinkedHashSet<>()` | Empty set; insertion order preserved |
| `LinkedHashSet(int initialCapacity)` | `new LinkedHashSet<>(100)` | Pre-allocate capacity |
| `LinkedHashSet(int initialCapacity, float loadFactor)` | `new LinkedHashSet<>(100, 0.75f)` | Control rehashing threshold |
| `LinkedHashSet(Collection<? extends E> c)` | `new LinkedHashSet<>(collection)` | Copy elements, remove duplicates, preserve insertion order of first occurrences |

### LinkedHashSet Specific Public Methods

`LinkedHashSet` does **not introduce any new public methods** in the supplied hierarchy. Its main distinction is its internal implementation.

`clone()` is inherited from `HashSet`.

### Java 21+ SequencedSet Methods

Since LinkedhashSet implements SequencedSet we get these methods to use 

```java
addFirst(E e)    // Insert at beginning
addLast(E e)     // Insert at end
getFirst()       // Access first element
getLast()        // Access last element
removeFirst()    // Remove first element
removeLast()     // Remove last element
reversed()       // Reversed-order view
```


### LinkedHashSet Internal Working

```text
Hash Table + Doubly Linked List
```

The two structures serve different purposes:

| Component | Purpose |
|-----------|---------|
| **Hash Table** | Fast search, insertion, and deletion |
| **Doubly Linked List** | Maintains insertion order |

### Duplicate Handling

```java
set.add("Java");
set.add("Python");
set.add("Java");   // ignored
```

The original insertion order is preserved:

```text
Java, Python
```

### LinkedHashSet vs HashSet

| Aspect | HashSet | LinkedHashSet |
|--------|---------|---------------|
| Internal Structure | Hash Table | Hash Table + Doubly Linked List |
| Insertion | O(1) average | O(1) average |
| Deletion | O(1) average | O(1) average |
| Iteration Order | No guarantee | Insertion order |
| Memory Usage | Lower | Higher |
| Null | One allowed | One allowed |

`LinkedHashSet` may be slightly slower because it also maintains linked-list information.

## SortedSet

`SortedSet` is an interface that extends `Set` and represents a collection of **unique elements maintained in sorted order**. It provides methods for **accessing and working with the sorted range of elements**. `TreeSet` is the main standard implementation of `SortedSet`.

### Methods of SortedSet

| Method | Purpose | Typical Complexity |
|--------|---------|--------------------|
| `first()` | Smallest element | O(log n) |
| `last()` | Largest element | O(log n) |
| `headSet(to)` | View of elements `< to` | O(1) view |
| `tailSet(from)` | View of elements `>= from` | O(1) view |
| `subSet(from, to)` | View of range `[from, to)` | O(1) view |
| `comparator()` | Returns comparator | O(1) |

## NavigableSet

`NavigableSet` is an interface that extends `SortedSet` and represents a collection of **unique elements maintained in sorted order**, while providing methods for **navigating to elements relative to a given value**. `TreeSet` is the main standard implementation of `NavigableSet`.

### Methods of NavigableSet

| Method | Purpose | Typical Complexity |
|--------|---------|--------------------|
| `lower(e)` | Greatest element `< e` | O(log n) |
| `floor(e)` | Greatest element `<= e` | O(log n) |
| `ceiling(e)` | Smallest element `>= e` | O(log n) |
| `higher(e)` | Smallest element `> e` | O(log n) |
| `pollFirst()` | Remove and return first | O(log n) |
| `pollLast()` | Remove and return last | O(log n) |
| `descendingSet()` | Reverse-order view | O(1) view |
| `descendingIterator()` | Reverse traversal | O(1) |
| `subSet(...)` | Range with boundary control | O(1) view |
| `headSet(...)` | Head range with boundary control | O(1) view |
| `tailSet(...)` | Tail range with boundary control | O(1) view |

### NavigableSet Visual Memory

```text
10 ─── 20 ─── 30 ─── 40 ─── 50 ─── 60 ─── 70

Search around 40

lower()    → 30      (<)
floor()    → 40      (<=)
ceiling()  → 40      (>=)
higher()   → 50      (>)

Views

headSet(40, true)   → [10,20,30,40]
tailSet(40, false)  → [50,60,70]
subSet(20,true,60,false) → [20,30,40,50]

Others

pollFirst()          → Remove 10
pollLast()           → Remove 70

descendingSet()      → 70 ─ 60 ─ 50 ─ 40 ─ 30 ─ 20 ─ 10

descendingIterator() → 70 → 60 → 50 → 40 → 30 → 20 → 10
```

## TreeSet

### Overview

`TreeSet` is an implementation of the `NavigableSet` interface and internally uses a self-balancing **Red-Black Tree** 

### Characteristics 

- Automatically sorted elements
- Fast search
- Fast insertion
- Fast deletion
- Unique elements
- Navigation operations
- Range-based operations
- No index-based access
- No `null` elements in the normal ordering case

### Interface Relationship

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

### TreeSet Constructors

| Constructor | Syntax | Purpose |
|-------------|--------|---------|
| `TreeSet()` | `new TreeSet<>()` | Empty set using natural ordering |
| `TreeSet(Collection<? extends E> c)` | `new TreeSet<>(collection)` | Copy elements, remove duplicates, automatically sort |
| `TreeSet(Comparator<? super E> comparator)` | `new TreeSet<>(comparator)` | Use custom sorting order |
| `TreeSet(SortedSet<E> s)` | `new TreeSet<>(sortedSet)` | Copy a sorted set and preserve its comparator |

### Natural Ordering vs Comparator

- **Natural Ordering:** The class itself defines its default ordering using `Comparable` and `compareTo()`.
- **Comparator:** An external comparison rule defines the ordering using `Comparator` and `compare()`.

```java
// Natural ordering: 10 → 20 → 30
TreeSet<Integer> set = new TreeSet<>();

// Custom ordering: 30 → 20 → 10
TreeSet<Integer> reverse =
        new TreeSet<>(Collections.reverseOrder());
```

```text
Comparable  → comparison rule inside the class used internally by java
Comparator  → comparison rule outside the class
```

### TreeSet Internal Working

```text
       20
      /  \
    10    30
         /  \
        25  40
```

TreeSet uses a self-balancing Red-Black Tree.

Key properties:

- The tree automatically rebalances after insertions and deletions.
- In-order traversal produces sorted elements.
- There is no hash table.
- Height remains O(log n), providing consistent operation complexity.
- Elements are ordered using natural ordering or a supplied `Comparator`.

### Why TreeSet Does Not Allow null

TreeSet continuously compares elements to maintain sorted order. `null` cannot be compared with normal elements.

```java
set.add(null);    // ❌ NullPointerException
```

## Real-World Use Cases

| Scenario | Choice | Why |
|----------|--------|-----|
| Unique user IDs / roll numbers | **HashSet** | Fast uniqueness checking |
| Registered email IDs | **HashSet** | Duplicate rejection + lookup |
| Remove duplicates from a List | **HashSet** | Simple deduplication |
| Unique values with predictable insertion order | **LinkedHashSet** | Unique + insertion order |
| Recently visited pages with no repeats | **LinkedHashSet** | Predictable iteration |
| Browser history with unique values and preserved order | **LinkedHashSet** | Predictable order |
| Dictionary words in alphabetical order | **TreeSet** | Automatic sorting |
| Student rankings / leaderboards | **TreeSet** | Sorted data + navigation |
| Score ranges | **TreeSet** | Range-view operations |

## Common Misconceptions and Mistakes

| Misconception / Mistake | Reality / Solution |
|-------------------------|--------------------|
| HashSet stores elements randomly | HashSet uses hashing; iteration order is simply not guaranteed. |
| HashSet preserves insertion order | Use `LinkedHashSet` when insertion order matters. |
| LinkedHashSet is completely different from HashSet | It extends `HashSet` and adds insertion-order maintenance through its internal linked structure. |
| LinkedHashSet provides sorted order | It preserves insertion order, not sorted order. Use `TreeSet` for sorting. |
| TreeSet sorts only once | TreeSet maintains ordering as elements are added and removed. |
| TreeSet is always the best way to remove duplicates | If only uniqueness is needed, HashSet avoids unnecessary ordering overhead. |
| All Sets allow `null` | HashSet and LinkedHashSet allow one `null`; TreeSet does not allow `null` in normal ordering. |
| Duplicate elements are stored | Duplicate insertion is rejected; `add()` returns `false`. |
| Mutable objects are always safe Set elements | Changing equality/hash-related state after insertion can break hash-based lookup. |
| TreeSet accepts every custom object automatically | Elements need compatible ordering through `Comparable` or `Comparator`. |
| `Set<Integer>` exposes every method of the actual implementation | Accessible methods depend on the reference type. |
| `headSet()`, `tailSet()`, and `subSet()` create independent collections | They return views backed by the original TreeSet. |

## Best Practices

- Use **HashSet** when uniqueness and fast average lookup are the main requirements.
- Use **LinkedHashSet** when uniqueness plus insertion-order iteration is required.
- Use **TreeSet** when sorted data, navigation, or range queries are required.
- Override both `equals()` and `hashCode()` for custom classes used in hash-based Sets.
- Prefer immutable objects as Set elements.
- Do not modify fields involved in `equals()` / `hashCode()` after insertion into a hash-based Set.
- Choose `Comparable` for natural ordering and `Comparator` for custom ordering.
- Use an appropriate synchronized or concurrent Set implementation when thread safety is required.

## Quick Reference

| Requirement | HashSet | LinkedHashSet | TreeSet |
|-------------|:-------:|:-------------:|:-------:|
| Unique elements | ✅ | ✅ | ✅ |
| Fast average lookup | ✅ | ✅ | — |
| Insertion order | ❌ | ✅ | ❌ |
| Sorted order | ❌ | ❌ | ✅ |
| Navigation | ❌ | ❌ | ✅ |
| Range queries | ❌ | ❌ | ✅ |
| One `null` allowed | ✅ | ✅ | ❌ |
| Typical `add()` | O(1)* | O(1)* | O(log n) |
| Typical `remove()` | O(1)* | O(1)* | O(log n) |
| Typical `contains()` | O(1)* | O(1)* | O(log n) |

> *Average case for hash-based Sets.*

## One-Line Summary

> **HashSet** → Unique elements + fast average lookup, no ordering guarantee  
> **LinkedHashSet** → Unique elements + fast average lookup + insertion order  
> **TreeSet** → Unique elements + sorted order + navigation/range operations

> **Key Principle:** Choose based on whether you need **speed** (`HashSet`), **order** (`LinkedHashSet`), or **sorting/navigation** (`TreeSet`).
