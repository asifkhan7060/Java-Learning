### `ConcurrentLinkedQueue` — `About.md`

`ConcurrentLinkedQueue` is a **thread-safe, unbounded, non-blocking FIFO queue** designed for safe use by multiple threads. It is implemented using linked nodes and does not allow `null` elements. [Oracle Docs](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html?utm_source=chatgpt.com)

# ConcurrentLinkedQueue

## Declaration

```java
public class ConcurrentLinkedQueue<E>
        extends AbstractQueue<E>
        implements Queue<E>, Serializable
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
AbstractQueue
   ↓
ConcurrentLinkedQueue
```

It also implements:

```text
Queue
Iterable
Collection
Serializable
```

## What is ConcurrentLinkedQueue?

`ConcurrentLinkedQueue` is a **thread-safe FIFO Queue** designed for multiple threads to access the same queue safely.

It is:

- **Thread-safe**
- **Non-blocking**
- **Unbounded**
- **FIFO**
- Based on **linked nodes**
- Does **not allow `null`**

## Why use it?

Use `ConcurrentLinkedQueue` when:

```text
Multiple threads
       ↓
Need to share one Queue
       ↓
Want thread-safe access
       ↓
Do not want blocking operations
```

## Basic Example

```java
ConcurrentLinkedQueue<Integer> queue =
        new ConcurrentLinkedQueue<>();

queue.offer(10);
queue.offer(20);
queue.offer(30);

System.out.println(queue);        // [10, 20, 30]
System.out.println(queue.peek()); // 10
System.out.println(queue.poll()); // 10
```

## Important Methods

| Method | Purpose |
|---|---|
| `offer(e)` | Adds element to the rear |
| `add(e)` | Adds element to the rear |
| `peek()` | Reads front element without removing |
| `poll()` | Removes and returns front element |
| `contains(e)` | Checks whether element exists |
| `remove(e)` | Removes a matching element |
| `size()` | Returns current size |

> `size()` is not a constant-time operation; it requires traversal and may be inaccurate while other threads are modifying the queue. [Oracle Docs](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/ConcurrentLinkedQueue.html?utm_source=chatgpt.com)

## Important Characteristics

```text
ConcurrentLinkedQueue
        ↓
Thread-safe
        ↓
Non-blocking
        ↓
FIFO
        ↓
Unbounded
        ↓
Linked structure
```

## Concurrent vs Blocking Queue

```text
ConcurrentLinkedQueue
→ Thread-safe + Non-blocking

BlockingQueue
→ Thread-safe + Can block
```

For example:

```text
ConcurrentLinkedQueue
→ poll() returns null when empty

BlockingQueue
→ take() can wait until an element is available
```

## When to Use

Use `ConcurrentLinkedQueue` when:

- Multiple threads share a FIFO queue.
- You need thread-safe access.
- You do not want operations such as `put()` / `take()` to block.

## Priority

**Medium Priority**

Important to understand:

```text
What it is
Why it exists
Thread-safe + non-blocking behavior
Difference from normal Queue and BlockingQueue
```

Deep knowledge of its internal non-blocking algorithm is not necessary at the Collection Framework fundamentals level.
```

The official Java API describes it as an appropriate choice when many threads share access to a common collection and notes that its implementation uses an efficient non-blocking algorithm. :chatgpt-content-reference{index="2"}