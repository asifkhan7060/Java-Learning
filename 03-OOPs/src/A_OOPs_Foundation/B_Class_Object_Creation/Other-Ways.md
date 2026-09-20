# Other Class and Object Program Structures in Java

> `Way 1` to `Way 4` are already covered separately.
>
> This document focuses only on **additional program structures and situations that help you understand where `main()` belongs when classes, files, and packages change**.

---

# Way 5 — `main()` Class Contains the Object Class

The class containing `main()` can also contain the class that represents the object as a nested class.

```java
public class CarApp {

    static class Car {

        String brand;
        int speed;

        void drive() {
            System.out.println(brand + " is driving at " + speed);
        }
    }

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "BMW";
        car1.speed = 100;

        car1.drive();
    }
}
```

### Usage

| Usage |
|---|
| 🟡 **Use selectively** |
| Suitable for small self-contained programs |
| Useful when the nested class is closely related to the outer class |
| ⚠️ Do not use this structure only for the purpose of moving `main()` somewhere else |
| For normal reusable classes, separate top-level classes are usually clearer |

The important idea is that the nested `Car` class belongs to `CarApp`.

---

# Way 6 — Class and `main()` Class in Different Packages

As the project grows, classes can also be organized into different packages.

### `model/Car.java`

```java
package model;

public class Car {

    public String brand;
    public int speed;

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }
}
```

### `app/CarApp.java`

```java
package app;

import model.Car;

public class CarApp {

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "BMW";
        car.speed = 100;

        car.drive();
    }
}
```

### Usage

| Usage |
|---|
| ✅ **Recommended / Preferred** |
| Useful as the project grows |
| Keeps classes organized by responsibility |
| Common in larger applications |
| Helps separate application entry-point classes from model or business classes |

Example:

```text
model
    ↓
Contains application/domain classes

app
    ↓
Contains application-starting classes
```

---

# Multiple Classes Can Have `main()`

There is no rule that only one class in a project can contain `main()`.

Example:

```java
public class Main {

    public static void main(String[] args) {
        System.out.println("Main");
    }
}
```

Another class can also contain `main()`:

```java
class Car {

    public static void main(String[] args) {
        System.out.println("Car");
    }
}
```

After compilation:

```text
Main.class
Car.class
```

You can choose which class to launch:

```bash
java Main
```

or:

```bash
java Car
```

The important concept is:

> **The class you launch determines which `main()` is executed.**

---

# The `public` Class and the `main()` Method Are Independent

This is an important case when working with multiple classes in one file.

```java
public class Main {
}

class Car {

    public static void main(String[] args) {
        System.out.println("Car main()");
    }
}
```

The file is:

```text
Main.java
```

Compile:

```bash
javac Main.java
```

This compiles both classes and produces:

```text
Main.class
Car.class
```

Run:

```bash
java Car
```

Output:

```text
Car main()
```

### Why?

The `public` class determines the source filename.

The class you launch is determined by:

```bash
java ClassName
```
Remember - Source File Name ≠ Class Being Launched

This distinction becomes especially important when multiple classes exist in the same source file.

---

# Multiple Classes in Multiple Files

A larger application normally has many classes in separate files.

For example:

### `Car.java`

```java
public class Car {

    String brand;

    void drive() {
        System.out.println(brand + " is driving");
    }
}
```

### `Bike.java`

```java
public class Bike {

    String brand;

    void ride() {
        System.out.println(brand + " is riding");
    }
}
```

### `Application.java`

```java
public class Application {

    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();

        car.brand = "BMW";
        bike.brand = "Yamaha";

        car.drive();
        bike.ride();
    }
}
```

### Usage

| Usage |
|---|
| ✅ **Recommended / Preferred** |
| Useful for larger applications |
| Better organization |
| Easier maintenance |
| Classes can be reused independently |

The important change is not how objects are created.

The change is mainly **how the classes are organized**.

---

# Where Should `main()` Go?

When you are writing your own program, think:

```text
Who is responsible for starting the application?
              ↓
       That class can contain main()
```

The other classes can focus on their own responsibilities.

---

# What If There Is No `public` Class?

A file can contain only non-public top-level classes.

Example:

```java
class Car {

    public static void main(String[] args) {
        System.out.println("Car");
    }
}

class Bike {

    void ride() {
        System.out.println("Bike");
    }
}
```

The file does not need to be named after `Car` or `Bike`.

For example:

```text
Example.java
```

Compile:

```bash
javac Example.java
```

Run:

```bash
java Car
```

---

# Common Beginner Mistake — Thinking `main()` Must Be in the Public Class

This is not always true.

Valid:

```java
public class Main {
}

class Car {

    public static void main(String[] args) {
        System.out.println("Car");
    }
}
```

Launch:

```bash
java Car
```

The key question is:

> **Which class are you asking Java to launch?**

---

# Common Beginner Mistake — Thinking Only One `main()` Can Exist

Multiple classes can have their own `main()`.

Example:

```text
Main.main()
Car.main()
Bike.main()
```

They do not all execute automatically.

You choose the class to launch:

```bash
java Main
```

or:

```bash
java Car
```

or:

```bash
java Bike
```

Only the selected launch target starts that execution.

---

# Common Beginner Mistake — Calling Instance Members Through the Class

Suppose:

```java
class Car {

    String brand;

    void drive() {
        System.out.println("Driving");
    }
}
```

This is wrong:

```java
Car.brand;
Car.drive();
```

because `brand` and `drive()` belong to an object.

Correct:

```java
Car car = new Car();

car.brand = "BMW";
car.drive();
```

---

# Common Design Mistake — Creating Too Many Classes

This is not a compiler error, but it can make a small program unnecessarily complicated.

For example:

```text
User.java
Order.java
Payment.java
Product.java
```

may be unnecessary for a tiny program.

The number of classes should depend on:

- Responsibilities
- Program complexity
- Reusability
- Maintainability

The goal is:

```text
Clear Responsibilities
        ↓
Clear Design
```

not:

```text
More Classes
        ↓
Better Program
```

---

# Quick Mental Model

When you are starting a Java program, think in this order:

```text
1. What classes do I need?
        ↓
2. Which class represents each object?
        ↓
3. Where should the object state and behavior be defined?
        ↓
4. Which class should start the application?
        ↓
5. Put main() in that launch class
        ↓
6. main() creates and uses the required objects
```

Example:

```text
Application
    ↓
main()
    ↓
new Car()
    ↓
Car Object
    ↓
Car State + Behavior
```