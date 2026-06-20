# LinkedList Method Hierarchy

## Overview

`LinkedList` is a class in the Java Collection Framework that implements both the **List** and **Deque** interfaces.

Unlike `ArrayList`, which stores elements in a dynamic array, `LinkedList` stores elements using a **Doubly Linked List**.

Therefore, a `LinkedList` object can be used as:

* List
* Queue
* Deque (Double Ended Queue)
* Stack (using Deque methods)

Since `LinkedList` implements multiple interfaces, it inherits methods from:

* Iterable Interface
* Collection Interface
* List Interface
* Queue Interface
* Deque Interface

Additionally, `LinkedList` provides its own constructors and the `clone()` method.

---

## Class Declaration

```java
public class LinkedList<E>
        extends AbstractSequentialList<E>
        implements List<E>, Deque<E>,
                   Cloneable, Serializable
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
AbstractSequentialList
    ↑
LinkedList
```

---

## Interface Relationship

```text
                    Iterable
                        ▲
                        │
                   Collection
                  ▲          ▲
                  │          │
                List       Queue
                  ▲          ▲
                  │          │
                  └────┐  Deque
                       │     ▲
                       └─────┘
                           │
                      LinkedList
```

---

## Why LinkedList?

Suppose we have an `ArrayList`.

```text
[10][20][30][40][50]
```

Now insert `5` at the beginning.

```text
[5][10][20][30][40][50]
```

To perform this operation, all existing elements must shift one position to the right.

```text
10 → 20 → 30 → 40 → 50

↓

Shift Every Element

↓

5 → 10 → 20 → 30 → 40 → 50
```

This shifting makes insertion and deletion at the beginning expensive.

---

`LinkedList` solves this problem.

Instead of storing elements inside a continuous array, every element is stored inside an individual **Node**.

Each node contains:

* Data
* Reference to Previous Node
* Reference to Next Node

```text
null
 ↑
[10]
 ↑ ↓
[20]
 ↑ ↓
[30]
 ↑
null
```

When inserting or deleting elements, only the node references are updated.

No element shifting is required.

Therefore,

* Insertion is faster.
* Deletion is faster.

However,

to access an element at a specific index, `LinkedList` must traverse the nodes one by one.

Therefore,

Random Access is slower than `ArrayList`.

---

## Key Features

* Doubly Linked List
* Ordered Collection
* Maintains Insertion Order
* Allows Duplicate Elements
* Allows Multiple Null Values
* Dynamic Size
* Sequential Access
* Efficient Insertion and Deletion
* Implements Queue
* Implements Deque
* Can also be used as a Stack

---

## Complete Method Hierarchy

```text
LinkedList<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── LinkedList()
└── LinkedList(Collection<? extends E> c)

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
│ Queue Interface
├──────────────────────────────────────────────
│
├── offer(E e)
├── remove()
├── poll()
├── element()
└── peek()

│
├──────────────────────────────────────────────
│ Deque Interface
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
├── pollFirst()
├── pollLast()
│
├── getFirst()
├── getLast()
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
└── reversed() (Java 21)

│
├──────────────────────────────────────────────
│ LinkedList Specific Public Methods
├──────────────────────────────────────────────
│
└── clone()

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
| **Constructors** | `LinkedList` class | `LinkedList()`, `LinkedList(Collection)` | Not inherited; used for object creation |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `List extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **List** | `LinkedList implements List` | `get()`, `set()`, `add(index)`, `remove(index)`, `sort()`, `subList()` | Index-based operations |
| **Queue** | `Deque extends Queue` | `offer()`, `poll()`, `peek()`, `remove()`, `element()` | FIFO operations |
| **Deque** | `LinkedList implements Deque` | `addFirst()`, `addLast()`, `push()`, `pop()`, `pollFirst()`, `pollLast()`, `descendingIterator()` | Double-ended + Stack operations |
| **LinkedList Specific** | `LinkedList` class | `clone()` | Shallow copy; no capacity methods |
| **Optimized Overrides** | `LinkedList` reimplementation | `forEach()`, `removeIf()`, `replaceAll()`, `sort()`, `spliterator()` | Optimized for linked nodes |

> **Important:** The methods accessible in your code depend on the **reference type** (`Collection`, `List`, `Queue`, `Deque`, or `LinkedList`), even though the underlying object is a `LinkedList`.
> ```java
> List<String> list = new LinkedList<>();
> list.push("A");   // ❌ Compile error — List has no push()
> ```

---

## LinkedList Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `LinkedList()` | `new LinkedList<>()` | Empty doubly linked list | O(1) | O(1) |
| `LinkedList(Collection<? extends E> c)` | `new LinkedList<>(collection)` | Copy all elements from another collection | O(n) | O(n) |

> **Note:** Unlike `ArrayList`, `LinkedList` has **no capacity concept** — no `ensureCapacity()` or `trimToSize()`.

---

## LinkedList Specific Method

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `clone()` | `(LinkedList<String>) list.clone()` | Creates a **shallow copy** — new LinkedList, same element references | O(n) | O(n) |

### Shallow Copy

`clone()` creates a new LinkedList object, but the stored objects are **not copied**.

```
Original List          Clone List
    [Apple]      →        [Apple]      ← Same object referenced
    [Banana]     →        [Banana]     ← Same object referenced
```

Both lists share the same object references. For deep copy, every object must be cloned individually.

---

## Internal Working

### Node Structure

Each element is stored in a separate **Node** object:

```text
┌────────┬────────┬────────┐
│  prev  │  data  │  next  │
└────────┴────────┴────────┘
```

- **prev** → points to the previous node
- **data** → stores the actual element
- **next** → points to the next node

### Doubly Linked List Example

```text
null
 ↑
┌───────────────┐
│ prev |10| next│
└───────────────┘
        │
        ▼
┌───────────────┐
│ prev |20| next│
└───────────────┘
        │
        ▼
┌───────────────┐
│ prev |30| next│
└───────────────┘
        │
        ▼
┌───────────────┐
│ prev |40| next│
└───────────────┘
        │
        ▼
      null
```

### Head and Tail

```text
Head
 │
 ▼
10 ⇄ 20 ⇄ 30 ⇄ 40
                 ▲
                 │
                Tail
```

- **Head** always points to the first node
- **Tail** always points to the last node

---

## Operation Examples

### Insertion at Beginning — O(1)

```text
Before:  Head → 10 ⇄ 20 ⇄ 30
After:   Head → 5 ⇄ 10 ⇄ 20 ⇄ 30

Only Head reference changes. No shifting.
```

### Insertion at End — O(1)

```text
Before:  10 ⇄ 20 ⇄ 30 ← Tail
After:   10 ⇄ 20 ⇄ 30 ⇄ 40 ← Tail

Only Tail reference changes. No shifting.
```

### Random Access — O(n)

```text
list.get(2):

Head → 10 → 20 → 30 → 40
              ↑
           Stop (index 2)

Must traverse from Head. No direct access.
```

---

## Queue Working (FIFO)

```java
queue.offer(10);   // Rear
queue.offer(20);
queue.offer(30);

// Front → 10 → 20 → 30 ← Rear

queue.poll();      // Removes 10
// Front → 20 → 30 ← Rear
```

## Stack Working (LIFO)

```java
stack.push(10);    // Top
stack.push(20);
stack.push(30);

//     Top
//      ↓
//     30
//     20
//     10

stack.pop();       // Removes 30
```

---

## Time Complexity Comparison

| Operation | ArrayList | LinkedList |
|-----------|:---------:|:----------:|
| `get(index)` | **O(1)** | O(n) |
| `addFirst()` | O(n) | **O(1)** |
| `addLast()` | **O(1)*** | **O(1)** |
| `removeFirst()` | O(n) | **O(1)** |
| `removeLast()` | **O(1)** | **O(1)** |
| `add(index)` | O(n) | O(n) |
| `remove(index)` | O(n) | O(n) |
| `contains()` | O(n) | O(n) |

> *Amortized O(1)

---

## When to Use LinkedList

| Use When | Avoid When |
|----------|------------|
| Frequent insertion at beginning | Frequent index-based access |
| Frequent deletion at beginning | Fast random access is important |
| Queue implementation | Memory usage should be minimal |
| Deque implementation | — |
| Stack using `push()`/`pop()` | — |

---

## Reference Type Demonstration

```java
Collection<Integer> c = new LinkedList<>();      // Collection methods only
List<Integer> list = new LinkedList<>();           // Collection + List methods
Queue<Integer> queue = new LinkedList<>();         // Collection + Queue methods
Deque<Integer> deque = new LinkedList<>();           // Collection + Queue + Deque methods
LinkedList<Integer> linkedList = new LinkedList<>(); // All methods
```

| Reference Type | Accessible Methods |
|----------------|-------------------|
| `Collection` | Collection only |
| `List` | Collection + List |
| `Queue` | Collection + Queue |
| `Deque` | Collection + Queue + Deque |
| `LinkedList` | Collection + List + Queue + Deque + LinkedList |

---

## Interview Q&A

**Q1. Why is LinkedList slower than ArrayList for random access?**  
LinkedList must traverse nodes from Head. ArrayList calculates address directly.

**Q2. Why is `addFirst()` O(1) in LinkedList?**  
Only Head reference is updated. No element shifting.

**Q3. Why is `get(index)` O(n) in LinkedList?**  
Must traverse nodes one by one from Head or Tail.

**Q4. Why does LinkedList implement Deque?**  
So it can work as List, Queue, Deque, and Stack using the same class.

**Q5. Difference between `offer()` and `add()`?**  
`offer()` returns `false` on failure; `add()` throws exception.

**Q6. Difference between `poll()` and `remove()`?**  
`poll()` returns `null` when empty; `remove()` throws exception.

**Q7. Difference between `peek()` and `element()`?**  
`peek()` returns `null` when empty; `element()` throws exception.

**Q8. Why doesn't LinkedList have `ensureCapacity()`?**  
It uses linked nodes, not a dynamic array. No capacity to manage.

**Q9. Can LinkedList be used as a Stack?**  
Yes — using `push()` and `pop()` from Deque interface.

**Q10. What type of copy does `clone()` create?**  
A **Shallow Copy** — new LinkedList, same element references.

---

## Summary

- LinkedList uses a **Doubly Linked List** internally.
- Each node stores **previous**, **data**, and **next** references.
- No element shifting during insertion or deletion.
- Random access is O(n) because traversal is required.
- Supports **List**, **Queue**, **Deque**, and **Stack** operations.
- Best suited for frequent insertions and deletions at ends.
- No capacity management methods (unlike ArrayList).
