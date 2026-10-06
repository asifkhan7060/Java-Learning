# EnumMap Method Hierarchy

## Overview

`EnumMap` is a specialized implementation of the `Map` interface in the Java Collections Framework.

It is specifically designed to store **Enum Constants as Keys**.

Unlike `HashMap`, `EnumMap` internally stores keys using an **array-based representation**, making it significantly faster and more memory-efficient when the keys belong to a single enumeration type.

It provides:

- Fast Lookup Operations
- Fast Insertion
- Fast Deletion
- Keys Restricted to Enum Constants
- Values Can Be Duplicated
- Natural Ordering of Enum Constants
- No Null Keys
- Multiple Null Values Allowed
- Compact Memory Usage

Since `EnumMap` implements the `Map` interface, it automatically inherits methods from:

- `Map`

Additionally, `EnumMap` provides its own constructors and optimized implementations.

---

## Class Declaration

```java
public class EnumMap<K extends Enum<K>, V>
        extends AbstractMap<K,V>
        implements Serializable, Cloneable
```

---

## Inheritance Hierarchy

```text
Object
    ↑
AbstractMap
    ↑
EnumMap
```

---

## Interface Relationship

```text
Map
     ↑
EnumMap
```

---

## Complete EnumMap Method Hierarchy

```text
EnumMap<K,V>
│
├──────────────────────────────────────────────
│ Constructors
├──────────────────────────────────────────────
│
├── EnumMap(Class<K> keyType)
├── EnumMap(EnumMap<K, ? extends V> m)
├── EnumMap(Map<K, ? extends V> m)
└── EnumMap(EnumMap<K, V> m)
│
├──────────────────────────────────────────────
│ Methods Inherited from Map
├──────────────────────────────────────────────
│
├── put(K key, V value)
├── putAll(Map<? extends K, ? extends V> m)
│
├── get(Object key)
├── getOrDefault(Object key, V defaultValue)
│
├── remove(Object key)
├── clear()
│
├── containsKey(Object key)
├── containsValue(Object value)
│
├── size()
├── isEmpty()
│
├── keySet()
├── values()
├── entrySet()
│
├── equals(Object o)
├── hashCode()
│
├── forEach(BiConsumer<? super K, ? super V> action)
├── replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
├── replace(K key, V value)
├── replace(K key, V oldValue, V newValue)
├── putIfAbsent(K key, V value)
├── compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
├── computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
├── computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
└── merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
│
├──────────────────────────────────────────────
│ EnumMap Specific Public Methods
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
├── equals()
└── hashCode()
```

---

## Understanding the Hierarchy

The methods available in an `EnumMap` object come from different levels of the Java Collections Framework.

| Level | Source | Key Methods | Notes |
|-------|--------|-------------|-------|
| **Constructors** | `EnumMap` class | `EnumMap(Class)`, `EnumMap(EnumMap)`, `EnumMap(Map)`, `EnumMap(EnumMap)` | Not inherited; Enum type required |
| **Map** | `EnumMap implements Map` | `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `forEach()`, `replaceAll()`, `compute()`, `merge()` | All Map operations |
| **EnumMap Specific** | `EnumMap` class | `clone()` | Shallow copy |
| **Optimized Overrides** | `EnumMap` reimplementation | `put()`, `get()`, `remove()`, `containsKey()`, `containsValue()`, `clone()`, `keySet()`, `values()`, `entrySet()`, `equals()`, `hashCode()` | Direct array indexing via ordinal |

> **Important:** The methods available in your code depend on the **reference type** (`Map` or `EnumMap`), even when the object is an `EnumMap`.
> ```java
> Map<Day, String> map = new EnumMap<>(Day.class);
> // All EnumMap-specific optimizations work, but only Map methods are visible
> ```

---

## EnumMap Constructors

| Constructor | Syntax | Purpose | Time | Space |
|-------------|--------|---------|:----:|:-----:|
| `EnumMap(Class<K> keyType)` | `new EnumMap<>(Day.class)` | Empty EnumMap; specifies the Enum type | O(1) | O(n) *(array sized to enum count)* |
| `EnumMap(EnumMap<K, ? extends V> m)` | `new EnumMap<>(existingEnumMap)` | Copy all mappings from another EnumMap | O(n) | O(n) |
| `EnumMap(Map<K, ? extends V> m)` | `new EnumMap<>(hashMap)` | Convert another Map to EnumMap; source must not be empty | O(n) | O(n) |
| `EnumMap(EnumMap<K, V> m)` | `new EnumMap<>(enumMap)` | Copy all mappings; preserves Enum type | O(n) | O(n) |

> **Note:** Unlike `HashMap`, an `EnumMap` **must know the Enum type** during creation. The `EnumMap(Map)` constructor requires a non-empty source map to infer the Enum type.

---

## Internal Working

`EnumMap` internally stores values in an **array indexed by Enum ordinal values**. No hashing is performed.

```java
enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
// ordinals:    0        1         2          3         4         5         6
```

```text
EnumMap<Day, String> schedule = new EnumMap<>(Day.class);
schedule.put(Day.MONDAY, "Java");
schedule.put(Day.WEDNESDAY, "Python");

Internal Array:
Index:    0        1         2          3         4         5         6
Value:  "Java"   null    "Python"    null     null      null      null
         ↑                  ↑
      MONDAY            WEDNESDAY
```

| Feature | Description |
|---------|-------------|
| **Array Index** | `key.ordinal()` — direct array access |
| **No Hashing** | No `hashCode()` or `equals()` on keys |
| **Capacity** | Fixed at creation = number of Enum constants |
| **Natural Order** | Iteration follows Enum declaration order |
| **Memory** | Compact — one array slot per Enum constant |

### Lookup Process

```text
Key (Day.MONDAY)
      │
      ▼
  ordinal() → 0
      │
      ▼
  Array[0] → "Java"
```

Unlike `HashMap`, there is **no hashCode() calculation**, **no collision handling**, and **no bucket traversal**.

---

## Optimized Overrides

`EnumMap` reimplements these inherited methods using direct array indexing via `ordinal()`:

```java
put(K, V)          // array[key.ordinal()] = value; O(1)
get(Object key)    // array[key.ordinal()]; O(1)
remove(Object key) // array[key.ordinal()] = null; O(1)
containsKey()      // array[key.ordinal()] != null; O(1)
containsValue()    // Linear scan of array; O(n)
clone()            // Shallow copy of internal array; O(n)
keySet()           // View backed by Enum constants; O(1)
values()           // View backed by internal array; O(1)
entrySet()         // View backed by internal array; O(1)
```

---

## EnumMap vs HashMap

| Feature | EnumMap | HashMap |
|---------|--------:|--------:|
| Key Type | Enum constants only | Any object |
| Internal Structure | Array | Hash Table |
| Key Lookup | O(1) via ordinal | O(1) via hashCode |
| Memory Usage | Lower (compact array) | Higher (buckets + nodes) |
| Null Keys | ❌ Not allowed | ✅ One allowed |
| Null Values | ✅ Allowed | ✅ Allowed |
| Ordering | Natural Enum order | Unpredictable |
| Hashing | ❌ Not needed | ✅ Required |

---

## When to Use These Methods

| Scenario | Method / Constructor | Example |
|----------|---------------------|---------|
| Enum-based key-value mapping | `EnumMap(Class)` | `new EnumMap<>(Day.class)` |
| Copy existing EnumMap | `EnumMap(EnumMap)` | `new EnumMap<>(existingMap)` |
| Convert HashMap to EnumMap | `EnumMap(Map)` | `new EnumMap<>(hashMap)` |
| Day-of-week scheduling | `EnumMap(Class)` | `new EnumMap<>(DayOfWeek.class)` |
| State machine transitions | `EnumMap(Class)` | `new EnumMap<>(State.class)` |
| Configuration by enum | `EnumMap(Class)` | `new EnumMap<>(Priority.class)` |
| Need independent copy | `clone()` | `(EnumMap<Day, String>) map.clone()` |

---

## Interview Q&A

**Q1. Which interface does EnumMap implement?**  
`Map`.

**Q2. Which data structure does EnumMap use internally?**  
Array. It does **not** use a Hash Table.

**Q3. Can EnumMap store duplicate keys?**  
No. Every Enum constant can appear only once.

**Q4. Does EnumMap allow null keys?**  
No. Null keys throw `NullPointerException`.

**Q5. Does EnumMap allow null values?**  
Yes. Multiple null values are allowed.

**Q6. Does EnumMap maintain insertion order?**  
No. It always follows the **natural order** of Enum constants (declaration order).

**Q7. Why is EnumMap faster than HashMap?**  
Because it directly uses `Enum.ordinal()` for array indexing instead of computing `hashCode()` and handling collisions.

**Q8. Which type of keys can EnumMap store?**  
Only Enum constants from a single Enum type.

**Q9. When should EnumMap be preferred?**  
When all keys belong to the same Enum type — it's faster and more memory-efficient than `HashMap`.

**Q10. What type of copy does clone() create?**  
**Shallow Copy** — new EnumMap, but values reference the same objects.

---

## Summary

- `EnumMap` is a specialized implementation of the `Map` interface.
- Stores only **Enum constants as keys**.
- Internally uses an **array indexed by ordinal values** instead of a Hash Table.
- Keys are stored according to their **natural Enum order**.
- **Null keys are not allowed**; **null values are allowed**.
- Provides **O(1)** constant-time lookup, insertion, and deletion.
- More **memory-efficient** and **faster** than `HashMap` for Enum-based keys.
- Best suited for applications where keys are predefined as Enum constants (scheduling, state machines, configuration).
