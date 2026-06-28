# EnumMap Method Hierarchy

## Overview

`EnumMap` is a specialized implementation of the `Map` interface in the Java Collections Framework.

It is specifically designed to store **Enum Constants as Keys**.

Unlike `HashMap`, `EnumMap` internally stores keys using an **array-based representation**, making it significantly faster and more memory-efficient when the keys belong to a single enumeration type.

It provides:

* Fast Lookup Operations
* Fast Insertion
* Fast Deletion
* Keys Restricted to Enum Constants
* Values Can Be Duplicated
* Natural Ordering of Enum Constants
* No Null Keys
* Multiple Null Values Allowed
* Compact Memory Usage

Since `EnumMap` implements the `Map` interface, it automatically inherits methods from:

* `Map`

Additionally, `EnumMap` provides its own constructors and optimized implementations of several `Map` methods.

---

# Class Declaration

```java
public class EnumMap<K extends Enum<K>, V>
        extends AbstractMap<K,V>
        implements Serializable, Cloneable
```

---

# Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
EnumMap
```

---

# Interface Relationship

```text
Map
 ↑
EnumMap
```

---

# Complete EnumMap Method Hierarchy

> **Legend**
>
> ✅ = Already Studied
>
> 🆕 = Exists in Java but not covered yet
>
> 🔒 = Protected/Internal Method

```text
EnumMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── ✅ EnumMap(Class<K> keyType)
├── ✅ EnumMap(EnumMap<K,? extends V> m)
├── ✅ EnumMap(Map<K,? extends V> m)
└── ✅ EnumMap(EnumMap<K,V> m)

│
├──────────────────────────────────────────────
│ Methods Inherited from Map
├──────────────────────────────────────────────
│
├── ✅ put(K key,V value)
├── ✅ putAll(Map<? extends K,? extends V> m)
│
├── ✅ get(Object key)
├── ✅ getOrDefault()
│
├── ✅ remove(Object key)
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
├── ✅ equals(Object o)
├── ✅ hashCode()
│
├── ✅ forEach()
├── ✅ replace()
├── ✅ replaceAll()
├── ✅ putIfAbsent()
├── ✅ compute()
├── ✅ computeIfAbsent()
├── ✅ computeIfPresent()
└── ✅ merge()

│
├──────────────────────────────────────────────
│ EnumMap Specific Public Methods
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



# Understanding the Hierarchy

The methods available in an `EnumMap` object come from different levels of the Java Collections Framework.

## 1. Constructors

These belong directly to the `EnumMap` class.

They are used to create `EnumMap` objects and are **not inherited**.

```java
EnumMap(Class<K> keyType)

EnumMap(EnumMap<K, ? extends V> m)

EnumMap(Map<K, ? extends V> m)

EnumMap(EnumMap<K, V> m)
```

Unlike `HashMap`, an `EnumMap` **must know the Enum type** during object creation.

---

## 2. Methods Inherited from Map

Since

```java
EnumMap implements Map
```

every `EnumMap` object automatically inherits all methods defined in the `Map` interface.

These methods are used for common map operations such as:

* Adding Key-Value Pairs
* Updating Values
* Removing Entries
* Searching Keys
* Searching Values
* Traversing Entries
* Collection Views

Examples:

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

## 3. EnumMap Specific Methods

The following public method belongs specifically to the `EnumMap` class.

```java
clone()
```

It creates a **shallow copy** of the current `EnumMap`.

The constructors also belong directly to the `EnumMap` class.

Unlike `HashMap`,

the constructors require the Enum type to determine the valid keys.

---

## 4. Optimized Overrides

Several inherited methods are internally optimized for Enum-based storage.

Examples:

* put()
* get()
* remove()
* containsKey()
* containsValue()
* clone()
* keySet()
* values()
* entrySet()

Unlike `HashMap`,

these methods do **not perform hashing**.

Instead,

they directly access the internal array using the **ordinal value** of the Enum constant.

This makes `EnumMap` significantly faster than `HashMap` when Enum keys are used.

---

## 5. Methods Inherited from Object

Every Java class ultimately extends the `Object` class.

Therefore,

an `EnumMap` object can also use methods like:

* toString()
* getClass()
* wait()
* notify()
* notifyAll()

These methods belong to the `Object` class and are **not specific to the Collection Framework**.

---

# Part 2 : EnumMap Specific Methods

---

## 1. EnumMap(Class<K> keyType)

Creates an empty `EnumMap` using the specified Enum type.

### Syntax

```java
EnumMap<EnumType, V> map =
        new EnumMap<>(EnumType.class);
```

### Example

```java
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY

}

EnumMap<Day, String> schedule =
        new EnumMap<>(Day.class);
```

### Purpose

* Creates an empty EnumMap.
* Specifies the Enum type during object creation.
* Most commonly used constructor.

### Note

Unlike `HashMap`,

the Enum type **must be provided**.

Without the Enum type,

the map cannot determine the valid keys.

---

## 2. EnumMap(EnumMap<K, ? extends V> m)

Creates a new `EnumMap` containing all mappings from another `EnumMap`.

### Syntax

```java
EnumMap<Day, String> copy =
        new EnumMap<>(existingEnumMap);
```

### Example

```java
EnumMap<Day, String> original =
        new EnumMap<>(Day.class);

original.put(Day.MONDAY, "Java");

EnumMap<Day, String> copy =
        new EnumMap<>(original);
```

### Purpose

* Copies all mappings.
* Preserves the Enum type.
* Frequently used for cloning map contents.

### Note

The original `EnumMap` remains unchanged.

---

## 3. EnumMap(Map<K, ? extends V> m)

Creates an `EnumMap` from another `Map`.

### Syntax

```java
EnumMap<Day, String> map =
        new EnumMap<>(existingMap);
```

### Example

```java
HashMap<Day, String> hashMap =
        new HashMap<>();

hashMap.put(Day.MONDAY, "Java");
hashMap.put(Day.TUESDAY, "Python");

EnumMap<Day, String> enumMap =
        new EnumMap<>(hashMap);
```

### Purpose

* Converts another `Map` into an `EnumMap`.
* Copies all mappings.

### Note

The supplied `Map` must **not be empty**.

Otherwise,

`EnumMap` cannot determine the Enum type and throws an exception.

---

## 4. clone()

Creates a **shallow copy** of the current `EnumMap`.

### Syntax

```java
Object clone()
```

### Example

```java
EnumMap<Day, String> copy =
        (EnumMap<Day, String>) schedule.clone();
```

### Purpose

Creates another `EnumMap` containing the same mappings.

### Note

`clone()` returns an **Object**.

Therefore,

type casting is required.

```java
(EnumMap<Day, String>) map.clone();
```

---

### Shallow Copy

`clone()` performs a **Shallow Copy**.

The `EnumMap` object is copied,

but the stored objects are **not cloned**.

Example

```text
Original EnumMap

↓

MONDAY → Java

↓

Clone EnumMap

↓

MONDAY → Java
```

Both maps reference the same objects.



# Internal EnumMap Concepts

Understanding the following concepts is important because they determine the performance, memory efficiency, and behavior of an `EnumMap`.

---

## 1. Enum Type

An `EnumMap` stores keys that belong to **only one Enum type**.

Example

```java
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY

}
```

```java
EnumMap<Day, String> schedule =
        new EnumMap<>(Day.class);
```

### Purpose

Restricts the map to a predefined set of keys.

This allows the JVM to optimize storage and lookup operations.

---

## 2. Ordinal Values

Every Enum constant has an **ordinal value**.

Example

```text
MONDAY     → 0

TUESDAY    → 1

WEDNESDAY  → 2

THURSDAY   → 3
```

`EnumMap` internally uses these ordinal values to access elements.

### Purpose

Provides constant-time access without hashing.

---

## 3. Array-Based Storage

Unlike `HashMap`,

`EnumMap` does **not** use a Hash Table.

Instead,

it internally stores values inside an array.

Example

```text
Index

0 → Java

1 → Python

2 → Spring
```

The array index corresponds to the ordinal value of the Enum constant.

### Purpose

* Faster lookup.
* Less memory usage.
* No hash computation.

---

## 4. Natural Ordering

Entries are always stored according to the **natural order** of the Enum constants.

Example

```java
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY

}
```

Insertion Order

```text
WEDNESDAY

MONDAY

TUESDAY
```

Iteration Order

```text
MONDAY

TUESDAY

WEDNESDAY
```

### Note

Insertion order is ignored.

Ordering always follows the Enum declaration.

---

## 5. Capacity

Capacity depends on the total number of Enum constants.

Example

```java
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY

}
```

Internal Capacity

```text
4
```

Every Enum constant gets one position in the internal array.

---

## 6. Size

Size represents the number of mappings currently stored.

Example

```text
Enum Constants = 7

Stored Entries = 3
```

Output

```text
Size = 3
```

### Note

Capacity and Size are different.

```text
Capacity → Total Enum Constants

Size → Stored Key-Value Pairs
```

---

## 7. Null Keys

`EnumMap` does **not allow null keys**.

Example

```java
map.put(null, "Java");
```

Output

```text
NullPointerException
```

### Reason

Every key must correspond to an Enum constant.

---

## 8. Null Values

Unlike null keys,

`EnumMap` **allows null values**.

Example

```java
map.put(Day.MONDAY, null);
```

This is perfectly valid.

---

## 9. Memory Efficiency

Since keys are represented using ordinal values,

`EnumMap` consumes significantly less memory than `HashMap`.

### Purpose

* No hash buckets.
* No collision handling.
* Compact internal storage.

---

## 10. Lookup Process

When a key is searched,

the following steps occur:

```text
Enum Constant

↓

ordinal()

↓

Array Index

↓

Retrieve Value
```

Unlike `HashMap`,

there is **no hashCode() calculation**.

---

# Optimized Overrides

The following methods are inherited,

but `EnumMap` provides optimized implementations.

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

equals()

hashCode()
```

These methods use direct array indexing instead of hashing,

making them significantly faster when Enum keys are used.

---

# Methods Not Covered Yet

The following methods exist in Java,

but are not covered in this project.

```java
compute()

computeIfAbsent()

computeIfPresent()

merge()

replace()

replaceAll()

putIfAbsent()

getOrDefault()
```

These methods behave exactly like the corresponding methods in the `Map` interface and will be covered in the advanced Map topics.

---

# Important Notes

* Constructors are **not inherited**.
* `EnumMap` accepts only Enum keys.
* Null Keys are **not allowed**.
* Null Values are allowed.
* Entries are stored according to the natural order of the Enum constants.
* Internally uses an array instead of a Hash Table.
* Does not perform hashing.
* Provides faster lookup than `HashMap` for Enum keys.
* `clone()` creates a **Shallow Copy**.
* Best suited when all keys belong to the same Enum type.

---

# Time Complexity

## Constructors

| Constructor | Time Complexity | Space Complexity |
|-------------|---------------:|-----------------:|
| EnumMap(Class) | O(1) | O(n) |
| EnumMap(EnumMap) | O(n) | O(n) |
| EnumMap(Map) | O(n) | O(n) |
| clone() | O(n) | O(n) |

---

## Common Operations

| Operation | Time Complexity |
|-----------|---------------:|
| put() | O(1) |
| get() | O(1) |
| remove() | O(1) |
| containsKey() | O(1) |
| containsValue() | O(n) |
| iterator() | O(n) |
| clear() | O(n) |

---

# Frequently Asked Interview Questions

## Q1. Which interface does EnumMap implement?

```java
Map
```

Indirectly,

```text
Map

↓

EnumMap
```

---

## Q2. Which data structure does EnumMap use internally?

```text
Array
```

It does **not** use a Hash Table.

---

## Q3. Can EnumMap store duplicate keys?

No.

Every Enum constant can appear only once.

---

## Q4. Does EnumMap allow null keys?

No.

Null keys throw

```text
NullPointerException
```

---

## Q5. Does EnumMap allow null values?

Yes.

Multiple null values are allowed.

---

## Q6. Does EnumMap maintain insertion order?

No.

It always follows the natural order of Enum constants.

---

## Q7. Why is EnumMap faster than HashMap?

Because it directly uses

```text
Enum.ordinal()
```

instead of computing

```text
hashCode()
```

---

## Q8. Which type of keys can EnumMap store?

Only Enum constants.

---

## Q9. When should EnumMap be preferred?

When all keys belong to the same Enum type.

---

## Q10. What type of copy does clone() create?

```text
Shallow Copy
```

---

# Summary

* `EnumMap` is a specialized implementation of the `Map` interface.
* Stores only Enum constants as keys.
* Internally uses an array instead of a Hash Table.
* Keys are stored according to their natural Enum order.
* Null Keys are **not allowed**.
* Null Values are allowed.
* Provides constant-time lookup operations.
* More memory-efficient and faster than `HashMap` for Enum-based keys.
* Best suited for applications where keys are predefined as Enum constants.

