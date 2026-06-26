# Vector Method Hierarchy

## Overview

`Vector` is one of the implementations of the `List` interface in the Java Collection Framework.

Like `ArrayList`, `Vector` internally stores elements using a **Dynamic Array**.

However, unlike `ArrayList`, all public methods of `Vector` are **synchronized**, making it **thread-safe**.

Therefore, a `Vector` object can be safely accessed by multiple threads, although synchronization introduces additional overhead and makes it slower than `ArrayList`.

Since `Vector` implements the `List` interface, it inherits methods from:

- Iterable Interface
- Collection Interface
- List Interface

Additionally, `Vector` provides its own constructors, capacity-related methods, and several legacy methods.

---

# Class Declaration

```java
public class Vector<E>
        extends AbstractList<E>
        implements List<E>,
                   RandomAccess,
                   Cloneable,
                   Serializable
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
```

---

# Why Vector?

Suppose multiple threads are accessing the same collection.

```text
Thread 1  ----\
                \
                 →  Vector
                /
Thread 2  ----/
```

If both threads try to modify the collection simultaneously,

a normal collection like `ArrayList` may produce inconsistent results.

`Vector` solves this problem by synchronizing its public methods.

This ensures that only one thread can execute a modifying operation at a time.

Therefore,

- Safe for Multi-threading
- Prevents Concurrent Modification during method execution

However,

synchronization introduces extra overhead.

Therefore,

`Vector` is generally slower than `ArrayList`.

---

# Key Features

- Dynamic Array
- Ordered Collection
- Maintains Insertion Order
- Allows Duplicate Elements
- Allows Multiple Null Values
- Dynamic Size
- Index-Based Access
- Thread Safe (Synchronized)
- Legacy Class
- Supports Random Access

---

# Complete Method Hierarchy

```text
Vector<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── Vector()
├── Vector(int initialCapacity)
├── Vector(int initialCapacity, int capacityIncrement)
└── Vector(Collection<? extends E> c)

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
│ Legacy Methods
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

## 1. Constructors

Constructors are used to create a `Vector` object.

```java
Vector()

Vector(int initialCapacity)

Vector(int initialCapacity, int capacityIncrement)

Vector(Collection<? extends E> c)
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

- Traverse elements using `Iterator`
- Traverse elements using `Spliterator`
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

Unlike `ArrayList`, `Vector` provides additional methods for capacity management and legacy compatibility.

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

These methods were introduced before the Java Collection Framework and are maintained for backward compatibility.

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

Modern Java code generally prefers the standard `List` methods over these legacy methods.

---

## 7. Optimized Overrides

Although inherited from parent interfaces, `Vector` provides optimized implementations of:

```java
spliterator()

forEach()

removeIf()

replaceAll()

sort()
```

---

## 8. Exists in Java but Not Covered Yet

```java
reversed()

SequencedCollection Methods
```

These methods belong to newer Java versions or will be covered later.

---

## 9. Methods Inherited from Object

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

- `Vector` internally uses a **Dynamic Array**.
- All public methods are **synchronized**, making `Vector` **thread-safe**.
- `Vector` is generally slower than `ArrayList` because of synchronization.
- `Vector` supports **Random Access**.
- `Vector` provides capacity-related methods such as:
    - `capacity()`
    - `ensureCapacity()`
    - `trimToSize()`
    - `setSize()`
- It also includes several **legacy methods** for backward compatibility.
- The methods accessible in your code depend on the **reference type** (`Collection`, `List`, or `Vector`), even though the underlying object is a `Vector`.

# Vector Method Hierarchy

## Overview

`Vector` is one of the implementations of the `List` interface in the Java Collection Framework.

Like `ArrayList`, `Vector` internally stores elements using a **Dynamic Array**.

However, unlike `ArrayList`, all public methods of `Vector` are **synchronized**, making it **thread-safe**.

Therefore, a `Vector` object can be safely accessed by multiple threads, although synchronization introduces additional overhead and makes it slower than `ArrayList`.

Since `Vector` implements the `List` interface, it inherits methods from:

- Iterable Interface
- Collection Interface
- List Interface

Additionally, `Vector` provides its own constructors, capacity-related methods, and several legacy methods.

---

# Class Declaration

```java
public class Vector<E>
        extends AbstractList<E>
        implements List<E>,
                   RandomAccess,
                   Cloneable,
                   Serializable
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
```

---

# Why Vector?

Suppose multiple threads are accessing the same collection.

```text
Thread 1  ----\
                \
                 →  Vector
                /
Thread 2  ----/
```

If both threads try to modify the collection simultaneously,

a normal collection like `ArrayList` may produce inconsistent results.

`Vector` solves this problem by synchronizing its public methods.

This ensures that only one thread can execute a modifying operation at a time.

Therefore,

- Safe for Multi-threading
- Prevents Concurrent Modification during method execution

However,

synchronization introduces extra overhead.

Therefore,

`Vector` is generally slower than `ArrayList`.

---

# Key Features

- Dynamic Array
- Ordered Collection
- Maintains Insertion Order
- Allows Duplicate Elements
- Allows Multiple Null Values
- Dynamic Size
- Index-Based Access
- Thread Safe (Synchronized)
- Legacy Class
- Supports Random Access

---

# Complete Method Hierarchy

```text
Vector<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── Vector()
├── Vector(int initialCapacity)
├── Vector(int initialCapacity, int capacityIncrement)
└── Vector(Collection<? extends E> c)

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
│ Legacy Methods
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

## 1. Constructors

Constructors are used to create a `Vector` object.

```java
Vector()

Vector(int initialCapacity)

Vector(int initialCapacity, int capacityIncrement)

Vector(Collection<? extends E> c)
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

- Traverse elements using `Iterator`
- Traverse elements using `Spliterator`
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

Unlike `ArrayList`, `Vector` provides additional methods for capacity management and legacy compatibility.

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

These methods were introduced before the Java Collection Framework and are maintained for backward compatibility.

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

Modern Java code generally prefers the standard `List` methods over these legacy methods.

---

## 7. Optimized Overrides

Although inherited from parent interfaces, `Vector` provides optimized implementations of:

```java
spliterator()

forEach()

removeIf()

replaceAll()

sort()
```

---

## 8. Exists in Java but Not Covered Yet

```java
reversed()

SequencedCollection Methods
```

These methods belong to newer Java versions or will be covered later.

---

## 9. Methods Inherited from Object

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

- `Vector` internally uses a **Dynamic Array**.
- All public methods are **synchronized**, making `Vector` **thread-safe**.
- `Vector` is generally slower than `ArrayList` because of synchronization.
- `Vector` supports **Random Access**.
- `Vector` provides capacity-related methods such as:
    - `capacity()`
    - `ensureCapacity()`
    - `trimToSize()`
    - `setSize()`
- It also includes several **legacy methods** for backward compatibility.
- The methods accessible in your code depend on the **reference type** (`Collection`, `List`, or `Vector`), even though the underlying object is a `Vector`.

# Constructors & Methods

Unlike `ArrayList`, `Vector` provides several additional methods related to **capacity management** and **legacy support**.

These methods make `Vector` different from other `List` implementations.

---

# Constructors

## 1. Vector()

Creates an empty `Vector` with the default capacity.

### Syntax

```java
Vector<E> vector = new Vector<>();
```

### Default Capacity

```text
10
```

---

## 2. Vector(int initialCapacity)

Creates a `Vector` with the specified initial capacity.

### Syntax

```java
Vector<E> vector = new Vector<>(20);
```

---

## 3. Vector(int initialCapacity, int capacityIncrement)

Creates a `Vector` with a custom growth strategy.

### Syntax

```java
Vector<E> vector =
        new Vector<>(5,3);
```

Meaning

```text
Initial Capacity = 5

Capacity Increment = 3
```

---

## 4. Vector(Collection<? extends E> c)

Creates a `Vector` by copying another collection.

### Syntax

```java
Vector<E> vector =
        new Vector<>(collection);
```

---

# Vector Specific Methods

## capacity()

Returns the current capacity of the `Vector`.

### Syntax

```java
int capacity()
```

### Example

```java
vector.capacity();
```

---

## ensureCapacity()

Ensures the minimum capacity.

### Syntax

```java
void ensureCapacity(int minCapacity)
```

### Example

```java
vector.ensureCapacity(100);
```

---

## trimToSize()

Reduces capacity to match the current size.

### Syntax

```java
void trimToSize()
```

### Example

```java
vector.trimToSize();
```

---

## setSize()

Changes the size of the `Vector`.

### Syntax

```java
void setSize(int newSize)
```

### Example

```java
vector.setSize(20);
```

---

## copyInto()

Copies all elements into an array.

### Syntax

```java
void copyInto(Object[] array)
```

### Example

```java
Object[] arr =
        new Object[vector.size()];

vector.copyInto(arr);
```

---

## elements()

Returns an `Enumeration`.

### Syntax

```java
Enumeration<E> elements()
```

### Example

```java
Enumeration<String> e =
        vector.elements();
```

---

## clone()

Creates a shallow copy of the current `Vector`.

### Syntax

```java
Object clone()
```

### Example

```java
Vector<String> copy =
        (Vector<String>) vector.clone();
```

---

# Legacy Methods

These methods were introduced before the Java Collection Framework.

Modern Java prefers the corresponding `List` methods.

---

## addElement()

```java
addElement(E obj)
```

Equivalent to

```java
add(E e)
```

---

## insertElementAt()

```java
insertElementAt(E obj, int index)
```

Equivalent to

```java
add(index, element)
```

---

## removeElement()

```java
removeElement(Object obj)
```

Equivalent to

```java
remove(Object)
```

---

## removeElementAt()

```java
removeElementAt(int index)
```

Equivalent to

```java
remove(index)
```

---

## removeAllElements()

```java
removeAllElements()
```

Equivalent to

```java
clear()
```

---

## firstElement()

```java
firstElement()
```

Equivalent to

```java
get(0)
```

---

## lastElement()

```java
lastElement()
```

Equivalent to

```java
get(size()-1)
```

---

## setElementAt()

```java
setElementAt(E obj, int index)
```

Equivalent to

```java
set(index, element)
```

---

## elementAt()

```java
elementAt(int index)
```

Equivalent to

```java
get(index)
```

---

# clone()

`clone()` creates a **Shallow Copy** of the current `Vector`.

The new `Vector` object is created, but the stored objects are **shared** between both vectors.

Example

```java
Vector<Car> copy =
        (Vector<Car>) original.clone();
```

Changing a mutable object inside one vector also affects the other vector because both vectors reference the same object.

---

# Reference Type Demonstration

```java
Collection<Integer> collection =
        new Vector<>();

List<Integer> list =
        new Vector<>();

Vector<Integer> vector =
        new Vector<>();
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
```

---

# Exists in Java but Not Covered Yet

```text
Java 21

reversed()

SequencedCollection Methods
```

These methods will be covered in later topics.

---

# Interview Questions

### Q1. What is Vector?

A thread-safe implementation of the `List` interface that internally uses a dynamic array.

---

### Q2. Why is Vector slower than ArrayList?

Because all public methods of `Vector` are synchronized.

---

### Q3. What is the default capacity of Vector?

```text
10
```

---

### Q4. How does Vector grow?

- Default: Capacity doubles.
- Custom: Uses the specified `capacityIncrement`.

---

### Q5. Difference between size() and capacity()?

- `size()` → Number of stored elements.
- `capacity()` → Maximum elements that can be stored before resizing.

---

### Q6. Difference between ensureCapacity() and trimToSize()?

- `ensureCapacity()` increases capacity if required.
- `trimToSize()` reduces capacity to match the current size.

---

### Q7. What is Enumeration?

A legacy cursor used for traversing `Vector`.

Methods:

```java
hasMoreElements()

nextElement()
```

---

### Q8. Difference between Iterator and Enumeration?

| Iterator | Enumeration |
|-----------|-------------|
| Modern | Legacy |
| Can remove elements | Cannot remove elements |
| Works with all collections | Mainly used with Vector |

---

### Q9. What type of copy does clone() create?

A **Shallow Copy**.

---

### Q10. When should you use Vector?

- When thread safety is required.
- When working with legacy APIs.
- When synchronization is preferred over manual locking.

Otherwise, prefer `ArrayList` for better performance.