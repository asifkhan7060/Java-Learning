# Vector Method Hierarchy

## Overview

`Vector` is one of the implementations of the `List` interface in the Java Collection Framework.

Like `ArrayList`, `Vector` internally stores elements using a **Dynamic Array**.

However, unlike `ArrayList`, all public methods of `Vector` are **synchronized**, making it **thread-safe**.

Therefore, a `Vector` object can be safely accessed by multiple threads, although synchronization introduces additional overhead and makes it slower than `ArrayList`.

Since `Vector` implements the `List` interface, it inherits methods from:

- Iterable Interface
- Collection Interface
- List Interface

Additionally, `Vector` provides its own constructors, capacity-related methods, and several legacy methods.

---

## Class Declaration

```java
public class Vector<E>
        extends AbstractList<E>
        implements List<E>,
                   RandomAccess,
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
AbstractCollection
    ↑
AbstractList
    ↑
Vector
```

---

## Interface Relationship

```text
             Iterable
                 ↑
           Collection
                 ↑
              List
                 ↑
             Vector
```

---

## Why Vector?

Suppose multiple threads are accessing the same collection.

```text
Thread 1  ----                                 →  Vector
                /
Thread 2  ----/
```

If both threads try to modify the collection simultaneously, a normal collection like `ArrayList` may produce inconsistent results.

`Vector` solves this problem by synchronizing its public methods.

This ensures that only one thread can execute a modifying operation at a time.

Therefore,

- Safe for Multi-threading
- Prevents Concurrent Modification during method execution

However, synchronization introduces extra overhead.

Therefore, `Vector` is generally slower than `ArrayList`.

---

## Key Features

- Dynamic Array
- Ordered Collection
- Maintains Insertion Order
- Allows Duplicate Elements
- Allows Multiple Null Values
- Dynamic Size
- Index-Based Access
- Thread Safe (Synchronized)
- Legacy Class
- Supports Random Access

---

## Complete Method Hierarchy

```text
Vector<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── Vector()
├── Vector(int initialCapacity)
├── Vector(int initialCapacity, int capacityIncrement)
└── Vector(Collection<? extends E> c)

│
├──────────────────────────────────────────────
│ Iterable Interface
├──────────────────────────────────────────────
│
├── iterator()
├── spliterator()
└── forEach()

│
├──────────────────────────────────────────────
│ Collection Interface
├──────────────────────────────────────────────
│
├── add(E e)
├── addAll(Collection<? extends E> c)
│
├── remove(Object o)
├── removeAll(Collection<?> c)
├── removeIf(Predicate<? super E> filter)
├── retainAll(Collection<?> c)
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
│ List Interface
├──────────────────────────────────────────────
│
├── get(int index)
├── set(int index, E element)
│
├── add(int index, E element)
├── addAll(int index, Collection<? extends E> c)
│
├── remove(int index)
│
├── indexOf(Object o)
├── lastIndexOf(Object o)
│
├── listIterator()
├── listIterator(int index)
│
├── subList(int fromIndex, int toIndex)
│
├── replaceAll(UnaryOperator<E> operator)
└── sort(Comparator<? super E> c)

│
├──────────────────────────────────────────────
│ Vector Specific Public Methods
├──────────────────────────────────────────────
│
├── capacity()
├── ensureCapacity(int minCapacity)
├── trimToSize()
├── setSize(int newSize)
├── copyInto(Object[] anArray)
├── elements()
└── clone()

│
├──────────────────────────────────────────────
│ Legacy Methods
├──────────────────────────────────────────────
│
├── addElement(E obj)
├── insertElementAt(E obj, int index)
├── removeElement(Object obj)
├── removeElementAt(int index)
├── removeAllElements()
├── firstElement()
├── lastElement()
├── setElementAt(E obj, int index)
└── elementAt(int index)

Legacy Methods (Vector)

These methods are kept for backward compatibility with
pre-Java 1.2 code.

For modern Java development, use the corresponding
List methods instead.

Examples:
addElement()      → add()
elementAt()       → get()
setElementAt()    → set()
removeElement()   → remove()
removeAllElements() → clear()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── spliterator()
├── forEach()
├── removeIf()
├── replaceAll()
└── sort()
```

---

## Understanding the Hierarchy

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `Vector` class | `Vector()`, `Vector(int)`, `Vector(int, int)`, `Vector(Collection)` | Not inherited; used for object creation |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `List extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **List** | `Vector implements List` | `get()`, `set()`, `add(index)`, `remove(index)`, `sort()`, `subList()` | Index-based operations |
| **Vector Specific** | `Vector` class | `capacity()`, `ensureCapacity()`, `trimToSize()`, `setSize()`, `copyInto()`, `elements()`, `clone()` | Capacity + legacy support |
| **Legacy Methods** | `Vector` class | `addElement()`, `insertElementAt()`, `removeElement()`, `firstElement()`, `lastElement()`, `elementAt()` | Pre-Collection Framework methods |
| **Optimized Overrides** | `Vector` reimplementation | `forEach()`, `removeIf()`, `replaceAll()`, `sort()`, `spliterator()` | Optimized for dynamic array |

> **Important:** The methods accessible in your code depend on the **reference type** (`Collection`, `List`, or `Vector`), even though the underlying object is a `Vector`.
> ```java
> List<Integer> list = new Vector<>();
> list.capacity();   // ❌ Compile error — List has no capacity()
> ```

---

## Vector Constructors

| Constructor | Syntax | Purpose | Default / Notes |
|-------------|--------|---------|-----------------|
| `Vector()` | `new Vector<>()` | Empty vector | Default capacity = 10, doubles when full |
| `Vector(int initialCapacity)` | `new Vector<>(20)` | Specified initial capacity | Doubles when full |
| `Vector(int initialCapacity, int capacityIncrement)` | `new Vector<>(5, 3)` | Custom growth strategy | Grows by `capacityIncrement` (3) instead of doubling |
| `Vector(Collection<? extends E> c)` | `new Vector<>(collection)` | Copy from another collection | — |

### Capacity vs Size vs Capacity Increment

| Concept | Meaning | Example |
|---------|---------|---------|
| **Capacity** | Internal array length before resizing | `new Vector<>(5, 3)` → Capacity = 5 |
| **Size** | Actual elements stored | After `add(10)`, `add(20)` → Size = 2 |
| **Capacity Increment** | Amount to grow when full | `new Vector<>(5, 3)` → Grows by 3 (not double) |

```java
Vector<Integer> v = new Vector<>(5, 3);  // Capacity = 5, Increment = 3
v.add(10); v.add(20);                       // Size = 2
// When full (5 elements), capacity becomes 8 (5 + 3), not 10
```

---

## Vector Specific Methods

| Method | Syntax | Purpose | Time |
|--------|--------|---------|:----:|
| `capacity()` | `v.capacity()` | Returns current internal array capacity | O(1) |
| `ensureCapacity(int min)` | `v.ensureCapacity(100)` | Pre-expand if needed | O(n) if resize |
| `trimToSize()` | `v.trimToSize()` | Shrink capacity to match size | O(n) |
| `setSize(int newSize)` | `v.setSize(20)` | Change size (truncate or pad with null) | O(n) |
| `copyInto(Object[] arr)` | `v.copyInto(array)` | Copy all elements into an array | O(n) |
| `elements()` | `v.elements()` | Returns `Enumeration` for traversal | O(1) |
| `clone()` | `(Vector<String>) v.clone()` | Creates a **shallow copy** | O(n) |

### Shallow Copy

`clone()` creates a new Vector object, but stored objects are **not copied**.

```
Original Vector        Clone Vector
    [Apple]      →        [Apple]      ← Same object referenced
    [Banana]     →        [Banana]     ← Same object referenced
```

---

## Legacy Methods

These methods existed before the Java Collection Framework. Modern code prefers `List` methods.

| Legacy Method | Equivalent List Method | Description |
|-------------|----------------------|-------------|
| `addElement(E obj)` | `add(E e)` | Add element at end |
| `insertElementAt(E obj, int index)` | `add(int index, E element)` | Insert at specific index |
| `removeElement(Object obj)` | `remove(Object o)` | Remove first occurrence |
| `removeElementAt(int index)` | `remove(int index)` | Remove at index |
| `removeAllElements()` | `clear()` | Remove all elements |
| `firstElement()` | `get(0)` | Get first element |
| `lastElement()` | `get(size()-1)` | Get last element |
| `setElementAt(E obj, int index)` | `set(int index, E element)` | Replace at index |
| `elementAt(int index)` | `get(int index)` | Get element at index |

---

## Internal Working

### Synchronization

All public methods are synchronized using `synchronized` keyword:

```java
public synchronized boolean add(E e) { ... }
public synchronized E get(int index) { ... }
public synchronized E remove(int index) { ... }
```

This ensures thread safety but adds lock overhead.

### Growth Strategy

```text
Default Vector (no increment):
  Capacity: 10 → 20 → 40 → 80 ... (doubles)

Custom Vector (increment = 3):
  Capacity: 5 → 8 → 11 → 14 ... (adds 3)
```

---

## Time Complexity Comparison

| Operation | ArrayList | Vector |
|-----------|:---------:|:------:|
| `get(index)` | **O(1)** | **O(1)** |
| `add(end)` | **O(1)*** | **O(1)*** |
| `add(index)` | O(n) | O(n) |
| `remove(index)` | O(n) | O(n) |
| `contains()` | O(n) | O(n) |
| Thread-safe | ❌ | ✅ |

> *Amortized O(1); includes synchronization overhead for Vector

---

## When to Use Vector

| Use When | Avoid When |
|----------|------------|
| Thread safety is required | Single-threaded code (use ArrayList) |
| Working with legacy APIs | Need maximum performance |
| Synchronization preferred over manual locking | Modern concurrent code (use CopyOnWriteArrayList) |

---

## Reference Type Demonstration

```java
Collection<Integer> c = new Vector<>();     // Collection methods only
List<Integer> list = new Vector<>();          // Collection + List methods
Vector<Integer> vector = new Vector<>();      // All methods + legacy + specific
```

| Reference Type | Accessible Methods |
|----------------|-------------------|
| `Collection` | Collection only |
| `List` | Collection + List |
| `Vector` | Collection + List + Vector Specific + Legacy |

---

## Interview Q&A

**Q1. What is Vector?**  
A thread-safe `List` implementation using a dynamic array with synchronized methods.

**Q2. Why is Vector slower than ArrayList?**  
All public methods are synchronized — lock overhead on every operation.

**Q3. What is the default capacity of Vector?**  
10. Grows by doubling (default) or by custom `capacityIncrement`.

**Q4. How does Vector grow?**  
- Default: capacity doubles (10 → 20 → 40)
- Custom: adds `capacityIncrement` (5,3 → 5 → 8 → 11)

**Q5. Difference between `size()` and `capacity()`?**  
`size()` = elements stored. `capacity()` = internal array length before resize.

**Q6. Difference between `ensureCapacity()` and `trimToSize()`?**  
`ensureCapacity()` increases if needed. `trimToSize()` shrinks to match size.

**Q7. What is `Enumeration`?**  
Legacy cursor for traversing Vector. Methods: `hasMoreElements()`, `nextElement()`.

**Q8. Difference between `Iterator` and `Enumeration`?**  

| Iterator | Enumeration |
|----------|-------------|
| Modern (Java 1.2+) | Legacy (Java 1.0) |
| Can remove elements | Cannot remove elements |
| Works with all collections | Mainly used with Vector |

**Q9. What type of copy does `clone()` create?**  
A **Shallow Copy** — new Vector, same element references.

**Q10. When should you use Vector?**  
- Thread safety required
- Legacy API compatibility
- Prefer synchronization over manual locking

Otherwise, prefer `ArrayList` (single-threaded) or `CopyOnWriteArrayList` (concurrent reads).

---

## Summary

- `Vector` is a **thread-safe** `List` implementation using a **Dynamic Array**.
- All public methods are **synchronized** — safe for multi-threading but slower.
- Default capacity = 10; grows by doubling or custom increment.
- Provides **capacity management** methods: `capacity()`, `ensureCapacity()`, `trimToSize()`, `setSize()`.
- Includes **legacy methods** for backward compatibility: `addElement()`, `firstElement()`, etc.
- Modern alternatives: `ArrayList` (single-threaded), `CopyOnWriteArrayList` (concurrent).
- Suitable when native synchronization is required or working with legacy code.
