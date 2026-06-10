# Enter here to understand Enum and Enumeration before proceeding towards HashTable and EnumMap

# Java: Enumeration vs `enum` — Complete Documentation

> **Author's Note:** This document consolidates the often-confused concepts of `Enumeration` (the legacy interface) and `enum` (the type-safe keyword). They share nothing but a similar name. Learn them as two completely separate topics.

---

## Quick Reference

| | `Enumeration` | `enum` |
|---|---|---|
| **What** | Interface | Keyword |
| **Purpose** | Traverse (read) elements from a collection | Define a fixed set of named constants |
| **Since** | JDK 1.0 (legacy) | JDK 5 |
| **Package** | `java.util` | Language feature (no import) |
| **Typical Use** | `Hashtable`, `Vector` | Days, roles, statuses, states |

---

## Table of Contents

1. [Enumeration](#part-1-enumeration)
2. [`enum`](#part-2-enum)
3. [EnumMap](#enummap)
4. [Recommended Learning Order](#recommended-learning-order)
5. [Quick Memory Trick](#quick-memory-trick)

---

# PART 1: Enumeration

## 1.1 What is Enumeration?

`Enumeration` is an **interface** in `java.util` used to **read elements one-by-one** from a collection.

Think of it like flipping through the pages of a book:

```
Book
  ↓
Page 1 → Page 2 → Page 3 → Page 4
```

It moves forward only — no skipping back, no removing pages.

---

## 1.2 Why Was It Created?

Before the Java Collections Framework (before `Iterator`, `ListIterator`, `Spliterator`), Java needed a way to traverse legacy collections like:

- `Hashtable`
- `Vector`

So `Enumeration` was introduced in **JDK 1.0**.

---

## 1.3 Syntax

```java
Enumeration<E> e;
```

Example:
```java
Enumeration<String> e;
```

---

## 1.4 Methods

Only **two** methods exist:

| Method | Description | Returns |
|--------|-------------|---------|
| `hasMoreElements()` | Checks if another element exists | `boolean` |
| `nextElement()` | Returns the next element | `E` |

### `hasMoreElements()`

```java
boolean hasMoreElements()
```

```java
// Example
while (keys.hasMoreElements()) {
    // process next element
}
```

### `nextElement()`

```java
E nextElement()
```

```java
// Example
System.out.println(e.nextElement());
```

---

## 1.5 Complete Example

```java
import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(101, "Alice");
        table.put(102, "Bob");
        table.put(103, "Charlie");

        // Iterate over keys
        Enumeration<Integer> keys = table.keys();
        System.out.println("=== Keys ===");
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        // Output: 101, 102, 103

        // Iterate over values
        Enumeration<String> values = table.elements();
        System.out.println("=== Values ===");
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
        // Output: Alice, Bob, Charlie
    }
}
```

---

## 1.6 How It Works Internally

```
Hashtable:  [101]  [102]  [103]
              ↑
         Pointer starts here

nextElement() → returns 101, pointer moves to 102
nextElement() → returns 102, pointer moves to 103
nextElement() → returns 103
hasMoreElements() → false
```

---

## 1.7 Why Enumeration Is Considered "Old"

| Feature | Enumeration | Iterator |
|---------|-------------|----------|
| Read forward | ✅ | ✅ |
| `remove()` | ❌ | ✅ |
| `hasNext()` equivalent | `hasMoreElements()` | `hasNext()` |
| `next()` equivalent | `nextElement()` | `next()` |

**Iterator replaced Enumeration** in modern Java code because it supports safe removal during iteration.

---

## 1.8 When to Use Enumeration Today

> **Priority: Low** — Legacy codebases only. For new code, always prefer `Iterator` or enhanced for-loops.

---

# PART 2: `enum`

## 2.1 What is `enum`?

`enum` is a **keyword** used to define a **fixed set of named constants**.

### Real-World Examples

| Domain | Constants |
|--------|-----------|
| Days of week | `MONDAY`, `TUESDAY`, ... `SUNDAY` |
| Traffic light | `RED`, `YELLOW`, `GREEN` |
| User roles | `ADMIN`, `USER`, `MANAGER` |
| Order status | `PLACED`, `SHIPPED`, `DELIVERED` |
| Payment status | `PENDING`, `SUCCESS`, `FAILED` |

There will never be a `Monday 2` or `Holiday Day` — the set is **closed and finite**.

---

## 2.2 Why Not Just Use Strings?

```java
// String approach — DANGEROUS
String day = "Monday";      // OK
String day = "Mondy";       // Compiler says OK → BUG!
String day = "holiday";      // Compiler says OK → BUG!
```

```java
// enum approach — SAFE
enum Day { MONDAY, TUESDAY, WEDNESDAY }

Day today = Day.MONDAY;      // ✅ Correct
today = "Friday";            // ❌ Compile Error
today = 5;                   // ❌ Compile Error
```

**Type safety at compile time** is the #1 reason to use `enum`.

---

## 2.3 Basic Usage

```java
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today);  // Output: MONDAY
    }
}
```

---

## 2.4 `enum` Is Actually a Class

Many beginners think `enum` is just a list. It's not.

```
Every enum constant → is an object
Every enum          → extends java.lang.Enum (implicitly)

Hierarchy:
    Object
      ↓
    Enum<E>
      ↓
    Day (your enum)
```

```java
Day.MONDAY   // ← This is a Day object
Day.TUESDAY  // ← This is a Day object
```

---

## 2.5 Common Methods

| Method | Description | Example |
|--------|-------------|---------|
| `values()` | Returns all constants as an array | `Day.values()` |
| `ordinal()` | Returns zero-based position | `Day.MONDAY.ordinal()` → `0` |
| `name()` | Returns constant name as String | `Day.MONDAY.name()` → `"MONDAY"` |
| `valueOf(String)` | Converts String to enum constant | `Day.valueOf("MONDAY")` |

### Examples

```java
// values() — iterate all constants
for (Day d : Day.values()) {
    System.out.println(d);
}
// Output: MONDAY TUESDAY WEDNESDAY ...
```

```java
// ordinal() — position (0-based)
System.out.println(Day.MONDAY.ordinal());   // 0
System.out.println(Day.TUESDAY.ordinal());    // 1
```

> ⚠️ **Warning:** Don't use `ordinal()` for business logic. Changing the order of enum constants changes their ordinals.

```java
// name() — get the name as String
System.out.println(Day.MONDAY.name());  // "MONDAY"
```

```java
// valueOf() — String → enum
Day d = Day.valueOf("MONDAY");  // ✅ Works
Day d = Day.valueOf("Monday");  // ❌ IllegalArgumentException (case-sensitive!)
```

---

## 2.6 `enum` with `switch`

Very common pattern:

```java
Day today = Day.MONDAY;

switch (today) {
    case MONDAY:
        System.out.println("Work day");
        break;
    case SUNDAY:
        System.out.println("Holiday");
        break;
    default:
        System.out.println("Regular day");
}
```

---

## 2.7 `enum` with Fields & Constructors

Enums can store data and have constructors (implicitly `private`).

```java
enum Day {
    MONDAY("Working"),
    TUESDAY("Working"),
    WEDNESDAY("Working"),
    THURSDAY("Working"),
    FRIDAY("Working"),
    SATURDAY("Weekend"),
    SUNDAY("Holiday");

    private final String type;

    // Constructor is implicitly private
    Day(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Usage
System.out.println(Day.MONDAY.getType());  // "Working"
System.out.println(Day.SUNDAY.getType());  // "Holiday"
```

> ⚠️ **You cannot call `new Day()`** — enum constructors are always private.

---

## 2.8 `enum` with Methods

```java
enum Day {
    MONDAY {
        @Override
        public void display() {
            System.out.println("Start of the week!");
        }
    },
    SUNDAY {
        @Override
        public void display() {
            System.out.println("End of the week!");
        }
    };

    public void display() {
        System.out.println("Regular day");
    }
}

// Usage
Day.MONDAY.display();   // "Start of the week!"
Day.TUESDAY.display();  // "Regular day"
```

---

## 2.9 Can `enum` Implement Interfaces?

**Yes.**

```java
interface Printable {
    void print();
}

enum Day implements Printable {
    MONDAY, TUESDAY;

    @Override
    public void print() {
        System.out.println("Day: " + this.name());
    }
}

Day.MONDAY.print();  // "Day: MONDAY"
```

---

## 2.10 Can `enum` Extend a Class?

**No.**

```
Day already extends java.lang.Enum
Java allows only single inheritance for classes
```

---

## 2.11 Real-World Examples

```java
// Traffic Light
enum TrafficLight { RED, YELLOW, GREEN }

// User Roles
enum Role { ADMIN, USER, MANAGER }

// Order Status
enum OrderStatus { PLACED, SHIPPED, DELIVERED, CANCELLED }

// Payment Status
enum PaymentStatus { PENDING, SUCCESS, FAILED, REFUNDED }

// HTTP Status Codes
enum HttpStatus {
    OK(200), NOT_FOUND(404), SERVER_ERROR(500);

    private final int code;
    HttpStatus(int code) { this.code = code; }
    public int getCode() { return code; }
}
```

---

# EnumMap

## What Is EnumMap?

`EnumMap` is a specialized `Map` implementation where **keys are enum constants**.

```java
// HashMap — keys are Strings (or any object)
Map<String, String> hashMap = new HashMap<>();
hashMap.put("MONDAY", "Java");

// EnumMap — keys are enum constants (more efficient)
EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
enumMap.put(Day.MONDAY, "Java");
```

## Why EnumMap Is Better

| Aspect | HashMap | EnumMap |
|--------|---------|---------|
| Key type | Any object | Enum constants only |
| Storage | General-purpose | Optimized (array-based) |
| Speed | Good | **Faster** |
| Memory | More | **Less** |

> **When to use:** Whenever your map keys are enum constants, prefer `EnumMap` over `HashMap`.

---

# Recommended Learning Order

## Priority 1 (Must Know)
1. **`enum`** — Type-safe constants, `switch`, fields, methods
2. **`EnumMap`** — Optimized map for enum keys

## Priority 2 (Good to Know)
3. **`Iterator`** — Modern replacement for Enumeration
4. **`ListIterator`** — Bidirectional iterator
5. **`Spliterator`** — Parallel iteration support

## Priority 3 (Legacy / Historical)
6. **`Enumeration`** — Legacy interface, mostly for old code

---

# Quick Memory Trick

```
Enumeration
    ↓
Traversing Collections
(Hashtable, Vector)
    — Legacy, rarely used today

enum
    ↓
Creating Fixed Constants
(Days, Roles, Statuses)
    — Modern, type-safe, use everywhere

EnumMap
    ↓
Map with enum Keys
    — Faster & more memory-efficient than HashMap
```

---

# Summary

| Concept | Type | Use Case | Priority |
|---------|------|----------|----------|
| `Enumeration` | Interface | Legacy collection traversal | ⭐ Low |
| `enum` | Keyword | Type-safe fixed constants | ⭐⭐⭐ High |
| `EnumMap` | Class | Map with enum keys | ⭐⭐⭐ High |
| `Iterator` | Interface | Modern collection traversal | ⭐⭐⭐ High |

> **Remember:** `Enumeration` and `enum` share nothing but a name. Treat them as completely separate topics.

---

*Document generated for learning and reference purposes.*
