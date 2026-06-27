# Choosing the Right Map Implementation

## Table of Contents

1. Why Do We Need Multiple Map Implementations?
2. One Interface, Multiple Implementations
3. The Original Problem
4. Why Arrays and Lists Are Not Suitable for Key-Value Data
5. Why Java Introduced the Map Interface
6. Internal Data Structures
7. Introduction to HashMap
8. Problems with HashMap
9. Introduction to LinkedHashMap
10. Problems with LinkedHashMap
11. Introduction to TreeMap
12. Introduction to HashTable
13. Introduction to ConcurrentHashMap
14. Introduction to IdentityHashMap
15. Introduction to WeakHashMap
16. Introduction to EnumMap

---

# 1. Why Do We Need Multiple Map Implementations?

A common question beginners ask is:

> If `HashMap`, `LinkedHashMap`, `TreeMap`, and `Hashtable` all implement the `Map` interface, why doesn't Java provide only one implementation?

The answer is simple:

**No single data structure is best for every situation.**

Different applications have different requirements.

Some applications require:

- Fast key-based lookup
- Maintaining insertion order
- Automatic sorting by keys
- Thread safety
- Memory-efficient caching
- Enum-specific keys

One implementation cannot optimize all of these requirements simultaneously.

Therefore, Java provides multiple implementations of the `Map` interface.

---

# 2. One Interface, Multiple Implementations

The `Map` interface defines **what operations are possible**, while each implementation decides **how those operations are performed internally**.

```text
                          Map
                           │
    ┌──────────┬───────────┼───────────┬──────────┬──────────┐
    │          │           │           │          │          │
HashMap  LinkedHashMap  TreeMap   HashTable  WeakHashMap  EnumMap
    │          │           │           │          │          │
    │          │           │           │          │          │
    └──────────┘           │           │          │          │
                           │           │          │          │
                      SortedMap    ConcurrentHashMap   IdentityHashMap
                           │
                     NavigableMap
                           │
                        TreeMap
```

Example:

```java
Map<String, Integer> map = new HashMap<>();

Map<String, Integer> map = new LinkedHashMap<>();

Map<String, Integer> map = new TreeMap<>();

Map<String, Integer> map = new Hashtable<>();
```

All of the above store key-value pairs.

The difference lies in **how the entries are stored internally**.

---

# 3. The Original Problem

Before the Collection Framework, programmers mainly used arrays and lists to store data.

Suppose we need to store student names and their marks.

```text
Name     Marks
Alice     85
Bob       90
Charlie   78
Alice     92
```

Using separate arrays:

```text
Names:    Alice   Bob   Charlie   Alice
Marks:      85    90      78       92
```

If we want to find Bob's marks, we must search through the entire array.

```java
for (int i = 0; i < names.length; i++) {
    if (names[i].equals("Bob")) {
        return marks[i];
    }
}
```

Time Complexity: O(n)

For very large collections, this becomes inefficient.

What we really need is:

- Fast lookup by name
- No duplicate names
- Direct access to values

This requirement led to the introduction of the `Map` interface.

---

# 4. Why Arrays and Lists Are Not Suitable for Key-Value Data

Arrays and Lists are designed to maintain:

- Order
- Index
- Duplicates

Example:

```text
Index:    0      1        2       3
Value:  Alice   Bob   Charlie   Alice
```

If we want to find the marks for "Bob", we must iterate through the list.

Time Complexity: O(n)

What we really need is:

- Direct key-based access
- No duplicate keys
- Fast searching

This requirement led to the introduction of the `Map` interface.

---

# 5. Why Java Introduced the Map Interface

Java wanted to solve the key-value storage problem while providing efficient searching.

Instead of forcing programmers to manually manage parallel arrays or lists, Java introduced the `Map` interface.

The `Map` interface guarantees:

- Unique keys
- Key-value pair storage
- Fast key-based lookup
- Different internal implementations for different requirements

For example,

```java
put()
get()
remove()
containsKey()
size()
```

are available in every Map implementation.

Internally,

- HashMap uses a Hash Table
- LinkedHashMap uses a Hash Table + Linked List
- TreeMap uses a Red-Black Tree
- Hashtable uses a Synchronized Hash Table
- WeakHashMap uses Weak References
- EnumMap uses an Array

Each implementation follows the same Map contract but stores data differently.

---

# 6. Internal Data Structures

## HashMap

Internally uses a **Hash Table**.

```text
Bucket 0
Bucket 1 → "Alice"=85
Bucket 2 → "Bob"=90
Bucket 3 → "Charlie"=78
Bucket 4
```

Advantages

- Very fast insertion: O(1)
- Very fast searching: O(1)
- Very fast deletion: O(1)

Disadvantages

- No insertion order
- No sorting

---

## LinkedHashMap

Internally uses:

- Hash Table
- Doubly Linked List

```text
Hash Table

↓

"Alice"=85 ⇄ "Bob"=90 ⇄ "Charlie"=78
```

Advantages

- Fast operations
- Maintains insertion order

Disadvantages

- Extra memory required

---

## TreeMap

Internally uses a **Red-Black Tree**.

```text
        "Bob"=90
       /         \
  "Alice"=85   "Charlie"=78
```

Advantages

- Automatically sorted by keys
- Navigation methods available

Disadvantages

- Slower than HashMap

---

## Hashtable

Internally uses a **Synchronized Hash Table**.

```text
Hash Table (Synchronized)

Bucket 1 → "Alice"=85
Bucket 2 → "Bob"=90
```

Advantages

- Thread-safe

Disadvantages

- Slower than HashMap
- No null keys or values

---

## ConcurrentHashMap

Internally uses a **Segmented Hash Table**.

```text
Segment 0    Segment 1    Segment 2
|          |          |
Bucket     Bucket     Bucket
```

Advantages

- Thread-safe without full locking
- Better concurrent performance

Disadvantages

- No null keys or values

---

## IdentityHashMap

Uses reference equality (`==`) instead of `equals()`.

```text
Key Reference → Value
```

Advantages

- Reference-based equality

Disadvantages

- Rarely used in general applications

---

## WeakHashMap

Keys are stored as weak references.

```text
Weak Reference Key → Value
```

Advantages

- Automatic cleanup when key is no longer referenced
- Useful for caches

Disadvantages

- Unpredictable entry removal

---

## EnumMap

Keys must be of the same enum type.

Internally uses an array indexed by enum ordinal.

```text
Index 0 → "SUNDAY"="Holiday"
Index 1 → "MONDAY"="Working Day"
```

Advantages

- Very fast: O(1)
- Memory efficient

Disadvantages

- Keys restricted to single enum type

---

# 7. Introduction to HashMap

HashMap is the most commonly used implementation of the `Map` interface.

It internally stores entries using a **Hash Table**.

### Best Use Cases

- Fast key-based lookup
- Fast insertion
- Fast deletion
- General purpose key-value storage

Example:

```java
Map<String, Integer> marks = new HashMap<>();

marks.put("Alice", 85);
marks.put("Bob", 90);
marks.put("Charlie", 78);

System.out.println(marks.get("Bob"));
```

Output:

```text
90
```

Average Time Complexity:

```text
put()    → O(1)
get()    → O(1)
remove() → O(1)
```

---

# 8. Problems with HashMap

Suppose we insert:

```text
"Alice"=85
"Bob"=90
"Charlie"=78
```

Output may become:

```text
{Bob=90, Alice=85, Charlie=78}
```

or any other order.

The order is **not guaranteed**.

Therefore, HashMap should not be used when insertion order or sorting is required.

---

# 9. Introduction to LinkedHashMap

LinkedHashMap extends the capabilities of HashMap.

It maintains the **insertion order** of entries.

Example:

```java
Map<String, Integer> marks = new LinkedHashMap<>();

marks.put("Alice", 85);
marks.put("Bob", 90);
marks.put("Charlie", 78);

System.out.println(marks);
```

Output:

```text
{Alice=85, Bob=90, Charlie=78}
```

Best Use Cases:

- Maintaining insertion order
- Fast key-based lookup
- Cache implementations (LRU)

---

# 10. Problems with LinkedHashMap

Although LinkedHashMap preserves insertion order, it requires additional memory because it maintains linked references between entries.

Compared to HashMap:

- Slightly slower
- Higher memory consumption

If automatic sorting is required, LinkedHashMap is not suitable.

Instead, TreeMap should be used.

---

# 11. Introduction to TreeMap

Sometimes applications require data to remain **automatically sorted by keys**.

Example:

```java
Map<String, Integer> marks = new TreeMap<>();

marks.put("Charlie", 78);
marks.put("Alice", 85);
marks.put("Bob", 90);

System.out.println(marks);
```

Output:

```text
{Alice=85, Bob=90, Charlie=78}
```

TreeMap automatically stores entries in **sorted order by keys**.

Internally, it uses a **Red-Black Tree**.

Advantages:

- Automatically sorted
- Navigation methods available

Disadvantages:

- Slower than HashMap
- Does not allow null keys

---

# 12. Introduction to HashTable

Hashtable is a legacy class from Java 1.0.

Every public method is synchronized, making it thread-safe.

Example:

```java
Map<String, Integer> map = new Hashtable<>();

map.put("Alice", 85);
map.put("Bob", 90);
```

Advantages:

- Thread-safe

Disadvantages:

- Slower than HashMap
- No null keys or values
- Legacy class

Nowadays, developers prefer `ConcurrentHashMap` for thread-safe maps.

---

# 13. Introduction to ConcurrentHashMap

ConcurrentHashMap provides thread safety without locking the entire map.

It uses **segment-level locking** or **bucket-level locking**.

Example:

```java
Map<String, Integer> map = new ConcurrentHashMap<>();

map.put("Alice", 85);
map.put("Bob", 90);
```

Advantages:

- Thread-safe
- Better concurrent performance than Hashtable

Disadvantages:

- No null keys or values

---

# 14. Introduction to IdentityHashMap

IdentityHashMap uses reference equality (`==`) instead of `equals()`.

```java
Map<String, Integer> map = new IdentityHashMap<>();
```

Use Cases:

- Serialization frameworks
- Object graph traversal
- Reference-based equality

---

# 15. Introduction to WeakHashMap

WeakHashMap stores keys as weak references.

When the key is no longer strongly referenced, the entry is garbage collected.

```java
Map<String, Integer> map = new WeakHashMap<>();
```

Use Cases:

- Caches
- Associating metadata with objects

---

# 16. Introduction to EnumMap

EnumMap is optimized for enum keys.

```java
enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

Map<Day, String> map = new EnumMap<>(Day.class);
```

Use Cases:

- Enum-based lookups
- Very fast operations

---

# Part 2 : Comparison, Selection Guide and Real World Usage

---

# 17. Comparison of Map Implementations

| Feature | HashMap | LinkedHashMap | TreeMap | HashTable | ConcurrentHashMap |
| ---------------- | ----------------- | ---------------------- | ----------------- | ----------------- | ---------------------- |
| Internal Structure | Hash Table | Hash Table + Linked List | Red-Black Tree | Hash Table | Hash Table (Segmented) |
| Duplicate Keys | No | No | No | No | No |
| Duplicate Values | Yes | Yes | Yes | Yes | Yes |
| Null Key | One | One | No | No | No |
| Null Values | Yes | Yes | Yes | No | No |
| Insertion Order | No | Yes | No | No | No |
| Sorted Order | No | No | Yes | No | No |
| Thread Safe | No | No | No | Yes | Yes |
| Legacy Class | No | No | No | Yes | No |

---

# 18. Time Complexity Comparison

| Operation | HashMap | LinkedHashMap | TreeMap | HashTable | ConcurrentHashMap |
| --------- | ------- | ------------- | ------- | --------- | ----------------- |
| put() | O(1)* | O(1)* | O(log n) | O(1)* | O(1)* |
| get() | O(1)* | O(1)* | O(log n) | O(1)* | O(1)* |
| remove() | O(1)* | O(1)* | O(log n) | O(1)* | O(1)* |
| containsKey() | O(1)* | O(1)* | O(log n) | O(1)* | O(1)* |
| size() | O(1) | O(1) | O(1) | O(1) | O(1) |
| traversal | O(n) | O(n) | O(n) | O(n) | O(n) |

*Average Case

> Note:
>
> HashMap, LinkedHashMap, and Hashtable provide constant-time performance on average because of hashing.
>
> TreeMap requires tree traversal, therefore most operations take O(log n).
>
> Since Java 8, HashMap buckets are converted into Red-Black Trees when many collisions occur, improving worst-case lookup from O(n) to O(log n).

---

# 19. Memory Comparison

## HashMap

Stores entries inside a Hash Table.

```text
Bucket

↓

Key → Value
```

Memory Usage:

Low

---

## LinkedHashMap

Stores:

- Hash Table
- Doubly Linked List

```text
Bucket

↓

Key → Value

⇄

Next Entry
```

Memory Usage:

Higher than HashMap.

---

## TreeMap

Stores entries as tree nodes.

Each node stores:

- Key
- Value
- Left Child
- Right Child
- Parent
- Color Information

```text
Left | Key → Value | Right
```

Memory Usage:

Higher than HashMap.

---

## Hashtable

Almost identical to HashMap.

Additional synchronization overhead.

---

# 20. Which One Should I Choose?

## Choose HashMap When

- Fast searching is required.
- Fast insertion is required.
- Order does not matter.
- General-purpose key-value storage.

Examples:

- User ID to User Object mapping
- Configuration settings
- Caching (basic)

---

## Choose LinkedHashMap When

- Insertion order should be preserved.
- Fast searching is required.
- LRU cache implementation.

Examples:

- Recently accessed items
- Ordered configuration
- Session management

---

## Choose TreeMap When

- Data should always remain sorted by keys.
- Navigation operations are required.
- Range-based searching is needed.

Examples:

- Sorted rankings
- Dictionary words
- Score boards

---

## Choose Hashtable When

- Working with legacy synchronized code.
- Maintaining older enterprise applications.

Modern projects rarely use Hashtable.

---

## Choose ConcurrentHashMap When

- Thread-safe concurrent access is required.
- Better performance than Hashtable in multi-threaded environments.

Examples:

- Shared caches
- Concurrent configuration maps

---

## Choose WeakHashMap When

- Automatic cleanup of entries is desired.
- Cache with garbage collection support.

---

## Choose EnumMap When

- Keys are enum constants.
- Maximum performance is required.

---

# 21. DSA Selection Guide

## Scenario 1

Need fast key-based lookup.

Choose:

```java
HashMap
```

Reason:

```text
get(key) → O(1)
```

---

## Scenario 2

Need insertion order.

Choose:

```java
LinkedHashMap
```

Reason:

Maintains insertion order.

---

## Scenario 3

Need sorted keys.

Choose:

```java
TreeMap
```

Reason:

Automatically maintains sorted order by keys.

---

## Scenario 4

Need thread safety.

Choose:

```java
ConcurrentHashMap
```

Reason:

Better concurrent performance than Hashtable.

---

## Scenario 5

Need navigation methods like higher(), lower(), ceiling(), floor().

Choose:

```java
TreeMap
```

---

## Scenario 6

Need best overall performance.

Choose:

```java
HashMap
```

This is why HashMap is the most commonly used Map implementation in Java.

---

# 22. Common Misconceptions

### Myth 1

HashMap stores entries randomly.

❌ False.

Entries are stored according to hash values of keys, not randomly.

---

### Myth 2

LinkedHashMap is completely different from HashMap.

❌ False.

LinkedHashMap extends HashMap by maintaining insertion order.

---

### Myth 3

TreeMap sorts entries only once.

❌ False.

TreeMap keeps the collection sorted after every insertion and deletion.

---

### Myth 4

HashMap is always faster.

❌ False.

If sorted data is required, TreeMap is the correct choice despite being slower.

---

### Myth 5

Map extends Collection.

❌ False.

Map is a separate interface and does NOT extend Collection.

---

# 23. Decision Flowchart

```text
Need Key-Value Storage?

        │
        ▼

Need Fast Lookup?

      Yes ─────────► HashMap

       No
       │
       ▼

Need Insertion Order?

      Yes ─────────► LinkedHashMap

       No
       │
       ▼

Need Sorted Keys?

      Yes ─────────► TreeMap

       No
       │
       ▼

Need Thread Safety?

      Yes ─────────► ConcurrentHashMap
```

---

# Part 3 : Real-World Examples, Interview Guide and Summary

---

# 24. Real-World Examples

Understanding where each implementation is used in real applications helps in selecting the right data structure.

---

## HashMap

### Why?

- Fast key-based lookup
- Fast insertion
- Most operations involve reading data

### Real-World Applications

- User ID to User Profile mapping
- Configuration settings (key-value pairs)
- In-memory caching
- Index mapping
- Word frequency counting

Example:

```text
User ID → User Object

101 → Alice
102 → Bob
103 → Charlie
```

Searching by user ID is very fast.

---

## LinkedHashMap

### Why?

Insertion and order preservation are important.

### Real-World Applications

- Recently accessed items
- Ordered configuration files
- Session management
- LRU cache implementation
- Browser history (ordered)

Example:

```text
Page 1 → Page 2 → Page 3 → Page 4
```

Order of access is preserved.

---

## TreeMap

### Why?

Sorted data is required.

### Real-World Applications

- Sorted rankings
- Dictionary words
- Score boards
- Calendar events
- Time-based data

Example:

```text
Alice=85
Bob=90
Charlie=78
```

Sorted by name:

```text
Alice=85
Bob=90
Charlie=78
```

---

## Hashtable

### Why?

Legacy thread-safe code.

### Real-World Applications

- Legacy enterprise applications
- Older Java systems

Modern projects rarely use Hashtable.

---

## ConcurrentHashMap

### Why?

Thread-safe concurrent access.

### Real-World Applications

- Shared caches in multi-threaded servers
- Concurrent configuration maps
- Real-time data processing

---

## WeakHashMap

### Why?

Automatic cleanup of entries.

### Real-World Applications

- Memory-sensitive caches
- Associating metadata with objects
- Listener management

---

## EnumMap

### Why?

Enum keys with maximum performance.

### Real-World Applications

- Day-based scheduling
- Status-based routing
- Priority-based processing

---

# 25. Quick Revision Table

| Implementation | Order | Null Key | Null Values | Thread-Safe | Use Case |
| ---------------|-------|----------|-------------|-------------|----------|
| HashMap | Unordered | One | Yes | No | General purpose |
| LinkedHashMap | Insertion | One | Yes | No | Ordered access |
| TreeMap | Sorted | No | Yes | No | Sorted keys |
| Hashtable | Unordered | No | No | Yes | Legacy |
| ConcurrentHashMap | Unordered | No | No | Yes | Concurrent access |
| WeakHashMap | Unordered | One | Yes | No | Cache with GC |
| EnumMap | Enum order | No | Yes | No | Enum keys |
| IdentityHashMap | Unordered | Multiple | Yes | No | Reference equality |

---

# 26. Key Takeaways

- HashMap is the most commonly used Map implementation.
- LinkedHashMap preserves insertion order.
- TreeMap automatically sorts keys.
- Hashtable is legacy and synchronized.
- ConcurrentHashMap is preferred for thread safety.
- Map does NOT extend Collection.
- Keys are always unique; values can be duplicated.

---

# 27. Final Summary

| Need | Choose |
|------|--------|
| Fast lookup | HashMap |
| Insertion order | LinkedHashMap |
| Sorted keys | TreeMap |
| Thread safety | ConcurrentHashMap |
| Legacy code | Hashtable |
| Cache with GC | WeakHashMap |
| Enum keys | EnumMap |
| Reference equality | IdentityHashMap |

---

# End of Map Differences
