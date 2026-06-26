package D_Set.LinkedHashSet;

import java.util.*;

// In Which areas LinkedHashSet class is used ?
// Hold Ctrl and move cursor to LinkedHashSet keyword -> Go to that file.
// Hold Ctrl again on LinkedHashSet -> Click -> Change search to
// "All Places" to explore where LinkedHashSet is used.

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
         *          Methods Inherited from HashSet
         * ==========================================================
         */

        // clone()

        /*
         * LinkedHashSet introduces NO NEW PUBLIC METHODS.
         *
         * It extends HashSet.
         *
         * The main difference is the
         * internal implementation.
         */


        /*
         * ==========================================================
         *        Basic LinkedHashSet Implementation
         * ==========================================================
         */

        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        LinkedHashSet rawUsers = new LinkedHashSet();

        rawUsers.add("Alice");
        rawUsers.add(101);
        rawUsers.add(true);

        System.out.println("Raw LinkedHashSet");
        System.out.println(rawUsers);

        /*
         * Raw Types
         *
         * Stores everything as Object.
         *
         * Type Safety is NOT available.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        LinkedHashSet<String> users =
                new LinkedHashSet<>();

        users.add("Rudra");
        users.add("Haya");
        users.add("Arman");
        users.add("Arman");     // Duplicate Ignored

//      users.add(100);         // Compile Time Error

        System.out.println("LinkedHashSet with Generics");
        System.out.println(users);

        /*
         * Note:
         *
         * Duplicate values are ignored.
         *
         * Insertion Order is preserved.
         */


        // ---------------------------------------------------------
        // Duplicate Demonstration
        // ---------------------------------------------------------

        LinkedHashSet<Integer> duplicateDemo =
                new LinkedHashSet<>();

        duplicateDemo.add(10);
        duplicateDemo.add(20);
        duplicateDemo.add(30);
        duplicateDemo.add(20);
        duplicateDemo.add(40);
        duplicateDemo.add(10);

        System.out.println("\nDuplicate Demonstration");

        System.out.println(duplicateDemo);

        /*
         * Output
         *
         * 10
         * 20
         * 30
         * 40
         *
         * Duplicate values are ignored.
         */


        // ---------------------------------------------------------
        // Insertion Order Demonstration
        // ---------------------------------------------------------

        LinkedHashSet<Integer> insertionDemo =
                new LinkedHashSet<>();

        insertionDemo.add(50);
        insertionDemo.add(10);
        insertionDemo.add(80);
        insertionDemo.add(20);
        insertionDemo.add(70);

        System.out.println("\nInsertion Order");

        System.out.println(insertionDemo);

        /*
         * Output
         *
         * 50
         * 10
         * 80
         * 20
         * 70
         *
         * Elements appear exactly
         * in insertion order.
         */


        // ---------------------------------------------------------
        // HashSet vs LinkedHashSet
        // ---------------------------------------------------------

        HashSet<Integer> hashSet1 =
                new HashSet<>();

        LinkedHashSet<Integer> linkedHashSet1 =
                new LinkedHashSet<>();

        int[] values1 = {30,10,40,20,50};

        for(int value : values1){

            hashSet1.add(value);
            linkedHashSet1.add(value);

        }

        System.out.println("\nHashSet");
        System.out.println(hashSet1);

        System.out.println("\nLinkedHashSet");
        System.out.println(linkedHashSet1);

        /*
         * HashSet
         *
         * Order NOT guaranteed.
         *
         * LinkedHashSet
         *
         * Preserves insertion order.
         */


        // ---------------------------------------------------------
        // Null Demonstration
        // ---------------------------------------------------------

        LinkedHashSet<String> nullDemo =
                new LinkedHashSet<>();

        nullDemo.add(null);
        nullDemo.add("Java");
        nullDemo.add(null);
        nullDemo.add("Python");

        System.out.println("\nNull Demonstration");

        System.out.println(nullDemo);

        /*
         * LinkedHashSet allows
         * only ONE null element.
         */


        // ---------------------------------------------------------
        // For Each Loop
        // ---------------------------------------------------------

        System.out.println("\nUsing For Each");

        for(String user : users){

            System.out.println(user);

        }


        // ---------------------------------------------------------
        // Iterator
        // ---------------------------------------------------------

        System.out.println("\nUsing Iterator");

        Iterator<String> iterator1 =
                users.iterator();

        while(iterator1.hasNext()){

            System.out.println(iterator1.next());

        }


        // ---------------------------------------------------------
        // Working with Custom Class
        // ---------------------------------------------------------

        LinkedHashSet<Car> cars =
                new LinkedHashSet<>();

        cars.add(new Car("BMW",900));
        cars.add(new Car("Toyota",500));
        cars.add(new Car("BMW",900));

        System.out.println("\nCustom Class");

        for(Car car : cars){

            System.out.println(car);

        }

        /*
         * Since equals() and hashCode()
         * are NOT overridden,
         *
         * LinkedHashSet considers
         * every object different.
         */


        /*
         * ==========================================================
         *                  Constructors
         * ==========================================================
         */


        // ---------------------------------------------------------
        // LinkedHashSet()
        // ---------------------------------------------------------

        LinkedHashSet<Integer> set1 =
                new LinkedHashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);

        System.out.println("\nLinkedHashSet()");
        System.out.println(set1);

        /*
         * Default Constructor.
         *
         * Default Capacity = 16
         *
         * Default Load Factor = 0.75
         */


        // ---------------------------------------------------------
        // LinkedHashSet(int initialCapacity)
        // ---------------------------------------------------------

        LinkedHashSet<Integer> set2 =
                new LinkedHashSet<>(100);

        set2.add(100);
        set2.add(200);
        set2.add(300);

        System.out.println("\nLinkedHashSet(int initialCapacity)");
        System.out.println(set2);

        /*
         * Useful when approximate
         * number of elements
         * is already known.
         */


        // ---------------------------------------------------------
        // LinkedHashSet(int initialCapacity,float loadFactor)
        // ---------------------------------------------------------

        LinkedHashSet<Integer> set3 =
                new LinkedHashSet<>(100,0.75f);

        set3.add(1);
        set3.add(2);
        set3.add(3);

        System.out.println("\nLinkedHashSet(int,float)");
        System.out.println(set3);

        /*
         * Allows custom
         * Load Factor.
         */


        // ---------------------------------------------------------
        // LinkedHashSet(Collection)
        // ---------------------------------------------------------

        ArrayList<Integer> list =
                new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        LinkedHashSet<Integer> set4 =
                new LinkedHashSet<>(list);

        System.out.println("\nLinkedHashSet(Collection)");

        System.out.println("Original List    : " + list);
        System.out.println("LinkedHashSet    : " + set4);

        /*
         * Removes duplicate values.
         *
         * Preserves insertion order
         * of unique elements.
         */


        // ------------ Part 2 Starts from clone() ------------

        /*
         * ==========================================================
         *                     clone()
         * ==========================================================
         */

        LinkedHashSet<String> original =
                new LinkedHashSet<>();

        original.add("Java");
        original.add("Python");
        original.add("C++");

        System.out.println("\nclone()");

        @SuppressWarnings("unchecked")
        LinkedHashSet<String> cloned =
                (LinkedHashSet<String>) original.clone();

        System.out.println("Original LinkedHashSet : " + original);
        System.out.println("Cloned LinkedHashSet   : " + cloned);

        // Modify cloned LinkedHashSet

        cloned.add("JavaScript");

        System.out.println("\nAfter Modifying Clone");

        System.out.println("Original LinkedHashSet : " + original);
        System.out.println("Cloned LinkedHashSet   : " + cloned);

        /*
         * Note:
         *
         * clone() creates a
         * SHALLOW COPY.
         *
         * Only the LinkedHashSet
         * object is copied.
         *
         * Stored objects are shared.
         */


        /*
         * ==========================================================
         *            Shallow Copy Demonstration
         * ==========================================================
         */

        LinkedHashSet<Car> originalCars =
                new LinkedHashSet<>();

        originalCars.add(new Car("BMW",900));
        originalCars.add(new Car("Toyota",500));

        @SuppressWarnings("unchecked")
        LinkedHashSet<Car> copiedCars =
                (LinkedHashSet<Car>) originalCars.clone();

        System.out.println("\nShallow Copy");

        System.out.println("Original : " + originalCars);
        System.out.println("Copied   : " + copiedCars);

        // Modify object inside copied LinkedHashSet

        for(Car car : copiedCars){

            if(car.brand.equals("BMW")){

                car.brand = "Audi";

            }

        }

        System.out.println("\nAfter Modifying Object");

        System.out.println("Original : " + originalCars);
        System.out.println("Copied   : " + copiedCars);

        /*
         * Only LinkedHashSet
         * object is copied.
         *
         * Car objects are shared.
         */


        /*
         * ==========================================================
         *      Hash Table + Doubly Linked List Concept
         * ==========================================================
         */

        LinkedHashSet<String> structureDemo =
                new LinkedHashSet<>();

        structureDemo.add("Java");
        structureDemo.add("Python");
        structureDemo.add("C++");
        structureDemo.add("SQL");

        System.out.println("\nInternal Structure");

        System.out.println(structureDemo);

        /*
         * LinkedHashSet internally uses
         *
         * Hash Table
         *
         * +
         *
         * Doubly Linked List
         *
         * Hash Table
         * ----------
         * Fast Searching
         * Fast Insertion
         * Fast Deletion
         *
         * Doubly Linked List
         * ------------------
         * Preserves Insertion Order
         */


        /*
         * ==========================================================
         *             Insertion Order Working
         * ==========================================================
         */

        LinkedHashSet<Integer> orderDemo =
                new LinkedHashSet<>();

        orderDemo.add(50);
        orderDemo.add(20);
        orderDemo.add(80);
        orderDemo.add(10);
        orderDemo.add(40);

        System.out.println("\nInsertion Order Working");

        System.out.println(orderDemo);

        /*
         * Elements always appear
         * in the order
         * they were inserted.
         */


        /*
         * ==========================================================
         *                 Capacity vs Size
         * ==========================================================
         */

        LinkedHashSet<Integer> capacityDemo =
                new LinkedHashSet<>(20);

        capacityDemo.add(10);
        capacityDemo.add(20);
        capacityDemo.add(30);

        System.out.println("\nCapacity vs Size");

        System.out.println(capacityDemo);

        System.out.println("Size : "
                + capacityDemo.size());

        /*
         * Capacity
         *
         * Number of Buckets.
         *
         * Cannot be accessed
         * directly.
         *
         * Size
         *
         * Number of stored elements.
         */


        /*
         * ==========================================================
         *                  Load Factor
         * ==========================================================
         */

        LinkedHashSet<Integer> loadFactorDemo =
                new LinkedHashSet<>(16,0.75f);

        loadFactorDemo.add(10);
        loadFactorDemo.add(20);
        loadFactorDemo.add(30);

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
         */


        /*
         * ==========================================================
         *                    Threshold
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
         * Capacity × LoadFactor
         *
         * Example
         *
         * Capacity = 16
         *
         * LoadFactor = 0.75
         *
         * Threshold = 12
         */


        /*
         * ==========================================================
         *                    Rehashing
         * ==========================================================
         */

        LinkedHashSet<Integer> rehashDemo =
                new LinkedHashSet<>(4,0.75f);

        rehashDemo.add(10);
        rehashDemo.add(20);
        rehashDemo.add(30);

        System.out.println("\nBefore Rehashing");

        System.out.println(rehashDemo);

        rehashDemo.add(40);

        System.out.println("\nAfter Rehashing");

        System.out.println(rehashDemo);

        /*
         * When Threshold
         * is exceeded,
         *
         * LinkedHashSet
         * increases capacity.
         *
         * Existing elements
         * are redistributed
         * into new buckets.
         *
         * Insertion Order
         * remains unchanged.
         */


        /*
         * ==========================================================
         *         Reference Type Demonstration
         * ==========================================================
         */

        /*
         * Set Reference
         */

        Set<Integer> setReference =
                new LinkedHashSet<>();

        setReference.add(10);
        setReference.add(20);

        System.out.println("\nSet Reference");

        System.out.println(setReference);

        // setReference.clone(); ❌


        /*
         * HashSet Reference
         */

        HashSet<Integer> hashReference =
                new LinkedHashSet<>();

        hashReference.add(100);
        hashReference.add(200);

        hashReference.clone();

        System.out.println("\nHashSet Reference");

        System.out.println(hashReference);

        /*
         * LinkedHashSet Reference
         */

        LinkedHashSet<Integer> linkedReference =
                new LinkedHashSet<>();

        linkedReference.add(500);
        linkedReference.add(600);

        linkedReference.clone();

        System.out.println("\nLinkedHashSet Reference");

        System.out.println(linkedReference);

        /*
         * Note:
         *
         * Set Reference
         *
         * Accesses only
         * Set methods.
         *
         * HashSet Reference
         *
         * Can access methods
         * available in HashSet.
         *
         * LinkedHashSet Reference
         *
         * Can access every method
         * available in
         * LinkedHashSet
         * and HashSet.
         */


        // ---------- Part 3 Starts from Optimized Overrides ----------

        /*
         * ==========================================================
         *                 Optimized Overrides
         * ==========================================================
         */


        // ---------------------------------------------------------
        // forEach()
        // ---------------------------------------------------------

        LinkedHashSet<String> fruits =
                new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("\n========== forEach() ==========");

        /*
         * Executes the given action
         * for every element.
         *
         * Iteration follows
         * insertion order.
         */

        fruits.forEach(fruit ->
                System.out.println("Fruit : " + fruit));


        // ---------------------------------------------------------
        // Method Reference
        // ---------------------------------------------------------

        System.out.println("\n========== Method Reference ==========");

        fruits.forEach(System.out::println);

        /*
         * Cleaner version of
         * Lambda Expression.
         */


        // ---------------------------------------------------------
        // iterator()
        // ---------------------------------------------------------

        System.out.println("\n========== iterator() ==========");

        Iterator<String> iterator =
                fruits.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        /*
         * Iterator traverses
         * elements in the
         * insertion order.
         */


        // ---------------------------------------------------------
        // spliterator()
        // ---------------------------------------------------------

        System.out.println("\n========== spliterator() ==========");

        Spliterator<String> spliterator =
                fruits.spliterator();

        spliterator.forEachRemaining(System.out::println);

        /*
         * Spliterator
         *
         * Introduced in Java 8.
         *
         * Supports Sequential
         * and Parallel Traversal.
         *
         * Preserves
         * insertion order.
         */


        /*
         * ==========================================================
         *           LinkedHashSet Characteristics
         * ==========================================================
         */

        LinkedHashSet<Integer> characteristics =
                new LinkedHashSet<>();

        characteristics.add(30);
        characteristics.add(10);
        characteristics.add(40);
        characteristics.add(20);

        System.out.println("\nLinkedHashSet Characteristics");

        System.out.println(characteristics);

        /*
         * Characteristics
         *
         * ✔ Duplicate NOT Allowed
         *
         * ✔ One Null Allowed
         *
         * ✔ Maintains
         *   Insertion Order
         *
         * ✔ No Index
         *
         * ✔ Fast Searching
         *
         * ✔ Average O(1)
         *
         * ✔ Uses Hash Table
         *   +
         *   Doubly Linked List
         */


        /*
         * ==========================================================
         *       HashSet vs LinkedHashSet Comparison
         * ==========================================================
         */

        HashSet<Integer> hashSet =
                new HashSet<>();

        LinkedHashSet<Integer> linkedHashSet =
                new LinkedHashSet<>();

        int[] values =
                {50,20,80,10,40};

        for (int value : values) {

            hashSet.add(value);

            linkedHashSet.add(value);

        }

        System.out.println("\nHashSet");

        System.out.println(hashSet);

        System.out.println("\nLinkedHashSet");

        System.out.println(linkedHashSet);

        /*
         * HashSet
         *
         * Order NOT guaranteed.
         *
         * LinkedHashSet
         *
         * Maintains
         * insertion order.
         */


        /*
         * ==========================================================
         *             Methods Not Covered Yet
         * ==========================================================
         */

        /*
         * Java 8
         *
         * removeIf(Predicate)
         *
         * Java 11
         *
         * toArray(IntFunction<T[]>)
         *
         * Java 21
         *
         * LinkedHashSet.newLinkedHashSet(int expectedSize)
         */


        /*
         * ==========================================================
         *            Methods Inherited from Object
         * ==========================================================
         */

        System.out.println("\n========== Object Methods ==========");

        System.out.println(users.toString());

        System.out.println(users.getClass());

        System.out.println(users.hashCode());

        System.out.println(users.equals(cloned));

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
         *                 Interview Notes
         * ==========================================================
         */

        /*
         * 1. LinkedHashSet extends
         *    HashSet.
         *
         * 2. LinkedHashSet internally
         *    uses LinkedHashMap.
         *
         * 3. LinkedHashMap stores
         *    Hash Table +
         *    Doubly Linked List.
         *
         * 4. Duplicate detection
         *    uses hashCode()
         *    followed by equals().
         *
         * 5. Maintains insertion order.
         *
         * 6. Average Complexity
         *
         *    add()      O(1)
         *
         *    remove()   O(1)
         *
         *    contains() O(1)
         *
         * 7. Memory usage is
         *    slightly higher than
         *    HashSet because of
         *    linked list pointers.
         *
         * 8. LinkedHashSet does
         *    NOT introduce any
         *    new public methods.
         */


        /*
         * ==========================================================
         *                      End
         * ==========================================================
         */

        System.out.println(
                "\nLinkedHashSet Implementation Completed.");

    }

}


/*
 * ==========================================================
 *                    Custom Class
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
 * Since equals() and hashCode()
 * are NOT overridden,
 *
 * LinkedHashSet considers every
 * Car object as different.
 *
 * Override both methods
 * when logical equality
 * is required.
 *
 * This will be covered in
 * Object Class / HashMap topic.
 *
 * ==========================================================
 */
