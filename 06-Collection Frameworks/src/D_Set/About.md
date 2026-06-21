# Java Set Interface — Complete Guide

## 1. What is Set?

`Set<E>` is a child interface of `Collection<E>` that stores **unique elements only** — duplicates are automatically rejected. Unlike `List`, it provides **no index-based access** and ordering depends on the implementation.

```java
public interface Set<E> extends Collection<E>
```

**Hierarchy:**
```
Iterable → Collection → Set
                           ├── HashSet
                           ├── LinkedHashSet
                           └── TreeSet (implements SortedSet → NavigableSet)
```

---

## 2. Set Implementations

| Feature | **HashSet** | **LinkedHashSet** | **TreeSet** |
|---------|-------------|---------------------|-------------|
| Internal Structure | Hash Table | Hash Table + Linked List | Red-Black Tree |
| Duplicate Elements | ❌ | ❌ | ❌ |
| Insertion Order | ❌ | ✅ | ❌ |
| Sorted Order | ❌ | ❌ | ✅ |
| Null Allowed | One | One | ❌ |
| Thread-Safe | ❌ | ❌ | ❌ |
| Performance | **Fastest** O(1)* | Fast O(1)* | Moderate O(log n) |
| Memory Usage | Low | Medium | High |

> *Average case for hash-based operations

### When to Choose What

```
Need maximum performance (fast lookup/insert)?
        │
       Yes ───► HashSet
        │
        No
        ▼
Need to preserve insertion order?
        │
       Yes ───► LinkedHashSet
        │
        No
        ▼
Need sorted data or range queries?
        │
       Yes ───► TreeSet
```

---

## 3. Core Set Methods

### Inherited from Collection
`add()`, `addAll()`, `remove()`, `removeAll()`, `removeIf()`, `retainAll()`, `contains()`, `containsAll()`, `size()`, `isEmpty()`, `clear()`, `toArray()`, `stream()`, `equals()`, `hashCode()`

> **Note:** The `Set` interface itself introduces **no new methods** beyond `Collection`. Additional capabilities come from sub-interfaces.

### SortedSet Methods (TreeSet)

| Method | Description | Example |
|--------|-------------|---------|
| `first()` | Smallest element | `set.first()` → `10` |
| `last()` | Largest element | `set.last()` → `30` |
| `headSet(E to)` | Elements < `to` | `set.headSet(20)` → `[10]` |
| `tailSet(E from)` | Elements ≥ `from` | `set.tailSet(20)` → `[20, 30]` |
| `subSet(E from, E to)` | Range `[from, to)` | `set.subSet(20, 40)` → `[20, 30]` |
| `comparator()` | Comparator used (null if natural ordering) | — |

### NavigableSet Methods (TreeSet)

| Method | Description |
|--------|-------------|
| `lower(E e)` | Greatest element **strictly less** than `e` |
| `floor(E e)` | Greatest element **≤** `e` |
| `ceiling(E e)` | Smallest element **≥** `e` |
| `higher(E e)` | Smallest element **strictly greater** than `e` |
| `pollFirst()` | Remove and return first (smallest) element |
| `pollLast()` | Remove and return last (largest) element |
| `descendingSet()` | Reverse-order view |
| `descendingIterator()` | Iterator in reverse order |
| `subSet(from, boolean, to, boolean)` | Range with inclusive/exclusive control |
| `headSet(to, boolean)` | Head set with inclusive flag |
| `tailSet(from, boolean)` | Tail set with inclusive flag |

### Java 21+ SequencedSet Methods (LinkedHashSet)

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
for (Integer value : set) {
    System.out.println(value);
}

// 2. Iterator
Iterator<Integer> it = set.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

// 3. Spliterator
set.spliterator().forEachRemaining(System.out::println);

// 4. Stream
set.stream().forEach(System.out::println);
```

---

## 5. Internal Working

### Hashing Basics (HashSet & LinkedHashSet)

When an element is inserted:
```
Element → hashCode() → Bucket Selection → equals() → Store or Ignore
```

- **`hashCode()`** determines the bucket index: `bucket = hashCode() % tableSize`
- **`equals()`** resolves collisions — if two objects land in the same bucket, `equals()` checks true equality
- **Collision:** Two different objects generating the same bucket index. Handled internally via chaining or treeing.

### HashSet — Hash Table Only
```
Bucket 0 → null
Bucket 1 → 20
Bucket 2 → null
Bucket 3 → 15 → 40 (collision resolved)
Bucket 4 → 10
```
- Fast O(1) average for add/remove/contains
- No ordering guarantee

### LinkedHashSet — Hash Table + Doubly Linked List
```
Hash Table:    20    15    40    10
Linked List:   20 ⇄ 15 ⇄ 40 ⇄ 10
```
- Maintains insertion order via linked list
- Slightly more memory overhead than HashSet

### TreeSet — Red-Black Tree
```
       20
      /      10    30
          /         25  40
```
- Self-balancing BST guarantees O(log n) operations
- Elements sorted by natural ordering or custom `Comparator`
- No null elements (can't compare null)

---

## 6. Real-World Use Cases

| Scenario | Choice | Why |
|----------|--------|-----|
| Student roll numbers (unique IDs) | **HashSet** | Fast duplicate removal |
| Registered email IDs | **HashSet** | Uniqueness check, O(1) lookup |
| Browser history (no duplicates, preserve order) | **LinkedHashSet** | Unique + insertion order |
| Dictionary/words in alphabetical order | **TreeSet** | Auto-sorted |
| Leaderboard (sorted scores) | **TreeSet** | Sorted + range queries (`subSet`) |
| Unique tags (YouTube, Instagram) | **HashSet** | Fast uniqueness |

---

## 7. Common Mistakes

| Mistake | Problem | Solution |
|---------|---------|----------|
| Expecting `HashSet` to maintain insertion order | Output appears random | Use `LinkedHashSet` |
| Adding `null` to `TreeSet` | `NullPointerException` | `TreeSet` doesn't allow null |
| Using mutable objects in `HashSet` | Modifying `hashCode()`/`equals()` fields breaks lookups | Use immutable objects or don't modify after insertion |
| Adding custom objects to `TreeSet` without `Comparable`/`Comparator` | `ClassCastException` | Implement `Comparable` or provide `Comparator` |
| Expecting duplicates to be stored | Silently ignored | This is by design — verify with `add()` return value |

---

## 8. Best Practices

- ✅ Use **HashSet** as default for uniqueness-checking scenarios
- ✅ Use **LinkedHashSet** when iteration order must match insertion order
- ✅ Use **TreeSet** when sorted data or range queries (`subSet`, `headSet`, `tailSet`) are needed
- ✅ **Always override both `equals()` and `hashCode()`** for custom classes used in hash-based Sets
- ✅ Prefer **immutable objects** as Set elements
- ✅ Never modify fields affecting `equals()`/`hashCode()` after inserting into a hash-based Set
- ✅ For thread safety, use `Collections.synchronizedSet()` or `CopyOnWriteArraySet`

---

## 9. Quick Reference

| Operation | HashSet | LinkedHashSet | TreeSet |
|-----------|:-------:|:-------------:|:-------:|
| `add()` | **O(1)*** | **O(1)*** | O(log n) |
| `remove()` | **O(1)*** | **O(1)*** | O(log n) |
| `contains()` | **O(1)*** | **O(1)*** | O(log n) |
| `first()`/ `last()` | N/A | N/A | O(log n) |
| `lower()`/ `ceiling()` | N/A | N/A | O(log n) |
| Iteration order | Unpredictable | Insertion order | Sorted order |
| Null support | One | One | ❌ |
| Memory | Low | Medium | High |

> *Average case; worst case O(n) if hash collisions are excessive

---

## 10. Interview Q&A

**Q: Why does `HashSet` use both `hashCode()` and `equals()`?**  
A: `hashCode()` finds the bucket quickly; `equals()` verifies actual equality when collisions occur.

**Q: Why is `HashSet` faster than `TreeSet`?**  
A: `HashSet` uses hashing (O(1) average); `TreeSet` uses Red-Black Tree (O(log n)).

**Q: Why doesn't `TreeSet` allow `null`?**  
A: `TreeSet` sorts by comparison; comparing `null` with other elements throws `NullPointerException`.

**Q: What happens when duplicates are added to a Set?**  
A: The duplicate is silently ignored; `add()` returns `false`.

**Q: Why is modifying objects after inserting into `HashSet` dangerous?**  
A: The object's hash bucket was determined by the original state. Modifying fields changes `hashCode()`, making the object unreachable in its original bucket.

**Q: Which Set supports navigation methods like `higher()` and `ceiling()`?**  
A: `TreeSet` via the `NavigableSet` interface.

**Q: Which Set is most memory-efficient?**  
A: `HashSet` — no extra pointers for ordering or tree balancing.

---

## One-Line Summary

> **HashSet** → Fastest, unordered, one null allowed  
> **LinkedHashSet** → Fast + preserves insertion order, one null allowed  
> **TreeSet** → Sorted, navigation methods, no null, O(log n)

> **Key Principle:** Choose based on whether you need **speed** (HashSet), **order** (LinkedHashSet), or **sorting** (TreeSet).
