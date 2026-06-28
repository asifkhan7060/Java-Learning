package F_Map.IdentityHashMap;

import java.util.*;

/*
 * ==========================================================
 *          IdentityHashMap Implementation
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
         *      Basic IdentityHashMap Implementation
         * ==========================================================
         */


        // ---------------------------------------------------------
        // Raw Type
        // ---------------------------------------------------------

        IdentityHashMap rawMap =
                new IdentityHashMap();

        rawMap.put(101, "Java");

        rawMap.put("Course", "Spring Boot");

        rawMap.put(true, 99.99);

        System.out.println("Raw IdentityHashMap");

        System.out.println(rawMap);

        /*
         * Raw Types
         *
         * Store everything
         * as Object.
         *
         * Avoid using
         * Raw Types in
         * production code.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        IdentityHashMap<Integer, String> students =
                new IdentityHashMap<>();

        students.put(101, "Rudra");

        students.put(102, "Haya");

        students.put(103, "Arman");

        System.out.println("IdentityHashMap with Generics");

        System.out.println(students);

        /*
         * Generics provide
         * Compile-Time
         * Type Safety.
         */


        // ---------------------------------------------------------
        // Duplicate Key
        // ---------------------------------------------------------

        IdentityHashMap<Integer, String> duplicateKey =
                new IdentityHashMap<>();

        duplicateKey.put(1, "Java");

        duplicateKey.put(1, "Spring");

        System.out.println("\nDuplicate Key");

        System.out.println(duplicateKey);

        /*
         * Same reference
         * replaces the
         * existing value.
         */


        // ---------------------------------------------------------
        // Duplicate Value
        // ---------------------------------------------------------

        IdentityHashMap<Integer, String> duplicateValue =
                new IdentityHashMap<>();

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

        IdentityHashMap<Integer, String> nullKey =
                new IdentityHashMap<>();

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

        IdentityHashMap<Integer, String> nullValue =
                new IdentityHashMap<>();

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

        IdentityHashMap<Integer, Employee> employees =
                new IdentityHashMap<>();

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
         * Values may
         * contain duplicate
         * objects.
         *
         * Keys are compared
         * using Reference
         * Equality.
         */


        /*
         * ==========================================================
         *                 Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // IdentityHashMap()
        // ---------------------------------------------------------

        IdentityHashMap<Integer, String> map1 =
                new IdentityHashMap<>();

        map1.put(101, "Java");
        map1.put(102, "Python");
        map1.put(103, "Spring");

        System.out.println("\nIdentityHashMap()");

        System.out.println(map1);

        /*
         * Creates an empty
         * IdentityHashMap.
         *
         * Uses Reference
         * Equality.
         */


        // ---------------------------------------------------------
        // IdentityHashMap(int expectedMaxSize)
        // ---------------------------------------------------------

        IdentityHashMap<Integer, String> map2 =
                new IdentityHashMap<>(100);

        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Mango");

        System.out.println(
                "\nIdentityHashMap(int expectedMaxSize)");

        System.out.println(map2);

        /*
         * Specifies the
         * expected maximum
         * number of mappings.
         *
         * It is NOT the
         * actual capacity.
         */


        // ---------------------------------------------------------
        // IdentityHashMap(Map)
        // ---------------------------------------------------------

        HashMap<Integer, String> source =
                new HashMap<>();

        source.put(1, "Docker");
        source.put(2, "Kubernetes");
        source.put(3, "AWS");

        IdentityHashMap<Integer, String> map3 =
                new IdentityHashMap<>(source);

        System.out.println("\nIdentityHashMap(Map)");

        System.out.println("Source");

        System.out.println(source);

        System.out.println("\nIdentityHashMap");

        System.out.println(map3);

        /*
         * Copies all
         * mappings from
         * another Map.
         *
         * Future key
         * comparisons use
         * Reference Equality.
         */


        /*
         * ==========================================================
         *                      clone()
         * ==========================================================
         */

        IdentityHashMap<Integer, String> languageMap =
                new IdentityHashMap<>();

        languageMap.put(1, "Java");
        languageMap.put(2, "Python");
        languageMap.put(3, "Spring");

        @SuppressWarnings("unchecked")

        IdentityHashMap<Integer, String> cloned =

                (IdentityHashMap<Integer, String>)
                        languageMap.clone();

        System.out.println("\nclone()");

        System.out.println("Original");

        System.out.println(languageMap);

        System.out.println("\nClone");

        System.out.println(cloned);

        cloned.put(4, "Docker");

        System.out.println("\nAfter Modifying Clone");

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
         *            Shallow Copy Demonstration
         * ==========================================================
         */

        IdentityHashMap<Integer, Employee> employeeMap =
                new IdentityHashMap<>();

        employeeMap.put(
                101,
                new Employee("Rudra", 90000));

        employeeMap.put(
                102,
                new Employee("Haya", 85000));

        @SuppressWarnings("unchecked")

        IdentityHashMap<Integer, Employee> employeeCopy =

                (IdentityHashMap<Integer, Employee>)
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
         * Employee objects
         * are shared.
         *
         * Only the map
         * object is copied.
         */


        /*
         * ==========================================================
         *       HashMap vs IdentityHashMap (Most Important)
         * ==========================================================
         */

        String str1 =
                new String("Java");

        String str2 =
                new String("Java");

        HashMap<String, Integer> hashMap =
                new HashMap<>();

        hashMap.put(str1, 1);

        hashMap.put(str2, 2);

        System.out.println("\nHashMap");

        System.out.println(hashMap);

        System.out.println(
                "Size : "
                        + hashMap.size());

        /*
         * HashMap uses
         * equals().
         *
         * Both Strings
         * are logically
         * equal.
         *
         * Size = 1
         */


        IdentityHashMap<String, Integer> identityMap =
                new IdentityHashMap<>();

        identityMap.put(str1, 1);

        identityMap.put(str2, 2);

        System.out.println("\nIdentityHashMap");

        System.out.println(identityMap);

        System.out.println(
                "Size : "
                        + identityMap.size());

        /*
         * IdentityHashMap
         * uses ==
         *
         * Different
         * references.
         *
         * Size = 2
         */


        /*
         * ==========================================================
         *           equals() vs ==
         * ==========================================================
         */

        System.out.println("\nequals()");

        System.out.println(

                str1.equals(str2)

        );

        System.out.println("\n==");

        System.out.println(

                str1 == str2

        );

        /*
         * equals()
         *
         * true
         *
         * ==
         *
         * false
         *
         * This is the
         * reason both
         * IdentityHashMap
         * entries exist.
         */

        /*
         * ==========================================================
         *                  String Pool
         * ==========================================================
         */

        String pool1 = "Java";

        String pool2 = "Java";

        System.out.println("\nString Pool");

        System.out.println("pool1 == pool2 : "
                + (pool1 == pool2));

        System.out.println("pool1.equals(pool2) : "
                + pool1.equals(pool2));

        /*
         * String Literals
         * are stored inside
         * the String Pool.
         *
         * Both references
         * point to the
         * same object.
         *
         * ==
         *
         * true
         */


        /*
         * ==========================================================
         *                  new String()
         * ==========================================================
         */

        String object1 =
                new String("Java");

        String object2 =
                new String("Java");

        System.out.println("\nnew String()");

        System.out.println("object1 == object2 : "
                + (object1 == object2));

        System.out.println("object1.equals(object2) : "
                + object1.equals(object2));

        /*
         * Every call to
         * new String()
         * creates a new
         * object.
         *
         * ==
         *
         * false
         *
         * equals()
         *
         * true
         */


        /*
         * ==========================================================
         *          System.identityHashCode()
         * ==========================================================
         */

        System.out.println("\nSystem.identityHashCode()");

        System.out.println(

                "object1 : "

                        + System.identityHashCode(object1)

        );

        System.out.println(

                "object2 : "

                        + System.identityHashCode(object2)

        );

        /*
         * Returns hash code
         * based on object
         * identity.
         *
         * Ignores overridden
         * hashCode().
         */


        /*
         * ==========================================================
         *              Object Identity
         * ==========================================================
         */

        Employee emp1 =
                new Employee("Rudra", 90000);

        Employee emp2 =
                new Employee("Rudra", 90000);

        System.out.println("\nObject Identity");

        System.out.println(

                emp1 == emp2

        );

        System.out.println(

                emp1.equals(emp2)

        );

        /*
         * Two objects
         * contain same
         * data.
         *
         * But they are
         * different
         * objects.
         */


        /*
         * ==========================================================
         *             Duplicate Logical Keys
         * ==========================================================
         */

        EmployeeKey key1 =
                new EmployeeKey(101);

        EmployeeKey key2 =
                new EmployeeKey(101);

        IdentityHashMap<EmployeeKey, String> employeeIdentityMap =
                new IdentityHashMap<>();

        employeeIdentityMap.put(
                key1,
                "Java");

        employeeIdentityMap.put(
                key2,
                "Spring");

        System.out.println("\nDuplicate Logical Keys");

        System.out.println(employeeIdentityMap);

        System.out.println("Size : "
                + employeeIdentityMap.size());

        /*
         * Even though
         * key1 and key2
         * represent the
         * same data,
         *
         * they are
         * different
         * references.
         *
         * Therefore,
         *
         * Size = 2
         */


        /*
         * ==========================================================
         *               Integer Cache
         * ==========================================================
         */

        Integer cache1 = 100;

        Integer cache2 = 100;

        System.out.println("\nInteger Cache");

        System.out.println(

                cache1 == cache2

        );

        /*
         * Integer values
         *
         * -128 to 127
         *
         * are cached.
         *
         * ==
         *
         * true
         */


        Integer cache3 = 200;

        Integer cache4 = 200;

        System.out.println(

                cache3 == cache4

        );

        /*
         * Outside cache
         * range,
         *
         * different
         * objects are
         * created.
         *
         * ==
         *
         * false
         */


        /*
         * ==========================================================
         *             identityHashCode()
         *              vs hashCode()
         * ==========================================================
         */

        System.out.println("\nhashCode()");

        System.out.println(

                object1.hashCode()

        );

        System.out.println(

                object2.hashCode()

        );

        System.out.println("\nidentityHashCode()");

        System.out.println(

                System.identityHashCode(object1)

        );

        System.out.println(

                System.identityHashCode(object2)

        );

        /*
         * hashCode()
         *
         * May be
         * overridden.
         *
         * identityHashCode()
         *
         * Always based
         * on object
         * identity.
         */


        /*
         * ==========================================================
         *             Reference Demonstration
         * ==========================================================
         */

        Employee employee =
                new Employee("Virat", 100000);

        Employee reference =
                employee;

        System.out.println("\nReference");

        System.out.println(

                employee == reference

        );

        /*
         * Both variables
         * point to the
         * same object.
         *
         * ==
         *
         * true
         */


        /*
         * ==========================================================
         *           Memory Representation
         * ==========================================================
         */

        /*
         * HashMap
         *
         * Employee A
         *
         * equals()
         *
         * Employee B
         *
         * =
         *
         * One Entry
         *
         *
         * -------------------
         *
         * IdentityHashMap
         *
         * Employee A
         *
         * !=
         *
         * Employee B
         *
         * =
         *
         * Two Entries
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

        Map<String, Integer> mapReference =
                new IdentityHashMap<>();

        mapReference.put("Java", 21);

        System.out.println("\nMap Reference");

        System.out.println(mapReference);

        /*
         * IdentityHashMap Reference
         *
         * Required when
         * IdentityHashMap
         * specific methods
         * are needed.
         */

        IdentityHashMap<String, Integer> identityReference =
                new IdentityHashMap<>();

        identityReference.put("Spring", 10);

        @SuppressWarnings("unchecked")

        IdentityHashMap<String, Integer> clonedReference =

                (IdentityHashMap<String, Integer>)
                        identityReference.clone();

        System.out.println("\nIdentityHashMap Reference");

        System.out.println(clonedReference);



        /*
         * ==========================================================
         *             Real World Demonstration
         * ==========================================================
         */

        Employee employee1 =
                new Employee("Rudra", 90000);

        Employee employee2 =
                new Employee("Rudra", 90000);

        IdentityHashMap<Employee, Boolean> visited =
                new IdentityHashMap<>();

        visited.put(employee1, true);

        visited.put(employee2, true);

        System.out.println("\nVisited Objects");

        System.out.println(visited);

        System.out.println("Visited Count : "
                + visited.size());

        /*
         * Used by
         *
         * Object Graph
         *
         * Serialization
         *
         * Circular Reference
         *
         * Detection
         *
         * JVM Frameworks
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

        identityReference.forEach(

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

        IdentityHashMap<Integer, String> replaceDemo =
                new IdentityHashMap<>();

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

        IdentityHashMap<String, Integer> mergeDemo =
                new IdentityHashMap<>();

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
         *          IdentityHashMap Characteristics
         * ==========================================================
         */

        IdentityHashMap<String, Integer> characteristics =
                new IdentityHashMap<>();

        characteristics.put("Java", 21);

        characteristics.put("Python", 10);

        System.out.println("\nCharacteristics");

        System.out.println(characteristics);

        /*
         * ✔ Reference Equality
         *
         * ✔ Uses ==
         *
         * ✔ Uses
         * System.identityHashCode()
         *
         * ✔ Open Addressing
         *
         * ✔ Linear Probing
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
         * hash()
         *
         * resize()
         *
         * capacity()
         *
         * nextKeyIndex()
         *
         * closeDeletion()
         *
         * init()
         *
         * putForCreate()
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

                characteristics.equals(identityReference)

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
         *                Interview Notes
         * ==========================================================
         */

        /*
         * 1.
         * Uses ==
         *
         * 2.
         * Does NOT use
         * equals()
         *
         * 3.
         * Uses
         * System.identityHashCode()
         *
         * 4.
         * Allows duplicate
         * logical keys
         *
         * 5.
         * Uses Open
         * Addressing
         *
         * 6.
         * Uses Linear
         * Probing
         *
         * 7.
         * Stores entries
         * inside Object[]
         *
         * 8.
         * Not Thread Safe
         *
         * 9.
         * clone() creates
         * Shallow Copy
         *
         * 10.
         * Mainly used by
         * JVM Internals
         * and Frameworks
         */


        /*
         * ==========================================================
         *                    Summary
         * ==========================================================
         */

        /*
         * IdentityHashMap
         * is a specialized
         * implementation
         * of Map.
         *
         * It compares
         * keys using
         * Reference Equality
         * instead of
         * Logical Equality.
         *
         * It is mainly
         * intended for
         * framework level
         * development.
         */


        /*
         * ==========================================================
         *                        End
         * ==========================================================
         */

        System.out.println(
                "\nIdentityHashMap Implementation Completed.");

    }

}


/*
 * ==========================================================
 *                  Custom Classes
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
 * Used for demonstrating
 * logical equality vs
 * reference equality.
 */

class EmployeeKey {

    int id;

    EmployeeKey(int id) {

        this.id = id;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof EmployeeKey))
            return false;

        EmployeeKey other =
                (EmployeeKey) obj;

        return id == other.id;

    }

    @Override
    public int hashCode() {

        return Objects.hash(id);

    }

    @Override
    public String toString() {

        return "EmployeeKey{" +
                "id=" + id +
                '}';

    }

}


/*
 * ==========================================================
 * IMPORTANT
 * ==========================================================
 *
 * HashMap
 *
 * key.hashCode()
 *
 * ↓
 *
 * equals()
 *
 * ↓
 *
 * One Logical Entry
 *
 * --------------------------
 *
 * IdentityHashMap
 *
 * System.identityHashCode()
 *
 * ↓
 *
 * ==
 *
 * ↓
 *
 * One Physical Object
 *
 * --------------------------
 *
 * Use IdentityHashMap
 * only when
 * Object Identity
 * is more important
 * than Logical Equality.
 *
 * ==========================================================
 */