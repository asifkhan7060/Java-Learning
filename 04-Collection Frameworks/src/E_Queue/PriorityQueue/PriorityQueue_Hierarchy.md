# PriorityQueue Method Hierarchy

## Overview

`PriorityQueue` is the most commonly used implementation of the `Queue` interface in the Java Collection Framework.

Unlike a normal Queue, a `PriorityQueue` processes elements according to their **priority** instead of their insertion order.

Internally, it stores elements using a **Binary Heap (Min Heap by default)**, which provides:

- Priority-Based Ordering
- Fast Insertion
- Fast Removal of Highest Priority Element
- Natural Ordering (Default)
- Custom Ordering using Comparator
- Duplicate Elements Allowed
- Null Elements Not Allowed

Since `PriorityQueue` implements the `Queue` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`

Additionally, `PriorityQueue` provides its own constructors and one class-specific method.

---

## Class Declaration

```java
public class PriorityQueue<E>
        extends AbstractQueue<E>
        implements Serializable
```
```java
public abstract class AbstractQueue<E>
extends AbstractCollection<E>
implements Queue<E>
```
---

## Inheritance Hierarchy

```text
Iterable
    ↑
Collection
    ↑
Queue
    ↑
AbstractCollection
    ↑
AbstractQueue
    ↑
PriorityQueue
```

---

## Interface Relationship

```text
Iterable
     ↑
Collection
     ↑
Queue
     ↑
PriorityQueue
```

---

## Complete PriorityQueue Method Hierarchy

```text
PriorityQueue<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── PriorityQueue()
├── PriorityQueue(int initialCapacity)
├── PriorityQueue(Comparator<? super E> comparator)
├── PriorityQueue(int initialCapacity,
│                 Comparator<? super E> comparator)
├── PriorityQueue(Collection<? extends E> c)
├── PriorityQueue(PriorityQueue<? extends E> c)
└── PriorityQueue(SortedSet<? extends E> c)
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
│ Methods Inherited from Queue
├──────────────────────────────────────────────
│
├── add(E e)
├── offer(E e)
│
├── remove()
├── poll()
│
├── element()
└── peek()
│
├──────────────────────────────────────────────
│ PriorityQueue Specific Public Methods
├──────────────────────────────────────────────
│
└── comparator()
│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── offer()
├── poll()
├── remove(Object o)
├── iterator()
└── spliterator()
```

---

## Understanding the Hierarchy

The methods available in a `PriorityQueue` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `PriorityQueue` class | `PriorityQueue()`, `PriorityQueue(int)`, `PriorityQueue(Comparator)`, `PriorityQueue(int, Comparator)`, `PriorityQueue(Collection)`, `PriorityQueue(PriorityQueue)`, `PriorityQueue(SortedSet)` | Not inherited; unbounded |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `PriorityQueue implements Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard queue operations |
| **PriorityQueue Specific** | `PriorityQueue` class | `comparator()` | Returns null for natural ordering |
| **Optimized Overrides** | `PriorityQueue` reimplementation | `offer()`, `poll()`, `remove(Object)`, `iterator()`, `spliterator()` | Optimized for Binary Heap |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, or `PriorityQueue`), even when the object is a `PriorityQueue`.
> ```java
> Queue<Integer> queue = new PriorityQueue<>();
> queue.comparator();   // ❌ Compile error
> ```

---

## PriorityQueue Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `PriorityQueue()` | `new PriorityQueue<>()` | Empty queue; natural ordering; default capacity 11 | O(1) | O(1) |
| `PriorityQueue(int initialCapacity)` | `new PriorityQueue<>(50)` | Pre-allocate capacity; natural ordering | O(1) | O(n) |
| `PriorityQueue(Comparator<? super E> comparator)` | `new PriorityQueue<>(Collections.reverseOrder())` | Custom ordering (e.g., Max Heap) | O(1) | O(1) |
| `PriorityQueue(int initialCapacity, Comparator<? super E> comparator)` | `new PriorityQueue<>(50, Collections.reverseOrder())` | Pre-allocate + custom ordering | O(1) | O(n) |
| `PriorityQueue(Collection<? extends E> c)` | `new PriorityQueue<>(collection)` | Copy elements from any collection; heapify | O(n) | O(n) |
| `PriorityQueue(PriorityQueue<? extends E> c)` | `new PriorityQueue<>(anotherQueue)` | Copy from existing PriorityQueue | O(n) | O(n) |
| `PriorityQueue(SortedSet<? extends E> c)` | `new PriorityQueue<>(sortedSet)` | Copy from SortedSet; preserves ordering | O(n) | O(n) |

---

## PriorityQueue Specific Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `comparator()` | `queue.comparator()` | Returns Comparator used; null for natural ordering | O(1) | O(1) |

### Natural Ordering vs Custom Ordering

```java
// Natural Ordering (Min Heap)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
// Insert: 30, 10, 20 → Head: 10

// Custom Ordering (Max Heap)
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
// Insert: 30, 10, 20 → Head: 30
```

---

## Internal Working

`PriorityQueue` internally uses a **Binary Min Heap** stored in an array. The root (index 0) always contains the element with the **highest priority** (smallest by default).

```text
         10
       /         20      30
    /    40    50

Array: [10, 20, 30, 40, 50]
```

| Operation | Description | Time |
|-----------|-------------|:----:|
| **offer() / add()** | Insert at end; siftUp until heap property restored | O(log n) |
| **poll() / remove()** | Remove root; move last to root; siftDown | O(log n) |
| **peek()** | Return root element | O(1) |
| **remove(Object)** | Find element; remove; siftUp/siftDown | O(n) |
| **grow()** | Double array size when full | O(n) amortized |

> **Note:** The `iterator()` traverses the internal array, so iteration order is **not sorted** — only `peek()` and `poll()` guarantee priority order.

## PriorityQueue Internal Working

### Initial Min Heap

```text
        10
      /    \
    20      30
   /  \
 40    50
 
 // 10,20,30,40,50
```

---

### offer(15) / add(15)

```text
Insert at End

        10
      /    \
    20      30
   /  \    /
 40   50  15

      siftUp ↑

        10
      /    \
    20      15
   /  \    /
 40   50  30

done until 15 reaches to proper place
Time → O(log n)
```

---

### poll()

```text
Remove Root (10)

Move Last to Root

        30
      /    \
    20      15
   /  \
 40    50

     siftDown ↓

        15
      /    \
    20      30
   /  \
 40    50

Time → O(log n)
```

---

### peek()

```text
        15
      /    \
    20      30

Returns → 15

Time → O(1)
```

---

### remove(40)

```text
Search → 15 → 20 → 30 → 40 ✔

Remove → Heap Adjust

Time → O(n)
```

---

### grow()

```text
Array Full

[10,20,30,40]

        │
        ▼

[10,20,30,40,_,_,_,_]

Copy Elements

Time → O(n)
```

---

## Optimized Overrides

`PriorityQueue` reimplements these inherited methods to maintain the Binary Heap:

```java
offer(E) / add(E)          // Insert with siftUp; O(log n)
poll() / remove()          // Remove root with siftDown; O(log n)
remove(Object o)           // Find and remove with heap restore; O(n)
iterator()                 // Traverses internal array (not sorted)
spliterator()              // Heap-aware split for parallel streams
```

---

## PriorityQueue vs PriorityBlockingQueue

| Feature | PriorityQueue | PriorityBlockingQueue |
|---------|-------------:|----------------------:|
| Thread Safe | ❌ No | ✅ Yes |
| Blocking Operations | ❌ No | ✅ Yes |
| Timed Operations | ❌ No | ✅ Yes |
| Internal Structure | Binary Heap | Binary Heap |
| Unbounded | ✅ Yes | ✅ Yes |
| Null Elements | ❌ Not allowed | ❌ Not allowed |
| Use Case | Single-threaded priority tasks | Concurrent priority scheduling |

// NOTE IT : Only ArrayBlockingQueue , LinkedBlockingQueue , LinkedBlockingDequeue and SynchronousQueue are Bounded

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Natural priority ordering | `PriorityQueue()` | `new PriorityQueue<>()` |
| Known element count | `PriorityQueue(int)` | `new PriorityQueue<>(1000)` |
| Max Heap (descending) | `PriorityQueue(Comparator)` | `new PriorityQueue<>(Collections.reverseOrder())` |
| Pre-allocate + custom order | `PriorityQueue(int, Comparator)` | `new PriorityQueue<>(50, comparator)` |
| Heapify existing collection | `PriorityQueue(Collection)` | `new PriorityQueue<>(list)` |
| Copy PriorityQueue | `PriorityQueue(PriorityQueue)` | `new PriorityQueue<>(pq)` |
| Copy from SortedSet | `PriorityQueue(SortedSet)` | `new PriorityQueue<>(sortedSet)` |
| Check ordering comparator | `comparator()` | `queue.comparator()` |
| Dijkstra's algorithm / scheduling | `PriorityQueue()` | `new PriorityQueue<>()` |

---

## Interview Q&A

**Q1. Which interface does PriorityQueue implement?**  
`Queue` — indirectly `Collection` and `Iterable`.

**Q2. Which data structure does PriorityQueue use internally?**  
Binary Heap (default: Min Heap).

**Q3. Does PriorityQueue maintain insertion order?**  
No. It maintains **priority order** — smallest element first by default.

**Q4. Which element is returned by peek()?**  
The element with the **highest priority** (smallest by default, or as defined by Comparator).

**Q5. How can you create a Max Heap?**  
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```

**Q6. Are duplicate elements allowed?**  
Yes.

**Q7. Are null elements allowed?**  
No. Throws `NullPointerException`.

**Q8. Is PriorityQueue thread-safe?**  
No. For thread-safe priority queues, use `PriorityBlockingQueue`.

**Q9. What is the time complexity of insertion?**  
O(log n) — requires siftUp to maintain heap property.

**Q10. What is the time complexity of removing the head element?**  
O(log n) — requires siftDown to maintain heap property.

**Q11. What is the time complexity of peek()?**  
O(1) — root element is directly accessible.

**Q12. Why is iterator() not sorted?**  
Because it traverses the internal Binary Heap array structure, not the priority order. Only `peek()` and `poll()` guarantee priority order.

---

## Summary

- `PriorityQueue` is the most commonly used implementation of the `Queue` interface.
- Internally uses a **Binary Min Heap**.
- Elements are ordered according to **priority**, not insertion order.
- Inherits methods from `Iterable`, `Collection`, and `Queue`.
- Provides multiple constructors for different initialization requirements.
- Introduces the `comparator()` method to access the ordering Comparator.
- Allows duplicate elements but **does not allow null elements**.
- **Not thread-safe** — use `PriorityBlockingQueue` for concurrent access.
- Best suited for priority scheduling, task management, shortest path algorithms (Dijkstra's), event simulation, and job scheduling.
