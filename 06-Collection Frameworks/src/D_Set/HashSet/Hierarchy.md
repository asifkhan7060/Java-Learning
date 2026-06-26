# HashSet Method Hierarchy

## Overview

`HashSet` is the most commonly used implementation of the `Set` interface in the Java Collection Framework.

It internally stores elements using a **Hash Table**, which provides:

* Fast Search Operations
* Fast Insertion
* Fast Deletion
* Unique Elements
* One Null Element
* No Insertion Order
* No Index-Based Access

Since `HashSet` implements the `Set` interface, it automatically inherits methods from:

* `Iterable`
* `Collection`
* `Set`

Additionally, `HashSet` provides its own constructors and one class-specific public method.

---

# Class Declaration

```java
public class HashSet<E>
        extends AbstractSet<E>
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
HashSet
```

---

# Complete HashSet Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
HashSet<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ HashSet()
├── ✅ HashSet(Collection<? extends E> c)
├── ✅ HashSet(int initialCapacity)
└── ✅ HashSet(int initialCapacity,
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
│ HashSet Specific Public Methods
├──────────────────────────────────────────────
│
└── ✅ clone()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ spliterator()
├── 🆕 removeIf()
├── ✅ forEach()
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

The methods available in a `HashSet` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `HashSet` class.

They are used to create `HashSet` objects and are **not inherited**.

```java
HashSet()

HashSet(Collection<? extends E> c)

HashSet(int initialCapacity)

HashSet(int initialCapacity,
        float loadFactor)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `HashSet` object can use the methods defined in the `Iterable` interface.

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

every `HashSet` also inherits all `Collection` methods.

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

## 5. HashSet Specific Methods

The following public method belongs only to the `HashSet` class.

```java
clone()
```

It creates a **shallow copy** of the HashSet.

The constructors also belong directly to the `HashSet` class.

---

## 6. Optimized Overrides

Some inherited methods are reimplemented inside `HashSet` for better performance.

Examples:

* spliterator()
* forEach()
* clone()
* removeIf()

These methods behave exactly as defined in the parent interfaces but are optimized internally for the hash table implementation.

---

## 7. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, a `HashSet` object can also use methods like:

* toString()
* getClass()
* wait()
* notify()
* notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.


# Part 2 : HashSet Specific Methods

---

## 1. HashSet()

Creates an empty `HashSet`.

### Syntax

```java
HashSet<E> set = new HashSet<>();
```

### Example

```java
HashSet<String> cities = new HashSet<>();
```

### Purpose

* Creates an empty HashSet.
* Most commonly used constructor.
* Stores only unique elements.
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

## 2. HashSet(int initialCapacity)

Creates an empty `HashSet` with the specified initial capacity.

### Syntax

```java
HashSet<E> set = new HashSet<>(initialCapacity);
```

### Example

```java
HashSet<Integer> numbers = new HashSet<>(100);
```

### Purpose

Useful when the approximate number of elements is already known.

Reduces repeated rehashing and improves performance.

### Example

```text
Capacity = 128

Current Size = 0
```

(HashSet internally adjusts the capacity to the nearest power of 2.)

### Note

Capacity and Size are different.

```text
Capacity → Number of Buckets

Size → Number of Stored Elements
```

---

## 3. HashSet(int initialCapacity, float loadFactor)

Creates an empty `HashSet` with the specified capacity and load factor.

### Syntax

```java
HashSet<E> set =
        new HashSet<>(capacity, loadFactor);
```

### Example

```java
HashSet<Integer> numbers =
        new HashSet<>(100, 0.75f);
```

### Purpose

Allows developers to control when rehashing should occur.

Useful in performance-critical applications.

### Example

```text
Capacity = 16

Load Factor = 0.75

Threshold = 12
```

When the 13th element is inserted,

HashSet performs **rehashing**.

### Note

Default Load Factor

```text
0.75
```

is recommended because it provides a good balance between

* Memory Usage
* Performance

---

## 4. HashSet(Collection<? extends E> c)

Creates a `HashSet` containing all elements from another collection.

### Syntax

```java
HashSet<E> set =
        new HashSet<>(collection);
```

### Example

```java
List<Integer> list =
        List.of(10,20,30,20);

HashSet<Integer> set =
        new HashSet<>(list);
```

Output

```text
10
20
30
```

### Purpose

* Copies all elements from another collection.
* Automatically removes duplicate elements.
* Frequently used to convert a List into a Set.

### Note

Only the elements are copied.

The original collection remains unchanged.

---

# HashSet Specific Methods

Unlike Collection and Set methods,

the following method belongs only to the `HashSet` class.

---

## 1. clone()

Creates a **shallow copy** of the current HashSet.

### Syntax

```java
Object clone()
```

### Example

```java
HashSet<String> languages =
        new HashSet<>();

languages.add("Java");
languages.add("Python");

HashSet<String> copy =
        (HashSet<String>) languages.clone();
```

### Purpose

Creates another HashSet containing the same elements.

### Note

`clone()` returns an **Object**.

Therefore,

type casting is required.

```java
(HashSet<String>) set.clone();
```

---

### Shallow Copy

`clone()` performs a **shallow copy**.

The HashSet object is copied,

but the stored objects are **not cloned**.

Example

```text
Original HashSet

↓

Java

Python

↓

Clone HashSet

↓

Java

Python
```

Both sets reference the same objects.

---

# Internal HashSet Concepts

Understanding the following concepts is important because they determine the performance of a `HashSet`.

---

## 1. Capacity

Capacity is the total number of buckets available in the internal Hash Table.

Example

```text
Capacity = 16
```

This does **not** mean that 16 elements are stored.

It simply means there are 16 buckets.

---

## 2. Size

Size represents the actual number of elements stored inside the HashSet.

Example

```text
Capacity = 16

Size = 5
```

Only five elements are stored.

---

## 3. Load Factor

Load Factor determines how full the Hash Table is allowed to become before resizing.

Formula

```text
Load Factor = Size / Capacity
```

Default Value

```text
0.75
```

This provides a good balance between speed and memory usage.

---

## 4. Threshold

Threshold is the maximum number of elements that can be inserted before rehashing occurs.

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

HashSet performs rehashing.

---

## 5. Rehashing

When the number of stored elements exceeds the threshold,

HashSet creates a larger Hash Table.

Example

Before

```text
Capacity = 16
```

After

```text
Capacity = 32
```

All existing elements are redistributed into the new buckets.

### Purpose

* Reduces collisions.
* Maintains fast searching.
* Improves performance.

---

# Optimized Overrides

The following methods are inherited,

but `HashSet` provides optimized implementations.

```java
forEach()

spliterator()

removeIf()

clone()
```

These methods behave exactly as defined in the parent interfaces,

but are optimized internally for the hash table implementation.

---

# Methods Not Covered Yet

The following methods exist in Java,

but are not covered in this project.

```java
newHashSet(int expectedSize)   // Java 21+

toArray(IntFunction<T[]> generator)

removeIf(Predicate<? super E> filter)
```

These methods will be covered in advanced Collection Framework topics.

---

# Important Notes

* Constructors are **not inherited**.
* `HashSet` inherits almost all of its methods from `Iterable`, `Collection`, and `Set`.
* `Set` itself introduces **no new methods**.
* `clone()` is the primary public method introduced by `HashSet`.
* `clone()` creates a **Shallow Copy**, not a Deep Copy.
* Capacity represents the number of buckets, not the number of stored elements.
* Default Capacity is **16**.
* Default Load Factor is **0.75**.
* Rehashing occurs automatically when the threshold is exceeded.
* The methods available in your code depend on the **reference type** (`Collection`, `Set`, or `HashSet`), even when the object is a `HashSet`.


# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor                                    | Time Complexity |           Space Complexity |
| ---------------------------------------------- | --------------: | -------------------------: |
| HashSet()                                      |            O(1) |                       O(1) |
| HashSet(int initialCapacity)                   |            O(1) | O(n) *(allocates buckets)* |
| HashSet(int initialCapacity, float loadFactor) |            O(1) | O(n) *(allocates buckets)* |
| HashSet(Collection<? extends E>)               |            O(n) |                       O(n) |

---

## HashSet Specific Methods

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
> Since Java 8, buckets are converted into **Red-Black Trees** when many collisions occur.
>
> This improves worst-case lookup from **O(n)** to **O(log n)** for heavily-collided buckets.

---

# When Should You Use These Constructors?

## HashSet()

Use when:

* Number of elements is unknown.
* Most commonly used constructor.
* Default settings are sufficient.

Example

```java id="7lnq9x"
HashSet<String> names =
        new HashSet<>();
```

---

## HashSet(int initialCapacity)

Use when:

* Approximate number of elements is already known.
* Avoid repeated rehashing.

Example

```java id="8u0pzg"
HashSet<Employee> employees =
        new HashSet<>(5000);
```

---

## HashSet(int initialCapacity, float loadFactor)

Use when:

* Fine control over memory and performance is required.
* Performance-critical applications.
* Large datasets.

Example

```java id="tzzj1g"
HashSet<Integer> numbers =
        new HashSet<>(100000, 0.75f);
```

---

## HashSet(Collection)

Use when:

* Converting another Collection into a HashSet.
* Removing duplicate elements from another Collection.

Example

```java id="1hqlca"
List<Integer> list =
        Arrays.asList(10,20,30,20);

HashSet<Integer> set =
        new HashSet<>(list);
```

---

## clone()

Use when:

* Need another HashSet containing the same elements.
* A shallow copy is sufficient.

---

# Capacity vs Size

This is one of the most frequently asked interview questions.

## Capacity

The total number of buckets available in the internal Hash Table.

Example

```text id="dizgxu"
Capacity = 16
```

---

## Size

The actual number of stored elements.

Example

```text id="d4sujb"
Capacity = 16

Size = 7
```

---

## Example

```java id="nkjlwm"
HashSet<Integer> set =
        new HashSet<>(32);

set.add(10);
set.add(20);
```

Output

```text id="67e2ik"
Capacity = 32

Size = 2
```

---

# Load Factor vs Threshold

Another common interview topic.

## Load Factor

Represents how full the Hash Table can become before resizing.

```text id="m5vm1w"
Default = 0.75
```

---

## Threshold

Represents the maximum number of elements allowed before rehashing.

Formula

```text id="n2cbqg"
Threshold = Capacity × Load Factor
```

Example

```text id="m6k0lg"
Capacity = 16

Load Factor = 0.75

Threshold = 12
```

When the 13th element is inserted,

HashSet automatically performs **rehashing**.

---

# Shallow Copy vs Deep Copy

## clone()

Creates a **Shallow Copy**.

```text id="33sahm"
Original HashSet

↓

Java

Python

↓

Clone HashSet

↓

Java

Python
```

Only the HashSet object is copied.

The stored objects are **not cloned**.

---

## Deep Copy

Every object inside the collection is also copied.

```text id="pncphc"
Original Object

↓

New Object

↓

Completely Independent
```

`HashSet.clone()` does **not** perform a deep copy.

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
* Improves future performance.

---

# Frequently Asked Interview Questions

## Q1. Which interface does HashSet implement?

```java id="hjlwmk"
Set
```

Indirectly,

```text id="yjlwmf"
HashSet

↓

Set

↓

Collection

↓

Iterable
```

---

## Q2. Which data structure does HashSet use internally?

```text id="8eq4v5"
Hash Table
```

(Java 8+ may use Red-Black Trees for heavily-collided buckets.)

---

## Q3. Does HashSet maintain insertion order?

No.

HashSet does **not** guarantee any ordering of elements.

---

## Q4. Does HashSet allow duplicate elements?

No.

Duplicate elements are ignored automatically.

---

## Q5. Does HashSet allow null?

Yes.

Only **one null element** can be stored.

---

## Q6. Why is HashSet faster than TreeSet?

Because HashSet uses **Hashing**,

while TreeSet uses a **Red-Black Tree**.

Average Complexity

```text id="4abajh"
HashSet → O(1)

TreeSet → O(log n)
```

---

## Q7. What is the default capacity of HashSet?

```text id="r99imk"
16
```

(created lazily after the first insertion in modern JDKs)

---

## Q8. What is the default load factor?

```text id="mw7cgt"
0.75
```

---

## Q9. What is rehashing?

When the number of stored elements exceeds the threshold,

HashSet creates a larger Hash Table and redistributes all elements.

---

## Q10. Which method is introduced by HashSet?

```java id="y2bkrm"
clone()
```

---

## Q11. Are Collection methods copied into HashSet?

No.

They are **inherited** through the interface hierarchy.

```text id="hcx2du"
Iterable
      ↑
Collection
      ↑
Set
      ↑
HashSet
```

---

## Q12. Why can't we call clone() using a Set reference?

```java id="g1mow0"
Set<Integer> set =
        new HashSet<>();

set.clone();      // ❌
```

Because `clone()` belongs to the **HashSet** class,

not the **Set** interface.

---

## Q13. Why is equals() important in HashSet?

After locating the bucket using `hashCode()`,

HashSet uses `equals()` to determine whether an element already exists.

---

## Q14. What happens if hashCode() and equals() are not properly overridden?

Duplicate logical objects may be stored,

and searching/removal may produce incorrect results.

---

# Summary

* `HashSet` is the most commonly used implementation of the `Set` interface.
* Internally uses a **Hash Table**.
* Stores only **unique elements**.
* Allows **one null element**.
* Does **not maintain insertion order**.
* Inherits methods from `Iterable`, `Collection`, and `Set`.
* Provides four constructors and one primary public method:

    * `clone()`
* Uses **Capacity**, **Load Factor**, **Threshold**, and **Rehashing** to maintain performance.
* Suitable when fast searching, insertion, and deletion are more important than maintaining order.
