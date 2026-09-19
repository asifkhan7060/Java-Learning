# Java Control Flow — Complete MCQ Test

> **Goal:** If you can answer around **80% of these questions correctly without referring back to the notes**, you should have a strong understanding of the topics covered in these documents.

## Topics Covered

* Decision Making
* `if`
* `if-else`
* `else-if` ladder
* Nested `if`
* `switch`
* Traditional `switch-case`
* `break` in `switch`
* Arrow `switch` syntax
* Switch expression with returned value
* Loops
* `for`
* `while`
* `do-while`
* Enhanced `for-each`
* Loop execution flow
* `break`
* `continue`
* Difference between `break` and `continue`
* Code tracing
* Output prediction
* Condition-based execution
* Loop termination
* Skipping iterations

---

# Section A — Decision Making Fundamentals

### 1.

What is the main purpose of decision-making statements in Java?

* A. To repeatedly execute code
* B. To choose different execution paths based on conditions
* C. To store multiple values
* D. To terminate every program

---

### 2.

Consider a program where every statement must not execute in every situation. What control-flow capability is needed?

* A. Decision making
* B. Variable declaration
* C. Array creation
* D. Commenting

---

### 3.

What happens conceptually before Java chooses which conditional block should execute?

* A. The loop runs
* B. A condition is evaluated
* C. The program exits
* D. A variable is always reassigned

---

### 4.

If a condition evaluates to `true`, what does the decision-making flow shown in the notes do?

* A. Executes the corresponding block
* B. Automatically skips the entire program
* C. Executes every conditional block
* D. Restarts the program

---

### 5.

If a condition evaluates to `false`, what can happen according to the documented flow?

* A. Another appropriate block can execute or the program can continue
* B. The condition automatically becomes true
* C. The program must terminate
* D. Every block must execute

---

### 6.

Which situation is naturally suited to decision making?

* A. Checking whether someone is eligible to vote
* B. Printing the same message 100 times
* C. Traversing every element of an array
* D. Repeating a calculation indefinitely

---

### 7.

Why would a banking application need decision making?

* A. It may need to choose actions based on different conditions
* B. It only needs to print text
* C. It must always execute every possible operation
* D. It cannot use conditions

---

### 8.

Which of the following is **not** presented as a decision-making statement in the document?

* A. `if`
* B. `if-else`
* C. `else-if`
* D. `while`

---

### 9.

Which option correctly describes the five decision-making forms covered?

* A. `if`, `if-else`, `else-if`, nested `if`, `switch`
* B. `for`, `while`, `do-while`, `switch`, `break`
* C. `if`, `for`, `while`, `continue`, `switch`
* D. `if`, `else`, `for`, `while`, `break`

---

### 10.

Which decision-making form is best represented by the idea of choosing between exactly two blocks?

* A. `if`
* B. `if-else`
* C. `else-if` ladder
* D. `switch`

---

# Section B — `if` Statement

### 11.

What is the defining behavior of an `if` statement?

* A. It executes its block when its condition is true
* B. It always executes its block
* C. It executes two blocks
* D. It executes only when its condition is false

---

### 12.

What is printed?

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to Vote");
}
```

* A. `Eligible to Vote`
* B. Nothing
* C. Compilation error
* D. `20`

---

### 13.

What would happen if the following condition were false?

```java
if (age >= 18) {
    System.out.println("Eligible to Vote");
}
```

* A. The `println` inside the `if` would not execute
* B. The `println` would execute anyway
* C. The condition would automatically reverse
* D. The program must terminate

---

### 14.

Consider:

```java
int age = 17;

if (age >= 18) {
    System.out.println("Eligible to Vote");
}
```

What is printed?

* A. `Eligible to Vote`
* B. `17`
* C. Nothing from the `if` block
* D. `Fail`

---

### 15.

Which statement best explains why the `if` example is called decision making?

* A. The program checks a condition before deciding whether the statement block should execute
* B. The program repeats the block
* C. The program creates two variables
* D. The program selects an array index

---

# Section C — `if-else`

### 16.

What is the main purpose of `if-else` compared with a simple `if`?

* A. It provides two alternative execution paths
* B. It repeats a block
* C. It creates multiple variables
* D. It only works with arrays

---

### 17.

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
* C. Nothing
* D. `35`

---

### 18.

If `marks` changes from `35` to `40` in the previous example, which block executes?

* A. `else`
* B. `if`
* C. Both
* D. Neither

---

### 19.

Why does the `if-else` example always select one of its two blocks for a normal true/false condition?

* A. One block corresponds to true and the other handles the false case
* B. Both blocks are always executed
* C. The `else` block runs before the `if`
* D. `else` is another loop

---

### 20.

Which situation is better suited to `if-else` than simple `if`?

* A. Decide whether a student passes or fails
* B. Execute code only when a condition is true and do nothing otherwise
* C. Repeat code five times
* D. Traverse all array elements

---

# Section D — `else-if` Ladder

### 21.

What is the main purpose of an `else-if` ladder?

* A. To choose among multiple conditions
* B. To repeat one condition forever
* C. To skip every iteration
* D. To terminate a switch

---

### 22.

Consider:

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

What is printed?

* A. `Grade A`
* B. `Grade B`
* C. `Grade C`
* D. `85`

---

### 23.

Why does `85` result in `Grade B` rather than `Grade C`?

* A. The first condition is false, the second is true
* B. All conditions are false
* C. The `else` block always executes
* D. The first condition is true

---

### 24.

What will happen when `score = 95` in the above example?

* A. `Grade A`
* B. `Grade B`
* C. `Grade C`
* D. No output

---

### 25.

What will happen when `score = 70`?

* A. `Grade A`
* B. `Grade B`
* C. `Grade C`
* D. Both B and C

---

### 26.

What is the important reasoning step when tracing an `else-if` ladder?

* A. Check the conditions in their written order and determine which applicable branch executes
* B. Execute every condition independently
* C. Ignore the first condition
* D. Always start from `else`

---

### 27.

If the first condition in an `else-if` ladder is true, what is the purpose of the later `else-if` conditions in that execution path?

* A. They are not needed for that selected path
* B. They must also execute
* C. They reverse the first condition
* D. They create a loop

---

# Section E — Nested `if`

### 28.

What does "nested if" mean?

* A. An `if` statement placed inside another `if` statement
* B. Multiple loops inside a `switch`
* C. An `if` after a `for`
* D. An `if` without a condition

---

### 29.

Consider:

```java
if (usernameCorrect) {
    if (passwordCorrect) {
        System.out.println("Login Successful");
    }
}
```

What must happen for `Login Successful` to be printed?

* A. Only `usernameCorrect` must be true
* B. Only `passwordCorrect` must be true
* C. Both conditions must be true
* D. Both conditions must be false

---

### 30.

What happens if `usernameCorrect` is `false` in the nested `if` example?

* A. The inner `if` is reached and executed anyway
* B. The inner block cannot execute through that outer path
* C. Password is automatically marked correct
* D. Login succeeds

---

### 31.

What happens if `usernameCorrect` is true but `passwordCorrect` is false?

* A. `Login Successful` is printed
* B. The inner block does not execute
* C. The outer `if` becomes false
* D. Both conditions become true

---

### 32.

Why can nested `if` be useful?

* A. It can represent a condition that depends on another condition being satisfied first
* B. It removes the need for conditions
* C. It automatically creates loops
* D. It always provides exactly three choices

---

# Section F — Traditional `switch`

### 33.

What is the main purpose of the `switch` statement shown in the notes?

* A. Select one option from many choices
* B. Repeat a statement until false
* C. Skip an iteration
* D. Compare every variable in the program

---

### 34.

Consider:

```java
int day = 2;

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

What is printed?

* A. `Monday`
* B. `Tuesday`
* C. `Invalid Day`
* D. Nothing

---

### 35.

What is the purpose of the `case` labels in the traditional switch example?

* A. They represent possible matching values
* B. They create loops
* C. They define variables
* D. They terminate the program

---

### 36.

What role does `break` play in the traditional `switch` example?

* A. It exits the switch after the selected case
* B. It repeats the same case
* C. It skips the next case and then continues inside the switch
* D. It changes the switch value

---

### 37.

What is the role of `default` in the shown switch?

* A. It handles the situation where none of the listed cases matches
* B. It always executes first
* C. It repeats the matching case
* D. It terminates every program

---

### 38.

What is printed if `day = 1`?

* A. `Monday`
* B. `Tuesday`
* C. `Invalid Day`
* D. Nothing

---

### 39.

What is printed if `day = 5`?

* A. `Monday`
* B. `Tuesday`
* C. `Invalid Day`
* D. All three

---

### 40.

Why is `break` important in the traditional form shown?

* A. It prevents execution from continuing into subsequent cases after the selected case
* B. It makes the selected case execute twice
* C. It skips the selected case
* D. It converts the switch into an `if`

---

# Section G — Arrow `switch` Syntax

### 41.

Which alternative switch syntax is explicitly shown in the document?

* A. Arrow syntax using `->`
* B. Hash syntax using `#`
* C. Colonless loop syntax
* D. `=>` syntax

---

### 42.

Consider:

```java
int Day = 2;

switch (Day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Invalid Day");
}
```

What is printed?

* A. `Monday`
* B. `Tuesday`
* C. `Wednesday`
* D. `Invalid Day`

---

### 43.

What important difference is visible between the traditional switch example and the arrow-syntax example?

* A. The arrow cases directly associate a case with its action
* B. The arrow example uses a loop instead
* C. The arrow example does not have cases
* D. The arrow example cannot have a default

---

### 44.

In the arrow-style switch shown, why is a separate `break` not written after each arrow case?

* A. The arrow case form directly defines its branch action without the traditional fall-through structure shown
* B. `break` is required automatically twice
* C. `break` has been replaced by `continue`
* D. The switch is actually a loop

---

### 45.

What will the arrow switch print if `Day = 3`?

* A. `Monday`
* B. `Tuesday`
* C. `Wednesday`
* D. `Invalid Day`

---

### 46.

What will the arrow switch print if `Day = 7`?

* A. `Monday`
* B. `Tuesday`
* C. `Wednesday`
* D. `Invalid Day`

---

# Section H — Switch Expression

### 47.

What is different about the final switch example compared with the previous printing-only switch examples?

* A. The switch is used as an expression that produces a value
* B. It no longer has cases
* C. It no longer uses conditions
* D. It becomes a loop

---

### 48.

Consider:

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

What is printed?

* A. `A`
* B. `Excellent`
* C. `Very Good`
* D. `Invalid Grade`

---

### 49.

What is returned for grade `'C'` in the switch expression?

* A. `Excellent`
* B. `Very Good`
* C. `Good`
* D. `Average`

---

### 50.

What is returned for grade `'F'`?

* A. `Fail`
* B. `Average`
* C. `Invalid Grade`
* D. `F`

---

### 51.

What is returned for a grade such as `'X'`?

* A. `Excellent`
* B. `Fail`
* C. `Invalid Grade`
* D. No value

---

### 52.

What makes the final switch example useful as an expression?

* A. Its selected branch supplies a value that can be passed to `System.out.println()`
* B. It automatically creates a loop
* C. It removes all cases
* D. It always returns `null`

---

# Section I — Loops Fundamentals

### 53.

What is the primary purpose of a loop?

* A. To execute a block of code repeatedly
* B. To select one switch case
* C. To stop every program
* D. To declare a variable

---

### 54.

Why are loops useful when the same statement must execute many times?

* A. They reduce repeated code and automate the repetition
* B. They make every statement execute only once
* C. They eliminate all variables
* D. They replace decision making

---

### 55.

What are loops also called according to the document?

* A. Decision statements
* B. Iteration statements
* C. Selection statements
* D. Assignment statements

---

### 56.

Why would writing `System.out.println("Hello");` one hundred times be a poor approach?

* A. It creates unnecessary code duplication and is harder to maintain
* B. Java does not allow repeated print statements
* C. `println()` works only once
* D. It automatically creates a loop

---

### 57.

Which of the following is one of the four main loop types in the document?

* A. `for`
* B. `if`
* C. `switch`
* D. `break`

---

### 58.

Which loop types are covered in the document?

* A. `for`, `while`, `do-while`, enhanced `for-each`
* B. `if`, `else`, `switch`, `while`
* C. `for`, `if`, `break`, `continue`
* D. `while`, `switch`, `nested if`, `for`

---

# Section J — Choosing a Loop

### 59.

Which loop is described as suitable when the number of iterations is known?

* A. `for`
* B. `while`
* C. `do-while`
* D. `switch`

---

### 60.

Which loop is described as suitable when iteration depends on a condition?

* A. `for`
* B. `while`
* C. `switch`
* D. `if`

---

### 61.

Which loop is described as executing at least one time?

* A. `for`
* B. `while`
* C. `do-while`
* D. `for-each`

---

### 62.

Which loop is described as being used to traverse arrays and collections?

* A. `while`
* B. `do-while`
* C. Enhanced `for-each`
* D. `if`

---

### 63.

A programmer knows in advance that a block should execute exactly five iterations. Which loop best matches the documented use case?

* A. `for`
* B. `while`
* C. `do-while`
* D. `switch`

---

### 64.

A programmer wants to traverse the values in an array without manually managing an index. Which loop from the document is the natural choice?

* A. Enhanced `for-each`
* B. `if`
* C. `switch`
* D. `do-while`

---

# Section K — How Loops Execute

### 65.

According to the documented loop flow, what happens immediately after the loop starts?

* A. The condition is checked
* B. The program always exits
* C. `break` executes
* D. The loop body executes regardless of the condition

---

### 66.

What happens when the loop condition is true?

* A. The loop body executes
* B. The loop must terminate
* C. The program enters a switch
* D. The condition is ignored

---

### 67.

What happens after the loop body executes?

* A. The condition is checked again
* B. The loop always terminates
* C. The program returns to `main()`
* D. The body is deleted

---

### 68.

When does the loop continue according to the documented flow?

* A. Until its condition becomes false
* B. Until every variable becomes zero
* C. Until `println()` stops working
* D. Until the compiler stops

---

### 69.

Which sequence best represents the general loop flow from the notes?

* A. Start → condition check → body if true → check again → continue until false
* B. Start → body forever → condition once
* C. Condition → stop → start → body
* D. Start → `break` → body → condition

---

# Section L — `for` Loop

### 70.

Consider:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

What is the output sequence?

* A. `1 2 3 4 5`
* B. `0 1 2 3 4`
* C. `1 2 3 4`
* D. `5 4 3 2 1`

---

### 71.

Why does the loop stop after printing `5`?

* A. After `i` becomes `6`, the condition `i <= 5` becomes false
* B. `5` is automatically a break statement
* C. `println()` stops after five calls
* D. `i` becomes a String

---

### 72.

What is the role of `i++` in the example?

* A. It advances the loop variable after each iteration
* B. It resets `i` to 1
* C. It stops the loop
* D. It prints the value

---

### 73.

What would happen if the condition were changed to:

```java
i < 5
```

while keeping the rest unchanged?

* A. `1 2 3 4` would be printed
* B. `1 2 3 4 5` would be printed
* C. Nothing would print
* D. `5` would be printed twice

---

### 74.

What would happen if the initialization were changed to:

```java
int i = 3
```

while retaining `i <= 5` and `i++`?

* A. `3 4 5`
* B. `1 2 3`
* C. `3 4 5 6`
* D. Nothing

---

# Section M — `while` Loop

### 75.

Consider:

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

What is printed?

* A. `1 2 3 4 5`
* B. `0 1 2 3 4`
* C. `1 2 3 4`
* D. `5 4 3 2 1`

---

### 76.

What is essential in this `while` loop to ensure that it eventually stops?

* A. `i` must change so the condition can eventually become false
* B. `println()` must be removed
* C. `while` must be replaced with `if`
* D. `i` must always remain 1

---

### 77.

What would happen if `i++` were removed from the shown `while` loop?

* A. The condition would remain true and the loop could continue indefinitely
* B. The loop would execute exactly once
* C. The loop would execute backwards
* D. The loop would become a `for` loop

---

### 78.

Which statement best describes the difference between the `for` and `while` examples?

* A. The `for` example keeps loop-control parts together, while the `while` example manages the variable separately
* B. `while` cannot use a condition
* C. `for` cannot repeat code
* D. They cannot produce the same output

---

# Section N — `do-while`

### 79.

What is the key behavior of a `do-while` loop highlighted in the document?

* A. It executes at least once
* B. It never checks a condition
* C. It always executes exactly five times
* D. It can only traverse arrays

---

### 80.

Why can a `do-while` execute its body even when the condition would initially be false?

* A. The body is executed before the condition is checked
* B. The condition is never evaluated
* C. `do` means "ignore condition"
* D. `while` becomes an `if`

---

### 81.

Consider:

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

What is printed?

* A. `1 2 3 4 5`
* B. `1 2 3 4`
* C. `0 1 2 3 4`
* D. Nothing

---

### 82.

Consider:

```java
int i = 20;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

How many times does the body execute?

* A. Zero
* B. One
* C. Five
* D. Twenty

---

### 83.

What is printed by the previous code?

* A. Nothing
* B. `20`
* C. `20 21 22 23 24`
* D. `5`

---

### 84.

Why is the previous example important for understanding `do-while`?

* A. It demonstrates that the body runs once before the condition is checked
* B. It demonstrates that `do-while` ignores conditions permanently
* C. It demonstrates that `do-while` always runs five times
* D. It demonstrates that `do-while` is a switch statement

---

# Section O — Enhanced `for-each`

### 85.

Consider:

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}
```

What is printed?

* A. `10 20 30 40 50`
* B. `0 1 2 3 4`
* C. `10 20 30 40`
* D. `50 40 30 20 10`

---

### 86.

What does `number` represent inside the enhanced `for-each` loop?

* A. The current element being traversed
* B. The array's length
* C. The array index only
* D. The next loop condition

---

### 87.

What does `numbers` represent in:

```java
for (int number : numbers)
```

* A. The collection/array being traversed
* B. The current element
* C. The loop condition
* D. The loop counter

---

### 88.

What makes the enhanced `for-each` different from the normal indexed loops shown?

* A. It is designed to traverse the elements directly
* B. It cannot print elements
* C. It always runs forever
* D. It can only work with integers

---

### 89.

Which task best matches the documented use of enhanced `for-each`?

* A. Traverse an array and process each element
* B. Select one value from multiple cases
* C. Skip an iteration
* D. Test whether a user is eligible

---

# Section P — Jump Statements

### 90.

What is the main purpose of jump statements?

* A. To alter the normal flow of program execution
* B. To define data types
* C. To create variables
* D. To format output

---

### 91.

Where are jump statements commonly used according to the document?

* A. With loops and switch statements
* B. Only with arrays
* C. Only with variables
* D. Only with methods

---

### 92.

Which two major jump statements are covered in the document?

* A. `break` and `continue`
* B. `if` and `switch`
* C. `for` and `while`
* D. `return` and `throw`

---

### 93.

Which jump statement is designed to terminate a loop immediately?

* A. `break`
* B. `continue`
* C. `if`
* D. `default`

---

### 94.

Which jump statement skips the current iteration and moves to the next one?

* A. `break`
* B. `continue`
* C. `switch`
* D. `else`

---

### 95.

Which situation best fits `break`?

* A. Exit the loop as soon as a required condition is reached
* B. Skip only one iteration and continue looping
* C. Select one switch value
* D. Check two conditions

---

### 96.

Which situation best fits `continue`?

* A. Skip processing for one particular iteration
* B. Exit the entire loop
* C. Stop the entire program
* D. Choose a switch case

---

# Section Q — `break` in Loops

### 97.

Consider:

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

What is printed?

* A. `1 2 3 4`
* B. `1 2 3 4 5`
* C. `5 6 7 8 9 10`
* D. `1 2 3 4 5 6 7 8 9 10`

---

### 98.

Why is `5` not printed in the previous example?

* A. `break` executes before the `println()` for that iteration
* B. `println()` cannot print 5
* C. The loop skips all odd numbers
* D. The condition is false at 5

---

### 99.

What happens to the loop after `break` executes?

* A. The entire loop terminates
* B. Only the current statement is skipped
* C. The current iteration restarts
* D. The loop condition is ignored and execution continues inside the loop

---

### 100.

If the condition were changed to:

```java
if (i == 7) {
    break;
}
```

what would be printed?

* A. `1 2 3 4 5 6`
* B. `1 2 3 4 5 6 7`
* C. `7 8 9 10`
* D. `1 2 3 4 5`

---

# Section R — `continue` in Loops

### 101.

Consider:

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

What is printed?

* A. `1 2 3 4 5`
* B. `1 2 4 5`
* C. `1 2`
* D. `3 4 5`

---

### 102.

Why is `3` not printed?

* A. `continue` skips the remaining code in the current iteration
* B. `3` is outside the loop range
* C. `3` causes `break`
* D. The loop condition becomes false at 3

---

### 103.

What happens after `continue` in the shown `for` loop?

* A. The loop proceeds to the next iteration
* B. The entire loop terminates
* C. The program exits
* D. The same iteration is executed again

---

### 104.

If the condition were:

```java
if (i == 2) {
    continue;
}
```

what would be printed?

* A. `1 3 4 5`
* B. `1 2 3 4 5`
* C. `2`
* D. `1`

---

# Section S — `break` vs `continue`

### 105.

Which statement accurately distinguishes `break` from `continue`?

* A. `break` terminates the entire loop; `continue` skips only the current iteration
* B. `break` skips one iteration; `continue` terminates the loop
* C. Both terminate the loop
* D. Both only affect switch statements

---

### 106.

You are processing values in a loop and want to stop completely when an invalid value is found. Which statement is more appropriate?

* A. `break`
* B. `continue`
* C. `default`
* D. `else`

---

### 107.

You are processing values in a loop and want to ignore one unwanted value but continue processing later values. Which statement is more appropriate?

* A. `break`
* B. `continue`
* C. `switch`
* D. `if-else`

---

### 108.

Which action best describes the effect of `break`?

* A. Exit the loop immediately
* B. Skip only the remaining statements in the current iteration and continue
* C. Restart the loop
* D. Execute the next case

---

### 109.

Which action best describes the effect of `continue`?

* A. Exit the entire loop
* B. Skip the remaining code in the current iteration and move toward the next iteration
* C. Exit the program
* D. Execute every remaining iteration at once

---

# Section T — Mixed Code Tracing

### 110.

What is the output?

```java
int x = 10;

if (x >= 10) {
    System.out.println("A");
} else {
    System.out.println("B");
}
```

* A. `A`
* B. `B`
* C. Nothing
* D. `10`

---

### 111.

What is the output?

```java
int x = 50;

if (x >= 90) {
    System.out.println("A");
} else if (x >= 40) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

* A. `A`
* B. `B`
* C. `C`
* D. `50`

---

### 112.

What is the output?

```java
boolean user = true;
boolean password = false;

if (user) {
    if (password) {
        System.out.println("Login Successful");
    }
}
```

* A. `Login Successful`
* B. Nothing from the nested block
* C. `true`
* D. `false`

---

### 113.

What is the output?

```java
int day = 4;

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

### 114.

What is the output?

```java
for (int i = 1; i <= 3; i++) {
    System.out.println(i);
}
```

* A. `1 2 3`
* B. `0 1 2`
* C. `1 2`
* D. `3 2 1`

---

### 115.

What is the output?

```java
int i = 1;

while (i < 4) {
    System.out.println(i);
    i++;
}
```

* A. `1 2 3`
* B. `1 2 3 4`
* C. `0 1 2`
* D. `4`

---

### 116.

What is the output?

```java
int i = 4;

do {
    System.out.println(i);
    i++;
} while (i < 4);
```

* A. Nothing
* B. `4`
* C. `4 5`
* D. Infinite loop

---

### 117.

What is the output?

```java
for (int i = 1; i <= 5; i++) {
    if (i == 4) {
        break;
    }
    System.out.println(i);
}
```

* A. `1 2 3`
* B. `1 2 3 4`
* C. `4 5`
* D. `1 2 3 4 5`

---

### 118.

What is the output?

```java
for (int i = 1; i <= 5; i++) {
    if (i == 4) {
        continue;
    }
    System.out.println(i);
}
```

* A. `1 2 3 4 5`
* B. `1 2 3 5`
* C. `1 2 3`
* D. `4 5`

---

# Section U — Higher-Level Application

### 119.

A program must execute one block only when a condition is true and do nothing otherwise. Which construct best matches the requirement?

* A. `if`
* B. `if-else`
* C. `else-if` ladder
* D. `do-while`

---

### 120.

A program must choose between "Pass" and "Fail". Which structure best matches the requirement?

* A. `if`
* B. `if-else`
* C. `for`
* D. `continue`

---

### 121.

A program has grades A, B, C, D and F, each mapping to a different result. Which construct shown in the documents is especially suitable?

* A. `switch`
* B. `while`
* C. `continue`
* D. Nested loop

---

### 122.

A login process should display success only when both username and password checks succeed. Which structure directly represents the nested example?

* A. Nested `if`
* B. `for-each`
* C. `switch`
* D. `continue`

---

### 123.

A task must execute exactly five times using a counter that starts at 1 and increases by 1 each time. Which loop best matches the documented use case?

* A. `for`
* B. `while`
* C. `switch`
* D. `if`

---

### 124.

A loop should keep running while some condition remains true, with the condition controlling whether another iteration occurs. Which loop is directly described this way?

* A. `while`
* B. `switch`
* C. `if`
* D. `break`

---

### 125.

A block must execute at least once even when the condition may initially be false. Which loop should be selected?

* A. `for`
* B. `while`
* C. `do-while`
* D. `for-each`

---

### 126.

An array needs to be traversed element by element without manually using an index. Which documented construct best fits?

* A. Enhanced `for-each`
* B. Nested `if`
* C. `switch`
* D. `break`

---

### 127.

A loop should stop completely when `i == 5`. Which statement should be placed in the corresponding condition?

* A. `continue`
* B. `break`
* C. `default`
* D. `else`

---

### 128.

A loop should ignore the current value when `i == 5`, but continue processing later values. Which statement should be used?

* A. `break`
* B. `continue`
* C. `switch`
* D. `default`

---

# Section V — Mastery Questions

### 129.

Which statement best describes the overall relationship between decision making and loops?

* A. Decision making chooses execution paths, while loops repeat execution
* B. Both only choose switch cases
* C. Both only terminate programs
* D. Loops replace every decision-making statement

---

### 130.

Which statement best describes the relationship between `break` and loops?

* A. `break` can alter the normal loop flow by ending the loop immediately
* B. `break` starts a loop
* C. `break` always skips one iteration only
* D. `break` is used only to declare variables

---

### 131.

Which statement best describes the relationship between `continue` and loops?

* A. `continue` alters the normal flow by skipping the remaining code of the current iteration
* B. `continue` permanently terminates the loop
* C. `continue` creates a new loop
* D. `continue` selects a switch case

---

### 132.

Which construct from the documents is specifically designed for selecting among multiple fixed choices based on one value?

* A. `switch`
* B. `while`
* C. `continue`
* D. Nested `if`

---

### 133.

Which construct is best when multiple conditions need to be checked in sequence, such as grade boundaries?

* A. `else-if` ladder
* B. `for-each`
* C. `break`
* D. `switch` only

---

### 134.

Which statement correctly describes the execution difference between `while` and `do-while`?

* A. `do-while` executes its body before checking its condition
* B. `while` always executes once before checking
* C. Both check only after execution
* D. Neither uses conditions

---

### 135.

Which statement best explains why `for` and `while` can sometimes produce the same output?

* A. They are both iteration constructs and can implement equivalent repetition logic
* B. They are identical syntax
* C. `while` automatically converts to `for`
* D. `for` does not use conditions

---

### 136.

Which statement best explains why enhanced `for-each` is conceptually different from the counter-based `for` example?

* A. It directly traverses elements rather than showing an explicit counter in the loop header
* B. It cannot repeat
* C. It is a decision statement
* D. It always executes only once

---

### 137.

Which of the following represents the most complete understanding of decision making from these documents?

* A. Java can evaluate conditions and select appropriate execution paths using `if`, `if-else`, `else-if`, nested `if`, and `switch`
* B. Decision making only means `if`
* C. Decision making is the same as looping
* D. Decision making is only used for printing output

---

### 138.

Which of the following represents the most complete understanding of loops from these documents?

* A. Loops repeatedly execute blocks until their controlling condition or iteration behavior causes them to stop
* B. Loops always execute exactly five times
* C. Loops are only used with arrays
* D. Loops cannot use conditions

---

### 139.

Which statement best summarizes jump statements from the documents?

* A. They alter normal execution flow; `break` terminates the loop, while `continue` skips the current iteration
* B. They only print values
* C. They replace all loops
* D. They are used only for declarations

---

### 140.

A learner can correctly solve the conditional, switch, loop, break, continue, and output-tracing questions in this test. What does that most strongly indicate?

* A. They understand the control-flow concepts covered by these documents
* B. They have only memorized variable names
* C. They understand arrays but not control flow
* D. They only understand Java comments

---

# Answer Key

|  Q | Ans |  Q | Ans |  Q | Ans |   Q | Ans |   Q | Ans |
| -: | :-: | -: | :-: | -: | :-: | --: | :-: | --: | :-: |
|  1 |  B  | 29 |  C  | 57 |  A  |  85 |  A  | 113 |  C  |
|  2 |  B  | 30 |  B  | 58 |  A  |  86 |  A  | 114 |  A  |
|  3 |  B  | 31 |  B  | 59 |  A  |  87 |  A  | 115 |  A  |
|  4 |  A  | 32 |  A  | 60 |  B  |  88 |  A  | 116 |  B  |
|  5 |  A  | 33 |  A  | 61 |  C  |  89 |  A  | 117 |  A  |
|  6 |  A  | 34 |  B  | 62 |  C  |  90 |  A  | 118 |  B  |
|  7 |  A  | 35 |  A  | 63 |  A  |  91 |  A  | 119 |  A  |
|  8 |  D  | 36 |  A  | 64 |  A  |  92 |  A  | 120 |  B  |
|  9 |  A  | 37 |  A  | 65 |  A  |  93 |  A  | 121 |  A  |
| 10 |  B  | 38 |  A  | 66 |  A  |  94 |  B  | 122 |  A  |
| 11 |  A  | 39 |  C  | 67 |  A  |  95 |  A  | 123 |  A  |
| 12 |  A  | 40 |  A  | 68 |  A  |  96 |  B  | 124 |  A  |
| 13 |  A  | 41 |  A  | 69 |  A  |  97 |  A  | 125 |  C  |
| 14 |  C  | 42 |  B  | 70 |  A  |  98 |  A  | 126 |  A  |
| 15 |  A  | 43 |  A  | 71 |  A  |  99 |  A  | 127 |  B  |
| 16 |  A  | 44 |  A  | 72 |  A  | 100 |  A  | 128 |  B  |
| 17 |  B  | 45 |  C  | 73 |  A  | 101 |  B  | 129 |  A  |
| 18 |  B  | 46 |  D  | 74 |  A  | 102 |  A  | 130 |  A  |
| 19 |  A  | 47 |  A  | 75 |  A  | 103 |  A  | 131 |  A  |
| 20 |  A  | 48 |  B  | 76 |  A  | 104 |  A  | 132 |  A  |
| 21 |  A  | 49 |  C  | 77 |  A  | 105 |  A  | 133 |  A  |
| 22 |  B  | 50 |  A  | 78 |  A  | 106 |  A  | 134 |  A  |
| 23 |  A  | 51 |  C  | 79 |  A  | 107 |  B  | 135 |  A  |
| 24 |  A  | 52 |  A  | 80 |  A  | 108 |  A  | 136 |  A  |
| 25 |  C  | 53 |  A  | 81 |  A  | 109 |  B  | 137 |  A  |
| 26 |  A  | 54 |  A  | 82 |  B  | 110 |  A  | 138 |  A  |
| 27 |  A  | 55 |  B  | 83 |  B  | 111 |  B  | 139 |  A  |
| 28 |  A  | 56 |  A  | 84 |  A  | 112 |  B  | 140 |  A  |

---

# Coverage

This test covers all major material present in the three documents:

## Decision Making

* Meaning of decision making
* Conditional execution
* Why decision making is needed
* Login validation
* ATM operations
* Voting eligibility
* Grade calculation
* Online shopping discounts
* Banking transactions
* `if`
* `if-else`
* `else-if` ladder
* Nested `if`
* `switch`
* Condition evaluation
* True condition flow
* False condition flow
* `if` example
* Voting example
* Pass/fail example
* Grade example
* Nested login example
* Traditional `switch`
* `case`
* `break` in switch
* `default`
* Arrow switch syntax
* Arrow cases
* Switch expression
* Switch expression returning values
* Grade-to-message mapping
* Invalid/default switch result

## Loops

* Meaning of loops
* Repeated execution
* Iteration statements
* Why loops are needed
* Reducing code duplication
* Maintainability
* Four loop forms
* `for`
* `while`
* `do-while`
* Enhanced `for-each`
* Appropriate use cases
* General loop execution flow
* Condition checking
* Loop body execution
* Rechecking the condition
* Loop termination
* `for` initialization
* `for` condition
* `for` increment
* `while` update
* Infinite-loop reasoning
* `do-while` minimum one execution
* Special do-while behavior
* Enhanced array traversal
* Element variable in `for-each`
* Array traversal

## Jump Statements

* Meaning of jump statements
* Altering normal execution flow
* Common use with loops and switch
* Why jump statements are needed
* Immediate loop exit
* Skipping an iteration
* Efficiency/control-flow use
* `break`
* `continue`
* `break` execution behavior
* `continue` execution behavior
* `break` output example
* `continue` output example
* Difference between `break` and `continue`
* Practical selection between `break` and `continue`

## Code & Output Mastery

* Condition tracing
* Nested-condition tracing
* Switch tracing
* Traditional switch output
* Arrow switch output
* Switch-expression output
* `for` tracing
* `while` tracing
* `do-while` tracing
* Enhanced `for-each` tracing
* `break` tracing
* `continue` tracing
* Choosing the appropriate control-flow construct

# 80% Mastery Benchmark

**Total Questions: 140**

**80% = 112 correct answers**

|    Score | Understanding                                          |
| -------: | ------------------------------------------------------ |
|  128–140 | Excellent mastery                                      |
|  112–127 | Strong understanding — topic can be considered covered |
|   98–111 | Partial understanding — review weak areas              |
|    84–97 | Significant gaps — study the topic again               |
| Below 84 | Topic needs thorough revision                          |

> **Target: 112/140 or higher.**
>
> A learner scoring at least 80% should have a strong understanding of the control-flow material covered in these three documents and can reasonably move forward to the next topic.
