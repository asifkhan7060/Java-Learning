package D_Set;

public class Implementation {


    // =====================================================
    // Collection Methods Available in Set
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
    // Set Methods
    // =====================================================

    /*
    Unlike List, the Set interface does NOT introduce
    any new methods.

    Set only changes the behavior of Collection by
    ensuring that duplicate elements are not allowed.

    All methods available in Set are inherited from
    the Collection interface.

    Additional methods are introduced by:

    SortedSet

        first()
        last()
        headSet()
        tailSet()
        subSet()
        comparator()

    NavigableSet

        lower()
        floor()
        ceiling()
        higher()
        pollFirst()
        pollLast()
        descendingSet()
        descendingIterator()
        subSet(..., boolean)
        headSet(..., boolean)
        tailSet(..., boolean)

    SequencedSet (Java 21+)

        addFirst()
        addLast()
        getFirst()
        getLast()
        removeFirst()
        removeLast()
        reversed()
 */
}
