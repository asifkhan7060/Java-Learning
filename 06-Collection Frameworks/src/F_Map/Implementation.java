package F_Map;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        // =====================================================
        // Map Methods
        // =====================================================

        /*
            Unlike Collection, Map does NOT extend
            the Collection interface.

            Map stores elements as Key-Value pairs.

            Additional methods are introduced by:

            SortedMap

                firstKey()
                lastKey()
                headMap()
                tailMap()
                subMap()
                comparator()

            NavigableMap

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

            ConcurrentMap

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
        // Map Methods Demonstration
        // =====================================================

        Map<Integer, String> map = new HashMap<>(); // Implemented by HashMap(Common to use)

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("Original Map : " + map);

        // =====================================================
        // put()
        // Associates the specified value with the specified key.
        // If key already exists, old value is replaced.
        // =====================================================

        System.out.println("\nput()");

        System.out.println("Before put() : " + map);

        map.put(4, "JavaScript");

        System.out.println("After put() : " + map);

        map.put(2, "Spring");

        System.out.println("After Updating Key 2 : " + map);

        // =====================================================
        // putAll()
        // Copies all mappings from another Map.
        // =====================================================

        Map<Integer, String> anotherMap = new HashMap<>();

        anotherMap.put(5, "Go");
        anotherMap.put(6, "Kotlin");
        anotherMap.put(7, "Rust");

        System.out.println("\nputAll()");

        System.out.println("Before putAll() : " + map);

        System.out.println("Another Map : " + anotherMap);

        map.putAll(anotherMap);

        System.out.println("After putAll() : " + map);

        // =====================================================
        // putIfAbsent()
        // Inserts mapping only if key is absent.
        // =====================================================

        System.out.println("\nputIfAbsent()");

        System.out.println("Before putIfAbsent() : " + map);

        map.putIfAbsent(2, "PHP");

        map.putIfAbsent(8, "PHP");

        System.out.println("After putIfAbsent() : " + map);

        // =====================================================
        // get()
        // Returns value associated with specified key.
        // =====================================================

        System.out.println("\nget()");

        System.out.println("Value of Key 1 : "
                + map.get(1));

        System.out.println("Value of Key 6 : "
                + map.get(6));

        System.out.println("Value of Key 6 : "
                + map.get(100)); //null

        // =====================================================
        // getOrDefault()
        // Returns mapped value or supplied default value.
        // =====================================================

        System.out.println("\ngetOrDefault()");

        System.out.println("Key 5 : " + map.getOrDefault(5, "Not Found"));

        System.out.println("Key 100 : " + map.getOrDefault(100, "Not Found"));

        // =====================================================
        // remove(key)
        // Removes mapping using key.
        // =====================================================

        System.out.println("\nremove(key)");

        System.out.println("Before remove() : " + map);

        map.remove(8); // for wrong index nothing happens

        System.out.println("After remove() : " + map);

        // =====================================================
        // remove(key, value)
        // Removes mapping only if both match.
        // =====================================================

        System.out.println("\nremove(key, value)");

        System.out.println("Before remove(key,value) : "
                + map);

        map.remove(7, "Rust"); // for wrong input nothing happens

        System.out.println("After remove(key,value) : "
                + map);

        // =====================================================
        // replace(key, value)
        // Replaces value for specified key.
        // =====================================================

        System.out.println("\nreplace(key, value)");

        System.out.println("Before replace() : " + map);

        map.replace(1, "Core Java"); // for wrong index nothing happens

        System.out.println("After replace() : " + map);

        // =====================================================
        // replace(key, oldValue, newValue)
        // Replaces value only if old value matches.
        // =====================================================

        System.out.println("\nreplace(key, oldValue, newValue)");

        System.out.println("Before replace() : " + map);

        map.replace(2, "Spring", "Spring Boot"); // for wrong index and value it skips

        System.out.println("After replace() : " + map);

        // =====================================================
        // replaceAll()
        // Replaces every value using lambda expression.
        // =====================================================

        System.out.println("\nreplaceAll()");

        System.out.println("Before replaceAll() : " + map);

        map.replaceAll((key, value) -> value.toUpperCase());

        System.out.println("After replaceAll() : " + map);

        // =====================================================
        // containsKey()
        // Checks whether the specified key exists.
        // =====================================================

        System.out.println("\ncontainsKey()");

        System.out.println("Map : " + map);

        System.out.println("Contains Key 3 : "
                + map.containsKey(3));

        System.out.println("Contains Key 100 : "
                + map.containsKey(100));

        // =====================================================
        // containsValue()
        // Checks whether the specified value exists.
        // =====================================================

        System.out.println("\ncontainsValue()");

        System.out.println("Contains Value 'GO' : "
                + map.containsValue("GO"));

        System.out.println("Contains Value 'SWIFT' : "
                + map.containsValue("SWIFT"));

        // =====================================================
        // keySet()
        // Returns a Set containing all keys.
        // =====================================================

        System.out.println("\nkeySet()");

        Set<Integer> keys = map.keySet();

        System.out.println("Keys : " + keys);

        // =====================================================
        // values()
        // Returns a Collection containing all values.
        // =====================================================

        System.out.println("\nvalues()");

        Collection<String> values = map.values();

        System.out.println("Values : " + values);

        // =====================================================
        // entrySet()
        // Returns a Set containing all key-value pairs.
        // =====================================================

        System.out.println("\nentrySet()");

        Set<Map.Entry<Integer, String>> entries =
                map.entrySet();

        System.out.println("Entries : " + entries);

        // =====================================================
        // forEach()
        // Traverses every key-value mapping.
        // =====================================================

        System.out.println("\nforEach()");

        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // =====================================================
        // compute()
        // Computes a new value for specified key.
        // =====================================================

        System.out.println("\ncompute()");

        System.out.println("Before compute() : " + map);

        map.compute(1, (key, value) -> value + " Programming");

        System.out.println("After compute() : " + map);

        // =====================================================
        // computeIfAbsent()
        // Computes value only if key is absent.
        // =====================================================

        System.out.println("\ncomputeIfAbsent()");

        System.out.println("Before computeIfAbsent() : "
                + map);

        map.computeIfAbsent(10,key -> "DART");

        map.computeIfAbsent(2, key -> "FLUTTER");

        System.out.println("After computeIfAbsent() : " + map);

        // =====================================================
        // computeIfPresent()
        // Computes value only if key already exists.
        // =====================================================

        System.out.println("\ncomputeIfPresent()");

        System.out.println("Before computeIfPresent() : "
                + map);

        map.computeIfPresent(10, (key, value) -> value + " LANGUAGE");

        map.computeIfPresent(100, (key, value) -> "UNKNOWN");

        System.out.println("After computeIfPresent() : " + map);

        // =====================================================
        // merge()
        // Merges existing value with supplied value.
        // =====================================================

        System.out.println("\nmerge()");

        System.out.println("Before merge() : " + map);

        map.merge(10, " FRAMEWORK", (oldValue, newValue) -> oldValue + newValue);

        map.merge(
                20, //new index
                "REACT", //new value
                (oldValue, newValue) -> //oldValue=0
                        oldValue + newValue);

        System.out.println("After merge() : " + map);

        // =====================================================
        // size()
        // Returns total number of key-value mappings.
        // =====================================================

        System.out.println("\nsize()");

        System.out.println("Map : " + map);

        System.out.println("Size : "
                + map.size());

        // =====================================================
        // isEmpty()
        // Checks whether map is empty.
        // =====================================================

        System.out.println("\nisEmpty()");

        System.out.println("Map : " + map);

        System.out.println("isEmpty() : "
                + map.isEmpty());

        // =====================================================
        // Ways to Traverse a Map
        // =====================================================

        Map<Integer, String> traverseMap =
                new HashMap<>();

        traverseMap.put(101, "Java");
        traverseMap.put(102, "Python");
        traverseMap.put(103, "C++");
        traverseMap.put(104, "JavaScript");
        traverseMap.put(105, "Go");

        System.out.println("\nTraversal Map : "
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

        traverseMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // =====================================================
        // Using Stream API
        // =====================================================

        System.out.println("\nUsing Stream API");

        traverseMap.entrySet().stream().forEach(System.out::println);

        // =====================================================
        // clear()
        // Removes all mappings from the map.
        // =====================================================

        System.out.println("\nclear()");

        System.out.println("Before clear() : "
                + traverseMap);

        traverseMap.clear();

        System.out.println("After clear() : "
                + traverseMap);

        // =====================================================
        // Additional Map Methods
        // =====================================================

        // Java 9 (Static Factory Methods)

        // Map.of()
        // Map.ofEntries()
        // Map.copyOf()

        // =====================================================
        // Map.of()
        // =====================================================

        System.out.println("\nMap.of()");

        Map<Integer, String> immutableMap =
                Map.of(1, "Java", 2, "Python", 3, "C++");

        System.out.println("Immutable Map : "
                + immutableMap);

        // immutableMap.put(4, "Go");
        // UnsupportedOperationException

        // =====================================================
        // Map.ofEntries()
        // =====================================================

        System.out.println("\nMap.ofEntries()");

        Map<Integer, String> entryMap =
                Map.ofEntries(Map.entry(1, "Java"), Map.entry(2, "Python"), Map.entry(3, "Go"));

        System.out.println(
                "Map.ofEntries() : "
                        + entryMap);

        // =====================================================
        // Map.copyOf()
        // =====================================================

        System.out.println("\nMap.copyOf()");

        HashMap<Integer, String> original =
                new HashMap<>();

        original.put(11, "Spring");
        original.put(22, "Hibernate");
        original.put(33, "Docker");

        Map<Integer, String> copy =
                Map.copyOf(original);

        System.out.println(
                "Original Map : "
                        + original);

        System.out.println(
                "Immutable Copy : "
                        + copy);

        // copy.put(44, "Kubernetes");
        // UnsupportedOperationException

    }
}