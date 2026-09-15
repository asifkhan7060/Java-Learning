````markdown
# Java Variables — Complete MCQ Test

> **Goal:** If you can answer around **80% of these questions correctly without referring back to the notes**, you should have a strong understanding of this topic.

## Instructions

Choose the **single best answer** for each question.

The questions are designed to test **understanding, application, code analysis, output prediction, naming rules, and common mistakes**, rather than simple documentation recall.
````

# Section A — Variables, Declaration, Initialization & Reassignment

### 1. 
Consider:

int a;    
a = 10;

What best describes these two statements?

* A. `a` is initialized first and declared later
* B. `a` is declared first and initialized afterward
* C. `a` is assigned two different values
* D. `a` is a constant

---

### 2.

Which statement correctly represents **declaration + initialization** in a single statement?

* A. `int a; a = 10;`
* B. `int = a 10;`
* C. `int a = 10;`
* D. `a int = 10;`

---

### 3.

What is the main conceptual difference between these two statements?

int a = 10;
a = 80;

* A. The first creates a constant and the second destroys it
* B. The first declares and initializes; the second changes the existing value
* C. Both are declarations
* D. Both create separate variables

---

### 4.

What will happen here?

```java
int a = 10;
a = 80;
System.out.println(a);
```

* A. `10`
* B. `80`
* C. `10 80`
* D. Compilation error

---

### 5.

A variable currently stores `25`. A new value `40` is assigned to the same variable. What does this demonstrate?

* A. Declaration
* B. Initialization
* C. Reassignment/overwriting
* D. Constant declaration

---

### 6.

Which sequence correctly represents the progression demonstrated in the notes?

* A. Output → declaration → initialization → reassignment
* B. Declaration → initialization → reassignment → output
* C. Initialization → declaration → output → reassignment
* D. Declaration → output → initialization → reassignment

---

### 7.

What does the following statement achieve?

```java
String name = "Java";
```

* A. Declares `name` without giving it a value
* B. Declares and initializes `name`
* C. Reassigns an already existing variable
* D. Creates a constant

---

### 8.

Which statement best explains why variables are useful?

* A. They allow data to be stored and referenced through a name
* B. They prevent values from changing
* C. They are used only for printing output
* D. They replace all Java keywords

---

# Section B — Output & String Concatenation

### 9.

What is the purpose of:

```java
System.out.println(a);
```

* A. It changes `a`
* B. It declares `a`
* C. It displays the current value of `a`
* D. It makes `a` final

---

### 10.

Consider:

```java
String name = "Java";
int age = 20;

System.out.println("Hello! " + name + ". You are " + age + " years old");
```

What is the output?

* A. `Hello! name. You are age years old`
* B. `Hello! Java. You are 20 years old`
* C. `Hello! + Java + . You are + 20 years old`
* D. Compilation error

---

### 11.

In the following expression:

```java
"Hello! " + name
```

what is the role of `+`?

* A. Comparison
* B. String concatenation
* C. Variable declaration
* D. Reassignment

---

### 12.

Which change would cause the output to use the **new value** of `name`?

```java
String name = "Java";
System.out.println("Hello " + name);
```

* A. Add another `println`
* B. Reassign `name` before the output statement
* C. Make `name` uppercase
* D. Remove the `+` operator

---

### 13.

Consider:

```java
int b = 20;
System.out.println("Age: " + b);
```

Why does the output contain both text and the numeric value?

* A. Java converts the entire statement into a declaration
* B. The `+` operator combines the string and variable value for output
* C. `println()` automatically creates a new variable
* D. `b` becomes a String permanently

---

### 14.

Which statement best demonstrates **traditional string concatenation** from the notes?

* A.

  ```java
  System.out.println(name);
  ```

* B.

  ```java
  System.out.println("Hello! " + name);
  ```

* C.

  ```java
  int b = 20;
  ```

* D.

  ```java
  final int MAX_SPEED = 120;
  ```

---

### 15.

The notes show a commented expression using `STR."..."`. What is its purpose compared with the traditional concatenation example?

* A. It demonstrates another way of constructing a string containing variable values
* B. It declares a constant
* C. It creates a new variable type
* D. It demonstrates a comment type

---

### 16.

Why is the String Template example not executed in the shown program?

* A. It is inside a comment
* B. It is inside a `final` block
* C. It is an invalid variable name
* D. It is inside `main()`

---

# Section C — Constants & `final`

### 17.

Suppose a value should not be overwritten after assignment. Which approach matches the concept demonstrated in the notes?

* A. Use an ordinary variable
* B. Use `final`
* C. Use a comment
* D. Use `println()`

---

### 18.

Consider:

```java
final int MAX_SPEED = 120;
MAX_SPEED = 150;
```

What is the expected result?

* A. `MAX_SPEED` becomes `150`
* B. Both `120` and `150` are stored
* C. Compilation error because the final variable cannot be reassigned
* D. Java ignores the second statement

---

### 19.

What is the key difference between:

```java
int speed = 120;
```

and

```java
final int speed = 120;
```

according to the topic?

* A. Only the final version stores numbers
* B. The final version is not intended to be reassigned
* C. The normal version cannot be printed
* D. The normal version is automatically a String

---

### 20.

Which declaration best follows the constant naming convention demonstrated in the notes?

* A. `final int maxSpeed = 120;`
* B. `final int MAX_SPEED = 120;`
* C. `int MAX-SPEED = 120;`
* D. `final int 120_SPEED = 120;`

---

### 21.

Why is `MAX_SPEED` written in uppercase with underscores?

* A. It is required for every Java variable
* B. It indicates the naming convention used for constants
* C. Java requires uppercase names for integers
* D. It makes the variable immutable automatically

---

### 22.

Which situation is the best fit for a constant?

* A. A student's marks that may change
* B. A current counter that increases
* C. A maximum value intended not to be overwritten
* D. A temporary value used during calculation

---

# Section D — Variable Naming Rules

### 23.

Which variable name violates the **first-character rule**?

* A. `_score`
* B. `$total`
* C. `student2`
* D. `2student`

---

### 24.

Why is this invalid?

```java
int 1fast = 50;
```

* A. Digits are never allowed in identifiers
* B. A variable name cannot start with a digit
* C. `fast` is a keyword
* D. `50` cannot be stored in an integer

---

### 25.

Which statement correctly describes where digits can appear in a variable name according to the notes?

* A. Nowhere
* B. Only as the first character
* C. They may appear after the first character
* D. Only at the end

---

### 26.

Which is a valid variable name according to the documented rules?

* A. `student-count`
* B. `total marks`
* C. `$total`
* D. `@rate`

---

### 27.

Why is this invalid?

```java
int student-count = 40;
```

* A. `student` is a keyword
* B. `-` is not allowed as part of the variable name
* C. `count` must be uppercase
* D. Variables cannot contain letters

---

### 28.

Which declaration is invalid because of a space?

* A. `int studentCount = 100;`
* B. `int student_count = 100;`
* C. `int total marks = 100;`
* D. `int totalMarks = 100;`

---

### 29.

Which character is explicitly shown in the notes as an invalid character in a variable name?

* A. `_`
* B. `$`
* C. `@`
* D. `2`

---

### 30.

Which statement correctly describes the role of `_` and `$`?

* A. They are forbidden everywhere
* B. They may be used as the first character and are also allowed later
* C. They can only appear after digits
* D. They are Java keywords

---

### 31.

Which of the following names follows the stated naming rules?

* A. `@rate`
* B. `1fast`
* C. `$total2`
* D. `student-count`

---

### 32.

Which option contains **only valid identifiers** according to the documented rules?

* A. `age`, `studentCount`, `_score`
* B. `age`, `1score`, `$total`
* C. `student-count`, `gearRatio`, `age`
* D. `total marks`, `age`, `$total`

---

# Section E — Keywords & Identifiers

### 33.

Why is this invalid?

```java
int for = 5;
```

* A. `for` is a Java keyword
* B. `for` contains a special character
* C. `for` starts with a digit
* D. `5` cannot be assigned to `int`

---

### 34.

Which statement best explains the problem with:

```java
int class = 1;
```

* A. `class` is too short
* B. `class` is a Java keyword
* C. `class` contains uppercase letters
* D. `class` cannot store integers

---

### 35.

A developer proposes a variable named `forCount`. What is the best conclusion?

* A. Invalid because it contains `for`
* B. Invalid because all words related to keywords are forbidden
* C. It does not use `for` as the entire identifier, so it is different from the keyword
* D. Invalid because identifiers cannot contain uppercase letters

---

### 36.

Which statement best describes a reserved keyword in the context of these notes?

* A. A recommended variable name
* B. A word that Java reserves for its own syntax and therefore cannot be used as a variable name
* C. A comment
* D. A constant

---

# Section F — Meaningful Names & Naming Conventions

### 37.

Why is `studentCount` preferred over `x1` for representing the number of students?

* A. `studentCount` uses less memory
* B. `studentCount` makes the purpose of the variable clearer
* C. `x1` is always illegal
* D. `studentCount` is a keyword

---

### 38.

Which variable best follows the documented **normal variable naming convention**?

* A. `Student_count`
* B. `studentCount`
* C. `STUDENT_COUNT`
* D. `student-count`

---

### 39.

What is the main idea behind `lowerCamelCase`?

* A. Every word starts with uppercase
* B. The first word begins lowercase and subsequent words are joined using capitalized initials
* C. Words are separated using hyphens
* D. All letters are uppercase

---

### 40.

Which option best follows `lowerCamelCase` for "total marks"?

* A. `TotalMarks`
* B. `total_marks`
* C. `totalMarks`
* D. `TOTAL_MARKS`

---

### 41.

Which option best follows the documented convention for a constant representing maximum speed?

* A. `maxSpeed`
* B. `MaxSpeed`
* C. `MAX_SPEED`
* D. `max_speed`

---

### 42.

Which statement best distinguishes a **naming rule** from a **naming convention**?

* A. Rules affect whether the name is legally acceptable; conventions guide how names should be written for readability and consistency
* B. Both mean exactly the same thing
* C. Conventions cause compiler errors while rules do not
* D. Rules apply only to constants

---

### 43.

Which option is syntactically legal but specifically described in the notes as **legal but not recommended**?

* A. `studentCount`
* B. `gearRatio`
* C. `_score`
* D. `totalMarks`

---

### 44.

Which statement best explains why a legal identifier may still be discouraged?

* A. Java rejects all such identifiers at runtime
* B. Legality and readability/convention are separate concerns
* C. Legal identifiers use more memory
* D. Legal identifiers cannot be printed

---

# Section G — Case Sensitivity

### 45.

Consider:

```java
int number = 10;
int Number = 20;
```

What is true?

* A. The second declaration overwrites the first
* B. Both identifiers are treated as different because Java is case-sensitive
* C. The code always produces a compiler error
* D. Only uppercase identifiers are valid

---

### 46.

What will this print?

```java
int number = 10;
int Number = 20;

System.out.println(number);
System.out.println(Number);
```

* A.

  ```text
  10
  10
  ```

* B.

  ```text
  20
  20
  ```

* C.

  ```text
  10
  20
  ```

* D. Compilation error

---

### 47.

Which change would make `number` and `Number` refer to the same spelling?

* A. Replace `Number` with `number`
* B. Add `$` to both
* C. Add digits to both
* D. Put both inside comments

---

### 48.

A programmer writes:

```java
int studentCount = 100;
System.out.println(StudentCount);
```

What is the likely issue?

* A. Java automatically ignores capitalization
* B. `StudentCount` and `studentCount` are different identifiers
* C. `println()` cannot print variables
* D. `studentCount` is a constant

---

# Section H — Comments

### 49.

Which syntax represents a **single-line comment**?

* A. `// comment`
* B. `/* comment */`
* C. `/** comment */`
* D. `<comment>`

---

### 50.

Which syntax is appropriate for a comment spanning multiple lines?

* A. `// ...` only
* B. `/* ... */`
* C. `/** ... */` only
* D. `# ...`

---

### 51.

Which syntax is used for a **Javadoc/documentation comment** in the notes?

* A. `//`
* B. `/* */`
* C. `/** */`
* D. `##`

---

### 52.

What is the practical effect of placing invalid Java declarations inside comments?

* A. They are still compiled
* B. They are ignored by the compiler as code
* C. They become constants
* D. They automatically become valid

---

### 53.

Why were the invalid variable examples in the document commented out?

* A. To show examples of invalid code without making the whole program fail to compile
* B. To make them constants
* C. To execute them later automatically
* D. To change their naming convention

---

### 54.

Which situation is best suited to a documentation/Javadoc comment?

* A. Recording a brief note on one line
* B. Providing structured documentation about code
* C. Reassigning a variable
* D. Printing output

---

# Section I — Code Analysis & Mixed Concepts

### 55.

What is the final value of `a`?

```java
int a = 10;
a = 80;
```

* A. `10`
* B. `80`
* C. `90`
* D. Undefined

---

### 56.

What is the final output?

```java
int a = 10;
String name = "Java";

a = 80;

System.out.println(a);
System.out.println(name);
```

* A.

  ```text
  10
  Java
  ```

* B.

  ```text
  80
  Java
  ```

* C.

  ```text
  Java
  80
  ```

* D. Compilation error

---

### 57.

Consider:

```java
final int CONST_VALUE = 50;
System.out.println(CONST_VALUE);
```

What is true?

* A. The value is printed, but the variable is also freely reassigned
* B. The value is printed and the declaration demonstrates a final variable
* C. `CONST_VALUE` is a keyword
* D. `println()` makes the variable final

---

### 58.

Which option correctly combines the naming rules and convention for a constant?

* A. `final int max-speed = 120;`
* B. `final int 1MAX_SPEED = 120;`
* C. `final int MAX_SPEED = 120;`
* D. `final int max speed = 120;`

---

### 59.

Which statement contains a **legal variable name but does not follow the recommended normal-variable convention** from the notes?

* A. `studentCount`
* B. `_score`
* C. `totalMarks`
* D. `gearRatio`

---

### 60.

Which statement contains a name that is both meaningful and follows the recommended normal-variable convention?

* A. `x1`
* B. `temp123`
* C. `studentCount`
* D. `$total`

---

### 61.

A programmer wants to store the number of students and chooses:

```java
int studentCount = 100;
```

Why is this a strong choice according to the document?

* A. It is a keyword
* B. It begins with a digit
* C. It is meaningful and follows lowerCamelCase
* D. It is automatically final

---

### 62.

Which option contains a **valid identifier but violates the recommended naming convention for a normal variable**?

* A. `studentCount`
* B. `gearRatio`
* C. `$total`
* D. `totalMarks`

---

### 63.

A programmer wants a normal variable for a gear ratio. Which choice best matches the guidance?

* A. `gearRatio`
* B. `GEAR_RATIO`
* C. `gear-ratio`
* D. `gear ratio`

---

### 64.

Which option correctly identifies **all three levels** for the name `studentCount`?

* A. It is invalid, meaningless, and not camelCase
* B. It is valid, meaningful, and follows lowerCamelCase
* C. It is valid but reserved
* D. It is valid only because it is a constant

---

### 65.

Which statement best explains the relationship between `MAX_SPEED` and `studentCount`?

* A. Both are expected to use exactly the same naming style
* B. `MAX_SPEED` follows the documented constant convention, while `studentCount` follows the normal-variable convention
* C. `studentCount` must be uppercase because it stores data
* D. `MAX_SPEED` is invalid because underscores are forbidden

---

# Section J — Higher-Level Mastery

### 66.

A developer writes:

```java
int score = 95;
score = 100;
```

Which description is the most accurate?

* A. The second statement declares a new variable named `score`
* B. The second statement initializes `score` for the first time
* C. The second statement reassigns the existing variable
* D. The second statement converts `score` into a constant

---

### 67.

Which sequence demonstrates the same concepts as the notes most completely?

* A.

  ```java
  int a = 10;
  System.out.println(a);
  ```

* B.

  ```java
  int a;
  a = 10;
  a = 80;
  System.out.println(a);
  ```

* C.

  ```java
  final int A = 10;
  ```

* D.

  ```java
  // int a = 10;
  ```

---

### 68.

Suppose a developer wants the following three properties:

* legal identifier
* clearly communicates its purpose
* follows the recommended normal-variable style

Which is the best choice for storing the total marks?

* A. `x1`
* B. `totalMarks`
* C. `TOTAL_MARKS`
* D. `total-marks`

---

### 69.

Suppose a developer wants the following three properties:

* legal identifier
* constant
* follows the documented constant naming convention

Which is best?

* A. `final int maxSpeed = 120;`
* B. `final int MAX_SPEED = 120;`
* C. `int MAX-SPEED = 120;`
* D. `final int 1MAX_SPEED = 120;`

---

### 70.

Which of the following represents the **most complete understanding** of Java variable naming from the notes?

* A. Any combination of letters and digits is acceptable
* B. A variable name must satisfy syntax rules, avoid keywords, and should also follow meaningful naming conventions
* C. Only lowercase names are allowed
* D. Variable names must always be uppercase

---

### 71.

A student says:

> "`_score` is invalid because variable names can only start with letters."

Which response is most accurate according to the notes?

* A. Correct; `_score` is invalid
* B. Incorrect; `_score` is legal, although the notes say it is not recommended
* C. Correct; only `$` may begin a variable
* D. Incorrect; `_score` is a Java keyword

---

### 72.

A student says:

> "`1fast` is okay because digits are allowed in variable names."

What is wrong with this reasoning?

* A. Digits are completely forbidden
* B. Digits may appear, but the first character cannot be a digit
* C. `fast` is a keyword
* D. Variables cannot contain lowercase letters

---

### 73.

A student says:

> "`number` and `Number` refer to the same variable because they contain the same letters."

Which concept disproves this statement?

* A. String concatenation
* B. Final variables
* C. Case sensitivity
* D. Comments

---

### 74.

A developer wants to document a class with a detailed description that can serve as generated documentation. Which comment style from the notes is the most appropriate?

* A. `//`
* B. `/* */`
* C. `/** */`
* D. None of these

---

### 75.

Which option best summarizes the purpose of the second document?

* A. Only to demonstrate how to print integers
* B. To demonstrate variable naming rules, validity, conventions, constants, and case sensitivity
* C. Only to demonstrate comments
* D. Only to demonstrate reassignment

---

# Answer Key

|  Q | Ans |  Q | Ans |  Q | Ans |
| -: | :-: | -: | :-: | -: | :-: |
|  1 |  B  | 26 |  C  | 51 |  C  |
|  2 |  C  | 27 |  B  | 52 |  B  |
|  3 |  B  | 28 |  C  | 53 |  A  |
|  4 |  B  | 29 |  C  | 54 |  B  |
|  5 |  C  | 30 |  B  | 55 |  B  |
|  6 |  B  | 31 |  C  | 56 |  B  |
|  7 |  B  | 32 |  A  | 57 |  B  |
|  8 |  A  | 33 |  A  | 58 |  C  |
|  9 |  C  | 34 |  B  | 59 |  B  |
| 10 |  B  | 35 |  C  | 60 |  C  |
| 11 |  B  | 36 |  B  | 61 |  C  |
| 12 |  B  | 37 |  B  | 62 |  C  |
| 13 |  B  | 38 |  B  | 63 |  A  |
| 14 |  B  | 39 |  B  | 64 |  B  |
| 15 |  A  | 40 |  C  | 65 |  B  |
| 16 |  A  | 41 |  C  | 66 |  C  |
| 17 |  B  | 42 |  A  | 67 |  B  |
| 18 |  C  | 43 |  C  | 68 |  B  |
| 19 |  B  | 44 |  B  | 69 |  B  |
| 20 |  B  | 45 |  B  | 70 |  B  |
| 21 |  B  | 46 |  C  | 71 |  B  |
| 22 |  C  | 47 |  A  | 72 |  B  |
| 23 |  D  | 48 |  B  | 73 |  C  |
| 24 |  B  | 49 |  A  | 74 |  C  |
| 25 |  C  | 50 |  B  | 75 |  B  |

---

# Coverage

This MCQ set covers the full material from both documents:

* Variables
* Variable declaration
* Variable initialization
* Declaration + initialization
* Reassignment / overwrite
* Output using `System.out.println()`
* String concatenation
* String Template example
* Constants
* `final`
* Identifier rules
* First-character rules
* Allowed characters
* Invalid characters
* Digits in identifiers
* Spaces
* Hyphens
* Special characters
* Java keywords
* Reserved keywords
* Meaningful variable names
* `lowerCamelCase`
* Constant naming convention
* `UPPER_CASE_WITH_UNDERSCORES`
* Valid identifiers
* Invalid identifiers
* `_` and `$`
* Case sensitivity
* Program output
* Single-line comments
* Multi-line comments
* Javadoc/documentation comments
* Commented-out invalid code
* Code analysis
* Output prediction
* Applying naming rules to new situations
* Difference between validity and recommended conventions

## 80% Mastery Benchmark

**Total Questions: 75**

**80% = 60 correct answers**

|    Score | Understanding                                          |
| -------: | ------------------------------------------------------ |
|    68–75 | Excellent mastery                                      |
|    60–67 | Strong understanding — topic can be considered covered |
|    52–59 | Partial understanding — review weak areas              |
|    40–51 | Significant gaps — study the topic again               |
| Below 40 | Topic needs thorough revision                          |

> **Target: 60/75 or higher.**
>
> A learner scoring at least 80% should have a strong understanding of this document group and can reasonably move forward to the next topic.

```
```
