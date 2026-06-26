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

# Class Declaration

```java
public class LinkedList<E>
        extends AbstractSequentialList<E>
        implements List<E>, Deque<E>,
                   Cloneable, Serializable
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
AbstractSequentialList
    ↑
LinkedList
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
                  Queue
                     ↑
                  Deque
                     ↑
                LinkedList
```

---

# Why LinkedList?

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

# Key Features

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
└── reversed() (Java 21)

│
├──────────────────────────────────────────────
│ LinkedList Specific Public Methods
├──────────────────────────────────────────────
│
├── clone()
└── No capacity-related methods

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
├── SequencedCollection methods (Java 21)
├── linkFirst()      (Internal)
├── linkLast()       (Internal)
└── unlink()         (Internal)

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

Constructors are used to create a `LinkedList` object.

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

* Traverse elements using `Iterator`
* Traverse elements using `Spliterator`
* Execute an action for every element

---

## 3. Collection Interface Methods

Inherited because:

```java
List extends Collection
```

Purpose:

* Add Elements
* Remove Elements
* Search Elements
* Convert Collection into Array
* Stream Processing
* Compare Collections

---

## 4. List Interface Methods

Inherited because:

```java
LinkedList implements List
```

Purpose:

* Index-based Access
* Replace Elements
* Insert at Specific Position
* Remove by Index
* Search by Index
* Bidirectional Traversal
* Sorting
* Sub-list Creation

---

## 5. Queue Interface Methods

Inherited because:

```java
Deque extends Queue
```

Purpose:

Queue methods allow `LinkedList` to work as a **FIFO (First In First Out)** data structure.

They provide operations such as:

* Insert at Rear
* Remove from Front
* View Front Element

---

## 6. Deque Interface Methods

Inherited because:

```java
LinkedList implements Deque
```

Purpose:

Deque methods allow insertion and deletion from **both ends**.

Therefore, `LinkedList` can be used as:

* Queue
* Deque
* Stack

---

## 7. LinkedList Specific Methods

Unlike `ArrayList`, `LinkedList` has no capacity management methods.

The only commonly used LinkedList-specific method is:

```java
clone()
```

It creates a **shallow copy** of the current `LinkedList`.

---

## 8. Optimized Overrides

Although inherited from parent interfaces, `LinkedList` provides optimized implementations of:

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
SequencedCollection methods

linkFirst()

linkLast()

unlink()
```

These are either Java 21 additions or internal JDK methods.

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

* `LinkedList` implements both **List** and **Deque**.
* It can be used as a:

  * List
  * Queue
  * Deque
  * Stack
* It inherits methods from:

  * Iterable
  * Collection
  * List
  * Queue
  * Deque
* Unlike `ArrayList`, `LinkedList` has **no capacity concept**, so methods like `ensureCapacity()` and `trimToSize()` are not available.
* The methods accessible in your code depend on the **reference type** (`Collection`, `List`, `Queue`, `Deque`, or `LinkedList`), even though the underlying object is a `LinkedList`.

# LinkedList Internal Working

Unlike `ArrayList`, `LinkedList` does **not** store elements in a continuous memory block.

Instead, every element is stored inside a separate object called a **Node**.

Each node contains:

- Data
- Reference to Previous Node
- Reference to Next Node

This structure is known as a **Doubly Linked List**.

---

# Structure of a Node

A typical node looks like this:

```text
+-----------------------------+
| Previous | Data | Next      |
+-----------------------------+
```

or

```text
┌────────┬────────┬────────┐
│  prev  │  data  │  next  │
└────────┴────────┴────────┘
```

Where

- **prev** → points to the previous node.
- **data** → stores the actual element.
- **next** → points to the next node.

---

# Doubly Linked List Structure

Suppose we store

```text
10, 20, 30, 40
```

Memory representation

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

Each node knows

- who is before it
- who is after it

---

# Head and Tail

LinkedList maintains two references internally.

```text
Head -----------------------> First Node

Tail -----------------------> Last Node
```

Example

```text
Head
 │
 ▼
10 ⇄ 20 ⇄ 30 ⇄ 40
                 ▲
                 │
                Tail
```

- Head always points to the first node.
- Tail always points to the last node.

---

# Traversing a LinkedList

Suppose we want

```java
list.get(2);
```

The LinkedList cannot directly jump to index **2**.

Instead it traverses node by node.

```text
Head

↓

10

↓

20

↓

30

Stop ✔
```

Therefore

```text
Time Complexity = O(n)
```

Unlike ArrayList

```text
Array Index

0 1 2 3

↓

Direct Access
```

which is

```text
O(1)
```

---

# Insertion at Beginning

Initially

```text
Head

↓

10 ⇄ 20 ⇄ 30
```

Insert

```text
5
```

Only references change.

```text
Head

↓

5 ⇄ 10 ⇄ 20 ⇄ 30
```

No existing element shifts.

Therefore

```text
Time Complexity = O(1)
```

---

# Insertion at End

Initially

```text
Head

↓

10 ⇄ 20 ⇄ 30

               ▲
               │
             Tail
```

Insert

```text
40
```

Result

```text
Head

↓

10 ⇄ 20 ⇄ 30 ⇄ 40
                     ▲
                     │
                   Tail
```

Only the tail reference changes.

```text
Time Complexity = O(1)
```

---

# Deletion at Beginning

Initially

```text
Head

↓

10 ⇄ 20 ⇄ 30
```

Remove

```text
10
```

Result

```text
Head

↓

20 ⇄ 30
```

Only references change.

```text
Time Complexity = O(1)
```

---

# Deletion at End

Initially

```text
10 ⇄ 20 ⇄ 30

               ▲
               │
             Tail
```

Remove

```text
30
```

Result

```text
10 ⇄ 20

         ▲
         │
       Tail
```

Only the tail reference changes.

```text
Time Complexity = O(1)
```

---

# Queue Working

LinkedList implements the **Deque** interface.

Therefore it can work as a Queue.

Queue follows

```text
FIFO

First In First Out
```

Example

```text
offer(10)

offer(20)

offer(30)
```

Queue

```text
Front

↓

10 → 20 → 30

            ↑

           Rear
```

Now

```java
poll();
```

removes

```text
10
```

Remaining

```text
20 → 30
```

---

# Stack Working

LinkedList also supports stack operations.

Stack follows

```text
LIFO

Last In First Out
```

Example

```java
push(10);

push(20);

push(30);
```

Stack

```text
Top

↓

30

↓

20

↓

10
```

Now

```java
pop();
```

removes

```text
30
```

---

# Why LinkedList is Slower than ArrayList?

Consider

```java
list.get(999);
```

ArrayList

```text
Direct Index Access

↓

O(1)
```

LinkedList

```text
Traverse

↓

Node 1

↓

Node 2

↓

Node 3

↓

...

↓

Node 999
```

```text
Time Complexity = O(n)
```

---

# Time Complexity Comparison

| Operation | ArrayList | LinkedList |
|-----------|-----------|-----------|
| get(index) | O(1) | O(n) |
| addFirst() | O(n) | O(1) |
| addLast() | O(1)* | O(1) |
| removeFirst() | O(n) | O(1) |
| removeLast() | O(1) | O(1) |
| add(index) | O(n) | O(n) |
| remove(index) | O(n) | O(n) |
| contains() | O(n) | O(n) |

\* Amortized O(1)

---

# When Should You Use LinkedList?

Use `LinkedList` when:

- Frequent insertion at the beginning.
- Frequent deletion at the beginning.
- Queue implementation.
- Deque implementation.
- Stack implementation using `push()` and `pop()`.
- Random access is **not** the primary requirement.

Avoid `LinkedList` when:

- Frequent index-based access is required.
- Fast random access is important.
- Memory usage should be minimal.

---

# Summary

- LinkedList uses a **Doubly Linked List**.
- Each node stores **previous**, **data**, and **next**.
- No element shifting occurs during insertion or deletion.
- Random access is slower because traversal is required.
- Supports **List**, **Queue**, **Deque**, and **Stack** operations.
- Best suited for applications involving frequent insertions and deletions.

# LinkedList Constructors & Methods

Unlike `ArrayList`, most useful methods of `LinkedList` come from the **Queue** and **Deque** interfaces.

This makes `LinkedList` more versatile because it can be used as:

- List
- Queue
- Deque
- Stack

---

# Constructors

## 1. LinkedList()

Creates an empty LinkedList.

### Syntax

```java
LinkedList<E> list = new LinkedList<>();
```

### Example

```java
LinkedList<String> list = new LinkedList<>();

list.add("Java");
list.add("Python");
list.add("C++");

System.out.println(list);
```

### Output

```text
[Java, Python, C++]
```

---

## 2. LinkedList(Collection<? extends E> c)

Creates a LinkedList by copying another collection.

### Syntax

```java
LinkedList<E> list =
        new LinkedList<>(collection);
```

### Example

```java
ArrayList<String> languages = new ArrayList<>();

languages.add("Java");
languages.add("Python");
languages.add("C++");

LinkedList<String> list =
        new LinkedList<>(languages);

System.out.println(list);
```

### Output

```text
[Java, Python, C++]
```

---

# LinkedList Specific Method

## clone()

Creates a **shallow copy** of the current LinkedList.

### Syntax

```java
Object clone()
```

### Example

```java
LinkedList<String> original =
        new LinkedList<>();

original.add("Java");
original.add("Python");

LinkedList<String> copy =
        (LinkedList<String>) original.clone();

System.out.println(original);
System.out.println(copy);
```

### Output

```text
[Java, Python]

[Java, Python]
```

---

### Shallow Copy

`clone()` creates a new LinkedList object.

However,

the objects stored inside the list are **not copied**.

Both lists share the same object references.

Example

```java
copy.get(0).brand = "Audi";
```

Both lists will display

```text
Audi
```

because both lists point to the same object.

---

# Queue Methods

Queue follows

```text
FIFO

First In First Out
```

---

## offer()

Adds an element at the rear of the queue.

### Syntax

```java
boolean offer(E e)
```

### Example

```java
queue.offer(10);
queue.offer(20);
queue.offer(30);
```

---

## poll()

Removes and returns the front element.

Returns `null` if the queue is empty.

### Syntax

```java
E poll()
```

### Example

```java
queue.poll();
```

---

## peek()

Returns the front element without removing it.

Returns `null` if empty.

### Syntax

```java
E peek()
```

---

## element()

Returns the front element.

Throws an exception if empty.

### Syntax

```java
E element()
```

---

## remove()

Removes the front element.

Throws an exception if empty.

### Syntax

```java
E remove()
```

---

# Deque Methods

Deque follows

```text
Double Ended Queue
```

Elements can be inserted and removed from **both ends**.

---

## addFirst()

Inserts at the beginning.

### Syntax

```java
void addFirst(E e)
```

---

## addLast()

Inserts at the end.

### Syntax

```java
void addLast(E e)
```

---

## offerFirst()

Adds at the beginning.

Returns `true` on success.

### Syntax

```java
boolean offerFirst(E e)
```

---

## offerLast()

Adds at the end.

Returns `true` on success.

### Syntax

```java
boolean offerLast(E e)
```

---

## getFirst()

Returns the first element.

Throws exception if empty.

### Syntax

```java
E getFirst()
```

---

## getLast()

Returns the last element.

Throws exception if empty.

### Syntax

```java
E getLast()
```

---

## peekFirst()

Returns the first element.

Returns `null` if empty.

### Syntax

```java
E peekFirst()
```

---

## peekLast()

Returns the last element.

Returns `null` if empty.

### Syntax

```java
E peekLast()
```

---

## removeFirst()

Removes the first element.

Throws exception if empty.

### Syntax

```java
E removeFirst()
```

---

## removeLast()

Removes the last element.

Throws exception if empty.

### Syntax

```java
E removeLast()
```

---

## pollFirst()

Removes the first element.

Returns `null` if empty.

### Syntax

```java
E pollFirst()
```

---

## pollLast()

Removes the last element.

Returns `null` if empty.

### Syntax

```java
E pollLast()
```

---

## push()

Pushes an element onto the front.

Used when LinkedList behaves like a Stack.

### Syntax

```java
void push(E e)
```

---

## pop()

Removes the top element.

Used when LinkedList behaves like a Stack.

### Syntax

```java
E pop()
```

---

## removeFirstOccurrence()

Removes the first matching element.

### Syntax

```java
boolean removeFirstOccurrence(Object o)
```

---

## removeLastOccurrence()

Removes the last matching element.

### Syntax

```java
boolean removeLastOccurrence(Object o)
```

---

## descendingIterator()

Returns an iterator that traverses from tail to head.

### Syntax

```java
Iterator<E> descendingIterator()
```

---

# Reference Type Demonstration

```java
Collection<Integer> c =
        new LinkedList<>();

List<Integer> list =
        new LinkedList<>();

Queue<Integer> queue =
        new LinkedList<>();

Deque<Integer> deque =
        new LinkedList<>();

LinkedList<Integer> linkedList =
        new LinkedList<>();
```

### Accessible Methods

```text
Collection Reference

Collection Methods


List Reference

Collection + List Methods


Queue Reference

Collection + Queue Methods


Deque Reference

Collection + Queue + Deque Methods


LinkedList Reference

Collection + List + Queue + Deque + LinkedList Methods
```

---

# Exists in Java but Not Covered Yet

```text
Java 21

reversed()

SequencedCollection Methods

Internal JDK Methods

linkFirst()

linkLast()

unlink()
```

---

# Interview Questions

### Q1. Why is LinkedList slower than ArrayList?

Because LinkedList requires node traversal for random access.

---

### Q2. Why is addFirst() O(1)?

Only node references are updated.

---

### Q3. Why is get(index) O(n)?

LinkedList traverses nodes one by one.

---

### Q4. Why does LinkedList implement Deque?

So it can work as:

- Queue
- Deque
- Stack

using the same class.

---

### Q5. Difference between offer() and add()?

- `offer()` returns `false` if insertion fails.
- `add()` throws an exception on failure.

---

### Q6. Difference between poll() and remove()?

- `poll()` returns `null` when empty.
- `remove()` throws an exception.

---

### Q7. Difference between peek() and element()?

- `peek()` returns `null` when empty.
- `element()` throws an exception.

---

### Q8. Why doesn't LinkedList have ensureCapacity()?

Because it does **not** use a dynamic array.

It stores elements as linked nodes.

---

### Q9. Can LinkedList be used as a Stack?

Yes.

Using

```java
push()

pop()
```

---

### Q10. What type of copy does clone() create?

A **Shallow Copy**.