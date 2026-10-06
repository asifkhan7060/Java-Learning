> **Only questions I can trace to an actual candidate interview/assessment/report are included as “Authentic.”**
> Generic collection-question websites are useful for discovering topics, but I am **not using them as proof** that a company asked the question.

Your notes cover a very large area: **Collection Framework → List → Set → Queue → Deque → Map → Concurrent/Blocking collections → implementation-specific classes**.

---

# Java Collections Framework — Authentic Interview Questions

## 1. Collections Framework Fundamentals

### Q1. What is the Java Collections Framework?

**Reported in:** multiple Java interviews/assessments.

The topic itself is repeatedly tested in Java interviews; for example, Barclays explicitly reported questioning on the **Collections Framework**, including `ArrayList`, `LinkedList`, `HashSet`, and `TreeSet`. ([GeeksforGeeks][1])

**Topic:** Collection Framework
**Authenticity:** 🟢 Reported

---

### Q2. What is the difference between List, Set and Map?

**Company:** JPMorgan Chase — Java Developer, Bengaluru

The candidate reported being asked about **List vs Set** along with `ArrayList` vs `LinkedList`; this was part of a broader collections discussion. ([Jointaro][2])

A separate recent interview report from Janalakshmi Financial Services explicitly lists:

> Difference between List, Set, and Map?

along with `ArrayList` vs `LinkedList` and `HashSet` vs `TreeSet`. ([Glassdoor][3])

**Authenticity:** 🟢🟢

---

### Q3. Why is Map not a child of the Collection interface?

This is a common follow-up to the framework hierarchy. However, I **did not find sufficient candidate-report evidence for the exact question**, so:

**❌ Not counted as an authentic question.**

Keep it as a **practice question**, because it is directly relevant to your hierarchy notes.

---

# 2. List

## ArrayList vs LinkedList

### Q4. What is the difference between ArrayList and LinkedList?

**Company:** JPMorgan Chase — Java/Full Stack Developer, India

The candidate explicitly reported:

> "ArrayList vs. LinkedList."

([Jointaro][4])

It was also explicitly asked in another JPMorgan Java Developer interview and candidates were asked **when each should be used**. ([Jointaro][2])

**Authenticity:** 🟢🟢🟢

---

### Q5. In what scenarios would you use ArrayList vs LinkedList?

**Company:** JPMorgan Chase

The candidate reported being asked:

> `ArrayList vs. LinkedList (asking for scenarios where both should be used).`

([Jointaro][2])

**Authenticity:** 🟢 Direct

This is especially important because interviewers often don't stop at the definition.

---

### Q6. What is the difference between ArrayList and Vector?

**Company:** Wipro

The interview report explicitly lists:

> "Differentiate between ArrayList and Vector in Java."

It was also asked at Deloitte and Fortinet. ([Naukri][5])

**Authenticity:** 🟢🟢🟢

---

### Q7. What is the difference between ArrayList and Vector? Why would you choose one over the other?

**Company:** Deloitte / Fortinet / Wipro

The comparison was explicitly asked in multiple interviews. ([Jointaro][6])

**Authenticity:** 🟢🟢🟢

---

### Q8. How do you sort a List of Employee objects based on employee ID?

**Company:** JPMorgan Chase — Java/Full Stack Developer

The candidate explicitly reported:

> "How to sort a list of Employee objects based on emp ID?"

([Jointaro][4])

**Topic:** List → Sorting / Comparator
**Authenticity:** 🟢 Direct

---

### Q9. How do you remove duplicate Employee objects from a List based on employee ID?

**Company:** JPMorgan Chase

The interview report explicitly included:

> "Removing of duplicate Employee objects from a list based on their employee ID."

([Jointaro][4])

**Topic:** List → Set / `equals()` / `hashCode()` / Comparator
**Authenticity:** 🟢 Direct

---

# 3. Set

## HashSet / TreeSet / LinkedHashSet

### Q10. What is the difference between HashSet and TreeSet?

**Company:** Wipro

The candidate explicitly reported:

> "Differentiate between HashSet and TreeSet. When would you prefer TreeSet to HashSet?"

([Naukri][5])

The same comparison appeared in Barclays and Morgan Stanley interviews. ([GeeksforGeeks][1])

**Authenticity:** 🟢🟢🟢

---

### Q11. When would you prefer TreeSet over HashSet?

**Company:** Wipro

This was explicitly included as a follow-up in the reported question. ([Naukri][5])

**Authenticity:** 🟢 Direct

---

### Q12. How is HashSet implemented internally?

**Company:** Morgan Stanley — Senior Java Developer, Mumbai

The candidate explicitly reported:

> "How is a HashSet implemented internally?"

([Jointaro][7])

The same question was also reported in Walmart and Grid Dynamics interviews. ([Jointaro][8])

**Authenticity:** 🟢🟢🟢

---

### Q13. How does HashSet ensure uniqueness of elements?

**Company:** Boeing — SDE1, Bengaluru

The interview explicitly included:

> "How does a Set ensure uniqueness of elements?"

([Jointaro][9])

A NICE interview report similarly asks how `HashSet` internally identifies and stores duplicates. ([LinkedIn][10])

**Authenticity:** 🟢🟢

---

### Q14. How does HashSet internally identify and store duplicates?

**Company:** NICE — Java Backend interview

This was explicitly reported in the candidate's interview experience. ([LinkedIn][10])

**Authenticity:** 🟢 Direct

---

### Q15. If you create a custom class, what should you consider before storing its objects in a Set?

**Company:** NICE — Java Backend

The interview report explicitly asked what should be considered before storing a custom user-defined class in a `Set`. ([LinkedIn][10])

This is directly connected to:

```java
equals()
hashCode()
```

**Authenticity:** 🟢 Direct

---

# 4. Map

## HashMap

### Q16. How does HashMap work internally?

This is one of the **most strongly verified questions in this entire chapter**.

It was explicitly reported in:

* Deloitte
* Morgan Stanley
* Oracle
* Nokia
* JPMorgan Chase
* Grid Dynamics
* Walmart
* Nagarro
* others

For example, Deloitte explicitly asked:

> "How does a HashMap work internally?"

([Jointaro][6])

Nokia's 2025 interview went deeper into:

* internal working
* storing key-value pairs
* hashing
* collisions
* performance considerations. ([Naukri][11])

**Authenticity:** 🟢🟢🟢🟢🟢

### 🔥 This should be a MUST-KNOW question.

---

### Q17. How does HashMap store key-value pairs internally?

**Company:** Nokia

The candidate explicitly reported this as a follow-up to HashMap internals. ([Naukri][11])

**Authenticity:** 🟢 Direct

---

### Q18. How does hashing work in HashMap?

**Company:** Nokia

Explicitly reported in the HashMap internals section. ([Naukri][11])

**Authenticity:** 🟢 Direct

---

### Q19. How are collisions handled in HashMap?

**Company:** Nokia

The candidate explicitly reported:

> "How are collisions handled in a HashMap?"

([Naukri][11])

The same topic appears in Oracle and Visa interview reports. ([LinkedIn][12])

**Authenticity:** 🟢🟢🟢

---

### Q20. What is the time complexity of searching in a HashMap?

**Company:** Infosys campus interview

The candidate explicitly reported:

> "What is the time complexity of searching in a HashMap?"

([Reddit][13])

**Authenticity:** 🟢 Direct candidate report

---

### Q21. What happens if two different objects with the same data are used as HashMap keys?

**Company:** Nagarro — Java Developer

The candidate reported a concrete question:

```java
Student s = new Student("Hello", 28);
h.put(s, "A");

Student s1 = new Student("Hello", 28);

h.get(s1);
```

The interviewer asked what happens and then what changes if `equals()` is overridden. ([LinkedIn][14])

**Authenticity:** 🟢 Direct

This is an excellent real interview question because it tests:

* `hashCode()`
* `equals()`
* object identity
* HashMap lookup

---

### Q22. What is the relationship between equals() and hashCode() in HashMap?

**Company:** Nagarro / Oracle / Visa

Nagarro explicitly tested custom objects as HashMap keys and what happens after overriding `equals()`. ([LinkedIn][14])

Oracle similarly asked about two `Employee` objects and how to make them behave identically as keys, with the answer involving proper `equals()` and `hashCode()`. ([LinkedIn][12])

**Authenticity:** 🟢🟢🟢

---

# 5. HashMap vs Other Maps

### Q23. What is the difference between HashMap and Hashtable?

**Company:** Oracle

The Oracle Software Engineer interview explicitly included:

> "hashmap vs hashtable"

([Jointaro][15])

It was also reported in Deloitte, Wells Fargo and other interviews. ([Jointaro][6])

**Authenticity:** 🟢🟢🟢

---

### Q24. What is the difference between HashMap and ConcurrentHashMap?

**Company:** Capgemini — Junior Java Developer, India

The candidate explicitly reported:

> "Can you explain the difference between HashMap and ConcurrentHashMap in Java?"

([Jointaro][16])

The same question appeared in Capgemini, JPMorgan, Morgan Stanley and Nagarro reports. ([Jointaro][17])

**Authenticity:** 🟢🟢🟢🟢

---

### Q25. What is the use of ConcurrentHashMap?

**Company:** Morgan Stanley — Senior Java Developer, Mumbai

Explicitly reported:

> "What is the use of ConcurrentHashMap?"

([Jointaro][7])

**Authenticity:** 🟢 Direct

---

### Q26. What is the difference between synchronized HashMap and ConcurrentHashMap?

**Company:** Morgan Stanley

The candidate explicitly reported:

> "Difference between a synchronized HashMap and ConcurrentHashMap."

([Jointaro][7])

It was also reported in Nagarro and Goldman Sachs experiences. ([LinkedIn][14])

**Authenticity:** 🟢🟢🟢

---

### Q27. What is the difference between HashMap, TreeMap and LinkedHashMap?

**Company:** Boeing — SDE1

The interview explicitly included:

> "What is the difference between HashMap, TreeMap, and LinkedHashMap?"

([Jointaro][9])

**Authenticity:** 🟢 Direct

---

### Q28. What is the difference between HashMap and LinkedHashMap?

**Company:** Alibaba — Java Software Engineer

The candidate explicitly reported:

> "What is the difference between HashMap and LinkedHashMap?"

([Jointaro][18])

**Authenticity:** 🟢 Direct

---

### Q29. Explain the internal working of LinkedHashMap.

**Company:** JPMorgan Chase — Senior Software Developer, Bengaluru

The interview explicitly included:

> "Java internals of LinkedHashMap."

([Jointaro][19])

**Authenticity:** 🟢 Direct

---

### Q30. What is the difference between TreeMap and HashMap?

**Company:** Morgan Stanley — Junior Java Developer

The candidate reported:

> "What is the difference between TreeMap, HashMap, ConcurrentHashMap?"

([Jointaro][20])

**Authenticity:** 🟢 Direct

---

### Q31. Does TreeMap support null keys? Why or why not?

**Company:** Oracle

A recent Oracle interview report explicitly lists:

> "Whether TreeMap supports null keys and why it doesn’t."

([LinkedIn][12])

**Authenticity:** 🟢 Direct

---

# 6. Queue / PriorityQueue

### Q32. How does PriorityQueue work in Java?

**Company:** Goldman Sachs — Java Associate

The candidate explicitly reported:

> "How does `PriorityQueue` work in Java?"

([LeetCode][21])

**Authenticity:** 🟢 Direct

---

### Q33. What data structure is used internally by PriorityQueue?

The Goldman Sachs interview explicitly asked how `PriorityQueue` works. The internal heap implementation is therefore the natural follow-up, but because the source doesn't state that exact wording:

**🟡 Keep as a follow-up/practice question, not as a separately verified question.**

---

### Q34. Implement BlockingQueue enqueue and dequeue operations.

**Company:** Applied Materials — Technical Lead, Java

The programming test explicitly required:

> "Implementation of Blocking Queue enque and deque methods."

([Jointaro][22])

**Authenticity:** 🟢 Direct

---

### Q35. How does BlockingQueue work?

**Company:** Morgan Stanley — Senior Java Developer, India

The interview explicitly included:

> "BlockingQueue implementation"

and a producer-consumer problem. ([Jointaro][23])

**Authenticity:** 🟢 Direct

---

### Q36. Explain/implement a producer-consumer problem using BlockingQueue.

**Company:** Morgan Stanley

The candidate reported:

> "Write code for the producer-consumer problem"

after being asked about `BlockingQueue` implementation. ([Jointaro][23])

**Authenticity:** 🟢 Direct

---

# 7. Deque / BlockingDeque

Your notes contain:

* `Deque`
* `ArrayDeque`
* `BlockingDeque`
* `LinkedBlockingDeque`

I found actual interview evidence for **Deque and blocking queues as concepts**, but not enough reliable company-specific reports for individual questions such as:

> "Difference between ArrayDeque and LinkedList."

Therefore I won't falsely label those as authentic.

### Q37. How does a Deque work?

**Company:** Morgan Stanley

The candidate reported that a later technical round went into:

> "Queue data structures, discussing how a Deque (DQ) works and blocking queues."

([Jointaro][24])

**Authenticity:** 🟢 Direct

---

# 8. Iterator / ListIterator

### Q38. What is the difference between Iterator and ListIterator?

**Company:** Boeing — SDE1

The interview explicitly included:

> "Explain the difference between Iterator and ListIterator."

([Jointaro][9])

It also appears in recent Java backend interview reports. ([LinkedIn][25])

**Authenticity:** 🟢🟢

---

### Q39. How do you handle concurrent modifications in a collection?

**Company:** Boeing

The candidate reported:

> "How would you handle concurrent modifications in a collection?"

([Jointaro][9])

**Authenticity:** 🟢 Direct

---

### Q40. What is the difference between fail-fast and fail-safe iterators?

**Company:** Disney+ Hotstar — Product Engineer II, Bengaluru

The candidate explicitly reported that the screening round covered:

> "Java Collections — Fail-fast vs. fail-safe iterators"

([Glassdoor][26])

It was also explicitly reported in a Capgemini Java Developer interview. ([Jointaro][27])

**Authenticity:** 🟢🟢

---

# 9. Comparable / Comparator

### Q41. What is the difference between Comparable and Comparator?

**Company:** InfoEdge — Senior Software Engineer

The candidate explicitly reported:

> "Comparable vs comparator"

as one of the basic Java questions. ([LeetCode][28])

It was also asked in Boeing and Winjit interviews. ([Jointaro][9])

**Authenticity:** 🟢🟢🟢

---

### Q42. How would you sort custom objects using Comparator?

**Company:** JPMorgan Chase

The candidate was asked to sort `Employee` objects by employee ID. ([Jointaro][4])

**Authenticity:** 🟢 Direct

---

# 10. EnumMap / Enum / Enumeration

Your notes include:

* `Enum`
* `EnumMap`
* `Enumeration`

I found a real JPMorgan interview report mentioning **enumerations**, but not a sufficiently strong report for a specific `EnumMap` question. ([Jointaro][2])

So:

### ❌ No authentic `EnumMap` question added yet.

Similarly, I won't claim:

> "What is the difference between Enumeration and Iterator?"

as authentic from this search unless I find a direct candidate report.

---

# 11. WeakHashMap

Your documentation goes very deep into:

* weak references
* GC
* reference queues
* automatic entry removal
* strong vs weak references
* `clone()`
* memory leaks

I searched specifically for **actual interview reports** around WeakHashMap.

I did **not** find sufficiently reliable company/candidate evidence for a specific question such as:

> "What is WeakHashMap and when should you use it?"

So:

### ❌ No verified WeakHashMap interview question in this pass.

This is important: **I am not going to take a generic question from a collections website and pretend it was asked by a company.**

---

# 12. IdentityHashMap

Same approach.

Your notes cover:

* identity comparison
* `==`
* IdentityHashMap vs HashMap
* internal behavior

But I did not find sufficiently strong candidate/company interview evidence for a specific `IdentityHashMap` question.

### ❌ Not added as authentic.

---

# 13. ConcurrentHashMap

This one is different from the previous two.

### Q43. How does ConcurrentHashMap work internally?

**Company:** CGI — Software Engineer

The candidate explicitly reported:

> "How HashMap & ConcurrentHashMap works internally and advantage of ConcurrentHashMap over HashMap."

([GeeksforGeeks][29])

It was also asked at JPMorgan and Morgan Stanley. ([Jointaro][30])

**Authenticity:** 🟢🟢🟢

---

### Q44. What are the advantages of ConcurrentHashMap over HashMap?

**Company:** CGI

This was explicitly included in the reported interview question. ([GeeksforGeeks][29])

**Authenticity:** 🟢 Direct

---

# 🔥 Highest-Value Authentic Questions From This Chapter

These are the questions I would **not skip** because they recur across multiple real interview reports:

|  # | Authentic Question                              | Companies/Reports                                                       |
| -: | ----------------------------------------------- | ----------------------------------------------------------------------- |
|  1 | **How does HashMap work internally?**           | Deloitte, Morgan Stanley, Oracle, Nokia, JPMorgan, etc. ([Jointaro][6]) |
|  2 | **ArrayList vs LinkedList**                     | JPMorgan, Barclays, Card91, etc. ([Jointaro][4])                        |
|  3 | **HashSet vs TreeSet**                          | Wipro, Barclays, Morgan Stanley, etc. ([Naukri][5])                     |
|  4 | **HashMap vs Hashtable**                        | Oracle, Deloitte, Wells Fargo, etc. ([Jointaro][15])                    |
|  5 | **HashMap vs ConcurrentHashMap**                | Capgemini, JPMorgan, Morgan Stanley, Nagarro ([Jointaro][16])           |
|  6 | **How is HashSet implemented internally?**      | Morgan Stanley, Walmart, Grid Dynamics ([Jointaro][7])                  |
|  7 | **Comparable vs Comparator**                    | InfoEdge, Boeing, Winjit ([LeetCode][28])                               |
|  8 | **Iterator vs ListIterator**                    | Boeing, recent Java interviews ([Jointaro][9])                          |
|  9 | **Fail-fast vs fail-safe**                      | Disney+ Hotstar, Capgemini ([Glassdoor][26])                            |
| 10 | **How does PriorityQueue work?**                | Goldman Sachs ([LeetCode][21])                                          |
| 11 | **ArrayList vs Vector**                         | Wipro, Deloitte, Fortinet ([Naukri][5])                                 |
| 12 | **HashMap vs TreeMap vs LinkedHashMap**         | Boeing, Morgan Stanley ([Jointaro][9])                                  |
| 13 | **How does ConcurrentHashMap work internally?** | CGI, JPMorgan, Morgan Stanley ([GeeksforGeeks][29])                     |
| 14 | **How does BlockingQueue work / implement it**  | Morgan Stanley, Applied Materials ([Jointaro][23])                      |
| 15 | **How does a Deque work?**                      | Morgan Stanley ([Jointaro][24])                                         |

---

# 🔑 ANSWER KEY

## 1. What is the Java Collections Framework?

The Java Collections Framework is a set of **interfaces, implementations and utility algorithms** used to store and manipulate groups of objects.

Core interfaces:

```text
Collection
 ├── List
 ├── Set
 └── Queue
      └── Deque

Map   ← separate hierarchy
```

Examples:

```text
List → ArrayList, LinkedList, Vector
Set → HashSet, LinkedHashSet, TreeSet
Queue → PriorityQueue, ArrayDeque, LinkedList
Map → HashMap, LinkedHashMap, TreeMap, Hashtable
```

---

## 2. List vs Set vs Map

|            | List                      | Set                        | Map                       |
| ---------- | ------------------------- | -------------------------- | ------------------------- |
| Stores     | Elements                  | Elements                   | Key-value pairs           |
| Duplicates | Yes                       | No                         | Keys: No                  |
| Ordering   | Depends on implementation | Depends on implementation  | Depends on implementation |
| Access     | Index for Lists           | Usually by value/iteration | Key                       |
| Examples   | ArrayList                 | HashSet                    | HashMap                   |

---

## 3. ArrayList vs LinkedList

|                      | ArrayList                | LinkedList                                                            |
| -------------------- | ------------------------ | --------------------------------------------------------------------- |
| Internal structure   | Dynamic array            | Doubly linked list                                                    |
| Random access        | Fast, O(1)               | O(n)                                                                  |
| Insert/delete at end | Usually O(1) amortized   | O(1) when position/node is known                                      |
| Insert/delete middle | O(n) due to shifting     | O(n) to reach position; link change itself O(1)                       |
| Memory               | Lower overhead generally | Higher due to node links                                              |
| Typical use          | Read/access-heavy lists  | Frequent structural changes when suitable positions are already known |

**Interview point:** Don't say "LinkedList is always faster for insertion." You must account for the cost of reaching the insertion point.

---

## 4. ArrayList vs Vector

Main distinction:

* Both are dynamically growing array-based lists.
* `Vector` has legacy synchronized methods.
* `ArrayList` is generally preferred for ordinary single-threaded list usage.
* If thread safety is required, choose an appropriate modern concurrent design rather than automatically reaching for `Vector`.

The comparison has been directly asked at Wipro, Deloitte and Fortinet. ([Naukri][5])

---

## 5. HashSet vs TreeSet

|                          | HashSet                    | TreeSet                            |
| ------------------------ | -------------------------- | ---------------------------------- |
| Structure                | Hash table                 | Tree-based sorted set              |
| Ordering                 | No guaranteed sorted order | Sorted                             |
| Average basic operations | O(1)                       | O(log n)                           |
| Duplicates               | No                         | No                                 |
| Use when                 | Fast membership/uniqueness | Need sorted order/range operations |

If you need sorted elements, `TreeSet` is the natural choice.

---

## 6. How is HashSet implemented internally?

Conceptually:

```text
HashSet
   ↓
HashMap
   ↓
Key = element
Value = dummy object
```

For example:

```java
set.add("Java");
```

is conceptually backed by a map entry where `"Java"` is the key and a dummy value is stored.

This relationship was explicitly discussed in Fujitsu/Dassault interview reports. ([Naukri][31])

---

## 7. How does HashSet ensure uniqueness?

HashSet relies on hashing and equality.

When adding an element, Java uses its hash information to locate a bucket and then uses equality checks when necessary to determine whether an equivalent element already exists.

Therefore, for custom objects:

```java
equals()
hashCode()
```

must be implemented consistently.

This was directly tested in NICE and Boeing interviews. ([LinkedIn][10])

---

## 8. How does HashMap work internally?

Simplified:

```text
put(key, value)
      ↓
key.hashCode()
      ↓
hash spreading
      ↓
bucket index
      ↓
bucket
      ↓
compare keys using hash/equals
      ↓
store/find entry
```

A HashMap uses an array of buckets.

In modern Java, a heavily-collided bucket can be treeified under appropriate conditions rather than remaining a simple linked structure.

Nokia's interview explicitly drilled into hashing, buckets and collisions. ([Naukri][11])

---

## 9. How are collisions handled in HashMap?

A collision occurs when multiple keys map to the same bucket.

Java can store multiple entries in that bucket and distinguish them using their hash/equality information.

In modern Java implementations, sufficiently large collision chains can be converted to a tree structure under the required conditions.

---

## 10. What is the relationship between equals() and hashCode()?

The contract requires:

> If two objects are equal according to `equals()`, they must return the same `hashCode()`.

Therefore:

```java
a.equals(b) == true
```

must imply:

```java
a.hashCode() == b.hashCode()
```

The reverse is not necessarily true.

This is critical for `HashMap` and `HashSet`.

---

## 11. What happens if a custom object is used as a HashMap key without proper equals/hashCode?

Two logically identical objects can be treated as different keys if their equality/hash contract isn't correctly implemented.

That's why the Nagarro interview used a concrete `Student` example and then asked what changes when `equals()` is overridden. ([LinkedIn][14])

For robust key semantics, implement both `equals()` and `hashCode()` consistently.

---

## 12. HashMap vs Hashtable

|              | HashMap             | Hashtable                   |
| ------------ | ------------------- | --------------------------- |
| Legacy       | No                  | Yes                         |
| Synchronized | No                  | Yes                         |
| Null key     | Allows one null key | Does not allow null keys    |
| Null values  | Allows              | Does not allow              |
| Modern usage | Common              | Mostly legacy compatibility |

Both are map implementations, but `ConcurrentHashMap` is generally the relevant modern concurrent map for many multithreaded use cases.

---

## 13. HashMap vs ConcurrentHashMap

`HashMap` is **not thread-safe**.

`ConcurrentHashMap` is designed for concurrent access and provides much better concurrency than simply synchronizing an entire map in many workloads.

Important characteristics include:

* Concurrent reads
* Concurrent updates
* No global lock around every ordinary operation
* Does not permit null keys or null values

The comparison was explicitly asked in Capgemini, JPMorgan, Morgan Stanley and Nagarro interviews. ([Jointaro][16])

---

## 14. HashMap vs LinkedHashMap

`LinkedHashMap` maintains predictable iteration order using a linked structure in addition to its hash-table organization.

It can maintain:

* insertion order
* or access order, when configured

`HashMap` does not promise insertion-order iteration.

Alibaba explicitly asked this comparison in a Java Software Engineer interview. ([Jointaro][18])

---

## 15. HashMap vs TreeMap

|                      | HashMap                    | TreeMap                |
| -------------------- | -------------------------- | ---------------------- |
| Main structure       | Hash table                 | Balanced search tree   |
| Ordering             | No guaranteed sorted order | Sorted by keys         |
| Average basic lookup | O(1)                       | O(log n)               |
| Range operations     | Not naturally supported    | Supported              |
| Use                  | Fast key lookup            | Sorted/range-based map |

---

## 16. Does TreeMap support null keys?

For the natural ordering case, **a null key is not permitted** because natural ordering requires comparing keys and `null` cannot be compared in that way.

A custom comparator can alter some ordering behavior, but the exact comparator semantics must be considered.

This was directly asked in an Oracle interview. ([LinkedIn][12])

---

## 17. What is ConcurrentHashMap used for?

When multiple threads need to access/update a map concurrently and you need a thread-safe map with better concurrency characteristics than a globally synchronized map.

Example use cases:

```text
Shared caches
Concurrent counters/state
Application metadata
Session/state lookup
```

Morgan Stanley explicitly asked its use. ([Jointaro][7])

---

## 18. What is PriorityQueue?

`PriorityQueue` is a queue implementation where elements are ordered according to their **priority**, based on natural ordering or a supplied `Comparator`.

It is commonly implemented using a heap.

Example:

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(30);
pq.add(10);
pq.add(20);

System.out.println(pq.poll());
```

The smallest element is retrieved first under natural ordering.

Goldman Sachs explicitly asked how `PriorityQueue` works. ([LeetCode][21])

---

## 19. What is BlockingQueue?

A `BlockingQueue` is designed for producer-consumer scenarios where queue operations can **block** when the queue is full or empty.

For example:

```text
Producer
   ↓
BlockingQueue
   ↓
Consumer
```

A producer can wait when capacity is unavailable, while a consumer can wait when no element is available.

Morgan Stanley explicitly asked about `BlockingQueue` implementation and producer-consumer coding. ([Jointaro][23])

---

## 20. How does Deque work?

`Deque` means **double-ended queue**.

It supports insertion/removal at both ends:

```text
Front ← [ A B C ] → Rear
```

So it can behave as:

* Queue
* Stack

Depending on which end you insert/remove from.

Morgan Stanley explicitly reported discussion of Deque and blocking queues. ([Jointaro][24])

---

## 21. Iterator vs ListIterator

|                   | Iterator                            | ListIterator                     |
| ----------------- | ----------------------------------- | -------------------------------- |
| Direction         | Forward                             | Forward + backward               |
| Works with        | General collections where supported | List only                        |
| `remove()`        | Yes                                 | Yes                              |
| `add()`           | No                                  | Yes                              |
| `set()`           | No                                  | Yes                              |
| Index information | No                                  | Can obtain next/previous indexes |

Boeing explicitly asked this comparison. ([Jointaro][9])

---

## 22. What is fail-fast vs fail-safe?

**Fail-fast:** An iterator may detect structural modification during iteration and throw `ConcurrentModificationException`.

Example:

```java
for (String s : list) {
    list.remove(s); // problematic
}
```

**Fail-safe** is a commonly used interview term for iteration over a snapshot/copy or a concurrent collection whose iteration does not behave like a standard fail-fast iterator.

Be careful: **"fail-safe" is not an official Java Collection Framework interface/category.**

Disney+ Hotstar explicitly reported this as an interview topic. ([Glassdoor][26])

---

## 23. Comparable vs Comparator

### Comparable

Defines a class's **natural ordering**.

```java
class Employee implements Comparable<Employee> {
    public int compareTo(Employee other) {
        return this.id - other.id;
    }
}
```

### Comparator

Defines an ordering externally.

```java
Comparator<Employee> byName =
    Comparator.comparing(Employee::getName);
```

Use `Comparator` when you need multiple possible sorting strategies.

This was directly asked at InfoEdge, Boeing and Winjit. ([LeetCode][28])

---

## 24. How would you sort Employee objects by employee ID?

Use a comparator, for example:

```java
employees.sort(
    Comparator.comparingInt(Employee::getId)
);
```

This exact type of task was reported in a JPMorgan Chase Java/Full Stack interview. ([Jointaro][4])

---

# Important exclusions from this chapter

Your notes contain detailed material on:

* `WeakHashMap`
* `IdentityHashMap`
* `EnumMap`
* `ArrayDeque`
* `LinkedBlockingDeque`
* `ArrayBlockingQueue`
* `DelayQueue`
* `PriorityBlockingQueue`
* `SynchronousQueue`
* `LinkedTransferQueue`
* `Hashtable`
* `Vector`
* `Stack`
* `TreeSet`
* `TreeMap`
* `LinkedHashMap`
* `WeakReference`
* `ReferenceQueue`
* `clone()`
* detailed time/space complexity tables

I **did not automatically create questions for all of them**.

For example, I found strong evidence for **PriorityQueue**, **BlockingQueue**, **ConcurrentHashMap**, **HashMap**, **HashSet**, etc., but not sufficiently strong evidence for a company actually asking about `WeakHashMap` or `IdentityHashMap` in the sources I checked.

That is intentional.

### Current standard for this chat

```text
Your Notes
   ↓
Identify Topic/Subtopic
   ↓
Search actual interview reports
   ↓
Verify company/candidate evidence
   ↓
🟢 Authentic → Add
🟡 Exact wording not verified → Mark as normalized
❌ No evidence → Don't call it an actual interview question
   ↓
Answer Key
```

This chapter has produced a particularly strong set of **real-company collection questions**, with **HashMap internals, ArrayList vs LinkedList, HashSet/TreeSet, HashMap vs ConcurrentHashMap, Comparable vs Comparator, iterators, and concurrency-related collections** showing up repeatedly across the reports. ([Naukri][11])

[1]: https://www.geeksforgeeks.org/interview-experiences/barclays-interview-experience-set-3-campus/?utm_source=chatgpt.com "Barclays Interview Experience | Set 3 (On-Campus) - GeeksforGeeks"
[2]: https://www.jointaro.com/interviews/companies/jpmorgan-chase/experiences/java-developer-bengaluru-karnataka-june-1-2018-no-offer-positive-14de87d4/?utm_source=chatgpt.com "JPMorgan Chase Java Developer Interview Experience - Bengaluru, Karnataka"
[3]: https://www.glassdoor.com/Interview/Janalakshmi-Financial-Services-Interview-Questions-E519431.htm?utm_source=chatgpt.com "Janalakshmi Financial Services Interview Experience & Questions (2026) | Glassdoor"
[4]: https://www.jointaro.com/interviews/companies/jpmorgan-chase/experiences/javafull-stack-developer-india-september-1-2018-no-offer-negative-83cdffed/?utm_source=chatgpt.com "JPMorgan Chase Java/Full Stack Developer Interview Experience - India"
[5]: https://www.naukri.com/code360/interview-experiences/wipro-pvt/interview-experience-aug-2021-exp-0-2-years-2-3120?utm_source=chatgpt.com "SDE - 1 Wipro interview experience | Anonymous - Naukri Code 360"
[6]: https://www.jointaro.com/interviews/companies/deloitte/experiences/java-developer-mumbai-maharashtra-february-1-2016-no-offer-neutral-9adb9a7c/?utm_source=chatgpt.com "Deloitte Java Developer Interview Experience - Mumbai, Maharashtra"
[7]: https://www.jointaro.com/interviews/companies/morgan-stanley/experiences/senior-java-developer-mumbai-august-1-2025-no-offer-positive-c570a4b8/?utm_source=chatgpt.com "Morgan Stanley Senior Java Developer Interview Experience - Mumbai, Maharashtra"
[8]: https://www.jointaro.com/interviews/companies/walmart/experiences/software-engineer-3-bangalore-rural-july-10-2024-declined-offer-negative-5775b344/?utm_source=chatgpt.com "Walmart Software Engineer 3 Interview Experience - Bangalore Rural, Karnataka"
[9]: https://www.jointaro.com/interviews/companies/boeing/experiences/software-development-engineer-sde1-bengaluru-karnataka-january-6-2025-accepted-offer-positive-06dd732b/?utm_source=chatgpt.com "Boeing Software Development Engineer (SDE1) Interview Experience - Bengaluru, Karnataka"
[10]: https://in.linkedin.com/in/kaliraj-pathrakali?utm_source=chatgpt.com "Kaliraj Pathrakali - Cognizant | LinkedIn"
[11]: https://www.naukri.com/code360/interview-experiences/nokia/nokia-interview-experience-off-campus-oct-2025?utm_source=chatgpt.com "Nokia Interview Experience | Off Campus - Oct 2025 - Naukri Code 360"
[12]: https://www.linkedin.com/posts/bhjha_oracle-interviewexperience-java-activity-7392795529895796738-lYUu?utm_source=chatgpt.com "Oracle Interview Experience: Java, Spring Boot, DSA Questions | BHASKAR JHA posted on the topic | LinkedIn"
[13]: https://www.reddit.com/r/infosys/comments/1wbvcmj/infosys_campus_interview_drive_experience/?utm_source=chatgpt.com "Infosys Campus Interview Drive Experience"
[14]: https://www.linkedin.com/posts/shubhradeepp_nagarro-nagarrointerview-interviewexperience-activity-7492611222689882112-pwc3?utm_source=chatgpt.com "Nagarro Interview Experience Java Developer | Shubhradeep Maity posted on the topic | LinkedIn"
[15]: https://www.jointaro.com/interviews/companies/oracle/experiences/software-engineer-ic3-bengaluru-march-1-2022-no-offer-positive-3b1628a4/?utm_source=chatgpt.com "Oracle Software Engineer (IC3) Interview Experience - Bengaluru, Karnataka"
[16]: https://www.jointaro.com/interviews/companies/capgemini/experiences/junior-java-developer-india-november-20-2024-no-offer-positive-cfa49452/?utm_source=chatgpt.com "Capgemini Junior Java Developer Interview Experience - India"
[17]: https://www.jointaro.com/interviews/companies/capgemini/experiences/software-engineer-java-developer-india-march-1-2025-no-offer-positive-53c46986/?utm_source=chatgpt.com "Capgemini Software Engineer - Java Developer Interview Experience - India"
[18]: https://www.jointaro.com/interviews/companies/alibaba/experiences/java-software-engineer-estonia-december-19-2018-accepted-offer-positive-b023ebd4/?utm_source=chatgpt.com "Alibaba Java Software Engineer Interview Experience - Estonia"
[19]: https://www.jointaro.com/interviews/companies/jpmorgan-chase/experiences/senior-software-developer-bengaluru-karnataka-june-1-2016-no-offer-negative-9d60fb43/?utm_source=chatgpt.com "JPMorgan Chase Senior Software Developer Interview Experience - Bengaluru, Karnataka"
[20]: https://www.jointaro.com/interviews/companies/morgan-stanley/experiences/junior-java-developer-canada-july-2-2025-no-offer-neutral-b72a22ac/?utm_source=chatgpt.com "Morgan Stanley Junior Java Developer Interview Experience - Canada"
[21]: https://leetcode.com/discuss/post/6786915/my-goldman-sachs-java-associate-intervie-llhf/?utm_source=chatgpt.com "Goldman Sachs Java Associate Interview Experience (Core Java Focus) - Discuss - LeetCode"
[22]: https://www.jointaro.com/interviews/companies/applied-materials/experiences/technical-lead-java-bengaluru-karnataka-july-1-2018-no-offer-negative-130d4f0c/?utm_source=chatgpt.com "Applied Materials Technical Lead - Java Interview Experience - Bengaluru, Karnataka"
[23]: https://www.jointaro.com/interviews/companies/morgan-stanley/experiences/senior-java-developer-india-july-15-2021-accepted-offer-positive-bcff9458/?utm_source=chatgpt.com "Morgan Stanley Senior Java Developer Interview Experience - India"
[24]: https://www.jointaro.com/interviews/companies/morgan-stanley/experiences/java-developer-bengaluru-july-1-2020-no-offer-negative-75da5c32/?utm_source=chatgpt.com "Morgan Stanley Java Developer Interview Experience - Bengaluru, Karnataka"
[25]: https://in.linkedin.com/in/pendela-rashmitha-195679146?utm_source=chatgpt.com "Pendela Rashmitha - HCLTech | LinkedIn"
[26]: https://www.glassdoor.com/Location/Disney-Hotstar-Bengaluru-Location-EI_IE1465942.0%2C14_IL.15%2C24_IC2940587.htm?utm_source=chatgpt.com "Disney+ Hotstar Bengaluru, KA Office | Glassdoor"
[27]: https://www.jointaro.com/interviews/companies/capgemini/experiences/java-developer-pune-march-1-2020-no-offer-negative-e2b21ccd/?utm_source=chatgpt.com "Capgemini Java Developer Interview Experience - Pune, Maharashtra"
[28]: https://leetcode.com/discuss/post/7151701/?utm_source=chatgpt.com "InfoEdge Senior Software Engineer(1-3yoe) Interview Experience - Discuss - LeetCode"
[29]: https://www.geeksforgeeks.org/interview-experiences/cgi-interview-experience-for-software-engineer/?utm_source=chatgpt.com "CGI Interview Experience for Software Engineer - GeeksforGeeks"
[30]: https://www.jointaro.com/interviews/companies/jpmorgan-chase/experiences/senior-java-developer-india-february-1-2021-no-offer-negative-754375ea/?utm_source=chatgpt.com "JPMorgan Chase Senior Java Developer Interview Experience - India"
[31]: https://www.naukri.com/code360/interview-experiences/dassault-systemes-solutions-lab-pvt-ltd/interview-experience-jul-2021-exp-0-2-years-2-1779?utm_source=chatgpt.com "R&D Engineer Dassault Systemes Solutions Lab pvt ltd interview experience | Anonymous - Naukri Code 360"
