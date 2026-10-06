# Java Queue Interface + PriorityQueue — Complete Guide

> **Scope:** This document combines the overall `Queue` concepts with an in-depth study of `PriorityQueue`.  
> Generic traversal concepts such as `Iterable`, `Iterator`, `Spliterator`, and Stream traversal are covered in the Collection/Iterable documentation; they are not repeated here unless a Queue-specific behavior is important.

# What is Queue?

`Queue<E>` is a child interface of `Collection<E>` designed for **processing elements sequentially**.

Most Queue implementations follow **FIFO (First In, First Out)**:

```text
Insert → Rear / Tail
Remove → Front / Head
```

Some implementations, such as `PriorityQueue`, do not follow FIFO. They process elements according to **priority** instead.

Unlike `List`, Queue does not provide index-based access.

```java
public interface Queue<E> extends Collection<E>
```

## Queue Hierarchy

```text
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

# Why Do We Need Queue?

Lists support:

- Index-based access
- Insertion at arbitrary positions
- Random access

For sequential processing, these features are often unnecessary.

```java
list.add(0, value);   // Random insertion
list.get(5);          // Random access
```

What sequential processing usually needs is simpler:

```text
FIFO:
Insert at one end → Remove from the other end

LIFO:
Insert and remove from the same end
```

A Queue provides purpose-built operations for this style of processing.

## FIFO Principle

Most Queue implementations follow **First In, First Out**:

```text
Insert:  10 → 20 → 30 → 40

Remove:  10 → 20 → 30 → 40
```

This naturally models:

- Waiting lines
- Printer queues
- Request processing
- Ticket booking systems

> **Important:** Queue does not always mean FIFO. `PriorityQueue` processes elements according to priority.

# Queue Implementations

| Feature | **PriorityQueue** | **ArrayDeque** | **LinkedList** | **BlockingQueue** | **LinkedBlockingDeque** |
|---------|-------------------|----------------|----------------|-------------------|-------------------------|
| Ordering | Priority Order | FIFO / LIFO | FIFO / LIFO | FIFO | FIFO / LIFO |
| Null Allowed | ❌ | ❌ | ✅ | ❌ | ❌ |
| Thread-Safe | ❌ | ❌ | ❌ | ✅ | ✅ |
| Blocking Operations | ❌ | ❌ | ❌ | ✅ | ✅ |
| Stack Operations | ❌ | ✅ | ✅ | ❌ | ✅ |
| Primary Use | Scheduling | General Queue | Queue + List | Producer–Consumer | Concurrent Deque |

## Main Selection Guide

```text
Need priority-based processing?
        │
        Yes ───► PriorityQueue
        │
       No
        ▼
Need general FIFO / Queue + Stack operations?
        │
        Yes ───► ArrayDeque
        │
       No
        ▼
Need Queue + List functionality?
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
Default ───► ArrayDeque
```

The key difference between Queue implementations is their combination of:

- Ordering guarantees
- Internal structure
- Concurrency support
- Blocking behavior
- Operation performance

# Core Queue Methods

Queue inherits methods from `Collection`.

Common inherited operations include:

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

## Queue Interface Methods

| Method | Throws on Failure | Returns on Failure | Description |
|--------|-------------------|--------------------|-------------|
| `add(E e)` | `IllegalStateException` | — | Insert at rear |
| `offer(E e)` | — | `false` | Insert at rear |
| `remove()` | `NoSuchElementException` | — | Remove and return head |
| `poll()` | — | `null` | Remove and return head |
| `element()` | `NoSuchElementException` | — | Examine head |
| `peek()` | — | `null` | Examine head |

## Important Pairing

```text
Insertion:
add()   → exception on failure
offer() → false on failure

Removal:
remove() → exception if empty
poll()   → null if empty

Examination:
element() → exception if empty
peek()    → null if empty
```

> **Rule of thumb:** Prefer `offer()` / `poll()` / `peek()` when graceful failure handling is desired.

# PriorityQueue

`PriorityQueue` is an implementation of the `Queue` interface that processes elements according to their **priority** instead of their insertion order.

Internally, it stores elements using a **Binary Heap (Min Heap by default)**.

It provides:

- Priority-Based Ordering
- Fast Insertion
- Fast Removal of Highest Priority Element
- Natural Ordering by default
- Custom Ordering using `Comparator`
- Duplicate Elements Allowed
- Null Elements Not Allowed

Unlike a normal FIFO Queue:

```text
PriorityQueue
→ Process according to priority
→ Not according to insertion order
```

## Class Declaration

```java
public class PriorityQueue<E>
        extends AbstractQueue<E>
        implements Serializable
```

`AbstractQueue`:

```java
public abstract class AbstractQueue<E>
        extends AbstractCollection<E>
        implements Queue<E>
```

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
│ Methods inherited from Collection
├──────────────────────────────────────────────
│
├── add(E e)
├── addAll(Collection<? extends E> c)
├── remove(Object o)
├── removeAll(Collection<?> c)
├── retainAll(Collection<?> c)
├── removeIf(Predicate<? super E> filter)
├── contains(Object o)
├── containsAll(Collection<?> c)
├── size()
├── isEmpty()
├── clear()
├── toArray()
├── toArray(T[] a)
├── stream()
├── parallelStream()
├── equals(Object o)
└── hashCode()
│
├──────────────────────────────────────────────
│ Methods inherited from Queue
├──────────────────────────────────────────────
│
├── add(E e)
├── offer(E e)
├── remove()
├── poll()
├── element()
└── peek()
│
├──────────────────────────────────────────────
│ PriorityQueue Specific Public Methods
├──────────────────────────────────────────────
│
└── comparator()
│
└──────────────────────────────────────────────
  Optimized Overrides
  ├── offer()
  ├── poll()
  ├── remove(Object o)
  ├── iterator()
  └── spliterator()
```

## Understanding the Hierarchy

The methods available in a `PriorityQueue` object come from different levels of the Java Collection Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `PriorityQueue` class | `PriorityQueue()`, `PriorityQueue(int)`, `PriorityQueue(Comparator)`, `PriorityQueue(int, Comparator)`, `PriorityQueue(Collection)`, `PriorityQueue(PriorityQueue)`, `PriorityQueue(SortedSet)` | Not inherited; unbounded |
| **Collection** | `Queue extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **Queue** | `PriorityQueue implements Queue` | `offer()`, `poll()`, `peek()`, `element()` | Standard queue operations |
| **PriorityQueue Specific** | `PriorityQueue` class | `comparator()` | Returns `null` for natural ordering |
| **Optimized Overrides** | `PriorityQueue` reimplementation | `offer()`, `poll()`, `remove(Object)`, `iterator()`, `spliterator()` | Optimized for Binary Heap |

> **Important:** The methods available in your code depend on the **reference type** (`Collection`, `Queue`, or `PriorityQueue`), even when the object is a `PriorityQueue`.

```java
Queue<Integer> queue = new PriorityQueue<>();

queue.comparator();   // ❌ Compile error
```

`comparator()` belongs to the `PriorityQueue` class and is not declared by `Queue`.

# PriorityQueue Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `PriorityQueue()` | `new PriorityQueue<>()` | Empty queue; natural ordering; default capacity 11 | O(1) | O(1) |
| `PriorityQueue(int initialCapacity)` | `new PriorityQueue<>(50)` | Pre-allocate capacity; natural ordering | O(1) | O(n) |
| `PriorityQueue(Comparator<? super E> comparator)` | `new PriorityQueue<>(Collections.reverseOrder())` | Custom ordering, such as Max Heap | O(1) | O(1) |
| `PriorityQueue(int initialCapacity, Comparator<? super E> comparator)` | `new PriorityQueue<>(50, Collections.reverseOrder())` | Pre-allocate capacity + custom ordering | O(1) | O(n) |
| `PriorityQueue(Collection<? extends E> c)` | `new PriorityQueue<>(collection)` | Copy elements from any collection; heapify | O(n) | O(n) |
| `PriorityQueue(PriorityQueue<? extends E> c)` | `new PriorityQueue<>(anotherQueue)` | Copy from another PriorityQueue | O(n) | O(n) |
| `PriorityQueue(SortedSet<? extends E> c)` | `new PriorityQueue<>(sortedSet)` | Copy from SortedSet | O(n) | O(n) |

# Priority and Ordering

## Natural Ordering vs Custom Ordering

```java
// Natural Ordering (Min Heap)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
// Insert: 30, 10, 20 → Head: 10

// Custom Ordering (Max Heap)
PriorityQueue<Integer> maxHeap =
        new PriorityQueue<>(Collections.reverseOrder());
// Insert: 30, 10, 20 → Head: 30
```

`comparator()` returns the `Comparator` used by the queue. It returns `null` when natural ordering is used.

```java
PriorityQueue<Integer> queue = new PriorityQueue<>();

System.out.println(queue.comparator()); // null
```

## Example

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(30);
pq.add(10);
pq.add(20);

System.out.println(pq.poll()); // 10
System.out.println(pq.poll()); // 20
System.out.println(pq.poll()); // 30
```

`PriorityQueue` processes elements according to priority, not insertion sequence.

> **Important:** Only the **head** is guaranteed to have the highest priority. Iterating through the complete Queue does **not** guarantee sorted order.

# PriorityQueue Internal Structure

`PriorityQueue` internally uses a **Binary Min Heap** stored in an array.

The root (index `0`) contains the element with the highest priority, which is the smallest element by default.

```text
         10
        /  \
      20    30
     /  \
   40    50

Array: [10, 20, 30, 40, 50]
```

A Binary Heap is a complete binary tree stored efficiently in an array.

For the default Min Heap:

```text
Parent ≤ Children
```

## Heap Operations

| Operation | Description | Time |
|-----------|-------------|:----:|
| `offer()` / `add()` | Insert at end, then `siftUp` until heap property is restored | O(log n) |
| `poll()` / `remove()` | Remove root, move last element to root, then `siftDown` | O(log n) |
| `peek()` | Return root element without removing it | O(1) |
| `remove(Object)` | Find element, remove it, then restore heap | O(n) |
| `grow()` | Expand internal array when full | O(n) amortized |

## `offer()` / `add()` — `siftUp`

```text
Initial Heap

        10
       /  \
     20    30
    /  \    /
  40   50  15

Insert 15 at the end

        10
       /  \
     20    30
    /  \    /
  40   50  15

       siftUp ↑

        10
       /  \
     20    15
    /  \    /
  40   50  30

Time → O(log n)
```

The new element moves upward until the heap property is restored.

## `poll()` — `siftDown`

```text
Remove Root (10)

        10
       /  \
     20    15
    /  \
  40    50

Move last element to root

        50
       /  \
     20    15
    /
  40

siftDown ↓

        15
       /  \
     20    50
    /
  40

Time → O(log n)
```

The root is removed, the last element replaces it, and the heap is restored by moving that element downward.

## `peek()`

```text
        15
       /  \
     20    30

Returns → 15

Time → O(1)
```

`peek()` directly accesses the root element.

## `remove(Object)`

```text
Search → 15 → 20 → 30 → 40 ✔

Remove → Heap Adjust

Time → O(n)
```

The element may need to be searched in the heap array before the heap property can be restored.

## `grow()`

```text
Array Full

[10,20,30,40]
      │
      ▼
[10,20,30,40,_,_,_,_]

Copy Elements

Time → O(n)
```

The internal array grows when more capacity is required.

> **Important:** `iterator()` traverses the internal heap array, so iteration order is **not sorted**. Only operations such as `peek()` and `poll()` guarantee priority order.

# PriorityQueue Optimized Overrides

`PriorityQueue` reimplements inherited operations to work efficiently with its Binary Heap:

```java
offer(E) / add(E)          // Insert with siftUp; O(log n)
poll() / remove()          // Remove root with siftDown; O(log n)
remove(Object o)           // Find and remove with heap restoration; O(n)
iterator()                 // Traverses internal array; not sorted
spliterator()              // Heap-aware split for parallel streams
```

# PriorityQueue vs PriorityBlockingQueue

| Feature | PriorityQueue | PriorityBlockingQueue |
|---------|---------------|-----------------------|
| Thread Safe | ❌ No | ✅ Yes |
| Blocking Operations | ❌ No | ✅ Yes |
| Timed Operations | ❌ No | ✅ Yes |
| Dynamic Growth | ✅ Yes | ✅ Yes |
| Internal Structure | Binary Heap | Binary Heap |
| Unbounded | ✅ Yes | ✅ Yes |
| Null Elements | ❌ Not allowed | ❌ Not allowed |
| Use Case | Single-threaded priority tasks | Concurrent priority scheduling |

# Deque

`Deque` supports insertion, removal, and examination from **both ends**.

```java
public interface Deque<E> extends Queue<E>
```

| Operation | Head / First | Tail / Last |
|-----------|---------------|-------------|
| **Insert** | `addFirst()` / `offerFirst()` | `addLast()` / `offerLast()` |
| **Remove** | `removeFirst()` / `pollFirst()` | `removeLast()` / `pollLast()` |
| **Examine** | `getFirst()` / `peekFirst()` | `getLast()` / `peekLast()` |

## Stack Operations

```text
push(e) == addFirst(e)
pop()   == removeFirst()
```

This allows:

```text
Deque → Queue behavior (FIFO)
Deque → Stack behavior (LIFO)
```

## Other Deque Operations

```java
removeFirstOccurrence(o)
removeLastOccurrence(o)

descendingIterator()

reversed()        // Java 21+
```

## BlockingDeque

`BlockingDeque` adds blocking operations at both ends:

```java
putFirst(e)
putLast(e)

takeFirst()
takeLast()

offerFirst(e, timeout, unit)
offerLast(e, timeout, unit)

pollFirst(timeout, unit)
pollLast(timeout, unit)
```

# BlockingQueue Family — Thread-Safe Queues

`BlockingQueue` implementations are designed for **concurrent producer-consumer scenarios**.

| Implementation | Internal Structure | Key Feature |
|----------------|-------------------|-------------|
| **ArrayBlockingQueue** | Circular Array + ReentrantLock | Fixed capacity, bounded |
| **LinkedBlockingQueue** | Linked Nodes + Two Locks | Optional bounded, dynamic |
| **PriorityBlockingQueue** | Binary Heap + Lock | Thread-safe priority queue, unbounded |
| **DelayQueue** | Priority Queue + `Delayed` | Elements available only after delay |
| **SynchronousQueue** | No internal storage | Direct producer → consumer handoff |
| **LinkedTransferQueue** | Lock-free linked nodes | `transfer()` blocks until consumed |
| **LinkedBlockingDeque** | Doubly Linked List + locks | Thread-safe operations at both ends |

## How BlockingQueue Works

```text
Producer
    │
   put()
    ↓
[ BlockingQueue ]
    │
   take()
    ↓
Consumer
```

```text
If Queue is full:
Producer waits

If Queue is empty:
Consumer waits
```

No explicit `wait()` / `notify()` is required for these blocking operations; synchronization is provided by the Queue implementation.

## Example

```java
BlockingQueue<Integer> queue =
        new LinkedBlockingQueue<>();

// Producer
queue.put(100);     // Blocks if the Queue is full

// Consumer
Integer value = queue.take(); // Blocks if the Queue is empty
```

# BlockingQueue-Specific Methods

| Method | Purpose |
|--------|---------|
| `put(E)` | Insert; waits if the queue is full |
| `take()` | Remove; waits if the queue is empty |
| `offer(E, long, TimeUnit)` | Insert with a maximum waiting time |
| `poll(long, TimeUnit)` | Remove with a maximum waiting time |
| `remainingCapacity()` | Reports remaining capacity where applicable |
| `drainTo(Collection)` | Transfers available elements to another collection |

Example:

```java
queue.put(task);

Integer value = queue.take();

queue.offer(task, 5, TimeUnit.SECONDS);

Integer result =
        queue.poll(5, TimeUnit.SECONDS);
```

# TransferQueue — LinkedTransferQueue

`TransferQueue` provides direct producer-to-consumer transfer operations.

```java
transfer(E e)
tryTransfer(E e)
tryTransfer(E e, long timeout, TimeUnit unit)

hasWaitingConsumer()
getWaitingConsumerCount()
```

## Important Behavior

```text
Producer
   │
transfer()
   │
   ▼
Consumer receives element
```

`transfer()` blocks until a consumer receives the element.

`tryTransfer()` can return immediately with a boolean result.

# Queue Internal Structures

| Implementation | Internal Structure |
|----------------|--------------------|
| `PriorityQueue` | Binary Heap |
| `ArrayDeque` | Resizable Circular Array |
| `LinkedList` | Doubly Linked List |
| `ArrayBlockingQueue` | Circular Array + Lock |
| `LinkedBlockingQueue` | Linked Nodes + Separate Put/Take Locks |
| `PriorityBlockingQueue` | Binary Heap + Lock |
| `DelayQueue` | Priority Queue + Delayed Elements |
| `SynchronousQueue` | No Internal Storage |
| `LinkedTransferQueue` | Lock-Free Linked Nodes |
| `LinkedBlockingDeque` | Doubly Linked List + Locks |

# Queue Traversal

Generic traversal techniques are covered in the Collection/Iterable documentation.

One Queue-specific rule is important:

> **Traversing a Queue does not remove its elements.**

For destructive processing, explicitly remove from the Queue:

```java
while (!queue.isEmpty()) {
    System.out.println(queue.poll());
}
```

For `PriorityQueue`, remember that traversal does **not** produce the elements in fully sorted priority order.

# Queue Comparison

| Feature | **PriorityQueue** | **ArrayDeque** | **LinkedList** | **BlockingQueue*** | **BlockingDeque** |
|---------|:---------------:|:--------------:|:--------------:|:------------------:|:-----------------:|
| Internal Structure | Binary Heap | Circular Array | Doubly Linked List | Varies | Doubly Linked List |
| Ordering | Priority | FIFO / LIFO | FIFO / LIFO | FIFO / Priority | FIFO / LIFO |
| `offer()` | O(log n) | O(1) | O(1) | O(1) | O(1) |
| `poll()` | O(log n) | O(1) | O(1) | O(1) | O(1) |
| `peek()` | O(1) | O(1) | O(1) | O(1) | O(1) |
| Stack Operations | ❌ | ✅ | ✅ | ❌ | ✅ |
| Double-Ended | ❌ | ✅ | ✅ | ❌ | ✅ |
| Thread-Safe | ❌ | ❌ | ❌ | ✅ | ✅ |
| Blocking | ❌ | ❌ | ❌ | ✅ | ✅ |
| Null Allowed | ❌ | ❌ | ✅ | ❌ | ❌ |
| Memory | Low | Low | Medium | Medium-High | High |

> *Actual complexity depends on the concrete `BlockingQueue` implementation.

# Choosing the Right Queue Implementation

For concurrent usage:

```text
Need thread safety / concurrency?
        │
       Yes
        │
        ▼
Need double-ended blocking operations?
        │
        Yes ───► LinkedBlockingDeque
        │
       No
        ▼
Need priority processing?
        │
        Yes ───► PriorityBlockingQueue
        │
       No
        ▼
Need delayed availability?
        │
        Yes ───► DelayQueue
        │
       No
        ▼
Need direct producer → consumer handoff?
        │
        Yes ───► SynchronousQueue
        │
       No
        ▼
Need general producer-consumer?
        │
        Yes ───► LinkedBlockingQueue
        │
       No
        ▼
Need fixed capacity?
        │
        Yes ───► ArrayBlockingQueue
```

For non-concurrent usage:

```text
Need priority ordering?
        │
        Yes ───► PriorityQueue
        │
       No
        ▼
Need Queue + Stack operations?
        │
        Yes ───► ArrayDeque
        │
       No
        ▼
Need Queue + List functionality?
        │
        Yes ───► LinkedList
        │
       No
        ▼
Default ───► ArrayDeque
```

# Real-World Use Cases

| Scenario | Choice | Why |
|----------|--------|-----|
| Printer queue / ticket booking | **ArrayDeque** | Simple FIFO processing |
| CPU scheduling / priority tasks | **PriorityQueue** | Priority-based processing |
| BFS (Breadth-First Search) | **ArrayDeque** | Efficient Queue operations |
| Stack / undo-redo behavior | **ArrayDeque** | Fast LIFO operations |
| Both List and Queue functionality | **LinkedList** | Implements both APIs |
| Producer–Consumer / thread pools | **LinkedBlockingQueue** | Thread-safe blocking behavior |
| Fixed-capacity resource pool | **ArrayBlockingQueue** | Bounded capacity |
| Delayed task execution / cache expiration | **DelayQueue** | Delayed availability |
| Direct thread-to-thread handoff | **SynchronousQueue** | No internal buffering |
| High-throughput transfer | **LinkedTransferQueue** | Direct transfer support |
| Concurrent work from both ends | **LinkedBlockingDeque** | Thread-safe double-ended operations |
| Dijkstra's algorithm | **PriorityQueue** | Efficient priority-based processing |
| Task scheduling / event processing | **PriorityQueue** | Process highest-priority task first |

# Common Misconceptions and Mistakes

| Misconception / Mistake | Reality / Solution |
|-------------------------|--------------------|
| Queue always means FIFO | `PriorityQueue` processes according to priority. |
| `PriorityQueue` keeps every element fully sorted | Only its head is guaranteed to have priority; iteration order is not a complete sorted sequence. |
| `Deque` is just another Queue | `Deque` supports both FIFO Queue and LIFO Stack behavior. |
| `LinkedList` is automatically the best Queue | `ArrayDeque` is generally the better choice when only Queue/Deque operations are needed. |
| Using `ArrayDeque` in shared multithreaded code is safe | It is not thread-safe; use an appropriate concurrent Queue. |
| `BlockingQueue` is just a larger Queue | It is designed for concurrent producer-consumer coordination with blocking operations. |
| `remove()` is always better than `poll()` | `remove()` throws if empty; `poll()` returns `null`. |
| `element()` is always better than `peek()` | `element()` throws if empty; `peek()` returns `null`. |
| `PriorityQueue` can store `null` | `PriorityQueue` rejects `null`. |
| `ArrayDeque` can store `null` | `ArrayDeque` rejects `null`. |
| Blocking queues need explicit `wait()` / `notify()` for their queue operations | Their blocking behavior is built into the implementation. |
| Using a BlockingQueue in a single-threaded scenario is always necessary | It adds synchronization/blocking behavior that may be unnecessary for simple single-threaded processing. |

# Best Practices

- Use **ArrayDeque** as the default for general single-threaded Queue and Stack operations.
- Use **PriorityQueue** only when priority ordering is actually required.
- Prefer `offer()` over `add()`, `poll()` over `remove()`, and `peek()` over `element()` when graceful failure handling is desired.
- Use **BlockingQueue** implementations for producer-consumer concurrency.
- Select the BlockingQueue implementation according to capacity, ordering, delay, or transfer requirements.
- Use **ArrayBlockingQueue** when fixed capacity is important.
- Use **LinkedBlockingQueue** for dynamic producer-consumer workloads.
- Use **SynchronousQueue** for direct handoff with no internal storage.
- Use **LinkedTransferQueue** when direct transfer semantics are needed.
- Use **LinkedBlockingDeque** when thread-safe operations from both ends are required.
- For LIFO behavior:

```java
Deque<Integer> stack = new ArrayDeque<>();
```

# Quick Reference

| Requirement | Best-Fit Type |
|-------------|---------------|
| Fast general Queue | **ArrayDeque** |
| Fast Stack / LIFO | **ArrayDeque** |
| Priority scheduling | **PriorityQueue** |
| Queue + List functionality | **LinkedList** |
| Producer–Consumer | **LinkedBlockingQueue** |
| Fixed-capacity concurrent Queue | **ArrayBlockingQueue** |
| Thread-safe priority Queue | **PriorityBlockingQueue** |
| Delayed task execution | **DelayQueue** |
| Direct thread handoff | **SynchronousQueue** |
| High-performance transfer | **LinkedTransferQueue** |
| Thread-safe double-ended Queue | **LinkedBlockingDeque** |

# One-Line Summary

> **ArrayDeque** → Fast general-purpose FIFO/LIFO  
> **PriorityQueue** → Priority-based processing  
> **LinkedList** → Queue + List functionality  
> **LinkedBlockingQueue** → Thread-safe producer-consumer Queue  
> **ArrayBlockingQueue** → Fixed-capacity concurrent Queue  
> **PriorityBlockingQueue** → Thread-safe priority Queue  
> **DelayQueue** → Delayed task availability  
> **SynchronousQueue** → Direct thread handoff with no storage  
> **LinkedTransferQueue** → Direct/high-performance transfer  
> **LinkedBlockingDeque** → Thread-safe double-ended Queue

> **Key Principle:** Choose based on **ordering** (FIFO vs priority), **Queue/Deque behavior**, **concurrency requirements**, and **capacity/blocking needs**.
