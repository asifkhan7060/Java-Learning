# Java Collections and Iterator

## Table of Contents

1. Collection Interface
2. Collection Methods
3. Collection vs Collections
4. Iterator
5. Iterator Methods
6. ListIterator
7. ListIterator Methods
8. Spliterator
9. Spliterator Methods
10. Interview Questions

---

# Part 1 : Collection Interface

## What is Collection?

`Collection` is the root interface of the Java Collection Framework.

It represents a group of objects (elements).

```java
public interface Collection<E> extends Iterable<E>
```

### Features

* Dynamic Size
* Stores Objects
* Supports Generics
* Ready-made Methods
* Supports Iteration
* Parent of List, Set and Queue

---

## Collection Hierarchy

```text
Iterable
    ↑
Collection
 ┌────┼────┐
 ↓    ↓    ↓
List Set Queue
```

---

# Part 2 : Collection Methods

## add()

Adds a single element.

### Syntax

```java
boolean add(E e)
```

### Example

```java
nums.add(10);
nums.add(20);
```

### Output

```text
[10, 20]
```

---

## addAll()

Adds all elements from another collection.

### Syntax

```java
boolean addAll(Collection<? extends E> c)
```

### Example

```java
c1.addAll(c2);
```

### Output

```text
[10, 20]
```

---

## remove()

Removes a specific element.

### Syntax

```java
boolean remove(Object o)
```

### Example

```java
nums.remove(10);
```

---

## removeAll()

Removes all matching elements from another collection.

### Syntax

```java
boolean removeAll(Collection<?> c)
```

### Example

```java
nums.removeAll(removeList);
```

---

## retainAll()

Keeps only common elements.

### Syntax

```java
boolean retainAll(Collection<?> c)
```

### Example

```java
nums.retainAll(keepList);
```

---

## contains()

Checks whether an element exists.

### Syntax

```java
boolean contains(Object o)
```

### Example

```java
nums.contains(20);
```

### Output

```text
true
```

---

## containsAll()

Checks whether all elements of another collection exist.

### Syntax

```java
boolean containsAll(Collection<?> c)
```

### Example

```java
nums.containsAll(checkList);
```

---

## size()

Returns number of elements.

### Syntax

```java
int size()
```

### Example

```java
nums.size();
```

---

## isEmpty()

Checks whether collection is empty.

### Syntax

```java
boolean isEmpty()
```

### Example

```java
nums.isEmpty();
```

---

## clear()

Removes all elements.

### Syntax

```java
void clear()
```

### Example

```java
nums.clear();
```

---

## toArray()

Converts collection into Object array.

### Syntax

```java
Object[] toArray()
```

### Example

```java
Object[] arr = nums.toArray();
```

---

## toArray(T[] a)

Converts collection into typed array.

### Syntax

```java
<T> T[] toArray(T[] a)
```

### Example

```java
Integer[] arr = nums.toArray(new Integer[0]);
```

---

## equals()

Compares two collections.

### Syntax

```java
boolean equals(Object o)
```

### Example

```java
c1.equals(c2);
```

---

## hashCode()

Returns hash value.

### Syntax

```java
int hashCode()
```

### Example

```java
nums.hashCode();
```

---

# Collection vs Collections

| Collection                 | Collections                  |
| -------------------------- | ---------------------------- |
| Interface                  | Utility Class                |
| Stores Data                | Utility Methods              |
| Parent of List, Set, Queue | sort(), reverse(), shuffle() |
| java.util.Collection       | java.util.Collections        |

---

# Part 3 : Iterator

## What is Iterator?

Iterator is an interface used to traverse collection elements one by one.

```java
public interface Iterator<E>
```

---

## Relationship

```text
Iterable
    ↑
Collection
    │
    └── iterator()
            ↓
         Iterator
```

---

# Part 4 : Iterator Methods

## hasNext()

Checks whether another element exists.

### Syntax

```java
boolean hasNext()
```

### Example

```java
it.hasNext();
```

---

## next()

Returns next element.

### Syntax

```java
E next()
```

### Example

```java
it.next();
```

---

## remove()

Removes current element safely.

### Syntax

```java
void remove()
```

### Example

```java
it.remove();
```

---

## Iterator Example

```java
Iterator<Integer> it = nums.iterator();

while(it.hasNext())
{
    System.out.println(it.next());
}
```

---

# Part 5 : ListIterator

## What is ListIterator?

ListIterator extends Iterator.

```java
public interface ListIterator<E>
        extends Iterator<E>
```

Works only with List implementations.

---

# Part 6 : ListIterator Methods

## hasPrevious()

```java
boolean hasPrevious()
```

---

## previous()

```java
E previous()
```

---

## add()

```java
void add(E e)
```

---

## set()

```java
void set(E e)
```

---

## remove()

```java
void remove()
```

---

## Example

```java
ListIterator<Integer> it =
        nums.listIterator();
```

---

# Iterator vs ListIterator

| Feature            | Iterator | ListIterator |
| ------------------ | -------- | ------------ |
| Forward Traversal  | ✅        | ✅            |
| Backward Traversal | ❌        | ✅            |
| Add Element        | ❌        | ✅            |
| Update Element     | ❌        | ✅            |
| Remove Element     | ✅        | ✅            |

---

# Part 7 : Spliterator

## What is Spliterator?

Spliterator is an interface introduced in Java 8.

Used for:

* Streams API
* Parallel Processing
* Splitting Data

```java
public interface Spliterator<T>
```

---

# Part 8 : Spliterator Methods

## tryAdvance()

Processes one element at a time.

```java
boolean tryAdvance(Consumer<? super T> action)
```

---

## trySplit()

Splits data into multiple parts.

```java
Spliterator<T> trySplit()
```

---

## estimateSize()

Returns estimated size.

```java
long estimateSize()
```

---

## characteristics()

Returns collection characteristics.

```java
int characteristics()
```

---

## Example

```java
Spliterator<Integer> sp =
        nums.spliterator();
```

---

# Interview Questions

### Collection

* What is Collection?
* Does Map extend Collection?
* Why use Collection over Array?
* Difference between Collection and Collections?

### Iterator

* What is Iterator?
* What are hasNext() and next()?
* Can Iterator move backward?

### ListIterator

* What is ListIterator?
* Difference between Iterator and ListIterator?

### Spliterator

* What is Spliterator?
* Why was Spliterator introduced?
* What is its use in Streams API?

```
```
