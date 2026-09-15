I went through the uploaded **Java Introduction document**, the **JDK/JRE/JVM diagram**, and both visual walkthrough PDFs, including the screenshots showing JDK installation, `JAVA_HOME`, `PATH`, compilation/execution, version checking, and the command-line workflow.

For the PDFs, the important material is largely visual rather than machine-readable text: the screenshots show JDK 25 download/installation, Windows environment variables, the installed JDK directory structure, `JAVA_HOME`/`PATH`, and command-line verification such as `java --version`.

# Java Introduction + JDK/JRE/JVM + Installation — Complete MCQ Test

> **Goal:** Test actual understanding of the material rather than simple line-by-line recall.
>
> The questions intentionally focus on **moderate → hard** reasoning, comparisons, execution flow, architecture, installation/configuration, commands, and scenario-based understanding.

---

# Section A — Java Fundamentals

### 1.

Which description best matches Java according to the supplied material?

* A. A low-level procedural language designed mainly for hardware programming
* B. A high-level, class-based, object-oriented language designed for portable application development
* C. A scripting language designed only for browsers
* D. A database query language

### 2.

What does **Write Once, Run Anywhere (WORA)** primarily communicate about Java?

* A. Java source code never needs compilation
* B. Java programs can be made portable across platforms through the Java execution environment
* C. Java can execute only on Windows
* D. Java applications do not require the JVM

### 3.

Why does Java achieve platform independence according to the supplied introduction?

* A. Java source is interpreted directly by every operating system
* B. Java programs can run on different platforms through the JVM
* C. Java removes the need for an operating system
* D. Java generates native machine code only once

### 4.

Which combination best explains why Java is described as robust?

* A. Strong type checking, exception handling, and automatic memory management
* B. Manual memory management and no type checking
* C. Browser-only execution and garbage collection only
* D. Native assembly and pointer arithmetic

### 5.

Which characteristic of Java is directly associated with concurrent programming?

* A. Platform independence
* B. Multithreading
* C. Encapsulation
* D. Bytecode

### 6.

Which feature explains why Java has a large ecosystem?

* A. Java contains only a small standard library
* B. Java has mature libraries, frameworks, and development tools
* C. Java does not support external frameworks
* D. Java avoids reusable software components

### 7.

Which of the following is **not** listed as an area where Java is used in the source material?

* A. Web backend
* B. Cloud and enterprise systems
* C. IoT
* D. Operating-system kernel development

### 8.

Which pairing is correct?

* A. Spring Boot → Web Backend
* B. Java ME → Enterprise Applications
* C. Jakarta EE → Browser scripting
* D. Java SE → Embedded-only programming

### 9.

A developer is building a large backend enterprise application. Which use case from the supplied material is most directly relevant?

* A. Web backend and enterprise systems
* B. Only desktop applications
* C. Only earlier mobile devices
* D. Only embedded sensors

### 10.

Which statement best distinguishes Java from JavaScript according to the supplied material?

* A. They are the same language with different names
* B. The material explicitly notes that Java is not the same as JavaScript
* C. JavaScript is the newer edition of Java
* D. Java is a JavaScript runtime

---

# Section B — Java Editions

### 11.

Which edition is described as the foundation for learning Core Java?

* A. Java ME
* B. Java SE
* C. Jakarta EE
* D. JavaScript Edition

### 12.

Which group belongs to the Java SE areas listed in the material?

* A. OOP, Collections, Exception Handling, Multithreading
* B. Only Servlets and JSP
* C. Only embedded programming
* D. Only browser APIs

### 13.

A learner wants to study the core language, collections, exceptions, I/O, networking, and multithreading. Which edition is the source material directing them toward?

* A. Java SE
* B. Java ME
* C. Jakarta EE
* D. JavaScript

### 14.

What happened to the name **Java EE** according to the source?

* A. It was renamed Jakarta EE
* B. It was renamed Java ME
* C. It was merged into Java SE
* D. It became JavaScript

### 15.

Which area is specifically associated with Jakarta EE in the supplied material?

* A. Servlets and JSP
* B. Primitive data types
* C. Array indexing
* D. Command-line arguments

### 16.

Which edition was designed for resource-constrained and embedded devices?

* A. Java SE
* B. Jakarta EE
* C. Java ME
* D. JDK

### 17.

What does the material say about Java ME's current mainstream usage?

* A. It is the primary platform for all modern Java development
* B. It is less common in mainstream Java development today
* C. It replaced Java SE
* D. It is used only for enterprise systems

---

# Section C — Java History

### 18.

Which sequence correctly reflects the historical events listed?

* A. 1991 project started → Oak → 1995 public introduction → 2009 Oracle acquisition announcement → 2010 completion
* B. 1995 project started → Oak → 1991 public release → 2010 Sun acquisition announcement
* C. 1991 Java EE → 1995 Java ME → 2009 Oracle created Sun
* D. 1995 Oak → 2009 project started → 2010 Java released

### 19.

Who is commonly known as the father of Java in the supplied material?

* A. James Gosling
* B. Bill Gates
* C. Dennis Ritchie
* D. Brendan Eich

### 20.

What was the original project name?

* A. Oak
* B. JavaScript
* C. JDK
* D. HotJava

### 21.

In which year was Java publicly introduced according to the document?

* A. 1991
* B. 1993
* C. 1995
* D. 2009

### 22.

What happened in 2009 according to the supplied history table?

* A. Java was created
* B. Oracle announced the acquisition of Sun Microsystems
* C. Oracle completed the acquisition
* D. Java ME was introduced

### 23.

What happened in 2010?

* A. The Java project started
* B. Oak was created
* C. Oracle completed the acquisition of Sun Microsystems
* D. Java was publicly introduced

---

# Section D — JVM, JRE and JDK

### 24.

Which statement best describes the relationship shown in the supplied diagram?

* A. JVM is inside JRE, and JRE is inside JDK conceptually
* B. JDK is inside JVM
* C. JVM and JDK are identical
* D. JRE replaces JDK

### 25.

According to the diagram, what does the JVM primarily do?

* A. Develop Java programs
* B. Run code
* C. Provide all development tools
* D. Store source files

### 26.

What does the diagram describe JRE as?

* A. JVM + standard libraries
* B. JVM + compiler only
* C. JDK without JVM
* D. Source file + compiler

### 27.

What does the supplied diagram describe JDK as?

* A. JRE + development tools such as `java` and `javac`
* B. JVM + source code
* C. JRE without tools
* D. Bytecode + operating system

### 28.

A machine needs the components necessary to develop Java programs as well as run them. Which package from the diagram is the broadest fit?

* A. JVM
* B. JRE
* C. JDK
* D. `.class`

### 29.

A machine only needs the runtime environment and standard libraries for running Java applications. Which conceptual component is most appropriate?

* A. JRE
* B. JDK
* C. `javac`
* D. Source File Mode

### 30.

Which tool in the supplied diagram is associated with compilation?

* A. `java`
* B. `javac`
* C. JVM
* D. `println()`

### 31.

Which command is shown as a development tool associated with the JDK?

* A. `javac`
* B. `println`
* C. `JVM`
* D. `java.lang`

### 32.

Which statement best distinguishes the JVM from the JRE?

* A. JVM runs code; JRE combines the JVM with standard libraries
* B. JVM contains development tools; JRE only contains the compiler
* C. JVM is larger than the JDK
* D. JRE compiles while JVM edits source

### 33.

Which statement best distinguishes JRE from JDK?

* A. JRE provides runtime capabilities; JDK adds development tools
* B. JRE contains `javac` while JDK does not
* C. JDK is only a JVM
* D. JRE is a source-code editor

### 34.

Which of the following is **not** part of the JDK description shown in the diagram?

* A. Runtime environment
* B. Standard libraries
* C. Development tools
* D. Source-code editor

---

# Section E — Java Program → Bytecode → Runtime

### 35.

Which flow best matches the supplied JDK/JRE/JVM diagram?

* A. `.java` → `javac` → `.class` → JRE/JVM → output
* B. `.java` → JVM → `javac` → output
* C. `.class` → `.java` → JDK → output
* D. `.java` → JRE → `javac` → output

### 36.

Why is the `.class` file important in the diagram?

* A. It represents the bytecode produced from the Java source
* B. It is the source code itself
* C. It is a standard library
* D. It is the JDK installation directory

### 37.

What does WORA depend on in the supplied conceptual model?

* A. Portability of Java bytecode through the runtime/JVM
* B. A different source file for every OS
* C. Rewriting Java into machine code manually
* D. Avoiding compilation

### 38.

Which component ultimately runs the bytecode according to the supplied material?

* A. JVM
* B. `javac`
* C. Editor
* D. `JAVA_HOME`

### 39.

Which component provides the runtime environment around the JVM?

* A. JRE
* B. JDK
* C. `.java`
* D. `PATH`

### 40.

Which component includes development tools around the runtime environment?

* A. JDK
* B. JRE
* C. JVM
* D. `.class`

---

# Section F — JDK Installation

### 41.

The installation PDF visually shows an Oracle Java download page with multiple Windows package choices. Why is selecting the correct package important?

* A. The installer/package must match the intended operating system and installation method
* B. All packages are identical
* C. The choice determines the Java language syntax
* D. It changes the Java edition

### 42.

Which Windows package type is visibly shown among the download choices in the installation walkthrough?

* A. x64 MSI Installer
* B. ARM-only Linux package
* C. `.class` installer
* D. JRE source archive

### 43.

Why would a Windows user typically distinguish between a compressed archive and an installer when following the shown download options?

* A. They are different distribution formats for obtaining the JDK
* B. One is Java source code
* C. One contains only JVM bytecode
* D. One is Jakarta EE

### 44.

The installation walkthrough visually proceeds from the Oracle download page to a Java setup wizard. What does this demonstrate?

* A. The downloaded JDK installer is being used to install the development environment
* B. `javac` is being installed separately from Java
* C. The JVM is being compiled from source
* D. Java is being converted into JavaScript

### 45.

After installation, the screenshots show the JDK directory containing directories such as `bin`, `conf`, `include`, `jmods`, `legal`, and `lib`. What does this most strongly indicate?

* A. The JDK installation contains multiple runtime and development-related components
* B. Only source files are installed
* C. The directory contains only a single JVM executable
* D. Java has not actually been installed

---

# Section G — `JAVA_HOME`

### 46.

What is the purpose of `JAVA_HOME` in the installation walkthrough?

* A. It identifies the JDK installation location
* B. It stores the version of Java source code
* C. It contains Java program output
* D. It replaces the JVM

### 47.

The screenshot shows `JAVA_HOME` pointing toward a JDK installation directory. Why is that useful?

* A. Tools can reference a known JDK installation location
* B. It changes the Java syntax
* C. It makes Java platform-dependent
* D. It stores `.class` files automatically

### 48.

Which type of value would conceptually make sense for `JAVA_HOME`?

* A. A filesystem path to the JDK installation
* B. A Java source statement
* C. A class name only
* D. A console output string

### 49.

Why is `JAVA_HOME` conceptually different from adding a Java executable directory to `PATH`?

* A. `JAVA_HOME` identifies the JDK home; `PATH` helps the shell find executable commands
* B. Both always mean exactly the same thing
* C. `PATH` stores Java source code
* D. `JAVA_HOME` is the Java compiler itself

---

# Section H — `PATH`

### 50.

Why is the JDK's `bin` directory relevant to the environment `PATH` shown in the screenshots?

* A. The Java command-line tools are located there
* B. It contains Java source tutorials
* C. It stores browser bookmarks
* D. It contains only images

### 51.

What practical problem does adding the JDK `bin` directory to `PATH` solve?

* A. It allows commands such as `java` and `javac` to be found from the command line
* B. It makes `.java` files executable by Windows Explorer
* C. It changes Java into native code
* D. It creates `JAVA_HOME`

### 52.

Suppose `JAVA_HOME` is configured correctly but `javac` cannot be found from the command prompt. Which configuration is the likely area to check?

* A. `PATH`
* B. `String[] args`
* C. `System.out`
* D. `.class` bytecode

### 53.

Why would adding `%JAVA_HOME%\bin` to `PATH` be useful in the setup shown?

* A. It lets the command shell locate executables inside the JDK's `bin` directory through the configured JDK home
* B. It stores the JDK itself inside `PATH`
* C. It compiles source code automatically
* D. It changes the JVM version

---

# Section I — Command-Line Compilation & Execution

### 54.

The visual walkthrough shows:

```text
javac HelloWorld.java
java HelloWorld
```

What does the first command accomplish?

* A. Compiles the source file
* B. Runs the source file
* C. Prints output
* D. Starts the JVM directly

### 55.

What does:

```text
java HelloWorld
```

represent in the traditional workflow shown?

* A. Running the compiled class
* B. Compiling the source
* C. Creating `HelloWorld.java`
* D. Installing the JDK

### 56.

Why does the traditional run command omit `.java`?

* A. It is invoking the compiled class rather than asking `java` to compile the source in that traditional workflow
* B. `.java` files do not exist
* C. Java automatically renames the source file
* D. `java` only accepts directories

### 57.

The screenshots show both `HelloWorld.java` and `HelloWorld.class` in the same directory after compilation. What does that demonstrate?

* A. Compilation generated the corresponding class file
* B. The JVM deleted the source file
* C. The class file is the same file as the source
* D. Java copied the source without compiling it

### 58.

After changing the source program's output string, why is `javac HelloWorld.java` run again in the walkthrough?

* A. The modified source must be compiled again so the class file reflects the new code
* B. `java` cannot run classes
* C. The JDK must be reinstalled
* D. `JAVA_HOME` must be recreated

### 59.

Suppose the source says:

```java
System.out.println("Hello, Java!");
```

and later changes to:

```java
System.out.println("Hello, Java - The Great!");
```

What must happen in the traditional workflow before the new output appears when running the class?

* A. Recompile the source and then run the class
* B. Only restart the terminal
* C. Only change `PATH`
* D. Reinstall the JDK

### 60.

Which sequence from the walkthrough correctly reflects modifying and rerunning the program?

* A. Edit source → `javac` → `java`
* B. `java` → edit source → `javac`
* C. Edit source → `java` only
* D. Reinstall JDK → edit source → `java`

---

# Section J — Version & Environment Verification

### 61.

The final installation screenshot shows:

```text
java --version
```

Why is such a command useful immediately after installation/configuration?

* A. It verifies which Java runtime is being found and reports its version
* B. It compiles the current source file
* C. It prints all Java source files
* D. It creates `JAVA_HOME`

### 62.

If `java --version` successfully returns Java version information, what does that strongly suggest?

* A. The `java` command is reachable through the configured environment
* B. `javac` must also have compiled a program
* C. A specific Java class has executed
* D. `JAVA_HOME` is necessarily the only configuration involved

### 63.

What is the relationship between checking `java --version` and compiling a Java program?

* A. Version checking verifies the reachable Java runtime command; it does not itself compile a program
* B. Version checking compiles the source
* C. Version checking creates `.class` files
* D. They are exactly the same operation

---

# Section K — Practical Troubleshooting

### 64.

A user has installed the JDK but receives a message indicating that `java` is not recognized as a command. Based on the installation material, what should be checked first?

* A. Whether the JDK's executable directory is correctly available through `PATH`
* B. Whether the source has a `println()`
* C. Whether the class is named `Main`
* D. Whether Java SE was renamed

### 65.

A user has configured `PATH` but does not know where the JDK installation is located. Which variable from the walkthrough is specifically intended to identify that location?

* A. `JAVA_HOME`
* B. `CLASSPATH`
* C. `args`
* D. `System.out`

### 66.

A user points `JAVA_HOME` directly to a command file rather than the JDK installation directory. Why does that conflict with the setup shown?

* A. `JAVA_HOME` is intended to identify the JDK home directory
* B. `JAVA_HOME` must always contain a `.java` source file
* C. `JAVA_HOME` stores the output stream
* D. `JAVA_HOME` is supposed to point to the `.class` file

### 67.

Suppose `java --version` works, but `javac --version` does not. Which conceptual distinction from the JDK/JRE/JVM diagram is useful?

* A. `java` is associated with running code, while `javac` is a development/compiler tool associated with the JDK
* B. Both commands are purely runtime commands
* C. `javac` belongs to Java ME
* D. `java` is the compiler

### 68.

Why can a machine have a runtime command available but still have a problem compiling source code?

* A. Runtime execution and development tooling are separate capabilities in the JRE/JDK distinction
* B. Compilation is unrelated to Java
* C. JVM only runs source
* D. `.class` files are not needed

---

# Section L — Architecture & Installation Integration

### 69.

Which chain best connects the conceptual software layers shown in the source image?

* A. JDK → JRE → JVM
* B. JVM → JRE → JDK
* C. JRE → JVM → JDK
* D. `javac` → JVM → JDK

### 70.

Why is `javac` associated with the JDK rather than merely the JVM?

* A. `javac` is a development tool used to compile source code
* B. JVM is a source-code compiler
* C. JRE contains every development tool
* D. `javac` runs bytecode

### 71.

Which component is most directly related to running already-produced bytecode?

* A. JVM
* B. `javac`
* C. `JAVA_HOME`
* D. Editor

### 72.

Which component conceptually provides the runtime plus standard libraries?

* A. JRE
* B. JVM
* C. `javac`
* D. `PATH`

### 73.

Which component conceptually packages the runtime environment together with development tools?

* A. JDK
* B. JVM
* C. JRE
* D. `.class`

### 74.

A developer only wants to execute an existing `.class` file and does not need to compile source. Which conceptual layer is most directly concerned with that task?

* A. Runtime environment/JVM
* B. JDK compiler
* C. Source editor
* D. `JAVA_HOME`

### 75.

A developer wants to write Java code, compile it, and then run it. Which conceptual package best fits the complete task?

* A. JDK
* B. JVM only
* C. JRE only
* D. `.class`

---

# Section M — Java Usage & Editions Combined

### 76.

A student says:

> "Java SE is mainly an enterprise API platform."

Which correction matches the source?

* A. Java SE is the foundation for Core Java
* B. Java SE is mainly Java ME
* C. Java SE is a replacement for the JVM
* D. Java SE only supports JSP

### 77.

A student wants to understand Servlets, JSP, persistence and web services according to the material. Which edition should they associate these with?

* A. Jakarta EE
* B. Java ME
* C. Java SE only
* D. JVM

### 78.

A developer targets resource-constrained embedded devices. Which edition from the material most directly matches that historical use case?

* A. Java ME
* B. Jakarta EE
* C. Java SE
* D. JDK

### 79.

Which pairing is incorrect according to the source?

* A. Java SE → Core Java
* B. Jakarta EE → Enterprise application development
* C. Java ME → Resource-constrained devices
* D. Java ME → Main platform for modern Core Java learning

### 80.

Which statement best reflects the evolution of Java EE terminology?

* A. Java EE was later renamed Jakarta EE
* B. Java EE became Java ME
* C. Java EE became JVM
* D. Java EE was renamed JavaScript

---

# Section N — History + Concepts

### 81.

Why is Oak historically relevant to Java?

* A. It was the original project name before Java was publicly introduced
* B. It was the first JVM implementation
* C. It was the name of Java SE
* D. It was Oracle's compiler

### 82.

What historical combination is correct?

* A. James Gosling → Sun Microsystems → Oak → Java
* B. James Gosling → Oracle → JavaScript → Oak
* C. Dennis Ritchie → Sun Microsystems → Java
* D. Brendan Eich → Sun Microsystems → Oak

### 83.

Which sequence correctly places Sun Microsystems and Oracle in the history provided?

* A. Java project began at Sun Microsystems; Oracle later announced and completed acquisition of Sun
* B. Java began at Oracle and Sun acquired Oracle
* C. Oracle created Oak at Sun
* D. Sun acquired Java from Oracle in 1991

---

# Section O — Combined Reasoning Scenarios

### 84.

A developer has:

```text
HelloWorld.java
```

and runs:

```text
javac HelloWorld.java
```

What is the most direct expected artifact from the documented traditional workflow?

* A. `HelloWorld.class`
* B. `HelloWorld.exe`
* C. `HelloWorld.jdk`
* D. `HelloWorld.jvm`

### 85.

The developer then runs:

```text
java HelloWorld
```

Which conceptual component is primarily responsible for executing the resulting bytecode?

* A. JVM
* B. `javac`
* C. `JAVA_HOME`
* D. Java SE documentation

### 86.

A student's `java` command works but `javac` does not. They installed the JDK. What is the most useful first concept to check from the setup material?

* A. Whether the JDK `bin` directory is properly represented in `PATH`
* B. Whether `main()` is named `start()`
* C. Whether the project uses Jakarta EE
* D. Whether the source file is `.class`

### 87.

A student changes Java source code but runs `java HelloWorld` without recompiling in the traditional workflow. What risk does this create?

* A. The JVM may execute the old `.class` bytecode rather than the modified source
* B. Java automatically recompiles the old class with `javac`
* C. `JAVA_HOME` changes the source
* D. The source becomes a JRE

### 88.

Why is this difference important?

```text
javac HelloWorld.java
java HelloWorld
```

versus:

```text
java HelloWorld.java
```

* A. The first represents the documented traditional compile-then-run flow; the second represents Source File Mode
* B. Both are documented as exactly the same workflow
* C. The first runs source directly and the second compiles only
* D. Neither uses the JVM

### 89.

A developer says:

> "The JRE is the compiler because Java programs need the JRE to compile."

Which source-based correction is best?

* A. The diagram describes the JRE as JVM + standard libraries, while development tools such as `javac` are added by the JDK
* B. JRE and JDK are identical
* C. JVM compiles source code
* D. `JAVA_HOME` is the compiler

### 90.

A developer says:

> "The JVM is the complete Java Development Kit."

What is the correct relationship from the supplied diagram?

* A. JVM is the runtime execution engine; JDK includes the runtime environment plus development tools
* B. JVM includes `javac` and all development tools
* C. JDK is a subset of JVM
* D. JVM is a source editor

---

# Section P — Deeper Understanding

### 91.

Why does the source describe Java as class-based and object-oriented while also emphasizing WORA?

* A. Java combines an object-oriented programming model with a portable execution model
* B. WORA means Java has no classes
* C. Object orientation prevents portability
* D. WORA applies only to JavaScript

### 92.

Which statement best connects Java's platform independence with bytecode?

* A. The Java source is compiled into bytecode that can be executed by JVM implementations on different platforms
* B. Each OS must compile Java source into a completely unrelated language
* C. Java does not use an intermediate representation
* D. Bytecode runs directly on hardware without a runtime

### 93.

Which statement best explains the role of standard libraries in the JRE?

* A. They complement the JVM runtime environment
* B. They replace the JVM
* C. They are the same as `javac`
* D. They contain only source code

### 94.

Which statement best explains why the JDK is useful to a developer but the JVM alone is insufficient for development?

* A. Development requires tooling such as compilation, while JVM primarily handles execution
* B. JVM cannot run Java programs
* C. JDK does not contain runtime capabilities
* D. JVM is only used for documentation

### 95.

Which statement best connects the installation screenshots to the JDK/JRE/JVM conceptual diagram?

* A. Installing the JDK gives the developer the broader development environment that includes runtime capability and development tools
* B. Installing the JDK only installs source examples
* C. Installing the JDK removes the JVM
* D. Installing Java only creates `JAVA_HOME`

---

# Section Q — Command-Line & Environment Scenarios

### 96.

A user opens a new Command Prompt after configuring the JDK environment and runs:

```text
java --version
```

What is the most appropriate interpretation if version information appears?

* A. The `java` executable is being found and a Java runtime is responding
* B. The user's Java source has compiled
* C. The user's class has executed
* D. `javac` has successfully compiled a project

### 97.

Why might `java --version` succeed while `javac` still fails?

* A. The runtime executable may be discoverable while the compiler tool is not properly available through the configured environment
* B. Java intentionally prevents compiling
* C. JVM cannot execute compiled code
* D. Java SE does not include a compiler

### 98.

A user configures:

```text
JAVA_HOME = C:\Program Files\Java\jdk-25...
```

What is the role of this setting based on the visual walkthrough?

* A. Identify the JDK installation directory
* B. Identify the `.class` file
* C. Identify the current Java source file
* D. Store command-line arguments

### 99.

Why is the `bin` directory significant when configuring `PATH`?

* A. It contains the command-line executables used by the Java development/runtime tools shown
* B. It contains only documentation
* C. It stores source code
* D. It contains all Java projects

### 100.

A user sets `JAVA_HOME` correctly but forgets to expose the JDK's `bin` through the command search path. Which commands may be affected from the command line?

* A. Commands such as `java` and `javac`
* B. Only `println()`
* C. Only class names
* D. Only Java comments

---

# Section R — Final Mastery

### 101.

Which statement gives the most complete distinction among JVM, JRE and JDK?

* A. JVM runs bytecode; JRE provides the JVM plus standard libraries; JDK provides the JRE plus development tools
* B. JVM provides development tools; JRE compiles source; JDK only runs bytecode
* C. JVM, JRE and JDK are three names for the same component
* D. JDK contains only the JVM

### 102.

Which statement gives the most complete traditional execution flow?

* A. `.java` → `javac` → `.class` bytecode → JVM/JRE → `main()` → output
* B. `.java` → JVM → `javac` → `.class` → output
* C. `.java` → JRE → source output → JVM
* D. `.class` → `javac` → `.java` → output

### 103.

Which statement best explains why a Java developer generally installs the JDK rather than thinking only in terms of the JVM?

* A. The developer needs development tools in addition to the runtime
* B. The JVM cannot execute bytecode
* C. The JDK is only a larger JVM
* D. JDK is required only for Java ME

### 104.

Which statement best connects the installation, environment variables and command-line workflow?

* A. JDK is installed, its location can be represented by `JAVA_HOME`, executable tools are made discoverable through `PATH`, and commands can then be used from the terminal
* B. `PATH` contains Java source code and `JAVA_HOME` contains bytecode
* C. `JAVA_HOME` replaces the compiler
* D. Environment variables determine Java's object-oriented features

### 105.

Which sequence best represents a developer's practical workflow after a successful JDK setup?

* A. Write `.java` → compile with `javac` → obtain `.class` → run with `java`
* B. Write `.class` → compile with `java` → edit bytecode
* C. Write `.java` → run with `println()` directly
* D. Write `.java` → configure Java ME → run without a runtime

### 106.

Which statement best explains Source File Mode's relationship to the traditional workflow?

* A. It simplifies the command sequence by allowing Java to handle compilation and execution from the source-file command
* B. It removes the need for compilation internally
* C. It bypasses the runtime
* D. It converts Java into JavaScript

### 107.

Which statement best explains the purpose of WORA?

* A. The same Java program can target different platforms through compatible runtime/JVM environments
* B. Java source never changes regardless of syntax
* C. Every platform executes the `.java` source directly
* D. Java applications require one OS only

### 108.

Which combination correctly maps concept to role?

* A. `javac` → compilation, JVM → execution, `JAVA_HOME` → JDK location
* B. JVM → compilation, `javac` → JDK location, `JAVA_HOME` → output
* C. `JAVA_HOME` → execution, JDK → bytecode, `javac` → standard library
* D. JRE → source editing, JVM → environment configuration, `PATH` → class file

### 109.

Which statement best explains why the JDK installation directory shown in the PDF contains a `bin` directory?

* A. Development and runtime command-line executables are placed there, making it relevant to `PATH`
* B. `bin` contains only `.java` source
* C. `bin` stores all user projects
* D. `bin` is the Java class blueprint

### 110.

Which conceptual mistake is made by treating `JAVA_HOME` as the Java runtime itself?

* A. `JAVA_HOME` is an environment variable identifying the JDK location; it is not the runtime engine
* B. `JAVA_HOME` is the JVM
* C. `JAVA_HOME` is the JDK compiler executable
* D. `JAVA_HOME` is the `.class` file

### 111.

Which statement best explains why Java programs can be both compiled and then run?

* A. Compilation produces bytecode; runtime infrastructure executes that bytecode
* B. Compilation and execution are the exact same step
* C. The JVM generates source code
* D. `println()` compiles bytecode

### 112.

A developer successfully installs JDK 25, configures the shown environment variables, and confirms `java --version`. Which conclusion is safest from the provided material?

* A. The Java runtime command is available and the environment setup is at least sufficiently configured for that command
* B. Every Java program is already compiled
* C. Every IDE project is configured
* D. `javac` must definitely be working regardless of `PATH`

### 113.

Which statement best combines Java history and architecture?

* A. Java originated at Sun Microsystems, was first called Oak, and its platform-independent execution model relies on bytecode and JVM-based execution
* B. Java originated at Oracle and uses JavaScript for WORA
* C. Oak was an Oracle runtime environment
* D. JVM was created in 2010 by Oracle as Java itself

### 114.

Which statement best connects Java SE with the rest of the material?

* A. Java SE provides the foundation for Core Java, while the JDK supplies development tooling used to build Java programs
* B. Java SE is another name for the JVM
* C. Java SE replaces JDK
* D. Java SE is only a command-line environment

### 115.

A learner can correctly explain JDK/JRE/JVM, trace `.java → javac → .class → JVM`, configure `JAVA_HOME`/`PATH`, distinguish Java editions, explain WORA, and reason about command-line arguments. What does that indicate?

* A. Strong understanding of the Java introduction and environment material covered here
* B. Only memorization of terminology
* C. Understanding of Java operators only
* D. Understanding of Java collections only

---

# Answer Key

|  Q | Ans |  Q | Ans |  Q | Ans |  Q | Ans |   Q | Ans |
| -: | :-: | -: | :-: | -: | :-: | -: | :-: | --: | :-: |
|  1 |  B  | 24 |  A  | 47 |  A  | 70 |  A  |  93 |  A  |
|  2 |  B  | 25 |  B  | 48 |  A  | 71 |  A  |  94 |  A  |
|  3 |  B  | 26 |  A  | 49 |  A  | 72 |  A  |  95 |  A  |
|  4 |  A  | 27 |  A  | 50 |  A  | 73 |  A  |  96 |  A  |
|  5 |  B  | 28 |  C  | 51 |  A  | 74 |  A  |  97 |  A  |
|  6 |  B  | 29 |  A  | 52 |  A  | 75 |  A  |  98 |  A  |
|  7 |  D  | 30 |  B  | 53 |  B  | 76 |  A  |  99 |  A  |
|  8 |  A  | 31 |  A  | 54 |  A  | 77 |  A  | 100 |  A  |
|  9 |  A  | 32 |  A  | 55 |  A  | 78 |  A  | 101 |  A  |
| 10 |  A  | 33 |  A  | 56 |  A  | 79 |  D  | 102 |  A  |
| 11 |  B  | 34 |  D  | 57 |  A  | 80 |  A  | 103 |  A  |
| 12 |  A  | 35 |  A  | 58 |  A  | 81 |  A  | 104 |  A  |
| 13 |  A  | 36 |  A  | 59 |  A  | 82 |  A  | 105 |  A  |
| 14 |  A  | 37 |  A  | 60 |  A  | 83 |  A  | 106 |  A  |
| 15 |  A  | 38 |  A  | 61 |  A  | 84 |  A  | 107 |  A  |
| 16 |  C  | 39 |  A  | 62 |  A  | 85 |  A  | 108 |  A  |
| 17 |  B  | 40 |  A  | 63 |  A  | 86 |  A  | 109 |  A  |
| 18 |  A  | 41 |  A  | 64 |  A  | 87 |  A  | 110 |  A  |
| 19 |  A  | 42 |  B  | 65 |  A  | 88 |  A  | 111 |  A  |
| 20 |  A  | 43 |  A  | 66 |  A  | 89 |  A  | 112 |  A  |
| 21 |  C  | 44 |  B  | 67 |  A  | 90 |  A  | 113 |  A  |
| 22 |  B  | 45 |  A  | 68 |  A  | 91 |  A  | 114 |  A  |
| 23 |  C  | 46 |  B  | 69 |  A  | 92 |  A  | 115 |  A  |

---

# Coverage

This set covers the supplied material across:

* What Java is
* High-level language
* Class-based programming
* Object-oriented programming
* WORA
* Platform independence
* Robustness
* Strong type checking
* Exception handling
* Automatic memory management
* Multithreading
* Java ecosystem
* Backend
* Enterprise
* Cloud
* Android
* Desktop
* Games
* IoT
* Java SE
* Jakarta EE
* Java ME
* Core Java
* Servlets
* JSP
* Enterprise components
* Persistence
* Web services
* Embedded/resource-constrained devices
* Java history
* James Gosling
* Sun Microsystems
* Oak
* 1995 Java introduction
* Oracle acquisition of Sun
* JDK
* JRE
* JVM
* Standard libraries
* Development tools
* `java`
* `javac`
* `.java`
* `.class`
* Bytecode
* JVM execution
* WORA architecture
* JDK installation
* Oracle download choices
* Windows installation
* JDK installation directories
* `JAVA_HOME`
* `PATH`
* JDK `bin`
* Command Prompt usage
* `javac`
* `java`
* `java --version`
* Traditional compile/run flow
* Source File Mode
* Command-line arguments
* `String[] args`
* Argument indexing
* Runtime vs development tooling
* Practical environment troubleshooting

# 80% Mastery Benchmark

**Total Questions: 115**

**80% = 92 correct answers**

|    Score | Level                                                  |
| -------: | ------------------------------------------------------ |
|  104–115 | Excellent mastery                                      |
|   92–103 | Strong understanding — topic can be considered covered |
|    81–91 | Good foundation — review weak areas                    |
|    69–80 | Several conceptual gaps                                |
| Below 69 | Topic revision recommended                             |

> **Target: 92/115 or higher.**
>
> The target is not memorizing definitions. A strong score should mean you can explain the relationships between **Java, JDK, JRE, JVM, bytecode, compilation, execution, installation, environment variables, and Java editions** and can reason through the command-line workflow without referring back to the notes.
