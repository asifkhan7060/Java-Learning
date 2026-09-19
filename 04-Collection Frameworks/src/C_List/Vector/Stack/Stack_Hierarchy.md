# Stack Method Hierarchy

## Overview

`Stack` is a legacy class in the Java Collection Framework that extends the **Vector** class.

Unlike `ArrayList`, `LinkedList`, and `Vector`, `Stack` is specifically designed to implement the **LIFO (Last In First Out)** principle.

Since `Stack` extends `Vector`, it automatically inherits methods from:

- Iterable Interface
- Collection Interface
- List Interface
- Vector Class

Additionally, `Stack` provides five stack-specific methods.

Modern Java applications generally prefer **Deque** (especially `ArrayDeque`) instead of `Stack` because it provides better performance and is the recommended replacement.

---

## Class Declaration

```java
public class Stack<E> extends Vector<E>
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
    ↑
Stack
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
                  ↑
               Stack
```

---

## Why Stack?

Many real-world applications require processing elements in the **reverse order** of insertion.

Examples include:

- Undo / Redo Operations
- Browser Back Button
- Function Call Stack
- Expression Evaluation
- Parentheses Matching
- Depth First Search (DFS)

A `Stack` follows the **LIFO (Last In First Out)** principle.

## LIFO (Last In, First Out)

```text
push(10)
push(20)
push(30)

Top
 │
 ▼
30
20
10
```

```java
pop();
```

```text
Top
 │
 ▼
20
10
```

**Output:** `30` is removed first because **Stack follows the LIFO (Last In, First Out) principle.**

---

## Key Features

- Follows LIFO (Last In First Out)
- Extends Vector
- Thread Safe (Inherited from Vector)
- Allows Duplicate Elements
- Allows Null Values
- Dynamic Size
- Legacy Class
- Supports Random Access (Inherited from Vector)
- Provides Stack-specific Operations

---

## Complete Method Hierarchy

```text
Stack<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
└── Stack()

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
│ Legacy Methods (Inherited from Vector)
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

│
├──────────────────────────────────────────────
│ Stack Specific Public Methods
├──────────────────────────────────────────────
│
├── push(E item)
├── pop()
├── peek()
├── empty()
└── search(Object o)

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
| **Constructor** | `Stack` class | `Stack()` | Not inherited |
| **Iterable** | `Collection extends Iterable` | `iterator()`, `spliterator()`, `forEach()` | Traversal methods |
| **Collection** | `List extends Collection` | `add()`, `remove()`, `contains()`, `size()`, `stream()` | Common collection operations |
| **List** | `Vector implements List` | `get()`, `set()`, `add(index)`, `remove(index)`, `sort()`, `subList()` | Index-based operations |
| **Vector Specific** | `Vector` class | `capacity()`, `ensureCapacity()`, `trimToSize()`, `setSize()`, `copyInto()`, `elements()`, `clone()` | Capacity + legacy support |
| **Legacy Methods** | `Vector` class | `addElement()`, `insertElementAt()`, `removeElement()`, `firstElement()`, `lastElement()`, `elementAt()` | Pre-Collection Framework methods |
| **Stack Specific** | `Stack` class | `push()`, `pop()`, `peek()`, `empty()`, `search()` | LIFO operations |
| **Optimized Overrides** | `Stack` reimplementation | `forEach()`, `removeIf()`, `replaceAll()`, `sort()`, `spliterator()` | Optimized for dynamic array |

> **Important:** Although `Stack` supports index-based operations (inherited from `Vector`), a stack should ideally be accessed only through its stack-specific methods (`push()`, `pop()`, `peek()`, `empty()`, and `search()`).
> ```java
> Stack<Integer> stack = new Stack<>();
> stack.add(0, 100);  // ❌ Works but breaks stack semantics
> stack.push(100);   // ✅ Correct way
> ```

---

## Stack Constructor

| Constructor | Syntax | Purpose |
|-------------|--------|---------|
| `Stack()` | `new Stack<>()` | Creates an empty stack; inherits Vector's default capacity (10) |

> **Note:** Stack has only one constructor. It inherits Vector's capacity management.

---

## Stack Specific Methods

| Method | Syntax | Description | Time | Returns |
|--------|--------|-------------|:----:|---------|
| `push(E item)` | `stack.push(10)` | Pushes element onto top of stack | **O(1)*** | The pushed item |
| `pop()` | `stack.pop()` | Removes and returns top element | **O(1)** | Top element |
| `peek()` | `stack.peek()` | Returns top element without removing | **O(1)** | Top element |
| `empty()` | `stack.empty()` | Checks if stack is empty | **O(1)** | `true` if empty |
| `search(Object o)` | `stack.search(20)` | Returns 1-based position from top | O(n) | Position or `-1` |

> *Amortized O(1); includes resizing if needed

### Operation Examples

```text
Push Operations:

stack.push(10)
stack.push(20)
stack.push(30)

Top
 │
 ▼
30
20
10


stack.pop()     → 30 (removed)
stack.peek()    → 20 (top, not removed)
stack.empty()   → false
stack.search(20) → 1 (position from top)
stack.search(10) → 2
stack.search(99) → -1 (not found)
```

---

## Internal Working

### LIFO with Dynamic Array

Since `Stack` extends `Vector`, it internally uses a **Dynamic Array**.

```text
           Top
            │
            ▼
        +------+
        |  40  |  ← push(40) adds here
        +------+
        |  30  |
        +------+
        |  20  |
        +------+
        |  10  |
        +------+
```

Only the **Top** element is accessible for `pop()` and `peek()`.

### Thread Safety

All public methods are synchronized (inherited from `Vector`):

```text
Thread 1  ----                                 →  Stack (synchronized)
                /
Thread 2  ----/
```

Only one thread can execute a modifying operation at a time.

---

## Time & Space Complexity

### Time Complexity

| Operation | Time |
|-----------|:----:|
| `push()` | **O(1)*** |
| `pop()` | **O(1)** |
| `peek()` | **O(1)** |
| `empty()` | **O(1)** |
| `search()` | O(n) |
| `get(index)` | **O(1)** |
| `add()` | **O(1)*** |
| `remove(index)` | O(n) |

> *Amortized O(1)

### Space Complexity

| Operation | Space |
|-----------|:-----:|
| `push()` | O(1) |
| `pop()` | O(1) |
| `peek()` | O(1) |
| `empty()` | O(1) |
| `search()` | O(1) |
| `clone()` | O(n) |

---

## Comparisons

### Stack vs Queue

| Stack | Queue |
|-------|-------|
| LIFO | FIFO |
| `push()` | `offer()` / `add()` |
| `pop()` | `poll()` / `remove()` |
| `peek()` | `peek()` |
| One End (Top) | Front & Rear |

### Stack vs Deque (ArrayDeque)

| Stack | ArrayDeque |
|-------|------------|
| Legacy Class | Modern Class |
| Extends Vector | Implements Deque |
| Thread Safe | Not Thread Safe |
| Uses Dynamic Array | Uses Circular Array |
| Slower | Faster |
| Recommended? ❌ | Recommended ✅ |

---

## When to Use Stack

| Use When | Prefer ArrayDeque When |
|----------|------------------------|
| Studying the Stack data structure | Building new applications |
| Working with legacy Java code | High performance required |
| API specifically requires `Stack` | Thread safety not needed |

---

## Reference Type Demonstration

```java
Collection<Integer> c = new Stack<>();     // Collection methods only
List<Integer> list = new Stack<>();          // Collection + List methods
Vector<Integer> vector = new Stack<>();      // Collection + List + Vector methods
Stack<Integer> stack = new Stack<>();          // All methods (full access)
```

| Reference Type | Accessible Methods |
|----------------|-------------------|
| `Collection` | Collection only |
| `List` | Collection + List |
| `Vector` | Collection + List + Vector Specific + Legacy |
| `Stack` | Collection + List + Vector + Legacy + Stack Specific |

---

## Interview Q&A

**Q1. What is Stack?**  
A legacy class that extends `Vector` and follows the **LIFO (Last In First Out)** principle.

**Q2. Why is Stack considered a legacy class?**  
Modern Java recommends using `Deque` (`ArrayDeque`) instead of `Stack` for better performance.

**Q3. Why is Stack thread-safe?**  
Because it inherits synchronized methods from `Vector`.

**Q4. Difference between `push()` and `add()`?**  
`push()` adds to the top (stack semantics). `add()` appends to the end (list semantics). Use `push()` for stack operations.

**Q5. Difference between `peek()` and `pop()`?**  
`peek()` returns top element without removing. `pop()` removes and returns top element.

**Q6. What does `empty()` do?**  
Returns `true` if stack contains no elements, `false` otherwise.

**Q7. How does `search()` work?**  
Returns **1-based position** from the top. Returns `-1` if element not found.

```text
Top
 │
 ▼
40  → position 1
30  → position 2
20  → position 3
10  → position 4
```

**Q8. What type of copy does `clone()` create?**  
A **Shallow Copy** — new Stack, same element references.

**Q9. Why is Stack slower than ArrayDeque?**  
`Stack` inherits synchronized methods from `Vector`. `ArrayDeque` is unsynchronized with lower overhead.

**Q10. When should you use Stack?**  
- For learning the Stack data structure
- When maintaining legacy code
- When an API specifically requires `Stack`

For modern applications, prefer **ArrayDeque**.

---

## Summary

- `Stack` extends `Vector` and follows **LIFO (Last In First Out)**.
- Internally uses a **Dynamic Array** (inherited from Vector).
- Thread-safe because of synchronization inherited from `Vector`.
- Provides five stack-specific methods: `push()`, `pop()`, `peek()`, `empty()`, `search()`.
- Modern Java recommends using **ArrayDeque** instead of `Stack` for new applications.
- Suitable for learning, legacy code, or APIs requiring `Stack` specifically.
