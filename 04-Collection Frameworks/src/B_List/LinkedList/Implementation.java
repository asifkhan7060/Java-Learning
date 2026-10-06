package B_List.LinkedList;

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
        // Constructors (2)
        // =====================================================

        LinkedList<Integer> list1 = new LinkedList<>(); // Normal

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

        System.out.println("Original : " + list1); // [10, 20, 30]
        System.out.println("Copied   : " + list2); // [10, 20, 30]

        list2.add(40);

        System.out.println("\nAfter Modifying Copied List");

        System.out.println("Original : " + list1); // [10, 20, 30]
        System.out.println("Copied   : " + list2); // [10, 20, 30, 40]

        // Note:
        // Elements are copied into a new LinkedList.
        // Original list remains unchanged.


        // =====================================================
        // ArrayList Specific Methods (1)
        // =====================================================

        // =====================================================
        // clone()
        // =====================================================

        ArrayList<String> Og = new ArrayList<>();

        Og.add("Java");
        Og.add("Python");
        Og.add("C++");

        System.out.println("\nclone()");

        @SuppressWarnings("unchecked")
        ArrayList<String> copy = (ArrayList<String>) Og.clone();

        System.out.println("Original List : " + Og); // [Java, Python, C++]
        System.out.println("Cloned List   : " + copy); // [Java, Python, C++]

        // Modify cloned list

        copy.add("JavaScript");

        System.out.println("\nAfter Modifying Cloned List");

        System.out.println("Original List : " + Og); // [Java, Python, C++]
        System.out.println("Cloned List   : " + copy); // [Java, Python, C++, JavaScript]

        // Note:
        // clone() creates a shallow copy.

        // Shallow Copy Demonstration with Class - Same as Arraylist code and use Shallowcopydemo.md


        // =====================================================
        // LinkedList as Queue - FIFO
        // =====================================================

        Queue<Integer> queue = new LinkedList<>();

        // -----------------------------------------------------
        // add() vs offer()
        // -----------------------------------------------------

        System.out.println("\nadd() vs offer()");

        // Both insert the element at the rear of the queue.
        // Difference: add() throws an exception if insertion fails,
        // while offer() returns false.

        queue.add(10);
        queue.offer(20);

        queue.add(30);
        queue.offer(40);

        System.out.println("Queue : " + queue);


        // -----------------------------------------------------
        // peek() vs element()
        // -----------------------------------------------------

        System.out.println("\npeek() vs element()");

        // Both return the front element without removing it.
        // Difference: peek() returns null if the queue is empty,
        // while element() throws an exception.

        System.out.println("peek()    : " + queue.peek());
        System.out.println("element() : " + queue.element());


        // -----------------------------------------------------
        // remove() vs poll()
        // -----------------------------------------------------

        System.out.println("\nremove() vs poll()");

        // Both remove and return the front element.
        // Difference: poll() returns null if the queue is empty,
        // while remove() throws an exception.

        System.out.println("poll()   : " + queue.poll());
        System.out.println("remove() : " + queue.remove());

        System.out.println("Queue : " + queue);


        // =====================================================
        // LinkedList as Deque - Double Ended Queue
        // =====================================================

        // LinkedList implements Deque, so elements can be inserted, accessed, and removed from both the front and rear.

        Deque<Integer> deque = new LinkedList<>();

        // =====================================================
        // Insertion: Front vs Rear
        // =====================================================

        // addFirst() / addLast() → insert at front / rear
        // offerFirst() / offerLast() → same, but return true/false instead of throwing an exception if insertion fails.

        deque.addFirst(20);
        deque.addLast(30);

        deque.offerFirst(10);
        deque.offerLast(40);

        System.out.println("After Insertion : " + deque);


        // =====================================================
        // Access: Front vs Rear
        // =====================================================

        // getFirst() / getLast() → throw exception if empty
        // peekFirst() / peekLast() → return null if empty

        System.out.println("getFirst()  : " + deque.getFirst());
        System.out.println("getLast()   : " + deque.getLast());

        System.out.println("peekFirst() : " + deque.peekFirst());
        System.out.println("peekLast()  : " + deque.peekLast());


        // =====================================================
        // Removal: Front vs Rear
        // =====================================================

        // removeFirst() / removeLast() → throw exception if empty
        // pollFirst() / pollLast() → return null if empty

        System.out.println("removeFirst() : " + deque.removeFirst());
        System.out.println("removeLast()  : " + deque.removeLast());

        System.out.println("pollFirst()   : " + deque.pollFirst());
        System.out.println("pollLast()    : " + deque.pollLast());

        System.out.println("After Removal : " + deque);


        // =====================================================
        // LinkedList as Stack - LIFO
        // =====================================================

        // push() → adds at the front
        // pop()  → removes from the front

        deque.push(100);
        deque.push(200);
        deque.push(300);

        System.out.println("\nStack : " + deque);

        System.out.println("pop() : " + deque.pop());


        // =====================================================
        // Occurrence Methods
        // =====================================================

        deque.clear();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(20);
        deque.add(40);

        System.out.println("\nBefore Occurrence Removal : " + deque);

        // Removes the first matching element
        deque.removeFirstOccurrence(20);

        System.out.println("After removeFirstOccurrence() : " + deque);


        // Removes the last matching element
        deque.removeLastOccurrence(20);

        System.out.println("After removeLastOccurrence()  : " + deque);


        // =====================================================
        // descendingIterator()
        // =====================================================

        // Traverses from rear → front.
        // It does NOT sort or change the deque.

        deque.clear();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);

        System.out.println("\nNormal Order      : " + deque);
        System.out.print("Descending Order  : ");

        Iterator<Integer> descending = deque.descendingIterator();

        while (descending.hasNext()) {
            System.out.print(descending.next() + " ");
        }


    }
}
