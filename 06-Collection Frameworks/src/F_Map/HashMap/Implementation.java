package F_Map.HashMap;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        /*
         * ==========================================================
         *              Methods Inherited from Map
         * ==========================================================
         */

        // Already implemented in Map topic

        // put(K key, V value)
        // putAll(Map<? extends K, ? extends V> m)
        //
        // get(Object key)
        // getOrDefault(Object key, V defaultValue)
        //
        // remove(Object key)
        // remove(Object key, Object value)
        //
        // replace(K key, V value)
        // replace(K key, V oldValue, V newValue)
        // replaceAll(BiFunction)
        //
        // containsKey(Object key)
        // containsValue(Object value)
        //
        // keySet()
        // values()
        // entrySet()
        //
        // size()
        // isEmpty()
        // clear()
        //
        // equals(Object o)
        // hashCode()
        //
        // forEach(BiConsumer)
        // compute()
        // computeIfAbsent()
        // computeIfPresent()
        // merge()


        /*
         * ==========================================================
         *              Basic HashMap Implementation
         * ==========================================================
         */


        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        HashMap rawMap =
                new HashMap();

        rawMap.put(101, "Java");
        rawMap.put("Course", "Spring Boot");
        rawMap.put(true, 99.99);

        System.out.println("Raw HashMap");

        System.out.println(rawMap);

        /*
         * Raw Types
         * ----------
         *
         * Everything is stored
         * as Object.
         *
         * Type Safety is
         * NOT available.
         *
         * Avoid Raw Types
         * in production code.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Rudra");
        students.put(102, "Haya");
        students.put(103, "Arman");

        System.out.println("HashMap with Generics");

        System.out.println(students);

        /*
         * Generic Types
         *
         * Provide
         * Compile-Time
         * Type Safety.
         */


        // ---------------------------------------------------------
        // Duplicate Key Demonstration
        // ---------------------------------------------------------

        HashMap<Integer, String> duplicateKey =
                new HashMap<>();

        duplicateKey.put(1, "Java");
        duplicateKey.put(2, "Python");
        duplicateKey.put(1, "Spring");

        System.out.println("\nDuplicate Key");

        System.out.println(duplicateKey);

        /*
         * Output
         *
         * {1=Spring, 2=Python}
         *
         * Existing value
         * gets replaced.
         */


        // ---------------------------------------------------------
        // Duplicate Value Demonstration
        // ---------------------------------------------------------

        HashMap<Integer, String> duplicateValue =
                new HashMap<>();

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
        // Null Key Demonstration
        // ---------------------------------------------------------

        HashMap<Integer, String> nullKey =
                new HashMap<>();

        nullKey.put(null, "Java");

        nullKey.put(2, "Python");

        System.out.println("\nNull Key");

        System.out.println(nullKey);

        /*
         * Only one
         * Null Key
         * is allowed.
         */


        // ---------------------------------------------------------
        // Null Value Demonstration
        // ---------------------------------------------------------

        HashMap<Integer, String> nullValue =
                new HashMap<>();

        nullValue.put(1, null);

        nullValue.put(2, null);

        nullValue.put(3, "Spring");

        System.out.println("\nNull Values");

        System.out.println(nullValue);

        /*
         * Multiple
         * Null Values
         * are allowed.
         */


        // ---------------------------------------------------------
        // Null Key Replacement
        // ---------------------------------------------------------

        HashMap<Integer, String> nullReplace =
                new HashMap<>();

        nullReplace.put(null, "Java");

        nullReplace.put(null, "Spring");

        System.out.println("\nNull Key Replacement");

        System.out.println(nullReplace);

        /*
         * Output
         *
         * {null=Spring}
         *
         * Existing Null Key
         * gets replaced.
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
        // Working with Custom Class
        // ---------------------------------------------------------

        HashMap<Integer, Employee> employees =
                new HashMap<>();

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
         * Keys
         *
         * Must remain unique.
         *
         * Values
         *
         * May contain duplicate
         * objects.
         *
         * equals() and
         * hashCode()
         * determine logical
         * equality of Keys.
         */


        /*
         * ==========================================================
         *                    Constructors
         * ==========================================================
         */


        // ---------------------------------------------------------
        // HashMap()
        // ---------------------------------------------------------

        HashMap<Integer, String> map1 =
                new HashMap<>();

        map1.put(101, "Java");
        map1.put(102, "Python");
        map1.put(103, "Spring");

        System.out.println("\nHashMap()");

        System.out.println(map1);

        /*
         * Creates an empty
         * HashMap.
         *
         * Default Constructor.
         *
         * Default Capacity
         *
         * 16
         *
         * Default Load Factor
         *
         * 0.75
         */


        // ---------------------------------------------------------
        // HashMap(int initialCapacity)
        // ---------------------------------------------------------

        HashMap<Integer, String> map2 =
                new HashMap<>(100);

        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Mango");

        System.out.println("\nHashMap(int initialCapacity)");

        System.out.println(map2);

        /*
         * Specifies the
         * initial capacity.
         *
         * Useful when
         * approximate
         * number of entries
         * is already known.
         *
         * Reduces resizing.
         */


        // ---------------------------------------------------------
        // HashMap(int initialCapacity,
        //         float loadFactor)
        // ---------------------------------------------------------

        HashMap<Integer, String> map3 =
                new HashMap<>(64, 0.75f);

        map3.put(10, "HTML");
        map3.put(20, "CSS");
        map3.put(30, "JavaScript");

        System.out.println(
                "\nHashMap(int,float)");

        System.out.println(map3);

        /*
         * Allows custom
         * Load Factor.
         *
         * Default value
         *
         * 0.75
         *
         * is recommended.
         */


        // ---------------------------------------------------------
        // HashMap(Map)
        // ---------------------------------------------------------

        HashMap<Integer, String> original =
                new HashMap<>();

        original.put(1, "Docker");
        original.put(2, "Kubernetes");
        original.put(3, "AWS");

        HashMap<Integer, String> map4 =
                new HashMap<>(original);

        System.out.println("\nHashMap(Map)");

        System.out.println("Original");

        System.out.println(original);

        System.out.println("\nCopied");

        System.out.println(map4);

        /*
         * Copies all mappings
         * from another Map.
         *
         * Original Map
         * remains unchanged.
         */


        /*
         * ==========================================================
         *                      clone()
         * ==========================================================
         */

        HashMap<Integer, String> languageMap =
                new HashMap<>();

        languageMap.put(1, "Java");
        languageMap.put(2, "Python");
        languageMap.put(3, "Spring");

        System.out.println("\nclone()");

        @SuppressWarnings("unchecked")

        HashMap<Integer, String> clonedMap =

                (HashMap<Integer, String>)
                        languageMap.clone();

        System.out.println("Original");

        System.out.println(languageMap);

        System.out.println("\nClone");

        System.out.println(clonedMap);

        clonedMap.put(4, "Go");

        System.out.println("\nAfter Modifying Clone");

        System.out.println("Original");

        System.out.println(languageMap);

        System.out.println("\nClone");

        System.out.println(clonedMap);

        /*
         * clone()
         *
         * Creates a
         * Shallow Copy.
         *
         * HashMap object
         * is copied.
         *
         * Stored objects
         * are NOT copied.
         */


        /*
         * ==========================================================
         *             Shallow Copy Demonstration
         * ==========================================================
         */

        HashMap<Integer, Employee> employeeMap =
                new HashMap<>();

        employeeMap.put(
                101,
                new Employee("Rudra", 90000));

        employeeMap.put(
                102,
                new Employee("Haya", 85000));

        @SuppressWarnings("unchecked")

        HashMap<Integer, Employee> employeeCopy =

                (HashMap<Integer, Employee>)
                        employeeMap.clone();

        System.out.println("\nShallow Copy");

        System.out.println("Original");

        System.out.println(employeeMap);

        System.out.println("\nCopied");

        System.out.println(employeeCopy);

        employeeCopy
                .get(101)
                .name = "Virat";

        System.out.println("\nAfter Modifying Object");

        System.out.println("Original");

        System.out.println(employeeMap);

        System.out.println("\nCopied");

        System.out.println(employeeCopy);

        /*
         * Employee object
         * is NOT copied.
         *
         * Both HashMaps
         * point to the same
         * Employee object.
         */


        /*
         * ==========================================================
         *              equals() and hashCode()
         * ==========================================================
         */

        HashMap<EmployeeKey, String> employeeDemo =
                new HashMap<>();

        EmployeeKey employee1 =
                new EmployeeKey(101, "Rudra");

        EmployeeKey employee2 =
                new EmployeeKey(101, "Rudra");

        employeeDemo.put(employee1, "Developer");

        System.out.println("\nequals() & hashCode()");

        System.out.println(
                employeeDemo.get(employee2)
        );

        /*
         * If equals() and
         * hashCode() are
         * correctly overridden,
         *
         * Output
         *
         * Developer
         *
         * Otherwise
         *
         * null
         */


        /*
         * ==========================================================
         *            Constructors Completed
         * ==========================================================
         */


        /*
         * ==========================================================
         *                 Capacity vs Size
         * ==========================================================
         */

        HashMap<Integer, String> capacityDemo =
                new HashMap<>(20);

        capacityDemo.put(1, "Java");
        capacityDemo.put(2, "Python");
        capacityDemo.put(3, "Spring");

        System.out.println("\nCapacity vs Size");

        System.out.println(capacityDemo);

        System.out.println("Size : "
                + capacityDemo.size());

        /*
         * Capacity
         *
         * Number of Buckets.
         *
         * Cannot be accessed
         * directly.
         *
         * Size
         *
         * Number of stored
         * Key-Value pairs.
         */


        /*
         * ==========================================================
         *                    Load Factor
         * ==========================================================
         */

        HashMap<Integer, String> loadFactorDemo =
                new HashMap<>(16, 0.75f);

        loadFactorDemo.put(10, "Java");
        loadFactorDemo.put(20, "Python");
        loadFactorDemo.put(30, "Spring");

        System.out.println("\nLoad Factor");

        System.out.println(loadFactorDemo);

        /*
         * Formula
         *
         * Size / Capacity
         *
         * Default Value
         *
         * 0.75
         *
         * Provides a good
         * balance between
         * performance and
         * memory usage.
         */


        /*
         * ==========================================================
         *                      Threshold
         * ==========================================================
         */

        System.out.println("\nThreshold");

        /*
         * Formula
         *
         * Capacity
         *
         * ×
         *
         * Load Factor
         *
         * Example
         *
         * 16 × 0.75
         *
         * =
         *
         * 12
         *
         * After inserting
         * the 13th element,
         *
         * HashMap resizes.
         */


        /*
         * ==========================================================
         *                     Hashing
         * ==========================================================
         */

        String language = "Java";

        System.out.println("\nHashing");

        System.out.println("Key : "
                + language);

        System.out.println("hashCode : "
                + language.hashCode());

        /*
         * HashMap converts
         * the hashCode
         * into a bucket index.
         *
         * Key
         *
         * ↓
         *
         * hashCode()
         *
         * ↓
         *
         * Bucket
         */


        /*
         * ==========================================================
         *                  hashCode()
         * ==========================================================
         */

        System.out.println("\nhashCode()");

        System.out.println(

                "Java -> "
                        + "Java".hashCode()

        );

        System.out.println(

                "Python -> "
                        + "Python".hashCode()

        );

        /*
         * Every object
         * has a hashCode().
         *
         * HashMap uses
         * hashCode()
         * before equals().
         */


        /*
         * ==========================================================
         *                     equals()
         * ==========================================================
         */

        EmployeeKey emp1 =
                new EmployeeKey(1, "Rudra");

        EmployeeKey emp2 =
                new EmployeeKey(1, "Rudra");

        System.out.println("\nequals()");

        System.out.println(

                emp1.equals(emp2)

        );

        /*
         * equals()
         *
         * determines
         * logical equality.
         *
         * HashMap first
         * compares
         * hashCode().
         *
         * Then calls
         * equals().
         */


        /*
         * ==========================================================
         *                     Bucket
         * ==========================================================
         */

        System.out.println("\nBucket");

        /*
         * Example
         *
         * Bucket 0
         *
         * Bucket 1
         *
         * Bucket 2
         *
         * Bucket 3
         *
         * Every entry
         * is stored
         * inside one
         * bucket.
         */


        /*
         * ==========================================================
         *                  Hash Collision
         * ==========================================================
         */

        HashMap<CollisionKey, String> collisionDemo =
                new HashMap<>();

        collisionDemo.put(
                new CollisionKey(1),
                "Java");

        collisionDemo.put(
                new CollisionKey(2),
                "Python");

        collisionDemo.put(
                new CollisionKey(3),
                "Spring");

        System.out.println("\nHash Collision");

        System.out.println(collisionDemo);

        /*
         * All CollisionKey
         * objects return
         * the same hashCode().
         *
         * Therefore,
         * all entries
         * are stored
         * inside the
         * same bucket.
         */


        /*
         * ==========================================================
         *                Separate Chaining
         * ==========================================================
         */

        /*
         * Before Java 8
         *
         * Bucket
         *
         * ↓
         *
         * Java
         *
         * ↓
         *
         * Python
         *
         * ↓
         *
         * Spring
         *
         * Linked List
         * was used.
         */


        /*
         * ==========================================================
         *                  Treeification
         * ==========================================================
         */

        System.out.println("\nTreeification");

        /*
         * Bucket Size
         *
         * >= 8
         *
         * AND
         *
         * Capacity
         *
         * >= 64
         *
         * Linked List
         *
         * ↓
         *
         * Red Black Tree
         */


        /*
         * ==========================================================
         *                 Untreeification
         * ==========================================================
         */

        System.out.println("\nUntreeification");

        /*
         * Tree Size
         *
         * <= 6
         *
         * Red Black Tree
         *
         * ↓
         *
         * Linked List
         */


        /*
         * ==========================================================
         *                    Resizing
         * ==========================================================
         */

        HashMap<Integer, Integer> resizeDemo =
                new HashMap<>(4, 0.75f);

        resizeDemo.put(1, 10);
        resizeDemo.put(2, 20);
        resizeDemo.put(3, 30);

        System.out.println("\nBefore Resizing");

        System.out.println(resizeDemo);

        resizeDemo.put(4, 40);

        System.out.println("\nAfter Resizing");

        System.out.println(resizeDemo);

        /*
         * Capacity
         *
         * 4
         *
         * ↓
         *
         * 8
         *
         * Threshold exceeded.
         */


        /*
         * ==========================================================
         *                    Rehashing
         * ==========================================================
         */

        System.out.println("\nRehashing");

        /*
         * Old Bucket
         *
         * ↓
         *
         * Resize
         *
         * ↓
         *
         * New Bucket
         *
         * Every entry
         * receives a
         * new bucket index.
         */


        /*
         * ==========================================================
         *           Reference Type Demonstration
         * ==========================================================
         */

        /*
         * Map Reference
         *
         * Can access only
         * Map methods.
         */

        Map<Integer, String> mapReference =
                new HashMap<>();

        mapReference.put(1, "Java");
        mapReference.put(2, "Python");

        System.out.println("\nMap Reference");

        System.out.println(mapReference);

        /*
         * HashMap Reference
         *
         * Can access every
         * HashMap specific
         * method.
         */

        HashMap<Integer, String> hashMapReference =
                new HashMap<>();

        hashMapReference.put(100, "Spring");

        @SuppressWarnings("unchecked")

        HashMap<Integer, String> clonedReference =

                (HashMap<Integer, String>)
                        hashMapReference.clone();

        System.out.println("\nHashMap Reference");

        System.out.println(clonedReference);

        /*
         * Interface Reference
         *
         * Recommended because
         * implementation can
         * be changed easily.
         *
         * Class Reference
         *
         * Required when
         * HashMap specific
         * methods are needed.
         */


        /*
         * ==========================================================
         *                 Optimized Overrides
         * ==========================================================
         */


        // ---------------------------------------------------------
        // forEach()
        // ---------------------------------------------------------

        System.out.println("\nforEach()");

        hashMapReference.forEach(

                (key, value) ->

                        System.out.println(

                                key
                                        + " -> "
                                        + value)

        );


        // ---------------------------------------------------------
        // replaceAll()
        // ---------------------------------------------------------

        HashMap<Integer, String> replaceDemo =
                new HashMap<>();

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

        HashMap<String, Integer> mergeDemo =
                new HashMap<>();

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
         *             Fail-Fast Iterator
         * ==========================================================
         */

        HashMap<Integer, String> failFast =
                new HashMap<>();

        failFast.put(1, "Java");
        failFast.put(2, "Python");
        failFast.put(3, "Spring");

        System.out.println("\nFail-Fast Iterator");

        Iterator<Map.Entry<Integer, String>> itr =
                failFast.entrySet().iterator();

        System.out.println(itr.next());

        failFast.put(4, "Docker");

//      System.out.println(itr.next());

        /*
         * Uncommenting the
         * above statement
         * throws
         *
         * ConcurrentModificationException
         *
         * because HashMap
         * iterators are
         * Fail-Fast.
         */


        /*
         * ==========================================================
         *             HashMap Characteristics
         * ==========================================================
         */

        HashMap<Integer, String> characteristics =
                new HashMap<>();

        characteristics.put(3, "C");
        characteristics.put(1, "Java");
        characteristics.put(2, "Python");

        System.out.println("\nHashMap Characteristics");

        System.out.println(characteristics);

        /*
         * ✔ Unordered
         *
         * ✔ Hash Table
         *
         * ✔ One Null Key
         *
         * ✔ Multiple Null Values
         *
         * ✔ Duplicate Keys NOT Allowed
         *
         * ✔ Duplicate Values Allowed
         *
         * ✔ Average O(1)
         *
         * ✔ Not Thread Safe
         */


        /*
         * ==========================================================
         *             Methods Not Covered Yet
         * ==========================================================
         */

        /*
         * Internal JDK Methods
         *
         * hash()
         *
         * resize()
         *
         * treeifyBin()
         *
         * untreeify()
         *
         * putVal()
         *
         * removeNode()
         *
         * newNode()
         *
         * replacementNode()
         *
         * afterNodeAccess()
         *
         * afterNodeInsertion()
         */


        /*
         * ==========================================================
         *          Methods Inherited from Object
         * ==========================================================
         */

        System.out.println("\nObject Methods");

        System.out.println(characteristics.toString());

        System.out.println(characteristics.getClass());

        System.out.println(characteristics.hashCode());

        System.out.println(

                characteristics.equals(hashMapReference)

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
         * finalize() (Deprecated)
         */


        /*
         * ==========================================================
         *                Interview Notes
         * ==========================================================
         */

        /*
         * 1.
         * Average Complexity
         *
         * O(1)
         *
         * 2.
         * Worst Case
         *
         * O(log n)
         *
         * Java 8+
         *
         * 3.
         * One Null Key
         *
         * 4.
         * Multiple Null Values
         *
         * 5.
         * Hash Table
         *
         * 6.
         * Buckets
         *
         * 7.
         * Collision Handling
         *
         * 8.
         * Treeification
         *
         * 9.
         * Load Factor
         *
         * 10.
         * Fail-Fast Iterator
         */


        /*
         * ==========================================================
         *                     Summary
         * ==========================================================
         */

        /*
         * HashMap is the
         * most commonly used
         * implementation of
         * the Map interface.
         *
         * It provides
         * fast lookup,
         * insertion and
         * deletion using
         * hashing.
         *
         * HashMap forms the
         * foundation for
         * understanding all
         * hash-based
         * collections.
         */


        /*
         * ==========================================================
         *                        End
         * ==========================================================
         */

        System.out.println(
                "\nHashMap Implementation Completed.");

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

    Employee(String name, double salary) {

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
 * Demonstrates proper
 * equals() and hashCode().
 */

class EmployeeKey {

    int id;
    String name;

    EmployeeKey(int id, String name) {

        this.id = id;
        this.name = name;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof EmployeeKey))
            return false;

        EmployeeKey other =
                (EmployeeKey) obj;

        return id == other.id
                &&
                Objects.equals(name, other.name);

    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);

    }

}


/*
 * Used to demonstrate
 * Hash Collisions.
 */

class CollisionKey {

    int id;

    CollisionKey(int id) {

        this.id = id;

    }

    @Override
    public int hashCode() {

        return 1;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof CollisionKey))
            return false;

        CollisionKey other =
                (CollisionKey) obj;

        return id == other.id;

    }

    @Override
    public String toString() {

        return "Key-" + id;

    }

}


/*
 * ==========================================================
 * IMPORTANT
 * ==========================================================
 *
 * HashMap uses both
 * hashCode() and equals()
 * together.
 *
 * hashCode()
 *
 * ↓
 *
 * Bucket Selection
 *
 * ↓
 *
 * equals()
 *
 * ↓
 *
 * Exact Key Matching
 *
 * Overriding only one
 * of these methods
 * may lead to incorrect
 * behavior.
 *
 * ==========================================================
 */