# Understanding `equals()` and `hashCode()` in `HashMap`

One of the most common interview questions is:

> **Why should we override `equals()` and `hashCode()` when using a custom object as a `HashMap` key?**

Let's understand it step by step.

---

# Example Code

```java
HashMap<EmployeeKey, String> employeeDemo =
        new HashMap<>();

EmployeeKey employee1 =
        new EmployeeKey(101, "Rudra");

EmployeeKey employee2 =
        new EmployeeKey(101, "Rudra");

employeeDemo.put(employee1, "Developer");

System.out.println(
        employeeDemo.get(employee2)
);
```

---

# Step 1 : Create HashMap

```java
HashMap<EmployeeKey, String> employeeDemo =
        new HashMap<>();
```

Initially the HashMap is empty.

```text
HashMap

Empty
```

---

# Step 2 : Create `employee1`

```java
EmployeeKey employee1 =
        new EmployeeKey(101, "Rudra");
```

Memory

```text
employee1
   │
   ▼
+----------------------+
| id   = 101           |
| name = "Rudra"       |
+----------------------+

Memory Address : A1
```

---

# Step 3 : Create `employee2`

```java
EmployeeKey employee2 =
        new EmployeeKey(101, "Rudra");
```

Memory

```text
employee1                     employee2
   │                              │
   ▼                              ▼

+------------------+          +------------------+
| id = 101         |          | id = 101         |
| name = Rudra     |          | name = Rudra     |
+------------------+          +------------------+

Address : A1                Address : B7
```

Although both objects contain the same data,

they are **different objects**.

```java
employee1 == employee2
```

Output

```text
false
```

Because `==` compares **memory addresses**, not object data.

---

# Step 4 : Insert into HashMap

```java
employeeDemo.put(employee1, "Developer");
```

When `put()` is called, HashMap performs two operations.

## Step 4.1 : Calculate `hashCode()`

Since `EmployeeKey` has **not overridden** `hashCode()`,
Java uses the default implementation from the `Object` class.

```text
employee1

↓

Default hashCode()

↓

123456 (example)
```

HashMap calculates the bucket number.

```text
Bucket = hashCode % Capacity

123456 % 16

↓

Bucket 0
```

Now the entry is stored.

```text
HashMap

Bucket 0

employee1 ─────► Developer
```

---

# Step 5 : Retrieve using `employee2`

```java
employeeDemo.get(employee2);
```

Again, HashMap starts by calculating the hash code.

## Step 5.1 : Calculate `hashCode()`

Since `employee2` is a different object,

its default hash code is also different.

```text
employee2

↓

Default hashCode()

↓

987654 (example)
```

HashMap calculates

```text
Bucket = hashCode % Capacity

987654 % 16

↓

Bucket 6
```

HashMap immediately searches **Bucket 6**.

```text
Bucket 6

Empty
```

Since nothing exists in Bucket 6,

the result is

```text
null
```

---

# Why Doesn't HashMap Search Every Bucket?

Suppose a HashMap contains **1 million entries**.

Searching every bucket would make retrieval very slow.

Instead, HashMap uses the hash code to jump directly to one bucket.

```text
hashCode()

↓

Bucket Number

↓

Search Only That Bucket
```

This is why `HashMap` provides **very fast average O(1) lookup**.

---

## Current Result

Because `equals()` and `hashCode()` are **not overridden**,

```java
employeeDemo.get(employee2);
```

returns

```text
null
```

even though both objects contain the same values (`101`, `"Rudra"`).

In the next step, we will see how overriding `hashCode()` and `equals()` allows HashMap to locate the correct bucket and identify the correct key.



# Example Code

```java
import java.util.HashMap;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        HashMap<EmployeeKey, String> employeeDemo =
                new HashMap<>();

        EmployeeKey employee1 =
                new EmployeeKey(101, "Rudra");

        EmployeeKey employee2 =
                new EmployeeKey(101, "Rudra");

        employeeDemo.put(employee1, "Developer");

        System.out.println(
                employeeDemo.get(employee2)
        );
    }
}

class EmployeeKey {

    int id;
    String name;

    EmployeeKey(int id, String name) {

        this.id = id;
        this.name = name;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof EmployeeKey))
            return false;

        EmployeeKey other =
                (EmployeeKey) obj;

        return id == other.id &&
                Objects.equals(name, other.name);

    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);

    }
}
```

**Output**

```text
Developer
```

---

# Why Does it Print `Developer`?

Now `EmployeeKey` **overrides both `equals()` and `hashCode()`**.

Because of this, HashMap treats `employee1` and `employee2` as the **same logical key**, even though they are different objects.

---

# Step 1 : Create HashMap

```java
HashMap<EmployeeKey, String> employeeDemo =
        new HashMap<>();
```

Initially

```text
HashMap

Empty
```

---

# Step 2 : Create `employee1`

```java
EmployeeKey employee1 =
        new EmployeeKey(101, "Rudra");
```

Memory

```text
employee1
   │
   ▼
+----------------------+
| id   = 101           |
| name = Rudra         |
+----------------------+

Address : A1
```

---

# Step 3 : Create `employee2`

```java
EmployeeKey employee2 =
        new EmployeeKey(101, "Rudra");
```

Memory

```text
employee1                     employee2
   │                              │
   ▼                              ▼

+------------------+          +------------------+
|101 Rudra         |          |101 Rudra         |
+------------------+          +------------------+

Address : A1                Address : B7
```

Although both objects contain the same data,

```java
employee1 == employee2
```

returns

```text
false
```

because they are different objects.

---

# Step 4 : Store in HashMap

```java
employeeDemo.put(employee1, "Developer");
```

HashMap first calls

```java
employee1.hashCode();
```

Our overridden method executes.

```java
@Override
public int hashCode() {
    return Objects.hash(id, name);
}
```

Since

```text
id   = 101
name = Rudra
```

the generated hash code is the same every time for these values.

Example

```text
Objects.hash(101, "Rudra")

↓

54321 (example)
```

HashMap calculates

```text
Bucket = hashCode % Capacity

54321 % 16

↓

Bucket 5
```

Stores

```text
Bucket 5

employee1  ─────► Developer
```

---

# Step 5 : Search using `employee2`

```java
employeeDemo.get(employee2);
```

HashMap again calls

```java
employee2.hashCode();
```

Since `employee2` also has

```text
id   = 101
name = Rudra
```

it generates the **same hash code**.

```text
Objects.hash(101, "Rudra")

↓

54321
```

Again,

```text
54321 % 16

↓

Bucket 5
```

HashMap directly jumps to **Bucket 5**.

---

# Step 6 : Compare Keys using `equals()`

Bucket 5 contains

```text
employee1 ─────► Developer
```

HashMap now checks

```java
employee1.equals(employee2);
```

---

## Check 1

```java
if (this == obj)
```

```text
employee1 == employee2

↓

false
```

Continue.

---

## Check 2

```java
if (!(obj instanceof EmployeeKey))
```

```text
employee2 is EmployeeKey

↓

true
```

Continue.

---

## Check 3

```java
EmployeeKey other =
        (EmployeeKey) obj;
```

Now

```text
other

↓

employee2
```

---

## Check 4

Compare both fields.

```java
id == other.id

↓

101 == 101

↓

true
```

```java
Objects.equals(name, other.name)

↓

Rudra == Rudra

↓

true
```

Final result

```text
true && true

↓

true
```

---

# Step 7 : Return Value

HashMap now knows

```text
Correct Bucket ✔

Correct Key ✔
```

Therefore,

```text
Return

Developer
```

---

# Complete Flow

```text
employee2

      │
      ▼

hashCode()

      │
      ▼

Bucket 5

      │
      ▼

employee1 found

      │
      ▼

equals()

      │
      ▼

101 == 101 ✔

Rudra == Rudra ✔

      │
      ▼

true

      │
      ▼

Developer
```

---

# Memory Trick

```text
hashCode()

↓

Find Bucket

↓

equals()

↓

Find Correct Key

↓

Return Value
```

## Interview Answer

> `hashCode()` finds the correct bucket, and `equals()` verifies that the key inside that bucket matches the searched key. Since both methods are overridden correctly, `employee2` is considered equal to `employee1`, so HashMap returns `"Developer"`.


# Hash Collision in HashMap (Step-by-Step)

## Example Code

```java
HashMap<CollisionKey, String> collisionDemo =
        new HashMap<>();

collisionDemo.put(new CollisionKey(1), "Java");

collisionDemo.put(new CollisionKey(2), "Python");

collisionDemo.put(new CollisionKey(3), "Spring");
```

---

# Step 1 : Create HashMap

```java
HashMap<CollisionKey, String> collisionDemo =
        new HashMap<>();
```

Initially

```text
HashMap

Empty
```

---

# Step 2 : Insert First Entry

```java
collisionDemo.put(
        new CollisionKey(1),
        "Java"
);
```

HashMap first calls

```java
hashCode()
```

Our overridden method

```java
@Override
public int hashCode() {

    return 1;

}
```

always returns

```text
1
```

So

```text
Bucket = 1
```

HashMap stores

```text
Bucket 1

CollisionKey(1)
      │
      ▼
    Java
```

---

# Step 3 : Insert Second Entry

```java
collisionDemo.put(
        new CollisionKey(2),
        "Python"
);
```

Again

```java
hashCode()
```

returns

```text
1
```

HashMap again goes to

```text
Bucket 1
```

Now Bucket 1 already contains

```text
CollisionKey(1)
```

HashMap cannot immediately store the new entry.

It first checks

```java
CollisionKey(1).equals(
        CollisionKey(2)
);
```

Internally

```java
return id == other.id;
```

Comparison

```text
1 == 2

↓

false
```

Means

```text
Different Key
```

So HashMap stores it in the same bucket.

```text
Bucket 1

CollisionKey(1) ───► Java

CollisionKey(2) ───► Python
```

This situation is called

```text
Hash Collision
```

because two different keys have the same hash code.

---

# Step 4 : Insert Third Entry

```java
collisionDemo.put(
        new CollisionKey(3),
        "Spring"
);
```

Again

```java
hashCode()
```

returns

```text
1
```

HashMap goes to

```text
Bucket 1
```

Now Bucket 1 contains

```text
CollisionKey(1)

CollisionKey(2)
```

HashMap compares one by one.

First

```java
CollisionKey(1).equals(
        CollisionKey(3)
);
```

Result

```text
1 == 3

↓

false
```

Move to next entry.

Now

```java
CollisionKey(2).equals(
        CollisionKey(3)
);
```

Result

```text
2 == 3

↓

false
```

No matching key found.

Store new entry.

---

# Final Bucket

```text
Bucket 1

CollisionKey(1)
        │
        ▼
      Java

CollisionKey(2)
        │
        ▼
     Python

CollisionKey(3)
        │
        ▼
     Spring
```

All three entries are stored inside the **same bucket**.

---

# Why Doesn't HashMap Replace the Value?

Suppose you insert

```java
collisionDemo.put(
        new CollisionKey(1),
        "Java 21"
);
```

HashMap

```text
hashCode()

↓

Bucket 1
```

Finds

```text
CollisionKey(1)
```

Now

```java
CollisionKey(1).equals(
        CollisionKey(1)
);
```

returns

```text
true
```

Since the key already exists,

HashMap replaces the value.

```text
Before

CollisionKey(1)
      │
      ▼
     Java

↓

After

CollisionKey(1)
      │
      ▼
    Java 21
```

No new entry is created.

---

# Retrieval Example

Suppose

```java
collisionDemo.get(
        new CollisionKey(2)
);
```

HashMap

### Step 1

```text
hashCode()

↓

1

↓

Bucket 1
```

### Step 2

Check first entry

```java
CollisionKey(1).equals(
        CollisionKey(2)
);
```

Result

```text
false
```

Move to next.

### Step 3

```java
CollisionKey(2).equals(
        CollisionKey(2)
);
```

Result

```text
true
```

HashMap immediately returns

```text
Python
```

---

# Internal Search Flow

```text
get(CollisionKey(2))

        │
        ▼

hashCode()

        │
        ▼

Bucket 1

        │
        ▼

CollisionKey(1)

equals()

false

        │
        ▼

CollisionKey(2)

equals()

true

        │
        ▼

Return

Python
```

---

# Why Force `hashCode()` to Return `1`?

Normally,

```java
hashCode()
```

generates different hash codes for different objects.

For learning purposes, we intentionally write

```java
@Override
public int hashCode() {

    return 1;

}
```

so that

```text
Every object

↓

Same Bucket

↓

Collision Happens
```

This makes it easy to understand how HashMap resolves collisions.

---

# Interview Points

- Different keys **can have the same hash code**.
- This situation is called a **Hash Collision**.
- HashMap stores all collided entries in the **same bucket**.
- `hashCode()` finds the bucket.
- `equals()` identifies the correct key inside that bucket.
- If `equals()` returns `true`, the value is replaced (during `put()`) or returned (during `get()`).
- If `equals()` returns `false`, HashMap continues checking the next entry in the same bucket.