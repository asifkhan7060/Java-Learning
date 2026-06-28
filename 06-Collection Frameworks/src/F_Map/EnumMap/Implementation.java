package F_Map.EnumMap;

import java.util.*;

/*
 * ==========================================================
 *                     Enum Declaration
 * ==========================================================
 */

enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

}

public class Implementation {

    public static void main(String[] args) {

        /*
         * ==========================================================
         *              Methods Inherited from Map
         * ==========================================================
         */

        // Already implemented in Map topic

        // put(K key, V value)
        // putAll(Map<? extends K, ? extends V> m)
        //
        // get(Object key)
        // getOrDefault(Object key, V defaultValue)
        //
        // remove(Object key)
        // remove(Object key, Object value)
        //
        // replace(K key, V value)
        // replace(K key, V oldValue, V newValue)
        // replaceAll(BiFunction)
        //
        // containsKey(Object key)
        // containsValue(Object value)
        //
        // keySet()
        // values()
        // entrySet()
        //
        // size()
        // isEmpty()
        // clear()
        //
        // equals(Object o)
        // hashCode()
        //
        // forEach(BiConsumer)
        // compute()
        // computeIfAbsent()
        // computeIfPresent()
        // merge()


        /*
         * ==========================================================
         *              Basic EnumMap Implementation
         * ==========================================================
         */


        // ---------------------------------------------------------
        // Raw Type (Without Type Safety)
        // ---------------------------------------------------------

        EnumMap rawSchedule =
                new EnumMap(Day.class);

        rawSchedule.put(Day.MONDAY, "Java");

        rawSchedule.put(Day.TUESDAY, 101);

        rawSchedule.put(Day.WEDNESDAY, true);

        System.out.println("Raw EnumMap");

        System.out.println(rawSchedule);

        /*
         * Raw Types:
         * -----------
         *
         * Stores everything
         * as Object.
         *
         * Type Safety
         * is NOT available.
         *
         * Avoid Raw Types
         * in modern Java.
         */

        System.out.println();


        // ---------------------------------------------------------
        // Generics
        // ---------------------------------------------------------

        EnumMap<Day, String> subjects =
                new EnumMap<>(Day.class);

        subjects.put(Day.MONDAY, "Java");

        subjects.put(Day.TUESDAY, "Python");

        subjects.put(Day.WEDNESDAY, "Spring");

        System.out.println("EnumMap with Generics");

        System.out.println(subjects);

        /*
         * Enum Keys
         *
         * String Values
         *
         * Type Safety
         * available.
         */


        // ---------------------------------------------------------
        // Enum Key Demonstration
        // ---------------------------------------------------------

        EnumMap<Day, String> routine =
                new EnumMap<>(Day.class);

        routine.put(Day.MONDAY, "Coding");

        routine.put(Day.FRIDAY, "Revision");

        routine.put(Day.SUNDAY, "Rest");

        System.out.println("\nEnum Key Demonstration");

        System.out.println(routine);

        /*
         * Keys must belong
         * to the specified
         * Enum type.
         */


        // ---------------------------------------------------------
        // Duplicate Key Demonstration
        // ---------------------------------------------------------

        EnumMap<Day, String> duplicateDemo =
                new EnumMap<>(Day.class);

        duplicateDemo.put(Day.MONDAY, "Java");

        duplicateDemo.put(Day.MONDAY, "Spring");

        duplicateDemo.put(Day.TUESDAY, "Python");

        System.out.println("\nDuplicate Key Demonstration");

        System.out.println(duplicateDemo);

        /*
         * Output
         *
         * MONDAY=Spring
         *
         * TUESDAY=Python
         *
         * Existing value
         * gets replaced.
         */


        // ---------------------------------------------------------
        // Null Key Demonstration
        // ---------------------------------------------------------

        EnumMap<Day, String> nullKeyDemo =
                new EnumMap<>(Day.class);

        nullKeyDemo.put(Day.MONDAY, "Java");

        System.out.println("\nNull Key Demonstration");

        System.out.println(nullKeyDemo);

        /*
         * Uncommenting
         * the following
         * statement throws
         * NullPointerException.
         */

//      nullKeyDemo.put(null, "Python");

        /*
         * EnumMap
         *
         * Null Keys
         * are NOT allowed.
         */


        // ---------------------------------------------------------
        // Null Value Demonstration
        // ---------------------------------------------------------

        EnumMap<Day, String> nullValueDemo =
                new EnumMap<>(Day.class);

        nullValueDemo.put(Day.MONDAY, null);

        nullValueDemo.put(Day.TUESDAY, "Java");

        System.out.println("\nNull Value Demonstration");

        System.out.println(nullValueDemo);

        /*
         * Null Values
         * are allowed.
         */


        // ---------------------------------------------------------
        // For Each Loop
        // ---------------------------------------------------------

        System.out.println("\nUsing For Each");

        for (Map.Entry<Day, String> entry
                : subjects.entrySet()) {

            System.out.println(

                    entry.getKey()

                            + " -> "

                            + entry.getValue()

            );

        }


        // ---------------------------------------------------------
        // Iterator
        // ---------------------------------------------------------

        System.out.println("\nUsing Iterator");

        Iterator<Map.Entry<Day, String>> iterator =
                subjects.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Day, String> entry =
                    iterator.next();

            System.out.println(

                    entry.getKey()

                            + " -> "

                            + entry.getValue()

            );

        }


        // ---------------------------------------------------------
        // Working with Custom Class
        // ---------------------------------------------------------

        EnumMap<Day, Employee> employees =
                new EnumMap<>(Day.class);

        employees.put(

                Day.MONDAY,

                new Employee("Rudra", 90000)

        );

        employees.put(

                Day.TUESDAY,

                new Employee("Haya", 85000)

        );

        employees.put(

                Day.WEDNESDAY,

                new Employee("Arman", 87000)

        );

        System.out.println("\nCustom Class");

        for (Map.Entry<Day, Employee> entry
                : employees.entrySet()) {

            System.out.println(entry);

        }

        /*
         * Enum Keys
         * remain unique.
         *
         * Values may
         * contain duplicate
         * objects.
         *
         * Since equals()
         * and hashCode()
         * are NOT overridden,
         *
         * Employee objects
         * are treated as
         * different objects.
         */


        /*
         * ==========================================================
         *                    Constructors
         * ==========================================================
         */

        // ---------------------------------------------------------
        // EnumMap(Class)
        // ---------------------------------------------------------

        EnumMap<Day, String> map1 =
                new EnumMap<>(Day.class);

        map1.put(Day.MONDAY, "Java");
        map1.put(Day.TUESDAY, "Python");
        map1.put(Day.WEDNESDAY, "Spring");

        System.out.println("\nEnumMap(Class)");

        System.out.println(map1);

        /*
         * Creates an empty
         * EnumMap.
         *
         * Enum Type must be
         * specified during
         * object creation.
         *
         * Most commonly used
         * constructor.
         */


        // ---------------------------------------------------------
        // EnumMap(EnumMap)
        // ---------------------------------------------------------

        EnumMap<Day, String> original =
                new EnumMap<>(Day.class);

        original.put(Day.MONDAY, "HTML");
        original.put(Day.TUESDAY, "CSS");
        original.put(Day.WEDNESDAY, "JavaScript");

        EnumMap<Day, String> map2 =
                new EnumMap<>(original);

        System.out.println("\nEnumMap(EnumMap)");

        System.out.println("Original");

        System.out.println(original);

        System.out.println("\nCopied");

        System.out.println(map2);

        /*
         * Creates another
         * EnumMap from an
         * existing EnumMap.
         *
         * Enum type is
         * preserved.
         */


        // ---------------------------------------------------------
        // EnumMap(Map)
        // ---------------------------------------------------------

        HashMap<Day, String> hashMap =
                new HashMap<>();

        hashMap.put(Day.THURSDAY, "Docker");
        hashMap.put(Day.FRIDAY, "Kubernetes");
        hashMap.put(Day.SATURDAY, "AWS");

        EnumMap<Day, String> map3 =
                new EnumMap<>(hashMap);

        System.out.println("\nEnumMap(Map)");

        System.out.println("HashMap");

        System.out.println(hashMap);

        System.out.println("\nEnumMap");

        System.out.println(map3);

        /*
         * Copies all mappings
         * from another Map.
         *
         * The supplied Map
         * must NOT be empty.
         *
         * Otherwise,
         * EnumMap cannot
         * determine the
         * Enum type.
         */


        // =========================================================
        // Part 2 Starts from clone()
        // =========================================================


        /*
         * ==========================================================
         *                     clone()
         * ==========================================================
         */

        EnumMap<Day, String> schedule =
                new EnumMap<>(Day.class);

        schedule.put(Day.MONDAY, "Java");

        schedule.put(Day.TUESDAY, "Python");

        schedule.put(Day.WEDNESDAY, "Spring");

        System.out.println("\nclone()");

        @SuppressWarnings("unchecked")

        EnumMap<Day, String> cloned =

                (EnumMap<Day, String>) schedule.clone();

        System.out.println("Original EnumMap");

        System.out.println(schedule);

        System.out.println("\nCloned EnumMap");

        System.out.println(cloned);

        // Modify cloned map

        cloned.put(Day.THURSDAY, "Docker");

        System.out.println("\nAfter Modifying Clone");

        System.out.println("Original");

        System.out.println(schedule);

        System.out.println("\nClone");

        System.out.println(cloned);

        /*
         * clone()
         *
         * Creates a
         * SHALLOW COPY.
         *
         * Only EnumMap
         * object is copied.
         *
         * Stored objects
         * are shared.
         */


        /*
         * ==========================================================
         *             Shallow Copy Demonstration
         * ==========================================================
         */

        EnumMap<Day, Employee> originalEmployees =
                new EnumMap<>(Day.class);

        originalEmployees.put(

                Day.MONDAY,

                new Employee("Rudra", 90000)

        );

        originalEmployees.put(

                Day.TUESDAY,

                new Employee("Haya", 85000)

        );

        @SuppressWarnings("unchecked")

        EnumMap<Day, Employee> copiedEmployees =

                (EnumMap<Day, Employee>) originalEmployees.clone();

        System.out.println("\nShallow Copy");

        System.out.println("Original");

        System.out.println(originalEmployees);

        System.out.println("\nCopied");

        System.out.println(copiedEmployees);

        // Modify object inside copied map

        copiedEmployees
                .get(Day.MONDAY)
                .name = "Virat";

        System.out.println("\nAfter Modifying Object");

        System.out.println("Original");

        System.out.println(originalEmployees);

        System.out.println("\nCopied");

        System.out.println(copiedEmployees);

        /*
         * EnumMap is copied.
         *
         * Employee objects
         * are NOT copied.
         *
         * Both EnumMaps
         * refer to the same
         * Employee objects.
         */


        /*
         * ==========================================================
         *                 Enum Type Demonstration
         * ==========================================================
         */

        EnumMap<Day, String> enumDemo =
                new EnumMap<>(Day.class);

        enumDemo.put(Day.MONDAY, "Java");
        enumDemo.put(Day.FRIDAY, "Spring");

        System.out.println("\nEnum Type");

        System.out.println(enumDemo);

        /*
         * EnumMap accepts
         * keys belonging to
         * only one Enum type.
         *
         * Mixing Enum types
         * is NOT allowed.
         */


        /*
         * ==========================================================
         *                  Ordinal Values
         * ==========================================================
         */

        System.out.println("\nOrdinal Values");

        for (Day day : Day.values()) {

            System.out.println(
                    day
                            + " -> "
                            + day.ordinal());

        }

        /*
         * Every Enum Constant
         * has an ordinal value.
         *
         * MONDAY    -> 0
         * TUESDAY   -> 1
         * WEDNESDAY -> 2
         * ...
         *
         * EnumMap internally
         * uses ordinal values.
         */


        /*
         * ==========================================================
         *               Array Based Storage
         * ==========================================================
         */

        EnumMap<Day, Integer> attendance =
                new EnumMap<>(Day.class);

        attendance.put(Day.MONDAY, 45);

        attendance.put(Day.TUESDAY, 50);

        attendance.put(Day.WEDNESDAY, 48);

        System.out.println("\nArray Based Storage");

        System.out.println(attendance);

        /*
         * Internally,
         * EnumMap stores
         * values inside
         * an array.
         *
         * Array Index
         *
         * =
         *
         * Enum.ordinal()
         *
         * No Hashing
         * is performed.
         */


        /*
         * ==========================================================
         *                Natural Ordering
         * ==========================================================
         */

        EnumMap<Day, String> orderDemo =
                new EnumMap<>(Day.class);

        orderDemo.put(Day.FRIDAY, "Friday");

        orderDemo.put(Day.MONDAY, "Monday");

        orderDemo.put(Day.WEDNESDAY, "Wednesday");

        orderDemo.put(Day.TUESDAY, "Tuesday");

        System.out.println("\nNatural Ordering");

        System.out.println(orderDemo);

        /*
         * Output follows
         * Enum declaration.
         *
         * Insertion Order
         * is ignored.
         */


        /*
         * ==========================================================
         *                 Capacity vs Size
         * ==========================================================
         */

        EnumMap<Day, String> capacityDemo =
                new EnumMap<>(Day.class);

        capacityDemo.put(Day.MONDAY, "Java");

        capacityDemo.put(Day.TUESDAY, "Python");

        capacityDemo.put(Day.WEDNESDAY, "Spring");

        System.out.println("\nCapacity vs Size");

        System.out.println(capacityDemo);

        System.out.println("Size : "
                + capacityDemo.size());

        /*
         * Capacity
         *
         * Number of Enum
         * Constants.
         *
         * Cannot be accessed
         * directly.
         *
         * Size
         *
         * Number of stored
         * mappings.
         */


        /*
         * ==========================================================
         *           Reference Type Demonstration
         * ==========================================================
         */

        /*
         * Map Reference
         *
         * Can access only
         * Map methods.
         */

        Map<Day, String> mapReference =
                new EnumMap<>(Day.class);

        mapReference.put(
                Day.MONDAY,
                "Java");

        mapReference.put(
                Day.TUESDAY,
                "Python");

        System.out.println("\nMap Reference");

        System.out.println(mapReference);

        /*
         * EnumMap Reference
         *
         * Can access every
         * EnumMap specific
         * method.
         */

        EnumMap<Day, String> enumReference =
                new EnumMap<>(Day.class);

        enumReference.put(
                Day.FRIDAY,
                "Docker");

        enumReference.clone();

        System.out.println("\nEnumMap Reference");

        System.out.println(enumReference);

        /*
         * Interface Reference
         *
         * Recommended because
         * implementation can
         * change easily.
         *
         * Class Reference
         *
         * Required when
         * EnumMap specific
         * methods are needed.
         */


        // ------------- Part 3 Starts from Optimized Overrides -------------


        /*
         * ==========================================================
         *                 Optimized Overrides
         * ==========================================================
         */


        // ---------------------------------------------------------
        // forEach()
        // ---------------------------------------------------------

        System.out.println("\nforEach()");

        enumReference.forEach(

                (day, subject) ->

                        System.out.println(

                                day
                                        + " -> "
                                        + subject)

        );

        /*
         * Introduced
         * in Java 8.
         *
         * Uses BiConsumer.
         */


        // ---------------------------------------------------------
        // replaceAll()
        // ---------------------------------------------------------

        EnumMap<Day, String> replaceDemo =
                new EnumMap<>(Day.class);

        replaceDemo.put(Day.MONDAY, "java");

        replaceDemo.put(Day.TUESDAY, "python");

        replaceDemo.replaceAll(

                (day, value) ->

                        value.toUpperCase()

        );

        System.out.println("\nreplaceAll()");

        System.out.println(replaceDemo);

        /*
         * Updates every
         * value using
         * BiFunction.
         */


        // ---------------------------------------------------------
        // compute()
        // ---------------------------------------------------------

        replaceDemo.compute(

                Day.MONDAY,

                (day, value) ->

                        value + " 21"

        );

        System.out.println("\ncompute()");

        System.out.println(replaceDemo);

        /*
         * Computes a new
         * value for an
         * existing key.
         */


        // ---------------------------------------------------------
        // computeIfAbsent()
        // ---------------------------------------------------------

        replaceDemo.computeIfAbsent(

                Day.WEDNESDAY,

                day -> "Spring"

        );

        System.out.println("\ncomputeIfAbsent()");

        System.out.println(replaceDemo);

        /*
         * Executes only if
         * key is absent.
         */


        // ---------------------------------------------------------
        // computeIfPresent()
        // ---------------------------------------------------------

        replaceDemo.computeIfPresent(

                Day.TUESDAY,

                (day, value) ->

                        value + " Framework"

        );

        System.out.println("\ncomputeIfPresent()");

        System.out.println(replaceDemo);

        /*
         * Executes only if
         * key exists.
         */


        // ---------------------------------------------------------
        // merge()
        // ---------------------------------------------------------

        EnumMap<Day, Integer> mergeDemo =
                new EnumMap<>(Day.class);

        mergeDemo.put(Day.MONDAY, 10);

        mergeDemo.merge(

                Day.MONDAY,

                5,

                Integer::sum

        );

        mergeDemo.merge(

                Day.FRIDAY,

                20,

                Integer::sum

        );

        System.out.println("\nmerge()");

        System.out.println(mergeDemo);

        /*
         * Combines old and
         * new values.
         *
         * Inserts value
         * if key doesn't
         * exist.
         */


        /*
         * ==========================================================
         *              EnumMap Characteristics
         * ==========================================================
         */

        EnumMap<Day, String> characteristics =
                new EnumMap<>(Day.class);

        characteristics.put(Day.FRIDAY, "Friday");
        characteristics.put(Day.MONDAY, "Monday");
        characteristics.put(Day.WEDNESDAY, "Wednesday");

        System.out.println("\nEnumMap Characteristics");

        System.out.println(characteristics);

        /*
         * Characteristics
         *
         * ✔ Stores only Enum Keys
         *
         * ✔ Duplicate Keys NOT Allowed
         *
         * ✔ Duplicate Values Allowed
         *
         * ✔ Null Keys NOT Allowed
         *
         * ✔ Null Values Allowed
         *
         * ✔ Natural Ordering
         *
         * ✔ Array Based Implementation
         *
         * ✔ Faster than HashMap
         *   for Enum Keys
         *
         * ✔ Memory Efficient
         */


        /*
         * ==========================================================
         *             Methods Not Covered Yet
         * ==========================================================
         */

        /*
         * Advanced Topics
         *
         * Serialization
         *
         * Internal JVM
         * Implementation
         *
         * Reflection based
         * Enum Operations
         *
         * Performance
         * Benchmarking
         *
         * Source Code
         * Analysis
         */


        /*
         * ==========================================================
         *           Methods Inherited from Object
         * ==========================================================
         */

        System.out.println("\nObject Methods");

        System.out.println(characteristics.toString());

        System.out.println(characteristics.getClass());

        System.out.println(characteristics.hashCode());

        System.out.println(

                characteristics.equals(enumReference)

        );

        /*
         * Object Methods
         *
         * toString()
         *
         * getClass()
         *
         * hashCode()
         *
         * equals()
         *
         * wait()
         *
         * notify()
         *
         * notifyAll()
         *
         * finalize() (Deprecated)
         */


        /*
         * ==========================================================
         *                 Interview Notes
         * ==========================================================
         */

        /*
         * 1.
         * EnumMap accepts
         * only Enum Keys.
         *
         * 2.
         * Internally uses
         * an Array.
         *
         * 3.
         * Does NOT use
         * Hashing.
         *
         * 4.
         * Uses
         * Enum.ordinal()
         * internally.
         *
         * 5.
         * Natural Ordering
         * follows Enum
         * declaration.
         *
         * 6.
         * Faster than
         * HashMap for
         * Enum Keys.
         *
         * 7.
         * Null Keys
         * are NOT allowed.
         *
         * 8.
         * Null Values
         * are allowed.
         *
         * 9.
         * clone()
         * performs a
         * Shallow Copy.
         *
         * 10.
         * Best choice when
         * all keys belong
         * to one Enum.
         */


        /*
         * ==========================================================
         *                       Summary
         * ==========================================================
         */

        /*
         * EnumMap is a
         * specialized Map
         * implementation
         * designed only
         * for Enum Keys.
         *
         * It is faster,
         * memory efficient,
         * naturally ordered,
         * and should always
         * be preferred over
         * HashMap whenever
         * Enum Keys are used.
         */


        /*
         * ==========================================================
         *                       End
         * ==========================================================
         */

        System.out.println(
                "\nEnumMap Implementation Completed.");

    }

}


/*
 * ==========================================================
 *                 Custom Class
 * ==========================================================
 */

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {

        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';

    }

}


/*
 * ==========================================================
 * IMPORTANT
 * ==========================================================
 *
 * Since equals() and hashCode()
 * are NOT overridden,
 *
 * Employee objects are treated
 * as different objects.
 *
 * Override both methods when
 * logical equality is required.
 *
 * This topic will be covered
 * in HashMap / Object Class.
 *
 * ==========================================================
 */