# Collection vs Collections

One of the most common interview questions in Java is:

> **What is the difference between `Collection` and `Collections`?**

Although their names are almost the same, they are completely different.

---

# Collection

## What is Collection?

`Collection` is an **interface**.

It is the **root interface** of the Java Collection Framework.

```java
public interface Collection<E> extends Iterable<E> {
}
```

It is used to **store and manage a group of objects**.

---

## Collection Hierarchy

```text
Iterable
    │
    ▼
Collection
 ├── List
 ├── Set
 └── Queue
```

Examples:

```java
List<String> list = new ArrayList<>();

Set<Integer> set = new HashSet<>();

Queue<String> queue = new LinkedList<>();
```

Here,

* `List`
* `Set`
* `Queue`

all extend the `Collection` interface.

---

## Purpose

Collection is a **container** that stores data.

Example:

```text
Collection

[10, 20, 30, 40]
```

---

# Collections

Notice the **'s'** at the end.

`Collections` is **not an interface**.

It is a **Utility Class**.

Package:

```text
java.util
```

Declaration:

```java
public final class Collections {
}
```

---

## Where is Collections in Java?

Unlike `Collection`, it is **not part of the Collection hierarchy**.

It simply exists inside the `java.util` package.

```text
java.util
│
├── Collection      (Interface)
├── List            (Interface)
├── Set             (Interface)
├── Queue           (Interface)
├── Map             (Interface)
│
├── ArrayList
├── LinkedList
├── HashSet
├── HashMap
│
├── Collections     ← Utility Class
├── Arrays          ← Utility Class
└── Objects         ← Utility Class
```

---

## Does Collections Extend Anything?

Like every Java class,

`Collections` extends `Object`.

```java
public final class Collections extends Object {
}
```

Normally Java writes only:

```java
public final class Collections {
}
```

because extending `Object` is automatic.

---

## Does Collections Implement Any Interface?

No.

```java
public final class Collections {
}
```

It

* ❌ does not implement `Collection`
* ❌ does not implement `List`
* ❌ does not implement `Set`
* ❌ does not implement `Queue`
* ❌ does not implement `Map`

It is simply a helper class.

---

# Why Do We Need Collections?

Suppose you already have a list.

```java
ArrayList<Integer> nums = new ArrayList<>();
```

Now you want to

* sort it
* reverse it
* shuffle it
* find minimum
* find maximum

Instead of writing these algorithms yourself,

Java provides the `Collections` utility class.

---

# Example

```java
ArrayList<Integer> nums = new ArrayList<>();

nums.add(30);
nums.add(10);
nums.add(20);
```

Current List

```text
[30, 10, 20]
```

---

## Sorting

```java
Collections.sort(nums);
```

Output

```text
[10, 20, 30]
```

---

## Reverse

```java
Collections.reverse(nums);
```

Output

```text
[30, 20, 10]
```

---

## Shuffle

```java
Collections.shuffle(nums);
```

Possible Output

```text
[20, 30, 10]
```

---

## Minimum

```java
Collections.min(nums);
```

Output

```text
10
```

---

## Maximum

```java
Collections.max(nums);
```

Output

```text
30
```

---

# Why Don't We Create Its Object?

Almost every method inside `Collections` is **static**.

Example

```java
Collections.sort(nums);

Collections.reverse(nums);

Collections.shuffle(nums);
```

We never write

```java
Collections c = new Collections(); // Not used

c.sort(nums);
```

because static methods belong to the class itself.

---

# Real-Life Analogy

Imagine you have a **school bag**.

The bag stores books.

```text
Bag
├── Book
├── Notebook
└── Pen
```

The bag is like **Collection**.

Now imagine different tools.

```text
Arrange Books

Reverse Books

Shuffle Books

Find Smallest Book

Find Largest Book
```

These tools are like **Collections**.

They don't store anything.

They simply perform operations.

---

# Important Methods of Collections

## 1. Sorting

```java
Collections.sort(list);

Collections.sort(list, comparator);
```

Purpose:

Sorts the collection.

---

## 2. Searching

```java
Collections.binarySearch(list, key);

Collections.binarySearch(list, key, comparator);
```

Purpose:

Searches an element in a sorted list.

---

## 3. Reverse

```java
Collections.reverse(list);
```

Purpose:

Reverses the order of elements.

---

## 4. Shuffle

```java
Collections.shuffle(list);

Collections.shuffle(list, random);
```

Purpose:

Randomly rearranges elements.

---

## 5. Swap

```java
Collections.swap(list, index1, index2);
```

Purpose:

Swaps two elements.

---

## 6. Rotate

```java
Collections.rotate(list, distance);
```

Example

Before

```text
[A, B, C, D]
```

After

```java
Collections.rotate(list,1);
```

Output

```text
[D, A, B, C]
```

---

## 7. Fill

```java
Collections.fill(list, value);
```

Purpose

Replaces every element with the given value.

---

## 8. Copy

```java
Collections.copy(destination, source);
```

Purpose

Copies one list into another.

---

## 9. Replace

```java
Collections.replaceAll(list, oldValue, newValue);
```

Purpose

Replaces matching elements.

---

## 10. Frequency

```java
Collections.frequency(collection, object);
```

Example

```text
[1,2,2,3]
```

```java
Collections.frequency(list,2);
```

Output

```text
2
```

---

## 11. Minimum

```java
Collections.min(collection);
```

Returns the smallest element.

---

## 12. Maximum

```java
Collections.max(collection);
```

Returns the largest element.

---

## 13. Disjoint

```java
Collections.disjoint(c1,c2);
```

Checks whether two collections have no common elements.

---

## 14. Empty Collections

```java
Collections.emptyList();

Collections.emptySet();

Collections.emptyMap();
```

Returns immutable empty collections.

---

## 15. Singleton Collections

```java
Collections.singleton(value);

Collections.singletonList(value);

Collections.singletonMap(key,value);
```

Creates immutable collections containing exactly one element.

---

## 16. Unmodifiable Collections

```java
Collections.unmodifiableList(list);

Collections.unmodifiableSet(set);

Collections.unmodifiableMap(map);
```

Creates read-only collections.

---

## 17. Synchronized Collections

```java
Collections.synchronizedList(list);

Collections.synchronizedSet(set);

Collections.synchronizedMap(map);
```

Creates thread-safe collections.

---

## 18. Checked Collections

```java
Collections.checkedList(list,String.class);

Collections.checkedSet(set,Integer.class);

Collections.checkedMap(map,String.class,Integer.class);
```

Provides runtime type checking.

---

# Summary of Important Methods

| Category                | Methods                                                        |
| ----------------------- | -------------------------------------------------------------- |
| Sorting                 | `sort()`                                                       |
| Searching               | `binarySearch()`                                               |
| Reverse                 | `reverse()`                                                    |
| Shuffle                 | `shuffle()`                                                    |
| Swap                    | `swap()`                                                       |
| Rotate                  | `rotate()`                                                     |
| Fill                    | `fill()`                                                       |
| Copy                    | `copy()`                                                       |
| Replace                 | `replaceAll()`                                                 |
| Frequency               | `frequency()`                                                  |
| Min/Max                 | `min()`, `max()`                                               |
| Comparison              | `disjoint()`                                                   |
| Empty Collections       | `emptyList()`, `emptySet()`, `emptyMap()`                      |
| Singleton Collections   | `singleton()`, `singletonList()`, `singletonMap()`             |
| Read-Only Collections   | `unmodifiableList()`, `unmodifiableSet()`, `unmodifiableMap()` |
| Thread-Safe Collections | `synchronizedList()`, `synchronizedSet()`, `synchronizedMap()` |
| Runtime Type Checking   | `checkedList()`, `checkedSet()`, `checkedMap()`                |

---

# Collection vs Collections

| Collection                    | Collections                        |
| ----------------------------- | ---------------------------------- |
| Interface                     | Utility Class                      |
| Stores data                   | Provides utility methods           |
| Root of List, Set and Queue   | Contains static helper methods     |
| Represents a group of objects | Performs operations on collections |
| `java.util.Collection`        | `java.util.Collections`            |

---

# Memory Trick

## Collection

Think:

> **Container**

It stores data.

---

## Collections

Think:

> **Commands**

It performs operations like

* Sort
* Reverse
* Shuffle
* Swap
* Copy
* Rotate
* Find Min
* Find Max

---

# One-Line Definitions

> **Collection:** An interface used to store and manage a group of objects.

> **Collections:** A final utility class containing static methods that perform operations on Collection objects.


---

# Additional Utility Methods (Advanced)

These methods are available in the `Collections` class but are less commonly used compared to the core methods.

---

## 19. Enumeration Methods

### enumeration()

```java
Collections.enumeration(collection);
```

Converts a `Collection` into an `Enumeration`.

### list()

```java
Collections.list(enumeration);
```

Converts an `Enumeration` into an `ArrayList`.

---

## 20. nCopies()

```java
Collections.nCopies(int n, T obj);
```

Returns an immutable list containing `n` copies of the specified object.

Example:

```java
List<String> list = Collections.nCopies(5, "Java");
```

Output:

```text
[Java, Java, Java, Java, Java]
```

---

## 21. indexOfSubList()

```java
Collections.indexOfSubList(source, target);
```

Returns the starting index of the first occurrence of the target list inside the source list.

---

## 22. lastIndexOfSubList()

```java
Collections.lastIndexOfSubList(source, target);
```

Returns the starting index of the last occurrence of the target list.

---

## 23. Reverse Order Comparator

```java
Collections.reverseOrder();

Collections.reverseOrder(comparator);
```

Returns a comparator that sorts elements in reverse order.

---

## 24. newSetFromMap()

```java
Collections.newSetFromMap(map);
```

Creates a `Set` backed by the specified `Map`.

---

## 25. asLifoQueue()

```java
Collections.asLifoQueue(deque);
```

Treats a `Deque` as a Last-In-First-Out (LIFO) Queue (Stack behavior).

---

## 26. Empty Iterator Utilities

```java
Collections.emptyIterator();

Collections.emptyListIterator();

Collections.emptyEnumeration();
```

Returns immutable empty iterator/enumeration objects.

---

## 27. Singleton Iterator Utilities

```java
Collections.singletonIterator(element);

Collections.singletonEnumeration(element);
```

Returns an iterator or enumeration containing exactly one element.

---

# Complete Method Categories

| Category | Methods |
|-----------|---------|
| Sorting | `sort()` |
| Searching | `binarySearch()` |
| Reverse | `reverse()` |
| Shuffle | `shuffle()` |
| Swap | `swap()` |
| Rotate | `rotate()` |
| Fill | `fill()` |
| Copy | `copy()` |
| Replace | `replaceAll()` |
| Frequency | `frequency()` |
| Min / Max | `min()`, `max()` |
| Comparison | `disjoint()` |
| Empty Collections | `emptyList()`, `emptySet()`, `emptyMap()` |
| Singleton Collections | `singleton()`, `singletonList()`, `singletonMap()` |
| Unmodifiable Collections | `unmodifiableList()`, `unmodifiableSet()`, `unmodifiableMap()` |
| Synchronized Collections | `synchronizedList()`, `synchronizedSet()`, `synchronizedMap()` |
| Checked Collections | `checkedList()`, `checkedSet()`, `checkedMap()` |
| Enumeration Utilities | `enumeration()`, `list()` |
| Multiple Copies | `nCopies()` |
| SubList Search | `indexOfSubList()`, `lastIndexOfSubList()` |
| Reverse Comparator | `reverseOrder()` |
| Map-backed Set | `newSetFromMap()` |
| LIFO Queue Adapter | `asLifoQueue()` |
| Empty Iterators | `emptyIterator()`, `emptyListIterator()`, `emptyEnumeration()` |
| Singleton Iterators | `singletonIterator()`, `singletonEnumeration()` |