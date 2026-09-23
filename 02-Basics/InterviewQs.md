## Topics identified from your document

Your notes cover:

1. **Variables**

    * Declaration
    * Initialization
    * Reassignment
    * Constants
    * Identifiers
    * Naming rules/conventions
    * Case sensitivity

2. **Data Types**

    * Primitive data types
    * Non-primitive/reference types
    * Size/range
    * Default values
    * `char` / Unicode
    * Arrays

3. **Control Flow**

    * `if`
    * `if-else`
    * `else-if`
    * Nested `if`
    * `switch`
    * `for`
    * `while`
    * `do-while`
    * enhanced `for`
    * `break`
    * `continue`

4. **Methods**

    * Method declaration
    * Calling methods
    * Parameters
    * Arguments
    * Return type
    * Reusability
    * `static` methods

5. **Operators**

    * Arithmetic
    * Relational
    * Logical
    * Assignment
    * Unary
    * Bitwise
    * Ternary
    * Operator precedence
    * Short-circuit evaluation

---

# Actual Interview Questions Found

I have **not converted every bullet in your notes into a question**. I only included questions for which I found evidence in an interview experience/report.

## A. Variables & Data Types

### Q1. What are primitive data types in Java?

**Reported in:** Infosys — Senior Software Engineer online coding/MCQ round.

The candidate reported that the 30 Java MCQs included questions on **primitive data types, wrapper classes, loops, switch and if/else**. ([Naukri][1])

**Topic:** Data Types
**Authenticity:** 🟢 Reported interview assessment

---

### Q2. What are the default values of variables in Java?

This was explicitly reported as an interview question in a Java interview question report. The report distinguishes instance variables from local variables. ([LinkedIn][2])

**Topic:** Variables → Default Values
**Authenticity:** 🟢 Reported

---

### Q3. What is a wrapper class?

**Reported by candidates/recruiters on:** Infosys Java Developer interview question listings. AmbitionBox currently shows this as a question asked to Java Developers. ([AmbitionBox][3])

It also appears in interview-question reports associated with Java developer interviews. ([LinkedIn][2])

**Topic:** Data Types → Primitive vs Object/Wrapper
**Authenticity:** 🟢 Reported

---

### Q4. Why do we need wrapper classes?

A Java interview report/question collection explicitly identifies this as an interview question, including use cases such as collections and autoboxing/unboxing. ([LinkedIn][2])

**Topic:** Data Types
**Authenticity:** 🟢 Reported

---

## B. Control Flow / Loops

### Q5. What are the basic concepts of Java loops, `while`, `do-while` and `for`?

A Glassdoor candidate report for Lowes Menswear specifically states that the interview covered **basic Java and loops, while, do-while, for loop and infinite loop**, along with basic output questions. ([Glassdoor][4])

**Topic:** Loops
**Authenticity:** 🟢 Candidate-reported

---

### Q6. Explain/solve a program using `for` loop, `if-else` and `do-while`.

**Company:** Trutech Web Solutions
**Role:** Java-AI Developer
**Round:** Programming round

The candidate reported that the programming question specifically required concepts such as **`for` loop, `if-else`, and `do-while`**. ([Glassdoor][5])

**Topic:** Control Flow
**Authenticity:** 🟢 Direct candidate report

---

### Q7. What are `if/else`, `switch` and loops used for in Java?

**Company:** Infosys
**Assessment:** Java MCQ round

The candidate reported that the MCQs included **loops, switch, if/else, wrapper classes and primitive data types**. ([Naukri][1])

**Topic:** Decision Making / Loops
**Authenticity:** 🟢 Reported

---

### Q8. What is an infinite loop?

**Company:** Lowes Menswear

The candidate explicitly mentioned **infinite loop** among the basic Java/loop questions discussed in the interview. ([Glassdoor][4])

**Topic:** Loops
**Authenticity:** 🟢 Candidate-reported

---

## C. Methods / Parameter Passing

### Q9. Is Java pass-by-value or pass-by-reference?

This is one of the **strongest recurring questions** connected to your methods topic.

It has been reported in interviews at:

* InTime Tec
* JavaTpoint
* Livspace
* Nokia
* Fidelity Investments
* other Java interviews

For example, InTime Tec explicitly reported the interviewer asking:

> "Is Java Pass-By-Reference or Pass-By-Value?"

The interviewer then asked the candidate to explain objects and memory allocation. ([GeeksforGeeks][6])

JavaTpoint also reported the same question. ([GeeksforGeeks][7])

Livspace reported:

> "Is Java pass by reference or pass by value?"

([LeetCode][8])

**Topic:** Methods → Parameters / Arguments
**Authenticity:** 🟢🟢🟢 Very strongly reported

---

### Q10. How does parameter passing work in Java, and why is Java strictly pass-by-value?

**Company:** JPMorganChase
**Role:** Software Development Engineer 2

This was reported as a Core Java interview question. ([InterviewRecap][9])

**Topic:** Methods → Parameters
**Authenticity:** 🟢 Direct interview report

---

### Q11. Can you explain pass-by-value with objects in Java?

**Company:** Teradata — SWE Intern interview

The candidate reported that the interviewer asked about pass-by-value/reference and followed up with why reassigning an object reference inside a method does not change the caller's variable. ([DevBrainiac][10])

**Topic:** Methods → Parameters / Object references
**Authenticity:** 🟢 Direct candidate report

---

### Q12. What is the difference between method overloading and overriding?

**Company:** Infosys / CGI interview reports

The Infosys assessment reported MCQs involving **overloading and overriding**. A CGI Java Backend Developer interview report also explicitly lists:

> "Method Overloading vs Overriding"

among its Core Java questions. ([Naukri][1])

**Topic:** Methods
**Authenticity:** 🟢 Reported

> Note: Overriding belongs more naturally to your upcoming **OOP/inheritance** notes, so I wouldn't count this toward this chapter's final question total if you want strict topic separation.

---

# D. Operators

This is where I found an important distinction.

Your notes contain **all seven major operator groups**, but actual interview reports don't consistently ask:

> "What is an arithmetic operator?"

Instead, interviewers commonly test whether you understand **what an expression actually does**.

---

### Q13. What is the output of `10 + 5 * 2`?

A Java Developer interview experience specifically discusses **operator precedence** with:

```java
int x = 10 + 5 * 2;
```

and the expected result is `20`, because multiplication has higher precedence than addition. ([LinkedIn][11])

**Topic:** Operators → Precedence
**Authenticity:** 🟢 Reported interview discussion

---

### Q14. Explain short-circuit evaluation with `&&` and `&`.

A Java Developer interview experience specifically discusses the difference between:

```java
false && check()
```

and

```java
false & check()
```

The report explains that `&&` short-circuits while `&` evaluates both operands. ([LinkedIn][11])

**Topic:** Logical / Bitwise Operators
**Authenticity:** 🟡 Reported interview-preparation post describing interview reality

**Important:** I would keep this in your bank, but mark it slightly below the candidate-experience questions above because the source is a professional interview-preparation post rather than a detailed candidate interview transcript.

---

### Q15. What is the difference between `==` and `equals()`?

This appeared in a reported Java Developer interview experience from Hexaware. ([LinkedIn][12])

It also appears in other real interview reports such as the Nike interview experience. ([LeetCode][13])

**Topic:** Relational/equality concepts
**Authenticity:** 🟢 Reported

**Note:** `.equals()` isn't actually covered in this document's operator notes, so I would move this question into your **String/Object/OOP section** later rather than count it as an operator question.

---

### Q16. What are unary operators / how do pre-increment and post-increment work?

There is evidence of Java interviews testing expression evaluation and unary behavior, although I did **not** find a sufficiently strong candidate report for the exact wording:

> "What is the difference between `++i` and `i++`?"

So I am **not marking that exact question as authentic**.

Instead, your notes should retain it as a **practice question**, not an "actual asked" question, until we find a direct interview report.

This is exactly the distinction you asked me to maintain.

---

### E. Bitwise Operators

**Interview Relevance:** ✅ Yes
Bitwise operations can be asked in Java technical/coding interviews.

**Authentic Company Question:** ❌ Not verified
No sufficient company-specific evidence for the exact question: *“What is the difference between `>>` and `>>>`?”*

**Action:** Keep in study material, but don't add to the authentic question bank.

---

### F. Ternary Operator

**Interview Relevance:** ✅ Yes
Ternary expressions can appear in Java technical interviews.

**Authentic Company Question:** ❌ Not verified
No sufficient company-specific evidence for a specific question.

**Action:** Keep in study material, but don't add to the authentic question bank.

---

### G. Variable Naming / Identifiers

**Interview Relevance:** ✅ Yes
Questions about valid/invalid identifiers, naming rules, and case sensitivity can appear in interviews.

**Authentic Company Question:** ❌ Not verified
No sufficient company-specific evidence for a specific question.

**Action:** Keep in study material, but don't add to the authentic question bank.

---

# 🔑 ANSWER KEY

Now the answers, as requested.

### 1. What are primitive data types in Java?

Java has eight primitive types:

```text
byte
short
int
long
float
double
char
boolean
```

They represent basic values rather than objects.

---

### 2. What are the default values of variables?

For **instance/static fields**, Java provides default values:

| Type                           | Default    |
| ------------------------------ | ---------- |
| `byte`, `short`, `int`, `long` | `0`        |
| `float`, `double`              | `0.0`      |
| `char`                         | `'\u0000'` |
| `boolean`                      | `false`    |
| Reference types                | `null`     |

**Important:** Local variables do **not** receive automatic default values. They must be initialized before use.

---

### 3. What is a wrapper class?

A wrapper class represents a primitive value as an object.

```text
int      → Integer
long     → Long
double   → Double
char     → Character
boolean  → Boolean
byte     → Byte
short    → Short
float    → Float
```

They are especially important when an API requires objects, such as Java's generic collections.

---

### 4. Why do we need wrapper classes?

Main reasons:

* To represent primitive values as objects
* Required by many generic APIs/collections
* Provide utility methods
* Support autoboxing/unboxing

Example:

```java
int a = 10;

Integer b = a;   // autoboxing
int c = b;       // unboxing
```

---

### 5. What are Java loops?

Java provides:

```text
for
while
do-while
enhanced for
```

`for` is commonly useful when the iteration structure/count is known.

`while` is condition-driven.

`do-while` executes its body **at least once** because the condition is checked after the body.

Enhanced `for` is used to traverse arrays and suitable iterable collections.

---

### 6. What is an infinite loop?

An infinite loop is a loop whose termination condition never becomes false.

Example:

```java
while (true) {
    System.out.println("Running...");
}
```

It continues indefinitely unless something such as `break`, an exception, program termination, etc. stops it.

---

### 7. What is `if-else` used for?

It allows the program to choose between alternative execution paths based on a boolean condition.

```java
if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

---

### 8. Is Java pass-by-value or pass-by-reference?

**Java is strictly pass-by-value.**

For objects, the value being passed is a **copy of the reference**.

Example:

```java
void change(Student s) {
    s.name = "Ali";
}
```

The copied reference still points to the same object, so changing the object's field can be visible to the caller.

But:

```java
void change(Student s) {
    s = new Student();
}
```

doesn't change the caller's reference, because only the **copy of the reference** was reassigned.

This is one of the questions I strongly recommend mastering because it repeatedly appears in real Java interviews. ([GeeksforGeeks][6])

---

### 9. How does parameter passing work in Java?

Java passes arguments **by value**.

For primitives:

```java
int x = 10;
```

the value `10` is copied.

For objects:

```java
Student s = new Student();
```

the value of `s`—the reference—is copied.

So:

```text
caller reference
      ↓
    Object
      ↑
copied reference
```

Both references initially point to the same object, but they are separate reference variables.

---

### 10. What is method overloading vs overriding?

**Overloading:**

Same method name, different parameter list, usually within the same class.

```java
void add(int a, int b)
void add(int a, int b, int c)
```

**Overriding:**

A subclass provides a new implementation of an inherited method with the same signature, subject to Java's overriding rules.

This distinction is heavily used in Java interviews, including the Infosys and CGI reports. ([Naukri][1])

---

### 11. What is the output of `10 + 5 * 2`?

```java
int x = 10 + 5 * 2;
```

Output:

```text
20
```

Because `*` has higher precedence than `+`.

Evaluation:

```text
10 + (5 * 2)
10 + 10
20
```

This exact expression has been discussed in a Java Developer interview-preparation report. ([LinkedIn][11])

---

### 12. What is short-circuit evaluation?

With `&&`:

```java
condition1 && condition2
```

if `condition1` is `false`, Java does not evaluate `condition2`.

With `||`:

```java
condition1 || condition2
```

if `condition1` is `true`, Java does not evaluate `condition2`.

Example:

```java
false && check();
```

`check()` isn't executed.

This differs from the non-short-circuit boolean/bitwise operators such as `&` and `|`. ([LinkedIn][11])

---

### 13. What is the difference between `==` and `equals()`?

For objects, `==` compares whether two references refer to the **same object**.

`equals()` is a method used for **logical/value equality**, depending on the class's implementation.

For example:

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);       // false
System.out.println(a.equals(b));  // true
```

This distinction has been reported in actual Java interviews. ([LinkedIn][12])


[1]: https://www.naukri.com/code360/interview-experiences/infosys-private-limited/infosys-interview-experience-senior-software-engineer-may-2022-exp-0-2-years?utm_source=chatgpt.com "Senior Software Engineer Infosys interview experience | Nakul Parashar - Naukri Code 360"
[2]: https://www.linkedin.com/posts/madhu-krishna-kummari-802258247_java-springboot-java8-activity-7357476633911455744-pupt?utm_source=chatgpt.com "Java Developer Interview at HCL Tech: Core Java and SQL Focus | Madhu Krishna Kummari posted on the topic | LinkedIn"
[3]: https://www.ambitionbox.com/interviews/infosys-interview-questions/java-developer/top-questions?page=3&utm_source=chatgpt.com "700+ Infosys Java Developer Interview Questions & Answers | Complete Prep Guide 2025 | AmbitionBox"
[4]: https://www.glassdoor.com/Interview/Lowes-Menswear-Interview-Questions-E659119.htm?utm_source=chatgpt.com "Lowes Menswear Interview Experience & Questions (2026) | Glassdoor"
[5]: https://www.glassdoor.co.in/Interview/Trutech-Web-Solutions-Java-Developer-AI-Interview-Questions-EI_IE733443.0%2C21_KO22%2C39.htm?utm_source=chatgpt.com "Trutech Web Solutions Java Developer AI Interview Questions | Glassdoor"
[6]: https://www.geeksforgeeks.org/interview-experiences/intime-tec-visionsoft-pvt-ltd-interview-experience-on-campus/?utm_source=chatgpt.com "InTime Tec Visionsoft Pvt. Ltd. Interview Experience (On-Campus) - GeeksforGeeks"
[7]: https://www.geeksforgeeks.org/javatpoint-interview-experience/?utm_source=chatgpt.com "JavaTpoint Interview Experience - GeeksforGeeks"
[8]: https://leetcode.com/discuss/post/1988706/?utm_source=chatgpt.com "Livspace | SDE1 | Bangalore | April 2022 - Discuss - LeetCode"
[9]: https://interviewrecap.com/questions/java-pass-by-value-semantics?utm_source=chatgpt.com "Java Pass-by-Value Semantics | JPMorganChase Interview Question | InterviewRecap"
[10]: https://devbrainiac.com/blogs/181/my-teradata-swe-intern-interview-experience-full-story-real-code-real-mistakes/?utm_source=chatgpt.com "My Teradata SWE Intern Interview Experience (Full Story, Real Code, Real Mistakes) ~ DevBrainiac"
[11]: https://www.linkedin.com/posts/rup12_accenture-java-developer-interview-experience-activity-7446207192938168320-KTlF?utm_source=chatgpt.com "Java Backend Interview Prep: Spring Boot & Microservices | Roopendra . posted on the topic | LinkedIn"
[12]: https://in.linkedin.com/in/kumar-debyashish-47b3a0157?utm_source=chatgpt.com "KUMAR DEBYASHISH - Pune Division, Maharashtra, India | Professional Profile | LinkedIn"
[13]: https://leetcode.com/discuss/post/7349349/?utm_source=chatgpt.com "My Nike Interview Experience - Discuss - LeetCode"
[14]: https://leetcode.com/discuss/post/1313552/junglee-games-sde-ii-backend-june-2021-bangalore-offer/?utm_source=chatgpt.com "Junglee Games | SDE II - Backend | June 2021 | Bangalore | Offer - Discuss - LeetCode"
