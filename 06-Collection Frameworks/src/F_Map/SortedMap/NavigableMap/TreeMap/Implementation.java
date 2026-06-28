package F_Map.SortedMap.NavigableMap.TreeMap;


import java.util.*;

/*
 * ==========================================================
 *               TreeMap Implementation
 * ==========================================================
 */

public class Implementation {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        /*
         * ==========================================================
         *           Methods Inherited from Map
         * ==========================================================
         */

        // Already implemented in Map topic

        // put()
        // putAll()
        // get()
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
         *             Basic TreeMap Implementation
         * ==========================================================
         */


        // ---------------------------------------------------------
        // Raw Type
        // ---------------------------------------------------------

        TreeMap rawMap =
                new TreeMap();

        rawMap.put(101, "Java");

        rawMap.put(102, "Spring");

        rawMap.put(103, "Docker");

        System.out.println("Raw TreeMap");

        System.out.println(rawMap);

        /*
         * Raw Types
         *
         * Store Objects
         * without type safety.
         */


        // ---------------------------------------------------------
        // Generic Type
        // ---------------------------------------------------------

        TreeMap<Integer, String> students =
                new TreeMap<>();

        students.put(103, "Arman");

        students.put(101, "Rudra");

        students.put(102, "Haya");

        System.out.println("\nTreeMap with Generics");

        System.out.println(students);

        /*
         * Observe that
         * TreeMap stores
         * entries in
         * Sorted Order.
         */


        // ---------------------------------------------------------
        // Duplicate Key
        // ---------------------------------------------------------

        TreeMap<Integer, String> duplicateKey =
                new TreeMap<>();

        duplicateKey.put(10, "Java");

        duplicateKey.put(10, "Spring");

        System.out.println("\nDuplicate Key");

        System.out.println(duplicateKey);

        /*
         * Existing value
         * gets replaced.
         */


        // ---------------------------------------------------------
        // Duplicate Value
        // ---------------------------------------------------------

        TreeMap<Integer, String> duplicateValue =
                new TreeMap<>();

        duplicateValue.put(1, "Java");

        duplicateValue.put(2, "Java");

        duplicateValue.put(3, "Java");

        System.out.println("\nDuplicate Value");

        System.out.println(duplicateValue);

        /*
         * Duplicate values
         * are allowed.
         */


        // ---------------------------------------------------------
        // Null Value
        // ---------------------------------------------------------

        TreeMap<Integer, String> nullValue =
                new TreeMap<>();

        nullValue.put(1, null);

        nullValue.put(2, "Spring");

        nullValue.put(3, null);

        System.out.println("\nNull Values");

        System.out.println(nullValue);

        /*
         * Multiple
         * Null Values
         * are allowed.
         */


        // ---------------------------------------------------------
        // Null Key
        // ---------------------------------------------------------

        TreeMap<Integer, String> nullKey =
                new TreeMap<>();

        try {

            nullKey.put(null, "Java");

        } catch (NullPointerException e) {

            System.out.println("\nNull Key");

            System.out.println(

                    "NullPointerException"

            );

        }

        /*
         * Null Keys
         * are NOT allowed
         * with Natural
         * Ordering.
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

        TreeMap<Integer, Employee> employees =
                new TreeMap<>();

        employees.put(
                103,
                new Employee("Arman", 92000));

        employees.put(
                101,
                new Employee("Rudra", 90000));

        employees.put(
                102,
                new Employee("Haya", 85000));

        System.out.println("\nCustom Class");

        employees.forEach(

                (id, employee) ->

                        System.out.println(

                                id
                                        + " -> "
                                        + employee

                        )

        );

        /*
         * Entries are
         * automatically
         * sorted by key.
         */


        /*
         * ==========================================================
         *                   Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // TreeMap()
        // ---------------------------------------------------------

        TreeMap<Integer, String> map1 =
                new TreeMap<>();

        map1.put(30, "Spring");
        map1.put(10, "Java");
        map1.put(20, "Python");
        map1.put(40, "Docker");

        System.out.println("\nTreeMap()");

        System.out.println(map1);

        /*
         * Creates an
         * empty TreeMap.
         *
         * Uses Natural
         * Ordering.
         */


        // ---------------------------------------------------------
        // TreeMap(Comparator)
        // ---------------------------------------------------------

        TreeMap<Integer, String> reverseMap =
                new TreeMap<>(
                        Collections.reverseOrder()
                );

        reverseMap.put(30, "Spring");
        reverseMap.put(10, "Java");
        reverseMap.put(20, "Python");
        reverseMap.put(40, "Docker");

        System.out.println(
                "\nTreeMap(Comparator)");

        System.out.println(reverseMap);

        /*
         * Comparator
         * controls
         * sorting.
         *
         * Here,
         *
         * Descending
         * Order.
         */


        // ---------------------------------------------------------
        // TreeMap(Map)
        // ---------------------------------------------------------

        HashMap<Integer, String> source =
                new HashMap<>();

        source.put(4, "AWS");
        source.put(1, "Java");
        source.put(3, "Spring");
        source.put(2, "Docker");

        TreeMap<Integer, String> map2 =
                new TreeMap<>(source);

        System.out.println(
                "\nTreeMap(Map)");

        System.out.println("Source");

        System.out.println(source);

        System.out.println("\nTreeMap");

        System.out.println(map2);

        /*
         * Copies all
         * entries from
         * another Map.
         *
         * Keys become
         * sorted.
         */


        // ---------------------------------------------------------
        // TreeMap(SortedMap)
        // ---------------------------------------------------------

        SortedMap<Integer, String> sortedSource =
                new TreeMap<>();

        sortedSource.put(50, "React");
        sortedSource.put(20, "Node");
        sortedSource.put(40, "MongoDB");
        sortedSource.put(10, "HTML");

        TreeMap<Integer, String> map3 =
                new TreeMap<>(sortedSource);

        System.out.println(
                "\nTreeMap(SortedMap)");

        System.out.println(map3);

        /*
         * Copies another
         * SortedMap.
         *
         * Preserves
         * Comparator
         * if present.
         */


        /*
         * ==========================================================
         *                      clone()
         * ==========================================================
         */

        TreeMap<Integer, String> languageMap =
                new TreeMap<>();

        languageMap.put(1, "Java");
        languageMap.put(2, "Python");
        languageMap.put(3, "Spring");

        @SuppressWarnings("unchecked")
        TreeMap<Integer, String> cloned =
                (TreeMap<Integer, String>)
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

        TreeMap<Integer, Employee> employeeMap =
                new TreeMap<>();

        employeeMap.put(
                101,
                new Employee("Rudra", 90000));

        employeeMap.put(
                102,
                new Employee("Haya", 85000));

        @SuppressWarnings("unchecked")
        TreeMap<Integer, Employee> employeeCopy =
                (TreeMap<Integer, Employee>)
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
         * Only the TreeMap
         * structure is
         * copied.
         */


        /*
         * ==========================================================
         *              Natural Ordering
         * ==========================================================
         */

        TreeMap<Integer, String> naturalOrder =
                new TreeMap<>();

        naturalOrder.put(50, "Fifty");
        naturalOrder.put(10, "Ten");
        naturalOrder.put(40, "Forty");
        naturalOrder.put(20, "Twenty");
        naturalOrder.put(30, "Thirty");

        System.out.println(
                "\nNatural Ordering");

        System.out.println(naturalOrder);

        /*
         * Keys are
         * automatically
         * arranged in
         * Ascending Order.
         */


        /*
         * ==========================================================
         *             Reverse Ordering
         * ==========================================================
         */

        TreeMap<Integer, String> descending =
                new TreeMap<>(
                        Comparator.reverseOrder()
                );

        descending.put(50, "Fifty");
        descending.put(10, "Ten");
        descending.put(40, "Forty");
        descending.put(20, "Twenty");
        descending.put(30, "Thirty");

        System.out.println(
                "\nReverse Ordering");

        System.out.println(descending);

        /*
         * Comparator
         * changes the
         * sorting order.
         */

        /*
         * ==========================================================
         *         Methods from SortedMap Interface
         * ==========================================================
         */

        TreeMap<Integer, String> sortedMap =
                new TreeMap<>();

        sortedMap.put(10, "Java");
        sortedMap.put(20, "Python");
        sortedMap.put(30, "Spring");
        sortedMap.put(40, "Docker");
        sortedMap.put(50, "AWS");



        // ---------------------------------------------------------
        // comparator()
        // ---------------------------------------------------------

        System.out.println("\ncomparator()");

        System.out.println(
                sortedMap.comparator()
        );

        /*
         * Returns the
         * Comparator used
         * for sorting.
         *
         * Returns null
         * when Natural
         * Ordering is used.
         */



        // ---------------------------------------------------------
        // firstKey()
        // ---------------------------------------------------------

        System.out.println("\nfirstKey()");

        System.out.println(

                sortedMap.firstKey()

        );

        /*
         * Smallest Key.
         */


        // ---------------------------------------------------------
        // lastKey()
        // ---------------------------------------------------------

        System.out.println("\nlastKey()");

        System.out.println(

                sortedMap.lastKey()

        );

        /*
         * Largest Key.
         */


        // ---------------------------------------------------------
        // headMap()
        // ---------------------------------------------------------

        System.out.println("\nheadMap(40)");

        System.out.println(

                sortedMap.headMap(40)

        );

        /*
         * Keys

         * less than 40.
         */


        // ---------------------------------------------------------
        // tailMap()
        // ---------------------------------------------------------

        System.out.println("\ntailMap(30)");

        System.out.println(

                sortedMap.tailMap(30)

        );

        /*
         * Keys greater
         * than or equal
         * to 30.
         */


        // ---------------------------------------------------------
        // subMap()
        // ---------------------------------------------------------

        System.out.println("\nsubMap(20,50)");

        System.out.println(

                sortedMap.subMap(
                        20,
                        50
                )

        );

        /*
         * Returns

         * 20

         * 30

         * 40
         */



        /*
         * ==========================================================
         *       Methods from NavigableMap Interface
         * ==========================================================
         */


        // ---------------------------------------------------------
        // firstEntry()
        // ---------------------------------------------------------

        System.out.println("\nfirstEntry()");

        System.out.println(

                sortedMap.firstEntry()

        );

        /*
         * Returns the
         * first Map Entry.
         */


        // ---------------------------------------------------------
        // lastEntry()
        // ---------------------------------------------------------

        System.out.println("\nlastEntry()");

        System.out.println(

                sortedMap.lastEntry()

        );

        /*
         * Returns the
         * last Map Entry.
         */


        // ---------------------------------------------------------
        // higherKey()
        // ---------------------------------------------------------

        System.out.println("\nhigherKey(30)");

        System.out.println(

                sortedMap.higherKey(30)

        );

        /*
         * Strictly Greater.
         */


        // ---------------------------------------------------------
        // lowerKey()
        // ---------------------------------------------------------

        System.out.println("\nlowerKey(30)");

        System.out.println(

                sortedMap.lowerKey(30)

        );

        /*
         * Strictly Smaller.
         */


        // ---------------------------------------------------------
        // ceilingKey()
        // ---------------------------------------------------------

        System.out.println("\nceilingKey(25)");

        System.out.println(

                sortedMap.ceilingKey(25)

        );

        /*
         * Equal

         * OR

         * Greater.
         */


        // ---------------------------------------------------------
        // floorKey()
        // ---------------------------------------------------------

        System.out.println("\nfloorKey(25)");

        System.out.println(

                sortedMap.floorKey(25)

        );

        /*
         * Equal

         * OR

         * Smaller.
         */


        // ---------------------------------------------------------
        // higherEntry()
        // ---------------------------------------------------------

        System.out.println("\nhigherEntry(20)");

        System.out.println(

                sortedMap.higherEntry(20)

        );



        // ---------------------------------------------------------
        // lowerEntry()
        // ---------------------------------------------------------

        System.out.println("\nlowerEntry(30)");

        System.out.println(

                sortedMap.lowerEntry(30)

        );



        // ---------------------------------------------------------
        // ceilingEntry()
        // ---------------------------------------------------------

        System.out.println("\nceilingEntry(21)");

        System.out.println(

                sortedMap.ceilingEntry(21)

        );



        // ---------------------------------------------------------
        // floorEntry()
        // ---------------------------------------------------------

        System.out.println("\nfloorEntry(21)");

        System.out.println(

                sortedMap.floorEntry(21)

        );



        // ---------------------------------------------------------
        // navigableKeySet()
        // ---------------------------------------------------------

        System.out.println("\nnavigableKeySet()");

        System.out.println(

                sortedMap.navigableKeySet()

        );



        // ---------------------------------------------------------
        // descendingKeySet()
        // ---------------------------------------------------------

        System.out.println("\ndescendingKeySet()");

        System.out.println(

                sortedMap.descendingKeySet()

        );



        // ---------------------------------------------------------
        // descendingMap()
        // ---------------------------------------------------------

        System.out.println("\ndescendingMap()");

        System.out.println(

                sortedMap.descendingMap()

        );



        // ---------------------------------------------------------
        // pollFirstEntry()
        // ---------------------------------------------------------

        TreeMap<Integer, String> pollMap =
                new TreeMap<>(sortedMap);

        System.out.println("\npollFirstEntry()");

        System.out.println(

                pollMap.pollFirstEntry()

        );

        System.out.println(pollMap);

        /*
         * Removes and
         * returns the
         * first entry.
         */



        // ---------------------------------------------------------
        // pollLastEntry()
        // ---------------------------------------------------------

        System.out.println("\npollLastEntry()");

        System.out.println(

                pollMap.pollLastEntry()

        );

        System.out.println(pollMap);

        /*
         * Removes and
         * returns the
         * last entry.
         */



        // ---------------------------------------------------------
        // subMap(from,to)
        // inclusive
        // ---------------------------------------------------------

        System.out.println(
                "\nsubMap(20,true,50,false)"
        );

        System.out.println(

                sortedMap.subMap(
                        20,
                        true,
                        50,
                        false
                )

        );



        // ---------------------------------------------------------
        // headMap(to,inclusive)
        // ---------------------------------------------------------

        System.out.println(
                "\nheadMap(30,true)"
        );

        System.out.println(

                sortedMap.headMap(
                        30,
                        true
                )

        );



        // ---------------------------------------------------------
        // tailMap(from,inclusive)
        // ---------------------------------------------------------

        System.out.println(
                "\ntailMap(30,false)"
        );

        System.out.println(

                sortedMap.tailMap(
                        30,
                        false
                )

        );

        /*
         * ==========================================================
         *         Comparable vs Comparator
         * ==========================================================
         */

        TreeMap<Integer, String> comparableDemo =
                new TreeMap<>();

        comparableDemo.put(40, "Spring");
        comparableDemo.put(10, "Java");
        comparableDemo.put(30, "Docker");
        comparableDemo.put(20, "Python");

        System.out.println("\nComparable (Natural Ordering)");

        System.out.println(comparableDemo);

        /*
         * Comparable
         *
         * Uses compareTo()
         *
         * Ascending Order.
         */


        TreeMap<Integer, String> comparatorDemo =
                new TreeMap<>(Comparator.reverseOrder());

        comparatorDemo.put(40, "Spring");
        comparatorDemo.put(10, "Java");
        comparatorDemo.put(30, "Docker");
        comparatorDemo.put(20, "Python");

        System.out.println("\nComparator (Reverse Ordering)");

        System.out.println(comparatorDemo);

        /*
         * Comparator
         *
         * Uses compare()
         *
         * Descending Order.
         */


        /*
         * ==========================================================
         *         Custom Object Sorting (Comparator)
         * ==========================================================
         */

        TreeMap<Student, String> studentsByMarks =
                new TreeMap<>(
                        Comparator.comparingInt(Student::getMarks)
                );

        studentsByMarks.put(
                new Student(101, "Rudra", 92),
                "Java");

        studentsByMarks.put(
                new Student(102, "Haya", 85),
                "Python");

        studentsByMarks.put(
                new Student(103, "Arman", 97),
                "Spring");

        System.out.println("\nStudents Sorted by Marks");

        studentsByMarks.forEach(

                (student, course) ->

                        System.out.println(
                                student
                                        + " -> "
                                        + course
                        )

        );

        /*
         * Comparator allows
         * sorting Custom
         * Objects.
         */


        /*
         * ==========================================================
         *      Custom Object Sorting (Multiple Fields)
         * ==========================================================
         */

        TreeMap<Student, String> studentsByName =
                new TreeMap<>(

                        Comparator
                                .comparing(Student::getName)
                                .thenComparing(Student::getRollNo)

                );

        studentsByName.put(
                new Student(103, "Virat", 91),
                "React");

        studentsByName.put(
                new Student(101, "Rudra", 95),
                "Java");

        studentsByName.put(
                new Student(102, "Haya", 95),
                "Spring");

        System.out.println("\nStudents Sorted by Name");

        studentsByName.forEach(

                (student, value) ->

                        System.out.println(student)

        );



        /*
         * ==========================================================
         *          HashMap vs TreeMap
         * ==========================================================
         */

        HashMap<Integer, String> hashMap =
                new HashMap<>();

        hashMap.put(30, "Spring");
        hashMap.put(10, "Java");
        hashMap.put(20, "Python");
        hashMap.put(40, "Docker");

        TreeMap<Integer, String> treeMap =
                new TreeMap<>();

        treeMap.putAll(hashMap);

        System.out.println("\nHashMap");

        System.out.println(hashMap);

        System.out.println("\nTreeMap");

        System.out.println(treeMap);

        /*
         * HashMap
         *
         * No Ordering.
         *
         * TreeMap
         *
         * Sorted Order.
         */



        /*
         * ==========================================================
         *      LinkedHashMap vs TreeMap
         * ==========================================================
         */

        LinkedHashMap<Integer, String> linked =
                new LinkedHashMap<>();

        linked.put(30, "Spring");
        linked.put(10, "Java");
        linked.put(20, "Python");
        linked.put(40, "Docker");

        System.out.println("\nLinkedHashMap");

        System.out.println(linked);

        System.out.println("\nTreeMap");

        System.out.println(treeMap);

        /*
         * LinkedHashMap
         *
         * Insertion Order.
         *
         * TreeMap
         *
         * Sorted Order.
         */



        /*
         * ==========================================================
         *           Optimized Overrides
         * ==========================================================
         */


        // ---------------------------------------------------------
        // forEach()
        // ---------------------------------------------------------

        System.out.println("\nforEach()");

        treeMap.forEach(

                (key, value) ->

                        System.out.println(
                                key + " -> " + value
                        )

        );


        // ---------------------------------------------------------
        // replaceAll()
        // ---------------------------------------------------------

        TreeMap<Integer, String> replaceDemo =
                new TreeMap<>();

        replaceDemo.put(1, "java");
        replaceDemo.put(2, "python");

        replaceDemo.replaceAll(

                (k, v) -> v.toUpperCase()

        );

        System.out.println("\nreplaceAll()");

        System.out.println(replaceDemo);


        // ---------------------------------------------------------
        // compute()
        // ---------------------------------------------------------

        replaceDemo.compute(

                1,

                (k, v) -> v + " 21"

        );

        System.out.println("\ncompute()");

        System.out.println(replaceDemo);


        // ---------------------------------------------------------
        // computeIfAbsent()
        // ---------------------------------------------------------

        replaceDemo.computeIfAbsent(

                3,

                k -> "Spring"

        );

        System.out.println("\ncomputeIfAbsent()");

        System.out.println(replaceDemo);


        // ---------------------------------------------------------
        // computeIfPresent()
        // ---------------------------------------------------------

        replaceDemo.computeIfPresent(

                2,

                (k, v) -> v + " Framework"

        );

        System.out.println("\ncomputeIfPresent()");

        System.out.println(replaceDemo);


        // ---------------------------------------------------------
        // merge()
        // ---------------------------------------------------------

        TreeMap<String, Integer> mergeDemo =
                new TreeMap<>();

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
         *             TreeMap Characteristics
         * ==========================================================
         */

        System.out.println("\nCharacteristics");

        /*
         * ✔ Red-Black Tree
         *
         * ✔ Sorted Order
         *
         * ✔ Comparable
         *
         * ✔ Comparator
         *
         * ✔ Range Queries
         *
         * ✔ Navigation Methods
         *
         * ✔ Null Key Not Allowed
         *
         * ✔ Null Values Allowed
         *
         * ✔ Duplicate Keys Not Allowed
         *
         * ✔ O(log n)
         */



        /*
         * ==========================================================
         *          Methods Not Covered Yet
         * ==========================================================
         */

        /*
         * compare()
         *
         * rotateLeft()
         *
         * rotateRight()
         *
         * fixAfterInsertion()
         *
         * fixAfterDeletion()
         *
         * successor()
         *
         * predecessor()
         */



        /*
         * ==========================================================
         *        Methods Inherited from Object
         * ==========================================================
         */

        System.out.println("\nObject Methods");

        System.out.println(treeMap.toString());

        System.out.println(treeMap.getClass());

        System.out.println(treeMap.hashCode());

        System.out.println(treeMap.equals(comparableDemo));



        /*
         * ==========================================================
         *              Interview Notes
         * ==========================================================
         */

        /*
         * 1.
         * Uses Red-Black Tree.
         *
         * 2.
         * O(log n)
         *
         * 3.
         * Sorted Keys.
         *
         * 4.
         * Comparable
         * OR
         * Comparator.
         *
         * 5.
         * Null Keys
         * Not Allowed.
         *
         * 6.
         * Null Values
         * Allowed.
         *
         * 7.
         * Range Queries.
         *
         * 8.
         * Navigation APIs.
         *
         * 9.
         * clone()
         * creates
         * Shallow Copy.
         *
         * 10.
         * Best choice
         * for Sorted Data.
         */



        /*
         * ==========================================================
         *                 Summary
         * ==========================================================
         */

        /*
         * TreeMap
         * stores entries
         * inside a
         * Red-Black Tree.
         *
         * Automatically
         * keeps keys sorted.
         *
         * Supports
         * Comparable,
         * Comparator,
         * Range Queries,
         * Navigation APIs,
         * and
         * O(log n)
         * operations.
         */


        /*
         * ==========================================================
         *                      End
         * ==========================================================
         */

        System.out.println(
                "\nTreeMap Implementation Completed."
        );

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


class Student {

    private int rollNo;
    private String name;
    private int marks;

    Student(int rollNo,
            String name,
            int marks) {

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {

        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';

    }

}