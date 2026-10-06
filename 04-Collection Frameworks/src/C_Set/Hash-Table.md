# HashSet Internal Working

## 1. The Problem

Suppose we want to store many elements:

```java
Set<String> cities = new HashSet<>();

cities.add("Mumbai");
cities.add("Delhi");
cities.add("Pune");
cities.add("Nagpur");
cities.add("Bhopal");
```

The main requirements are:

- Do not store duplicates.
- Quickly find whether an element already exists.
- Quickly add a new element.
- Quickly remove an element.

### What happens with a simple list?

Imagine all elements are stored one after another:

```text
Index
  0 → Mumbai
  1 → Delhi
  2 → Pune
  3 → Nagpur
  4 → Bhopal
```

Now suppose we want to check:

```java
cities.contains("Pune");
```

We may have to check:

```text
Mumbai  → No
Delhi   → No
Pune    → YES
```

As the number of elements increases, searching can require checking many elements.

So we need a better way to quickly determine:

> **"Where should this element be stored?"**

---

# 2. The Solution — Hash Table

HashSet uses a **hash table** internally.

Instead of simply storing elements one after another, Java uses a **bucket array**.

Think of it like this:

```text
                 HashSet
                    │
                    ▼
              Bucket Array
```

Each bucket can contain zero or more elements.

For understanding, assume there are **8 buckets**:

| Bucket Index | Stored Elements |
|---:|---|
| 0 | — |
| 1 | — |
| 2 | — |
| 3 | — |
| 4 | — |
| 5 | — |
| 6 | — |
| 7 | — |

The bucket number is determined using the element's hash information.

---

# 3. First Insertion — Empty Bucket

Suppose we add:

```java
cities.add("Mumbai");
```

For explanation, assume:

```text
"Mumbai" → hashCode() → Bucket 3
```

### Bucket Table

| Bucket | Stored Elements | Situation |
|---:|---|---|
| 0 | — | Empty |
| 1 | — | Empty |
| 2 | — | Empty |
| **3** | **Mumbai** | **Element stored** |
| 4 | — | Empty |
| 5 | — | Empty |
| 6 | — | Empty |
| 7 | — | Empty |

### What happened?

```text
"Mumbai"
    ↓
hashCode()
    ↓
Bucket 3
    ↓
Bucket is empty
    ↓
Store "Mumbai"
```

---

# 4. Second Element — Another Empty Bucket

Now add:

```java
cities.add("Delhi");
```

Assume:

```text
"Delhi" → Bucket 6
```

### Bucket Table

| Bucket | Stored Elements | Situation |
|---:|---|---|
| 0 | — | Empty |
| 1 | — | Empty |
| 2 | — | Empty |
| 3 | Mumbai | Existing element |
| 4 | — | Empty |
| 5 | — | Empty |
| **6** | **Delhi** | **Element stored** |
| 7 | — | Empty |

No collision has happened.

---

# 5. The Important Problem — Collision

Now suppose:

```text
"Pune" → Bucket 3
```

But Bucket 3 already contains `"Mumbai"`.

This is called a **collision**.

### Bucket Table

| Bucket | Stored Elements | Situation |
|---:|---|---|
| 0 | — | Empty |
| 1 | — | Empty |
| 2 | — | Empty |
| **3** | **Mumbai** | **Collision occurs when Pune arrives** |
| 4 | — | Empty |
| 5 | — | Empty |
| 6 | Delhi | Existing element |
| 7 | — | Empty |

We cannot simply throw `"Pune"` away because:

```text
"Pune" ≠ "Mumbai"
```

So Java needs another check.

---

# 6. `equals()` Solves the Collision Decision

When multiple elements are in the same bucket, Java uses `equals()` to determine whether the new element is actually equal to an existing element.

For `"Pune"`:

```text
"Pune"
   ↓
hashCode()
   ↓
Bucket 3
   ↓
Bucket already contains Mumbai
   ↓
equals()
   ↓
"Pune".equals("Mumbai")
   ↓
false
   ↓
Different element
   ↓
Store Pune
```

### Bucket Table After Collision

| Bucket | Stored Elements | Result |
|---:|---|---|
| 0 | — | Empty |
| 1 | — | Empty |
| 2 | — | Empty |
| **3** | **Mumbai → Pune** | **Collision but both are different** |
| 4 | — | Empty |
| 5 | — | Empty |
| 6 | Delhi | Existing element |
| 7 | — | Empty |

### Important

A collision **does not mean duplicate**.

```text
Collision
   ↓
Same bucket
   ↓
equals() == false
   ↓
Both elements can be stored
```

---

# 7. Duplicate Scenario

Now suppose we add `"Mumbai"` again:

```java
cities.add("Mumbai");
```

Its hash leads to Bucket 3.

Bucket 3 already contains `"Mumbai"`.

Java checks:

```java
"Mumbai".equals("Mumbai")
```

Result:

```text
true
```

Therefore it is a duplicate.

### Bucket Table

| Bucket | Stored Elements | Result |
|---:|---|---|
| 0 | — | No change |
| 1 | — | No change |
| 2 | — | No change |
| **3** | **Mumbai → Pune** | **Duplicate Mumbai rejected** |
| 4 | — | No change |
| 5 | — | No change |
| 6 | Delhi | No change |
| 7 | — | No change |

The new `"Mumbai"` is **not stored**.

```text
add("Mumbai")
      ↓
hashCode()
      ↓
Bucket 3
      ↓
Compare existing element
      ↓
equals() → true
      ↓
Duplicate
      ↓
Do not store
      ↓
add() returns false
```

---

# 8. Multiple Collisions in One Bucket

Suppose `"Nagpur"` and `"Bhopal"` also map to Bucket 3.

Now the bucket may contain several different elements.

### Bucket Table

| Bucket | Stored Elements |
|---:|---|
| 0 | — |
| 1 | — |
| 2 | — |
| **3** | **Mumbai → Pune → Nagpur → Bhopal** |
| 4 | — |
| 5 | — |
| 6 | Delhi |
| 7 | — |

Now suppose:

```java
cities.add("Nagpur");
```

Java goes to Bucket 3 and checks whether an equal element already exists.

Conceptually:

```text
Bucket 3
   │
   ├── Mumbai
   │      ↓
   │   equals("Nagpur") → false
   │
   ├── Pune
   │      ↓
   │   equals("Nagpur") → false
   │
   ├── Nagpur
   │      ↓
   │   equals("Nagpur") → true
   │
   └── Bhopal
```

An equal element is found, so the new `"Nagpur"` is rejected.

---

# 9. Same Hash Code Does Not Always Mean Same Object

Two different objects can produce the same hash value.

For example:

```text
Object A
   ↓
hashCode() → 100

Object B
   ↓
hashCode() → 100
```

Both can therefore end up in the same bucket.

But:

```text
A.equals(B)
```

may return:

```text
false
```

So both can exist in the HashSet.

### Remember

```text
Same hashCode
      ≠
Same object / duplicate
```

The final duplicate decision depends on `equals()`.

---

# 10. Different Hash Values

If two elements lead to different buckets:

```text
"Mumbai" → Bucket 3
"Delhi"  → Bucket 6
```

there is no collision between them.

### Bucket Table

| Bucket | Stored Elements |
|---:|---|
| 0 | — |
| 1 | — |
| 2 | — |
| **3** | **Mumbai** |
| 4 | — |
| 5 | — |
| **6** | **Delhi** |
| 7 | — |

This is the simplest case.

---

# 11. When a Bucket Becomes Heavily Crowded

Normally, a bucket can contain a chain of entries.

Conceptually:

```text
Bucket 3

Mumbai
   ↓
Pune
   ↓
Nagpur
   ↓
Bhopal
   ↓
...
```

If a bucket becomes sufficiently crowded, Java 8+ can convert that bucket's structure into a **Red-Black Tree**.

### Before

```text
Bucket 3
   ↓
Entry
   ↓
Entry
   ↓
Entry
   ↓
Entry
```

### After Treeification

```text
             Entry
            /     \
        Entry      Entry
        /  \       /  \
     Entry Entry Entry Entry
```

The purpose is to improve lookup performance in heavily-collided buckets.

---

# 12. Complete Bucket Table Example

After several insertions, our simplified HashSet could look like this:

| Bucket | Contents | What Happened |
|---:|---|---|
| 0 | — | Empty |
| 1 | — | Empty |
| 2 | — | Empty |
| **3** | **Mumbai → Pune → Nagpur → Bhopal** | Multiple collisions |
| 4 | — | Empty |
| 5 | — | Empty |
| **6** | **Delhi** | Normal insertion |
| 7 | — | Empty |

Notice that **bucket 3 contains different elements** even though they mapped to the same bucket.

---

# 13. Complete Decision Process

Now the entire process makes sense:

```text
                 Add Element
                      │
                      ▼
                 hashCode()
                      │
                      ▼
                Find Bucket
                      │
            ┌─────────┴─────────┐
            │                   │
        Bucket Empty?       Bucket Occupied
            │                   │
           YES                  ▼
            │                equals()
            ▼                   │
          Store        ┌────────┴────────┐
                       │                 │
                     true              false
                       │                 │
                       ▼                 ▼
                   Duplicate         Collision
                       │                 │
                       ▼                 ▼
                     Ignore        Store element
```

---

# 14. The Core Idea

The entire HashSet mechanism can be remembered as:

```text
        hashCode()
            ↓
      Find the bucket
            ↓
         equals()
            ↓
     ┌──────┴──────┐
     │             │
   true          false
     │             │
     ▼             ▼
 Duplicate      Different
     │             │
     ▼             ▼
   Ignore        Store
```

### Memory Trick

> **`hashCode()` finds the bucket. `equals()` decides whether the element is already there.**

---

# 15. Collision vs Duplicate

| Concept | Meaning | Example | Result |
|---|---|---|---|
| No collision | Elements go to different buckets | Mumbai → 3, Delhi → 6 | Both stored |
| Collision | Different elements reach same bucket | Mumbai → 3, Pune → 3 | `equals()` checks them |
| Duplicate | Equal element already exists | Mumbai → 3, Mumbai → 3 | New one ignored |
| Heavy collision | Bucket becomes highly crowded | Many entries → Bucket 3 | Treeification may occur |

### Most Important Difference

```text
Collision
→ Same bucket

Duplicate
→ equals() returns true
```

So:

```text
Same Bucket
    ↓
Does NOT automatically mean Duplicate
    ↓
equals() decides
```
```