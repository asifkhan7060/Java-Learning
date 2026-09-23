# POLYMORPHISM IN JAVA (RUN TIME POLYMORPHISM)

## Study : Method Overriding

---

# What is Run Time Polymorphism?

Run Time Polymorphism is achieved through:

```text
Method Overriding
```

In this type of polymorphism, the method to execute is determined during program execution (runtime), not during compilation.

---

## Simple Definition

> Run Time Polymorphism occurs when a Child Class provides its own implementation of a method already present in the Parent Class, and Java decides which version to execute during runtime.

---

# Compile Time vs Run Time Polymorphism

| Feature              | Compile Time       | Run Time          |
| -------------------- | ------------------ | ----------------- |
| Achieved Using       | Method Overloading | Method Overriding |
| Decision Taken       | During Compilation | During Execution  |
| Binding              | Early Binding      | Late Binding      |
| Inheritance Required | ❌ No               | ✔ Yes             |
| Example              | add() methods      | start() method    |

---

# Understanding Your Class Structure

```text
                 Vehicle
                    ▲
              ┌─────┴─────┐
              │           │
             Car        Bike
```

---

Vehicle is the Parent Class.

Car and Bike are Child Classes.

Both inherit:

```text
brand
speed

getBrand()
getSpeed()

display()
start()
```

from Vehicle.

---

# Understanding Parent Class

## Vehicle Class

```java
public class Vehicle
```

Parent Class.

---

## Properties

```java
private String brand;

private int speed;
```

These variables belong to Vehicle.

Because they are private:

```text
Child Classes Cannot Access Them Directly
```

---

## Constructor

```java
public Vehicle(
        String brand,
        int speed)
```

Used to initialize:

```text
brand
speed
```

---

## start() Method

```java
public void start() {
    System.out.println(
        "Starting Vehicle..."
    );
}
```

Default implementation.

All Child Classes inherit this method.

---

## display() Method

```java
public void display() {
```

Common behavior available to all Child Classes.

---

# Understanding Car Class

```java
public class Car
extends Vehicle
```

Meaning:

```text
Car IS-A Vehicle
```

---

## Additional Property

```java
private int doors;
```

Specific to Car.

---

## Constructor

```java
super(
        brand,
        speed
);
```

Calls Parent Constructor.

---

# Method Overriding in Car

Your Code:

```java
@Override
public void display()
```

---

Parent already has:

```java
display()
```

Car creates the same method again.

This is called:

```text
Method Overriding
```

---

## Definition

> Method Overriding occurs when a Child Class provides its own implementation of a Parent Class method using the same method signature.

---

# Understanding super.display()

Your Code:

```java
super.display();
```

Purpose:

```text
Execute Parent Logic First
```

---

Parent Output:

```text
Brand: Mercedes Speed: 800
```

---

Then Child Logic Executes:

```java
System.out.println(
        ...
);
```

---

Output:

```text
Brand: Mercedes Speed: 800

Brand: Mercedes Speed: 800 km/hr 5 door
```

---

# Why getBrand() and getSpeed()?

Many beginners ask:

```java
brand
```

Why not directly?

---

Because:

```java
private String brand;
private int speed;
```

are private.

---

Private members belong only to Vehicle.

---

Therefore:

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

Use:

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

```java
public class Bike
extends Vehicle
```

Bike also inherits Vehicle.

---

## Additional Property

```java
private boolean hasCarrier;
```

Bike-specific property.

---

# Constructor Execution Flow

Your Code:

```java
public Bike(...)
{
    super(...);

    this.hasCarrier = hasCarrier;

    System.out.println(...);
}
```

---

Many students think:

```text
Bike Constructor Executes First
```

Wrong.

---

Actual Flow:

```text
Bike Object Creation
        │
        ▼
Vehicle Constructor Executes
        │
        ▼
Vehicle Initialized
        │
        ▼
Returns To Bike Constructor
        │
        ▼
Bike Initialization
        │
        ▼
System.out.println()
```

---

# Important Rule

```java
super(...)
```

must be the first statement inside a constructor.

---

Not Allowed:

```java
System.out.println();

super(...);
```

❌ Compilation Error

---

# Method Overriding in Bike

Your Code:

```java
@Override
public void start()
```

---

Parent Method:

```java
public void start()
```

---

Bike provides its own version.

---

Output:

```text
Starting Bike....
```

instead of

```text
Starting Vehicle...
```

---

# What Makes This Runtime Polymorphism?

Suppose:

```java
Vehicle v3 =
new Bike(
        "Splender",
        700,
        false
);
```

---

Observe carefully:

Reference Type:

```java
Vehicle
```

Object Type:

```java
Bike
```

---

This is called:

```text
Upcasting
```

---

Diagram:

```text
Vehicle v3
      │
      ▼
   Bike Object
```

---

# Method Call

```java
v3.start();
```

Question:

Which method should run?

```text
Vehicle.start()
```

OR

```text
Bike.start()
```

---

Java waits until runtime.

Then checks:

```text
Actual Object Type
```

---

Actual Object:

```text
Bike
```

---

Therefore:

```java
Bike.start()
```

executes.

---

Output:

```text
Starting Bike....
```

---

This is:

```text
Run Time Polymorphism
```

---

# Most Important Example

## Example 1

```java
Vehicle v1 =
new Vehicle(
        "Maruti",
        400
);
```

---

Object Type:

```text
Vehicle
```

---

Call:

```java
v1.start();
```

Output:

```text
Starting Vehicle...
```

---

# Example 2

```java
Vehicle v2 =
new Car(
        "Jaguar",
        700,
        6
);
```

---

Reference Type:

```text
Vehicle
```

Object Type:

```text
Car
```

---

Call:

```java
v2.start();
```

---

Output:

```text
Starting Vehicle...
```

---

Why?

Because:

```text
Car Does NOT Override start()
```

---

Java looks inside Car:

```text
start() ?
```

No.

---

Then Java moves to Parent:

```text
Vehicle.start()
```

Found.

---

Therefore:

```text
Starting Vehicle...
```

prints.

---

# Example 3

```java
Vehicle v3 =
new Bike(
        "Splender",
        700,
        false
);
```

---

Reference Type:

```text
Vehicle
```

Object Type:

```text
Bike
```

---

Call:

```java
v3.start();
```

---

Java checks:

```text
Does Bike Override start()?
```

YES.

---

Therefore:

```java
Bike.start()
```

executes.

---

Output:

```text
Starting Bike....
```

---

# Most Important Rule

Runtime Polymorphism depends on:

```text
Object Type
```

NOT

```text
Reference Type
```

---

Example:

```java
Vehicle obj =
new Bike(...);
```

---

Reference:

```text
Vehicle
```

---

Actual Object:

```text
Bike
```

---

Method Executed:

```text
Bike Version
```

if overridden.

---

# Understanding v2.display()

Your Code:

```java
Vehicle v2 =
new Car(
        "Jaguar",
        700,
        6
);
```

```java
v2.display();
```

---

Question:

Vehicle display?

OR

Car display?

---

Answer:

```text
Car display()
```

---

Why?

Because:

```java
display()
```

is overridden in Car.

---

Runtime checks:

```text
Actual Object Type
```

which is:

```text
Car
```

---

Therefore:

```java
Car.display()
```

executes.

---

# Runtime Method Resolution Flow

```text
Vehicle v =
new Bike();

v.start();

        │
        ▼
Reference Type = Vehicle
        │
        ▼
Actual Object = Bike
        │
        ▼
Does Bike Override start() ?
        │
       YES
        │
        ▼
Execute Bike.start()
```

---

# Method Overriding Rules

### Same Method Name

✔ Required

---

### Same Parameters

✔ Required

---

### Same Return Type

✔ Recommended

---

### Inheritance Required

✔ Required

---

### Access Modifier Cannot Be More Restrictive

Valid:

```java
public
```

→

```java
public
```

---

Invalid:

```java
public
```

→

```java
private
```

❌

---

# Benefits of Runtime Polymorphism

## Flexibility

Same reference can point to different objects.

---

## Extensibility

New Child Classes can be added easily.

---

## Loose Coupling

Code depends on Parent Type.

---

## Dynamic Behavior

Behavior changes according to actual object.

---

# Real Life Example

Think of:

```text
Vehicle vehicle
```

---

Vehicle may become:

```text
Car
Bike
Truck
Bus
```

---

When:

```text
Start Vehicle
```

is called,

each vehicle can start differently.

---

This is Runtime Polymorphism.

---

# Key Notes

```text
Run Time Polymorphism
=
Method Overriding
```

---

```text
Inheritance
Required
```

---

```text
Decision Taken
At Runtime
```

---

```text
Object Type
Matters
```

---

```text
Reference Type
Does NOT Decide
Overridden Method
```

---

```text
Bike Overrides start()
```

Therefore:

```text
Bike.start()
```

runs.

---

```text
Car Does Not Override start()
```

Therefore:

```text
Vehicle.start()
```

runs.

---

# Quick Revision

```text
Method Overriding
=
Same Method
Same Parameters
Different Implementation
```

---

```text
Vehicle v =
new Bike();
```

---

```text
v.start();
```

---

```text
Bike.start()
```

Executes.

---

```text
Runtime Checks
Actual Object
```

---

```text
Actual Object
Controls Behavior
```

---

# Interview Questions

## Basic

1. What is Runtime Polymorphism?
2. What is Method Overriding?
3. Why is Method Overriding called Runtime Polymorphism?
4. What is the purpose of @Override?
5. Why is inheritance required for Method Overriding?

## Intermediate

6. What is Upcasting?
7. What is the difference between reference type and object type?
8. Why does `Vehicle v = new Bike()` work?
9. How does Java decide which overridden method to execute?
10. What is the role of super.display()?

## Advanced

11. Why does `v2.start()` print "Starting Vehicle..."?
12. Why does `v3.start()` print "Starting Bike...."?
13. Explain Dynamic Method Dispatch.
14. What happens if a Child Class does not override a Parent method?
15. Explain runtime method resolution using your code example.

---

# One-Line Definition

> Runtime Polymorphism is achieved through Method Overriding, where Java determines which method implementation to execute during runtime based on the actual object type rather than the reference type.
