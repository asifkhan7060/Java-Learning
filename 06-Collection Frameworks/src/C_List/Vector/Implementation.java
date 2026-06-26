package C_List.Vector;

import java.util.*;

// In Which areas Vector is used ?
//
// Vector implements:
// 1. List
//
// Vector is a Thread-Safe implementation of List.
// It internally uses a Dynamic Array.

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
        // Basic Vector Implementation
        // =====================================================

        // Uncontrolled Datatypes (Without Type Safety)

        List<Object> users = new Vector<>();

        users.add("Alice");
        users.add(101);
        users.add(true);

        System.out.println("Using List<Object>");

        for (Object user : users) {
            System.out.println(user);
        }



        // Controlled Datatypes (Generics)

        Vector<String> languages1 = new Vector<>();

        languages1.add("Java");
        languages1.add("Python");
        languages1.add("C++");
        languages1.add("Java");      // Duplicate Allowed
        languages1.add(null);        // Null Allowed

        System.out.println("\nUsing Vector<String>");

        for (String language : languages1) {
            System.out.println(language);
        }



        // Iterator

        System.out.println("\nUsing Iterator");

        Iterator<String> iterator = languages1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



        // Using Custom Class

        Vector<Car> cars = new Vector<>();

        cars.add(new Car("BMW", 900));
        cars.add(new Car("Toyota", 500));

        System.out.println("\nUsing Custom Class");

        for (Car car : cars) {
            System.out.println(car);
        }



        // =====================================================
        // Constructors
        // =====================================================


        // -----------------------------------------------------
        // Vector()
        // -----------------------------------------------------

        Vector<Integer> vector1 = new Vector<>();

        vector1.add(10);
        vector1.add(20);
        vector1.add(30);

        System.out.println("\nVector()");

        System.out.println(vector1);

        // Note:
        // Default Capacity = 10
        // Capacity doubles automatically when full.



        // -----------------------------------------------------
        // Vector(int initialCapacity)
        // -----------------------------------------------------

        Vector<Integer> vector2 = new Vector<>(5);

        vector2.add(100);
        vector2.add(200);
        vector2.add(300);

        System.out.println("\nVector(int initialCapacity)");

        System.out.println(vector2);

        System.out.println("Capacity : " + vector2.capacity());

        // Note:
        // Initial Capacity = 5
        // Current Size = 3



        // -----------------------------------------------------
        // Vector(int initialCapacity, int capacityIncrement)
        // -----------------------------------------------------

        Vector<Integer> vector3 = new Vector<>(5, 3);

        for (int i = 1; i <= 9; i++) {
            vector3.add(i);
        }

        System.out.println("\nVector(int initialCapacity, int capacityIncrement)");

        System.out.println(vector3);

        System.out.println("Capacity : " + vector3.capacity());

        /*
         * Capacity Growth
         *
         * Initial Capacity = 5
         *
         * After inserting 6th element
         *
         * Capacity = 8
         *
         * After inserting 9th element
         *
         * Capacity = 11
         */




        // -----------------------------------------------------
        // Vector(Collection)
        // -----------------------------------------------------

        Vector<Integer> vector4 = new Vector<>(vector1);

        System.out.println("\nVector(Collection)");

        System.out.println("Original : " + vector1);

        System.out.println("Copied   : " + vector4);

        vector4.add(40);

        System.out.println("\nAfter Modifying Copied Vector");

        System.out.println("Original : " + vector1);

        System.out.println("Copied   : " + vector4);

        // Note:
        // Creates a new Vector by copying another Collection.



        // =====================================================
        // Capacity Demonstration
        // =====================================================

        Vector<Integer> demo = new Vector<>();

        System.out.println("\nCapacity Demonstration");

        System.out.println("Initial Capacity : " + demo.capacity());

        for (int i = 1; i <= 10; i++) {
            demo.add(i);
        }

        System.out.println("Capacity after adding 10 Elements : "
                + demo.capacity());

        demo.add(11);

        System.out.println("Capacity after adding 11th Element : "
                + demo.capacity());

        /*
         * Default Growth
         *
         * 10
         *
         * ↓
         *
         * 20
         */




        // =====================================================
        // Capacity Increment Demonstration
        // =====================================================

        Vector<Integer> growth = new Vector<>(5, 3);

        System.out.println("\nCapacity Increment Demonstration");

        System.out.println("Initial Capacity : "
                + growth.capacity());

        for (int i = 1; i <= 12; i++) {

            growth.add(i);

            System.out.println(
                    "Size : "
                            + growth.size()
                            + "  Capacity : "
                            + growth.capacity());
        }

        /*
         * Output
         *
         * Size : 5  Capacity : 5
         * Size : 6  Capacity : 8
         * Size : 9  Capacity : 11
         * Size : 12 Capacity : 14
         */




        // =====================================================
        // Thread Safety Demonstration
        // =====================================================

        Vector<Integer> numbers1 = new Vector<>();

        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);

        System.out.println("\nThread Safety");

        System.out.println(numbers1);

        /*
         * All public methods of Vector
         * are synchronized.
         *
         * Multiple threads can safely
         * access the same Vector.
         *
         * Therefore,
         *
         * Vector is Thread-Safe.
         *
         * Due to synchronization,
         * Vector is slower than ArrayList.
         */

        // =====================================================
        // Vector Specific Public Methods
        // =====================================================


        // -----------------------------------------------------
        // capacity()
        // -----------------------------------------------------

        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println("\ncapacity()");

        System.out.println("Elements : " + vector);

        System.out.println("Size     : " + vector.size());

        System.out.println("Capacity : " + vector.capacity());

        // Note:
        // capacity() returns the current storage capacity.
        // It is different from size().



        // -----------------------------------------------------
        // ensureCapacity()
        // -----------------------------------------------------

        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nensureCapacity()");

        System.out.println("Before Capacity : "
                + numbers.capacity());

        numbers.ensureCapacity(50);

        System.out.println("After Capacity  : "
                + numbers.capacity());

        System.out.println(numbers);

        // Note:
        // Ensures that the Vector can store
        // at least the specified number of elements
        // without resizing.



        // -----------------------------------------------------
        // trimToSize()
        // -----------------------------------------------------

        Vector<String> fruits = new Vector<>();

        fruits.ensureCapacity(30);

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("\ntrimToSize()");

        System.out.println("Before Capacity : "
                + fruits.capacity());

        fruits.trimToSize();

        System.out.println("After Capacity  : "
                + fruits.capacity());

        System.out.println(fruits);

        // Note:
        // Reduces the capacity
        // to match the current size.



        // -----------------------------------------------------
        // setSize()
        // -----------------------------------------------------

        Vector<String> cities = new Vector<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");

        System.out.println("\nsetSize()");

        System.out.println("Before : " + cities);

        cities.setSize(5);

        System.out.println("After Increasing Size");

        System.out.println(cities);

        /*
         * Output
         *
         * [Mumbai, Delhi, Pune, null, null]
         */

        cities.setSize(2);

        System.out.println("\nAfter Decreasing Size");

        System.out.println(cities);

        // Note:
        // Increasing size adds null values.
        // Decreasing size removes extra elements.



        // -----------------------------------------------------
        // copyInto()
        // -----------------------------------------------------

        Vector<String> languages = new Vector<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("\ncopyInto()");

        Object[] array = new Object[languages.size()];

        languages.copyInto(array);

        System.out.println("Array Elements");

        for (Object value : array) {
            System.out.println(value);
        }

        // Note:
        // Copies all Vector elements
        // into the specified array.



        // -----------------------------------------------------
        // elements()
        // -----------------------------------------------------

        Vector<String> names1 = new Vector<>();

        names1.add("Aman");
        names1.add("Maaz");
        names1.add("Rudra");

        System.out.println("\nelements()");

        Enumeration<String> enumeration =
                names1.elements();

        while (enumeration.hasMoreElements()) {

            System.out.println(
                    enumeration.nextElement()
            );
        }

        // Note:
        // Enumeration is a legacy cursor.
        // Similar to Iterator,
        // but does not support remove().



        // -----------------------------------------------------
        // clone()
        // -----------------------------------------------------

        Vector<String> original = new Vector<>();

        original.add("Java");
        original.add("Python");
        original.add("C++");

        System.out.println("\nclone()");

        @SuppressWarnings("unchecked")
        Vector<String> copy =
                (Vector<String>) original.clone();

        System.out.println("Original : " + original);

        System.out.println("Copied   : " + copy);

        copy.add("JavaScript");

        System.out.println("\nAfter Modifying Copied Vector");

        System.out.println("Original : " + original);

        System.out.println("Copied   : " + copy);

        // Note:
        // clone() creates a shallow copy.
        // Only the Vector object is copied.



        // =====================================================
        // Shallow Copy Demonstration
        // =====================================================

        Vector<Car> originalCars = new Vector<>();

        originalCars.add(new Car("BMW", 900));
        originalCars.add(new Car("Toyota", 500));

        @SuppressWarnings("unchecked")
        Vector<Car> copiedCars =
                (Vector<Car>) originalCars.clone();

        System.out.println("\nShallow Copy Demo");

        System.out.println("Original : " + originalCars);

        System.out.println("Copied   : " + copiedCars);

        copiedCars.get(0).brand = "Audi";

        System.out.println("\nAfter Modifying Object Inside Copied Vector");

        System.out.println("Original : " + originalCars);

        System.out.println("Copied   : " + copiedCars);

        // Note:
        // Vector object is copied.
        // Stored objects are shared.
        // Both vectors point to the same Car objects.

        // =====================================================
        // Legacy Methods
        // =====================================================


        // -----------------------------------------------------
        // addElement()
        // -----------------------------------------------------

        Vector<String> legacy = new Vector<>();

        System.out.println("\naddElement()");

        legacy.addElement("Java");
        legacy.addElement("Python");
        legacy.addElement("C++");

        System.out.println(legacy);

        // Note:
        // Legacy version of add(E).


        // -----------------------------------------------------
        // insertElementAt()
        // -----------------------------------------------------

        System.out.println("\ninsertElementAt()");

        legacy.insertElementAt("JavaScript", 1);

        System.out.println(legacy);

        // Note:
        // Legacy version of add(index, element).



        // -----------------------------------------------------
        // removeElement()
        // -----------------------------------------------------

        System.out.println("\nremoveElement()");

        legacy.removeElement("Python");

        System.out.println(legacy);

        // Note:
        // Removes the first matching element.



        // -----------------------------------------------------
        // removeElementAt()
        // -----------------------------------------------------

        System.out.println("\nremoveElementAt()");

        legacy.removeElementAt(1);

        System.out.println(legacy);

        // Note:
        // Removes element using index.



        // -----------------------------------------------------
        // firstElement()
        // -----------------------------------------------------

        System.out.println("\nfirstElement()");

        System.out.println("First : " + legacy.firstElement());



        // -----------------------------------------------------
        // lastElement()
        // -----------------------------------------------------

        System.out.println("\nlastElement()");

        System.out.println("Last : " + legacy.lastElement());



        // -----------------------------------------------------
        // setElementAt()
        // -----------------------------------------------------

        System.out.println("\nsetElementAt()");

        legacy.setElementAt("Oracle Java", 0);

        System.out.println(legacy);

        // Note:
        // Replaces the element at specified index.



        // -----------------------------------------------------
        // elementAt()
        // -----------------------------------------------------

        System.out.println("\nelementAt()");

        System.out.println(legacy.elementAt(0));

        // Note:
        // Returns element at specified index.



        // -----------------------------------------------------
        // removeAllElements()
        // -----------------------------------------------------

        System.out.println("\nremoveAllElements()");

        legacy.removeAllElements();

        System.out.println(legacy);

        // Note:
        // Removes all elements from Vector.



        // =====================================================
        // Reference Type Demonstration
        // =====================================================


        // -----------------------------------------------------
        // Collection Reference
        // -----------------------------------------------------

        Collection<Integer> collection =
                new Vector<>();

        collection.add(10);

        // Can access only Collection methods.

        // collection.get(0);             // ❌
        // collection.capacity();         // ❌



        // -----------------------------------------------------
        // List Reference
        // -----------------------------------------------------

        List<Integer> list =
                new Vector<>();

        list.add(10);

        list.get(0);

        // Can access:
        //
        // Collection
        // List

        // list.capacity();              // ❌



        // -----------------------------------------------------
        // Vector Reference
        // -----------------------------------------------------

        Vector<Integer> vectorRef =
                new Vector<>();

        vectorRef.add(10);

        vectorRef.capacity();

        vectorRef.ensureCapacity(50);

        vectorRef.trimToSize();

        vectorRef.setSize(5);

        vectorRef.elements();

        vectorRef.clone();

        // Can access:
        //
        // Collection
        // List
        // Vector Specific Methods
        // Legacy Methods



        // =====================================================
        // Optimized Overrides
        // =====================================================


        Vector<String> fruits1 = new Vector<>();

        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Mango");



        // -----------------------------------------------------
        // forEach()
        // -----------------------------------------------------

        System.out.println("\n========== forEach() ==========");

        fruits.forEach(System.out::println);



        // -----------------------------------------------------
        // replaceAll()
        // -----------------------------------------------------

        System.out.println("\n========== replaceAll() ==========");

        Vector<String> names = new Vector<>();

        names.add("maaz");
        names.add("john");
        names.add("alex");

        names.replaceAll(String::toUpperCase);

        System.out.println(names);



        // -----------------------------------------------------
        // sort()
        // -----------------------------------------------------

        System.out.println("\n========== sort() ==========");

        Vector<Integer> marks = new Vector<>();

        marks.add(78);
        marks.add(45);
        marks.add(99);
        marks.add(61);
        marks.add(85);

        marks.sort(Comparator.naturalOrder());

        System.out.println("Ascending  : " + marks);

        marks.sort(Comparator.reverseOrder());

        System.out.println("Descending : " + marks);



        // -----------------------------------------------------
        // spliterator()
        // -----------------------------------------------------

        System.out.println("\n========== spliterator() ==========");

        Vector<String> cities1 = new Vector<>();

        cities1.add("Mumbai");
        cities1.add("Delhi");
        cities1.add("Pune");
        cities1.add("Hyderabad");

        Spliterator<String> spliterator =
                cities1.spliterator();

        spliterator.forEachRemaining(System.out::println);




        /*
         * ==========================================================
         *          Exists in Java but Not Covered Yet
         *
         *               ├────────────────────────────────────────────
         *               │
         *               ├── 🆕 reversed() (Java 21)
         *               ├── 🆕 SequencedCollection Methods
         *               └── 🔒 Internal Helper Methods
         *
         * ==========================================================
         */




        /*
         * ==========================================================
         *            Methods Inherited from Object
         *
         *               ├── 🆕 toString()
         *               ├── 🆕 getClass()
         *               ├── 🆕 wait()
         *               ├── 🆕 wait(long)
         *               ├── 🆕 wait(long, int)
         *               ├── 🆕 notify()
         *               ├── 🆕 notifyAll()
         *               ├── 🆕 clone() (protected)
         *               ├── 🆕 equals(Object)
         *               ├── 🆕 hashCode()
         *               └── 🆕 finalize() (Deprecated)
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