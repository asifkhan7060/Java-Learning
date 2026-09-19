package Collections;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        // It is a separate part from a Collection Framework so better to do after learning CF

        // =====================================================
        // 1. sort()
        // =====================================================

        List<Integer> sortList = new ArrayList<>(
                Arrays.asList(30, 10, 20, 50, 40));

        System.out.println("Before Sort : " + sortList);

        Collections.sort(sortList);

        System.out.println("After Sort  : " + sortList);

        System.out.println();


        // =====================================================
        // 2. binarySearch()
        // =====================================================

        List<Integer> binaryList = new ArrayList<>(
                Arrays.asList(50, 10, 30, 20, 40));

        Collections.sort(binaryList);      // Must be sorted first

        int index = Collections.binarySearch(binaryList, 30);

        System.out.println(binaryList);
        System.out.println("30 found at index : " + index);

        System.out.println();


        // =====================================================
        // 3. reverse()
        // =====================================================

        List<String> reverseList = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Mango", "Orange"));

        System.out.println("Before Reverse : " + reverseList);

        Collections.reverse(reverseList);

        System.out.println("After Reverse  : " + reverseList);

        System.out.println();


        // =====================================================
        // 4. shuffle()
        // =====================================================

        List<Integer> shuffleList = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("Before Shuffle : " + shuffleList);

        Collections.shuffle(shuffleList);

        System.out.println("After Shuffle  : " + shuffleList);

        System.out.println();


        // =====================================================
        // 5. swap()
        // =====================================================

        List<String> swapList = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D"));

        System.out.println("Before Swap : " + swapList);

        Collections.swap(swapList, 1, 3);

        System.out.println("After Swap  : " + swapList);

        System.out.println();


        // =====================================================
        // 6. rotate()
        // =====================================================

        List<String> rotateList = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D"));

        System.out.println("Before Rotate : " + rotateList);

        Collections.rotate(rotateList, 1);

        System.out.println("After Rotate  : " + rotateList);

        System.out.println();


        // =====================================================
        // 7. fill()
        // =====================================================

        List<String> fillList = new ArrayList<>(
                Arrays.asList("Red", "Green", "Blue"));

        System.out.println("Before Fill : " + fillList);

        Collections.fill(fillList, "Black");

        System.out.println("After Fill  : " + fillList);

        System.out.println();


        // =====================================================
        // 8. copy()
        // =====================================================

        List<String> source1 = Arrays.asList(
                "Java",
                "Python",
                "C++"
        );

        // Destination list must already have same size
        List<String> destination = new ArrayList<>(
                Arrays.asList("", "", "")
        );

        System.out.println("Before Copy");
        System.out.println("Source      : " + source1);
        System.out.println("Destination : " + destination);

        Collections.copy(destination, source1);

        System.out.println();

        System.out.println("After Copy");
        System.out.println("Source      : " + source1);
        System.out.println("Destination : " + destination);

        // =====================================================
// 9. replaceAll()
// =====================================================

        List<String> replaceList = new ArrayList<>(
                Arrays.asList("Java", "Python", "Java", "C++"));

        System.out.println("Before Replace : " + replaceList);

// Replace all occurrences of "Java" with "Java SE"
        Collections.replaceAll(replaceList, "Java", "Java SE");

        System.out.println("After Replace  : " + replaceList);

        System.out.println();


// =====================================================
// 10. frequency()
// =====================================================

        List<Integer> frequencyList = new ArrayList<>(
                Arrays.asList(10, 20, 30, 20, 40, 20, 50));

        System.out.println("List : " + frequencyList);

// Count how many times 20 appears
        int frequency = Collections.frequency(frequencyList, 20);

        System.out.println("Frequency of 20 : " + frequency);

        System.out.println();


// =====================================================
// 11. min()
// =====================================================

        List<Integer> minList = new ArrayList<>(
                Arrays.asList(45, 10, 90, 25, 60));

        System.out.println("List : " + minList);

// Returns the smallest element
        int minimum = Collections.min(minList);

        System.out.println("Minimum Element : " + minimum);

        System.out.println();


// =====================================================
// 12. max()
// =====================================================

        List<Integer> maxList = new ArrayList<>(
                Arrays.asList(45, 10, 90, 25, 60));

        System.out.println("List : " + maxList);

// Returns the largest element
        int maximum = Collections.max(maxList);

        System.out.println("Maximum Element : " + maximum);

        System.out.println();


// =====================================================
// 13. disjoint()
// =====================================================

        List<Integer> list1 = Arrays.asList(10, 20, 30);

        List<Integer> list2 = Arrays.asList(40, 50, 60);

        List<Integer> list3 = Arrays.asList(30, 40, 50);

// Checks whether two collections have common elements
        boolean result1 = Collections.disjoint(list1, list2);

        boolean result2 = Collections.disjoint(list1, list3);

        System.out.println("List1 : " + list1);
        System.out.println("List2 : " + list2);
        System.out.println("List3 : " + list3);

        System.out.println();

        System.out.println("List1 & List2 Disjoint : " + result1);

        System.out.println("List1 & List3 Disjoint : " + result2);

        System.out.println();


// =====================================================
// 14. emptyList(), emptySet(), emptyMap()
// =====================================================

// Creates immutable empty collections
        List<String> emptyList = Collections.emptyList();

        Set<Integer> emptySet = Collections.emptySet();

        Map<Integer, String> emptyMap = Collections.emptyMap();

        System.out.println("Empty List : " + emptyList);

        System.out.println("Empty Set  : " + emptySet);

        System.out.println("Empty Map  : " + emptyMap);

        System.out.println();

// Uncommenting the line below throws
// UnsupportedOperationException

// emptyList.add("Java");

        // =====================================================
// 15. singleton()
// =====================================================

// Creates an immutable Set containing only one element
        Set<String> singletonSet = Collections.singleton("Java");

        System.out.println("Singleton Set : " + singletonSet);

// singletonSet.add("Python"); // UnsupportedOperationException

        System.out.println();


// =====================================================
// 16. singletonList()
// =====================================================

// Creates an immutable List containing only one element
        List<String> singletonList = Collections.singletonList("Java");

        System.out.println("Singleton List : " + singletonList);

// singletonList.add("Python"); // UnsupportedOperationException

        System.out.println();


// =====================================================
// 17. singletonMap()
// =====================================================

// Creates an immutable Map containing only one key-value pair
        Map<Integer, String> singletonMap =
                Collections.singletonMap(101, "Asif");

        System.out.println("Singleton Map : " + singletonMap);

// singletonMap.put(102, "Ali"); // UnsupportedOperationException

        System.out.println();


// =====================================================
// 18. unmodifiableList()
// =====================================================

        List<String> list = new ArrayList<>(
                Arrays.asList("Java", "Python", "C++"));

        System.out.println("Original List : " + list);

// Creates a read-only view of the list
        List<String> unmodifiableList =
                Collections.unmodifiableList(list);

        System.out.println("Unmodifiable List : " + unmodifiableList);

// unmodifiableList.add("JavaScript"); // UnsupportedOperationException

// Changes made to the original list are reflected
        list.add("JavaScript");

        System.out.println("After Modifying Original List :");

        System.out.println("Original List      : " + list);

        System.out.println("Unmodifiable List  : " + unmodifiableList);

        System.out.println();


// =====================================================
// 19. unmodifiableSet()
// =====================================================

        Set<Integer> set = new HashSet<>(
                Arrays.asList(10, 20, 30));

        System.out.println("Original Set : " + set);

// Creates a read-only view of the set
        Set<Integer> unmodifiableSet =
                Collections.unmodifiableSet(set);

        System.out.println("Unmodifiable Set : " + unmodifiableSet);

// unmodifiableSet.add(40); // UnsupportedOperationException

        set.add(40);

        System.out.println("After Modifying Original Set :");

        System.out.println("Original Set      : " + set);

        System.out.println("Unmodifiable Set  : " + unmodifiableSet);

        System.out.println();


// =====================================================
// 20. unmodifiableMap()
// =====================================================

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println("Original Map : " + map);

// Creates a read-only view of the map
        Map<Integer, String> unmodifiableMap =
                Collections.unmodifiableMap(map);

        System.out.println("Unmodifiable Map : " + unmodifiableMap);

// unmodifiableMap.put(3, "C++"); // UnsupportedOperationException

        map.put(3, "C++");

        System.out.println("After Modifying Original Map :");

        System.out.println("Original Map      : " + map);

        System.out.println("Unmodifiable Map  : " + unmodifiableMap);

        System.out.println();

        // =====================================================
// 21. synchronizedList()
// =====================================================

        List<String> normalList = new ArrayList<>();

        normalList.add("Java");
        normalList.add("Python");
        normalList.add("C++");

// Creates a thread-safe List
        List<String> synchronizedList =
                Collections.synchronizedList(normalList);

        System.out.println("Synchronized List : " + synchronizedList);

// Add element safely
        synchronizedList.add("JavaScript");

        System.out.println("After Adding : " + synchronizedList);

        System.out.println();


// =====================================================
// 22. synchronizedSet()
// =====================================================

        Set<Integer> normalSet = new HashSet<>();

        normalSet.add(10);
        normalSet.add(20);
        normalSet.add(30);

// Creates a thread-safe Set
        Set<Integer> synchronizedSet =
                Collections.synchronizedSet(normalSet);

        System.out.println("Synchronized Set : " + synchronizedSet);

        synchronizedSet.add(40);

        System.out.println("After Adding : " + synchronizedSet);

        System.out.println();


// =====================================================
// 23. synchronizedMap()
// =====================================================

        Map<Integer, String> normalMap = new HashMap<>();

        normalMap.put(1, "Java");
        normalMap.put(2, "Python");

// Creates a thread-safe Map
        Map<Integer, String> synchronizedMap =
                Collections.synchronizedMap(normalMap);

        System.out.println("Synchronized Map : " + synchronizedMap);

        synchronizedMap.put(3, "C++");

        System.out.println("After Adding : " + synchronizedMap);

        System.out.println();

        /*
         * NOTE:
         *
         * While iterating over synchronized collections,
         * synchronize manually.
         *
         * Example:
         *
         * synchronized(synchronizedList){
         *     for(String s : synchronizedList){
         *         System.out.println(s);
         *     }
         * }
         */


// =====================================================
// 24. checkedList()
// =====================================================

// Creates a runtime type-safe List
        List<String> checkedList =
                Collections.checkedList(
                        new ArrayList<>(),
                        String.class);

        checkedList.add("Java");
        checkedList.add("Python");

        System.out.println("Checked List : " + checkedList);

// Runtime type checking
// checkedList.add((String)(Object)100); // ClassCastException

        System.out.println();


// =====================================================
// 25. checkedSet()
// =====================================================

// Creates a runtime type-safe Set
        Set<Integer> checkedSet =
                Collections.checkedSet(
                        new HashSet<>(),
                        Integer.class);

        checkedSet.add(10);
        checkedSet.add(20);

        System.out.println("Checked Set : " + checkedSet);

// checkedSet.add((Integer)(Object)"Java"); // ClassCastException

        System.out.println();


// =====================================================
// 26. checkedMap()
// =====================================================

// Creates a runtime type-safe Map
        Map<Integer, String> checkedMap =
                Collections.checkedMap(
                        new HashMap<>(),
                        Integer.class,
                        String.class);

        checkedMap.put(101, "Asif");
        checkedMap.put(102, "Ali");

        System.out.println("Checked Map : " + checkedMap);

// checkedMap.put((Integer)(Object)"One", "Java"); // ClassCastException

        System.out.println();


        /*
         * Why use checked collections?
         *
         * Before Generics (Java 5), collections could store any type.
         *
         * checkedList(), checkedSet() and checkedMap()
         * perform runtime type checking and throw
         * ClassCastException if an invalid type is inserted.
         *
         * Today, Generics usually provide compile-time
         * type safety, so checked collections are rarely needed.
         */

        // =====================================================
// 27. enumeration()
// =====================================================

        List<String> languageList = Arrays.asList(
                "Java",
                "Python",
                "C++");

// Converts Collection into Enumeration
        Enumeration<String> enumeration =
                Collections.enumeration(languageList);

        System.out.println("Enumeration Elements :");

        while (enumeration.hasMoreElements()) {

            System.out.println(enumeration.nextElement());

        }

        System.out.println();


// =====================================================
// 28. list()
// =====================================================

// Convert Enumeration back to List
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");

        Enumeration<String> enumeration2 =
                vector.elements();

        ArrayList<String> convertedList =
                Collections.list(enumeration2);

        System.out.println("Converted List : " + convertedList);

        System.out.println();


// =====================================================
// 29. nCopies()
// =====================================================

// Creates an immutable list containing
// multiple copies of the same object
        List<String> copies =
                Collections.nCopies(5, "Java");

        System.out.println("nCopies : " + copies);

        System.out.println();

// copies.add("Python"); // UnsupportedOperationException


// =====================================================
// 30. indexOfSubList()
// =====================================================

        List<Integer> source =
                Arrays.asList(10,20,30,40,50,60);

        List<Integer> target =
                Arrays.asList(30,40);

        int firstIndex =
                Collections.indexOfSubList(source, target);

        System.out.println("Source List : " + source);

        System.out.println("Target List : " + target);

        System.out.println("First Occurrence Index : " + firstIndex);

        System.out.println();


// =====================================================
// 31. lastIndexOfSubList()
// =====================================================

        List<Integer> source2 =
                Arrays.asList(10,20,30,40,30,40,50);

        List<Integer> target2 =
                Arrays.asList(30,40);

        int lastIndex =
                Collections.lastIndexOfSubList(source2, target2);

        System.out.println("Source List : " + source2);

        System.out.println("Target List : " + target2);

        System.out.println("Last Occurrence Index : " + lastIndex);

        System.out.println();


// =====================================================
// 32. reverseOrder()
// =====================================================

        List<Integer> reverseOrderList =
                new ArrayList<>(
                        Arrays.asList(20,50,10,40,30));

// Sort in descending order
        Collections.sort(
                reverseOrderList,
                Collections.reverseOrder());

        System.out.println("Descending Order : "
                + reverseOrderList);

        System.out.println();


// =====================================================
// 33. newSetFromMap()
// =====================================================

// Creates a Set backed by a Map
        Set<String> mapBackedSet =
                Collections.newSetFromMap(
                        new HashMap<>());

        mapBackedSet.add("Java");
        mapBackedSet.add("Python");
        mapBackedSet.add("Java"); // Duplicate ignored

        System.out.println("Map Backed Set : " + mapBackedSet);

        System.out.println();


// =====================================================
// 34. asLifoQueue()
// =====================================================

        Deque<String> deque = new ArrayDeque<>();

        Queue<String> lifoQueue =
                Collections.asLifoQueue(deque);

        lifoQueue.add("A");
        lifoQueue.add("B");
        lifoQueue.add("C");

        System.out.println("LIFO Queue : " + lifoQueue);

        System.out.println("Remove : " + lifoQueue.remove());

        System.out.println("After Remove : " + lifoQueue);

        System.out.println();


// =====================================================
// 35. emptyIterator()
// =====================================================

        Iterator<String> emptyIterator =
                Collections.emptyIterator();

        System.out.println(
                "Has Next : "
                        + emptyIterator.hasNext());

        System.out.println();


// =====================================================
// 36. emptyListIterator()
// =====================================================

        ListIterator<String> emptyListIterator =
                Collections.emptyListIterator();

        System.out.println(
                "Has Next : "
                        + emptyListIterator.hasNext());

        System.out.println();


// =====================================================
// 37. emptyEnumeration()
// =====================================================

        Enumeration<String> emptyEnumeration =
                Collections.emptyEnumeration();

        System.out.println(
                "Has More Elements : "
                        + emptyEnumeration.hasMoreElements());

        System.out.println();


// =====================================================
// 38. singletonIterator()
// =====================================================

        Iterator<String> singletonIterator =
                (Iterator<String>) Collections.singletonMap("Java","hi");

        System.out.println("Singleton Iterator :");

        while (singletonIterator.hasNext()) {

            System.out.println(singletonIterator.next());

        }

        System.out.println();


// =====================================================
// 39. singletonEnumeration()
// =====================================================

        Enumeration<String> singletonEnumeration =
                Collections.emptyEnumeration();

        System.out.println("Singleton Enumeration :");

        while (singletonEnumeration.hasMoreElements()) {

            System.out.println(singletonEnumeration.nextElement());

        }

        System.out.println();
    }
}
