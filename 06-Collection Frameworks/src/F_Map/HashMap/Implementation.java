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

        // Avoid Raw Types in production code.

        HashMap<Object, Object> rawMap =
                new HashMap<>(); // or HashMap rawMap = new HashMap<>();

        rawMap.put(101, "Java");
        rawMap.put("Course", "Spring Boot");
        rawMap.put(true, 99.99);

        System.out.println("Raw HashMap");

        System.out.println(rawMap);

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
         * Generic Types : It Provides Compile-Time Type Safety.
         */

        // ---------------------------------------------------------
        // Duplicate Key Demonstration
        // ---------------------------------------------------------

        HashMap<Integer, String> duplicateKey =
                new HashMap<>();

        duplicateKey.put(1, "Java");
        duplicateKey.put(2, "Python");
        duplicateKey.put(1, "Spring"); // Overwrites the previous value

        System.out.println("\nDuplicate Key");

        System.out.println(duplicateKey);

        /*
         * Output : {1=Spring, 2=Python}
         * Existing value gets replaced.
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
         * Duplicate Values are allowed.
         */

        // ---------------------------------------------------------
        // Null Key Replacement
        // ---------------------------------------------------------

        HashMap<Integer, String> nullReplace =
                new HashMap<>();

        nullReplace.put(null, "Java");

        nullReplace.put(null, "Spring"); // value gets overwrite

        System.out.println("\nNull Key Replacement");

        System.out.println(nullReplace);

        /*
         * Output : {null=Spring}
         * One null allowed
         * Existing Null Key gets replaced.
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
         * One or Multiple Null Values are allowed.
         */

        // ---------------------------------------------------------
        // Working with Custom Class
        // ---------------------------------------------------------

        HashMap<Integer, Employee> employees =
                new HashMap<>();

        employees.put(101, new Employee("Rudra", 90000));

        employees.put(102, new Employee("Haya", 85000));

        employees.put(103, new Employee("Arman", 92000));

        System.out.println("\nCustom Class");

        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {

            System.out.println("Key :"+entry.getKey());
            System.out.println("Value :"+entry.getValue());
            System.out.println("Name of Value :"+entry.getValue().name);
            System.out.println("Overall Entry :"+entry);

        }

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
         * Creates an empty HashMap.
         * Default Constructor.
         * Default Capacity : 16
         * Default Load Factor : 75
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
         * Specifies the initial capacity.
         * Useful when approximate number of entries is already known.
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
         * Allows custom Load Factor.
         * Default value 0.75 is recommended.
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
         * Copies all mappings from another Map.
         * Original Map remains unchanged.
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

        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) languageMap.clone();

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
         * clone() : Creates a Shallow Copy.
         */

        /*
         * ==================================================================================
         *  equals() and hashCode() - refer Buckets-Class.md for internal explanation
         * ==================================================================================
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
         * =========================================================================
         *     Hash Collision - refer Buckets-Class.md for internal explanation
         * =========================================================================
         */

        HashMap<CollisionKey, String> collisionDemo =
                new HashMap<>();

        collisionDemo.put(new CollisionKey(1), "Java"); // Key: new CollisionKey(1)  Value: "Java"

        collisionDemo.put(new CollisionKey(2), "Python");

        collisionDemo.put(new CollisionKey(3), "Spring");

        System.out.println("\nHash Collision");

        System.out.println(collisionDemo);

        /*
         * All CollisionKey objects return the same hashCode().
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
         * ==========================================================
         * Optimized Overrides
         * ==========================================================
         *
         * Already covered in Map Implementation.java
         *
         * ✓ forEach()
         * ✓ replaceAll()
         * ✓ compute()
         * ✓ computeIfAbsent()
         * ✓ computeIfPresent()
         * ✓ merge()
         */

        /*
         * ==========================================================
         *             Fail-Fast Iterator
         * ==========================================================
         */

        /*
        Why is it called Fail-Fast?
        Because Java fails immediately when it detects that the collection has been modified while iterating.
        Instead of giving incorrect results, it throws an exception as soon as possible
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
         *      Methods Inherited from Object - covered previous
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

        return id == other.id && Objects.equals(name, other.name);

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
