# POLYMORPHISM IN JAVA (COMPILE TIME POLYMORPHISM)

## Study : Method Overloading

---

# What is Polymorphism?

Polymorphism is one of the four pillars of Object-Oriented Programming (OOP).

The word Polymorphism comes from:

```text
Poly  = Many

Morph = Forms
```

Meaning:

```text
One Thing
Can Exist
In Multiple Forms
```

---

## Simple Definition

> Polymorphism allows the same method name to perform different actions depending on the situation.

---

# Types of Polymorphism in Java

Java supports two types of Polymorphism:

| Type                      | Also Known As        | Achieved Using     |
| ------------------------- | -------------------- | ------------------ |
| Compile Time Polymorphism | Static Polymorphism  | Method Overloading |
| Run Time Polymorphism     | Dynamic Polymorphism | Method Overriding  |

---

## Polymorphism Overview

```text
            Polymorphism
                   │
        ┌──────────┴──────────┐
        │                     │
        ▼                     ▼

Compile Time          Run Time
Polymorphism       Polymorphism

(Method               (Method
Overloading)          Overriding)
```

---

# What is Method Overloading?

Method Overloading means:

```text
Same Method Name
+
Different Parameters
```

inside the same class.

---

Java allows multiple methods with the same name as long as their parameter list is different.

---

## Definition

> Method Overloading is the ability to create multiple methods having the same name but different parameters.

---

# Why Method Overloading?

Suppose we want to perform addition.

Without Overloading:

```java
addTwoNumbers()
```

```java
addThreeNumbers()
```

```java
addDoubleNumbers()
```

Many method names are required.

---

With Overloading:

```java
add(...)
```

is sufficient.

Java automatically selects the correct method.

---

# Understanding Your Calculator Class

Your Class:

```java
public class Calculator
```

contains multiple methods named:

```java
add()
```

---

This is Method Overloading.

---

# Rule of Method Overloading

Methods must differ in at least one of the following:

### Different Number of Parameters

```java
add(int,int)
```

```java
add(int,int,int)
```

---

### Different Data Types

```java
add(int,int)
```

```java
add(double,double)
```

---

### Different Order of Data Types

```java
add(int,double)
```

```java
add(double,int)
```

---

# Overloaded Method 1

Your Code:

```java
public int add(
        int a,
        int b) {

    System.out.println(
            "Calling add(int,int)"
    );

    return a + b;
}
```

---

Signature:

```text
add(int,int)
```

---

Usage:

```java
calc.add(10,20);
```

---

Output:

```text
Calling add(int,int)

30
```

---

# Overloaded Method 2

Your Code:

```java
public int add(
        int a,
        int b,
        int c) {

    System.out.println(
            "Calling add(int,int,int)"
    );

    return a + b + c;
}
```

---

Signature:

```text
add(int,int,int)
```

---

Usage:

```java
calc.add(
        10,
        20,
        30
);
```

---

Output:

```text
Calling add(int,int,int)

60
```

---

# Overloaded Method 3

Your Code:

```java
public double add(
        double a,
        double b) {

    System.out.println(
            "Calling add(double,double)"
    );

    return a + b;
}
```

---

Signature:

```text
add(double,double)
```

---

Usage:

```java
calc.add(
        10.5,
        20.5
);
```

---

Output:

```text
Calling add(double,double)

31.0
```

---

# Overloaded Method 4

Your Code:

```java
public void add(
        int a,
        double b) {

    System.out.println(
            "Calling add(int,double)"
    );
}
```

---

Signature:

```text
add(int,double)
```

---

Usage:

```java
calc.add(
        10,
        20.5
);
```

---

Output:

```text
Calling add(int,double)
```

---

# Overloaded Method 5

Your Code:

```java
public void add(
        double a,
        int b) {

    System.out.println(
            "Calling add(double,int)"
    );
}
```

---

Signature:

```text
add(double,int)
```

---

Usage:

```java
calc.add(
        10.5,
        20
);
```

---

Output:

```text
Calling add(double,int)
```

---

# How Does Java Decide Which Method to Call?

This is the most important concept.

Java determines the correct overloaded method during:

```text
Compilation
```

Therefore it is called:

```text
Compile Time Polymorphism
```

---

# Method Selection Process

Java checks:

### 1. Number of Parameters

Example:

```java
calc.add(
        10,
        20
);
```

Java finds:

```java
add(int,int)
```

---

Example:

```java
calc.add(
        10,
        20,
        30
);
```

Java finds:

```java
add(int,int,int)
```

---

# 2. Data Types

Example:

```java
calc.add(
        10.5,
        20.5
);
```

Java finds:

```java
add(double,double)
```

---

# 3. Order of Data Types

Example:

```java
calc.add(
        10,
        20.5
);
```

Java finds:

```java
add(int,double)
```

---

Example:

```java
calc.add(
        10.5,
        20
);
```

Java finds:

```java
add(double,int)
```

---

# Compile Time Resolution

Flow:

```text
Method Call
      │
      ▼
Compiler Checks
Parameters
      │
      ▼
Finds Matching Method
      │
      ▼
Method Bound During Compilation
```

---

# Why is it Called Compile Time Polymorphism?

Because Java decides:

```text
Which Method
Will Execute
```

during compilation.

---

Example:

```java
calc.add(10,20);
```

Before execution starts, Java already knows:

```text
add(int,int)
```

will execute.

---

Therefore:

```text
Compile Time
Polymorphism
```

---

# What is NOT Allowed?

Many beginners think this is overloading:

```java
public void add(int a)
```

```java
public void add(int b)
```

---

But Java sees:

```java
add(int)
```

```java
add(int)
```

---

Result:

```text
Duplicate Method Error
```

---

# Why?

Because Java ignores parameter names.

Java only checks:

```text
Method Name
+
Parameter Types
```

---

Example:

```java
add(int a)
```

and

```java
add(int b)
```

are identical.

---

Therefore:

❌ Not Allowed

---

# Important Rule

Parameter Names Do NOT Matter

---

Java checks:

```java
add(int)
```

NOT

```java
add(int a)
```

or

```java
add(int b)
```

---

# Return Type Alone Cannot Overload Methods

Not Allowed:

```java
public int add(int a,int b)
```

```java
public double add(int a,int b)
```

---

Why?

Because Java sees:

```java
add(int,int)
```

```java
add(int,int)
```

---

Result:

```text
Duplicate Method Error
```

---

# Valid Overloading Examples

### Different Number of Parameters

```java
add(int,int)
```

```java
add(int,int,int)
```

✔ Valid

---

### Different Data Types

```java
add(int,int)
```

```java
add(double,double)
```

✔ Valid

---

### Different Order

```java
add(int,double)
```

```java
add(double,int)
```

✔ Valid

---

# Invalid Overloading Examples

### Different Parameter Names

```java
add(int a)
```

```java
add(int b)
```

❌ Invalid

---

### Different Return Type Only

```java
int add(int,int)
```

```java
double add(int,int)
```

❌ Invalid

---

# Execution Flow of Your Program

```text
Create Calculator Object
        │
        ▼
add(10,20)
        │
        ▼
add(int,int)
        │
        ▼
Print 30
        │
        ▼
add(10,20,30)
        │
        ▼
add(int,int,int)
        │
        ▼
Print 60
        │
        ▼
add(10.5,20.5)
        │
        ▼
add(double,double)
        │
        ▼
Print 31.0
        │
        ▼
add(10,20.5)
        │
        ▼
add(int,double)
        │
        ▼
add(10.5,20)
        │
        ▼
add(double,int)
```

---

# Benefits of Method Overloading

## Better Readability

Same operation uses same method name.

---

## Code Reusability

Avoid creating many method names.

---

## Easier Maintenance

Related operations stay grouped together.

---

## Improves API Design

Java libraries use overloading extensively.

Example:

```java
System.out.println()
```

supports many data types.

---

# Real World Example

Think about a person named:

```text
Alex
```

---

You can call Alex:

```text
By Name
By Nickname
By Full Name
```

---

Different inputs.

Same person.

---

Similarly:

```text
add()
```

Different parameters.

Same method name.

---

# Key Notes

```text
Polymorphism
=
Many Forms
```

---

```text
Compile Time Polymorphism
=
Method Overloading
```

---

```text
Same Method Name
+
Different Parameters
```

---

```text
Java Resolves
During Compilation
```

---

```text
Parameter Names
Do Not Matter
```

---

```text
Return Type Alone
Cannot Overload
Methods
```

---

# Quick Revision

```text
Polymorphism
      │
      ▼
Many Forms
```

---

```text
Compile Time
Polymorphism
      │
      ▼
Method Overloading
```

---

```text
Overloading
      │
      ▼
Same Name
Different Parameters
```

---

```text
Compiler Decides
Which Method To Call
```

---

```text
Parameter Types Matter

Parameter Names Do Not
```

---

# Interview Questions

## Basic

1. What is Polymorphism?
2. What are the two types of Polymorphism in Java?
3. What is Method Overloading?
4. Why is Method Overloading called Compile Time Polymorphism?
5. What are the advantages of Method Overloading?

## Intermediate

6. How does Java select an overloaded method?
7. Can methods be overloaded using different parameter counts?
8. Can methods be overloaded using different parameter types?
9. Can methods be overloaded using different parameter order?
10. Why are parameter names ignored during overloading?

## Advanced

11. Can methods be overloaded by changing only the return type?
12. Explain method resolution in Compile Time Polymorphism.
13. What happens if two overloaded methods have identical signatures?
14. Explain why `add(int a)` and `add(int b)` are considered the same.
15. How is Method Overloading used in Java APIs like `println()`?

---

# One-Line Definition

> Method Overloading is a form of Compile Time Polymorphism where multiple methods share the same name but differ in parameter count, parameter types, or parameter order, allowing Java to determine the correct method during compilation.
