package B_CollectionsAndIterator;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        // Collection is an Interface
        // ArrayList is a Class that implements Collection indirectly

        Collection<Integer> nums = new ArrayList<>(); // Integer is used for type safety as a concept of generics

        // add() method
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println("After add(): " + nums);

        // size()
        System.out.println("Size : " + nums.size());

        // contains()
        System.out.println("Contains 20 ? " + nums.contains(20));
        System.out.println("Contains 100 ? " + nums.contains(100));

        // isEmpty()
        System.out.println("Is Empty ? " + nums.isEmpty());

        // remove()
        nums.remove(20);
        System.out.println("After remove(20): " + nums);

        // addAll()
        Collection<Integer> other = new ArrayList<>();

        other.add(50);
        other.add(60);

        nums.addAll(other);
        System.out.println("After addAll(): " + nums);
        System.out.println("After addAll() other list values: " + other);

        // containsAll()
        System.out.println("Contains All (you see other items 50,60 present in nums list)? " + nums.containsAll(other)); // Checks other list items available in the nums list ? if yes true otherwise false

        // equals()
        // Compares two collections
        Collection<Integer> compareList = new ArrayList<>();

        compareList.add(10);
        compareList.add(30);
        compareList.add(40);
        compareList.add(50);
        compareList.add(60);

        System.out.println("\ncompareList : " + compareList);
        System.out.println("nums : " + nums);

        System.out.println("equals() ? " + nums.equals(compareList));

        // hashCode()
        // Returns hash value of collection
        System.out.println("nums hashCode : " + nums.hashCode());
        System.out.println("compareList hashCode : " + compareList.hashCode());

        // toArray()
        // Convert Collection into Array
        Object[] arr = nums.toArray();

        System.out.println("\nArray Elements");

        for (Object obj : arr) {

            System.out.println(obj);
        }

        // toArray(T[] a)
        // Converts Collection into Typed Array
        Integer[] typedArray = nums.toArray(new Integer[0]);

        System.out.println("\nTyped Array Elements");

        for(Integer value : typedArray)
        {
            System.out.println(value);
        }

        // retainAll()
        // Keeps only common elements
        Collection<Integer> retainDemo = new ArrayList<>();

        retainDemo.add(10);
        retainDemo.add(50);

        System.out.println("\nItems in nums"+nums);
        System.out.println("Items in retainDemo"+retainDemo);

        nums.retainAll(retainDemo);

        System.out.println("After retainAll() nums become: " + nums);

        // removeAll()
        // Removes all matching elements
        nums.add(100);
        nums.add(200);

        System.out.println("\nBefore removeAll() nums is: " + nums);
        System.out.println("Before removeAll() retainDemo is: " + retainDemo);

        nums.removeAll(retainDemo); // removes item of retainDemo from nums items

        System.out.println("After removeAll(): " + nums);

        // clear()
        // Removes all elements
        nums.clear();

        System.out.println("\nAfter clear(): " + nums);

        // isEmpty()
        System.out.println("Is Empty ? " + nums.isEmpty());





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

        Iterable<Integer> iterable = iteratorDemo; // possible (If you want to use iterable Interface but not recommended)
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

        // To simplify use of above method java implement this for each loop but in backend above while loop process occurs

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

        Iterable<Integer> iterable1 = spliteratorList; // possible (If you want to use iterable Interface but not recommended)
        Spliterator<Integer> sp = spliteratorList.spliterator(); // Returns a Spliterator Object

        // tryAdvance() - Move one step forward then Execute given action
        System.out.println("\ntryAdvance()");

        sp.tryAdvance(System.out::println);  // System.out::println means x -> System.out.println(x)

        // Now one element has already been processed.

        // estimateSize() - prints size of remaining elements since one gets processed now remains 3
        System.out.println("\nestimateSize()");
        System.out.println(sp.estimateSize());

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

    }
}