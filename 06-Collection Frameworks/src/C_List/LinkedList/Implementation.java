package C_List.LinkedList;

import java.util.*;

// In Which areas LinkedList is used ?
//
// LinkedList implements:
// 1. List
// 2. Queue
// 3. Deque
//
// Hold Ctrl and click LinkedList -> Deque -> Queue -> List
// to understand the complete hierarchy.

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
        // Basic LinkedList Implementation
        // =====================================================

        // Uncontrolled Datatypes (Without Type Safety)

        List<Object> users = new LinkedList<>();

        users.add("Alice");
        users.add(101);
        users.add(true);

        System.out.println("Using List<Object>");

        for (Object user : users) {
            System.out.println(user);
        }


        // Controlled Datatypes (Generics)

        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");      // Duplicate Allowed
        languages.add(null);        // Null Allowed

        System.out.println("\nUsing LinkedList<String>");

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

        LinkedList<Car> cars = new LinkedList<>();

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
        // LinkedList()
        // -----------------------------------------------------

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println("\nLinkedList()");
        System.out.println(list1);

        // Note:
        // Creates an empty LinkedList.
        // No capacity concept exists.
        // Nodes are created dynamically.



        // -----------------------------------------------------
        // LinkedList(Collection) - shallow concept (copy changed but original remains same)
        // -----------------------------------------------------

        LinkedList<Integer> list2 = new LinkedList<>(list1);

        System.out.println("\nLinkedList(Collection)");

        System.out.println("Original : " + list1);
        System.out.println("Copied   : " + list2);

        list2.add(40);

        System.out.println("\nAfter Modifying Copied List");

        System.out.println("Original : " + list1);
        System.out.println("Copied   : " + list2);

        // Note:
        // Elements are copied into a new LinkedList.
        // Original list remains unchanged.



        // =====================================================
        // Queue Methods
        // =====================================================

        // Queue follows FIFO - First In First Out

        /*

        add(e)     -> Inserts element at rear.
                      Throws IllegalStateException if insertion fails.

        offer(e)   -> Inserts element at rear.
                      Returns false if insertion fails. (Preferred)

        remove()   -> Removes and returns the head.
                      Throws NoSuchElementException if queue is empty.

        poll()     -> Removes and returns the head.
                      Returns null if queue is empty. (Preferred)

        element()  -> Returns the head without removing.
                      Throws NoSuchElementException if queue is empty.

        peek()     -> Returns the head without removing.
                      Returns null if queue is empty. (Preferred)
        */

        Queue<Integer> queue = new LinkedList<>();

        // -----------------------------------------------------
        // offer()
        // -----------------------------------------------------

        System.out.println("\noffer()");

        queue.offer(10); // return false if it's not added
        queue.offer(20);
        queue.offer(30);
        queue.add(40); // throws exception if it's not added

        System.out.println(queue);

        // Note:
        // Inserts element at the rear(back) of the queue.


        // -----------------------------------------------------
        // peek()
        // -----------------------------------------------------

        System.out.println("\npeek()");

        System.out.println("Front Element : " + queue.peek());

        System.out.println("Queue : " + queue);

        // Note:
        // Returns front element.
        // Does not remove it.
        // Returns null if queue is empty.


        // -----------------------------------------------------
        // element()
        // -----------------------------------------------------

        System.out.println("\nelement()");

        System.out.println("Front Element : " + queue.element());

        System.out.println("Queue : " + queue);

        // Note:
        // Similar to peek().
        // Throws exception if queue is empty.


        // -----------------------------------------------------
        // poll()
        // -----------------------------------------------------

        System.out.println("\npoll()");

        System.out.println("Removed : " + queue.poll());

        System.out.println("Queue : " + queue);

        // Note:
        // Removes front element.
        // Returns null if queue is empty.


        // -----------------------------------------------------
        // remove()
        // -----------------------------------------------------

        System.out.println("\nremove()");

        System.out.println("Removed : " + queue.remove());

        System.out.println("Queue : " + queue);

        // Note:
        // Removes front element.
        // Throws exception if queue is empty.


        // =====================================================
        // Deque - (Double Ended Queue) Methods
        // =====================================================

        // Insertion and Deletion are possible from both Front and Rear.

        /* Methods :-
        Front: addFirst, offerFirst, removeFirst, pollFirst, getFirst, peekFirst
        Rear: addLast, offerLast, removeLast, pollLast, getLast, peekLast
        Stack: push, pop
        Occurrence: removeFirstOccurrence, removeLastOccurrence
         */

        Deque<Integer> deque = new LinkedList<>();

        // -----------------------------------------------------
        // addFirst()
        // -----------------------------------------------------

        System.out.println("\naddFirst()");

        deque.addFirst(20);
        deque.addFirst(10);

        System.out.println(deque);

        // Note:
        // Inserts element at the beginning.
        // Throws exception if insertion fails.


        // -----------------------------------------------------
        // addLast()
        // -----------------------------------------------------

        System.out.println("\naddLast()");

        deque.addLast(30);
        deque.addLast(40);

        System.out.println(deque);

        // Note:
        // Inserts element at the end.


        // -----------------------------------------------------
        // offerFirst()
        // -----------------------------------------------------

        System.out.println("\nofferFirst()");

        deque.offerFirst(5);

        System.out.println(deque);

        // Note:
        // Similar to addFirst().
        // Returns true/false instead of throwing exception.


        // -----------------------------------------------------
        // offerLast()
        // -----------------------------------------------------

        System.out.println("\nofferLast()");

        deque.offerLast(50);

        System.out.println(deque);

        // Note:
        // Similar to addLast().
        // Returns true/false.


        // -----------------------------------------------------
        // getFirst()
        // -----------------------------------------------------

        System.out.println("\ngetFirst()");

        System.out.println("First : " + deque.getFirst());

        // Note:
        // Returns first element.
        // Throws exception if deque is empty.


        // -----------------------------------------------------
        // getLast()
        // -----------------------------------------------------

        System.out.println("\ngetLast()");

        System.out.println("Last : " + deque.getLast());


        // -----------------------------------------------------
        // peekFirst()
        // -----------------------------------------------------

        System.out.println("\npeekFirst()");

        System.out.println("First : " + deque.peekFirst());

        // Note:
        // Returns null if deque is empty.


        // -----------------------------------------------------
        // peekLast()
        // -----------------------------------------------------

        System.out.println("\npeekLast()");

        System.out.println("Last : " + deque.peekLast());


        // -----------------------------------------------------
        // removeFirst()
        // -----------------------------------------------------

        System.out.println("\nremoveFirst()");

        System.out.println("Removed : " + deque.removeFirst());

        System.out.println(deque);

        // Note:
        // Removes first element.
        // Throws exception if deque is empty.


        // -----------------------------------------------------
        // removeLast()
        // -----------------------------------------------------

        System.out.println("\nremoveLast()");

        System.out.println("Removed : " + deque.removeLast());

        System.out.println(deque);


        // -----------------------------------------------------
        // pollFirst()
        // -----------------------------------------------------

        System.out.println("\npollFirst()");

        System.out.println("Removed : " + deque.pollFirst());

        System.out.println(deque);

        // Note:
        // Returns null if deque is empty.


        // -----------------------------------------------------
        // pollLast()
        // -----------------------------------------------------

        System.out.println("\npollLast()");

        System.out.println("Removed : " + deque.pollLast());

        System.out.println(deque);


        // LIFO

        // -----------------------------------------------------
        // push()
        // -----------------------------------------------------

        System.out.println("\npush()");

        deque.push(100);
        deque.push(200);
        deque.push(300);

        System.out.println(deque);

        // Note:
        // push() inserts element at the front.
        // Used when LinkedList behaves like a Stack.


        // -----------------------------------------------------
        // pop()
        // -----------------------------------------------------

        System.out.println("\npop()");

        System.out.println("Removed : " + deque.pop());

        System.out.println(deque);

        // Note:
        // Removes top element.


        // -----------------------------------------------------
        // removeFirstOccurrence()
        // -----------------------------------------------------

        deque.clear();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(20);
        deque.add(40);

        System.out.println("\nremoveFirstOccurrence()");

        System.out.println("Before : " + deque);

        deque.removeFirstOccurrence(20);

        System.out.println("After  : " + deque);

        // Note:
        // Removes only first matching element.


        // -----------------------------------------------------
        // removeLastOccurrence()
        // -----------------------------------------------------

        deque.clear();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(20);
        deque.add(40);

        System.out.println("\nremoveLastOccurrence()");

        System.out.println("Before : " + deque);

        deque.removeLastOccurrence(20);

        System.out.println("After  : " + deque);

        // Note:
        // Removes only last matching element.


        // -----------------------------------------------------
        // descendingIterator()
        // -----------------------------------------------------

        /*
        Declared in:
        Deque<E> Interface

        Implemented by:
        ArrayDeque
        LinkedList

        Returns an Iterator that traverses the deque from rear (last) to front (first).

        It does NOT sort the elements.
        It only reverses the traversal direction.

        Example:

        Deque : [40, 70, 20, 100]

        iterator()            -> 40 70 20 100
        descendingIterator()  -> 100 20 70 40

        Traversal:
        iterator()            : Front -> Rear
        descendingIterator()  : Rear  -> Front
        */

        deque.clear();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        System.out.println("\ndescendingIterator()");

        Iterator<Integer> descending =
                deque.descendingIterator();

        while (descending.hasNext()) {
            System.out.print(descending.next() + " ");
        }

        System.out.println();

        /*
        Already Covered (Same as ArrayList)

        ✓ clone() (Shallow Copy Demo)
        ✓ Reference Type Demonstration
        ✓ forEach()
        ✓ replaceAll()
        ✓ sort()
        ✓ spliterator()
        ✓ Object Methods
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