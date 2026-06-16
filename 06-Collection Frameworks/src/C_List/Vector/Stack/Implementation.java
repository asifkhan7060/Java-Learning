package C_List.Vector.Stack;

import java.util.*;

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