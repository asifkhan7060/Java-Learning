package F_Map.HashTable;

import java.util.*;

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

        Hashtable rawTable = new Hashtable<>();

        rawTable.put(101, "Java"); // different datatypes in keys accepted but not recommended

        rawTable.put("Course", "Spring Boot");

        rawTable.put(true, 99.99);

        System.out.println("Raw Hashtable");

        System.out.println(rawTable);

        System.out.println();

        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        Hashtable<Integer, String> students = new Hashtable<>();

        students.put(101, "Rudra");

        students.put(102, "Haya");

        students.put(103, "Arman");

        System.out.println("Hashtable with Generics");

        System.out.println(students);

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
         * Existing value gets replaced.
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

        Hashtable<Integer, String> check_null =
                new Hashtable<>();

        // check_null.put(null, "Java");
        // check_null.put(1, null);

        System.out.println("\nNull Key and Value");

        System.out.println("Null Keys and Values are NOT allowed.");

        /*
         * Uncommenting the above line throws NullPointerException
         */

        // ---------------------------------------------------------
        // For Each Loop
        // ---------------------------------------------------------

        System.out.println("\nUsing For Each");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
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

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

        // ---------------------------------------------------------
        // Working with Custom Class
        // ---------------------------------------------------------

        Hashtable<Integer, Employee> employees =
                new Hashtable<>();

        employees.put(101, new Employee("Rudra", 90000));

        employees.put(102, new Employee("Haya", 85000));

        employees.put(103, new Employee("Arman", 92000));

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
         * Copies all mappings from another Map.
         * Null Keys and Null Values are NOT allowed (if exist throws error)
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

