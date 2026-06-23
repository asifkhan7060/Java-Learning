# Java Collection Framework

## What is a Collection?

A **Collection** is a group of objects stored together and managed as a single unit.

The **Java Collection Framework (JCF)** is a set of classes and interfaces that provides ready-made data structures and methods for storing, retrieving, and manipulating groups of objects efficiently.

---

# Why Collections?

Arrays have several limitations:

- Fixed size
- Difficult insertion and deletion
- Limited built-in methods
- Less flexible

Collections solve these problems by providing:

- Dynamic size
- Built-in methods
- Better performance for different operations
- Various data structures for different use cases

---

# Array vs Collection

| Array | Collection |
|---------|------------|
| Fixed size | Dynamic size |
| Stores same data type (generally) | Can store heterogeneous objects |
| No ready-made methods for common operations | Provides many built-in methods |
| Less flexible | Highly flexible |
| Part of Java language | Part of Collection Framework |

### Example

```java
int[] numbers = {10,20,30};
```

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
```

---

# Java Collection Framework Hierarchy

```text
Collection
│
├── B_List
├── Set
├── Queue
│
Map (Separate Interface)
```

Major parts:

1. B_List
2. Set
3. Queue
4. Map

---

# B_List

A **B_List** is an ordered collection of elements.

### Characteristics

- Ordered
- Maintains insertion order
- Allows duplicate elements
- Elements can be accessed using index

### Example

```java
B_List<String> names = new ArrayList<>();

names.add("John");
names.add("Ali");
names.add("John");
```

Output:

```text
[John, Ali, John]
```

Duplicates are allowed.

### Common Implementations

- ArrayList
- LinkedList
- Vector
- Stack

---

# Set

A **Set** is a collection that does not allow duplicate elements.

### Characteristics

- Unordered (generally)
- No duplicate elements
- Faster searching in many implementations

### Example

```java
Set<String> names = new HashSet<>();

names.add("John");
names.add("Ali");
names.add("John");
```

Output:

```text
[John, Ali]
```

Duplicate value is removed automatically.

### Common Implementations

- HashSet
- LinkedHashSet
- TreeSet

---

# Queue

A **Queue** is a collection used for storing elements before processing.

### Characteristics

- Follows FIFO (First In First Out)
- Elements are inserted at the rear
- Elements are removed from the front

### Example

```java
Queue<String> queue = new LinkedList<>();

queue.add("A");
queue.add("B");
queue.add("C");

System.out.println(queue.poll());
```

Output:

```text
A
```

### Common Implementations

- LinkedList
- PriorityQueue
- ArrayDeque

---

# Map

A **Map** stores data in the form of **key-value pairs**.

### Characteristics

- Key and Value pair
- Keys must be unique
- Values can be duplicated
- Not a child of Collection interface

### Example

```java
Map<String,String> user = new HashMap<>();

user.put("firstName","John");
user.put("city","Mumbai");
```

Output:

```text
{
 firstName=John,
 city=Mumbai
}
```

### Common Implementations

- HashMap
- LinkedHashMap
- TreeMap
- Hashtable

---

# Generics in Collections

Collections are usually used with Generics.

### Without Generics

```java
B_List list = new ArrayList();

list.add("John");
list.add(10);
```

Different data types can be added.

### With Generics

```java
B_List<String> users = new ArrayList<>();
```

Only String values are allowed.

### Syntax

```java
B_List<Type> variableName;
```

Examples:

```java
B_List<String> names;
B_List<Integer> numbers;
B_List<Double> marks;
```

---

# Common Collection Methods

## add()

Adds an element.

```java
list.add("Java");
```

## remove()

Removes an element.

```java
list.remove("Java");
```

## size()

Returns total elements.

```java
list.size();
```

## contains()

Checks existence.

```java
list.contains("Java");
```

## clear()

Removes all elements.

```java
list.clear();
```

## isEmpty()

Checks whether collection is empty.

```java
list.isEmpty();
```

---

# Advantages of Collection Framework

- Dynamic resizing
- Ready-made data structures
- Reusable code
- Better performance
- Easy insertion and deletion
- Type safety with Generics
- Rich set of utility methods

---

# Real-Life Examples

### B_List

Student attendance register.

```text
Aman
Rahul
Aman
```

Duplicates allowed.

---

### Set

Unique email IDs.

```text
abc@gmail.com
xyz@gmail.com
abc@gmail.com
```

Duplicate email is ignored.

---

### Queue

Ticket booking counter.

```text
Person1
Person2
Person3
```

First person is served first.

---

### Map

Student ID → Student Name

```text
101 → Aman
102 → Rahul
103 → Ali
```

Each key uniquely identifies a value.

---

# Summary

- Collection = Group of Objects
- Collection Framework = Toolbox for managing objects
- B_List → Ordered, duplicates allowed
- Set → Unordered, duplicates not allowed
- Queue → FIFO structure
- Map → Key-Value pair
- Collections are dynamic and provide built-in methods
- Generics ensure type safety

---

## Quick Revision

| Interface | Ordered | Duplicates | Example |
|------------|----------|------------|---------|
| B_List | Yes | Yes | ArrayList |
| Set | No | No | HashSet |
| Queue | FIFO | Yes | LinkedList |
| Map | Key-Value | Unique Keys | HashMap |

**Collection Framework = Efficient way to store, organize, and manage groups of objects in Java.**