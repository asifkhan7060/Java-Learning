package C_List;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        // =====================================================
        // Collection Methods Available in List
        // =====================================================

        /*
            Since List extends Collection,
            all Collection methods are available.

            Already implemented in
            "Collection and Iterator" topic.

            add()
            addAll()

            remove()
            removeAll()
            removeIf()

            retainAll()

            contains()
            containsAll()

            size()
            isEmpty()

            clear()

            toArray()
            toArray(T[])
            toArray(IntFunction<T[]>)

            iterator()
            spliterator()

            stream()
            parallelStream()

            equals()
            hashCode()
         */

        // =====================================================
        // List Methods Demonstration
        // =====================================================

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List : " + list);

        // get()
        // Returns element present at specified index.

        System.out.println("\nget()");

        System.out.println("Element at Index 0 : " + list.get(0));
        System.out.println("Element at Index 2 : " + list.get(2));

        // set()
        // Replaces an existing element at specified index.

        System.out.println("\nset()");

        System.out.println("Before set() : " + list);

        list.set(2, 300);

        System.out.println("After set() : " + list);

        // add(index, element)
        // Inserts an element at a specified index -> Existing elements shift one position to the right.

        System.out.println("\nadd(index, element)");

        System.out.println("Before add(index) : " + list);

        list.add(2, 999);

        System.out.println("After add(index) : " + list);


        // addAll(collection)
        // Inserts all elements of another collection to end of collection

        ArrayList<Integer> anotherList1 = new ArrayList<>();

        anotherList1.add(123);
        anotherList1.add(456);
        anotherList1.add(789);

        System.out.println("\naddAll(collection)");

        System.out.println("Before addAll(index) : " + list);

        list.addAll(anotherList1);

        System.out.println("anotherList1 elements : " + anotherList1);

        System.out.println("After addAll(index) : " + list);

        // addAll(index, collection)
        // Inserts all elements of another collection...starting from the specified index.

        ArrayList<Integer> anotherList = new ArrayList<>();

        anotherList.add(111);
        anotherList.add(222);
        anotherList.add(333);

        System.out.println("\naddAll(index, collection)");

        System.out.println("Before addAll(index) : " + list);

        list.addAll(3, anotherList);

        System.out.println("anotherList elements : " + anotherList);

        System.out.println("After addAll(index) : " + list);

        // remove(index)
        // Removes element present at specified index.

        System.out.println("\nremove(index)");

        System.out.println("Before remove(index) : " + list);

        list.remove(4);

        System.out.println("After remove(index) : " + list); // 222 element removed

        // indexOf()
        // Returns first occurrence index.
        // Returns -1 if element not found.

        list.add(999);

        System.out.println("\nindexOf()");

        System.out.println("List : " + list);

        System.out.println("First Occurrence of 999 : "
                + list.indexOf(999));

        System.out.println("Index of 500 : "
                + list.indexOf(500));

        // lastIndexOf()
        // Returns last occurrence index.
        // Returns -1 if element not found.

        System.out.println("\nlastIndexOf()");

        System.out.println("Last Occurrence of 999 : "
                + list.lastIndexOf(999));

        System.out.println("Last Index of 500 : "
                + list.lastIndexOf(500));

        // listIterator()
        // Returns ListIterator starting from first element.

        System.out.println("\nlistIterator()");

        ListIterator<Integer> listIt = list.listIterator();

        System.out.println("Forward Traversal");

        while (listIt.hasNext()) {

            System.out.println(listIt.next());

        }

        System.out.println("\nBackward Traversal");

        while (listIt.hasPrevious()) {

            System.out.println(listIt.previous());

        }

        // listIterator(index)
        // Returns ListIterator starting from specified index.

        System.out.println("\nlistIterator(index)");

        ListIterator<Integer> listItIndex = list.listIterator(3); // printing starts from the 3rd index

        while (listItIndex.hasNext()) {

            System.out.println(listItIndex.next());

        }

        // subList()
        // Returns a view of specified portion of list.
        // fromIndex -> Inclusive
        // toIndex   -> Exclusive

        System.out.println("\nsubList()");

        List<Integer> sub = list.subList(2, 6);

        System.out.println("Original List : " + list);

        System.out.println("Sub List : " + sub);

        // replaceAll()
        // Replaces every element using a lambda expression.

        System.out.println("\nreplaceAll()");

        System.out.println("Before replaceAll() : " + list);

        list.replaceAll(num -> num * 2);

        System.out.println("After replaceAll() : " + list);

        // sort()
        // Sorts the list in ascending order.

        System.out.println("\nsort()");

        ArrayList<Integer> sortList = new ArrayList<>();

        sortList.add(40);
        sortList.add(10);
        sortList.add(70);
        sortList.add(20);
        sortList.add(90);
        sortList.add(30);

        System.out.println("Before sort() : " + sortList);

        sortList.sort(Integer::compareTo);

        System.out.println("Ascending Order : " + sortList);

        sortList.sort((a, b) -> b - a);

        System.out.println("Descending Order : " + sortList);


        // =====================================================
        // Ways to Traverse a List
        // =====================================================

        List<Integer> traverseList = new ArrayList<>();

        traverseList.add(10);
        traverseList.add(20);
        traverseList.add(30);
        traverseList.add(40);
        traverseList.add(50);

        System.out.println("\nTraversal List : " + traverseList);

        // =====================================================
        // Enhanced For Loop
        // =====================================================

        System.out.println("\nUsing Enhanced For Loop");

        for (Integer value : traverseList) {

            System.out.println(value);

        }

        // =====================================================
        // Using Iterator
        // =====================================================

        System.out.println("\nUsing Iterator");

        Iterator<Integer> iterator = traverseList.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        // =====================================================
        // Using ListIterator
        // =====================================================

        System.out.println("\nUsing ListIterator (Forward)");

        ListIterator<Integer> listIterator = traverseList.listIterator();

        while (listIterator.hasNext()) {

            System.out.println(listIterator.next());

        }

        System.out.println("\nUsing ListIterator (Backward)");

        while (listIterator.hasPrevious()) {

            System.out.println(listIterator.previous());

        }

        // =====================================================
        // Using Spliterator
        // =====================================================

        System.out.println("\nUsing Spliterator");

        Spliterator<Integer> spliterator = traverseList.spliterator();

        spliterator.forEachRemaining(System.out::println);

        // =====================================================
        // Using Stream
        // =====================================================

        System.out.println("\nUsing Stream");

        traverseList.stream().forEach(System.out::println);

        // =====================================================
        // Additional List Methods
        // =====================================================

        // Java 9 (Static Factory Methods)

        // List.of()      -> Creates an immutable List.
        // List.copyOf()  -> Creates an immutable copy of another Collection.

        // Java 21+ (Inherited from SequencedCollection)

        // addFirst(E e)
        // addLast(E e)

        // getFirst()
        // getLast()

        // removeFirst()
        // removeLast()

        // reversed()

        // These methods are inherited from SequencedCollection.
        // Available only in Java 21+.


        // =====================================================
        // List.of()
        // =====================================================

        // Creates an immutable (read-only) List.

                System.out.println("\nList.of()");

                List<String> immutableList = List.of(
                        "Java",
                        "Python",
                        "C++",
                        "JavaScript"
                );

                System.out.println("Immutable List : " + immutableList);

        // immutableList.add("PHP");      // UnsupportedOperationException
        // immutableList.remove(0);       // UnsupportedOperationException
        // immutableList.set(0,"Kotlin"); // UnsupportedOperationException


        // =====================================================
        // List.copyOf()
        // =====================================================

        // Creates an immutable copy of another Collection.

        System.out.println("\nList.copyOf()");

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        List<String> copy = List.copyOf(languages);

        System.out.println("Original List : " + languages);
        System.out.println("Immutable Copy : " + copy);

        // copy.add("Go");    // UnsupportedOperationException

        // =====================================================
        // addFirst()
        // =====================================================

        // Available from Java 21
        // Inserts element at beginning.

        System.out.println("\naddFirst()");

        List<Integer> seqList = new ArrayList<>();

        seqList.add(20);
        seqList.add(30);
        seqList.add(40);

        System.out.println("Before : " + seqList);

        seqList.addFirst(10);

        System.out.println("After : " + seqList);

        // =====================================================
        // addLast()
        // =====================================================

        // Inserts element at end.

        System.out.println("\naddLast()");

        System.out.println("Before : " + seqList);

        seqList.addLast(50);

        System.out.println("After : " + seqList);

        // =====================================================
        // getFirst()
        // =====================================================

        System.out.println("\ngetFirst()");

        System.out.println("First Element : "
                + seqList.getFirst());

        // =====================================================
        // getLast()
        // =====================================================

        System.out.println("\ngetLast()");

        System.out.println("Last Element : "
                + seqList.getLast());

        // =====================================================
        // removeFirst()
        // =====================================================

        System.out.println("\nremoveFirst()");

        System.out.println("Before : " + seqList);

        seqList.removeFirst();

        System.out.println("After : " + seqList);

        // =====================================================
        // removeLast()
        // =====================================================

        System.out.println("\nremoveLast()");

        System.out.println("Before : " + seqList);

        seqList.removeLast();

        System.out.println("After : " + seqList);

        // =====================================================
        // reversed()
        // =====================================================

        // Returns a reverse-order view of the List.

        System.out.println("\nreversed()");

        System.out.println("Original : " + seqList);

        System.out.println("Reverse View : "
                + seqList.reversed());

    }
}