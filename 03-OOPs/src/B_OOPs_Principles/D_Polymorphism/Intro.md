# POLYMORPHISM IN JAVA

## Method Overloading and Method Overriding

---

# What is Polymorphism?

Polymorphism is one of the four pillars of Object-Oriented Programming (OOP).

The word **Polymorphism** comes from:

```text
Poly   = Many
Morph  = Forms
```

Meaning:

```text
One thing can exist in multiple forms.
```

In Java, the same method name or reference can work with different forms of behavior depending on the situation.

> **Polymorphism allows the same operation or method name to behave differently depending on the parameters provided or the actual object involved.**

---

# Types of Polymorphism in Java

Java mainly uses two forms of polymorphism:

| Type | Also Known As | Achieved Using | Decision Taken |
|---|---|---|---|
| **Compile-Time Polymorphism** | Static Polymorphism | Method Overloading | During compilation |
| **Run-Time Polymorphism** | Dynamic Polymorphism | Method Overriding | During execution |

---

# Compile-Time Polymorphism — Method Overloading

## What is Method Overloading?

Method Overloading means having **multiple methods with the same name but different parameter lists** within the same class.

```text
Same Method Name
+
Different Parameter List
```

The compiler determines which overloaded method matches the method call during compilation.

> **Method Overloading is a form of Compile-Time Polymorphism where multiple methods share the same name but differ in their parameter list.**

---

# Why Use Method Overloading?

Suppose a calculator needs to perform addition with different inputs.

Without overloading, we might create different method names:

```java
addTwoNumbers();
addThreeNumbers();
addDoubleNumbers();
```

With overloading, the same method name can be used:

```java
add(...);
```

Java chooses the matching overloaded method based on the arguments passed.

This keeps related operations under one meaningful method name.

---

# Rules of Method Overloading

Methods with the same name are considered overloaded when their **parameter list is different** in at least one of these ways:

### Different Number of Parameters

```java
add(int a, int b)
add(int a, int b, int c)
```

### Different Data Types of Parameters

```java
add(int a, int b)
add(double a, double b)
```

### Different Order of Parameter Data Types

```java
add(int a, double b)
add(double a, int b)
```

---

# Parameter List Matters

For method overloading, Java identifies methods using the method name and parameter types.

Parameter **names do not matter**.

Not allowed:

```java
public void add(int a)
public void add(int b)
```

Java treats both as:

```text
add(int)
```

Therefore, they are duplicate methods and cannot be overloaded.

---

# Return Type Alone Cannot Overload a Method

Changing only the return type does not create a valid overloaded method.

Not allowed:

```java
public int add(int a, int b)
public double add(int a, int b)
```

Both have the same parameter list:

```text
add(int, int)
```

Therefore, return type alone cannot distinguish overloaded methods.

> **Overloading is based on the parameter list, not on parameter names or return type.**

---

# Method Overloading Example

```java
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void add(int a, double b) {
        System.out.println(a + b);
    }

    public void add(double a, int b) {
        System.out.println(a + b);
    }
}
```

These methods are overloaded because their parameter lists are different:

```text
add(int, int)
add(int, int, int)
add(double, double)
add(int, double)
add(double, int)
```

---

# How Does Java Select an Overloaded Method?

The compiler checks the arguments used in the method call and finds the matching method.

### Number of Parameters

```java
calc.add(10, 20);
```

Matches:

```java
add(int, int)
```

```java
calc.add(10, 20, 30);
```

Matches:

```java
add(int, int, int)
```

### Data Types of Parameters

```java
calc.add(10.5, 20.5);
```

Matches:

```java
add(double, double)
```

### Order of Parameter Data Types

```java
calc.add(10, 20.5);
```

Matches:

```java
add(int, double)
```

While:

```java
calc.add(10.5, 20);
```

matches:

```java
add(double, int)
```

---

# Compile-Time Resolution

```text
Method Call
    │
    ▼
Compiler checks the arguments
    │
    ▼
Finds the matching overloaded method
    │
    ▼
Method is selected during compilation
```

Because the method selection happens at compile time, method overloading is called **Compile-Time Polymorphism**.

---

# Benefits of Method Overloading

### Better Readability

The same operation can use one meaningful method name.

### Code Reusability

There is no need to create separate method names for every input variation.

### Easier Maintenance

Related operations remain grouped under the same method name.

### Better API Design

Java APIs commonly use method overloading to support different types and numbers of arguments.

For example:

```java
System.out.println(...);
```

supports different argument types through overloaded methods.

---

# Run-Time Polymorphism — Method Overriding

## What is Method Overriding?

Method Overriding occurs when a Child Class provides its own implementation of a method already defined in the Parent Class, using the same method signature.

> **Method Overriding is a form of Run-Time Polymorphism where Java decides which overridden implementation to execute during program execution.**

---

# Method Overriding Requirements

For method overriding:

```text
Inheritance is required.
```

The child class provides a method with the same method name and parameter list as the inherited parent method.

The `@Override` annotation is recommended because it helps the compiler verify that the method is actually overriding a parent method.

Example:

```java
class Vehicle {

    public void start() {
        System.out.println("Starting Vehicle...");
    }
}

class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Starting Bike...");
    }
}
```

Here:

```text
Vehicle.start()
        ↓
Bike.start() overrides it
```

---

# Why Override a Method?

The parent class can provide common behavior, while a child class can provide behavior specific to itself.

Example:

```text
Vehicle
   │
   ├── Car
   └── Bike
```

The parent can define:

```java
start()
```

But each child can decide how `start()` should behave.

```text
Car  → Car-specific start behavior
Bike → Bike-specific start behavior
```

This gives different implementations through a common parent method.

---

# Method Overriding Example

```java
class Vehicle {

    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        System.out.println("Starting Vehicle...");
    }

    public void display() {
        System.out.println("Brand: " + brand + " Speed: " + speed);
    }
}

class Car extends Vehicle {

    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(
            "Brand: " + getBrand()
            + " Speed: " + getSpeed()
            + " km/hr " + doors + " door"
        );
    }
}

class Bike extends Vehicle {

    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void start() {
        System.out.println("Starting Bike....");
    }
}
```

---

# `super()` in Method Overriding

When a child class overrides a parent method, `super.methodName()` can be used to call the parent implementation.

Example:

```java
@Override
public void display() {
    super.display();
    System.out.println("Child-specific display");
}
```

---

# Parent References and Child Objects

A Parent class reference can refer to a Child class object.

```java
Vehicle v = new Bike("Splender", 700, false);
```

Here:

```text
Reference Type → Vehicle
Actual Object  → Bike
```

This is called **Upcasting**.

The parent reference can also be reused with another child object:

```java
Vehicle vehicle;

vehicle = new Car("Jaguar", 700, 6);
vehicle = new Bike("Splender", 700, false);
```

---

# How Runtime Polymorphism Works

Consider:

```java
Vehicle v = new Bike("Splender", 700, false);
v.start();
```

Java knows:

```text
Reference Type = Vehicle
Actual Object  = Bike
```

At runtime, Java checks the actual object.

Because `Bike` overrides `start()`:

```java
Bike.start()
```

executes.

```text
Vehicle v
   │
   ▼
Bike Object
   │
   ▼
v.start()
   │
   ▼
Bike.start()
```

This is **Run-Time Polymorphism**.

---

# What If the Child Does Not Override the Method?

Consider:

```java
Vehicle v = new Car("Jaguar", 700, 6);
v.start();
```

Suppose `Car` does not override `start()`.

Then the inherited parent implementation is used:

```java
Vehicle.start()
```

So:

```text
Car Object
   │
   ▼
Does Car override start()?
   │
   └── No
         │
         ▼
   Vehicle.start()
```

The important idea is that the overridden method is selected according to the actual object, while a child that does not override the method uses the inherited implementation.

---

# Runtime Method Resolution

```text
Vehicle v = new Bike();
v.start();

        │
        ▼
Reference Type = Vehicle
        │
        ▼
Actual Object = Bike
        │
        ▼
Does Bike override start()?
        │
       Yes
        │
        ▼
Execute Bike.start()
```

If the actual class does not override the method, the inherited implementation is used.

---

# Compile-Time vs Run-Time Polymorphism

| Feature | Compile-Time Polymorphism | Run-Time Polymorphism |
|---|---|---|
| Achieved Using | Method Overloading | Method Overriding |
| Decision Taken | During compilation | During execution |
| Binding | Early Binding | Late Binding |
| Inheritance Required | ❌ No | ✅ Yes |
| Main Basis | Parameter list | Actual object type |
| Typical Example | `add()` methods | `start()` / `display()` |

---

# Overloading vs Overriding

| Feature | Method Overloading | Method Overriding |
|---|---|---|
| Purpose | Same operation with different parameters | Different implementation of inherited behavior |
| Method Name | Same | Same |
| Parameters | Must differ | Same parameter list |
| Inheritance | Not required | Required |
| Decision | Compile time | Runtime |
| Polymorphism | Compile-Time | Run-Time |
| Example | `add(int)` and `add(double)` | `Vehicle.start()` and `Bike.start()` |

---

# Important Rules — Quick Reference

## Method Overloading

```text
Same Method Name
+
Different Parameter List
        │
        ├── Different number of parameters
        ├── Different parameter types
        └── Different order of parameter types
```

```text
Parameter names do not matter.
Return type alone cannot overload a method.
```

Examples:

```java
add(int a)
add(double a)
```

✅ Valid

```java
add(int a, double b)
add(double a, int b)
```

✅ Valid

```java
add(int a)
add(int b)
```

❌ Not valid

```java
int add(int a)
double add(int a)
```

❌ Not valid

---

## Method Overriding

```text
Parent Method
      │
      ▼
Child provides its own implementation
```

Important points:

```text
Inheritance is required.
Same method name and parameter list are used.
Child provides the new implementation.
@Override helps verify the override.
Runtime behavior depends on the actual object.
```

The overriding method should not reduce the access level of the inherited method.

---

# Benefits of Run-Time Polymorphism

### Flexibility

A common parent reference can work with different child objects.

### Extensibility

New child classes can be added while keeping code based on a common parent type.

### Loose Coupling

Code can depend on the parent type instead of a specific child implementation.

### Dynamic Behavior

The behavior can change according to the actual object used at runtime.

---

# Practical Mental Model

### Compile-Time Polymorphism

Ask:

```text
Which method matches these arguments?
```

Java answers this during compilation.

```text
add(10, 20)
      ↓
add(int, int)
```

### Run-Time Polymorphism

Ask:

```text
Which implementation belongs to this actual object?
```

Java resolves this during execution.

```text
Vehicle v = new Bike();
v.start();
      ↓
Bike.start()
```

---

# Key Points

```text
Polymorphism
→ Many Forms
```

```text
Compile-Time Polymorphism
→ Method Overloading
→ Compiler selects the matching overloaded method
```

```text
Run-Time Polymorphism
→ Method Overriding
→ Actual object determines the overridden implementation
```

```text
Overloading
→ Same method name
→ Different parameter list
```

```text
Overriding
→ Parent-child relationship
→ Same method signature
→ Child provides different implementation
```

```text
Parent Reference
→ Can refer to Child Object
→ Enables Runtime Polymorphism
```

---

# One-Line Definitions

> **Polymorphism** is the OOP principle that allows one method name or reference to work in multiple forms.

> **Method Overloading** is Compile-Time Polymorphism where multiple methods have the same name but different parameter lists.

> **Method Overriding** is Run-Time Polymorphism where a Child Class provides its own implementation of a Parent Class method and Java selects the appropriate implementation at runtime.
