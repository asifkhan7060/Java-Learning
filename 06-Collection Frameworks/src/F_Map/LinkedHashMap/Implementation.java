package F_Map.LinkedHashMap;

import java.util.*;

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
                new LinkedHashMap<>();

        rawMap.put(101, "Java"); // different datatypes of keys and values allowed

        rawMap.put("Course", "Spring Boot");

        rawMap.put(true, 99.99);

        System.out.println("Raw LinkedHashMap");

        System.out.println(rawMap);

        System.out.println();

        // ---------------------------------------------------------
        // Generics - recommended
        // ---------------------------------------------------------

        LinkedHashMap<Integer, String> students =
                new LinkedHashMap<>();

        students.put(101, "Rudra");

        students.put(102, "Haya");

        students.put(103, "Arman");

        System.out.println("LinkedHashMap with Generics");

        System.out.println(students);

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
         * accessOrder = true
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
         *          Updating Existing Key
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

        accessOrder.put(3, "Spring Boot");

        System.out.println("\nAfter Updating Key 3");

        System.out.println(accessOrder); //1,2,4,5,3

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
         *               Optimized Overrides
         * ==========================================================
         */

        /*
         * LinkedHashMap overrides and optimizes the following methods:
         *
         * ✔ forEach()
         * ✔ replaceAll()
         * ✔ compute()
         * ✔ computeIfAbsent()
         * ✔ computeIfPresent()
         * ✔ merge()
         *
         * Their behavior is identical to HashMap.
         * Refer to HashMap Implementation for detailed examples.
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
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {

        return size() > capacity;

    }

}
