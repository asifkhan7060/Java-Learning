# Vector and Stack in Java

## Overview

`Vector` and `Stack` are older classes in the Java Collection Framework.

Their relationship is:

```text
List
  ↓
Vector
  ↓
Stack
```

- **Vector** → a thread-safe, dynamic-array implementation of `List`.
- **Stack** → a LIFO data structure that extends `Vector`.
- Both are **legacy classes**.

For modern Java development, `ArrayList` is generally preferred over `Vector`, and `ArrayDeque` is generally preferred over `Stack` for stack operations.

---

# Vector

## What is Vector?

`Vector` is a `List` implementation that uses a **dynamic array** internally.

Unlike `ArrayList`, its public methods are synchronized, making it thread-safe.

```text
Vector
→ Dynamic Array
→ Ordered
→ Allows duplicates
→ Supports index-based access
→ Synchronized
→ Legacy class
```

### Basic Example

```java
Vector<String> fruits = new Vector<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple");

System.out.println(fruits);
```

Output:

```text
[Apple, Banana, Apple]
```

---

## Why is Vector Different from ArrayList?

The main difference in the provided material is synchronization:

```text
ArrayList
→ Not synchronized

Vector
→ Synchronized
→ Thread-safe
```

Synchronization adds overhead, so `Vector` is generally slower than `ArrayList`.

### Basic Comparison

| Feature | ArrayList | Vector |
|---|---|---|
| Internal structure | Dynamic array | Dynamic array |
| Thread-safe | No | Yes |
| Synchronization | No | Yes |
| Performance | Generally faster | Generally slower |
| Legacy class | No | Yes |

---

## Vector Constructors

| Constructor | Purpose |
|---|---|
| `Vector()` | Creates an empty Vector |
| `Vector(int initialCapacity)` | Sets the initial capacity |
| `Vector(int initialCapacity, int capacityIncrement)` | Sets initial capacity and custom growth amount |
| `Vector(Collection<? extends E> c)` | Creates a Vector from another collection |

Example:

```java
Vector<Integer> numbers = new Vector<>(5, 3);
```

Here:

```text
Initial Capacity     = 5
Capacity Increment   = 3
```

---

## Size vs Capacity

These two are different:

| Term | Meaning |
|---|---|
| **Size** | Number of elements currently stored |
| **Capacity** | Amount of internal space currently available |

Example:

```java
Vector<Integer> v = new Vector<>(5, 3);

v.add(10);
v.add(20);
```

Now:

```text
Size     = 2
Capacity = 5
```

When the Vector becomes full, the capacity grows according to its growth strategy.

With the above custom increment:

```text
5 → 8 → 11 → 14 → ...
```

With the default growth behavior described in the material:

```text
10 → 20 → 40 → 80 → ...
```

---

## Vector-Specific Methods

These are the main Vector-specific methods worth knowing:

| Method | Purpose |
|---|---|
| `capacity()` | Returns current capacity |
| `ensureCapacity()` | Increases capacity when necessary |
| `trimToSize()` | Reduces capacity to the current size |
| `setSize()` | Changes the Vector size |
| `copyInto()` | Copies elements into an array |
| `elements()` | Provides an `Enumeration` for traversal |
| `clone()` | Creates a shallow copy |

Example:

```java
Vector<Integer> v = new Vector<>(5);

v.add(10);
v.add(20);

System.out.println(v.size());      // 2
System.out.println(v.capacity());  // 5
```

### `size()` vs `capacity()`

```text
size()
→ How many elements are stored

capacity()
→ How much internal space is currently available
```

---

## Legacy Methods

Vector also contains older methods kept for backward compatibility.

| Legacy Method | Modern List Equivalent |
|---|---|
| `addElement()` | `add()` |
| `insertElementAt()` | `add(index, element)` |
| `removeElement()` | `remove()` |
| `removeElementAt()` | `remove(index)` |
| `removeAllElements()` | `clear()` |
| `firstElement()` | `get(0)` |
| `lastElement()` | `get(size() - 1)` |
| `setElementAt()` | `set(index, element)` |
| `elementAt()` | `get(index)` |

For modern code, prefer the standard `List` methods.

---

## Vector and Reference Type

The available methods depend on the **reference type**, not only the actual object.

```java
Collection<Integer> c = new Vector<>();
List<Integer> list = new Vector<>();
Vector<Integer> vector = new Vector<>();
```

Conceptually:

```text
Collection reference
→ Collection methods

List reference
→ Collection + List methods

Vector reference
→ Collection + List + Vector-specific methods
```

For example:

```java
List<Integer> list = new Vector<>();

list.capacity();   // ❌ List does not define capacity()
```

Even though the actual object is a `Vector`, the reference type is `List`.

---

## When to Use Vector?

`Vector` is mainly relevant when:

- Working with **legacy Java code**
- An API specifically requires `Vector`
- Its built-in synchronization is specifically desired

For normal modern single-threaded list usage, the provided material recommends `ArrayList` instead.

For modern concurrent designs, use the concurrency-specific collection appropriate to the requirement rather than automatically choosing `Vector`.

---

# Stack

## What is Stack?

`Stack` is a **legacy class** that extends `Vector` and is designed for **LIFO (Last In, First Out)** operations.

```text
Vector
  ↓
Stack
```

Because `Stack` extends `Vector`, it also inherits Vector's List behavior and synchronization.

---

## LIFO — Last In, First Out

The last element added is the first element removed.

```text
push(10)
push(20)
push(30)

Top
 ↓
30
20
10
```

Now:

```java
stack.pop();
```

removes:

```text
30
```

Result:

```text
Top
 ↓
20
10
```

### Common Uses

- Undo / Redo operations
- Browser Back behavior
- Function call stack
- Expression evaluation
- Parentheses matching
- Depth First Search (DFS)

---

## Stack-Specific Methods

A `Stack` provides five important stack operations:

| Method | Purpose |
|---|---|
| `push(E item)` | Adds an element to the top |
| `pop()` | Removes and returns the top element |
| `peek()` | Returns the top element without removing it |
| `empty()` | Checks whether the stack is empty |
| `search(Object o)` | Returns the 1-based position of an element from the top |

Example:

```java
Stack<Integer> stack = new Stack<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.pop());    // 30
System.out.println(stack.peek());   // 20
System.out.println(stack.empty());  // false
System.out.println(stack.search(20)); // 1
System.out.println(stack.search(10)); // 2
System.out.println(stack.search(99)); // -1
```

---

## Stack and Inherited List Methods

Because `Stack` extends `Vector`, it also has methods such as:

```java
add()
get()
remove()
set()
```

For example:

```java
Stack<Integer> stack = new Stack<>();

stack.add(10);
stack.add(20);
```

This works because `Stack` is also a `List`.

However, when using it specifically as a **stack**, use:

```java
push()
pop()
peek()
```

rather than List-style operations, because those operations represent the intended LIFO behavior.

---

## Stack vs Queue

| Stack | Queue |
|---|---|
| LIFO | Commonly FIFO |
| `push()` | `offer()` / `add()` |
| `pop()` | `poll()` / `remove()` |
| `peek()` | `peek()` |
| Works from the top | Works from the queue's processing ends |

---

## Stack vs ArrayDeque

`Stack` is a legacy class. The provided material recommends `Deque`, especially `ArrayDeque`, for modern stack implementations.

| Stack | ArrayDeque |
|---|---|
| Legacy class | Modern choice |
| Extends `Vector` | Implements `Deque` |
| Synchronized | Not synchronized |
| Has synchronization overhead | Lower overhead |
| Designed for stack behavior | Supports stack and deque behavior |

Example modern stack-style usage:

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.pop());   // 30
```

---

# Vector vs Stack

| Feature | Vector | Stack |
|---|---|---|
| Relationship | Implements `List` | Extends `Vector` |
| Main purpose | General-purpose List | LIFO processing |
| Data structure | Dynamic array | Dynamic array through Vector |
| Ordering | Insertion order | LIFO operations |
| Thread-safe | Yes | Yes, inherited from Vector |
| Legacy | Yes | Yes |
| Modern replacement | Usually `ArrayList` | Usually `ArrayDeque` |

---

# Time Complexity

For the main operations:

| Operation | Vector | Stack |
|---|---:|---:|
| `get(index)` | O(1) | O(1) |
| Add at end / `push()` | O(1)* | O(1)* |
| Remove by index | O(n) | O(n) |
| `pop()` | — | O(1) |
| `peek()` | — | O(1) |
| `search()` | — | O(n) |

`*` Amortized complexity; resizing can require additional work.

---

# Key Points

```text
Vector
→ Dynamic-array List
→ Synchronized
→ Thread-safe
→ Legacy

Stack
→ Extends Vector
→ LIFO
→ Legacy
→ Inherits Vector/List behavior
```

```text
Vector
→ capacity()
→ ensureCapacity()
→ trimToSize()
→ setSize()
```

```text
Stack
→ push()
→ pop()
→ peek()
→ empty()
→ search()
```

```text
Modern preference
→ ArrayList instead of Vector for normal List usage
→ ArrayDeque instead of Stack for stack operations
```
