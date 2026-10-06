package C_Set.LinkedHashSet;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        /*
         * ==========================================================
         *           Methods Inherited from Collection
         * ==========================================================
         */

            // Already implemented in Collection topic


        /*
         * ==========================================================
         *             Methods Inherited from Set
         * ==========================================================
         */

            // No Methods


        /*
         * ==========================================================
         *          Methods Inherited from HashSet
         * ==========================================================
         */

        // LinkedHashSet extends HashSet.
        //
        // It introduces NO NEW PUBLIC METHODS.
        //
        // Refer HashSet Implementation.java.


        /*
         * ==========================================================
         *        Insertion Order Demonstration
         * ==========================================================
         */

        LinkedHashSet<Integer> insertionDemo = new LinkedHashSet<>();

        insertionDemo.add(50);
        insertionDemo.add(10);
        insertionDemo.add(80);
        insertionDemo.add(10); // ignored
        insertionDemo.add(70);
        insertionDemo.add(null);   // One null allowed
        insertionDemo.add(null);   // Ignored

        System.out.println("\nInsertion Order");

        System.out.println(insertionDemo);

        /*
         * Elements are returned in the same order they were inserted.
         * Internally uses : Hash Table + Doubly Linked List
         */

        /*
         * ==========================================================
         *        Java 21+ SequencedSet Methods
         * ==========================================================
         */

        // LinkedHashSet implements SequencedSet, so it supports:

        insertionDemo.addFirst(5);          // Insert/move element to beginning
        insertionDemo.addLast(90);          // Insert element at end

        System.out.println(insertionDemo.getFirst()); // First element
        System.out.println(insertionDemo.getLast());  // Last element

        insertionDemo.removeFirst();        // Remove first element
        insertionDemo.removeLast();         // Remove last element

        System.out.println(insertionDemo.reversed()); // Reverse-order view

        /*
        ==========================================================
                    Methods Not Covered Yet - Java 19+
        ==========================================================

        LinkedHashSet.newLinkedHashSet(int expectedSize)

        Ex:
        LinkedHashSet<Integer> set = LinkedHashSet.newLinkedHashSet(100);

        LinkedHashSet       → class name
        .                   → access a static method
        newLinkedHashSet    → method name
        (100)               → expected number of elements
        */

        System.out.println(
                "\nLinkedHashSet Implementation Completed.");

    }

}


