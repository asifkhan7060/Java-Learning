package B_Collection_and_Iterator;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        // =====================================================
        // Collection Declaration
        // =====================================================

        // Syntax:
        // ReferenceType<GenericType> referenceVariable = new ConcreteClass<>();

        /*
        Collection<Integer> nums = new ArrayList<>();

        // Collection is an Interface
        // ArrayList is a Class that implements Collection indirectly

        Explanation:

        Collection        -> Interface (Reference Type)
        Integer           -> Generic Type (Type Parameter)
        nums              -> Reference Variable
        new               -> Object Creation Keyword
        ArrayList         -> Concrete / Implementation Class
        ()                -> Constructor Call
        new ArrayList<>() -> Creates an instance (object) of ArrayList


        Why <Integer>?
        ---------------

        Generics provide type safety.

        Only Integer objects can be stored in this collection.

        Example:

        nums.add(10);        // ✔ Allowed
        nums.add(20);        // ✔ Allowed
        nums.add("Java");    // ✘ Compile-time Error


        Without Generics:

        Collection nums = new ArrayList(); // Raw Type
        // Collection<Object> nums = new ArrayList<>();  // preferred

        nums.add(10);
        nums.add("Java");
        nums.add(true);

        Different object types can be added, which may cause
        runtime errors while retrieving elements.


        =====================================================
        Loose Coupling
        =====================================================

        We program to the interface, not the implementation.

        ✔ Preferred

        Collection<Integer> nums = new ArrayList<>();

        Because the implementation can be changed easily.

        Collection<Integer> nums = new LinkedList<>();
        Collection<Integer> nums = new HashSet<>();

        (The reference type remains the same.)


        =====================================================
        Can we create an object of an interface?
        =====================================================

        ✘ No

        Collection<Integer> nums = new Collection<>();

        Reason:

        Collection is an interface, and interfaces cannot
        be instantiated.

        ✔ We must create an object of a concrete class.

        Collection<Integer> nums = new ArrayList<>();
        Collection<Integer> nums = new LinkedList<>();
        Collection<Integer> nums = new HashSet<>();


        =====================================================
        Which Reference Types Can Be Used?
        =====================================================

        Depending on the implementation class:

        Collection<Integer> c = new ArrayList<>();
        List<Integer>       l = new ArrayList<>();
        Iterable<Integer>   i = new ArrayList<>();

        Collection<Integer> c = new LinkedList<>();
        List<Integer>       l = new LinkedList<>();
        Deque<Integer>      d = new LinkedList<>();
        Queue<Integer>      q = new LinkedList<>();
        Iterable<Integer>   i = new LinkedList<>();

        Collection<Integer> c = new HashSet<>();
        Set<Integer>        s = new HashSet<>();
        Iterable<Integer>   i = new HashSet<>();

        The reference type must be a superclass or interface
        implemented by the concrete class.
        */

        Collection<Integer> nums = new ArrayList<>(); // Integer is used for type safety (Generics)

        // Methods : Add → Remove → Check → Count → Clear → Convert → Compare

        // =====================================================
        // Add
        // =====================================================

        // add() - Adds a single element
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println("After add() : " + nums);

        // addAll() - Adds all elements from another collection
        Collection<Integer> other = new ArrayList<>();

        other.add(50);
        other.add(60);

        nums.addAll(other);

        System.out.println("After addAll() : " + nums);
        System.out.println("Other Collection : " + other);

        System.out.println();


        // =====================================================
        // Remove
        // =====================================================

        // remove() - Removes a specific element
        nums.remove(20);

        System.out.println("After remove(20) : " + nums);

        // removeAll() - Removes all matching elements
        Collection<Integer> removeList = new ArrayList<>();

        removeList.add(30);
        removeList.add(50);

        nums.removeAll(removeList);

        System.out.println("After removeAll() : " + nums);

        // retainAll() - Keeps only common elements
        Collection<Integer> keepList = new ArrayList<>();

        keepList.add(10);
        keepList.add(60);

        nums.retainAll(keepList);

        System.out.println("After retainAll() : " + nums);

        System.out.println();


        // =====================================================
        // Check
        // =====================================================

        // contains() - Checks whether an element exists
        System.out.println("Contains 10 ? " + nums.contains(10));
        System.out.println("Contains 100 ? " + nums.contains(100));

        // containsAll() - Checks whether all elements of another collection exist
        System.out.println("Contains All ? " + nums.containsAll(keepList));

        System.out.println();


        // =====================================================
        // Count
        // =====================================================

        // size() - Returns number of elements
        System.out.println("Size : " + nums.size());

        // isEmpty() - Checks whether collection is empty
        System.out.println("Is Empty ? " + nums.isEmpty());

        System.out.println();


        // =====================================================
        // Clear
        // =====================================================

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
        Collection Size = 3
        Array Size = 0

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
        One-Line Revision
        containsAll() → "Are all elements of the other collection present in this collection?"
        equals() → "Are both collections exactly the same?" (it checks as exact with order,elements,size) */

        // hashCode() - Returns hash value
        System.out.println("nums hashCode        : " + nums.hashCode());
        System.out.println("compareList hashCode : " + compareList.hashCode());


        // Other methods (stream, parallel stream, remove if)

        // stream()
        // Creates a sequential stream from the collection.

        System.out.println("\nUsing stream()");

        nums.stream().forEach(System.out::println);

        // parallelStream()
        // Creates a parallel stream.
        // Elements may not be processed in order.

        System.out.println("\nUsing parallelStream()");

        nums.parallelStream().forEach(System.out::println);

        System.out.println();

        // removeIf() - Removes elements that satisfy the given condition (Java 8+)
        System.out.println("Values in nums: "+nums);
        nums.clear();
        nums.addAll(Arrays.asList(10, 20, 30, 40, 50, 60)); // Adding new list via array

        System.out.println("Before removeIf() : " + nums);

        // Remove all even numbers
        nums.removeIf(num -> num % 2 == 0);

        System.out.println("After removeIf() (Removed Even Numbers) : " + nums);

        // Restore the collection for the remaining examples
        nums.clear();
        nums.addAll(Arrays.asList(10, 60));




        // =====================================================
        //                    ITERATOR
        // =====================================================

        System.out.println("\n=========================");
        System.out.println("Iterator Examples");
        System.out.println("=========================");

        /*
        A good rule:

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

        Collection<Integer> iteratorDemo = new ArrayList<>();

        iteratorDemo.add(10);
        iteratorDemo.add(20);
        iteratorDemo.add(30);
        iteratorDemo.add(40);

        System.out.println("Iterator Demo Data : " + iteratorDemo);

        // iterator(), hasNext(), next()

        Iterator<Integer> it = iteratorDemo.iterator(); // iterator() returns an Iterator object. Therefore, we store the returned object in an Iterator reference.

        System.out.println("\nUsing Iterator");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // remove()
        System.out.println("\nIterator remove() Demo");

        Iterator<Integer> itr = iteratorDemo.iterator();

        while (itr.hasNext()) {

            Integer value = itr.next();

            if (value == 20) {

                itr.remove();
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

        /*
        ListIterator
            Child interface of Iterator. (i.e public interface ListIterator<E> extends Iterator<E>)
            ListIterator → Forward + Backward traversal.
            It has a method listIterator() that returns ListIterator<Integer>
            It can use Iterator methods like hasNext(), next() ,remove()
            Extra methods added : hasPrevious(), previous(), add(), set()
         */

        // Collection<Integer> list = new ArrayList<>();
        // Not recommended here if we want to use listIterator()

        /*
        Reason:

        listIterator() method belongs to the List interface,
        not the Collection interface.

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

        // hasPrevious(), previous()

        System.out.println("\nBackward Traversal");

        while (listIt.hasPrevious()) {

            System.out.println(listIt.previous());
        }

        // add()
        listIt.next();
        listIt.add(15);

        System.out.println("\nAfter add(15)");
        System.out.println(list);

        // set()
        while (listIt.hasNext()) {

            Integer value = listIt.next();

            if (value == 20) {

                listIt.set(25);
            }
        }

        System.out.println("\nAfter set()");
        System.out.println(list);

        // remove()
        while (listIt.hasNext()) {

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

        /*
        /*
          Spliterator
            Introduced in Java 8.
            Means: Split + Iterator
            Used for: Streams API, Parallel Processing, Large Data Traversal
            Methods:
            tryAdvance()
            trySplit()
            estimateSize()
            characteristics()
         */

        Collection<Integer> spliteratorList = new ArrayList<>(); //

        spliteratorList.add(10);
        spliteratorList.add(20);
        spliteratorList.add(30);
        spliteratorList.add(40);

        Spliterator<Integer> sp = spliteratorList.spliterator(); // Returns a Spliterator Object

        // tryAdvance() - Move one step forward then Execute given action
        System.out.println("\ntryAdvance()");

        sp.tryAdvance(System.out::println);  // System.out::println means x -> System.out.println(x)

        // Now one element has already been processed.

        // estimateSize() - prints size of remaining elements since one gets processed now remains 3
        System.out.println("\nestimateSize()");
        System.out.println(sp.estimateSize());

        // getExactSizeIfKnown()
        // Returns the exact number of remaining elements.
        // Returns -1 if the exact size is unknown.

        System.out.println("\ngetExactSizeIfKnown()");
        System.out.println(sp.getExactSizeIfKnown());

        // characteristics() - provides the bit mask number (always same on every printing as each no indicate something)
        /*
        It represents properties like:
        Ordered
        Sized
        Non-null
        Immutable
        Sorted
         */
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

        System.out.println("\nRemaining Elements"); //printing the remaining elements

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