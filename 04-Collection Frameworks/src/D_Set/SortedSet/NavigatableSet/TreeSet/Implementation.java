package D_Set.SortedSet.NavigatableSet.TreeSet;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        /*
         * ==========================================================
         *           Methods Inherited from Collection
         * ==========================================================
         */

        // Already implemented in Collection topic

        // add(E e)
        // addAll(Collection<? extends E> c)
        //
        // remove(Object o)
        // removeAll(Collection<?> c)
        // retainAll(Collection<?> c)
        //
        // contains(Object o)
        // containsAll(Collection<?> c)
        //
        // size()
        // isEmpty()
        // clear()
        //
        // toArray()
        // toArray(T[] a)
        //
        // stream()
        // parallelStream()
        //
        // equals(Object o)
        // hashCode()


        /*
         * ==========================================================
         *             Methods Inherited from Set
         * ==========================================================
         */

        // Set introduces NO NEW METHODS.
        //
        // It guarantees:
        //
        // ✔ Unique Elements
        // ✔ No Duplicate Values


        /*
         * ==========================================================
         *         Methods Inherited from SortedSet
         * ==========================================================
         */

        // first()
        // last()
        // headSet()
        // tailSet()
        // subSet()
        // comparator()


        /*
         * ==========================================================
         *       Methods Inherited from NavigableSet
         * ==========================================================
         */

        // lower()
        // floor()
        // ceiling()
        // higher()
        //
        // pollFirst()
        // pollLast()
        //
        // descendingSet()
        // descendingIterator()
        //
        // headSet(E, boolean)
        // tailSet(E, boolean)
        // subSet(E, boolean, E, boolean)


        /*
         * ==========================================================
         *            Basic TreeSet Implementation
         * ==========================================================
         */


        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        TreeSet<Object> rawUsers = new TreeSet<>();

        rawUsers.add("Apple");
        rawUsers.add("Banana");
        // rawUsers.add(90); ClassCastException

        /*
         * Unlike HashSet and LinkedHashSet,
         * TreeSet cannot store mixed data types.
         *
         * All elements must be mutually comparable,
         * otherwise ClassCastException is thrown.
         */

        System.out.println("Raw TreeSet");

        System.out.println(rawUsers);

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        TreeSet<Integer> numbers =
                new TreeSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(20);
        // numbers.add(null); NullPointerException

        /*
         * TreeSet compares elements.
         * null cannot be compared.
         */

        System.out.println("TreeSet with Generics");

        System.out.println(numbers);

        /*
         * Output : Automatic Sorting and duplicates removed : [10, 20, 40, 50, 80]
         */


        // ---------------------------------------------------------
        // For Each Loop
        // ---------------------------------------------------------

        System.out.println("\nUsing For Each");

        for(Integer value : numbers){

            System.out.println(value);

        }


        // ---------------------------------------------------------
        // Iterator
        // ---------------------------------------------------------

        System.out.println("\nUsing Iterator");

        Iterator<Integer> iterator =
                numbers.iterator();

        while(iterator.hasNext()){

            System.out.println(iterator.next());

        }


        // ---------------------------------------------------------
        // Working with Custom Class
        // ---------------------------------------------------------

        /*
         * TreeSet requires either:
         * Comparable OR Comparator
                Otherwise
         * ClassCastException occurs.
         */

        TreeSet<Car> cars = new TreeSet<>(Comparator.comparingInt(car -> car.speed));

        cars.add(new Car("BMW",900));
        cars.add(new Car("Toyota",500));
        cars.add(new Car("Audi",700));

        System.out.println("\nCustom Class");

        for(Car car : cars){

            System.out.println(car);

        }


        /*
         * ==========================================================
         *                  Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // TreeSet()
        // ---------------------------------------------------------

        TreeSet<Integer> set1 =
                new TreeSet<>();

        set1.add(30);
        set1.add(10);
        set1.add(20);

        System.out.println("\nTreeSet()");

        System.out.println(set1);

        /*
         * Uses Natural Ordering.
         */


        // ---------------------------------------------------------
        // TreeSet(Collection)
        // ---------------------------------------------------------

        ArrayList<Integer> list =
                new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        TreeSet<Integer> set2 =
                new TreeSet<>(list);

        System.out.println("\nTreeSet(Collection)");

        System.out.println("Original List : " + list);

        System.out.println("TreeSet       : " + set2);

        /*
         * Removes duplicates
         * and sorts automatically.
         */


        // ---------------------------------------------------------
        // TreeSet(Comparator)
        // ---------------------------------------------------------

        TreeSet<Integer> set3 =
                new TreeSet<>(
                        Comparator.reverseOrder());

        set3.add(10);
        set3.add(20);
        set3.add(30);
        set3.add(40);

        System.out.println("\nTreeSet(Comparator)");

        System.out.println(set3);

        /*
         * Uses custom sorting.
         */


        // ---------------------------------------------------------
        // TreeSet(SortedSet)
        // ---------------------------------------------------------

        SortedSet<Integer> source =
                new TreeSet<>();

        source.add(100);
        source.add(50);
        source.add(150);

        TreeSet<Integer> set4 =
                new TreeSet<>(source);

        System.out.println("\nTreeSet(SortedSet)");

        System.out.println(set4);

        /*
         * Copies another
         * SortedSet.
         *
         * Preserves sorting.
         */


        /*
         * ==========================================================
         *                 SortedSet Methods
         * ==========================================================
         */


        // ---------------------------------------------------------
        // first()
        // ---------------------------------------------------------

        TreeSet<Integer> tree =
                new TreeSet<>();

        tree.add(30);
        tree.add(10);
        tree.add(20);
        tree.add(40);
        tree.add(50);

        System.out.println("\n========== first() ==========");

        System.out.println(tree);

        System.out.println("First Element : "
                + tree.first());

        /*
         * Returns the smallest element.
         */


        // ---------------------------------------------------------
        // last()
        // ---------------------------------------------------------

        System.out.println("\n========== last() ==========");

        System.out.println("Last Element : "
                + tree.last());

        /*
         * Returns the largest element.
         */


        // ---------------------------------------------------------
        // headSet()
        // ---------------------------------------------------------

        System.out.println("\n========== headSet() ==========");

        SortedSet<Integer> head =
                tree.headSet(30);

        System.out.println(head);

        /*
         * Returns all elements less than the given value.
           Returns a VIEW.
         */


        // ---------------------------------------------------------
        // tailSet()
        // ---------------------------------------------------------

        System.out.println("\n========== tailSet() ==========");

        SortedSet<Integer> tail =
                tree.tailSet(30);

        System.out.println(tail);

        /*
         * Returns elements greater than or equal to the given value.
         */


        // ---------------------------------------------------------
        // subSet()
        // ---------------------------------------------------------

        System.out.println("\n========== subSet() ==========");

        SortedSet<Integer> subset =
                tree.subSet(20,50);

        System.out.println(subset);

        /*
         * Returns elements
         * from 20 (inclusive)
         * to 50 (exclusive).
         */


        // ---------------------------------------------------------
        // comparator()
        // ---------------------------------------------------------

        System.out.println("\n========== comparator() ==========");

        System.out.println(tree.comparator());

        /*
         * Returns : null
         *
         * when TreeSet uses Natural Ordering.
         */


        /*
         * ==========================================================
         *             NavigableSet Methods
         * ==========================================================
         */

        // ---------------------------------------------------------
        // lower()
        // ---------------------------------------------------------

        System.out.println("\n========== lower() ==========");

        System.out.println(tree.lower(30));

        /*
         * Greatest element strictly less than given element.
         */


        // ---------------------------------------------------------
        // floor()
        // ---------------------------------------------------------

        System.out.println("\n========== floor() ==========");

        System.out.println(tree.floor(30));

        /*
         * Greatest element less than or equal to given element.
         */


        // ---------------------------------------------------------
        // ceiling()
        // ---------------------------------------------------------

        System.out.println("\n========== ceiling() ==========");

        System.out.println(tree.ceiling(35));

        /*
         * Smallest element greater than or equal to given element.
         */


        // ---------------------------------------------------------
        // higher()
        // ---------------------------------------------------------

        System.out.println("\n========== higher() ==========");

        System.out.println(tree.higher(30));

        /*
         * Smallest element strictly greater than given element.
         */


        // ---------------------------------------------------------
        // pollFirst()
        // ---------------------------------------------------------

        TreeSet<Integer> pollFirstDemo =
                new TreeSet<>(tree);

        System.out.println("\n========== pollFirst() ==========");

        System.out.println("Before : "
                + pollFirstDemo);

        System.out.println("Removed : "
                + pollFirstDemo.pollFirst());

        System.out.println("After : "
                + pollFirstDemo);

        /*
         * Removes and returns
         * first element.
         */


        // ---------------------------------------------------------
        // pollLast()
        // ---------------------------------------------------------

        TreeSet<Integer> pollLastDemo =
                new TreeSet<>(tree);

        System.out.println("\n========== pollLast() ==========");

        System.out.println("Before : "
                + pollLastDemo);

        System.out.println("Removed : "
                + pollLastDemo.pollLast());

        System.out.println("After : "
                + pollLastDemo);

        /*
         * Removes and returns
         * last element.
         */


        // ---------------------------------------------------------
        // descendingSet()
        // ---------------------------------------------------------

        System.out.println("\n========== descendingSet() ==========");

        NavigableSet<Integer> descending =
                tree.descendingSet();

        System.out.println(descending);

        /*
         * Returns reverse-order
         * VIEW of TreeSet.
         */


        // ---------------------------------------------------------
        // descendingIterator()
        // ---------------------------------------------------------

        System.out.println("\n========== descendingIterator() ==========");

        Iterator<Integer> descendingIterator =
                tree.descendingIterator();

        while(descendingIterator.hasNext()){

            System.out.println(
                    descendingIterator.next());

        }

        /*
         * Traverses TreeSet
         * in reverse order.
         */


        // ---------------------------------------------------------
        // headSet(E, boolean)
        // ---------------------------------------------------------

        System.out.println("\n========== headSet(E,boolean) ==========");

        NavigableSet<Integer> headInclusive =
                tree.headSet(30,true);

        System.out.println(headInclusive);

        /*
         * true
         * Includes 30.
         */


        // ---------------------------------------------------------
        // tailSet(E, boolean)
        // ---------------------------------------------------------

        System.out.println("\n========== tailSet(E,boolean) ==========");

        NavigableSet<Integer> tailExclusive =
                tree.tailSet(30,false);

        System.out.println(tailExclusive);

        /*
         * false
         * Excludes 30.
         */


        // ---------------------------------------------------------
        // subSet(E,boolean,E,boolean)
        // ---------------------------------------------------------

        System.out.println("\n========== subSet(E,boolean,E,boolean) ==========");

        NavigableSet<Integer> sub =
                tree.subSet(
                        20,
                        true,
                        50,
                        false);

        System.out.println(sub);

        /*
         * From 20
         * (Inclusive)
         *
         * To 50
         * (Exclusive)
         */


        /*
         * ==========================================================
         *                Natural Ordering
         * ==========================================================
         */

        TreeSet<Integer> natural =
                new TreeSet<>();

        natural.add(50);
        natural.add(20);
        natural.add(80);
        natural.add(10);
        natural.add(40);

        System.out.println("\n========== Natural Ordering ==========");

        System.out.println(natural);

        /*
         * Uses Comparable.
         *
         * Elements are stored
         * in Ascending Order.
         */


        /*
         * ==========================================================
         *                    Comparator
         * ==========================================================
         */

        TreeSet<Integer> reverse =
                new TreeSet<>(
                        Comparator.reverseOrder());

        reverse.add(50);
        reverse.add(20);
        reverse.add(80);
        reverse.add(10);
        reverse.add(40);

        System.out.println("\n========== Comparator ==========");

        System.out.println(reverse);

        /*
         * Uses Comparator.
         *
         * Custom sorting order.
         */


        /*
         * ==========================================================
         *                Red-Black Tree
         * ==========================================================
         */

        TreeSet<Integer> rbTree =
                new TreeSet<>();

        rbTree.add(40);
        rbTree.add(20);
        rbTree.add(60);
        rbTree.add(10);
        rbTree.add(30);
        rbTree.add(50);
        rbTree.add(70);

        System.out.println("\n========== Red-Black Tree ==========");

        System.out.println(rbTree);

        /*
         * TreeSet internally
         * uses Red-Black Tree.
         *
         * Automatically Balanced.
         *
         * add()
         * remove()
         * contains()
         *
         * O(log n)
         */


        /*
         * ==========================================================
         *            TreeSet Characteristics
         * ==========================================================
         */

        TreeSet<Integer> characteristics =
                new TreeSet<>();

        characteristics.add(30);
        characteristics.add(10);
        characteristics.add(40);
        characteristics.add(20);

        System.out.println("\nTreeSet Characteristics");

        System.out.println(characteristics);

        /*
         * ✔ Duplicate NOT Allowed
         *
         * ✔ Null NOT Allowed
         *
         * ✔ Sorted Order
         *
         * ✔ Red-Black Tree
         *
         * ✔ Navigation Methods
         *
         * ✔ Range Operations
         *
         * ✔ O(log n)
         */


        /*
         * ==========================================================
         *     HashSet vs LinkedHashSet vs TreeSet
         * ==========================================================
         */

        HashSet<Integer> hashSet =
                new HashSet<>();

        LinkedHashSet<Integer> linkedHashSet =
                new LinkedHashSet<>();

        TreeSet<Integer> treeSet =
                new TreeSet<>();

        int[] values =
                {50,20,80,10,40};

        for(int value : values){

            hashSet.add(value);

            linkedHashSet.add(value);

            treeSet.add(value);

        }

        System.out.println("\nHashSet");

        System.out.println(hashSet);

        System.out.println("\nLinkedHashSet");

        System.out.println(linkedHashSet);

        System.out.println("\nTreeSet");

        System.out.println(treeSet);

        /*
         * HashSet
         *
         * Fast
         *
         * No Order
         *
         *
         * LinkedHashSet
         *
         * Fast
         *
         * Insertion Order
         *
         *
         * TreeSet
         *
         * Sorted Order
         *
         * Navigation Support
         */


        /*
         * ==========================================================
         *               Optimized Overrides
         * ==========================================================
         */

        // same


        /*
         * ==========================================================
         *           Methods Inherited from Object
         * ==========================================================
         */

        // same

        /*
         * ==========================================================
         *                Interview Notes
         * ==========================================================
         */

        /*
         * 1. TreeSet implements
         *    NavigableSet.
         *
         * 2. TreeSet internally
         *    uses Red-Black Tree.
         *
         * 3. TreeSet maintains
         *    Sorted Order.
         *
         * 4. Null values are
         *    NOT allowed.
         *
         * 5. Duplicate values
         *    are ignored.
         *
         * 6. Supports
         *    Range Queries.
         *
         * 7. Supports
         *    Navigation Methods.
         *
         * 8. Average Complexity
         *
         *    add()      O(log n)
         *
         *    remove()   O(log n)
         *
         *    contains() O(log n)
         *
         * 9. Uses Comparable
         *    or Comparator
         *    for sorting.
         *
         * 10. headSet(),
         *     tailSet(),
         *     subSet(),
         *     descendingSet()
         *     return VIEWS,
         *     not copies.
         */


        /*
         * ==========================================================
         *                      End
         * ==========================================================
         */

        System.out.println(
                "\nTreeSet Implementation Completed.");

    }

}


/*
 * ==========================================================
 *                  Custom Class
 * ==========================================================
 */

class Car {

    String brand;
    int speed;

    Car(String brand,
        int speed) {

        this.brand = brand;
        this.speed = speed;

    }

    @Override
    public String toString() {

        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';

    }

}

/*
 * ==========================================================
 * IMPORTANT
 * ==========================================================
 *
 * TreeSet requires either:
 *
 * 1. Comparable
 *
 * OR
 *
 * 2. Comparator
 *
 * Otherwise
 *
 * ClassCastException
 * will occur.
 *
 * ==========================================================
 */