package F_Map.ConcurrentMap.ConcurrentHashMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

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
         *           Methods Inherited from ConcurrentMap
         * ==========================================================
         */

        // ConcurrentMap introduces atomic operations
        // for thread-safe updates.
        //
        // putIfAbsent()
        // remove(key, value)
        // replace()
        // replaceAll()
        // compute()
        // computeIfAbsent()
        // computeIfPresent()
        // merge()


        /*
         * ==========================================================
         *          Basic ConcurrentHashMap Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        ConcurrentHashMap rawUsers =
                new ConcurrentHashMap();

        rawUsers.put(101, "Alice");
        rawUsers.put("Role", "Admin");
        rawUsers.put(true, 999);

        System.out.println("Raw ConcurrentHashMap");
        System.out.println(rawUsers);

        /*
         * Raw Types:
         * -----------
         * Stores everything as Object.
         *
         * Type Safety is NOT available.
         *
         * Avoid using Raw Types in modern Java.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, String> users =
                new ConcurrentHashMap<>();

        users.put(101, "Rudra");
        users.put(102, "Haya");
        users.put(103, "Arman");

        System.out.println("ConcurrentHashMap with Generics");
        System.out.println(users);

        /*
         * Note:
         *
         * Keys must be unique.
         *
         * Duplicate keys replace the
         * previous value.
         *
         * Null Keys are NOT allowed.
         *
         * Null Values are NOT allowed.
         */


        // ---------------------------------------------------------
        // Duplicate Key Demonstration
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, String> duplicateDemo =
                new ConcurrentHashMap<>();

        duplicateDemo.put(1, "Java");
        duplicateDemo.put(2, "Python");
        duplicateDemo.put(1, "Spring");

        System.out.println("\nDuplicate Key Demonstration");

        System.out.println(duplicateDemo);

        /*
         * Output
         *
         * {1=Spring, 2=Python}
         *
         * Existing value gets replaced.
         */


        // ---------------------------------------------------------
        // Null Demonstration
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, String> nullDemo =
                new ConcurrentHashMap<>();

        nullDemo.put(1, "Java");

        System.out.println("\nNull Demonstration");

        System.out.println(nullDemo);

        /*
         * Uncommenting any of the
         * following statements throws
         * NullPointerException.
         */

//      nullDemo.put(null, "Java");

//      nullDemo.put(2, null);

        /*
         * ConcurrentHashMap
         *
         * ❌ Null Key NOT Allowed
         *
         * ❌ Null Value NOT Allowed
         */


        // ---------------------------------------------------------
        // For Each Loop
        // ---------------------------------------------------------

        System.out.println("\nUsing For Each");

        for (Map.Entry<Integer, String> entry
                : users.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue());

        }


        // ---------------------------------------------------------
        // Iterator
        // ---------------------------------------------------------

        System.out.println("\nUsing Iterator");

        Iterator<Map.Entry<Integer, String>> iterator =
                users.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry =
                    iterator.next();

            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue());

        }


        // ---------------------------------------------------------
        // Working with Custom Class
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, Employee> employees =
                new ConcurrentHashMap<>();

        employees.put(101,
                new Employee("Rudra", 90000));

        employees.put(102,
                new Employee("Haya", 85000));

        employees.put(103,
                new Employee("Rudra", 90000));

        System.out.println("\nCustom Class");

        for (Map.Entry<Integer, Employee> entry
                : employees.entrySet()) {

            System.out.println(entry);

        }

        /*
         * Note:
         *
         * Duplicate Keys
         * are NOT allowed.
         *
         * Duplicate Values
         * are allowed.
         *
         * Since equals() and hashCode()
         * are NOT overridden,
         *
         * Employee objects are treated
         * as different objects.
         */


        /*
         * ==========================================================
         *                    Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // ConcurrentHashMap()
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, String> map1 =
                new ConcurrentHashMap<>();

        map1.put(101, "Java");
        map1.put(102, "Python");
        map1.put(103, "Spring");

        System.out.println("\nConcurrentHashMap()");

        System.out.println(map1);

        /*
         * Creates an empty
         * ConcurrentHashMap.
         *
         * Default Constructor.
         *
         * Initial Capacity : 16
         *
         * Default Load Factor : 0.75
         *
         * Thread-safe.
         */


        // ---------------------------------------------------------
        // ConcurrentHashMap(int initialCapacity)
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, String> map2 =
                new ConcurrentHashMap<>(100);

        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Mango");

        System.out.println("\nConcurrentHashMap(int initialCapacity)");

        System.out.println(map2);

        /*
         * Specifies the initial capacity.
         *
         * Useful when approximate
         * number of mappings is known.
         *
         * Reduces resizing operations.
         */


        // ---------------------------------------------------------
        // ConcurrentHashMap(int initialCapacity,
        //                   float loadFactor)
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, String> map3 =
                new ConcurrentHashMap<>(64, 0.75f);

        map3.put(10, "A");
        map3.put(20, "B");
        map3.put(30, "C");

        System.out.println(
                "\nConcurrentHashMap(int,float)");

        System.out.println(map3);

        /*
         * Allows custom
         * Load Factor.
         *
         * Default value
         *
         * 0.75
         *
         * is recommended.
         */


        // ---------------------------------------------------------
        // ConcurrentHashMap(int initialCapacity,
        // float loadFactor,
        // int concurrencyLevel)
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, String> map4 =
                new ConcurrentHashMap<>(
                        64,
                        0.75f,
                        16);

        map4.put(100, "Windows");
        map4.put(200, "Linux");
        map4.put(300, "macOS");

        System.out.println(
                "\nConcurrentHashMap(int,float,int)");

        System.out.println(map4);

        /*
         * concurrencyLevel
         *
         * Represents the expected
         * number of concurrently
         * updating threads.
         *
         * Before Java 8
         *
         * Used for segmented locking.
         *
         * Java 8+
         *
         * Used only as
         * a sizing hint.
         */


        // ---------------------------------------------------------
        // ConcurrentHashMap(Map)
        // ---------------------------------------------------------

        HashMap<Integer, String> hashMap =
                new HashMap<>();

        hashMap.put(1, "HTML");
        hashMap.put(2, "CSS");
        hashMap.put(3, "JavaScript");

        ConcurrentHashMap<Integer, String> map5 =
                new ConcurrentHashMap<>(hashMap);

        System.out.println("\nConcurrentHashMap(Map)");

        System.out.println("Original HashMap");

        System.out.println(hashMap);

        System.out.println("\nConcurrentHashMap");

        System.out.println(map5);

        /*
         * Copies all mappings
         * from another Map.
         *
         * Original Map
         * remains unchanged.
         *
         * Frequently used
         * for converting
         * HashMap into
         * ConcurrentHashMap.
         */


        // =========================================================
        // Part 2 Starts from mappingCount()
        // =========================================================


        /*
         * ==========================================================
         *                  mappingCount()
         * ==========================================================
         */

        ConcurrentHashMap<Integer, String> languageMap =
                new ConcurrentHashMap<>();

        languageMap.put(1, "Java");
        languageMap.put(2, "Python");
        languageMap.put(3, "Go");
        languageMap.put(4, "Rust");

        System.out.println("\nmappingCount()");

        System.out.println(
                "Mapping Count : "
                        + languageMap.mappingCount());

        /*
         * mappingCount()
         *
         * Returns the number
         * of mappings.
         *
         * Return Type
         *
         * long
         *
         * Unlike size(),
         * mappingCount()
         * can safely represent
         * extremely large maps.
         */



        /*
         * ==========================================================
         *                     newKeySet()
         * ==========================================================
         */

        ConcurrentHashMap.KeySetView<String, Boolean> languages =
                ConcurrentHashMap.newKeySet();

        languages.add("Java");
        languages.add("Python");
        languages.add("Spring");

        System.out.println("\nnewKeySet()");

        System.out.println(languages);

        /*
         * Creates a thread-safe Set.
         *
         * Internally backed by
         * ConcurrentHashMap.
         *
         * Duplicate elements
         * are ignored.
         */


        /*
         * ==========================================================
         *                newKeySet(int expectedSize)
         * ==========================================================
         */

        ConcurrentHashMap.KeySetView<Integer, Boolean> numbers =
                ConcurrentHashMap.newKeySet(100);

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nnewKeySet(int)");

        System.out.println(numbers);

        /*
         * Creates a KeySet
         * with the expected size.
         *
         * Helps reduce resizing.
         */


        /*
         * ==========================================================
         *                  keySet(mappedValue)
         * ==========================================================
         */

        ConcurrentHashMap<String, Integer> scores =
                new ConcurrentHashMap<>();

        ConcurrentHashMap.KeySetView<String, Integer> players =
                scores.keySet(100);

        players.add("Virat");
        players.add("Rohit");

        System.out.println("\nkeySet(mappedValue)");

        System.out.println(scores);

        /*
         * Every inserted key
         * automatically receives
         * the supplied value.
         *
         * Output
         *
         * {Virat=100,
         *  Rohit=100}
         */


        /*
         * ==========================================================
         *                      search()
         * ==========================================================
         */

        ConcurrentHashMap<Integer, String> searchDemo =
                new ConcurrentHashMap<>();

        searchDemo.put(1, "Java");
        searchDemo.put(2, "Python");
        searchDemo.put(3, "Spring");

        String language =
                searchDemo.search(

                        1,

                        (key, value) ->

                                value.equals("Python")
                                        ? value
                                        : null

                );

        System.out.println("\nsearch()");

        System.out.println(language);

        /*
         * Searches mappings
         * in parallel.
         *
         * Stops immediately
         * after first match.
         */


        /*
         * ==========================================================
         *                    searchKeys()
         * ==========================================================
         */

        Integer foundKey =
                searchDemo.searchKeys(

                        1,

                        key -> key == 2
                                ? key
                                : null

                );

        System.out.println("\nsearchKeys()");

        System.out.println(foundKey);

        /*
         * Searches only Keys.
         */


        /*
         * ==========================================================
         *                   searchValues()
         * ==========================================================
         */

        String foundValue =
                searchDemo.searchValues(

                        1,

                        value ->

                                value.startsWith("J")
                                        ? value
                                        : null

                );

        System.out.println("\nsearchValues()");

        System.out.println(foundValue);

        /*
         * Searches only Values.
         */


        /*
         * ==========================================================
         *                  searchEntries()
         * ==========================================================
         */

        Map.Entry<Integer, String> entry1 =
                searchDemo.searchEntries(

                        1,

                        e ->

                                e.getKey() == 3
                                        ? e
                                        : null

                );

        System.out.println("\nsearchEntries()");

        System.out.println(entry1);

        /*
         * Searches complete
         * Key-Value pairs.
         *
         * Useful when both
         * key and value
         * are required.
         */


        /*
         * ==========================================================
         *                     reduce()
         * ==========================================================
         */

        Integer totalLength =
                searchDemo.reduce(

                        1,

                        (key, value) -> value.length(),

                        Integer::sum

                );

        System.out.println("\nreduce()");

        System.out.println(totalLength);

        /*
         * Parallel reduction.
         *
         * Similar to Stream
         * reduce().
         */


        /*
         * ==========================================================
         *                   reduceKeys()
         * ==========================================================
         */

        Integer keySum =
                searchDemo.reduceKeys(

                        1,

                        Integer::sum

                );

        System.out.println("\nreduceKeys()");

        System.out.println(keySum);

        /*
         * Reduces Keys.
         */


        /*
         * ==========================================================
         *                  reduceValues()
         * ==========================================================
         */

        String values =
                searchDemo.reduceValues(

                        1,

                        (a, b) -> a + ", " + b

                );

        System.out.println("\nreduceValues()");

        System.out.println(values);

        /*
         * Reduces Values.
         */


        /*
         * ==========================================================
         *                 reduceEntries()
         * ==========================================================
         */

        Integer longestKey =
                searchDemo.reduceEntries(

                        1,

                        e -> e.getKey(),

                        Integer::max

                );

        System.out.println("\nreduceEntries()");

        System.out.println(longestKey);

        /*
         * Performs reduction
         * using complete entries.
         */


        /*
         * ==========================================================
         *                  reduceToDouble()
         * ==========================================================
         */

        double averageLength =
                searchDemo.reduceToDouble(

                        1,

                        (key, value) -> value.length(),

                        0.0,

                        Double::sum

                );

        System.out.println("\nreduceToDouble()");

        System.out.println(averageLength);

        /*
         * Transforms every mapping
         * into double values and
         * performs parallel reduction.
         */


        /*
         * ==========================================================
         *                   reduceToInt()
         * ==========================================================
         */

        int totalCharacters =
                searchDemo.reduceToInt(

                        1,

                        (key, value) -> value.length(),

                        0,

                        Integer::sum

                );

        System.out.println("\nreduceToInt()");

        System.out.println(totalCharacters);

        /*
         * Returns an int value
         * after parallel reduction.
         */


        /*
         * ==========================================================
         *                  reduceToLong()
         * ==========================================================
         */

        long totalKeys =
                searchDemo.reduceToLong(

                        1,

                        (key, value) -> key,

                        0L,

                        Long::sum

                );

        System.out.println("\nreduceToLong()");

        System.out.println(totalKeys);

        /*
         * Returns a long value
         * after reduction.
         */


        /*
         * ==========================================================
         *               reduceKeysToDouble()
         * ==========================================================
         */

        double keyAverage =
                searchDemo.reduceKeysToDouble(

                        1,

                        Integer::doubleValue,

                        0.0,

                        Double::sum

                );

        System.out.println("\nreduceKeysToDouble()");

        System.out.println(keyAverage);

        /*
         * Reduces Keys
         * into double values.
         */


        /*
         * ==========================================================
         *                 reduceKeysToInt()
         * ==========================================================
         */

        int keyTotal =
                searchDemo.reduceKeysToInt(

                        1,

                        Integer::intValue,

                        0,

                        Integer::sum

                );

        System.out.println("\nreduceKeysToInt()");

        System.out.println(keyTotal);

        /*
         * Reduces Keys
         * into int values.
         */


        /*
         * ==========================================================
         *                reduceKeysToLong()
         * ==========================================================
         */

        long keyLongTotal =
                searchDemo.reduceKeysToLong(

                        1,

                        Integer::longValue,

                        0L,

                        Long::sum

                );

        System.out.println("\nreduceKeysToLong()");

        System.out.println(keyLongTotal);

        /*
         * Reduces Keys
         * into long values.
         */


        /*
         * ==========================================================
         *              reduceValuesToDouble()
         * ==========================================================
         */

        double valueLengthDouble =
                searchDemo.reduceValuesToDouble(

                        1,

                        String::length,

                        0.0,

                        Double::sum

                );

        System.out.println("\nreduceValuesToDouble()");

        System.out.println(valueLengthDouble);

        /*
         * Reduces Values
         * into double values.
         */


        /*
         * ==========================================================
         *                reduceValuesToInt()
         * ==========================================================
         */

        int valueLengthInt =
                searchDemo.reduceValuesToInt(

                        1,

                        String::length,

                        0,

                        Integer::sum

                );

        System.out.println("\nreduceValuesToInt()");

        System.out.println(valueLengthInt);

        /*
         * Reduces Values
         * into int values.
         */


        /*
         * ==========================================================
         *               reduceValuesToLong()
         * ==========================================================
         */

        long valueLengthLong =
                searchDemo.reduceValuesToLong(

                        1,

                        value -> (long) value.length(),

                        0L,

                        Long::sum

                );

        System.out.println("\nreduceValuesToLong()");

        System.out.println(valueLengthLong);

        /*
         * Reduces Values
         * into long values.
         */


        /*
         * ==========================================================
         *             reduceEntriesToDouble()
         * ==========================================================
         */

        double entryDouble =
                searchDemo.reduceEntriesToDouble(

                        1,

                        e -> e.getKey().doubleValue(),

                        0.0,

                        Double::sum

                );

        System.out.println("\nreduceEntriesToDouble()");

        System.out.println(entryDouble);

        /*
         * Performs reduction
         * using complete entries.
         */


        /*
         * ==========================================================
         *               reduceEntriesToInt()
         * ==========================================================
         */

        int entryInt =
                searchDemo.reduceEntriesToInt(

                        1,

                        Map.Entry::getKey,

                        0,

                        Integer::sum

                );

        System.out.println("\nreduceEntriesToInt()");

        System.out.println(entryInt);

        /*
         * Returns int result
         * after entry reduction.
         */


        /*
         * ==========================================================
         *              reduceEntriesToLong()
         * ==========================================================
         */

        long entryLong =
                searchDemo.reduceEntriesToLong(

                        1,

                        e -> e.getKey().longValue(),

                        0L,

                        Long::sum

                );

        System.out.println("\nreduceEntriesToLong()");

        System.out.println(entryLong);

        /*
         * Returns long result
         * after entry reduction.
         */


        /*
         * ==========================================================
         *              Parallel Bulk Operations
         * ==========================================================
         */

        /*
         * search()
         *
         * searchKeys()
         *
         * searchValues()
         *
         * searchEntries()
         *
         * reduce()
         *
         * reduceKeys()
         *
         * reduceValues()
         *
         * reduceEntries()
         *
         * reduceToDouble()
         *
         * reduceToInt()
         *
         * reduceToLong()
         *
         * reduceKeysToDouble()
         *
         * reduceKeysToInt()
         *
         * reduceKeysToLong()
         *
         * reduceValuesToDouble()
         *
         * reduceValuesToInt()
         *
         * reduceValuesToLong()
         *
         * reduceEntriesToDouble()
         *
         * reduceEntriesToInt()
         *
         * reduceEntriesToLong()
         *
         * All these methods
         * were introduced
         * in Java 8.
         *
         * Internally they use
         * the ForkJoinPool
         * to process very
         * large ConcurrentHashMaps
         * in parallel.
         */


        /*
         * ==========================================================
         *                 Capacity vs Size
         * ==========================================================
         */

        ConcurrentHashMap<Integer, String> capacityDemo =
                new ConcurrentHashMap<>(20);

        capacityDemo.put(1, "Java");
        capacityDemo.put(2, "Python");
        capacityDemo.put(3, "Spring");

        System.out.println("\nCapacity vs Size");

        System.out.println(capacityDemo);

        System.out.println("Size : "
                + capacityDemo.size());

        /*
         * Capacity
         *
         * Number of Buckets
         *
         * (Cannot be accessed directly)
         *
         *
         * Size
         *
         * Number of Stored
         * Key-Value Pairs.
         */


        /*
         * ==========================================================
         *                    Load Factor
         * ==========================================================
         */

        ConcurrentHashMap<Integer, String> loadFactorDemo =
                new ConcurrentHashMap<>(16, 0.75f);

        loadFactorDemo.put(10, "Java");
        loadFactorDemo.put(20, "Python");
        loadFactorDemo.put(30, "Go");

        System.out.println("\nLoad Factor");

        System.out.println(loadFactorDemo);

        /*
         * Default Load Factor
         *
         * 0.75
         *
         * Formula
         *
         * Size / Capacity
         *
         * Default value provides
         * a good balance between
         * memory and performance.
         */


        /*
         * ==========================================================
         *                     Threshold
         * ==========================================================
         */

        System.out.println("\nThreshold");

        /*
         * Formula
         *
         * Threshold
         *
         * =
         *
         * Capacity × Load Factor
         *
         *
         * Example
         *
         * Capacity = 16
         *
         * Load Factor = 0.75
         *
         * Threshold = 12
         *
         * After the threshold
         * is exceeded,
         *
         * ConcurrentHashMap
         * performs resizing.
         */


        /*
         * ==========================================================
         *                     Resizing
         * ==========================================================
         */

        ConcurrentHashMap<Integer, Integer> resizeDemo =
                new ConcurrentHashMap<>(4, 0.75f);

        resizeDemo.put(1, 100);
        resizeDemo.put(2, 200);
        resizeDemo.put(3, 300);

        System.out.println("\nBefore Resizing");

        System.out.println(resizeDemo);

        /*
         * Next insertion
         * exceeds threshold.
         */

        resizeDemo.put(4, 400);

        System.out.println("\nAfter Resizing");

        System.out.println(resizeDemo);

        /*
         * Internally
         *
         * Capacity increases.
         *
         * Existing mappings
         * are redistributed
         * into new buckets.
         *
         * Unlike HashMap,
         * resizing is
         * thread-safe.
         */


        /*
         * ==========================================================
         *               Compare-And-Swap (CAS)
         * ==========================================================
         */

        ConcurrentHashMap<Integer, Integer> casDemo =
                new ConcurrentHashMap<>();

        casDemo.put(1, 100);

        casDemo.computeIfPresent(
                1,
                (key, value) -> value + 50
        );

        System.out.println("\nCompare-And-Swap (CAS)");

        System.out.println(casDemo);

        /*
         * Many update operations
         * internally use CAS.
         *
         * CAS avoids locking
         * whenever possible.
         *
         * This improves
         * concurrency.
         */


        /*
         * ==========================================================
         *              Bucket-Level Locking
         * ==========================================================
         */

        ConcurrentHashMap<Integer, String> bucketDemo =
                new ConcurrentHashMap<>();

        bucketDemo.put(1, "A");
        bucketDemo.put(2, "B");
        bucketDemo.put(3, "C");

        System.out.println("\nBucket-Level Locking");

        System.out.println(bucketDemo);

        /*
         * Unlike Hashtable,
         *
         * ConcurrentHashMap
         * locks only the
         * affected bucket.
         *
         * Other buckets
         * remain accessible
         * by other threads.
         */


        /*
         * ==========================================================
         *                  Lock-Free Reads
         * ==========================================================
         */

        System.out.println("\nLock-Free Reads");

        System.out.println(bucketDemo.get(1));

        System.out.println(bucketDemo.containsKey(2));

        /*
         * Read operations
         * generally do NOT
         * require locking.
         *
         * Multiple threads
         * can safely perform
         * reads simultaneously.
         */


        /*
         * ==========================================================
         *            Weakly Consistent Iterator
         * ==========================================================
         */

        ConcurrentHashMap<Integer, String> iteratorDemo =
                new ConcurrentHashMap<>();

        iteratorDemo.put(1, "Java");
        iteratorDemo.put(2, "Python");
        iteratorDemo.put(3, "Spring");

        System.out.println("\nWeakly Consistent Iterator");

        Iterator<Map.Entry<Integer, String>> itr =
                iteratorDemo.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<Integer, String> entry =
                    itr.next();

            System.out.println(entry);

            if (entry.getKey() == 2) {

                iteratorDemo.put(4, "Go");

            }

        }

        /*
         * Unlike HashMap,
         *
         * ConcurrentHashMap
         * does NOT throw
         * ConcurrentModificationException.
         *
         * Iterators are
         * Weakly Consistent.
         */


        /*
         * ==========================================================
         *            Reference Type Demonstration
         * ==========================================================
         */

        /*
         * Map Reference
         *
         * Can access only
         * Map methods.
         */

        Map<Integer, String> mapReference =
                new ConcurrentHashMap<>();

        mapReference.put(1, "Java");
        mapReference.put(2, "Python");

        System.out.println("\nMap Reference");

        System.out.println(mapReference);

        /*
         * ConcurrentMap Reference
         *
         * Can access
         * ConcurrentMap methods.
         */

        ConcurrentMap<Integer, String> concurrentReference =
                new ConcurrentHashMap<>();

        concurrentReference.putIfAbsent(10, "Spring");

        System.out.println("\nConcurrentMap Reference");

        System.out.println(concurrentReference);

        /*
         * ConcurrentHashMap Reference
         *
         * Can access every
         * method of
         * ConcurrentHashMap.
         */

        ConcurrentHashMap<Integer, String> classReference =
                new ConcurrentHashMap<>();

        classReference.put(100, "Docker");

        System.out.println("\nConcurrentHashMap Reference");

        System.out.println(classReference);

        System.out.println(
                classReference.mappingCount()
        );

        /*
         * Note:
         *
         * Interface Reference
         *
         * Recommended because
         * implementation can
         * be changed easily.
         *
         * Class Reference
         *
         * Required when
         * ConcurrentHashMap-
         * specific methods
         * are needed.
         */


        // ------------- Part 3 Starts from Optimized Overrides -------------

        /*
         * ==========================================================
         *                 Optimized Overrides
         * ==========================================================
         */

        // ---------------------------------------------------------
        // forEach()
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, String> fruits =
                new ConcurrentHashMap<>();

        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Mango");

        System.out.println("\nforEach()");

        fruits.forEach((key, value) ->
                System.out.println(key + " -> " + value));

        /*
         * forEach()
         *
         * Introduced in Java 8.
         *
         * Uses BiConsumer
         * Functional Interface.
         */


        // ---------------------------------------------------------
        // replaceAll()
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, String> replaceDemo =
                new ConcurrentHashMap<>();

        replaceDemo.put(1, "java");
        replaceDemo.put(2, "python");
        replaceDemo.put(3, "spring");

        replaceDemo.replaceAll(
                (key, value) -> value.toUpperCase());

        System.out.println("\nreplaceAll()");

        System.out.println(replaceDemo);

        /*
         * Updates every value
         * using the supplied
         * BiFunction.
         */


        // ---------------------------------------------------------
        // compute()
        // ---------------------------------------------------------

        ConcurrentHashMap<Integer, Integer> computeDemo =
                new ConcurrentHashMap<>();

        computeDemo.put(1, 100);

        computeDemo.compute(
                1,
                (key, value) -> value + 50);

        System.out.println("\ncompute()");

        System.out.println(computeDemo);

        /*
         * Computes a new value
         * regardless of whether
         * mapping exists.
         */


        // ---------------------------------------------------------
        // computeIfAbsent()
        // ---------------------------------------------------------

        computeDemo.computeIfAbsent(
                2,
                key -> 200);

        System.out.println("\ncomputeIfAbsent()");

        System.out.println(computeDemo);

        /*
         * Executes only if
         * the key does NOT exist.
         */


        // ---------------------------------------------------------
        // computeIfPresent()
        // ---------------------------------------------------------

        computeDemo.computeIfPresent(
                1,
                (key, value) -> value * 2);

        System.out.println("\ncomputeIfPresent()");

        System.out.println(computeDemo);

        /*
         * Executes only if
         * the key already exists.
         */


        // ---------------------------------------------------------
        // merge()
        // ---------------------------------------------------------

        ConcurrentHashMap<String, Integer> mergeDemo =
                new ConcurrentHashMap<>();

        mergeDemo.put("Java", 10);

        mergeDemo.merge(
                "Java",
                5,
                Integer::sum);

        mergeDemo.merge(
                "Python",
                20,
                Integer::sum);

        System.out.println("\nmerge()");

        System.out.println(mergeDemo);

        /*
         * If key exists,
         * combines old and
         * new values.
         *
         * Otherwise,
         * inserts the new value.
         */


        /*
         * ==========================================================
         *         ConcurrentHashMap Characteristics
         * ==========================================================
         */

        ConcurrentHashMap<Integer, String> characteristics =
                new ConcurrentHashMap<>();

        characteristics.put(30, "Thirty");
        characteristics.put(10, "Ten");
        characteristics.put(40, "Forty");
        characteristics.put(20, "Twenty");

        System.out.println("\nConcurrentHashMap Characteristics");

        System.out.println(characteristics);

        /*
         * Characteristics
         *
         * ✔ Thread Safe
         *
         * ✔ High Performance
         *
         * ✔ No Null Key
         *
         * ✔ No Null Value
         *
         * ✔ Duplicate Keys NOT Allowed
         *
         * ✔ Duplicate Values Allowed
         *
         * ✔ Weakly Consistent Iterator
         *
         * ✔ Average O(1)
         */


        /*
         * ==========================================================
         *             Methods Not Covered Yet
         * ==========================================================
         */

        /*
         * Advanced Parallel APIs
         *
         * reduceKeysToDouble()
         *
         * reduceKeysToInt()
         *
         * reduceKeysToLong()
         *
         * reduceValuesToDouble()
         *
         * reduceValuesToInt()
         *
         * reduceValuesToLong()
         *
         * reduceEntriesToDouble()
         *
         * reduceEntriesToInt()
         *
         * reduceEntriesToLong()
         *
         * Advanced ForkJoin
         * customization.
         */


        /*
         * ==========================================================
         *           Methods Inherited from Object
         * ==========================================================
         */

        System.out.println("\nObject Methods");

        System.out.println(fruits.toString());

        System.out.println(fruits.getClass());

        System.out.println(fruits.hashCode());

        System.out.println(fruits.equals(replaceDemo));

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
         * finalize() (Deprecated)
         */


        /*
         * ==========================================================
         *                  Interview Notes
         * ==========================================================
         */

        /*
         * 1.
         * ConcurrentHashMap
         * is thread-safe.
         *
         * 2.
         * Uses bucket-level locking.
         *
         * 3.
         * Read operations are
         * generally lock-free.
         *
         * 4.
         * Null Keys
         * are NOT allowed.
         *
         * 5.
         * Null Values
         * are NOT allowed.
         *
         * 6.
         * Iterator never throws
         * ConcurrentModificationException.
         *
         * 7.
         * Uses CAS
         * (Compare-And-Swap)
         * for many updates.
         *
         * 8.
         * Java 8+
         * uses Tree Bins
         * for heavily
         * collided buckets.
         *
         * 9.
         * Average Complexity
         *
         * get()    O(1)
         *
         * put()    O(1)
         *
         * remove() O(1)
         *
         * 10.
         * Preferred over
         * Hashtable
         * in modern
         * concurrent applications.
         */


        /*
         * ==========================================================
         *                       End
         * ==========================================================
         */

        System.out.println(
                "\nConcurrentHashMap Implementation Completed.");

    }

}


/*
 * ==========================================================
 *                 Custom Class
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
 * ==========================================================
 * IMPORTANT
 * ==========================================================
 *
 * Since equals() and hashCode()
 * are NOT overridden,
 *
 * Employee objects are treated
 * as different objects.
 *
 * Override both methods when
 * logical equality is required.
 *
 * This topic will be covered
 * in HashMap / Object Class.
 *
 * ==========================================================
 */