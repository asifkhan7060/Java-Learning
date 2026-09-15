# Java — A Overall Combined MCQ Test

> **Purpose:** This is the final combined test for everything covered so far:
> **Variables, Data Types, Control Flow, Methods, and Operators.**
>
> This is **not** a collection of every question from the individual tests. It is a curated set of **150 moderate-to-hard MCQs** designed to test actual understanding, code tracing, output prediction, concept connections, and common mistakes.
>
> **No silly one-line recall questions.**
>
> **Mastery target: 80% = 120/150**

The questions are based on the completed topic documents and their examples.

---

# Section A — Variables & Data Types

### 1.

Consider:

```java
int x;
x = 10;
x = 20;
```

Which statement correctly describes the sequence?

* A. `x` is declared, initialized, then reassigned
* B. `x` is initialized three times
* C. `x` is declared twice
* D. `x` becomes constant after `x = 20`

---

### 2.

What happens here?

```java
final int limit = 10;
limit = 20;
```

* A. `limit` becomes `20`
* B. Both values are stored
* C. Compilation fails because a final variable cannot be reassigned
* D. `limit` automatically becomes a normal variable

---

### 3.

Which declaration is both **syntactically valid** and follows the recommended normal-variable naming convention?

* A. `int Student_Count = 50;`
* B. `int studentCount = 50;`
* C. `int student-count = 50;`
* D. `int 2student = 50;`

---

### 4.

Which statement about `_score` and `$total` is correct according to the notes?

* A. Both are invalid identifiers
* B. Both are valid but specifically noted as not recommended
* C. Both are Java keywords
* D. They are valid only for constants

---

### 5.

Consider:

```java
int number = 10;
int Number = 20;

System.out.println(number + Number);
```

What is printed?

* A. `20`
* B. `30`
* C. `10`
* D. Compilation error

---

### 6.

A programmer wants to store a value that should never be overwritten. Which combination best matches the material?

* A. Normal variable + `lowerCamelCase`
* B. `final` + constant naming convention
* C. `static` + `lowerCamelCase`
* D. `boolean` + uppercase

---

### 7.

Which declaration violates the variable naming rules?

* A. `int total2Marks = 100;`
* B. `int _totalMarks = 100;`
* C. `int $totalMarks = 100;`
* D. `int total-Marks = 100;`

---

### 8.

A student says:

> "`studentCount` and `StudentCount` are effectively the same variable because they differ only in capitalization."

Which concept directly disproves this?

* A. Naming convention
* B. Case sensitivity
* C. Constant declaration
* D. String concatenation

---

### 9.

Which statement best distinguishes a naming **rule** from a naming **convention**?

* A. A rule determines legality; a convention guides recommended style
* B. A convention determines legality; a rule guides readability
* C. Both are compiler-enforced
* D. Neither affects variable names

---

### 10.

Which declaration correctly represents a constant according to the documented style?

* A. `final int maxSpeed = 120;`
* B. `final int MAX_SPEED = 120;`
* C. `int MAX-SPEED = 120;`
* D. `final int 1_MAX_SPEED = 120;`

---

### 11.

Which primitive type is the best fit for representing a single Unicode character?

* A. `String`
* B. `char`
* C. `boolean`
* D. `int[]`

---

### 12.

Which statement correctly classifies `String` and an array according to the material?

* A. Both are primitive
* B. Both are non-primitive
* C. `String` is primitive but arrays are not
* D. Arrays are primitive but `String` is not

---

### 13.

A value is `100000`. Which documented primitive integer type is the smallest obvious fit from the listed ranges?

* A. `byte`
* B. `short`
* C. `int`
* D. `char`

---

### 14.

Why does this declaration use `f`?

```java
float pi = 3.14f;
```

* A. It identifies the literal as a float value
* B. It converts the result to double
* C. It makes the value final
* D. It enables string concatenation

---

### 15.

What is the main reason this produces a different kind of result?

```java
int a = 10 / 3;
double b = (double) 10 / 3;
```

* A. The first uses integer division; the second performs decimal division
* B. The first is multiplication; the second is division
* C. Both produce exactly the same type and value
* D. `(double)` performs modulus

---

### 16.

What is the value of `a`?

```java
int a = 10 / 3;
```

* A. `3`
* B. `3.333333...`
* C. `4`
* D. `10`

---

### 17.

What is the value of `b`?

```java
double b = (double) 10 / 3;
```

* A. `3`
* B. `3.3333333333333335`
* C. `4`
* D. `1`

---

### 18.

Consider:

```java
char symbol = '\u20AC';
```

What concept is being demonstrated?

* A. Array initialization
* B. Unicode character representation
* C. String concatenation
* D. Boolean inversion

---

### 19.

For:

```java
float[] marks = {1, 2, 3, 4};
```

which index accesses the third element?

* A. `marks[1]`
* B. `marks[2]`
* C. `marks[3]`
* D. `marks[4]`

---

### 20.

What happens here?

```java
float[] marks = {1, 2, 3, 4};
System.out.println(marks[8]);
```

* A. `8` is printed
* B. The last element is printed
* C. `ArrayIndexOutOfBoundsException`
* D. The array automatically expands

---

### 21.

Which statement best explains why `marks[8]` fails?

* A. Arrays cannot contain `float`
* B. The requested index is outside the available elements
* C. Indexing begins from `1`
* D. `8` is a reserved keyword

---

### 22.

Which option correctly distinguishes `char` from `String` based on the supplied material?

* A. `char` is a primitive character type; `String` is listed as non-primitive
* B. Both are primitive
* C. `String` stores only one character
* D. `char` stores complete sentences

---

### 23.

Which statement correctly matches the documented ranges?

* A. `byte` has a larger range than `int`
* B. `short` has a larger range than `long`
* C. `int` has a larger range than `short`
* D. `char` includes negative values

---

### 24.

What is the key conceptual difference between `float` and `double` emphasized in the examples?

* A. `double` is shown as more precise
* B. `float` cannot contain decimals
* C. `double` is non-primitive
* D. `float` is used only for characters

---

### 25.

Which combined statement is correct?

* A. `boolean` stores true/false, `char` represents Unicode characters, arrays are non-primitive
* B. `boolean` stores characters, `char` stores decimals, arrays are primitive
* C. `boolean` and `char` are both non-primitive
* D. Arrays are primitive because they store multiple values

---

# Section B — Decision Making & Control Flow

### 26.

Consider:

```java
int age = 17;

if (age >= 18) {
    System.out.println("Eligible");
}
```

What happens?

* A. `Eligible` is printed
* B. Nothing inside the `if` executes
* C. Compilation fails
* D. `17` is printed

---

### 27.

What changes when the same logic is written as `if-else`?

* A. A second execution path can handle the false condition
* B. The condition becomes optional
* C. The code becomes a loop
* D. The condition is checked twice

---

### 28.

What is printed?

```java
int marks = 40;

if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

* A. `Fail`
* B. `Pass`
* C. Nothing
* D. `40`

---

### 29.

Consider:

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

What is printed?

* A. `A`
* B. `B`
* C. `C`
* D. Both A and B

---

### 30.

Why does the previous example not print both `A` and `B`?

* A. Once the applicable branch is selected, later branches are not executed
* B. `else-if` always checks only the final condition
* C. Both branches are comments
* D. The first condition is automatically false after execution

---

### 31.

What is printed?

```java
int score = 74;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 75) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

* A. `A`
* B. `B`
* C. `C`
* D. Nothing

---

### 32.

What must be true for this nested structure to print `"Login Successful"`?

```java
if (usernameCorrect) {
    if (passwordCorrect) {
        System.out.println("Login Successful");
    }
}
```

* A. Either condition can be true
* B. Both conditions must be true
* C. Only password must be true
* D. Both must be false

---

### 33.

What happens if `usernameCorrect == false` regardless of the password?

* A. The inner block cannot be reached through that path
* B. The login succeeds if the password is true
* C. Both blocks execute
* D. The password becomes false

---

### 34.

Which construct is most suitable when one value must be compared against several fixed alternatives?

* A. `switch`
* B. `while`
* C. `continue`
* D. `do-while`

---

### 35.

What is printed?

```java
int day = 5;

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

* A. `Monday`
* B. `Tuesday`
* C. `Invalid Day`
* D. Nothing

---

### 36.

Why is `break` significant in the traditional switch example?

* A. It prevents execution from continuing into later cases
* B. It forces the default case
* C. It repeats the selected case
* D. It converts switch into if-else

---

### 37.

Which statement best describes `default` in the shown switch examples?

* A. It handles cases not matched by the listed cases
* B. It always executes after every case
* C. It must execute before case 1
* D. It replaces `break`

---

### 38.

Which behavior is associated with the arrow-style switch shown in the notes?

* A. The selected arrow case directly performs its associated action
* B. Every arrow case executes
* C. Arrow cases require another `if`
* D. Arrow cases cannot have `default`

---

### 39.

What is printed?

```java
int day = 3;

switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Invalid Day");
}
```

* A. Monday
* B. Tuesday
* C. Wednesday
* D. Invalid Day

---

### 40.

What is printed?

```java
char grade = 'B';

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

* A. `B`
* B. `Excellent`
* C. `Very Good`
* D. `Invalid Grade`

---

### 41.

What is conceptually different about the final switch example?

* A. The switch produces a value that is passed to `println()`
* B. It is no longer decision making
* C. It is actually a loop
* D. It cannot use a default

---

### 42.

Which loop is most appropriate when the number of iterations is known in advance?

* A. `for`
* B. `while`
* C. `do-while`
* D. `switch`

---

### 43.

What is printed?

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

* A. `1 2 3 4`
* B. `1 2 3 4 5`
* C. `0 1 2 3 4`
* D. `5 4 3 2 1`

---

### 44.

Why does the `for` loop stop after `5`?

* A. After incrementing to `6`, `i <= 5` becomes false
* B. `println()` stops at 5
* C. `5` automatically means break
* D. Java does not allow `i` to exceed 5

---

### 45.

What is printed?

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

* A. `1 2 3 4 5`
* B. `0 1 2 3 4`
* C. `1 2 3 4`
* D. Infinite output

---

### 46.

Why is `i++` important in the previous `while` loop?

* A. It allows the condition to eventually become false
* B. It prints the value
* C. It declares `i`
* D. It changes the loop into `for`

---

### 47.

What is a major behavioral distinction of `do-while`?

* A. Its body executes before the condition is checked
* B. It never checks a condition
* C. It always executes five times
* D. It is identical to `while`

---

### 48.

What is printed?

```java
int i = 20;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

* A. Nothing
* B. `20`
* C. `20 21 22`
* D. Infinite loop

---

### 49.

Why does the previous `do-while` print `20` even though `20 <= 5` is false?

* A. The body executes before the condition is tested
* B. The condition is ignored
* C. Java treats 20 as less than 5
* D. `do` changes the value of `i`

---

### 50.

Consider:

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
```

What is `number` on each iteration?

* A. The current array element
* B. The current array index
* C. The array length
* D. A boolean condition

---

### 51.

Which loop is designed specifically in the material for traversing arrays and collections?

* A. `for-each`
* B. `while`
* C. `do-while`
* D. `if`

---

### 52.

What happens here?

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

* A. `1 2 3 4`
* B. `1 2 3 4 5`
* C. `5 6 7 8 9 10`
* D. `1 2 3 4 5 6 7 8 9 10`

---

### 53.

Why is `5` not printed in the previous code?

* A. `break` executes before the `println()` in that iteration
* B. The loop condition becomes false at 5
* C. `5` is invalid for `int`
* D. `println()` skips odd values

---

### 54.

What happens here?

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

* A. `1 2 3 4 5`
* B. `1 2 4 5`
* C. `1 2`
* D. `3 4 5`

---

### 55.

What is the key difference between the previous `break` and `continue` examples?

* A. `break` ends the loop; `continue` skips only the current iteration
* B. `break` skips an iteration; `continue` ends the loop
* C. Both end the loop
* D. Both skip the current iteration only

---

### 56.

Which scenario calls for `continue` rather than `break`?

* A. Ignore one unwanted value but keep processing later values
* B. Terminate the loop immediately
* C. Exit a switch
* D. Select one case

---

### 57.

Which scenario calls for `break`?

* A. Stop processing as soon as a terminating condition is reached
* B. Skip one value and keep going
* C. Re-run the current iteration
* D. Evaluate another branch

---

### 58.

Which statement best summarizes the general loop execution sequence from the material?

* A. Start → check condition → execute body if true → check again
* B. Start → execute body forever → check once
* C. Condition → terminate → body
* D. Start → break → body → condition

---

### 59.

If a `while` loop's control variable never changes and its initial condition is true, what is the likely consequence?

* A. The loop can continue indefinitely
* B. The loop executes exactly once
* C. The loop becomes a switch
* D. The compiler automatically inserts `break`

---

### 60.

Which option best distinguishes decision making from looping?

* A. Decision making selects an execution path; looping repeats execution
* B. Both always perform repetition
* C. Loops only make decisions
* D. Decision making is only used with arrays

---

# Section C — Methods

### 61.

Why is creating a method generally preferable to copying the same statements into many places?

* A. It centralizes the logic and allows reuse
* B. It prevents the code from executing
* C. It removes the need for method calls
* D. It forces all values to be constants

---

### 62.

What is the main purpose of a method?

* A. Perform a specific task in a reusable block
* B. Store all program data
* C. Replace all loops
* D. Create primitive types

---

### 63.

Consider:

```java
private static void sayHello() {
    System.out.println("Hello");
}
```

Which combination is correct?

* A. `private` = access modifier, `static` = static method, `void` = no return value
* B. `private` = return type, `static` = parameter, `void` = method name
* C. `private` = argument, `static` = return type
* D. `void` = access modifier

---

### 64.

What happens when:

```java
sayHello();
```

is executed?

* A. The defined `sayHello` method is invoked
* B. A new method is created
* C. The method is deleted
* D. Only its name is printed

---

### 65.

Which sequence correctly describes method execution?

* A. Define → call → enter method → execute body → return to caller
* B. Call → define → return → execute
* C. Define → return → call → execute
* D. Execute → define → call → return

---

### 66.

Why can a method be called multiple times without rewriting its internal statements?

* A. The method definition remains available and can be invoked repeatedly
* B. Java duplicates the source code automatically
* C. Every call creates a new method definition
* D. Method bodies execute only once

---

### 67.

Consider:

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
}
```

What is `name`?

* A. Parameter
* B. Argument
* C. Return value
* D. Method call

---

### 68.

What is `"John"` here?

```java
sayHello("John");
```

* A. Parameter
* B. Argument
* C. Return type
* D. Method definition

---

### 69.

Which statement correctly distinguishes parameter and argument?

* A. Parameter is declared in the method; argument is supplied during the call
* B. Parameter is supplied during the call; argument is declared in the method
* C. Both mean exactly the same thing
* D. Both are return values

---

### 70.

What is printed?

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
}

sayHello("Michael");
```

* A. `Hello, name`
* B. `Hello, Michael`
* C. `Michael`
* D. Nothing

---

### 71.

Why can the same method handle:

```java
sayHello("John");
sayHello("Michael");
sayHello("Mohan");
```

without changing its body?

* A. Each call supplies a different argument to the same parameter
* B. Each call creates a different parameterized method
* C. The method body changes automatically
* D. `String` is replaced by the argument

---

### 72.

What does `void` tell you about:

```java
private static void sayHello()
```

?

* A. The method returns no value
* B. The method must return an integer
* C. The method accepts no statements
* D. The method can never be called

---

### 73.

Consider:

```java
int add(int a, int b) {
    return a + b;
}
```

Which is correct?

* A. `a` and `b` are parameters and `int` is the return type
* B. `a` and `b` are arguments and `int` is the parameter type
* C. `a + b` is an argument
* D. `return` defines the method

---

### 74.

What are the arguments in:

```java
add(10, 20);
```

* A. `a` and `b`
* B. `10` and `20`
* C. `int` and `int`
* D. `a + b`

---

### 75.

What does the method return?

```java
int add(int a, int b) {
    return a + b;
}
```

* A. `a`
* B. `b`
* C. `a + b`
* D. Nothing

---

### 76.

What is stored in `result`?

```java
int result = add(10, 20);
```

* A. `10`
* B. `20`
* C. `30`
* D. `200`

---

### 77.

Why is storing `add(10, 20)` in a variable possible?

* A. The method returns an integer value
* B. The method uses `void`
* C. Arguments are automatically variables
* D. `return` creates a new method

---

### 78.

Which method best matches: "Accept two integers and return their sum"?

* A.

```java
int add(int a, int b) {
    return a + b;
}
```

* B.

```java
void add(int a, int b) {
    System.out.println(a + b);
}
```

* C.

```java
int add() {
    return 10 + 20;
}
```

* D.

```java
String add(int a, int b) {
    return a + b;
}
```

---

### 79.

What is the major conceptual difference between:

```java
void sayHello()
```

and

```java
int add(int a, int b)
```

?

* A. The first returns nothing and accepts no parameter; the second accepts parameters and returns an integer
* B. Both return integers
* C. The first accepts parameters and the second does not
* D. Neither can be reused

---

### 80.

Which sequence best describes:

```java
int result = add(10, 20);
```

* A. Arguments → parameters receive values → method executes → value returned → caller stores result
* B. Result → parameters → arguments → method definition
* C. Parameters → method call → arguments disappear
* D. Method returns before it executes

---

### 81.

Which advantage is most directly demonstrated by:

```java
sayHello();
sayHello();
sayHello();
```

* A. Reusability
* B. Encapsulation
* C. Inheritance
* D. Array traversal

---

### 82.

Why does centralizing repeated code improve maintenance?

* A. A change can often be made in one method rather than in every duplicated copy
* B. The method cannot be changed
* C. All callers are deleted
* D. It prevents parameters

---

### 83.

Which set contains only advantages explicitly associated with methods in the document?

* A. Reusability, less duplication, maintenance, readability, modular programming, debugging
* B. Inheritance, polymorphism, interfaces, abstraction
* C. Multithreading, networking, serialization, reflection
* D. Arrays, operators, loops, packages

---

### 84.

Within the implementation comments, why is `private` used on the example methods?

* A. To restrict access to the method from other classes
* B. To specify the return type
* C. To make the method return an integer
* D. To pass arguments

---

### 85.

Within the implementation comments, why is `static` used in the simple methods?

* A. The method is being used without creating an object in the shown static context
* B. It means the method returns `void`
* C. It makes the method private
* D. It converts parameters into arguments

---

# Section D — Operators

### 86.

Consider:

```java
int a = 10;
int b = 20;
int sum = a + b;
```

Which is the operator and which are the operands?

* A. `sum` = operator; `a`, `b` = operands
* B. `+` = operator; `a`, `b` = operands
* C. `a`, `b` = operators; `+` = operand
* D. `10`, `20` = operators

---

### 87.

Which expression is unary?

* A. `a + b`
* B. `a > b`
* C. `++a`
* D. `a && b`

---

### 88.

Which expression is binary?

* A. `!a`
* B. `++a`
* C. `a + b`
* D. `condition ? a : b`

---

### 89.

Which expression is ternary?

* A. `a + b`
* B. `++a`
* C. `condition ? x : y`
* D. `a == b`

---

### 90.

What is the result?

```java
int result = 10 + 5 * 2;
```

* A. `30`
* B. `20`
* C. `25`
* D. `15`

---

### 91.

Why is the answer to the previous expression `20`?

* A. Multiplication has higher precedence than addition
* B. Addition has higher precedence
* C. Assignment happens first
* D. Operators are evaluated left-to-right regardless of category

---

### 92.

What is the result?

```java
int result = 20 - 8 / 2;
```

* A. `6`
* B. `16`
* C. `12`
* D. `24`

---

### 93.

What is the result?

```java
int result = 10 % 4;
```

* A. `0`
* B. `1`
* C. `2`
* D. `2.5`

---

### 94.

What is the result?

```java
int result = 10 / 3;
```

* A. `3`
* B. `3.333...`
* C. `4`
* D. `1`

---

### 95.

What is the result?

```java
double result = (double) 10 / 3;
```

* A. `3`
* B. `3.3333333333333335`
* C. `4`
* D. `1`

---

### 96.

Which operator produces a boolean result?

* A. `%`
* B. `==`
* C. `*=`
* D. `<<`

---

### 97.

What is the result?

```java
10 == 5
```

* A. `true`
* B. `false`
* C. `5`
* D. `10`

---

### 98.

What is the result?

```java
10 != 5
```

* A. `true`
* B. `false`
* C. `15`
* D. `0`

---

### 99.

What is the result?

```java
10 >= 10
```

* A. `true`
* B. `false`
* C. `10`
* D. Compilation error

---

### 100.

Which pair correctly distinguishes assignment from comparison?

* A. `=` assigns; `==` compares
* B. `==` assigns; `=` compares
* C. Both compare
* D. Both assign

---

### 101.

What is the result?

```java
boolean result = true && false;
```

* A. `true`
* B. `false`
* C. `1`
* D. Compilation error

---

### 102.

What is the result?

```java
boolean result = false || true;
```

* A. `true`
* B. `false`
* C. `0`
* D. `1`

---

### 103.

What is the result?

```java
boolean result = !false;
```

* A. `true`
* B. `false`
* C. `0`
* D. Compilation error

---

### 104.

Which condition must hold for `A && B` to be true?

* A. At least one is true
* B. Both are true
* C. Both are false
* D. A must be false

---

### 105.

Which condition must hold for `A || B` to be false?

* A. Both are true
* B. At least one is true
* C. Both are false
* D. A is true

---

### 106.

What happens because of short-circuit evaluation in:

```java
false && someCondition
```

?

* A. `someCondition` is not evaluated
* B. `someCondition` must be true
* C. Both sides are always evaluated
* D. The result becomes true

---

### 107.

What happens because of short-circuit evaluation in:

```java
true || someCondition
```

?

* A. `someCondition` is not evaluated
* B. `someCondition` must be false
* C. Both sides are evaluated
* D. The result becomes false

---

### 108.

What is the final value?

```java
int x = 10;
x += 5;
x -= 3;
```

* A. `8`
* B. `12`
* C. `15`
* D. `2`

---

### 109.

What is the final value?

```java
int x = 10;
x *= 2;
x /= 4;
```

* A. `5`
* B. `20`
* C. `2`
* D. `40`

---

### 110.

What is the final value?

```java
int x = 10;
x %= 3;
```

* A. `0`
* B. `1`
* C. `3`
* D. `10`

---

### 111.

Which statement is equivalent to:

```java
x += 5;
```

* A. `x = x + 5`
* B. `x = 5`
* C. `x = x - 5`
* D. `x = x * 5`

---

### 112.

Which statement is equivalent to:

```java
x %= 3;
```

* A. `x = x + 3`
* B. `x = x - 3`
* C. `x = x % 3`
* D. `x = 3 % x`

---

### 113.

What is printed?

```java
int x = 5;
System.out.println(++x);
```

* A. `5`
* B. `6`
* C. `4`
* D. `7`

---

### 114.

What is printed?

```java
int x = 5;
System.out.println(x++);
```

* A. `5`
* B. `6`
* C. `4`
* D. `7`

---

### 115.

After:

```java
int x = 5;
System.out.println(x++);
```

what is the final value of `x`?

* A. `5`
* B. `6`
* C. `4`
* D. `7`

---

### 116.

What is printed?

```java
int x = 5;
System.out.println(--x);
```

* A. `5`
* B. `6`
* C. `4`
* D. `3`

---

### 117.

What is printed?

```java
int x = 5;
System.out.println(x--);
```

* A. `5`
* B. `4`
* C. `6`
* D. `3`

---

### 118.

After:

```java
int x = 5;
System.out.println(x--);
```

what is the final value?

* A. `5`
* B. `4`
* C. `6`
* D. `3`

---

### 119.

Which statement correctly compares pre-increment and post-increment?

* A. Pre-increment changes first and uses later; post-increment uses first and changes later
* B. Both use the new value
* C. Both use the old value
* D. Post-increment decrements the variable

---

### 120.

Which statement correctly compares pre-decrement and post-decrement?

* A. Pre-decrement changes first; post-decrement uses first
* B. Both increment
* C. Pre-decrement uses first; post-decrement changes first
* D. Neither changes the variable

---

### 121.

What is the result?

```java
5 & 3
```

given:

```text
5 = 0101
3 = 0011
```

* A. `1`
* B. `3`
* C. `6`
* D. `7`

---

### 122.

What is the result?

```java
5 | 3
```

* A. `1`
* B. `3`
* C. `6`
* D. `7`

---

### 123.

What is the result?

```java
5 ^ 3
```

* A. `1`
* B. `3`
* C. `6`
* D. `7`

---

### 124.

What is the result?

```java
~5
```

according to the supplied example?

* A. `5`
* B. `-5`
* C. `-6`
* D. `6`

---

### 125.

Why does `~5` become negative in the example?

* A. Bitwise complement flips the bits and Java uses two's complement for negative numbers
* B. `~` performs subtraction
* C. `~` converts the number to boolean
* D. `5` is treated as a negative number

---

### 126.

What is the result?

```java
5 << 1
```

* A. `2`
* B. `5`
* C. `10`
* D. `20`

---

### 127.

What is the result?

```java
10 >> 1
```

* A. `20`
* B. `10`
* C. `5`
* D. `2`

---

### 128.

What is the result?

```java
20 >>> 2
```

for the supplied example?

* A. `5`
* B. `10`
* C. `20`
* D. `40`

---

### 129.

Which statement distinguishes `>>` from `>>>` according to the material?

* A. `>>>` fills leftmost bits with zero
* B. `>>` fills leftmost bits with zero and `>>>` flips bits
* C. Both are identical
* D. `>>>` shifts left

---

### 130.

What is the result?

```java
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
```

* A. `Adult`
* B. `Minor`
* C. `true`
* D. `20`

---

### 131.

What is the result?

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;
```

* A. `10`
* B. `20`
* C. `30`
* D. `false`

---

### 132.

What is the result?

```java
int number = 8;
String result = (number % 2 == 0) ? "Even" : "Odd";
```

* A. `Even`
* B. `Odd`
* C. `8`
* D. `0`

---

### 133.

Which precedence ordering is correct from higher to lower?

* A. Unary → Multiplicative → Additive → Assignment
* B. Assignment → Additive → Unary → Multiplicative
* C. Additive → Multiplicative → Unary → Assignment
* D. Logical OR → Unary → Multiplicative → Assignment

---

### 134.

Which has higher precedence according to the supplied table?

* A. `+`
* B. `*`
* C. `&&`
* D. `?:`

---

### 135.

Which has higher precedence?

* A. Relational
* B. Equality
* C. Logical OR
* D. Assignment

---

# Section E — Integrated Cross-Topic Questions

### 136.

What is printed?

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible");
} else {
    System.out.println("Not Eligible");
}
```

* A. `Eligible`
* B. `Not Eligible`
* C. `20`
* D. Nothing

---

### 137.

What is printed?

```java
int marks = 35;

if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

* A. `Pass`
* B. `Fail`
* C. `35`
* D. Compilation error

---

### 138.

What is printed?

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

* A. `1 2`
* B. `1 2 3 4`
* C. `1 2 4`
* D. `1 2 4 5`

---

### 139.

What is printed?

```java
int x = 5;

if (x++ > 5) {
    System.out.println("A");
} else {
    System.out.println("B");
}

System.out.println(x);
```

* A. `A` then `6`
* B. `B` then `6`
* C. `A` then `5`
* D. `B` then `5`

---

### 140.

What is printed?

```java
int x = 5;

if (++x > 5) {
    System.out.println("A");
} else {
    System.out.println("B");
}
```

* A. `A`
* B. `B`
* C. `5`
* D. Nothing

---

### 141.

What is printed?

```java
int a = 10;

if (a > 5 && a < 20) {
    System.out.println("Valid");
}
```

* A. `Valid`
* B. Nothing
* C. `true`
* D. `10`

---

### 142.

What is printed?

```java
int a = 10;

if (a < 5 || a == 10) {
    System.out.println("Match");
}
```

* A. Nothing
* B. `Match`
* C. `false`
* D. `10`

---

### 143.

What happens here?

```java
boolean active = false;

if (active && someCondition) {
    System.out.println("Yes");
}
```

assuming `someCondition` would otherwise require evaluation?

* A. `someCondition` is skipped because of short-circuit AND
* B. `someCondition` must be evaluated
* C. The condition becomes true
* D. The `if` block executes

---

### 144.

What is printed?

```java
int x = 10;

if (x >= 10) {
    x += 5;
}

System.out.println(x);
```

* A. `10`
* B. `5`
* C. `15`
* D. `20`

---

### 145.

What is printed?

```java
int x = 10;

if (x >= 10) {
    x *= 2;
    x -= 5;
}

System.out.println(x);
```

* A. `15`
* B. `20`
* C. `25`
* D. `5`

---

### 146.

What is printed?

```java
private static int add(int a, int b) {
    return a + b;
}

int x = add(5, 10);

if (x > 10) {
    System.out.println(x);
}
```

* A. `5`
* B. `10`
* C. `15`
* D. Nothing

---

### 147.

What is printed?

```java
private static int add(int a, int b) {
    return a + b;
}

for (int i = 1; i <= 3; i++) {
    System.out.println(add(i, 2));
}
```

* A. `2 3 4`
* B. `3 4 5`
* C. `1 2 3`
* D. `4 5 6`

---

### 148.

What is printed?

```java
int x = 5;

for (int i = 1; i <= 3; i++) {
    x += i;
}

System.out.println(x);
```

* A. `8`
* B. `9`
* C. `10`
* D. `11`

---

### 149.

What is printed?

```java
int result = 5 + 2 * 3;

if (result > 10) {
    System.out.println("A");
} else {
    System.out.println("B");
}
```

* A. `A`
* B. `B`
* C. `11`
* D. `10`

---

### 150.

What is the final value of `x`?

```java
int x = 5;

x += 3;
x *= 2;
x--;
x %= 5;
```

* A. `0`
* B. `1`
* C. `2`
* D. `3`

---

# Answer Key

|  Q | Ans |  Q | Ans |  Q | Ans |   Q | Ans |   Q | Ans |
| -: | :-: | -: | :-: | -: | :-: | --: | :-: | --: | :-: |
|  1 |  A  | 31 |  C  | 61 |  A  |  91 |  A  | 121 |  A  |
|  2 |  C  | 32 |  B  | 62 |  A  |  92 |  B  | 122 |  D  |
|  3 |  B  | 33 |  A  | 63 |  A  |  93 |  C  | 123 |  C  |
|  4 |  B  | 34 |  A  | 64 |  A  |  94 |  A  | 124 |  C  |
|  5 |  B  | 35 |  C  | 65 |  A  |  95 |  B  | 125 |  A  |
|  6 |  B  | 36 |  A  | 66 |  A  |  96 |  B  | 126 |  C  |
|  7 |  D  | 37 |  A  | 67 |  A  |  97 |  B  | 127 |  C  |
|  8 |  B  | 38 |  A  | 68 |  B  |  98 |  A  | 128 |  A  |
|  9 |  A  | 39 |  C  | 69 |  A  |  99 |  A  | 129 |  A  |
| 10 |  B  | 40 |  C  | 70 |  B  | 100 |  A  | 130 |  A  |
| 11 |  B  | 41 |  A  | 71 |  A  | 101 |  B  | 131 |  B  |
| 12 |  B  | 42 |  A  | 72 |  A  | 102 |  A  | 132 |  A  |
| 13 |  C  | 43 |  B  | 73 |  A  | 103 |  A  | 133 |  A  |
| 14 |  A  | 44 |  A  | 74 |  B  | 104 |  B  | 134 |  B  |
| 15 |  A  | 45 |  A  | 75 |  C  | 105 |  C  | 135 |  A  |
| 16 |  A  | 46 |  A  | 76 |  C  | 106 |  A  | 136 |  A  |
| 17 |  B  | 47 |  A  | 77 |  A  | 107 |  A  | 137 |  B  |
| 18 |  B  | 48 |  B  | 78 |  A  | 108 |  B  | 138 |  C  |
| 19 |  B  | 49 |  A  | 79 |  A  | 109 |  A  | 139 |  B  |
| 20 |  C  | 50 |  A  | 80 |  A  | 110 |  B  | 140 |  A  |
| 21 |  B  | 51 |  A  | 81 |  A  | 111 |  A  | 141 |  A  |
| 22 |  A  | 52 |  A  | 82 |  A  | 112 |  C  | 142 |  B  |
| 23 |  C  | 53 |  A  | 83 |  A  | 113 |  B  | 143 |  A  |
| 24 |  A  | 54 |  B  | 84 |  A  | 114 |  A  | 144 |  C  |
| 25 |  A  | 55 |  A  | 85 |  A  | 115 |  B  | 145 |  A  |
| 26 |  B  | 56 |  A  | 86 |  B  | 116 |  C  | 146 |  C  |
| 27 |  A  | 57 |  A  | 87 |  C  | 117 |  A  | 147 |  B  |
| 28 |  B  | 58 |  A  | 88 |  C  | 118 |  B  | 148 |  D  |
| 29 |  A  | 59 |  A  | 89 |  C  | 119 |  A  | 149 |  A  |
| 30 |  A  | 60 |  A  | 90 |  B  | 120 |  A  | 150 |  B  |

---

# Coverage

This combined test intentionally does **not** repeat the individual topic-test approach.

It focuses on the areas that matter for actual understanding:

* Variable declaration, initialization and reassignment
* Constants and `final`
* Naming rules and conventions
* Case sensitivity
* Primitive vs non-primitive types
* Numeric ranges and type selection
* `float` vs `double`
* Integer vs decimal division
* Unicode and `char`
* Arrays and indexing
* `if`, `if-else`, `else-if`, nested `if`
* Traditional and arrow `switch`
* Switch expressions
* `for`, `while`, `do-while`, `for-each`
* Loop tracing
* `break` and `continue`
* Method creation and execution
* Parameters vs arguments
* Return types and return values
* Method reusability
* Arithmetic operators
* Relational operators
* Logical operators
* Short-circuit evaluation
* Assignment operators
* Unary operators
* Pre/post increment and decrement
* Bitwise operators
* Shift operators
* Ternary operator
* Operator precedence
* Mixed expressions
* Cross-topic code tracing

The questions deliberately emphasize **combined reasoning**, such as:

> variables + operators
> operators + conditions
> conditions + loops
> methods + conditions
> methods + loops
> data types + arithmetic
> assignment + unary operators
> precedence + output prediction

# 80% Mastery Benchmark

**Total Questions: 150**

**80% = 120 correct answers**

|    Score | Level                                        |
| -------: | -------------------------------------------- |
|  140–150 | Excellent mastery                            |
|  120–139 | Strong understanding — ready to move forward |
|  105–119 | Good foundation — review weak areas          |
|   90–104 | Several conceptual gaps                      |
| Below 90 | Topic revision recommended                   |

> **Target: 120/150 or higher.**
>
> A learner who can consistently score **80%+ without referring to the notes** should have a strong understanding of the material covered in the completed Java section.
