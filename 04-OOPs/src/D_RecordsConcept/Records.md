# RECORDS IN JAVA

## Study : Records (Modern Java)

---

# What is a Record?

A Record is a special type of class introduced in modern Java to reduce boilerplate code.

It is mainly used when an object only needs to store data and does not require complex business logic.

Records automatically generate many things that we normally write manually in a class.

---

## Simple Definition

> A Record is a special immutable data carrier class that automatically generates constructor, accessor methods, toString(), equals(), and hashCode().

---

# Why Were Records Introduced?

Before Records, creating a simple data class required a lot of repetitive code.

Example:

```java
class Bike {

    private String brand;
    private String color;
    private int price;

    public Bike(String brand,
                String color,
                int price) {

        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {

    }

    @Override
    public boolean equals(Object obj) {

    }

    @Override
    public int hashCode() {

    }
}
```

Even for a simple class, we need:

```text
Properties
Constructor
Getters
toString()
equals()
hashCode()
```

This creates a lot of boilerplate code.

---

# Solution : Record

Instead of writing all that code manually:

```java
record Bike(
        String Brand,
        String Color,
        int Price
) {}
```

Java automatically generates everything.

---

# What Does Java Generate Automatically?

When Java sees:

```java
record Bike(
        String Brand,
        String Color,
        int Price
) {}
```

Java automatically creates:

### Constructor

```java
Bike(
    String Brand,
    String Color,
    int Price
)
```

---

### Accessor Methods

```java
Brand()

Color()

Price()
```

---

### toString()

```java
bike.toString()
```

---

### equals()

```java
bike1.equals(bike2)
```

---

### hashCode()

```java
bike.hashCode()
```

---

# Record Syntax

General Syntax:

```java
record RecordName(
        type variable1,
        type variable2,
        ...
) {}
```

---

Example:

```java
record Bike(
        String Brand,
        String Color,
        int Price
) {}
```

---

# Understanding Your Record

Your Code:

```java
record Bike(
        String Brand,
        String Color,
        int Price
) {}
```

---

Here:

```text
Bike  → Record Name

Brand → Record Component

Color → Record Component

Price → Record Component
```

---

Important:

Record Components automatically become:

```text
Private
Final
Immutable
```

internally.

---

# Creating a Record Object

Your Code:

```java
Bike bike =
        new Bike(
                "Yamaha",
                "Mat Black",
                2400000
        );
```

---

Execution Flow

```text
new Bike(...)
      │
      ▼
Record Constructor Called
      │
      ▼
Components Initialized
      │
      ▼
Object Ready
```

---

Object State:

```text
Brand = Yamaha

Color = Mat Black

Price = 2400000
```

---

# Accessing Record Components

Unlike normal classes:

```java
bike.getBrand();
```

❌ Not Used

---

Records use Accessor Methods.

Your Code:

```java
bike.Brand();
```

✔ Correct

---

Similarly:

```java
bike.Color();

bike.Price();
```

---

Why?

Because Java automatically generates:

```java
public String Brand() {

}

public String Color() {

}

public int Price() {

}
```

behind the scenes.

---

# Output of Your Program

```java
System.out.println(
        "Brand : " + bike.Brand()
);
```

Output:

```text
Brand : Yamaha
```

---

```java
System.out.println(
        "Color : " + bike.Color()
);
```

Output:

```text
Color : Mat Black
```

---

```java
System.out.println(
        "Price : " + bike.Price()
);
```

Output:

```text
Price : 2400000
```

---

# Records are Immutable

One of the most important features of Records:

```text
Immutable
```

---

# What is Immutable?

Immutable means:

> Once a value is assigned during object creation, it cannot be changed later.

---

Example:

```java
Bike bike =
new Bike(
        "Yamaha",
        "Black",
        2400000
);
```

---

Trying to Modify

```java
bike.Brand = "Honda";
```

❌ Not Allowed

---

Why?

Because Record Components are automatically:

```text
final
```

internally.

---

Think of it as:

```java
private final String Brand;
```

---

# Normal Class vs Record

## Normal Class

```java
class Bike {

    private String brand;
    private String color;
    private int price;

    public Bike(
            String brand,
            String color,
            int price
    ) {

    }

    public String getBrand() {

    }

    public String getColor() {

    }

    public int getPrice() {

    }
}
```

Many lines of code.

---

## Record

```java
record Bike(
        String Brand,
        String Color,
        int Price
) {}
```

Only one line.

---

# Class vs Record

| Feature          | Normal Class | Record      |
| ---------------- | ------------ | ----------- |
| Properties       | ✔ Manual     | ✔ Automatic |
| Constructor      | ✔ Manual     | ✔ Automatic |
| Getter Methods   | ✔ Manual     | ✔ Automatic |
| toString()       | ✔ Manual     | ✔ Automatic |
| equals()         | ✔ Manual     | ✔ Automatic |
| hashCode()       | ✔ Manual     | ✔ Automatic |
| Mutable          | ✔ Yes        | ❌ No        |
| Boilerplate Code | High         | Very Low    |

---

# When Should We Use Records?

Use Records when:

✔ Object only stores data

✔ Values should not change

✔ Less code is preferred

✔ DTO (Data Transfer Object)

✔ API Response Objects

✔ Configuration Objects

---

# When Should We Avoid Records?

Avoid Records when:

❌ Object state needs to change frequently

❌ Complex business logic is required

❌ Many custom setters are needed

❌ Mutable objects are required

---

# Real Life Example

Student Information

Instead of:

```java
class Student {

    String name;
    int age;
    String branch;

}
```

we can write:

```java
record Student(
        String name,
        int age,
        String branch
) {}
```

Much cleaner and shorter.

---

# Hidden Code Generated by Java

When Java sees:

```java
record Bike(
        String Brand,
        String Color,
        int Price
) {}
```

It approximately generates:

```java
final class Bike {

    private final String Brand;

    private final String Color;

    private final int Price;

    public Bike(
            String Brand,
            String Color,
            int Price) {

        this.Brand = Brand;
        this.Color = Color;
        this.Price = Price;
    }

    public String Brand() {
        return Brand;
    }

    public String Color() {
        return Color;
    }

    public int Price() {
        return Price;
    }
}
```

This is why Records greatly reduce code.

---

# Execution Flow of Your Program

```text
Create Record Object
        │
        ▼
Constructor Generated By Java Called
        │
        ▼
Components Initialized
        │
        ▼
Accessors Called
        │
        ▼
Values Printed
```

---

# Key Notes

```text
Record
   │
   ▼
Special Class
```

---

```text
Record
   │
   ▼
Less Boilerplate Code
```

---

```text
Record Components
   │
   ▼
Automatically Final
```

---

```text
Record
   │
   ▼
Immutable
```

---

```text
bike.Brand()

NOT

bike.getBrand()
```

---

```text
Java Generates

Constructor
Accessors
toString()
equals()
hashCode()
```

---

# Quick Revision

```text
Record
=
Data Carrier Class
```

---

```text
Record
=
Immutable
```

---

```text
Record
=
Less Code
```

---

```text
Accessor

Brand()
Color()
Price()
```

---

```text
No Traditional Getters

getBrand()

❌

Brand()

✔
```

---

# Interview Questions

## Basic

1. What is a Record in Java?
2. Why were Records introduced?
3. What problem do Records solve?
4. What are Record Components?
5. How do you create a Record?

## Intermediate

6. What methods are automatically generated by Records?
7. What is the difference between a Record and a Normal Class?
8. Why are Records considered immutable?
9. How are values accessed inside a Record?
10. Explain Record accessors.

## Advanced

11. Can Records have constructors?
12. Can Records have methods?
13. Can Records extend another class?
14. What code does Java generate behind the scenes for a Record?
15. When should Records be preferred over normal classes?

---

# One-Line Definition

> A Record is a special immutable class introduced in modern Java that automatically generates constructors, accessors, equals(), hashCode(), and toString(), reducing boilerplate code for data-centric objects.
