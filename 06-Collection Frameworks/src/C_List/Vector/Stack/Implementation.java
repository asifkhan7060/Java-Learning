package C_List.Vector.Stack;

import java.util.*;

// In Which areas Stack is used ?
//
// Stack extends Vector.
//
// Stack follows the
// LIFO (Last In First Out) principle.

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

        /*
         * Stack
         *
         * Top
         *  │
         *  ▼
         * 30
         * 20
         * 10
         *
         * Bottom
         */

        // Note:
        // Adds an element
        // to the Top of the Stack.




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

        /*
         * Before pop()
         *
         * Top
         *
         * 30
         * 20
         * 10
         *
         * After pop()
         *
         * Top
         *
         * 20
         * 10
         */

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

        /*
         * Output
         *
         * false
         *
         * true
         */

        // Note:
        // Returns true
        // if Stack contains no elements.




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




        // =====================================================
        // LIFO Demonstration
        // =====================================================

        Stack<String> demo = new Stack<>();

        demo.push("Book");
        demo.push("Laptop");
        demo.push("Mobile");
        demo.push("Headphones");

        System.out.println("\nLIFO Demonstration");

        System.out.println("Initial Stack : " + demo);

        System.out.println("peek() : "
                + demo.peek());

        System.out.println("pop() : "
                + demo.pop());

        System.out.println("After pop()");

        System.out.println(demo);

        /*
         * Push
         *
         * Book
         * Laptop
         * Mobile
         * Headphones
         *
         * Top
         *
         * pop()
         *
         * Removes
         *
         * Headphones
         */

        // =====================================================
        // clone()
        // =====================================================

        Stack<String> originalStack = new Stack<>();

        originalStack.push("Java");
        originalStack.push("Python");
        originalStack.push("C++");

        System.out.println("\nclone()");

        @SuppressWarnings("unchecked")
        Stack<String> clonedStack =
                (Stack<String>) originalStack.clone();

        System.out.println("Original Stack : " + originalStack);
        System.out.println("Cloned Stack   : " + clonedStack);

        // Modify cloned stack

        clonedStack.push("JavaScript");

        System.out.println("\nAfter Modifying Cloned Stack");

        System.out.println("Original Stack : " + originalStack);
        System.out.println("Cloned Stack   : " + clonedStack);

        // Note:
        // clone() creates a shallow copy.
        // Only the Stack object is copied.
        // Stored objects are shared between both stacks.



        // =====================================================
        // Shallow Copy Demonstration
        // =====================================================

        Stack<Car> originalCars = new Stack<>();

        originalCars.push(new Car("BMW", 900));
        originalCars.push(new Car("Toyota", 500));

        @SuppressWarnings("unchecked")
        Stack<Car> copiedCars =
                (Stack<Car>) originalCars.clone();

        System.out.println("\nShallow Copy Demo");

        System.out.println("Original : " + originalCars);
        System.out.println("Copied   : " + copiedCars);

        // Modify object inside copied stack

        copiedCars.peek().brand = "Audi";

        System.out.println("\nAfter Modifying Object Inside Copied Stack");

        System.out.println("Original : " + originalCars);
        System.out.println("Copied   : " + copiedCars);

        /*
         * copiedCars.peek()
         *
         * Returns the Top Car object.
         *
         * Top
         *  │
         *  ▼
         * Toyota
         * BMW
         *
         * copiedCars.get(0)
         *
         * Returns the Bottom Car object.
         *
         * Bottom
         *  │
         *  ▼
         * BMW
         * Toyota
         *
         * Since Stack extends Vector,
         * both peek() and get(index)
         * are valid.
         *
         * peek() is preferred because
         * it follows Stack behaviour.
         */

        // Note:
        // Only the Stack object is copied.
        // Car objects are NOT copied.
        // Both stacks point to the same Car objects.




        // =====================================================
        // Reference Type Demonstration
        // =====================================================


        // -----------------------------------------------------
        // Collection Reference
        // -----------------------------------------------------

        Collection<Integer> collectionRef =
                new Stack<>();

        collectionRef.add(10);

        // Can access:
        //
        // Collection Methods
        //
        // Cannot access:
        //
        // List Methods
        // Vector Methods
        // Stack Methods

        // collectionRef.get(0);       // ❌
        // collectionRef.push(10);     // ❌



        // -----------------------------------------------------
        // List Reference
        // -----------------------------------------------------

        List<Integer> listRef =
                new Stack<>();

        listRef.add(10);

        listRef.get(0);

        // Can access:
        //
        // Collection Methods
        // List Methods
        //
        // Cannot access:
        //
        // Vector Methods
        // Stack Methods

        // listRef.capacity();         // ❌
        // listRef.push(10);           // ❌



        // -----------------------------------------------------
        // Vector Reference
        // -----------------------------------------------------

        Vector<Integer> vectorRef =
                new Stack<>();

        vectorRef.add(10);

        vectorRef.capacity();

        vectorRef.ensureCapacity(20);

        vectorRef.trimToSize();

        vectorRef.clone();

        // Can access:
        //
        // Collection Methods
        // List Methods
        // Vector Methods
        //
        // Cannot access:
        //
        // Stack Methods

        // vectorRef.push(10);         // ❌



        // -----------------------------------------------------
        // Stack Reference
        // -----------------------------------------------------

        Stack<Integer> stackRef =
                new Stack<>();

        stackRef.push(10);

        stackRef.peek();

        stackRef.pop();

        stackRef.search(10);

        stackRef.empty();

        // Can access:
        //
        // Collection Methods
        // List Methods
        // Vector Methods
        // Stack Methods



        // Note:
        //
        // Collection Reference
        // Recommended when only Collection operations are required.
        //
        // List Reference
        // Recommended for index-based operations.
        //
        // Vector Reference
        // Required when using Vector-specific methods.
        //
        // Stack Reference
        // Required when using push(), pop(), peek(),
        // empty() and search().

        // =====================================================
        // Optimized Overrides
        // =====================================================


        // -----------------------------------------------------
        // forEach()
        // -----------------------------------------------------

        Stack<String> fruitStack = new Stack<>();

        fruitStack.push("Apple");
        fruitStack.push("Banana");
        fruitStack.push("Mango");

        System.out.println("\n========== forEach() ==========");

        fruitStack.forEach(System.out::println);

        // Note:
        // Executes the given action
        // for every element in the Stack.



        // -----------------------------------------------------
        // replaceAll()
        // -----------------------------------------------------

        Stack<String> nameStack = new Stack<>();

        nameStack.push("maaz");
        nameStack.push("john");
        nameStack.push("alex");

        System.out.println("\n========== replaceAll() ==========");

        nameStack.replaceAll(String::toUpperCase);

        System.out.println(nameStack);

        // Note:
        // Replaces every element
        // using the specified operation.



        // -----------------------------------------------------
        // sort()
        // -----------------------------------------------------

        Stack<Integer> markStack = new Stack<>();

        markStack.push(78);
        markStack.push(45);
        markStack.push(99);
        markStack.push(61);
        markStack.push(85);

        System.out.println("\n========== sort() ==========");

        markStack.sort(Comparator.naturalOrder());

        System.out.println("Ascending  : " + markStack);

        markStack.sort(Comparator.reverseOrder());

        System.out.println("Descending : " + markStack);

        // Note:
        // Since Stack extends Vector,
        // sorting is supported.
        //
        // However, sorting changes the
        // natural LIFO ordering of a Stack.
        //
        // Generally not recommended
        // for stack-based algorithms.



        // -----------------------------------------------------
        // spliterator()
        // -----------------------------------------------------

        Stack<String> cityStack = new Stack<>();

        cityStack.push("Mumbai");
        cityStack.push("Delhi");
        cityStack.push("Pune");
        cityStack.push("Hyderabad");

        System.out.println("\n========== spliterator() ==========");

        Spliterator<String> stackSpliterator =
                cityStack.spliterator();

        stackSpliterator.forEachRemaining(System.out::println);

        // Note:
        // Returns a Spliterator
        // for traversing Stack elements.




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