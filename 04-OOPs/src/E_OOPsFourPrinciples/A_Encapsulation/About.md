# ENCAPSULATION IN JAVA

## Study : Encapsulation (First Pillar of OOP)

---

# What is Encapsulation?

Encapsulation is one of the four fundamental principles of Object-Oriented Programming (OOP).

It is the process of combining:

```text
Data (Variables)
+
Methods (Functions)
```

into a single unit called a Class.

---

However, in practical Java programming, Encapsulation is mainly associated with:

```text
Data Hiding
+
Controlled Access
```

---

## Simple Definition

> Encapsulation is the process of hiding data and providing controlled access to that data through methods.

---

# Why is Encapsulation Needed?

Imagine a Car object:

```java
Car car = new Car();
```

Without Encapsulation:

```java
car.speed = -500;
```

This value is invalid because speed cannot be negative.

If every class can directly modify variables, the object may enter an invalid state.

---

Encapsulation solves this problem by:

```text
Hiding Variables
        +
Controlling Access
        +
Applying Validation
```

---

# Real Life Example

Consider a Bank Account.

Without Encapsulation:

```java
account.balance = -100000;
```

Anyone could directly change the balance.

---

Instead:

```java
account.deposit(1000);

account.withdraw(500);

account.checkBalance();
```

The balance is modified only through controlled methods.

---

This is exactly how Encapsulation works.

---

# Encapsulation Formula

```text
Encapsulation
      =
Data Hiding
      +
Controlled Access
```

---

# How is Encapsulation Achieved?

Three simple steps:

### Step 1

Declare variables as private.

```java
private String brand;
```

---

### Step 2

Create Getter Methods.

```java
public String getBrand() {
    return brand;
}
```

---

### Step 3

Create Setter Methods.

```java
public void setBrand(String brand) {
    this.brand = brand;
}
```

---

# Access Modifiers and Encapsulation

Access Modifiers control visibility of variables and methods.

| Modifier  | Accessibility                               |
| --------- | ------------------------------------------- |
| public    | Accessible from anywhere                    |
| private   | Accessible only inside the same class       |
| protected | Accessible inside package and child classes |

---

## private

```java
private String brand;
```

Accessible only inside the same class.

---

## protected

```java
protected int speed;
```

Accessible inside:

```text
Same Package
+
Child Classes
```

---

## public

```java
public void drive() {
}
```

Accessible from anywhere.

---

# Main Idea of Encapsulation

## Read Only

Getter Present

Setter Absent

```java
private String brand;

public String getBrand() {
    return brand;
}
```

Result:

```text
Can Read
Cannot Modify
```

---

## Write Only

Setter Present

Getter Absent

```java
private String password;

public void setPassword(String password) {
    this.password = password;
}
```

Result:

```text
Can Modify
Cannot Read
```

---

## Read and Write

Getter Present

Setter Present

```java
private int speed;

public int getSpeed() {
    return speed;
}

public void setSpeed(int speed) {
    this.speed = speed;
}
```

Result:

```text
Can Read
Can Modify
```

---

# Understanding Your Class

## Private Variables

Your Code:

```java
private final String brand;

private int speed;

private double range;
```

---

These variables are hidden from outside classes.

Direct access is not allowed.

Example:

```java
car1.speed = 1000;
```

❌ Compilation Error

---

```java
car1.brand = "Audi";
```

❌ Compilation Error

---

```java
car1.range = 500;
```

❌ Compilation Error

---

# Constructor

Your Code:

```java
public CarClass(
        String brand,
        int speed,
        double range) {

    this.brand = brand;

    this.speed = speed;

    setRange(range);
}
```

---

Notice:

```java
setRange(range);
```

instead of:

```java
this.range = range;
```

---

# Why Call Setter Inside Constructor?

Normally:

```java
this.range = range;
```

assigns the value directly.

No validation occurs.

---

Example:

```java
new CarClass(
        "BMW",
        200,
        -50
);
```

Range becomes:

```text
-50
```

which is invalid.

---

Your code avoids this.

Instead:

```java
setRange(range);
```

is called.

---

Execution Flow:

```text
Constructor Called
        │
        ▼
setRange(range)
        │
        ▼
Validation Executed
        │
        ▼
Valid Value Stored
```

---

This is an excellent Encapsulation practice.

Because:

```text
Validation
Applies During Creation
AND
During Updates
```

---

# Getter Methods

## getBrand()

```java
public String getBrand() {
    return brand;
}
```

Purpose:

```text
Read Brand
```

---

## getSpeed()

```java
public int getSpeed() {
    return speed;
}
```

Purpose:

```text
Read Speed
```

---

## getRange()

```java
public double getRange() {
    return range;
}
```

Purpose:

```text
Read Range
```

---

# Setter Methods

## setSpeed()

Your Code:

```java
public void setSpeed(int speed) {

    if(speed < 0) {

        System.out.println(
                "Speed cannot be negative"
        );

        return;
    }

    this.speed = speed;
}
```

---

Purpose:

```text
Validate Speed
Before Updating
```

---

Flow:

```text
Setter Called
      │
      ▼
speed < 0 ?
      │
 ┌────┴────┐
 │         │
YES        NO
 │          │
 ▼          ▼
Reject     Update
Value      Speed
```

---

# Example

Valid:

```java
car1.setSpeed(250);
```

Result:

```text
Speed Updated
```

---

Invalid:

```java
car1.setSpeed(-100);
```

Result:

```text
Speed cannot be negative
```

Speed remains unchanged.

---

# setRange()

Your Code:

```java
public void setRange(double range) {

    if(range < 0) {

        System.out.println(
                "Range cannot be negative"
        );

        range = 0;
    }

    this.range = range;
}
```

---

Purpose:

```text
Prevent Negative Range
```

---

# Example During Object Creation

Your Code:

```java
CarClass car1 =
new CarClass(
        "BMW",
        200,
        -50
);
```

---

Execution:

```text
Constructor Called
       │
       ▼
setRange(-50)
       │
       ▼
range < 0
       │
       ▼
Print Message
       │
       ▼
range = 0
       │
       ▼
Store Value
```

---

Final State:

```text
brand = BMW

speed = 200

range = 0
```

---

# Why Brand Cannot Be Modified?

Your Code:

```java
private final String brand;
```

and

```java
public String getBrand()
```

exists.

---

But:

```java
setBrand()
```

does NOT exist.

---

Result:

```text
Brand = Read Only
```

---

User can do:

```java
car1.getBrand();
```

✔ Allowed

---

User cannot do:

```java
car1.setBrand("Audi");
```

❌ Not Allowed

---

# Why Speed Can Be Modified?

Because both exist:

```java
getSpeed()
```

and

```java
setSpeed()
```

---

Result:

```text
Read + Write
```

---

# Why Range Can Be Modified?

Because both exist:

```java
getRange()
```

and

```java
setRange()
```

---

Result:

```text
Read + Write
```

with validation.

---

# Behaviour Method

Your Code:

```java
public void drive() {

    System.out.println(
            brand +
            " is driving at " +
            speed +
            " km/h"
    );
}
```

---

Output Example:

```text
BMW is driving at 250 km/h
```

---

# Execution Flow of Your Program

```text
Create Car Object
        │
        ▼
Constructor Called
        │
        ▼
setRange(-50)
        │
        ▼
Validation Applied
        │
        ▼
Range Becomes 0
        │
        ▼
Read Brand
        │
        ▼
Read Speed
        │
        ▼
Read Range
        │
        ▼
Update Speed
        │
        ▼
Update Range
        │
        ▼
Call drive()
```

---

# Benefits of Encapsulation

## Data Security

Variables remain protected.

---

## Controlled Access

Data is accessed only through methods.

---

## Validation

Invalid values can be blocked.

Example:

```java
speed < 0
```

---

## Better Maintainability

Internal implementation can change without affecting external code.

---

## Better Code Organization

Data and behavior remain together.

---

# Encapsulation vs Data Hiding

Many beginners think both are the same.

They are related but different.

---

## Data Hiding

```text
Hide Variables
Using private
```

---

## Encapsulation

```text
Data Hiding
+
Controlled Access
+
Validation
```

---

Therefore:

```text
Data Hiding
is a part of
Encapsulation
```

---

# Real World Analogy

```text
ATM Machine
```

You cannot directly access:

```text
Account Balance
```

---

Instead:

```text
Withdraw
Deposit
Check Balance
```

methods are provided.

---

This is Encapsulation.

---

# Key Notes

```text
Encapsulation
=
Data Hiding
+
Controlled Access
```

---

```text
private
=
Hide Data
```

---

```text
Getter
=
Read Data
```

---

```text
Setter
=
Modify Data
```

---

```text
Validation
=
Usually Inside Setters
```

---

```text
Calling Setter
Inside Constructor
=
Validation During Object Creation
```

---

```text
Getter Only
=
Read Only
```

---

```text
Setter Only
=
Write Only
```

---

```text
Getter + Setter
=
Read and Write
```

---

# Quick Revision

```text
Encapsulation
=
Protect Object State
```

---

```text
private
=
Data Hiding
```

---

```text
Getter
=
Read
```

---

```text
Setter
=
Update
```

---

```text
Validation
=
Prevent Invalid Data
```

---

```text
Constructor
+
Setter
=
Validated Initialization
```

---

# Interview Questions

## Basic

1. What is Encapsulation?
2. Why is Encapsulation important?
3. What is Data Hiding?
4. How is Encapsulation achieved in Java?
5. Why are variables usually declared private?

## Intermediate

6. What is the role of Getter Methods?
7. What is the role of Setter Methods?
8. Explain Read Only properties.
9. Explain Write Only properties.
10. What are the benefits of controlled access?

## Advanced

11. What is the difference between Data Hiding and Encapsulation?
12. Why is validation usually implemented inside setters?
13. Why is `setRange(range)` called inside the constructor instead of `this.range = range`?
14. How does Encapsulation improve maintainability?
15. Explain Encapsulation using the ATM or Bank Account example.

---

# One-Line Definition

> Encapsulation is the OOP principle of hiding data and providing controlled, validated access to that data through methods such as getters and setters.
