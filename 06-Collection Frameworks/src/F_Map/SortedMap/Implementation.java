package F_Map.SortedMap.NavigableMap_TreeMap;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        // =====================================================
        // Map Methods Available in NavigableMap
        // =====================================================

        /*
            Since NavigableMap extends SortedMap,
            all Map and SortedMap methods
            are available.

            Already implemented in

            Map

                put()
                putAll()
                putIfAbsent()

                get()
                getOrDefault()

                remove()
                replace()

                containsKey()
                containsValue()

                keySet()
                values()
                entrySet()

                compute()
                computeIfAbsent()
                computeIfPresent()

                merge()

                forEach()

                size()
                isEmpty()

                clear()

            SortedMap

                firstKey()
                lastKey()

                headMap()
                tailMap()

                subMap()

                comparator()

            NavigableMap introduces

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

        // =====================================================
        // NavigableMap Methods Demonstration
        // =====================================================

        NavigableMap<Integer, String> map =
                new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");

        System.out.println("Original NavigableMap : "
                + map);

        // =====================================================
        // lowerKey()
        // Returns greatest key strictly less than given key.
        // =====================================================

        System.out.println("\nlowerKey()");

        System.out.println("Map : " + map);

        System.out.println(
                "lowerKey(30) : "
                        + map.lowerKey(30));

        // =====================================================
        // floorKey()
        // Returns greatest key less than or equal to key.
        // =====================================================

        System.out.println("\nfloorKey()");

        System.out.println(
                "floorKey(30) : "
                        + map.floorKey(30));

        System.out.println(
                "floorKey(35) : "
                        + map.floorKey(35));

        // =====================================================
        // ceilingKey()
        // Returns smallest key greater than or equal to key.
        // =====================================================

        System.out.println("\nceilingKey()");

        System.out.println(
                "ceilingKey(30) : "
                        + map.ceilingKey(30));

        System.out.println(
                "ceilingKey(35) : "
                        + map.ceilingKey(35));

        // =====================================================
        // higherKey()
        // Returns smallest key strictly greater than key.
        // =====================================================

        System.out.println("\nhigherKey()");

        System.out.println(
                "higherKey(30) : "
                        + map.higherKey(30));

        // =====================================================
        // lowerEntry()
        // Returns entry strictly lower than key.
        // =====================================================

        System.out.println("\nlowerEntry()");

        System.out.println(
                "lowerEntry(30) : "
                        + map.lowerEntry(30));

        // =====================================================
        // floorEntry()
        // Returns entry less than or equal to key.
        // =====================================================

        System.out.println("\nfloorEntry()");

        System.out.println(
                "floorEntry(30) : "
                        + map.floorEntry(30));

        System.out.println(
                "floorEntry(35) : "
                        + map.floorEntry(35));

        // =====================================================
        // ceilingEntry()
        // Returns entry greater than or equal to key.
        // =====================================================

        System.out.println("\nceilingEntry()");

        System.out.println(
                "ceilingEntry(30) : "
                        + map.ceilingEntry(30));

        System.out.println(
                "ceilingEntry(35) : "
                        + map.ceilingEntry(35));

        // =====================================================
        // higherEntry()
        // Returns entry strictly greater than key.
        // =====================================================

        System.out.println("\nhigherEntry()");

        System.out.println(
                "higherEntry(30) : "
                        + map.higherEntry(30));

        // =====================================================
        // firstEntry()
        // Returns first entry in the map.
        // =====================================================

        System.out.println("\nfirstEntry()");

        System.out.println(
                "First Entry : "
                        + map.firstEntry());

        // =====================================================
        // lastEntry()
        // Returns last entry in the map.
        // =====================================================

        System.out.println("\nlastEntry()");

        System.out.println(
                "Last Entry : "
                        + map.lastEntry());

        // =====================================================
        // pollFirstEntry()
        // Removes and returns the first entry.
        // =====================================================

        System.out.println("\npollFirstEntry()");

        NavigableMap<Integer, String> pollFirstMap =
                new TreeMap<>(map);

        System.out.println("Before pollFirstEntry() : "
                + pollFirstMap);

        System.out.println(
                "Removed Entry : "
                        + pollFirstMap.pollFirstEntry());

        System.out.println("After pollFirstEntry() : "
                + pollFirstMap);

        // =====================================================
        // pollLastEntry()
        // Removes and returns the last entry.
        // =====================================================

        System.out.println("\npollLastEntry()");

        NavigableMap<Integer, String> pollLastMap =
                new TreeMap<>(map);

        System.out.println("Before pollLastEntry() : "
                + pollLastMap);

        System.out.println(
                "Removed Entry : "
                        + pollLastMap.pollLastEntry());

        System.out.println("After pollLastEntry() : "
                + pollLastMap);

        // =====================================================
        // descendingMap()
        // Returns reverse order view of the map.
        // =====================================================

        System.out.println("\ndescendingMap()");

        NavigableMap<Integer, String> descendingMap =
                map.descendingMap();

        System.out.println(
                "Descending Map : "
                        + descendingMap);

        // =====================================================
        // navigableKeySet()
        // Returns keys in ascending order.
        // =====================================================

        System.out.println("\nnavigableKeySet()");

        NavigableSet<Integer> ascendingKeys =
                map.navigableKeySet();

        System.out.println(
                "Ascending Keys : "
                        + ascendingKeys);

        // =====================================================
        // descendingKeySet()
        // Returns keys in descending order.
        // =====================================================

        System.out.println("\ndescendingKeySet()");

        NavigableSet<Integer> descendingKeys =
                map.descendingKeySet();

        System.out.println(
                "Descending Keys : "
                        + descendingKeys);

        // =====================================================
        // subMap(fromKey, boolean,
        //        toKey, boolean)
        // Returns portion of map with
        // inclusive/exclusive control.
        // =====================================================

        System.out.println(
                "\nsubMap(fromKey, boolean, toKey, boolean)");

        NavigableMap<Integer, String> subMap =
                map.subMap(
                        20,
                        true,
                        40,
                        false);

        System.out.println(
                "subMap(20, true, 40, false) : "
                        + subMap);

        // =====================================================
        // headMap(toKey, boolean)
        // Returns keys before toKey with
        // inclusive/exclusive control.
        // =====================================================

        System.out.println(
                "\nheadMap(toKey, boolean)");

        NavigableMap<Integer, String> headMap =
                map.headMap(
                        30,
                        true);

        System.out.println(
                "headMap(30, true) : "
                        + headMap);

        // =====================================================
        // tailMap(fromKey, boolean)
        // Returns keys after fromKey with
        // inclusive/exclusive control.
        // =====================================================

        System.out.println(
                "\ntailMap(fromKey, boolean)");

        NavigableMap<Integer, String> tailMap =
                map.tailMap(
                        30,
                        false);

        System.out.println(
                "tailMap(30, false) : "
                        + tailMap);

        // =====================================================
        // Ways to Traverse a NavigableMap
        // =====================================================

        NavigableMap<Integer, String> traverseMap =
                new TreeMap<>();

        traverseMap.put(101, "Java");
        traverseMap.put(102, "Python");
        traverseMap.put(103, "C++");
        traverseMap.put(104, "JavaScript");
        traverseMap.put(105, "Go");

        System.out.println("\nTraversal NavigableMap : "
                + traverseMap);

        // =====================================================
        // Using entrySet()
        // =====================================================

        System.out.println("\nUsing entrySet()");

        for (Map.Entry<Integer, String> entry :
                traverseMap.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue());

        }

        // =====================================================
        // Using keySet()
        // =====================================================

        System.out.println("\nUsing keySet()");

        for (Integer key :
                traverseMap.keySet()) {

            System.out.println(
                    key + " -> "
                            + traverseMap.get(key));

        }

        // =====================================================
        // Using values()
        // =====================================================

        System.out.println("\nUsing values()");

        for (String value :
                traverseMap.values()) {

            System.out.println(value);

        }

        // =====================================================
        // Using Iterator
        // =====================================================

        System.out.println("\nUsing Iterator");

        Iterator<Map.Entry<Integer, String>> iterator =
                traverseMap.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry =
                    iterator.next();

            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue());

        }

        // =====================================================
        // Using Enhanced For Loop
        // =====================================================

        System.out.println("\nUsing Enhanced For Loop");

        for (Map.Entry<Integer, String> entry :
                traverseMap.entrySet()) {

            System.out.println(entry);

        }

        // =====================================================
        // Using forEach()
        // =====================================================

        System.out.println("\nUsing forEach()");

        traverseMap.forEach(
                (key, value) ->
                        System.out.println(
                                key + " -> " + value));

        // =====================================================
        // Using Stream API
        // =====================================================

        System.out.println("\nUsing Stream API");

        traverseMap.entrySet()
                .stream()
                .forEach(System.out::println);

        // =====================================================
        // TreeMap Constructors
        // =====================================================

        // -----------------------------------------------------
        // TreeMap()
        // Creates an empty TreeMap with natural ordering.
        // -----------------------------------------------------

        System.out.println("\nTreeMap()");

        TreeMap<Integer, String> treeMap1 =
                new TreeMap<>();

        treeMap1.put(30, "C");
        treeMap1.put(10, "A");
        treeMap1.put(20, "B");

        System.out.println(treeMap1);

        // -----------------------------------------------------
        // TreeMap(Comparator)
        // Creates TreeMap using custom ordering.
        // -----------------------------------------------------

        System.out.println("\nTreeMap(Comparator)");

        TreeMap<Integer, String> treeMap2 =
                new TreeMap<>(
                        Collections.reverseOrder());

        treeMap2.put(30, "C");
        treeMap2.put(10, "A");
        treeMap2.put(20, "B");

        System.out.println(treeMap2);

        // -----------------------------------------------------
        // TreeMap(Map)
        // Creates TreeMap from another Map.
        // -----------------------------------------------------

        System.out.println("\nTreeMap(Map)");

        Map<Integer, String> hashMap =
                new HashMap<>();

        hashMap.put(5, "Five");
        hashMap.put(1, "One");
        hashMap.put(3, "Three");

        TreeMap<Integer, String> treeMap3 =
                new TreeMap<>(hashMap);

        System.out.println(treeMap3);

        // -----------------------------------------------------
        // TreeMap(SortedMap)
        // Creates TreeMap from another SortedMap.
        // -----------------------------------------------------

        System.out.println("\nTreeMap(SortedMap)");

        SortedMap<Integer, String> sortedMap =
                new TreeMap<>();

        sortedMap.put(2, "Two");
        sortedMap.put(4, "Four");
        sortedMap.put(6, "Six");

        TreeMap<Integer, String> treeMap4 =
                new TreeMap<>(sortedMap);

        System.out.println(treeMap4);

        // =====================================================
        // TreeMap Features
        // =====================================================

        // -----------------------------------------------------
        // Natural Ordering
        // Keys are automatically sorted in ascending order.
        // -----------------------------------------------------

        System.out.println("\nNatural Ordering");

        TreeMap<Integer, String> naturalMap =
                new TreeMap<>();

        naturalMap.put(50, "E");
        naturalMap.put(10, "A");
        naturalMap.put(30, "C");
        naturalMap.put(20, "B");
        naturalMap.put(40, "D");

        System.out.println(
                "Natural Order : "
                        + naturalMap);

        // -----------------------------------------------------
        // Descending Order
        // Using reverseOrder() comparator.
        // -----------------------------------------------------

        System.out.println("\nDescending Order");

        TreeMap<Integer, String> descendingOrderMap =
                new TreeMap<>(
                        Collections.reverseOrder());

        descendingOrderMap.put(50, "E");
        descendingOrderMap.put(10, "A");
        descendingOrderMap.put(30, "C");
        descendingOrderMap.put(20, "B");
        descendingOrderMap.put(40, "D");

        System.out.println(
                "Descending Order : "
                        + descendingOrderMap);

        // -----------------------------------------------------
        // Custom Comparator
        // Sorting according to custom logic.
        // -----------------------------------------------------

        System.out.println("\nCustom Comparator");

        Comparator<Integer> evenOddComparator =
                (a, b) -> {

                    if ((a % 2) != (b % 2))
                        return Integer.compare(
                                a % 2,
                                b % 2);

                    return Integer.compare(a, b);
                };

        TreeMap<Integer, String> customMap =
                new TreeMap<>(evenOddComparator);

        customMap.put(7, "Seven");
        customMap.put(2, "Two");
        customMap.put(9, "Nine");
        customMap.put(4, "Four");
        customMap.put(1, "One");

        System.out.println(
                "Custom Comparator : "
                        + customMap);

        // -----------------------------------------------------
        // Duplicate Key Replacement
        // Existing value is replaced.
        // -----------------------------------------------------

        System.out.println("\nDuplicate Key");

        TreeMap<Integer, String> duplicateMap =
                new TreeMap<>();

        duplicateMap.put(1, "Java");

        duplicateMap.put(1, "Spring");

        System.out.println(
                "Duplicate Key Result : "
                        + duplicateMap);

        // -----------------------------------------------------
        // Null Key
        // TreeMap does NOT allow null keys.
        // -----------------------------------------------------

        System.out.println("\nNull Key");

        TreeMap<Integer, String> nullKeyMap =
                new TreeMap<>();

        try {

            nullKeyMap.put(
                    null,
                    "Java");

        } catch (NullPointerException e) {

            System.out.println(
                    "Exception : "
                            + e);

        }

        // -----------------------------------------------------
        // Null Value
        // TreeMap allows multiple null values.
        // -----------------------------------------------------

        System.out.println("\nNull Value");

        TreeMap<Integer, String> nullValueMap =
                new TreeMap<>();

        nullValueMap.put(1, null);
        nullValueMap.put(2, "Java");
        nullValueMap.put(3, null);

        System.out.println(
                "Null Values : "
                        + nullValueMap);

        // -----------------------------------------------------
        // Sorted Output
        // Elements remain sorted after insertion.
        // -----------------------------------------------------

        System.out.println("\nSorted Output");

        TreeMap<Integer, String> sortedOutput =
                new TreeMap<>();

        sortedOutput.put(80, "Eighty");
        sortedOutput.put(10, "Ten");
        sortedOutput.put(60, "Sixty");
        sortedOutput.put(40, "Forty");
        sortedOutput.put(20, "Twenty");

        System.out.println(
                "Automatically Sorted : "
                        + sortedOutput);

        // =====================================================
        // Red-Black Tree Note
        // =====================================================

        /*
            TreeMap is internally implemented
            using a Red-Black Tree.

            Characteristics

            • Self-balancing Binary Search Tree

            • Keys remain sorted

            • Search  : O(log n)

            • Insert  : O(log n)

            • Delete  : O(log n)

            • Does not allow null keys

            • Allows duplicate values

            • Automatically balances itself
              after insertion and deletion.
         */

    }
}