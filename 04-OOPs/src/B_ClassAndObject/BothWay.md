# CLASSES AND OBJECTS IN JAVA

## Study : Classes and Objects

---

# What is a Class?

A Class is a blueprint or template used to create Objects.

A Class defines:

* Properties (State)
* Behaviors (Methods)

The Class itself does not occupy memory for object data.

It only defines what an object should contain.

---

## Example

```java
class CarClass {

    String brand;
    String colour;
    int speed;

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }
}
```

### Breakdown

```java
String brand;
String colour;
int speed;
```

These are called:

* Instance Variables
* Properties
* State of an Object

They store information about the object.

---

```java
public void drive() {
    System.out.println(brand + " is driving at " + speed);
}
```

This is called a:

* Method
* Behavior

Methods define what an object can do.

---

# What is an Object?

An Object is an instance of a Class.

The object is the actual entity created from a Class blueprint.

---

## Real Life Example

```text
Class  → House Blueprint

Object → Actual House
```

---

```text
Class  → Car

Objects →
BMW
Audi
Mercedes
```

The blueprint remains the same.

Only the data changes.

---

# Class and Object Relationship

```text
Class
  │
  ▼
Blueprint
  │
  ▼
Object Creation
  │
  ▼
Objects
```

Example:

```text
CarClass
    │
    ▼
 ┌───────┐
 │ car1  │
 └───────┘

 ┌───────┐
 │ car2  │
 └───────┘
```

Both objects are created from the same class.

---

# Way 1 : Separate Class and Object Files

## CarClass.java

```java
public class CarClass {

    String brand;
    String colour;
    int speed;

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }
}
```

### Purpose

This file acts as a blueprint.

It contains:

* Properties
* Methods

No object is created here.

---

## CarObjects.java

```java
CarClass car1 = new CarClass();
```

### What Happens Here?

#### Step 1

```java
CarClass car1;
```

Creates a reference variable.

Memory is NOT allocated yet.

---

#### Step 2

```java
new CarClass();
```

Creates an object in memory.

This process is called:

```text
Instantiation
```

---

#### Step 3

```java
CarClass car1 = new CarClass();
```

The reference variable points to the newly created object.

---

### Memory Representation

```text
car1
 │
 ▼

┌────────────────┐
│ brand          │
│ colour         │
│ speed          │
└────────────────┘
```

---

## Assigning Values

```java
car1.brand = "BMW";
car1.colour = "Red";
car1.speed = 89;
```

### Explanation

```java
car1.brand
```

* car1 → Reference Variable
* brand → Instance Variable

Value stored:

```text
BMW
```

---

## Calling Methods

```java
car1.drive();
```

Output:

```text
BMW is driving at 89
```

Java uses the values stored inside the object.

---

# Creating Multiple Objects

```java
CarClass car2;
car2 = new CarClass();
```

This can also be written in two steps.

### Step 1

```java
CarClass car2;
```

Reference Variable Creation

---

### Step 2

```java
car2 = new CarClass();
```

Object Creation (Instantiation)

---

## Assigning Different Values

```java
car2.brand = "Audi";
car2.colour = "Green";
car2.speed = 100;
```

---

## Method Call

```java
car2.drive();
```

Output:

```text
Audi is driving at 100
```

---

# Important Observation

Although both objects come from the same Class:

```java
CarClass car1 = new CarClass();
CarClass car2 = new CarClass();
```

They store independent data.

```text
car1
Brand : BMW

car2
Brand : Audi
```

Changing one object does not affect the other.

---

# Way 2 : Class and Object in the Same File

Java allows multiple classes inside one file.

Example:

```java
public class ClassAndObject {

}

class ABC {

}
```

---

## Example

```java
public static class ABC {

    public static void main() {

        ClassAndObject car1 = new ClassAndObject();

        car1.brand = "BMW";
        car1.colour = "Red";
        car1.speed = 100;

        car1.drive();
    }
}
```

### Flow

```text
ClassAndObject
       │
       ▼
Create Object
       │
       ▼
Assign Values
       │
       ▼
Call Method
```

Output:

```text
BMW is driving at 100
```

---

# Public Class Naming Rule

One of the most important Java rules:

```text
If a class is declared as public,
the file name must exactly match
the public class name.
```

---

## Correct

File:

```text
ClassAndObject.java
```

Code:

```java
public class ClassAndObject {

}
```

✔ Valid

---

## Incorrect

File:

```text
ClassAndObject.java
```

Code:

```java
public class XYZ {

}
```

❌ Compilation Error

```text
class XYZ is public,
should be declared in a file named XYZ.java
```

---

# Class vs Object

| Class                     | Object               |
| ------------------------- | -------------------- |
| Blueprint                 | Actual Instance      |
| Logical Entity            | Physical Entity      |
| No Memory for Object Data | Occupies Memory      |
| Defines Structure         | Stores Actual Values |
| Created Once              | Can Create Many      |

---

# Key Notes

### Remember

```text
Class = Blueprint

Object = Instance
```

---

```text
Object = State + Behavior
```

---

```text
new Keyword
        │
        ▼
Object Creation
        │
        ▼
Instantiation
```

---

```text
Reference Variable
        │
        ▼
Points to Object
```

---

# Interview Questions

## Basic

1. What is a Class in Java?
2. What is an Object?
3. What is the difference between a Class and an Object?
4. What is an Instance of a Class?
5. What is Instantiation?

## Intermediate

6. What happens internally when `new CarClass()` is executed?
7. What is a Reference Variable?
8. Can multiple objects be created from the same class?
9. Why does each object maintain separate data?
10. Explain memory allocation during object creation.

## Advanced

11. Can a Java file contain multiple classes?
12. Why must a public class name match the file name?
13. What is the difference between a Reference Variable and an Object?
14. What happens if an object is created without assigning values?
15. Explain object creation using a memory diagram.

---

# One-Line Definition

> A Class is a blueprint that defines properties and behaviors, while an Object is an actual instance created from that blueprint.
