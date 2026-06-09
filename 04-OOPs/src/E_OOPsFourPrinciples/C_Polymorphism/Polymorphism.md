# POLYMORPHISM IN JAVA

## Study : Polymorphism

### 🔹 What is Polymorphism?

Polymorphism is one of the four pillars of Object Oriented Programming (OOP).

The word **Polymorphism** comes from:

* Poly = Many
* Morph = Forms

Therefore,

**Polymorphism means "One thing behaving in many forms."**

---

### 🔹 Simple Definition

Polymorphism allows the same method name to perform different actions depending on the situation.

---

### 🔹 Real Life Example

Consider a person.

The same person can behave differently depending on the role:

* Student in College
* Son at Home
* Friend with Friends

One Person → Multiple Behaviors

This is Polymorphism.

---

### 🔹 Why Do We Need Polymorphism?

Without Polymorphism, we may need to create many different method names for similar tasks.

Example:

```java
calculateAddition()
calculateSubtraction()
calculateMultiplication()
```

Instead, we can use the same method name with different implementations.

```java
calculate()
```

This makes code:

* More Flexible
* Easier to Read
* Easier to Maintain
* Easier to Extend

---

## 🔹 Types of Polymorphism

Java supports two types of Polymorphism:

### 1. Compile Time Polymorphism

### 2. Run Time Polymorphism

---

# 1. COMPILE TIME POLYMORPHISM

## 🔹 What is Compile Time Polymorphism?

Compile Time Polymorphism occurs when the method to execute is decided during compilation.

It is achieved using:

### Method Overloading

---

## 🔹 Method Overloading

Method Overloading means creating multiple methods with the same name but different parameters.

Example:

```java
add(int a, int b)

add(double a, double b)

add(int a, int b, int c)
```

The compiler decides which method should execute based on the arguments provided.

---

## 🔹 Rules of Method Overloading

Methods must have:

* Different number of parameters

OR

* Different type of parameters

OR

* Different order of parameter types

Examples:

```java
sum(int a, int b)

sum(double a, double b)

sum(int a, int b, int c)
```

Valid Overloading.

---

### Not Allowed

```java
sum(int a)

sum(int b)
```

Not Allowed.

Because Java only checks:

```java
sum(int)

sum(int)
```

Parameter names do not matter.

---

## 🔹 Why Called Compile Time Polymorphism?

Because the compiler determines which method to call before the program runs.

---

# 2. RUN TIME POLYMORPHISM

## 🔹 What is Run Time Polymorphism?

Run Time Polymorphism occurs when the method to execute is decided during program execution.

It is achieved using:

### Method Overriding

---

## 🔹 Method Overriding

Method Overriding means a Child Class provides its own implementation of a method that already exists in the Parent Class.

---

### Example

Parent Class:

```java
class Vehicle {

    public void start() {
        System.out.println("Vehicle Started");
    }
}
```

Child Class:

```java
class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started");
    }
}
```

The Child Class overrides the Parent Class method.

---

## 🔹 Why Called Run Time Polymorphism?

Because Java decides which overridden method to execute during runtime.

---

## 🔹 Difference Between Overloading and Overriding

| Method Overloading        | Method Overriding     |
| ------------------------- | --------------------- |
| Compile Time Polymorphism | Run Time Polymorphism |
| Same Class                | Parent & Child Class  |
| Same Method Name          | Same Method Name      |
| Different Parameters      | Same Parameters       |
| No Inheritance Required   | Inheritance Required  |

---

## 🔹 Polymorphism Flow

```text
Polymorphism
│
├── Compile Time Polymorphism
│      └── Method Overloading
│
└── Run Time Polymorphism
       └── Method Overriding
```

---

## 🔹 Summary

Polymorphism means:

**One Interface, Multiple Forms**

Java provides two types:

### Compile Time Polymorphism

* Method Overloading
* Decided by Compiler

### Run Time Polymorphism

* Method Overriding
* Decided During Execution

Polymorphism increases:

* Flexibility
* Reusability
* Maintainability

and is one of the most important concepts in Object Oriented Programming.
