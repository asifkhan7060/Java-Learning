//package F_Map.WeakHashMap;
//
//import java.lang.ref.WeakReference;
//import java.util.*;
//
///*
// * ==========================================================
// *              WeakHashMap Implementation
// * ==========================================================
// */
//
//public class Implementation {
//
//    public static void main(String[] args)
//            throws InterruptedException {
//
//        /*
//         * ==========================================================
//         *          Methods Inherited from Map
//         * ==========================================================
//         */
//
//        // Already implemented in Map topic
//
//        // put()
//        // putAll()
//        // get()
//        // remove()
//        // clear()
//        // containsKey()
//        // containsValue()
//        // size()
//        // isEmpty()
//        // keySet()
//        // values()
//        // entrySet()
//        // replace()
//        // replaceAll()
//        // compute()
//        // computeIfAbsent()
//        // computeIfPresent()
//        // merge()
//        // equals()
//        // hashCode()
//
//
//
//        /*
//         * ==========================================================
//         *          Basic WeakHashMap Implementation
//         * ==========================================================
//         */
//
//
//        // ---------------------------------------------------------
//        // Raw Type
//        // ---------------------------------------------------------
//
//        WeakHashMap rawMap =
//                new WeakHashMap();
//
//        rawMap.put(101, "Java");
//
//        rawMap.put(102, "Spring");
//
//        rawMap.put(103, "Docker");
//
//        System.out.println("Raw WeakHashMap");
//
//        System.out.println(rawMap);
//
//        /*
//         * Raw Types
//         *
//         * No Type Safety.
//         */
//
//
//        // ---------------------------------------------------------
//        // Generic Type
//        // ---------------------------------------------------------
//
//        WeakHashMap<Integer, String> students =
//                new WeakHashMap<>();
//
//        students.put(101, "Rudra");
//
//        students.put(102, "Haya");
//
//        students.put(103, "Arman");
//
//        System.out.println("\nWeakHashMap with Generics");
//
//        System.out.println(students);
//
//
//
//        /*
//         * ==========================================================
//         *          Duplicate Key
//         * ==========================================================
//         */
//
//        WeakHashMap<Integer, String> duplicateKey =
//                new WeakHashMap<>();
//
//        duplicateKey.put(1, "Java");
//
//        duplicateKey.put(1, "Spring");
//
//        System.out.println("\nDuplicate Key");
//
//        System.out.println(duplicateKey);
//
//        /*
//         * Existing value
//         * gets replaced.
//         */
//
//
//
//        /*
//         * ==========================================================
//         *         Duplicate Value
//         * ==========================================================
//         */
//
//        WeakHashMap<Integer, String> duplicateValue =
//                new WeakHashMap<>();
//
//        duplicateValue.put(1, "Java");
//
//        duplicateValue.put(2, "Java");
//
//        duplicateValue.put(3, "Java");
//
//        System.out.println("\nDuplicate Values");
//
//        System.out.println(duplicateValue);
//
//        /*
//         * Duplicate values
//         * are allowed.
//         */
//
//
//
//        /*
//         * ==========================================================
//         *             Null Key
//         * ==========================================================
//         */
//
//        WeakHashMap<Integer, String> nullKey =
//                new WeakHashMap<>();
//
//        nullKey.put(null, "Java");
//
//        nullKey.put(2, "Spring");
//
//        System.out.println("\nNull Key");
//
//        System.out.println(nullKey);
//
//        /*
//         * One Null Key
//         * is allowed.
//         */
//
//
//
//        /*
//         * ==========================================================
//         *            Null Values
//         * ==========================================================
//         */
//
//        WeakHashMap<Integer, String> nullValues =
//                new WeakHashMap<>();
//
//        nullValues.put(1, null);
//
//        nullValues.put(2, "Java");
//
//        nullValues.put(3, null);
//
//        System.out.println("\nNull Values");
//
//        System.out.println(nullValues);
//
//        /*
//         * Multiple Null
//         * Values allowed.
//         */
//
//
//
//        /*
//         * ==========================================================
//         *             Iterator
//         * ==========================================================
//         */
//
//        System.out.println("\nUsing Iterator");
//
//        Iterator<Map.Entry<Integer, String>> iterator =
//                students.entrySet().iterator();
//
//        while (iterator.hasNext()) {
//
//            Map.Entry<Integer, String> entry =
//                    iterator.next();
//
//            System.out.println(
//
//                    entry.getKey()
//
//                            + " -> "
//
//                            + entry.getValue()
//
//            );
//
//        }
//
//
//
//        /*
//         * ==========================================================
//         *             Enhanced For Loop
//         * ==========================================================
//         */
//
//        System.out.println("\nUsing For Each");
//
//        for (Map.Entry<Integer, String> entry
//                : students.entrySet()) {
//
//            System.out.println(
//
//                    entry.getKey()
//
//                            + " -> "
//
//                            + entry.getValue()
//
//            );
//
//        }
//
//
//
//        /*
//         * ==========================================================
//         *               Custom Class
//         * ==========================================================
//         */
//
//        WeakHashMap<Integer, Employee> employeeMap =
//                new WeakHashMap<>();
//
//        employeeMap.put(
//                101,
//                new Employee("Rudra", 90000));
//
//        employeeMap.put(
//                102,
//                new Employee("Haya", 85000));
//
//        employeeMap.put(
//                103,
//                new Employee("Arman", 95000));
//
//        System.out.println("\nCustom Object");
//
//        employeeMap.forEach(
//
//                (id, employee) ->
//
//                        System.out.println(
//
//                                id
//                                        + " -> "
//                                        + employee
//
//                        )
//
//        );
//
//
//
//        /*
//         * ==========================================================
//         *                 Constructors
//         * ==========================================================
//         */
//
//
//        // ---------------------------------------------------------
//        // WeakHashMap()
//        // ---------------------------------------------------------
//
//        WeakHashMap<Integer, String> map1 =
//                new WeakHashMap<>();
//
//        map1.put(101, "Java");
//        map1.put(102, "Spring");
//        map1.put(103, "Docker");
//
//        System.out.println("\nWeakHashMap()");
//
//        System.out.println(map1);
//
//        /*
//         * Creates an empty
//         * WeakHashMap.
//         */
//
//
//        // ---------------------------------------------------------
//        // WeakHashMap(int initialCapacity)
//        // ---------------------------------------------------------
//
//        WeakHashMap<Integer, String> map2 =
//                new WeakHashMap<>(100);
//
//        map2.put(1, "Apple");
//        map2.put(2, "Banana");
//        map2.put(3, "Mango");
//
//        System.out.println(
//                "\nWeakHashMap(int)");
//
//        System.out.println(map2);
//
//        /*
//         * Creates a map
//         * with custom
//         * initial capacity.
//         */
//
//
//        // ---------------------------------------------------------
//        // WeakHashMap(int,float)
//        // ---------------------------------------------------------
//
//        WeakHashMap<Integer, String> map3 =
//                new WeakHashMap<>(64, 0.75f);
//
//        map3.put(10, "HTML");
//        map3.put(20, "CSS");
//        map3.put(30, "JavaScript");
//
//        System.out.println(
//                "\nWeakHashMap(int,float)");
//
//        System.out.println(map3);
//
//        /*
//         * Allows custom
//         * capacity and
//         * load factor.
//         */
//
//
//        // ---------------------------------------------------------
//        // WeakHashMap(Map)
//        // ---------------------------------------------------------
//
//        HashMap<Integer, String> source =
//                new HashMap<>();
//
//        source.put(1, "Docker");
//        source.put(2, "Kubernetes");
//        source.put(3, "AWS");
//
//        WeakHashMap<Integer, String> map4 =
//                new WeakHashMap<>(source);
//
//        System.out.println(
//                "\nWeakHashMap(Map)");
//
//        System.out.println("Source");
//
//        System.out.println(source);
//
//        System.out.println("\nWeakHashMap");
//
//        System.out.println(map4);
//
//        /*
//         * Copies entries
//         * from another Map.
//         */
//
//
//        /*
//         * ==========================================================
//         *                     clone()
//         * ==========================================================
//         */
//
//        WeakHashMap<Integer, String> languageMap =
//                new WeakHashMap<>();
//
//        languageMap.put(1, "Java");
//        languageMap.put(2, "Python");
//        languageMap.put(3, "Spring");
//
//        @SuppressWarnings("unchecked")
//
//        WeakHashMap<Integer, String> cloned =
//
//                (WeakHashMap<Integer, String>)
//                        languageMap.clone();
//
//        System.out.println("\nclone()");
//
//        System.out.println("Original");
//
//        System.out.println(languageMap);
//
//        System.out.println("\nClone");
//
//        System.out.println(cloned);
//
//        cloned.put(4, "Docker");
//
//        System.out.println(
//                "\nAfter Modifying Clone");
//
//        System.out.println("Original");
//
//        System.out.println(languageMap);
//
//        System.out.println("\nClone");
//
//        System.out.println(cloned);
//
//        /*
//         * clone()
//         *
//         * Creates a
//         * Shallow Copy.
//         */
//
//
//        /*
//         * ==========================================================
//         *              Shallow Copy Demo
//         * ==========================================================
//         */
//
//        WeakHashMap<Integer, Employee> employeeCopyMap =
//                new WeakHashMap<>();
//
//        employeeCopyMap.put(
//                101,
//                new Employee("Rudra", 90000));
//
//        employeeCopyMap.put(
//                102,
//                new Employee("Haya", 85000));
//
//        @SuppressWarnings("unchecked")
//
//        WeakHashMap<Integer, Employee> copied =
//
//                (WeakHashMap<Integer, Employee>)
//                        employeeCopyMap.clone();
//
//        System.out.println("\nShallow Copy");
//
//        System.out.println("Original");
//
//        System.out.println(employeeCopyMap);
//
//        System.out.println("\nCopied");
//
//        System.out.println(copied);
//
//        copied
//                .get(101)
//                .name = "Virat";
//
//        System.out.println(
//                "\nAfter Modifying Object");
//
//        System.out.println("Original");
//
//        System.out.println(employeeCopyMap);
//
//        System.out.println("\nCopied");
//
//        System.out.println(copied);
//
//        /*
//         * Employee object
//         * is shared.
//         */
//
//
//        /*
//         * ==========================================================
//         *             Strong Reference Demo
//         * ==========================================================
//         */
//
//        Employee strongEmployee =
//                new Employee("Strong", 100000);
//
//        WeakHashMap<Employee, String> strongMap =
//                new WeakHashMap<>();
//
//        strongMap.put(
//                strongEmployee,
//                "Active");
//
//        System.out.println(
//                "\nBefore GC (Strong Reference)");
//
//        System.out.println(strongMap);
//
//        System.gc();
//
//        Thread.sleep(1000);
//
//        System.out.println(
//                "\nAfter GC (Strong Reference)");
//
//        System.out.println(strongMap);
//
//        /*
//         * Entry remains
//         * because a Strong
//         * Reference still
//         * exists.
//         */
//
//
//        /*
//         * ==========================================================
//         *              Weak Reference Demo
//         * ==========================================================
//         */
//
//        Employee weakEmployee =
//                new Employee("Weak", 85000);
//
//        WeakHashMap<Employee, String> weakMap =
//                new WeakHashMap<>();
//
//        weakMap.put(
//                weakEmployee,
//                "Temporary");
//
//        System.out.println(
//                "\nBefore Removing Reference");
//
//        System.out.println(weakMap);
//
//        weakEmployee = null;
//
//        System.gc();
//
//        Thread.sleep(1000);
//
//        System.out.println(
//                "\nAfter GC");
//
//        System.out.println(weakMap);
//
//        /*
//         * Entry may disappear
//         * because no Strong
//         * Reference exists.
//         */
//
//
//        /*
//         * ==========================================================
//         *              WeakReference API
//         * ==========================================================
//         */
//
//        Employee employee =
//                new Employee("Reference", 92000);
//
//        WeakReference<Employee> reference =
//                new WeakReference<>(employee);
//
//        System.out.println(
//                "\nWeakReference");
//
//        System.out.println(reference.get());
//
//        employee = null;
//
//        System.gc();
//
//        Thread.sleep(1000);
//
//        System.out.println(
//                "\nAfter GC");
//
//        System.out.println(reference.get());
//
//        /*
//         * get()
//         *
//         * Returns object
//         * if alive,
//         *
//         * otherwise null.
//         */
//
//        /*
//         * ==========================================================
//         *              Memory Leak Prevention
//         * ==========================================================
//         */
//
//        WeakHashMap<Employee, String> cache =
//                new WeakHashMap<>();
//
//        Employee cacheEmployee =
//                new Employee("Cache User", 75000);
//
//        cache.put(cacheEmployee, "Cached Object");
//
//        System.out.println("\nCache Before GC");
//
//        System.out.println(cache);
//
//        cacheEmployee = null;
//
//        System.gc();
//
//        Thread.sleep(1000);
//
//        System.out.println("\nCache After GC");
//
//        System.out.println(cache);
//
//        /*
//         * WeakHashMap
//         * automatically
//         * removes unused
//         * cache entries.
//         */
//
//
//
//        /*
//         * ==========================================================
//         *            HashMap vs WeakHashMap
//         * ==========================================================
//         */
//
//        Employee hashEmployee =
//                new Employee("HashMap User", 90000);
//
//        HashMap<Employee, String> hashMap =
//                new HashMap<>();
//
//        hashMap.put(hashEmployee, "Permanent");
//
//        Employee weakEmployee2 =
//                new Employee("Weak User", 85000);
//
//        WeakHashMap<Employee, String> weakHashMap =
//                new WeakHashMap<>();
//
//        weakHashMap.put(
//                weakEmployee2,
//                "Temporary"
//        );
//
//        System.out.println("\nBefore GC");
//
//        System.out.println("HashMap");
//
//        System.out.println(hashMap);
//
//        System.out.println("WeakHashMap");
//
//        System.out.println(weakHashMap);
//
//        weakEmployee2 = null;
//
//        System.gc();
//
//        Thread.sleep(1000);
//
//        System.out.println("\nAfter GC");
//
//        System.out.println("HashMap");
//
//        System.out.println(hashMap);
//
//        System.out.println("WeakHashMap");
//
//        System.out.println(weakHashMap);
//
//        /*
//         * HashMap keeps
//         * objects alive.
//         *
//         * WeakHashMap
//         * may remove
//         * entries.
//         */
//
//
//
//        /*
//         * ==========================================================
//         *              Optimized Overrides
//         * ==========================================================
//         */
//
//
//        // ---------------------------------------------------------
//        // forEach()
//        // ---------------------------------------------------------
//
//        System.out.println("\nforEach()");
//
//        students.forEach(
//
//                (key, value) ->
//
//                        System.out.println(
//
//                                key
//                                        + " -> "
//                                        + value
//
//                        )
//
//        );
//
//
//        // ---------------------------------------------------------
//        // replaceAll()
//        // ---------------------------------------------------------
//
//        WeakHashMap<Integer, String> replaceDemo =
//                new WeakHashMap<>();
//
//        replaceDemo.put(1, "java");
//        replaceDemo.put(2, "python");
//
//        replaceDemo.replaceAll(
//
//                (k, v) ->
//
//                        v.toUpperCase()
//
//        );
//
//        System.out.println("\nreplaceAll()");
//
//        System.out.println(replaceDemo);
//
//
//
//        // ---------------------------------------------------------
//        // compute()
//        // ---------------------------------------------------------
//
//        replaceDemo.compute(
//
//                1,
//
//                (k, v) ->
//
//                        v + " 21"
//
//        );
//
//        System.out.println("\ncompute()");
//
//        System.out.println(replaceDemo);
//
//
//
//        // ---------------------------------------------------------
//        // computeIfAbsent()
//        // ---------------------------------------------------------
//
//        replaceDemo.computeIfAbsent(
//
//                3,
//
//                k -> "Spring"
//
//        );
//
//        System.out.println("\ncomputeIfAbsent()");
//
//        System.out.println(replaceDemo);
//
//
//
//        // ---------------------------------------------------------
//        // computeIfPresent()
//        // ---------------------------------------------------------
//
//        replaceDemo.computeIfPresent(
//
//                2,
//
//                (k, v) ->
//
//                        v + " Framework"
//
//        );
//
//        System.out.println("\ncomputeIfPresent()");
//
//        System.out.println(replaceDemo);
//
//
//
//        // ---------------------------------------------------------
//        // merge()
//        // ---------------------------------------------------------
//
//        WeakHashMap<String, Integer> mergeDemo =
//                new WeakHashMap<>();
//
//        mergeDemo.put("Java", 10);
//
//        mergeDemo.merge(
//
//                "Java",
//
//                5,
//
//                Integer::sum
//
//        );
//
//        mergeDemo.merge(
//
//                "Python",
//
//                20,
//
//                Integer::sum
//
//        );
//
//        System.out.println("\nmerge()");
//
//        System.out.println(mergeDemo);
//
//
//
//        /*
//         * ==========================================================
//         *           WeakHashMap Characteristics
//         * ==========================================================
//         */
//
//        System.out.println("\nCharacteristics");
//
//        /*
//         * ✔ Hash Table
//         *
//         * ✔ Weak References
//         *
//         * ✔ Automatic Cleanup
//         *
//         * ✔ ReferenceQueue
//         *
//         * ✔ Garbage Collector
//         *
//         * ✔ One Null Key
//         *
//         * ✔ Multiple Null Values
//         *
//         * ✔ Not Thread Safe
//         *
//         * ✔ Average O(1)
//         */
//
//
//
//        /*
//         * ==========================================================
//         *          Methods Not Covered Yet
//         * ==========================================================
//         */
//
//        /*
//         * expungeStaleEntries()
//         *
//         * getTable()
//         *
//         * hash()
//         *
//         * resize()
//         *
//         * transfer()
//         *
//         * maskNull()
//         *
//         * unmaskNull()
//         */
//
//
//
//        /*
//         * ==========================================================
//         *      Methods Inherited from Object
//         * ==========================================================
//         */
//
//        System.out.println("\nObject Methods");
//
//        System.out.println(students.toString());
//
//        System.out.println(students.getClass());
//
//        System.out.println(students.hashCode());
//
//        System.out.println(students.equals(map1));
//
//
//
//        /*
//         * ==========================================================
//         *              Interview Notes
//         * ==========================================================
//         */
//
//        /*
//         * 1.
//         * Uses Hash Table.
//         *
//         * 2.
//         * Stores Weak Keys.
//         *
//         * 3.
//         * GC removes entries.
//         *
//         * 4.
//         * Uses ReferenceQueue.
//         *
//         * 5.
//         * One Null Key.
//         *
//         * 6.
//         * Multiple Null Values.
//         *
//         * 7.
//         * clone()
//         * creates
//         * Shallow Copy.
//         *
//         * 8.
//         * Prevents Memory Leaks.
//         *
//         * 9.
//         * Average O(1).
//         *
//         * 10.
//         * Not Thread Safe.
//         */
//
//
//
//        /*
//         * ==========================================================
//         *                 Summary
//         * ==========================================================
//         */
//
//        /*
//         * WeakHashMap
//         * is a special
//         * Hash Table
//         * implementation
//         * that stores
//         * Weak References
//         * as keys.
//         *
//         * It works with
//         * the JVM Garbage
//         * Collector to
//         * automatically
//         * remove stale
//         * entries.
//         *
//         * Best suited for
//         * memory-sensitive
//         * caches and
//         * temporary metadata.
//         */
//
//
//
//        /*
//         * ==========================================================
//         *                      End
//         * ==========================================================
//         */
//
//        System.out.println(
//                "\nWeakHashMap Implementation Completed."
//        );
//
//    }
//
//}
//
//
//
///*
// * ==========================================================
// *                  Employee Class
// * ==========================================================
// */
//
//class Employee {
//
//    String name;
//
//    double salary;
//
//    Employee(
//            String name,
//            double salary
//    ) {
//
//        this.name = name;
//        this.salary = salary;
//
//    }
//
//    @Override
//    public String toString() {
//
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//
//    }
//
//}