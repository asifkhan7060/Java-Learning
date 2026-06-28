package F_Map.LinkedHashMap;

import java.util.*;

/*
 * ==========================================================
 *           LinkedHashMap Implementation
 * ==========================================================
 */

public class Implementation {

    public static void main(String[] args) {

        /*
         * ==========================================================
         *          Methods Inherited from Map
         * ==========================================================
         */

        // Already implemented in Map topic

        // put()
        // putAll()
        // get()
        // getOrDefault()
        // remove()
        // clear()
        // containsKey()
        // containsValue()
        // size()
        // isEmpty()
        // keySet()
        // values()
        // entrySet()
        // replace()
        // replaceAll()
        // compute()
        // computeIfAbsent()
        // computeIfPresent()
        // merge()
        // equals()
        // hashCode()


        /*
         * ==========================================================
         *        Basic LinkedHashMap Implementation
         * ==========================================================
         */


        // ---------------------------------------------------------
        // Raw Type
        // ---------------------------------------------------------

        LinkedHashMap rawMap =
                new LinkedHashMap();

        rawMap.put(101, "Java");

        rawMap.put("Course", "Spring Boot");

        rawMap.put(true, 99.99);

        System.out.println("Raw LinkedHashMap");

        System.out.println(rawMap);

        /*
         * Raw Types
         *
         * Store everything
         * as Object.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> students =
                new LinkedHashMap<>();

        students.put(101, "Rudra");

        students.put(102, "Haya");

        students.put(103, "Arman");

        System.out.println("LinkedHashMap with Generics");

        System.out.println(students);

        /*
         * Provides
         * Compile-Time
         * Type Safety.
         */


        // ---------------------------------------------------------
        // Duplicate Key
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> duplicateKey =
                new LinkedHashMap<>();

        duplicateKey.put(1, "Java");

        duplicateKey.put(1, "Spring");

        System.out.println("\nDuplicate Key");

        System.out.println(duplicateKey);

        /*
         * Existing value
         * gets replaced.
         */


        // ---------------------------------------------------------
        // Duplicate Value
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> duplicateValue =
                new LinkedHashMap<>();

        duplicateValue.put(1, "Java");

        duplicateValue.put(2, "Java");

        duplicateValue.put(3, "Java");

        System.out.println("\nDuplicate Value");

        System.out.println(duplicateValue);

        /*
         * Duplicate Values
         * are allowed.
         */


        // ---------------------------------------------------------
        // Null Key
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> nullKey =
                new LinkedHashMap<>();

        nullKey.put(null, "Java");

        nullKey.put(2, "Python");

        System.out.println("\nNull Key");

        System.out.println(nullKey);

        /*
         * One Null Key
         * is allowed.
         */


        // ---------------------------------------------------------
        // Null Values
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> nullValue =
                new LinkedHashMap<>();

        nullValue.put(1, null);

        nullValue.put(2, null);

        nullValue.put(3, "Spring");

        System.out.println("\nNull Values");

        System.out.println(nullValue);

        /*
         * Multiple Null
         * Values are
         * allowed.
         */


        // ---------------------------------------------------------
        // For Each Loop
        // ---------------------------------------------------------

        System.out.println("\nUsing For Each");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(

                    entry.getKey()

                            + " -> "

                            + entry.getValue()

            );

        }


        // ---------------------------------------------------------
        // Iterator
        // ---------------------------------------------------------

        System.out.println("\nUsing Iterator");

        Iterator<Map.Entry<Integer, String>> iterator =
                students.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry =
                    iterator.next();

            System.out.println(

                    entry.getKey()

                            + " -> "

                            + entry.getValue()

            );

        }


        // ---------------------------------------------------------
        // Custom Class
        // ---------------------------------------------------------

        LinkedHashMap<Integer, Employee> employees =
                new LinkedHashMap<>();

        employees.put(
                101,
                new Employee("Rudra", 90000));

        employees.put(
                102,
                new Employee("Haya", 85000));

        employees.put(
                103,
                new Employee("Arman", 92000));

        System.out.println("\nCustom Class");

        for (Map.Entry<Integer, Employee> entry
                : employees.entrySet()) {

            System.out.println(entry);

        }

        /*
         * LinkedHashMap
         * preserves the
         * insertion order
         * of entries.
         */


        /*
         * ==========================================================
         *                    Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // LinkedHashMap()
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> map1 =
                new LinkedHashMap<>();

        map1.put(101, "Java");
        map1.put(102, "Python");
        map1.put(103, "Spring");

        System.out.println("\nLinkedHashMap()");

        System.out.println(map1);

        /*
         * Creates an empty
         * LinkedHashMap.
         *
         * Default Ordering
         *
         * Insertion Order.
         */


        // ---------------------------------------------------------
        // LinkedHashMap(int initialCapacity)
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> map2 =
                new LinkedHashMap<>(100);

        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Mango");

        System.out.println(
                "\nLinkedHashMap(int initialCapacity)");

        System.out.println(map2);

        /*
         * Creates a
         * LinkedHashMap
         * with specified
         * initial capacity.
         */


        // ---------------------------------------------------------
        // LinkedHashMap(int initialCapacity,
        //               float loadFactor)
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> map3 =
                new LinkedHashMap<>(64, 0.75f);

        map3.put(10, "HTML");
        map3.put(20, "CSS");
        map3.put(30, "JavaScript");

        System.out.println(
                "\nLinkedHashMap(int,float)");

        System.out.println(map3);

        /*
         * Allows custom
         * Load Factor.
         */


        // ---------------------------------------------------------
        // LinkedHashMap(int,
        // float,
        // boolean accessOrder)
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> accessMap =
                new LinkedHashMap<>(
                        16,
                        0.75f,
                        true
                );

        accessMap.put(1, "Java");
        accessMap.put(2, "Python");
        accessMap.put(3, "Spring");

        System.out.println(
                "\nBefore Access");

        System.out.println(accessMap);

        accessMap.get(1);

        System.out.println(
                "\nAfter get(1)");

        System.out.println(accessMap);

        /*
         * accessOrder
         *
         * true
         *
         * Moves accessed
         * entry to the
         * end of the
         * linked list.
         */


        // ---------------------------------------------------------
        // LinkedHashMap(Map)
        // ---------------------------------------------------------

        HashMap<Integer, String> source =
                new HashMap<>();

        source.put(1, "Docker");
        source.put(2, "Kubernetes");
        source.put(3, "AWS");

        LinkedHashMap<Integer, String> map4 =
                new LinkedHashMap<>(source);

        System.out.println(
                "\nLinkedHashMap(Map)");

        System.out.println("Source");

        System.out.println(source);

        System.out.println("\nLinkedHashMap");

        System.out.println(map4);

        /*
         * Copies all
         * mappings from
         * another Map.
         */


        /*
         * ==========================================================
         *                     clone()
         * ==========================================================
         */

        LinkedHashMap<Integer, String> languageMap =
                new LinkedHashMap<>();

        languageMap.put(1, "Java");
        languageMap.put(2, "Python");
        languageMap.put(3, "Spring");

        @SuppressWarnings("unchecked")

        LinkedHashMap<Integer, String> cloned =

                (LinkedHashMap<Integer, String>)
                        languageMap.clone();

        System.out.println("\nclone()");

        System.out.println("Original");

        System.out.println(languageMap);

        System.out.println("\nClone");

        System.out.println(cloned);

        cloned.put(4, "Docker");

        System.out.println(
                "\nAfter Modifying Clone");

        System.out.println("Original");

        System.out.println(languageMap);

        System.out.println("\nClone");

        System.out.println(cloned);

        /*
         * clone()
         *
         * Creates a
         * Shallow Copy.
         */


        /*
         * ==========================================================
         *              Shallow Copy Demo
         * ==========================================================
         */

        LinkedHashMap<Integer, Employee> employeeMap =
                new LinkedHashMap<>();

        employeeMap.put(
                101,
                new Employee("Rudra", 90000));

        employeeMap.put(
                102,
                new Employee("Haya", 85000));

        @SuppressWarnings("unchecked")

        LinkedHashMap<Integer, Employee> employeeCopy =

                (LinkedHashMap<Integer, Employee>)
                        employeeMap.clone();

        System.out.println(
                "\nShallow Copy");

        System.out.println("Original");

        System.out.println(employeeMap);

        System.out.println("\nCopied");

        System.out.println(employeeCopy);

        employeeCopy
                .get(101)
                .name = "Virat";

        System.out.println(
                "\nAfter Modifying Object");

        System.out.println("Original");

        System.out.println(employeeMap);

        System.out.println("\nCopied");

        System.out.println(employeeCopy);

        /*
         * Employee objects
         * are shared.
         *
         * Only the map
         * structure is
         * copied.
         */


        /*
         * ==========================================================
         *          Insertion Order (Default)
         * ==========================================================
         */

        LinkedHashMap<Integer, String> insertionOrder =
                new LinkedHashMap<>();

        insertionOrder.put(3, "C");
        insertionOrder.put(1, "Java");
        insertionOrder.put(2, "Python");
        insertionOrder.put(5, "Spring");
        insertionOrder.put(4, "Docker");

        System.out.println(
                "\nInsertion Order");

        System.out.println(insertionOrder);

        /*
         * Output Order
         *
         * 3
         *
         * 1
         *
         * 2
         *
         * 5
         *
         * 4
         *
         * Same order
         * as insertion.
         */

        /*
         * ==========================================================
         *        HashMap vs LinkedHashMap Iteration
         * ==========================================================
         */

        HashMap<Integer, String> hashMap =
                new HashMap<>();

        hashMap.put(3, "C");
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(5, "Spring");
        hashMap.put(4, "Docker");

        System.out.println("\nHashMap");

        System.out.println(hashMap);

        LinkedHashMap<Integer, String> linkedMap =
                new LinkedHashMap<>();

        linkedMap.put(3, "C");
        linkedMap.put(1, "Java");
        linkedMap.put(2, "Python");
        linkedMap.put(5, "Spring");
        linkedMap.put(4, "Docker");

        System.out.println("\nLinkedHashMap");

        System.out.println(linkedMap);

        /*
         * HashMap
         *
         * No guaranteed
         * iteration order.
         *
         * LinkedHashMap
         *
         * Preserves
         * insertion order.
         */


        /*
         * ==========================================================
         *         Access Order Demonstration
         * ==========================================================
         */

        LinkedHashMap<Integer, String> accessOrder =
                new LinkedHashMap<>(
                        16,
                        0.75f,
                        true
                );

        accessOrder.put(1, "Java");
        accessOrder.put(2, "Python");
        accessOrder.put(3, "Spring");
        accessOrder.put(4, "Docker");
        accessOrder.put(5, "AWS");

        System.out.println("\nInitial Order");

        System.out.println(accessOrder);

        accessOrder.get(2);

        System.out.println("\nAfter get(2)");

        System.out.println(accessOrder);

        accessOrder.get(1);

        System.out.println("\nAfter get(1)");

        System.out.println(accessOrder);

        accessOrder.get(4);

        System.out.println("\nAfter get(4)");

        System.out.println(accessOrder);

        /*
         * Every accessed
         * entry moves
         * to the end.
         */


        /*
         * ==========================================================
         *          Updating Existing Key
         * ==========================================================
         */

        accessOrder.put(3, "Spring Boot");

        System.out.println("\nAfter Updating Key 3");

        System.out.println(accessOrder);

        /*
         * Updating an
         * existing key
         * also counts
         * as access.
         */


        /*
         * ==========================================================
         *            removeEldestEntry()
         * ==========================================================
         */

        LRUCache<Integer, String> cache =
                new LRUCache<>(3);

        cache.put(1, "Java");
        cache.put(2, "Python");
        cache.put(3, "Spring");

        System.out.println("\nInitial Cache");

        System.out.println(cache);

        cache.put(4, "Docker");

        System.out.println("\nAfter Adding 4");

        System.out.println(cache);

        /*
         * Oldest entry
         * automatically
         * removed.
         */


        /*
         * ==========================================================
         *          LRU Cache Demonstration
         * ==========================================================
         */

        LRUCache<Integer, String> lru =
                new LRUCache<>(3);

        lru.put(1, "Chrome");

        lru.put(2, "Edge");

        lru.put(3, "Firefox");

        System.out.println("\nLRU Cache");

        System.out.println(lru);

        lru.get(1);

        lru.put(4, "Opera");

        System.out.println("\nAfter Access + Insert");

        System.out.println(lru);

        /*
         * Cache Size
         *
         * 3
         *
         * Accessing key 1
         * makes it the
         * most recently
         * used entry.
         *
         * Key 2 becomes
         * the eldest and
         * is removed.
         */


        /*
         * ==========================================================
         *          Browser History Example
         * ==========================================================
         */

        LinkedHashMap<Integer, String> history =
                new LinkedHashMap<>(
                        10,
                        0.75f,
                        true
                );

        history.put(1, "google.com");

        history.put(2, "github.com");

        history.put(3, "stackoverflow.com");

        history.get(1);

        history.get(2);

        System.out.println("\nBrowser History");

        System.out.println(history);

        /*
         * Recently visited
         * websites move
         * to the end.
         */


        /*
         * ==========================================================
         *        Recently Viewed Products
         * ==========================================================
         */

        LinkedHashMap<Integer, String> products =
                new LinkedHashMap<>(
                        10,
                        0.75f,
                        true
                );

        products.put(101, "Laptop");

        products.put(102, "Keyboard");

        products.put(103, "Mouse");

        products.put(104, "Monitor");

        products.get(102);

        products.get(101);

        System.out.println("\nRecently Viewed");

        System.out.println(products);

        /*
         * E-commerce sites
         * often use this
         * approach for
         * recently viewed
         * products.
         */

        /*
         * ==========================================================
         *           Reference Type Demonstration
         * ==========================================================
         */

        /*
         * Map Reference
         *
         * Recommended because
         * it supports Loose
         * Coupling.
         */

        Map<Integer, String> mapReference =
                new LinkedHashMap<>();

        mapReference.put(1, "Java");

        mapReference.put(2, "Python");

        System.out.println("\nMap Reference");

        System.out.println(mapReference);


        /*
         * LinkedHashMap Reference
         *
         * Required for
         * LinkedHashMap
         * specific features.
         */

        LinkedHashMap<Integer, String> linkedReference =
                new LinkedHashMap<>();

        linkedReference.put(10, "Spring");

        linkedReference.put(20, "Docker");

        @SuppressWarnings("unchecked")

        LinkedHashMap<Integer, String> clonedReference =

                (LinkedHashMap<Integer, String>)
                        linkedReference.clone();

        System.out.println("\nLinkedHashMap Reference");

        System.out.println(clonedReference);



        /*
         * ==========================================================
         *               Optimized Overrides
         * ==========================================================
         */


        // ---------------------------------------------------------
        // forEach()
        // ---------------------------------------------------------

        System.out.println("\nforEach()");

        linkedReference.forEach(

                (key, value) ->

                        System.out.println(

                                key
                                        + " -> "
                                        + value

                        )

        );


        // ---------------------------------------------------------
        // replaceAll()
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> replaceDemo =
                new LinkedHashMap<>();

        replaceDemo.put(1, "java");

        replaceDemo.put(2, "python");

        replaceDemo.put(3, "spring");

        replaceDemo.replaceAll(

                (key, value) ->

                        value.toUpperCase()

        );

        System.out.println("\nreplaceAll()");

        System.out.println(replaceDemo);


        // ---------------------------------------------------------
        // compute()
        // ---------------------------------------------------------

        replaceDemo.compute(

                1,

                (key, value) ->

                        value + " 21"

        );

        System.out.println("\ncompute()");

        System.out.println(replaceDemo);


        // ---------------------------------------------------------
        // computeIfAbsent()
        // ---------------------------------------------------------

        replaceDemo.computeIfAbsent(

                4,

                key -> "Docker"

        );

        System.out.println("\ncomputeIfAbsent()");

        System.out.println(replaceDemo);


        // ---------------------------------------------------------
        // computeIfPresent()
        // ---------------------------------------------------------

        replaceDemo.computeIfPresent(

                2,

                (key, value) ->

                        value + " Framework"

        );

        System.out.println("\ncomputeIfPresent()");

        System.out.println(replaceDemo);


        // ---------------------------------------------------------
        // merge()
        // ---------------------------------------------------------

        LinkedHashMap<String, Integer> mergeDemo =
                new LinkedHashMap<>();

        mergeDemo.put("Java", 10);

        mergeDemo.merge(

                "Java",

                5,

                Integer::sum

        );

        mergeDemo.merge(

                "Python",

                20,

                Integer::sum

        );

        System.out.println("\nmerge()");

        System.out.println(mergeDemo);



        /*
         * ==========================================================
         *          LinkedHashMap Characteristics
         * ==========================================================
         */

        LinkedHashMap<Integer, String> characteristics =
                new LinkedHashMap<>();

        characteristics.put(3, "C");

        characteristics.put(1, "Java");

        characteristics.put(2, "Python");

        System.out.println("\nCharacteristics");

        System.out.println(characteristics);

        /*
         * ✔ Maintains Order
         *
         * ✔ Insertion Order
         *
         * ✔ Optional Access Order
         *
         * ✔ Hash Table
         *
         * ✔ Doubly Linked List
         *
         * ✔ One Null Key
         *
         * ✔ Multiple Null Values
         *
         * ✔ Not Thread Safe
         *
         * ✔ Average O(1)
         */


        /*
         * ==========================================================
         *            Methods Not Covered Yet
         * ==========================================================
         */

        /*
         * Internal JDK Methods
         *
         * newNode()
         *
         * replacementNode()
         *
         * afterNodeAccess()
         *
         * afterNodeInsertion()
         *
         * afterNodeRemoval()
         *
         * transferLinks()
         *
         * linkNodeLast()
         */


        /*
         * ==========================================================
         *        Methods Inherited from Object
         * ==========================================================
         */

        System.out.println("\nObject Methods");

        System.out.println(

                characteristics.toString()

        );

        System.out.println(

                characteristics.getClass()

        );

        System.out.println(

                characteristics.hashCode()

        );

        System.out.println(

                characteristics.equals(linkedReference)

        );

        /*
         * Object Methods
         *
         * toString()
         *
         * getClass()
         *
         * hashCode()
         *
         * equals()
         *
         * wait()
         *
         * notify()
         *
         * notifyAll()
         *
         * finalize()
         * (Deprecated)
         */


        /*
         * ==========================================================
         *               Interview Notes
         * ==========================================================
         */

        /*
         * 1.
         * Extends HashMap.
         *
         * 2.
         * Uses Hash Table
         * +
         * Doubly Linked List.
         *
         * 3.
         * Maintains
         * Insertion Order.
         *
         * 4.
         * Supports
         * Access Order.
         *
         * 5.
         * removeEldestEntry()
         * is used for
         * LRU Cache.
         *
         * 6.
         * Allows One
         * Null Key.
         *
         * 7.
         * Allows Multiple
         * Null Values.
         *
         * 8.
         * clone()
         * creates
         * Shallow Copy.
         *
         * 9.
         * Not Thread Safe.
         *
         * 10.
         * Average
         * put(), get(),
         * remove()
         * are O(1).
         */


        /*
         * ==========================================================
         *                   Summary
         * ==========================================================
         */

        /*
         * LinkedHashMap
         * extends HashMap
         * and preserves
         * iteration order.
         *
         * It combines
         * Hash Table
         * with
         * Doubly Linked List.
         *
         * It is ideal
         * when predictable
         * iteration order
         * and fast lookup
         * are both required.
         *
         * It is also the
         * foundation for
         * implementing
         * LRU Cache.
         */


        /*
         * ==========================================================
         *                      End
         * ==========================================================
         */

        System.out.println(
                "\nLinkedHashMap Implementation Completed.");

    }

}


/*
 * ==========================================================
 *                 Custom Classes
 * ==========================================================
 */

class Employee {

    String name;
    double salary;

    Employee(String name,
             double salary) {

        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {

        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';

    }

}


/*
 * ==========================================================
 *                  LRU Cache
 * ==========================================================
 */

class LRUCache<K, V>
        extends LinkedHashMap<K, V> {

    private final int capacity;

    LRUCache(int capacity) {

        super(capacity, 0.75f, true);

        this.capacity = capacity;

    }

    @Override
    protected boolean removeEldestEntry(
            Map.Entry<K, V> eldest) {

        return size() > capacity;

    }

}


/*
 * ==========================================================
 * IMPORTANT
 * ==========================================================
 *
 * HashMap
 *
 * ↓
 *
 * Fast Lookup
 *
 * ↓
 *
 * No Order
 *
 * -----------------------------
 *
 * LinkedHashMap
 *
 * ↓
 *
 * Fast Lookup
 *
 * +
 *
 * Doubly Linked List
 *
 * ↓
 *
 * Maintains Order
 *
 * -----------------------------
 *
 * accessOrder = false
 *
 * ↓
 *
 * Insertion Order
 *
 * -----------------------------
 *
 * accessOrder = true
 *
 * ↓
 *
 * Access Order
 *
 * -----------------------------
 *
 * removeEldestEntry()
 *
 * ↓
 *
 * LRU Cache
 *
 * ==========================================================
 */



/*
 * ==========================================================
 *              When Should You Use It?
 * ==========================================================
 */

/*
 * Use HashMap
 *
 * ✔ Fast lookup
 * ✔ No ordering required
 *
 * -----------------------------
 *
 * Use LinkedHashMap
 *
 * ✔ Maintain insertion order
 * ✔ Build LRU cache
 * ✔ Recently viewed items
 * ✔ Browser history
 *
 * -----------------------------
 *
 * Use TreeMap
 *
 * ✔ Sorted data
 * ✔ Range queries
 *
 * -----------------------------
 *
 * Use ConcurrentHashMap
 *
 * ✔ Multi-threaded applications
 *
 * -----------------------------
 *
 * Use WeakHashMap
 *
 * ✔ Automatic garbage collection
 * ✔ Metadata caches
 */