# ArrayDeque Internal Working (Resizable Circular Array)

## What is ArrayDeque?

`ArrayDeque` internally uses a **Resizable Circular Array**.

Unlike `ArrayList`, it is **optimized for operations at both ends (Front & Rear)**.

---

# Internal Representation

```text
Index

0    1    2    3    4    5    6    7

[ ][ ][30][40][50][ ][ ][ ]

      ↑             ↑
    Front         Rear
```

Although `ArrayDeque` stores elements in an array, it **does not expose index-based operations**.

Internally it only tracks:

- **Front Index**
- **Rear Index**

---

# Can We Access by Index?

❌ No.

These methods do **not** exist.

```java
deque.get(2);          // ❌

deque.add(2, 100);     // ❌

deque.remove(3);       // ❌
```

Because `ArrayDeque` implements:

```text
Deque
```

not

```text
List
```

---

# Circular Array Working

Assume the internal capacity is **5**.

## Step 1 : Initial Queue

```text
Front                     Rear
  ↓                          ↓

[10][20][30][40][50]
```

Queue is full.

---

## Step 2 : pollFirst()

Remove `10`.

```text
Front                  Rear
  ↓                      ↓

[  ][20][30][40][50]
```

Front moves forward.

Index **0** becomes empty.

---

## Step 3 : pollFirst()

Remove `20`.

```text
Front               Rear
  ↓                   ↓

[  ][  ][30][40][50]
```

Now two empty spaces exist.

However,

Rear is still at the last index.

---

## Problem with a Normal Array

Now insert:

```java
addLast(60);
```

Current queue

```text
Front               Rear
  ↓                   ↓

[  ][  ][30][40][50]
```

Rear cannot move beyond the last index.

Although empty spaces exist,

```text
[  ][  ][30][40][50]
```

they cannot be reused.

Without a circular array,

all elements would need to be shifted.

```text
[30][40][50][ ][ ]
```

Time Complexity

```text
O(n)
```

---

## Circular Array Solution

Instead of shifting,

the Rear wraps around.

```text
Rear

4 → 0
```

Insert:

```java
addLast(60);
```

```text
Front

  ↓

[60][  ][30][40][50]
 ↑
Rear
```

The empty space at index **0** is reused.

---

## Step 5 : addLast(70)

Rear moves again.

```text
0 → 1
```

```text
Front

  ↓

[60][70][30][40][50]
     ↑
    Rear
```

No shifting occurs.

---

# Wrap Around Formula

```java
rear = (rear + 1) % capacity;
```

Example

```text
Capacity = 5

Current Rear = 4

(4 + 1) % 5

= 0
```

So the movement becomes

```text
0 → 1 → 2 → 3 → 4 → 0 → 1 ...
```

---

# Supported Operations

## Insertion

```java
addFirst()
addLast()

offerFirst()
offerLast()

push()
offer()
```

Time Complexity

```text
Beginning → O(1)

End       → O(1)
```

---

## Deletion

```java
removeFirst()
removeLast()

pollFirst()
pollLast()

pop()
```

Time Complexity

```text
Beginning → O(1)

End       → O(1)
```

---

# Why No Middle Operations?

`ArrayDeque` is optimized for

```text
Front  ⇄  Rear
```

not

```text
Index 0
Index 1
Index 2
```

If Java allowed

```java
add(index, element);
```

or

```java
remove(index);
```

elements would need to be shifted.

Example

```text
Before

[10][20][30][40]

Insert 25

↓

[10][20][25][30][40]
```

Shifting is required.

Time Complexity

```text
O(n)
```

This defeats the purpose of `ArrayDeque`.

Therefore,

`ArrayDeque` **does not provide index-based methods**.

---

# Complexity Summary

| Operation | Complexity | Supported |
|-----------|:----------:|:---------:|
| `addFirst()` | **O(1)** | ✅ |
| `addLast()` | **O(1)** | ✅ |
| `removeFirst()` | **O(1)** | ✅ |
| `removeLast()` | **O(1)** | ✅ |
| `get(index)` | — | ❌ |
| `add(index, e)` | — | ❌ |
| `remove(index)` | — | ❌ |

---

# Advantages

- Reuses empty spaces.
- No element shifting.
- O(1) insertion at both ends.
- O(1) deletion at both ends.
- Automatically resizes when required.
- More efficient than `Stack` for stack operations.

---

# ArrayDeque vs ArrayList

| ArrayDeque | ArrayList |
|------------|-----------|
| Circular Array | Dynamic Array |
| Front & Rear based | Index based |
| O(1) insertion/deletion at both ends | O(1) random access |
| No index methods | Supports `get()`, `set()`, `add(index)`, `remove(index)` |
| No middle operations | Supports middle insertion/deletion |

---

# Interview Points

- `ArrayDeque` internally uses a **Resizable Circular Array**.
- It maintains **Front** and **Rear** indexes.
- It uses indexing internally but **does not expose index-based methods**.
- Optimized for **O(1)** insertion and deletion at both ends.
- Middle insertion, deletion, and random access are **not supported**.
- Considered a modern replacement for the legacy `Stack` class.
```