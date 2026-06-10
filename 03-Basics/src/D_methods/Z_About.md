# METHODS IN JAVA

## Study Topics

1. What is a Method?
2. Why Methods are Needed
3. Method Syntax
4. Method Calling
5. Parameters and Arguments
6. Return Types
7. Method Reusability
8. Access Modifiers and Static Methods
9. Advantages of Methods
10. Interview Questions

---

# What is a Method?

A Method is a block of code that performs a specific task.

Instead of writing the same code repeatedly, we place it inside a method and call it whenever needed.

Think of a method as a reusable machine:

```text
Input
  ↓
Method
  ↓
Output
```

---

# Why Methods are Needed?

Without methods:

```java
System.out.println("Hello");
System.out.println("Welcome to Skywards");

System.out.println("Hello");
System.out.println("Welcome to Skywards");

System.out.println("Hello");
System.out.println("Welcome to Skywards");
```

The same code is repeated multiple times.

Problems:

* Code duplication
* Difficult maintenance
* More chances of mistakes

Methods solve this problem by keeping the code in one place.

---

# Method Creation Syntax

```java
accessModifier static returnType methodName() {

    // code
}
```

Example:

```java
private static void sayHello() {

    System.out.println("Hello");
}
```

---

# Understanding Method Syntax

```java
private static void sayHello()
```

| Part     | Meaning                                |
| -------- | -------------------------------------- |
| private  | Accessible only inside the same class  |
| static   | Can be used without creating an object |
| void     | Returns nothing                        |
| sayHello | Method Name                            |
| ()       | Parameter List                         |

---

# Method Calling

After creating a method, it must be called.

Example:

```java
sayHello();
```

Method execution begins only after it is called.

---

# How Methods Work

```text
Method Definition
        ↓
Method Call
        ↓
Control moves to Method
        ↓
Statements Execute
        ↓
Control returns to Caller
```

---

# Example 1 : Simple Method

## Method Definition

```java
private static void sayHello() {

    System.out.println("Hello");
    System.out.println("Welcome to Skywards");
}
```

## Method Call

```java
sayHello();
```

## Output

```text
Hello
Welcome to Skywards
```

---

# Method Reusability

One method can be called many times.

Example:

```java
sayHello();
sayHello();
sayHello();
```

Output:

```text
Hello
Welcome to Skywards

Hello
Welcome to Skywards

Hello
Welcome to Skywards
```

The method is written once but executed multiple times.

This is called:

```text
Code Reusability
```

---

# Parameters

Parameters are variables declared inside the method definition.

They receive values from the caller.

Example:

```java
private static void sayHello(String name)
```

Here:

```text
String → Data Type

name → Parameter
```

---

# Arguments

Arguments are actual values passed during method calls.

Example:

```java
sayHello("John");
```

Here:

```text
"John" → Argument
```

---

# Parameter vs Argument

| Parameter          | Argument           |
| ------------------ | ------------------ |
| Declared in method | Passed during call |
| Placeholder        | Actual value       |
| Receives value     | Sends value        |

Example:

```java
private static void sayHello(String name)
```

```java
sayHello("John");
```

```text
Parameter → name

Argument → "John"
```

---

# Example 2 : Method With Parameter

## Method

```java
private static void sayHello(String name) {

    System.out.println("Hello, " + name);
}
```

## Calls

```java
sayHello("John");
sayHello("Michael");
sayHello("Mohan");
sayHello("Sunil");
```

## Output

```text
Hello, John
Hello, Michael
Hello, Mohan
Hello, Sunil
```

Same method, different inputs.

---

# Return Type

A method can return a value after execution.

Syntax:

```java
returnType methodName() {

    return value;
}
```

Example:

```java
private static int add(int a, int b)
```

Return Type:

```text
int
```

Meaning:

```text
This method will return an integer value.
```

---

# Example 3 : Method Returning Value

## Method

```java
private static int add(int a, int b) {

    return a + b;
}
```

## Method Call

```java
int result = add(10,20);
```

## Output

```text
30
```

---

# Flow of Return Statement

```text
add(10,20)
      ↓
a = 10
b = 20
      ↓
a + b
      ↓
30
      ↓
return 30
      ↓
Stored in result variable
```

---

# Understanding void

A method declared as:

```java
void
```

returns nothing.

Example:

```java
private static void sayHello()
```

This method only performs a task.

It does not return any value.

---

# Understanding static

Your Code:

```java
private static void sayHello()
```

Why static?

Because:

```java
sayHello();
```

is called directly inside main().

Without static:

```java
Methods obj = new Methods();
obj.sayHello();
```

would be required.

Therefore:

```text
static allows a method to belong to the class itself
instead of an object.
```

---

# Understanding private

Your Code:

```java
private static void sayHello()
```

private means:

```text
Only this class can use this method.
```

Other classes cannot call it.

Example:

```java
Methods.sayHello();
```

Not allowed from another class.

---

# Advantages of Methods

* Code Reusability
* Reduced Code Duplication
* Better Readability
* Easier Maintenance
* Modular Programming
* Easier Debugging
* Better Code Organization

---

# Important Terminology

| Term              | Meaning                            |
| ----------------- | ---------------------------------- |
| Method Definition | Creating a method                  |
| Method Call       | Executing a method                 |
| Parameter         | Variable inside method declaration |
| Argument          | Actual value passed                |
| Return Type       | Type of value returned             |
| void              | Returns nothing                    |
| static            | Belongs to class                   |
| private           | Accessible only inside same class  |

---

# Complete Flow of Your Program

```text
main()
 │
 ├── sayHello()
 │
 ├── sayHello()
 │
 ├── sayHello()
 │
 ├── sayHello("John")
 │
 ├── sayHello("Michael")
 │
 ├── sayHello("Mohan")
 │
 ├── sayHello("Sunil")
 │
 └── add(10,20)
          │
          ▼
         30
          │
          ▼
      result
```

---

# Quick Revision

```text
Method
│
├── Performs Specific Task
├── Reusable
├── Can Accept Parameters
├── Can Return Value
└── Improves Code Organization
```

---

# Interview Questions

## Basic

1. What is a Method in Java?
2. Why are methods used?
3. What is the syntax of a method?
4. What is method calling?
5. What is code reusability?

---

## Intermediate

6. Difference between Parameter and Argument.
7. What is a Return Type?
8. What is the purpose of void?
9. Why is static used with methods?
10. Why is private used with methods?

---

## Advanced

11. Can a method return multiple values?
12. What happens if a method has no return statement?
13. Difference between static and non-static methods.
14. Can main() call a non-static method directly?
15. What is method overloading?
16. What happens internally when a method is called?
17. What is the method call stack?
18. Can methods call other methods?
19. What is recursion?
20. Why are methods important in modular programming?

---

# One-Line Definition

> A Method is a reusable block of code that performs a specific task, can accept inputs through parameters, and may return a value after execution.
