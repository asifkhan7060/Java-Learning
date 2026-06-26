# TreeSet Method Hierarchy

## Overview

`TreeSet` is an implementation of the `NavigableSet` interface in the Java Collection Framework.

It internally stores elements using a **Red-Black Tree**, which provides:

* Automatically Sorted Elements
* Fast Search Operations
* Fast Insertion
* Fast Deletion
* Unique Elements
* Navigation Operations
* Range-Based Operations
* No Index-Based Access
* Does **Not** Allow Null Elements

Since `TreeSet` implements the `NavigableSet` interface, it automatically inherits methods from:

* `Iterable`
* `Collection`
* `Set`
* `SortedSet`
* `NavigableSet`

Additionally, `TreeSet` provides its own constructors but does **not** introduce any new public methods.

---

# Class Declaration

```java
public class TreeSet<E>
        extends AbstractSet<E>
        implements NavigableSet<E>,
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
SortedSet
    ↑
NavigableSet
    ↑
AbstractCollection
    ↑
AbstractSet
    ↑
TreeSet
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
SortedSet
     ↑
NavigableSet
     ↑
TreeSet
```

---

# Complete TreeSet Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
TreeSet<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ TreeSet()
├── ✅ TreeSet(Collection<? extends E> c)
├── ✅ TreeSet(Comparator<? super E> comparator)
└── ✅ TreeSet(SortedSet<E> s)

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
│ Methods Inherited from SortedSet
├──────────────────────────────────────────────
│
├── ✅ first()
├── ✅ last()
├── ✅ headSet(E toElement)
├── ✅ tailSet(E fromElement)
├── ✅ subSet(E fromElement,
│            E toElement)
└── ✅ comparator()

│
├──────────────────────────────────────────────
│ Methods Inherited from NavigableSet
├──────────────────────────────────────────────
│
├── ✅ lower(E e)
├── ✅ floor(E e)
├── ✅ ceiling(E e)
├── ✅ higher(E e)
│
├── ✅ pollFirst()
├── ✅ pollLast()
│
├── ✅ descendingSet()
├── ✅ descendingIterator()
│
├── ✅ subSet(E fromElement,
│            boolean fromInclusive,
│            E toElement,
│            boolean toInclusive)
│
├── ✅ headSet(E toElement,
│             boolean inclusive)
│
└── ✅ tailSet(E fromElement,
              boolean inclusive)

│
├──────────────────────────────────────────────
│ TreeSet Specific Public Methods
├──────────────────────────────────────────────
│
└── No New Public Methods

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ iterator()
├── ✅ descendingIterator()
├── ✅ spliterator()
├── ✅ forEach()
└── 🆕 removeIf()

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

The methods available in a `TreeSet` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `TreeSet` class.

They are used to create `TreeSet` objects and are **not inherited**.

```java
TreeSet()

TreeSet(Collection<? extends E> c)

TreeSet(Comparator<? super E> comparator)

TreeSet(SortedSet<E> s)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `TreeSet` object can use the methods defined in the `Iterable` interface.

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

every `TreeSet` inherits all `Collection` methods.

These methods perform common collection operations such as:

* Adding Elements
* Removing Elements
* Searching
* Converting to Arrays
* Stream Processing

---

## 4. Methods Inherited from Set

Like `HashSet` and `LinkedHashSet`,

the `Set` interface introduces **no new methods**.

It only guarantees that duplicate elements are not allowed.

All operations such as

* add()
* remove()
* contains()

are inherited from the `Collection` interface.

---

## 5. Methods Inherited from SortedSet

`SortedSet` introduces methods related to **sorted collections**.

Examples:

* first()
* last()
* headSet()
* tailSet()
* subSet()
* comparator()

These methods allow access to the smallest and largest elements, range views, and the sorting comparator.

---

## 6. Methods Inherited from NavigableSet

`NavigableSet` extends `SortedSet` and introduces navigation methods.

Examples:

* lower()
* floor()
* ceiling()
* higher()
* pollFirst()
* pollLast()
* descendingSet()
* descendingIterator()

These methods help navigate to nearby elements and create reverse-order or range views.

---

## 7. TreeSet Specific Methods

Unlike `ArrayList` and `HashSet`,

`TreeSet` does **not introduce any new public methods**.

Its primary contribution is its **internal implementation**, which uses a **Red-Black Tree**.

This provides:

* Automatic Sorting
* Efficient Navigation
* Range-Based Searching

---

## 8. Optimized Overrides

Some inherited methods are reimplemented inside `TreeSet` for better performance.

Examples:

* iterator()
* descendingIterator()
* spliterator()
* forEach()

These methods are optimized internally for the Red-Black Tree implementation.

---

## 9. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, a `TreeSet` object can also use methods like:

* toString()
* getClass()
* wait()
* notify()
* notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.

# Part 2 : TreeSet Specific Methods

---

## 1. TreeSet()

Creates an empty `TreeSet`.

### Syntax

```java
TreeSet<E> set = new TreeSet<>();
```

### Example

```java
TreeSet<Integer> numbers =
        new TreeSet<>();
```

### Purpose

* Creates an empty TreeSet.
* Stores unique elements.
* Automatically maintains elements in sorted order.
* Uses the natural ordering of elements.

### Note

Initially,

```text
Size = 0
```

Unlike `HashSet`,

TreeSet does **not** use a Hash Table.

It internally uses a **Red-Black Tree**.

---

## 2. TreeSet(Collection<? extends E> c)

Creates a `TreeSet` containing all elements from another collection.

### Syntax

```java
TreeSet<E> set =
        new TreeSet<>(collection);
```

### Example

```java
List<Integer> list =
        List.of(30,10,20,20,40);

TreeSet<Integer> set =
        new TreeSet<>(list);
```

Output

```text
10
20
30
40
```

### Purpose

* Copies all elements from another collection.
* Removes duplicate elements.
* Automatically sorts the elements.

### Note

The original collection remains unchanged.

---

## 3. TreeSet(Comparator<? super E> comparator)

Creates a `TreeSet` using a custom sorting order.

### Syntax

```java
TreeSet<E> set =
        new TreeSet<>(comparator);
```

### Example

```java
TreeSet<Integer> numbers =
        new TreeSet<>(Collections.reverseOrder());

numbers.add(30);
numbers.add(10);
numbers.add(20);

System.out.println(numbers);
```

Output

```text
30
20
10
```

### Purpose

Allows developers to define their own sorting logic.

Useful when natural ordering is not suitable.

### Note

If a Comparator is supplied,

TreeSet ignores the natural ordering.

---

## 4. TreeSet(SortedSet<E> s)

Creates a `TreeSet` containing all elements from another `SortedSet`.

### Syntax

```java
TreeSet<E> set =
        new TreeSet<>(sortedSet);
```

### Example

```java
SortedSet<Integer> numbers =
        new TreeSet<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);

TreeSet<Integer> copy =
        new TreeSet<>(numbers);
```

### Purpose

Creates another sorted collection while preserving the ordering.

### Note

The comparator (if any) is also preserved.

---

# SortedSet Methods

These methods are introduced by the `SortedSet` interface.

---

## 1. first()

Returns the smallest element.

### Syntax

```java
E first()
```

### Example

```java
TreeSet<Integer> set =
        new TreeSet<>();

set.add(30);
set.add(10);
set.add(20);

System.out.println(set.first());
```

Output

```text
10
```

---

## 2. last()

Returns the largest element.

### Syntax

```java
E last()
```

### Example

```java
System.out.println(set.last());
```

Output

```text
30
```

---

## 3. headSet()

Returns a view containing elements smaller than the specified element.

### Syntax

```java
SortedSet<E> headSet(E toElement)
```

### Example

```java
System.out.println(set.headSet(20));
```

Output

```text
[10]
```

---

## 4. tailSet()

Returns a view containing elements greater than or equal to the specified element.

### Syntax

```java
SortedSet<E> tailSet(E fromElement)
```

### Example

```java
System.out.println(set.tailSet(20));
```

Output

```text
[20, 30]
```

---

## 5. subSet()

Returns a view containing elements between two specified values.

### Syntax

```java
SortedSet<E> subSet(E fromElement,
                    E toElement)
```

### Example

```java
System.out.println(
        set.subSet(10,30));
```

Output

```text
[10,20]
```

---

## 6. comparator()

Returns the Comparator used for sorting.

### Syntax

```java
Comparator<? super E> comparator()
```

### Example

```java
System.out.println(
        set.comparator());
```

Output

```text
null
```

### Note

Returns `null` when natural ordering is used.

---

# NavigableSet Methods

These methods are introduced by the `NavigableSet` interface.

---

## 1. lower()

Returns the greatest element strictly less than the given element.

### Syntax

```java
E lower(E e)
```

### Example

```java
System.out.println(
        set.lower(20));
```

Output

```text
10
```

---

## 2. floor()

Returns the greatest element less than or equal to the given element.

### Syntax

```java
E floor(E e)
```

### Example

```java
System.out.println(
        set.floor(20));
```

Output

```text
20
```

---

## 3. ceiling()

Returns the smallest element greater than or equal to the given element.

### Syntax

```java
E ceiling(E e)
```

### Example

```java
System.out.println(
        set.ceiling(25));
```

Output

```text
30
```

---

## 4. higher()

Returns the smallest element strictly greater than the given element.

### Syntax

```java
E higher(E e)
```

### Example

```java
System.out.println(
        set.higher(20));
```

Output

```text
30
```

---

## 5. pollFirst()

Removes and returns the first element.

### Syntax

```java
E pollFirst()
```

### Example

```java
System.out.println(
        set.pollFirst());
```

Output

```text
10
```

---

## 6. pollLast()

Removes and returns the last element.

### Syntax

```java
E pollLast()
```

### Example

```java
System.out.println(
        set.pollLast());
```

Output

```text
30
```

---

## 7. descendingSet()

Returns a reverse-order **view** of the TreeSet.

### Syntax

```java
NavigableSet<E> descendingSet()
```

### Example

```java
System.out.println(
        set.descendingSet());
```

Output

```text
[30,20,10]
```

---

## 8. descendingIterator()

Returns an iterator that traverses the TreeSet in reverse order.

### Syntax

```java
Iterator<E> descendingIterator()
```

### Example

```java
Iterator<Integer> iterator =
        set.descendingIterator();

while(iterator.hasNext())
{
    System.out.println(iterator.next());
}
```

---

## 9. subSet(..., boolean)

Returns a view with inclusive or exclusive boundaries.

### Syntax

```java
NavigableSet<E> subSet(
        E fromElement,
        boolean fromInclusive,
        E toElement,
        boolean toInclusive)
```

### Example

```java
System.out.println(
set.subSet(10,true,
           30,false));
```

Output

```text
[10,20]
```

---

## 10. headSet(..., boolean)

Returns a view containing elements before the specified element.

### Syntax

```java
NavigableSet<E> headSet(
        E toElement,
        boolean inclusive)
```

### Example

```java
System.out.println(
set.headSet(20,true));
```

Output

```text
[10,20]
```

---

## 11. tailSet(..., boolean)

Returns a view containing elements after the specified element.

### Syntax

```java
NavigableSet<E> tailSet(
        E fromElement,
        boolean inclusive)
```

### Example

```java
System.out.println(
set.tailSet(20,false));
```

Output

```text
[30]
```

---

# Internal Working

Unlike `HashSet` and `LinkedHashSet`,

`TreeSet` internally uses a

```text
Red-Black Tree
```

Example

```text
Insert

30

10

40

20
```

Internally

```text
        30
       /  \
     10    40
       \
       20
```

The tree automatically balances itself after every insertion and deletion.

---

# Natural Ordering

When no Comparator is supplied,

TreeSet sorts elements according to their natural ordering.

Example

```java
TreeSet<Integer> set =
        new TreeSet<>();
```

Output

```text
10

20

30

40
```

---

# Comparator

A Comparator allows custom sorting.

Example

```java
TreeSet<Integer> set =
new TreeSet<>(
Collections.reverseOrder());
```

Output

```text
40

30

20

10
```

---

# Why Null is Not Allowed

TreeSet compares elements to maintain sorted order.

Example

```java
set.add(null);
```

Result

```text
NullPointerException
```

because `null` cannot be compared with other elements.

---

# Optimized Overrides

The following methods are optimized for the Red-Black Tree implementation.

```java
iterator()

descendingIterator()

spliterator()

forEach()

removeIf()
```

---

# Methods Not Covered Yet

The following methods exist in Java,

but are not covered in this project.

```java
SequencedSet methods
(Java 21+ support
through NavigableSet hierarchy)

reversed()
```

These methods will be covered in advanced Collection Framework topics.

---

# Important Notes

* Constructors are **not inherited**.
* `TreeSet` inherits methods from `Iterable`, `Collection`, `Set`, `SortedSet`, and `NavigableSet`.
* `TreeSet` introduces **no new public methods**.
* Internally uses a **Red-Black Tree**.
* Automatically maintains **sorted order**.
* Does **not allow null elements**.
* Duplicate elements are automatically ignored.
* Supports both **Natural Ordering** and **Comparator-based Ordering**.
* `headSet()`, `tailSet()`, `subSet()`, and `descendingSet()` return **views**, not new collections.
* The methods available in your code depend on the **reference type** (`Collection`, `Set`, `SortedSet`, `NavigableSet`, or `TreeSet`), even when the object is a `TreeSet`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor                      | Time Complexity | Space Complexity |
| -------------------------------- | --------------: | ---------------: |
| TreeSet()                        |            O(1) |             O(1) |
| TreeSet(Collection<? extends E>) |      O(n log n) |             O(n) |
| TreeSet(Comparator<? super E>)   |            O(1) |             O(1) |
| TreeSet(SortedSet<E>)            |            O(n) |             O(n) |

> **Note**
>
> `TreeSet(SortedSet<E>)` is optimized because the source collection is already sorted.

---

## SortedSet Methods

| Method       | Time Complexity | Space Complexity |
| ------------ | --------------: | ---------------: |
| first()      |        O(log n) |             O(1) |
| last()       |        O(log n) |             O(1) |
| headSet()    |   O(1) *(View)* |             O(1) |
| tailSet()    |   O(1) *(View)* |             O(1) |
| subSet()     |   O(1) *(View)* |             O(1) |
| comparator() |            O(1) |             O(1) |

---

## NavigableSet Methods

| Method                             |   Time Complexity | Space Complexity |
| ---------------------------------- | ----------------: | ---------------: |
| lower()                            |          O(log n) |             O(1) |
| floor()                            |          O(log n) |             O(1) |
| ceiling()                          |          O(log n) |             O(1) |
| higher()                           |          O(log n) |             O(1) |
| pollFirst()                        |          O(log n) |             O(1) |
| pollLast()                         |          O(log n) |             O(1) |
| descendingSet()                    |     O(1) *(View)* |             O(1) |
| descendingIterator()               | O(1) *(Creation)* |             O(1) |
| headSet(..., boolean)              |     O(1) *(View)* |             O(1) |
| tailSet(..., boolean)              |     O(1) *(View)* |             O(1) |
| subSet(..., boolean, ..., boolean) |     O(1) *(View)* |             O(1) |

---

# Average Time Complexity of Common Operations

| Operation  |  Average | Worst Case |
| ---------- | -------: | ---------: |
| add()      | O(log n) |   O(log n) |
| remove()   | O(log n) |   O(log n) |
| contains() | O(log n) |   O(log n) |
| iterator() |     O(n) |       O(n) |
| clear()    |     O(n) |       O(1) |

> **Note**
>
> Since TreeSet uses a self-balancing **Red-Black Tree**, insertion, deletion and searching always require **O(log n)** time.

---

# When Should You Use These Constructors?

## TreeSet()

Use when:

* Natural sorting is required.
* Elements implement `Comparable`.
* Most commonly used constructor.

Example

```java id="yhj67m"
TreeSet<Integer> numbers =
        new TreeSet<>();
```

---

## TreeSet(Collection)

Use when:

* Converting another Collection into a sorted Set.
* Removing duplicates and sorting simultaneously.

Example

```java id="wkj09b"
List<Integer> list =
        Arrays.asList(40,20,10,20);

TreeSet<Integer> set =
        new TreeSet<>(list);
```

---

## TreeSet(Comparator)

Use when:

* Custom sorting is required.
* Descending order.
* Domain-specific ordering.

Example

```java id="u7xb92"
TreeSet<String> names =
new TreeSet<>(
Collections.reverseOrder());
```

---

## TreeSet(SortedSet)

Use when:

* Copying another sorted collection.
* Preserving the existing comparator.

Example

```java id="vm45ep"
SortedSet<Integer> source =
        new TreeSet<>();

TreeSet<Integer> copy =
        new TreeSet<>(source);
```

---

# Natural Ordering vs Comparator

## Natural Ordering

Uses the element's

```java id="sqbx53"
Comparable
```

implementation.

Example

```text id="wgom1e"
10

20

30

40
```

---

## Comparator

Uses a custom comparison object.

Example

```text id="zg1gcj"
40

30

20

10
```

---

## Difference

| Natural Ordering     | Comparator                |
| -------------------- | ------------------------- |
| Uses Comparable      | Uses Comparator           |
| Built into the class | External comparison logic |
| One ordering         | Multiple custom orderings |

---

# Comparable vs Comparator

## Comparable

Implemented inside the class.

```java id="zkm9cm"
class Student
implements Comparable<Student>
```

Method

```java id="a2zqrd"
compareTo()
```

---

## Comparator

Implemented separately.

```java id="7mxw1v"
class AgeComparator
implements Comparator<Student>
```

Method

```java id="4xygkk"
compare()
```

---

# Why TreeSet Does Not Allow Null

TreeSet continuously compares elements while inserting them.

Example

```java id="8c5c9u"
set.add(null);
```

Result

```text id="zw57z0"
NullPointerException
```

because `null` cannot participate in comparison operations.

---

# Red-Black Tree

TreeSet internally stores elements using a

```text id="c9paxw"
Red-Black Tree
```

Advantages

* Automatically balanced
* Sorted data
* Fast searching
* Fast insertion
* Fast deletion

Example

```text id="h1mvsr"
        40
       /  \
     20    60
    / \    / \
   10 30 50 70
```

After every insertion or deletion,

the tree automatically balances itself.

---

# Why TreeSet is Slower than HashSet

## HashSet

```text id="f0v07v"
Hash Table
```

Average Operations

```text id="qv87q4"
O(1)
```

---

## TreeSet

```text id="0klmx7"
Red-Black Tree
```

Operations

```text id="sggv2s"
O(log n)
```

Reason

Every insertion, deletion and searching requires traversing the tree.

---

# View Collections

The following methods return **views**, not new collections.

```java id="zv7dkg"
headSet()

tailSet()

subSet()

descendingSet()
```

Changes made to the returned view are reflected in the original TreeSet.

---

# Important Notes

### Constructors

* Constructors are **not inherited**.
* Used only for object creation.

---

### Sorting

* Elements remain sorted automatically.
* No explicit sorting is required.

---

### Comparator

* Overrides natural ordering.
* Allows custom sorting logic.

---

### Null Values

* TreeSet does **not** allow null elements.
* Inserting null throws `NullPointerException`.

---

### Views

* `headSet()`, `tailSet()`, `subSet()`, and `descendingSet()` return **views**, not copies.

---

### Internal Structure

* Uses a self-balancing **Red-Black Tree**.
* Height remains logarithmic.

---

# Frequently Asked Interview Questions

## Q1. Which interface does TreeSet implement?

```java id="zyr4vb"
NavigableSet
```

Indirectly,

```text id="xjlwm9"
TreeSet

↓

NavigableSet

↓

SortedSet

↓

Set

↓

Collection

↓

Iterable
```

---

## Q2. Which data structure does TreeSet use internally?

```text id="dcj0mp"
Red-Black Tree
```

---

## Q3. Does TreeSet maintain insertion order?

No.

It maintains **sorted order**, not insertion order.

---

## Q4. Does TreeSet allow duplicate elements?

No.

Duplicate elements are ignored automatically.

---

## Q5. Does TreeSet allow null?

No.

`NullPointerException` is thrown.

---

## Q6. Why is TreeSet slower than HashSet?

Because TreeSet uses a **Red-Black Tree**,

while HashSet uses a **Hash Table**.

---

## Q7. Which methods are introduced by SortedSet?

```java id="8j4jzb"
first()

last()

headSet()

tailSet()

subSet()

comparator()
```

---

## Q8. Which methods are introduced by NavigableSet?

```java id="u20b6j"
lower()

floor()

ceiling()

higher()

pollFirst()

pollLast()

descendingSet()

descendingIterator()
```

---

## Q9. When should Comparator be used?

When custom sorting logic is required.

---

## Q10. What is the difference between Comparable and Comparator?

* `Comparable` defines the natural ordering inside the class.
* `Comparator` provides external custom ordering.

---

## Q11. Why does TreeSet require Comparable or Comparator?

Because every insertion requires comparing elements to determine their correct position in the Red-Black Tree.

---

## Q12. Why are headSet(), tailSet(), and subSet() fast?

They return **views** backed by the original TreeSet instead of creating new collections.

---

## Q13. Why doesn't TreeSet provide index-based access?

Because it is implemented using a tree structure, not an array.

---

## Q14. When should TreeSet be preferred over HashSet?

When:

* Elements must remain sorted.
* Navigation operations are required.
* Range queries are frequently performed.

---

## Q15. When should TreeSet be preferred over LinkedHashSet?

When automatic sorting is more important than preserving insertion order.

---

# Summary

* `TreeSet` implements the `NavigableSet` interface.
* Internally uses a **Red-Black Tree**.
* Stores only **unique elements**.
* Automatically maintains **sorted order**.
* Does **not** maintain insertion order.
* Does **not** allow null elements.
* Inherits methods from `Iterable`, `Collection`, `Set`, `SortedSet`, and `NavigableSet`.
* Introduces **no new public methods** but gains powerful functionality from `SortedSet` and `NavigableSet`.
* Supports both **Natural Ordering** and **Comparator-based Ordering**.
* Ideal for applications requiring sorting, navigation, and range-based operations.
