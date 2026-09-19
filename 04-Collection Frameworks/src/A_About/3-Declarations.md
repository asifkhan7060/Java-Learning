# Java Collection Framework - Declarations (Who Extends & Who Implements)

Below are the **actual Java declarations (simplified)** showing exactly **who extends whom** and **who implements whom**. It also includes the important **Java 21 Sequenced Collections**.

---

# Iterable Hierarchy

```java
public interface Iterable<T> {
    Iterator<T> iterator();
    Spliterator<T> spliterator();
}
```

```java
public interface Iterator<E> {
}
```

```java
public interface ListIterator<E> extends Iterator<E> {
}
```

```java
public interface Spliterator<T> {
}
```

---

# Collection Hierarchy

```java
public interface Collection<E> extends Iterable<E> {
}
```

---

# List Hierarchy

```java
public interface List<E> extends Collection<E> {
}
```

```java
public class ArrayList<E>
        implements List<E>, RandomAccess, Cloneable, Serializable {
}
```

```java
public class LinkedList<E>
        implements List<E>, Deque<E>, Cloneable, Serializable {
}
```

```java
public class Vector<E>
        implements List<E>, RandomAccess, Cloneable, Serializable {
}
```

```java
public class Stack<E>
        extends Vector<E> {
}
```

---

# Set Hierarchy

```java
public interface Set<E> extends Collection<E> {
}
```

```java
public interface SortedSet<E>
        extends Set<E> {
}
```

```java
public interface NavigableSet<E>
        extends SortedSet<E> {
}
```

```java
public class HashSet<E>
        implements Set<E>, Cloneable, Serializable {
}
```

```java
public class LinkedHashSet<E>
        extends HashSet<E>
        implements SequencedSet<E> {
}
```

```java
public class TreeSet<E>
        implements NavigableSet<E>, Cloneable, Serializable {
}
```

---

# Queue Hierarchy

```java
public interface Queue<E>
        extends Collection<E> {
}
```

```java
public interface Deque<E>
        extends Queue<E> {
}
```

```java
public class PriorityQueue<E>
        implements Queue<E>, Serializable {
}
```

```java
public class ArrayDeque<E>
        implements Deque<E>, Cloneable, Serializable {
}
```

> **Note:** `LinkedList` also implements `Deque`, so it belongs to both the **List** and **Queue** hierarchies.

---

# Blocking Queue Hierarchy

```java
public interface BlockingQueue<E>
        extends Queue<E> {
}
```

```java
public interface TransferQueue<E>
        extends BlockingQueue<E> {
}
```

```java
public interface BlockingDeque<E>
        extends BlockingQueue<E>, Deque<E> {
}
```

---

## BlockingQueue Implementations

```java
public class ArrayBlockingQueue<E>
        implements BlockingQueue<E>, Serializable {
}
```

```java
public class LinkedBlockingQueue<E>
        implements BlockingQueue<E>, Serializable {
}
```

```java
public class PriorityBlockingQueue<E>
        implements BlockingQueue<E>, Serializable {
}
```

```java
public class DelayQueue<E>
        implements BlockingQueue<E> {
}
```

```java
public class SynchronousQueue<E>
        implements BlockingQueue<E>, Serializable {
}
```

```java
public class LinkedTransferQueue<E>
        implements TransferQueue<E>, Serializable {
}
```

---

## BlockingDeque Implementation

```java
public class LinkedBlockingDeque<E>
        implements BlockingDeque<E>, Serializable {
}
```

---

# Map Hierarchy

```java
public interface Map<K, V> {
}
```

```java
public interface SortedMap<K, V>
        extends Map<K, V> {
}
```

```java
public interface NavigableMap<K, V>
        extends SortedMap<K, V> {
}
```

```java
public interface ConcurrentMap<K, V>
        extends Map<K, V> {
}
```

---

## Map Implementations

```java
public class HashMap<K, V>
        implements Map<K, V>, Cloneable, Serializable {
}
```

```java
public class LinkedHashMap<K, V>
        extends HashMap<K, V>
        implements SequencedMap<K, V> {
}
```

```java
public class Hashtable<K, V>
        implements Map<K, V>, Cloneable, Serializable {
}
```

```java
public class WeakHashMap<K, V>
        implements Map<K, V> {
}
```

```java
public class IdentityHashMap<K, V>
        implements Map<K, V>, Serializable, Cloneable {
}
```

```java
public class EnumMap<K extends Enum<K>, V>
        implements Map<K, V>, Cloneable, Serializable {
}
```

```java
public class TreeMap<K, V>
        implements NavigableMap<K, V>, Cloneable, Serializable {
}
```

```java
public class ConcurrentHashMap<K, V>
        implements ConcurrentMap<K, V>, Serializable {
}
```

---

# Java 21 Sequenced Collections

```java
public interface SequencedCollection<E>
        extends Collection<E> {
}
```

```java
public interface SequencedSet<E>
        extends Set<E>, SequencedCollection<E> {
}
```

```java
public interface SequencedQueue<E>
        extends Queue<E>, SequencedCollection<E> {
}
```

```java
public interface SequencedMap<K, V>
        extends Map<K, V> {
}
```

---

# Complete Relationship Summary

```text
Iterable
│
└── Collection
    ├── List
    │   ├── ArrayList
    │   ├── LinkedList
    │   ├── Vector
    │   │   └── Stack
    │
    ├── Set
    │   ├── SortedSet
    │   │   └── NavigableSet
    │   │       └── TreeSet
    │   ├── HashSet
    │   │   └── LinkedHashSet
    │
    └── Queue
        ├── PriorityQueue
        ├── Deque
        │   ├── ArrayDeque
        │   └── LinkedList
        ├── BlockingQueue
        │   ├── ArrayBlockingQueue
        │   ├── LinkedBlockingQueue
        │   ├── PriorityBlockingQueue
        │   ├── DelayQueue
        │   ├── SynchronousQueue
        │   └── TransferQueue
        │       └── LinkedTransferQueue
        └── BlockingDeque
            └── LinkedBlockingDeque

Map
├── HashMap
│   └── LinkedHashMap
├── Hashtable
├── WeakHashMap
├── IdentityHashMap
├── EnumMap
├── SortedMap
│   └── NavigableMap
│       └── TreeMap
└── ConcurrentMap
    └── ConcurrentHashMap
```

> **Note:** This is a simplified representation of the actual JDK declarations. It focuses only on the primary inheritance (`extends`) and implementation (`implements`) relationships that are most important for understanding the Java Collection Framework and for interview preparation.
