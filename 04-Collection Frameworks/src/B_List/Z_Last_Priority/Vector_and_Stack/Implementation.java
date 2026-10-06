package B_List.Z_Last_Priority.Vector_and_Stack;

import java.util.*;

public class Implementation {

    static void main() {

        // =====================================================
        //                       VECTOR
        // =====================================================

        {
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

                    for (String languages12 : languages1) {
                        System.out.println(languages12);
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
                    // Ensures that the Vector can store at least the specified number of elements without resizing.

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

                    Object[] array = new Object[5];  // languages.size() preferred

                    languages.copyInto(array);

                    System.out.println("Array Elements");

                    for (Object value : array) {
                        System.out.println(value);
                    }

                    // Note:
                    // Copies all Vector elements into the specified array.


                    // -----------------------------------------------------
                    // elements() - Legacy Method
                    // -----------------------------------------------------

                    /*
                    elements() returns an Enumeration for traversing Vector elements.

                    It exists for backward compatibility.
                    Modern Java prefers Iterator, enhanced for-loop, or Streams.
                    */

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

                    // same as arraylist,linkedlist


                    /*
                    =====================================================
                    Vector Legacy Methods (Not Recommended to learn)
                    =====================================================

                    These methods exist for backward compatibility.
                    Prefer the modern List methods in new applications.

                    | Legacy Method             | Modern Equivalent         |
                    |--------------------------|---------------------------|
                    | addElement(E obj)        | add(E e)                  |
                    | insertElementAt(E, int)  | add(int, E)               |
                    | removeElement(Object)    | remove(Object)            |
                    | removeElementAt(int)     | remove(int)               |
                    | firstElement()           | get(0)                    |
                    | lastElement()            | get(size() - 1)           |
                    | setElementAt(E, int)     | set(int, E)               |
                    | elementAt(int)           | get(int)                  |
                    | removeAllElements()      | clear()                   |

                    Use these methods only when working with legacy Java code.


                    // =====================================================
                    // Optimized Overrides - Already Covered in ArrayList
                    // =====================================================

                    /*
                    The following methods behave the same in Vector.
                    Refer to ArrayList Implementation.java.

                    ✓ forEach()
                    ✓ replaceAll()
                    ✓ sort()
                    ✓ spliterator()

                    Reason:
                    Vector implements the List interface, so these
                    default methods work exactly the same. The only
                    difference is that Vector methods are synchronized
                    (thread-safe).
                    */


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

        // =====================================================
        //                        STACK
        // =====================================================

        {
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
                    // Methods Inherited from Vector
                    // =====================================================

                    // Already implemented in Vector topic

                    // capacity()
                    // ensureCapacity()
                    // trimToSize()
                    // setSize()
                    // copyInto()
                    // elements()
                    // clone()


                    // =====================================================
                    // Basic Stack Implementation
                    // =====================================================

                    // Uncontrolled Datatypes (Without Type Safety)

                    Stack<Object> users = new Stack<>();

                    users.push("Alice");
                    users.push(101);
                    users.push(true);

                    System.out.println("Using Stack<Object>");

                    for (Object user : users) {
                        System.out.println(user);
                    }

                    // Controlled Datatypes (Generics)

                    Stack<String> languages = new Stack<>();

                    languages.push("Java");
                    languages.push("Python");
                    languages.push("C++");
                    languages.push("Java");      // Duplicate Allowed
                    languages.push(null);        // Null Allowed

                    System.out.println("\nUsing Stack<String>");

                    for (String language : languages) {
                        System.out.println(language);
                    }


                    // Iterator

                    System.out.println("\nUsing Iterator");

                    Iterator<String> iterator = languages.iterator();

                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }


                    // Using Custom Class

                    Stack<Car> cars = new Stack<>();

                    cars.push(new Car("BMW", 900));
                    cars.push(new Car("Toyota", 500));

                    System.out.println("\nUsing Custom Class");

                    for (Car car : cars) {
                        System.out.println(car);
                    }


                    // =====================================================
                    // Constructor
                    // =====================================================

                    // -----------------------------------------------------
                    // Stack()
                    // -----------------------------------------------------

                    /*
                    =====================================================
                    Stack vs Deque (Stack Operations)
                    =====================================================

                    Stack (extends Vector)

                    push(10)
                    push(20)
                    push(30)

                    Prints:
                    [10, 20, 30]

                    Reason:
                    Stack pushes elements at the end of the underlying Vector.
                    Vector's toString() prints elements in insertion order
                    (Bottom -> Top).

                    -----------------------------------------------------

                    Deque (LinkedList / ArrayDeque)

                    push(10)
                    push(20)
                    push(30)

                    Prints:
                    [30, 20, 10]

                    Reason:
                    In Deque,

                    push() == addFirst()

                    Each push inserts the element at the front.
                    LinkedList/ArrayDeque toString() prints from Front -> Rear.

                    Equivalent:

                    push(e)  == addFirst(e)
                    pop()    == removeFirst()
                    peek()   == peekFirst()

                    -----------------------------------------------------

                    Conclusion

                    Stack:
                    Bottom -> Top
                    [10, 20, 30]

                    Deque (used as Stack):
                    Front -> Rear
                    [30, 20, 10]

                    Both follow the LIFO principle.
                    Only the internal insertion position and printed order differ.
                    */

                    Stack<Integer> stack = new Stack<>();

                    stack.push(10);
                    stack.push(20);
                    stack.push(30);

                    System.out.println("\nStack()");

                    System.out.println(stack);

                    // Note:
                    // Stack has only one constructor.
                    // Internally it uses Vector.


                    // =====================================================
                    // push()
                    // =====================================================

                    Stack<Integer> numbers = new Stack<>();

                    System.out.println("\npush()");

                    numbers.push(10);
                    numbers.push(20);
                    numbers.push(30);

                    System.out.println(numbers);


                    // =====================================================
                    // peek()
                    // =====================================================

                    System.out.println("\npeek()");

                    System.out.println("Top Element : "
                            + numbers.peek());

                    System.out.println("Stack : " + numbers);

                    // Note:
                    // Returns the Top element.
                    // Does NOT remove it.


                    // =====================================================
                    // pop()
                    // =====================================================

                    System.out.println("\npop()");

                    System.out.println("Removed : "
                            + numbers.pop());

                    System.out.println("Stack : " + numbers);

                    // Note:
                    // Removes and returns
                    // the Top element.


                    // =====================================================
                    // empty()
                    // =====================================================

                    System.out.println("\nempty()");

                    System.out.println(numbers.empty());

                    numbers.clear();

                    System.out.println(numbers.empty());


                    // =====================================================
                    // search()
                    // =====================================================

                    Stack<Integer> searchStack = new Stack<>();

                    searchStack.push(10);
                    searchStack.push(20);
                    searchStack.push(30);
                    searchStack.push(40);

                    System.out.println("\nsearch()");

                    System.out.println(searchStack);

                    System.out.println("Position of 40 : "
                            + searchStack.search(40));

                    System.out.println("Position of 20 : "
                            + searchStack.search(20));

                    System.out.println("Position of 100 : "
                            + searchStack.search(100));

                    /*
                     * Position is counted
                     * from the Top.
                     *
                     * Top
                     *
                     * 40 -> Position 1
                     * 30 -> Position 2
                     * 20 -> Position 3
                     * 10 -> Position 4
                     *
                     * Not Found -> -1
                     */

                    /*
                    =====================================================
                    Already Covered in ArrayList
                    =====================================================

                    The following methods/concepts behave the same for Stack.
                    Refer to ArrayList Implementation.java.

                    ✓ clone() (Shallow Copy Demo)
                    ✓ Reference Type Demonstration
                    ✓ forEach()
                    ✓ replaceAll()
                    ✓ spliterator()
                    ✓ Object Methods
                    ✓ removeIf()
                    ✓ stream()
                    ✓ parallelStream()
                    ✓ toArray(IntFunction<T[]>)

                    =====================================================
                    Stack-Specific Note
                    =====================================================

                    ✓ sort()

                    Although Stack supports sort() (because it extends Vector),
                    sorting is generally NOT recommended as it changes the
                    natural LIFO ordering of the Stack.
                    */



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
