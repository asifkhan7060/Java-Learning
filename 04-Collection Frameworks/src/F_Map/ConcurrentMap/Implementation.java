package F_Map.ConcurrentMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Implementation {

    public static void main(String[] args) {

        // =====================================================
        // Map Methods Available in ConcurrentMap
        // =====================================================

        /*
            Since ConcurrentMap extends Map,
            all Map methods are available.

            Already implemented in
            "Map" topic.

            put()
            putAll()

            get()

            remove(key)

            replace(key, value)

            containsKey()
            containsValue()

            keySet()
            values()
            entrySet()

            size()
            isEmpty()

            clear()

            ConcurrentMap introduces

            putIfAbsent()

            remove(key, value)

            replace(key, oldValue, newValue)

            compute()
            computeIfAbsent()
            computeIfPresent()

            merge()

            forEach()

            replaceAll()

            getOrDefault()
         */

        // =====================================================
        // ConcurrentMap Methods Demonstration
        // =====================================================

        ConcurrentMap<Integer, String> map =
                new ConcurrentHashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("Original ConcurrentMap : "
                + map);

        // =====================================================
        // putIfAbsent()
        // Inserts mapping only if key is absent.
        // =====================================================

        System.out.println("\nputIfAbsent()");

        System.out.println("Before putIfAbsent() : "
                + map);

        map.putIfAbsent(2, "Spring");

        map.putIfAbsent(4, "Spring");

        System.out.println("After putIfAbsent() : "
                + map);

        // =====================================================
        // remove(key, value)
        // Removes mapping only if key and value match.
        // =====================================================

        System.out.println("\nremove(key, value)");

        System.out.println("Before remove() : "
                + map);

        map.remove(3, "C++");

        System.out.println("After remove() : "
                + map);

        // =====================================================
        // replace(key, oldValue, newValue)
        // Replaces value only if old value matches.
        // =====================================================

        System.out.println("\nreplace(key, oldValue, newValue)");

        System.out.println("Before replace() : "
                + map);

        map.replace(
                2,
                "Python",
                "Python 3");

        System.out.println("After replace() : "
                + map);

        // =====================================================
        // compute()
        // Computes a new value for specified key.
        // =====================================================

        System.out.println("\ncompute()");

        System.out.println("Before compute() : "
                + map);

        map.compute(
                1,
                (key, value) ->
                        value + " Programming");

        System.out.println("After compute() : "
                + map);

        // =====================================================
        // computeIfAbsent()
        // Computes value only if key is absent.
        // =====================================================

        System.out.println("\ncomputeIfAbsent()");

        System.out.println("Before computeIfAbsent() : "
                + map);

        map.computeIfAbsent(
                5,
                key -> "Go");

        map.computeIfAbsent(
                2,
                key -> "Kotlin");

        System.out.println("After computeIfAbsent() : "
                + map);

        // =====================================================
        // computeIfPresent()
        // Computes value only if key already exists.
        // =====================================================

        System.out.println("\ncomputeIfPresent()");

        System.out.println("Before computeIfPresent() : "
                + map);

        map.computeIfPresent(
                5,
                (key, value) ->
                        value + " Language");

        map.computeIfPresent(
                100,
                (key, value) ->
                        "Unknown");

        System.out.println("After computeIfPresent() : "
                + map);

        // =====================================================
        // merge()
        // Merges existing value with supplied value.
        // =====================================================

        System.out.println("\nmerge()");

        System.out.println("Before merge() : "
                + map);

        map.merge(
                5,
                " Framework",
                (oldValue, newValue) ->
                        oldValue + newValue);

        map.merge(
                6,
                "Rust",
                (oldValue, newValue) ->
                        oldValue + newValue);

        System.out.println("After merge() : "
                + map);

        // =====================================================
        // forEach()
        // Performs the given action for each key-value mapping.
        // =====================================================

        System.out.println("\nforEach()");

        map.forEach(
                (key, value) ->
                        System.out.println(
                                key + " -> " + value));

        // =====================================================
        // replaceAll()
        // Replaces every value using a lambda expression.
        // =====================================================

        System.out.println("\nreplaceAll()");

        System.out.println("Before replaceAll() : "
                + map);

        map.replaceAll(
                (key, value) ->
                        value.toUpperCase());

        System.out.println("After replaceAll() : "
                + map);

        // =====================================================
        // getOrDefault()
        // Returns mapped value or supplied default value.
        // =====================================================

        System.out.println("\ngetOrDefault()");

        System.out.println(
                "Key 1 : "
                        + map.getOrDefault(
                        1,
                        "Not Found"));

        System.out.println(
                "Key 100 : "
                        + map.getOrDefault(
                        100,
                        "Not Found"));

        // =====================================================
        // Ways to Traverse a ConcurrentMap
        // =====================================================

        ConcurrentMap<Integer, String> traverseMap =
                new ConcurrentHashMap<>();

        traverseMap.put(101, "Java");
        traverseMap.put(102, "Python");
        traverseMap.put(103, "C++");
        traverseMap.put(104, "JavaScript");
        traverseMap.put(105, "Go");

        System.out.println("\nTraversal ConcurrentMap : "
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

        for (Integer key : traverseMap.keySet()) {

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

    }
}