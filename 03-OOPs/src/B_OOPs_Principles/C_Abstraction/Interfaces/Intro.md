# INTERFACE IN JAVA

## Interfaces, Interface Polymorphism, Marker Interfaces, and Multiple Inheritance

---

# What is an Interface?

An interface is a Java reference type that defines a **contract** that implementing classes must follow.

It mainly defines:

```text
What a class must do
```

The implementing class defines:

```text
How it should be done
```

### Simple Definition

> An interface is a contract that specifies behavior that implementing classes must provide.

---

# Why Use Interfaces?

Interfaces allow different classes to follow the same set of rules while providing their own implementations.

```text
One Contract
      ↓
Different Implementations
```

This is useful for:

```text
Standardization
Loose Coupling
Flexibility
Extensibility
Polymorphism
```

---

# Basic Syntax

```java
interface CarControls {

    void turnRight();
    void turnLeft();
    void applyBrakes();
}
```

A class follows the interface contract using `implements`:

```java
class ElectricCar implements CarControls {

    @Override
    public void turnRight() {
        System.out.println("Electric Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric Left");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Electric Brake");
    }
}
```

---

# Important Rules of an Interface

## Cannot Be Instantiated

An interface cannot be used to create an object directly.

```java
CarControls car = new CarControls();   // ❌ Not allowed
```

But an interface reference can refer to an implementing class object:

```java
CarControls car = new ElectricCar();   // ✅
```

---

## Cannot Have Constructors

Interfaces cannot have constructors because an interface is not instantiated directly.

---

## No Instance Variables

An interface does not contain object-specific instance state.

It can contain interface fields, which are automatically:

```text
public
static
final
```

Example:

```java
interface Vehicle {

    int MAX_SPEED = 200;
}
```

This is treated as:

```java
public static final int MAX_SPEED = 200;
```

Therefore it is a constant and can be accessed using:

```java
Vehicle.MAX_SPEED
```

---

# What Can an Interface Define?

An interface can define:

```text
Constants
Abstract Methods
Default Methods
Static Methods
Private Methods
Nested Classes / Interfaces
```

Example:

```java
interface Vehicle {

    int MAX_SPEED = 200;

    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }

    static void info() {
        System.out.println("Vehicle interface");
    }

    private void check() {
        System.out.println("Checking...");
    }
}
```

---

# Abstract Methods in an Interface

In the basic form, a method declared in an interface without a body is an **abstract method**.

```java
interface Vehicle {

    void start();
}
```

This is implicitly:

```java
public abstract void start();
```

The implementing class must provide its implementation:

```java
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }
}
```

The interface defines the required behavior, while the class defines the implementation.

---

# Implementing an Interface

A class uses the `implements` keyword to follow an interface contract.

```java
interface Engine {

    void startEngine();
}

class Car implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }
}
```

If a class does not implement all required abstract methods, it must also be declared `abstract`.

---

# Same Contract, Different Behavior

Different classes can implement the same interface in different ways.

```java
interface CarControls {

    void turnLeft();
}
```

```java
class ElectricCar implements CarControls {

    @Override
    public void turnLeft() {
        System.out.println("Electric Left");
    }
}
```

```java
class SportsCar implements CarControls {

    @Override
    public void turnLeft() {
        System.out.println("Sports Left");
    }
}
```

The contract is the same:

```text
CarControls
```

But the behavior is different:

```text
ElectricCar → Electric-specific behavior
SportsCar   → Sports-specific behavior
```

---

# Interface Reference

An interface reference can refer to an object of any class that implements that interface.

```java
CarControls car = new ElectricCar();
```

Here:

```text
Reference Type → CarControls
Actual Object  → ElectricCar
```

Only members available through the interface reference can be accessed.

---

# Interface Polymorphism

The same interface reference can be reused for different implementing class objects.

```java
CarControls car = new ElectricCar();
car.turnLeft();

car = new SportsCar();
car.turnLeft();
```

The reference type remains:

```text
CarControls
```

while the actual object changes:

```text
ElectricCar
SportsCar
```

At runtime, the overridden method of the actual object executes.

```text
CarControls reference
        │
        ├──> ElectricCar object
        │       └── turnLeft() → ElectricCar implementation
        │
        └──> SportsCar object
                └── turnLeft() → SportsCar implementation
```

This allows one common interface reference to work with multiple implementations.

---

# Default Methods

A `default` method contains an implementation inside the interface.

```java
interface CarControls {

    default void accelerate() {
        System.out.println("Generally not used");
    }
}
```

An implementing class can:

```text
Use the default implementation
or
Override it with its own implementation
```

Default methods were introduced in Java 8.

### Default Method with Interface Polymorphism

If the implementing class does not override the default method:

```java
CarControls car = new SportsCar();
car.accelerate();
```

the interface's default implementation is used.

```text
SportsCar does not override accelerate()
                 ↓
Interface default accelerate() executes
```

---

# Static Methods

An interface can contain static methods with implementation.

```java
interface Vehicle {

    static void info() {
        System.out.println("Vehicle interface");
    }
}
```

Call it using the interface name:

```java
Vehicle.info();
```

---

# Private Methods

An interface can contain private methods with implementation.

```java
interface Vehicle {

    default void start() {
        check();
        System.out.println("Vehicle started");
    }

    private void check() {
        System.out.println("Checking vehicle...");
    }
}
```

Private interface methods are used internally by methods of the same interface.

---

# Interface Inheritance

An interface can extend another interface using `extends`.

```java
interface Vehicle {

    void start();
}

interface ElectricVehicle extends Vehicle {

    void charge();
}
```

A class implementing `ElectricVehicle` must provide the required methods from the interface hierarchy:

```java
class Tesla implements ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Vehicle started");
    }

    @Override
    public void charge() {
        System.out.println("Vehicle charging");
    }
}
```

An interface can also extend multiple interfaces:

```java
interface A {
}

interface B {
}

interface C extends A, B {
}
```

---

# Multiple Interfaces

A class can implement multiple interfaces.

```java
interface Engine {

    void startEngine();
}

interface Wheels {

    void rotate();
}

class Car implements Engine, Wheels {

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void rotate() {
        System.out.println("Wheels rotating");
    }
}
```

Here one class follows both contracts:

```text
Engine ──┐
         ├──> Car
Wheels ──┘
```

This is how Java supports multiple inheritance through interfaces.

---

# Why Java Does Not Support Multiple Inheritance Using Classes

Java does not allow:

```java
class SportsCar extends Vehicle, Machine {
}
```

Suppose both parent classes define the same method:

```text
Vehicle → start()
Machine → start()
       \   /
      SportsCar
```

There would be ambiguity about which implementation should be inherited.

This is commonly called the **Diamond Problem**.

Therefore, Java does not support multiple inheritance through classes.

Instead, a class can implement multiple interfaces.

---

# Marker Interfaces

A **Marker Interface** is an interface that contains no methods or variables and is used to mark a class with a special capability or meaning.

### Simple Definition

> Marker Interface = An empty interface used to mark a class for a special purpose.

Example:

```java
public interface Serializable {
}
```

A class can implement it:

```java
class SportsCar implements Serializable {
}
```

The interface itself does not define behavior. It acts as a marker or metadata that can be recognized by Java or related APIs.

---

# Normal Interface vs Marker Interface

### Normal Interface

A normal interface is used to define behavior.

```java
interface CarControls {

    void turnLeft();
    void turnRight();
    void accelerate();
    void applyBrakes();
}
```

The implementing class must provide the required behavior.

### Marker Interface

A marker interface does not define methods that the class needs to implement.

```java
interface Serializable {
}
```

It only marks the class with a special capability or meaning.

---

# Serialization and Deserialization

`Serializable` is a common example of a marker interface.

## Serialization

Serialization is the process of converting an object into a stream of bytes.

```text
Java Object
     ↓
Serialization
     ↓
Byte Stream
     ↓
File / Network / Database
```

## Deserialization

Deserialization is the reverse process:

```text
Byte Stream
     ↓
Deserialization
     ↓
Java Object
```

---

# Common Marker Interfaces

Examples include:

```text
Serializable
Cloneable
Remote
```

They indicate a particular capability or meaning to Java or related APIs.

---

# Marker Interface with Multiple Interfaces

A class can implement a normal interface and a marker interface together:

```java
public class SportsCar
        implements CarControls, Serializable {

}
```

Here:

```text
CarControls
→ Defines behavior requirements

Serializable
→ Marks the class for serialization
```

So one class can receive both:

```text
Behavior Contract
+
Special Capability
```

---

# Important Practical Rules

```text
Interface
→ Cannot be instantiated directly
→ Cannot have constructors
→ Does not have instance variables
→ Interface fields are public, static, and final
```

```text
Interface Methods
→ Abstract methods
→ Default methods
→ Static methods
→ Private methods
```

```text
implements
→ Used when a class implements an interface
```

```text
extends
→ Used when an interface extends another interface
```

```text
Interface Reference
→ Can refer to an implementing class object
→ Supports runtime polymorphism
```

```text
Multiple Interfaces
→ One class can implement multiple interfaces
```

```text
Marker Interface
→ Empty interface used to mark a class with a special capability or meaning
```

---

# Key Points

```text
Interface
→ Defines a contract
→ Specifies required behavior
→ Implementing classes provide the implementation
```

```text
Same Interface
→ Different classes can provide different behavior
```

```text
Interface Reference
→ Can refer to different implementing objects
→ Enables runtime polymorphism
```

```text
Multiple Inheritance
→ Not supported through classes
→ Supported through multiple interfaces
```

```text
Marker Interface
→ No methods
→ No variables
→ Used for special capability or metadata
```

---

# One-Line Definition

> An interface is a Java reference type that defines a contract of behavior which implementing classes must follow.
