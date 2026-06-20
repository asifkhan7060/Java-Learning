# ArrayList Method Hierarchy

## Overview

`ArrayList` is the most commonly used implementation of the `List` interface in the Java Collection Framework.

It internally stores elements using a **Dynamic Array**, which provides:

- Fast Random Access
- Dynamic Resizing
- Ordered Collection
- Duplicate Elements
- Multiple Null Values
- Index-Based Operations

Since `ArrayList` implements the `List` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `List`

Additionally, `ArrayList` provides its own constructors and several class-specific methods.

---

## Class Declaration

```java
public class ArrayList<E>
        extends AbstractList<E>
        implements List<E>, RandomAccess,
                   Cloneable, Serializable
```

---

## Inheritance Hierarchy

```text
Iterable
    ↑
Collection
    ↑
List
    ↑
AbstractCollection
    ↑
AbstractList
    ↑
ArrayList
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
ArrayList
```

---

## Complete ArrayList Method Hierarchy

```text
ArrayList<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ArrayList()
├── ArrayList(int initialCapacity)
└── ArrayList(Collection<? extends E> c)

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
│ Methods Inherited from List
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
│ ArrayList Specific Public Methods
├──────────────────────────────────────────────
│
├── ensureCapacity(int minCapacity)
├── trimToSize()
└── clone()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── forEach()
├── removeIf()
├── replaceAll()
├── sort()
└── spliterator()
```

---

## Understanding the Hierarchy

The methods available in an `ArrayList` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `ArrayList` class | `ArrayList()`, `ArrayList(int)`, `ArrayList(Collection)` | Not inherited; used for object creation |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `List extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **List** | `ArrayList implements List` | `get()`, `set()`, `add(index)`, `remove(index)`, `sort()`, `subList()` | Index-based operations |
| **ArrayList Specific** | `ArrayList` class | `ensureCapacity()`, `trimToSize()`, `clone()` | Capacity management |
| **Optimized Overrides** | `ArrayList` reimplementation | `forEach()`, `replaceAll()`, `sort()`, `spliterator()`, `removeIf()` | Faster for dynamic arrays |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `List`, or `ArrayList`), even when the object is an `ArrayList`.
> ```java
> List<Integer> list = new ArrayList<>();
> list.ensureCapacity(100);   // ❌ Compile error
> ```

---

## ArrayList Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `ArrayList()` | `new ArrayList<>()` | Empty list; capacity becomes 10 on first add | O(1) | O(1) |
| `ArrayList(int initialCapacity)` | `new ArrayList<>(100)` | Pre-allocate capacity; avoids repeated resizing | O(1) | O(n) |
| `ArrayList(Collection<? extends E> c)` | `new ArrayList<>(collection)` | Copy all elements from another collection | O(n) | O(n) |

### Capacity vs Size

| Concept | Meaning | Example |
|---------|---------|---------|
| **Capacity** | Internal array length before resizing | `new ArrayList<>(100)` → Capacity = 100 |
| **Size** | Actual number of stored elements | After `add(10)`, `add(20)` → Size = 2 |

```java
ArrayList<Integer> list = new ArrayList<>(100);  // Capacity = 100
list.add(10);
list.add(20);                                     // Size = 2
```

---

## ArrayList Specific Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `ensureCapacity(int minCapacity)` | `list.ensureCapacity(1000)` | Pre-expand internal array; reduces resizing overhead | O(n) if resize, else O(1) | O(n) if resized |
| `trimToSize()` | `list.trimToSize()` | Shrink capacity to match current size; saves memory | O(n) | O(n) |
| `clone()` | `(ArrayList<String>) list.clone()` | Creates a **shallow copy** — new ArrayList, same element references | O(n) | O(n) |

### Shallow Copy

`clone()` performs a **shallow copy** — the ArrayList object is copied, but the stored objects are **not cloned**.

```
Original List          Clone List
    [Apple]      →        [Apple]      ← Same object referenced
    [Banana]     →        [Banana]     ← Same object referenced
```

Both lists reference the same objects. For deep copy, every object must be cloned individually.

---

## Optimized Overrides

`ArrayList` reimplements these inherited methods for better dynamic-array performance:

```java
forEach(Consumer)          // Optimized iteration over contiguous array
replaceAll(UnaryOperator)    // In-place element transformation  
sort(Comparator)             // TimSort on array (faster than generic)
spliterator()                // Array-based split for parallel streams
removeIf(Predicate)          // Bulk conditional removal
```

These behave the same as parent interface definitions but are internally optimized.

---

## When to Use These Methods

| Scenario | Method | Example |
|----------|--------|---------|
| Unknown element count | `ArrayList()` | `new ArrayList<>()` |
| Known large count (e.g., 5000 employees) | `ArrayList(int)` | `new ArrayList<>(5000)` |
| Copy from another collection | `ArrayList(Collection)` | `new ArrayList<>(hashSet)` |
| Bulk add many elements | `ensureCapacity()` | `list.ensureCapacity(100000)` |
| Memory optimization after deletions | `trimToSize()` | `list.trimToSize()` |
| Need independent list with same elements | `clone()` | `(ArrayList<String>) list.clone()` |

---

## Interview Q&A

**Q1. Which interface does ArrayList implement?**  
`List` — indirectly `Collection` and `Iterable`.

**Q2. Which data structure does ArrayList use internally?**  
Dynamic Array.

**Q3. Why is ArrayList faster than LinkedList for `get(index)`?**  
Direct address calculation: `base + (index × elementSize)`. LinkedList must traverse from head (O(n)).

**Q4. Why is insertion in the middle slower?**  
All subsequent elements must be shifted right (O(n)).

**Q5. Difference between Capacity and Size?**  
Capacity = internal array length before resize. Size = actual elements stored.

**Q6. Does `clone()` perform a deep copy?**  
No — shallow copy. New ArrayList, but elements reference the same objects.

**Q7. What is the default capacity of ArrayList?**  
Modern JDK: 0 initially → becomes 10 on first insertion. Grows by ~1.5× when full.

**Q8. Why use `ensureCapacity()`?**  
Reduces repeated internal array resizing → improves performance for bulk additions.

**Q9. Why use `trimToSize()`?**  
Releases unused memory by shrinking internal array to match current size.

**Q10. Which methods are unique to ArrayList (not in List interface)?**  
`ensureCapacity()`, `trimToSize()`, `clone()`.

**Q11. Are Collection methods copied into ArrayList?**  
No — they are **inherited** through the interface hierarchy.

**Q12. Why can't we call `ensureCapacity()` using a List reference?**  
```java
List<Integer> list = new ArrayList<>();
list.ensureCapacity(100);   // ❌ Compile error
```
Because `ensureCapacity()` belongs to the **ArrayList class**, not the **List interface**.

---

## Summary

- `ArrayList` is the most commonly used implementation of the `List` interface.
- Internally uses a **Dynamic Array**.
- Supports fast random access (O(1)).
- Inherits methods from `Iterable`, `Collection`, and `List`.
- Provides three public methods of its own: `ensureCapacity()`, `trimToSize()`, `clone()`.
- `clone()` creates a **shallow copy**, not a deep copy.
- Supports automatic resizing (grows by ~1.5×).
- Suitable when random access is more frequent than middle insertion/deletion.
