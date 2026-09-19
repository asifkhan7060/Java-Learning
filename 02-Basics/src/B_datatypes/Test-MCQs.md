# Java Data Types — Complete MCQ Test

> **Goal:** If you can answer around **80% of these questions correctly without referring back to the notes**, you should have a strong understanding of this topic.

## Instructions

Choose the **single best answer** for each question.

The questions are designed to test **understanding, classification, size/range knowledge, literal usage, precision, Unicode, arrays, output prediction, and common mistakes** rather than simple line-by-line recall.

---

# Section A — Understanding Data Types

### 1.

What is the main purpose of a data type in Java?

* A. To determine what kind of data a variable can store
* B. To determine the variable's name
* C. To print the variable
* D. To make every variable constant

---

### 2.

Consider:

```java
int age = 25;
String name = "Faisal";
```

What is the main difference between the roles of `int` and `String` here?

* A. `int` stores text while `String` stores numbers
* B. `int` and `String` are both primitive types
* C. `int` represents integer data while `String` represents text
* D. `String` can only store a single character

---

### 3.

Why does Java need different data types instead of using one general type for every variable?

* A. Different kinds of data require different representations and capabilities
* B. Java allows only eight variables in a program
* C. Every type has a different variable name
* D. Data types are only used for comments

---

### 4.

Which statement best represents the idea that a data type defines the "shape" or "category" of data?

* A. The type determines what kind of value a variable is intended to store
* B. The type determines the variable's physical location on the screen
* C. The type determines the variable's naming convention
* D. The type determines whether the variable is a comment

---

### 5.

A programmer needs to store an integer age such as `25`. Which declaration best matches the concept shown in the notes?

* A. `char age = 25;`
* B. `int age = 25;`
* C. `boolean age = true;`
* D. `String age = 25;`

---

# Section B — Categories of Data Types

### 6.

How does the document divide Java data types into major categories?

* A. Numeric and textual
* B. Primitive and non-primitive
* C. Mutable and immutable
* D. Local and global

---

### 7.

How many primitive data types are identified in the document?

* A. 6
* B. 7
* C. 8
* D. 10

---

### 8.

Which group contains only primitive data types from the document?

* A. `int`, `float`, `String`, `char`
* B. `byte`, `short`, `int`, `long`
* C. `String`, `Arrays`, `Classes`, `Interfaces`
* D. `Array`, `char`, `boolean`, `String`

---

### 9.

Which group contains only non-primitive data types listed in the document?

* A. `String`, Arrays, Classes, Interfaces
* B. `int`, `float`, Arrays, `char`
* C. `byte`, `short`, `String`, `boolean`
* D. `long`, `double`, Classes, `char`

---

### 10.

Which of the following is classified as non-primitive in the document?

* A. `boolean`
* B. `char`
* C. `String`
* D. `double`

---

### 11.

Which of the following is **not** one of the eight primitive types listed in the document?

* A. `char`
* B. `String`
* C. `boolean`
* D. `long`

---

### 12.

According to the document, primitive types are described as:

* A. The most basic data types stored directly in memory
* B. Types created only by the programmer
* C. Types that can only represent text
* D. Types that are always arrays

---

### 13.

According to the document, non-primitive data types are:

* A. Limited to eight predefined types
* B. Created by Java or by the programmer
* C. Always numeric
* D. Always stored as single characters

---

### 14.

Which statement correctly distinguishes the two major categories?

* A. Primitive types are the basic types; non-primitive types include things such as String, arrays, classes and interfaces
* B. Primitive types are always larger than non-primitive types
* C. Non-primitive types consist only of numeric types
* D. Primitive types include String and arrays

---

# Section C — Primitive Data Types

### 15.

Which primitive type is most suitable for a small integer within the range of `byte`?

* A. `byte`
* B. `String`
* C. `char`
* D. `boolean`

---

### 16.

Which primitive type is represented using 16 bits in the document?

* A. `byte`
* B. `short`
* C. `int`
* D. `boolean`

---

### 17.

Which primitive type is represented using 32 bits and is used for ordinary integer values in the examples?

* A. `byte`
* B. `short`
* C. `int`
* D. `long`

---

### 18.

Which primitive type provides the largest integer size among the integer types listed?

* A. `byte`
* B. `short`
* C. `int`
* D. `long`

---

### 19.

Which primitive type is used when a decimal value such as `3.14` is intended to use the `float` representation?

* A. `float`
* B. `char`
* C. `boolean`
* D. `byte`

---

### 20.

Which type provides greater decimal precision in the examples?

* A. `float`
* B. `double`
* C. `char`
* D. `short`

---

### 21.

Which primitive type is specifically associated with a single Unicode character?

* A. `String`
* B. `char`
* C. `boolean`
* D. `byte`

---

### 22.

Which primitive type is designed to represent only two logical states?

* A. `char`
* B. `boolean`
* C. `byte`
* D. `short`

---

### 23.

Which option correctly maps data to an appropriate primitive type based on the document?

* A. Single character → `char`
* B. True/false state → `boolean`
* C. Whole number → `int`
* D. All of the above

---

### 24.

Which of the following is the complete list of primitive types presented in the document?

* A. `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`
* B. `byte`, `short`, `integer`, `long`, `float`, `double`, `character`, `boolean`
* C. `int`, `long`, `String`, `float`, `double`, `char`, `boolean`, `array`
* D. `byte`, `int`, `float`, `double`, `String`, `char`, `boolean`, `array`

---

# Section D — Size of Primitive Types

### 25.

Which primitive type occupies 1 byte according to the detailed table?

* A. `byte`
* B. `short`
* C. `char`
* D. `int`

---

### 26.

Which primitive type occupies 2 bytes in the table?

* A. `byte`
* B. `short`
* C. `int`
* D. `long`

---

### 27.

Which integer type occupies 4 bytes?

* A. `byte`
* B. `short`
* C. `int`
* D. `long`

---

### 28.

Which integer type occupies 8 bytes?

* A. `byte`
* B. `short`
* C. `int`
* D. `long`

---

### 29.

Which two primitive types are shown as occupying 4 bytes?

* A. `byte` and `short`
* B. `int` and `float`
* C. `long` and `double`
* D. `short` and `char`

---

### 30.

Which two primitive types are shown as occupying 8 bytes?

* A. `int` and `float`
* B. `short` and `char`
* C. `long` and `double`
* D. `byte` and `boolean`

---

### 31.

According to the document, how many bytes are used by `char`?

* A. 1
* B. 2
* C. 4
* D. 8

---

### 32.

Which primitive type is represented as **true/false** rather than a numeric size in the summary table?

* A. `char`
* B. `boolean`
* C. `byte`
* D. `short`

---

# Section E — Integer Ranges

### 33.

What is the range of `byte` given in the document?

* A. `-128` to `127`
* B. `0` to `255`
* C. `-32768` to `32767`
* D. `-2147483648` to `2147483647`

---

### 34.

Which value can be stored in a `byte` based on the documented range?

* A. `127`
* B. `128`
* C. `1000`
* D. `32767`

---

### 35.

Which value cannot be stored within the documented `byte` range?

* A. `-128`
* B. `0`
* C. `127`
* D. `128`

---

### 36.

What is the range of `short` given in the document?

* A. `-128` to `127`
* B. `-32768` to `32767`
* C. `-2147483648` to `2147483647`
* D. `0` to `65535`

---

### 37.

Which value is the maximum documented value for `short`?

* A. `127`
* B. `255`
* C. `32767`
* D. `65535`

---

### 38.

Which value is outside the documented `short` range?

* A. `-32768`
* B. `0`
* C. `32767`
* D. `32768`

---

### 39.

What is the documented range of `int`?

* A. `-128` to `127`
* B. `-32768` to `32767`
* C. `-2,147,483,648` to `2,147,483,647`
* D. `0` to `65,535`

---

### 40.

Which value can be represented by `int` but not by `short` according to the given ranges?

* A. `100`
* B. `1000`
* C. `32767`
* D. `100000`

---

### 41.

What is the documented range of `long`?

* A. Approximately `-9.22 × 10^18` to `9.22 × 10^18`
* B. `-2.147 × 10^9` to `2.147 × 10^9`
* C. `-32768` to `32767`
* D. `0` to `65535`

---

### 42.

Which type should be considered when an integer value exceeds the documented `int` range but remains within the documented `long` range?

* A. `byte`
* B. `short`
* C. `long`
* D. `char`

---

### 43.

Which sequence correctly orders the integer primitive types from smaller size to larger size?

* A. `long → int → short → byte`
* B. `byte → short → int → long`
* C. `short → byte → long → int`
* D. `byte → int → short → long`

---

# Section F — Floating-Point Types

### 44.

What is the main difference demonstrated between `float` and `double` in the notes?

* A. `float` stores characters while `double` stores integers
* B. `double` provides more precision than `float` in the examples
* C. `float` is non-primitive while `double` is primitive
* D. `double` stores only boolean values

---

### 45.

Why does the declaration below include `f`?

```java
float pi = 3.1483467575376975f;
```

* A. The `f` identifies the literal as a float value
* B. The `f` converts the float into a String
* C. The `f` increases precision
* D. The `f` makes the variable final

---

### 46.

What does the document specifically say about the `f` suffix in the float example?

* A. It is optional
* B. It is compulsory
* C. It is used only for integers
* D. It is required only when printing

---

### 47.

Which declaration follows the float example correctly?

* A. `float pi = 3.14;`
* B. `float pi = 3.14f;`
* C. `float pi = "3.14f";`
* D. `float pi = '3.14';`

---

### 48.

Why does the example label the printed `float` value as "less precise" and the `double` value as "more precise"?

* A. The example demonstrates the greater decimal precision associated with `double`
* B. `float` cannot store decimal values
* C. `double` is a non-primitive type
* D. `float` always stores integers

---

### 49.

What is the documented range of `float`?

* A. Approximately `±3.4E−38` to `±3.4E+38`
* B. Approximately `±1.7E−308` to `±1.7E+308`
* C. `-32768` to `32767`
* D. `0` to `65535`

---

### 50.

What is the documented range of `double`?

* A. Approximately `±3.4E−38` to `±3.4E+38`
* B. Approximately `±1.7E−308` to `±1.7E+308`
* C. `-2,147,483,648` to `2,147,483,647`
* D. `-128` to `127`

---

### 51.

Which option correctly matches the examples?

* A. `float` → decimal, `double` → decimal with greater precision
* B. `float` → character, `double` → boolean
* C. `float` → integer, `double` → String
* D. `float` → array, `double` → class

---

# Section G — `char` and Unicode

### 52.

What is the purpose of the `char` type in the examples?

* A. To store a single Unicode character
* B. To store multiple words
* C. To store true/false
* D. To store an array of numbers

---

### 53.

Which declaration correctly represents a single character?

* A. `char grade = "A";`
* B. `char grade = 'A';`
* C. `String grade = 'A';`
* D. `char grade = A;`

---

### 54.

Why are single quotes used in the `char` examples?

* A. The document specifically demonstrates single-character values using single quotes
* B. Double quotes can only store numbers
* C. Single quotes create arrays
* D. Single quotes make the variable final

---

### 55.

What does the Unicode example demonstrate?

```java
char unicodeDemo = '\u20AC';
```

* A. A Unicode character can be represented using a Unicode escape
* B. Unicode values must be stored in `String`
* C. Unicode is available only for decimal numbers
* D. `char` can store only English letters

---

### 56.

What character is represented by:

```java
'\u20AC'
```

in the example?

* A. Dollar symbol
* B. Euro symbol
* C. Pound symbol
* D. Yen symbol

---

### 57.

What is the documented size of `char`?

* A. 1 byte
* B. 2 bytes
* C. 4 bytes
* D. 8 bytes

---

### 58.

What range is given for `char` in the detailed table?

* A. `-128` to `127`
* B. `-32768` to `32767`
* C. `0` to `65,535`
* D. `-2,147,483,648` to `2,147,483,647`

---

### 59.

Which statement best connects `char` with Unicode according to the document?

* A. `char` is presented as a 16-bit Unicode character type
* B. `char` is used only for ASCII
* C. `char` is a non-primitive type
* D. `char` can store complete sentences

---

# Section H — Boolean

### 60.

Which declaration matches the boolean example?

* A. `boolean isActive = false;`
* B. `boolean isActive = 0;`
* C. `boolean isActive = "false";`
* D. `boolean isActive = 'false';`

---

### 61.

What kind of information is best represented by `boolean`?

* A. A character
* B. A decimal number
* C. A true/false state
* D. A sequence of characters

---

### 62.

Which pair represents the logical values associated with `boolean` in the document?

* A. `0` and `1`
* B. `yes` and `no`
* C. `true` and `false`
* D. `on` and `off`

---

# Section I — Default Values

### 63.

What is the documented default value for `byte`?

* A. `-1`
* B. `0`
* C. `0.0`
* D. `null`

---

### 64.

What is the documented default value for `short`?

* A. `0`
* B. `0L`
* C. `0.0f`
* D. `'\u0000'`

---

### 65.

What is the documented default value for `int`?

* A. `0`
* B. `0L`
* C. `0.0d`
* D. `null`

---

### 66.

What is the documented default value for `long`?

* A. `0`
* B. `0L`
* C. `0.0`
* D. `'\u0000'`

---

### 67.

What is the documented default value for `float`?

* A. `0`
* B. `0L`
* C. `0.0f`
* D. `0.0d`

---

### 68.

What is the documented default value for `double`?

* A. `0`
* B. `0L`
* C. `0.0f`
* D. `0.0d`

---

### 69.

What is the documented default value for `char`?

* A. `'0'`
* B. `'A'`
* C. `'\u0000'`
* D. `null`

---

### 70.

Which option correctly matches the documented default values?

* A. `int → 0`, `long → 0L`, `float → 0.0f`, `double → 0.0d`
* B. `int → null`, `long → null`, `float → null`, `double → null`
* C. `int → 0L`, `long → 0`, `float → 0.0d`, `double → 0.0f`
* D. `int → '\u0000'`, `long → false`, `float → 0`, `double → 0`

---

# Section J — Non-Primitive Data Types

### 71.

Which of the following is classified as a non-primitive data type in the document?

* A. `String`
* B. `int`
* C. `float`
* D. `char`

---

### 72.

Which group contains the non-primitive examples explicitly listed?

* A. String, Arrays, Classes, Interfaces
* B. int, long, float, double
* C. byte, short, char, boolean
* D. char, String, boolean, int

---

### 73.

What is the key distinction given between primitive and non-primitive types?

* A. Primitive types are the basic types; non-primitive types can be created by Java or the programmer
* B. Primitive types can contain text while non-primitive types cannot
* C. Non-primitive types are always numeric
* D. Primitive types are always arrays

---

### 74.

The declaration below uses which category?

```java
String name = "Java";
```

* A. Primitive
* B. Non-primitive
* C. Numeric primitive
* D. Boolean primitive

---

### 75.

The declaration below uses which category?

```java
float[] marks = {1, 2, 3, 4};
```

* A. Primitive only
* B. Non-primitive
* C. Boolean
* D. Character

---

# Section K — Arrays

### 76.

According to the document, arrays are classified as:

* A. Primitive
* B. Non-primitive
* C. Boolean
* D. Numeric literals

---

### 77.

What does the following declaration create?

```java
float[] marks = {1, 2, 3, 4};
```

* A. A single `float`
* B. An array containing multiple `float` values
* C. A String
* D. A boolean

---

### 78.

How can an individual element of the array be accessed in the example?

* A. By using an index such as `marks[0]`
* B. By using `marks()`
* C. By using `marks{0}`
* D. By using `marks<0>`

---

### 79.

What element is accessed by:

```java
marks[0]
```

for the array:

```java
float[] marks = {1, 2, 3, 4};
```

* A. `1`
* B. `2`
* C. `3`
* D. `4`

---

### 80.

What element is accessed by:

```java
marks[2]
```

for the same array?

* A. `1`
* B. `2`
* C. `3`
* D. `4`

---

### 81.

What will happen when the following statement is executed?

```java
System.out.println(marks[8]);
```

when the array contains only four elements?

* A. It prints `8`
* B. It prints the last element
* C. It causes `ArrayIndexOutOfBoundsException`
* D. It automatically creates more elements

---

### 82.

Why does `marks[8]` fail for the given array?

* A. The array contains fewer elements than the requested index requires
* B. `float` cannot be stored in arrays
* C. Arrays cannot be printed
* D. Indexing begins from `8`

---

### 83.

What is the largest valid index for the array:

```java
float[] marks = {1, 2, 3, 4};
```

* A. `2`
* B. `3`
* C. `4`
* D. `5`

---

### 84.

What sequence of indices corresponds to the four elements in:

```java
float[] marks = {1, 2, 3, 4};
```

* A. `1, 2, 3, 4`
* B. `0, 1, 2, 3`
* C. `0, 1, 2, 4`
* D. `1, 2, 3, 5`

---

### 85.

Which statement correctly accesses the **third element** of the array?

* A. `marks[1]`
* B. `marks[2]`
* C. `marks[3]`
* D. `marks[4]`

---

### 86.

Which statement correctly accesses the **first element** of the array?

* A. `marks[0]`
* B. `marks[1]`
* C. `marks[first]`
* D. `marks[-1]`

---

### 87.

The document comments that:

```java
System.out.println(marks);
```

gives a garbage value. What is the key lesson intended by this example?

* A. The array variable itself is not being used here to access an individual element; indexing is used to access elements
* B. Arrays cannot contain numbers
* C. `println()` cannot work with arrays at all
* D. `float[]` is a primitive type

---

# Section L — Output Prediction

### 88.

What is printed by:

```java
char grade = 'A';
System.out.println(grade);
```

* A. `A`
* B. `'A'`
* C. `65`
* D. Compilation error

---

### 89.

What is printed by:

```java
boolean isActive = false;
System.out.println(isActive);
```

* A. `0`
* B. `false`
* C. `"false"`
* D. `null`

---

### 90.

What is printed by:

```java
byte b1 = 127;
System.out.println(b1);
```

* A. `0`
* B. `127`
* C. `128`
* D. Compilation error

---

### 91.

What happens with this declaration?

```java
float pi = 3.1483467575376975f;
```

* A. The `f` suffix indicates a float literal as shown in the notes
* B. The `f` converts it to double
* C. The `f` makes it a String
* D. The declaration creates an array

---

### 92.

What does the Unicode example print?

```java
char unicodeDemo = '\u20AC';
System.out.println(unicodeDemo);
```

* A. `20AC`
* B. `€`
* C. `\u20AC`
* D. Compilation error

---

### 93.

What does this print?

```java
String name = "Java";
System.out.println(name);
```

* A. `"Java"`
* B. `Java`
* C. `name`
* D. Compilation error

---

### 94.

What does this print?

```java
float[] marks = {1, 2, 3, 4};

System.out.println(marks[0]);
System.out.println(marks[2]);
```

* A.

  ```text
  0
  2
  ```

* B.

  ```text
  1
  3
  ```

* C.

  ```text
  1
  2
  ```

* D.

  ```text
  0
  3
  ```

---

# Section M — Code Analysis & Application

### 95.

A programmer needs to store `127` and wants to use the smallest integer type from the document that can represent it. Which type fits?

* A. `byte`
* B. `short`
* C. `int`
* D. `long`

---

### 96.

A value is `32768`. Which type from the documented integer ranges can hold it while `short` cannot?

* A. `byte`
* B. `int`
* C. `char`
* D. `boolean`

---

### 97.

A programmer needs to store `10000000000` as an integer. Which type is the appropriate choice from the documented ranges?

* A. `byte`
* B. `short`
* C. `int`
* D. `long`

---

### 98.

A programmer needs to store the value `3.14159` and wants the type demonstrated as having greater precision. Which should be selected?

* A. `float`
* B. `double`
* C. `char`
* D. `byte`

---

### 99.

A programmer needs to store one Unicode symbol such as the Euro symbol. Which declaration best matches the document?

* A. `String symbol = '€';`
* B. `char symbol = '\u20AC';`
* C. `boolean symbol = true;`
* D. `float symbol = 20.€;`

---

### 100.

A programmer wants to store `"Java"` as text. Which choice follows the document?

* A. `char name = "Java";`
* B. `String name = "Java";`
* C. `boolean name = "Java";`
* D. `float name = "Java";`

---

### 101.

A programmer needs a variable that represents whether a user is active. Which choice best matches the boolean example?

* A. `boolean isActive = true;`
* B. `char isActive = 'true';`
* C. `String isActive = true;`
* D. `int isActive = "true";`

---

### 102.

A programmer needs to store several marks of the same kind together. Which structure matches the example?

* A. `float[] marks`
* B. `float marks`
* C. `char marks`
* D. `boolean marks`

---

### 103.

Which declaration is invalid because the literal does not match the demonstrated use of `char`?

* A. `char grade = 'A';`
* B. `char symbol = '\u20AC';`
* C. `char grade = "A";`
* D. Both A and B are valid

---

### 104.

Which declaration correctly uses the float suffix demonstrated in the document?

* A. `float pi = 3.14f;`
* B. `float pi = 3.14d;`
* C. `float pi = "3.14f";`
* D. `float pi = '3.14f';`

---

# Section N — Comparing Types

### 105.

Which comparison is correct?

* A. `byte` is smaller than `short` in the documented sizes
* B. `int` is smaller than `short`
* C. `long` is smaller than `int`
* D. `double` is smaller than `float`

---

### 106.

Which comparison is correct according to the ranges shown?

* A. `byte` can represent more integer values than `int`
* B. `int` supports a wider integer range than `short`
* C. `short` supports a wider range than `long`
* D. `char` supports negative values

---

### 107.

Which comparison between `float` and `double` matches the document?

* A. `double` is shown as more precise
* B. `float` is shown as more precise
* C. Both are described as identical in precision
* D. Neither supports decimals

---

### 108.

Which comparison correctly separates `char` and `String`?

* A. `char` is used for a single character, while `String` is a non-primitive text type
* B. Both are primitive types
* C. Both store only true/false
* D. `String` stores only one Unicode character

---

### 109.

Which comparison correctly separates `boolean` and `char`?

* A. `boolean` represents true/false, while `char` represents a character
* B. Both represent characters
* C. Both represent decimal numbers
* D. `char` represents true/false

---

### 110.

Which statement correctly compares arrays and ordinary primitive variables?

* A. The array example stores multiple values and individual elements are accessed with indices
* B. Arrays can store only one value
* C. Arrays are primitive types in the document
* D. Array indices begin at `1` in the example

---

# Section O — Tricky / Mastery Questions

### 111.

Which statement best explains why the following declarations represent different kinds of data?

```java
int age = 25;
String name = "Faisal";
```

* A. The variable names are different
* B. Their data types define different categories of values they store
* C. Both variables store the same kind of value
* D. `String` is a primitive numeric type

---

### 112.

Which option contains **only primitive data types**?

* A. `int`, `char`, `boolean`
* B. `String`, `char`, `int`
* C. `String`, Arrays, `int`
* D. Arrays, Classes, Interfaces

---

### 113.

Which option contains **only non-primitive types from the document**?

* A. `String`, Arrays, Classes, Interfaces
* B. `int`, String, Arrays, `char`
* C. `boolean`, Interfaces, Classes, `long`
* D. `double`, `float`, Arrays, String

---

### 114.

Which of the following contains one primitive and one non-primitive type?

* A. `int` and `char`
* B. `String` and Arrays
* C. `int` and `String`
* D. `byte` and `boolean`

---

### 115.

A developer declares:

```java
char euro = '\u20AC';
```

Which combination best describes this variable?

* A. Primitive, `char`, Unicode character
* B. Non-primitive, String
* C. Primitive, boolean
* D. Non-primitive, array

---

### 116.

A developer declares:

```java
float[] marks = {1, 2, 3, 4};
```

Which combination best describes this variable according to the document?

* A. Primitive `float`
* B. Non-primitive array whose elements are `float` values
* C. Primitive `char`
* D. Non-primitive String

---

### 117.

Which statement best explains why `marks[0]` and `marks[2]` access different values?

* A. The number inside brackets acts as the array index
* B. The number inside brackets is the value to print directly
* C. Arrays ignore the index
* D. Both expressions always refer to the same element

---

### 118.

Consider:

```java
float[] marks = {1, 2, 3, 4};
System.out.println(marks[3]);
```

What is printed?

* A. `1`
* B. `2`
* C. `3`
* D. `4`

---

### 119.

Consider:

```java
float[] marks = {1, 2, 3, 4};
System.out.println(marks[4]);
```

What happens?

* A. `4` is printed
* B. `5` is printed
* C. `ArrayIndexOutOfBoundsException`
* D. The array automatically expands

---

### 120.

Which statement best captures the relationship between an array's number of elements and its valid indices in the given example?

* A. Four elements produce indices `0` through `3`
* B. Four elements produce indices `1` through `4`
* C. Four elements produce indices `0` through `4`
* D. Four elements produce indices `1` through `3`

---

### 121.

A student says:

> "`char` is 2 bytes, so it can store any number between `-32768` and `32767`."

What is wrong with this reasoning according to the table?

* A. `char` is not 2 bytes
* B. The documented `char` range is `0` to `65,535`, not the `short` range
* C. `char` is a non-primitive type
* D. `char` only stores true/false

---

### 122.

A student says:

> "`float` and `double` are both decimal types, so their precision is the same."

Which part of the document contradicts this?

* A. The examples label `float` as less precise and `double` as more precise
* B. `float` cannot store decimals
* C. `double` is a String
* D. Both are character types

---

### 123.

A student says:

> "Because digits are used in an array index, `marks[8]` should be valid for any float array."

Why is this incorrect for the given array?

* A. Indices are limited by the elements actually present in the array
* B. Numeric indices cannot be used with arrays
* C. `8` is a keyword
* D. `float` arrays cannot use indexes

---

### 124.

A student says:

> "`String` is primitive because it is commonly used like `int`."

Which statement from the document corrects this?

* A. `String` is listed under non-primitive data types
* B. `String` is listed as a primitive type
* C. `String` is a boolean
* D. `String` is an integer type

---

### 125.

Which option gives the **most complete understanding** of the document?

* A. Data types only determine variable names
* B. Java provides primitive and non-primitive categories, with primitive types covering basic numeric, character and boolean values, while non-primitive examples include String, arrays, classes and interfaces
* C. Java has only eight total data types
* D. Arrays and String are primitive because they store data

---

# Answer Key

|  Q | Ans |  Q | Ans |  Q | Ans |   Q | Ans |   Q | Ans |
| -: | :-: | -: | :-: | -: | :-: | --: | :-: | --: | :-: |
|  1 |  A  | 26 |  B  | 51 |  A  |  76 |  B  | 101 |  A  |
|  2 |  C  | 27 |  C  | 52 |  A  |  77 |  B  | 102 |  A  |
|  3 |  A  | 28 |  D  | 53 |  B  |  78 |  A  | 103 |  C  |
|  4 |  A  | 29 |  B  | 54 |  A  |  79 |  A  | 104 |  A  |
|  5 |  B  | 30 |  C  | 55 |  A  |  80 |  C  | 105 |  A  |
|  6 |  B  | 31 |  B  | 56 |  B  |  81 |  C  | 106 |  B  |
|  7 |  C  | 32 |  B  | 57 |  B  |  82 |  A  | 107 |  A  |
|  8 |  B  | 33 |  A  | 58 |  C  |  83 |  B  | 108 |  A  |
|  9 |  A  | 34 |  A  | 59 |  A  |  84 |  B  | 109 |  A  |
| 10 |  C  | 35 |  D  | 60 |  A  |  85 |  B  | 110 |  A  |
| 11 |  B  | 36 |  B  | 61 |  C  |  86 |  A  | 111 |  B  |
| 12 |  A  | 37 |  C  | 62 |  C  |  87 |  A  | 112 |  A  |
| 13 |  B  | 38 |  D  | 63 |  B  |  88 |  A  | 113 |  A  |
| 14 |  A  | 39 |  C  | 64 |  A  |  89 |  B  | 114 |  C  |
| 15 |  A  | 40 |  D  | 65 |  A  |  90 |  B  | 115 |  A  |
| 16 |  B  | 41 |  A  | 66 |  B  |  91 |  A  | 116 |  B  |
| 17 |  C  | 42 |  C  | 67 |  C  |  92 |  B  | 117 |  A  |
| 18 |  D  | 43 |  B  | 68 |  D  |  93 |  B  | 118 |  D  |
| 19 |  A  | 44 |  B  | 69 |  C  |  94 |  B  | 119 |  C  |
| 20 |  B  | 45 |  A  | 70 |  A  |  95 |  A  | 120 |  A  |
| 21 |  B  | 46 |  B  | 71 |  A  |  96 |  B  | 121 |  B  |
| 22 |  B  | 47 |  B  | 72 |  A  |  97 |  D  | 122 |  A  |
| 23 |  D  | 48 |  A  | 73 |  A  |  98 |  B  | 123 |  A  |
| 24 |  A  | 49 |  A  | 74 |  B  |  99 |  B  | 124 |  A  |
| 25 |  A  | 50 |  B  | 75 |  B  | 100 |  B  | 125 |  B  |

---

# Coverage

This MCQ set covers the complete material from the uploaded document:

* Meaning of data types
* Purpose of data types
* Data type as a category/shape of data
* Primitive data types
* The 8 primitive types
* Non-primitive data types
* String
* Arrays
* Classes
* Interfaces
* Primitive vs non-primitive classification
* Primitive type sizes
* Byte size
* Short size
* Int size
* Long size
* Float size
* Double size
* Char size
* Integer ranges
* `byte` range
* `short` range
* `int` range
* `long` range
* Floating-point ranges
* `float`
* `double`
* Float precision
* Double precision
* `f` suffix
* Float literal usage
* Double literal example
* `char`
* Unicode characters
* Unicode escape sequences
* Euro symbol example
* Single quotes with `char`
* `char` range
* `boolean`
* True/false values
* Default values
* `byte` default
* `short` default
* `int` default
* `long` default
* `float` default
* `double` default
* `char` default
* String as a non-primitive type
* Arrays as non-primitive types
* Array declaration
* Array initialization
* Array indexing
* Zero-based indexing demonstrated by the examples
* Accessing the first array element
* Accessing the third array element
* Invalid array index
* `ArrayIndexOutOfBoundsException`
* Printing individual array elements
* The document's `System.out.println(marks)` example
* Output prediction
* Practical type selection
* Comparison between primitive types
* Comparison between `float` and `double`
* Comparison between `char` and `String`
* Comparison between `boolean` and `char`
* Applying ranges to real examples
* Applying type knowledge to new code
* Common misconceptions
* Mixed-concept mastery

# 80% Mastery Benchmark

**Total Questions: 125**

**80% = 100 correct answers**

|    Score | Understanding                                          |
| -------: | ------------------------------------------------------ |
|  113–125 | Excellent mastery                                      |
|  100–112 | Strong understanding — topic can be considered covered |
|    88–99 | Partial understanding — review weak areas              |
|    70–87 | Significant gaps — study the topic again               |
| Below 70 | Topic needs thorough revision                          |

> **Target: 100/125 or higher.**
>
> A learner scoring at least 80% should have a strong understanding of the data types material covered in this document and can reasonably move forward to the next topic.
