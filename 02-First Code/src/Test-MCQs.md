# Java Program Execution & `main()` — Complete MCQ Test

> **Goal:** Test whether you actually understand how a traditional Java program is structured, compiled, launched, and executed, along with `main()`, `String[] args`, `System.out.println()`, and Source File Mode.
>
> This is **not a line-by-line recall test**. The questions focus on tracing execution, understanding why each part exists, distinguishing compile/run stages, and applying the concepts to modified examples.

The questions below are based on the two uploaded documents.

---

# Section A — Java Program Execution Flow

### 1.

Which sequence best represents the traditional execution flow described in the document?

* A. `.java` → JVM → `javac` → `.class` → output
* B. `.java` → `javac` → `.class` → JVM → `main()` → output
* C. `.java` → `main()` → `.class` → JVM → output
* D. `.class` → `.java` → JVM → `main()` → output

---

### 2.

What is the primary role of `javac` in the documented traditional flow?

* A. It launches the JVM
* B. It compiles the Java source file into bytecode
* C. It executes `main()`
* D. It prints program output

---

### 3.

After compilation in the documented flow, where is the `.class` file stored in the IDE setup described?

* A. `src`
* B. `main`
* C. `out/bin`
* D. `java.lang`

---

### 4.

Why does the JVM load the `.class` file rather than directly executing the original `.java` source in traditional mode?

* A. The `.class` file contains the compiled bytecode produced from the source
* B. `.java` files contain only comments
* C. The JVM can only read text files
* D. `javac` deletes the source file

---

### 5.

After the JVM loads the class, what does the Java Launcher look for in the traditional standalone application described?

* A. `println()`
* B. `main()`
* C. `class()`
* D. `start()`

---

### 6.

Why is `main()` important in the traditional standalone application described?

* A. It is the standard entry point recognized by the Java launcher
* B. It is the only method allowed inside a class
* C. It creates the `.class` file
* D. It replaces the JVM

---

### 7.

Which event occurs immediately before `main()` begins execution in the documented flow?

* A. Output
* B. Java source compilation
* C. Java Launcher finds `main()`
* D. Program termination

---

### 8.

Which event occurs after `main()` executes?

* A. Output can be produced, followed by the end of the program
* B. `javac` compiles the program again
* C. A new `.java` file is created
* D. The JVM searches for another `main()`

---

# Section B — Class & Source File

### 9.

What is the best conceptual description of a class according to the document?

* A. A blueprint defining the structure and behavior of objects
* B. A compiled bytecode file
* C. A JVM command
* D. A console output stream

---

### 10.

Why does Java organize program code using classes?

* A. Classes provide a structure in which variables, methods, constructors, and other members can be defined
* B. Classes are required only for printing
* C. Classes are used only to store primitive data
* D. Classes replace methods

---

### 11.

Which statement best explains the purpose of a class in the example?

* A. It provides the surrounding structure containing `main()`
* B. It directly performs compilation
* C. It launches the JVM
* D. It stores command-line arguments automatically

---

### 12.

The document states that a public class affects the source filename. What is the rule presented?

* A. The source file should use the same name as the public class
* B. The source file must always be named `main.java`
* C. The source file must always be named `A.java`
* D. Any filename is equally valid for a public class

---

### 13.

The document contains:

```java
public class A_HelloWorld
```

According to the stated naming rule for a public class, what should the source file be named?

* A. `main.java`
* B. `HelloWorld.java`
* C. `A_HelloWorld.java`
* D. `A.java`

---

### 14.

Why is the public-class/source-file relationship important before compilation?

* A. The source file naming rule must match the public class name as described
* B. It determines the return type of `main()`
* C. It determines the number of command-line arguments
* D. It controls whether `println()` works

---

# Section C — Understanding `main()`

### 15.

Which of the following represents the traditional `main()` declaration discussed in the document?

* A. `public static void main(String[] args)`
* B. `private static int main(String args)`
* C. `public void main(int[] args)`
* D. `static String main()`

---

### 16.

Why is `main()` declared `public` according to the document?

* A. The JVM needs to access it from outside the class when starting the application
* B. `public` makes the method return `void`
* C. `public` creates the JVM
* D. `public` allows command-line arguments

---

### 17.

Why is `main()` declared `static` according to the supplied explanation?

* A. The JVM can invoke it through the class without first creating an object
* B. `static` makes the method return a value
* C. `static` converts `args` into Strings
* D. `static` makes the class public

---

### 18.

Why is `main()` declared `void`?

* A. The method does not need to return a value to the JVM
* B. The method cannot contain statements
* C. `void` makes it accessible to the JVM
* D. `void` creates the class

---

### 19.

Why is the method specifically named `main()`?

* A. The Java launcher recognizes `main` as the traditional entry point
* B. Java requires every method to be called `main`
* C. `main` is a keyword
* D. `main` means the method returns an integer

---

### 20.

Which change would violate the traditional entry-point rule described in the notes?

```java
public static void start(String[] args)
```

instead of:

```java
public static void main(String[] args)
```

* A. Changing `main` to `start`
* B. Changing `public` to uppercase
* C. Keeping `static`
* D. Keeping `void`

---

### 21.

Which statement best combines the reasons for `public static void main(...)`?

* A. `public` allows JVM access, `static` allows invocation without object creation, and `void` means no return value is required
* B. `public` creates an object, `static` compiles code, and `void` launches the JVM
* C. `public` stores arguments, `static` prints output, and `void` creates bytecode
* D. All three keywords perform the same role

---

### 22.

What is the role of `main()` in relation to the JVM and Java Launcher?

* A. It is the recognized starting point where program execution begins
* B. It is used only after the program ends
* C. It is called by `println()`
* D. It generates the `.class` file

---

# Section D — `String[] args`

### 23.

What is `String[] args` in the traditional `main()` declaration?

* A. An array of String values used to receive command-line arguments
* B. A String containing the entire program output
* C. A return value from `main()`
* D. A JVM object

---

### 24.

Which part is the parameter name in:

```java
public static void main(String[] args)
```

?

* A. `public`
* B. `main`
* C. `String[]`
* D. `args`

---

### 25.

Which part determines that `args` is an array of Strings?

* A. `main`
* B. `String[]`
* C. `public`
* D. `static`

---

### 26.

Can the identifier `args` be changed?

* A. No, `args` is a Java keyword
* B. Yes, because it is only the parameter name
* C. No, the JVM requires exactly the text `args`
* D. Yes, but only to an integer

---

### 27.

Suppose the declaration is changed to:

```java
public static void main(String[] values)
```

According to the document's explanation, what remains important?

* A. The parameter type `String[]` remains the important part; the parameter name can change
* B. `values` must be replaced by `args`
* C. `String[]` can be removed
* D. `main()` stops being the entry point

---

### 28.

Why can command-line arguments be accessed through indexes such as `args[0]`?

* A. `args` is an array
* B. `args` is a primitive String
* C. `args` is the class name
* D. `args` is a method

---

### 29.

Given:

```text
java A_HelloWorld Hello Java
```

what does the document say about the arguments?

* A. `args[0] = "Hello"` and `args[1] = "Java"`
* B. `args[0] = "Java"` and `args[1] = "Hello"`
* C. `args[0] = "Hello Java"`
* D. `args[1] = "Hello Java"`

---

### 30.

Given:

```text
java A_HelloWorld Java Backend
```

what is stored in `args[1]`?

* A. `"java"`
* B. `"A_HelloWorld"`
* C. `"Java"`
* D. `"Backend"`

---

### 31.

Which statement best explains why `args[0]` contains `"Java"` in:

```text
java A_HelloWorld Java Backend
```

?

* A. It is the first argument supplied after the class/source target in the command
* B. It is always the name of the Java class
* C. `args[0]` always contains `"Java"`
* D. The JVM converts every argument into `"Java"`

---

### 32.

What type does each element of `args` have?

* A. `int`
* B. `char`
* C. `String`
* D. `boolean`

---

### 33.

If the command is:

```text
java A_HelloWorld One Two Three
```

how many command-line argument elements are shown?

* A. 2
* B. 3
* C. 4
* D. 5

---

### 34.

Which statement is most accurate?

* A. `String[] args` receives command-line values; `args` itself is simply the chosen parameter name
* B. `args` is a keyword
* C. `String[]` is a method
* D. Command-line arguments are stored inside `System.out`

---

# Section E — `System.out.println()`

### 35.

What is the overall purpose of:

```java
System.out.println(...)
```

?

* A. Display output on the console
* B. Compile the source file
* C. Launch the JVM
* D. Read command-line arguments

---

### 36.

Which statement best describes `System` according to the document?

* A. A predefined class from `java.lang`
* B. A method inside `main`
* C. A user-defined variable
* D. A compiler command

---

### 37.

What is `out` in:

```java
System.out.println()
```

according to the document?

* A. A standard output stream provided by `System`
* B. A command-line argument
* C. The method return type
* D. The source file

---

### 38.

More precisely, what does `System.out` refer to according to the notes?

* A. A `PrintStream` object
* B. A `String[]`
* C. A JVM instance
* D. A class declaration

---

### 39.

What is `println()`?

* A. A method of `PrintStream`
* B. A field of `System`
* C. A Java keyword
* D. A compiler command

---

### 40.

What two visible effects does `println()` perform?

* A. Prints the supplied value and moves the cursor to the next line
* B. Compiles the value and launches the JVM
* C. Reads input and stores it in `args`
* D. Creates a class and method

---

### 41.

Why is `println()` useful beyond simply displaying final output?

* A. It can display information, debugging messages, and program results
* B. It creates bytecode
* C. It controls class loading
* D. It changes command-line arguments

---

# Section F — Program Execution Tracing

### 42.

What is the first major artifact in the traditional flow?

* A. `.class`
* B. `.java`
* C. JVM
* D. Output

---

### 43.

What does compilation transform in the documented flow?

* A. Java source into a `.class` bytecode file
* B. `.class` into `.java`
* C. JVM into source
* D. Output into bytecode

---

### 44.

Which component actually loads the generated class file in the described execution flow?

* A. `javac`
* B. JVM
* C. `println()`
* D. `args`

---

### 45.

Which component finds the traditional application entry point?

* A. Java Launcher
* B. `System`
* C. `PrintStream`
* D. `javac`

---

### 46.

Which sequence is correct?

* A. Compile → class loading → find `main()` → execute `main()` → output
* B. Output → compile → main → class loading
* C. Find `main()` → compile → output → JVM
* D. JVM → output → compile → `main()`

---

### 47.

Which statement best differentiates `javac` from the JVM?

* A. `javac` compiles source; the JVM loads and runs the compiled program
* B. Both only compile source
* C. JVM compiles source while `javac` only prints output
* D. `javac` receives command-line arguments while JVM does not execute

---

### 48.

If compilation fails, which stage of the documented traditional flow has not successfully been completed?

* A. Creation of the executable bytecode `.class` artifact
* B. `println()` execution
* C. `args` indexing
* D. Console cursor movement

---

### 49.

If the `.class` file is successfully created but `main()` is not found, which stage becomes the problem according to the flow?

* A. Java Launcher entry-point discovery
* B. Source compilation
* C. Variable initialization
* D. `println()` formatting

---

### 50.

What stage directly precedes output in the documented flow?

* A. `main()` execution
* B. Source compilation
* C. File creation
* D. Java source editing

---

# Section G — Source File Mode

### 51.

What is the primary purpose of Source File Mode according to the document?

* A. Reduce the manual complexity and time involved in separately compiling and running the source
* B. Replace the JVM
* C. Eliminate the Java language
* D. Prevent the creation of source files

---

### 52.

What is the main difference between traditional mode and Source File Mode presented in the notes?

* A. Traditional mode explicitly compiles and then runs; Source File Mode allows Java to compile and run the source through one command
* B. Traditional mode does not use the JVM
* C. Source File Mode does not execute `main()`
* D. Traditional mode does not produce bytecode

---

### 53.

Which command represents the documented traditional compilation step?

* A. `java B_Evolution.java`
* B. `javac B_Evolution.java`
* C. `javac HelloWorld.class`
* D. `run B_Evolution.java`

---

### 54.

Which command represents the documented traditional run step?

* A. `java HelloWorld`
* B. `javac HelloWorld`
* C. `java HelloWorld.java`
* D. `run HelloWorld.class`

---

### 55.

Which command represents the documented Source File Mode?

* A. `javac HelloWorld01.java`
* B. `java HelloWorld01.java`
* C. `java HelloWorld01.class`
* D. `run HelloWorld01.java`

---

### 56.

What is the key convenience provided by:

```text
java HelloWorld01.java
```

according to the notes?

* A. Java automatically handles compilation and execution through one command
* B. The `.java` file is converted into a text file
* C. The JVM is skipped
* D. `main()` is no longer needed

---

### 57.

Which flow matches Source File Mode?

* A. `.java` → automatic compilation → JVM → `main()` → output
* B. `.java` → manual `.class` creation → JVM → output
* C. `.class` → automatic compilation → source → output
* D. `.java` → `println()` → `javac` → JVM

---

### 58.

Which statement is explicitly associated with Source File Mode?

* A. No need to manually create or run the `.class` file
* B. No need for a `.java` file
* C. No need for `main()`
* D. No need for the JVM

---

# Section H — Comparing Traditional Mode & Source File Mode

### 59.

Which task belongs specifically to the traditional workflow?

* A. Manually performing the compile and run steps as separate commands
* B. Using one command to compile and run the source
* C. Avoiding bytecode completely
* D. Removing `main()`

---

### 60.

Which task is simplified in Source File Mode?

* A. The manual separation of compilation and execution
* B. Class definition
* C. Variable declaration
* D. `println()` behavior

---

### 61.

Which statement is the best conceptual summary?

* A. Source File Mode reduces command-level boilerplate, but the program still follows Java's execution mechanism
* B. Source File Mode turns Java into an interpreted-only language
* C. Source File Mode eliminates `main()`
* D. Source File Mode replaces the JVM with `javac`

---

### 62.

Why does the Source File Mode example still refer to `main()` in its flow?

* A. `main()` remains the execution entry point described in the document
* B. Source File Mode changes `main()` into a class
* C. `main()` is only required in traditional compilation
* D. The JVM does not execute Source File Mode

---

# Section I — Integrated `main()` Reasoning

### 63.

Suppose the method is changed to:

```java
public static void main(String[] values)
```

What happens conceptually?

* A. The traditional entry-point structure is still represented because only the parameter name changed
* B. The method stops being `main()`
* C. `String[]` must become `args`
* D. The JVM can no longer call it

---

### 64.

Suppose this is changed:

```java
public static void main(int[] args)
```

What key element has been changed from the documented signature?

* A. The parameter type is no longer `String[]`
* B. `main` is no longer the method name
* C. `static` has been removed
* D. `void` has been removed

---

### 65.

Suppose:

```java
public static String main(String[] args)
```

What part differs from the documented traditional declaration?

* A. Return type
* B. Parameter name
* C. Class name
* D. `System.out`

---

### 66.

Suppose:

```java
private static void main(String[] args)
```

What documented requirement has been changed?

* A. The access modifier is no longer `public`
* B. The return type is wrong
* C. The parameter type is wrong
* D. The method name is wrong

---

### 67.

Suppose:

```java
public void main(String[] args)
```

Which documented property has been removed?

* A. `static`
* B. `public`
* C. `void`
* D. `String[]`

---

### 68.

Why does the document emphasize that `main()` is static?

* A. The JVM needs to start execution without first creating an object of the class
* B. Static methods automatically return values
* C. Static methods can only print output
* D. Static is required for arrays

---

### 69.

Why does the document emphasize that `main()` is public?

* A. The JVM needs access from outside the class
* B. Public methods are always static
* C. Public creates bytecode
* D. Public stores command-line arguments

---

### 70.

Why does the document emphasize `void`?

* A. The JVM does not require a return value from `main()`
* B. `void` makes `main()` accessible
* C. `void` stores arguments
* D. `void` creates output

---

# Section J — Command-Line Argument Tracing

### 71.

Given:

```text
java A_HelloWorld Java Backend
```

and:

```java
System.out.println(args[0]);
System.out.println(args[1]);
```

what is printed?

* A. `Backend` then `Java`
* B. `Java` then `Backend`
* C. `A_HelloWorld` then `Java`
* D. `Java Backend` on one line

---

### 72.

Given:

```text
java A_HelloWorld Hello Java
```

which statement is correct?

* A. `args[0]` is `"Hello"` and `args[1]` is `"Java"`
* B. `args[0]` is `"A_HelloWorld"`
* C. `args[1]` is `"Hello"`
* D. Both arguments are stored in `args[0]`

---

### 73.

Which code correctly prints the two values represented by the documented command:

```text
java A_HelloWorld Java Backend
```

?

* A.

```java
System.out.println(args[0]);
System.out.println(args[1]);
```

* B.

```java
System.out.println(args);
```

* C.

```java
System.out.println(main[0]);
System.out.println(main[1]);
```

* D.

```java
System.out.println(String[0]);
System.out.println(String[1]);
```

---

### 74.

What is the conceptual reason command-line values can be handled inside `main()`?

* A. They are passed into the `String[]` parameter
* B. They are automatically stored in `System.out`
* C. `javac` converts them into class fields
* D. The JVM stores them inside `println()`

---

### 75.

Which statement best describes the relationship among the command, `args`, and `println()`?

* A. Command-line values enter through `args`, and the program can then access and print them
* B. `println()` creates the arguments
* C. `args` compiles the program
* D. Command-line values bypass `main()`

---

# Section K — Program Structure & Output

### 76.

Consider:

```java
public class A_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

What is the execution relationship?

* A. Java Launcher finds `main()`, `main()` executes `println()`, and the message appears on the console
* B. `println()` launches `main()`
* C. `System` launches the JVM
* D. `args` invokes `println()`

---

### 77.

If the `System.out.println()` line is removed but `main()` remains, what changes?

* A. The program can still enter `main()`, but that statement no longer produces the shown console output
* B. The JVM cannot find `main()`
* C. The class cannot compile because `println()` is mandatory
* D. `main()` becomes a constructor

---

### 78.

If `main()` is present but contains no statements, which concept from the execution flow remains?

* A. The Java Launcher can still locate the entry point, but there is no shown application statement producing output
* B. `javac` cannot create `.class`
* C. `System.out` automatically prints
* D. `args` prints itself

---

### 79.

Which component is responsible for actually displaying the supplied text in the example?

* A. `System.out.println()`
* B. Java Launcher
* C. `javac`
* D. JVM class loader

---

### 80.

Which of the following best explains the complete chain for the Hello World example?

* A. Source is compiled, class is loaded, `main()` is found and executed, then `println()` produces output
* B. `println()` compiles source, then JVM creates `main()`
* C. `main()` creates the source file
* D. `System` creates the class file

---

# Section L — Higher-Level Reasoning

### 81.

Why would changing only the parameter name from `args` to `values` not change the conceptual role of the parameter?

* A. The identifier is arbitrary; the documented `String[]` type represents the command-line argument array
* B. The JVM only cares about the letters `args`
* C. `values` becomes a keyword
* D. The parameter stops being an array

---

### 82.

Which change would preserve the purpose of the parameter according to the notes?

* A. `String[] values`
* B. `int[] values`
* C. `String values`
* D. `boolean[] values`

---

### 83.

Why is the JVM able to invoke `main()` without constructing an object in the documented design?

* A. `main()` is static
* B. `main()` is void
* C. `main()` is public
* D. `main()` uses `String[]`

---

### 84.

Which of these properties serves a different purpose from the others in the traditional `main()` signature?

* A. `String[] args`
* B. `public`
* C. `static`
* D. `void`

---

### 85.

Why is `String[] args` not the method name?

* A. `main` is the method name; `String[] args` describes the parameter
* B. `args` is always the method name
* C. `String[]` is the method name
* D. `void` is the method name

---

### 86.

Which statement best explains why the source file can be compiled into bytecode before execution?

* A. Java separates source-code compilation from JVM execution in the traditional flow
* B. The JVM cannot execute programs
* C. Bytecode is the original source
* D. `javac` runs only after program output

---

### 87.

Which component is most directly associated with the `.class` file in the documented flow?

* A. JVM
* B. `println()`
* C. `args`
* D. `System.out`

---

### 88.

Which component is most directly associated with producing `.class` from `.java`?

* A. `javac`
* B. Java Launcher
* C. `System`
* D. `PrintStream`

---

# Section M — Source File Mode & Execution Reasoning

### 89.

Why does Source File Mode reduce manual work?

* A. The user does not have to separately issue compile and run commands
* B. The source file is deleted after editing
* C. The JVM is removed
* D. `main()` is no longer needed

---

### 90.

Which command is specifically shown for Source File Mode?

* A. `java HelloWorld01.java`
* B. `javac HelloWorld01.java`
* C. `java HelloWorld01.class`
* D. `run HelloWorld01.java`

---

### 91.

Which command pair represents the traditional mode shown?

* A. `javac B_Evolution.java` followed by `java HelloWorld`
* B. `java B_Evolution.java` followed by `javac HelloWorld`
* C. `java HelloWorld.java` followed by `java HelloWorld`
* D. `javac HelloWorld.class` followed by `java HelloWorld.java`

---

### 92.

What is eliminated from the user's manual workflow by Source File Mode?

* A. The separate manual compile/run sequence
* B. The source code
* C. The JVM
* D. The `main()` method

---

### 93.

Which statement best captures the evolution described in the second document?

* A. Source File Mode reduces complexity and time by allowing source compilation and execution through a single command
* B. Java abandoned bytecode
* C. Java removed classes
* D. Java replaced the JVM with the compiler

---

# Section N — Integrated Scenarios

### 94.

Suppose the source contains:

```java
public class Demo {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}
```

and it is started with:

```text
java Demo Hello
```

What is printed?

* A. `Demo`
* B. `Hello`
* C. `args`
* D. Nothing

---

### 95.

Using the same program, what determines that `"Hello"` can be accessed as `args[0]`?

* A. `String[]` makes `args` an array of command-line String values
* B. `main` automatically stores every value as an integer
* C. `println()` creates the array
* D. `Demo` becomes an array

---

### 96.

Suppose:

```java
public static void main(String[] values) {
    System.out.println(values[0]);
}
```

and the command supplies `Hello`.

What changes compared with using `args`?

* A. Only the parameter name changes; the array role remains
* B. The first argument is no longer accessible
* C. The JVM requires `args`
* D. `String[]` becomes a String

---

### 97.

Suppose the source file contains:

```java
public class Demo {
    public static void main(String[] values) {
        System.out.println("Start");
    }
}
```

What role does `values` play even though the program never uses it?

* A. It is still the parameter representing the command-line argument array
* B. It becomes the return value
* C. It becomes the class name
* D. It controls `println()`

---

### 98.

Which change would affect whether the JVM can use the traditional entry point described in the document?

* A. Removing or renaming `main`
* B. Changing `"Hello"` to `"Hi"`
* C. Changing `println()` text
* D. Changing the local parameter name `args`

---

### 99.

Which change would not alter the parameter's conceptual role?

* A. Rename `args` to `values`
* B. Change `String[]` to `int[]`
* C. Remove the array brackets
* D. Change the parameter type to boolean

---

### 100.

Suppose:

```java
public static void main(String[] args) {
    System.out.println(args[0]);
    System.out.println(args[1]);
}
```

is invoked with:

```text
java Demo Java Backend
```

What is printed?

* A.

```text
Java
Backend
```

* B.

```text
Demo
Java
```

* C.

```text
Backend
Java
```

* D.

```text
Java Backend
```

---

# Section O — Final Mastery Questions

### 101.

Which statement best summarizes the role of the class in the Java example?

* A. It provides the structure containing the program's members, including `main()`
* B. It is the JVM itself
* C. It is the `.class` bytecode
* D. It is the console

---

### 102.

Which statement best summarizes the role of `main()`?

* A. It is the standard entry point recognized by the Java Launcher for the traditional standalone application
* B. It compiles the source
* C. It stores all class variables
* D. It creates the JVM

---

### 103.

Which statement best summarizes `System.out.println()`?

* A. It uses the `System` class's standard output stream to print a value and move to the next line
* B. It compiles source code
* C. It loads `.class` files
* D. It receives command-line arguments

---

### 104.

Which statement best summarizes `String[] args`?

* A. It is an array parameter used to receive command-line arguments
* B. It is the method's return value
* C. It is a class name
* D. It is the JVM entry point

---

### 105.

Which statement best summarizes the traditional Java execution process?

* A. Source is compiled into bytecode, the JVM loads the class, the Java Launcher locates `main()`, and execution begins there
* B. JVM compiles source and `println()` finds `main()`
* C. Java Launcher creates the source file
* D. `main()` creates the `.class` file

---

### 106.

Which statement best summarizes Source File Mode?

* A. It allows Java to compile and run the source through one command, reducing manual steps
* B. It removes compilation entirely
* C. It eliminates bytecode and the JVM
* D. It replaces `main()` with `println()`

---

### 107.

Why are `public`, `static`, `void`, `main`, and `String[] args` all meaningful in the traditional entry-point declaration?

* A. Each contributes to access, invocation, return behavior, entry-point recognition, or argument receiving
* B. They are five different names for the same concept
* C. They are all required for `println()` only
* D. They are all data types

---

### 108.

Which change would affect the **method parameter name** but not the conceptual type of command-line arguments?

* A. `args` → `values`
* B. `String[]` → `int[]`
* C. `String[]` → `String`
* D. `String[]` → `boolean[]`

---

### 109.

Which change affects how the Java Launcher recognizes the traditional entry point?

* A. `main` → `start`
* B. `"Hello"` → `"Hi"`
* C. `args` → `values`
* D. `System.out` → another local variable name

---

### 110.

Which change affects the access level of the traditional entry point?

* A. `public` → `private`
* B. `args` → `values`
* C. `"Hello"` → `"Hi"`
* D. `println()` → another print statement

---

### 111.

Which change affects whether the method belongs to the class rather than requiring an object according to the supplied explanation?

* A. Removing `static`
* B. Changing `args`
* C. Changing `println()`
* D. Changing the String literal

---

### 112.

Which change affects whether the method returns a value?

* A. Changing `void` to another return type
* B. Renaming `args`
* C. Changing the class name
* D. Changing `"Hello World!"`

---

### 113.

Which statement best explains why the traditional application requires a recognizable entry point?

* A. The Java Launcher needs a known method from which execution can begin
* B. `println()` needs it
* C. `javac` cannot compile classes without it
* D. `System` creates it automatically

---

### 114.

Which statement best explains why `args[0]` and `args[1]` are different values?

* A. Arrays use indexed positions to access their individual elements
* B. `args` is a String
* C. Java randomly assigns arguments
* D. Each index represents a different class

---

### 115.

If a command contains two arguments after the program target, what is the conceptual minimum structure inside `main()` needed to access them individually?

* A. A `String[]` parameter and array indexing
* B. Two separate methods
* C. Two `println()` statements only
* D. Two classes

---

### 116.

Which statement best explains why `println()` can display the value from `args[0]`?

* A. `args[0]` evaluates to a String value that can be supplied to the output method
* B. `println()` automatically compiles arrays
* C. `args[0]` is the JVM
* D. `println()` changes the parameter type

---

### 117.

Which statement best connects the source file, bytecode, JVM, and `main()`?

* A. Source is compiled into bytecode; the JVM loads the bytecode; the Java Launcher finds `main()`; execution starts there
* B. JVM converts bytecode back to source before `main()`
* C. `main()` creates bytecode after execution begins
* D. `println()` loads the class

---

### 118.

Which workflow requires the explicit `.class` execution step described in the notes?

* A. Traditional mode
* B. Source File Mode
* C. Neither
* D. Both in exactly the same manual form

---

### 119.

Which workflow is intended to reduce the number of commands needed by the programmer?

* A. Source File Mode
* B. Traditional mode
* C. Neither
* D. Both equally

---

### 120.

A learner says:

> "`java HelloWorld01.java` means the JVM is directly treating source text exactly like a `.class` file."

Which answer best matches the supplied document?

* A. The document describes Java automatically compiling and then running the source through the Source File Mode flow
* B. The source file becomes the JVM
* C. The JVM skips execution
* D. The source is never compiled

---

# Answer Key

|  Q | Ans |  Q | Ans |  Q | Ans |   Q | Ans |
| -: | :-: | -: | :-: | -: | :-: | --: | :-: |
|  1 |  B  | 31 |  A  | 61 |  A  |  91 |  A  |
|  2 |  B  | 32 |  C  | 62 |  A  |  92 |  A  |
|  3 |  C  | 33 |  B  | 63 |  A  |  93 |  A  |
|  4 |  A  | 34 |  A  | 64 |  A  |  94 |  B  |
|  5 |  B  | 35 |  A  | 65 |  A  |  95 |  A  |
|  6 |  A  | 36 |  A  | 66 |  A  |  96 |  A  |
|  7 |  C  | 37 |  A  | 67 |  A  |  97 |  A  |
|  8 |  A  | 38 |  A  | 68 |  A  |  98 |  A  |
|  9 |  A  | 39 |  A  | 69 |  A  |  99 |  A  |
| 10 |  A  | 40 |  A  | 70 |  A  | 100 |  A  |
| 11 |  A  | 41 |  A  | 71 |  B  | 101 |  A  |
| 12 |  A  | 42 |  B  | 72 |  A  | 102 |  A  |
| 13 |  C  | 43 |  A  | 73 |  A  | 103 |  A  |
| 14 |  A  | 44 |  B  | 74 |  A  | 104 |  A  |
| 15 |  A  | 45 |  A  | 75 |  A  | 105 |  A  |
| 16 |  B  | 46 |  A  | 76 |  A  | 106 |  A  |
| 17 |  A  | 47 |  A  | 77 |  A  | 107 |  A  |
| 18 |  A  | 48 |  A  | 78 |  A  | 108 |  A  |
| 19 |  A  | 49 |  A  | 79 |  A  | 109 |  A  |
| 20 |  A  | 50 |  A  | 80 |  A  | 110 |  A  |
| 21 |  A  | 51 |  A  | 81 |  A  | 111 |  A  |
| 22 |  A  | 52 |  A  | 82 |  A  | 112 |  A  |
| 23 |  A  | 53 |  B  | 83 |  A  | 113 |  A  |
| 24 |  D  | 54 |  A  | 84 |  A  | 114 |  A  |
| 25 |  B  | 55 |  B  | 85 |  A  | 115 |  A  |
| 26 |  B  | 56 |  A  | 86 |  A  | 116 |  A  |
| 27 |  A  | 57 |  A  | 87 |  A  | 117 |  A  |
| 28 |  A  | 58 |  A  | 88 |  A  | 118 |  A  |
| 29 |  A  | 59 |  A  | 89 |  A  | 119 |  A  |
| 30 |  D  | 60 |  A  | 90 |  A  | 120 |  A  |

---

# Coverage

This test covers the material from both uploaded documents:

* `.java` source file
* Compilation with `javac`
* `.class` bytecode
* `out/bin` location mentioned in the IDE flow
* JVM class loading
* Java Launcher
* `main()` discovery and execution
* Program output
* Class as blueprint/structure
* Why Java uses classes
* Public class and source filename relationship
* `public`
* `static`
* `void`
* `main`
* `String[] args`
* Why `main()` is public
* Why `main()` is static
* Why `main()` is void
* Why `main` is the traditional entry-point name
* `args` as a parameter name
* Changing `args` to another parameter name
* Importance of `String[]`
* Command-line arguments
* `args[0]`, `args[1]`
* `System`
* `java.lang`
* `System.out`
* `PrintStream`
* `println()`
* Console output
* Traditional compile/run workflow
* Source File Mode
* `javac B_Evolution.java`
* `java HelloWorld`
* `java HelloWorld01.java`
* Automatic compilation and execution
* Traditional mode vs Source File Mode
* Integrated execution tracing
* Modified `main()` signatures
* Command-line argument tracing

# 80% Mastery Benchmark

**Total Questions: 120**

**80% = 96 correct answers**

|    Score | Level                                                  |
| -------: | ------------------------------------------------------ |
|  110–120 | Excellent mastery                                      |
|   96–109 | Strong understanding — topic can be considered covered |
|    84–95 | Good foundation — review weak areas                    |
|    72–83 | Several conceptual gaps                                |
| Below 72 | Topic revision recommended                             |

> **Target: 96/120 or higher.**
>
> A learner scoring at least **80% without referring to the documentation** should have a strong understanding of the material covered in these two documents.
