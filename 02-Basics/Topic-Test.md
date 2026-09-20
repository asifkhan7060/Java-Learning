# Java MCQ Combined Practice Set

> **Total Questions:** 200  
> **Order:** Java MCQ Practice Set (Q1–Q100) → Java Operators 100 MCQs (Q101–Q200)

---

# Part 1 — Java MCQ Practice Set

# Java MCQ Practice Set

> **Source Coverage:** Variables, variable naming rules, data types, decision making, loops, jump statements, and methods in Java.
>
> **Question Style:** Conceptual + code-based + output-based questions.
>
> **Note:** Questions are based on the supplied study material. No separate section has been added for unrelated IDE documentation settings.

---

## Section A — Variables, Constants & Comments

### 1. Which statement correctly separates declaration from initialization?

A. `int age = 20;` is declaration only  
B. `int age;` is declaration, while `age = 20;` is initialization  
C. `age = 20;` declares the variable  
D. `int age;` initializes the variable  

### 2. What is the final value of `a`?

```java
int a = 10;
a = 80;
```

A. `10`  
B. `80`  
C. `90`  
D. Compilation error  

### 3. Which statement correctly declares and initializes a variable in one statement?

A. `int = 20;`  
B. `b int = 20;`  
C. `int b = 20;`  
D. `int b; 20;`  

### 4. What does the following statement do?

```java
System.out.println("Hello! " + name + ". You are " + b + " years old");
```

A. Performs only arithmetic addition  
B. Concatenates strings and values to form output  
C. Converts every value into an integer  
D. Creates a new variable named `Hello`  

### 5. Which keyword is used in Java to declare a variable whose value cannot be reassigned?

A. `const`  
B. `constant`  
C. `final`  
D. `static`  

### 6. What happens when a value is assigned to a variable after it has been declared `final`?

A. The old value is silently replaced  
B. The variable becomes `null`  
C. A compilation error occurs  
D. The value is converted automatically  

### 7. Which option correctly matches the comment type with its syntax?

A. Single-line: `/* comment */`  
B. Multi-line: `// comment`  
C. Documentation: `/** comment */`  
D. Documentation: `# comment`  

### 8. Which declaration follows the constant naming convention shown in the study material?

A. `final int maxSpeed = 120;`  
B. `final int MaxSpeed = 120;`  
C. `final int MAX_SPEED = 120;`  
D. `final int max_speed = 120;`  

---

## Section B — Variable Naming Rules & Identifiers

### 9. Which statement about Java identifiers is correct?

A. Java ignores letter case in variable names  
B. A variable name may begin with a digit  
C. A variable name may begin with a letter, `_`, or `$`  
D. Spaces are allowed in variable names  

### 10. Which pair represents two different variables in Java?

A. `number` and `number`  
B. `number` and `Number`  
C. `student` and `student`  
D. `$total` and `$total`  

### 11. Which identifier is valid according to the supplied naming rules?

A. `1fast`  
B. `student-count`  
C. `total marks`  
D. `_score`  

### 12. Which identifier is invalid ?

A. `studentCount`  
B. `student_count`  
C. `student-count`  
D. `$student`  

### 13. Why is `for` invalid as a variable name?

A. It contains a special character  
B. It begins with a lowercase letter  
C. It is a Java keyword  
D. It contains only three letters  

### 14. Which character is explicitly allowed after the first character of a variable name?

A. `#`  
B. `@`  
C. `_`  
D. `%`  

### 15. Which naming style is recommended for normal variables?

A. `UPPER_CASE`  
B. `lowerCamelCase`  
C. `Pascal_Case`  
D. `lower-case`  

### 16. Which declaration is legal but specifically described as **not recommended** in the supplied material?

A. `int studentCount = 100;`  
B. `int gearRatio = 6;`  
C. `int _score = 95;`  
D. `int totalMarks = 100;`  

### 17. Which pair demonstrates Java's case sensitivity?

A. `age` and `age`  
B. `number` and `Number`  
C. `total` and `total`  
D. `_score` and `_score`  

### 18. Which variable name best follows the meaningful-name principle?

A. `x1`  
B. `temp123`  
C. `studentCount`  
D. `a2`  

---

## Section C — Primitive & Non-Primitive Data Types

### 19. How many primitive data types are listed in the supplied Java material?

A. 6  
B. 7  
C. 8  
D. 9  

### 20. Which of the following is a primitive data type?

A. `String`  
B. `Array`  
C. `Class`  
D. `int`  

### 21. Which group contains only primitive data types?

A. `int`, `double`, `char`, `boolean`  
B. `String`, `int`, `Array`, `Class`  
C. `String`, `Class`, `Interface`, `Array`  
D. `Array`, `double`, `String`, `Class`  

### 22. Which group contains only non-primitive types listed in the study material?

A. `int`, `long`, `float`, `double`  
B. `String`, arrays, classes, interfaces  
C. `byte`, `short`, `char`, `boolean`  
D. `char`, `String`, `int`, `Array`  

### 23. What is the size of an `int` according to the supplied material?

A. 8 bits  
B. 16 bits  
C. 32 bits  
D. 64 bits  

### 24. What is the size of a `long`?

A. 16 bits  
B. 32 bits  
C. 64 bits  
D. 128 bits  

### 25. Which primitive type is described as a 16-bit Unicode character type?

A. `byte`  
B. `char`  
C. `short`  
D. `boolean`  

### 26. Which range is given for `byte`?

A. `-128` to `127`  
B. `-255` to `255`  
C. `0` to `255`  
D. `-32,768` to `32,767`  

### 27. Which range is given for `short`?

A. `-128` to `127`  
B. `-32,768` to `32,767`  
C. `0` to `65,535`  
D. `-2,147,483,648` to `2,147,483,647`  

### 28. Which default value is listed for `char`?

A. `0`  
B. `0.0`  
C. `false`  
D. `'\u0000'`  

### 29. Which statement correctly describes the supplied distinction between `float` and `double`?

A. `float` is 64-bit and `double` is 32-bit  
B. Both are 16-bit  
C. `float` is 32-bit and `double` is 64-bit  
D. `float` stores characters while `double` stores booleans  

### 30. Why does the following declaration include `f`?

```java
float pi = 3.1483467575376975f;
```

A. `f` indicates the value is a `float` literal  
B. `f` makes the value a `final` variable  
C. `f` converts the value to `double`  
D. `f` is required only for integers  

### 31. Which literal suffix is used in the supplied example for a `long` value?

A. `F`  
B. `D`  
C. `L`  
D. `S`  

### 32. Which statement correctly represents a Unicode character declaration from the material?

A. `char euro = "\u20AC";`  
B. `char euro = '\u20AC';`  
C. `String euro = '\u20AC';`  
D. `char euro = \u20AC;`  

### 33. Which output is produced by the following statement? (Optional-if u know ans it)

```java
char unicodeDemo = '\u20AC';
System.out.println(unicodeDemo);
```

A. `$`  
B. `€`  
C. `¥`  
D. `£`  

### 34. Which statement about arrays matches the supplied material?

A. Arrays are listed as primitive data types  
B. Arrays are listed as non-primitive data types  
C. Arrays cannot contain numeric values  
D. Arrays always use one-based indexing  

### 35. Given:

```java
float[] marks = {1, 2, 3, 4};
```

What is printed by:

```java
System.out.println(marks[2]);
```

A. `1.0`  
B. `2.0`  
C. `3.0`  
D. `4.0`  

### 36. What happens when an array element outside the valid index range is accessed?

A. The first element is returned  
B. `null` is returned  
C. `ArrayIndexOutOfBoundsException` occurs  
D. The array automatically expands  

---

## Section D — Decision Making

### 37. What is the primary purpose of decision-making statements?

A. To store values permanently  
B. To choose execution paths based on conditions  
C. To create arrays  
D. To define methods  

### 38. Which statement executes a block only when its condition is true?

A. `if`  
B. `switch` only  
C. `for`  
D. `continue`  

### 39. Which construct provides a choice between two blocks?

A. `if`  
B. `if-else`  
C. `else-if` only  
D. `for`  

### 40. Which construct is suitable when several conditions need to be checked in sequence?

A. `else-if ladder`  
B. `do-while`  
C. `continue`  
D. Method call  

### 41. What is a nested `if`?

A. An `if` statement placed inside another `if` statement  
B. An `if` statement placed only inside a loop  
C. Multiple `switch` statements  
D. An `if` statement without a condition  

### 42. Consider:

```java
int marks = 35;

if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

What is the output?

A. `Pass`  
B. `Fail`  
C. `35`  
D. No output  

### 43. What is the output?

```java
int score = 85;

if (score >= 90) {
    System.out.println("Grade A");
} else if (score >= 75) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}
```

A. `Grade A`  
B. `Grade B`  
C. `Grade C`  
D. Compilation error  

### 44. In the following nested condition, when is `Login Successful` printed?

```java
if (usernameCorrect) {
    if (passwordCorrect) {
        System.out.println("Login Successful");
    }
}
```

A. Only when both conditions are true  
B. When either condition is true  
C. Only when both conditions are false  
D. Always  

### 45. In the traditional switch example, what is printed when `day` is `2`?

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid Day");
}
```

A. `Monday`  
B. `Tuesday`  
C. `Invalid Day`  
D. Nothing  

### 46. What is the purpose of `break` in the traditional switch example?

A. It skips the current variable declaration  
B. It terminates the current switch case flow  
C. It repeats the selected case  
D. It converts the case into an expression  

### 47. Which switch syntax is shown in the material as an arrow-style form?

A. `case 1 : Monday;`  
B. `case 1 -> System.out.println("Monday");`  
C. `case -> 1 Monday;`  
D. `switch -> case 1;`  

### 48. What does the following switch expression produce?

```java
char grade = 'A';

System.out.println(
    switch (grade) {
        case 'A' -> "Excellent";
        case 'B' -> "Very Good";
        case 'C' -> "Good";
        case 'D' -> "Average";
        case 'F' -> "Fail";
        default -> "Invalid Grade";
    }
);
```

A. `A`  
B. `Excellent`  
C. `Very Good`  
D. `Invalid Grade`  

### 49. Which option is the best match for the decision-making examples listed in the study material?

A. Login validation and grade calculation  
B. Memory allocation and garbage collection  
C. File compression and encryption only  
D. Class loading and bytecode generation  

---

## Section E — Loops

### 50. Why are loops used?

A. To execute a block repeatedly  
B. To make every variable constant  
C. To prevent conditions from being evaluated  
D. To replace all methods  

### 51. Which loop is described as suitable when the number of iterations is known?

A. `while`  
B. `do-while`  
C. `for`  
D. `switch`  

### 52. Which loop checks its condition before executing its body?

A. `while`  
B. `do-while`  
C. Both always execute once before checking  
D. Neither  

### 53. Which loop is guaranteed by its structure to execute its body at least once?

A. `for`  
B. `while`  
C. `do-while`  
D. Enhanced `for-each`  

### 54. What is the output sequence?

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

A. `0 1 2 3 4`  
B. `1 2 3 4 5`  
C. `1 2 3 4`  
D. `2 3 4 5 6`  

### 55. How many times does the loop body execute?

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

A. 4  
B. 5  
C. 6  
D. Infinite times  

### 56. Consider:

```java
int z = 20;

do {
    System.out.println(z);
    z++;
} while (false);
```

What is the output?

A. Nothing  
B. `20`  
C. `20 21`  
D. Infinite sequence  

### 57. What is the main characteristic of the enhanced `for-each` loop shown in the material?

A. It is used to traverse arrays and collections  
B. It can only traverse integers  
C. It always counts from 1 to 10  
D. It can only be used with `switch`  

### 58. What is printed?

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
```

A. `0 1 2 3 4`  
B. `10 20 30 40 50`  
C. `10 20 30 40`  
D. `50 40 30 20 10`  

### 59. Which statement correctly describes the general loop flow presented in the material?

A. Body executes before condition in every loop  
B. Condition is checked and the loop continues while the condition remains true  
C. Loop always executes exactly once  
D. Condition is never checked again after the first iteration  

### 60. Which loop is explicitly called an "Iteration Statement" in the supplied material?

A. Only `for`  
B. Only `while`  
C. Loops generally  
D. Only `do-while`  

---

## Section F — Jump Statements

### 61. What is the main purpose of jump statements?

A. To alter the normal flow of execution  
B. To declare primitive variables  
C. To define constants  
D. To create packages  

### 62. Which two jump statements are covered in the supplied material?

A. `break` and `continue`  
B. `return` and `goto`  
C. `throw` and `throws`  
D. `switch` and `case`  

### 63. What does `break` do when used inside the loop example?

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

A. Prints `1 2 3 4`  
B. Prints `1 2 3 4 5`  
C. Prints `5 6 7 8 9 10`  
D. Prints nothing  

### 64. In the following loop, what is skipped?

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

A. Only `1`  
B. Only `2`  
C. Only `3`  
D. Only `5`  

### 65. Which statement best describes the difference between `break` and `continue`?

A. Both terminate the entire loop  
B. `break` terminates the loop; `continue` skips the current iteration  
C. `break` skips the current iteration; `continue` terminates the loop  
D. Both restart the loop  

### 66. Which jump statement is useful when the remaining statements of the current iteration should be skipped?

A. `break`  
B. `continue`  
C. `switch`  
D. `if`  

### 67. What happens when a continue statement is executed inside a loop?

A. The entire loop is instantly terminated, and the program moves to the code after the loop 
B. The current iteration stops immediately, and the loop starts over from the very first iteration
C. The remaining code inside the current iteration is skipped, and the loop moves directly to the next iteration 
D. The program pauses execution and waits for user input before resuming the loop

---

## Section G — Methods

### 68. What is a method according to the supplied material?

A. A variable that stores multiple values  
B. A block of code that performs a specific task  
C. A Java keyword  
D. A loop condition  

### 69. Which is a major reason for using methods?

A. To increase code duplication  
B. To avoid reusing code  
C. To improve reusability and maintainability  
D. To eliminate all variables  

### 70. Which structure matches the method creation syntax shown in the material?

A. `methodName returnType() accessModifier`  
B. `accessModifier static returnType methodName() { }`  
C. `returnType = methodName accessModifier()`  
D. `static = accessModifier methodName()`  

### 71. Which statement correctly calls a no-argument method named `sayHello`?

A. `call sayHello;`  
B. `sayHello();`  
C. `method.sayHello;`  
D. `sayHello[];`  

### 72. What is the key difference between a parameter and an argument?

A. A parameter is the actual value; an argument is the variable in the method declaration  
B. A parameter is a variable in the method declaration; an argument is the actual value passed  
C. They are always unrelated concepts  
D. Parameters can only be integers  

### 73. In the call below, what is `"John"`?

```java
sayHello("John");
```

A. Parameter  
B. Argument  
C. Return type  
D. Access modifier  

### 74. In the following method, what is `name`?

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
}
```

A. Argument  
B. Parameter  
C. Return value  
D. Class name  

### 75. What is the return type of this method?

```java
private static int add(int a, int b) {
    return a + b;
}
```

A. `void`  
B. `int`  
C. `String`  
D. `boolean`  

### 76. What does `void` indicate in a method declaration?

A. The method returns an integer  
B. The method returns a string  
C. The method returns no value  
D. The method cannot be called  

### 77. What is returned by the following call?

```java
int result = add(10, 20);
```

assuming:

```java
private static int add(int a, int b) {
    return a + b;
}
```

A. `10`  
B. `20`  
C. `30`  
D. `200`  

### 78. What happens conceptually after a method finishes executing?

A. Control returns to the caller  
B. The Java program must always terminate  
C. All variables become constants  
D. The method automatically executes again  

### 79. Which option is **not** listed as an advantage of methods in the supplied material?

A. Code reusability  
B. Easier maintenance  
C. Better readability  
D. Guaranteed faster execution  

### 80. Why is `static` used for the `sayHello()` method in the supplied example?

A. The method is being called without creating an object of the class  
B. It makes the method return an integer  
C. It makes every parameter constant  
D. It prevents the method from being called  

---

## Section H — Integrated Code & Reasoning Questions

### 81. What is the output?

```java
int number = 10;
int Number = 20;

System.out.println(number);
System.out.println(Number);
```

A.
```text
10
10
```

B.
```text
20
20
```

C.
```text
10
20
```

D. Compilation error  

### 82. What is the output?

```java
final int MAX_SPEED = 120;
System.out.println(MAX_SPEED);
```

A. `0`  
B. `120`  
C. `MAX_SPEED`  
D. Compilation error  

### 83. Which declaration is invalid?

A. `int age = 25;`  
B. `int _score = 95;`  
C. `int $total = 500;`  
D. `int 1score = 95;`  

### 84. What is printed?

```java
int age = 17;

if (age >= 18) {
    System.out.println("Eligible");
} else {
    System.out.println("Not Eligible");
}
```

A. `Eligible`  
B. `Not Eligible`  
C. `17`  
D. No output  

### 85. What is the output?

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.print(i + " ");
}
```

A. `1 2 3 4 5`  
B. `1 2 4 5`  
C. `3 4 5`  
D. `1 2`  

### 86. What is the output?

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.print(i + " ");
}
```

A. `1 2`  
B. `1 2 3`  
C. `1 2 4 5`  
D. `3 4 5`  

### 87. What does this method call print?

```java
sayHello("Michael");
```

with:

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
}
```

A. `Hello, name`  
B. `Hello, Michael`  
C. `Michael, Hello`  
D. Compilation error  

### 88. What is the output?

```java
int result = add(10, 20);
System.out.println(result);
```

with:

```java
private static int add(int a, int b) {
    return a + b;
}
```

A. `10`  
B. `20`  
C. `30`  
D. `1020`  

### 89. Which statement correctly identifies all concepts demonstrated here?

```java
int[] numbers = {10, 20, 30};

for (int number : numbers) {
    if (number == 20) {
        continue;
    }
    System.out.println(number);
}
```

A. Array, enhanced for-each loop, `if`, and `continue`  
B. Only an array and a method  
C. Switch, `break`, and `while`  
D. Only a `for` loop  

### 90. What is the output?

```java
char grade = 'B';

System.out.println(
    switch (grade) {
        case 'A' -> "Excellent";
        case 'B' -> "Very Good";
        case 'C' -> "Good";
        default -> "Invalid Grade";
    }
);
```

A. `Excellent`  
B. `Very Good`  
C. `Good`  
D. `Invalid Grade`  

### 91. Which statement correctly combines the supplied concepts?

A. A `final` variable can be reassigned freely inside a loop  
B. A method parameter is the actual value supplied by the caller  
C. A `continue` skips the current loop iteration, while `break` terminates the loop  
D. Java treats `number` and `Number` as the same variable  

### 92. Consider:

```java
float[] marks = {1, 2, 3, 4};

System.out.println(marks[0]);
System.out.println(marks[2]);
```

What is printed?

A.
```text
1.0
3.0
```

B.
```text
0
2
```

C.
```text
1
3
```

D.
```text
2.0
4.0
```

### 93. Which option contains only valid declarations according to the supplied naming rules?

A. `int student-count = 10;` and `int age = 20;`  
B. `int studentCount = 10;` and `int _score = 95;`  
C. `int 1student = 10;` and `int age = 20;`  
D. `int total marks = 100;` and `int age = 20;`  

### 94. What is the output?

```java
int score = 95;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 75) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

A. `A`  
B. `B`  
C. `C`  
D. `A B`  

### 95. Which statement about the following method is correct?

```java
private static void sayHello() {
    System.out.println("Hello");
}
```

A. It accepts one `String` parameter  
B. It returns an `int`  
C. It has no parameters and returns no value  
D. It must be called through an object  

### 96. What is the output?

```java
int i = 10;

do {
    System.out.println(i);
    i++;
} while (i < 5);
```

A. Nothing  
B. `10`  
C. `10 11 12 13 14`  
D. Infinite loop  

### 97. Which statement about the enhanced `for-each` loop is correct?

A. The loop variable receives each element of the array during traversal  
B. The loop always starts from index `1`  
C. It requires an explicit `i++` statement  
D. It can only traverse `int` arrays  

### 98. Which sequence correctly describes the supplied method execution flow?

A. Call → define → return → execute  
B. Define → call → execute method body → return control  
C. Execute body → define → call → return  
D. Define → return → call → execute  

### 99. Which code correctly declares a constant according to the supplied material?

A. `constant int MAX = 100;`  
B. `final int MAX = 100;`  
C. `const int MAX = 100;`  
D. `static constant MAX = 100;`  

### 100. Which statement best summarizes the role of the topics covered in the supplied files?

A. Variables store data, data types describe the kind of data, control flow manages execution, and methods organize reusable behavior  
B. Variables are only used for loops, while methods are only used for arrays  
C. Data types replace control flow, and methods replace variables  
D. Control flow is unrelated to program execution  

---

---

# Part 2 — Java Operators MCQs

# Java Operators --- MCQs

## Section A --- Introduction & Operator Classification

### 101. What is the primary purpose of an operator in Java?

A. To store only strings\
B. To perform operations on operands\
C. To declare classes\
D. To create packages

### 102. In the expression `int sum = a + b;`, which elements are operands?

A. `+` and `=`\
B. `sum` and `+`\
C. `a` and `b`\
D. `int` and `sum`

### 103. Which category of operators works on exactly one operand?

A. Binary\
B. Ternary\
C. Unary\
D. Relational

### 104. Which expression demonstrates a binary operator?

A. `++a`\
B. `!flag`\
C. `a + b`\
D. `condition ? x : y`

### 105. Which expression contains a ternary operation?

A. `a * b`\
B. `++a`\
C. `a > b`\
D. `condition ? value1 : value2`

### 106. Which of the following is NOT listed as a major operator type in the document?

A. Arithmetic\
B. Relational\
C. Logical\
D. Constructor

------------------------------------------------------------------------

## Section B --- Arithmetic Operators

### 107. Which operator performs addition?

A. `&`\
B. `+`\
C. `++`\
D. `+=`

### 108. What is the result of `10 + 5`?

A. `5`\
B. `10`\
C. `15`\
D. `50`

### 109. What does the `-` arithmetic operator perform?

A. Division\
B. Subtraction\
C. Increment\
D. Comparison

### 110. What is the value of `10 * 5`?

A. `15`\
B. `2`\
C. `50`\
D. `5`

### 111. What does the modulus operator `%` return?

A. Quotient\
B. Product\
C. Remainder\
D. Difference

### 112. What is the result of `10 % 3`?

A. `0`\
B. `1`\
C. `2`\
D. `3`

### 113. What is the output of the following?

``` java
int result = 10 / 3;
```

A. `3.3333333...`\
B. `3`\
C. `1`\
D. `4`

### 114. Why does `10 / 3` produce `3` when both operands are integers?

A. Java rounds the answer upward\
B. Java performs integer division\
C. Java converts both values to double\
D. Java ignores the division operator

### 115. Which expression is used in the document to obtain decimal division?

A. `10 / 3.0`\
B. `(double) 10 / 3`\
C. `10 % 3`\
D. `10 * 3`

------------------------------------------------------------------------

## Section C --- Relational Operators

### 116. Which operator checks whether two values are equal?

A. `=`\
B. `==`\
C. `!=`\
D. `>=`

### 117. What does `10 != 5` evaluate to?

A. `true`\
B. `false`\
C. `5`\
D. `10`

### 118. Which operator checks whether the left operand is greater than the right operand?

A. `<`\
B. `>=`\
C. `>`\
D. `=>`

### 119. What does `10 < 5` return?

A. `true`\
B. `10`\
C. `5`\
D. `false`

### 120. Which operator means "greater than or equal to"?

A. `=>`\
B. `>=`\
C. `>>`\
D. `==`

### 121. Which expression checks whether 5 is less than or equal to 10?

A. `5 < 10`\
B. `5 >= 10`\
C. `5 <= 10`\
D. `5 == 10`

### 122. Which statement correctly distinguishes `=` and `==`?

A. Both are assignment operators\
B. `=` compares while `==` assigns\
C. `=` assigns while `==` compares\
D. Both perform comparison

### 123. Relational operators are commonly used in which of the following?

A. Decision making\
B. Package creation\
C. Object serialization only\
D. Import statements

------------------------------------------------------------------------

## Section D --- Logical Operators

### 124. Which operator represents logical AND?

A. `&`\
B. `&&`\
C. `||`\
D. `!`

### 125. When does logical AND `&&` return `true`?

A. When both conditions are true\
B. When either condition is true\
C. When both conditions are false\
D. When the first condition is false

### 126. What is the result of `true && false`?

A. `true`\
B. `false`\
C. `1`\
D. Compilation error

### 127. Which logical operator returns true if at least one condition is true?

A. `&&`\
B. `!`\
C. `||`\
D. `&`

### 128. What is the result of `false || true`?

A. `false`\
B. `true`\
C. `0`\
D. Compilation error

### 129. Which operator reverses a boolean value?

A. `!=`\
B. `~`\
C. `!`\
D. `-`

### 130. What is the result of `!true`?

A. `true`\
B. `false`\
C. `1`\
D. `0`

### 131. If the first condition of `A && B` is false, what happens according to the document?

A. Both conditions are always evaluated\
B. Java does not evaluate the second condition\
C. Java changes the second condition to false\
D. The expression becomes an error

### 132. If the first condition of `A || B` is true, what happens?

A. The second condition is not evaluated\
B. The second condition becomes false\
C. Both conditions must be false\
D. Java throws an exception

### 133. Which of these is an application of logical operators mentioned in the document?

A. Login systems\
B. Package declaration\
C. Class inheritance\
D. Method overloading

------------------------------------------------------------------------

## Section E --- Assignment Operators

### 134. Which operator is the basic assignment operator?

A. `==`\
B. `=`\
C. `:=`\
D. `=>`

### 135. What does `x = 10` do?

A. Compares `x` with 10\
B. Assigns 10 to `x`\
C. Adds 10 to `x`\
D. Multiplies `x` by 10

### 136. Which operator is equivalent to `x = x + 5`?

A. `x -= 5`\
B. `x *= 5`\
C. `x += 5`\
D. `x %= 5`

### 137. If `x = 10`, what will `x += 5` make `x`?

A. `5`\
B. `10`\
C. `15`\
D. `50`

### 138. Which expression is equivalent to `x = x - 5`?

A. `x += 5`\
B. `x -= 5`\
C. `x *= 5`\
D. `x /= 5`

### 139. Which compound assignment operator performs division?

A. `%=`\
B. `/=`\
C. `*=`\
D. `-=`

### 140. Which expression is equivalent to `x = x % 3`?

A. `x %= 3`\
B. `x /= 3`\
C. `x -= 3`\
D. `x %= x`

### 141. Consider:

``` java
int x = 10;
x += 5;
x -= 3;
```

What is the final value of `x`?

A. `8`\
B. `10`\
C. `12`\
D. `18`

### 142. Which of the following is an application of assignment operators?

A. Score tracking\
B. Binary representation\
C. Boolean reversal\
D. Equality testing

------------------------------------------------------------------------

## Section F --- Unary Operators

### 143. What is the purpose of unary plus `+10`?

A. Converts 10 to negative\
B. Indicates a positive value\
C. Increments 10\
D. Compares 10

### 144. What does the increment operator `++` do?

A. Decreases a value by 1\
B. Increases a value by 1\
C. Multiplies by 2\
D. Reverses a boolean

### 145. What happens first with pre-increment `++x`?

A. The value is used and then incremented\
B. The value is incremented and then used\
C. The value is decremented\
D. The value is multiplied

### 146. What is printed here?

``` java
int x = 5;
System.out.println(++x);
```

A. `4`\
B. `5`\
C. `6`\
D. `7`

### 147. What is the important characteristic of post-increment `x++`?

A. It increments before using the value\
B. It uses the current value before incrementing\
C. It never changes x\
D. It decreases x

### 148. What is printed by this code?

``` java
int x = 5;
System.out.println(x++);
```

A. `4`\
B. `5`\
C. `6`\
D. `7`

### 149. After executing `x++` when `x` is initially 5, what is the final value of `x`?

A. `4`\
B. `5`\
C. `6`\
D. `10`

### 150. What does the decrement operator `--` do?

A. Increases a value by 1\
B. Decreases a value by 1\
C. Reverses a boolean\
D. Multiplies a value

### 151. What is printed by `System.out.println(x--)` when `x = 5`?

A. `4`\
B. `5`\
C. `6`\
D. `0`

### 152. After executing `x--` with `x` initially equal to 5, what is the final value?

A. `3`\
B. `4`\
C. `5`\
D. `6`

### 153. Which unary operator reverses a boolean value?

A. `-`\
B. `~`\
C. `!`\
D. `!=`

------------------------------------------------------------------------

## Section G --- Bitwise Operators

### 154. Which operator performs bitwise AND?

A. `&&`\
B. `&`\
C. `|`\
D. `^`

### 155. What is the result of `5 & 3`?

A. `1`\
B. `2`\
C. `6`\
D. `7`

### 156. Which bitwise operator returns 1 if at least one corresponding bit is 1?

A. `&`\
B. `^`\
C. `|`\
D. `~`

### 157. What is the result of `5 | 3`?

A. `1`\
B. `3`\
C. `6`\
D. `7`

### 158. Which bitwise operator returns 1 when corresponding bits are different?

A. `&`\
B. `|`\
C. `^`\
D. `~`

### 159. What is `5 ^ 3`?

A. `1`\
B. `4`\
C. `6`\
D. `7`

### 160. What does the bitwise complement operator `~` do?

A. Shifts bits right\
B. Flips all bits\
C. Sets all bits to 1\
D. Compares two numbers

### 161. What is the result of `~5` according to the document?

A. `5`\
B. `-5`\
C. `-6`\
D. `6`

### 162. Which representation does Java use for negative numbers as stated in the document?

A. Sign-magnitude\
B. One's complement\
C. Two's complement\
D. Decimal complement

### 163. Which operator shifts bits to the left?

A. `>>`\
B. `>>>`\
C. `<<`\
D. `<=`

### 164. What is the result of `5 << 1`?

A. `2`\
B. `5`\
C. `10`\
D. `20`

### 165. Which operator shifts bits to the right?

A. `<<`\
B. `>>`\
C. `>>>`\
D. `>=`

### 166. What is the result of `10 >> 1`?

A. `2`\
B. `5`\
C. `10`\
D. `20`

### 167. Which operator is specifically called the unsigned right shift operator?

A. `>>`\
B. `>>>`\
C. `<<`\
D. `~`

### 168. What happens to the leftmost bits during unsigned right shift according to the document?

A. They are filled with 1\
B. They remain unchanged\
C. They are filled with 0\
D. They are inverted

### 169. What is the result of `20 >>> 2` in the document?

A. `4`\
B. `5`\
C. `10`\
D. `40`

### 170. Which is listed as an application of bitwise operators?

A. Embedded Systems\
B. Login Systems\
C. Eligibility Checking\
D. Age Verification

------------------------------------------------------------------------

## Section H --- Ternary Operator

### 171. Which symbol represents the ternary operator?

A. `::`\
B. `?:`\
C. `??`\
D. `=>`

### 172. What is the correct general syntax?

A. `condition : expression1 ? expression2`\
B. `condition ? expression1 : expression2`\
C. `condition ? expression1 ; expression2`\
D. `condition && expression1 : expression2`

### 173. What is evaluated first in a ternary expression?

A. `expression1`\
B. `expression2`\
C. The condition\
D. The assignment

### 174. If the ternary condition is true, which expression is selected?

A. `expression1`\
B. `expression2`\
C. Both expressions\
D. Neither expression

### 175. What will this code produce?

``` java
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
```

A. `Minor`\
B. `Adult`\
C. `20`\
D. `true`

### 176. What is the result of this expression?

``` java
int a = 10;
int b = 20;
int max = (a > b) ? a : b;
```

A. `10`\
B. `20`\
C. `30`\
D. `false`

### 177. What will the following expression return?

``` java
int number = 8;
(number % 2 == 0) ? "Even" : "Odd"
```

A. `Odd`\
B. `8`\
C. `Even`\
D. `0`

### 178. Which statement is equivalent to a ternary expression?

A. `switch-case`\
B. Simple `if-else`\
C. `for` loop\
D. `while` loop

### 179. Which is an advantage of the ternary operator mentioned in the document?

A. It increases code length\
B. It eliminates all conditions\
C. It reduces code length\
D. It replaces every type of loop

### 180. Which is a listed application of the ternary operator?

A. Maximum/minimum finding\
B. Cryptography\
C. Device drivers\
D. Variable declaration

------------------------------------------------------------------------

## Section I --- Operator Precedence

### 181. Which category has the highest precedence in the provided table?

A. Unary\
B. Postfix\
C. Multiplicative\
D. Assignment

### 182. Which operators belong to the postfix category?

A. `++expr`, `--expr`\
B. `expr++`, `expr--`\
C. `+expr`, `-expr`\
D. `*`, `/`, `%`

### 183. Which group belongs to the unary precedence category?

A. `* / %`\
B. `+ -`\
C. `++ -- + - ~ !`\
D. `== !=`

### 184. Which category has higher precedence than additive operators?

A. Assignment\
B. Multiplicative\
C. Ternary\
D. Logical OR

### 185. Which category comes directly after multiplicative operators?

A. Additive\
B. Shift\
C. Equality\
D. Ternary

### 186. What is the precedence relationship between shift and relational operators in the provided table?

A. Relational is higher\
B. Shift is higher\
C. They have the same precedence\
D. Assignment is between them

### 187. Which category includes `==` and `!=`?

A. Relational\
B. Equality\
C. Logical AND\
D. Bitwise XOR

### 188. Which has higher precedence according to the table?

A. Logical AND\
B. Bitwise AND\
C. Logical OR\
D. Ternary

### 189. Which category comes immediately before logical AND in the precedence table?

A. Bitwise OR\
B. Bitwise XOR\
C. Equality\
D. Logical OR

### 190. Which category has the lowest precedence in the provided table?

A. Ternary\
B. Logical OR\
C. Assignment\
D. Equality

------------------------------------------------------------------------

## Section J --- Mixed Concept & Code-Based Questions

### 191. What is the value of `10 + 5 * 2` based on the provided precedence order?

A. `30`\
B. `20`\
C. `25`\
D. `15`

### 192. Which operator would be evaluated before `+` in the expression `a + b * c`?

A. `+`\
B. `*`\
C. `=`\
D. `?:`

### 193. What is the output?

``` java
int x = 5;
int y = x++;
System.out.println(y);
```

A. `4`\
B. `5`\
C. `6`\
D. `7`

### 194. What is the output?

``` java
int x = 5;
int y = ++x;
System.out.println(y);
```

A. `4`\
B. `5`\
C. `6`\
D. `7`

### 195. Which expression is appropriate when both conditions must be true?

A. `condition1 || condition2`\
B. `condition1 && condition2`\
C. `!condition1`\
D. `condition1 ^ condition2`

### 196. What is the final value of `x`?

``` java
int x = 10;
x += 5;
x *= 2;
```

A. `20`\
B. `25`\
C. `30`\
D. `15`

### 197. Which expression correctly represents the even-number test used in the ternary example?

A. `number / 2 == 0`\
B. `number % 2 == 0`\
C. `number * 2 == 0`\
D. `number + 2 == 0`

### 198. What does the expression `(a > b) ? a : b` determine?

A. Minimum of two numbers\
B. Sum of two numbers\
C. Maximum of two numbers\
D. Difference between two numbers

### 199. Which pair represents two different uses of the same `+` symbol discussed across operator categories?

A. Binary addition and unary plus\
B. Addition and bitwise OR\
C. Assignment and addition\
D. Increment and addition

### 200. Which group contains assignment operators listed in the precedence table?

A. `=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=`\
B. `==, !=, >=, <=`\
C. `&&, ||, !`\
D. `&, |, ^`

------------------------------------------------------------------------

---

# Combined Answer Key

| Q | Ans | Q | Ans | Q | Ans | Q | Ans |
|---:|:---:|---:|:---:|---:|:---:|---:|:---:|
| 1 | B | 51 | C | 101 | B | 151 | B |
| 2 | B | 52 | A | 102 | C | 152 | B |
| 3 | C | 53 | C | 103 | C | 153 | C |
| 4 | B | 54 | B | 104 | C | 154 | B |
| 5 | C | 55 | B | 105 | D | 155 | A |
| 6 | C | 56 | B | 106 | D | 156 | C |
| 7 | C | 57 | A | 107 | B | 157 | D |
| 8 | C | 58 | B | 108 | C | 158 | C |
| 9 | C | 59 | B | 109 | B | 159 | C |
| 10 | B | 60 | C | 110 | C | 160 | B |
| 11 | D | 61 | A | 111 | C | 161 | C |
| 12 | C | 62 | A | 112 | B | 162 | C |
| 13 | C | 63 | A | 113 | B | 163 | C |
| 14 | C | 64 | C | 114 | B | 164 | C |
| 15 | B | 65 | B | 115 | B | 165 | B |
| 16 | C | 66 | B | 116 | B | 166 | B |
| 17 | B | 67 | C | 117 | A | 167 | B |
| 18 | C | 68 | B | 118 | C | 168 | C |
| 19 | C | 69 | C | 119 | D | 169 | B |
| 20 | D | 70 | B | 120 | B | 170 | A |
| 21 | A | 71 | B | 121 | C | 171 | B |
| 22 | B | 72 | B | 122 | C | 172 | B |
| 23 | C | 73 | B | 123 | A | 173 | C |
| 24 | C | 74 | B | 124 | B | 174 | A |
| 25 | B | 75 | B | 125 | A | 175 | B |
| 26 | A | 76 | C | 126 | B | 176 | B |
| 27 | B | 77 | C | 127 | C | 177 | C |
| 28 | D | 78 | A | 128 | B | 178 | B |
| 29 | C | 79 | D | 129 | C | 179 | C |
| 30 | A | 80 | A | 130 | B | 180 | A |
| 31 | C | 81 | C | 131 | B | 181 | B |
| 32 | B | 82 | B | 132 | A | 182 | B |
| 33 | B | 83 | D | 133 | A | 183 | C |
| 34 | B | 84 | B | 134 | B | 184 | B |
| 35 | C | 85 | B | 135 | B | 185 | A |
| 36 | C | 86 | A | 136 | C | 186 | B |
| 37 | B | 87 | B | 137 | C | 187 | B |
| 38 | A | 88 | C | 138 | B | 188 | B |
| 39 | B | 89 | A | 139 | B | 189 | A |
| 40 | A | 90 | B | 140 | A | 190 | C |
| 41 | A | 91 | C | 141 | C | 191 | B |
| 42 | B | 92 | A | 142 | A | 192 | B |
| 43 | B | 93 | B | 143 | B | 193 | B |
| 44 | A | 94 | A | 144 | B | 194 | C |
| 45 | B | 95 | C | 145 | B | 195 | B |
| 46 | B | 96 | B | 146 | C | 196 | C |
| 47 | B | 97 | A | 147 | B | 197 | B |
| 48 | B | 98 | B | 148 | B | 198 | C |
| 49 | A | 99 | B | 149 | C | 199 | A |
| 50 | A | 100 | A | 150 | B | 200 | A |
