# PriorityQueue Internal Working (Binary Min Heap)

## Important Note

> **PriorityQueue is NOT a Sorted Collection.**

It internally stores elements as a **Binary Min Heap**.

The heap only guarantees:

```text
Parent <= Children
```

It does **NOT** guarantee:

```text
Left Child <= Right Child
```

Therefore,

```java
System.out.println(priorityQueue);
```

prints the **internal heap structure**, **not** the elements in sorted order.

---

# Example

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(80);
pq.add(30);
pq.add(40);
```

---

## Step 1 : add(80)

```text
Heap

80

Array

[80]
```

---

## Step 2 : add(30)

Insert at the end.

```text
    80
   /
 30
```

Compare with parent.

```text
30 < 80
```

Perform **siftUp**.

```text
    30
   /
 80
```

Array

```text
[30, 80]
```

---

## Step 3 : add(40)

Insert at the end.

```text
      30
     /  \
   80    40
```

Compare with parent.

```text
40 > 30
```

Heap property is already satisfied.

No swapping required.

Final Heap

```text
      30
     /  \
   80    40
```

Internal Array

```text
[30, 80, 40]
```

---

# Why is 80 before 40?

Many students expect:

```text
[30, 40, 80]
```

But Java prints:

```text
[30, 80, 40]
```

This is correct because Heap only checks:

```text
30 <= 80 ✔

30 <= 40 ✔
```

It **never compares siblings**.

```text
80 and 40

❌ No comparison
```

So this is a perfectly valid Min Heap.

---

# Heap Rule

```text
        Parent
           │
           ▼
Parent <= Left Child

Parent <= Right Child

Sibling Comparison ✘
```

---

# Printing the Queue

```java
System.out.println(pq);
```

Output

```text
[30, 80, 40]
```

This is the **internal heap representation**, **not** sorted order.

---

# Retrieving Elements

Use

```java
poll()
```

because it always removes the **root**.

---

## poll() #1

Current Heap

```text
      30
     /  \
   80    40
```

Remove Root

```text
30
```

Move last element to root.

```text
      40
     /
   80
```

Heap property satisfied.

Output

```text
30
```

---

## poll() #2

Current Heap

```text
    40
   /
 80
```

Remove Root

```text
40
```

Move last element to root.

```text
80
```

Output

```text
40
```

---

## poll() #3

Current Heap

```text
80
```

Remove Root.

Heap becomes empty.

Output

```text
80
```

---

# Final Output

```text
30
40
80
```

Notice that **poll() returns elements in priority (sorted) order**, while `System.out.println()` only shows the internal heap.

---

# Time Complexity

| Operation | Internal Work | Complexity |
|-----------|---------------|------------|
| `offer()` / `add()` | Insert → siftUp | **O(log n)** |
| `poll()` | Remove Root → Move Last → siftDown | **O(log n)** |
| `peek()` | Return Root | **O(1)** |
| `remove(Object)` | Search + Heap Fix | **O(n)** |
| `grow()` | Resize Internal Array | **O(n)** |

---

# PriorityQueue(Comparator.reverseOrder())

By default, PriorityQueue creates a **Min Heap**.

Using:

```java
Comparator.reverseOrder()
```

creates a **Max Heap**.

---

## Example

```java
PriorityQueue<Integer> pq =
        new PriorityQueue<>(Comparator.reverseOrder());

pq.add(10);
pq.add(40);
pq.add(20);
```

---

## Step 1 : add(10)

```text
Heap

10

Array

[10]
```

---

## Step 2 : add(40)

Insert at the end.

```text
10
/
40
```

Comparator checks

```text
40 > 10
```

Since larger values have higher priority,

perform **siftUp**.

```text
     40
    /
   10
```

Array

```text
[40, 10]
```

---

## Step 3 : add(20)

Insert at the end.

```text
      40
     /  \
   10    20
```

Comparator checks

```text
20 > 40
```

False

No swapping required.

Final Heap

```text
      40
     /  \
   10    20
```

Internal Array

```text
[40, 10, 20]
```

---

## Why isn't it

```text
[40, 20, 10]
```

Because a Heap only guarantees

```text
Parent >= Children
```

It does **NOT** compare siblings.

```text
40 >= 10 ✔

40 >= 20 ✔

10 and 20 ❌ Not Compared
```

So

```text
[40,10,20]
```

is a valid Max Heap.

---

## poll()

### Initial Heap

```text
      40
     /  \
   10    20
```

Remove Root (40)

Move Last Element (20) to Root

```text
    20
   /
10
```

Heap property satisfied.

Output

```text
40
```

---

### poll()

```text
20
```

---

### poll()

```text
10
```

---

## Final Output

```text
40
20
10
```
---

# Interview Points

- PriorityQueue internally uses a **Binary Heap**.
- Default implementation is a **Min Heap**.
- Printing the queue does **not** display sorted order.
- Heap guarantees **Parent ≤ Children**, not sibling ordering.
- Use `poll()` to retrieve elements in priority order.
- `offer()` and `poll()` maintain the heap using **siftUp** and **siftDown**.
