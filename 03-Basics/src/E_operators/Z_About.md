# OPERATORS IN JAVA

## Study Topics

1. What are Operators?
2. Types of Operators
3. Operator Classification
4. Arithmetic Operators
5. Relational Operators
6. Logical Operators
7. Assignment Operators
8. Unary Operators
9. Bitwise Operators
10. Ternary Operator
11. Operator Precedence
12. Interview Questions

---

# What Are Operators?

Operators are special symbols used to perform operations on operands (variables or values).

Example:

```java
int a = 10;
int b = 20;

int sum = a + b;
```

Here:

```text
a and b  → Operands
+        → Operator
sum      → Result
```

Operators help perform:

* Calculations
* Comparisons
* Logical Decisions
* Assignments
* Bit Manipulation

---

# Types of Operators in Java

Java provides the following categories:

```text
Operators
│
├── Arithmetic
├── Relational
├── Logical
├── Assignment
├── Unary
├── Bitwise
└── Ternary
```

---

# Operator Classification

Based on number of operands:

## Unary Operator

Works on one operand.

Example:

```java
++a
```

---

## Binary Operator

Works on two operands.

Example:

```java
a + b
```

---

## Ternary Operator

Works on three operands.

Example:

```java
condition ? value1 : value2
```

---

# Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning        |
| -------- | -------------- |
| +        | Addition       |
| -        | Subtraction    |
| *        | Multiplication |
| /        | Division       |
| %        | Modulus        |

Example:

```java
int a = 10;
int b = 5;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

Output:

```text
15
5
50
2
0
```

---

## Integer Division

```java
10 / 3
```

Output:

```text
3
```

Decimal portion is discarded.

---

## Decimal Division

```java
(double)10 / 3
```

Output:

```text
3.3333333333333335
```

---

## Modulus Operator (%)

Returns remainder.

Example:

```java
10 % 3
```

Output:

```text
1
```

Explanation:

```text
10 ÷ 3 = 3 remainder 1
```

---

# Relational Operators

Used to compare values.

Result always:

```text
true
or
false
```

| Operator | Meaning                  |
| -------- | ------------------------ |
| ==       | Equal To                 |
| !=       | Not Equal To             |
| >        | Greater Than             |
| <        | Less Than                |
| >=       | Greater Than or Equal To |
| <=       | Less Than or Equal To    |

Example:

```java
int a = 10;
int b = 5;

System.out.println(a > b);
```

Output:

```text
true
```

---

## Difference Between = and ==

Assignment:

```java
int a = 10;
```

Comparison:

```java
a == 10
```

```text
=  → Assign Value
== → Compare Value
```

---

# Logical Operators

Used to combine boolean expressions.

| Operator | Meaning     |
| -------- | ----------- |
| &&       | Logical AND |
| ||       | Logical OR  |
| !        | Logical NOT |

---

## Logical AND (&&)

Returns true only when both conditions are true.

Truth Table:

| A | B | A && B |
| - | - | ------ |
| T | T | T      |
| T | F | F      |
| F | T | F      |
| F | F | F      |

Example:

```java
boolean result = (10 > 5) && (20 > 10);
```

Output:

```text
true
```

---

## Logical OR (||)

Returns true if at least one condition is true.

Truth Table:

| A | B | A || B |
| - | - | ------ |
| T | T | T      |
| T | F | T      |
| F | T | T      |
| F | F | F      |

---

## Logical NOT (!)

Reverses boolean value.

Example:

```java
!true
```

Output:

```text
false
```

---

## Short Circuit Evaluation

### AND (&&)

If first condition is false:

```java
false && anything
```

Second condition is never checked.

---

### OR (||)

If first condition is true:

```java
true || anything
```

Second condition is never checked.

---

# Assignment Operators

Used to assign values.

| Operator | Meaning             |
| -------- | ------------------- |
| =        | Assign              |
| +=       | Add and Assign      |
| -=       | Subtract and Assign |
| *=       | Multiply and Assign |
| /=       | Divide and Assign   |
| %=       | Modulus and Assign  |

---

## Assignment (=)

```java
int x = 10;
```

---

## Add and Assign (+=)

```java
x += 5;
```

Equivalent:

```java
x = x + 5;
```

---

## Subtract and Assign (-=)

```java
x -= 5;
```

Equivalent:

```java
x = x - 5;
```

---

## Multiply and Assign (*=)

```java
x *= 5;
```

Equivalent:

```java
x = x * 5;
```

---

## Divide and Assign (/=)

```java
x /= 5;
```

Equivalent:

```java
x = x / 5;
```

---

## Modulus and Assign (%=)

```java
x %= 3;
```

Equivalent:

```java
x = x % 3;
```

---

# Unary Operators

Work on a single operand.

| Operator | Meaning     |
| -------- | ----------- |
| +        | Unary Plus  |
| -        | Unary Minus |
| ++       | Increment   |
| --       | Decrement   |
| !        | Logical NOT |

---

## Unary Plus

```java
+x
```

Returns positive value.

---

## Unary Minus

```java
-x
```

Changes sign.

Example:

```text
10 → -10
```

---

# Increment Operator (++)

Increases value by 1.

---

## Pre Increment

```java
++x
```

Flow:

```text
Increment First
       ↓
Use Value
```

Example:

```java
int x = 5;

System.out.println(++x);
```

Output:

```text
6
```

---

## Post Increment

```java
x++
```

Flow:

```text
Use Value
      ↓
Increment
```

Example:

```java
int x = 5;

System.out.println(x++);
```

Output:

```text
5
```

Final Value:

```text
6
```

---

# Decrement Operator (--)

Decreases value by 1.

---

## Pre Decrement

```java
--x
```

Output:

```text
4
```

---

## Post Decrement

```java
x--
```

Output:

```text
5
```

Final Value:

```text
4
```

---

# Bitwise Operators

Operate directly on binary bits.

| Operator | Meaning              |
| -------- | -------------------- |
| &        | Bitwise AND          |
| |        | Bitwise OR           |
| ^        | Bitwise XOR          |
| ~        | Bitwise Complement   |
| <<       | Left Shift           |
| >>       | Right Shift          |
| >>>      | Unsigned Right Shift |

---

## Bitwise AND (&)

Example:

```text
5 = 0101
3 = 0011
---------
& = 0001
```

Output:

```text
1
```

---

## Bitwise OR (|)

Example:

```text
5 = 0101
3 = 0011
---------
| = 0111
```

Output:

```text
7
```

---

## Bitwise XOR (^)

Returns 1 when bits differ.

Example:

```text
5 = 0101
3 = 0011
---------
^ = 0110
```

Output:

```text
6
```

---

## Bitwise Complement (~)

Flips all bits.

Example:

```java
~5
```

Output:

```text
-6
```

(Java uses 2's Complement representation.)

---

## Left Shift (<<)

```java
5 << 1
```

Output:

```text
10
```

Explanation:

```text
5 × 2¹
```

---

## Right Shift (>>)

```java
10 >> 1
```

Output:

```text
5
```

Explanation:

```text
10 ÷ 2¹
```

---

## Unsigned Right Shift (>>>)

Fills leftmost bits with 0.

Example:

```java
20 >>> 2
```

Output:

```text
5
```

---

# Ternary Operator

Shorthand form of if-else.

Syntax:

```java
condition ? expression1 : expression2
```

---

## Example 1 : Adult or Minor

```java
int age = 20;

String result =
(age >= 18) ? "Adult" : "Minor";
```

Output:

```text
Adult
```

---

## Example 2 : Maximum Number

```java
int max =
(a > b) ? a : b;
```

---

## Example 3 : Even or Odd

```java
String result =
(number % 2 == 0) ? "Even" : "Odd";
```

---

## Equivalent if-else

Ternary:

```java
(age >= 18)
? "Adult"
: "Minor";
```

Equivalent:

```java
if(age >= 18)
{
    result = "Adult";
}
else
{
    result = "Minor";
}
```

---

# Operator Precedence Table

| Priority (High → Low) | Category       | Operators                |
| --------------------- | -------------- | ------------------------ |
| 1                     | Postfix        | expr++, expr--           |
| 2                     | Unary          | ++, --, +, -, ~, !       |
| 3                     | Multiplicative | *, /, %                  |
| 4                     | Additive       | +, -                     |
| 5                     | Shift          | <<, >>, >>>              |
| 6                     | Relational     | <, >, <=, >=, instanceof |
| 7                     | Equality       | ==, !=                   |
| 8                     | Bitwise AND    | &                        |
| 9                     | Bitwise XOR    | ^                        |
| 10                    | Bitwise OR     | |                        |
| 11                    | Logical AND    | &&                       |
| 12                    | Logical OR     | ||                       |
| 13                    | Ternary        | ? :                      |
| 14                    | Assignment     | =, +=, -=, *=, /=, %=    |

---

# Quick Revision

```text
Operators
│
├── Arithmetic      (+ - * / %)
├── Relational      (== != > < >= <=)
├── Logical         (&& || !)
├── Assignment      (= += -= *= /= %=)
├── Unary           (+ - ++ -- !)
├── Bitwise         (& | ^ ~ << >> >>>)
└── Ternary         (? :)
```

---

# Interview Questions

## Basic

1. What are Operators in Java?
2. What is an Operand?
3. How many operator categories exist in Java?
4. Difference between = and ==?
5. What is Integer Division?

---

## Intermediate

6. Difference between Arithmetic and Relational Operators.
7. What does Modulus Operator return?
8. What is Short Circuit Evaluation?
9. Difference between && and &?
10. Difference between || and |?

---

## Advanced

11. Difference between Pre Increment and Post Increment.
12. Difference between Pre Decrement and Post Decrement.
13. How does Bitwise AND work?
14. What is XOR used for?
15. Why does ~5 return -6?
16. Difference between >> and >>>?
17. What is Operator Precedence?
18. Which operator has highest precedence?
19. How does the Ternary Operator work?
20. When should Ternary be preferred over if-else?

---

# One-Line Definition

> Operators are special symbols that perform mathematical, logical, relational, assignment, bitwise, and conditional operations on operands in a Java program.
