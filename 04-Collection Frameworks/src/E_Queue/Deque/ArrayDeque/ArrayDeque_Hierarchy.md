# ArrayDeque Method Hierarchy

## Overview

`ArrayDeque` is the most commonly used implementation of the `Deque` interface in the Java Collection Framework.

Unlike `LinkedList`, `ArrayDeque` internally stores elements using a **Resizable Circular Array**, making it faster for insertion and deletion operations at both ends.

It can be used as both:

- Queue (FIFO)
- Stack (LIFO)

It provides:

- Fast Insertion at Front
- Fast Insertion at Rear
- Fast Deletion at Front
- Fast Deletion at Rear
- Dynamic Resizing
- No Null Elements
- Better Performance than Stack and LinkedList (for Deque operations)

Since `ArrayDeque` implements the `Deque` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `Queue`
- `Deque`

Additionally, `ArrayDeque` provides its own constructors.

---

## Class Declaration

```java
public class ArrayDeque<E>
        extends AbstractCollection<E>
        implements Deque<E>,
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
Queue
    ↑
Deque
    ↑
AbstractCollection
    ↑
ArrayDeque
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
Deque
     ↑
ArrayDeque
```

---

## Complete ArrayDeque Method Hierarchy

```text
ArrayDeque<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ArrayDeque()
├── ArrayDeque(int numElements)
└── ArrayDeque(Collection<? extends E> c)
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
│ Methods Inherited from Deque
├──────────────────────────────────────────────
│
├── addFirst(E e)
├── addLast(E e)
│
├── offerFirst(E e)
├── offerLast(E e)
│
├── removeFirst()
├── removeLast()
│
├── pollFirst()
├── pollLast()
│
├── getFirst()
├── getLast()
│
├── peekFirst()
├── peekLast()
│
├── push(E e)
├── pop()
│
├── removeFirstOccurrence(Object o)
├── removeLastOccurrence(Object o)
│
├── descendingIterator()
└── reversed() // Java 21+
│
├──────────────────────────────────────────────
│ ArrayDeque Specific Public Methods
├──────────────────────────────────────────────
│
└── clone()
│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── addFirst()
├── addLast()
├── pollFirst()
├── pollLast()
├── iterator()
├── descendingIterator()
├── spliterator()
└── clone()
```

---

## Understanding the Hierarchy

The methods available in an `ArrayDeque` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `ArrayDeque` class | `ArrayDeque()`, `ArrayDeque(int)`, `ArrayDeque(Collection)` | Not inherited; resizable circular array |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `Deque extends Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard FIFO operations |
| **Deque** | `ArrayDeque implements Deque` | `addFirst()`, `addLast()`, `pollFirst()`, `pollLast()`, `push()`, `pop()`, `descendingIterator()` | Double-ended operations (Queue + Stack) |
| **ArrayDeque Specific** | `ArrayDeque` class | `clone()` | Shallow copy |
| **Optimized Overrides** | `ArrayDeque` reimplementation | `addFirst()`, `addLast()`, `pollFirst()`, `pollLast()`, `iterator()`, `descendingIterator()`, `spliterator()`, `clone()` | Optimized for circular array |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, `Deque`, or `ArrayDeque`), even when the object is an `ArrayDeque`.
> ```java
> Queue<Integer> queue = new ArrayDeque<>();
> queue.addFirst(10);   // ❌ Compile error
> ```

---

## ArrayDeque Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `ArrayDeque()` | `new ArrayDeque<>()` | Empty deque; capacity becomes 16 initially | O(1) | O(1) |
| `ArrayDeque(int numElements)` | `new ArrayDeque<>(100)` | Pre-allocate capacity; reduces resizing | O(1) | O(n) |
| `ArrayDeque(Collection<? extends E> c)` | `new ArrayDeque<>(collection)` | Copy all elements from another collection | O(n) | O(n) |

---

## Deque Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `addFirst(E e)` | `deque.addFirst(10)` | Insert at front; throws if full | O(1) amortized | O(1) |
| `addLast(E e)` | `deque.addLast(10)` | Insert at rear; throws if full | O(1) amortized | O(1) |
| `offerFirst(E e)` | `deque.offerFirst(10)` | Insert at front; returns false if full | O(1) amortized | O(1) |
| `offerLast(E e)` | `deque.offerLast(10)` | Insert at rear; returns false if full | O(1) amortized | O(1) |
| `removeFirst()` | `deque.removeFirst()` | Remove and return front; throws if empty | O(1) | O(1) |
| `removeLast()` | `deque.removeLast()` | Remove and return rear; throws if empty | O(1) | O(1) |
| `pollFirst()` | `deque.pollFirst()` | Remove and return front; null if empty | O(1) | O(1) |
| `pollLast()` | `deque.pollLast()` | Remove and return rear; null if empty | O(1) | O(1) |
| `getFirst()` | `deque.getFirst()` | Return front element; throws if empty | O(1) | O(1) |
| `getLast()` | `deque.getLast()` | Return rear element; throws if empty | O(1) | O(1) |
| `peekFirst()` | `deque.peekFirst()` | Return front element; null if empty | O(1) | O(1) |
| `peekLast()` | `deque.peekLast()` | Return rear element; null if empty | O(1) | O(1) |
| `push(E e)` | `deque.push(10)` | Stack push (equivalent to addFirst) | O(1) amortized | O(1) |
| `pop()` | `deque.pop()` | Stack pop (equivalent to removeFirst) | O(1) | O(1) |
| `removeFirstOccurrence(Object o)` | `deque.removeFirstOccurrence(10)` | Remove first matching element | O(n) | O(1) |
| `removeLastOccurrence(Object o)` | `deque.removeLastOccurrence(10)` | Remove last matching element | O(n) | O(1) |
| `descendingIterator()` | `deque.descendingIterator()` | Iterator from rear to front | O(1) | O(1) |

### Queue vs Stack Operations

```java
// Queue (FIFO)
deque.offerLast(10);   // enqueue
deque.offerLast(20);
deque.pollFirst();     // dequeue → 10

// Stack (LIFO)
deque.push(10);        // push
deque.push(20);
deque.pop();           // pop → 20
```

---

## ArrayDeque Specific Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `clone()` | `(ArrayDeque<String>) deque.clone()` | Creates a **shallow copy** — new ArrayDeque, same element references | O(n) | O(n) |

### Shallow Copy

`clone()` performs a **shallow copy** — the ArrayDeque object is copied, but the stored objects are **not cloned**.

```
Original Deque          Clone Deque
    [Java]      →          [Java]      ← Same object referenced
    [Python]    →          [Python]    ← Same object referenced
```

---

## Internal Working

`ArrayDeque` internally uses a **Resizable Circular Array**. When either end reaches the array boundary, it wraps around to the opposite side.

```text
        Front
          │
          ▼
    +----+----+----+----+----+----+
    | 40 | 50 |    |    | 10 | 20 |
    +----+----+----+----+----+----+
                            ▲
                            │
                          Rear
```

| Operation | Behavior | Time |
|-----------|----------|:----:|
| **addFirst** | Decrement front index (wrap if needed); insert element | O(1) amortized |
| **addLast** | Insert at rear index; increment (wrap if needed) | O(1) amortized |
| **grow** | Double array size when full; copy elements | O(n) |
| **pollFirst** | Return element at front; increment front index | O(1) |
| **pollLast** | Return element at rear; decrement rear index | O(1) |

---

## Optimized Overrides

`ArrayDeque` reimplements these inherited methods for circular array performance:

```java
addFirst(E) / addLast(E)     // Direct index manipulation with wrap-around
pollFirst() / pollLast()       // Direct index manipulation with wrap-around
iterator()                     // Forward iteration from front to rear
descendingIterator()           // Reverse iteration from rear to front
spliterator()                  // Array-based split for parallel streams
clone()                        // Circular array aware shallow copy
```

---

## ArrayDeque vs Stack

| Feature | ArrayDeque | Stack |
|---------|-----------:|------:|
| Performance | Faster (no synchronization) | Slower (synchronized) |
| Thread-Safe | ❌ No | ✅ Yes (legacy) |
| Recommended | ✅ Yes | ❌ No (deprecated) |
| LIFO Support | ✅ Yes | ✅ Yes |

## ArrayDeque vs LinkedList

| Feature | ArrayDeque | LinkedList |
|---------|-----------:|-----------:|
| Internal Structure | Circular Array | Doubly Linked List |
| Memory Usage | Lower | Higher (node overhead) |
| Cache Locality | Better | Poor |
| Front/Rear Operations | O(1) amortized | O(1) |
| Null Elements | ❌ Not allowed | ✅ Allowed |
| Index-Based Access | ❌ Not supported | ❌ Not supported |
| Recommended for Deque | ✅ Yes | ⚪ Acceptable |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Unknown element count | `ArrayDeque()` | `new ArrayDeque<>()` |
| Known large count | `ArrayDeque(int)` | `new ArrayDeque<>(5000)` |
| Copy from another collection | `ArrayDeque(Collection)` | `new ArrayDeque<>(list)` |
| Queue operations (FIFO) | `offerLast()` / `pollFirst()` | `deque.offerLast(10); deque.pollFirst()` |
| Stack operations (LIFO) | `push()` / `pop()` | `deque.push(10); deque.pop()` |
| Need independent deque with same elements | `clone()` | `(ArrayDeque<String>) deque.clone()` |
| Sliding window / BFS / DFS | `ArrayDeque()` | `new ArrayDeque<>()` |

---

## Interview Q&A

**Q1. Which interface does ArrayDeque implement?**  
`Deque` — indirectly `Queue`, `Collection`, and `Iterable`.

**Q2. Which data structure does ArrayDeque use internally?**  
Resizable Circular Array.

**Q3. Can ArrayDeque be used as both Queue and Stack?**  
Yes. Queue (FIFO) via `offerLast()`/`pollFirst()` and Stack (LIFO) via `push()`/`pop()`.

**Q4. Does ArrayDeque allow duplicate elements?**  
Yes.

**Q5. Does ArrayDeque allow null elements?**  
No. Throws `NullPointerException`.

**Q6. Which is faster for Stack operations?**  
`ArrayDeque` — recommended instead of the legacy `Stack` class.

**Q7. Which is faster for Deque operations?**  
`ArrayDeque` — generally performs better than `LinkedList` due to better cache locality and lower memory overhead.

**Q8. Is ArrayDeque synchronized?**  
No. For thread-safe deque operations, use `LinkedBlockingDeque`.

**Q9. Does ArrayDeque support random access?**  
No. It does not provide index-based operations like `get(index)`.

**Q10. Which method creates a shallow copy?**  
`clone()`.

**Q11. Why is ArrayDeque preferred over Stack?**  
Better performance, no synchronization overhead, and recommended by Java documentation.

**Q12. What is the time complexity of insertion and deletion at both ends?**  
O(1) amortized. Resizing (O(n)) occurs only when the array becomes full.

---

## Summary

- `ArrayDeque` is the most commonly used implementation of the `Deque` interface.
- Internally uses a **Resizable Circular Array**.
- Can be used as both a **Queue (FIFO)** and a **Stack (LIFO)**.
- Inherits methods from `Iterable`, `Collection`, `Queue`, and `Deque`.
- Provides three constructors for different initialization requirements.
- Introduces the `clone()` method for creating a **Shallow Copy**.
- Allows duplicate elements but **does not allow null elements**.
- Generally performs better than `LinkedList` and the legacy `Stack` class for Deque operations.
- Best suited for Queue, Stack, Sliding Window, BFS, DFS, and other double-ended data structure applications.
