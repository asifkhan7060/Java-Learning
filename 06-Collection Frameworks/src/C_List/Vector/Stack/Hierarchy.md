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

# Class Declaration

```java
public
class Stack<E>
extends Vector<E>
```

---

# Inheritance Hierarchy

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

# Interface Relationship

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

# Why Stack?

Many real-world applications require processing elements in the **reverse order** of insertion.

Examples include:

- Undo / Redo Operations
- Browser Back Button
- Function Call Stack
- Expression Evaluation
- Parentheses Matching
- Depth First Search (DFS)

A `Stack` follows the **LIFO (Last In First Out)** principle.

Example

```text
push(10)

↓

10

↓

push(20)

↓

10
20

↓

push(30)

↓

10
20
30
```

Now perform

```java
pop();
```

Result

```text
10
20
```

The **last inserted element (30)** is removed first.

---

# LIFO Principle

```text
Push Operations

push(10)

↓

push(20)

↓

push(30)

↓

push(40)



Top
 │
 ▼
40
30
20
10



pop()

↓

40 Removed



Top
 │
 ▼
30
20
10
```

---

# Key Features

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

# Complete Method Hierarchy

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

│
├──────────────────────────────────────────────
│ Exists in Java but Not Covered Yet
├──────────────────────────────────────────────
│
├── 🆕 reversed() (Java 21)
├── 🆕 SequencedCollection Methods
└── 🔒 Internal Helper Methods

│
└──────────────────────────────────────────────
  Methods Inherited from Object
───────────────────────────────────────────────

├── toString()
├── getClass()
├── wait()
├── wait(long)
├── wait(long, int)
├── notify()
├── notifyAll()
├── clone() (protected)
├── equals(Object)
├── hashCode()
└── finalize() (Deprecated)
```

---

# Understanding the Hierarchy

## 1. Constructor

Constructors are used to create a `Stack` object.

```java
Stack()
```

---

## 2. Iterable Interface Methods

Inherited because:

```java
Collection extends Iterable
```

Methods:

```java
iterator()

spliterator()

forEach()
```

Purpose:

- Traverse elements using Iterator
- Traverse elements using Spliterator
- Execute an action for every element

---

## 3. Collection Interface Methods

Inherited because:

```java
List extends Collection
```

Purpose:

- Add Elements
- Remove Elements
- Search Elements
- Convert Collection into Array
- Stream Processing
- Compare Collections

---

## 4. List Interface Methods

Inherited because:

```java
Vector implements List
```

Purpose:

- Index-based Access
- Replace Elements
- Insert at Specific Position
- Remove by Index
- Search by Index
- Bidirectional Traversal
- Sorting
- Sub-list Creation

---

## 5. Vector Specific Methods

Inherited because:

```java
Stack extends Vector
```

Purpose:

- Capacity Management
- Enumeration Support
- Clone Support
- Dynamic Array Management

Examples:

```java
capacity()

ensureCapacity()

trimToSize()

setSize()

copyInto()

elements()

clone()
```

---

## 6. Legacy Methods

Inherited from `Vector` for backward compatibility.

Examples:

```java
addElement()

insertElementAt()

removeElement()

removeElementAt()

removeAllElements()

firstElement()

lastElement()

setElementAt()

elementAt()
```

Modern Java code generally prefers standard `List` methods over these legacy methods.

---

## 7. Stack Specific Methods

These methods define the behavior of a stack.

```java
push()

pop()

peek()

empty()

search()
```

Purpose:

- Push elements onto the stack.
- Remove the top element.
- View the top element.
- Check whether the stack is empty.
- Search an element from the top.

---

## 8. Optimized Overrides

Although inherited from parent classes, `Stack` also benefits from optimized implementations of:

```java
spliterator()

forEach()

removeIf()

replaceAll()

sort()
```

---

## 9. Exists in Java but Not Covered Yet

```java
reversed()

SequencedCollection Methods
```

These methods belong to newer Java versions or will be covered later.

---

## 10. Methods Inherited from Object

Every Java class inherits methods from the `Object` class.

Examples:

```java
toString()

getClass()

wait()

notify()

notifyAll()

equals()

hashCode()
```

---

# Important Notes

- `Stack` extends **Vector**.
- Therefore, it inherits all methods of `Vector`.
- `Stack` is **thread-safe** because `Vector` is synchronized.
- `Stack` follows the **LIFO (Last In First Out)** principle.
- Modern Java recommends using **Deque** (`ArrayDeque`) instead of `Stack` for stack operations.
- Although `Stack` supports index-based operations (inherited from `Vector`), a stack should ideally be accessed only through its stack-specific methods (`push()`, `pop()`, `peek()`, `empty()`, and `search()`).
```

# Stack Internal Working

Unlike `Queue`, which follows **FIFO (First In First Out)**, a `Stack` follows the **LIFO (Last In First Out)** principle.

This means the **last inserted element is always removed first**.

Internally, Java's `Stack` is implemented using the **Vector** class.

Therefore, it stores elements in a **Dynamic Array**.

---

# Stack Representation

Suppose we push the following elements:

```text
10
20
30
40
```

Memory Representation

```text
           Top
            │
            ▼
        +------+
        |  40  |
        +------+
        |  30  |
        +------+
        |  20  |
        +------+
        |  10  |
        +------+
```

Only the **Top** element is accessible.

---

# Push Operation

`push()` inserts an element at the **Top** of the Stack.

Initially

```text
Top
 │
 ▼
30
20
10
```

Perform

```java
stack.push(40);
```

Result

```text
Top
 │
 ▼
40
30
20
10
```

Time Complexity

```text
O(1)
```

If resizing occurs internally,

```text
O(n)
```

Amortized

```text
O(1)
```

---

# Pop Operation

`pop()` removes the **Top** element.

Initially

```text
Top
 │
 ▼
40
30
20
10
```

Perform

```java
stack.pop();
```

Result

```text
Top
 │
 ▼
30
20
10
```

Time Complexity

```text
O(1)
```

---

# Peek Operation

`peek()` returns the **Top** element without removing it.

Example

```text
Top
 │
 ▼
30
20
10
```

```java
stack.peek();
```

Output

```text
30
```

Stack remains unchanged.

Time Complexity

```text
O(1)
```

---

# Empty Operation

Checks whether the Stack contains any elements.

Example

```java
stack.empty();
```

If Stack

```text
Top
 │
 ▼
10
20
30
```

Output

```text
false
```

If Stack

```text
Empty
```

Output

```text
true
```

Time Complexity

```text
O(1)
```

---

# Search Operation

`search()` returns the position of an element from the **Top** of the Stack.

Example

```text
Top
 │
 ▼
40
30
20
10
```

```java
stack.search(30);
```

Output

```text
2
```

Explanation

```text
Top

40 → Position 1

30 → Position 2

20 → Position 3

10 → Position 4
```

If the element is not found,

```text
-1
```

is returned.

Time Complexity

```text
O(n)
```

---

# Dynamic Array Working

Since `Stack` extends `Vector`, it internally uses a **Dynamic Array**.

Initially

```text
Capacity = 10
```

```text
+----+----+----+----+----+----+----+----+----+----+
| 10 | 20 | 30 |    |    |    |    |    |    |    |
+----+----+----+----+----+----+----+----+----+----+
```

When capacity becomes full,

```text
Old Capacity = 10

↓

New Capacity = 20
```

A larger array is created.

All elements are copied.

Old array is discarded.

---

# Thread Safety

Since `Stack` extends `Vector`,

all public methods are synchronized.

```text
Thread 1

↓

Stack

↑

Thread 2
```

Only one thread can execute a synchronized method at a time.

Advantages

- Safe for Multi-threading
- Prevents Data Corruption

Disadvantage

- Slower than non-synchronized collections.

---

# Time Complexity

| Operation | Time Complexity |
|------------|-----------------|
| push() | O(1)* |
| pop() | O(1) |
| peek() | O(1) |
| empty() | O(1) |
| search() | O(n) |
| get(index) | O(1) |
| add() | O(1)* |
| remove(index) | O(n) |

\* Amortized O(1)

---

# Space Complexity

| Operation | Space Complexity |
|------------|------------------|
| push() | O(1) |
| pop() | O(1) |
| peek() | O(1) |
| empty() | O(1) |
| search() | O(1) |
| clone() | O(n) |

---

# Stack vs Queue

| Stack | Queue |
|--------|-------|
| LIFO | FIFO |
| push() | offer()/add() |
| pop() | poll()/remove() |
| peek() | peek() |
| One End (Top) | Front & Rear |

---

# Stack vs Deque

| Stack | Deque |
|--------|-------|
| Legacy Class | Modern Interface |
| Extends Vector | Implemented by ArrayDeque & LinkedList |
| Thread Safe | Usually Not Thread Safe |
| Only Stack Operations | Stack + Queue Operations |
| Slower | Faster |

---

# Stack vs ArrayDeque

| Stack | ArrayDeque |
|--------|------------|
| Legacy Class | Modern Class |
| Thread Safe | Not Thread Safe |
| Uses Vector | Uses Circular Array |
| Slower | Faster |
| Recommended? ❌ | Recommended ✅ |

---

# When Should You Use Stack?

Use `Stack` when:

- Studying the Stack Data Structure.
- Working with legacy Java code.
- Using APIs that specifically require `Stack`.

Prefer `ArrayDeque` when:

- Building new applications.
- High performance is required.
- Thread safety is not required.

---

# Summary

- `Stack` extends `Vector`.
- Internally uses a **Dynamic Array**.
- Follows **LIFO (Last In First Out)**.
- Supports five stack-specific methods:
    - `push()`
    - `pop()`
    - `peek()`
    - `empty()`
    - `search()`
- Thread-safe because of synchronization inherited from `Vector`.
- Modern Java recommends using **ArrayDeque** instead of `Stack` for new applications.


# Constructors & Methods

Since `Stack` extends `Vector`, it inherits all methods from:

- Iterable
- Collection
- List
- Vector

`Stack` itself introduces only **five public methods**.

---

# Constructor

## Stack()

Creates an empty `Stack`.

### Syntax

```java
Stack<E> stack = new Stack<>();
```

### Example

```java
Stack<Integer> stack = new Stack<>();
```

---

# Stack Specific Methods

## push()

Pushes an element onto the top of the stack.

### Syntax

```java
E push(E item)
```

### Example

```java
stack.push(10);
stack.push(20);
stack.push(30);
```

### Output

```text
Top
 │
 ▼
30
20
10
```

---

## pop()

Removes and returns the top element.

### Syntax

```java
E pop()
```

### Example

```java
stack.pop();
```

### Output

```text
Removed : 30
```

Remaining Stack

```text
Top
 │
 ▼
20
10
```

---

## peek()

Returns the top element without removing it.

### Syntax

```java
E peek()
```

### Example

```java
stack.peek();
```

### Output

```text
30
```

---

## empty()

Checks whether the stack is empty.

### Syntax

```java
boolean empty()
```

### Example

```java
stack.empty();
```

### Output

```text
false
```

---

## search()

Returns the position of an element from the top of the stack.

### Syntax

```java
int search(Object o)
```

### Example

```java
stack.search(20);
```

### Output

```text
2
```

---

# clone()

Since `Stack` extends `Vector`, it inherits the `clone()` method.

`clone()` creates a **Shallow Copy** of the current `Stack`.

Example

```java
Stack<Car> copy =
        (Stack<Car>) original.clone();
```

Changing a mutable object inside one stack also affects the other stack because both stacks reference the same object.

---

# Reference Type Demonstration

```java
Collection<Integer> collection =
        new Stack<>();

List<Integer> list =
        new Stack<>();

Vector<Integer> vector =
        new Stack<>();

Stack<Integer> stack =
        new Stack<>();
```

### Accessible Methods

```text
Collection Reference

Collection Methods


List Reference

Collection + List Methods


Vector Reference

Collection
+ List
+ Vector Specific Methods
+ Legacy Methods


Stack Reference

Collection
+ List
+ Vector Methods
+ Legacy Methods
+ Stack Specific Methods
```

---

# Exists in Java but Not Covered Yet

```text
Java 21

reversed()

SequencedCollection Methods
```

These methods belong to newer Java versions and will be covered later.

---

# Interview Questions

### Q1. What is Stack?

A legacy class that extends `Vector` and follows the **LIFO (Last In First Out)** principle.

---

### Q2. Why is Stack considered a legacy class?

Because modern Java recommends using `Deque` (`ArrayDeque`) instead of `Stack`.

---

### Q3. Why is Stack thread-safe?

Because it inherits synchronized methods from `Vector`.

---

### Q4. Difference between push() and add()?

- `push()` adds an element to the top of the stack.
- `add()` inserts an element like a normal `List` method.

Although `Stack` supports both, `push()` should be used for stack operations.

---

### Q5. Difference between peek() and pop()?

- `peek()` returns the top element without removing it.
- `pop()` removes and returns the top element.

---

### Q6. What does empty() do?

Checks whether the stack contains any elements.

Returns:

```text
true
```

if empty, otherwise

```text
false
```

---

### Q7. How does search() work?

It returns the **1-based position** of an element from the **top** of the stack.

If the element is not found,

```text
-1
```

is returned.

---

### Q8. What type of copy does clone() create?

A **Shallow Copy**.

---

### Q9. Why is Stack slower than ArrayDeque?

Because `Stack` inherits synchronized methods from `Vector`, whereas `ArrayDeque` is not synchronized and has lower overhead.

---

### Q10. When should you use Stack?

Use `Stack`:

- For learning the Stack data structure.
- When maintaining legacy code.
- When an API specifically requires `Stack`.

For modern applications, prefer **ArrayDeque**.