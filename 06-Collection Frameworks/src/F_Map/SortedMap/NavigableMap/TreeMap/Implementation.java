package F_Map.SortedMap.NavigableMap.TreeMap;


import java.util.*;

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
          /*
         * ==========================================================
         *           Methods Inherited from SortedMap
         * ==========================================================
         */
        /*

                firstKey()
                lastKey()

                headMap()
                tailMap()

                subMap()

                comparator()

        /*
         * ==========================================================
         *           Methods Inherited from Navigable Map
         * ==========================================================
         */
        /*
                lowerKey()
                floorKey()
                ceilingKey()
                higherKey()

                lowerEntry()
                floorEntry()
                ceilingEntry()
                higherEntry()

                firstEntry()
                lastEntry()

                pollFirstEntry()
                pollLastEntry()

                descendingMap()

                navigableKeySet()
                descendingKeySet()

                subMap(..., boolean)

                headMap(..., boolean)

                tailMap(..., boolean)
         */

        /*
         * ==========================================================
         *              PART 1 : TREEMAP BASICS
         * ==========================================================
         */

        // TreeMap implements NavigableMap
        // Internally uses a Red-Black Tree.
        // Keys are stored in Sorted Order.

        // ==========================================================
        // Creating TreeMap
        // ==========================================================

        TreeMap<Integer, String> map1 = new TreeMap<>();

        map1.put(101, "Alice");
        map1.put(102, "Bob");
        map1.put(103, "Charlie");

        System.out.println("TreeMap : " + map1);

        // ==========================================================
        // Raw Type (Not Recommended)
        // ==========================================================

        TreeMap rawMap = new TreeMap();

        // NOTE : Key datatypes should be same / Values can be of different types.
        rawMap.put(10, "Java"); // if keys has different datatypes like 10,true,"Rahul" then it throws error
        rawMap.put(20, 100);
        rawMap.put(30, true);
        rawMap.put(40, 99.99);

        System.out.println("\nRaw Type : " + rawMap);

        // ==========================================================
        // Generic Type (Recommended)
        // ==========================================================

        // Provides type safety.
        // Prevents invalid data insertion.

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println("\nGeneric Type : " + students);

        // students.put("A", "David"); // Compile-time Error

        // ==========================================================
        // Duplicate Keys
        // ==========================================================

        // Duplicate keys are NOT allowed.
        // The latest value replaces the previous one.

        System.out.println("\nBefore Duplicate Key : " + students);

        students.put(101, "David");

        System.out.println("After Duplicate Key : " + students);

        // ==========================================================
        // Duplicate Values
        // ==========================================================

        // Duplicate values are allowed.

        System.out.println("\nBefore Duplicate Value : " + students);

        students.put(104, "Bob");

        System.out.println("After Duplicate Value : " + students);

        // ==========================================================
        // Null Key
        // ==========================================================

        // Null keys are NOT allowed.

        // students.put(null, "Alex"); // NullPointerException

        // ==========================================================
        // Null Values
        // ==========================================================

        // Null values are allowed.

        students.put(105, null);

        System.out.println("\nAfter Null Value : " + students);

        // ==========================================================
        // Custom Objects
        // ==========================================================

        // TreeMap cannot sort custom objects automatically.
        // Comparable or Comparator is required.

        // TreeMap<Employee, String> employees = new TreeMap<>();

        // Throws:
        // ClassCastException
        //
        // This will be covered in Comparable & Comparator.

        /*
         * ==========================================================
         *          PART 2 : CONSTRUCTORS & ORDERING
         * ==========================================================
         */

        // ==========================================================
        // TreeMap()
        // ==========================================================

        // Creates an empty TreeMap.
        // Keys are sorted using Natural Ordering.

        TreeMap<Integer, String> treeMap1 = new TreeMap<>();

        treeMap1.put(30, "C");
        treeMap1.put(10, "A");
        treeMap1.put(20, "B");

        System.out.println("\nTreeMap() : " + treeMap1);

        // ==========================================================
        // TreeMap(Map)
        // ==========================================================

        // Creates a TreeMap from another Map.
        // Keys become automatically sorted.

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(50, "E");
        hashMap.put(10, "A");
        hashMap.put(30, "C");

        TreeMap<Integer, String> treeMap2 =
                new TreeMap<>(hashMap);

        System.out.println("\nTreeMap(Map) : " + treeMap2); // we get in sorted manner by natural order defaults

        // ==========================================================
        // TreeMap(SortedMap)
        // ==========================================================

        // Creates a TreeMap from another SortedMap.
        // Existing sorting order is preserved.

        SortedMap<Integer, String> sortedMap =
                new TreeMap<>();

        sortedMap.put(40, "D");
        sortedMap.put(20, "B");
        sortedMap.put(10, "A");

        TreeMap<Integer, String> treeMap3 =
                new TreeMap<>(sortedMap);

        System.out.println("\nTreeMap(SortedMap) : " + treeMap3); // if sorted map is sorted via comparator then we get here as same ignoring natural ordering

        // ==========================================================
        // TreeMap(Comparator)
        // ==========================================================

        // Uses a custom Comparator for key ordering.

        TreeMap<Integer, String> reverseMap =
                new TreeMap<>(Comparator.reverseOrder());

        reverseMap.put(30, "C");
        reverseMap.put(10, "A");
        reverseMap.put(20, "B");

        System.out.println("\nTreeMap(Comparator) : " + reverseMap);

        // ==========================================================
        // Natural Ordering
        // ==========================================================

        // Default sorting order.
        // Uses Comparable implementation of keys.

        TreeMap<Integer, String> natural =
                new TreeMap<>();

        natural.put(5, "Five");
        natural.put(1, "One");
        natural.put(3, "Three");

        System.out.println("\nNatural Ordering : " + natural);

        // Output
        // {1=One, 3=Three, 5=Five}

        // ==========================================================
        // Custom Comparator
        // ==========================================================

        // Sorts keys using custom logic.

        /*
        s1.compareTo(s2) - defaults
                ↓
        Ascending Order (A → Z)

        s2.compareTo(s1)
                ↓
        Descending Order (Z → A)

        Comparator.reverseOrder()
                ↓
        Same as s2.compareTo(s1)
         */

        TreeMap<String, Integer> custom = new TreeMap<>((s1, s2) -> s2.compareTo(s1));

        custom.put("Banana", 20);
        custom.put("Apple", 10);
        custom.put("Mango", 30);

        System.out.println("\nCustom Comparator : " + custom);

        /*
         * ==========================================================
         *      PART 3 : SORTEDMAP & NAVIGABLEMAP METHODS
         * ==========================================================
         */

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");

        System.out.println("\nOriginal Map : " + map);

        // ==========================================================
        // comparator()
        // ==========================================================

        // Returns the Comparator used for sorting.
        // Returns null if Natural Ordering is used.

        // Natural is used
        System.out.println("\nComparator : " + map.comparator());

        // Custom Comparator
        TreeMap<Integer, String> reverse =
                new TreeMap<>(Comparator.reverseOrder());

        System.out.println("Custom Comparator : "
                + reverse.comparator());

        // Output:
        // java.util.Collections$ReverseComparator...

        // ==========================================================
        // firstKey()
        // ==========================================================

        // Returns the smallest key.

        System.out.println("\nfirstKey() : " + map.firstKey());

        // ==========================================================
        // lastKey()
        // ==========================================================

        // Returns the largest key.

        System.out.println("lastKey() : " + map.lastKey());

        // ==========================================================
        // firstEntry()
        // ==========================================================

        // Returns the first key-value pair.

        System.out.println("\nfirstEntry() : " + map.firstEntry());

        // ==========================================================
        // lastEntry()
        // ==========================================================

        // Returns the last key-value pair.

        System.out.println("lastEntry() : " + map.lastEntry());

        // ==========================================================
        // headMap()
        // ==========================================================

        // Returns keys less than the given key.

        System.out.println("\nheadMap(30) : " + map.headMap(30));

        // Inclusive Version

        System.out.println("headMap(30, true) : " + map.headMap(30, true));

        // ==========================================================
        // tailMap()
        // ==========================================================

        // Returns keys greater than or equal to the given key.

        System.out.println("\ntailMap(30) : " + map.tailMap(30));

        // Inclusive / Exclusive Version

        System.out.println("tailMap(30, false) : " + map.tailMap(30, false));

        // ==========================================================
        // subMap()
        // ==========================================================

        // Returns keys between two keys.

        System.out.println("\nsubMap(20, 40) : " + map.subMap(20, 40));

        // Inclusive / Exclusive Version

        System.out.println("subMap(20, true, 40, true) : "
                + map.subMap(20, true, 40, true));

        // ==========================================================
        // lowerKey()
        // ==========================================================

        // Returns the greatest key strictly less than the given key.

                System.out.println("\nlowerKey(30) : " + map.lowerKey(30));

        // ==========================================================
        // floorKey()
        // ==========================================================

        // Returns the greatest key less than or equal to the given key.

                System.out.println("floorKey(30) : " + map.floorKey(30));

        // ==========================================================
        // ceilingKey()
        // ==========================================================

        // Returns the smallest key greater than or equal to the given key.

        System.out.println("ceilingKey(25) : " + map.ceilingKey(25));

        // ==========================================================
        // higherKey()
        // ==========================================================

        // Returns the smallest key strictly greater than the given key.

        System.out.println("higherKey(30) : " + map.higherKey(30));

        // ==========================================================
        // lowerEntry()
        // ==========================================================

        // Returns the entry before the given key.

        System.out.println("\nlowerEntry(30) : " + map.lowerEntry(30));

        // ==========================================================
        // floorEntry()
        // ==========================================================

        // Returns the entry less than or equal to the given key.

        System.out.println("floorEntry(30) : " + map.floorEntry(30));

        // ==========================================================
        // ceilingEntry()
        // ==========================================================

        // Returns the entry greater than or equal to the given key.

        System.out.println("ceilingEntry(25) : " + map.ceilingEntry(25));

        // ==========================================================
        // higherEntry()
        // ==========================================================

        // Returns the entry after the given key.

        System.out.println("higherEntry(30) : " + map.higherEntry(30));

        // ==========================================================
        // pollFirstEntry()
        // ==========================================================

        // Removes and returns the first entry.

        System.out.println("\npollFirstEntry() : " + map.pollFirstEntry());

        System.out.println("After pollFirstEntry() : " + map);

        // ==========================================================
        // pollLastEntry()
        // ==========================================================

        // Removes and returns the last entry.

        System.out.println("\npollLastEntry() : " + map.pollLastEntry());

        System.out.println("After pollLastEntry() : " + map);

        // ==========================================================
        // descendingMap()
        // ==========================================================

        // Returns the reverse order view of the map.

        System.out.println("\ndescendingMap() : " + map.descendingMap());

        // ==========================================================
        // navigableKeySet()
        // ==========================================================

        // Returns all keys in ascending order.

        System.out.println("\nnavigableKeySet() : " + map.navigableKeySet());

        // ==========================================================
        // descendingKeySet()
        // ==========================================================

        // Returns all keys in descending order.

        System.out.println("descendingKeySet() : " + map.descendingKeySet());

        /*
         * ==========================================================
         *      PART 4 : TRAVERSAL & ADVANCED FEATURES
         * ==========================================================
         */

        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        employeeMap.put(10, "A");
        employeeMap.put(20, "B");
        employeeMap.put(30, "C");
        employeeMap.put(40, "D");
        employeeMap.put(50, "E");

        // ==========================================================
        // entrySet()
        // ==========================================================

        // Returns all key-value pairs.

        System.out.println("\nUsing entrySet()");

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // ==========================================================
        // keySet()
        // ==========================================================

        // Returns all keys.

        System.out.println("\nUsing keySet()");

        for (Integer key : employeeMap.keySet()) {
            System.out.println(key+"-"+employeeMap.get(key));
        }

        // ==========================================================
        // values()
        // ==========================================================

        // Returns all values.

        System.out.println("\nUsing values()");

        for (String value : employeeMap.values()) {
            System.out.println(value);
        }

        // ==========================================================
        // Iterator
        // ==========================================================

        // Traverses key-value pairs using Iterator.

        System.out.println("\nUsing Iterator");

        Iterator<Map.Entry<Integer, String>> iterator =
                employeeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ==========================================================
        // forEach()
        // ==========================================================

        // Traverses using Lambda Expression.

        System.out.println("\nUsing forEach()");

        employeeMap.forEach((key, value) ->
                System.out.println(key + " = " + value));

        // ==========================================================
        // Stream API
        // ==========================================================

        // Traverses using Stream.

        System.out.println("\nUsing Stream API");

        employeeMap.entrySet()
                .stream()
                .forEach(System.out::println);

        // ==========================================================
        // clone()
        // ==========================================================

        // Creates a shallow copy.

        TreeMap<Integer, String> clonedMap =
                (TreeMap<Integer, String>) employeeMap.clone();

        System.out.println("\nclone() : " + clonedMap);

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


