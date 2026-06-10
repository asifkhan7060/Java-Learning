# CONTROL FLOW IN JAVA

## Study Topics

1. What is Control Flow?
2. Decision Making Statements
3. Loops (Iteration Statements)
4. Jump Statements
5. Practical Examples
6. Quick Revision
7. Interview Questions

---

# What is Control Flow?

Control Flow determines the order in which statements execute inside a Java program.

By default, Java executes statements from top to bottom.

Example:

```java
System.out.println("A");
System.out.println("B");
System.out.println("C");
```

Output:

```text
A
B
C
```

This is called **Sequential Flow**.

---

# Types of Control Flow

Java Control Flow is mainly divided into:

```text
Control Flow
│
├── Decision Making
│
├── Loops
│
└── Jump Statements
```

---

# 1. Decision Making Statements

## What is Decision Making?

Decision Making allows Java to choose different execution paths based on conditions.

Instead of executing every statement, Java evaluates a condition and decides which block should execute.

---

## Why is Decision Making Needed?

Real-world applications constantly make decisions:

* Login Validation
* ATM Transactions
* Grade Calculation
* Online Shopping Discounts
* Banking Systems
* Voting Eligibility

Without Decision Making:

```text
Every statement would execute regardless of conditions.
```

---

# Types of Decision Making Statements

| Statement      | Purpose                              |
| -------------- | ------------------------------------ |
| if             | Executes code when condition is true |
| if-else        | Chooses between two blocks           |
| else-if Ladder | Chooses from multiple conditions     |
| Nested if      | if inside another if                 |
| switch         | Selects one option from many choices |

---

# if Statement

## Syntax

```java
if(condition) {
    // code
}
```

---

## Example

```java
int age = 20;

if(age >= 18) {
    System.out.println("Eligible to Vote");
}
```

Output:

```text
Eligible to Vote
```

---

# if-else Statement

Used when two outcomes are possible.

## Syntax

```java
if(condition) {

}
else {

}
```

---

## Example

```java
int marks = 35;

if(marks >= 40) {
    System.out.println("Pass");
}
else {
    System.out.println("Fail");
}
```

Output:

```text
Fail
```

---

# else-if Ladder

Used when multiple conditions exist.

## Example

```java
int score = 85;

if(score >= 90) {
    System.out.println("Grade A");
}
else if(score >= 75) {
    System.out.println("Grade B");
}
else {
    System.out.println("Grade C");
}
```

Output:

```text
Grade B
```

---

# Nested if

An if statement inside another if statement.

---

## Example

```java
boolean usernameCorrect = true;
boolean passwordCorrect = true;

if(usernameCorrect) {

    if(passwordCorrect) {
        System.out.println("Login Successful");
    }
}
```

Output:

```text
Login Successful
```

---

# switch Statement

Used when one variable can have multiple possible values.

---

## Traditional switch

```java
int day = 2;

switch(day) {

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

Output:

```text
Tuesday
```

---

## Why break is Used?

Without break:

```java
case 2:
```

will continue executing the next cases.

This behavior is called:

```text
Fall Through
```

Therefore break stops execution of the switch block.

---

# Arrow Switch (Modern Java)

Introduced to remove unnecessary break statements.

---

## Example

```java
switch(day) {

    case 1 -> System.out.println("Monday");

    case 2 -> System.out.println("Tuesday");

    case 3 -> System.out.println("Wednesday");

    default -> System.out.println("Invalid Day");
}
```

Output:

```text
Tuesday
```

---

# Switch Expression (Modern Java)

Switch can directly return values.

---

## Example

```java
char grade = 'A';

System.out.println(

    switch(grade) {

        case 'A' -> "Excellent";

        case 'B' -> "Very Good";

        case 'C' -> "Good";

        case 'D' -> "Average";

        case 'F' -> "Fail";

        default -> "Invalid Grade";
    }
);
```

Output:

```text
Excellent
```

---

# 2. Loops (Iteration Statements)

## What are Loops?

Loops execute a block of code repeatedly until a condition becomes false.

Instead of writing the same code many times, a loop performs repetition automatically.

---

## Why are Loops Needed?

Without Loop:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

Repeated hundreds of times.

---

With Loop:

```java
for(int i=1;i<=100;i++) {
    System.out.println("Hello");
}
```

Less code and better maintainability.

---

# Types of Loops

| Loop              | Usage                             |
| ----------------- | --------------------------------- |
| for               | Known number of iterations        |
| while             | Condition-based iteration         |
| do-while          | Executes at least once            |
| Enhanced for-each | Traversing arrays and collections |

---

# for Loop

Used when the number of iterations is known.

---

## Syntax

```java
for(initialization; condition; update) {

}
```

---

## Example

```java
for(int i=1;i<=5;i++) {
    System.out.println(i);
}
```

Output:

```text
1
2
3
4
5
```

---

## Flow

```text
Initialization
      ↓
Condition Check
      ↓
True
      ↓
Loop Body
      ↓
Update
      ↓
Condition Check Again
```

---

# while Loop

Used when iterations depend on a condition.

---

## Syntax

```java
while(condition) {

}
```

---

## Example

```java
int j = 1;

while(j <= 5) {
    System.out.println(j);
    j++;
}
```

Output:

```text
1
2
3
4
5
```

---

# do-while Loop

Executes at least one time even if condition is false.

---

## Syntax

```java
do {

}
while(condition);
```

---

## Example

```java
int k = 1;

do {
    System.out.println(k);
    k++;
}
while(k <= 5);
```

Output:

```text
1
2
3
4
5
```

---

# Important Property of do-while

Condition is checked after execution.

---

## Example

```java
int z = 20;

do {
    System.out.println(z);
    z++;
}
while(z <= 5);
```

Output:

```text
20
```

Even though condition is false, loop executes once.

---

# Enhanced For-Each Loop

Used for arrays and collections.

---

## Example

```java
int[] numbers = {10,20,30,40,50};

for(int number : numbers) {
    System.out.println(number);
}
```

Output:

```text
10
20
30
40
50
```

---

## How It Works

```text
numbers Array
│
├── 10
├── 20
├── 30
├── 40
└── 50
```

Each value is copied into variable:

```java
number
```

one by one.

---

# 3. Jump Statements

## What are Jump Statements?

Jump Statements alter the normal flow of execution.

They are mainly used with:

* Loops
* switch statements

---

# Types of Jump Statements

| Statement | Purpose                     |
| --------- | --------------------------- |
| break     | Terminates loop immediately |
| continue  | Skips current iteration     |

---

# break Statement

Stops execution of a loop instantly.

---

## Example

```java
for(int i=1;i<=10;i++) {

    if(i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
3
4
```

---

## Flow

```text
1
2
3
4
5 Encountered
↓
break
↓
Loop Ends
```

---

# continue Statement

Skips the current iteration and moves to the next iteration.

---

## Example

```java
for(int i=1;i<=5;i++) {

    if(i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```

---

## Flow

```text
1 Printed
2 Printed
3 Encountered
↓
continue
↓
Skip Printing
↓
Go to 4
```

---

# break vs continue

| Feature             | break         | continue       |
| ------------------- | ------------- | -------------- |
| Terminates Loop     | Yes           | No             |
| Skips Iteration     | No            | Yes            |
| Execution Continues | Outside Loop  | Next Iteration |
| Used With           | Loop & Switch | Mostly Loops   |

---

# Complete Control Flow Structure

```text
Control Flow
│
├── Decision Making
│   ├── if
│   ├── if-else
│   ├── else-if
│   ├── Nested if
│   └── switch
│
├── Loops
│   ├── for
│   ├── while
│   ├── do-while
│   └── for-each
│
└── Jump Statements
    ├── break
    └── continue
```

---

# Quick Revision

```text
if
│
└── Single Condition
```

---

```text
if-else
│
└── Two Choices
```

---

```text
else-if
│
└── Multiple Choices
```

---

```text
Nested if
│
└── if inside if
```

---

```text
switch
│
└── Multiple Cases
```

---

```text
for
│
└── Known Iterations
```

---

```text
while
│
└── Condition Based
```

---

```text
do-while
│
└── Executes At Least Once
```

---

```text
for-each
│
└── Arrays & Collections
```

---

```text
break
│
└── Exit Loop
```

---

```text
continue
│
└── Skip Iteration
```

---

# Interview Questions

## Basic

1. What is Control Flow?
2. What is Decision Making in Java?
3. Difference between if and if-else?
4. What is a switch statement?
5. Why is break used in switch?

---

## Intermediate

6. Difference between if-else ladder and switch?
7. Difference between while and do-while?
8. Why does do-while execute at least once?
9. What is the Enhanced For-Each Loop?
10. When should we use for loop instead of while loop?

---

## Advanced

11. Explain Fall Through in switch statements.
12. Difference between Traditional Switch and Arrow Switch.
13. What is a Switch Expression?
14. Difference between break and continue.
15. What happens if break is removed from switch?
16. Can continue be used inside switch?
17. Explain execution flow of a for loop.
18. Explain execution flow of a while loop.
19. Explain execution flow of a do-while loop.
20. Which loop is best for array traversal and why?

---

# One-Line Definition

> Control Flow in Java determines the order in which program statements execute using Decision Making Statements, Loops, and Jump Statements.
