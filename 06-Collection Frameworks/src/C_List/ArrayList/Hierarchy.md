# ArrayList Method Hierarchy

## Overview

`ArrayList` is a class that implements the `List` interface.

Therefore, an `ArrayList` object can use methods inherited from:

* Iterable Interface
* Collection Interface
* List Interface

Additionally, `ArrayList` provides its own constructors and specific methods.

---

# Complete Method Hierarchy

```text
ArrayList<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ArrayList()
├── ArrayList(int initialCapacity)
└── ArrayList(Collection<? extends E> c)

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
│ ArrayList Specific Methods
├──────────────────────────────────────────────
│
├── ensureCapacity(int minCapacity)
├── trimToSize()
└── clone()

│
└──────────────────────────────────────────────
  Optimized Overrides by ArrayList
───────────────────────────────────────────────

├── forEach()
├── removeIf()
├── replaceAll()
├── sort()
└── spliterator()
```

---

# Explanation

## 1. Constructors

These constructors are used to create an `ArrayList` object.

```java
ArrayList()

ArrayList(int initialCapacity)

ArrayList(Collection<? extends E> c)
```

---

## 2. Iterable Interface Methods

These methods are inherited because:

```java
Collection extends Iterable
```

### Methods

```java
iterator()

spliterator()

forEach()
```

### Purpose

* Traverse elements using `Iterator`
* Traverse elements using `Spliterator`
* Execute an action for every element

---

## 3. Collection Interface Methods

These methods are inherited because:

```java
List extends Collection
```

### Purpose

These methods perform common collection operations such as:

* Add Elements
* Remove Elements
* Search Elements
* Convert Collection
* Stream Processing

---

## 4. List Interface Methods

These methods are provided specifically for indexed collections.

### Purpose

* Index-based Access
* Replace Elements
* Insert at Specific Position
* Remove by Index
* Search by Index
* Bidirectional Traversal
* Sorting
* Sub-list Creation

---

## 5. ArrayList Specific Methods

These methods belong only to `ArrayList`.

### ensureCapacity()

Ensures that the internal array has enough capacity to store the specified number of elements without frequent resizing.

```java
list.ensureCapacity(100);
```

---

### trimToSize()

Shrinks the internal array so that its capacity becomes equal to the current size.

```java
list.trimToSize();
```

---

### clone()

Creates a shallow copy of the current `ArrayList`.

```java
ArrayList<String> copy = (ArrayList<String>) list.clone();
```

---

## 6. Optimized Overrides

Although these methods are inherited from parent interfaces, `ArrayList` provides optimized implementations for better performance.

```java
forEach()

removeIf()

replaceAll()

sort()

spliterator()
```

---

# Important Notes

* `ArrayList` inherits all methods from **Iterable**, **Collection**, and **List**.
* `ArrayList` itself introduces only a few commonly used methods:

    * `ensureCapacity()`
    * `trimToSize()`
    * `clone()`
* Constructors are **not methods**; they are used to create objects.
* The methods listed under **Optimized Overrides** are inherited methods with improved implementations in `ArrayList`.
* The methods accessible in your program also depend on the **reference type** (`Collection`, `List`, or `ArrayList`), even though the underlying object is an `ArrayList`.
