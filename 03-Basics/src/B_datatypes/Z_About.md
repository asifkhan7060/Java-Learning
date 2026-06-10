# DATA TYPES IN JAVA

## Study Topics

1. What is a Data Type?
2. Categories of Data Types
3. Primitive Data Types
4. Non-Primitive Data Types
5. Size, Range, and Default Values
6. Character and Unicode Support
7. String Data Type
8. Arrays
9. float vs double
10. Quick Revision
11. Interview Questions

---

# What is a Data Type?

A Data Type defines the type of data that a variable can store.

It tells Java:

* What value can be stored
* How much memory is required
* What operations can be performed

---

## Example

```java
int age = 25;
```

Here:

```text
Variable : age
Data Type : int
Value : 25
```

---

```java
String name = "Java";
```

Here:

```text
Variable : name
Data Type : String
Value : Java
```

---

## Simple Definition

> A Data Type specifies the kind of value a variable can store and how much memory it occupies.

---

# Categories of Data Types

Java Data Types are divided into two categories:

```text
Data Types
│
├── Primitive Data Types
│
└── Non-Primitive Data Types
```

---

# Primitive Data Types

Primitive Data Types are predefined by Java.

They directly store actual values in memory.

Java provides:

```text
8 Primitive Data Types
```

---

## Primitive Data Types List

| Type    | Size           | Example                  |
| ------- | -------------- | ------------------------ |
| byte    | 8-bit          | byte b = 10;             |
| short   | 16-bit         | short s = 200;           |
| int     | 32-bit         | int age = 25;            |
| long    | 64-bit         | long views = 1000000L;   |
| float   | 32-bit Decimal | float pi = 3.14f;        |
| double  | 64-bit Decimal | double price = 99.99;    |
| char    | 16-bit Unicode | char grade = 'A';        |
| boolean | true / false   | boolean isActive = true; |

---

# Non-Primitive Data Types

Non-Primitive Data Types are created by Java or by programmers.

They store references to objects rather than actual values directly.

Examples:

* String
* Arrays
* Classes
* Interfaces
* Records
* Enums

---

## Diagram

```text
Data Types
│
├── Primitive
│    ├── byte
│    ├── short
│    ├── int
│    ├── long
│    ├── float
│    ├── double
│    ├── char
│    └── boolean
│
└── Non-Primitive
     ├── String
     ├── Arrays
     ├── Classes
     └── Interfaces
```

---

# Primitive Data Types Detailed Table

| Type    | Size          | Range                                                   | Default Value |
| ------- | ------------- | ------------------------------------------------------- | ------------- |
| byte    | 1 byte        | -128 to 127                                             | 0             |
| short   | 2 bytes       | -32,768 to 32,767                                       | 0             |
| int     | 4 bytes       | -2,147,483,648 to 2,147,483,647                         | 0             |
| long    | 8 bytes       | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 0L            |
| float   | 4 bytes       | ±3.4E−38 to ±3.4E+38                                    | 0.0f          |
| double  | 8 bytes       | ±1.7E−308 to ±1.7E+308                                  | 0.0d          |
| char    | 2 bytes       | 0 to 65,535                                             | '\u0000'      |
| boolean | JVM Dependent | true / false                                            | false         |

---

# byte Data Type

Used for storing very small integers.

Example:

```java
byte b1 = 127;
```

Output:

```text
127
```

Range:

```text
-128 to 127
```

Memory:

```text
1 Byte
```

---

# short Data Type

Used when values are larger than byte but smaller than int.

Example:

```java
short marks = 32000;
```

Memory:

```text
2 Bytes
```

---

# int Data Type

Most commonly used integer type.

Example:

```java
int age = 25;
```

Memory:

```text
4 Bytes
```

---

# long Data Type

Used for very large integer values.

Example:

```java
long population = 9000000000L;
```

Notice:

```text
L suffix is recommended
```

Memory:

```text
8 Bytes
```

---

# float Data Type

Stores decimal values.

Example:

```java
float pi = 3.14f;
```

Important:

```text
f or F suffix is compulsory
```

Without:

```java
float pi = 3.14;
```

Compiler Error occurs.

---

## Example

```java
float pi = 3.1483467575376975f;
```

Output:

```text
3.1483467
```

Less precision.

---

# double Data Type

Stores decimal values with higher precision.

Example:

```java
double price = 99.99;
```

---

## Example

```java
double price = 99.9938637463476370567;
```

Output:

```text
99.99386374634764
```

More precision than float.

---

# float vs double

| Feature         | float            | double        |
| --------------- | ---------------- | ------------- |
| Size            | 4 Bytes          | 8 Bytes       |
| Precision       | Less             | More          |
| Suffix Required | Yes (f)          | No            |
| Usage           | Memory Efficient | More Accurate |

---

# char Data Type

Stores a single character.

Example:

```java
char grade = 'A';
```

Output:

```text
A
```

Important:

```text
Always use Single Quotes
```

Correct:

```java
char grade = 'A';
```

Wrong:

```java
char grade = "A";
```

---

# Unicode Support in Java

Java uses Unicode.

Unicode allows storing characters from almost every language.

---

## Example

```java
char unicodeDemo = '\u20AC';
```

Output:

```text
€
```

(Euro Symbol)

---

## Unicode Structure

```text
\uXXXX
```

Where:

```text
XXXX = Hexadecimal Unicode Value
```

---

## Example Unicode Characters

| Unicode | Character |
| ------- | --------- |
| \u0041  | A         |
| \u20AC  | €         |
| \u2665  | ♥         |
| \u2605  | ★         |

---

# boolean Data Type

Stores logical values.

Possible Values:

```text
true
false
```

Example:

```java
boolean isActive = false;
```

Output:

```text
false
```

Used in:

* Conditions
* Loops
* Decision Making

---

# String Data Type

String is a Non-Primitive Data Type.

Used to store text.

Example:

```java
String name = "Java";
```

Output:

```text
Java
```

Unlike char:

```java
char grade = 'A';
```

String uses:

```text
Double Quotes
```

while char uses:

```text
Single Quotes
```

---

# Arrays

Arrays are Non-Primitive Data Types.

Used to store multiple values of the same type.

---

## Example

```java
float[] marks = {1, 2, 3, 4};
```

Memory Representation:

```text
Index : 0  1  2  3
Value : 1  2  3  4
```

---

## Accessing Elements

```java
System.out.println(marks[0]);
```

Output:

```text
1
```

---

```java
System.out.println(marks[2]);
```

Output:

```text
3
```

---

# Array Index

Arrays use:

```text
Zero-Based Indexing
```

Meaning:

```text
First Element → Index 0
Second Element → Index 1
Third Element → Index 2
```

---

# Array Index Error

Example:

```java
System.out.println(marks[8]);
```

Output:

```text
ArrayIndexOutOfBoundsException
```

Reason:

```text
Index 8 does not exist.
```

---

# Printing Arrays Directly

Example:

```java
System.out.println(marks);
```

Output:

```text
Reference Address
```

(Not actual values)

Therefore:

```java
System.out.println(marks[0]);
```

is preferred.

---

# Primitive vs Non-Primitive

| Feature    | Primitive     | Non-Primitive     |
| ---------- | ------------- | ----------------- |
| Defined By | Java          | Java / Programmer |
| Stores     | Actual Value  | Reference         |
| Memory     | Less          | More              |
| Methods    | Not Available | Available         |
| Example    | int, char     | String, Arrays    |

---

# Quick Revision

```text
Data Types
│
├── Primitive (8)
│
└── Non-Primitive
```

---

```text
byte
short
int
long
```

Used for Integers.

---

```text
float
double
```

Used for Decimal Numbers.

---

```text
char
```

Stores One Character.

---

```text
boolean
```

Stores:

true / false

---

```text
String
```

Stores Text.

---

```text
Array
```

Stores Multiple Values.

---

```text
float
│
└── Less Precision
```

---

```text
double
│
└── More Precision
```

---

```text
char
│
└── Unicode Support
```

---

# Interview Questions

## Basic

1. What is a Data Type?
2. Why are Data Types required?
3. How many Primitive Data Types are available in Java?
4. What is the difference between Primitive and Non-Primitive Data Types?
5. What is the size of int?

---

## Intermediate

6. Difference between float and double?
7. Why is 'f' required in float values?
8. Difference between char and String?
9. What is Unicode?
10. What is the purpose of boolean?

---

## Advanced

11. Explain memory allocation of Primitive and Non-Primitive Data Types.
12. Why does Java use Unicode for char?
13. What is the range of byte?
14. What is the range of long?
15. Why is double preferred over float?
16. Why does printing an array directly not show its elements?
17. What is ArrayIndexOutOfBoundsException?
18. Explain Zero-Based Indexing.
19. What are default values of Primitive Data Types?
20. Which data type should be used for storing large decimal values and why?

---

# One-Line Definition

> A Data Type defines the kind of value a variable can store, the memory required for that value, and the operations that can be performed on it.
