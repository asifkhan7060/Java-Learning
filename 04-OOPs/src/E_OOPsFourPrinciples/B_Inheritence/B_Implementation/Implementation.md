# INHERITANCE IN JAVA

## Study : Inheritance (Second Pillar of OOP)

---

# What is Inheritance?

Inheritance is one of the four pillars of Object-Oriented Programming (OOP).

Inheritance allows one class to acquire the properties and methods of another class.

This promotes:

```text
Code Reusability
+
Extensibility
+
Maintainability
```

---

## Simple Definition

> Inheritance is the mechanism through which one class acquires the properties and behaviors of another class.

---

# Why Do We Need Inheritance?

Suppose we have:

```text
Car
Bike
Truck
Bus
```

All of them have common properties:

```text
brand
speed
```

and common behaviors:

```text
display()
start()
stop()
```

Without Inheritance, we would write the same code repeatedly in every class.

---

Example:

```java
class Car {
    String brand;
    int speed;
}
```

```java
class Bike {
    String brand;
    int speed;
}
```

```java
class Truck {
    String brand;
    int speed;
}
```

Code duplication increases.

---

Inheritance solves this problem.

Common code is placed inside a Parent Class.

Child Classes reuse it.

---

# Real Life Example

```text
          Vehicle
             ▲
             │
      ┌──────┴──────┐
      │             │
     Car          Bike
```

Vehicle contains:

```text
brand
speed
display()
```

Car and Bike automatically inherit them.

---

# Parent Class and Child Class

## Parent Class

Also called:

```text
Superclass
Base Class
```

Example:

```java
public class Vehicle {

}
```

---

## Child Class

Also called:

```text
Subclass
Derived Class
```

Example:

```java
public class Car extends Vehicle {

}
```

---

# extends Keyword

Inheritance is achieved using:

```java
extends
```

---

Example:

```java
public class Car extends Vehicle {

}
```

Meaning:

```text
Car IS-A Vehicle
```

---

Similarly:

```java
public class Bike extends Vehicle {

}
```

Meaning:

```text
Bike IS-A Vehicle
```

---

# Understanding Your Parent Class

## Vehicle Class

```java
public class Vehicle {
```

This is the Parent Class.

---

## Properties

```java
private String brand;

private int speed;
```

These variables belong to Vehicle.

---

Important:

Because they are declared as:

```java
private
```

they cannot be accessed directly by Child Classes.

---

# Parent Constructor

Your Code:

```java
public Vehicle(
        String brand,
        int speed) {

    this.brand = brand;
    this.speed = speed;
}
```

Purpose:

```text
Initialize Parent Properties
```

---

# Common Behavior

```java
public void display() {

    System.out.println(
        "Brand: " + brand +
        " Speed: " + speed
    );
}
```

This method becomes available to all Child Classes.

---

# Understanding Car Class

Your Code:

```java
public class Car extends Vehicle {
```

Meaning:

```text
Car inherits Vehicle
```

---

Car automatically gets:

```text
getBrand()
setBrand()

getSpeed()
setSpeed()

display()
```

without rewriting them.

---

# Car Specific Property

```java
private int doors;
```

This property belongs only to Car.

Vehicle does not have it.

---

Example:

```text
Vehicle
    │
    ├── brand
    └── speed

Car
    │
    └── doors
```

---

# Constructor in Child Class

Your Code:

```java
public Car(
        String brand,
        int speed,
        int doors) {
```

---

# Why super() is Required?

Your Parent Class has:

```java
public Vehicle(
        String brand,
        int speed)
```

Therefore Vehicle must be initialized first.

---

Your Code:

```java
super(brand, speed);
```

This calls:

```java
Vehicle(
        brand,
        speed
);
```

---

Execution Flow:

```text
Create Car Object
        │
        ▼
Call Vehicle Constructor
        │
        ▼
Initialize brand
Initialize speed
        │
        ▼
Return To Car Constructor
        │
        ▼
Initialize doors
```

---

# Why Not This?

Many beginners ask:

```java
this.brand = brand;

this.speed = speed;
```

Why not use this?

---

Answer:

Because:

```java
brand
```

and

```java
speed
```

belong to Vehicle.

---

And Vehicle declares them as:

```java
private
```

---

Private members cannot be accessed directly by Child Classes.

Therefore:

```java
this.brand = brand;
```

❌ Not Allowed

---

```java
this.speed = speed;
```

❌ Not Allowed

---

Instead:

```java
super(
    brand,
    speed
);
```

asks the Parent Class to initialize its own data.

---

# What is super?

super refers to the immediate Parent Class.

---

super can be used to:

### Call Parent Constructor

```java
super(brand, speed);
```

---

### Call Parent Method

```java
super.display();
```

---

### Access Parent Variables

(if accessible)

```java
super.variableName
```

---

# Method Overriding

Your Code:

```java
@Override
public void display() {
```

---

The Parent Class already contains:

```java
display()
```

---

Car creates the same method again.

This is called:

```text
Method Overriding
```

---

## Definition

> Method Overriding occurs when a Child Class provides its own implementation of a method already present in the Parent Class.

---

# Understanding @Override

Your Code:

```java
@Override
public void display()
```

---

Purpose:

```text
Improves Readability
+
Compiler Verification
```

---

If the method signature is incorrect:

```java
public void display(int x)
```

Compiler reports an error.

---

# Understanding super.display()

Your Code:

```java
super.display();
```

---

This executes Parent Class logic first.

---

Parent Output:

```text
Brand: Mercedes Speed: 800
```

---

After that:

```java
System.out.println(
    ...
);
```

runs.

---

Output:

```text
Brand: Mercedes Speed: 800
Brand: Mercedes Speed: 800 km/hr 5 door
```

---

# Accessing Parent Data

Your Code:

```java
getBrand()

getSpeed()
```

---

Why use these?

Because:

```java
brand
```

and

```java
speed
```

are private.

---

Direct access:

```java
brand
```

❌ Not Allowed

---

```java
speed
```

❌ Not Allowed

---

Getter Methods:

```java
getBrand()
```

✔ Allowed

---

```java
getSpeed()
```

✔ Allowed

---

# Understanding Bike Class

Your Code:

```java
public class Bike
extends Vehicle
```

Bike also inherits Vehicle.

---

## Bike Specific Property

```java
private boolean hasCarrier;
```

This belongs only to Bike.

---

Constructor:

```java
super(
        brand,
        speed
);
```

initializes Vehicle data.

---

Additional Property:

```java
this.hasCarrier = hasCarrier;
```

initializes Bike specific data.

---

# Getter and Setter in Bike

Getter:

```java
public boolean isHasCarrier() {
    return hasCarrier;
}
```

---

Setter:

```java
public void setHasCarrier(
        boolean hasCarrier) {

    this.hasCarrier = hasCarrier;
}
```

---

# Understanding Main Program

## Car Object

```java
Car c1 =
new Car(
        "Mercedes",
        800,
        5
);
```

---

Memory:

```text
brand = Mercedes
speed = 800
doors = 5
```

---

Calling:

```java
c1.display();
```

Output:

```text
Brand: Mercedes Speed: 800
Brand: Mercedes Speed: 800 km/hr 5 door
```

---

# Bike Object

```java
Bike b1 =
new Bike(
        "Yamaha",
        120,
        true
);
```

---

Memory:

```text
brand = Yamaha
speed = 120
hasCarrier = true
```

---

Calling:

```java
b1.display();
```

Bike does not override display().

---

Therefore:

```text
Vehicle.display()
```

executes.

---

Output:

```text
Brand: Yamaha Speed: 120
```

---

# Inheritance Flow

```text
          Vehicle
          /     \
         /       \
       Car      Bike
```

---

Vehicle Provides:

```text
brand
speed

getBrand()
getSpeed()

setBrand()
setSpeed()

display()
```

---

Car Adds:

```text
doors

display() [Overridden]
```

---

Bike Adds:

```text
hasCarrier
```

---

# Types of Inheritance in Java

## Single Inheritance

```text
Vehicle
   ▲
   │
  Car
```

✔ Supported

---

## Multilevel Inheritance

```text
Vehicle
   ▲
   │
  Car
   ▲
   │
SportsCar
```

✔ Supported

---

## Hierarchical Inheritance

```text
        Vehicle
       /      \
      /        \
    Car       Bike
```

✔ Supported

---

## Multiple Inheritance Using Classes

```java
class Car
extends Vehicle, Engine
```

❌ Not Supported

---

Reason:

```text
Diamond Problem
```

---

## Multiple Inheritance Using Interfaces

```java
class Car
implements A, B
```

✔ Supported

---

# Benefits of Inheritance

## Code Reusability

Reuse Parent code.

---

## Less Duplication

Write common code once.

---

## Easier Maintenance

Changes in Parent affect all Children.

---

## Extensibility

Child Classes can add new functionality.

---

## Supports Polymorphism

Inheritance is the foundation of:

```text
Method Overriding
Runtime Polymorphism
```

---

# Key Notes

```text
Inheritance
=
Code Reusability
```

---

```text
extends
=
Inheritance Keyword
```

---

```text
Parent Class
=
Superclass
```

---

```text
Child Class
=
Subclass
```

---

```text
super()
=
Call Parent Constructor
```

---

```text
super.display()
=
Call Parent Method
```

---

```text
Private Variables
Cannot Be Accessed
Directly By Child Class
```

---

```text
Method Overriding
=
Same Method
Different Implementation
```

---

# Quick Revision

```text
Vehicle
   ▲
   │
 Car
```

---

```text
Car IS-A Vehicle
```

---

```text
Bike IS-A Vehicle
```

---

```text
super()
=
Parent Constructor
```

---

```text
extends
=
Inheritance
```

---

```text
Override
=
Modify Parent Behavior
```

---

# Interview Questions

## Basic

1. What is Inheritance?
2. Why is Inheritance used?
3. What is a Parent Class?
4. What is a Child Class?
5. What does the extends keyword do?

## Intermediate

6. What is the purpose of super()?
7. Why can't Child Classes access private Parent variables directly?
8. What is Method Overriding?
9. What is the purpose of @Override?
10. What happens when a Parent Class has a parameterized constructor?

## Advanced

11. Explain the execution flow of super().
12. Why is `super(brand, speed)` used instead of `this.brand = brand`?
13. What is the IS-A relationship in Inheritance?
14. Explain Hierarchical Inheritance using your code.
15. How does Inheritance support Runtime Polymorphism?

---

# One-Line Definition

> Inheritance is the OOP mechanism through which a Child Class acquires the properties and behaviors of a Parent Class, enabling code reuse, extensibility, and maintainability.
