# Java Fundamentals — MCQ Practice Set

> **Basis:** This question set is created from the uploaded Java notes, diagrams, screenshots, and code/documentation, excluding the IDE Documentation setting section exactly as requested.
>
> **Coverage:** Java fundamentals, WORA/platform independence, Java editions, history, JDK/JRE/JVM, Java compilation/execution flow, JDK installation/environment variables, `javac`/`java` commands, class/file naming, `main()`, command-line arguments, `System.out.println()`, and Source File Mode.

---

## Section A — Java Introduction

### 1. Which description best matches Java according to the notes?

A. A low-level procedural language designed only for operating systems  
B. A high-level, class-based, object-oriented programming language  
C. A markup language used to build web pages  
D. A database query language  

### 2. What principle is most closely associated with Java's portability?

A. Compile Once, Use Everywhere  
B. Write Fast, Run Faster  
C. Write Once, Run Anywhere  
D. Build Once, Deploy Locally  

### 3. Why can Java programs run on different platforms?

A. Java source code is directly executed by every operating system  
B. Java bytecode can be executed through a JVM available for the target platform  
C. Java programs do not need compilation  
D. Every operating system uses the same CPU architecture  

### 4. Which of the following is **not** listed as a reason for Java's popularity?

A. Strong ecosystem of libraries and tools  
B. Built-in support for multithreaded programming  
C. Automatic memory management  
D. Direct dependence on a single operating system  

### 5. Which combination contains features explicitly associated with Java in the notes?

A. Encapsulation, inheritance, polymorphism, abstraction  
B. Pointers, multiple inheritance of classes, manual memory allocation  
C. HTML, CSS, DOM, SQL  
D. Registers, assembly instructions, kernel interrupts  

### 6. Which area is listed as a Java use case?

A. Web backend  
B. BIOS firmware only  
C. Spreadsheet formula parsing only  
D. CPU microcode design  

### 7. Which framework is associated with Java web backend development in the notes?

A. React  
B. Spring Boot  
C. Flutter  
D. NumPy  

### 8. Which statement about Java and JavaScript matches the notes?

A. They are two names for the same language  
B. JavaScript is the runtime of Java  
C. Java is not the same as JavaScript  
D. Java is a library inside JavaScript  

### 9. Java is described as suitable for applications ranging from:

A. Only small educational programs  
B. Only mobile applications  
C. Small programs to large-scale enterprise systems  
D. Only embedded systems  

### 10. Which feature helps Java support concurrent programming?

A. Built-in multithreading support  
B. HTML rendering  
C. SQL joins  
D. CSS inheritance  

---

## Section B — Java Editions and History

### 11. Which Java edition is presented as the foundation for Core Java?

A. Java ME  
B. Jakarta EE  
C. Java SE  
D. JavaScript SE  

### 12. Which group belongs to the Java SE areas listed in the notes?

A. Collections, exception handling, multithreading, I/O and networking  
B. JSX, React Hooks and Redux  
C. Servlet containers only  
D. Device drivers and assembly language only  

### 13. Jakarta EE was previously known as:

A. Java ME  
B. Java EE  
C. Java SE  
D. JRE EE  

### 14. Jakarta EE primarily provides:

A. Specifications and APIs for enterprise application development  
B. Only a Java compiler  
C. Only a JVM implementation  
D. Only desktop UI components  

### 15. Which is listed as an example associated with Jakarta EE?

A. Servlets  
B. `javac`  
C. `java.lang.System`  
D. JVM bytecode  

### 16. Java ME is designed mainly for:

A. Enterprise application servers only  
B. Resource-constrained and embedded devices  
C. High-end database servers only  
D. Java compiler development  

### 17. In which year did the Java project start according to the notes?

A. 1985  
B. 1991  
C. 1995  
D. 2000  

### 18. What was the original project name of Java?

A. Pine  
B. Green  
C. Oak  
D. Coffee  

### 19. In which year was Java publicly introduced?

A. 1991  
B. 1993  
C. 1995  
D. 1998  

### 20. Which sequence correctly represents the Sun Microsystems and Oracle events listed in the notes?

A. Oracle acquired Sun in 1995; Java launched in 2009  
B. Sun acquired Oracle in 2009; Oracle completed it in 2010  
C. Oracle announced the acquisition in 2009; it was completed in 2010  
D. Oracle completed the acquisition in 2009; it was announced in 2010  

### 21. Who is commonly known as the father of Java?

A. Dennis Ritchie  
B. James Gosling  
C. Bjarne Stroustrup  
D. Brendan Eich  

### 22. Which statement is correct about Java's platform independence?

A. Java is platform-independent at the bytecode level  
B. Java source code never needs compilation  
C. JVM is identical on every operating system  
D. Java removes the need for operating systems  

---

## Section C — JDK, JRE, JVM and WORA

### 23. What is the primary role of the JVM in the uploaded diagram?

A. Writing Java source code  
B. Running Java bytecode  
C. Editing source files  
D. Installing the operating system  

### 24. Which expansion of JRE is correct?

A. Java Runtime Environment  
B. Java Running Engine  
C. Java Resource Executor  
D. Java Runtime Editor  

### 25. Which expansion of JDK is correct?

A. Java Development Kit  
B. Java Deployment Kernel  
C. Java Development Kernel  
D. Java Debugging Kit  

### 26. Which relationship is given in the notes?

A. JDK = JVM + only source files  
B. JRE = JVM + standard libraries  
C. JVM = JDK + standard libraries  
D. JRE = JDK + compiler  

### 27. Which relationship best matches the uploaded notes?

A. JDK = JRE + development tools such as `java` and `javac`  
B. JDK = JVM only  
C. JRE = JDK + source code editor  
D. JVM = JDK + JRE  

### 28. Which component is responsible for development-oriented tools such as `javac`?

A. JVM  
B. JRE  
C. JDK  
D. `.class` file  

### 29. A developer writes `HelloWorld.java` and wants to compile it manually. Which command is appropriate?

A. `java HelloWorld.java`  
B. `javac HelloWorld.java`  
C. `jvm HelloWorld.java`  
D. `jre HelloWorld.java`  

### 30. After successful compilation of a normal Java source file, what is produced?

A. `.html` file  
B. `.class` bytecode file  
C. `.exe` file  
D. `.jar` file automatically in every case  

### 31. Which sequence best represents the normal execution flow?

A. `.java` → JVM → `javac` → output  
B. `.java` → `javac` → `.class` bytecode → JVM → output  
C. `.class` → `javac` → `.java` → output  
D. `.java` → JRE → source editor → output  

### 32. The "Write Once, Run Anywhere" idea is most directly supported by the fact that:

A. Source code is stored identically on every machine  
B. Bytecode can run through a JVM for the target platform  
C. Java skips compilation  
D. All computers use the same processor  

### 33. Which of the following is a runtime component rather than a development tool?

A. `javac`  
B. Source editor  
C. JVM  
D. Java compiler options  

### 34. Suppose a `.class` file already exists. Which component is responsible for loading and executing the bytecode?

A. JVM  
B. `javac`  
C. Text editor  
D. Java SE documentation  

### 35. Which statement correctly distinguishes JDK, JRE and JVM?

A. JDK is only a virtual machine; JRE is the compiler  
B. JVM runs bytecode; JRE provides the runtime environment; JDK adds development tools  
C. JVM contains the source code editor; JRE compiles source code  
D. JRE and JDK are both Java source files  

### 36. A student only wants the environment needed to run already-compiled Java applications. Which concept most closely matches this requirement?

A. JDK  
B. JRE  
C. `javac`  
D. Source File Mode  

### 37. A student needs to write Java code and compile it manually. Which is the relevant kit?

A. JDK  
B. JVM  
C. JRE only  
D. `.class` file  

### 38. In the uploaded JDK/JRE/JVM diagram, which stage directly follows the `.class` bytecode?

A. Java source editor  
B. JRE  
C. Class declaration  
D. IDE settings  

---

## Section D — Java Source Code, Class and main()

### 39. Consider this declaration:

```java
public class A_HelloWorld {
}
```

If this is the public class in the source file, what should the file name be?

A. `HelloWorld.java`  
B. `A_HelloWorld.java`  
C. `public.java`  
D. `class.java`  

### 40. In a Java class declaration, what does `class` do?

A. Declares a class  
B. Runs the JVM  
C. Compiles the source file  
D. Prints output  

### 41. According to the notes, a class can contain:

A. Only one method  
B. Variables, methods, constructors and other class members  
C. Only command-line arguments  
D. Only bytecode instructions  

### 42. Why is a class important in Java?

A. Java organizes program code using classes  
B. Every class is automatically a database  
C. A class replaces the JVM  
D. Classes are only required for Java ME  

### 43. In the declaration below, what is `public`?

```java
public class HelloWorld
```

A. A return type  
B. An access modifier  
C. A loop keyword  
D. A package name  

### 44. What is the role of `static` in the traditional `main()` method?

A. It makes the method belong to the class rather than an object  
B. It makes the method return a value  
C. It converts the method into a constructor  
D. It creates an instance automatically before every call  

### 45. Why can the Java launcher invoke a traditional `main()` method without first creating an object?

A. Because `main()` is static  
B. Because `main()` is private  
C. Because `main()` returns `void`  
D. Because `String[]` creates an object automatically  

### 46. What does `void` indicate in `main()`?

A. The method returns an integer  
B. The method returns a String  
C. The method does not return a value  
D. The method must print output  

### 47. Why is the traditional `main()` method declared `public`?

A. The JVM needs to access it from outside the class when starting the application  
B. `public` creates the JVM  
C. `public` converts bytecode to source code  
D. `public` is required for all Java methods  

### 48. In the traditional standalone application, what is `main`?

A. A Java package  
B. A class modifier  
C. The standard method name recognized by the Java launcher as the entry point  
D. A return type  

### 49. Which statement about `main` is most accurate?

A. `main` is a primitive data type  
B. `main` is a Java keyword like `class`  
C. `main` is the standard method name used as the traditional application entry point  
D. `main` is the name of the JVM  

### 50. In the parameter `String[] args`, what is `args`?

A. A compulsory keyword  
B. The parameter name  
C. The return type  
D. The class name  

### 51. Can the name `args` be changed in the traditional `main()` signature?

A. No, because `args` is a keyword  
B. No, because the JVM only accepts the exact identifier `args`  
C. Yes, because the identifier is only a parameter name  
D. Yes, but only if `String[]` is removed  

### 52. Which part of `String[] args` is essential for receiving command-line arguments as described in the notes?

A. The name `args` specifically  
B. The `String[]` parameter type  
C. The word `main` inside the parameter list  
D. The return type `void`  

### 53. Given:

```text
java A_HelloWorld Hello Java
```

What are the values of the first two command-line arguments?

A. `args[0] = "java"` and `args[1] = "A_HelloWorld"`  
B. `args[0] = "Hello"` and `args[1] = "Java"`  
C. `args[0] = "A_HelloWorld"` and `args[1] = "Hello"`  
D. `args[0] = "Java"` and `args[1] = "Hello"`  

### 54. Which is the correct traditional entry-point declaration shown in the notes?

A. `public void main(String args[])`  
B. `public static void main(String[] args)`  
C. `private static int main(String[] args)`  
D. `static public String main()`  

### 55. Which part of the traditional `main()` signature allows the method to be invoked by the Java launcher without an object?

A. `public`  
B. `static`  
C. `void`  
D. `String[]`  

---

## Section E — System.out.println() and Program Execution

### 56. What is the purpose of `System.out.println()`?

A. Compile Java source code  
B. Display output on the console and move to the next line  
C. Start the JVM  
D. Create a class file  

### 57. `System` is a predefined class from which package?

A. `java.util`  
B. `java.io`  
C. `java.lang`  
D. `java.net`  

### 58. What is `out` in `System.out` according to the notes?

A. A compiler command  
B. A standard output stream provided by `System`  
C. A Java package  
D. A source file  

### 59. More precisely, `System.out` refers to:

A. A `String` object  
B. A `PrintStream` object  
C. A JVM object  
D. A class file  

### 60. `println()` is a method of which class?

A. `System`  
B. `String`  
C. `PrintStream`  
D. `Scanner`  

### 61. What does `println()` do after printing the supplied value?

A. Recompiles the class  
B. Moves the cursor to the next line  
C. Closes the JVM  
D. Creates a new `.class` file  

### 62. Which flow most accurately describes the complete normal execution shown in the notes?

A. `.java` → `javac` → `.class` bytecode → JVM loads class → Java launcher finds `main()` → `main()` executes → output  
B. `.java` → JVM directly → `javac` → output  
C. `.java` → JRE edits code → `.class` → compiler → output  
D. `.class` → source editor → `main()` → `javac` → output  

---

## Section F — Compilation Commands and Source File Mode

### 63. Which command manually compiles `HelloWorld.java` in normal mode?

A. `java HelloWorld.java`  
B. `javac HelloWorld.java`  
C. `compile HelloWorld.java`  
D. `jvm HelloWorld.java`  

### 64. After compiling in normal mode, which command is used in the notes to run the compiled class?

A. `java HelloWorld`  
B. `javac HelloWorld`  
C. `run HelloWorld`  
D. `jre HelloWorld`  

### 65. Why is the `.java` extension omitted in the normal `java HelloWorld` command shown in the notes?

A. The command runs the compiled class rather than manually invoking source-file compilation  
B. Java deletes the source file  
C. `.java` is not a valid extension  
D. The JVM only accepts directories  

### 66. Which flow corresponds to normal mode?

A. `HelloWorld01.java → javac → HelloWorld.class → JVM → main() → Output`  
B. `HelloWorld01.java → JVM → javac → Output`  
C. `HelloWorld.class → javac → main() → Output`  
D. `HelloWorld01.java → JRE → editor → Output`  

### 67. What is Source File Mode intended to reduce?

A. The need for Java syntax  
B. Compilation and execution complexity/time by combining the steps into one command  
C. The size of the JVM  
D. The need for a `main()` method in every traditional standalone application  

### 68. Which command demonstrates Source File Mode in the uploaded notes?

A. `java HelloWorld01.java`  
B. `javac HelloWorld01.java` followed by `java HelloWorld01.java`  
C. `jre HelloWorld01.java`  
D. `java --compile HelloWorld01.java`  

### 69. What happens conceptually in Source File Mode?

A. The `.java` file is automatically compiled and then run  
B. The source file is converted directly into machine code without Java runtime involvement  
C. The source file is renamed to `.class` without compilation  
D. Only the editor runs; no program executes  

### 70. Which statement best contrasts normal mode with Source File Mode?

A. Normal mode uses a manual compile step; Source File Mode combines compilation and execution through one `java` command  
B. Normal mode cannot create bytecode  
C. Source File Mode requires two commands while normal mode requires one  
D. There is no difference at all  

### 71. If a learner wants to follow the traditional two-step flow explicitly, which pair is appropriate?

A. `java HelloWorld.java` then `javac HelloWorld`  
B. `javac HelloWorld.java` then `java HelloWorld`  
C. `jvm HelloWorld.java` then `jre HelloWorld`  
D. `java HelloWorld` then `javac HelloWorld.java`  

### 72. Which sequence represents Source File Mode as documented in the notes?

A. `.java → automatic compilation → JVM → main() → output`  
B. `.java → manual `javac` → `.class` → manual JVM command only  
C. `.java → JRE → `.java` → output`  
D. `.java → IDE settings → compiler → output`  

---

# Answer Key

|  Q | Ans |  Q | Ans |  Q | Ans |  Q | Ans |
| -: | :-: | -: | :-: | -: | :-: | -: | :-: |
|  1 |  B  | 19 |  C  | 37 |  A  | 55 |  B  |
|  2 |  C  | 20 |  C  | 38 |  B  | 56 |  B  |
|  3 |  B  | 21 |  B  | 39 |  B  | 57 |  C  |
|  4 |  D  | 22 |  A  | 40 |  A  | 58 |  B  |
|  5 |  A  | 23 |  B  | 41 |  B  | 59 |  B  |
|  6 |  A  | 24 |  A  | 42 |  A  | 60 |  C  |
|  7 |  B  | 25 |  A  | 43 |  B  | 61 |  B  |
|  8 |  C  | 26 |  B  | 44 |  A  | 62 |  A  |
|  9 |  C  | 27 |  A  | 45 |  A  | 63 |  B  |
| 10 |  A  | 28 |  C  | 46 |  C  | 64 |  A  |
| 11 |  C  | 29 |  B  | 47 |  A  | 65 |  A  |
| 12 |  A  | 30 |  B  | 48 |  C  | 66 |  A  |
| 13 |  B  | 31 |  B  | 49 |  C  | 67 |  B  |
| 14 |  A  | 32 |  B  | 50 |  B  | 68 |  A  |
| 15 |  A  | 33 |  C  | 51 |  C  | 69 |  A  |
| 16 |  B  | 34 |  A  | 52 |  B  | 70 |  A  |
| 17 |  B  | 35 |  B  | 53 |  B  | 71 |  B  |
| 18 |  C  | 36 |  B  | 54 |  B  | 72 |  A  |


## Quick Revision Map

- **Java:** High-level, class-based, object-oriented language.
- **WORA:** Write Once, Run Anywhere.
- **Java SE:** Foundation for Core Java.
- **Jakarta EE:** Formerly Java EE; enterprise development.
- **Java ME:** Embedded/resource-constrained environments.
- **JVM:** Runs Java bytecode.
- **JRE:** JVM + standard libraries/runtime environment.
- **JDK:** JRE + development tools such as `javac` and `java`.
- **Normal flow:** `.java → javac → .class → JVM → main() → output`.
- **Traditional compilation:** `javac HelloWorld.java`
- **Traditional execution:** `java HelloWorld`
- **Source File Mode:** `java HelloWorld01.java`
- **Class/file rule:** A public class should match the source file name.
- **`main()`:** Traditional standalone Java application entry point.
- **`static`:** Allows invocation without first creating an object.
- **`void`:** No return value.
- **`String[] args`:** Receives command-line arguments.
- **`System.out`:** Standard output stream (`PrintStream`).
- **`println()`:** Prints a value and moves to the next line.
