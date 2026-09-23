### Topics identified from your notes

1. **Java Introduction**

    * What is Java?
    * Why Java?
    * Features/advantages
    * Platform independence / WORA
    * Applications/uses of Java
    * Java vs other languages
2. **Java Editions**

    * Java SE
    * Java EE / Jakarta EE
    * Java ME
3. **Java History**

    * James Gosling
    * Sun Microsystems
    * Oak
    * 1995 introduction
4. **JDK / JRE / JVM**

    * Purpose of each
    * Relationship between them
    * JVM and platform independence
5. **Compilation & Execution**

    * Source code
    * `javac`
    * Bytecode
    * JVM execution
    * Running `.class` files
6. **JDK Installation**

    * JDK installation itself is primarily practical, so I did **not** manufacture interview questions for it.

I searched candidate-reported interview experiences rather than taking questions from generic preparation articles. For example, Nagarro, HCL, Wipro, EY, Radisys, Brillio, Plivo, Deloitte, TCS and other interview reports contain questions matching these topics. ([GeeksforGeeks][1])

# Java Interview Questions

## A. Java Basics

### Q1. What is Java?

**Asked in:** Nagarro — Technical Interview
The candidate explicitly reported this as one of the Java questions asked. ([GeeksforGeeks][1])

---

### Q2. What are the advantages of Java?

**Asked in:** Nagarro — Technical Interview. ([GeeksforGeeks][1])

---

### Q3. Why is Java platform-independent?

**Asked in:**

* Wipro interview experience
* Nagarro interview experience
* EY-GDS interview experience
* HCL interview experience
* Nagarro Java Developer interview ([GeeksforGeeks][2])

This is therefore a **very strongly reported question** for the topics in your notes.

---

### Q4. Why did you choose Java and not other programming languages?

**Asked in:** EY-GDS Technical Interview. ([GeeksforGeeks][3])

A similar "Why Java?" question was also reported in Brillio's interview experience. ([GeeksforGeeks][4])

---

### Q5. Why is Java widely used, and how does it compare with Python, C++, and JavaScript?

**Asked in:** Cognizant GenC Technical Interview. ([GeeksforGeeks][5])

This maps directly to your notes on **Why Java?**, its ecosystem and its distinction from other languages.

---

### Q6. What is Java and how is it different from C?

**Asked in:** Zenith Software interview report. ([AmbitionBox][6])

---

### Q7. What is the difference between C++ and Java?

**Asked in:** HCL Technologies Technical Interview. ([GeeksforGeeks][7])

---

# B. Java History

### Q8. What is the history of Java? Who invented/developed Java?

**Asked in:** TCS Junior Software Developer interview. The reported question was essentially:

> "What is java. What is the history of java can you tell me who invented java what is syntax."

([AmbitionBox][8])

---

### Q9. When was Java created and who developed it?

**Asked in:** ADP interview report. ([AmbitionBox][9])

---

### Q10. Who is the father of Java?

**Asked in:** Infosys interview question listing on AmbitionBox. ([AmbitionBox][10])

---

# C. JDK, JRE & JVM

### Q11. What are JDK, JRE and JVM?

**Asked in:** Nagarro Technical Interview. ([GeeksforGeeks][1])

It was also explicitly reported in interviews at **Deloitte** and **Manhattan Associates**. ([AmbitionBox][11])

---

### Q12. What is JRE?

**Asked in:** Hexaware Java Developer interview. ([AmbitionBox][12])

---

### Q13. What is JVM?

**Asked in:** Hexaware Java Developer interview. ([AmbitionBox][12])

---

### Q14. Can Java code run on a machine without a JVM?

**Asked in:** Radisys Software Engineer Technical Interview.

The interviewer reportedly asked several connected questions:

* What is bytecode?
* How does bytecode work on top of JVM?
* How does JVM work on top of the operating system?
* How is Java independent?
* Can Java code run on a machine without JVM?

([GeeksforGeeks][13])

This is **particularly relevant to your compilation/execution notes**.

---

# D. Bytecode & Compilation/Execution

### Q15. What is bytecode and how does it work on top of the JVM?

**Asked in:** Radisys Software Engineer interview. ([GeeksforGeeks][13])

---

### Q16. How does JVM work on top of the operating system?

**Asked in:** Radisys Software Engineer interview. ([GeeksforGeeks][13])

---

### Q17. Why does Java achieve platform independence through bytecode?

**Reported in the Radisys interview as a connected line of questioning** about bytecode, JVM, OS and Java's independence. ([GeeksforGeeks][13])

I would treat this as an **interview follow-up derived from the reported questioning**, rather than claiming that exact sentence was written by the candidate.

---

# E. `main()` / Program Execution

### Q18. Explain `public static void main(String args[])`.

**Asked in:** Nagarro Technical Interview. ([GeeksforGeeks][1])

It is also listed among top reported Capgemini Java Developer interview questions. ([AmbitionBox][14])

---

# F. Additional Basic Java Question

### Q19. What is Java programming used for?

**Asked in:** Infosys interview question listing. ([AmbitionBox][10])

This corresponds to your **Where is Java Used?** section.

---

# Questions I did NOT include

Your notes contain things like:

* Java SE
* Jakarta EE
* Java ME
* exact Java history timeline
* JDK 25 installation
* installation steps
* environment configuration
* `javac` command
* `java` command

I **didn't automatically turn every note into an interview question**.

For example, I found strong authentic evidence for:

> "What is JDK, JRE and JVM?"

but I did **not** find sufficiently strong candidate-reported evidence in the sources I searched for:

> "What is the difference between Java SE, Java EE and Java ME?"

So I'm leaving that out rather than falsely calling it an actual company interview question.

That's the standard I'll follow for your future documents too.

---

# 🔑 ANSWER KEY

Here is the answer key **at the end**, as you requested.

### 1. What is Java?

Java is a high-level, class-based, object-oriented programming language designed to be portable across platforms. Java source code is compiled into bytecode, which is executed by a JVM.

---

### 2. What are the advantages of Java?

Key advantages include:

* Platform independence
* Object-oriented programming
* Automatic memory management
* Exception handling
* Multithreading support
* Strong standard library/ecosystem
* Security features
* Portability

---

### 3. Why is Java platform-independent?

Java source code is compiled into **platform-independent bytecode**.

```text
Java Source Code
       ↓
     javac
       ↓
    Bytecode
     (.class)
       ↓
      JVM
       ↓
Machine-specific execution
```

The JVM implementation is platform-specific, while the bytecode is designed to be portable.

That's the basis of **WORA — Write Once, Run Anywhere**.

---

### 4. Why did you choose Java instead of other languages?

This is an interview/personal question, so your answer should be based on your actual experience.

For example:

> "I chose Java because it has strong object-oriented features, a large ecosystem, good support for backend development, and is widely used with technologies such as Spring Boot. I also find its structured approach useful for developing large applications."

Don't memorize this blindly—the interviewer can ask follow-ups.

---

### 5. Why is Java widely used?

Because it provides:

* Platform portability
* Mature ecosystem
* OOP
* Multithreading/concurrency support
* Automatic memory management
* Strong libraries/frameworks
* Enterprise/backend support
* Long-term ecosystem maturity

---

### 6. Java vs C

| Java                          | C                               |
| ----------------------------- | ------------------------------- |
| Object-oriented/class-based   | Procedural                      |
| Runs through JVM              | Compiles to native machine code |
| Automatic garbage collection  | Manual memory management        |
| Platform-independent bytecode | Platform-dependent executable   |
| No direct pointer arithmetic  | Supports pointers               |
| Rich standard libraries       | Smaller standard library        |

---

### 7. Java vs C++

Java is class-based and uses JVM bytecode for portability, while C++ generally compiles to native machine code. Java provides automatic garbage collection and does not expose pointer arithmetic like C++.

---

### 8. History of Java

A concise answer:

> Java originated at Sun Microsystems. The project began in 1991 under James Gosling and his team and was initially called **Oak**. Java was publicly introduced in 1995.

---

### 9. When was Java created and who developed it?

The Java project began in **1991** at Sun Microsystems, led by **James Gosling and his team**, and Java was publicly introduced in **1995**.

---

### 10. Who is the father of Java?

**James Gosling** is commonly known as the **father of Java**.

---

### 11. Difference between JDK, JRE and JVM

```text
JDK
 └── Development tools + JRE
          └── JVM + Runtime Libraries
```

**JDK — Java Development Kit**

Used to **develop** Java applications.

Includes tools such as:

```text
javac
java
javadoc
jdb
jar
```

**JRE — Java Runtime Environment**

Provides the environment required to **run** Java applications.

**JVM — Java Virtual Machine**

Executes Java **bytecode**.

---

### 12. What is JRE?

JRE is the runtime environment required for running Java applications. Conceptually, it consists of the JVM plus the runtime libraries/supporting components required by the application.

---

### 13. What is JVM?

JVM stands for **Java Virtual Machine**.

It executes Java bytecode and provides the runtime environment through which Java programs execute on a particular operating system/platform.

---

### 14. Can Java code run without a JVM?

For normal Java applications targeting the JVM, **the bytecode needs a JVM-compatible runtime to execute**.

The important distinction is:

```text
.java
  ↓ javac
.class (bytecode)
  ↓ JVM
Execution
```

The JVM itself is platform-specific, while the bytecode is portable.

---

### 15. What is bytecode?

Bytecode is the intermediate code generated by the Java compiler.

For example:

```bash
javac HelloWorld.java
```

produces:

```text
HelloWorld.class
```

The `.class` file contains Java bytecode.

The JVM then loads and executes that bytecode.

---

### 16. How does JVM work on top of the operating system?

A simplified view:

```text
Java Application
       ↓
    Bytecode
       ↓
      JVM
       ↓
Operating System
       ↓
Hardware
```

The JVM provides an abstraction between Java bytecode and the underlying operating system/hardware.

---

### 17. Why does bytecode provide platform independence?

Because the Java compiler doesn't normally compile your source directly into Windows/Linux/macOS-specific machine code.

Instead:

```text
Source Code
    ↓
Bytecode
    ↓
JVM for Windows
JVM for Linux
JVM for macOS
...
```

Each platform has its own JVM implementation capable of executing the same bytecode.

---

### 18. Explain `public static void main(String args[])`

This is the traditional Java entry point.

* `public` → accessible to the JVM
* `static` → can be invoked without creating an object
* `void` → returns nothing
* `main` → recognized entry-point method name
* `String[] args` → receives command-line arguments

Example:

```java
public static void main(String[] args) {
    System.out.println("Hello Java");
}
```

---

### 19. What is Java used for?

Java is used for areas including:

* Backend development
* Enterprise applications
* Web applications
* Android development
* Cloud applications
* Desktop applications
* Distributed systems
* Large-scale business systems

---

[1]: https://www.geeksforgeeks.org/interview-experiences/nagarro-interview-experience-2/?utm_source=chatgpt.com "Nagarro Interview Experience - GeeksforGeeks"
[2]: https://www.geeksforgeeks.org/interview-experiences/wipro-interview-experience-set-4-on-campus/?utm_source=chatgpt.com "Wipro Interview Experience | Set 5 (On-Campus) - GeeksforGeeks"
[3]: https://www.geeksforgeeks.org/interview-experiences/ey-gds-interview-experience-for-virtual-consultant-2022/?utm_source=chatgpt.com "EY-GDS Interview Experience for Virtual Consultant 2022 - GeeksforGeeks"
[4]: https://www.geeksforgeeks.org/interview-experiences/brillio-interview-experience-on-campus/?utm_source=chatgpt.com "Brillio Interview Experience (On-Campus) - GeeksforGeeks"
[5]: https://www.geeksforgeeks.org/interview-experiences/cognizant-interview-experience-genc-category/?utm_source=chatgpt.com "Cognizant Interview experience | GenC Category - GeeksforGeeks"
[6]: https://www.ambitionbox.com/interviews/zenith-software-interview-questions?utm_source=chatgpt.com "10+ Zenith Software Interview Questions & Answers | Complete Prep Guide 2025 | AmbitionBox"
[7]: https://www.geeksforgeeks.org/interview-experiences/hcl-interview-experience-on-campus-2023/?utm_source=chatgpt.com "HCL Interview Experience (On-Campus) 2023 - GeeksforGeeks"
[8]: https://www.ambitionbox.com/interviews/tcs-interview-questions/junior-software-developer?utm_source=chatgpt.com "60+ TCS Junior Software Developer Interview Questions & Answers | Complete Prep Guide 2025 | AmbitionBox"
[9]: https://www.ambitionbox.com/interviews/automatic-data-processing-adp-interview-questions/trainee-business-analyst?utm_source=chatgpt.com "2 Automatic Data Processing (ADP) Trainee Business Analyst Interview Questions & Answers | Complete Prep Guide 2025 | AmbitionBox"
[10]: https://www.ambitionbox.com/profiles/java-programmer/interview-questions?utm_source=chatgpt.com "10+ Java Programmer Interview Questions & Answers (Updated 2025) | AmbitionBox"
[11]: https://www.ambitionbox.com/interviews/deloitte-interview-questions/java-software-developer/?utm_source=chatgpt.com "8 Deloitte Java Software Developer Interview Questions & Answers 2025 | AmbitionBox"
[12]: https://www.ambitionbox.com/interviews/hexaware-technologies-interview-questions/java-developer/experienced-candidates?utm_source=chatgpt.com "6 Hexaware Technologies Java Developer Interview Questions for Experienced 2025 | AmbitionBox"
[13]: https://www.geeksforgeeks.org/interview-experiences/radisys-interview-experience-for-software-engineer-on-campus/?utm_source=chatgpt.com "Radisys Interview Experience for Software Engineer (On-Campus) - GeeksforGeeks"
[14]: https://www.ambitionbox.com/interviews/capgemini-interview-questions/java-developer/experienced-candidates?utm_source=chatgpt.com "100+ Capgemini Java Developer Interview Questions for Experienced 2025 | AmbitionBox"
