# Red-Black Tree

## 1. Why do we need a Red-Black Tree?

A normal **Binary Search Tree (BST)** follows:

```text
Left subtree < Root < Right subtree
```

Example:

```text
        40
       /  \
     20    60
    / \    / \
   10 30  50 70
```

Searching is efficient when the tree is balanced.

But a BST can become unbalanced.

Suppose we insert:

```text
10 → 20 → 30 → 40 → 50
```

A normal BST can become:

```text
10
  \
   20
     \
      30
        \
         40
           \
            50
```

Now it behaves almost like a linked list.

```text
Balanced BST   → O(log n)
Unbalanced BST → O(n)
```

So we need a BST that can **automatically maintain balance**.

---

# 2. What is a Red-Black Tree?

A **Red-Black Tree is a self-balancing Binary Search Tree in which every node has an additional color: Red or Black.**

The color rules help prevent the tree from becoming too unbalanced.

```text
Binary Search Tree
        +
Red/Black rules
        ↓
Self-balancing tree
        ↓
O(log n) height
```

Java uses Red-Black Trees in:

```text
TreeSet
TreeMap
```

---

# 3. Basic Structure

Each node conceptually contains:

```text
┌─────────────────┐
│ Element / Key   │
│ Color           │
│ Left            │
│ Right           │
│ Parent          │
└─────────────────┘
```

Example:

```text
          20(B)
         /     \
      10(R)   30(R)
```

Where:

```text
B = Black
R = Red
```

The important additional information compared with a normal BST is the **color**.

---

# 4. The 5 Important Rules

A valid Red-Black Tree follows these rules.

### Rule 1 — Every node is Red or Black

```text
Node → Red OR Black
```

---

### Rule 2 — The root is Black

```text
        20(B)
```

The root must be black.

---

### Rule 3 — A Red node cannot have a Red child

Invalid:

```text
        20(R)
        /
      10(R)   ❌
```

Valid:

```text
        20(B)
        /
      10(R)   ✅
```

---

### Rule 4 — NIL/leaf nodes are Black

In Red-Black Tree theory, missing children are represented by special **NIL nodes**, and these are considered black.

Conceptually:

```text
        20(B)
       /     \
    10(R)   30(R)
    /  \     /  \
  NIL NIL  NIL NIL
   B   B    B   B
```

These NIL nodes are usually omitted from simple diagrams.

---

### Rule 5 — Every root-to-leaf path has the same number of Black nodes

This maintains **black-height consistency**.

Example:

```text
             20(B)
            /     \
         10(B)    30(B)
         /  \      /  \
       NIL NIL   NIL NIL
```

Every path from the root to a NIL leaf contains the same number of black nodes.

---

# 5. Why These Rules Keep It Balanced

The important rules are:

```text
Red node cannot have Red child
             +
Every path has same black-height
             ↓
Tree cannot become excessively skewed
             ↓
Height remains O(log n)
```

A Red-Black Tree is **not perfectly balanced**.

It is only balanced enough to guarantee logarithmic height.

---

# 6. Red-Black Tree vs Perfectly Balanced Tree

The tree does **not** need to have exactly equal branch lengths.

Example:

```text
          20(B)
         /     \
      10(B)    30(R)
                  \
                  40(B)
```

The left and right sides are not identical in shape, but the Red-Black rules still keep the tree within a controlled height.

So:

```text
Red-Black Tree
≠
Perfectly balanced tree
```

---

# 7. Height of a Red-Black Tree

For `n` nodes:

```text
Height = O(log n)
```

Therefore common operations are:

| Operation | Complexity |
|---|---:|
| Search | O(log n) |
| Insert | O(log n) |
| Delete | O(log n) |
| `first()` | O(log n) |
| `last()` | O(log n) |
| `floor()` | O(log n) |
| `ceiling()` | O(log n) |

The balancing operations also remain within logarithmic time.

---

# 8. How Does It Stay Balanced?

When a node is inserted or deleted, the tree may temporarily violate one or more Red-Black rules.

The tree restores them using two main techniques:

```text
1. Recoloring
2. Rotation
```

```text
Violation
    ↓
Recoloring / Rotation
    ↓
Red-Black properties restored
```

---

# 9. Recoloring

Recoloring means changing the color of nodes.

Example:

```text
          20(B)
         /     \
      10(R)    30(R)
```

A balancing situation may require colors to change:

```text
          20(R)
         /     \
      10(B)    30(B)
```

Then the root must remain black:

```text
          20(B)
         /     \
      10(B)    30(B)
```

Important:

```text
Recoloring
→ changes colors
→ does not change node positions
```

---

# 10. What is Rotation?

A rotation changes the **shape of the tree** while preserving the Binary Search Tree ordering.

There are two basic rotations:

```text
Left Rotation
Right Rotation
```

---

# 11. Right Rotation

Before:

```text
        30
       /
     20
    /
  10
```

Right rotation around `30`:

```text
       20
      /  \
    10    30
```

The BST ordering is still correct:

```text
10 < 20 < 30
```

So:

```text
Right Rotation
→ fixes a left-heavy structure
```

---

# 12. Left Rotation

Before:

```text
10
  \
   20
     \
      30
```

Left rotation around `10`:

```text
       20
      /  \
    10    30
```

The BST ordering remains:

```text
10 < 20 < 30
```

So:

```text
Left Rotation
→ fixes a right-heavy structure
```

### Two basic rotations to remember

```text
Right-heavy  → Left Rotation

Left-heavy   → Right Rotation
```