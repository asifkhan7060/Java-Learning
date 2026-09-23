# ABSTRACTION IN JAVA (ABSTRACT CLASSES)

## Study : Abstract Classes and Abstract Methods

---

# What is Abstraction?

Abstraction is one of the four pillars of Object-Oriented Programming (OOP).

Abstraction means:

```text
Showing Essential Information
and
Hiding Internal Implementation
```

---

## Simple Definition

> Abstraction is the process of hiding implementation details and showing only the necessary functionality to the user.

---

# Real Life Example

Consider:

```text
ATM Machine
```

You know:

```text
Withdraw Money
Deposit Money
Check Balance
```

But you do not know:

```text
Database Queries
Server Communication
Encryption Logic
```

Those implementation details are hidden.

---

This is:

```text
Abstraction
```

---

# Why Do We Need Abstraction?

Without Abstraction:

```text
Users need to understand
every internal implementation.
```

This makes software complex.

---

With Abstraction:

```text
User only sees
what is necessary.
```

Implementation remains hidden.

---

Benefits:

```text
Less Complexity
Better Security
Better Maintainability
Better Design
```

---

# Ways to Achieve Abstraction in Java

Java provides two approaches:

| Approach       | Abstraction Level                |
| -------------- | -------------------------------- |
| Abstract Class | Partial Abstraction              |
| Interface      | Full Abstraction (Traditionally) |

---

# What is an Abstract Class?

An Abstract Class is a class declared using:

```java
abstract
```

keyword.

---

Example:

```java
abstract class BankAccount {

}
```

---

Abstract Classes are used as:

```text
Blueprints
Templates
Base Classes
```

for Child Classes.

---

# Important Rules of Abstract Class

## Rule 1

Abstract Class cannot be instantiated.

Not Allowed:

```java
BankAccount b =
new BankAccount();
```

❌ Error

---

Because:

```text
Abstract Class
is Incomplete
```

---

## Rule 2

Abstract Class can contain:

```text
Abstract Methods
Normal Methods
Constructors
Variables
Getters
Setters
```

---

## Rule 3

Child Classes must implement all abstract methods.

Otherwise:

```text
Child Class
must also be Abstract
```

---

# Understanding Your Parent Class

## BankAccount Class

```java
abstract public class BankAccount
```

This is the Abstract Parent Class.

---

Purpose:

```text
Provide Common Structure
for All Account Types
```

---

# Properties

```java
private String accountNumber;

private double balance;
```

These properties are common for all accounts.

---

Example:

```text
Saving Account
Current Account
```

Both require:

```text
Account Number
Balance
```

---

Therefore these properties are placed inside the Parent Class.

---

# Abstract Methods

Your Code:

```java
public abstract void deposit(
        double amount);
```

---

```java
public abstract void withdraw(
        double amount);
```

---

Notice:

```java
abstract
```

keyword.

---

Abstract Methods:

```text
Have Declaration
But No Implementation
```

---

Example:

```java
public abstract void deposit(
        double amount);
```

No method body:

```java
{
}
```

---

This means:

```text
Every Child Account
Must Decide
How Deposit Works
```

---

# Why Use Abstract Methods?

Parent Class knows:

```text
Deposit Exists
```

But does not know:

```text
How Each Account
Implements It
```

---

Therefore Parent creates a template:

```java
public abstract void deposit(
        double amount);
```

---

Child Classes provide implementation.

---

# Constructor in Abstract Class

Many beginners think:

```text
Abstract Class
Cannot Have Constructor
```

Wrong.

---

Your Code:

```java
public BankAccount(
        String accountNumber,
        double balance)
```

is completely valid.

---

Purpose:

```text
Initialize Common Properties
```

---

Although:

```java
new BankAccount(...)
```

is not allowed,

Child Classes can still call:

```java
super(...)
```

to initialize Parent data.

---

# Normal Methods Inside Abstract Class

Your Code:

```java
public void balance() {
    System.out.println(
            "Balance Printed"
    );
}
```

---

Important:

Abstract Classes can contain:

```text
Normal Methods
```

along with:

```text
Abstract Methods
```

---

This is why Abstract Classes provide:

```text
Partial Abstraction
```

---

# Understanding SavingAccount Class

```java
public class SavingAccount
extends BankAccount
```

---

Meaning:

```text
SavingAccount IS-A BankAccount
```

---

# Constructor

```java
super(
        accountNumber,
        balance
);
```

calls Parent Constructor.

---

Execution Flow:

```text
Create SavingAccount
        │
        ▼
Call BankAccount Constructor
        │
        ▼
Initialize accountNumber
Initialize balance
        │
        ▼
Return To SavingAccount Constructor
```

---

# Implementing Abstract Methods

Your Code:

```java
@Override
public void deposit(
        double amount)
```

---

Implementation:

```java
System.out.println(
        "Deposited Saving: "
        + amount
);
```

---

Similarly:

```java
withdraw()
```

is implemented.

---

Because:

```text
Abstract Methods
Must Be Overridden
```

---

Otherwise:

```text
Compilation Error
```

---

# Understanding CurrentAccount Class

```java
public class CurrentAccount
extends BankAccount
```

---

Also inherits:

```text
accountNumber
balance
```

---

Also must implement:

```text
deposit()
withdraw()
```

---

Your Implementation:

```java
Deposited Current: amount
```

---

```java
Withdraw Current amount
```

---

# Most Important Concept

## Why Must Child Classes Override?

Parent says:

```java
public abstract void deposit(
        double amount);
```

---

This means:

```text
Deposit Exists
But Logic Not Defined
```

---

Child must provide logic.

---

Otherwise Java asks:

```text
How Should Deposit Work?
```

No answer.

---

Therefore:

```text
Compilation Error
```

---

# Understanding Main Program

## Not Allowed

Your Code:

```java
BankAccount bankAccount =
new BankAccount();
```

---

Why?

Because:

```text
Abstract Classes
Cannot Create Objects
```

---

Think of:

```text
Vehicle
```

You cannot create a generic vehicle.

You create:

```text
Car
Bike
Truck
```

---

Similarly:

```text
BankAccount
```

is just a template.

---

Real objects are:

```text
SavingAccount
CurrentAccount
```

---

# Creating SavingAccount Object

```java
SavingAccount savingAccount =
new SavingAccount(
        "892766423",
        6000
);
```

---

Execution:

```text
SavingAccount Constructor
        │
        ▼
BankAccount Constructor
        │
        ▼
Initialize Data
```

---

# Accessing Parent Methods

```java
savingAccount.getAccountNumber();
```

---

Getter belongs to:

```text
BankAccount
```

---

But because:

```text
SavingAccount
extends BankAccount
```

it inherits it.

---

# Polymorphism with Abstract Classes

Your Code:

```java
BankAccount savingAccount1 =
new SavingAccount(
        "09877890",
        870
);
```

---

Reference Type:

```text
BankAccount
```

---

Object Type:

```text
SavingAccount
```

---

This is:

```text
Upcasting
```

---

# Calling deposit()

```java
savingAccount1.deposit(
        900
);
```

---

Question:

Which method executes?

```text
BankAccount.deposit()
```

OR

```text
SavingAccount.deposit()
```

---

Answer:

```text
SavingAccount.deposit()
```

---

Because:

```text
Runtime Polymorphism
```

uses:

```text
Actual Object Type
```

---

# Reusing Same Reference

Your Code:

```java
savingAccount1 =
new CurrentAccount(
        "2313254",
        3400
);
```

---

Now:

Reference:

```text
BankAccount
```

---

Object:

```text
CurrentAccount
```

---

Calling:

```java
savingAccount1.deposit(
        1230
);
```

executes:

```java
CurrentAccount.deposit()
```

---

This is one of the biggest advantages of Abstraction.

---

# Why Use Parent Reference?

Instead of:

```java
SavingAccount s
```

or

```java
CurrentAccount c
```

we use:

```java
BankAccount ref
```

---

Because:

```text
One Reference
Can Handle
Multiple Child Objects
```

---

Example:

```java
BankAccount acc;
```

Later:

```java
acc =
new SavingAccount(...);
```

---

Later:

```java
acc =
new CurrentAccount(...);
```

---

Same reference.

Different behaviors.

---

# Abstraction + Polymorphism Together

Your Code demonstrates both:

---

Abstraction:

```java
abstract class BankAccount
```

---

Polymorphism:

```java
BankAccount acc =
new SavingAccount();
```

---

```java
BankAccount acc =
new CurrentAccount();
```

---

Together they provide:

```text
Flexible Design
Loose Coupling
Extensibility
```

---

# Execution Flow

```text
BankAccount ref
        │
        ▼
SavingAccount Object
        │
        ▼
deposit()
        │
        ▼
SavingAccount.deposit()
```

---

Later:

```text
BankAccount ref
        │
        ▼
CurrentAccount Object
        │
        ▼
deposit()
        │
        ▼
CurrentAccount.deposit()
```

---

# Abstract Class vs Normal Class

| Feature              | Normal Class | Abstract Class |
| -------------------- | ------------ | -------------- |
| Object Creation      | ✔ Allowed    | ❌ Not Allowed  |
| Constructors         | ✔ Yes        | ✔ Yes          |
| Variables            | ✔ Yes        | ✔ Yes          |
| Normal Methods       | ✔ Yes        | ✔ Yes          |
| Abstract Methods     | ❌ No         | ✔ Yes          |
| Inheritance Required | ❌ No         | Usually Yes    |

---

# Advantages of Abstract Classes

## Code Reusability

Common code stays in Parent.

---

## Partial Abstraction

Hide implementation details.

---

## Better Design

Provides standard structure.

---

## Flexibility

Different Child Classes can implement differently.

---

## Supports Runtime Polymorphism

Works perfectly with Parent references.

---

# Key Notes

```text
Abstraction
=
Hide Implementation
Show Functionality
```

---

```text
abstract class
=
Template Class
```

---

```text
Abstract Class
Cannot Create Objects
```

---

```text
Abstract Methods
Have No Body
```

---

```text
Child Classes
Must Override
Abstract Methods
```

---

```text
Abstract Classes
Can Have Constructors
```

---

```text
Abstract Classes
Can Have Normal Methods
```

---

```text
Parent Reference
Can Store Child Objects
```

---

# Quick Revision

```text
Abstract Class
        │
        ▼
Cannot Create Object
```

---

```text
Abstract Method
        │
        ▼
Declaration Only
```

---

```text
Child Class
        │
        ▼
Must Implement
Abstract Methods
```

---

```text
BankAccount
        ▲
   ┌────┴────┐
   │         │
Saving   Current
Account  Account
```

---

```text
Abstraction
+
Polymorphism
=
Powerful Design
```

---

# Interview Questions

## Basic

1. What is Abstraction?
2. Why is Abstraction needed?
3. What is an Abstract Class?
4. What is an Abstract Method?
5. Can we create objects of an Abstract Class?

## Intermediate

6. Can an Abstract Class have constructors?
7. Can an Abstract Class contain normal methods?
8. Why are abstract methods used?
9. Why must Child Classes override abstract methods?
10. What happens if a Child Class does not implement all abstract methods?

## Advanced

11. Why is `BankAccount bank = new BankAccount()` not allowed?
12. Explain how `super()` works in Abstract Classes.
13. Explain the relationship between Abstraction and Polymorphism.
14. Why is `BankAccount ref = new SavingAccount()` valid?
15. Explain runtime method resolution in your abstraction example.

---

# One-Line Definition

> Abstraction is the OOP principle that hides implementation details and exposes only essential functionality, commonly achieved in Java using Abstract Classes and Interfaces.
