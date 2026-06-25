# LinkedList Method Hierarchy

## Overview

`LinkedList` is a class that implements both the `List` and `Deque` interfaces.

Therefore, a `LinkedList` object can use methods inherited from:

* Iterable Interface
* Collection Interface
* List Interface
* Queue Interface
* Deque Interface

Additionally, `LinkedList` provides its own constructors and methods.

---

# Complete Method Hierarchy

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
└── reversed()

│
├──────────────────────────────────────────────
│ LinkedList Specific Methods
├──────────────────────────────────────────────
│
├── clone()
└── (No additional storage/capacity methods)

│
└──────────────────────────────────────────────
  Optimized Overrides by LinkedList
───────────────────────────────────────────────

├── spliterator()
├── forEach()
├── removeIf()
├── replaceAll()
└── sort()
```

---

# Explanation

## 1. Constructors

Used to create a `LinkedList` object.

```java
LinkedList()

LinkedList(Collection<? extends E> c)
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

* Traverse using `Iterator`
* Traverse using `Spliterator`
* Apply an action to every element

---

## 3. Collection Interface Methods

These methods perform common collection operations.

Examples:

* Add Elements
* Remove Elements
* Search Elements
* Convert to Array
* Stream Processing

---

## 4. List Interface Methods

These methods support index-based operations.

Examples:

* `get()`
* `set()`
* `add(index)`
* `remove(index)`
* `listIterator()`
* `subList()`
* `sort()`

---

## 5. Queue Interface Methods

`LinkedList` can behave as a Queue (FIFO).

Examples:

```java
offer()
poll()
peek()
element()
remove()
```

---

## 6. Deque Interface Methods

`LinkedList` can also behave as a Double Ended Queue.

Examples:

```java
addFirst()
addLast()

offerFirst()
offerLast()

removeFirst()
removeLast()

pollFirst()
pollLast()

getFirst()
getLast()

peekFirst()
peekLast()

push()
pop()

removeFirstOccurrence()
removeLastOccurrence()

descendingIterator()

reversed()
```

---

## 7. LinkedList Specific Methods

Unlike `ArrayList`, `LinkedList` does **not** have methods like:

```java
ensureCapacity()

trimToSize()
```

The only commonly used LinkedList-specific method is:

```java
clone()
```

---

# Important Notes

* `LinkedList` implements **both** `List` and `Deque`.
* It can be used as:

    * List
    * Queue
    * Deque
    * Stack (using `push()` and `pop()`)
* It inherits all methods from:

    * Iterable
    * Collection
    * List
    * Queue
    * Deque
* Unlike `ArrayList`, `LinkedList` does **not** manage capacity, so there are no `ensureCapacity()` or `trimToSize()` methods.
* The methods available in your code also depend on the **reference type** (`Collection`, `List`, `Queue`, `Deque`, or `LinkedList`), even though the underlying object is a `LinkedList`.
