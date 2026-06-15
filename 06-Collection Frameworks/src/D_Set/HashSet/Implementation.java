package D_Set.HashSet;

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

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        HashSet rawUsers = new HashSet();

        rawUsers.add("Alice");
        rawUsers.add(101);
        rawUsers.add(true);

        System.out.println("Raw HashSet");
        System.out.println(rawUsers);

        /*
         * Raw Types:
         * -----------
         * Stores everything as Object.
         * Type Safety is NOT available.
         * Avoid using Raw Types in modern Java.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        HashSet<String> users = new HashSet<>();

        users.add("Rudra");
        users.add("Haya");
        users.add("Arman");
        users.add("Arman");   // Duplicate
//      users.add(100);       // Compile Time Error

        System.out.println("HashSet with Generics");
        System.out.println(users);

        /*
         * Note:
         * Duplicate values are ignored automatically.
         * Output order is NOT guaranteed.
         */


        // ---------------------------------------------------------
        // Duplicate Demonstration
        // ---------------------------------------------------------

        HashSet<Integer> duplicateDemo = new HashSet<>();

        duplicateDemo.add(10);
        duplicateDemo.add(20);
        duplicateDemo.add(30);
        duplicateDemo.add(20);
        duplicateDemo.add(10);
        duplicateDemo.add(40);

        System.out.println("\nDuplicate Demonstration");
        System.out.println(duplicateDemo);

        /*
         * Output : [10,20,30,40]
         * Duplicate values are ignored.
         */


        // ---------------------------------------------------------
        // Null Demonstration
        // ---------------------------------------------------------

        HashSet<String> nullDemo = new HashSet<>();

        nullDemo.add(null);
        nullDemo.add("Java");
        nullDemo.add(null);
        nullDemo.add("Python");

        System.out.println("\nNull Demonstration");
        System.out.println(nullDemo);

        /*
         * HashSet allows only ONE null element.
         */


        // ---------------------------------------------------------
        // For Each Loop
        // ---------------------------------------------------------

        System.out.println("\nUsing For Each");

        for (String user : users) {
            System.out.println(user);
        }


        // ---------------------------------------------------------
        // Iterator
        // ---------------------------------------------------------

        System.out.println("\nUsing Iterator");

        Iterator<String> iterator = users.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // ---------------------------------------------------------
        // Working with Custom Class
        // ---------------------------------------------------------

        HashSet<Car> cars = new HashSet<>();

        cars.add(new Car("BMW", 900));
        cars.add(new Car("Toyota", 500));
        cars.add(new Car("BMW", 900));      // Different Object

        System.out.println("\nCustom Class");

        for (Car car : cars) {
            System.out.println(car);
        }

        /*
         * ==========================================================
         *                    Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // HashSet()
        // ---------------------------------------------------------

        HashSet<Integer> set1 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);

        System.out.println("\nHashSet()");
        System.out.println(set1);

        /*
         * Creates an empty HashSet.
         * Default Constructor.
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

        HashSet<Integer> set3 =
                new HashSet<>(100, 0.75f);

        set3.add(1);
        set3.add(2);
        set3.add(3);

        System.out.println("\nHashSet(int,float)");
        System.out.println(set3);

        /*
         * Allows custom Load Factor.
         *
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
         * Frequently used for:
         * Removing Duplicate Elements from another Collection.
         */


        /*
         * ==========================================================
         *                     clone()
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
         * Note:
         * clone() creates a SHALLOW COPY.
         * Only HashSet object is copied.
         * Stored objects are shared.
         */


        /*
         * ==========================================================
         *              Shallow Copy Demonstration
         * ==========================================================
         */

        HashSet<Car> originalCars = new HashSet<>();

        originalCars.add(new Car("BMW",900));
        originalCars.add(new Car("Toyota",500));

        @SuppressWarnings("unchecked")
        HashSet<Car> copiedCars =
                (HashSet<Car>) originalCars.clone();

        System.out.println("\nShallow Copy");

        System.out.println("Original : " + originalCars);
        System.out.println("Copied   : " + copiedCars);

        // Modify object inside copied HashSet

        for(Car car : copiedCars){

            if(car.brand.equals("BMW")){
                car.brand = "Audi";
            }

        }

        System.out.println("\nAfter Modifying Object");

        System.out.println("Original : " + originalCars);
        System.out.println("Copied   : " + copiedCars);

        /*
         * Note:
         * HashSet is copied.
         * Car objects are NOT copied.
         * Both HashSets refer to the same Car objects.
         */


        /*
         * ==========================================================
         *                      Rehashing
         * ==========================================================
         */

        HashSet<Integer> rehashDemo =
                new HashSet<>(4, 0.75f);

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
         * • Capacity increases.
         * • Existing elements are redistributed into the new bucket array.
         */

        /*
         * ==========================================================
         *          Reference Type Demonstration
         * ==========================================================
         *
         * Set Reference
         * ✓ Access Set + Collection methods only.
         * ✗ Cannot access HashSet-specific methods (e.g. clone()).
         *
         * HashSet Reference
         * ✓ Access all HashSet methods, including clone().
         *
         * Recommendation
         * ✓ Use Set reference for loose coupling.
         * ✓ Use HashSet reference only when HashSet-specific methods are needed.
         */


        /*
         * ==========================================================
         *               Already Covered in ArrayList
         * ==========================================================
         *
         * The following methods behave the same for HashSet.
         * Refer to ArrayList Implementation.java.
         *
         * ✓ forEach()
         * ✓ Method Reference (System.out::println)
         * ✓ spliterator()
         *
         * Note:
         * Although these methods are available in HashSet,
         * the iteration order is NOT guaranteed because
         * HashSet is unordered.
         */


        /*
         * ==========================================================
         *                    iterator()
         * ==========================================================
         */

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("\nIterator");

        Iterator<String> itr = fruits.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        /*
         * HashSet supports Iterator only.
         *
         * ListIterator is NOT available
         * because HashSet does not implement List.
         */


        /*
         * ==========================================================
         *               HashSet Characteristics
         * ==========================================================
         */

        HashSet<Integer> characteristics = new HashSet<>();

        characteristics.add(30);
        characteristics.add(10);
        characteristics.add(40);
        characteristics.add(20);
        characteristics.add(20);   // Duplicate
        characteristics.add(null); // One null allowed
        characteristics.add(null); // Ignored

        System.out.println("\nHashSet Characteristics");

        System.out.println(characteristics);

        /*
         * Characteristics
         *
         * ✓ Duplicate NOT Allowed
         * ✓ One Null Allowed
         * ✓ Unordered
         * ✓ No Index
         * ✓ Fast Searching (Average O(1))
         */


        /*
         * ==========================================================
         *              Methods Not Covered Yet
         * ==========================================================
         */
        /*
         * Java 21
         *
         * HashSet.newHashSet(int expectedSize)
         */


        /*
         * ==========================================================
         *              Methods Inherited from Object
         * ==========================================================
         */

        // future !!

        /*
         * ==========================================================
         *                       End
         * ==========================================================
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

/*
 * ==========================================================
 * IMPORTANT
 * ==========================================================
 *
 * Since equals() and hashCode() are NOT overridden,
 * HashSet treats every Car object as different.
 *
 * Override both methods when logical equality
 * is required.
 *
 * This will be covered in Object Class / HashMap topic.
 *
 * ==========================================================
 */
