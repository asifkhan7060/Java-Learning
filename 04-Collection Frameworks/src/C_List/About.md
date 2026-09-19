# Java List Interface — Complete Guide

## 1. What is List?

`List<E>` is an **ordered collection** that:
- Maintains insertion order
- Allows **duplicate elements** and **multiple nulls**
- Supports **index-based access** (`0`-based)

```java
public interface List<E> extends Collection<E>
```

**Hierarchy:**
```
Iterable → Collection → List
                           ├── ArrayList
                           ├── LinkedList
                           ├── Vector
                           └── Stack (extends Vector)
```

---

## 2. List Implementations

| Feature | **ArrayList** | **LinkedList** | **Vector** | **Stack** |
|---------|---------------|----------------|------------|-----------|
| Internal Structure | Dynamic Array | Doubly Linked List | Dynamic Array | Dynamic Array (Vector) |
| Random Access | **O(1)** — Fast | **O(n)** — Slow | **O(1)** | **O(1)** |
| Insert/Delete (middle) | **O(n)** — Slow | **O(1)** — Fast | **O(n)** | **O(1)** at top |
| Thread-Safe | ❌ | ❌ | ✅ | ✅ |
| Memory Usage | Low | High | Low | Low |
| Primary Use | General purpose | Frequent insert/delete | Thread-safe apps | LIFO operations |

### When to Choose What

```
Need fast random access?     → ArrayList
Frequent insertions/deletions? → LinkedList
Need thread safety?          → Vector
Need LIFO (stack) behavior?  → Stack (or ArrayDeque in modern Java)
```

---

## 3. Core List Methods

### Inherited from Collection
`add()`, `addAll()`, `remove()`, `removeAll()`, `removeIf()`, `retainAll()`, `contains()`, `containsAll()`, `size()`, `isEmpty()`, `clear()`, `toArray()`, `stream()`, `equals()`, `hashCode()`

### List-Specific Methods (Index-Based)

| Method | Description | Example |
|--------|-------------|---------|
| `get(int index)` | Element at index | `list.get(0)` |
| `set(int index, E e)` | Replace at index | `list.set(1, 50)` |
| `add(int index, E e)` | Insert at index | `list.add(1, 100)` |
| `addAll(int i, Collection c)` | Insert collection at index | `list.addAll(2, other)` |
| `remove(int index)` | Remove at index | `list.remove(2)` |
| `indexOf(Object o)` | First occurrence index | `list.indexOf(20)` |
| `lastIndexOf(Object o)` | Last occurrence index | `list.lastIndexOf(20)` |
| `listIterator()` | Bidirectional iterator | — |
| `listIterator(int index)` | Iterator from index | — |
| `subList(int from, int to)` | View of range `[from, to)` | `list.subList(1, 4)` |
| `replaceAll(UnaryOperator)` | Transform all elements | `list.replaceAll(n -> n * 2)` |
| `sort(Comparator)` | Sort in place | `list.sort(Integer::compareTo)` |

# List-Specific Methods - Easy Memory Trick

## Memory Word

> **GESARFIMS** *(Pronounced: "Gee-Sar-Fims")*

Use this word to remember the order of **List-specific (Index-Based) methods**.

---

## Expansion

| Letter | Meaning | Methods                                                                                |
|--------|---------|----------------------------------------------------------------------------------------|
| **GE** | Get | `get(int index)`                                                                       |
| **S** | Set | `set(int index, E e)`                                                                  |
| **A** | Add | `add(int index, E e)`<br>`addAll(int index, Collection<? extends E> c)`                |
| **R** | Remove | `remove(int index)/removeif()`                                                         |
| **F** | Find | `indexOf(Object o)`<br>`lastIndexOf(Object o)`                                         |
| **I** | Iterate | `listIterator()`<br>`listIterator(int index)`<br>`subList(int fromIndex, int toIndex)` |
| **M** | Modify | `replaceAll(UnaryOperator<E> operator)`                                                |
| **S** | Sort | `sort(Comparator<? super E> c)`                                                        |

---

## One-Line Revision

> **GESARFIMS** → **Get → Set → Add → Remove → Find → Iterate → Modify → Sort**

### Java 21+ SequencedCollection Methods

```java
addFirst(E e)    // Insert at beginning
addLast(E e)     // Insert at end
getFirst()       // Access first element
getLast()        // Access last element
removeFirst()    // Remove first element
removeLast()     // Remove last element
reversed()       // Reversed-order view
```

---

## 4. Traversal Methods

```java
// 1. Enhanced For Loop
for (Integer value : list) {
    System.out.println(value);
}

// 2. Iterator
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

// 3. ListIterator (bidirectional)
ListIterator<Integer> lit = list.listIterator();
while (lit.hasNext()) {
    System.out.println(lit.next());
}

// 4. Spliterator
list.spliterator().forEachRemaining(System.out::println);

// 5. Stream
list.stream().forEach(System.out::println);
```

> ⚠️ **For LinkedList:** Avoid `for (int i=0; i<list.size(); i++) list.get(i)` — it's **O(n²)**. Use enhanced for-loop or Iterator instead.

---

## 5. Internal Working

### Dynamic Array (ArrayList, Vector, Stack)
- **Initial capacity:** 10
- **Growth:** Creates larger array → copies elements → discards old array
- **Memory:** Contiguous

### Doubly Linked List (LinkedList)
- Each node: `[prev | data | next]`
- **Memory:** Scattered (higher overhead)
- **Insertion/Deletion:** Just update node references

---

## 6. Real-World Use Cases

| Scenario | Recommended | Why |
|----------|-------------|-----|
| Student marks | **ArrayList** | Ordered, duplicates allowed, fast access |
| Music playlist | **ArrayList** | Sequential access, maintains order |
| Browser history | **LinkedList** | Efficient forward/backward navigation |
| Undo/Redo | **Stack** | LIFO behavior |
| Thread-safe shared list | **Vector** | Built-in synchronization |
| Shopping cart | **ArrayList** | General purpose, ordered |

---

## 7. Common Mistakes

| Mistake | Problem | Solution |
|---------|---------|----------|
| Using `LinkedList` for random access | O(n) per `get()` | Use `ArrayList` |
| Using `ArrayList` for frequent middle insertions | Shifts elements — O(n) each | Use `LinkedList` |
| Using `Vector` unnecessarily | Synchronization overhead | Use `ArrayList` + `Collections.synchronizedList()` if needed |
| Using `Stack` with `add()` instead of `push()` | Breaks stack semantics | Use `push()`, `pop()`, `peek()` |
| Index-based loop on `LinkedList` | O(n²) traversal | Use enhanced for-loop or Iterator |

---

## 8. Best Practices

- ✅ Use **ArrayList** as default for general-purpose lists
- ✅ Use **LinkedList** only when frequent insertions/deletions are needed
- ✅ Use **Vector** only when native synchronization is required
- ✅ Use **ArrayDeque** instead of **Stack** in modern Java (Stack is legacy)
- ✅ Prefer `Iterator` or enhanced for-loop over index-based loops for `LinkedList`
- ✅ Initialize `ArrayList` with expected capacity if known: `new ArrayList<>(1000)`

---

## 9. Quick Reference

| | ArrayList | LinkedList | Vector | Stack |
|--|:---------:|:----------:|:------:|:-----:|
| Structure | Dynamic Array | Doubly Linked List | Dynamic Array | Dynamic Array |
| `get(i)` | **O(1)** | O(n) | **O(1)** | **O(1)** |
| `add()` (end) | **O(1)*** | **O(1)** | **O(1)*** | **O(1)*** |
| `add(i, e)` | O(n) | **O(1)** | O(n) | O(n) |
| `remove(i)` | O(n) | **O(1)** | O(n) | **O(1)** (top) |
| Memory | Low | High | Low | Low |
| Thread-Safe | ❌ | ❌ | ✅ | ✅ |
| Modern Alternative | — | `ArrayDeque` for queue | `CopyOnWriteArrayList` | `ArrayDeque` |

> *Amortized O(1) — occasional resizing cost

---

## 10. Interview Q&A

**Q: Why is ArrayList faster than LinkedList for random access?**  
A: ArrayList uses contiguous memory; `get(i)` calculates address directly. LinkedList must traverse from head.

**Q: Why is Vector slower than ArrayList?**  
A: Every public method in Vector is `synchronized`, adding lock overhead.

**Q: Why is Stack considered legacy?**  
A: Modern Java recommends `Deque` (`ArrayDeque`) for stack operations — better performance and cleaner API.

**Q: Can List implementations store null?**  
A: Yes — all four allow multiple `null` values.

**Q: Which is best for multithreading?**  
A: `Vector` is synchronized, but `CopyOnWriteArrayList` is preferred for read-heavy concurrent scenarios.

---

## One-Line Summary

> **ArrayList** = Fast random access (default choice)  
> **LinkedList** = Fast insert/delete (queue/deque ops)  
> **Vector** = Thread-safe dynamic array  
> **Stack** = LIFO operations (legacy — prefer ArrayDeque)
