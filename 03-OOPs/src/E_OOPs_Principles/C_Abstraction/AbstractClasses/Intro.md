# ABSTRACTION IN JAVA (ABSTRACT CLASSES)

## Abstract Classes and Abstract Methods

---

# What is Abstraction?

Abstraction is one of the four pillars of Object-Oriented Programming (OOP).

Abstraction means:

```text
Showing Essential Information
and
Hiding Internal Implementation
```

### Simple Definition

> Abstraction is the process of hiding implementation details and showing only the necessary functionality to the user.

---

# Real-Life Example

Consider an:

```text
ATM Machine
```

You can perform:

```text
Withdraw Money
Deposit Money
Check Balance
```

But you do not need to know the internal details such as:

```text
Database Queries
Server Communication
Transaction Processing
```

The user works with the required functionality without dealing with its internal implementation.

That is the basic idea of **abstraction**.

---

# Why Do We Need Abstraction?

Without abstraction, someone using a class may have to know how the class works internally, even when they only need to use its functionality.

### Benefits

- Reduces unnecessary complexity
- Makes code easier to use
- Improves maintainability
- Provides a clear structure or contract
- Allows different classes to provide different implementations

---

# Ways to Achieve Abstraction in Java

Java provides two main approaches:

| Approach | Abstraction Level |
|---|---|
| **Abstract Class** | **Partial Abstraction** |
| **Interface** | **Full Abstraction (Traditionally)** |

### Abstract Class — Partial Abstraction

An abstract class can contain both:

- **Concrete methods** → implementation is provided
- **Abstract methods** → only the method declaration is provided; the child class provides the implementation

Therefore, an abstract class can provide **partial abstraction**.

### Interface — Full Abstraction (Traditionally)

Traditionally, an interface was used to define what a class must do without providing the implementation of its abstract methods.

```text
Interface
   ↓
Defines WHAT must be done
   ↓
Implementing Class
   ↓
Defines HOW it is done
```

> **Important:** The term **Full Abstraction** is traditionally associated with interfaces. Modern Java interfaces can also contain methods with implementations, so this term is used in the traditional/basic sense.

Further details about interfaces are covered in the **Abstraction → Interface** topic.

---

# What is an Abstract Class?

An abstract class is a class declared using the `abstract` keyword.

```java
abstract class BankAccount {

}
```

An abstract class is commonly used as a:

```text
Blueprint
Template
Base Class
```

for related child classes.

---

# Important Rules of Abstract Class

### Rule 1 — Cannot Be Instantiated

An abstract class cannot be used to create an object directly.

```java
BankAccount b = new BankAccount();   // ❌ Not allowed
```

However, a reference of an abstract class can refer to a child object:

```java
BankAccount b = new SavingAccount(); // ✅
```

---

### Rule 2 — Can Contain Different Types of Members

An abstract class can define:

- Instance variables
- Static and final members
- Constructors
- Concrete methods with implementation
- Abstract methods without implementation
- Nested classes or interfaces

Getters and setters are simply normal methods; they are not a separate member type.

---

### Rule 3 — Child Class Must Implement Abstract Methods

If a child class extends an abstract class, it must implement all inherited abstract methods.

Otherwise, the child class must also be declared `abstract`.

```java
abstract class BankAccount {
    abstract void deposit(double amount);
}

class SavingAccount extends BankAccount {

    @Override
    void deposit(double amount) {
        System.out.println("Saving account deposit");
    }
}
```

---

# Abstract Method

An abstract method is a method that has a declaration but no implementation.

```java
abstract void deposit(double amount);
```

It does not contain a method body:

```java
// ❌ Not an abstract method
void deposit(double amount) {
}
```

An abstract method tells the child class:

```text
WHAT operation must exist
```

but leaves:

```text
HOW the operation works
```

to the child class.

---

# Why Use Abstract Methods?

The parent class may know that a particular operation is required, but different child classes may need different implementations.

For example:

```text
BankAccount
    │
    ├── SavingAccount
    │      └── deposit() → Saving-specific logic
    │
    └── CurrentAccount
           └── deposit() → Current-specific logic
```

The parent defines the required operation, while each child defines its own behavior.

---

# Constructor in an Abstract Class

An abstract class **can have constructors**.

```java
abstract class BankAccount {

    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
```

You cannot create the abstract class directly:

```java
new BankAccount("123", 5000);   // ❌
```

But its constructor can still be called by a child class using `super()`:

```java
class SavingAccount extends BankAccount {

    SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}
```

The constructor is useful for initializing data that is common to all child classes.

---

# Concrete Methods in an Abstract Class

An abstract class can also contain normal methods with implementation.

```java
abstract class BankAccount {

    void showBalance() {
        System.out.println("Balance shown");
    }

    abstract void deposit(double amount);
}
```

Here:

```text
showBalance() → implementation is provided
 deposit()    → implementation is left to child classes
```

This combination is the reason an abstract class is considered **partial abstraction**.

---

# Abstraction and Polymorphism Together

Abstract classes are often used together with parent references and runtime polymorphism.

```java
BankAccount account = new SavingAccount("09877890", 870);
account.deposit(900);

account = new CurrentAccount("2313254", 3400);
account.deposit(1230);
```

Here:

```text
Reference Type → BankAccount
Actual Object  → SavingAccount / CurrentAccount
```

The same parent reference can be reused for different child objects.

The overridden method that executes depends on the **actual object created at runtime**.

This allows one common reference to work with multiple child implementations.

---

# Abstract Class vs Normal Class

| Feature | Normal Class | Abstract Class |
|---|---|---|
| Object creation | ✅ Allowed | ❌ Not directly allowed |
| Constructor | ✅ Yes | ✅ Yes |
| Instance variables | ✅ Yes | ✅ Yes |
| Concrete methods | ✅ Yes | ✅ Yes |
| Abstract methods | ❌ No | ✅ Yes |
| Can be extended | ✅ Yes | ✅ Yes |

---

# Abstract Class vs Interface 

| Feature                   | Abstract Class                                    | Interface                                                         |
| ------------------------- | ------------------------------------------------- | ----------------------------------------------------------------- |
| **Purpose**               | Used when classes share common state and behavior | Used to define a contract/capability                              |
| **Keyword**               | `abstract class`                                  | `interface`                                                       |
| **Methods**               | Can have abstract and concrete methods            | Can have abstract, default, static, and private methods (Java 9+) |
| **Variables / Fields**    | Can have instance, static, and final variables    | Variables are implicitly `public static final` (constants)        |
| **Constructors**          | ✔ Allowed                                         | ✘ Not Allowed                                                     |
| **Object Creation**       | ✘ Cannot instantiate directly                     | ✘ Cannot instantiate directly                                     |
| **Access Modifiers**      | Can use `private`, `protected`, `public`, etc.    | Methods are `public` by default                                   |
| **Multiple Inheritance**  | ✘ Not Supported                                   | ✔ Supported through multiple interfaces                           |
| **Inheritance Keyword**   | `extends`                                         | `implements`                                                      |
| **State (Data Storage)**  | ✔ Can store object state                          | ✘ Should not store object state                                   |
| **Method Implementation** | Can provide partial implementation                | Mainly defines a contract                                         |
| **Relationship Type**     | **IS-A** Relationship                             | **CAN-DO** Relationship                                           |
| **Use Case**              | Related classes sharing common code               | Unrelated classes sharing common capability                       |
| **Example**               | `Vehicle → Car, Bike`                             | `Flyable → Bird, Drone, Plane`                                    |
| **Common Variables**      | ✔ Supported                                       | ✘ Not Supported (except constants)                                |
| **Common Constructors**   | ✔ Supported                                       | ✘ Not Supported                                                   |
| **Best For**              | Common state + common behavior                    | Common capability/contract                                        |

---

# Advantages of Abstract Classes

### Code Reusability

Common data and behavior can be placed in the parent class and reused by child classes.

### Partial Abstraction

The parent can provide some implementation while leaving specific behavior to child classes.

### Standard Structure

All child classes are required to follow the abstract methods defined by the parent.

### Runtime Polymorphism

Abstract-class references can refer to different child objects, allowing different implementations through a common type.

---

# Key Points

```text
Abstraction
→ Hide unnecessary implementation details
→ Show required functionality
```

```text
Abstract Class
→ Cannot be instantiated directly
→ Can have constructors
→ Can have variables
→ Can have concrete methods
→ Can have abstract methods
```

```text
Abstract Method
→ Declaration only
→ No implementation
→ Child class must implement it
```

```text
Parent Reference
→ Can refer to a child object
→ Can be reused for different child objects
```

```text
Abstract Class + Polymorphism
→ Common structure + Different child behavior
```

---

# One-Line Definition

> Abstraction is the OOP principle of hiding unnecessary implementation details and exposing only the essential functionality, commonly achieved in Java using abstract classes and interfaces.
