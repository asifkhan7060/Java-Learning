# Choosing the Right Collection in Java

## Comparison Table

| Collection | Stores Data As   | Ordered?   | Duplicates Allowed?   | Why Use It?                                               | Real-Life Example           |
| ---------- | ---------------- | ---------- | --------------------- | --------------------------------------------------------- | --------------------------- |
| **List**   | Single Values    | Yes        | Yes                   | When you want to keep items in order and allow duplicates | Shopping Cart, Playlist     |
| **Set**    | Single Values    | No*        | No                    | When every item must be unique                            | Email IDs, Unique Usernames |
| **Queue**  | Single Values    | Yes (FIFO) | Yes                   | When items wait and are processed one by one              | Ticket Counter, Print Queue |
| **Map**    | Key → Value Pair | N/A        | Keys: No, Values: Yes | When you need to find data using a key                    | Roll No → Student Name      |

> **Note:** `LinkedHashSet` maintains insertion order, but duplicates are still not allowed.

---

## Simple Decision Table

| Requirement                         | Collection to Use |
| ----------------------------------- | ----------------- |
| Need order?                         | **List**          |
| Need unique values only?            | **Set**           |
| Need First-In-First-Out processing? | **Queue**         |
| Need Key → Value mapping?           | **Map**           |

---

## Practical Examples

| Problem                     | Best Collection | Reason                   |
| --------------------------- | --------------- | ------------------------ |
| Songs in a playlist         | List            | Order matters            |
| Registered email IDs        | Set             | No duplicates allowed    |
| Customers waiting in line   | Queue           | First come, first served |
| Employee ID → Employee Name | Map             | Fast lookup by ID        |

---

## Memory Trick

| Collection | Remember As             |
| ---------- | ----------------------- |
| **List**   | Ordered Collection      |
| **Set**    | Unique Collection       |
| **Queue**  | Waiting Line Collection |
| **Map**    | Lookup Collection       |

---

## Quick Revision

```text
List  → Order + Duplicates

Set   → Unique Values

Queue → FIFO Processing

Map   → Key-Value Lookup
```
