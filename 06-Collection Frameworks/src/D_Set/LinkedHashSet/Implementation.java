package D_Set.LinkedHashSet;

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
        //
        // Already Covered:
        //
        // ✓ Raw Type
        // ✓ Generics
        // ✓ Duplicate Demonstration
        // ✓ Null Demonstration
        // ✓ For Each Loop
        // ✓ Iterator
        // ✓ Working with Custom Class
        //
        // ✓ Constructors
        //   • LinkedHashSet()
        //   • LinkedHashSet(int initialCapacity)
        //   • LinkedHashSet(int initialCapacity,float loadFactor)
        //   • LinkedHashSet(Collection)
        //
        // ✓ clone()
        // ✓ Shallow Copy Demonstration
        //
        // ✓ Rehashing
        //
        // ✓ Reference Type Demonstration
        //
        // ✓ forEach()
        // ✓ Method Reference
        // ✓ iterator()
        // ✓ spliterator()
        //
        // Difference:
        // LinkedHashSet preserves insertion order.


        /*
         * ==========================================================
         *        Insertion Order Demonstration
         * ==========================================================
         */

        LinkedHashSet<Integer> insertionDemo =
                new LinkedHashSet<>();

        insertionDemo.add(50);
        insertionDemo.add(10);
        insertionDemo.add(80);
        insertionDemo.add(10);
        insertionDemo.add(70);

        System.out.println("\nInsertion Order");

        System.out.println(insertionDemo);

        /*
         * Elements are returned in the same order they were inserted.
         */

        /*
         * ==========================================================
         *      Hash Table + Doubly Linked List Concept
         * ==========================================================
         */

        LinkedHashSet<String> structureDemo =
                new LinkedHashSet<>();

        structureDemo.add("Java");
        structureDemo.add("Python");
        structureDemo.add("C++");
        structureDemo.add("SQL");

        System.out.println("\nInternal Structure");

        System.out.println(structureDemo);

        /*
         * Internally uses
         *
         * Hash Table
         *        +
         * Doubly Linked List
         *
         * Hash Table
         * ----------
         * Fast Searching
         * Fast Insertion
         * Fast Deletion
         *
         * Doubly Linked List
         * ------------------
         * Preserves Insertion Order
         */


        /*
         * ==========================================================
         *          HashSet vs LinkedHashSet
         * ==========================================================
         */

        HashSet<Integer> hashSet =
                new HashSet<>();

        LinkedHashSet<Integer> linkedHashSet =
                new LinkedHashSet<>();

        int[] values =
                {30,10,40,20,50};

        for(int value : values){

            hashSet.add(value);
            linkedHashSet.add(value);

        }

        System.out.println("\nHashSet");
        System.out.println(hashSet);

        System.out.println("\nLinkedHashSet");
        System.out.println(linkedHashSet);

        /*
         * HashSet
         *
         * Order NOT guaranteed.
         *
         * LinkedHashSet
         *
         * Preserves insertion order.
         */


        /*
         * ==========================================================
         *        LinkedHashSet Characteristics
         * ==========================================================
         */

        LinkedHashSet<Integer> characteristics =
                new LinkedHashSet<>();

        characteristics.add(30);
        characteristics.add(10);
        characteristics.add(40);
        characteristics.add(20);
        characteristics.add(20);     // Duplicate
        characteristics.add(null);   // One null allowed
        characteristics.add(null);   // Ignored

        System.out.println("\nLinkedHashSet Characteristics");

        System.out.println(characteristics);

        /*
         * Characteristics
         *
         * ✓ Duplicate NOT Allowed
         * ✓ One Null Allowed
         * ✓ Maintains Insertion Order
         * ✓ No Index
         * ✓ Fast Searching
         * ✓ Average O(1)
         * ✓ Uses Hash Table
         *   +
         *   Doubly Linked List
         */


        /*
         * ==========================================================
         *             Methods Not Covered Yet
         * ==========================================================
         */

        /*
         * Java 21
         *
         * LinkedHashSet.newLinkedHashSet(int expectedSize)
         */


        /*
         * ==========================================================
         *          Methods Inherited from Object
         * ==========================================================
         */

        // Refer ArrayList / HashSet Implementation.java.


        /*
         * ==========================================================
         *               Interview Notes
         * ==========================================================
         */

        /*
         * 1. LinkedHashSet extends HashSet.
         *
         * 2. Internally uses LinkedHashMap.
         *
         * 3. LinkedHashMap stores:
         *
         *      Hash Table
         *          +
         *   Doubly Linked List
         *
         * 4. Duplicate detection uses
         *    hashCode() followed by equals().
         *
         * 5. Preserves insertion order.
         *
         * 6. Average Complexity
         *
         *    add()      O(1)
         *    remove()   O(1)
         *    contains() O(1)
         *
         * 7. Memory usage is slightly
         *    higher than HashSet because
         *    of linked list pointers.
         *
         * 8. Introduces NO new public methods.
         */


        /*
         * ==========================================================
         *                      End
         * ==========================================================
         */

        System.out.println(
                "\nLinkedHashSet Implementation Completed.");

    }

}


