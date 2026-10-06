package C_Set.SortedSet.NavigatableSet.TreeSet;

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
         * All elements must be mutually comparable, otherwise ClassCastException is thrown.
         */

        System.out.println("Raw TreeSet");

        System.out.println(rawUsers);

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        TreeSet<Integer> numbers = new TreeSet<>();

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
        // Working with Custom Class
        // ---------------------------------------------------------

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

        TreeSet<Integer> set1 = new TreeSet<>(); // Normal (Natural Ordering)

        set1.add(30);
        set1.add(10);
        set1.add(20);

        System.out.println("\nTreeSet()");

        System.out.println(set1);


        // ---------------------------------------------------------
        // TreeSet(Collection)
        // ---------------------------------------------------------

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        TreeSet<Integer> set2 = new TreeSet<>(list);

        System.out.println("\nTreeSet(Collection)");

        System.out.println("Original List : " + list);

        System.out.println("TreeSet       : " + set2);

        /*
         * Removes duplicates and sorts automatically.
         */


        // ---------------------------------------------------------
        // TreeSet(Comparator)
        // ---------------------------------------------------------

        TreeSet<Integer> set3 = new TreeSet<>(Comparator.reverseOrder()); // Uses custom sorting

        set3.add(10);
        set3.add(20);
        set3.add(30);
        set3.add(40);

        System.out.println("\nTreeSet(Comparator)");

        System.out.println(set3);


        // ---------------------------------------------------------
        // TreeSet(SortedSet)
        // ---------------------------------------------------------

        SortedSet<Integer> source = new TreeSet<>();

        source.add(100);
        source.add(50);
        source.add(150);

        TreeSet<Integer> set4 = new TreeSet<>(source); // Copies another SortedSet by Preserving sorting

        System.out.println("\nTreeSet(SortedSet)");

        System.out.println(set4);


        /*
         * ==========================================================
         *                 SortedSet Methods
         * ==========================================================
         */

        // ---------------------------------------------------------
        // first()
        // ---------------------------------------------------------

        TreeSet<Integer> tree = new TreeSet<>(); // Natural Ordering

        tree.add(30);
        tree.add(10);
        tree.add(20);
        tree.add(40);
        tree.add(50);

        System.out.println("\n========== first() ==========");

        System.out.println(tree);

        System.out.println("First Element : " + tree.first()); // Returns the smallest element

        // ---------------------------------------------------------
        // last()
        // ---------------------------------------------------------

        System.out.println("\n========== last() ==========");

        System.out.println("Last Element : " + tree.last()); // Returns the largest element

        // ---------------------------------------------------------
        // headSet()
        // ---------------------------------------------------------

        System.out.println("\n========== headSet() ==========");

        SortedSet<Integer> head = tree.headSet(30);

        System.out.println(head);

        /*
         * Returns all elements less than the given value.
           Returns a VIEW.
         */

        // ---------------------------------------------------------
        // tailSet()
        // ---------------------------------------------------------

        System.out.println("\n========== tailSet() ==========");

        SortedSet<Integer> tail = tree.tailSet(30);

        System.out.println(tail);

        /*
         * Returns elements greater than or equal to the given value.
         */

        // ---------------------------------------------------------
        // subSet()
        // ---------------------------------------------------------

        System.out.println("\n========== subSet() ==========");

        SortedSet<Integer> subset = tree.subSet(20,50);

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
         * when TreeSet uses Natural Ordering.
         */

        // What if? If It's not natural ordering

        TreeSet<Integer> checkForComparator = new TreeSet<>(Collections.reverseOrder());

        System.out.println(checkForComparator.comparator());


        /*
         * ==========================================================
         *             NavigableSet Methods
         * ==========================================================
         */

        // ---------------------------------------------------------
        // lower()
        // ---------------------------------------------------------

        System.out.println("\n========== lower() ==========");

        System.out.println(tree.lower(30)); // Greatest element strictly less than given element.

        // ---------------------------------------------------------
        // higher()
        // ---------------------------------------------------------

        System.out.println("\n========== higher() ==========");

        System.out.println(tree.higher(30)); // Smallest element strictly greater than given element

        // ---------------------------------------------------------
        // floor()
        // ---------------------------------------------------------

        System.out.println("\n========== floor() ==========");

        System.out.println(tree.floor(30)); // Greatest element less than or equal to given element
        System.out.println(tree.floor(28)); // 28 not in list so o/p will be less than 28 which is 20

        // ---------------------------------------------------------
        // ceiling()
        // ---------------------------------------------------------

        System.out.println("\n========== ceiling() ==========");

        System.out.println(tree.ceiling(30)); // Smallest element greater than or equal to given element.
        System.out.println(tree.ceiling(36)); // 36 not in list so greater than 36 is 40 in list

        // ---------------------------------------------------------
        // pollFirst()
        // ---------------------------------------------------------

        TreeSet<Integer> pollFirstDemo = new TreeSet<>(tree);

        System.out.println("\n========== pollFirst() ==========");

        System.out.println("Before : " + pollFirstDemo);

        System.out.println("Removed : " + pollFirstDemo.pollFirst());

        System.out.println("After : " + pollFirstDemo); // Removes and returns first element

        // ---------------------------------------------------------
        // pollLast()
        // ---------------------------------------------------------

        TreeSet<Integer> pollLastDemo = new TreeSet<>(tree);

        System.out.println("\n========== pollLast() ==========");

        System.out.println("Before : " + pollLastDemo);

        System.out.println("Removed : " + pollLastDemo.pollLast());

        System.out.println("After : " + pollLastDemo); // Removes and returns last element.

        // ---------------------------------------------------------
        // headSet(E, boolean)
        // ---------------------------------------------------------

        System.out.println("\n========== headSet(E,boolean) ==========");

        NavigableSet<Integer> headInclusive = tree.headSet(30,true); // it includes 30 also with its low numbers

        System.out.println(headInclusive);

        // ---------------------------------------------------------
        // tailSet(E, boolean)
        // ---------------------------------------------------------

        System.out.println("\n========== tailSet(E,boolean) ==========");

        NavigableSet<Integer> tailExclusive = tree.tailSet(30,false); // it excludes 30 with its high numbers

        System.out.println(tailExclusive);

        // ---------------------------------------------------------
        // subSet(E,boolean,E,boolean)
        // ---------------------------------------------------------

        System.out.println("\n========== subSet(E,boolean,E,boolean) ==========");

        NavigableSet<Integer> sub = tree.subSet(20, true, 50, false);

        System.out.println(sub);


        // ---------------------------------------------------------
        // descendingSet()
        // ---------------------------------------------------------

        System.out.println("\n========== descendingSet() ==========");

        NavigableSet<Integer> descending = tree.descendingSet();

        System.out.println(descending);

        /*
         * Returns reverse-order
         * VIEW of TreeSet.
         */

        // ---------------------------------------------------------
        // descendingIterator()
        // ---------------------------------------------------------

        System.out.println("\n========== descendingIterator() ==========");

        Iterator<Integer> descendingIterator = tree.descendingIterator();

        while(descendingIterator.hasNext()){

            System.out.println(descendingIterator.next());
        }

        /*
         * Traverses TreeSet
         * in reverse order.
         */

        System.out.println("\nTreeSet Implementation Completed.");

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