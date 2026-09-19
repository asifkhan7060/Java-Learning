# INTRODUCTION TO OBJECT ORIENTED PROGRAMMING (OOP)

## Study : Introduction to OOP

---

# Evolution of Programming

Before understanding OOP, it is important to understand how programming evolved over time.

Programming mainly evolved through three major approaches:

1. Procedural Programming
2. Functional Programming
3. Object Oriented Programming (OOP)

```text
Procedural Programming
          ↓
Functional Programming
          ↓
Object Oriented Programming
```

---

# 1. Procedural Programming

Procedural Programming is a programming paradigm where a program is divided into functions or procedures.

The main focus is:

> How a task is performed step-by-step.

A large problem is broken into smaller functions and executed in sequence.

### Examples

* C
* BASIC

### Real Life Example

Making Tea:

```text
Step 1 → Boil Water
Step 2 → Add Tea Powder
Step 3 → Add Sugar
Step 4 → Add Milk
Step 5 → Serve Tea
```

Here we focus on the sequence of steps rather than the objects involved.

### Characteristics

* Function-Oriented
* Sequential Execution
* Easy for Small Programs
* Difficult to Manage Large Projects

### Limitation

As software becomes larger, managing hundreds of functions becomes difficult.

---

# 2. Functional Programming

Functional Programming is a paradigm based on mathematical functions.

The main focus is:

> What result should be produced.

Functions receive data and return new data.

### Examples

* Haskell
* Lisp
* Scala
* Java Streams & Lambdas

### Characteristics

* Functions are First-Class Citizens
* Functions can be passed as arguments
* Functions can return other functions
* Data is usually Immutable

### Real Life Example

```text
Marks
   ↓
Calculate Total
   ↓
Calculate Percentage
   ↓
Display Result
```

Each function transforms data and produces a result.

---

# 3. Object Oriented Programming (OOP)

Object Oriented Programming is a paradigm where programs are organized around Objects.

The main focus is:

> Who performs the task and what data belongs to it.

Unlike Procedural Programming, OOP combines:

```text
Data + Behavior
```

into a single unit called an Object.

### Examples

* Java
* C++
* C#
* Python

---

# What is OOP?

OOP (Object Oriented Programming System) is a programming paradigm where everything is represented in the form of Objects.

Instead of focusing only on functions and logic, OOP focuses on creating real-world entities and defining their properties and behaviors.

---

# Class and Object

## Class

A Class is a blueprint used to create Objects.

It defines:

* Properties (State)
* Behaviors (Methods)

Example:

```java
class User {
    String name;
    int age;

    void orderFood() {}
    void setReminder() {}
}
```

The class itself is only a blueprint.

---

## Object

An Object is an actual instance created from a Class.

Example:

```java
User user1 = new User();
User user2 = new User();
```

Here:

```text
user1 → Object
user2 → Object
```

Both are created from the same blueprint.

---

# Real Life Example

House Example:

```text
Blueprint → Class

Actual House → Object
```

Similarly:

```text
Class  → User

Objects →
John
Sam
Asif
```

Each object has its own data.

Example:

```text
User Class
------------
name
age
orderFood()
setReminder()

       ↓

John
name = John
age = 25

Sam
name = Sam
age = 22
```

The blueprint remains the same but data changes for each object.

---

# Why OOP Became Popular?

As software systems became larger and more complex:

Procedural Programming became difficult to maintain.

Problems included:

* Code Duplication
* Poor Reusability
* Difficult Maintenance
* Difficult Scalability

OOP introduced:

* Classes
* Objects
* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

which made software easier to:

* Design
* Reuse
* Maintain
* Scale

---

# Four Main Principles of OOP

## 1. Encapsulation

```text
Data Hiding + Controlled Access
```

Protects data using private variables and getters/setters.

---

## 2. Abstraction

```text
Hide Implementation
Show Essential Features
```

User focuses on what to do, not how it works internally.

---

## 3. Inheritance

```text
Acquire Properties and Behaviors
from another Class
```

Promotes Code Reusability.

---

## 4. Polymorphism

```text
One Interface
Multiple Forms
```

Allows the same method name to behave differently.

---

# Quick Comparison

| Feature                  | Procedural     | Functional           | OOP                |
| ------------------------ | -------------- | -------------------- | ------------------ |
| Focus                    | Steps          | Result               | Objects            |
| Main Unit                | Function       | Function             | Object             |
| Data + Behavior Together | ❌              | ❌                    | ✔                  |
| Reusability              | Limited        | Moderate             | High               |
| Best For                 | Small Programs | Data Transformations | Large Applications |

---

# Key Notes

### Remember

```text
Class = Blueprint

Object = Real Instance
```

---

```text
Object = State + Behavior

State    → Variables
Behavior → Methods
```

---

```text
Everything in OOP revolves around Objects.
```

---

# Interview Questions

## Basic

1. What is Object Oriented Programming?
2. What is the difference between Procedural Programming and OOP?
3. What is a Class?
4. What is an Object?
5. Why are Objects called instances of a Class?

## Intermediate

6. Explain the evolution from Procedural Programming to OOP.
7. What are the advantages of OOP over Procedural Programming?
8. What is the difference between a Class and an Object with examples?
9. Why is OOP suitable for large-scale applications?
10. Explain the relationship between State and Behavior.

## Advanced

11. Can a Class exist without Objects?
12. Can Objects exist without a Class?
13. Why did Procedural Programming become difficult for enterprise applications?
14. Explain OOP using a real-world example.
15. How do Classes improve maintainability and scalability?

---

# One-Line Definition

> OOP is a programming paradigm that organizes software around Objects, where each Object contains both data (properties) and behavior (methods).
