package B_List.ArrayList;

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


        // =====================================================
        // Basic ArrayList Implementation
        // =====================================================

        ArrayList<String> users = new ArrayList<>();

        users.add("Rudra");
        users.add("Haya");
        users.add("Arman");
        users.add("Arman"); // Duplicates Allowed
        users.add(null); // Multiple Null Allowed
        // users1.add(1); // Compile time error

        // Using For Each
        int a = 0;
        for (String user : users) {
            System.out.println("User " +a+ " : " + user);
            a++;
        }

        // Optimized for Each Loop
        // users.forEach(user -> System.out.println("User : " + user));

        System.out.println();

        // Using For
        for (int i = 0; i < users.size(); i++) {
            System.out.println("Using For loop " +i+ " : " + users.get(i));
        }

        System.out.println();

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
        // Constructors (3)
        // =====================================================

        ArrayList<Integer> list1 = new ArrayList<>(); // Normal

        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println("\nArrayList()");
        System.out.println(list1);

        // Note:
        // new ArrayList<>(); -> Creates an empty ArrayList.
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
        System.out.println("Original List : " + list1); // 10,20,30
        System.out.println("Copied List   : " + list3); // 10,20,30

        // Modify copied list

        list3.add(40);

        System.out.println("\nAfter Modifying Copied List");

        System.out.println("Original List : " + list1); // 10,20,30
        System.out.println("Copied List   : " + list3); // 10,20,30,40

        // Note:
        // Only elements are copied.
        // Original collection remains unchanged.



        // =====================================================
        // ArrayList Specific Methods (3)
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

        // Capacity -> 100
        // Size -> 4

        // Shrinks capacity to current size
        trimDemo.trimToSize(); // now capacity -> 4

        System.out.println("After trimToSize()  : " + trimDemo);

        // Note:
        // Capacity becomes equal to current size.
        // Elements remain unchanged.


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

        System.out.println("Original List : " + original); // [Java, Python, C++]
        System.out.println("Cloned List   : " + copy); // [Java, Python, C++]

        // Modify cloned list

        copy.add("JavaScript");

        System.out.println("\nAfter Modifying Cloned List");

        System.out.println("Original List : " + original); // [Java, Python, C++]
        System.out.println("Cloned List   : " + copy); // [Java, Python, C++, JavaScript]

        // Note:
        // clone() creates a shallow copy.

        // ======================================================================================
        // Shallow Copy Demonstration with Class - Understand better in Shallowcopydemo.md
        // ======================================================================================

        ArrayList<Car> originalCars = new ArrayList<>();

        originalCars.add(new Car("BMW", 900));
        originalCars.add(new Car("Toyota", 500));

        @SuppressWarnings("unchecked")
        ArrayList<Car> copiedCars = (ArrayList<Car>) originalCars.clone();

        System.out.println("\nShallow Copy Demo");

        // same
        System.out.println("Original : " + originalCars); // [Car{brand='BMW', speed=900}, Car{brand='Toyota', speed=500}]
        System.out.println("Copied   : " + copiedCars); // [Car{brand='BMW', speed=900}, Car{brand='Toyota', speed=500}]

        // Modify object in copied list

        copiedCars.get(0).brand = "Audi";

        System.out.println("\nAfter Modifying Object Inside Copied List");

        System.out.println("Original : " + originalCars); // [Car{brand='Audi', speed=900}, Car{brand='Toyota', speed=500}]
        System.out.println("Copied   : " + copiedCars); // [Car{brand='Audi', speed=900}, Car{brand='Toyota', speed=500}]

        // Note:
        // Here u observed that original List also gets changed
        // Both lists (copiedCars, originalCars) refer to the same Car objects.
        // Hence, original list gets changed



        // Object -> AbstractCollection -> AbstractList -> ArrayList

        // java.lang.Object is the root class of Java's class hierarchy (not a utility class)
        // Methods in Object are Inherited by ArrayList (Will learn Separately)

        // removeRange(fromIndex, toIndex) - comes from AbstractList

        // It is a protected method inherited from AbstractList.
        // It removes elements within the specified range and is mainly intended for use by subclasses.
    }
}

class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Used to prevent from Garbage value
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
