# ConcurrentLinkedDeque

## Declaration

```java
public class ConcurrentLinkedDeque<E>
        extends AbstractCollection<E>
        implements Deque<E>, Serializable
```

## Package

```java
java.util.concurrent
```

## Hierarchy

```text
Object
   ↓
AbstractCollection
   ↓
ConcurrentLinkedDeque

Implements:
Deque → Queue
     → SequencedCollection
     → Collection
     → Iterable
     → Serializable
```

## What is ConcurrentLinkedDeque?

`ConcurrentLinkedDeque` is a **thread-safe, unbounded, non-blocking Deque** that allows multiple threads to safely add, remove, and access elements from both ends. It is based on linked nodes and does not allow `null` elements. [Oracle Docs](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/ConcurrentLinkedDeque.html?utm_source=chatgpt.com)

```text
Multiple Threads
       ↓
ConcurrentLinkedDeque
       ↓
┌───────────────┐
│ Front ↔ Rear  │
└───────────────┘
```

## Why use it?

Use it when:

```text
Multiple threads
       ↓
Need to share one Deque
       ↓
Need operations from both ends
       ↓
Do not want blocking operations
```

## Basic Example

```java
ConcurrentLinkedDeque<Integer> deque =
        new ConcurrentLinkedDeque<>();

deque.addFirst(10);
deque.addLast(20);
deque.addLast(30);

System.out.println(deque);        // [10, 20, 30]
System.out.println(deque.peekFirst()); // 10
System.out.println(deque.peekLast());  // 30

System.out.println(deque.pollFirst()); // 10
System.out.println(deque.pollLast());  // 30
```

## Important Methods

| Method | Purpose |
|---|---|
| `addFirst(e)` | Adds element at the front |
| `addLast(e)` | Adds element at the end |
| `offerFirst(e)` | Adds element at the front |
| `offerLast(e)` | Adds element at the end |
| `peekFirst()` | Reads first element without removing |
| `peekLast()` | Reads last element without removing |
| `pollFirst()` | Removes and returns first element |
| `pollLast()` | Removes and returns last element |
| `push(e)` | Adds element at the front |
| `pop()` | Removes and returns first element |
| `contains(e)` | Checks whether element exists |
| `removeFirstOccurrence(e)` | Removes first matching element |
| `removeLastOccurrence(e)` | Removes last matching element |

These methods come mainly from the `Deque` interface. [Oracle Docs](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/ConcurrentLinkedDeque.html?utm_source=chatgpt.com)

## Queue and Stack Behavior

Because it implements `Deque`, it can work in both ways:

```text
FIFO Queue:
addLast()  → pollFirst()

LIFO Stack:
push()     → pop()
```

So:

```text
ConcurrentLinkedDeque
        ↓
   Both Ends
    ↙       ↘
 Queue     Stack
 FIFO       LIFO
```

## Important Characteristics

```text
ConcurrentLinkedDeque
        ↓
Thread-safe
        ↓
Non-blocking
        ↓
Unbounded
        ↓
Deque → both ends
        ↓
Linked structure
        ↓
No null
```

Its iterators and spliterators are **weakly consistent**, meaning they can operate while other threads modify the deque without throwing `ConcurrentModificationException`. [Oracle Docs](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/ConcurrentLinkedDeque.html?utm_source=chatgpt.com)

## Concurrent vs Blocking Deque

```text
ConcurrentLinkedDeque
→ Thread-safe + Non-blocking

BlockingDeque
→ Thread-safe + Can block
```

For example:

```text
ConcurrentLinkedDeque
→ pollFirst() returns null when empty

BlockingDeque
→ takeFirst() can wait until an element is available
```

## `size()` Note

`size()` is **not a constant-time operation**. It may need to traverse the deque, and the result can become inaccurate if other threads modify the deque during the count. [Oracle Docs](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/ConcurrentLinkedDeque.html?utm_source=chatgpt.com)

## When to Use

Use `ConcurrentLinkedDeque` when:

- Multiple threads share a Deque.
- You need thread-safe access.
- You need insertion/removal from both ends.
- You do not want blocking operations.

## Priority

**Medium Priority**

Focus on:

```text
What it is
Thread-safe + non-blocking
Deque → both ends
Difference from LinkedList / ArrayDeque
Difference from BlockingDeque
```

Deep knowledge of its internal non-blocking algorithm is not necessary at the Collection Framework fundamentals level.
```