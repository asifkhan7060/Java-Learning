# INTRODUCTION TO OBJECT-ORIENTED PROGRAMMING SYSTEM (OOPs)

---

# Evolution of Programming

Programming has been approached in different ways depending on the problems developers needed to solve.

The major approaches discussed here are:

```text
Procedural Programming
        ↓
Functional Programming
        ↓
Object-Oriented Programming
```

> This diagram is a simple learning model. These programming paradigms are not strict replacements for one another; modern languages can support multiple styles.

The important idea is that the **focus of programming changes** depending on the paradigm or Perspective.

| Paradigm | Main Focus |
|---|---|
| Procedural | How to perform a task |
| Functional | What result should be produced |
| Object-Oriented | What objects exist, what data they have, and what they can do |

---

# Procedural Programming

## WHAT is Procedural Programming?

Procedural Programming is a programming paradigm where a program is divided into **functions or procedures**.

The main focus is:

> **How should the task be performed step by step?**

A large problem is divided into smaller functions, and those functions are executed in a planned sequence.

### Example

Suppose we want to make tea:

```text
Step 1 → Boil Water
Step 2 → Add Tea Powder
Step 3 → Add Sugar
Step 4 → Add Milk
Step 5 → Serve Tea
```

The focus is on the **steps required to complete the task**.

Examples include:
- C Programming
- BASIC Programs where step-by-step processing is the main concern

## Limitation

As a program becomes very large, managing hundreds or thousands of separate functions and shared data can become difficult.

Problems can include:

- Difficult maintenance
- Code duplication
- Weak organization of related data and behavior
- Difficulty managing large systems

---

# Functional Programming

## WHAT is Functional Programming?

Functional Programming is a programming paradigm where computation is expressed using **functions**.

The main focus is:

> **What result should be produced?**

Functions receive input, process it, and produce output.

### Example

Suppose we have student marks:

```text
Marks
  ↓
Calculate Total
  ↓
Calculate Percentage
  ↓
Display Result
```

Each function can transform data and produce another result.

## WHY is Functional Programming useful?

It is useful when a problem can naturally be expressed as a series of **data transformations and computations**.

For example:

```java
marks
    → calculateTotal
    → calculatePercentage
    → displayResult
```

## Examples

- Haskell
- Lisp
- Scala
- Functional features in Java such as Lambdas and Streams

---

# Object-Oriented Programming

## WHAT is OOP?

**Object-Oriented Programming (OOP)** is a programming paradigm where software is organized around **objects**.

The main focus is:

> **What objects exist, what data belongs to them, and what behavior they provide.**

OOP combines:

```text
Data + Behavior -> Object

```

### Example

Instead of thinking only about:

```text
calculateOrder()
makePayment()
setReminder()
```

we can think about a:

```text
User
 ├── name
 ├── age
 ├── orderFood()
 └── setReminder()
```

Here:

- `name` and `age` represent **state** or **properties**
- `orderFood()` and `setReminder()` represent **behavior**

This is the central idea behind OOP.

---

# WHY do we use OOP?

As software systems become larger, simply managing functions and data separately can become difficult.

OOP provides this organization through **classes and objects**.

It helps developers build software that is easier to:

- Design
- Reuse
- Maintain
- Extend
- Scale

OOP is widely used in languages such as:

- Java
- C++
- C#
- Python

---

# Core Building Blocks of OOP

Before going deeper into OOP, first understand these basic concepts:

1. **Class** → Blueprint for creating objects
2. **Object** → Actual instance of a class
3. **State** → Data/properties of an object
4. **Behavior** → Actions/methods of an object
5. **Constructor** → Used to initialize objects
6. **Methods** → Define what an object can do
7. **Four Pillar of OOPs** -> Encapsulation, Abstraction, Inheritance, and Polymorphism

> Class, Object, State, Behavior, Constructors, and Methods form the basic foundation.  
> Encapsulation, Abstraction, Inheritance, and Polymorphism are the four main OOP principles.

---

# Class

## WHAT is a Class?

A **Class is a blueprint or template used to create objects**.

A class defines what an object should contain.

It can define:

- Properties / State
- Methods / Behavior
- Constructors

### Example

```java
class User {

    // Properties / State
    String name;
    int age;

    // Methods / Behavior
    void orderFood() {
    }

    void setReminder() {
    }
}
```

Here:

```text
Class = User
```

The class describes what a `User` object can contain and do.

## WHY do we need a Class?

A class gives us a structure from which multiple objects can be created.

Instead of separately defining the same properties and methods for every user, we define them once:

```text
             User Class
          /      |       \
         /       |        \
      John      Sam      Asif
```

The blueprint remains the same, while each object can contain different data.

---

# Object

## WHAT is an Object?

An **Object is an actual instance of a class**.

Example:

```java
User user1 = new User();
User user2 = new User();
```

Here:

```text
User     → Class
user1    → Object
user2    → Object
```

Both objects are created using the same class.

## Real-Life Example

Think about a house.

```text
House Blueprint  → Class
Actual House     → Object
```

The blueprint describes what the house should look like.

The actual house is built from that blueprint.

Similarly:

```text
Class  → User

Objects →
John
Sam
Asif
```

---

# How Class and Object Work Together

The basic relationship is:

```text
Class
  ↓
Blueprint
  ↓
Create Object
  ↓
Object gets its own State
  ↓
Object uses defined Behavior
```

Example:

```java
class User {

    // States or properties or data
    String name;
    int age;

    // methods or behavior
    void orderFood() {
        System.out.println("Ordering food...");
    }
}
```

Create objects:

```java
User john = new User();
User sam = new User();

john.name = "John";
john.age = 25;

sam.name = "Sam";
sam.age = 22;
```

Now:

```text
              User Class
            /           \
           /             \
       John Object      Sam Object
       name = John      name = Sam
       age = 25         age = 22
```

Both objects use the same class definition but maintain their own state.

---

# Methods (Behavior)

## WHAT are Methods in OOP?

Methods represent the **behavior or actions** that an object can perform.

Example:

```java
class User {

    void orderFood() {
        System.out.println("Ordering food...");
    }

    void setReminder() {
        System.out.println("Reminder set.");
    }
}
```

Here:

```text
State:
    name
    age

Behavior:
    orderFood()
    setReminder()
```

Methods allow objects to perform actions instead of only storing data.

---

# Constructor

## WHAT is a Constructor?

A **Constructor is a special member of a class used to initialize an object when it is created**.

Example:

```java
class User {

    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Creating an object:

```java
User user1 = new User("John", 25);
```

Here:

```text
new User("John", 25)
        ↓
Constructor executes
        ↓
Object is initialized
```

> Constructors will be studied in detail later. Here, understand only their basic role in object creation and initialization.

---

# Why Did OOP Become Popular?

As software systems became larger and more complex, managing everything as separate functions became increasingly difficult.

Common problems included:

```text
Code Duplication
      ↓
Poor Reusability
      ↓
Difficult Maintenance
      ↓
Difficult Scaling
```

OOP introduced a structured way to organize related data and behavior using:

- Classes
- Objects
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

These concepts help developers structure large software systems.

---

# Four Main Principles of OOP

The four commonly taught pillars of OOP are:

```text
        OOP
         │
  ┌──────┼────────┬──────────┐
  │      │        │          │
Encap-  Abstrac- Inheri-   Polymor-
sulation  tion    tance     phism
```

These concepts are fundamental to Java and will be studied in detail separately.

---

# OOP in a Real Application

Consider a food-ordering application.

Instead of thinking only about functions:

```text
orderFood()
makePayment()
setReminder()
```

we can model the system around objects.

### User

```text
State:
    name
    age

Behavior:
    orderFood()
    setReminder()
```

### Order

```text
State:
    orderId
    items
    amount

Behavior:
    calculateTotal()
    confirmOrder()
```

### Payment

```text
State:
    amount
    paymentStatus

Behavior:
    makePayment()
    verifyPayment()
```

Now the application can be designed around interacting objects.

```text
User
 │
 ├── Order Food
 │       ↓
 │     Order
 │       ↓
 │    Payment
 │
 └── Set Reminder
```

---

# Important Clarification

A beginner-friendly explanation often says:

> "Everything in OOP is represented as an object."

This is useful as a mental model, but it should **not be taken literally for Java**.

Java has primitive data types such as:

```java
int
double
char
boolean
```

which are not objects.

A more accurate statement is:

> **OOP organizes software around objects that contain state and behavior.**

---

# When Should You Think in Terms of OOP?

OOP is particularly useful when the software contains many entities that have:

- Their own data
- Their own behavior
- Relationships with other entities
- Different instances of the same type

For example:

```text
Banking System
    ↓
Customer
Account
Transaction
Payment
Loan
```

or:

```text
E-Commerce System
    ↓
User
Product
Cart
Order
Payment
```

or:

```text
College System
    ↓
Student
Teacher
Course
Department
Result
```

These entities naturally map to classes and objects.

---

# Advantages of OOP

OOP can provide:

### Reusability

Classes and existing behavior can be reused.

### Maintainability

Related data and behavior can be organized together.

### Modularity

A large application can be divided into smaller classes and components.

### Scalability

Well-structured object-based designs can make large systems easier to extend.

### Data Control

Encapsulation allows controlled access to internal data.

### Real-World Modeling

Objects can represent concepts such as:

```text
User
Account
Order
Vehicle
Student
Employee
```

---

# Limitations / Things to Consider

OOP is powerful, but it is not automatically the best solution for every problem.

Possible disadvantages include:

- More classes and structure can add complexity
- Small programs may not need a large object model
- Poorly designed class relationships can make a system difficult to understand
- Excessive use of inheritance can create complicated dependencies

The goal is not to use as many classes as possible.

The goal is to create a **clear and maintainable design**.

---

# Final Summary

Object-Oriented Programming is a programming paradigm that organizes software around **objects**.

An object combines:

```text
State + Behavior
```

A **Class** acts as the blueprint from which objects are created.

```text
Class      → Blueprint
Object     → Instance
State      → Data
Behavior   → Methods
Constructor→ Initializes Object
```

OOP became widely used for large and complex software because it provides a structured way to organize, reuse, maintain, and extend software.

Its four fundamental principles are:

```text
Encapsulation
Abstraction
Inheritance
Polymorphism
```