# VARIABLES IN JAVA

## Study Topics

1. What is a Variable?
2. Variable Declaration
3. Variable Initialization
4. Declaration + Initialization
5. Variable Reassignment
6. Constants (`final`)
7. Output Methods
8. Comments in Java
9. Variable Naming Rules
10. Naming Conventions
11. Valid and Invalid Identifiers
12. Case Sensitivity
13. Quick Revision
14. Interview Questions

---

# What is a Variable?

A Variable is a named memory location used to store data.

Variables act like containers that hold values which can be used and modified during program execution.

Example:

```java
int age = 20;
String name = "Asif";
```

Here:

```text
age
name
```

are variables.

---

# Variable Declaration

Declaration means creating a variable and specifying its data type.

Syntax:

```java
DataType variableName;
```

Example:

```java
int a;
String name;
```

At this stage:

```text
Variable Exists
Value Not Assigned
```

---

# Variable Initialization

Initialization means assigning a value to a variable.

Example:

```java
a = 10;
name = "Java";
```

Now:

```text
a contains 10
name contains Java
```

---

# Declaration + Initialization

Both can be done together.

Syntax:

```java
DataType variableName = value;
```

Example:

```java
int b = 20;
```

This is the most common approach.

---

# Variable Reassignment

Variables can store new values after initialization.

Example:

```java
int a = 10;

a = 80;
```

Initial Value:

```text
10
```

Updated Value:

```text
80
```

The old value is replaced.

---

# Output in Java

## Using println()

Syntax:

```java
System.out.println(value);
```

Example:

```java
System.out.println(a);
System.out.println(name);
```

Output:

```text
80
Java
```

---

# String Concatenation

Multiple values can be combined using:

```java
+
```

Example:

```java
System.out.println(
    "Hello! " +
    name +
    ". You are " +
    b +
    " years old"
);
```

Output:

```text
Hello! Java. You are 20 years old
```

---

# String Templates (Modern Java)

Java introduced String Templates to simplify string creation.

Example:

```java
System.out.println(
    STR."Hello, \{name}. You are \{b} years old"
);
```

This is a modern alternative to concatenation.

---

# Constants in Java

Sometimes a value should never change.

For such cases Java provides:

```java
final
```

keyword.

---

## Syntax

```java
final DataType VARIABLE_NAME = value;
```

Example:

```java
final int CONST_VALUE = 50;
```

---

## Why Use final?

Once assigned:

```java
CONST_VALUE = 100;
```

is not allowed.

Compiler Error:

```text
cannot assign a value to final variable
```

---

## Constant Naming Convention

Constants are usually written in:

```text
UPPER_CASE_WITH_UNDERSCORES
```

Example:

```java
final int MAX_SPEED = 120;
final double PI_VALUE = 3.14;
```

---

# Comments in Java

Comments are ignored by the compiler.

They are used to explain code.

---

## Single Line Comment

```java
// This is a single line comment
```

---

## Multi Line Comment

```java
/*
This is
a multi-line
comment
*/
```

---

## JavaDoc Comment

Used for documentation.

```java
/**
 * Documentation Comment
 */
```

JavaDoc can generate professional documentation from source code.

---

# Variable Naming Rules

Java follows strict rules for variable names.

---

## Rule 1 : Case Sensitive

Java is case-sensitive.

Example:

```java
int number = 10;
int Number = 20;
```

These are different variables.

Output:

```text
number = 10
Number = 20
```

---

## Rule 2 : First Character

Variable names can start with:

* Letter
* Underscore (_)
* Dollar Sign ($)

Examples:

```java
int age;
int _score;
int $total;
```

---

## Rule 3 : Cannot Start with Digit

Invalid:

```java
int 1fast = 50;
```

Reason:

```text
Variable names cannot begin with numbers.
```

---

## Rule 4 : Allowed Characters

After the first character:

* Letters
* Digits
* Underscores
* Dollar Signs

are allowed.

Example:

```java
int studentCount1;
int gear_ratio;
```

---

## Rule 5 : Spaces Not Allowed

Invalid:

```java
int total marks = 100;
```

Reason:

```text
Spaces are not allowed in variable names.
```

---

## Rule 6 : Special Characters Not Allowed

Invalid:

```java
int @rate = 10;
int student-count = 40;
```

Reason:

```text
Special symbols are not allowed.
```

---

## Rule 7 : Keywords Cannot Be Used

Invalid:

```java
int class = 1;
int for = 5;
```

Reason:

```text
Java Keywords are reserved.
```

---

# Naming Conventions

Naming conventions improve readability.

---

## Normal Variables

Use:

```text
lowerCamelCase
```

Examples:

```java
studentCount
gearRatio
totalMarks
employeeSalary
```

---

## Constants

Use:

```text
UPPER_CASE_WITH_UNDERSCORES
```

Examples:

```java
MAX_SPEED
PI_VALUE
DEFAULT_PORT
```

---

# Valid Variable Names

Examples:

```java
int age;
int studentCount;
int gearRatio;
int _score;
int $total;
final int MAX_SPEED = 120;
```

---

# Invalid Variable Names

Examples:

```java
int 1fast = 50;
```

Reason:

```text
Starts with digit
```

---

```java
int student-count = 40;
```

Reason:

```text
Hyphen not allowed
```

---

```java
int total marks = 100;
```

Reason:

```text
Space not allowed
```

---

```java
int for = 5;
```

Reason:

```text
Keyword
```

---

```java
int class = 1;
```

Reason:

```text
Reserved Keyword
```

---

```java
int @rate = 10;
```

Reason:

```text
Special Character
```

---

# Example Program Summary

```java
int a;
a = 10;

int b = 20;

a = 80;

String name = "Java";

final int CONST_VALUE = 50;
```

This program demonstrates:

* Declaration
* Initialization
* Reassignment
* Constants
* Output Statements
* Comments

---

# Quick Revision

```text
Variable
     │
     ▼
Stores Data
```

---

```text
Declaration
     │
     ▼
int age;
```

---

```text
Initialization
     │
     ▼
age = 25;
```

---

```text
Declaration + Initialization
     │
     ▼
int age = 25;
```

---

```text
Reassignment
     │
     ▼
age = 30;
```

---

```text
Constant
     │
     ▼
final int MAX_SPEED = 120;
```

---

```text
Variable Naming
     │
     ├── Letter
     ├── _
     └── $
```

---

```text
Comments
     │
     ├── //
     ├── /* */
     └── /** */
```

---

# Interview Questions

## Basic

1. What is a variable in Java?
2. What is the difference between declaration and initialization?
3. What is variable reassignment?
4. What is a constant?
5. Why do we use the final keyword?

---

## Intermediate

6. What is the difference between a variable and a constant?
7. Explain different types of comments in Java.
8. What is String Concatenation?
9. What are String Templates?
10. Why is Java case-sensitive?

---

## Advanced

11. What are Java variable naming rules?
12. What is the difference between valid and invalid identifiers?
13. Can a variable start with a digit? Why?
14. Why can't Java keywords be used as variable names?
15. What naming convention is followed for constants?
16. What is lowerCamelCase?
17. What happens if we try to modify a final variable?
18. Why are comments important in software development?
19. Explain JavaDoc comments and their purpose.
20. What is the difference between compile-time errors caused by invalid identifiers and runtime errors?

---

# One-Line Definition

> A Variable is a named memory location used to store data, while a Constant is a fixed value declared using the `final` keyword that cannot be changed after initialization.
