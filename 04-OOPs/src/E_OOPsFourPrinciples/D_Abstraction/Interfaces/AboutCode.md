# ABSTRACTION IN JAVA (INTERFACES)

## Study : Interfaces, Interface Polymorphism, Marker Interfaces, and Multiple Inheritance

---

# What is an Interface?

An Interface is a blueprint that defines:

```text
What a Class Must Do
```

but does not completely define:

```text
How It Should Do It
```

---

## Simple Definition

> An Interface is a contract that specifies a set of methods that implementing classes must provide.

---

# Real Life Example

Suppose Team B designs a car control system.

Team B decides every car must have:

```text
Turn Right
Turn Left
Apply Brakes
```

---

Team B creates:

```java
interface CarControls
```

---

Now Team A builds cars.

Examples:

```text
ElectricCar
SportsCar
```

---

Both cars must obey the contract.

---

Diagram:

```text
          Team B
      (CarControls)

      turnRight()
      turnLeft()
      applyBrakes()

             ▲
             │
     -----------------
     │               │

ElectricCar     SportsCar

          Team A
```

---

# Why Use Interfaces?

Without Interfaces:

```text
Every Developer
Creates Their Own Rules
```

---

With Interfaces:

```text
Everyone Follows
The Same Contract
```

---

Benefits:

```text
Standardization
Loose Coupling
Flexibility
Extensibility
Polymorphism
```

---

# Understanding Your Interface

## CarControls Interface

```java
public interface CarControls
```

---

This interface acts as a:

```text
Blueprint
Contract
Template
```

---

# Methods Declared

```java
void turnRight();
```

---

```java
void turnLeft();
```

---

```java
void applyBrakes();
```

---

These methods:

```text
Have Declaration
No Implementation
```

---

Meaning:

```text
Any Class Implementing
CarControls
Must Define These Methods
```

---

# Implementing an Interface

Interfaces use:

```java
implements
```

keyword.

---

Example:

```java
public class ElectricCar
implements CarControls
```

---

Meaning:

```text
ElectricCar Agrees
To Follow The Contract
```

---

# Understanding ElectricCar

Your Code:

```java
public class ElectricCar
implements CarControls
```

---

Java now forces:

```text
turnRight()
turnLeft()
applyBrakes()
```

to be implemented.

---

Your Implementation:

```java
@Override
public void turnRight() {
    System.out.println(
        "Electric Right"
    );
}
```

---

```java
@Override
public void turnLeft() {
    System.out.println(
        "Electric Left"
    );
}
```

---

```java
@Override
public void applyBrakes() {
    System.out.println(
        "Electric Brake"
    );
}
```

---

ElectricCar decides:

```text
How Electric Cars Behave
```

---

# Understanding SportsCar

Your Code:

```java
public class SportsCar
implements CarControls
```

---

SportsCar follows the same contract.

---

But implementation is different.

Example:

```java
@Override
public void turnRight() {
    System.out.println(
        "Sports Right"
    );
}
```

---

This demonstrates:

```text
Same Contract
Different Behavior
```

---

# Interface Methods Are Public

Important Rule:

Methods declared inside Interfaces are automatically:

```text
public
abstract
```

even if not written.

---

Example:

```java
void turnRight();
```

actually becomes:

```java
public abstract
void turnRight();
```

---

# Default Methods

Your Interface:

```java
default void accelerate()
```

---

This is a modern Java feature.

---

Before Java 8:

```text
Interfaces Could Only
Contain Abstract Methods
```

---

After Java 8:

```text
Interfaces Can Also
Contain Default Methods
```

---

Example:

```java
default void accelerate() {
    System.out.println(
        "Generally not used"
    );
}
```

---

This method already has implementation.

Implementing classes:

```text
May Use It
May Override It
```

---

# Interface vs Abstract Class

| Feature              | Interface           | Abstract Class |
| -------------------- | ------------------- | -------------- |
| Object Creation      | ❌ No                | ❌ No           |
| Constructor          | ❌ No                | ✔ Yes          |
| Instance Variables   | ❌ No                | ✔ Yes          |
| Abstract Methods     | ✔ Yes               | ✔ Yes          |
| Normal Methods       | Default/Static Only | ✔ Yes          |
| Multiple Inheritance | ✔ Yes               | ❌ No           |

---

# Can We Create Objects of Interface?

Not Allowed:

```java
CarControls car =
new CarControls();
```

❌ Error

---

Reason:

```text
Interface Is Incomplete
```

---

It only describes:

```text
What To Do
```

not

```text
How To Do It
```

---

# Interface Polymorphism

One of the most important concepts.

Your Code:

```java
CarControls myCar =
new ElectricCar();
```

---

Reference Type:

```text
CarControls
```

---

Object Type:

```text
ElectricCar
```

---

Diagram:

```text
CarControls myCar
         │
         ▼
    ElectricCar
```

---

# Method Call

```java
myCar.turnLeft();
```

Question:

Which method executes?

---

Answer:

```text
ElectricCar.turnLeft()
```

---

Output:

```text
Electric Left
```

---

Because Runtime Polymorphism checks:

```text
Actual Object Type
```

---

Actual Object:

```text
ElectricCar
```

---

# Another Example

Your Code:

```java
CarControls s2 =
new SportsCar();
```

---

Reference Type:

```text
CarControls
```

---

Object Type:

```text
SportsCar
```

---

Calling:

```java
s2.accelerate();
```

---

SportsCar does not override:

```java
accelerate()
```

---

Therefore Interface default method executes:

```java
default void accelerate()
```

---

Output:

```text
Generally not used
```

---

# Why Use Interface References?

Instead of:

```java
ElectricCar car
```

or

```java
SportsCar car
```

we use:

```java
CarControls car
```

---

Because:

```text
One Reference
Can Work With
Many Implementations
```

---

Example:

```java
CarControls car;
```

---

Later:

```java
car = new ElectricCar();
```

---

Later:

```java
car = new SportsCar();
```

---

Same reference.

Different implementations.

---

This is:

```text
Loose Coupling
+
Polymorphism
```

---

# Interface Polymorphism Diagram

```text
          CarControls
                ▲
                │
      -------------------
      │                 │

ElectricCar      SportsCar
```

---

Reference:

```java
CarControls ref;
```

can point to:

```java
new ElectricCar()
```

or

```java
new SportsCar()
```

---

# Relationship Between Interface and Abstraction

Interface provides:

```text
100% Contract
```

---

It focuses only on:

```text
What Should Be Done
```

---

Implementation classes focus on:

```text
How It Is Done
```

---

Therefore Interfaces are a powerful form of:

```text
Abstraction
```

---

# Marker Interfaces

## What is a Marker Interface?

A Marker Interface is an Interface containing:

```text
No Methods
No Variables
```

---

Example:

```java
public interface Serializable {

}
```

---

Completely empty.

---

# Purpose

Marker Interfaces provide:

```text
Metadata
```

to Java.

---

They mark a class with a special capability.

---

# Example

```java
public class SportsCar
implements Serializable
```

---

Java understands:

```text
This Object Can Be Serialized
```

---

No methods required.

---

# What is Serialization?

Serialization converts:

```text
Java Object
        │
        ▼
Byte Stream
```

---

Used for:

```text
Files
Databases
Networking
APIs
```

---

# Serialization Flow

```text
Java Object
      │
      ▼
Serialization
      │
      ▼
Byte Stream
      │
      ▼
File / Network
```

---

# Deserialization

Reverse Process:

```text
Byte Stream
      │
      ▼
Deserialization
      │
      ▼
Java Object
```

---

# Common Marker Interfaces

## Serializable

```java
implements Serializable
```

Object can be serialized.

---

## Cloneable

```java
implements Cloneable
```

Object can be cloned.

---

## Remote

```java
implements Remote
```

Used in Java RMI.

---

# Multiple Inheritance

## What is Multiple Inheritance?

Multiple Inheritance means:

```text
One Child
Multiple Parents
```

---

Example:

```text
Parent A
    ▲
    │
 Child
    │
    ▼
Parent B
```

---

# Multiple Inheritance Using Classes

Not Allowed:

```java
class SportsCar
extends Vehicle, Machine
```

❌ Error

---

# Why Not Allowed?

Because of:

```text
Diamond Problem
```

---

Example:

```text
      Vehicle
         ▲
         │

      SportsCar

         │
         ▼

      Machine
```

---

Suppose both contain:

```java
start();
```

---

Java cannot decide:

```text
Vehicle.start()
```

OR

```text
Machine.start()
```

---

This ambiguity is called:

```text
Diamond Problem
```

---

Therefore:

```text
Java Does Not Support
Multiple Inheritance
Using Classes
```

---

# Multiple Inheritance Using Interfaces

Allowed.

---

Example:

```java
class SportsCar
implements CarControls,
           Serializable
```

---

SportsCar gets:

```text
Behavior Contract
+
Serialization Capability
```

---

Diagram:

```text
       CarControls

             ▲
             │

SportsCar ───┼─── Serializable

             │
             ▼

         SportsCar
```

---

# Why Interfaces Allow It?

Interfaces mostly define:

```text
Behavior Contracts
```

not object state.

---

Therefore ambiguity is greatly reduced.

---

Java safely allows:

```java
implements A,
           B,
           C
```

---

# Practical Example

```java
public class SportsCar
implements CarControls,
           Serializable
```

---

CarControls Provides:

```text
turnLeft()
turnRight()
applyBrakes()
accelerate()
```

---

Serializable Provides:

```text
Serialization Capability
```

---

SportsCar gets both.

---

This is:

```text
Multiple Inheritance
Through Interfaces
```

---

# Execution Flow of Your Program

```text
Create ElectricCar
        │
        ▼
applyBrakes()
        │
        ▼
Electric Brake
        │
        ▼
turnLeft()
        │
        ▼
Electric Left
```

---

```text
CarControls ref
        │
        ▼
ElectricCar Object
        │
        ▼
turnLeft()
        │
        ▼
ElectricCar.turnLeft()
```

---

```text
CarControls ref
        │
        ▼
SportsCar Object
        │
        ▼
accelerate()
        │
        ▼
Default Interface Method
```

---

# Key Notes

```text
Interface
=
Contract
```

---

```text
implements
=
Interface Inheritance
```

---

```text
Interfaces
Cannot Create Objects
```

---

```text
Methods Are
public abstract
By Default
```

---

```text
Default Methods
Allowed Since Java 8
```

---

```text
Interface Reference
Can Store Child Objects
```

---

```text
Marker Interface
=
Empty Interface
```

---

```text
Serializable
=
Marker Interface
```

---

```text
Java Supports
Multiple Inheritance
Using Interfaces
```

---

# Quick Revision

```text
Interface
      │
      ▼
Contract
```

---

```text
CarControls
      ▲
      │
 ┌────┴────┐
 │         │

Electric  Sports
 Car       Car
```

---

```text
Interface Reference
+
Child Object
=
Runtime Polymorphism
```

---

```text
Marker Interface
      │
      ▼
Empty Interface
```

---

```text
Classes
      │
      ▼
No Multiple Inheritance
```

---

```text
Interfaces
      │
      ▼
Multiple Inheritance Allowed
```

---

# Interview Questions

## Basic

1. What is an Interface?
2. Why are Interfaces used?
3. What is the difference between an Interface and a Class?
4. Can we create objects of Interfaces?
5. What is the purpose of the implements keyword?

## Intermediate

6. What are default methods?
7. Why are Interface methods public and abstract by default?
8. What is Interface Polymorphism?
9. Why can `CarControls ref = new ElectricCar()` work?
10. What is the difference between an Abstract Class and an Interface?

## Advanced

11. What is a Marker Interface?
12. Explain Serializable Interface.
13. What is Serialization and Deserialization?
14. Why does Java not support Multiple Inheritance using Classes?
15. How do Interfaces solve the Multiple Inheritance problem?

---

# One-Line Definition

> An Interface is a contract that defines what a class must do, enabling abstraction, polymorphism, loose coupling, and multiple inheritance in Java.
