# IdentityHashMap Method Hierarchy

## Overview

`IdentityHashMap` is a specialized implementation of the `Map` interface that compares **keys using reference equality (`==`) instead of logical equality (`equals()`)**.

Unlike `HashMap`, which considers two keys equal if their `equals()` method returns `true`, `IdentityHashMap` treats two keys as equal **only if they refer to the exact same object in memory**.

Internally, `IdentityHashMap` uses:

* Reference Equality (`==`)
* `System.identityHashCode()`
* Open Addressing
* Linear Probing
* Internal Object Array

It does **not** use:

* `equals()`
* `hashCode()`
* Linked List
* Red-Black Tree

It provides:

* Key-Value Storage
* Reference Equality
* Fast Lookup
* Fast Insertion
* Fast Deletion
* One Null Key Allowed
* Multiple Null Values Allowed
* Duplicate Logical Keys Allowed
* Open Addressing
* Linear Probing

Since `IdentityHashMap` implements the `Map` interface, it inherits all methods defined by `Map`.

Unlike `HashMap`, however, it intentionally violates the normal `Map` equality contract by using object identity instead of logical equality.

---

# Class Declaration

```java
public class IdentityHashMap<K,V>
        extends AbstractMap<K,V>
        implements Map<K,V>,
                   Serializable,
                   Cloneable
```

---

# Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
IdentityHashMap
```

---

# Interface Relationship

```text
Map
 ↑
IdentityHashMap
```

---

# Relationship with HashMap

Although both classes implement the `Map` interface,

their equality mechanism is completely different.

```text
HashMap

↓

hashCode()

↓

equals()

----------------------------

IdentityHashMap

↓

System.identityHashCode()

↓

==
```

This is the single most important difference.

---

# Complete IdentityHashMap Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
IdentityHashMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ IdentityHashMap()
├── ✅ IdentityHashMap(int expectedMaxSize)
└── ✅ IdentityHashMap(Map<? extends K,
                       ? extends V> m)

│
├──────────────────────────────────────────────
│ Methods Inherited from Map
├──────────────────────────────────────────────
│
├── ✅ put(K,V)
├── ✅ putAll()
│
├── ✅ get()
├── ✅ getOrDefault()
│
├── ✅ remove()
├── ✅ clear()
│
├── ✅ containsKey()
├── ✅ containsValue()
│
├── ✅ size()
├── ✅ isEmpty()
│
├── ✅ keySet()
├── ✅ values()
├── ✅ entrySet()
│
├── ✅ replace()
├── ✅ replaceAll()
├── ✅ putIfAbsent()
├── ✅ compute()
├── ✅ computeIfAbsent()
├── ✅ computeIfPresent()
├── ✅ merge()
│
├── ✅ equals()
└── ✅ hashCode()

│
├──────────────────────────────────────────────
│ IdentityHashMap Specific Methods
├──────────────────────────────────────────────
│
└── ✅ clone()

│
├──────────────────────────────────────────────
│ Optimized Overrides
├──────────────────────────────────────────────
│
├── ✅ put()
├── ✅ get()
├── ✅ remove()
├── ✅ containsKey()
├── ✅ containsValue()
├── ✅ clone()
├── ✅ keySet()
├── ✅ values()
├── ✅ entrySet()
├── ✅ forEach()
├── ✅ replaceAll()
├── ✅ compute()
├── ✅ computeIfAbsent()
├── ✅ computeIfPresent()
├── ✅ merge()
├── ✅ equals()
└── ✅ hashCode()

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

# Comparison with HashMap

| Feature | HashMap | IdentityHashMap |
|----------|---------|-----------------|
| Key Comparison | equals() | == |
| Hash Function | hashCode() | System.identityHashCode() |
| Duplicate Logical Keys | ❌ No | ✅ Yes |
| One Null Key | ✅ Yes | ✅ Yes |
| Multiple Null Values | ✅ Yes | ✅ Yes |
| Collision Handling | Bucket + Tree | Linear Probing |
| Internal Structure | Hash Table | Object Array |
| Uses Red-Black Tree | ✅ Yes (Java 8+) | ❌ No |
| Uses Linked List | ✅ Yes | ❌ No |

---

# Key Takeaways

* `IdentityHashMap` compares keys using **reference equality (`==`)**.
* It ignores overridden `equals()` and `hashCode()` methods.
* Uses `System.identityHashCode()` internally.
* Stores entries using **Open Addressing** and **Linear Probing**.
* Allows logically equal objects to exist as separate keys if they are different object references.
* Primarily used in JVM internals, object graph traversal, serialization frameworks, proxy tracking, and identity-based caches.

# Understanding the Hierarchy

The methods available in an `IdentityHashMap` object come from different levels of the Java Collections Framework.

---

## 1. Constructors

These belong directly to the `IdentityHashMap` class.

They are **not inherited**.

```java
IdentityHashMap()

IdentityHashMap(int expectedMaxSize)

IdentityHashMap(Map<? extends K, ? extends V> m)
```

Unlike `HashMap`,

there is **no constructor that accepts a Load Factor**.

Instead,

`IdentityHashMap` internally manages its own table size based on the expected number of mappings.

---

## 2. Methods Inherited from Map

Since

```java
IdentityHashMap implements Map
```

every `IdentityHashMap` object automatically inherits all methods defined in the `Map` interface.

These methods are responsible for:

* Adding Key-Value Pairs
* Updating Existing Values
* Removing Entries
* Searching Keys
* Searching Values
* Traversing Entries
* Collection Views

Examples

* put()
* putAll()
* get()
* getOrDefault()
* remove()
* containsKey()
* containsValue()
* keySet()
* values()
* entrySet()

---

## 3. IdentityHashMap Specific Method

The following public method belongs specifically to the `IdentityHashMap` class.

```java
clone()
```

It creates a **Shallow Copy** of the current `IdentityHashMap`.

The constructors also belong directly to this class.

---

## 4. Optimized Overrides

Several inherited methods are optimized specifically for reference comparison.

Examples

* put()
* get()
* remove()
* containsKey()
* clone()
* keySet()
* values()
* entrySet()
* equals()
* hashCode()

Unlike `HashMap`,

these methods internally rely on

* Reference Equality (`==`)
* `System.identityHashCode()`
* Open Addressing
* Linear Probing

instead of

* equals()
* hashCode()

---

## 5. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore,

an `IdentityHashMap` object can also use methods such as

* toString()
* getClass()
* wait()
* notify()
* notifyAll()

These methods belong to `Object` and are not specific to the Collections Framework.

---

# Part 2 : IdentityHashMap Specific Methods

---

## 1. IdentityHashMap()

Creates an empty `IdentityHashMap`.

### Syntax

```java
IdentityHashMap<K, V> map =
        new IdentityHashMap<>();
```

### Example

```java
IdentityHashMap<Integer, String> students =
        new IdentityHashMap<>();
```

### Purpose

Creates an empty map that compares keys using **reference equality**.

### Note

Unlike `HashMap`,

this constructor does **not** expose capacity or load factor settings.

The internal table size is managed automatically.

---

## 2. IdentityHashMap(int expectedMaxSize)

Creates an empty `IdentityHashMap` with an expected maximum number of mappings.

### Syntax

```java
IdentityHashMap<K, V> map =
        new IdentityHashMap<>(100);
```

### Example

```java
IdentityHashMap<Integer, String> employees =
        new IdentityHashMap<>(100);
```

### Purpose

Optimizes the initial internal table for the expected number of entries.

### Note

The parameter is

```text
Expected Maximum Size
```

It is **not** the table capacity.

The JVM decides the actual internal array size.

---

## 3. IdentityHashMap(Map<? extends K, ? extends V> m)

Creates an `IdentityHashMap` containing all mappings from another `Map`.

### Syntax

```java
IdentityHashMap<K, V> map =
        new IdentityHashMap<>(existingMap);
```

### Example

```java
HashMap<Integer, String> original =
        new HashMap<>();

original.put(1, "Java");
original.put(2, "Python");

IdentityHashMap<Integer, String> copy =
        new IdentityHashMap<>(original);
```

### Purpose

Copies all mappings from another map.

### Note

Only the mappings are copied.

The equality mechanism immediately changes to

```text
Reference Equality (==)
```

This means future key comparisons behave differently from the source map.

---

## 4. clone()

Creates a **Shallow Copy** of the current `IdentityHashMap`.

### Syntax

```java
Object clone()
```

### Example

```java
IdentityHashMap<Integer, String> copy =

    (IdentityHashMap<Integer, String>)
            original.clone();
```

### Purpose

Creates another `IdentityHashMap` containing the same mappings.

### Note

`clone()` returns

```java
Object
```

Therefore,

type casting is required.

---

### Shallow Copy

`clone()` copies the `IdentityHashMap` object,

but **does not clone the stored objects**.

Example

```text
Original Map

↓

Employee Object

↓

Clone Map

↓

Same Employee Object
```

Both maps reference the same objects.

---

# Identity Comparison vs Logical Comparison

This is the most important concept in `IdentityHashMap`.

### HashMap

```java
String s1 = new String("Java");

String s2 = new String("Java");

s1.equals(s2)
```

Output

```text
true
```

HashMap treats these as the **same key**.

---

### IdentityHashMap

```java
String s1 = new String("Java");

String s2 = new String("Java");

s1 == s2
```

Output

```text
false
```

IdentityHashMap treats these as **different keys**.

---

# Quick Comparison

```text
HashMap

↓

equals()

↓

Logical Equality

---------------------------

IdentityHashMap

↓

==

↓

Reference Equality
```


# Internal IdentityHashMap Concepts

Unlike `HashMap`,

the most important concept of `IdentityHashMap` is **Reference Equality**.

Instead of comparing keys using

```java
equals()
```

it compares them using

```java
==
```

This completely changes how keys are stored and retrieved.

---

# 1. Reference Equality

Reference Equality means two variables refer to the **exact same object** in memory.

Java uses

```java
==
```

to compare object references.

Example

```java
String s1 = new String("Java");

String s2 = new String("Java");

System.out.println(s1 == s2);
```

Output

```text
false
```

Although both objects contain the same text,

they are different objects.

---

# 2. Logical Equality

Logical Equality means two objects contain the same data.

Java uses

```java
equals()
```

Example

```java
String s1 = new String("Java");

String s2 = new String("Java");

System.out.println(s1.equals(s2));
```

Output

```text
true
```

HashMap uses Logical Equality.

IdentityHashMap does NOT.

---

# 3. == Operator

The

```java
==
```

operator compares

```text
Memory Address

(Object Reference)
```

It does NOT compare object contents.

Example

```java
Employee e1 =
        new Employee("Rudra");

Employee e2 =
        new Employee("Rudra");

System.out.println(e1 == e2);
```

Output

```text
false
```

Both objects are different.

---

# 4. equals()

The

```java
equals()
```

method compares

```text
Object Contents
```

Example

```java
String s1 = "Java";

String s2 = "Java";

System.out.println(s1.equals(s2));
```

Output

```text
true
```

IdentityHashMap ignores this comparison for keys.

---

# 5. System.identityHashCode()

HashMap uses

```java
hashCode()
```

IdentityHashMap uses

```java
System.identityHashCode()
```

Example

```java
Employee employee =
        new Employee("Rudra");

System.out.println(

        System.identityHashCode(employee)

);
```

Purpose

```text
Generates hash code
based on object identity,
not overridden hashCode().
```

---

# 6. Object Identity

Every object created using

```java
new
```

has its own identity.

Example

```java
String a =
        new String("Java");

String b =
        new String("Java");
```

```text
Contents

↓

Same

Reference

↓

Different
```

IdentityHashMap treats them as

```text
Two Different Keys
```

---

# 7. Duplicate Logical Keys

This is the biggest difference.

Example

```java
String s1 =
        new String("Java");

String s2 =
        new String("Java");
```

HashMap

```text
1 Entry
```

IdentityHashMap

```text
2 Entries
```

Reason

```text
Reference Equality
```

---

# 8. Internal Object Array

Unlike HashMap,

IdentityHashMap does NOT use

```text
Buckets

↓

Linked List

↓

Red Black Tree
```

Instead,

it stores entries directly inside an

```text
Object[]
```

array.

Layout

```text
Key

Value

Key

Value

Key

Value
```

Keys and values occupy adjacent positions.

---

# 9. Open Addressing

When a collision occurs,

IdentityHashMap searches another empty location.

Example

```text
Table

↓

Collision

↓

Next Position

↓

Store Entry
```

This technique is called

```text
Open Addressing
```

---

# 10. Linear Probing

IdentityHashMap resolves collisions using

```text
Linear Probing
```

Example

```text
Index 4

Occupied

↓

Index 5

Occupied

↓

Index 6

Empty

↓

Insert Here
```

No Linked List is created.

---

# 11. Expected Maximum Size

Constructor

```java
IdentityHashMap(int expectedMaxSize)
```

does NOT specify capacity.

Instead,

it estimates the expected number of mappings.

The JVM calculates an appropriate internal table size.

---

# 12. Null Key

IdentityHashMap allows

```text
One Null Key
```

Example

```java
map.put(null, "Java");
```

Valid.

---

# 13. Null Values

IdentityHashMap allows

```text
Multiple Null Values
```

Example

```java
map.put("Java", null);

map.put("Python", null);
```

Valid.

---

# 14. Performance

Average Case

```text
put()

↓

O(1)

get()

↓

O(1)

remove()

↓

O(1)
```

Worst Case

```text
O(n)
```

due to Linear Probing.

---

# 15. Memory Usage

Because IdentityHashMap stores data inside an

```text
Object[]
```

array,

it generally uses less memory than maintaining linked structures for collision handling.

---

# 16. Real World Use Cases

IdentityHashMap is **rarely used in business applications**.

Typical use cases include:

* Object Graph Traversal
* Serialization Frameworks
* Deep Copy Utilities
* JVM Internals
* Proxy Tracking
* Debugging Tools
* Dependency Injection Containers
* Object Identity Caches

---

# 17. Why IdentityHashMap Exists?

Sometimes two objects may contain identical data,

but they represent different real-world entities.

Example

```text
Employee A

↓

Name = John

Employee B

↓

Name = John
```

Even if

```java
equals()
```

returns

```text
true
```

they must still be treated as separate objects.

IdentityHashMap solves this problem.

---

# Reality Check

## ❌ Common Misconception

IdentityHashMap does **NOT** ignore hashing.

It still hashes keys.

The difference is:

```text
HashMap

↓

key.hashCode()

↓

equals()

-----------------------

IdentityHashMap

↓

System.identityHashCode()

↓

==
```

---

# Important Notes

* Uses Reference Equality (`==`)
* Does NOT use `equals()` for key comparison.
* Uses `System.identityHashCode()`.
* Allows logically equal objects as different keys.
* Uses an internal `Object[]` array.
* Collision handling uses Linear Probing.
* No Linked Lists.
* No Red-Black Trees.
* One null key is allowed.
* Multiple null values are allowed.
* Mainly intended for specialized framework and JVM use cases.

# Optimized Overrides

Although many methods are inherited from the `Map` interface,

`IdentityHashMap` provides optimized implementations based on **Reference Equality** instead of **Logical Equality**.

The following methods are internally optimized.

```java
put()

get()

remove()

containsKey()

containsValue()

clone()

keySet()

values()

entrySet()

forEach()

replaceAll()

compute()

computeIfAbsent()

computeIfPresent()

merge()

equals()

hashCode()
```

Internally these methods use

* Reference Equality (`==`)
* System.identityHashCode()
* Open Addressing
* Linear Probing
* Internal Object Array

instead of

* equals()
* hashCode()
* Linked List
* Red-Black Tree

---

# Methods Not Covered Yet

The following methods exist inside the JDK implementation but are considered internal implementation details.

```java
hash()

nextKeyIndex()

closeDeletion()

resize()

capacity()

init()

putForCreate()
```

These methods are package-private or internal helper methods.

They are mainly useful when studying the JDK source code.

---

# Important Notes

* Constructors are **not inherited**.
* Implements the `Map` interface.
* Uses **Reference Equality (`==`)**.
* Does **not** use `equals()` for key comparison.
* Uses `System.identityHashCode()`.
* Allows logically equal objects as different keys.
* Stores entries inside an internal `Object[]` array.
* Collision handling uses **Linear Probing**.
* Does **not** use Linked Lists.
* Does **not** use Red-Black Trees.
* One null key is allowed.
* Multiple null values are allowed.
* Primarily designed for specialized framework-level use cases.

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|----------------:|-----------------:|
| IdentityHashMap() | O(1) | O(1) |
| IdentityHashMap(int) | O(1) | O(n) |
| IdentityHashMap(Map) | O(n) | O(n) |
| clone() | O(n) | O(n) |

---

## Common Operations (Average Case)

| Operation | Time Complexity |
|-----------|----------------:|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |
| containsKey() | O(1) |
| containsValue() | O(n) |
| clear() | O(n) |
| iterator() | O(n) |

---

## Worst Case

| Operation | Time Complexity |
|-----------|----------------:|
| put() | O(n) |
| get() | O(n) |
| remove() | O(n) |

### Reason

Collision handling uses

```text
Linear Probing
```

instead of

```text
Linked List

or

Red-Black Tree
```

---

# Frequently Asked Interview Questions

## Q1. Which interface does IdentityHashMap implement?

```java
Map
```

---

## Q2. Which class does IdentityHashMap extend?

```java
AbstractMap
```

---

## Q3. What is the biggest difference between HashMap and IdentityHashMap?

```text
HashMap

↓

equals()

+

hashCode()

------------------------

IdentityHashMap

↓

==

+

System.identityHashCode()
```

---

## Q4. Does IdentityHashMap use equals()?

No.

It compares keys using

```java
==
```

---

## Q5. Why does IdentityHashMap use System.identityHashCode()?

Because it generates a hash value based on **object identity**, not overridden `hashCode()` implementations.

---

## Q6. Can logically equal objects exist as separate keys?

Yes.

If they are different object references,

they are treated as different keys.

---

## Q7. Does IdentityHashMap allow Null Keys?

Yes.

One null key is allowed.

---

## Q8. Does IdentityHashMap allow Null Values?

Yes.

Multiple null values are allowed.

---

## Q9. Does IdentityHashMap use Linked Lists?

No.

---

## Q10. Does IdentityHashMap use Red-Black Trees?

No.

---

## Q11. Which collision resolution technique is used?

```text
Open Addressing

+

Linear Probing
```

---

## Q12. What is Open Addressing?

Instead of creating another data structure,

IdentityHashMap searches for the next available slot inside the same array.

---

## Q13. What is Linear Probing?

If one position is occupied,

the next position is checked until an empty slot is found.

---

## Q14. Why is there no Load Factor constructor?

Because IdentityHashMap manages its internal table differently from HashMap.

The constructor accepts

```text
Expected Maximum Size
```

instead of capacity and load factor.

---

## Q15. What is Expected Maximum Size?

It represents the expected number of mappings,

allowing the JVM to choose an appropriate internal table size.

---

## Q16. Is IdentityHashMap Thread-Safe?

No.

Like HashMap,

it is **not synchronized**.

---

## Q17. When should IdentityHashMap be used?

Typical use cases include

* Serialization Frameworks
* Object Graph Traversal
* Proxy Tracking
* JVM Internals
* Identity-based Caches
* Dependency Injection Frameworks

---

## Q18. Why isn't IdentityHashMap commonly used?

Most applications require **logical equality** rather than **reference equality**.

---

## Q19. What type of copy does clone() create?

```text
Shallow Copy
```

---

## Q20. Which collection should be used in normal applications?

```text
HashMap
```

Use `IdentityHashMap` only when **object identity** is the actual requirement.

---

# Summary

* `IdentityHashMap` is a specialized implementation of the `Map` interface.
* It compares keys using **reference equality (`==`)** instead of `equals()`.
* Uses `System.identityHashCode()` internally.
* Stores entries inside an internal `Object[]` array.
* Resolves collisions using **Open Addressing** and **Linear Probing**.
* Allows logically equal objects to exist as different keys.
* Provides average **O(1)** performance for lookup, insertion, and removal.
* Designed primarily for framework-level and identity-based use cases rather than general-purpose application development.
* 