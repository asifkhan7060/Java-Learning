package C_Set.HashSet;

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
        // It only guarantees:
        //
        // ✔ Unique Elements
        // ✔ No Duplicate Values
        //
        // All methods are inherited from Collection.


        /*
         * ==========================================================
         *            Basic HashSet Implementation
         * ==========================================================
         */

        HashSet<String> users = new HashSet<>();

        users.add("Rudra");
        users.add("Haya");
        users.add("Arman");
        users.add("Arman");   // Duplicate (ignored)
        //users.add(100);     // Compile Time Error
        users.add(null);      // Only one null allowed
        users.add("Arya");
        users.add(null);      // Ignored
        users.add("Ahmed");

        System.out.println(users); // Output order is NOT guaranteed


        // ---------------------------------------------------------
        // Working with Custom Class
        // ---------------------------------------------------------

        // Since equals() and hashCode() are NOT overridden in class, HashSet treats every Car object as different.

        HashSet<Car> cars = new HashSet<>();

        cars.add(new Car("BMW", 900));
        cars.add(new Car("Toyota", 500));
        cars.add(new Car("BMW", 900));    // Looks same values like above but It is Different Object so both gets printed

        System.out.println("\nCustom Class");

        for (Car car : cars) {
            System.out.println(car);
        }

        /*
         * ==========================================================
         *                    Constructors
         * ==========================================================
         */

        HashSet<Integer> set1 = new HashSet<>(); // normal (Default Constructor)

        set1.add(10);
        set1.add(20);
        set1.add(30);

        System.out.println("\nHashSet()");
        System.out.println(set1);

        /*
         * Creates an empty HashSet.
         * Default Capacity  : 16
         * Default LoadFactor: 0.75
         */


        // ---------------------------------------------------------
        // HashSet(int initialCapacity)
        // ---------------------------------------------------------

        HashSet<Integer> set2 = new HashSet<>(100);

        set2.add(100);
        set2.add(200);
        set2.add(300);

        System.out.println("\nHashSet(int initialCapacity)");
        System.out.println(set2);

        /*
         * Capacity is allocated internally.
         * Useful when approximate size is already known.
         */


        // ---------------------------------------------------------
        // HashSet(int initialCapacity,float loadFactor)
        // ---------------------------------------------------------

        HashSet<Integer> set3 = new HashSet<>(100, 0.75f);

        set3.add(1);
        set3.add(2);
        set3.add(3);

        System.out.println("\nHashSet(int,float)");
        System.out.println(set3);

        /*
         * Allows custom Load Factor.
         * Generally default value (0.75) is recommended.
         */


        // ---------------------------------------------------------
        // HashSet(Collection)
        // ---------------------------------------------------------

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        HashSet<Integer> set4 = new HashSet<>(list);

        System.out.println("\nHashSet(Collection)");

        System.out.println("Original List : " + list);
        System.out.println("HashSet       : " + set4);

        /*
         * Frequently used for Removing Duplicate Elements from another Collection.
         */


        /*
         * ==========================================================
         *         HashSet Specific Method - clone()
         * ==========================================================
         */

        HashSet<String> original = new HashSet<>();

        original.add("Java");
        original.add("Python");
        original.add("C++");

        System.out.println("\nclone()");

        @SuppressWarnings("unchecked")
        HashSet<String> cloned = (HashSet<String>) original.clone();

        System.out.println("Original HashSet : " + original);
        System.out.println("Cloned HashSet   : " + cloned);

        // Modify cloned HashSet

        cloned.add("JavaScript");

        System.out.println("\nAfter Modifying Clone");

        System.out.println("Original HashSet : " + original);
        System.out.println("Cloned HashSet   : " + cloned);

        /*
         * ==========================================================
         *                      Rehashing
         * ==========================================================
         */

        HashSet<Integer> rehashDemo = new HashSet<>(4, 0.75f);

        /*
         * Initial:
         * Capacity   = 4 (Default = 16)
         * Load Factor = 0.75
         * Threshold   = 4 × 0.75 = 3
         */

        // Current size = 3
        rehashDemo.add(10);
        rehashDemo.add(20);
        rehashDemo.add(30);

        System.out.println("\nBefore Rehashing");
        System.out.println(rehashDemo);

        /*
         * Next insertion exceeds the threshold.
         */

        rehashDemo.add(40);

        /*
         * After Rehashing:
         * Capacity doubles (4 → 8)
         * Size = 4
         * New Threshold = 8 × 0.75 = 6
         */

        System.out.println("\nAfter Rehashing");
        System.out.println(rehashDemo);

        /*
         * Rehashing:
         * Capacity increases & Existing elements are redistributed into the new bucket array.
         */

        /*
        ==========================================================
                    Methods Not Covered Yet - Java 19+
        ==========================================================

        HashSet.newHashSet(int expectedSize)

        Ex:
        HashSet<Integer> set = HashSet.newHashSet(100);

        HashSet       → class name
        .             → access a static method
        newHashSet    → method name
        (100)         → expected number of elements
        */


        System.out.println("\nHashSet Implementation Completed.");

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

    Car(String brand, int speed) {

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
