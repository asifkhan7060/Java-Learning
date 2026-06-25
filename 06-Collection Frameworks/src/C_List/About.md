# Java List Interface

## What is List?

`List` is a child interface of the `Collection` interface.

It represents an **ordered collection** of elements where duplicate values are allowed and each element has an index.

```java
public interface List<E> extends Collection<E>
```

---

# List Hierarchy

```text
Iterable
    ↑
Collection
    ↑
   List
 ┌──┼─────┐
 ↓  ↓     ↓
ArrayList LinkedList Vector
                       ↑
                     Stack
```

---

# Features of List

- Ordered Collection
- Maintains Insertion Order
- Allows Duplicate Elements
- Allows Multiple Null Values
- Index Based Access
- Dynamic Size
- Supports Generics
- Can Traverse using Iterator, ListIterator and For-Each Loop

---

# Types of List Implementations

## 1. ArrayList

### Description

- Internally uses Dynamic Array
- Fast Random Access
- Slow Insertion/Deletion in Middle
- Most commonly used List implementation

### Example

```java
List<Integer> list = new ArrayList<>();
```

---

## 2. LinkedList

### Description

- Internally uses Doubly Linked List
- Fast Insertion and Deletion
- Slower Random Access
- Also implements Deque

### Example

```java
List<Integer> list = new LinkedList<>();
```

---

## 3. Vector

### Description

- Dynamic Array
- Thread Safe (Synchronized)
- Slower than ArrayList
- Legacy Class

### Example

```java
List<Integer> list = new Vector<>();
```

---

## 4. Stack

### Description

- Child class of Vector
- Follows LIFO (Last In First Out)
- Legacy Class

### Example

```java
Stack<Integer> stack = new Stack<>();
```

---

# Difference Between List Implementations

| Feature | ArrayList | LinkedList | Vector |
|----------|-----------|------------|---------|
| Data Structure | Dynamic Array | Doubly Linked List | Dynamic Array |
| Insertion | Slow | Fast | Slow |
| Deletion | Slow | Fast | Slow |
| Random Access | Fast | Slow | Fast |
| Thread Safe | No | No | Yes |
| Performance | Fast | Moderate | Slow |

---

# Methods Inherited from Collection

Since List extends Collection, it inherits all Collection methods.

```java
add()
addAll()

remove()
removeAll()
retainAll()

contains()
containsAll()

size()
isEmpty()

clear()

toArray()
toArray(T[])

stream()
parallelStream()

equals()
hashCode()
```

---

# Additional Methods Provided by List

List provides many additional methods that are **not available in Collection**.

---

## 1. get()

Returns element at a specific index.

### Syntax

```java
E get(int index)
```

### Example

```java
list.get(0);
```

---

## 2. set()

Replaces element at specified index.

### Syntax

```java
E set(int index, E element)
```

### Example

```java
list.set(1, 50);
```

---

## 3. add(index, element)

Inserts an element at specified index.

### Syntax

```java
void add(int index, E element)
```

### Example

```java
list.add(1, 100);
```

---

## 4. addAll(index, collection)

Inserts all elements at specified index.

### Syntax

```java
boolean addAll(int index, Collection<? extends E> c)
```

### Example

```java
list.addAll(2, anotherList);
```

---

## 5. remove(index)

Removes element using index.

### Syntax

```java
E remove(int index)
```

### Example

```java
list.remove(2);
```

---

## 6. indexOf()

Returns first occurrence index.

### Syntax

```java
int indexOf(Object o)
```

### Example

```java
list.indexOf(20);
```

---

## 7. lastIndexOf()

Returns last occurrence index.

### Syntax

```java
int lastIndexOf(Object o)
```

### Example

```java
list.lastIndexOf(20);
```

---

## 8. listIterator()

Returns a ListIterator object.

### Syntax

```java
ListIterator<E> listIterator()
```

### Example

```java
ListIterator<Integer> it = list.listIterator();
```

---

## 9. listIterator(index)

Returns ListIterator starting from a specific index.

### Syntax

```java
ListIterator<E> listIterator(int index)
```

### Example

```java
ListIterator<Integer> it = list.listIterator(2);
```

---

## 10. subList()

Returns a portion of the list.

### Syntax

```java
List<E> subList(int fromIndex, int toIndex)
```

### Example

```java
List<Integer> sub = list.subList(1,4);
```

---

## 11. replaceAll()

Replaces every element using a function.

### Syntax

```java
void replaceAll(UnaryOperator<E> operator)
```

### Example

```java
list.replaceAll(n -> n * 2);
```

---

## 12. sort()

Sorts the list.

### Syntax

```java
void sort(Comparator<? super E> c)
```

### Example

```java
list.sort(Integer::compareTo);
```

---

# Ways to Traverse a List

## 1. Enhanced For Loop

```java
for(Integer value : list)
{
    System.out.println(value);
}
```

---

## 2. Iterator

```java
Iterator<Integer> it = list.iterator();

while(it.hasNext())
{
    System.out.println(it.next());
}
```

---

## 3. ListIterator

```java
ListIterator<Integer> it = list.listIterator();

while(it.hasNext())
{
    System.out.println(it.next());
}
```

---

## 4. Spliterator

```java
Spliterator<Integer> sp = list.spliterator();

sp.forEachRemaining(System.out::println);
```

---

## 5. Stream

```java
list.stream().forEach(System.out::println);
```

---

# Interview Questions

### Q1. What is List?

An ordered collection that allows duplicate elements and supports index-based access.

---

### Q2. Which interface does List extend?

```java
Collection
```

---

### Q3. Does List allow duplicate elements?

Yes.

---

### Q4. Does List maintain insertion order?

Yes.

---

### Q5. Can List store null values?

Yes, multiple null values are allowed (implementation dependent, e.g., ArrayList).

---

### Q6. Which List implementation is most commonly used?

```java
ArrayList
```

---

### Q7. Which List implementation is thread-safe?

```java
Vector
```

---

### Q8. Which List implementation is best for frequent insertions and deletions?

```java
LinkedList
```

---

### Q9. Which methods are exclusive to List?

```java
get()
set()
add(index, element)
addAll(index, collection)
remove(index)
indexOf()
lastIndexOf()
listIterator()
listIterator(index)
subList()
replaceAll()
sort()
```

---

### Q10. Why use List instead of Collection?

Because List provides:

- Ordered elements
- Index-based access
- Position-specific insertion and deletion
- Searching by index
- Bidirectional traversal using ListIterator