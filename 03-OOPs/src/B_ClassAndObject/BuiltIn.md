# BUILT-IN CLASSES IN JAVA

## Study : Built-In (Predefined) Classes

---

# What are Built-In Classes?

Built-In Classes are classes that are already created and provided by Java.

We do not need to create these classes ourselves.

Java developers have already implemented them and placed them inside Java Libraries.

We simply import them and use their ready-made functionality.

---

## Simple Definition

> Built-In Classes are predefined classes provided by Java that offer ready-made functionality.

---

# Why are Built-In Classes Needed?

Imagine creating everything from scratch:

* Creating your own String class
* Creating your own Date class
* Creating your own Random Number Generator
* Creating your own File Handler

This would be time-consuming.

Java solves this problem by providing Built-In Classes.

Benefits:

* Saves Development Time
* Reduces Code
* Well Tested
* Reusable
* Improves Productivity

---

# Common Built-In Classes

Some frequently used Built-In Classes are:

```text
String
Math
System
File
LocalDate
LocalTime
LocalDateTime
Scanner
Random
Integer
Double
Character
Boolean
```

---

# String Class

The String class is used to store text data.

Example:

```java
String name = "Asif";
```

Here:

```text
String → Built-In Class

"Asif" → Object of String Class
```

---

## Code

```java
String name = "Asif";
```

---

## Length Method

```java
name.length();
```

Returns:

```text
Total Number of Characters
```

Example:

```java
System.out.println(name.length());
```

Output:

```text
4
```

---

## Uppercase Method

```java
name.toUpperCase();
```

Converts all characters to uppercase.

Example:

```java
System.out.println(name.toUpperCase());
```

Output:

```text
ASIF
```

---

# Math Class

Math is a utility class that provides mathematical operations.

---

## Square Root

```java
Math.sqrt(25);
```

Output:

```text
5.0
```

---

## Maximum Value

```java
Math.max(10,20);
```

Output:

```text
20
```

---

## Code

```java
System.out.println(Math.sqrt(25));
System.out.println(Math.max(10,20));
```

---

# System Class

The System class provides access to system-related resources.

Most commonly used for output.

Example:

```java
System.out.println("Hello");
```

Breakdown:

```text
System → Built-In Class

out → Output Stream Object

println() → Method
```

---

## Code

```java
System.out.println("Learning OOP");
```

Output:

```text
Learning OOP
```

---

# File Class

The File class is used to work with files and directories.

Import:

```java
import java.io.File;
```

---

## Creating File Object

```java
File file = new File("data.txt");
```

Here:

```text
File → Built-In Class

file → Object

data.txt → File Path
```

---

## Common Methods

### getName()

Returns file name.

```java
file.getName();
```

Output:

```text
data.txt
```

---

### exists()

Checks whether the file exists.

```java
file.exists();
```

Output:

```text
true
or
false
```

---

## Other Useful Methods

```java
createNewFile()

delete()

length()

getAbsolutePath()
```

---

# Date and Time Classes

Java provides modern Date and Time APIs.

Import:

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
```

---

## LocalDate

Returns current date.

```java
LocalDate date = LocalDate.now();
```

Example Output:

```text
2026-06-10
```

---

## LocalTime

Returns current time.

```java
LocalTime time = LocalTime.now();
```

Example Output:

```text
14:30:45
```

---

## LocalDateTime

Returns both date and time.

```java
LocalDateTime dateTime = LocalDateTime.now();
```

Example Output:

```text
2026-06-10T14:30:45
```

---

# Scanner Class

Scanner is used to take input from the user.

Import:

```java
import java.util.Scanner;
```

---

## Creating Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

Here:

```text
Scanner → Built-In Class

sc → Object

System.in → Keyboard Input Stream
```

---

## Taking Input

```java
String userName = sc.nextLine();
```

Reads an entire line entered by the user.

---

## Example

```java
System.out.print("Enter Your Name : ");

String userName = sc.nextLine();

System.out.println("Welcome " + userName);
```

---

# Random Class

Random class is used to generate random values.

Import:

```java
import java.util.Random;
```

---

## Creating Object

```java
Random random = new Random();
```

---

## Generating Random Number

```java
int randomNumber = random.nextInt(100);
```

Produces:

```text
0 to 99
```

---

## Example

```java
System.out.println(random.nextInt(100));
```

Possible Output:

```text
47

82

13

95
```

Every execution may produce a different result.

---

# Wrapper Classes

Java provides Wrapper Classes for primitive data types.

Wrapper Classes allow primitive values to be treated as Objects.

---

## Mapping Table

| Primitive Type | Wrapper Class |
| -------------- | ------------- |
| byte           | Byte          |
| short          | Short         |
| int            | Integer       |
| long           | Long          |
| float          | Float         |
| double         | Double        |
| char           | Character     |
| boolean        | Boolean       |

---

## Examples

```java
Integer num = 100;

Double price = 99.99;

Character grade = 'A';

Boolean status = true;
```

---

## Why Wrapper Classes?

Wrapper Classes provide useful methods.

Example:

```java
Integer.parseInt("100");
```

Converts:

```text
String → int
```

---

```java
Double.parseDouble("99.99");
```

Converts:

```text
String → double
```

---

# Import Statements Used

Your program imports:

```java
import java.io.File;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.util.Random;
import java.util.Scanner;
```

These imports allow Java to locate Built-In Classes stored in Java Packages.

---

# Execution Flow of Your Program

```text
Start Program
      │
      ▼
String Class Example
      │
      ▼
Math Class Example
      │
      ▼
System Class Example
      │
      ▼
File Class Example
      │
      ▼
Date & Time Example
      │
      ▼
Scanner Input Example
      │
      ▼
Random Number Example
      │
      ▼
Wrapper Class Example
      │
      ▼
Program Ends
```

---

# Key Notes

```text
Built-In Classes
      │
      ▼
Already Created By Java
```

---

```text
String
Most Frequently Used Built-In Class
```

---

```text
Scanner
Used For User Input
```

---

```text
Random
Used To Generate Random Values
```

---

```text
Wrapper Classes
Convert Primitive Data Types
into Objects
```

---

# Quick Revision

```text
String       → Text Handling

Math         → Mathematical Operations

System       → Input / Output

File         → File Handling

Scanner      → User Input

Random       → Random Values

LocalDate    → Date

LocalTime    → Time

LocalDateTime→ Date & Time

Integer      → int Wrapper

Double       → double Wrapper
```

---

# Interview Questions

## Basic

1. What are Built-In Classes in Java?
2. Why are Built-In Classes called predefined classes?
3. What is the String class?
4. What is the Scanner class used for?
5. What is the Random class used for?

## Intermediate

6. Explain the difference between String and StringBuilder.
7. What is the purpose of the Math class?
8. What is the role of the File class?
9. Explain LocalDate, LocalTime, and LocalDateTime.
10. Why do we import packages in Java?

## Advanced

11. What are Wrapper Classes?
12. Why were Wrapper Classes introduced in Java?
13. Explain the relationship between primitive types and Wrapper Classes.
14. What is Autoboxing and Unboxing?
15. How are Built-In Classes stored and accessed in Java?

---

# One-Line Definition

> Built-In Classes are predefined classes provided by Java that offer ready-made functionality such as text handling, mathematical operations, file handling, user input, date/time operations, random value generation, and primitive type manipulation.
