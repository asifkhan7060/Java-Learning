# ArrayList Method Hierarchy

## Overview

`ArrayList` is the most commonly used implementation of the `List` interface in the Java Collection Framework.

It internally stores elements using a **Dynamic Array**, which provides:

- Fast Random Access
- Dynamic Resizing
- Ordered Collection
- Duplicate Elements
- Multiple Null Values
- Index-Based Operations

Since `ArrayList` implements the `List` interface, it automatically inherits methods from:

- `Iterable`
- `Collection`
- `List`

Additionally, `ArrayList` provides its own constructors and several class-specific methods.

---

# Class Declaration

```java
public class ArrayList<E>
        extends AbstractList<E>
        implements List<E>, RandomAccess,
                   Cloneable, Serializable
```

---

# Inheritance Hierarchy

```text
Iterable
    ↑
Collection
    ↑
List
    ↑
AbstractCollection
    ↑
AbstractList
    ↑
ArrayList
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
ArrayList
```

---

# Complete ArrayList Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
ArrayList<E>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ ArrayList()
├── ✅ ArrayList(int initialCapacity)
└── ✅ ArrayList(Collection<? extends E> c)

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
│ Methods Inherited from List
├──────────────────────────────────────────────
│
├── ✅ get(int index)
├── ✅ set(int index, E element)
│
├── ✅ add(int index, E element)
├── ✅ addAll(int index, Collection<? extends E> c)
│
├── ✅ remove(int index)
│
├── ✅ indexOf(Object o)
├── ✅ lastIndexOf(Object o)
│
├── ✅ listIterator()
├── ✅ listIterator(int index)
│
├── ✅ subList(int fromIndex, int toIndex)
│
├── ✅ replaceAll(UnaryOperator<E> operator)
└── ✅ sort(Comparator<? super E> c)

│
├──────────────────────────────────────────────
│ ArrayList Specific Public Methods
├──────────────────────────────────────────────
│
├── ✅ ensureCapacity(int minCapacity)
├── ✅ trimToSize()
└── ✅ clone()

│
├──────────────────────────────────────────────
│ Protected Method
├──────────────────────────────────────────────
│
└── 🔒 removeRange(int fromIndex, int toIndex)

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ forEach()
├── 🆕 removeIf()
├── ✅ replaceAll()
├── ✅ sort()
└── ✅ spliterator()

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

The methods available in an `ArrayList` object come from different levels of the Java Collection Framework.

## 1. Constructors

These belong directly to the `ArrayList` class.

They are used to create `ArrayList` objects and are **not inherited**.

```java
ArrayList()

ArrayList(int initialCapacity)

ArrayList(Collection<? extends E> c)
```

---

## 2. Methods Inherited from Iterable

Since

```java
Collection extends Iterable
```

every `ArrayList` object can use the methods defined in the `Iterable` interface.

These methods are mainly used for traversing elements.

Examples:

- iterator()
- spliterator()
- forEach()

---

## 3. Methods Inherited from Collection

Since

```java
List extends Collection
```

every `ArrayList` also inherits all `Collection` methods.

These methods perform common collection operations such as:

- Adding Elements
- Removing Elements
- Searching
- Converting to Arrays
- Stream Processing

---

## 4. Methods Inherited from List

The `List` interface adds support for **index-based operations**.

These methods are not available in the `Collection` interface.

Examples include:

- get()
- set()
- add(index)
- remove(index)
- listIterator()
- sort()

---

## 5. ArrayList Specific Methods

These methods belong only to the `ArrayList` class.

They are used to manage the internal dynamic array.

Examples:

- ensureCapacity()
- trimToSize()
- clone()

---

## 6. Optimized Overrides

Some methods are inherited from parent interfaces but are reimplemented inside `ArrayList` for better performance.

Examples:

- forEach()
- spliterator()
- replaceAll()
- sort()
- removeIf()

---

## 7. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore, an `ArrayList` object can also use methods like:

- toString()
- getClass()
- wait()
- notify()
- notifyAll()

These methods belong to `Object` and are **not specific to the Collection Framework**.

# Part 2 : ArrayList Specific Methods

---

## 1. ArrayList()

Creates an empty `ArrayList`.

### Syntax

```java
ArrayList<E> list = new ArrayList<>();
```

### Example

```java
ArrayList<String> names = new ArrayList<>();
```

### Purpose

- Creates an empty ArrayList.
- Most commonly used constructor.
- Capacity grows automatically when elements are added.

### Note

Initially,

```text
Size = 0
```

The internal array is allocated lazily.

When the first element is inserted,

the default capacity becomes **10** (Modern JDK).

---

## 2. ArrayList(int initialCapacity)

Creates an empty `ArrayList` with the specified initial capacity.

### Syntax

```java
ArrayList<E> list = new ArrayList<>(initialCapacity);
```

### Example

```java
ArrayList<Integer> numbers = new ArrayList<>(100);
```

### Purpose

Useful when the approximate number of elements is already known.

Reduces internal resizing and improves performance.

### Example

```text
Capacity = 100

Current Size = 0
```

The list can store up to 100 elements before growing.

### Note

Capacity and Size are different.

```text
Capacity → Maximum elements before resizing

Size → Current number of stored elements
```

---

## 3. ArrayList(Collection<? extends E> c)

Creates an `ArrayList` containing all elements from another collection.

### Syntax

```java
ArrayList<E> list = new ArrayList<>(collection);
```

### Example

```java
List<Integer> nums = List.of(10,20,30);

ArrayList<Integer> list = new ArrayList<>(nums);
```

### Purpose

- Copies all elements from another collection.
- Frequently used when converting a Collection into an ArrayList.

### Note

Only the elements are copied.

The original collection remains unchanged.

---

# ArrayList Specific Methods

Unlike Collection and List methods,

the following methods belong only to the `ArrayList` class.

---

## 1. ensureCapacity()

Ensures that the internal array has enough capacity.

If the required capacity is larger than the current capacity,

ArrayList expands the internal array.

### Syntax

```java
void ensureCapacity(int minCapacity)
```

### Example

```java
ArrayList<Integer> list = new ArrayList<>();

list.ensureCapacity(100);
```

### Purpose

- Reduces repeated resizing.
- Improves performance when many elements will be added.

### Note

If

```text
Current Capacity >= Requested Capacity
```

nothing happens.

Otherwise,

ArrayList increases its internal capacity.

---

## 2. trimToSize()

Reduces the internal capacity to match the current size.

### Syntax

```java
void trimToSize()
```

### Example

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

list.trimToSize();
```

### Purpose

- Reduces unused memory.
- Useful after removing many elements.

### Example

Before

```text
Capacity = 100

Size = 20
```

After

```text
Capacity = 20

Size = 20
```

---

## 3. clone()

Creates a **shallow copy** of the current ArrayList.

### Syntax

```java
Object clone()
```

### Example

```java
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");

ArrayList<String> copy =
        (ArrayList<String>) list.clone();
```

### Purpose

Creates another ArrayList containing the same elements.

### Note

`clone()` returns an **Object**.

Therefore,

type casting is required.

```java
(ArrayList<String>) list.clone();
```

---

### Shallow Copy

`clone()` performs a **shallow copy**.

The ArrayList object is copied,

but the objects stored inside it are **not cloned**.

Example

```text
Original List

↓

Apple
Banana

↓

Clone List

↓

Apple
Banana
```

Both lists reference the same objects.

---

# Optimized Overrides

The following methods are inherited,

but `ArrayList` provides optimized implementations for better performance.

```java
forEach()

replaceAll()

sort()

spliterator()
```

These methods behave exactly the same as defined in the parent interfaces,

but are optimized internally for the dynamic array implementation.

---

# Methods Not Covered Yet

The following methods exist in Java,

but are not covered in this project.

```java
removeIf(Predicate<? super E> filter)

toArray(IntFunction<T[]> generator)

protected removeRange(int fromIndex, int toIndex)
```

These methods will be covered in advanced Collection Framework topics.

---

# Important Notes

- Constructors are **not inherited**.
- `ArrayList` inherits most of its methods from `Iterable`, `Collection`, and `List`.
- `ensureCapacity()`, `trimToSize()`, and `clone()` are the primary public methods introduced by `ArrayList`.
- `clone()` creates a **shallow copy**, not a deep copy.
- `trimToSize()` reduces unused memory.
- `ensureCapacity()` improves performance by minimizing repeated resizing.
- The methods available in your code depend on the **reference type** (`Collection`, `List`, or `ArrayList`), even when the object is an `ArrayList`.

# Part 3 : Interview Notes, Time Complexity and Summary

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| ArrayList() | O(1) | O(1) |
| ArrayList(int initialCapacity) | O(1) | O(n) *(allocates capacity)* |
| ArrayList(Collection<? extends E>) | O(n) | O(n) |

---

## ArrayList Specific Methods

| Method | Time Complexity | Space Complexity |
|--------|----------------:|-----------------:|
| ensureCapacity() | O(n) *(if resizing occurs)*<br>O(1) *(otherwise)* | O(n) *(if resized)* |
| trimToSize() | O(n) | O(n) |
| clone() | O(n) | O(n) |

---

# When Should You Use These Methods?

## ArrayList()

Use when:

- Number of elements is unknown.
- Most commonly used constructor.

---

## ArrayList(int initialCapacity)

Use when:

- Approximate number of elements is already known.
- Avoid repeated internal resizing.

Example

```java
ArrayList<Employee> employees =
        new ArrayList<>(5000);
```

---

## ArrayList(Collection)

Use when:

- Converting another Collection into an ArrayList.
- Copying all elements into a new ArrayList.

Example

```java
Set<String> names = new HashSet<>();

ArrayList<String> list =
        new ArrayList<>(names);
```

---

## ensureCapacity()

Use when:

- Adding a large number of elements.
- Want to reduce resizing overhead.

Example

```java
list.ensureCapacity(100000);
```

---

## trimToSize()

Use when:

- Many elements have been removed.
- Want to reduce unused memory.

Example

```java
list.trimToSize();
```

---

## clone()

Use when:

- Need another ArrayList containing the same elements.
- A shallow copy is sufficient.

---

# Capacity vs Size

This is one of the most frequently asked interview questions.

## Capacity

The total number of elements the internal array can hold before resizing.

Example

```text
Capacity = 20
```

---

## Size

The actual number of elements currently stored.

Example

```text
Capacity = 20

Size = 7
```

---

## Example

```java
ArrayList<Integer> list = new ArrayList<>(100);

list.add(10);
list.add(20);
```

Output

```text
Capacity = 100

Size = 2
```

---

# Shallow Copy vs Deep Copy

## clone()

Creates a **Shallow Copy**.

```text
Original ArrayList

↓

Apple

Banana

↓

Clone ArrayList

↓

Apple

Banana
```

Only the ArrayList object is copied.

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

`ArrayList.clone()` does **not** perform a deep copy.

---

# Important Notes

### Constructors

- Constructors are **not inherited**.
- Used only for object creation.

---

### ensureCapacity()

- Improves performance.
- Reduces internal resizing.

---

### trimToSize()

- Reduces unused memory.
- Does not remove elements.

---

### clone()

- Returns an **Object**.
- Requires type casting.
- Creates a **Shallow Copy**.

---

### removeRange()

- Protected method.
- Cannot be called directly.
- Mainly used by subclasses.

---

# Frequently Asked Interview Questions

## Q1. Which interface does ArrayList implement?

```java
List
```

Indirectly,

```text
ArrayList

↓

List

↓

Collection

↓

Iterable
```

---

## Q2. Which data structure does ArrayList use internally?

```text
Dynamic Array
```

---

## Q3. Why is ArrayList faster than LinkedList for get(index)?

Because ArrayList supports direct index-based access.

---

## Q4. Why is insertion in the middle slower?

Because all subsequent elements must be shifted.

---

## Q5. Difference between Capacity and Size?

Capacity

```text
Internal array length.
```

Size

```text
Actual stored elements.
```

---

## Q6. Does clone() perform a deep copy?

No.

It performs a **Shallow Copy**.

---

## Q7. What is the default capacity of ArrayList?

Modern JDK:

```text
0 initially

↓

10 after first insertion
```

---

## Q8. Why use ensureCapacity()?

To reduce repeated resizing and improve performance.

---

## Q9. Why use trimToSize()?

To reduce unused memory.

---

## Q10. Which methods are introduced by ArrayList?

```java
ensureCapacity()

trimToSize()

clone()
```

---

## Q11. Are Collection methods copied into ArrayList?

No.

They are **inherited** through the interface hierarchy.

```text
Iterable
      ↑
Collection
      ↑
List
      ↑
ArrayList
```

---

## Q12. Why can't we call ensureCapacity() using a List reference?

```java
List<Integer> list = new ArrayList<>();

list.ensureCapacity(100);   // ❌
```

Because `ensureCapacity()` belongs to the **ArrayList** class, not the **List** interface.

---

# Summary

- `ArrayList` is the most commonly used implementation of the `List` interface.
- Internally uses a **Dynamic Array**.
- Supports fast random access.
- Inherits methods from `Iterable`, `Collection`, and `List`.
- Provides three public methods of its own:
  - `ensureCapacity()`
  - `trimToSize()`
  - `clone()`
- Supports automatic resizing.
- Suitable when random access is more frequent than insertion/deletion in the middle.