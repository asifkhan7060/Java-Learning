# CONSTRUCTORS IN JAVA

## Study : Basic Constructors and Constructor Overloading

---

# What is a Constructor?

A Constructor is a special method used to initialize an object.

It is automatically called when an object is created using the `new` keyword.

Unlike normal methods, we do not call constructors manually.

Java calls them automatically during object creation.

---

## Simple Definition

> A Constructor is a special method that initializes an object's data when the object is created.

---

# Why Do We Need Constructors?

Without constructors, we must initialize every instance variable manually after object creation.

Example:

```java
Car car1 = new Car();

car1.brand = "BMW";
car1.colour = "Red";
car1.speed = 100;
```

For a class having many variables, this becomes repetitive and difficult.

Constructors solve this problem.

---

# Constructor Flow

```text
Create Object
      │
      ▼
Constructor Automatically Called
      │
      ▼
Initialize Instance Variables
      │
      ▼
Object Ready To Use
```

---

# Constructor Syntax

```java
public ClassName(type parameter1,
                 type parameter2) {

    // Initialization Code
}
```

Example:

```java
public Car(String brand,
           int speed) {

    this.brand = brand;
    this.speed = speed;
}
```

---

# Important Rules of Constructors

## Rule 1

Constructor name must be exactly the same as the class name.

Example:

```java
class Car {

    public Car() {

    }
}
```

✔ Valid

---

```java
class Car {

    public Vehicle() {

    }
}
```

❌ Invalid

---

## Rule 2

Constructors do not have a return type.

Not even `void`.

---

✔ Correct

```java
public Car() {

}
```

---

❌ Incorrect

```java
public void Car() {

}
```

This becomes a normal method.

---

## Rule 3

Constructors are automatically called during object creation.

Example:

```java
Car car1 = new Car();
```

Java automatically calls:

```java
Car()
```

behind the scenes.

---

# Default Constructor

If no constructor is written, Java automatically creates one.

Example:

```java
class Car {

}
```

Java internally creates:

```java
public Car() {

}
```

This is called the Default Constructor.

---

## Example

```java
CarClassConstructor car1 =
        new CarClassConstructor();
```

If values are not assigned:

```text
String → null
int    → 0
double → 0.0
boolean→ false
```

---

Example:

```java
car1.drive();
```

Output:

```text
null is driving at 0
```

---

# Parameterized Constructor

A Parameterized Constructor receives values during object creation.

Example:

```java
CarClassConstructor car1 =
new CarClassConstructor(
        "Red",
        "BMW",
        100
);
```

---

# Constructor in Your Code

```java
public CarClassConstructor(
        String colour,
        String brand,
        int speed) {

    System.out.println(
        "Printed when Constructor called"
    );

    this.colour = colour;
    this.brand = brand;
    this.speed = speed;
}
```

---

# Understanding this Keyword

Inside a constructor:

```java
this.colour = colour;
```

Left Side:

```java
this.colour
```

means:

```text
Current Object's Instance Variable
```

---

Right Side:

```java
colour
```

means:

```text
Constructor Parameter
```

---

Memory View:

```text
this.colour = colour

      │         │
      ▼         ▼

Object     Parameter
Variable     Value
```

---

Example:

```java
new CarClassConstructor(
        "Red",
        "BMW",
        100
);
```

Execution:

```text
this.colour = "Red"

this.brand  = "BMW"

this.speed  = 100
```

---

# Alternative Example

Your code:

```java
public CarClassConstructor(
        String a,
        String b,
        int c) {

    this.colour = a;
    this.brand = b;
    this.speed = c;
}
```

works exactly the same.

---

Why?

Because parameter names do not matter.

Only their values matter.

---

# Very Important Rule

## Parameter Names Do NOT Matter

Java does not check parameter names.

Java only checks:

```text
Parameter Types
```

---

Example:

```java
Car(String brand)
```

and

```java
Car(String colour)
```

appear different to humans.

But Java sees:

```java
Car(String)
```

and

```java
Car(String)
```

Therefore:

❌ Not Allowed Together

---

Example:

```java
public Car(String brand) {

}

public Car(String colour) {

}
```

Compilation Error

Because both signatures are identical.

---

# Constructor Overloading

Constructor Overloading means:

```text
Same Constructor Name
+
Different Parameter List
```

Since constructor name must always match the class name, Java differentiates constructors using parameters.

---

# Constructor Overloading in Your Code

You created:

```java
CarClassConstructor(
String colour,
String brand,
int speed)
```

---

```java
CarClassConstructor(
String brand)
```

---

```java
CarClassConstructor(
int speed,
String colour)
```

All are valid because their parameter lists are different.

---

# Single Parameter Constructor

```java
public CarClassConstructor(
        String brand) {

    System.out.println(
            "This is Single parameter constructor"
    );

    this.brand = brand;
}
```

---

Object Creation

```java
CarClassConstructor car2 =
        new CarClassConstructor("BMW");
```

Output:

```text
This is Single parameter constructor
```

---

Object State:

```text
brand = BMW
colour = null
speed = 0
```

---

# Double Parameter Constructor

```java
public CarClassConstructor(
        int speed,
        String colour) {

    System.out.println(
            "This is Double parameter constructor"
    );

    this.speed = speed;
    this.colour = colour;
}
```

---

Object Creation

```java
CarClassConstructor car3 =
        new CarClassConstructor(
                200,
                "BMW"
        );
```

Output:

```text
This is Double parameter constructor
```

---

Object State:

```text
speed = 200
colour = BMW
brand = null
```

---

# Constructor Selection Process

When Java sees:

```java
new CarClassConstructor("BMW");
```

it searches for:

```java
CarClassConstructor(String)
```

and calls it.

---

When Java sees:

```java
new CarClassConstructor(
        200,
        "BMW"
);
```

it searches for:

```java
CarClassConstructor(
int,
String
)
```

and calls it.

---

# What Happens If Constructor Is Missing?

Example:

```java
new CarClassConstructor("BMW");
```

but

```java
CarClassConstructor(String)
```

does not exist.

Java throws:

```text
actual and formal argument lists differ in length
```

because it cannot find a matching constructor.

---

# Constructor Execution Flow

For:

```java
CarClassConstructor car1 =
new CarClassConstructor(
        "Red",
        "BMW",
        100
);
```

Flow:

```text
new Keyword
      │
      ▼
Memory Allocated
      │
      ▼
Constructor Called
      │
      ▼
Instance Variables Initialized
      │
      ▼
Reference Variable Receives Address
      │
      ▼
Object Ready
```

---

# Constructor vs Method

| Constructor                       | Method                     |
| --------------------------------- | -------------------------- |
| Initializes Object                | Performs Operations        |
| Same Name as Class                | Any Valid Name             |
| No Return Type                    | Can Return Value           |
| Called Automatically              | Called Manually            |
| Executes Once Per Object Creation | Can Execute Multiple Times |

---

# Key Notes

```text
Constructor
      │
      ▼
Object Initialization
```

---

```text
No Constructor Written
      │
      ▼
Java Creates Default Constructor
```

---

```text
Parameterized Constructor
      │
      ▼
Initialize Values During
Object Creation
```

---

```text
Constructor Overloading
      │
      ▼
Same Constructor Name
Different Parameters
```

---

```text
Java Checks
Parameter Types

NOT

Parameter Names
```

---

# Quick Revision

```text
Constructor
      │
      ▼
Special Method
```

```text
Called Automatically
When Object Is Created
```

```text
Default Constructor
Created By Java
If None Exists
```

```text
Parameterized Constructor
Receives Values
During Object Creation
```

```text
Overloading
=
Multiple Constructors
With Different Parameters
```

---

# Interview Questions

## Basic

1. What is a Constructor?
2. Why are Constructors used?
3. When is a Constructor called?
4. What is a Default Constructor?
5. What is a Parameterized Constructor?

## Intermediate

6. What is Constructor Overloading?
7. How does Java choose which Constructor to call?
8. Explain the purpose of the `this` keyword inside a Constructor.
9. What happens if no Constructor is written?
10. What happens if a matching Constructor does not exist?

## Advanced

11. Can Constructors be overloaded?
12. Can Constructors be overridden?
13. Why don't Constructors have return types?
14. Explain Constructor execution flow internally.
15. Why does Java consider `Car(String brand)` and `Car(String colour)` the same constructor?

---

# One-Line Definition

> A Constructor is a special method that automatically initializes an object's data when the object is created, and Constructor Overloading allows multiple constructors with different parameter lists in the same class.
