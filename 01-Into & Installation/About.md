# JAVA FUNDAMENTALS

## Study Topics

1. What is Java?
2. History of Java
3. Applications of Java
4. Java Editions
5. JDK vs JRE vs JVM
6. Java Program Execution Flow
7. WORA (Write Once Run Anywhere)
8. JDK Installation
9. Environment Variables
10. IntelliJ IDEA
11. Quick Revision
12. Interview Questions

---

# What is Java?

## 🔹 Definition

Java is a High-Level, Object-Oriented, Platform Independent Programming Language developed by Sun Microsystems.

Java follows the principle:

```text
Write Once, Run Anywhere (WORA)
```

This means a Java program can run on any operating system that contains a JVM.

---

## 🔹 Key Characteristics of Java

* Object Oriented
* Platform Independent
* Secure
* Robust
* Portable
* Multithreaded
* Distributed
* High Performance

---

# History of Java

## 🔹 Creation

Java was created in 1991 by:

```text
James Gosling
```

and his team at Sun Microsystems.

---

## 🔹 Original Name

Initially Java was named:

```text
Oak
```

after an Oak tree located outside James Gosling's office.

---

## 🔹 Renaming

The name Oak was later changed to:

```text
Java
```

inspired by Java Coffee.

---

## 🔹 Oracle Acquisition

In 2009, Oracle Corporation acquired Sun Microsystems.

Today Java is maintained by Oracle Corporation.

---

# Where is Java Used?

## Web Development

Examples:

* Spring Boot
* Jakarta EE

---

## Android Development

Examples:

* Android Applications
* Kotlin + Java Ecosystem

---

## Desktop Applications

Examples:

* Calculator Applications
* Inventory Systems
* Banking Software

---

## Cloud & Enterprise Systems

Examples:

* Distributed Systems
* Microservices
* Enterprise Applications

---

## Other Applications

* Games
* IoT Devices
* Automation Tools
* Embedded Systems

---

# Java Editions

## Java SE (Standard Edition)

Used for:

* Core Java
* OOP
* Collections
* Exception Handling
* Multithreading

This is where every Java developer begins.

---

## Java EE / Jakarta EE (Enterprise Edition)

Used for:

* Enterprise Applications
* Large Scale Web Applications

Technologies:

* Servlet
* JSP
* EJB

Modern Name:

```text
Jakarta EE
```

---

## Java ME (Micro Edition)

Used for:

* Embedded Devices
* Mobile Devices
* Smart Hardware

---

# JDK vs JRE vs JVM

One of the most important Java concepts.

---

## JVM

### Full Form

```text
Java Virtual Machine
```

### Responsibility

JVM executes Java Bytecode.

JVM understands:

```text
.class files
```

and converts them into machine-specific instructions.

---

## JRE

### Full Form

```text
Java Runtime Environment
```

Contains:

```text
JVM
+
Java Libraries
```

Formula:

```text
JRE = JVM + Libraries
```

Purpose:

Run Java Programs.

---

## JDK

### Full Form

```text
Java Development Kit
```

Contains:

```text
JRE
+
Development Tools
```

Formula:

```text
JDK = JRE + Development Tools
```

Development Tools:

* javac
* java
* jar
* javadoc

Purpose:

Develop Java Applications.

---

## Relationship Diagram

```text
JDK
│
├── JRE
│    │
│    └── JVM
│
└── Development Tools
```

---

# Java Program Execution Flow

## Step 1

Write Source Code

```text
Hello.java
```

---

## Step 2

Compile

```bash
javac Hello.java
```

Produces:

```text
Hello.class
```

(Bytecode)

---

## Step 3

Run Program

```bash
java Hello
```

---

## Step 4

JVM Executes Bytecode

```text
Output Generated
```

---

## Complete Flow

```text
Hello.java
      │
      ▼
Compile (javac)
      │
      ▼
Hello.class
(Bytecode)
      │
      ▼
JVM
      │
      ▼
Output
```

---

# WORA (Write Once Run Anywhere)

## 🔹 Meaning

```text
Write Once
Run Anywhere
```

---

## How?

Java code is converted into Bytecode.

Bytecode is platform independent.

Every Operating System has its own JVM.

```text
Java Program
      │
      ▼
Bytecode
      │
 ┌────┼────┐
 ▼    ▼    ▼
Windows Linux macOS
 JVM    JVM   JVM
```

Therefore the same bytecode runs everywhere.

---

# JDK Installation

## Step 1

Download JDK from Oracle.

Choose:

```text
Windows x64 Installer
```

---

## Step 2

Run Installer

```text
Next
Next
Install
Finish
```

---

## Step 3

Verify Installation

Example Location:

```text
C:\Program Files\Java\jdk-25
```

---

# Environment Variables

Environment Variables allow Java commands to run globally.

---

## JAVA_HOME

Create:

```text
JAVA_HOME
```

Value:

```text
C:\Program Files\Java\jdk-25
```

Purpose:

Stores JDK Installation Path.

---

## PATH Variable

Add:

```text
%JAVA_HOME%\bin
```

Purpose:

Allows execution of:

```bash
java
javac
```

from any directory.

---

# Verification Commands

Check Java Version:

```bash
java -version
```

---

Check Java Compiler:

```bash
javac -version
```

---

# IntelliJ IDEA

## 🔹 What is IntelliJ IDEA?

IntelliJ IDEA is an IDE (Integrated Development Environment) developed by JetBrains.

Used for:

* Java Development
* Kotlin Development
* Spring Boot Development

---

## Features

* Smart Code Completion
* Debugging
* Refactoring
* Git Integration
* Maven Support
* Gradle Support

---

## Why Developers Prefer IntelliJ IDEA?

* Fast Development
* Better Productivity
* Professional Industry IDE

---

# Quick Revision

```text
Java
│
├── Created by James Gosling
├── Originally Oak
├── Maintained by Oracle
└── Follows WORA
```

---

```text
Java Editions
│
├── Java SE
├── Jakarta EE
└── Java ME
```

---

```text
JDK
│
└── JRE
      │
      └── JVM
```

---

```text
Java Program
      │
      ▼
javac
      │
      ▼
Bytecode
      │
      ▼
JVM
      │
      ▼
Output
```

---

# Interview Questions

## Basic

1. What is Java?
2. Who created Java?
3. Why was Java originally called Oak?
4. What does WORA mean?
5. What are the applications of Java?

---

## Intermediate

6. What is Java SE?
7. What is Java EE?
8. What is Java ME?
9. What is JVM?
10. What is JRE?
11. What is JDK?
12. Explain the relationship between JDK, JRE, and JVM.
13. What is Bytecode?
14. Why is Java Platform Independent?

---

## Advanced

15. Explain Java Program Execution Flow.
16. How does JVM execute Bytecode?
17. Why is Java called Write Once Run Anywhere?
18. What is JAVA_HOME?
19. Why do we configure PATH Variable?
20. Difference between java and javac command?
21. What happens if JAVA_HOME is not configured?
22. Why is IntelliJ IDEA preferred for Java development?

---

# One-Line Definition

> Java is a high-level, object-oriented, platform-independent programming language that follows the principle of Write Once Run Anywhere (WORA).
