# 🎤 Java Program Structure & Evolution — Interview Questions

> Interview questions focused specifically on **traditional Java program structure, `main()` method, program startup, command-line arguments, `System.out.println()`, Source File Mode, and modern simplified Java programs**.
>
> Generic Java Fundamentals such as JVM, JDK, JRE, bytecode, and platform independence are not repeated here.

---

# 🔴 Priority 1 — Most Asked / Must Prepare

### 1. Why is the traditional `main()` method declared as `public static void`?

### 2. Why must `main()` be `static` for the traditional Java launcher?

### 3. What happens if `main()` is not declared `static`?

### 4. How does the Java launcher find and invoke the traditional `main()` method?

### 5. What is the purpose of `String[] args` in `main()`?

### 6. Can the name `args` be changed? What actually matters to the Java launcher?

### 7. Can `String[] args` be written as `String... args`?

### 8. Can `main()` be overloaded? If yes, how does the Java launcher decide which one to execute?

### 9. What is the complete flow from a `.java` file to program execution?

### 10. What happens internally at a high level when you run `javac HelloWorld.java` and then `java HelloWorld`?

### 11. What is Source File Mode, and how is `java HelloWorld.java` different from the traditional approach?

---

# 🟠 Priority 2 — Commonly Asked / High Priority

### 12. Why is the traditional `main()` method `void`?

### 13. What happens if the required `main()` method is missing or its signature is incorrect?

### 14. What is the difference between `String[] args` and `String args[]`?

### 15. How are command-line arguments passed to a Java program, and how are they stored in `args`?

### 16. What happens when no command-line arguments are supplied?

### 17. What happens when multiple command-line arguments are supplied?

### 18. Can command-line arguments contain spaces? How are they received by the program?

### 19. What is `System.out` in `System.out.println()`?

### 20. Why is `System.out.println()` used for console output, and what is the role of `println()`?

### 21. Can one `.java` file contain multiple classes? What happens when more than one class has a `main()` method?

### 22. What is the relationship between a `public` class and its source filename?

---

# 🟡 Priority 3 — Practical / Modern Java / Scenario-Based

### 23. Why was Source File Mode introduced, and when is it useful?

### 24. Does Source File Mode execute the source code directly, or is compilation still involved?

### 25. What is the practical difference between running a `.java` source file and running a compiled class?

### 26. What are compact source files in modern Java?

### 27. What is an instance `main()` method, and how is it different from the traditional static `main()`?

### 28. How is modern `void main()` different from the traditional `public static void main(String[] args)`?

### 29. Why did Java introduce reduced boilerplate for simple programs?

### 30. What compatibility issue should you consider before using the modern simplified `main()` syntax?

---

# 🏆 Highest-Priority Questions

> These are the questions from this topic I would prepare **first** for a company interview.

1. Why is `main()` `static`?
2. What happens if `main()` is not `static`?
3. How does the Java launcher find `main()`?
4. What is the purpose of `String[] args`?
5. Can `args` be renamed?
6. Can `main()` be overloaded, and which version is executed?
7. What is the complete Java program execution flow?
8. What happens when `javac` and `java` are executed?
9. What is Source File Mode?
10. What is the difference between Source File Mode and traditional execution?
11. What happens if the `main()` signature is incorrect or missing?
12. What are compact source files and instance `main()` methods?