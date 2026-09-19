# Java Queue Interface — Complete Guide

## 1. What is Queue?

`Queue<E>` is a child interface of `Collection<E>` designed for **processing elements sequentially**. Most implementations follow **FIFO (First In, First Out)** — elements are inserted at the **rear (tail)** and removed from the **front (head)**.

Some implementations like `PriorityQueue` do not follow FIFO; they process elements by **priority** instead.

Unlike `List`, Queue provides **no index-based access**.

```java
public interface Queue<E> extends Collection<E>
```

**Hierarchy:**
```
Iterable → Collection → Queue
                           ├── PriorityQueue
                           ├── Deque
                           │   ├── ArrayDeque
                           │   └── LinkedList
                           ├── BlockingQueue
                           │   ├── ArrayBlockingQueue
                           │   ├── LinkedBlockingQueue
                           │   ├── PriorityBlockingQueue
                           │   ├── DelayQueue
                           │   ├── SynchronousQueue
                           │   └── TransferQueue
                           │       └── LinkedTransferQueue
                           └── BlockingDeque
                               └── LinkedBlockingDeque
```

---

## 2. Queue Implementations

| Feature | **PriorityQueue** | **ArrayDeque** | **LinkedList** | **BlockingQueue** | **LinkedBlockingDeque** |
|---------|-------------------|----------------|----------------|-------------------|-------------------------|
| Ordering | Priority Order | FIFO / LIFO | FIFO / LIFO | FIFO | FIFO / LIFO |
| Null Allowed | ❌ | ❌ | ✅ | ❌ | ❌ |
| Thread-Safe | ❌ | ❌ | ❌ | ✅ | ✅ |
| Blocking Operations | ❌ | ❌ | ❌ | ✅ | ✅ |
| Stack Operations | ❌ | ✅ | ✅ | ❌ | ✅ |
| Primary Use | Scheduling | General Queue | Queue + List | Producer–Consumer | Concurrent Deque |

### When to Choose What

```
Need priority-based processing?
        │
       Yes ───► PriorityQueue
        │
        No
        ▼
Need general FIFO queue?
        │
       Yes ───► ArrayDeque
        │
        No
        ▼
Need Queue + List features?
        │
       Yes ───► LinkedList
        │
        No
        ▼
Need thread safety / blocking?
        │
       Yes ───► BlockingQueue / BlockingDeque
        │
        No
        ▼
   Default: ArrayDeque
```

---

## 3. Core Queue Methods

### Inherited from Collection
`add()`, `addAll()`, `remove()`, `removeAll()`, `removeIf()`, `retainAll()`, `contains()`, `containsAll()`, `size()`, `isEmpty()`, `clear()`, `toArray()`, `stream()`, `equals()`, `hashCode()`

### Queue Interface Methods (6 new methods)

| Method | Throws on Failure | Returns on Failure | Description |
|--------|-------------------|--------------------|-------------|
| `add(E e)` | `IllegalStateException` | — | Insert at rear (Collection legacy) |
| `offer(E e)` | — | `false` | Insert at rear (preferred) |
| `remove()` | `NoSuchElementException` | — | Remove and return head |
| `poll()` | — | `null` | Remove and return head (preferred) |
| `element()` | `NoSuchElementException` | — | Peek at head without removing |
| `peek()` | — | `null` | Peek at head without removing (preferred) |

> **Rule of thumb:** Prefer `offer()` / `poll()` / `peek()` over `add()` / `remove()` / `element()` — they handle failure gracefully without exceptions.

### Deque Methods (Double-Ended Queue)

| Operation | Head (First) | Tail (Last) |
|-----------|:----------:|:-----------:|
| **Insert** | `addFirst(e)` / `offerFirst(e)` | `addLast(e)` / `offerLast(e)` |
| **Remove** | `removeFirst()` / `pollFirst()` | `removeLast()` / `pollLast()` |
| **Examine** | `getFirst()` / `peekFirst()` | `getLast()` / `peekLast()` |
| **Stack ops** | `push(e)` (=`addFirst`) | `pop()` (=`removeFirst`) |
| **Remove occurrence** | `removeFirstOccurrence(o)` | `removeLastOccurrence(o)` |
| **Reverse iteration** | `descendingIterator()` | — |
| **Reverse view** | `reversed()` *(Java 21+)* | — |

### BlockingQueue Methods (Thread-Safe)

```java
put(E e)                    // Blocks until space available
take()                      // Blocks until element available
offer(E e, long t, TimeUnit u)  // Waits up to timeout
poll(long t, TimeUnit u)    // Waits up to timeout
remainingCapacity()         // Available space
drainTo(Collection c)       // Remove all to collection
```

### TransferQueue Methods (LinkedTransferQueue)

```java
transfer(E e)               // Blocks until consumer receives
tryTransfer(E e)            // Immediate, returns boolean
tryTransfer(E e, long t, TimeUnit u)  // Timed
hasWaitingConsumer()        // Any consumer waiting?
getWaitingConsumerCount()   // Number of waiting consumers
```

### BlockingDeque Methods (LinkedBlockingDeque)

```java
putFirst(E e) / putLast(E e)        // Blocking insert at ends
takeFirst() / takeLast()            // Blocking remove from ends
offerFirst(E e, t, u) / offerLast() // Timed offer at ends
pollFirst(t, u) / pollLast(t, u)    // Timed poll from ends
```

---

## 4. Traversal Methods

```java
// 1. Enhanced For Loop
for (Integer value : queue) {
    System.out.println(value);
}

// 2. Iterator
Iterator<Integer> it = queue.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

// 3. Spliterator
queue.spliterator().forEachRemaining(System.out::println);

// 4. Stream
queue.stream().forEach(System.out::println);
```

> ⚠️ **Note:** Traversing a Queue does not remove elements. For destructive traversal, use `poll()` in a loop.

---

## 5. Internal Working

### PriorityQueue — Binary Heap

```
        10
       /       20    30
    / \    /
   40 50  60
```

- Complete binary tree stored in an array
- Parent ≤ children (min-heap by default)
- `add()` / `remove()` = O(log n) (heapify up/down)
- `peek()` = O(1) (root element)
- Does **not** support null elements

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

### LinkedList — Doubly Linked List

```
null ← 10 ⇄ 20 ⇄ 30 ⇄ 40 → null
```

- Each node stores prev + data + next
- O(1) insertion/removal at both ends
- Allows null elements
- Higher memory overhead than ArrayDeque

---

## 6. Real-World Use Cases

| Scenario | Choice | Why |
|----------|--------|-----|
| Printer queue (FIFO) | **ArrayDeque** | Simple ordered processing |
| Ticket booking system | **ArrayDeque** | First-come-first-serve |
| CPU process scheduling (priority) | **PriorityQueue** | Higher priority first |
| BFS (Breadth-First Search) | **ArrayDeque** | Level-by-level traversal |
| Producer–Consumer problem | **LinkedBlockingQueue** | Thread-safe, blocking ops |
| Delayed task execution | **DelayQueue** | Tasks execute after specified delay |
| Thread pool task handoff | **SynchronousQueue** | Direct thread-to-thread transfer |
| High-performance messaging | **LinkedTransferQueue** | Lock-free, direct transfer |
| Work-stealing algorithm | **LinkedBlockingDeque** | Add/remove from both ends concurrently |

---

## 7. Common Mistakes

| Mistake | Problem | Solution |
|---------|---------|----------|
| Using `PriorityQueue` expecting insertion order | Output is priority-sorted, not insertion-ordered | Use `ArrayDeque` for FIFO, `LinkedHashSet` for ordered unique |
| Using `remove()` on empty Queue | `NoSuchElementException` | Use `poll()` — returns `null` safely |
| Using `element()` on empty Queue | `NoSuchElementException` | Use `peek()` — returns `null` safely |
| Using `ArrayDeque` in multithreaded code | Race conditions, data corruption | Use `LinkedBlockingQueue` or `ArrayBlockingQueue` |
| Adding `null` to `PriorityQueue` / `ArrayDeque` | `NullPointerException` | These implementations reject null |
| Using `LinkedList` when `ArrayDeque` suffices | Higher memory, slower cache performance | Prefer `ArrayDeque` for Queue/Deque ops |

---

## 8. Best Practices

- ✅ Use **ArrayDeque** as default for Queue and Stack operations (faster than `LinkedList` and `Stack`)
- ✅ Use **PriorityQueue** only when priority ordering is required
- ✅ Prefer `offer()` over `add()`, `poll()` over `remove()`, `peek()` over `element()`
- ✅ Use **BlockingQueue** implementations for all multithreaded producer-consumer scenarios
- ✅ Use **LinkedTransferQueue** for high-performance concurrent messaging
- ✅ Avoid storing `null` values in Queue implementations
- ✅ Choose implementation based on **concurrency needs** first, then **ordering requirements**
- ✅ For stack behavior: `Deque<Integer> stack = new ArrayDeque<>()` (modern, fast)

---

## 9. Quick Reference

| Operation | ArrayDeque | LinkedList | PriorityQueue | ArrayBlockingQueue | LinkedBlockingQueue |
|-----------|:----------:|:----------:|:-------------:|:------------------:|:-------------------:|
| `offer()` | **O(1)** | **O(1)** | O(log n) | **O(1)** | **O(1)** |
| `poll()` | **O(1)** | **O(1)** | O(log n) | **O(1)** | **O(1)** |
| `peek()` | **O(1)** | **O(1)** | **O(1)** | **O(1)** | **O(1)** |
| `addFirst()` | **O(1)** | **O(1)** | N/A | N/A | N/A |
| `addLast()` | **O(1)** | **O(1)** | N/A | N/A | N/A |
| Null support | ❌ | ✅ | ❌ | ❌ | ❌ |
| Thread-safe | ❌ | ❌ | ❌ | ✅ | ✅ |
| Blocking | ❌ | ❌ | ❌ | ✅ | ✅ |
| Memory | Low | Medium | Low | Low | Medium |

---

## 10. Interview Q&A

**Q: Why is `ArrayDeque` preferred over `LinkedList` for Queue operations?**  
A: `ArrayDeque` is faster, uses less memory, and has better cache locality. `LinkedList` has node overhead and pointer chasing.

**Q: Why doesn't `PriorityQueue` maintain insertion order?**  
A: It uses a Binary Heap which organizes by priority (natural ordering or Comparator), not insertion sequence.

**Q: Difference between `add()` and `offer()`?**  
A: `add()` throws `IllegalStateException` on failure (Collection contract); `offer()` returns `false` gracefully. Prefer `offer()`.

**Q: Difference between `remove()` and `poll()`?**  
A: `remove()` throws `NoSuchElementException` if empty; `poll()` returns `null`. Prefer `poll()`.

**Q: Difference between `element()` and `peek()`?**  
A: `element()` throws `NoSuchElementException` if empty; `peek()` returns `null`. Prefer `peek()`.

**Q: Which Queue stores no elements internally?**  
A: `SynchronousQueue` — every `put()` waits for a `take()` and vice versa.

**Q: Which Queue supports direct producer-to-consumer transfer?**  
A: `LinkedTransferQueue` via `transfer()` — blocks until a consumer receives the element.

**Q: Best Queue for Producer–Consumer problems?**  
A: `LinkedBlockingQueue` (dynamic) or `ArrayBlockingQueue` (fixed capacity).

**Q: When to use `DelayQueue`?**  
A: When elements should only be available after a specified delay (e.g., scheduled tasks, cache expiration).

---

## One-Line Summary

> **ArrayDeque** → Fast general-purpose FIFO/LIFO (default choice)  
> **PriorityQueue** → Priority-based processing (heap-ordered)  
> **LinkedList** → Queue + List functionality (allows null)  
> **ArrayBlockingQueue** → Bounded thread-safe queue  
> **LinkedBlockingQueue** → Unbounded/dynamic thread-safe queue  
> **PriorityBlockingQueue** → Thread-safe priority queue  
> **DelayQueue** → Delayed task scheduling  
> **SynchronousQueue** → Direct thread handoff (no storage)  
> **LinkedTransferQueue** → High-performance lock-free transfer  
> **LinkedBlockingDeque** → Thread-safe double-ended queue

> **Key Principle:** Choose based on **ordering needs** (FIFO vs priority), **concurrency requirements**, and **memory constraints**.
