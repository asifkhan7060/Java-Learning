package C_List.ArrayList;

import java.util.*;

// In Which areas list interface are used ?
// Hold ctrl and move cursor to List keyword -> go to that file hold again ctrl and move to list and click -> dropdown project files and keep All Places to see where list are implemented

public class Implementation {
    static void main() {

        // =====================================================
        // Methods Inherited from Collection
        // =====================================================

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


        // =====================================================
        // Methods Inherited from List
        // =====================================================

        // Already implemented in List topic

        // get(int index)
        // set(int index, E element)
        //
        // add(int index, E element)
        // addAll(int index, Collection<? extends E> c)
        //
        // remove(int index)
        //
        // indexOf(Object o)
        // lastIndexOf(Object o)
        //
        // listIterator()
        // listIterator(int index)
        //
        // subList(int fromIndex, int toIndex)
        //
        // replaceAll(UnaryOperator<E> operator)
        //
        // sort(Comparator<? super E> c)


        // Basic Implementation of ArrayList with learning generics and loop usage

        // Uncontrolled Datatypes (Without TypeSafety - default Object)
        List<Object> users = new ArrayList<>(); // or List users = new ArrayList<>();
        users.add("Alice");
        users.add(1);

        // Using For Each
        for (Object user : users) {
            System.out.println("Using For Each: " + user);
        }

        System.out.println();


        //Controlled Datatypes (Applying Concept of Generics <>)
        ArrayList<String> users1 = new ArrayList<>(); // List or ArrayList Both can use as reference datatype but List keyword cant use at object creation (i.e after a new keyword)
        users1.add("Rudra");
        users1.add("Haya");
        users1.add("Arman");
        users1.add("Arman"); // Duplicates Allowed
        // users1.add(1); // Shows error

        // Using For Each
        for (String user : users1) {  // Object also can be used but if we know confirmed datatype then this recommended
            System.out.println("User: " + user); // Output is ordered
        }

        // Using For
        for (int i = 0; i < users1.size(); i++) {
            System.out.println("Using For loop: " + users1.get(i));
        }

        // Iterator
        int a = 0;
        Iterator<String> it = users1.iterator();
        while (it.hasNext()) {
            System.out.println("Using Iterator [" + a + "]:" + it.next());
            a++;
        }

        // Work with Class (Generics as a Custom Class)
        Car car1 = new Car("BMW", 900);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(new Car("Toyota", 500));

        System.out.println("All Cars");
        for (Car car : carList) {
            System.out.println("Brand: " + car.brand + ", Speed: " + car.speed);
        }

        System.out.println(carList); //Need to implement to String method to get clear values instead Garbage Values


        // =====================================================
        // Constructors
        // =====================================================

        // -----------------------------------------------------
        // Normal ArrayList()
        // -----------------------------------------------------

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println("\nArrayList()");
        System.out.println(list1);

        // Note:
        // Creates an empty ArrayList.
        // Default constructor.
        // Internal capacity grows automatically when required.


        // -----------------------------------------------------
        // ArrayList(int initialCapacity)
        // -----------------------------------------------------

        ArrayList<Integer> list2 = new ArrayList<>(10);   // You are saying: "Dear ArrayList, create enough internal space to hold at least 10 elements."


        list2.add(100);
        list2.add(200);
        list2.add(300);

        System.out.println("\nArrayList(int initialCapacity)");
        System.out.println(list2);

        // Note:
        // Initial Capacity = 10
        // Current Size = 3
        // Capacity is maintained internally and cannot be viewed directly.

        /*
        Q: What happens when an ArrayList exceeds its capacity?

        Answer:
        When an ArrayList becomes full, it automatically creates a larger internal array,
        copies all existing elements into the new array, and then adds the new element.
        This resizing happens automatically, so no exception is thrown
        */


        // -----------------------------------------------------
        // ArrayList(Collection)- shallow concept (copy changed but original remains same)
        // -----------------------------------------------------

        ArrayList<Integer> list3 = new ArrayList<>(list1);

        System.out.println("\nArrayList(Collection)");
        System.out.println("Original List : " + list1);
        System.out.println("Copied List   : " + list3);

        // Modify copied list

        list3.add(40);

        System.out.println("\nAfter Modifying Copied List");

        System.out.println("Original List : " + list1);
        System.out.println("Copied List   : " + list3);

        // Note:
        // Only elements are copied.
        // Original collection remains unchanged.



        // =====================================================
        // ArrayList Specific Methods
        // =====================================================


        // -----------------------------------------------------
        // ensureCapacity()
        // -----------------------------------------------------

        ArrayList<Integer> ensureDemo = new ArrayList<>();

        System.out.println("\nensureCapacity()");

        // Initially
        ensureDemo.add(10);
        ensureDemo.add(20);

        System.out.println("Before ensureCapacity() : " + ensureDemo);

        // Ensures internal capacity becomes at least 100
        ensureDemo.ensureCapacity(100); // You're telling Java: "I know I'll store about 100 elements. Please allocate space now."

        // Add more elements
        ensureDemo.add(30);
        ensureDemo.add(40);

        System.out.println("After ensureCapacity()  : " + ensureDemo);

        // Note:
        // ensureCapacity() increases only the internal capacity.
        // It does NOT change the current size or elements.


        // -----------------------------------------------------
        // trimToSize()
        // -----------------------------------------------------

        ArrayList<Integer> trimDemo = new ArrayList<>(100);

        trimDemo.add(1);
        trimDemo.add(2);
        trimDemo.add(3);
        trimDemo.add(4);

        System.out.println("\ntrimToSize()");

        System.out.println("Before trimToSize() : " + trimDemo);

        // Shrinks capacity to current size
        trimDemo.trimToSize();

        System.out.println("After trimToSize()  : " + trimDemo);

        // Note:
        // Capacity becomes equal to current size.
        // Elements remain unchanged.


        // -----------------------------------------------------
        // ensureCapacity() + trimToSize()
        // -----------------------------------------------------

        ArrayList<Integer> demo = new ArrayList<>();

        demo.ensureCapacity(50);

        demo.add(100);
        demo.add(200);
        demo.add(300);

        System.out.println("\nensureCapacity() + trimToSize()");

        System.out.println("Before trim : " + demo);

        demo.trimToSize();

        System.out.println("After trim  : " + demo);

        // Note:
        // ensureCapacity() is useful before inserting a large number of elements.
        // trimToSize() is useful after removing many elements.


        // -----------------------------------------------------
        // Capacity vs Size
        // -----------------------------------------------------

        ArrayList<Integer> capacityDemo = new ArrayList<>(20);

        capacityDemo.add(10);
        capacityDemo.add(20);
        capacityDemo.add(30);

        System.out.println("\nCapacity vs Size");

        System.out.println("Elements : " + capacityDemo);

        System.out.println("Size : " + capacityDemo.size());

        // Capacity cannot be accessed directly.
        // It is maintained internally by ArrayList.

        // Current Situation
        //
        // Capacity = 20
        // Size = 3
        //
        // After trimToSize()
        //
        // Capacity = 3
        // Size = 3
        //
        // After ensureCapacity(100)
        //
        // Capacity >= 100
        // Size = 3



        // =====================================================
        // clone()
        // =====================================================

        ArrayList<String> original = new ArrayList<>();

        original.add("Java");
        original.add("Python");
        original.add("C++");

        System.out.println("\nclone()");

        @SuppressWarnings("unchecked")
        ArrayList<String> copy = (ArrayList<String>) original.clone();

        System.out.println("Original List : " + original);
        System.out.println("Cloned List   : " + copy);

        // Modify cloned list

        copy.add("JavaScript");

        System.out.println("\nAfter Modifying Cloned List");

        System.out.println("Original List : " + original);
        System.out.println("Cloned List   : " + copy);

        // Note:
        // clone() creates a shallow copy.
        // Only the ArrayList object is copied.
        // Stored objects are shared between both lists.


        // =====================================================
        // Shallow Copy Demonstration
        // =====================================================

        ArrayList<Car> originalCars = new ArrayList<>();

        originalCars.add(new Car("BMW", 900));
        originalCars.add(new Car("Toyota", 500));

        @SuppressWarnings("unchecked")
        ArrayList<Car> copiedCars =
                (ArrayList<Car>) originalCars.clone();

        System.out.println("\nShallow Copy Demo");

        System.out.println("Original : " + originalCars);
        System.out.println("Copied   : " + copiedCars);

        // Modify object inside copied list

        copiedCars.get(0).brand = "Audi";

        System.out.println("\nAfter Modifying Object Inside Copied List");

        System.out.println("Original : " + originalCars);
        System.out.println("Copied   : " + copiedCars);

        // Note:
        // Only the ArrayList is copied.
        // The Car objects are NOT copied.
        // Both lists refer to the same Car objects.


        // =====================================================
        // Reference Type Demonstration
        // =====================================================

        // List Reference
        // Can access only methods declared in List and inherited from Collection.
        // Cannot access ArrayList-specific methods.

        List<Integer> listed = new ArrayList<>(); // Interface Reference

        listed.add(10);              // ✅ Collection
        listed.get(0);               // ✅ List
        // listed.ensureCapacity(100); // ❌ ArrayList method


        // ArrayList Reference
        // Can access all methods from Collection, List and ArrayList.

        ArrayList<Integer> arrayList = new ArrayList<>();  // Class Reference

        arrayList.add(10);               // ✅ Collection
        arrayList.get(0);                // ✅ List
        arrayList.ensureCapacity(100);   // ✅ ArrayList


        // Note:
        //
        // Interface Reference
        // Recommended for flexibility.
        //
        // Class Reference
        // Required when using ArrayList specific methods.


        /*
         * ==========================================================
         *                  Optimized Overrides
         * ==========================================================
         */

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // 4. forEach()
        System.out.println("\n========== forEach() ==========");

        /*
         * Executes the given action for every element.
         */

        fruits.forEach(fruit ->
                System.out.println("Fruit : " + fruit));



        // 5. replaceAll()
        System.out.println("\n========== replaceAll() ==========");

        ArrayList<String> names = new ArrayList<>();

        names.add("maaz");
        names.add("john");
        names.add("alex");

        /*
         * Replaces every element using the given operation.
         */

        names.replaceAll(String::toUpperCase);

        System.out.println(names);


        // 6. sort()
        System.out.println("\n========== sort() ==========");

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(45);
        marks.add(99);
        marks.add(61);
        marks.add(85);

        /*
         * Sorts the ArrayList using the given Comparator.
         */

        marks.sort(Comparator.naturalOrder());

        System.out.println("Ascending  : " + marks);

        marks.sort(Comparator.reverseOrder());

        System.out.println("Descending : " + marks);


        // 7. spliterator()
        System.out.println("\n========== spliterator() ==========");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Hyderabad");

        /*
         * Returns a Spliterator for traversing the elements.
         *
         * Spliterator supports sequential and parallel traversal.
         */

        Spliterator<String> spliterator = cities.spliterator();

        spliterator.forEachRemaining(System.out::println);


        /*
         * ==========================================================
         *             Exists in Java but Not Covered Yet
         *
         *               ├──────────────────────────────────────────────
         *               │
         *               ├── 🆕 removeIf(Predicate<? super E> filter)
         *               ├── 🆕 toArray(IntFunction<T[]> generator)
         *               └── 🔒 removeRange(int fromIndex, int toIndex) (protected)
         *
         * ==========================================================
         */

        /*
         * ==========================================================
         *               Methods Inherited from Object
         *
         *               ├── 🆕 toString()
         *               ├── 🆕 getClass()
         *               ├── 🆕 wait()
         *               ├── 🆕 wait(long timeout)
         *               ├── 🆕 wait(long timeout, int nanos)
         *               ├── 🆕 notify()
         *               ├── 🆕 notifyAll()
         *               ├── 🆕 clone() (protected)
         *               ├── 🆕 equals(Object)
         *               ├── 🆕 hashCode()
         *               ├── 🆕 finalize() (Deprecated)
         *               └── 🆕 registerNatives() (Native, Internal - Ignore)
         *
         * ==========================================================
         */
    }
}

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
