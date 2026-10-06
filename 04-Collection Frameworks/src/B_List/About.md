> **Scope of This MD:**  
> This document covers the **List interface**, **ArrayList**, and **LinkedList** in detail, including their important concepts, methods, internal working, performance, and usage.
>
> **`Vector` and `Stack` are legacy classes and are not covered in detail in this MD.**  
> Visit the **corresponding folder** for their in-depth study and implementation.

# Java List Interface

## What is List?

`List<E>` is an **ordered collection** that:

- Maintains insertion order
- Allows **duplicate elements** and **multiple nulls**
- Supports **index-based access** (`0`-based)

```java
import java.util.SequencedCollection;

public interface List<E> extends SequencedCollection<E>
```

### Hierarchy

```text
Iterable → Collection → List
                           ├── ArrayList
                           ├── LinkedList
                           ├── Vector
                           └── Stack (extends Vector)
```

---

## Why Multiple List Implementations?

The `List` interface defines **what** operations are possible; each implementation decides **how** those operations are performed.

Different applications may need:

- Fast random access
- Fast insertion/deletion
- Thread safety
- LIFO behavior

```java
List<Integer> list1 = new ArrayList<>();
List<Integer> list2 = new LinkedList<>();
List<Integer> list3 = new Vector<>();
List<Integer> list3 = new Stack<>();
```

> Choose the implementation based on the **access pattern and operation frequency**.

---

# List Implementations — Quick Comparison

| Feature | **ArrayList** | **LinkedList** | **Vector** | **Stack** |
|---------|:-------------:|:--------------:|:----------:|:---------:|
| Internal Structure | Dynamic Array | Doubly Linked List | Dynamic Array | Dynamic Array |
| `get(index)` | **O(1)** | O(n) | **O(1)** | **O(1)** |
| `add(end)` | **O(1)*** | **O(1)** | **O(1)*** | **O(1)*** |
| `add(index)` | O(n) | O(n)† | O(n) | O(n) |
| `remove(index)` | O(n) | O(n)† | O(n) | O(n) |
| Insert/Delete at Known Node | ❌ | ✅ O(1) | ❌ | ✅ at top |
| Memory | Low | High | Low | Low |
| Thread-Safe | ❌ | ❌ | ✅ | ✅ |
| Allows Duplicates | ✅ | ✅ | ✅ | ✅ |
| Allows `null` | ✅ Multiple | ✅ Multiple | ✅ Multiple | ✅ Multiple |
| Modern? | ✅ | ✅ | ❌ Legacy | ❌ Legacy |

> *Amortized O(1) for dynamic-array end insertion.
>
> † For `LinkedList`, reaching an indexed position requires traversal, so indexed insertion/removal is O(n) overall even though the actual node insertion/removal is O(1).

### Amortized O(1) — Simple Note

> **Dynamic Array End Insertion:** Usually takes **O(1)** because we simply add the element at the end. Occasionally, when the array is full, it resizes and takes **O(n)**. Overall, the average cost is **O(1)** → called **Amortized O(1)**.

**Example:**

```text
[10][20][30] → add 40 → resize + copy → O(n)
[10][20][30][40] → add 50 → simply add → O(1)
```

**In short:**
**Mostly O(1) + occasional O(n) resizing = Amortized O(1)**

---

# Core List Methods

## Inherited from Collection

```text
add()
addAll()
remove()
removeAll()
removeIf()
retainAll()
contains()
containsAll()
size()
isEmpty()
clear()
toArray()
stream()
parallelStream()
equals()
hashCode()
```

## List-Specific Methods

| Method | Purpose |
|--------|---------|
| `get(int index)` | Get element at index |
| `set(int index, E e)` | Replace element at index |
| `add(int index, E e)` | Insert at index |
| `addAll(int index, Collection c)` | Insert a collection at index |
| `remove(int index)` | Remove element at index |
| `indexOf(Object o)` | Find first occurrence |
| `lastIndexOf(Object o)` | Find last occurrence |
| `listIterator()` | Create bidirectional iterator |
| `listIterator(int index)` | Iterator from a position |
| `subList(int from, int to)` | View of a range |
| `replaceAll(UnaryOperator)` | Transform elements |
| `sort(Comparator)` | Sort the List |

### Easy Memory Trick

> **GESARFIMS** → **Get → Set → Add → Remove → Find → Iterate → Modify → Sort**

### Java 21+ SequencedCollection Methods

`List` also inherits sequenced operations through `SequencedCollection`:

```java
addFirst(E e)
addLast(E e)
getFirst()
getLast()
removeFirst()
removeLast()
reversed()
```

---

NOTE : All the methods from Collection,List and Sequenced Collection can now used by all implementations of List

---

# ArrayList

`ArrayList` is a **dynamic-array implementation** of `List`.

## Main Characteristics

- Dynamic array
- Maintains insertion order
- Allows duplicates and multiple `null` values
- Fast random access
- Index-based operations
- Automatically resizes when required
- Implements `RandomAccess`
- Implements `Cloneable`
- Implements `Serializable`

### Internal Structure

```text
+----+----+----+----+----+
| 10 | 20 | 30 | 40 | 50 |
+----+----+----+----+----+
```

Elements are stored in a contiguous backing array.

### Performance

| Operation | Typical Complexity |
|-----------|--------------------|
| `get(index)` | **O(1)** |
| `add(end)` | **O(1) amortized** |
| `add(index)` | O(n) |
| `remove(index)` | O(n) |

Middle insertion/removal is slower because elements may need to be shifted.

---

## ArrayList Constructors

| Constructor | Purpose |
|------------|---------|
| `ArrayList()` | Creates an empty List |
| `ArrayList(int initialCapacity)` | Creates a List with specified initial capacity |
| `ArrayList(Collection<? extends E> c)` | Creates a List containing elements from another collection |

Example:

```java
ArrayList<Integer> list1 = new ArrayList<>();

ArrayList<Integer> list2 =
        new ArrayList<>(100);

ArrayList<Integer> list3 =
        new ArrayList<>(otherCollection);
```

---

## Capacity vs Size

| Concept | Meaning |
|---------|---------|
| **Capacity** | Size of the internal array before resizing |
| **Size** | Number of actual elements stored |

```java
ArrayList<Integer> list = new ArrayList<>(100);

list.add(10);
list.add(20);
```

```text
Capacity → 100
Size     → 2
```

---

## ArrayList-Specific Methods

These methods belong to `ArrayList`, not to the `List` interface:

| Method | Purpose |
|--------|---------|
| `ensureCapacity(int)` | Pre-expands the internal array |
| `trimToSize()` | Reduces capacity to current size |
| `clone()` | Creates a shallow copy |

shallow copy explained in ArrayList folder

### ensureCapacity()

Useful when many elements will be added and resizing should be reduced.

```java
list.ensureCapacity(1000);
```

### trimToSize()

Reduces unused capacity:

```java
list.trimToSize();
```

### clone()

Creates a **shallow copy**.

```java
ArrayList<String> copy =
        (ArrayList<String>) list.clone();
```

```text
Original List     Clone List
    [Apple]   →      [Apple]
    [Banana]  →      [Banana]
                  same element references
```

---

## Reference Type and ArrayList-Specific Methods

The available methods depend on the **reference type**, even when the actual object is an `ArrayList`.

```java
List<Integer> list = new ArrayList<>();

list.get(0);              // ✅
list.ensureCapacity(10);  // ❌
```

`ensureCapacity()` belongs to `ArrayList`, not `List`.

```java
ArrayList<Integer> list = new ArrayList<>();

list.ensureCapacity(10); // ✅
```

---

# LinkedList

`LinkedList` is a **doubly linked list implementation** that implements both `List` and `Deque`.

Because it implements `Deque`, a `LinkedList` can be used as:

```text
List
Queue
Deque
Stack
```

---

## Main Characteristics

* Doubly linked list
* Maintains insertion order
* Allows duplicates and multiple `null` values
* Efficient insertion and removal at the beginning and end
* Supports index-based operations
* Implements `List`
* Implements `Deque`
* Implements `Cloneable`
* Implements `Serializable`
* Does **not** implement `RandomAccess`

---

## Why LinkedList?

An array-based List may need to shift many elements when inserting or deleting at a position.

```text
Before:
[10][20][30][40][50]

Insert 5 at beginning:

[5][10][20][30][40][50]
```

Elements need to shift.

`LinkedList` stores each element in a separate node, so node links can be changed without shifting all elements.

### Node Structure

```text
[prev | data | next]
```

Example:

```text
10 ⇄ 20 ⇄ 30 ⇄ 40
```

### Head and Tail

```text
Head
 ↓
10 ⇄ 20 ⇄ 30 ⇄ 40
                 ↑
                Tail
```

- `Head` points to the first node.
- `Tail` points to the last node.

---

## LinkedList Performance

| Operation | Complexity |
|-----------|------------|
| `get(index)` | O(n) |
| `addFirst()` | **O(1)** |
| `addLast()` | **O(1)** |
| `removeFirst()` | **O(1)** |
| `removeLast()` | **O(1)** |
| `add(index)` | O(n) overall |
| `remove(index)` | O(n) overall |
| `contains()` | O(n) |

For indexed insertion/removal:

```text
Find position → O(n)
Actual node change → O(1)

Overall → O(n)
```

---

## LinkedList Constructors

```java
LinkedList<Integer> list1 =
        new LinkedList<>();

LinkedList<Integer> list2 =
        new LinkedList<>(otherCollection);
```

Unlike `ArrayList`, `LinkedList` has **no capacity concept**, so it does not have `ensureCapacity()` or `trimToSize()`.

---

## LinkedList-Specific Method

`clone()` creates a **shallow copy**:

```java
LinkedList<String> copy =
        (LinkedList<String>) list.clone();
```

The new List contains the same element references.

---

# LinkedList as Queue

Because `LinkedList` implements `Deque`, it can perform normal Queue operations:

```java
queue.offer(10); // like add 
queue.offer(20);
queue.offer(30);

queue.poll(); // removes the front element 
```

Conceptually:

```text
Front → 10 → 20 → 30 ← Rear

poll()
  ↓
remove 10

Front → 20 → 30 ← Rear
```

This follows **FIFO**.

---

# LinkedList as Stack

Using Deque methods:

```java
stack.push(10);
stack.push(20);
stack.push(30);

stack.pop();
```

Conceptually:

```text
Top
 ↓
30
20
10
```

`pop()` removes `30`.

This follows **LIFO**.

---

# Reference Type and LinkedList

The available methods depend on the reference type.

```java
Collection<Integer> c = new LinkedList<>();
List<Integer> list = new LinkedList<>();
Queue<Integer> queue = new LinkedList<>();
Deque<Integer> deque = new LinkedList<>();
LinkedList<Integer> linkedList = new LinkedList<>();
```

| Reference Type | Accessible API |
|----------------|----------------|
| `Collection` | Collection methods |
| `List` | Collection + List methods |
| `Queue` | Collection + Queue methods |
| `Deque` | Collection + Queue + Deque methods |
| `LinkedList` | Collection + List + Queue + Deque + LinkedList-specific methods |

Example:

```java
List<String> list = new LinkedList<>();

list.get(0);     // ✅
list.push("A");  // ❌
```

`push()` is a `Deque` method, but the reference type is only `List`.

---

# Choosing the Right Implementation

```text
Fast random access
        → ArrayList

Frequent operations at both ends
        → LinkedList

Queue / Deque operations
        → LinkedList or ArrayDeque

Legacy native synchronization
        → Vector

LIFO / Stack
        → ArrayDeque (modern)
```

> Use **ArrayList** as the general-purpose List. Choose `LinkedList` when its deque behavior or end-based insertion/deletion pattern provides a real benefit.

---

# Common Mistakes

| Mistake | Reality |
|---------|---------|
| `LinkedList` is always faster than `ArrayList` | It is useful for specific insertion/deletion patterns, especially at ends; random access is slower. |
| `LinkedList.add(index)` is O(1) | Overall it is O(n) because the indexed position may need traversal. |
| `ArrayList` middle insertion is O(1) | Elements may need to be shifted, so it is O(n). |
| `List<Integer> list = new LinkedList<>(); list.push(10);` | ❌ `List` reference does not expose `push()`. |
| `Stack` is the preferred modern stack | `ArrayDeque` is preferred for new stack implementations. |
| `LinkedList` has capacity methods | ❌ It uses nodes, so there is no array capacity to manage. |
| `ArrayList.clone()` is a deep copy | ❌ It is a shallow copy. |
| All List implementations have the same performance | They share the List contract but use different internal structures. |

---

# Best Practices

- Use **ArrayList** as the default general-purpose List.
- Use **LinkedList** when its end-based or deque operations fit the requirement.
- Use **ArrayDeque** for modern Queue/Stack operations when a full List API is not required.
- Treat **Vector** and **Stack** as legacy implementations.
- Prefer enhanced for-loops or iterators when traversing a `LinkedList`.
- Use `ensureCapacity()` when a large `ArrayList` size is known in advance.

---

# Quick Revision

| Requirement | Choice |
|-------------|--------|
| General-purpose List | **ArrayList** |
| Fast random access | **ArrayList** |
| Frequent end insert/delete | **LinkedList** |
| Queue / Deque using List implementation | **LinkedList** |
| Modern LIFO / Stack | **ArrayDeque** |
| Legacy synchronized List | **Vector** |
| Legacy Stack | **Stack** |

> **Key Principle:** The `List` interface defines the common behavior, while the implementation determines the internal structure and performance characteristics.
