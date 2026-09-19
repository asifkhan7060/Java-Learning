# ABSTRACTION IN JAVA

## Study : Abstraction

### 🔹 What is Abstraction?

Abstraction is one of the four pillars of Object Oriented Programming (OOP).

Abstraction means:

**Showing only the essential details and hiding the internal implementation.**

The user only knows **what an object does**, not **how it does it**.

---

### 🔹 Simple Definition

**Abstraction = Hiding Implementation + Showing Functionality**

---

### 🔹 Real Life Example

Consider a Car.

When you drive a car, you use:

* Steering
* Brake
* Accelerator

You know:

```text
Press Accelerator → Car Moves
Press Brake       → Car Stops
```

But you do not know:

* Engine Combustion
* Fuel Injection
* Internal Gear Mechanics

The internal working is hidden.

This is Abstraction.

---

## 🔹 Why is Abstraction Needed?

Without Abstraction, users would need to understand every internal detail of a system.

Abstraction:

* Reduces Complexity
* Improves Security
* Improves Maintainability
* Allows Developers to Focus on Important Features

---

## 🔹 Types of Abstraction in Java

Java provides Abstraction using:

```text
Abstraction
│
├── Abstract Classes
│
└── Interfaces
```

---

# 1. ABSTRACT CLASS

## 🔹 What is an Abstract Class?

An Abstract Class is a class declared using the `abstract` keyword.

Example:

```java
abstract class Vehicle {
}
```

---

## 🔹 Characteristics of Abstract Classes

### ✔ Can Have Abstract Methods

```java
abstract void start();
```

---

### ✔ Can Have Normal Methods

```java
public void stop() {
    System.out.println("Vehicle Stopped");
}
```

---

### ✔ Can Have Variables

```java
String brand;
int speed;
```

---

### ✔ Can Have Constructors

```java
public Vehicle(String brand){
    this.brand = brand;
}
```

---

### ✘ Cannot Create Objects Directly

Not Allowed:

```java
Vehicle v = new Vehicle();
```

Because Vehicle is incomplete.

---

## 🔹 Abstract Method

An Abstract Method:

* Has no body
* Must be implemented by Child Classes

Example:

```java
abstract void start();
```

---

## 🔹 Example

```java
abstract class Vehicle {

    abstract void start();
}
```

Child Class:

```java
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Starting...");
    }
}
```

---

## 🔹 Bank Account Example

```text
BankAccount
      │
      ├── SavingsAccount
      │
      └── CurrentAccount
```

A generic BankAccount may define common rules.

Different account types implement those rules differently.

Therefore BankAccount can be abstract.

---

# 2. INTERFACE

## 🔹 What is an Interface?

An Interface is a contract that specifies what a class must do.

It focuses on:

```text
WHAT to do
```

and not

```text
HOW to do it
```

---

## 🔹 Real Life Meaning of Interface

Think of an Interface as a formal agreement.

Example:

```text
Team A creates a Robot.

Team B creates a Car.

Both teams agree that anything capable
of moving must implement:

start()
stop()
move()
```

This agreement is the Interface.

---

## 🔹 Example

Interface:

```java
interface Vehicle {

    void start();

    void stop();
}
```

Implementation:

```java
class Car implements Vehicle {

    public void start() {
        System.out.println("Car Starting");
    }

    public void stop() {
        System.out.println("Car Stopped");
    }
}
```

---

## 🔹 Why Interfaces?

Interfaces allow completely unrelated classes to follow the same contract.

Example:

```text
Car
Robot
Drone
Bike
```

All can implement:

```java
Vehicle
```

and provide their own implementations.

---

# 🔹 Abstract Class vs Interface

| Abstract Class                       | Interface                    |
| ------------------------------------ | ---------------------------- |
| Uses abstract keyword                | Uses interface keyword       |
| Can have abstract and normal methods | Primarily defines a contract |
| Can have constructors                | Cannot have constructors     |
| Supports inheritance                 | Supports implementation      |
| Child uses extends                   | Child uses implements        |

---

## 🔹 When to Use Abstract Class?

Use Abstract Class when:

* Classes share common properties
* Classes share common methods
* Some implementation should already exist

Example:

```text
Vehicle
   │
 ┌─┴─┐
Car Bike
```

All vehicles have:

* brand
* speed

Therefore Abstract Class is suitable.

---

## 🔹 When to Use Interface?

Use Interface when:

Different classes need to follow the same contract.

Example:

```text
Car
Robot
Drone
```

These classes are completely different.

But all can:

```java
start()
stop()
move()
```

Therefore Interface is suitable.

---

## 🔹 Key Difference

Abstract Class:

```text
IS-A Relationship
```

Example:

```text
Car IS-A Vehicle
```

---

Interface:

```text
CAN-DO Relationship
```

Example:

```text
Robot CAN Move
Drone CAN Fly
```

---

## 🔹 Summary

Abstraction means:

**Hide Implementation Details and Show Only Required Functionality**

Java achieves Abstraction using:

```text
1. Abstract Classes
2. Interfaces
```

### Abstract Class

* Uses abstract keyword
* Can contain abstract and normal methods
* Cannot be instantiated directly

### Interface

* Defines a contract
* Implemented using implements
* Helps unrelated classes follow the same behavior

Abstraction reduces complexity and allows developers to focus on what an object does rather than how it works internally.
