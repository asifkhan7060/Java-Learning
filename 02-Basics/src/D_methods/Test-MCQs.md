I went through the **entire Methods document line by line**, including the conceptual notes, syntax, all examples, parameter/argument distinction, return type, reusability, advantages, terminology, and the implementation comments about `private` and `static`.

# Java Methods — Complete MCQ Test

> **Goal:** If you can answer around **80% of these questions correctly without referring back to the notes**, you should have a strong understanding of the Methods topic covered in this document.

## Instructions

Choose the **single best answer** for each question.

The questions focus on **understanding, code tracing, application, terminology, parameter vs argument, method calling, return values, and method design**, rather than simply finding sentences in the notes.

---

# Section A — Understanding Methods

### 1.

What is the primary purpose of a method in Java?

* A. To store multiple variables
* B. To perform a specific task in a reusable block of code
* C. To automatically create objects
* D. To replace all control-flow statements

---

### 2.

Why are methods useful when the same code needs to be used multiple times?

* A. They allow the code to be written once and called whenever needed
* B. They automatically convert the code into a loop
* C. They prevent the method from executing
* D. They remove all variables from the program

---

### 3.

Suppose the same two `println()` statements appear in ten different places. What problem does this create according to the document?

* A. The code becomes difficult to maintain because the same logic is duplicated
* B. Java cannot compile the program
* C. The output automatically becomes incorrect
* D. The variables become constants

---

### 4.

How do methods solve the code-duplication problem described in the notes?

* A. By keeping the code in one place and reusing it through method calls
* B. By copying the code into every caller
* C. By converting all statements into comments
* D. By executing the code only once

---

### 5.

Which statement best represents the relationship between a method and its caller?

* A. The caller invokes the method when its functionality is needed
* B. The method always runs automatically
* C. The caller becomes part of the method
* D. A method cannot be called more than once

---

### 6.

Which statement best describes method reusability?

* A. A method can be called multiple times without rewriting its internal code
* B. A method can execute only once
* C. A method must be rewritten after every call
* D. A method cannot receive different values

---

### 7.

The document describes methods as blocks of code that perform specific tasks. Why is dividing a program into such blocks useful?

* A. It supports modular programming and makes code easier to manage
* B. It forces every task to execute at the same time
* C. It eliminates the need for method calls
* D. It makes all methods return values

---

# Section B — Method Creation Syntax

### 8.

Which option matches the general method-creation structure shown in the document?

* A. `accessModifier static returnType methodName() { }`
* B. `methodName accessModifier static() returnType`
* C. `returnType accessModifier methodName static()`
* D. `static methodName accessModifier() returnType`

---

### 9.

Consider:

```java
private static void sayHello() {
    System.out.println("Hello");
}
```

Which part identifies what the method returns?

* A. `private`
* B. `static`
* C. `void`
* D. `sayHello`

---

### 10.

In the method below:

```java
private static void sayHello() {
    System.out.println("Hello");
}
```

what does `sayHello` represent?

* A. Return type
* B. Method name
* C. Access modifier
* D. Parameter

---

### 11.

What does `void` indicate in the method examples?

* A. The method returns no value
* B. The method must return an integer
* C. The method cannot execute
* D. The method accepts no statements

---

### 12.

Which method matches the documented syntax for a method that performs an action but returns nothing?

* A.

  ```java
  private static void sayHello() {
      System.out.println("Hello");
  }
  ```

* B.

  ```java
  private static int sayHello() {
      System.out.println("Hello");
  }
  ```

* C.

  ```java
  void private sayHello {
      System.out.println("Hello");
  }
  ```

* D.

  ```java
  private sayHello static void() {
      System.out.println("Hello");
  }
  ```

---

### 13.

What is the purpose of the method body?

* A. It contains the statements that execute when the method is called
* B. It stores the method's name
* C. It identifies the access modifier
* D. It determines whether the method is static

---

# Section C — Method Calling

### 14.

Which syntax is used to call a method that has no parameters?

* A. `methodName();`
* B. `call methodName;`
* C. `methodName{}`
* D. `execute(methodName)`

---

### 15.

What happens when this statement executes?

```java
sayHello();
```

* A. The method named `sayHello` is invoked and its body executes
* B. A new method is created
* C. The method is deleted
* D. Only the method name is printed

---

### 16.

Which sequence best represents how methods work according to the document?

* A. Define → call → control enters body → statements execute → control returns
* B. Call → define → return → execute
* C. Execute → define → call → return
* D. Define → return → call → execute

---

### 17.

What happens after the statements inside a called method finish executing?

* A. Control returns to the caller
* B. The method is automatically called again
* C. The entire program must terminate
* D. The method changes into a variable

---

### 18.

Suppose `sayHello()` contains two `println()` statements. What happens when `sayHello();` is called?

* A. Both statements inside the method execute
* B. Only the method name is printed
* C. Only the first statement executes
* D. The method body is ignored

---

### 19.

If the same method is called three times:

```java
sayHello();
sayHello();
sayHello();
```

what is the main concept being demonstrated?

* A. Method reusability
* B. Method overloading
* C. Variable reassignment
* D. Nested conditions

---

### 20.

If `sayHello()` prints two lines and is called three times, how many times is the method body executed?

* A. Once
* B. Twice
* C. Three times
* D. Six times

---

# Section D — Simple Method Example

### 21.

Consider:

```java
private static void sayHello() {
    System.out.println("Hello");
    System.out.println("Welcome to Skywards");
}
```

What is printed when `sayHello();` is called?

* A. `Hello`
* B. `Welcome to Skywards`
* C. Both lines in the order written
* D. Nothing

---

### 22.

What does the simple `sayHello()` method demonstrate?

* A. A method with no parameters and no return value
* B. A method with two parameters
* C. A method returning an integer
* D. A method returning a String

---

### 23.

Why can the simple `sayHello()` method be reused?

* A. Its code is defined once and can be invoked repeatedly
* B. Its body is automatically copied into `main()`
* C. It has no statements
* D. It can never be called again

---

# Section E — Method Parameters

### 24.

What is a parameter according to the document?

* A. A variable in the method declaration that receives a value when the method is called
* B. The returned result of a method
* C. The method's access modifier
* D. A comment inside the method

---

### 25.

Consider:

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
}
```

Which part is the parameter?

* A. `private`
* B. `String`
* C. `name`
* D. `sayHello`

---

### 26.

In the same declaration, what does `String` represent?

* A. Method name
* B. Parameter data type
* C. Argument
* D. Return value

---

### 27.

What is the purpose of adding a parameter to a method?

* A. To allow the caller to provide a value that the method can use
* B. To make the method return automatically
* C. To prevent the method from executing
* D. To change the method into a loop

---

### 28.

Which method declaration accepts a String parameter named `name`?

* A. `sayHello(String name)`
* B. `sayHello(name String)`
* C. `String sayHello(name)`
* D. `sayHello("String name")`

---

### 29.

If a method is declared as:

```java
sayHello(String name)
```

what type of data can the caller provide for that parameter according to the example?

* A. A String value
* B. Only an integer
* C. Only a character
* D. Only a boolean

---

# Section F — Method Arguments

### 30.

What is an argument?

* A. The actual value passed to a parameter when a method is called
* B. The variable declared in the method definition
* C. The return type
* D. The method body

---

### 31.

Consider:

```java
sayHello("John");
```

What is `"John"`?

* A. Parameter
* B. Argument
* C. Return type
* D. Method definition

---

### 32.

Which statement correctly distinguishes a parameter from an argument?

* A. Parameter is declared in the method; argument is the actual value supplied during the call
* B. Parameter and argument are exactly the same thing
* C. Parameter is always a returned value
* D. Argument is always a data type

---

### 33.

Consider:

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
}

sayHello("Michael");
```

What role does `name` play?

* A. Argument
* B. Parameter
* C. Return type
* D. Access modifier

---

### 34.

What role does `"Michael"` play in the same call?

* A. Parameter
* B. Argument
* C. Method name
* D. Return type

---

### 35.

Which method call demonstrates passing a different argument to the same method?

* A. `sayHello("John");`
* B. `sayHello("Michael");`
* C. `sayHello("Mohan");`
* D. All of the above

---

# Section G — Method With Parameter

### 36.

What is printed by:

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
}

sayHello("John");
```

* A. `Hello, name`
* B. `Hello, John`
* C. `John`
* D. Nothing

---

### 37.

What is the main advantage of the parameterized `sayHello()` method over creating a separate method for every person's name?

* A. The same method can accept different values
* B. The method can execute only once
* C. It eliminates the method body
* D. It prevents arguments from being passed

---

### 38.

Given:

```java
sayHello("John");
sayHello("Michael");
sayHello("Mohan");
sayHello("Sunil");
```

what concept is most clearly demonstrated?

* A. The same method can be reused with different arguments
* B. Four different methods are created
* C. One argument can only be used once
* D. The method has no parameter

---

### 39.

If the method contains:

```java
System.out.println("Hello, " + name);
```

and the argument is `"Mohan"`, what value does `name` represent during that call?

* A. `"John"`
* B. `"Michael"`
* C. `"Mohan"`
* D. `"Sunil"`

---

### 40.

Which change allows the same method to greet another person without modifying the method body?

* A. Pass a different argument
* B. Change `void` to `int`
* C. Remove the parameter
* D. Add `break`

---

# Section H — Return Types

### 41.

What is a return type?

* A. The type of value a method returns
* B. The type of parameter passed to a method
* C. The access level of a method
* D. The method name

---

### 42.

Which method declaration indicates that the method returns an integer?

* A. `void add()`
* B. `int add()`
* C. `String add()`
* D. `boolean add()`

---

### 43.

Consider:

```java
private static int add(int a, int b) {
    return a + b;
}
```

What does `int` represent?

* A. Parameter type
* B. Return type
* C. Argument type
* D. Method body

---

### 44.

What is the purpose of the `return` statement in the `add()` example?

* A. It sends the calculated value back to the caller
* B. It calls the method again
* C. It creates a parameter
* D. It stops all methods permanently

---

### 45.

Which method structure matches the documented pattern for a method returning a value?

* A.

  ```java
  returnType methodName() {
      return value;
  }
  ```

* B.

  ```java
  void methodName() {
      parameter value;
  }
  ```

* C.

  ```java
  methodName returnType() {
      argument;
  }
  ```

* D.

  ```java
  return methodName() {
      value;
  }
  ```

---

# Section I — Method Returning a Value

### 46.

Consider:

```java
int add(int a, int b) {
    return a + b;
}
```

What does the method return?

* A. `a`
* B. `b`
* C. The sum of `a` and `b`
* D. Nothing

---

### 47.

What is returned by:

```java
add(10, 20);
```

for the method:

```java
int add(int a, int b) {
    return a + b;
}
```

* A. `10`
* B. `20`
* C. `30`
* D. `200`

---

### 48.

Which values become the parameters `a` and `b` during:

```java
add(10, 20);
```

* A. `a = 10`, `b = 20`
* B. `a = 20`, `b = 10`
* C. Both become `30`
* D. Neither receives a value

---

### 49.

What is the output of:

```java
System.out.println(add(10, 20));
```

assuming the documented `add()` method?

* A. `10`
* B. `20`
* C. `30`
* D. `200`

---

### 50.

Why can the result of `add(10, 20)` be stored in another variable?

* A. The method returns an integer value
* B. The method returns `void`
* C. The method has no parameters
* D. The method cannot return data

---

### 51.

Consider:

```java
int result = add(10, 20);
```

What is stored in `result`?

* A. The method's name
* B. `10`
* C. `20`
* D. `30`

---

### 52.

What is the relationship between the method's return type and the returned expression in:

```java
int add(int a, int b) {
    return a + b;
}
```

* A. The method is declared to return an `int`, and `a + b` supplies that returned value
* B. The method returns nothing
* C. The return type is ignored
* D. `a + b` is an argument

---

# Section J — Parameter vs Argument vs Return Value

### 53.

Consider:

```java
int add(int a, int b) {
    return a + b;
}

int result = add(10, 20);
```

Which option correctly identifies the parameters?

* A. `10` and `20`
* B. `a` and `b`
* C. `result`
* D. `add`

---

### 54.

Which option correctly identifies the arguments?

* A. `a` and `b`
* B. `int` and `int`
* C. `10` and `20`
* D. `result`

---

### 55.

Which value is the return value of `add(10, 20)`?

* A. `10`
* B. `20`
* C. `30`
* D. `result`

---

### 56.

Which statement best summarizes the flow?

* A. Arguments are supplied to parameters, the method executes, and the method can return a value to the caller
* B. Parameters are supplied to arguments, but methods cannot return values
* C. Arguments define the method permanently
* D. Return values become parameters automatically

---

# Section K — Method Reusability

### 57.

Why is calling:

```java
sayHello();
sayHello();
sayHello();
```

better than writing the same two `println()` statements three separate times?

* A. The logic exists in one place and is reused
* B. It executes faster in every situation
* C. It removes all method calls
* D. It prevents output

---

### 58.

Suppose the greeting text inside `sayHello()` needs to change. Why is having the logic inside one method useful?

* A. The change can be made in one place instead of many duplicated locations
* B. Every call must be rewritten
* C. The method cannot be changed
* D. The parameter automatically changes it

---

### 59.

Which advantage of methods is most directly demonstrated by calling the same method several times?

* A. Code reusability
* B. Data typing
* C. Array indexing
* D. Conditional branching

---

# Section L — Advantages of Methods

### 60.

Which of the following is listed as an advantage of methods?

* A. Code reusability
* B. Less code duplication
* C. Easier maintenance
* D. All of the above

---

### 61.

How do methods improve readability according to the concepts in the document?

* A. They organize related functionality into named blocks
* B. They remove all method names
* C. They force all logic into `main()`
* D. They prevent reuse

---

### 62.

What does "modular programming" mean in the context of the methods topic?

* A. Dividing functionality into manageable method-based units
* B. Writing everything in one large block
* C. Avoiding reusable code
* D. Replacing all methods with loops

---

### 63.

Why can methods make debugging easier?

* A. Functionality is separated into smaller units that can be examined independently
* B. Methods prevent errors automatically
* C. Methods remove all control flow
* D. Methods eliminate return values

---

### 64.

Which combination contains only advantages explicitly listed in the document?

* A. Reusability, less duplication, maintenance, readability
* B. Inheritance, polymorphism, encapsulation, abstraction
* C. Garbage collection, threads, networking, serialization
* D. Arrays, loops, switches, comments

---

# Section M — Important Terminology

### 65.

What is a **method definition**?

* A. Creating the method
* B. Calling the method
* C. Passing an argument
* D. Receiving a returned value

---

### 66.

What is a **method call**?

* A. Executing/invoking a method
* B. Creating a method
* C. Declaring a parameter
* D. Returning a type

---

### 67.

What is a **parameter**?

* A. A variable in the method declaration
* B. An actual value passed during a method call
* C. The value returned from a method
* D. The method name

---

### 68.

What is an **argument**?

* A. A variable declared inside the method definition
* B. An actual value passed to a parameter
* C. The method's return type
* D. The method body

---

### 69.

What is the **return type**?

* A. The type of value returned by the method
* B. The argument's type only
* C. The method's access level
* D. The variable storing the result

---

### 70.

What does `void` mean?

* A. The method returns nothing
* B. The method returns an integer
* C. The method accepts no statements
* D. The method cannot be called

---

# Section N — Code Analysis

### 71.

What is the output?

```java
private static void sayHello() {
    System.out.println("Hello");
    System.out.println("Welcome to Skywards");
}

sayHello();
```

* A.

  ```text
  Hello
  Welcome to Skywards
  ```

* B.

  ```text
  sayHello
  ```

* C.

  ```text
  Hello
  ```

* D. Nothing

---

### 72.

What is the output?

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
}

sayHello("John");
sayHello("Michael");
```

* A.

  ```text
  Hello, John
  Hello, Michael
  ```

* B.

  ```text
  Hello, name
  Hello, name
  ```

* C.

  ```text
  John
  Michael
  ```

* D. Nothing

---

### 73.

What is the output?

```java
int add(int a, int b) {
    return a + b;
}

int result = add(10, 20);
System.out.println(result);
```

* A. `10`
* B. `20`
* C. `30`
* D. `200`

---

### 74.

What is the output?

```java
int result = add(5, 7);
System.out.println("Addition = " + result);
```

assuming the documented `add()` method.

* A. `Addition = 5`
* B. `Addition = 7`
* C. `Addition = 12`
* D. `Addition = 35`

---

### 75.

What happens when this method is called?

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
    System.out.println("Welcome to Skywards");
}

sayHello("Sunil");
```

* A. Two lines are printed using the supplied name
* B. Only the name is printed
* C. The method returns an integer
* D. Nothing is printed

---

### 76.

Suppose:

```java
sayHello("John");
sayHello("Michael");
sayHello("Mohan");
sayHello("Sunil");
```

How many times is the parameterized method executed?

* A. Once
* B. Twice
* C. Four times
* D. Eight times

---

# Section O — Method Design and Application

### 77.

You need a reusable method that simply prints a fixed greeting and does not need any input or output value. Which method design best matches the document?

* A. No parameters and `void` return type
* B. Two parameters and `int` return type
* C. One parameter and `String` return type
* D. No parameters and `int` return type

---

### 78.

You need the same greeting logic to work for different names. Which feature should be used?

* A. Parameter
* B. Return type only
* C. `break`
* D. `switch`

---

### 79.

You need a method to receive two numbers and give their sum back to the caller. Which design best matches the documented `add()` example?

* A. Two parameters and an `int` return type
* B. No parameters and `void`
* C. One parameter and `String`
* D. Two arguments declared in the method definition

---

### 80.

Which declaration best matches the requirement "take two integers and return their sum"?

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

### 81.

Which feature allows the caller to decide what name the greeting method uses without changing the method body?

* A. Parameter and argument
* B. Return type
* C. `private`
* D. `static`

---

### 82.

Which feature allows the caller to use the calculated result of `add()` later?

* A. Return value
* B. Parameter
* C. Access modifier
* D. Method name

---

# Section P — `private` and `static` in the Document

### 83.

The implementation comments describe `private` as being used so that another class cannot get the method. Within the framing of the document, what is `private` being used for?

* A. Restricting access to the method
* B. Returning an integer
* C. Passing an argument
* D. Repeating the method

---

### 84.

The implementation comments explain that `static` is used because the method is being called without object creation. What concept is being demonstrated?

* A. The method can be invoked in the shown static context without creating an object
* B. The method cannot be called
* C. The method must return an integer
* D. The method becomes a parameter

---

### 85.

Which pair appears in the simple method definitions shown in the implementation?

* A. `private static`
* B. `public final`
* C. `protected synchronized`
* D. `abstract native`

---

### 86.

In the implementation:

```java
private static void sayHello()
```

which part controls the return type?

* A. `private`
* B. `static`
* C. `void`
* D. `sayHello`

---

# Section Q — Combined Concept Questions

### 87.

Consider:

```java
private static void sayHello(String name) {
    System.out.println("Hello, " + name);
}
```

Which combination is correct?

* A. `name` is a parameter, `String` is its data type, and `void` is the return type
* B. `name` is an argument, `String` is the return type, and `void` is the parameter
* C. `name` is a return value and `void` is the method name
* D. `String` is an argument

---

### 88.

For:

```java
sayHello("John");
```

which combination is correct?

* A. `sayHello` = method call, `"John"` = argument
* B. `sayHello` = parameter, `"John"` = return type
* C. `sayHello` = return value, `"John"` = parameter
* D. `sayHello` = method definition

---

### 89.

For:

```java
int result = add(10, 20);
```

which combination is correct?

* A. `a` and `b` are parameters, `10` and `20` are arguments, and `result` receives the returned value
* B. `10` and `20` are parameters, `a` and `b` are arguments
* C. `result` is a parameter
* D. `add` is an argument

---

### 90.

Which sequence best describes the execution of:

```java
int result = add(10, 20);
```

* A. Arguments are passed → parameters receive them → method executes → result is returned → caller stores it
* B. Result is created → method definition happens → arguments are deleted
* C. Parameters execute first → arguments are returned
* D. Method executes before arguments are supplied

---

### 91.

What is the key conceptual difference between these two methods?

```java
void sayHello()
```

and

```java
int add(int a, int b)
```

* A. The first returns nothing and takes no parameter; the second takes parameters and returns an integer
* B. Both are identical
* C. The first returns an integer and the second returns nothing
* D. Neither can be called

---

### 92.

Which method demonstrates both **parameter passing** and **returning a value**?

* A. `sayHello()`
* B. `sayHello(String name)`
* C. `add(int a, int b)`
* D. `main(String[] args)` only

---

# Section R — Mastery / Scenario-Based Questions

### 93.

A developer has the same five statements repeated throughout a program. What is the strongest reason to move them into a method?

* A. To define the logic once and reuse it
* B. To make the statements execute randomly
* C. To avoid naming the logic
* D. To make the code longer

---

### 94.

A greeting method must work for `"John"`, `"Michael"`, `"Mohan"`, and `"Sunil"` without changing its internal code. What should be changed between calls?

* A. The argument
* B. The method definition
* C. The return type
* D. The access modifier

---

### 95.

A method needs two numbers from the caller and must provide their sum back. Which two concepts are essential?

* A. Parameters and return value
* B. Comments and loops
* C. `break` and `continue`
* D. `switch` and `if`

---

### 96.

A learner says:

> "The values `10` and `20` in `add(10,20)` are parameters."

What is the correct classification according to the document?

* A. They are arguments
* B. They are return types
* C. They are method definitions
* D. They are access modifiers

---

### 97.

A learner says:

> "`a` and `b` in `int add(int a, int b)` are arguments."

What is the correct classification?

* A. They are parameters
* B. They are return values
* C. They are method names
* D. They are access modifiers

---

### 98.

A learner says:

> "`void` means the method returns an integer."

What is the correct interpretation?

* A. `void` means the method returns nothing
* B. `void` means the method returns String
* C. `void` means the method accepts no parameters
* D. `void` means the method cannot be called

---

### 99.

A learner says:

> "A method call creates a new method."

What is the better explanation?

* A. A method definition creates the method; a method call executes it
* B. A method call changes its return type
* C. A method call creates a parameter
* D. A method call deletes the method

---

### 100.

A learner says:

> "A parameter is the value passed during the method call."

What is the correct distinction?

* A. The parameter is declared in the method; the argument is the actual value supplied in the call
* B. Both are always identical concepts
* C. The parameter is always the return value
* D. The argument is always a method name

---

### 101.

Which statement best explains why `add()` can be reused with different numbers?

* A. Its parameters allow different arguments to be supplied on different calls
* B. Its return type changes automatically
* C. Its method name changes
* D. It contains no logic

---

### 102.

Which statement best explains why the `sayHello(String name)` method is more flexible than a method containing a fixed `"John"` directly inside it?

* A. The caller can supply different values through the parameter
* B. It automatically returns an integer
* C. It no longer needs a method call
* D. It can only run once

---

### 103.

Which option demonstrates the complete concept of a reusable parameterized method?

* A.

  ```java
  void greet(String name) {
      System.out.println("Hello, " + name);
  }

  greet("John");
  greet("Michael");
  ```

* B.

  ```java
  System.out.println("Hello, John");
  System.out.println("Hello, Michael");
  ```

* C.

  ```java
  int x = 10;
  ```

* D.

  ```java
  if (x > 5) {
  }
  ```

---

### 104.

Which option demonstrates a complete flow of **method definition → method call → return value → storage**?

* A.

  ```java
  int add(int a, int b) {
      return a + b;
  }

  int result = add(10, 20);
  ```

* B.

  ```java
  int result = 30;
  ```

* C.

  ```java
  add(10, 20);
  ```

* D.

  ```java
  void add() {
  }
  ```

---

# Section S — Final Mastery

### 105.

Which statement best summarizes the purpose of methods?

* A. Methods organize reusable functionality into named blocks that can be called when needed
* B. Methods only store variables
* C. Methods are used only for returning integers
* D. Methods eliminate the need for control flow

---

### 106.

Which statement best summarizes **method definition vs method call**?

* A. Definition creates the method; call executes it
* B. Definition executes the method; call creates it
* C. Both create methods
* D. Both return values automatically

---

### 107.

Which statement best summarizes **parameter vs argument**?

* A. Parameter is the declared receiving variable; argument is the actual supplied value
* B. Parameter is the actual value; argument is the declared variable
* C. Both are return types
* D. Both are method names

---

### 108.

Which statement best summarizes **void vs return type**?

* A. `void` represents no returned value; another return type specifies the type of value the method returns
* B. `void` means integer
* C. Every method must return an integer
* D. Return type only identifies parameters

---

### 109.

Which statement best summarizes the role of a parameterized method?

* A. It allows the same functionality to operate on values supplied by different callers
* B. It prevents reuse
* C. It removes the method body
* D. It can never receive different values

---

### 110.

Which statement best summarizes why return values are useful?

* A. They allow a method to produce a result that the caller can use
* B. They prevent method calls
* C. They make parameters unnecessary
* D. They only print text

---

### 111.

Which option demonstrates **all major method concepts covered in the document**?

* A. Definition, call, parameters, arguments, return type, return value, and reusability
* B. Only variables and comments
* C. Only loops and conditions
* D. Only arrays

---

### 112.

A learner can correctly answer the questions about creating methods, calling methods, distinguishing parameters and arguments, tracing return values, and explaining reusability. What does that indicate?

* A. Strong understanding of the Methods topic covered in the document
* B. Only memorization of method names
* C. Understanding of arrays only
* D. Understanding of switch statements only

---

# Answer Key

|  Q | Ans |  Q | Ans |  Q | Ans |   Q | Ans |
| -: | :-: | -: | :-: | -: | :-: | --: | :-: |
|  1 |  B  | 29 |  A  | 57 |  A  |  85 |  A  |
|  2 |  A  | 30 |  A  | 58 |  A  |  86 |  A  |
|  3 |  A  | 31 |  B  | 59 |  A  |  87 |  A  |
|  4 |  A  | 32 |  A  | 60 |  D  |  88 |  A  |
|  5 |  A  | 33 |  B  | 61 |  A  |  89 |  A  |
|  6 |  A  | 34 |  B  | 62 |  A  |  90 |  A  |
|  7 |  A  | 35 |  D  | 63 |  A  |  91 |  A  |
|  8 |  A  | 36 |  B  | 64 |  A  |  92 |  C  |
|  9 |  C  | 37 |  A  | 65 |  A  |  93 |  A  |
| 10 |  B  | 38 |  A  | 66 |  A  |  94 |  A  |
| 11 |  A  | 39 |  C  | 67 |  A  |  95 |  A  |
| 12 |  A  | 40 |  A  | 68 |  B  |  96 |  A  |
| 13 |  A  | 41 |  A  | 69 |  A  |  97 |  A  |
| 14 |  A  | 42 |  B  | 70 |  A  |  98 |  A  |
| 15 |  A  | 43 |  B  | 71 |  A  |  99 |  A  |
| 16 |  A  | 44 |  A  | 72 |  A  | 100 |  A  |
| 17 |  A  | 45 |  A  | 73 |  C  | 101 |  A  |
| 18 |  A  | 46 |  C  | 74 |  C  | 102 |  A  |
| 19 |  A  | 47 |  C  | 75 |  A  | 103 |  A  |
| 20 |  C  | 48 |  A  | 76 |  C  | 104 |  A  |
| 21 |  C  | 49 |  C  | 77 |  A  | 105 |  A  |
| 22 |  A  | 50 |  A  | 78 |  A  | 106 |  A  |
| 23 |  A  | 51 |  D  | 79 |  A  | 107 |  A  |
| 24 |  A  | 52 |  A  | 80 |  A  | 108 |  A  |
| 25 |  C  | 53 |  B  | 81 |  A  | 109 |  A  |
| 26 |  B  | 54 |  C  | 82 |  A  | 110 |  A  |
| 27 |  A  | 55 |  C  | 83 |  A  | 111 |  A  |
| 28 |  A  | 56 |  A  | 84 |  A  | 112 |  A  |

---

# Coverage

This MCQ set covers the complete Methods document:

* What is a method
* Method as a block of code
* Performing a specific task
* Avoiding repeated code
* Method reusability
* Why methods are needed
* Code duplication
* Maintaining duplicated code
* Keeping logic in one place
* Calling functionality whenever needed
* Method creation syntax
* Access modifier
* `static`
* Return type
* Method name
* Method body
* Simple method creation
* Method calling syntax
* Method definition
* Method call
* Execution flow of a method
* Control entering method body
* Statements executing inside method
* Control returning to caller
* Simple method with no parameters
* Simple method with no return value
* Calling the same method multiple times
* Method reusability
* Method parameters
* Parameter syntax
* Parameter data type
* Parameter variable
* Method arguments
* Actual values passed during calls
* Parameter vs argument
* Parameterized methods
* Passing different arguments to the same method
* Method return values
* Return type
* `int` return type
* `return` statement
* Returning calculated results
* Calling `add(10, 20)`
* Storing return value in a variable
* Reusing parameterized methods
* Advantages of methods
* Code reusability
* Less code duplication
* Easier maintenance
* Better readability
* Modular programming
* Easier debugging
* Method Definition terminology
* Method Call terminology
* Parameter terminology
* Argument terminology
* Return Type terminology
* `void`
* `private` as described in the implementation comments
* `static` as described in the implementation comments
* Code tracing
* Output prediction
* Method design/application
* Parameter and return-value scenarios
* Complete method execution flow

# 80% Mastery Benchmark

**Total Questions: 112**

**80% = 90 correct answers**

|    Score | Understanding                                          |
| -------: | ------------------------------------------------------ |
|  101–112 | Excellent mastery                                      |
|   90–100 | Strong understanding — topic can be considered covered |
|    79–89 | Partial understanding — review weak areas              |
|    67–78 | Significant gaps — study the topic again               |
| Below 67 | Topic needs thorough revision                          |

> **Target: 90/112 or higher.**
>
> A learner scoring at least 80% should have a strong understanding of the Methods material covered in this document and can reasonably move forward to the next topic.
