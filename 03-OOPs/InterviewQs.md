# Java OOP Interview Question Bank

## Topics identified from your notes

### A. OOP Foundation

* Class
* Object
* Object creation
* `new`
* Object state and behavior
* Class vs Object
* `main()` and class execution

### B. Constructors

* Constructor
* Default constructor
* Parameterized constructor
* Constructor overloading
* Copy constructor
* Private constructor
* Constructor with inheritance
* `super()`
* Constructor vs method

### C. Encapsulation

* Data hiding
* Private fields
* Getters/setters
* Controlled access
* Validation
* Read-only design
* Access modifiers

### D. Inheritance

* Parent/child class
* `extends`
* IS-A relationship
* Single inheritance
* Multilevel
* Hierarchical
* Multiple inheritance
* Multiple inheritance through interfaces
* Diamond problem
* `super`
* Constructor chaining

### E. Abstraction

* Abstraction
* Abstract class
* Abstract method
* Concrete method
* Abstract class constructor
* Abstract class reference
* Abstract class vs normal class
* Abstract class vs interface

### F. Interfaces

* Interface
* `implements`
* Interface reference
* Interface polymorphism
* Default methods
* Static methods
* Private methods
* Interface inheritance
* Multiple interfaces
* Marker interfaces
* `Serializable`
* Diamond problem

### G. Polymorphism

* Polymorphism
* Compile-time polymorphism
* Method overloading
* Runtime polymorphism
* Method overriding
* Parent reference → child object
* Upcasting
* Dynamic method dispatch
* `@Override`
* `super.method()`

### H. Java Records

* Record class
* When to use records
* Record inheritance
* Record vs normal class

---

# 1. Class & Object

### Q1. What is a class and what is an object?

**Company:** Shell
**Role:** Interview for IT Engineer

The interviewer explicitly asked:

> "What is Class and an object?"

The same question was also reported in a Cognizant interview experience. ([GeeksforGeeks][1])

**Authenticity:** 🟢 Direct candidate-reported

---

### Q2. What is a class and object? How do you create an object?

**Company:** Cognizant
**Role:** Technical Interview

The interview included **Class and Object**, and the candidate was also asked about creating/using methods. A recent Cognizant interview report likewise lists Class and Object among the Java fundamentals questions. ([GeeksforGeeks][2])

**Authenticity:** 🟢

---

### Q3. What happens when an object is created? Where is the object stored?

**Company:** Shell

The candidate reported being asked:

> "When a class is initialized, and object is not created, then is memory consumed for it?"

This directly connects to your notes about classes, objects and object creation/memory. ([GeeksforGeeks][1])

**Authenticity:** 🟢

---

# 2. Constructors

### Q4. What is a constructor and why do we use it?

**Company:** Shell

The interviewer explicitly asked:

> "What is constructor and why do we use it?"

([GeeksforGeeks][1])

**Authenticity:** 🟢 Direct

---

### Q5. What is a constructor? Can a class have a default constructor?

**Company:** ServiceNow
**Role:** Software Engineer

The candidate reported these exact questions in the technical round. ([Jointaro][3])

**Authenticity:** 🟢 Direct

---

### Q6. What are the types of constructors in Java?

**Company:** Hanu Software Solutions

The interviewer explicitly asked:

> "How many types of constructors are there?"

([GeeksforGeeks][4])

It was also asked in an EPAM Systems technical interview:

> "What is Constructor? Explain the types of constructors"

([Naukri][5])

**Authenticity:** 🟢🟢 Strongly reported

---

### Q7. What is a copy constructor?

**Company:** Capgemini
**Role:** Java Intern — Mumbai

The interview report explicitly lists:

> "Copy constructor"

among the OOP questions. ([Jointaro][6])

**Authenticity:** 🟢 Direct

---

### Q8. Can we have a private constructor? If yes, where is it used?

**Company:** Publicis Sapient
**Role:** Java/Selenium Automation

The candidate reported being asked exactly this. ([LinkedIn][7])

**Authenticity:** 🟢 Direct

---

### Q9. Can we override a constructor in Java?

**Company:** Publicis Sapient

The candidate explicitly reported this question alongside private and static constructor questions. ([LinkedIn][8])

**Authenticity:** 🟢

---

### Q10. Can we write a static constructor in Java?

**Company:** Publicis Sapient

Reported directly as an interview question. ([LinkedIn][8])

**Authenticity:** 🟢

---

### Q11. Can a constructor be `final` in Java?

**Company:** Zeta Suite / Directi — SDE-1

This was explicitly asked during the OOP technical discussion. ([GeeksforGeeks][9])

**Authenticity:** 🟢

---

### Q12. What is the use of a constructor in an abstract class if we cannot instantiate the abstract class?

**Company:** TIAA

The candidate reported:

> "Abstract class with constructor and what is the use of constructor if we dont instantiate abstract class."

Hexaview also explicitly asked whether abstract classes have constructors. ([Glassdoor][10])

**Authenticity:** 🟢🟢

---

# 3. Encapsulation

### Q13. What is encapsulation?

**Company:** TCS — CodeVita interview

The interviewer explicitly asked:

> "Can you explain encapsulation?"

The candidate then explained it using a Java getter/setter implementation. ([GeeksforGeeks][11])

**Authenticity:** 🟢 Direct

---

### Q14. Can you explain encapsulation with code?

**Company:** TCS — CodeVita

The interviewer followed the definition with:

> "can you explain with code?"

The candidate implemented encapsulation using getters and setters. ([GeeksforGeeks][11])

**Authenticity:** 🟢 Direct

---

### Q15. How can private variables be accessed in Java?

**Company:** Publicis Sapient

The reported question was:

> "How can we access private variables in classes?"

The candidate discussed getters/access through methods in a Page Object Model context. ([LinkedIn][8])

**Authenticity:** 🟢

---

### Q16. What is the difference between data hiding and abstraction?

**Company:** Hexaview Technologies

The interviewer explicitly asked:

> "Data hiding Vs Abstraction."

([GeeksforGeeks][12])

This is particularly relevant to your notes because your documentation treats **encapsulation/data hiding** and **abstraction** separately.

**Authenticity:** 🟢 Direct

---

# 4. Inheritance

### Q17. What is inheritance?

**Company:** Wells Fargo

The interview explicitly included:

> "What is inheritance?"

([Jointaro][13])

It was also asked in Tata Software and several other interviews. ([GeeksforGeeks][14])

**Authenticity:** 🟢🟢

---

### Q18. What are the types of inheritance in Java?

**Company:** Wells Fargo

The candidate reported:

> "What are the types of inheritance?"

([Jointaro][13])

It was also explicitly asked at WatchGuard, SAP Labs, Accenture and EPAM. ([Naukri][15])

**Authenticity:** 🟢🟢🟢 Very strongly reported

---

### Q19. Does Java support multiple inheritance? If not, why?

**Company:** Wells Fargo

The exact interview report asks:

> "Does multiple inheritance allow in Java? If not, why?"

([Jointaro][13])

This was also reported in Hanu Software Solutions and SAP Labs interviews. ([GeeksforGeeks][4])

**Authenticity:** 🟢🟢🟢

---

### Q20. Why doesn't Java support multiple inheritance through classes?

**Company:** Hanu Software Solutions / SAP Labs

The candidates reported being asked why Java does not support multiple inheritance and whether there is a way to achieve it. ([GeeksforGeeks][4])

**Authenticity:** 🟢

---

### Q21. Why is multiple inheritance achieved through interfaces instead of classes?

**Company:** JM Financial Services

The interviewer asked:

> "Why multiple inheritance in java is done through interface and not classes?"

and followed it with the ambiguity problem. ([Medium][16])

**Authenticity:** 🟢 Direct

---

### Q22. What is the Diamond Problem?

**Company:** Infosys

A recent Infosys campus interview report explicitly lists:

* What is multiple inheritance?
* What is the Diamond Problem?
* How do interfaces solve the problem?

([Reddit][17])

**Authenticity:** 🟢 Direct candidate report

---

### Q23. What is the difference between `extends` and `implements`?

**Company:** Dassault Systèmes

The interview report explicitly lists:

> "What is the difference between extends and implements?"

([Naukri][18])

**Authenticity:** 🟢 Direct

---

### Q24. When do you use the `super` keyword?

**Company:** Dassault Systèmes

The interviewer explicitly asked:

> "When do you use the super keyword?"

([Naukri][18])

**Authenticity:** 🟢 Direct

---

### Q25. What are IS-A and HAS-A relationships in Java?

**Company:** Wells Fargo / Enzigma

Wells Fargo explicitly asked about **IS-A and HAS-A relationships**, while Enzigma separately reported both questions. ([Jointaro][13])

**Authenticity:** 🟢🟢

---

# 5. Abstraction

### Q26. What is abstraction?

**Company:** Zeta Suite / Directi

The interviewer explicitly asked:

> "What is abstraction?"

([GeeksforGeeks][9])

It was also asked at TataSoft and Hexaview. ([GeeksforGeeks][14])

**Authenticity:** 🟢🟢🟢

---

### Q27. How can abstraction be implemented in Java?

**Company:** Hexaview Technologies

The interview included:

> "How can we implement abstraction, can we call the constructor of abstract classes?"

([GeeksforGeeks][12])

**Authenticity:** 🟢 Direct

---

### Q28. Can an abstract class have a constructor?

**Company:** Hexaview Technologies

Explicitly asked:

> "Do abstract class has constructors?"

([GeeksforGeeks][12])

The same concept appeared in TIAA's interview. ([Glassdoor][10])

**Authenticity:** 🟢🟢

---

### Q29. What is the difference between an abstract class and an interface?

**Companies:** ServiceNow, Zeta Suite, Infosys, Deloitte, Capgemini, etc.

This is one of the **most repeatedly reported OOP questions** in the sources I checked. ServiceNow, Zeta, Infosys, Deloitte and Capgemini reports all contain it. ([Jointaro][3])

**Authenticity:** 🟢🟢🟢🟢

---

# 6. Interfaces

### Q30. What is an interface?

**Company:** Infosys

The candidate reported the exact question:

> "What is meant by Interface?"

([Naukri][19])

**Authenticity:** 🟢 Direct

---

### Q31. Why do we need interfaces?

**Company:** Hexaview Technologies

The interviewer explicitly asked:

> "Why do we need interfaces?"

([GeeksforGeeks][12])

**Authenticity:** 🟢

---

### Q32. Can a class implement multiple interfaces?

Recent interview reports explicitly list this as a Java interface question, including reports describing Accenture, Infosys and Capgemini hiring. ([LinkedIn][20])

**Authenticity:** 🟢 Reported

---

### Q33. Can an interface extend another interface?

This was also reported as an interface interview question in the same recent interview-question reports. ([LinkedIn][20])

**Authenticity:** 🟢 Reported

---

### Q34. Can an interface have variables?

**Company:** Capgemini / other reported Java interviews

This appears among recent interview questions specifically testing interface rules. ([LinkedIn][21])

**Authenticity:** 🟢 Reported

---

### Q35. Can an interface have static methods?

**Company:** Capgemini

A December 2024 Java Developer interview explicitly asked about Java 8 improvements to interfaces, specifically **static and default methods**. ([AmbitionBox][22])

**Authenticity:** 🟢 Direct

---

### Q36. Why were default methods introduced in interfaces?

**Company:** Capgemini

The reported interview specifically asked what improvements Java 8 introduced to interfaces, including default methods. Other candidate reports also identify "Why default methods were introduced?" as an interview question. ([AmbitionBox][22])

**Authenticity:** 🟢

---

### Q37. Can default methods be overridden?

Recent interview reports identify this as a question asked in Wipro, Infosys and Accenture hiring. ([LinkedIn][21])

**Authenticity:** 🟢 Reported

---

### Q38. Can private methods be defined inside an interface?

A recent Infosys interview report explicitly includes:

> "Is it possible to define private methods inside an interface?"

([LinkedIn][23])

**Authenticity:** 🟢 Direct

---

### Q39. What happens if two interfaces contain identical default methods?

**Company:** Recent Java interview report

The candidate reported being asked what happens when two interfaces contain identical default methods and how the conflict is resolved. ([LinkedIn][23])

This directly connects to your **diamond problem/default-method conflict** section.

**Authenticity:** 🟢

---

### Q40. Can we create an object of an interface?

This is reported among interface filtering questions in recent MNC hiring reports. ([LinkedIn][21])

**Authenticity:** 🟢 Reported

---

# 7. Polymorphism

### Q41. What is polymorphism?

**Company:** TataSoft

The technical round explicitly asked:

> "Types of Polymorphism."

and the same interview covered OOP concepts including inheritance and abstraction. ([GeeksforGeeks][14])

Accenture also explicitly asked for the types of polymorphism. ([GeeksforGeeks][24])

**Authenticity:** 🟢🟢

---

### Q42. What are the types of polymorphism in Java?

**Company:** Accenture

The interview report explicitly lists:

> "Types of Polymorphism in Java"

([GeeksforGeeks][24])

**Authenticity:** 🟢 Direct

---

### Q43. What is the difference between method overloading and method overriding?

**Company:** Zeta Suite / Directi

This was explicitly asked in the SDE-1 interview. ([GeeksforGeeks][9])

It is also repeatedly reported in other Java interviews. ([Naukri][25])

**Authenticity:** 🟢🟢🟢

---

### Q44. Can methods be overloaded by changing only the return type?

**Company:** Zeta / Wells Fargo / TIAA

Wells Fargo explicitly asked whether overloading is possible when the only difference is the return type. TIAA also reported a similar question. ([Jointaro][13])

**Authenticity:** 🟢🟢

---

### Q45. Can static methods be overridden?

**Company:** RS Software

A 2025 Junior Java Developer interview explicitly asked:

> "Can we override static methods?"

and followed it with method hiding. ([GeeksforGeeks][26])

**Authenticity:** 🟢 Direct

---

### Q46. What is runtime polymorphism and compile-time polymorphism?

**Company:** Wells Fargo

The interview explicitly asked the candidate to explain runtime vs compile-time polymorphism with examples. ([Jointaro][13])

**Authenticity:** 🟢 Direct

---

### Q47. What happens when a parent reference refers to a child object?

This concept was directly tested in several reported OOP discussions involving runtime polymorphism and actual-object method selection. For example, the reported Infosys and Cognizant experiences test the distinction between inheritance, overriding and runtime behavior. ([Reddit][17])

**Authenticity:** 🟡 The concept is reported; this exact wording is a normalized version.

---

# 8. Java Records

Your notes include **Record**, which is particularly interesting because this is now appearing in modern Java backend interviews.

### Q48. What is a Record class and when do we use it?

**Company:** IBS Software
**Role:** Java Backend Developer

The reported interview questions included:

> "Use of Record Class and When we Used Sealed Classes in Java."

and:

> "When We Use Record Classes?"

([LinkedIn][27])

**Authenticity:** 🟢 Direct recent report

---

### Q49. Can record classes extend other classes? Why?

**Company:** IBS Software

The candidate explicitly reported:

> "Can record classes extend other classes? Why?"

([LinkedIn][27])

**Authenticity:** 🟢 Direct

---

# 🔥 Most Important Questions From This Document

Based on **how many independent interview reports** contain the topic/question, these are the ones I would make sure you can answer extremely well:

| Priority | Question                                                     | Evidence                                                       |
| -------- | ------------------------------------------------------------ | -------------------------------------------------------------- |
| 🔥🔥🔥   | What is OOP? Explain its four pillars.                       | Multiple interview reports ([Jointaro][3])                     |
| 🔥🔥🔥   | What is inheritance?                                         | Multiple companies ([Jointaro][13])                            |
| 🔥🔥🔥   | Types of inheritance in Java                                 | Wells Fargo, WatchGuard, SAP, Accenture, EPAM ([Jointaro][13]) |
| 🔥🔥🔥   | Why doesn't Java support multiple inheritance with classes?  | Multiple reports ([GeeksforGeeks][4])                          |
| 🔥🔥🔥   | What is the difference between abstract class and interface? | Many reports ([Jointaro][3])                                   |
| 🔥🔥🔥   | What is method overloading vs overriding?                    | Many reports ([GeeksforGeeks][9])                              |
| 🔥🔥🔥   | What is abstraction?                                         | Multiple companies ([GeeksforGeeks][9])                        |
| 🔥🔥🔥   | What is an interface?                                        | Infosys and others ([Naukri][19])                              |
| 🔥🔥     | What is encapsulation?                                       | TCS, Wells Fargo ([GeeksforGeeks][11])                         |
| 🔥🔥     | What is a constructor and why is it used?                    | Shell, ServiceNow ([GeeksforGeeks][1])                         |
| 🔥🔥     | Types of constructors                                        | Hanu, EPAM, Cognizant ([GeeksforGeeks][4])                     |
| 🔥🔥     | What is runtime vs compile-time polymorphism?                | Wells Fargo ([Jointaro][13])                                   |
| 🔥🔥     | What is `super` and when do you use it?                      | Dassault, TataSoft ([Naukri][18])                              |
| 🔥🔥     | What is IS-A / HAS-A?                                        | Wells Fargo, Enzigma ([Jointaro][13])                          |
| 🔥       | What is a Java Record and when do we use it?                 | IBS Software ([LinkedIn][28])                                  |

---

# 🔑 ANSWER KEY

## 1. What is a class and object?

A **class** is a blueprint/type that defines the state and behavior of objects.

An **object** is a runtime instance of a class.

```java
class Car {
    String brand;

    void drive() {
        System.out.println("Driving");
    }
}

Car c = new Car();
```

Here:

```text
Car → class
c   → reference variable
new Car() → object
```

---

## 2. What is a constructor?

A constructor is a special class member used during object creation to initialize the object.

```java
class Car {

    Car() {
        System.out.println("Constructor called");
    }
}
```

It has:

* Same name as the class
* No return type
* Runs when an object is created

---

## 3. Types of constructors

In basic Java terminology:

### No-argument constructor

```java
Car() {
}
```

### Parameterized constructor

```java
Car(String brand, int speed) {
    this.brand = brand;
    this.speed = speed;
}
```

**Important:** Java does not have a special built-in "copy constructor" language feature like C++, but you can create a constructor that copies another object's state:

```java
Car(Car other) {
    this.brand = other.brand;
    this.speed = other.speed;
}
```

This distinction is worth knowing because interviewers can ask about copy constructors.

---

## 4. Can a constructor be overridden?

**No.**

Constructors are not inherited, so they cannot be overridden.

A child class can have its **own constructor**, but that is not method overriding.

---

## 5. Can a constructor be `static`?

**No.**

`static` members belong to the class, whereas constructors are associated with object initialization.

So:

```java
static Car() { }   // ❌
```

is invalid.

---

## 6. Can a constructor be `final`?

**No.**

A constructor cannot be inherited or overridden, so `final` has no applicable meaning for constructors.

This was explicitly tested at Zeta Suite/Directi. ([GeeksforGeeks][9])

---

## 7. Can a constructor be private?

**Yes.**

Example:

```java
class Singleton {

    private Singleton() {
    }
}
```

A private constructor prevents outside code from directly creating objects through `new`.

Common uses include:

* Singleton-style designs
* Utility classes
* Factory-controlled object creation

The private-constructor question was directly reported in a Publicis Sapient Java interview. ([LinkedIn][8])

---

## 8. What is encapsulation?

Encapsulation means **bundling state and behavior together while controlling access to the object's internal state**.

Common implementation:

```java
class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

The outside code cannot directly modify:

```java
balance
```

Instead, it goes through controlled methods.

TCS specifically reported an interview where the candidate was asked to explain encapsulation and demonstrate it with getters/setters. ([GeeksforGeeks][11])

---

## 9. What is inheritance?

Inheritance allows a child class to acquire/reuse accessible behavior and structure from a parent class.

```java
class Vehicle {
    void start() {
    }
}

class Car extends Vehicle {
}
```

`Car` has an **IS-A** relationship with `Vehicle`.

---

## 10. Types of inheritance relevant to Java

```text
Single
Multilevel
Hierarchical
Multiple → through interfaces
```

Java does **not** support multiple inheritance of classes.

Multiple interfaces can be implemented by one class.

These distinctions have been repeatedly tested in actual interviews. ([Jointaro][13])

---

## 11. Why doesn't Java support multiple inheritance through classes?

Consider:

```text
       A
      / \
     B   C
      \ /
       D
```

If both `B` and `C` provide the same method, `D` could face ambiguity about which implementation should be inherited.

This is commonly called the **Diamond Problem**.

Java therefore doesn't allow:

```java
class D extends B, C { } // ❌
```

Instead:

```java
class D implements B, C { } // conceptually through interfaces
```

and conflicting default methods must be resolved explicitly when necessary.

---

## 12. What is the difference between `extends` and `implements`?

### `extends`

Used for:

```java
class Child extends Parent
```

and:

```java
interface ChildInterface extends ParentInterface
```

### `implements`

Used when a class implements an interface:

```java
class Car implements Vehicle
```

A class can extend **one class**, but can implement **multiple interfaces**.

This exact distinction was reported in a Dassault Systèmes interview. ([Naukri][18])

---

## 13. What is abstraction?

Abstraction means exposing the essential functionality while hiding unnecessary implementation details.

Example:

```java
abstract class Vehicle {

    abstract void start();
}
```

The parent says:

> Every vehicle must have `start()`.

The child determines **how** it starts.

---

## 14. Can an abstract class have a constructor?

**Yes.**

You cannot do:

```java
new Vehicle(); // if Vehicle is abstract
```

But the constructor can run as part of constructing a concrete child:

```java
class Car extends Vehicle {

    Car() {
        super();
    }
}
```

The abstract-class constructor question was directly reported by Hexaview and TIAA. ([GeeksforGeeks][12])

---

## 15. Abstract class vs interface

| Abstract Class                     | Interface                                    |
| ---------------------------------- | -------------------------------------------- |
| `abstract class`                   | `interface`                                  |
| Can have instance state            | Fields are constants (`public static final`) |
| Can have constructors              | No constructors                              |
| Can have abstract methods          | Can have abstract methods                    |
| Can have concrete methods          | Can have default/static/private methods      |
| Class extends one class            | Class can implement multiple interfaces      |
| Useful for shared state + behavior | Useful for contract/capability               |

Modern Java makes the distinction less about "abstract class has implementation, interface doesn't," because interfaces can have `default`, `static`, and `private` methods. This was specifically tested in an Infosys interview report. ([Naukri][19])

---

## 16. What is an interface?

An interface is a reference type that defines a contract/capability that implementing classes agree to provide.

```java
interface Vehicle {
    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starting");
    }
}
```

---

## 17. Can an interface have variables?

Yes, but interface fields are implicitly:

```java
public static final
```

So they are constants, not per-object instance fields.

Example:

```java
interface Vehicle {
    int MAX_SPEED = 200;
}
```

---

## 18. Can an interface have static methods?

**Yes.**

```java
interface Vehicle {

    static void info() {
        System.out.println("Vehicle");
    }
}
```

Call:

```java
Vehicle.info();
```

Static interface methods belong to the interface itself.

The Java 8 static/default interface change was explicitly discussed in a Capgemini interview. ([AmbitionBox][22])

---

## 19. Why were default methods introduced?

A major reason was **interface evolution/backward compatibility**.

Java 8 needed to add new behavior to existing interfaces without forcing every existing implementing class to immediately implement the new method.

Default methods provide an implementation that implementing classes can inherit or override.

---

## 20. Can default methods be overridden?

**Yes.**

```java
interface Vehicle {

    default void start() {
        System.out.println("Vehicle");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car");
    }
}
```

---

## 21. Can an interface have private methods?

**Yes**, modern Java allows private interface methods.

They can be used internally by the interface's own default/static methods.

They cannot be called directly by implementing classes and cannot be overridden.

This was directly reported in a recent Infosys interview experience. ([LinkedIn][23])

---

## 22. What is polymorphism?

Polymorphism means **one interface/reference or operation can represent multiple forms of behavior**.

Java commonly demonstrates:

```text
Compile-Time → Method Overloading
Run-Time     → Method Overriding
```

---

## 23. Overloading vs overriding

### Overloading

```java
add(int a)
add(int a, int b)
```

Same method name, different parameter list.

Resolved at compile time.

### Overriding

```java
class Vehicle {
    void start() {}
}

class Bike extends Vehicle {
    @Override
    void start() {}
}
```

Child provides a new implementation of inherited behavior.

Resolved at runtime based on the actual object.

---

## 24. Can methods be overloaded by changing only the return type?

**No.**

This is invalid:

```java
int add(int a) {
    return a;
}

double add(int a) {
    return a;
}
```

The parameter list is identical.

Return type alone cannot distinguish overloaded methods.

This was explicitly tested in Wells Fargo and TIAA interview reports. ([Jointaro][13])

---

## 25. Can static methods be overridden?

**No.**

Static methods are associated with the class, not dynamically dispatched based on the runtime object.

A child can declare a static method with the same signature, but this is **method hiding**, not overriding.

This distinction was explicitly asked in the RS Software interview. ([GeeksforGeeks][26])

---

## 26. What is runtime polymorphism?

Example:

```java
Vehicle v = new Bike();
v.start();
```

Reference type:

```text
Vehicle
```

Actual object:

```text
Bike
```

If `Bike` overrides `start()`, the `Bike` implementation executes.

That's runtime polymorphism.

---

## 27. What is `super` used for?

`super` refers to the immediate parent-class portion of the current object.

It can be used to:

### Call parent constructor

```java
super(brand, speed);
```

### Call parent method

```java
super.display();
```

### Access a hidden parent field

```java
super.value;
```

The `super` question was directly reported by Dassault Systèmes and TataSoft. ([Naukri][18])

---

## 28. What is a Record class?

A record is a special Java class intended primarily for **transparent data carriers**.

Example:

```java
public record Student(
    String name,
    int age
) {}
```

Java automatically provides components/accessors and appropriate implementations for methods such as `equals()`, `hashCode()` and `toString()` based on the record components.

Records were directly discussed in a recent IBS Software Java Backend Developer interview. ([LinkedIn][27])

---

## 29. When should you use a Record?

Use a record when the primary purpose of the type is to represent a relatively simple immutable data aggregate and you don't need the flexibility of a normal class's mutable instance state.

Typical examples:

```text
DTOs
Data-transfer results
Small immutable data carriers
Query/result projections
```

---

## 30. Can a record extend another class?

**No.**

A record implicitly extends `java.lang.Record`, so it cannot extend another class.

It **can implement interfaces**.

This exact question was reported in the IBS Software Java Backend Developer interview. ([LinkedIn][27])

[1]: https://www.geeksforgeeks.org/interview-experiences/shell-interview-experience-for-sde/?utm_source=chatgpt.com "Shell Interview Experience for SDE - GeeksforGeeks"
[2]: https://www.geeksforgeeks.org/cognizant-interview-experience-for-genc-elevate-on-campus/?utm_source=chatgpt.com "Cognizant Interview Experience for GenC Elevate (On-Campus) - GeeksforGeeks"
[3]: https://www.jointaro.com/interviews/companies/servicenow/experiences/software-engineer-san-diego-ca-january-1-2024-no-offer-neutral-0d81a9ac/?utm_source=chatgpt.com "ServiceNow Software Engineer Interview Experience - San Diego, California"
[4]: https://www.geeksforgeeks.org/interview-experiences/hanu-software-solutions-interview-experience/?utm_source=chatgpt.com "Hanu Software Solutions Interview Experience - GeeksforGeeks"
[5]: https://www.naukri.com/code360/interview-experiences/epam-systems/interview-experience-off-campus-dec-2021-2-3310?utm_source=chatgpt.com "Junior Software Engineer EPAM Systems interview experience | Anonymous - Naukri Code 360"
[6]: https://www.jointaro.com/interviews/companies/capgemini/experiences/java-intern-mumbai-may-1-2024-no-offer-negative-4117968b/?utm_source=chatgpt.com "Capgemini Java Intern Interview Experience - Mumbai, Maharashtra"
[7]: https://in.linkedin.com/in/karthickramanathanrkr?utm_source=chatgpt.com "Karthick Ramanathan - Comcast | LinkedIn"
[8]: https://www.linkedin.com/posts/moazzam-shaban-12750628a_interviewexperience-publicissapient-java-activity-7394262904021078016-INT0?utm_source=chatgpt.com "Publicis Sapient Interview Experience: Java Selenium Automation Role | Moazzam Shaban posted on the topic | LinkedIn"
[9]: https://www.geeksforgeeks.org/interview-experiences/zeta-directi-interview-experience-for-sde-1/?utm_source=chatgpt.com "Zeta (Directi) Interview Experience for SDE-1 - GeeksforGeeks"
[10]: https://www.glassdoor.co.uk/Interview/TIAA-Interview-RVW65185714.htm?utm_source=chatgpt.com "TIAA Interview Questions (2025) | Glassdoor"
[11]: https://www.geeksforgeeks.org/interview-experiences/tcs-codevita-2018-interview-experience/?utm_source=chatgpt.com "TCS Interview Experience - (Off-campus through Codevita 2018) - GeeksforGeeks"
[12]: https://www.geeksforgeeks.org/interview-experiences/hexaview-technologies-interview-experience-off-campus-2/?utm_source=chatgpt.com "Hexaview Technologies Interview Experience (Off-Campus) - GeeksforGeeks"
[13]: https://www.jointaro.com/interviews/companies/wells-fargo/experiences/qa-lead-sr-qa-analyst-bengaluru-karnataka-march-1-2020-accepted-offer-neutral-4701de9c/?utm_source=chatgpt.com "Wells Fargo QA Lead /Sr QA Analyst Interview Experience - Bengaluru, Karnataka"
[14]: https://www.geeksforgeeks.org/interview-experiences/tatvasoft-interview-experience-for-java-developer/?utm_source=chatgpt.com "Tatvasoft Interview Experience for Java Developer - GeeksforGeeks"
[15]: https://www.naukri.com/code360/interview-experiences/watchguard-technologies/interview-experience-on-campus-apr-2021-2-7194?utm_source=chatgpt.com "Full Stack Engineer WatchGuard Technologies interview experience | Anonymous - Naukri Code 360"
[16]: https://medium.com/%40agrawalalok425/jm-financial-services-on-campus-interview-experience-fresher-d4ecc6e5cbbb?utm_source=chatgpt.com "JM Financial Services on Campus Interview Experience| Fresher | by Alok Agrawal | Medium"
[17]: https://www.reddit.com/r/infosys/comments/1wbvcmj/infosys_campus_interview_drive_experience/?utm_source=chatgpt.com "Infosys Campus Interview Drive Experience"
[18]: https://www.naukri.com/code360/interview-experiences/dassault-systemes-solutions-lab-pvt-ltd/interview-experience-sep-2021-exp-0-2-years-2-1781?utm_source=chatgpt.com "R&D Engineer Dassault Systemes Solutions Lab pvt ltd interview experience | Anonymous - Naukri Code 360"
[19]: https://www.naukri.com/code360/interview-experiences/infosys/infosys-interview-experience-off-campus-aug-2021-1393?utm_source=chatgpt.com "Java Developer Infosys interview experience | Anonymous - Naukri Code 360"
[20]: https://in.linkedin.com/in/gopikrishnakonda?utm_source=chatgpt.com "Gopi Krishna Konda - Hyderabad, Telangana, India | Professional Profile | LinkedIn"
[21]: https://in.linkedin.com/in/shivkanya-bharat-fuke-7aa182244?utm_source=chatgpt.com "Shivkanya Bharat Fuke - Tata Consultancy Services | LinkedIn"
[22]: https://www.ambitionbox.com/interviews/capgemini-interview-questions?page=21&utm_source=chatgpt.com "18,700+ Capgemini Interview Questions & Answers | Complete Prep Guide 2025 | AmbitionBox"
[23]: https://in.linkedin.com/in/prasad-relangi-b602b6204?utm_source=chatgpt.com "Prasad Relangi - Infosys | LinkedIn"
[24]: https://www.geeksforgeeks.org/interview-experiences/accenture-interview-experience-on-campus-11/?utm_source=chatgpt.com "Accenture Interview Experience (On-Campus) - GeeksforGeeks"
[25]: https://www.naukri.com/code360/interview-experiences/citiustech/interview-experience-oct-2021-exp-0-2-years-2-1736?utm_source=chatgpt.com "Frontend Engineer Citiustech interview experience | Anonymous - Naukri Code 360"
[26]: https://www.geeksforgeeks.org/interview-experiences/company-name-interview-experience-for-job-title-160/?utm_source=chatgpt.com "[Company Name] Interview Experience for [Job Title] - GeeksforGeeks"
[27]: https://in.linkedin.com/in/nisheeta-maria-stephen-038959189?utm_source=chatgpt.com "Nisheeta Maria Stephen - Tata Consultancy Services | LinkedIn"
[28]: https://www.linkedin.com/posts/amujuri-ganesh-848158255_java-corejava-springboot-activity-7438613527096889344--ZiU?utm_source=chatgpt.com "Java Backend Developer Interview Questions at IBS Software | AMUJURI GANESH posted on the topic | LinkedIn"
