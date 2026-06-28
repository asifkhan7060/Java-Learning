package F_Map.HashTable;

import java.util.*;

/*
 * ==========================================================
 *              Hashtable Implementation
 * ==========================================================
 */

public class Implementation {

    public static void main(String[] args) {

        /*
         * ==========================================================
         *              Methods Inherited from Map
         * ==========================================================
         */

        // Already implemented in Map topic

        // put(K,V)
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
        // equals()
        // hashCode()
        // forEach()
        // replace()
        // replaceAll()
        // compute()
        // computeIfAbsent()
        // computeIfPresent()
        // merge()

        /*
         * ==========================================================
         *              Basic Hashtable Implementation
         * ==========================================================
         */


        // ---------------------------------------------------------
        // Raw Type
        // ---------------------------------------------------------

        Hashtable rawTable =
                new Hashtable();

        rawTable.put(101, "Java");

        rawTable.put("Course", "Spring Boot");

        rawTable.put(true, 99.99);

        System.out.println("Raw Hashtable");

        System.out.println(rawTable);

        /*
         * Raw Types
         *
         * Store everything
         * as Object.
         *
         * Type Safety
         * is NOT available.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        Hashtable<Integer, String> students =
                new Hashtable<>();

        students.put(101, "Rudra");

        students.put(102, "Haya");

        students.put(103, "Arman");

        System.out.println("Hashtable with Generics");

        System.out.println(students);

        /*
         * Generic Types
         *
         * Provide
         * Compile-Time
         * Type Safety.
         */


        // ---------------------------------------------------------
        // Duplicate Key
        // ---------------------------------------------------------

        Hashtable<Integer, String> duplicateKey =
                new Hashtable<>();

        duplicateKey.put(1, "Java");

        duplicateKey.put(2, "Python");

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

        Hashtable<Integer, String> duplicateValue =
                new Hashtable<>();

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

        Hashtable<Integer, String> nullKey =
                new Hashtable<>();

//      nullKey.put(null, "Java");

        System.out.println("\nNull Key");

        System.out.println(
                "Null Keys are NOT allowed."
        );

        /*
         * Uncommenting
         * the above line
         * throws
         *
         * NullPointerException
         */


        // ---------------------------------------------------------
        // Null Value Demonstration
        // ---------------------------------------------------------

        Hashtable<Integer, String> nullValue =
                new Hashtable<>();

//      nullValue.put(1, null);

        System.out.println("\nNull Value");

        System.out.println(
                "Null Values are NOT allowed."
        );

        /*
         * Uncommenting
         * the above line
         * throws
         *
         * NullPointerException
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

        Hashtable<Integer, Employee> employees =
                new Hashtable<>();

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
         * Keys remain unique.
         *
         * Values may contain
         * duplicate objects.
         */


        /*
         * ==========================================================
         *                    Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Hashtable()
        // ---------------------------------------------------------

        Hashtable<Integer, String> table1 =
                new Hashtable<>();

        table1.put(101, "Java");
        table1.put(102, "Python");
        table1.put(103, "Spring");

        System.out.println("\nHashtable()");

        System.out.println(table1);

        /*
         * Creates an empty
         * Hashtable.
         *
         * Default Capacity
         *
         * 11
         *
         * Default Load Factor
         *
         * 0.75
         */


        // ---------------------------------------------------------
        // Hashtable(int initialCapacity)
        // ---------------------------------------------------------

        Hashtable<Integer, String> table2 =
                new Hashtable<>(100);

        table2.put(1, "Apple");
        table2.put(2, "Banana");
        table2.put(3, "Mango");

        System.out.println("\nHashtable(int initialCapacity)");

        System.out.println(table2);

        /*
         * Creates Hashtable
         * with specified
         * initial capacity.
         *
         * Helps reduce
         * rehashing.
         */


        // ---------------------------------------------------------
        // Hashtable(int initialCapacity,
        //            float loadFactor)
        // ---------------------------------------------------------

        Hashtable<Integer, String> table3 =
                new Hashtable<>(64, 0.75f);

        table3.put(10, "HTML");
        table3.put(20, "CSS");
        table3.put(30, "JavaScript");

        System.out.println(
                "\nHashtable(int,float)");

        System.out.println(table3);

        /*
         * Allows custom
         * Load Factor.
         */


        // ---------------------------------------------------------
        // Hashtable(Map)
        // ---------------------------------------------------------

        HashMap<Integer, String> source =
                new HashMap<>();

        source.put(1, "Docker");
        source.put(2, "Kubernetes");
        source.put(3, "AWS");

        Hashtable<Integer, String> table4 =
                new Hashtable<>(source);

        System.out.println("\nHashtable(Map)");

        System.out.println("Source Map");

        System.out.println(source);

        System.out.println("\nHashtable");

        System.out.println(table4);

        /*
         * Copies all
         * mappings from
         * another Map.
         *
         * Null Keys
         * and Null Values
         * are NOT allowed.
         */


        /*
         * ==========================================================
         *                     clone()
         * ==========================================================
         */

        Hashtable<Integer, String> languageTable =
                new Hashtable<>();

        languageTable.put(1, "Java");
        languageTable.put(2, "Python");
        languageTable.put(3, "Spring");

        @SuppressWarnings("unchecked")

        Hashtable<Integer, String> cloned =

                (Hashtable<Integer, String>)
                        languageTable.clone();

        System.out.println("\nclone()");

        System.out.println("Original");

        System.out.println(languageTable);

        System.out.println("\nClone");

        System.out.println(cloned);

        cloned.put(4, "Docker");

        System.out.println("\nAfter Modifying Clone");

        System.out.println("Original");

        System.out.println(languageTable);

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
         *             Shallow Copy Demonstration
         * ==========================================================
         */

        Hashtable<Integer, Employee> employeeTable =
                new Hashtable<>();

        employeeTable.put(
                101,
                new Employee("Rudra", 90000));

        employeeTable.put(
                102,
                new Employee("Haya", 85000));

        @SuppressWarnings("unchecked")

        Hashtable<Integer, Employee> employeeCopy =

                (Hashtable<Integer, Employee>)
                        employeeTable.clone();

        System.out.println("\nShallow Copy");

        System.out.println("Original");

        System.out.println(employeeTable);

        System.out.println("\nCopied");

        System.out.println(employeeCopy);

        employeeCopy
                .get(101)
                .name = "Virat";

        System.out.println("\nAfter Modifying Object");

        System.out.println("Original");

        System.out.println(employeeTable);

        System.out.println("\nCopied");

        System.out.println(employeeCopy);

        /*
         * Hashtable object
         * is copied.
         *
         * Employee objects
         * are shared.
         */


        /*
         * ==========================================================
         *                     keys()
         * ==========================================================
         */

        System.out.println("\nkeys()");

        Enumeration<Integer> keys =
                table1.keys();

        while (keys.hasMoreElements()) {

            System.out.println(

                    keys.nextElement()

            );

        }

        /*
         * Returns an
         * Enumeration
         * containing
         * all Keys.
         */


        /*
         * ==========================================================
         *                    elements()
         * ==========================================================
         */

        System.out.println("\nelements()");

        Enumeration<String> values =
                table1.elements();

        while (values.hasMoreElements()) {

            System.out.println(

                    values.nextElement()

            );

        }

        /*
         * Returns an
         * Enumeration
         * containing
         * all Values.
         */


        /*
         * ==========================================================
         *               contains(Object value)
         * ==========================================================
         */

        System.out.println("\ncontains(Object)");

        System.out.println(

                table1.contains("Java")

        );

        /*
         * Legacy Method.
         *
         * Same as
         *
         * containsValue()
         *
         * Prefer
         *
         * containsValue()
         *
         * in modern Java.
         */


        /*
         * ==========================================================
         *             Constructors Completed
         * ==========================================================
         */

        /*
         * ==========================================================
         *                  Synchronization
         * ==========================================================
         */

        Hashtable<Integer, String> syncTable =
                new Hashtable<>();

        syncTable.put(1, "Java");
        syncTable.put(2, "Python");
        syncTable.put(3, "Spring");

        System.out.println("\nSynchronization");

        System.out.println(syncTable);

        /*
         * Every public method
         * in Hashtable is
         * synchronized.
         *
         * Only one thread
         * can execute a
         * modifying operation
         * at a time.
         */


        /*
         * ==========================================================
         *                    Thread Safety
         * ==========================================================
         */

        Hashtable<Integer, String> threadSafe =
                new Hashtable<>();

        threadSafe.put(101, "Java");
        threadSafe.put(102, "Python");

        System.out.println("\nThread Safety");

        System.out.println(threadSafe);

        /*
         * Hashtable is
         * Thread Safe.
         *
         * Multiple threads
         * can safely access
         * the same object.
         */


        /*
         * ==========================================================
         *                 Monitor Lock
         * ==========================================================
         */

        System.out.println("\nMonitor Lock");

        /*
         * Thread A
         *
         *      ↓
         *
         * Hashtable
         *
         *      ↓
         *
         * Monitor Lock
         *
         *      ↓
         *
         * Thread B waits
         *
         * until lock
         * is released.
         */


        /*
         * ==========================================================
         *            Enumeration vs Iterator
         * ==========================================================
         */

        Hashtable<Integer, String> traversal =
                new Hashtable<>();

        traversal.put(1, "Java");
        traversal.put(2, "Python");
        traversal.put(3, "Spring");

        System.out.println("\nEnumeration");

        Enumeration<Integer> enumeration =
                traversal.keys();

        while (enumeration.hasMoreElements()) {

            System.out.println(

                    enumeration.nextElement()

            );

        }

        System.out.println("\nIterator");

        Iterator<Integer> iterator2 =
                traversal.keySet().iterator();

        while (iterator2.hasNext()) {

            System.out.println(

                    iterator2.next()

            );

        }

        /*
         * Enumeration
         *
         * Legacy Interface.
         *
         * Iterator
         *
         * Modern Interface.
         */


        /*
         * ==========================================================
         *                Iterator remove()
         * ==========================================================
         */

        Hashtable<Integer, String> removeDemo =
                new Hashtable<>();

        removeDemo.put(1, "Java");
        removeDemo.put(2, "Python");
        removeDemo.put(3, "Spring");

        Iterator<Integer> removeIterator =
                removeDemo.keySet().iterator();

        while (removeIterator.hasNext()) {

            Integer key =
                    removeIterator.next();

            if (key == 2) {

                removeIterator.remove();

            }

        }

        System.out.println("\nIterator remove()");

        System.out.println(removeDemo);

        /*
         * Iterator supports
         * remove().
         *
         * Enumeration
         * does NOT.
         */


        /*
         * ==========================================================
         *               Fail-Fast Iterator
         * ==========================================================
         */

        Hashtable<Integer, String> failFast =
                new Hashtable<>();

        failFast.put(1, "Java");
        failFast.put(2, "Python");
        failFast.put(3, "Spring");

        Iterator<Map.Entry<Integer, String>> failIterator =
                failFast.entrySet().iterator();

        System.out.println("\nFail-Fast Iterator");

        System.out.println(failIterator.next());

        failFast.put(4, "Docker");

//      System.out.println(failIterator.next());

        /*
         * Uncommenting
         * the above line
         * throws
         *
         * ConcurrentModificationException.
         */


        /*
         * ==========================================================
         *            Enumeration is NOT Fail-Fast
         * ==========================================================
         */

        Hashtable<Integer, String> enumDemo =
                new Hashtable<>();

        enumDemo.put(1, "Java");
        enumDemo.put(2, "Python");

        Enumeration<Integer> enumKeys =
                enumDemo.keys();

        enumDemo.put(3, "Spring");

        System.out.println("\nEnumeration");

        while (enumKeys.hasMoreElements()) {

            System.out.println(

                    enumKeys.nextElement()

            );

        }

        /*
         * Enumeration
         * does NOT perform
         * Fail-Fast checking.
         *
         * It is considered
         * a legacy traversal
         * mechanism.
         */


        /*
         * ==========================================================
         *               Legacy Collection
         * ==========================================================
         */

        Hashtable<Integer, String> legacy =
                new Hashtable<>();

        legacy.put(1, "JDK 1.0");

        System.out.println("\nLegacy Collection");

        System.out.println(legacy);

        /*
         * Hashtable
         * belongs to
         * JDK 1.0.
         *
         * It existed before
         * the Collections
         * Framework.
         */


        /*
         * ==========================================================
         *            HashMap vs Hashtable
         * ==========================================================
         */

        HashMap<Integer, String> hashMap =
                new HashMap<>();

        Hashtable<Integer, String> hashTable =
                new Hashtable<>();

        hashMap.put(null, "Java");

//      hashTable.put(null, "Java");

        System.out.println("\nHashMap");

        System.out.println(hashMap);

        System.out.println("\nHashtable");

        System.out.println(hashTable);

        /*
         * HashMap
         *
         * Allows
         * Null Key.
         *
         * Hashtable
         *
         * Does NOT
         * allow
         * Null Key.
         */


        /*
         * ==========================================================
         *           Reference Type Demonstration
         * ==========================================================
         */

        Map<Integer, String> mapReference =
                new Hashtable<>();

        mapReference.put(1, "Java");

        System.out.println("\nMap Reference");

        System.out.println(mapReference);

        Hashtable<Integer, String> tableReference =
                new Hashtable<>();

        tableReference.put(10, "Spring");

        Enumeration<Integer> enumerationKeys =
                tableReference.keys();

        System.out.println("\nHashtable Reference");

        System.out.println(tableReference);

        /*
         * Interface Reference
         *
         * Recommended.
         *
         * Class Reference
         *
         * Required for
         * Hashtable
         * specific methods
         * like
         *
         * keys()
         *
         * elements().
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

        tableReference.forEach(

                (key, value) ->

                        System.out.println(

                                key
                                        + " -> "
                                        + value)

        );

        /*
         * Introduced in
         * Java 8.
         *
         * Uses BiConsumer.
         */


        // ---------------------------------------------------------
        // replaceAll()
        // ---------------------------------------------------------

        Hashtable<Integer, String> replaceDemo =
                new Hashtable<>();

        replaceDemo.put(1, "java");
        replaceDemo.put(2, "python");
        replaceDemo.put(3, "spring");

        replaceDemo.replaceAll(

                (key, value) ->

                        value.toUpperCase()

        );

        System.out.println("\nreplaceAll()");

        System.out.println(replaceDemo);

        /*
         * Replaces every
         * value using
         * BiFunction.
         */


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

        /*
         * Computes a new
         * value for an
         * existing key.
         */


        // ---------------------------------------------------------
        // computeIfAbsent()
        // ---------------------------------------------------------

        replaceDemo.computeIfAbsent(

                4,

                key -> "Docker"

        );

        System.out.println("\ncomputeIfAbsent()");

        System.out.println(replaceDemo);

        /*
         * Executes only
         * if key is absent.
         */


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

        /*
         * Executes only
         * if key exists.
         */


        // ---------------------------------------------------------
        // merge()
        // ---------------------------------------------------------

        Hashtable<String, Integer> mergeDemo =
                new Hashtable<>();

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
         * Combines old
         * and new values.
         *
         * Inserts value
         * if key doesn't
         * exist.
         */


        /*
         * ==========================================================
         *             Hashtable Characteristics
         * ==========================================================
         */

        Hashtable<Integer, String> characteristics =
                new Hashtable<>();

        characteristics.put(3, "C");
        characteristics.put(1, "Java");
        characteristics.put(2, "Python");

        System.out.println("\nHashtable Characteristics");

        System.out.println(characteristics);

        /*
         * ✔ Thread Safe
         *
         * ✔ Synchronized
         *
         * ✔ Legacy Class
         *
         * ✔ No Null Keys
         *
         * ✔ No Null Values
         *
         * ✔ Duplicate Keys NOT Allowed
         *
         * ✔ Duplicate Values Allowed
         *
         * ✔ Supports Enumeration
         *
         * ✔ Supports Iterator
         */


        /*
         * ==========================================================
         *            Methods Not Covered Yet
         * ==========================================================
         */

        /*
         * Internal JDK Methods
         *
         * rehash()
         *
         * addEntry()
         *
         * remove()
         *
         * writeObject()
         *
         * readObject()
         *
         * These methods
         * are implementation
         * details and are
         * rarely used
         * directly.
         */


        /*
         * ==========================================================
         *         Methods Inherited from Object
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

                characteristics.equals(tableReference)

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
         * Hashtable
         * is Thread Safe.
         *
         * 2.
         * Every public
         * method is
         * synchronized.
         *
         * 3.
         * Null Keys
         * are NOT allowed.
         *
         * 4.
         * Null Values
         * are NOT allowed.
         *
         * 5.
         * Supports
         * Enumeration.
         *
         * 6.
         * Iterator is
         * Fail-Fast.
         *
         * 7.
         * Enumeration
         * is NOT Fail-Fast.
         *
         * 8.
         * Extends
         * Dictionary.
         *
         * 9.
         * Legacy Class.
         *
         * 10.
         * Modern Java
         * prefers
         * ConcurrentHashMap
         * over Hashtable.
         */


        /*
         * ==========================================================
         *                    Summary
         * ==========================================================
         */

        /*
         * Hashtable is
         * a synchronized
         * implementation
         * of the Map
         * interface.
         *
         * It provides
         * thread-safe
         * operations
         * using monitor
         * locking.
         *
         * Although still
         * available,
         * modern Java
         * applications
         * generally prefer
         * ConcurrentHashMap.
         */


        /*
         * ==========================================================
         *                       End
         * ==========================================================
         */

        System.out.println(
                "\nHashtable Implementation Completed.");

    }

}


/*
 * ==========================================================
 *                  Custom Class
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
 * IMPORTANT
 * ==========================================================
 *
 * Hashtable
 *
 * ✔ Thread Safe
 *
 * ✔ Synchronized
 *
 * ✔ No Null Keys
 *
 * ✔ No Null Values
 *
 * ✔ Legacy Class
 *
 * ✔ Supports Enumeration
 *
 * ✔ Iterator is Fail-Fast
 *
 * ✔ Enumeration is NOT
 *   Fail-Fast
 *
 * Modern Java
 * recommends
 * ConcurrentHashMap
 * instead of Hashtable
 * for concurrent
 * applications.
 *
 * ==========================================================
 */