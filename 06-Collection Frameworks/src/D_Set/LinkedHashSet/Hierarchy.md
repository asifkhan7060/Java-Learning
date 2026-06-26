# LinkedHashSet Method Hierarchy

## Overview

`LinkedHashSet` is an implementation of the `Set` interface that combines the fast performance of a **Hash Table** with the predictable iteration order of a **Doubly Linked List**.

It internally stores elements using a **Hash Table + Doubly Linked List**, which provides:

* Fast Search Operations
* Fast Insertion
* Fast Deletion
* Unique Elements
* One Null Element
* Maintains Insertion Order
* No Index-Based Access

Since `LinkedHashSet` implements the `Set` interface, it automatically inherits methods from:

* `Iterable`
* `Collection`
* `Set`

Additionally, `LinkedHashSet` provides its own constructors but does **not** introduce any new public methods.

---

# Class Declaration

```java
public class LinkedHashSet<E>
        extends HashSet<E>
        implements Set<E>,
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
Set
    ↑
AbstractCollection
    ↑
AbstractSet
    ↑
HashSet
    ↑
LinkedHashSet
```

---

# Interface Relationship

```text
Iterable
     ↑
Collection
     ↑
Set
     ↑
LinkedHashSet
```

---

# Complete LinkedHashSet Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
LinkedHashSet<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ LinkedHashSet()
├── ✅ LinkedHashSet(Collection<? extends E> c)
├── ✅ LinkedHashSet(int initialCapacity)
└── ✅ LinkedHashSet(int initialCapacity,
                     float loadFactor)

│
├──────────────────────────────────────────────
│ Methods Inherited from Iterable
├──────────────────────────────────────────────
│
├── ✅ iterator()
├── ✅ spliterator()
└── ✅ forEach()

│
├──────────────────────────────────────────────
│ Methods Inherited from Collection
├──────────────────────────────────────────────
│
├── ✅ add(E e)
├── ✅ addAll(Collection<? extends E> c)
│
├── ✅ remove(Object o)
├── ✅ removeAll(Collection<?> c)
├── ✅ retainAll(Collection<?> c)
├── 🆕 removeIf(Predicate<? super E> filter)
│
├── ✅ contains(Object o)
├── ✅ containsAll(Collection<?> c)
│
├── ✅ size()
├── ✅ isEmpty()
├── ✅ clear()
│
├── ✅ toArray()
├── ✅ toArray(T[] a)
├── 🆕 toArray(IntFunction<T[]> generator)
│
├── ✅ stream()
├── ✅ parallelStream()
│
├── ✅ equals(Object o)
└── ✅ hashCode()

│
├──────────────────────────────────────────────
│ Methods Inherited from Set
├──────────────────────────────────────────────
│
└── No New Methods
    (Set only guarantees Unique Elements)

│
├──────────────────────────────────────────────
│ Methods Inherited from HashSet
├──────────────────────────────────────────────
│
└── ✅ clone()

│
├──────────────────────────────────────────────
│ LinkedHashSet Specific Public Methods
├──────────────────────────────────────────────
│
└── No New Public Methods

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ spliterator()
├── 🆕 removeIf()
├── ✅ forEach()
├── ✅ iterator()
└── ✅ clone()

│
└──────────────────────────────────────────────
  Methods Inherited from Object
───────────────────────────────────────────────

├── 🆕 toString()
├── 🆕 getClass()
├── 🆕 wait()
├── 🆕 notify()
├── 🆕 notifyAll()
└── 🆕 finalize() (Deprecated)
```

---

# Understanding the Hierarchy

The methods available in a `LinkedHashSet` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `LinkedHashSet` class.

They are used to create `LinkedHashSet` objects and are **not inherited**.

```java
LinkedHashSet()

LinkedHashSet(Collection<? extends E> c)

LinkedHashSet(int initialCapacity)

LinkedHashSet(int initialCapacity,
              float loadFactor)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `LinkedHashSet` object can use the methods defined in the `Iterable` interface.

These methods are mainly used for traversing elements.

Examples:

* iterator()
* spliterator()
* forEach()

---

## 3. Methods Inherited from Collection

Since

```java
Set extends Collection
```

every `LinkedHashSet` also inherits all `Collection` methods.

These methods perform common collection operations such as:

* Adding Elements
* Removing Elements
* Searching
* Converting to Arrays
* Stream Processing

---

## 4. Methods Inherited from Set

Unlike the `List` interface,

the `Set` interface does **not introduce any new methods**.

Instead,

it only guarantees that duplicate elements are not allowed.

All operations like

* add()
* remove()
* contains()

are inherited from the `Collection` interface.

---

## 5. Methods Inherited from HashSet

`LinkedHashSet` extends the `HashSet` class.

Therefore,

it inherits the `clone()` method from `HashSet`.

It also inherits the complete hashing mechanism,

but internally uses a **LinkedHashMap** to preserve insertion order.

---

## 6. LinkedHashSet Specific Methods

Unlike `ArrayList` or `HashSet`,

`LinkedHashSet` does **not introduce any new public methods**.

Its primary contribution is its **internal implementation**, which combines:

* Hash Table
* Doubly Linked List

This enables predictable iteration order while maintaining nearly the same performance as `HashSet`.

---

## 7. Optimized Overrides

Some inherited methods are reimplemented inside `LinkedHashSet` for better performance.

Examples:

* iterator()
* spliterator()
* forEach()
* removeIf()

These methods behave exactly as defined in the parent interfaces but are optimized internally for the **Hash Table + Doubly Linked List** implementation.

---

## 8. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, a `LinkedHashSet` object can also use methods like:

* toString()
* getClass()
* wait()
* notify()
* notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.

# Part 2 : LinkedHashSet Specific Methods

---

## 1. LinkedHashSet()

Creates an empty `LinkedHashSet`.

### Syntax

```java
LinkedHashSet<E> set = new LinkedHashSet<>();
```

### Example

```java
LinkedHashSet<String> colors =
        new LinkedHashSet<>();
```

### Purpose

* Creates an empty LinkedHashSet.
* Most commonly used constructor.
* Stores only unique elements.
* Maintains insertion order.
* Internal Hash Table grows automatically when required.

### Note

Initially,

```text
Size = 0
```

Modern JDK lazily creates the internal table.

The default capacity becomes **16** when the first element is inserted.

Default Load Factor

```text
0.75
```

---

## 2. LinkedHashSet(int initialCapacity)

Creates an empty `LinkedHashSet` with the specified initial capacity.

### Syntax

```java
LinkedHashSet<E> set =
        new LinkedHashSet<>(initialCapacity);
```

### Example

```java
LinkedHashSet<Integer> numbers =
        new LinkedHashSet<>(100);
```

### Purpose

Useful when the approximate number of elements is already known.

Reduces repeated rehashing and improves performance.

### Example

```text
Capacity = 128

Current Size = 0
```

(The internal capacity is adjusted to the nearest power of 2.)

### Note

Capacity and Size are different.

```text
Capacity → Number of Buckets

Size → Number of Stored Elements
```

---

## 3. LinkedHashSet(int initialCapacity, float loadFactor)

Creates an empty `LinkedHashSet` with the specified capacity and load factor.

### Syntax

```java
LinkedHashSet<E> set =
        new LinkedHashSet<>(capacity,
                            loadFactor);
```

### Example

```java
LinkedHashSet<Integer> numbers =
        new LinkedHashSet<>(100, 0.75f);
```

### Purpose

Allows developers to control when rehashing should occur.

Useful for large collections and performance-critical applications.

### Example

```text
Capacity = 16

Load Factor = 0.75

Threshold = 12
```

When the 13th element is inserted,

LinkedHashSet performs **rehashing**.

### Note

The default Load Factor

```text
0.75
```

provides a good balance between

* Performance
* Memory Usage

---

## 4. LinkedHashSet(Collection<? extends E> c)

Creates a `LinkedHashSet` containing all elements from another collection.

### Syntax

```java
LinkedHashSet<E> set =
        new LinkedHashSet<>(collection);
```

### Example

```java
List<String> list =
        List.of("Java",
                "Python",
                "Java",
                "C++");

LinkedHashSet<String> set =
        new LinkedHashSet<>(list);
```

Output

```text
Java
Python
C++
```

### Purpose

* Copies all elements from another collection.
* Automatically removes duplicate elements.
* Preserves the insertion order of unique elements.

### Note

Only the elements are copied.

The original collection remains unchanged.

---

# Methods Inherited from HashSet

Unlike `HashSet`,

`LinkedHashSet` does **not introduce any new public methods**.

It inherits

```java
clone()
```

from the `HashSet` class.

---

## 1. clone()

Creates a **shallow copy** of the current LinkedHashSet.

### Syntax

```java
Object clone()
```

### Example

```java
LinkedHashSet<String> languages =
        new LinkedHashSet<>();

languages.add("Java");
languages.add("Python");

LinkedHashSet<String> copy =
    (LinkedHashSet<String>)
        languages.clone();
```

### Purpose

Creates another LinkedHashSet containing the same elements while preserving insertion order.

### Note

`clone()` returns an **Object**.

Therefore,

type casting is required.

```java
(LinkedHashSet<String>) set.clone();
```

---

### Shallow Copy

`clone()` performs a **shallow copy**.

The LinkedHashSet object is copied,

but the stored objects are **not cloned**.

Example

```text
Original LinkedHashSet

↓

Java

Python

C++

↓

Clone LinkedHashSet

↓

Java

Python

C++
```

Both collections reference the same objects.

---

# Internal Working

The biggest difference between `HashSet` and `LinkedHashSet` is **how elements are stored internally**.

`LinkedHashSet` internally uses

```text
Hash Table

+

Doubly Linked List
```

The Hash Table provides

* Fast searching
* Fast insertion
* Fast deletion

The Doubly Linked List preserves

* Insertion Order

---

## Internal Structure

```text
Hash Table

Bucket

↓

Java

↓

Python

↓

C++

↓

SQL



Linked List

Java ⇄ Python ⇄ C++ ⇄ SQL
```

Searching is performed using the Hash Table,

while iteration follows the Doubly Linked List.

---

## Insertion Order

Suppose we insert

```text
50

20

80

10
```

The LinkedHashSet stores

```text
50

20

80

10
```

exactly in the same order.

Unlike HashSet,

the output is always predictable.

---

## Duplicate Elements

Suppose

```java
set.add("Java");

set.add("Python");

set.add("Java");
```

Output

```text
Java

Python
```

The duplicate element is ignored.

The original insertion order remains unchanged.

---

## Rehashing

When the number of stored elements exceeds the threshold,

LinkedHashSet creates a larger Hash Table.

Example

Before

```text
Capacity = 16
```

After

```text
Capacity = 32
```

The linked list is also updated so that the insertion order remains unchanged.

---

# Optimized Overrides

The following methods are inherited,

but `LinkedHashSet` provides optimized implementations.

```java
iterator()

forEach()

spliterator()

removeIf()
```

These methods behave exactly as defined in the parent interfaces,

but are optimized internally for the **Hash Table + Doubly Linked List** implementation.

---

# Methods Not Covered Yet

The following methods exist in Java,

but are not covered in this project.

```java
newLinkedHashSet(int expectedSize)   // Java 21+

toArray(IntFunction<T[]> generator)

removeIf(Predicate<? super E> filter)
```

These methods will be covered in advanced Collection Framework topics.

---

# Important Notes

* Constructors are **not inherited**.
* `LinkedHashSet` inherits almost all of its methods from `HashSet`, `Set`, `Collection`, and `Iterable`.
* `LinkedHashSet` introduces **no new public methods**.
* `clone()` is inherited from `HashSet`.
* `clone()` creates a **Shallow Copy**, not a Deep Copy.
* Internally uses a **Hash Table + Doubly Linked List**.
* Maintains **Insertion Order**.
* Allows **one null element**.
* Default Capacity is **16**.
* Default Load Factor is **0.75**.
* Rehashing occurs automatically when the threshold is exceeded.
* The methods available in your code depend on the **reference type** (`Collection`, `Set`, `HashSet`, or `LinkedHashSet`), even when the object is a `LinkedHashSet`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor                                          | Time Complexity |           Space Complexity |
| ---------------------------------------------------- | --------------: | -------------------------: |
| LinkedHashSet()                                      |            O(1) |                       O(1) |
| LinkedHashSet(int initialCapacity)                   |            O(1) | O(n) *(allocates buckets)* |
| LinkedHashSet(int initialCapacity, float loadFactor) |            O(1) | O(n) *(allocates buckets)* |
| LinkedHashSet(Collection<? extends E>)               |            O(n) |                       O(n) |

---

## LinkedHashSet Specific Methods

| Method  | Time Complexity | Space Complexity |
| ------- | --------------: | ---------------: |
| clone() |            O(n) |             O(n) |

---

# Average Time Complexity of Common Operations

| Operation  | Average | Worst Case |
| ---------- | ------: | ---------: |
| add()      |    O(1) |       O(n) |
| remove()   |    O(1) |       O(n) |
| contains() |    O(1) |       O(n) |
| iterator() |    O(n) |       O(n) |
| clear()    |    O(n) |       O(1) |

> **Note**
>
> Since Java 8, buckets with excessive collisions are converted into **Red-Black Trees**.
>
> This improves worst-case lookup from **O(n)** to **O(log n)** for heavily-collided buckets.

---

# When Should You Use These Constructors?

## LinkedHashSet()

Use when:

* Number of elements is unknown.
* Insertion order must be preserved.
* Most commonly used constructor.

Example

```java
LinkedHashSet<String> cities =
        new LinkedHashSet<>();
```

---

## LinkedHashSet(int initialCapacity)

Use when:

* Approximate number of elements is already known.
* Want to reduce repeated rehashing.

Example

```java
LinkedHashSet<Employee> employees =
        new LinkedHashSet<>(5000);
```

---

## LinkedHashSet(int initialCapacity, float loadFactor)

Use when:

* Fine control over performance is required.
* Large collections.
* Performance-critical applications.

Example

```java
LinkedHashSet<Integer> numbers =
        new LinkedHashSet<>(100000, 0.75f);
```

---

## LinkedHashSet(Collection)

Use when:

* Converting another Collection into a LinkedHashSet.
* Removing duplicate elements while preserving insertion order.

Example

```java
List<String> names =
        Arrays.asList("Java",
                      "Python",
                      "Java");

LinkedHashSet<String> set =
        new LinkedHashSet<>(names);
```

---

## clone()

Use when:

* Need another LinkedHashSet containing the same elements.
* A shallow copy is sufficient.

---

# Capacity vs Size

This is one of the most frequently asked interview questions.

## Capacity

The total number of buckets available in the internal Hash Table.

Example

```text
Capacity = 16
```

---

## Size

The actual number of stored elements.

Example

```text
Capacity = 16

Size = 7
```

---

## Example

```java
LinkedHashSet<Integer> set =
        new LinkedHashSet<>(32);

set.add(10);
set.add(20);
```

Output

```text
Capacity = 32

Size = 2
```

---

# Load Factor vs Threshold

Another common interview topic.

## Load Factor

Represents how full the Hash Table can become before resizing.

```text
Default = 0.75
```

---

## Threshold

Represents the maximum number of elements allowed before rehashing.

Formula

```text
Threshold = Capacity × Load Factor
```

Example

```text
Capacity = 16

Load Factor = 0.75

Threshold = 12
```

When the 13th element is inserted,

LinkedHashSet automatically performs **rehashing**.

---

# Why is LinkedHashSet Slower than HashSet?

Both collections use a **Hash Table**.

However,

`LinkedHashSet` additionally maintains a **Doubly Linked List**.

```text
HashSet

Hash Table


LinkedHashSet

Hash Table

+

Doubly Linked List
```

Therefore,

every insertion and deletion also updates the linked list.

As a result,

* Slightly higher memory usage
* Slightly slower insertion and deletion
* Predictable iteration order

---

# Shallow Copy vs Deep Copy

## clone()

Creates a **Shallow Copy**.

```text
Original LinkedHashSet

↓

Java

Python

C++

↓

Clone LinkedHashSet

↓

Java

Python

C++
```

Only the LinkedHashSet object is copied.

The stored objects are **not cloned**.

---

## Deep Copy

Every object inside the collection is also copied.

```text
Original Object

↓

New Object

↓

Completely Independent
```

`LinkedHashSet.clone()` does **not** perform a deep copy.

---

# Important Notes

### Constructors

* Constructors are **not inherited**.
* Used only for object creation.

---

### clone()

* Returns an **Object**.
* Requires type casting.
* Creates a **Shallow Copy**.

---

### Capacity

* Represents the number of buckets.
* Not the number of stored elements.

---

### Load Factor

* Controls when rehashing occurs.
* Default value is **0.75**.

---

### Rehashing

* Automatically increases the Hash Table size.
* Redistributes all elements into new buckets.
* Preserves insertion order.

---

### Linked List

* Maintains insertion order.
* Adds slight memory overhead.
* Makes iteration predictable.

---

# Frequently Asked Interview Questions

## Q1. Which class does LinkedHashSet extend?

```java
HashSet
```

---

## Q2. Which interface does LinkedHashSet implement?

```java
Set
```

Indirectly,

```text
LinkedHashSet

↓

HashSet

↓

AbstractSet

↓

Set

↓

Collection

↓

Iterable
```

---

## Q3. Which data structure does LinkedHashSet use internally?

```text
Hash Table

+

Doubly Linked List
```

---

## Q4. Does LinkedHashSet maintain insertion order?

Yes.

Elements are always iterated in the order they were inserted.

---

## Q5. Does LinkedHashSet allow duplicate elements?

No.

Duplicate elements are ignored automatically.

---

## Q6. Does LinkedHashSet allow null?

Yes.

Only **one null element** can be stored.

---

## Q7. Why is LinkedHashSet slower than HashSet?

Because it maintains a **Doubly Linked List** in addition to the Hash Table.

---

## Q8. What is the default capacity of LinkedHashSet?

```text
16
```

(created lazily after the first insertion in modern JDKs)

---

## Q9. What is the default load factor?

```text
0.75
```

---

## Q10. Which public methods are introduced by LinkedHashSet?

```text
None
```

It does **not** introduce any new public methods.

It inherits `clone()` from `HashSet`.

---

## Q11. Are Collection methods copied into LinkedHashSet?

No.

They are **inherited** through the interface hierarchy.

```text
Iterable
      ↑
Collection
      ↑
Set
      ↑
HashSet
      ↑
LinkedHashSet
```

---

## Q12. Why can't we call clone() using a Set reference?

```java
Set<Integer> set =
        new LinkedHashSet<>();

set.clone();      // ❌
```

Because `clone()` belongs to the **HashSet** class,

not the **Set** interface.

---

## Q13. Why should we choose LinkedHashSet over HashSet?

When both

* Unique elements

and

* Insertion order

are required.

---

## Q14. When should LinkedHashSet be preferred over TreeSet?

When insertion order is important,

but automatic sorting is **not** required.

---

# Summary

* `LinkedHashSet` extends `HashSet`.
* Internally uses a **Hash Table + Doubly Linked List**.
* Stores only **unique elements**.
* Maintains **Insertion Order**.
* Allows **one null element**.
* Inherits methods from `Iterable`, `Collection`, `Set`, and `HashSet`.
* Introduces **no new public methods**.
* Inherits `clone()` from `HashSet`.
* Uses **Capacity**, **Load Factor**, **Threshold**, and **Rehashing** just like `HashSet`.
* Suitable when duplicate removal and predictable iteration order are both required.
