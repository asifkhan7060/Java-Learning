package A_Collection;

import java.util.*;

// Collections and Iterable

public class Implementation {

    public static void main(String[] args) {

        /**
         =====================================================
                       Collection Declaration
         =====================================================

        Syntax: ReferenceType<GenericType> referenceVariable = new ConcreteClass<>();

        Ex: Collection<Integer> nums = new ArrayList<>();

        Explanation:
        Collection        -> Interface (Reference Type)
        Integer           -> Generic Type (for Type Safety)
        nums              -> Reference Variable
        new               -> Object Creation Keyword
        ArrayList         -> Concrete / Implementation Class
        ()                -> Constructor Call


         // Methods of Collection

         | Letter | Meaning  | Methods |
         |--------|----------|---------|
         | A      | Add      | add(), addAll() |
         | R      | Remove   | remove(), removeAll(), retainAll(), removeIf() |
         | C      | Check    | contains(), containsAll() |
         | C      | Count    | size(), isEmpty() |
         | C      | Clear    | clear() |
         | C      | Convert  | toArray(), toArray(T[] a) |
         | C      | Compare  | equals(), hashCode() |

         Memory Word: ARCCCCC or AR5C
        */

        Collection<Integer> nums = new ArrayList<>();

        // =====================================================
        // Add
        // =====================================================

        // add() - Adds a single element
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println("nums : " + nums);

        // addAll() - Adds all elements from another collection
        Collection<Integer> other = new ArrayList<>();

        other.add(50);
        other.add(60);
        other.add(10); // since 10 exist already in nums then also it gets added

        System.out.println("other : " + other);

        nums.addAll(other);

        System.out.println("After addAll() : " + nums);

        System.out.println();


        // =====================================================
        // Remove
        // =====================================================

        System.out.println("nums : "+nums);

        // remove() - Removes a specific element
        nums.remove(20);
        // nums.remove(100); not exist no error nothing happens

        System.out.println("After remove(20) : " + nums);

        // removeAll() - Removes all matching elements
        Collection<Integer> removeList = new ArrayList<>();

        removeList.add(30);
        removeList.add(50);

        System.out.println("removeList : "+removeList);

        nums.removeAll(removeList); // removeList elements exist in nums get removed

        System.out.println("After removeAll() : " + nums);

        // retainAll() - Keeps only common elements
        Collection<Integer> keepList = new ArrayList<>();

        keepList.add(10);
        keepList.add(60);

        System.out.println("keepList : "+keepList);

        nums.retainAll(keepList);

        System.out.println("After retainAll() : " + nums);

        System.out.println();


        // =====================================================
        // Check
        // =====================================================

        System.out.println("nums : "+nums);

        // contains() - Checks whether an element exists
        System.out.println("Contains 10 ? - " + nums.contains(10));
        System.out.println("Contains 100 ? - " + nums.contains(100));

        // containsAll() - Checks whether all elements of another collection exist
        System.out.println("keepList : "+keepList);
        System.out.println("Contains All ? " + nums.containsAll(keepList));

        System.out.println();


        // =====================================================
        // Count
        // =====================================================

        System.out.println("nums : "+nums);

        // size() - Returns number of elements
        System.out.println("Size : " + nums.size());

        // isEmpty() - Checks whether collection is empty
        System.out.println("Is Empty ? " + nums.isEmpty());

        System.out.println();


        // =====================================================
        // Clear
        // =====================================================

        System.out.println("nums : "+nums);

        // Create a backup because clear() removes everything
        Collection<Integer> backup = new ArrayList<>(nums);

        // clear() - Removes all elements
        nums.clear();

        System.out.println("After clear() : " + nums);
        System.out.println("Is Empty ? " + nums.isEmpty());

        System.out.println();

        // Restore data for remaining examples
        nums.addAll(backup);


        // =====================================================
        // Convert
        // =====================================================

        System.out.println("nums : "+nums);

        // toArray() - Converts Collection into Object Array
        Object[] objectArray = nums.toArray();

        System.out.println("Object Array");

        for (Object obj : objectArray) {
            System.out.println(obj);
        }

        System.out.println();

        // toArray(T[] a) - Converts Collection into Typed Array
        Integer[] typedArray = nums.toArray(new Integer[0]); // 0 - "I'm giving Java an empty Integer array. You create a new array of the required size if needed"

        /*
        Java sees:
        Collection Size = 3 (nums : [10, 60, 10])
        Array Size = 0 (Integer[0])

        Since the array is too small, Java automatically creates a new array. [10,20,30] and returns it.
         */

        System.out.println("Typed Array");

        for (Integer value : typedArray) {
            System.out.println(value);
        }

        System.out.println();


        // =====================================================
        // Compare
        // =====================================================

        // equals() - Compares two collections
        Collection<Integer> compareList = new ArrayList<>();

        compareList.add(10);
        compareList.add(60);

        System.out.println("nums        : " + nums);
        System.out.println("compareList : " + compareList);

        System.out.println("equals() : " + nums.equals(compareList));

        /*
        NOTE :
        containsAll() → "Are all elements of the other collection present in this collection?"
        equals() → "Are both collections exactly the same?" (it checks as exact with order,elements,size) */

        // hashCode() - Returns hash value

        Collection<Integer> compareList1 = new ArrayList<>();

        compareList1.add(10);
        compareList1.add(60);

        System.out.println("nums hashCode        : " + nums.hashCode());
        System.out.println("compareList hashCode : " + compareList.hashCode());
        System.out.println("compareList1 hashCode : " + compareList1.hashCode()); // same as compareList


        // Other methods (stream, parallel stream, remove if)

        // stream()
        // Creates a sequential stream from the collection.

        // Stream is not Iterable, so we cannot use forEach Loop like this - for (Stream obj : stream) {}

        System.out.println("\nUsing stream()");

        nums.stream().forEach(System.out::println);  // Method Reference and Lambda topic we - will study in detail ahead

        // parallelStream()
        // Creates a parallel stream.
        // Elements may not be processed in order.

        System.out.println("\nUsing parallelStream()");

        nums.parallelStream().forEach(System.out::println); // Method Reference and Lambda topic we - will study in detail ahead

        System.out.println();

        // removeIf() - Removes elements that satisfy the given condition (Java 8+)
        System.out.println("Values in nums: "+nums);
        nums.clear();
        nums.addAll(Arrays.asList(2,3,4,5,6,9)); // Adding new list via array

        System.out.println("Before removeIf() : " + nums);

        // Remove all even numbers
        nums.removeIf(num -> num % 2 == 0);

        System.out.println("After removeIf() (Removed Even Numbers) : " + nums);

        // Restore the collection for the remaining examples
        nums.clear();
        nums.addAll(Arrays.asList(10, 60));
        System.out.println();



        // =====================================================
        //                    ITERABLE
        // =====================================================

        System.out.println("\n=========================");
        System.out.println("Iterator Examples");
        System.out.println("=========================");

        /*
        Remember :

        Collection/List/Set/Queue/Map
            → Store Data

        Iterator/ListIterator/Spliterator
            → Traverse Data

        So listIterator(),iterator() and splititerator() can never be assigned to Collection<Integer> because it doesn't store data; it traverses data.
         */

        /*
          Iterable (Interface)
            │
            │ Provides Methods
            │
            │── forEach()
            │
            │
            ├── iterator() ─── returns ──► Iterator (Interface) Ex: Iterator<Integer> it = nums.iterator();
            │                                │
            │                                └── ListIterator (Interface)
            │
            └── spliterator() ─► returns ─► Spliterator (Interface)  Ex: Spliterator<Integer> sp = num.spliterator();
         */

        /*
         1. Iterable
            Root interface for traversal.
            Means: "This object can be traversed."
            Provides methods:
            iterator()
            spliterator()
            forEach()
         */

        /*
         2. Iterator
            Used to move through elements forward only.
            Iterator → Forward traversal.
            Main methods:
            hasNext()
            next()
            remove()
         */

        /*
         3. ListIterator
            Child interface of Iterator. (i.e public interface ListIterator<E> extends Iterator<E>)
            ListIterator → Forward + Backward traversal.
            It can use Iterator methods like hasNext(), next() ,remove()
            Extra methods added : hasPrevious(), previous(), add(), set()
         */

        /*
        4. Spliterator
            Introduced in Java 8.
            Means: Split + Iterator
            Used for: Streams API, Parallel Processing, Large Data Traversal
            Methods:
            tryAdvance()
            trySplit()
            estimateSize()
            characteristics()
         */

        // =====================================================
        // ITERATOR
        // =====================================================

        Collection<Integer> iteratorDemo = new ArrayList<>();

        iteratorDemo.add(10);
        iteratorDemo.add(20);
        iteratorDemo.add(30);
        iteratorDemo.add(40);

        System.out.println("Iterator Demo Data : " + iteratorDemo);

        // iterator(), hasNext(), next(), remove()
        Iterator<Integer> it = iteratorDemo.iterator();

        System.out.println("\nUsing Iterator");

        while (it.hasNext()) { // checks for next value

            Integer value = it.next(); // stores the next value

            System.out.println(value);

            if (value == 20) {
                it.remove();   // Removes the current element
            }
        }

        System.out.println("After Removing 20 : " + iteratorDemo);

        // =====================================================
        // FOR EACH LOOP
        // =====================================================

        // To simplify use of above method java implement this for each loop but in backend (above while loop) process occurs

        System.out.println("\nUsing For Each Loop");

        for (Integer value : iteratorDemo) {
            System.out.println(value);
        }

        // =====================================================
        // LIST ITERATOR
        // =====================================================

        System.out.println("\n=========================");
        System.out.println("ListIterator Examples");
        System.out.println("=========================");

        // Collection<Integer> list = new ArrayList<>();
        // Not recommended here if we want to use listIterator()

        /*
        Reason:

        listIterator() method belongs to the List interface not the Collection interface.

        If we create:
        Collection<Integer> list = new ArrayList<>();

        Java allows only Collection methods such as:
        add(), remove(), contains(), size(), iterator(), clear() (Since here iterator() is present hence in above iterator we can use it directly via collection )

        But listIterator() is not available because the reference type is Collection. Therefore, for ListIterator examples we use:
        List<Integer> list = new ArrayList<>(); or ArrayList<Integer> list = new ArrayList<>();

        so that we can access:
        listIterator(), get(), set(), indexOf(), subList()

        Rule:
        Reference Type decides which methods can be accessed.
        Object Type decides which implementation runs.
        */

        // NOTE - Observe the cursor location because here its matter

        List<Integer> list = new ArrayList<>(); // or ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List : " + list);

        // hasNext(), next()

        ListIterator<Integer> listIt = list.listIterator(); // listIterator() method returns ListIterator<Integer>

        System.out.println("\nForward Traversal");

        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        // cursor now at end

        // hasPrevious(), previous()

        System.out.println("\nBackward Traversal");

        while (listIt.hasPrevious()) {

            System.out.println(listIt.previous());
        }

        // cursor now at first

        // add()
        listIt.next(); // moves towards 2nd position
        listIt.add(15); // adds 15 to 2nd position

        System.out.println("\nAfter add(15)");
        System.out.println(list);

        // set()
        while (listIt.hasNext()) { // checks for 3rd position (i.e 20)

            Integer value = listIt.next(); // receives 20 at 3rd position

            if (value == 20) {

                listIt.set(25);
            }
        }

        // Now cursor reached at end

        System.out.println("\nAfter set()");
        System.out.println(list);

        // Since cursor reached at end , below while given not performed

        // remove()
        while (listIt.hasNext()) { // false

            Integer value = listIt.next();

            if (value == 30) {

                listIt.remove();
            }
        }

        System.out.println("\nAfter remove()");
        System.out.println(list);



        // =====================================================
        // SPLITERATOR
        // =====================================================

        System.out.println("\n=========================");
        System.out.println("Spliterator Examples");
        System.out.println("=========================");

        Collection<Integer> spliteratorList = new ArrayList<>(); //

        spliteratorList.add(10);
        spliteratorList.add(20);
        spliteratorList.add(30);
        spliteratorList.add(40);

        Spliterator<Integer> sp = spliteratorList.spliterator();

        // tryAdvance() - Move one step forward then Execute given action
        System.out.println("\ntryAdvance()");

        sp.tryAdvance(System.out::println);  // Method reference topic (study ahead in detail)

        // Now one element has already been processed.

        // estimateSize() - prints size of remaining elements since one gets processed now remains 3
        // May return Long.MAX_VALUE if size is unknown
        System.out.println("\nestimateSize()");
        System.out.println(sp.estimateSize());

        // getExactSizeIfKnown()
        // Returns the exact number of remaining elements.
        // Returns -1 if the exact size is unknown.

        System.out.println("\ngetExactSizeIfKnown()");
        System.out.println(sp.getExactSizeIfKnown());

        // characteristics() - provides the bit mask number (always same on every printing as each no indicate something)

        // It represents properties like: Ordered, Sized, Non-null, Immutable, Sorted

        System.out.println("\ncharacteristics()");
        System.out.println(sp.characteristics());

        // Usually used in such as way -
        if(sp.hasCharacteristics(Spliterator.ORDERED))
        {
            System.out.println("Ordered");
        }

        // trySplit() - Java tries to divide the remaining data.
        Spliterator<Integer> splitPart = sp.trySplit();

        System.out.println("\ntrySplit()");

        if (splitPart != null) {

            splitPart.forEachRemaining(System.out::println); // here remaining next element gets printed (i.e 20 as 10 already processed)
        }

        System.out.println("\nRemaining Elements"); //printing the remaining elements....

        sp.forEachRemaining(System.out::println);

        // getComparator()
        
        /*
        Returns the Comparator used to sort the collection.

        Works only for SORTED collections (e.g., TreeSet, TreeMap).

        ArrayList is NOT a sorted collection. It only maintains
        insertion order, so calling getComparator() on its
        Spliterator throws IllegalStateException.

        Recommended:

        if (sp.hasCharacteristics(Spliterator.SORTED)) {
            System.out.println(sp.getComparator());
        }
        */
    }
}