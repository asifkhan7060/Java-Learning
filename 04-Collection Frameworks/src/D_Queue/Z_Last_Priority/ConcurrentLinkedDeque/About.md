# Java Deque Interface

> **Scope of This Document:**  
> This document covers the **Deque interface**, **ArrayDeque**, and **LinkedBlockingDeque** in detail, including their important methods, implementation structure, internal working, performance, concurrency behavior, and practical usage.
>
> Generic traversal concepts such as enhanced for-loop, `Iterator`, `Spliterator`, and streams are covered in the Collection/Iterable documentation. This document only includes **Deque-specific traversal features** such as `descendingIterator()` and `reversed()`.

## What is Deque?

`Deque<E>` is a child interface of `Queue<E>` designed for **processing elements from both ends**. The name *deque* is short for **double-ended queue** and is usually pronounced **"deck"**.

Unlike a normal `Queue` which usually follows **FIFO (First In, First Out)**, a `Deque` can behave as both:

- **Queue (FIFO)** — elements are inserted at the rear and removed from the front.
- **Stack (LIFO)** — elements are inserted and removed from the same end.

```java
public interface Deque<E> extends Queue<E>
```

### Hierarchy

```text
Iterable → Collection → Queue → Deque
                                      ├── ArrayDeque
                                      ├── LinkedList
                                      └── BlockingDeque
                                              └── LinkedBlockingDeque
```

## Why Do We Need Deque?

A normal Queue mainly processes elements from one end to the other. A Deque is useful when an application needs access to **both ends**.

```text
Queue:
Insert → Rear
Remove → Front

Stack:
Insert → Top
Remove → Top

Deque:
Insert/Remove → Front or Rear
```

This allows the same abstraction to support both FIFO and LIFO behavior.

## Deque Implementations

| Feature | **ArrayDeque** | **LinkedList** | **LinkedBlockingDeque** |
|---------|----------------|----------------|-------------------------|
| Internal Structure | Resizable Circular Array | Doubly Linked List | Doubly Linked List + Locks |
| Ordering | FIFO / LIFO | FIFO / LIFO | FIFO / LIFO |
| Null Allowed | ❌ | ✅ | ❌ |
| Thread-Safe | ❌ | ❌ | ✅ |
| Blocking Operations | ❌ | ❌ | ✅ |
| Queue Operations | ✅ | ✅ | ✅ |
| Stack Operations | ✅ | ✅ | ✅ |
| List Features | ❌ | ✅ | ❌ |
| Memory Usage | Low | Medium | High |

### When to Choose What

```text
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
Default ───► ArrayDeque
```

## Core Deque Methods

### Inherited from Collection

Common operations are inherited from `Collection`, such as:

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

These generic Collection methods are not repeated in detail here.

### Queue Methods and Their Deque Equivalents

| Queue Method | Equivalent Deque Method | Description |
|:-------------:|:-----------------------:|-------------|
| `add(e)` | `addLast(e)` | Insert at rear |
| `offer(e)` | `offerLast(e)` | Insert at rear |
| `remove()` | `removeFirst()` | Remove and return head |
| `poll()` | `pollFirst()` | Remove and return head |
| `element()` | `getFirst()` | Examine head |
| `peek()` | `peekFirst()` | Examine head |

### Double-Ended Operations

| Operation | First / Head | Last / Tail |
|:---------:|:-------------|:------------|
| **Insert** | `addFirst(e)` / `offerFirst(e)` | `addLast(e)` / `offerLast(e)` |
| **Remove** | `removeFirst()` / `pollFirst()` | `removeLast()` / `pollLast()` |
| **Examine** | `getFirst()` / `peekFirst()` | `getLast()` / `peekLast()` |

The exception-based and special-value method pairs follow the same pattern:

```text
Insertion:
addFirst()   → exception on failure
offerFirst() → special value

Removal:
removeFirst() → exception if empty
pollFirst()   → special value

Examination:
getFirst()   → exception if empty
peekFirst()   → special value
```

The same pattern applies to the last end.

### Stack Methods

| Stack Method | Equivalent Deque Method | Description |
|--------------|-------------------------|-------------|
| `push(e)` | `addFirst(e)` | Push onto stack |
| `pop()` | `removeFirst()` | Pop from stack |
| `peek()` | `peekFirst()` | Peek at top |

```java
// Queue (FIFO)
deque.offerLast(10);
deque.offerLast(20);
deque.pollFirst();     // 10

// Stack (LIFO)
deque.push(10);
deque.push(20);
deque.pop();           // 20
```

### Additional Deque Methods

| Method | Purpose |
|--------|---------|
| `removeFirstOccurrence(Object o)` | Remove first matching element |
| `removeLastOccurrence(Object o)` | Remove last matching element |
| `descendingIterator()` | Traverse from rear to front |
| `reversed()` | Reverse-ordered view (Java 21+) |

### BlockingDeque Operations

`BlockingDeque` extends the Deque idea with blocking operations at both ends:

```java
putFirst(E e)
putLast(E e)

takeFirst()
takeLast()

offerFirst(E e, long timeout, TimeUnit unit)
offerLast(E e, long timeout, TimeUnit unit)

pollFirst(long timeout, TimeUnit unit)
pollLast(long timeout, TimeUnit unit)
```

A practical rule:

```text
Prefer offerFirst()/offerLast()
over addFirst()/addLast()

Prefer pollFirst()/pollLast()
over removeFirst()/removeLast()

Prefer peekFirst()/peekLast()
over getFirst()/getLast()
```

These special-value forms allow graceful failure handling instead of relying on exceptions for normal empty/full cases.

## Deque Traversal

Generic traversal techniques are already covered in the Collection/Iterable documentation.

Deque-specific traversal features are:

```java
// Reverse traversal
Iterator<Integer> it = deque.descendingIterator();

while (it.hasNext()) {
    System.out.println(it.next());
}

// Reverse-order view (Java 21+)
deque.reversed().forEach(System.out::println);
```

Traversing a Deque does **not** remove its elements. For destructive processing:

```java
while (!deque.isEmpty()) {
    System.out.println(deque.pollFirst());
}
```

## ArrayDeque

`ArrayDeque` is a commonly used implementation of the `Deque` interface.

It uses a **resizable circular array** and can be used as both:

- Queue (FIFO)
- Stack (LIFO)

```java
public class ArrayDeque<E>
        extends AbstractCollection<E>
        implements Deque<E>,
                   Cloneable,
                   Serializable
```

### ArrayDeque Hierarchy

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

### Interface Relationship

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

### ArrayDeque Method Sources

```text
ArrayDeque<E>
│
├── Constructors
│   ├── ArrayDeque()
│   ├── ArrayDeque(int numElements)
│   └── ArrayDeque(Collection<? extends E> c)
│
├── Inherited from Iterable
│   ├── iterator()
│   ├── spliterator()
│   └── forEach()
│
├── Inherited from Collection
│   ├── add()
│   ├── remove()
│   ├── contains()
│   ├── size()
│   ├── clear()
│   ├── stream()
│   └── ...
│
├── Inherited from Queue
│   ├── add()
│   ├── offer()
│   ├── remove()
│   ├── poll()
│   ├── element()
│   └── peek()
│
├── Inherited from Deque
│   ├── addFirst()
│   ├── addLast()
│   ├── offerFirst()
│   ├── offerLast()
│   ├── removeFirst()
│   ├── removeLast()
│   ├── pollFirst()
│   ├── pollLast()
│   ├── getFirst()
│   ├── getLast()
│   ├── peekFirst()
│   ├── peekLast()
│   ├── push()
│   ├── pop()
│   ├── removeFirstOccurrence()
│   ├── removeLastOccurrence()
│   ├── descendingIterator()
│   └── reversed()
│
└── ArrayDeque-specific public method
    └── clone()
```

### Reference Type and Method Visibility

The available methods depend on the **reference type**, even when the actual object is an `ArrayDeque`.

```java
Queue<Integer> queue = new ArrayDeque<>();

queue.offer(10);      // ✅
queue.addFirst(10);   // ❌
```

`addFirst()` belongs to `Deque`, but the reference type is only `Queue`.

```java
Deque<Integer> deque = new ArrayDeque<>();

deque.addFirst(10);   // ✅
deque.push(20);       // ✅
```

### ArrayDeque Constructors

| Constructor | Purpose |
|------------|---------|
| `ArrayDeque()` | Creates an empty deque |
| `ArrayDeque(int numElements)` | Creates a deque with an initial capacity sized for the given number of elements |
| `ArrayDeque(Collection<? extends E> c)` | Creates a deque containing elements from another collection |

### ArrayDeque Operations

| Method | Purpose | Typical Time |
|--------|---------|--------------|
| `addFirst(E)` | Insert at front | O(1) amortized |
| `addLast(E)` | Insert at rear | O(1) amortized |
| `offerFirst(E)` | Insert at front | O(1) amortized |
| `offerLast(E)` | Insert at rear | O(1) amortized |
| `removeFirst()` | Remove front | O(1) |
| `removeLast()` | Remove rear | O(1) |
| `pollFirst()` | Remove front | O(1) |
| `pollLast()` | Remove rear | O(1) |
| `getFirst()` | Examine front | O(1) |
| `getLast()` | Examine rear | O(1) |
| `peekFirst()` | Examine front | O(1) |
| `peekLast()` | Examine rear | O(1) |
| `push(E)` | Stack push | O(1) amortized |
| `pop()` | Stack pop | O(1) |
| `removeFirstOccurrence(Object)` | Remove first matching element | O(n) |
| `removeLastOccurrence(Object)` | Remove last matching element | O(n) |
| `descendingIterator()` | Reverse traversal | O(1) to create |

### ArrayDeque Shallow Copy

`clone()` creates a **shallow copy**.

```java
ArrayDeque<String> copy =
        (ArrayDeque<String>) deque.clone();
```

The new `ArrayDeque` object is separate, but the objects stored inside are not cloned.

```text
Original Deque          Clone Deque
    [Java]      ───►        [Java]
    [Python]    ───►        [Python]

        Same element references
```

### ArrayDeque Internal Working

`ArrayDeque` uses a **resizable circular array**.

When an end reaches the array boundary, it wraps around to the opposite side instead of shifting all elements.

```text
             Front
               ↓
      +----+----+----+----+----+----+
      | 40 | 50 |    |    | 10 | 20 |
      +----+----+----+----+----+----+
                             ↑
                            Rear
```

| Operation | Internal Behavior | Time |
|-----------|-------------------|------|
| `addFirst()` | Move front index with wrap-around and insert | O(1) amortized |
| `addLast()` | Insert at rear index with wrap-around | O(1) amortized |
| `pollFirst()` | Read front and advance index | O(1) |
| `pollLast()` | Read rear and move index backward | O(1) |
| Resize/Grow | Create larger array and copy elements | O(n) |

### ArrayDeque Optimized Operations

ArrayDeque implements important operations around its circular-array structure:

```java
addFirst()
addLast()
pollFirst()
pollLast()
iterator()
descendingIterator()
spliterator()
clone()
```

These operations work with the internal circular-array representation.

### ArrayDeque vs Stack

| Feature | ArrayDeque | Stack |
|---------|------------|-------|
| LIFO Support | ✅ | ✅ |
| Thread-Safe | ❌ | ✅ |
| Synchronization | No built-in synchronization | Synchronized legacy API |
| Recommended for new stack code | ✅ | ❌ |
| Internal Structure | Circular Array | Dynamic Array |

### ArrayDeque vs LinkedList

| Feature | ArrayDeque | LinkedList |
|---------|------------|------------|
| Internal Structure | Circular Array | Doubly Linked List |
| Memory Usage | Lower | Higher due to node overhead |
| Cache Locality | Better | Lower |
| Front/Rear Operations | O(1) amortized | O(1) |
| Null Elements | ❌ | ✅ |
| Index-Based Access | ❌ | ❌ |
| Typical Deque Use | Preferred | Acceptable |

### When to Use ArrayDeque

| Scenario | Choice |
|----------|--------|
| General Queue operations | `ArrayDeque` |
| Stack operations | `ArrayDeque` |
| Sliding Window | `ArrayDeque` |
| BFS | `ArrayDeque` |
| DFS | `ArrayDeque` |
| Need a shallow copy | `clone()` |
| Need front and rear operations | `ArrayDeque` |

## LinkedBlockingDeque

`LinkedBlockingDeque` is the thread-safe implementation of the `BlockingDeque` interface.

It extends a normal Deque with:

- Blocking insertion
- Blocking removal
- Timed insertion/removal
- Thread safety
- Optional capacity restriction
- FIFO Queue behavior
- LIFO Stack behavior
- Duplicate elements allowed
- `null` elements not allowed

```java
public class LinkedBlockingDeque<E>
        extends AbstractQueue<E>
        implements BlockingDeque<E>, Serializable
```

### LinkedBlockingDeque Hierarchy

```text
Iterable
    ↑
Collection
    ↑
Queue
    ↑
Deque
    ↑
BlockingQueue
    ↑
BlockingDeque
    ↑
AbstractQueue
    ↑
LinkedBlockingDeque
```

### Interface Relationship

```text
Iterable
     ↑
Collection
     ↑
Queue
     ↑
Deque
     ↑
BlockingQueue
     ↑
BlockingDeque
     ↑
LinkedBlockingDeque
```

### LinkedBlockingDeque Method Sources

```text
LinkedBlockingDeque<E>
│
├── Constructors
│   ├── LinkedBlockingDeque()
│   ├── LinkedBlockingDeque(int capacity)
│   └── LinkedBlockingDeque(Collection<? extends E> c)
│
├── Inherited from Collection
│   └── Common Collection methods
│
├── Inherited from Queue
│   └── add(), offer(), remove(), poll(), element(), peek()
│
├── Inherited from Deque
│   ├── addFirst(), addLast()
│   ├── offerFirst(), offerLast()
│   ├── removeFirst(), removeLast()
│   ├── pollFirst(), pollLast()
│   ├── getFirst(), getLast()
│   ├── peekFirst(), peekLast()
│   ├── push(), pop()
│   ├── removeFirstOccurrence()
│   ├── removeLastOccurrence()
│   ├── descendingIterator()
│   └── reversed()
│
├── Inherited from BlockingQueue
│   ├── put()
│   ├── take()
│   ├── offer(timeout)
│   ├── poll(timeout)
│   ├── remainingCapacity()
│   └── drainTo()
│
├── Inherited from BlockingDeque
│   ├── putFirst()
│   ├── putLast()
│   ├── offerFirst(timeout)
│   ├── offerLast(timeout)
│   ├── takeFirst()
│   ├── takeLast()
│   ├── pollFirst(timeout)
│   └── pollLast(timeout)
│
└── No additional public methods introduced
```

### Reference Type and Method Visibility

The available methods depend on the **reference type**.

```java
BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();

queue.put(10);        // ✅
queue.putFirst(10);   // ❌
```

`putFirst()` belongs to `BlockingDeque`, but the reference type is only `BlockingQueue`.

```java
BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

deque.putFirst(10);   // ✅
deque.takeLast();     // ✅
```

### LinkedBlockingDeque Constructors

| Constructor | Purpose |
|------------|---------|
| `LinkedBlockingDeque()` | Creates an unbounded deque; capacity is `Integer.MAX_VALUE` |
| `LinkedBlockingDeque(int capacity)` | Creates a bounded deque |
| `LinkedBlockingDeque(Collection<? extends E> c)` | Creates a deque pre-filled from another collection |

### BlockingDeque Methods

| Method | Purpose | Typical Time |
|--------|---------|--------------|
| `putFirst(E)` | Insert at front; block if full | O(1) |
| `putLast(E)` | Insert at rear; block if full | O(1) |
| `takeFirst()` | Remove front; block if empty | O(1) |
| `takeLast()` | Remove rear; block if empty | O(1) |
| `offerFirst(E, timeout)` | Timed insertion at front | O(1) |
| `offerLast(E, timeout)` | Timed insertion at rear | O(1) |
| `pollFirst(timeout)` | Timed removal from front | O(1) |
| `pollLast(timeout)` | Timed removal from rear | O(1) |

### Queue and Stack Behavior

```java
// Queue (FIFO)
deque.putLast(10);
deque.putLast(20);
deque.takeFirst();      // 10

// Stack (LIFO)
deque.putFirst(10);
deque.putFirst(20);
deque.takeFirst();      // 20
```

### BlockingQueue Methods on LinkedBlockingDeque

`LinkedBlockingDeque` also exposes the standard `BlockingQueue` operations:

| Method | Behavior |
|--------|----------|
| `put(E)` | Equivalent to inserting at the rear; blocks if full |
| `take()` | Equivalent to removing from the front; blocks if empty |
| `offer(E, timeout)` | Timed insertion |
| `poll(timeout)` | Timed removal |
| `remainingCapacity()` | Returns available capacity |
| `drainTo(Collection)` | Transfers available elements |

### LinkedBlockingDeque Internal Working

`LinkedBlockingDeque` uses a **doubly linked list** managed by synchronization primitives.

```text
NULL
 ↑
 │
10 ⇄ 20 ⇄ 30 ⇄ 40
 ↑              ↑
Head           Tail
```

Each node stores:

```text
Previous Node Reference
Data
Next Node Reference
```

The implementation uses a `ReentrantLock` with `notEmpty` and `notFull` conditions to coordinate blocking operations.

### Producer-Consumer Model

```text
Producer Thread          LinkedBlockingDeque          Consumer Thread
     putFirst() ─────────────► ◄──────────────────── takeFirst()
     putLast()  ─────────────► ◄──────────────────── takeLast()
                                  │
                           ┌──────┴───────┐
                           │ Doubly Linked │
                           │ List + Lock   │
                           │ + Conditions  │
                           └───────────────┘
```

- If the deque is full, a producer can block on `notFull`.
- If the deque is empty, a consumer can block on `notEmpty`.
- Both front and rear operations are supported.

### LinkedBlockingDeque Weakly Consistent Traversal

Its iterators are **weakly consistent**. They may reflect concurrent modifications but do not throw `ConcurrentModificationException`.

```java
Iterator<Integer> it = deque.iterator();

Iterator<Integer> reverse =
        deque.descendingIterator();
```

### LinkedBlockingDeque vs ArrayDeque

| Feature | LinkedBlockingDeque | ArrayDeque |
|---------|--------------------|------------|
| Thread-Safe | ✅ | ❌ |
| Internal Structure | Doubly Linked List | Circular Array |
| Blocking Operations | ✅ | ❌ |
| Timed Operations | ✅ | ❌ |
| Capacity Restriction | Optional | No fixed capacity |
| Memory Usage | Higher | Lower |
| Producer-Consumer | Suitable | Not designed for blocking producer-consumer use |

### LinkedBlockingDeque vs LinkedBlockingQueue

| Feature | LinkedBlockingDeque | LinkedBlockingQueue |
|---------|--------------------|---------------------|
| Front Insertion | ✅ | ❌ |
| Rear Insertion | ✅ | ✅ |
| Front Removal | ✅ | ✅ |
| Rear Removal | ✅ | ❌ |
| Queue (FIFO) | ✅ | ✅ |
| Stack (LIFO) | ✅ | ❌ |
| Internal Structure | Doubly Linked List | Singly Linked List |
| Locking | Single lock | Separate put/take locks |

### When to Use LinkedBlockingDeque

| Scenario | Choice |
|----------|--------|
| Unbounded thread-safe deque | `LinkedBlockingDeque()` |
| Bounded thread-safe deque | `LinkedBlockingDeque(int)` |
| Block until space at front | `putFirst()` |
| Block until space at rear | `putLast()` |
| Block until element at front | `takeFirst()` |
| Block until element at rear | `takeLast()` |
| Timed insert at either end | `offerFirst(timeout)` / `offerLast(timeout)` |
| Timed remove at either end | `pollFirst(timeout)` / `pollLast(timeout)` |
| Queue behavior | `putLast()` / `takeFirst()` |
| Stack behavior | `putFirst()` / `takeFirst()` |
| Batch transfer | `drainTo(Collection)` |

## Real-World Use Cases

| Scenario | Suitable Type | Why |
|----------|---------------|-----|
| Browser back/forward navigation | **ArrayDeque** | Operations at both ends |
| Undo/Redo operations | **ArrayDeque** | Push/pop behavior |
| Palindrome checking | **ArrayDeque** | Compare both ends |
| Sliding Window algorithms | **ArrayDeque** | Efficient end operations |
| BFS | **ArrayDeque** | FIFO Queue operations |
| DFS | **ArrayDeque** | LIFO Stack operations |
| Queue + List functionality | **LinkedList** | Implements both `List` and `Deque` |
| Concurrent producer-consumer using both ends | **LinkedBlockingDeque** | Thread-safe blocking operations |
| Work-stealing style double-ended coordination | **LinkedBlockingDeque** | Concurrent access from both ends |

## Common Mistakes

| Mistake | Reality / Solution |
|---------|--------------------|
| Using `LinkedList` when only Queue/Stack behavior is required | Prefer `ArrayDeque` for general single-threaded Deque operations |
| Using legacy `Stack` for new LIFO code | Prefer `Deque` with `ArrayDeque` |
| Using `removeFirst()` on an empty Deque | Use `pollFirst()` when graceful empty handling is desired |
| Using `getFirst()` on an empty Deque | Use `peekFirst()` when graceful empty handling is desired |
| Using `ArrayDeque` for concurrent access | Use an appropriate thread-safe implementation such as `LinkedBlockingDeque` |
| Adding `null` to `ArrayDeque` | `ArrayDeque` does not allow `null` |
| Assuming `Queue` references expose all Deque methods | Use a `Deque` reference when front/rear operations are required |
| Assuming `BlockingQueue` references expose BlockingDeque methods | Use a `BlockingDeque` reference for `putFirst()`, `takeLast()`, and similar methods |

## Best Practices

- Use **ArrayDeque** as the general-purpose Deque for single-threaded Queue, Stack, and double-ended operations.
- Prefer `offerFirst()` / `offerLast()` when special-value failure handling is appropriate.
- Prefer `pollFirst()` / `pollLast()` over exception-based removal when empty queues are expected.
- Prefer `peekFirst()` / `peekLast()` when examining an empty Deque should not throw.
- Use `Deque` rather than the legacy `Stack` class for new stack implementations.
- Use **LinkedBlockingDeque** when thread safety and blocking behavior are required.
- Choose the implementation based on **concurrency requirements first**, then ordering and access requirements.

## Quick Reference

| Requirement | Choice |
|-------------|--------|
| General-purpose Deque | **ArrayDeque** |
| Queue (FIFO) | **ArrayDeque** |
| Stack (LIFO) | **ArrayDeque** |
| Sliding Window / BFS / DFS | **ArrayDeque** |
| Queue + List APIs | **LinkedList** |
| Thread-safe Deque | **LinkedBlockingDeque** |
| Blocking operations at both ends | **LinkedBlockingDeque** |
| Timed operations at both ends | **LinkedBlockingDeque** |
| Reverse traversal | `descendingIterator()` |
| Reverse-order view | `reversed()` |
| Shallow copy of ArrayDeque | `clone()` |

> **Key Principle:** `Deque` provides operations at both ends, allowing FIFO Queue behavior and LIFO Stack behavior. The implementation determines the internal structure, performance, memory usage, and concurrency capabilities.
