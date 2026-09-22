# Topic Test — OOPs Foundation (Self-Contained Version)

> **Instructions:** Choose the best answer for each question.  
> All necessary context is included in the questions.  
> Attempt all questions first, then check the **Answer Key** at the end.

---

## Section A — Programming Paradigms & OOP Introduction

**1.** Which programming paradigm focuses primarily on **how to perform a task step by step**?

A. Functional Programming  
B. Procedural Programming  
C. Object-Oriented Programming  
D. Logical Programming

**2.** Which programming paradigm focuses primarily on **what result should be produced** through data transformations?

A. Procedural Programming  
B. Functional Programming  
C. Object-Oriented Programming  
D. Imperative Programming

**3.** Which programming paradigm organizes software around **objects that contain both data and behavior**?

A. Procedural Programming  
B. Functional Programming  
C. Object-Oriented Programming  
D. Structural Programming

**4.** Which statement about programming paradigms is correct?

A. Procedural, Functional, and OOP are strict replacements for one another.  
B. Modern languages can support multiple programming styles.  
C. Functional Programming cannot be used in Java.  
D. OOP is only used in C.

**5.** In OOP, an object typically combines:

A. Only data  
B. Data and behavior  
C. Only methods  
D. Only constructors

**6.** In a class representing a `User`, variables like `name` and `age` would typically represent:

A. Behavior  
B. Methods  
C. State / properties  
D. Constructors

**7.** In a class representing a `User`, methods like `orderFood()` and `setReminder()` would typically represent:

A. State  
B. Behavior  
C. Properties  
D. Data types

**8.** The four commonly taught pillars of OOP are:

A. Class, Object, Method, Constructor  
B. Encapsulation, Abstraction, Inheritance, Polymorphism  
C. Procedural, Functional, Object, Class  
D. State, Behavior, Data, Method

**9.** Which of the following is **not** a core building block of OOP?

A. Class  
B. Object  
C. Constructor  
D. Compiler

**10.** Which statement is most accurate about OOP in Java?

A. Everything in Java is literally an object.  
B. OOP organizes software around objects that contain state and behavior.  
C. Java has no primitive data types.  
D. OOP means writing only functions.

---

## Section B — Class, Object, State, Behavior

**11.** A class is best described as:

A. An actual instance  
B. A blueprint or template used to create objects  
C. A method  
D. A constructor

**12.** An object is best described as:

A. A blueprint  
B. A template  
C. An actual instance of a class  
D. A package

**13.** In the statement `User user1 = new User();`, what does `User` represent?

A. An object  
B. A class  
C. A method  
D. A variable

**14.** In the statement `Car car1 = new Car();`, what does `car1` represent?

A. A class  
B. A constructor  
C. A reference variable  
D. A package

**15.** In `new Car()`, what is the role of the `new` keyword?

A. It declares a reference variable.  
B. It allocates memory for a new object.  
C. It defines a constructor.  
D. It imports a package.

**16.** In `new Car()`, what does `Car()` represent?

A. A reference variable  
B. Constructor invocation  
C. A package  
D. A primitive type

**17.** Instance variables in a class primarily represent:

A. Behavior  
B. State / properties  
C. Constructors  
D. Packages

**18.** Methods in a class primarily represent:

A. State  
B. Data  
C. Behavior / actions  
D. Packages

**19.** A class can typically define:

A. Properties / State  
B. Methods / Behavior  
C. Constructors  
D. All of the above

**20.** Which analogy correctly maps a class and an object?

A. Class → actual house, Object → blueprint  
B. Class → blueprint, Object → actual house  
C. Class → method, Object → constructor  
D. Class → package, Object → class

---

## Section C — Program Structure & `main()`

**21.** In Java, top-level classes:

A. Can be static  
B. Cannot be static  
C. Must always be static  
D. Must always be private

**22.** If a class is declared `public`, the file name must be:

A. Any name  
B. Exactly the same as the public class name  
C. Always `Main.java`  
D. Always `Class.java`

**23.** Which approach is generally recommended for real projects with reusable classes?

A. Separate top-level classes in separate files  
B. Multiple top-level classes in a single file  
C. Nested static classes only  
D. Putting `main()` in every class

**24.** Multiple top-level classes in a single Java file should be used:

A. Always for large projects  
B. Selectively for small demos and practice  
C. Never in Java  
D. Only for records

**25.** If a file contains `public class Main` and a non-public `class Car`, compiling `Main.java` produces:

A. Only `Main.class`  
B. Only `Car.class`  
C. `Main.class` and `Car.class`  
D. No `.class` files

**26.** If both `Main` and `Car` have a `main()` method, running `java Car` executes:

A. `Main.main()`  
B. `Car.main()`  
C. Both `main()` methods  
D. Neither

**27.** A nested static class is generally:

A. Always recommended  
B. Used only when the nested-class relationship is meaningful  
C. Required for all Java programs  
D. Illegal in Java

**28.** Putting `main()` in the same class as the object class is recommended for:

A. Very large enterprise systems only  
B. Small programs  
C. Only abstract classes  
D. Only records

**29.** Placing the class and the `main()` class in different packages is:

A. Not recommended  
B. Recommended as the project grows  
C. Only for primitive types  
D. Illegal

**30.** How many classes in a Java project can contain a `main()` method?

A. Only one  
B. Exactly two  
C. Multiple classes can have `main()`  
D. None

**31.** The class you launch using `java ClassName` determines:

A. Which constructor is called  
B. Which `main()` is executed  
C. Which package is imported  
D. Which primitive type is used

**32.** The `public` class and the `main()` method are:

A. Always in the same class  
B. Independent of each other  
C. The same thing  
D. Cannot exist together

**33.** Which of the following is incorrect for instance members?

A. `Car car = new Car(); car.drive();`  
B. `car.brand = "BMW";`  
C. `Car.brand = "BMW"; Car.drive();`  

**34.** A common design mistake is:

A. Creating classes with clear responsibilities  
B. Creating too many classes for a tiny program without clear responsibility  
C. Using `main()` in a launch class  
D. Separating model and app packages

---

## Section D — Constructors

**35.** A constructor is used to:

A. Destroy an object  
B. Initialize an object when it is created  
C. Define a package  
D. Create primitive types

**36.** A constructor name must be:

A. Different from the class name  
B. The same as the class name  
C. Always `main`  
D. Always `Constructor`

**37.** A constructor has:

A. Return type `void`  
B. Return type `int`  
C. No return type, not even `void`  
D. Return type `Object`

**38.** A constructor is automatically called when:

A. A class is compiled  
B. An object is created  
C. A method is called  
D. A package is imported

**39.** If instance variables are not explicitly initialized, Java default values are:

A. `String → ""`, `int → 1`  
B. `String → null`, `int → 0`  
C. `String → null`, `int → null`  
D. `String → 0`, `int → null`

**40.** In `this.name = name;`, the left side `this.name` refers to:

A. Constructor parameter  
B. Instance variable of the current object  
C. Class name  
D. Package name

**41.** Constructor overloading means:

A. One constructor with many statements  
B. Multiple constructors with different parameters  
C. Multiple classes with one constructor  
D. A constructor with no name

**42.** In constructor overloading, Java mainly checks:

A. Parameter names  
B. Parameter types, count, and order  
C. Only return type  
D. Only class name

**43.** Are `Car(String brand)` and `Car(String colour)` allowed together in one class?

A. Yes, because parameter names are different  
B. No, both are considered `Car(String)`  
C. Yes, because constructors can repeat  
D. Only if one is `public`

**44.** If only a parameterized constructor is defined, `new Car()` will:

A. Work normally  
B. Call the default constructor  
C. Cause a compile error  
D. Create a record

**45.** `public Car(String brand)` and `public Car(int speed, String colour)` are:

A. Invalid  
B. Valid overloaded constructors  
C. The same constructor  
D. Not constructors

**46.** A default constructor exists implicitly:

A. Always, even if another constructor is written  
B. Only if no constructor is written  
C. Only in records  
D. Only in interfaces

**47.** `new User("John", 25)` does:

A. Only creates memory  
B. Invokes the matching constructor and initializes the object  
C. Calls `main()`  
D. Creates a package

---

## Section E — Records

**48.** A Record in Java is mainly used to:

A. Store data with less code  
B. Replace all classes  
C. Create packages  
D. Make objects mutable

**49.** A Record automatically creates:

A. Only a constructor  
B. Constructor, getter-like methods, `toString()`, `equals()`, `hashCode()`  
C. Only `main()`  
D. Only instance variables

**50.** Which is valid Record syntax?

A. `class Bike(String brand, String color, int price) {}`  
B. `record Bike(String brand, String color, int price) {}`  
C. `interface Bike(String brand, String color, int price) {}`  
D. `enum Bike(String brand, String color, int price) {}`

**51.** For a record `Bike`, how do you access the `brand` component?

A. `bike.getBrand()`  
B. `bike.brand()`  
C. `bike.brand`  
D. `Bike.brand()`

**52.** Records use traditional getters like `getBrand()`:

A. True  
B. False  
C. Only for `String`  
D. Only for `int`

**53.** Record objects are:

A. Mutable  
B. Immutable  
C. Always null  
D. Always static

**54.** After creating `Bike bike = new Bike("Yamaha","Black",2400000);`, which is allowed?

A. `bike.brand = "Honda";`  
B. `bike.brand("Honda");`  
C. `bike.brand();`  
D. `bike.setBrand("Honda");`

**55.** Records are useful when:

A. You only need to store data  
B. Values should not change  
C. You want less code  
D. All of the above

**56.** Which is **not** true about records?

A. They reduce boilerplate code  
B. They automatically provide `equals()` and `hashCode()`  
C. They allow changing component values after creation  
D. They provide getter-like accessor methods

---

## Section F — Advantages, Limitations & Summary

**57.** Which of the following is an advantage of OOP?

A. Reusability  
B. Maintainability  
C. Scalability  
D. All of the above

**58.** Which of the following is a possible limitation of OOP?

A. More classes and structure can add complexity  
B. Small programs may not need a large object model  
C. Poorly designed inheritance can create complicated dependencies  
D. All of the above

**59.** The goal of OOP design is to create:

A. As many classes as possible  
B. A clear and maintainable design  
C. Only nested classes  
D. Only records

**60.** Which of these are Java primitive types, not objects?

A. `int`, `double`, `char`, `boolean`  
B. `String`, `User`, `Car`, `Bike`  
C. `Class`, `Object`, `Record`  
D. `main`, `new`, `this`

**61.** The statement “Everything in OOP is represented as an object” should be understood as:

A. Literally true for Java primitives  
B. A useful mental model but not literally true for Java  
C. A compile error  
D. Only true for records

**62.** OOP is particularly useful when software contains many entities that have:

A. Their own data  
B. Their own behavior  
C. Relationships with other entities  
D. All of the above

**63.** Correct final summary mapping is:

A. Class → Instance, Object → Blueprint  
B. Class → Blueprint, Object → Instance, State → Data, Behavior → Methods  
C. Class → Method, Object → Constructor  
D. State → Behavior, Constructor → Class

---

# Answer Key

| Q | Ans | Q | Ans | Q | Ans | Q | Ans |
|---|---|---|---|---|---|---|---|
| 1 | B | 18 | C | 35 | B | 52 | B |
| 2 | B | 19 | D | 36 | B | 53 | B |
| 3 | C | 20 | B | 37 | C | 54 | C |
| 4 | B | 21 | B | 38 | B | 55 | D |
| 5 | B | 22 | B | 39 | B | 56 | C |
| 6 | C | 23 | A | 40 | B | 57 | D |
| 7 | B | 24 | B | 41 | B | 58 | D |
| 8 | B | 25 | C | 42 | B | 59 | B |
| 9 | D | 26 | B | 43 | B | 60 | A |
| 10 | B | 27 | B | 44 | C | 61 | B |
| 11 | B | 28 | B | 45 | B | 62 | D |
| 12 | C | 29 | B | 46 | B | 63 | B |
| 13 | B | 30 | C | 47 | B |  |  |
| 14 | C | 31 | B | 48 | A |  |  |
| 15 | B | 32 | B | 49 | B |  |  |
| 16 | B | 33 | C | 50 | B |  |  |
| 17 | B | 34 | B | 51 | B |  |  |

---

## Quick Score Guide

| Score | Interpretation |
|---|---|
| 55–63 | Excellent — strong OOP foundation |
| 45–54 | Good — revise constructors, records, and program structure |
| 30–44 | Fair — review class/object and constructor basics |
| Below 30 | Needs revision — study the full OOP foundation notes |

This version no longer references specific examples from your documents, so anyone can attempt it directly.