# Java Deque Interface — Complete Guide

## 1. What is Deque?

`Deque<E>` is a child interface of `Queue<E>` designed for **processing elements from both ends**. The name *deque* is short for **"double ended queue"** and is usually pronounced **"deck"**.

Unlike a normal `Queue` which follows **FIFO (First In, First Out)**, a `Deque` can behave as both:

* **Queue (FIFO)** — elements inserted at the rear, removed from the front
* **Stack (LIFO)** — elements inserted and removed from the same end

This makes it one of the most flexible data structures in the Java Collection Framework.

```java
public interface Deque<E> extends Queue<E>
```

**Hierarchy:**
```
Iterable → Collection → Queue → Deque
                                      ├── ArrayDeque
                                      ├── LinkedList
                                      └── BlockingDeque (I)
                                              └── LinkedBlockingDeque
```

---

## 2. Deque Implementations

| Feature |                    **ArrayDeque**                    | **LinkedList** | **LinkedBlockingDeque** |
|---------|:----------------------------------------------------:|:--------------:|:-----------------------:|
| Internal Structure | Resizable Circular Array (Learn by CircularArray.md) | Doubly Linked List | Doubly Linked List + Locks |
| Ordering |                     FIFO / LIFO                      | FIFO / LIFO | FIFO / LIFO |
| Null Allowed |                          ❌                           | ✅ | ❌ |
| Thread-Safe |                          ❌                           | ❌ | ✅ |
| Blocking Operations |                          ❌                           | ❌ | ✅ |
| Queue Operations |                          ✅                           | ✅ | ✅ |
| Stack Operations |                          ✅                           | ✅ | ✅ |
| List Features |                          ❌                           | ✅ | ❌ |
| Performance |                     ⭐ Excellent                      | ⭐⭐ Good | ⭐⭐ Good |
| Memory Usage |                       ⭐ Lowest                       | ⭐⭐ Medium | ⭐⭐⭐ High |

### When to Choose What

```
Need thread safety / blocking?
        │
       Yes ───► LinkedBlockingDeque
        │
        No
        ▼
Need Queue + List features?
        │
       Yes ───► LinkedList
        │
        No
        ▼
Need general Deque (Queue + Stack)?
        │
       Yes ───► ArrayDeque
        │
        No
        ▼
   Default: ArrayDeque
```

---

## 3. Core Deque Methods

### Inherited from Collection
`add()`, `addAll()`, `remove()`, `removeAll()`, `removeIf()`, `retainAll()`, `contains()`, `containsAll()`, `size()`, `isEmpty()`, `clear()`, `toArray()`, `stream()`, `equals()`, `hashCode()`

### Inherited from Queue (Equivalent Deque Methods)

| Queue Method | Equivalent Deque Method | Description |
|:------------:|:----------------------:|:-----------:|
| `add(e)` | `addLast(e)` | Insert at rear |
| `offer(e)` | `offerLast(e)` | Insert at rear (preferred) |
| `remove()` | `removeFirst()` | Remove and return head |
| `poll()` | `pollFirst()` | Remove and return head (preferred) |
| `element()` | `getFirst()` | Peek at head without removing |
| `peek()` | `peekFirst()` | Peek at head without removing (preferred) |

### Deque Interface Methods — 12 Core Double-Ended Operations

| Operation | First Element (Head) | | Last Element (Tail) | |
|:---------:|:--------------------:|:--:|:-------------------:|:--:|
| | **Throws Exception** | **Special Value** | **Throws Exception** | **Special Value** |
| **Insert** | `addFirst(e)` | `offerFirst(e)` | `addLast(e)` | `offerLast(e)` |
| **Remove** | `removeFirst()` | `pollFirst()` | `removeLast()` | `pollLast()` |
| **Examine** | `getFirst()` | `peekFirst()` | `getLast()` | `peekLast()` |

### Stack Methods (LIFO)

| Stack Method | Equivalent Deque Method | Description |
|:------------:|:----------------------:|:-----------:|
| `push(e)` | `addFirst(e)` | Push onto stack |
| `pop()` | `removeFirst()` | Pop from stack |
| `peek()` | `peekFirst()` | Peek at top of stack |

### Additional Deque Methods

| Method | Description |
|--------|-------------|
| `removeFirstOccurrence(Object o)` | Remove first matching element |
| `removeLastOccurrence(Object o)` | Remove last matching element |
| `descendingIterator()` | Iterator in reverse order |
| `reversed()` | Reverse-ordered view *(Java 21+)* |

### BlockingDeque Methods (Thread-Safe)

```java
putFirst(E e) / putLast(E e)        // Blocking insert at ends
takeFirst() / takeLast()            // Blocking remove from ends
offerFirst(E e, long t, TimeUnit u) // Timed offer at first end
offerLast(E e, long t, TimeUnit u)  // Timed offer at last end
pollFirst(long t, TimeUnit u)       // Timed poll from first end
pollLast(long t, TimeUnit u)        // Timed poll from last end
```

> **Rule of thumb:** Prefer `offerFirst()`/`offerLast()` over `addFirst()`/`addLast()`, `pollFirst()`/`pollLast()` over `removeFirst()`/`removeLast()`, `peekFirst()`/`peekLast()` over `getFirst()`/`getLast()` — they handle failure gracefully without exceptions.

---

## 4. Traversal Methods

```java
// 1. Enhanced For Loop
for (Integer value : deque) {
    System.out.println(value);
}

// 2. Iterator (forward)
Iterator<Integer> it = deque.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

// 3. Descending Iterator (reverse)
Iterator<Integer> dit = deque.descendingIterator();
while (dit.hasNext()) {
    System.out.println(dit.next());
}

// 4. Spliterator
deque.spliterator().forEachRemaining(System.out::println);

// 5. Stream
deque.stream().forEach(System.out::println);

// 6. Reverse view (Java 21+)
deque.reversed().forEach(System.out::println);
```

> ⚠️ **Note:** Traversing a Deque does not remove elements. For destructive traversal, use `pollFirst()` in a loop.

---

## 5. Internal Working

### ArrayDeque — Circular Array

```
[_, 10, 20, 30, 40, _, _]
      ↑head       ↑tail
```

- Resizable circular array
- No capacity restrictions (grows as needed)
- O(1) for all operations at both ends
- More cache-friendly than LinkedList
- No null elements allowed
- Preferred over legacy `Stack` class

### LinkedList — Doubly Linked List

```
null ← 10 ⇄ 20 ⇄ 30 ⇄ 40 → null
```

- Each node stores prev + data + next
- O(1) insertion/removal at both ends
- Allows null elements
- Implements both `List` and `Deque`
- Higher memory overhead than ArrayDeque

### LinkedBlockingDeque — Doubly Linked List + Locks

```
null ← 10 ⇄ 20 ⇄ 30 ⇄ 40 → null
       ↑ (lock)     ↑ (lock)
```

- Thread-safe doubly linked list
- Supports blocking operations
- Two locks for independent head/tail access
- Used in concurrent producer–consumer scenarios

---

## 6. Real-World Use Cases

| Scenario | Choice | Why |
|----------|--------|-----|
| Browser back/forward navigation | **ArrayDeque** | Add/remove from both ends |
| Undo/Redo operations in editors | **ArrayDeque** | Push/pop from both ends |
| Palindrome checking | **ArrayDeque** | Compare from both ends simultaneously |
| Sliding Window algorithms | **ArrayDeque** | Remove from both ends efficiently |
| BFS (Breadth-First Search) | **ArrayDeque** | Queue operations |
| DFS (Depth-First Search) | **ArrayDeque** | Stack operations |
| Producer–Consumer (double-ended) | **LinkedBlockingDeque** | Thread-safe, blocking ops |
| Task scheduling (priority at front) | **LinkedBlockingDeque** | Insert high-priority at front |
| Work-stealing algorithm | **LinkedBlockingDeque** | Concurrent add/remove from both ends |

---

## 7. Common Mistakes

| Mistake | Problem | Solution |
|---------|---------|----------|
| Using `LinkedList` when only Queue/Stack ops needed | Higher memory, slower cache performance | Use `ArrayDeque` |
| Using legacy `Stack` class | Synchronized, slower, legacy API | Use `Deque<Integer> stack = new ArrayDeque<>()` |
| Using `removeFirst()` on empty Deque | `NoSuchElementException` | Use `pollFirst()` — returns `null` safely |
| Using `getFirst()` on empty Deque | `NoSuchElementException` | Use `peekFirst()` — returns `null` safely |
| Using `ArrayDeque` in multithreaded code | Race conditions, data corruption | Use `LinkedBlockingDeque` |
| Adding `null` to `ArrayDeque` | `NullPointerException` | ArrayDeque rejects null |
| Confusing Queue methods with Deque methods | Wrong behavior | Use explicit `*First()` / `*Last()` methods |

---

## 8. Best Practices

- ✅ Use **ArrayDeque** as default for Queue, Stack, and Deque operations (faster than `LinkedList` and legacy `Stack`)
- ✅ Prefer `offerFirst()`/`offerLast()` over `addFirst()`/`addLast()`
- ✅ Prefer `pollFirst()`/`pollLast()` over `removeFirst()`/`removeLast()`
- ✅ Prefer `peekFirst()`/`peekLast()` over `getFirst()`/`getLast()`
- ✅ Use **LinkedBlockingDeque** for all multithreaded double-ended scenarios
- ✅ Avoid storing `null` values in Deque implementations
- ✅ For stack behavior: `Deque<Integer> stack = new ArrayDeque<>()` (modern, fast)
- ✅ For queue behavior: `Deque<Integer> queue = new ArrayDeque<>()`
- ✅ Choose implementation based on **concurrency needs** first, then **ordering requirements**

---

## 9. Quick Reference

| Operation | ArrayDeque | LinkedList | LinkedBlockingDeque |
|:---------:|:----------:|:----------:|:-------------------:|
| `offerFirst()` | **O(1)** | **O(1)** | **O(1)** |
| `offerLast()` | **O(1)** | **O(1)** | **O(1)** |
| `pollFirst()` | **O(1)** | **O(1)** | **O(1)** |
| `pollLast()` | **O(1)** | **O(1)** | **O(1)** |
| `peekFirst()` | **O(1)** | **O(1)** | **O(1)** |
| `peekLast()` | **O(1)** | **O(1)** | **O(1)** |
| `push()` | **O(1)** | **O(1)** | **O(1)** |
| `pop()` | **O(1)** | **O(1)** | **O(1)** |
| Null support | ❌ | ✅ | ❌ |
| Thread-safe | ❌ | ❌ | ✅ |
| Blocking | ❌ | ❌ | ✅ |
| List features | ❌ | ✅ | ❌ |
| Memory | Low | Medium | High |

---

## 10. Interview Q&A

**Q: What is Deque and how is it different from Queue?**  
A: `Deque` (Double Ended Queue) extends `Queue` and allows insertion, deletion, and retrieval from **both ends**. A normal `Queue` only supports operations at one end (FIFO).

**Q: Why is `ArrayDeque` preferred over `LinkedList` for Deque operations?**  
A: `ArrayDeque` is faster, uses less memory, and has better cache locality. `LinkedList` has node overhead and pointer chasing.

**Q: Why is `ArrayDeque` preferred over the legacy `Stack` class?**  
A: `ArrayDeque` is faster, has lower memory overhead, and `Stack` is a legacy synchronized class with performance penalties.

**Q: Can Deque work as both Queue and Stack?**  
A: **Yes.** As Queue: `offerLast()` + `pollFirst()`. As Stack: `push()` + `pop()`.

**Q: Difference between `addFirst()` and `offerFirst()`?**  
A: `addFirst()` throws `IllegalStateException` on failure; `offerFirst()` returns `false` gracefully. Prefer `offerFirst()`.

**Q: Difference between `removeFirst()` and `pollFirst()`?**  
A: `removeFirst()` throws `NoSuchElementException` if empty; `pollFirst()` returns `null`. Prefer `pollFirst()`.

**Q: Difference between `getFirst()` and `peekFirst()`?**  
A: `getFirst()` throws `NoSuchElementException` if empty; `peekFirst()` returns `null`. Prefer `peekFirst()`.

**Q: Which Deque implementation is thread-safe?**  
A: `LinkedBlockingDeque` (and `ConcurrentLinkedDeque`).

**Q: Does `ArrayDeque` allow `null` elements?**  
A: **No.** Adding `null` results in a `NullPointerException`.

**Q: Which implementation should be used for Sliding Window problems?**  
A: `ArrayDeque` — efficient add/remove from both ends.

**Q: Which implementation also implements `List`?**  
A: `LinkedList` — it implements both `List` and `Deque`.

**Q: Which Deque supports blocking operations?**  
A: `LinkedBlockingDeque` — supports `putFirst()`, `takeFirst()`, timed `offerFirst()`, etc.

---

## One-Line Summary

> **ArrayDeque** → Fast general-purpose Queue + Stack (default choice)  
> **LinkedList** → Deque + List functionality (allows null)  
> **LinkedBlockingDeque** → Thread-safe double-ended Queue with blocking ops  
> **ConcurrentLinkedDeque** → Lock-free thread-safe Deque

> **Key Principle:** Choose based on **ordering needs** (FIFO vs LIFO), **concurrency requirements**, and **memory constraints**.
