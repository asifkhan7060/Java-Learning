# IdentityHashMap Method Hierarchy

## Overview

`IdentityHashMap` is a specialized implementation of the `Map` interface that compares **keys using reference equality (`==`) instead of logical equality (`equals()`)**.

Unlike `HashMap`, which considers two keys equal if their `equals()` method returns `true`, `IdentityHashMap` treats two keys as equal **only if they refer to the exact same object in memory**.

Internally, `IdentityHashMap` uses:

- Reference Equality (`==`)
- `System.identityHashCode()`
- Open Addressing
- Linear Probing
- Internal Object Array

It does **not** use:

- `equals()`
- `hashCode()`
- Linked List
- Red-Black Tree

It provides:

- Key-Value Storage
- Reference Equality
- Fast Lookup
- Fast Insertion
- Fast Deletion
- One Null Key Allowed
- Multiple Null Values Allowed
- Duplicate Logical Keys Allowed
- Open Addressing
- Linear Probing

Since `IdentityHashMap` implements the `Map` interface, it inherits all methods defined by `Map`.

Unlike `HashMap`, however, it intentionally violates the normal `Map` equality contract by using object identity instead of logical equality.

---

## Class Declaration

```java
public class IdentityHashMap<K,V>
        extends AbstractMap<K,V>
        implements Map<K,V>,
                   Serializable,
                   Cloneable
```

---

## Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
IdentityHashMap
```

---

## Interface Relationship

```text
Map
 ↑
IdentityHashMap
```

---

## Relationship with HashMap

Although both classes implement the `Map` interface, their equality mechanism is completely different.

```text
HashMap                 IdentityHashMap
   ↓                        ↓
hashCode()          System.identityHashCode()
   ↓                        ↓
equals()                    ==
```

This is the single most important difference.

---

## Complete IdentityHashMap Method Hierarchy

```text
IdentityHashMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── IdentityHashMap()
├── IdentityHashMap(int expectedMaxSize)
└── IdentityHashMap(Map<? extends K,
                     ? extends V> m)

│
├──────────────────────────────────────────────
│ Methods Inherited from Map
├──────────────────────────────────────────────
│
├── put(K,V)
├── putAll()
│
├── get()
├── getOrDefault()
│
├── remove()
├── clear()
│
├── containsKey()
├── containsValue()
│
├── size()
├── isEmpty()
│
├── keySet()
├── values()
├── entrySet()
│
├── replace()
├── replaceAll()
├── putIfAbsent()
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
├── merge()
│
├── equals()
└── hashCode()

│
├──────────────────────────────────────────────
│ IdentityHashMap Specific Methods
├──────────────────────────────────────────────
│
└── clone()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── put()
├── get()
├── remove()
├── containsKey()
├── containsValue()
├── clone()
├── keySet()
├── values()
├── entrySet()
├── forEach()
├── replaceAll()
├── compute()
├── computeIfAbsent()
├── computeIfPresent()
├── merge()
├── equals()
└── hashCode()
```

---

## Understanding the Hierarchy

The methods available in an `IdentityHashMap` object come from different levels of the Java Collections Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `IdentityHashMap` class | `IdentityHashMap()`, `IdentityHashMap(int)`, `IdentityHashMap(Map)` | No load factor constructor; `int` is expected max size |
| **Map** | `IdentityHashMap implements Map` | `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `entrySet()` | Core key-value operations |
| **IdentityHashMap Specific** | `IdentityHashMap` class | `clone()` | Shallow copy |
| **Optimized Overrides** | `IdentityHashMap` reimplementation | `put()`, `get()`, `remove()`, `forEach()`, `compute()`, `merge()` | Uses `==` and `System.identityHashCode()` |

> **Important:** The methods available in your code depend on the **reference type** (`Map` or `IdentityHashMap`), even when the object is an `IdentityHashMap`.
> ```java
> Map<String, String> map = new IdentityHashMap<>();
> map.clone();   // ❌ Compile error — clone() is not in Map interface
> ```

---

## Comparison with HashMap

| Feature | HashMap | IdentityHashMap |
|----------|---------|-----------------|
| Key Comparison | `equals()` | `==` |
| Hash Function | `hashCode()` | `System.identityHashCode()` |
| Duplicate Logical Keys | No | Yes |
| One Null Key | Yes | Yes |
| Multiple Null Values | Yes | Yes |
| Collision Handling | Bucket + Tree | Linear Probing |
| Internal Structure | Hash Table | Object Array |
| Uses Red-Black Tree | Yes (Java 8+) | No |
| Uses Linked List | Yes | No |

---

## IdentityHashMap Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `IdentityHashMap()` | `new IdentityHashMap<>()` | Empty map using reference equality | O(1) | O(1) |
| `IdentityHashMap(int expectedMaxSize)` | `new IdentityHashMap<>(100)` | Optimizes internal table for expected entries | O(1) | O(n) |
| `IdentityHashMap(Map<? extends K, ? extends V> m)` | `new IdentityHashMap<>(existingMap)` | Copy all mappings; equality switches to `==` | O(n) | O(n) |

### Key Differences from HashMap

| Concept | HashMap | IdentityHashMap |
|---------|---------|-----------------|
| Load Factor Constructor | Yes | No |
| Initial Capacity Constructor | Yes | No |
| Parameter | `capacity`, `loadFactor` | `expectedMaxSize` |
| Internal Table | Managed by JVM | Managed by JVM based on expected size |

```java
IdentityHashMap<String, String> map = new IdentityHashMap<>(100);
// Expected max size = 100; JVM decides actual internal array size
map.put("Java", "Language");
map.put("Python", "Language");
```

---

## IdentityHashMap Specific Methods

| Method | Syntax | Purpose | Time | Space |
|--------|--------|---------|:----:|:-----:|
| `clone()` | `(IdentityHashMap<K,V>) map.clone()` | Creates a **shallow copy** — new IdentityHashMap, same key/value references | O(n) | O(n) |

### Shallow Copy

`clone()` performs a **shallow copy** — the IdentityHashMap object is copied, but the stored key and value objects are **not cloned**.

```
Original Map              Clone Map
    [Key1] → [Val1]  →      [Key1] → [Val1]   ← Same objects referenced
    [Key2] → [Val2]  →      [Key2] → [Val2]   ← Same objects referenced
```

Both maps reference the same objects.

---

## Identity Comparison vs Logical Comparison

This is the most important concept in `IdentityHashMap`.

### HashMap (Logical Equality)

```java
String s1 = new String("Java");
String s2 = new String("Java");
System.out.println(s1.equals(s2));   // true
// HashMap treats s1 and s2 as the SAME key
```

### IdentityHashMap (Reference Equality)

```java
String s1 = new String("Java");
String s2 = new String("Java");
System.out.println(s1 == s2);        // false
// IdentityHashMap treats s1 and s2 as DIFFERENT keys
```

### Duplicate Logical Keys Example

```java
String s1 = new String("Java");
String s2 = new String("Java");

// HashMap → (s1 and s2 are logically equal)
// IdentityHashMap → (s1 and s2 are different references)
```

---

## Internal IdentityHashMap Concepts

| Concept | Description | Key Detail |
|---------|-------------|------------|
| **Reference Equality** | Two variables refer to the **exact same object** in memory | Uses `==` operator, not `equals()` |
| **Logical Equality** | Two objects contain the same data | Uses `equals()` — ignored by IdentityHashMap |
| **`==` Operator** | Compares memory address (object reference) | Does NOT compare object contents |
| **`equals()`** | Compares object contents | Ignored for key comparison |
| **`System.identityHashCode()`** | Generates hash based on object identity | Not overridden `hashCode()` |
| **Object Identity** | Every `new` object has its own identity | Different references = different keys |
| **Duplicate Logical Keys** | Logically equal objects stored separately | Key feature of IdentityHashMap |
| **Internal Object Array** | Entries stored directly in `Object[]` | Keys and values occupy adjacent positions |
| **Open Addressing** | On collision, searches another empty location | No separate data structures |
| **Linear Probing** | Checks next position until empty slot found | `Index 4 occupied → Index 5 occupied → Index 6 empty → Insert` |
| **Expected Maximum Size** | Constructor parameter estimates mappings | JVM calculates appropriate internal table size |
| **Null Key** | One null key allowed | Valid |
| **Null Values** | Multiple null values allowed | Valid |
| **Performance (Average)** | `put()`, `get()`, `remove()` → O(1) | Fast for most cases |
| **Performance (Worst)** | `put()`, `get()`, `remove()` → O(n) | Due to Linear Probing |
| **Memory Usage** | Generally less than HashMap | No linked structures; single Object array |
| **Real World Use Cases** | Serialization, object graph traversal, proxy tracking, JVM internals, DI containers, identity caches | Rarely used in business applications |

### Internal Array Layout

```text
Object[] table:
[Index 0] → Key1
[Index 1] → Value1
[Index 2] → Key2
[Index 3] → Value2
[Index 4] → Key3
[Index 5] → Value3
```

Keys and values occupy adjacent positions in the same array.

### Linear Probing Flow

```text
Insert KeyX:
   ↓
Calculate index → Index 4
   ↓
Index 4 occupied?
   ↓
Yes → Check Index 5
   ↓
Index 5 occupied?
   ↓
Yes → Check Index 6
   ↓
Index 6 empty?
   ↓
Yes → Insert KeyX at Index 6
```

### Reality Check

IdentityHashMap does **NOT** ignore hashing. It still hashes keys — the difference is:

```text
HashMap                    IdentityHashMap
   ↓                            ↓
key.hashCode()          System.identityHashCode()
   ↓                            ↓
equals()                        ==
```

---

## Optimized Overrides

`IdentityHashMap` reimplements these inherited methods using **Reference Equality** instead of **Logical Equality**:

```java
put()           get()           remove()
containsKey()   containsValue() clone()
keySet()        values()        entrySet()
forEach()       replaceAll()    compute()
computeIfAbsent()  computeIfPresent()  merge()
equals()        hashCode()
```

Internally these methods use:
- Reference Equality (`==`)
- `System.identityHashCode()`
- Open Addressing
- Linear Probing
- Internal Object Array

Instead of:
- `equals()`
- `hashCode()`
- Linked List
- Red-Black Tree

---

## Important Notes

- Constructors are **not inherited**.
- Implements the `Map` interface.
- Uses **Reference Equality (`==`)**.
- Does **not** use `equals()` for key comparison.
- Uses `System.identityHashCode()`.
- Allows logically equal objects as different keys.
- Stores entries inside an internal `Object[]` array.
- Collision handling uses **Linear Probing**.
- Does **not** use Linked Lists.
- Does **not** use Red-Black Trees.
- One null key is allowed.
- Multiple null values are allowed.
- Primarily designed for specialized framework-level use cases rather than general-purpose application development.

---

## Time Complexity

### Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| `IdentityHashMap()` | O(1) | O(1) |
| `IdentityHashMap(int)` | O(1) | O(n) |
| `IdentityHashMap(Map)` | O(n) | O(n) |
| `clone()` | O(n) | O(n) |

### Common Operations (Average Case)

| Operation | Time Complexity |
|-----------|----------------:|
| `put()` | O(1) |
| `get()` | O(1) |
| `remove()` | O(1) |
| `containsKey()` | O(1) |
| `containsValue()` | O(n) |
| `clear()` | O(n) |
| `iterator()` | O(n) |

### Worst Case

| Operation | Time Complexity |
|-----------|----------------:|
| `put()` | O(n) |
| `get()` | O(n) |
| `remove()` | O(n) |

Reason: Collision handling uses Linear Probing instead of Linked List or Red-Black Tree.

---

## Frequently Asked Interview Questions

**Q1. Which interface does IdentityHashMap implement?**  
`Map`

**Q2. Which class does IdentityHashMap extend?**  
`AbstractMap`

**Q3. What is the biggest difference between HashMap and IdentityHashMap?**  
HashMap uses `equals()` + `hashCode()`. IdentityHashMap uses `==` + `System.identityHashCode()`.

**Q4. Does IdentityHashMap use equals()?**  
No. It compares keys using `==`.

**Q5. Why does IdentityHashMap use System.identityHashCode()?**  
Because it generates a hash value based on **object identity**, not overridden `hashCode()` implementations.

**Q6. Can logically equal objects exist as separate keys?**  
Yes. If they are different object references, they are treated as different keys.

**Q7. Does IdentityHashMap allow Null Keys?**  
Yes. One null key is allowed.

**Q8. Does IdentityHashMap allow Null Values?**  
Yes. Multiple null values are allowed.

**Q9. Does IdentityHashMap use Linked Lists?**  
No.

**Q10. Does IdentityHashMap use Red-Black Trees?**  
No.

**Q11. Which collision resolution technique is used?**  
Open Addressing + Linear Probing.

**Q12. What is Open Addressing?**  
Instead of creating another data structure, IdentityHashMap searches for the next available slot inside the same array.

**Q13. What is Linear Probing?**  
If one position is occupied, the next position is checked until an empty slot is found.

**Q14. Why is there no Load Factor constructor?**  
Because IdentityHashMap manages its internal table differently from HashMap. The constructor accepts **Expected Maximum Size** instead of capacity and load factor.

**Q15. What is Expected Maximum Size?**  
It represents the expected number of mappings, allowing the JVM to choose an appropriate internal table size.

**Q16. Is IdentityHashMap Thread-Safe?**  
No. Like HashMap, it is **not synchronized**.

**Q17. When should IdentityHashMap be used?**  
Typical use cases: Serialization Frameworks, Object Graph Traversal, Proxy Tracking, JVM Internals, Identity-based Caches, Dependency Injection Frameworks.

**Q18. Why isn't IdentityHashMap commonly used?**  
Most applications require **logical equality** rather than **reference equality**.

**Q19. What type of copy does clone() create?**  
Shallow Copy.

**Q20. Which collection should be used in normal applications?**  
`HashMap`. Use `IdentityHashMap` only when **object identity** is the actual requirement.

---

## Summary

- `IdentityHashMap` is a specialized implementation of the `Map` interface.
- It compares keys using **reference equality (`==`)** instead of `equals()`.
- Uses `System.identityHashCode()` internally.
- Stores entries inside an internal `Object[]` array.
- Resolves collisions using **Open Addressing** and **Linear Probing**.
- Allows logically equal objects to exist as different keys.
- Provides average **O(1)** performance for lookup, insertion, and removal.
- Designed primarily for framework-level and identity-based use cases rather than general-purpose application development.
