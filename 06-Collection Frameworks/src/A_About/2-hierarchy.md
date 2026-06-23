# Java Collection Framework Hierarchy

```text
Iterable (Interface)
│
└── Collection (Interface)
    │
    ├── List (Interface)
    │   ├── ArrayList (Class)
    │   ├── LinkedList (Class)
    │   ├── Vector (Class)
    │   │   └── Stack (Class)
    │   │
    │   └── LinkedList implements List
    │
    ├── Queue (Interface)
    │   ├── PriorityQueue (Class)
    │   ├── Deque (Interface)
    │   │   ├── ArrayDeque (Class)
    │   │   └── LinkedList (Class)
    │   │
    │   └── LinkedList implements Queue
    │
    └── Set (Interface)
        ├── HashSet (Class)
        ├── LinkedHashSet (Class)
        └── SortedSet (Interface)
            └── TreeSet (Class)


Map (Interface)   ← Separate from Collection
│
├── HashMap (Class)
├── LinkedHashMap (Class)
├── Hashtable (Class)
└── SortedMap (Interface)
    └── TreeMap (Class)
```

## Notes

* `Iterable` is the root interface that enables iteration using loops.
* `Collection` is the main interface for storing groups of objects.
* `List`, `Queue`, and `Set` extend the `Collection` interface.
* `Deque` extends the `Queue` interface.
* `SortedSet` extends the `Set` interface.
* `SortedMap` extends the `Map` interface.
* `LinkedList` implements both `List` and `Deque/Queue`.
* `Map` is part of the Collection Framework but does **not** extend the `Collection` interface.

---

## Examples

### List

```java
List<String> list = new ArrayList<>();
```

### Set

```java
Set<Integer> set = new HashSet<>();
```

### Queue

```java
Queue<String> queue = new LinkedList<>();
```

### Deque

```java
Deque<String> deque = new ArrayDeque<>();
```

### Map

```java
Map<Integer, String> map = new HashMap<>();
```

---

## Quick Revision

```text
List       → Ordered, Duplicates Allowed

Set        → Unique Values

Queue      → FIFO Processing

Deque      → Insert/Delete from Both Ends

Map        → Key-Value Pair

HashMap    → Fast Lookup

TreeMap    → Sorted Keys

HashSet    → Unique Values

TreeSet    → Sorted Unique Values
```
